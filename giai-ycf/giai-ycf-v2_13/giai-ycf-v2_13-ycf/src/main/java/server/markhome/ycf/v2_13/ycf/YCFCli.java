// Description: Main for YCFCli

/*
 *  MSS Code Factory MssYCF 2.13 CLI
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal formerly known as MSS Code Factory.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */

package org.mssycf.mssycf.v2_13.YCFCli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbRam.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamRam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamMssYCF.*;
import org.mssycf.mssycf.v2_13.ycfbamcust.YCFBamXmlLoader.YCFBamXmlLoader;
import org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF.*;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
    org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class,
    org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration.class,
    DataSourceAutoConfiguration.class,
    DataSourceTransactionManagerAutoConfiguration.class
})
public class YCFCli {
    private static final AtomicReference<Properties> systemProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> applicationProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> userDefaultProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> userProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> mergedProperties = new AtomicReference<>(null);

    /**
     * Loads the application properties file from the application resources.
     */
    public static Properties getApplicationProperties() {
        if (applicationProperties.get() == null) {
            Properties props = new Properties();
            try (var in = YCFCli.class.getClassLoader().getResourceAsStream("application.properties")) {
                if (in != null) {
                    props.load(in);
                } else {
                    throw new RuntimeException("application.properties not found in classpath resources");
                }
            } catch (IOException e) {
                throw new RuntimeException("Failed to load application properties from application.properties", e);
            }
            applicationProperties.compareAndSet(null, props);
        }
        return applicationProperties.get();
    }

    /**
     * Loads the system properties, which hopefully haven't had the merge applied yet.
     */
    public static Properties getSystemProperties() {
        if (systemProperties.get() == null) {
            Properties props = new Properties();
            props.putAll(System.getProperties());
            systemProperties.compareAndSet(null, props);
        }
        return systemProperties.get();
    }
  
    /**
     * Loads the user default properties file from the application resources.
     */
    public static Properties getUserDefaultProperties() {
        if (userDefaultProperties.get() == null) {
            Properties props = new Properties();
            try (var in = YCFCli.class.getClassLoader().getResourceAsStream("user-default.properties")) {
                if (in != null) {
                    props.load(in);
                } else {
                    throw new RuntimeException("user-default.properties not found in classpath resources");
                }
            } catch (IOException e) {
                throw new RuntimeException("Failed to load user default properties from user-default.properties", e);
            }
            userDefaultProperties.compareAndSet(null, props);
        }
        return userDefaultProperties.get();
    }

    /**
     * Loads the user properties file from their home directory.
     */
    public static Properties getUserProperties() {
        if (userProperties.get() == null) {
            Properties props = new Properties();
            File userFile = new File(System.getProperty("user.home"), ".ycfcli.properties");
            if (userFile.exists()) {
                try (FileInputStream fis = new FileInputStream(userFile)) {
                    props.load(fis);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load user properties from .ycfcli.properties", e);
                }
            } else {
                try (var in = YCFCli.class.getClassLoader().getResourceAsStream("user-default.properties")) {
                    if (in != null) {
                        Files.copy(in, userFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println(String.format("A new user properties file has been created at: %s", userFile.getAbsolutePath()));
                        System.out.println("Please customize this file before running the application again.");
                        System.exit(0);
                    }
                    else {
                        var subin = YCFCli.class.getClassLoader().getResourceAsStream("application.properties");
                        if (subin != null) {
                            Files.copy(subin, userFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        	System.out.println(String.format("A new user properties file has been created at: %s", userFile.getAbsolutePath()));
	                        System.out.println("Please customize this file before running the application again.");
                            System.exit(0);
                        } else {
                            throw new RuntimeException("user-default.properties and application.properties not found in classpath resources");
                        }
                    }
                } catch (IOException e) {
                    System.err.println(String.format("Failed to create user properties file \"%s\": %s", userFile.getAbsolutePath(), e.getMessage()));
                    System.exit(1);
                }
            }
            userProperties.compareAndSet(null, props);
        }
        return userProperties.get();
    }

    /**
     * Merges the System and User properties, giving preference to the User properties.
     */
    public static Properties getMergedProperties() {
        if (mergedProperties.get() == null) {
            Properties merged = new Properties();
            merged.putAll(getApplicationProperties());
            merged.putAll(getUserDefaultProperties());
            merged.putAll(getSystemProperties());
            merged.putAll(getUserProperties());
            mergedProperties.compareAndSet(null, merged);
        }
        return mergedProperties.get();
    }

    public static void main(String[] args) {
        // This weird looking cadence ensures that all the sub-property lists are prepared before getMergedProperties() is invoked, ensuring that any errors and exceptions along the way are thrown first and in predictable order
        Properties mergedProperties = getApplicationProperties();
        mergedProperties = getUserDefaultProperties();
        mergedProperties = getSystemProperties();
        mergedProperties = getUserProperties();
        mergedProperties = getMergedProperties();
        System.getProperties().putAll(mergedProperties);

        SpringApplication app = new SpringApplication(YCFCli.class);
        app.addInitializers((applicationContext) -> {
            ConfigurableEnvironment env = applicationContext.getEnvironment();
            env.getPropertySources().addLast(new org.springframework.core.env.PropertiesPropertySource("userProperties", userProperties.get()));
        });
        app.run(args);
    }

	public final static String LogFileName = "ManufactureProject.log";
	public final static String ProductName = "MSS Code Factory 2.13";
	public final static String ProductWithVersion = "MSS Code Factory 2.13.42-alpha15-202611010900";
	private static MSSBamYCFPrefs _UserPrefs = null;
	private static String parsedToolSetNames[] = null;
	private static IYCFLibMessageLog	log = new YCFLibConsoleMessageLog();
	private static MSSBamYCFEngine ycfEngine = null;
	
	public static MSSBamYCFEngine getEngine() {
		return( ycfEngine );
	}
	
	public static void setEngine( MSSBamYCFEngine engine ) {
		ycfEngine = engine;
	}

	/**
	 *	Release static resources
	 */
	public static void saveUserPreferences() {
		if( _UserPrefs != null ) {
			if( ! _UserPrefs.savePreferences( log ) ) {
				return;
			}
	    }
	}
	
	/**
	 *	Initialize the console log
	 */
	protected static void initConsoleLog() {
	//	Layout layout = new PatternLayout(
	//			"%d{ISO8601}"		// Start with a timestamp
	//		+	" %-5p"				// Include the severity
	////		+	" %C.%M"			// pkg.class.method()
	////		+	" %F[%L]"			// File[lineNumber]
	//		+	": %m" );			// Message text
		//BasicConfigurator.configure( new ConsoleAppender( layout, "System.out" ) );
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			final String S_ProcName = "YCFCli.main() ";
		
			initConsoleLog();
	
			MSSBamYCFGelCompiler.setCodeFactoryVersion( ProductName );
	
		//	System.setProperty( "org.apache.xerces.xni.parser.XMLParserConfiguration",
		//		"org.apache.xerces.parsers.XMLGrammarCachingConfiguration" );
	
		//	Get the name of the cartridge to be resolved.
		
			String cartridgeName = "";
		
		//	Finish application library loading and initialization
	
			String generatingBuild = "1";	
			Timestamp				genstarttime = null;
			Timestamp				genendtime = null;
			IYCFLibAnyObj			version = null;
			ArrayList<String>		listOfToolsetName = new ArrayList<String>();
			String					toolsetName = null;
			
			genstarttime = new Timestamp( System.currentTimeMillis() );
		
			try {
		
				log.message(
					"Starting " + ProductWithVersion + "..." );
		
		//		Get the name of the model to be resolved.
		
				boolean testOnly = false;
				String modelName;
				switch( args.length ) {
					case 0:
					case 1:
					case 2:
						testOnly = true;
						toolsetName = null;
						String msg = "org.mssycf.mssycf.YCFCli.YCFCli build_string model_name_or_uri cartridge_name [debug] [toolsetName{ toolsetName}]\n"
							+ "\tWHERE\n"
							+ "\t\tbuild_string is the name of the build to be manufactured,\n"
							+ "\t\tmodel_name_or_uri is the name of the application model to generate,\n"
							+ "\t\t\tor the URI of a model definition file to load.\n"
							+ "\t\tcartridge_name is the name of the rule cartridge to use\n"
							+ "\t\t\tfor generating code.\n"
							+ "\t\tdebug means to turn on debug tracing of rule expansions\n"
							+ "\t\ttoolsetName[s] are the names of the toolsets to produce code for";
						log.message( msg );
						throw new IllegalArgumentException( msg );
					case 3:
						generatingBuild = args[0];
						modelName = args[1];
						cartridgeName = args[2];
						toolsetName = null;
						break; 
					default:
						generatingBuild = args[0];
						modelName = args[1];
						cartridgeName = args[2];
						for( int idxArg = 3; idxArg < args.length; idxArg ++ ) {
							toolsetName = args[idxArg];
							if( ( toolsetName != null ) && ( toolsetName.length() > 0 ) ) {
								if (toolsetName.equalsIgnoreCase("debug")) {
									MssYCFEngine.enableDebugMode();
								}
								else {
									listOfToolsetName.add( toolsetName );
								}
							}
						}
						if (listOfToolsetName.isEmpty()) {
							toolsetName = null;
						}
						break;
				}
		
		//		Load the user preferences
		
		//	    log.message( "Loading user preferences..." );
				_UserPrefs = new MSSBamYCFPrefs();
				if( ! _UserPrefs.loadPreferences( log, false ) ) {
					log.message( "Cannot continue." );
					return;
				}
				
				String prefsGenDir = _UserPrefs.getRootGenDir();
				if( ( prefsGenDir == null ) || ( prefsGenDir.length() <= 0 ) ) {
					throw new RuntimeException( S_ProcName + "Preferences RootGenDir is null or empty" );
				}
		
				int idxLast = prefsGenDir.length() - 1;
				String rootGenDir =
					(	( prefsGenDir.lastIndexOf( '/' ) == idxLast )
						|| ( prefsGenDir.lastIndexOf( '\\' ) == idxLast )
						|| ( prefsGenDir.lastIndexOf( File.separatorChar ) == idxLast ) )
					? prefsGenDir
					: prefsGenDir + File.separator;
		
		//		Create a log file for the run
		
//				String logFileName = rootGenDir + LogFileName;
//				try {
//					log.openLogFile( logFileName );
//					log.closeLogFile();
//	
//					File f = new File( logFileName );
//					if( f.exists() ) {
//						f.delete();
//					}
//				}
//				catch( FileNotFoundException e ) {
//				}
		
		//		Log generator versioning
		
				log.message( ProductWithVersion + " started" );
		
		//		Initialize the generation engine
		
				IYCFGenKbSchema genKbSchema = new YCFGenKbRamSchema();
				IYCFGenKbSchemaObj genKbSchemaObj = new YCFGenKbSchemaObj();
				genKbSchemaObj.setBackingStore( genKbSchema );
				genKbSchema.connect( "system", "system", "system", "system" );
				genKbSchema.rollback();
				genKbSchema.beginTransaction();
				genKbSchemaObj.setSecCluster( genKbSchemaObj.getClusterTableObj().getSystemCluster() );
				genKbSchemaObj.setSecTenant( genKbSchemaObj.getTenantTableObj().getSystemTenant() );
				genKbSchemaObj.setSecSession( genKbSchemaObj.getSecSessionTableObj().getSystemSession() );
				YCFGenKbAuthorization genKbAuth = new YCFGenKbAuthorization();
				genKbAuth.setSecCluster( genKbSchemaObj.getSecCluster() );
				genKbAuth.setSecTenant( genKbSchemaObj.getSecTenant() );
				genKbAuth.setSecSession( genKbSchemaObj.getSecSession() );
				genKbSchemaObj.setAuthorization( genKbAuth );
	
				IYCFBamSchema ycfBamSchema = new YCFBamRamSchema();
				IYCFBamSchemaObj ycfBamSchemaObj = new YCFBamSchemaObj();
				ycfBamSchemaObj.setBackingStore( ycfBamSchema );
				ycfBamSchema.connect( "system", "system", "system", "system" );
				ycfBamSchema.rollback();
				ycfBamSchema.beginTransaction();
				ycfBamSchemaObj.setSecCluster( ycfBamSchemaObj.getClusterTableObj().getSystemCluster() );
				ycfBamSchemaObj.setSecTenant( ycfBamSchemaObj.getTenantTableObj().getSystemTenant() );
				ycfBamSchemaObj.setSecSession( ycfBamSchemaObj.getSecSessionTableObj().getSystemSession() );
				YCFSecAuthorization ycfBamAuth = new YCFSecAuthorization();
				ycfBamAuth.setSecCluster( ycfBamSchemaObj.getSecCluster() );
				ycfBamAuth.setSecTenant( ycfBamSchemaObj.getSecTenant() );
				ycfBamAuth.setSecSession( ycfBamSchemaObj.getSecSession() );
				ycfBamSchemaObj.setAuthorization( ycfBamAuth );
	
				ycfEngine = new MSSBamYCFEngine();
				ycfEngine.setLog( log );
				
				((MSSBamYCFEngine)ycfEngine).init( generatingBuild, genKbSchemaObj, genKbSchemaObj.getSecTenant(), ycfBamSchemaObj, rootGenDir );
				
				log.message( "Linked with "
						+ YCFLib.LinkName
						+ " version "
						+ YCFLib.LinkVersion );
				log.message( "Linked with "
						+ MssYCFEngine.GeneratorName
						+ " version "
						+ MssYCFEngine.GeneratorVersion );
				log.message( "Linked with "
						+ MSSBamYCFEngine.GeneratorName
						+ " version "
						+ MSSBamYCFEngine.GeneratorVersion );
		
		//		Configure parser
		
				log.message( "Initializing rule cartridge parser..." );
		
				Iterator<String> cartridgePath = _UserPrefs.getCartridgePathIterator();
				while( cartridgePath.hasNext() ) {
					String cartridgeDir = (String)cartridgePath.next();
					if( ( cartridgeDir != null ) && ( cartridgeDir.length() > 0 ) ) {
						MssYCFRuleCartridgeParser.addCartridgePath( cartridgeDir );
					}
				}
		
				URL url = ycfEngine.getClass().getResource( "/cartridge-2.13/org-mssycf-mssycf-2-13-toolset-java/rulecartridge.xml" );
				if( url == null ) {
					url = ycfEngine.getClass().getResource( "cartridge-2.13/org-mssycf-mssycf-2-13-toolset-java/rulecartridge.xml" );
				}
				if( url != null ) {
					String str = url.toString();
					int lastSlash = str.lastIndexOf( '/' );
					if( lastSlash > 0 ) {
						// strip off /rulecartridge.xml
						str = str.substring( 0, lastSlash );
						lastSlash = str.lastIndexOf( '/' );
						if( lastSlash > 0 ) {
							// strip off /net...java, keeping trailing slash
							str = str.substring( 0, lastSlash + 1 );
							MssYCFRuleCartridgeParser.addCartridgePath( str );
						}
					}
				}
		
				Iterator<String> modelPath = _UserPrefs.getModelPathIterator();
				while( modelPath.hasNext() ) {
					String modelDir = (String)modelPath.next();
					YCFBamXmlLoader.addModelPath( modelDir );
				}
		
		//		Load the cartridge
		
				MssYCFRuleCartridgeParser cartridgeParser = new MssYCFRuleCartridgeParser( ycfEngine, log );
				
				parsedToolSetNames = null;
				try {
					cartridgeParser.loadRuleCartridge( cartridgeName );
				}
				catch( Exception e ) {
					log.message( "Could not load rule cartridge: " + e.getMessage() );
		            throw( e );
				}
				catch( Error e ) {
					log.message( "Could not load rule cartridge: " + e.getMessage() );
		            throw( e );
				}
				parsedToolSetNames = MssYCFRuleCartridgeParser.getToolSetNames();
		
				if( ( parsedToolSetNames != null )
				 && ( parsedToolSetNames.length > 0 ) )
				{
					StringBuffer msg = new StringBuffer();
					msg.append( "Rule cartridge specified tool set names " );
					for( int idxName = 0; idxName < parsedToolSetNames.length; idxName ++ )
					{
						if( idxName > 0 )
						{
							msg.append( ", " );
						}
						msg.append( parsedToolSetNames[idxName] );
					}
					log.message( msg.toString() );
				}
				else {
					log.message( "Rule cartridge did not define tool set names to process." );
				}
	
		//		Initialize the cluster and tenant for the dictionary
	
//				IYCFBamClusterObj origBamCluster = (IYCFBamClusterObj)bamBLSchema.getClusterTableObj().newInstance();
//				IYCFBamClusterEditObj editBamCluster = (IYCFBamClusterEditObj)origBamCluster.beginEdit();
//				editBamCluster.setRequiredFullDomName( "system" );
//				origBamCluster = (IYCFBamClusterObj)editBamCluster.create();
//				editBamCluster.endEdit();
	
//				IYCFBamTenantObj origBamTenant = (IYCFBamTenantObj)bamBLSchema.getTenantTableObj().newInstance();
//				IYCFBamTenantEditObj editBamTenant = (IYCFBamTenantEditObj)origBamTenant.beginEdit();
//				editBamTenant.setRequiredContainerCluster( origBamCluster );
//				editBamTenant.setRequiredTenantName( "system" );
//				origBamTenant = (IYCFBamTenantObj)editBamTenant.create();
//				editBamTenant.endEdit();
		
		//		Instantiate Bam Model parser
	
				YCFBamXmlLoader bamParser = new YCFBamXmlLoader( (MSSBamYCFEngine)ycfEngine, log );
				bamParser.setSchemaObj( ycfBamSchemaObj );
				bamParser.setTenant( (IYCFBamTenantObj)( ycfBamSchemaObj.getSecTenant() ) );
				
		//		Parse the model
		
				try {
					bamParser.loadTenant(modelName);
				}
				catch( Exception e ) {
					log.message( "Could not load Tenant: " + e.getMessage() );
		            throw( e );
				}
				catch( Error e ) {
					log.message( "Could not load Tenant: " + e.getMessage() );
		            throw( e );
				}
		
				IYCFBamTenantObj Tenant = bamParser.getTenant();
				version = bamParser.getDefinedProjectVersion();
	
				try {
					if( listOfToolsetName.size() <= 0 ) {
						for( int idx = 0; idx < parsedToolSetNames.length; idx++ ) {
							listOfToolsetName.add( parsedToolSetNames[idx] );
						}
					}
					if( ( listOfToolsetName.size() > 0 ) && ( version != null ) ) {
						ycfEngine.generate(generatingBuild, rootGenDir, version, listOfToolsetName, MSSBamYCFEngine.ITEMNAME_TOP);
					}
				}
				catch( Exception e )
				{
					log.message( S_ProcName + "Manufacturing code threw " + e.getClass().getSimpleName() + " " + e.getMessage() + ", stack trace follows:" );
			    	e.printStackTrace( /*log.getPrintStream()*/ );
				}
			}
			catch( Exception e )
			{
		    	log.message( S_ProcName
		    			+ "Caught " + e.getClass().getSimpleName() + " " + e.getMessage() + ", stack trace follows:" );
		    	e.printStackTrace( /*log.getPrintStream()*/ );
			}
		
			genendtime = new Timestamp( System.currentTimeMillis() );
		
			long msec = genendtime.getTime() - genstarttime.getTime();
		
			String elapsed = String.format( "%1$d:%2$02d:%3$02d.%4$03d",
					msec / ( 1000 * 60 * 60 ),
					( msec / ( 1000 * 60 )) % 60,
					( msec / 1000 ) % 60,
					( msec % 1000 ) );
			log.message( 
					( ( version != null )
						? MSSBamYCFAnyObj.getFullName( version )
						: "Code" )
				+ " manufacturing took " + elapsed );
		
			log.message( "Releasing MSS Code Factory " + MSSBamYCFEngine.GeneratorVersion + " engine..." );
			ycfEngine = null;
		
			log.message( ProductWithVersion + " finished." );
//			log.closeLogFile();
		};
	}
}

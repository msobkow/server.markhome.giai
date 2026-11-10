/*
 *	MSS Code Factory YCFBam 2.13 CustMSSBamYCF
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF;

import java.util.ArrayList;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.IYCFSecTenantObj;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFGelCompiler
extends MssYCFGelCompiler
{
	public final static String	_BUILTIN_PROJECTNAME = "ProjectName";
	public final static String _BUILTIN_JAVAPACKAGE = "JavaPackage";
	public final static String _BUILTIN_JAVADEFPACKAGE = "JavaDefPackage";
	public final static String _BUILTIN_GENPACKAGE = "GenPackage";
	public final static String	_BUILTIN_GENBASEPACKAGE = "GenBasePackage";
	public final static String	_BUILTIN_GENFULLPACKAGE = "GenFullPackage";
	public final static String _BUILTIN_GENPACKAGEDIR = "GenPackageDir";
	public final static String	_BUILTIN_GENPACKAGEFULLDIR = "GenPackageFullDir";
	public final static String _BUILTIN_CODEFACTORYVERSION = "CodeFactoryVersion";
	public final static String _BUILTIN_SCHEMAHOSTNAME = "SchemaHostName";
	public final static String _BUILTIN_SCHEMATWEAK = "schematweak";
	public final static String _BUILTIN_TABLETWEAK = "tabletweak";
	public final static String _BUILTIN_INDEXTWEAK = "indextweak";
	protected static String codeFactoryVersion = MSSBamYCFEngine.LinkVersion;

	/**
	 *	Construct an instance.  Only invoked to create binding entries.
	 */
	public MSSBamYCFGelCompiler( MSSBamYCFEngine engine )	{
		super( engine );
	}

	public static void setCodeFactoryVersion( String value ) {
		final String S_ProcName = "setCodeFactoryVersion";
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( MSSBamYCFGelCompiler.class,
				S_ProcName,
				1,
				"value" );
		}
		codeFactoryVersion = new String( value );
	}

	public static String getCodeFactoryVersion() {
		return( codeFactoryVersion );
	}

	protected class MssYCFBuiltinCodeFactoryVersion
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinCodeFactoryVersion( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String retval = MSSBamYCFGelCompiler.getCodeFactoryVersion();
			return retval;
		}
	}

	protected class MssYCFBuiltinProjectName
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinProjectName( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String retval = null;
			IYCFLibAnyObj anobj = genContext.getGenDef();
			IYCFBamSchemaDefObj schema = MSSBamYCFAnyObj.getSchema( anobj );
			IYCFLibAnyObj project = MSSBamYCFAnyObj.getProject( schema );
			if( ( project != null ) && ( project instanceof IYCFBamTopProjectObj ) ) {
				retval = project.getObjName();
			}
			else if( ( project != null ) && ( project instanceof IYCFBamSubProjectObj ) ) {
				retval = project.getObjName();
			}
			else {
				retval = schema.getObjName();
			}
			return retval;
		}
	}

	protected class MssYCFBuiltinDefProjectName
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinDefProjectName( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String retval = null;
			IYCFLibAnyObj anobj = genContext.getGenDef();
			IYCFLibAnyObj project = MSSBamYCFAnyObj.getDefProject( anobj );
			if( ( project != null ) && ( project instanceof IYCFBamTopProjectObj ) ) {
				retval = project.getObjName();
			}
			else if( ( project != null ) && ( project instanceof IYCFBamSubProjectObj ) ) {
				retval = project.getObjName();
			}
			return retval;
		}
	}

	protected class MssYCFBuiltinJavaDefPackage
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinJavaDefPackage( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;
			IYCFLibAnyObj genObj;
			MssYCFGenContext fileContext = genContext.getGenFileContext();
			if( fileContext != null) {
				genObj = (IYCFLibAnyObj)(fileContext.getGenDef());
			}
			else {
				genObj = (IYCFLibAnyObj)genContext.getGenDef();
			}

			if (genObj != null) {
				IYCFLibAnyObj projectDef = MSSBamYCFAnyObj.getDefProject(genObj);
				if (projectDef != null) {
					String projectDotName = MSSBamYCFAnyObj.getModelName(projectDef);
					String versionString = MSSBamYCFAnyObj.getVersionString(genObj);
					if ((versionString != null) && (versionString.length() > 0)) {
						switch (versionString.charAt(0)) {
							case '0':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '1':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '2':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '3':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '4':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '5':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '6':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '7':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '8':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							case '9':
								ret = projectDotName + ".v" + versionString.replace('-', '_');
								break;
							default:
								ret = projectDotName + "." + versionString.replace('-', '_');
								break;
						}
					}
					else {
						ret = projectDotName;
					}
				}
			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinJavaPackage
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinJavaPackage( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			IYCFBamSchemaDefObj manufacturingSchema = MSSBamYCFGenContext.getManufacturingSchema();
			IYCFBamMinorVersionObj minorVersion = null;
			IYCFBamMajorVersionObj majorVersion = null;
			IYCFBamSubProjectObj subProject = null;
			IYCFBamTopProjectObj topProject = null;
			IYCFBamTopDomainObj topDomain = null;
			IYCFBamTldObj tld = null;

			String ret = null;
			IYCFLibAnyObj scopeDef = manufacturingSchema.getObjScope();
			while (scopeDef != null) {
				if (scopeDef instanceof IYCFBamMajorVersionObj) {
					if (majorVersion == null) {
						majorVersion = (IYCFBamMajorVersionObj)scopeDef;
					}
					else {
						throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Found multiple major version objects in scope chain.");
					}
					scopeDef = scopeDef.getObjScope();
				}
				else if (scopeDef instanceof IYCFBamMinorVersionObj) {
					if (minorVersion == null) {
						minorVersion = (IYCFBamMinorVersionObj)scopeDef;
					}
					else {
						throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Found multiple minor version objects in scope chain.");
					}
					scopeDef = scopeDef.getObjScope();
				}
				else if (scopeDef instanceof IYCFBamSubProjectObj) {
					if (subProject == null) {
						subProject = (IYCFBamSubProjectObj)scopeDef;
					}
					else {
						throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Found multiple sub-project objects in scope chain.");
					}
					scopeDef = scopeDef.getObjScope();
				}
				else if (scopeDef instanceof IYCFBamTopProjectObj) {
					if (topProject == null) {
						topProject = (IYCFBamTopProjectObj)scopeDef;
					}
					else {
						throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Found multiple top-project objects in scope chain.");
					}
					scopeDef = scopeDef.getObjScope();
				}
				else if (scopeDef instanceof IYCFBamTopDomainObj) {
					if (topDomain == null) {
						topDomain = (IYCFBamTopDomainObj)scopeDef;
					}
					else {
						throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Found multiple top-domain objects in scope chain.");
					}
					scopeDef = scopeDef.getObjScope();
				}
				else if (scopeDef instanceof IYCFBamTldObj) {
					if (tld == null) {
						tld = (IYCFBamTldObj)scopeDef;
					}
					else {
						throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Found multiple TLD objects in scope chain.");
					}
					scopeDef = null;
				}
				else if (scopeDef instanceof IYCFSecTenantObj) {
					scopeDef = null;
				}
			}
			if (tld == null) {
				throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Failed to find TLD object in scope chain.");
			}
			if (topDomain == null) {
				throw new YCFLibRuntimeException("MssYCFBuiltinJavaPackage.expand() - Failed to find top-domain object in scope chain.");
			}
			String versionString;
			if (majorVersion != null) {
				if (minorVersion != null) {
					versionString = ".v" + majorVersion.getObjName().toLowerCase() + "_" + minorVersion.getObjName().toLowerCase();
				}
				else {
					versionString = ".v" + majorVersion.getObjName().toLowerCase();
				}
			}
			else {
				versionString = "";
			}
			if (topProject != null) {
				if (subProject != null) {
					ret = tld.getObjName().toLowerCase() + "." + topDomain.getObjName().toLowerCase() + "." + topProject.getObjName().toLowerCase() + versionString + "." + subProject.getObjName().toLowerCase();
				}
				else {
					ret = tld.getObjName().toLowerCase() + "." + topDomain.getObjName().toLowerCase() + "." + topProject.getObjName().toLowerCase() + versionString;
				}
			}
			else {
				ret = tld.getObjName().toLowerCase() + "." + topDomain.getObjName().toLowerCase() + versionString;
			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinGenPackage
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinGenPackage( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;
			MssYCFGenContext fileContext = genContext.getGenFileContext();
			if( fileContext != null ) {
				IYCFLibAnyObj tmp = (IYCFLibAnyObj)(fileContext.getGenDef());
				if( tmp != null ) {
					IYCFLibAnyObj pkg = MSSBamYCFAnyObj.getPackage(tmp);
					if( pkg != null ) {
						ret = MSSBamYCFAnyObj.getModelName( pkg );
					}
				}
			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinGenBasePackage
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinGenBasePackage( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;
			MssYCFGenContext fileContext = genContext.getGenFileContext();
			if( fileContext != null ) {
				IYCFLibAnyObj tmp = (IYCFLibAnyObj)(fileContext.getGenDef());
				if( tmp != null ) {
					IYCFLibAnyObj pkg = MSSBamYCFAnyObj.getPackage(tmp);
					if( pkg != null ) {
						String pkgName = MSSBamYCFAnyObj.getModelName( pkg );
						if( pkgName != null ) {
							String basePackageName = genContext.getGenBasePackageName();
							if( ( basePackageName != null ) && ( basePackageName.length() > 0 ) ) {
								ret = pkgName + "." + basePackageName;
							}
							else {
								ret = pkgName;
							}
						}
					}
				}
			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinGenFullPackage
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinGenFullPackage( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			final String S_ProcName = "MssYCFBuiltingGenFullPackage.expand() ";
			String ret = null;
			IYCFLibAnyObj genDef;
			MssYCFGenContext fileContext = genContext.getGenFileContext();
			if( fileContext != null ) {
				genDef = (IYCFLibAnyObj)(fileContext.getGenDef());
			}
			else {
				genDef = (IYCFLibAnyObj)genContext.getGenDef();
			}
			IYCFLibAnyObj pkg = MSSBamYCFAnyObj.getPackage(genDef);
			if( pkg != null ) {
				String pkgName = MSSBamYCFAnyObj.getFullName( pkg );
				if( pkgName == null ) {
					throw new RuntimeException( S_ProcName +  "GetFullName() returned null" );
				}
				String basePackageName = genContext.getGenBasePackageName();
				if( basePackageName != null ) {
					String subPackageName = genContext.getGenSubPackageName();
					if( ( subPackageName != null ) && ( subPackageName.length() > 0 ) ) {
						ret = pkgName + "." + basePackageName + "." + subPackageName;
					}
					else {
						ret = pkgName + "." + basePackageName;
					}
				}
				else {
					ret = pkgName;
				}
			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinGenPackageDir
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinGenPackageDir( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;
			MssYCFGenContext fileContext = genContext.getGenFileContext();
			if( fileContext != null ) {
				String basePackageName = genContext.getGenBasePackageName();
				if( ( basePackageName != null ) && ( basePackageName.length() > 0 ) ) {
					String subPackageName = genContext.getGenSubPackageName();
					if( ( subPackageName != null ) && ( subPackageName.length() > 0 ) ) {
						String sourceBundle = genContext.getSourceBundle();
						if( ( sourceBundle != null ) && ( sourceBundle.length() > 0 ) ) {
							String unmassaged = sourceBundle + "." + basePackageName + "." + subPackageName;
							ret = unmassaged.replace( '.', '/' );
						}
						else {
							String unmassaged = basePackageName + "." + subPackageName;
							ret = unmassaged.replace( '.', '/' );
						}
					}
					else {
						String sourceBundle = genContext.getSourceBundle();
						if( ( sourceBundle != null ) && ( sourceBundle.length() > 0 ) ) {
							String unmassaged = sourceBundle + "." + basePackageName;
							ret = unmassaged.replace( '.', '/' );
						}
						else {
							String unmassaged = basePackageName;
							ret = unmassaged.replace( '.', '/' );
						}
					}
				}
				else {
					ret = "";
				}
			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinGenPackageFullDir
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinGenPackageFullDir( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;
			MssYCFGenContext fileContext = genContext.getGenFileContext();
			if( fileContext != null ) {
				IYCFLibAnyObj tmp = (IYCFLibAnyObj)(fileContext.getGenDef());
				if( tmp != null ) {
					IYCFLibAnyObj pkg = MSSBamYCFAnyObj.getPackage(tmp);
					if( pkg != null ) {
						String pkgDir = MSSBamYCFAnyObj.getModelName( pkg );
						if( pkgDir != null ) {
							if( tmp instanceof IYCFBamSchemaObj ) {
								String		schemaPkg = ret + "." + tmp.getObjName().toLowerCase();
								pkgDir = schemaPkg;
							}

							String fileSep = "/";
							String rootGenDir = genContext.getRootGenDir();
							if( rootGenDir != null ) {
								if( fileSep.length() == 1 ) {
									String str =  rootGenDir + '/' + pkgDir;
									ret = str.replace( '/', fileSep.charAt( 0 ) );
								}
								else {
									ret =  rootGenDir + '/' + pkgDir;
								}
							}
							else {
								if( fileSep.length() == 1 ) {
									ret = pkgDir.replace( '/', fileSep.charAt( 0 ) );
								}
								else {
									ret =  rootGenDir + '/' + pkgDir;
								}
							}
						}
					}
				}
			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinSchemaHostName
	extends YCFGenKbGelBuiltinObj
	{
		public MssYCFBuiltinSchemaHostName( IYCFGenKbSchemaObj schemaObj ) {
			super( schemaObj );
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;
//			MssYCFGenContext fileContext = genContext.getGenFileContext();
//			if( fileContext != null ) {
				IYCFLibAnyObj tmp = (IYCFLibAnyObj)(genContext.getGenDef());
				if( tmp != null ) {
					while ((tmp != null) && !(tmp instanceof IYCFBamSchemaDefObj)) {
						tmp = tmp.getObjScope();
					}
					if ((tmp != null) && (tmp instanceof IYCFBamSchemaDefObj)) {
						IYCFBamSchemaDefObj schemaDef = (IYCFBamSchemaDefObj)tmp;
						ret = schemaDef.getRequiredContainerMinorVersion().getRequiredContainerParentMajVer().getRequiredContainerParentSPrj().getRequiredContainerParentTPrj().getRequiredName()
							+ "." + schemaDef.getRequiredContainerMinorVersion().getRequiredContainerParentMajVer().getRequiredContainerParentSPrj().getRequiredContainerParentTPrj().getRequiredContainerParentSDom().getRequiredName()
						    + "." + schemaDef.getRequiredContainerMinorVersion().getRequiredContainerParentMajVer().getRequiredContainerParentSPrj().getRequiredContainerParentTPrj().getRequiredContainerParentSDom().getRequiredContainerParentTld().getRequiredName();
					}
					else {
						ret = System.getenv("HOSTNAME");
					}
				}
//			}
			return( ret );
		}
	}

	protected class MssYCFBuiltinSchemaTweak
	extends YCFGenKbGelBuiltinObj
	{
		protected final String tweakName;

		public MssYCFBuiltinSchemaTweak( IYCFGenKbSchemaObj schemaObj, String tweakName ) {
			super( schemaObj );
			this.tweakName = tweakName;
			if (schemaObj instanceof MSSBamYCFEngine) {
				((MSSBamYCFEngine)schemaObj).defineSchemaTweakName(tweakName);
			}
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;

			IYCFLibAnyObj genDef;
			final String S_ProcName = "expandSchemaTweak";

			if (genContext == null) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					1,
					"genContext" );
			}

			genDef = genContext.getGenDef();
			if (genDef == null) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"genContext.GenDef" );
			}

			if( ! ( genDef instanceof IYCFBamSchemaDefObj ) ) {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"genContext.GenDef",
					genDef,
					"IYCFBamSchemaDefObj" );
			}

			ArrayList<IYCFBamSchemaTweakObj> arrTweaks = new ArrayList<>();

			IYCFBamSchemaDefObj schema = (IYCFBamSchemaDefObj)genDef;
			for (IYCFBamSchemaRefObj refSchema : schema.getOptionalComponentsSchemaRefs()) {
				IYCFBamSchemaDefObj forSchema = refSchema.getOptionalLookupRefSchema();
				if (forSchema != null) {
					for (IYCFBamTweakObj tweak : forSchema.getOptionalComponentsTweaks()) {
						IYCFBamSchemaTweakObj rtweak = (IYCFBamSchemaTweakObj)tweak;
						if (rtweak.getRequiredName().equals(tweakName)) {
							if (!arrTweaks.contains(rtweak)) {
								arrTweaks.add(rtweak);
							}
						}
					}
				}
			}
			for (IYCFBamTweakObj tweak : schema.getOptionalComponentsTweaks()) {
				IYCFBamSchemaTweakObj rtweak = (IYCFBamSchemaTweakObj)tweak;
				if (rtweak.getRequiredName().equals(tweakName)) {
					if (!arrTweaks.contains(rtweak)) {
						arrTweaks.add(rtweak);
					}
				}
			}

			StringBuilder buff = new StringBuilder();
			for (IYCFBamSchemaTweakObj tweak: arrTweaks) {
				if (tweak.getRequiredReplacesInherited()) {
					buff.setLength(0);
				}
				buff.append(tweak.getRequiredTweakGelText());
			}

			if(! buff.isEmpty()) {
				StringBuilder execName = new StringBuilder( genDef.getGenDefName() );
				execName.append( "::" );
				execName.append(	genDef.getObjFullName() );
				execName.append( "::" );
				execName.append( tweakName );
				try {
					IYCFGenKbGelExecutableObj bin = genContext.getGenEngine().getGelCompiler().compileExecutable( execName.toString(), buff.toString(), null );
					ret = bin.expand( genContext );
				}
				catch (Throwable th) {
					genContext.getGenEngine().getLog().message("ERROR: Could not compile " + genDef.getObjFullName() + " schematweak " + execName.toString() + " text='" + buff.toString() + "' - " + th.getMessage());
					ret = "";
				}
			}
			else {
				ret = "";
			}

			return (ret);
		}
	}

	protected class MssYCFBuiltinTableTweak
	extends YCFGenKbGelBuiltinObj
	{
		protected final String tweakName;

		public MssYCFBuiltinTableTweak( IYCFGenKbSchemaObj schemaObj, String tweakName ) {
			super( schemaObj );
			this.tweakName = tweakName;
			if (schemaObj instanceof MSSBamYCFEngine) {
				((MSSBamYCFEngine)schemaObj).defineTableTweakName(tweakName);
			}
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;

			IYCFLibAnyObj genDef;
			final String S_ProcName = "expandTableTweak";

			if (genContext == null) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					1,
					"genContext" );
			}

			genDef = genContext.getGenDef();
			if (genDef == null) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"genContext.GenDef" );
			}

			if( ! ( genDef instanceof IYCFBamTableObj ) ) {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"genContext.GenDef",
					genDef,
					"IYCFBamTableObj" );
			}

			ArrayList<IYCFBamTableTweakObj> arrTweaks = new ArrayList<>();

			IYCFBamTableObj table = (IYCFBamTableObj)genDef;
			while (table != null) {
				for (IYCFBamTweakObj tweak : table.getOptionalComponentsTweaks()) {
					IYCFBamTableTweakObj rtweak = (IYCFBamTableTweakObj)tweak;
					if (rtweak.getRequiredName().equals(tweakName)) {
						if (!arrTweaks.contains(rtweak)) {
							arrTweaks.add(0,rtweak);
						}
					}
				}
				if (table.getOptionalDefSchemaTenantId() != null && table.getOptionalDefSchemaId() != null) {
					IYCFBamSchemaDefObj schemaDef = table.getSchema().getSchemaDefTableObj().readSchemaDefByIdIdx(table.getOptionalDefSchemaTenantId(), table.getOptionalDefSchemaId());
					for( IYCFBamTableObj curTable : schemaDef.getOptionalComponentsTables()) {
						if (curTable.getRequiredName().equals(table.getRequiredName())) {
							table = curTable;
							break;
						}
					}
				}
				else {
					table = null;
				}
			}

			StringBuilder buff = new StringBuilder();
			for (IYCFBamTableTweakObj tweak: arrTweaks) {
				if (tweak.getRequiredReplacesInherited()) {
					buff.setLength(0);
				}
				buff.append(tweak.getRequiredTweakGelText());
			}

			if(! buff.isEmpty()) {
				StringBuilder execName = new StringBuilder( genDef.getGenDefName() );
				execName.append( "::" );
				execName.append(	genDef.getObjFullName() );
				execName.append( "::" );
				execName.append( tweakName );
				try {
					IYCFGenKbGelExecutableObj bin = genContext.getGenEngine().getGelCompiler().compileExecutable( execName.toString(), buff.toString(), null );
					ret = bin.expand( genContext );
				}
				catch (Throwable th) {
					genContext.getGenEngine().getLog().message("ERROR: Could not compile " + genDef.getObjFullName() + " tabletweak " + execName.toString() + " text='" + buff.toString() + "' - " + th.getMessage());
					ret = "";
				}
			}
			else {
				ret = "";
			}

			return (ret);
		}
	}

	protected class MssYCFBuiltinIndexTweak
	extends YCFGenKbGelBuiltinObj
	{
		protected final String tweakName;

		public MssYCFBuiltinIndexTweak( IYCFGenKbSchemaObj schemaObj, String tweakName ) {
			super( schemaObj );
			this.tweakName = tweakName;
			if (schemaObj instanceof MSSBamYCFEngine) {
				((MSSBamYCFEngine)schemaObj).defineIndexTweakName(tweakName);
			}
		}

		public String expand( MssYCFGenContext genContext ) {
			String ret = null;

			IYCFLibAnyObj genDef;
			final String S_ProcName = "expandIndexTweak";

			if (genContext == null) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					1,
					"genContext" );
			}

			genDef = genContext.getGenDef();
			if (genDef == null) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"genContext.GenDef" );
			}

			if( ! ( genDef instanceof IYCFBamIndexObj ) ) {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"genContext.GenDef",
					genDef,
					"IYCFBamIndexObj" );
			}

			ArrayList<IYCFBamIndexTweakObj> arrTweaks = new ArrayList<>();

			IYCFBamIndexObj index = (IYCFBamIndexObj)genDef;
			while (index != null) {
				for (IYCFBamTweakObj tweak : index.getOptionalComponentsTweaks()) {
					IYCFBamIndexTweakObj rtweak = (IYCFBamIndexTweakObj)tweak;
					if (rtweak.getRequiredName().equals(tweakName)) {
						if (!arrTweaks.contains(rtweak)) {
							arrTweaks.add(0,rtweak);
						}
					}
				}
				IYCFBamTableObj table = null;
				if (index.getOptionalDefSchemaTenantId() != null && index.getOptionalDefSchemaId() != null) {
					IYCFBamSchemaDefObj schemaDef = index.getSchema().getSchemaDefTableObj().readSchemaDefByIdIdx(index.getOptionalDefSchemaTenantId().longValue(), index.getOptionalDefSchemaId().longValue());
					for( IYCFBamTableObj curTable : schemaDef.getOptionalComponentsTables()) {
						if (index.getRequiredContainerTable().getRequiredName().equals(curTable.getRequiredName())) {
							table = curTable;
							break;
						}
					}
				}
				if (table != null) {
					for( IYCFBamIndexObj curIndex: table.getOptionalComponentsIndex()) {
						if (index.getRequiredName().equals(curIndex.getRequiredName())) {
							index = curIndex;
							break;
						}
					}
					if (index != null && index.getRequiredContainerTable() != table) {
						index = null;
					}
				}
				else {
					index = null;
				}
			}

			StringBuilder buff = new StringBuilder();
			for (IYCFBamIndexTweakObj tweak: arrTweaks) {
				if (tweak.getRequiredReplacesInherited()) {
					buff.setLength(0);
				}
				buff.append(tweak.getRequiredTweakGelText());
			}

			if(! buff.isEmpty()) {
				StringBuilder execName = new StringBuilder( genDef.getGenDefName() );
				execName.append( "::" );
				execName.append(	genDef.getObjFullName() );
				execName.append( "::" );
				execName.append( tweakName );
				try {
					IYCFGenKbGelExecutableObj bin = genContext.getGenEngine().getGelCompiler().compileExecutable( execName.toString(), buff.toString(), null );
					ret = bin.expand( genContext );
				}
				catch (Throwable th) {
					genContext.getGenEngine().getLog().message("ERROR: Could not compile " + genDef.getObjFullName() + " indextweak " + execName.toString() + " text='" + buff.toString() + "' - " + th.getMessage());
					ret = "";
				}
			}
			else {
				ret = "";
			}

			return (ret);
		}
	}

	protected IYCFGenKbGelInstructionObj compileMacro( String macro )
	{
		boolean noSuperCompiler = true;
		IYCFGenKbGelInstructionObj ret = null;

		if( macro == null ) {
			ret = super.compileMacro( "" );
			noSuperCompiler = false;
		}
		else if( macro.length() == 0 ) {
			ret = super.compileMacro( macro );
			noSuperCompiler = false;
		}
		else if( macro.startsWith( _BUILTIN_SCHEMATWEAK)) {
			String afterKeyword = macro.substring(_BUILTIN_SCHEMATWEAK.length());
			int afterWhite = 0;
			while (afterWhite < afterKeyword.length() && Character.isWhitespace(afterKeyword.charAt(afterWhite))) {
				afterWhite ++;
			}
			if (afterWhite > 0 && afterWhite < afterKeyword.length()) {
				afterKeyword = afterKeyword.substring(afterWhite);
			}
			else if(afterWhite > 0) {
				afterKeyword = "";
			}
			if (!afterKeyword.isEmpty() && !afterKeyword.isBlank()) {
				IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinSchemaTweak( genEngine, afterKeyword ); 
				IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
				builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
				builtinEdit.setRequiredContainerGelCache( myGelCache );
				builtinEdit.setRequiredSourceText( macro );
				builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
				ret = builtinObj;
			}
			else {
				IYCFGenKbGelErrorObj errObj = new YCFGenKbGelErrorObj(genEngine);
				IYCFGenKbGelErrorEditObj errEdit = (IYCFGenKbGelErrorEditObj)errObj.beginEdit();
				errEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
				errEdit.setRequiredContainerGelCache( myGelCache );
				errEdit.setRequiredSourceText( macro );
				errObj = (IYCFGenKbGelErrorObj)errEdit.create();
				ret = errObj;
			}
		}
		else if( macro.startsWith( _BUILTIN_TABLETWEAK)) {
			String afterKeyword = macro.substring(_BUILTIN_TABLETWEAK.length());
			int afterWhite = 0;
			while (afterWhite < afterKeyword.length() && Character.isWhitespace(afterKeyword.charAt(afterWhite))) {
				afterWhite ++;
			}
			if (afterWhite > 0) {
				if (afterWhite < afterKeyword.length()) {
					afterKeyword = afterKeyword.substring(afterWhite);
				}
				else {
					afterKeyword = "";
				}
			}
			else {
				afterKeyword = "";
			}
			if (!afterKeyword.isEmpty() && !afterKeyword.isBlank()) {
				IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinTableTweak( genEngine, afterKeyword ); 
				IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
				builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
				builtinEdit.setRequiredContainerGelCache( myGelCache );
				builtinEdit.setRequiredSourceText( macro );
				builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
				ret = builtinObj;
			}
			else {
				IYCFGenKbGelErrorObj errObj = new YCFGenKbGelErrorObj(genEngine);
				IYCFGenKbGelErrorEditObj errEdit = (IYCFGenKbGelErrorEditObj)errObj.beginEdit();
				errEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
				errEdit.setRequiredContainerGelCache( myGelCache );
				errEdit.setRequiredSourceText( macro );
				errObj = (IYCFGenKbGelErrorObj)errEdit.create();
				ret = errObj;
			}
		}
		else if( macro.startsWith( _BUILTIN_INDEXTWEAK)) {
			String afterKeyword = macro.substring(_BUILTIN_INDEXTWEAK.length());
			int afterWhite = 0;
			while (afterWhite < afterKeyword.length() && Character.isWhitespace(afterKeyword.charAt(afterWhite))) {
				afterWhite ++;
			}
			if (afterWhite > 0) {
				if (afterWhite < afterKeyword.length()) {
					afterKeyword = afterKeyword.substring(afterWhite);
				}
				else {
					afterKeyword = "";
				}
			}
			else {
				afterKeyword = "";
			}
			if (!afterKeyword.isEmpty() && !afterKeyword.isBlank()) {
				IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinIndexTweak( genEngine, afterKeyword ); 
				IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
				builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
				builtinEdit.setRequiredContainerGelCache( myGelCache );
				builtinEdit.setRequiredSourceText( macro );
				builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
				ret = builtinObj;
			}
			else {
				IYCFGenKbGelErrorObj errObj = new YCFGenKbGelErrorObj(genEngine);
				IYCFGenKbGelErrorEditObj errEdit = (IYCFGenKbGelErrorEditObj)errObj.beginEdit();
				errEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
				errEdit.setRequiredContainerGelCache( myGelCache );
				errEdit.setRequiredSourceText( macro );
				errObj = (IYCFGenKbGelErrorObj)errEdit.create();
				ret = errObj;
			}
		}
		else if( macro.equals( _BUILTIN_CODEFACTORYVERSION ) ) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinCodeFactoryVersion( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if( macro.equals( _BUILTIN_PROJECTNAME ) ) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinProjectName( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if (macro.equals(_BUILTIN_JAVAPACKAGE)) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinJavaPackage( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if (macro.equals(_BUILTIN_JAVADEFPACKAGE)) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinJavaDefPackage( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if (macro.equals(_BUILTIN_GENPACKAGE)) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinGenPackage( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if( macro.equals( _BUILTIN_GENBASEPACKAGE ) ) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinGenBasePackage( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if( macro.equals( _BUILTIN_GENFULLPACKAGE ) ) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinGenFullPackage( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if( macro.equals( _BUILTIN_GENPACKAGEDIR ) ) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinGenPackageDir( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if( macro.equals( _BUILTIN_GENPACKAGEFULLDIR ) ) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinGenPackageFullDir( genEngine ); 
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else if( macro.equals( _BUILTIN_SCHEMAHOSTNAME )) {
			IYCFGenKbGelBuiltinObj builtinObj = new MssYCFBuiltinSchemaHostName(genEngine);
			IYCFGenKbGelBuiltinEditObj builtinEdit = (IYCFGenKbGelBuiltinEditObj)builtinObj.beginEdit();
			builtinEdit.setRequiredOwnerTenant( myGelCache.getRequiredOwnerTenant() );
			builtinEdit.setRequiredContainerGelCache( myGelCache );
			builtinEdit.setRequiredSourceText( macro );
			builtinObj = (IYCFGenKbGelBuiltinObj)builtinEdit.create();
			ret = builtinObj;
		}
		else {
			ret = super.compileMacro( macro );
			noSuperCompiler = false;
		}
		if( ( ret == null ) && noSuperCompiler ) {
			ret = super.compileMacro( macro );
		}
		return( ret );
	}
}

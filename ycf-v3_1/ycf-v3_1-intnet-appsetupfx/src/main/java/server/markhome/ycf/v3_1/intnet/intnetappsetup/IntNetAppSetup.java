
// Description: Java 25 Main for testing the IntNet schema database creation

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.intnet.intnetappsetup;

import java.lang.reflect.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import javafx.application.Application;

import ch.qos.logback.classic.LoggerContext;

import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

import server.markhome.cf.*;
import server.markhome.cf.Inz;
import server.markhome.cf.InzPathEntry;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.buff.*;
import server.markhome.ycf.v3_1.intnet.intnet.buff.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.buff.*;
import server.markhome.ycf.v3_1.intnet.intnetappsetup.fx.IntNetAppSetupFxApplication;

@SpringBootApplication
@ComponentScan(basePackages = {
    "server.markhome.ycf.v3_1.intnet.intnetappsetup.fx",   // if you have service beans here
    "server.markhome.ycf.v3_1.intnet.intnetappsetup.spring"   // if you have service beans here
})
@EnableAutoConfiguration(exclude = {
})
public class IntNetAppSetup
{
    private static final AtomicReference<Properties> systemProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> applicationProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> userDefaultProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> userProperties = new AtomicReference<>(null);
    private static final AtomicReference<Properties> mergedProperties = new AtomicReference<>(null);

	public static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(server.markhome.ycf.v3_1.intnet.intnetappsetup.IntNetAppSetup.class.getName());
	public static LoggerContext loggerContext = (LoggerContext) org.slf4j.LoggerFactory.getILoggerFactory();
	public static String startingupMessage = IntNetAppSetup.class.getName() + " starting.";

    /**
     * Loads the application properties file from the application resources.
     */
    public static Properties getApplicationProperties() {
        if (applicationProperties.get() == null) {
            Properties props = new Properties();
            try (var in = IntNetAppSetup.class.getClassLoader().getResourceAsStream("application.properties")) {
                if (in != null) {
                    props.load(in);
                } else {
                    throw new RuntimeException(Inz.x("intnetappsetup.ApplicationPropertiesNotFound"));
                }
            } catch (IOException e) {
                throw new RuntimeException(Inz.x("intnetappsetup.CouldNotLoadApplicationProperties"), e);
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
            try (var in = IntNetAppSetup.class.getClassLoader().getResourceAsStream("user-default.properties")) {
                if (in != null) {
                    props.load(in);
                } else {
                    throw new RuntimeException(Inz.x("intnetappsetup.UserDefaultPropertiesNotFound"));
                }
            } catch (IOException e) {
                throw new RuntimeException(Inz.x("intnetappsetup.FailedToLoadUserDefaultProperties"), e);
            }
            userDefaultProperties.compareAndSet(null, props);
        }
        return userDefaultProperties.get();
    }

    /**
     * Make sure the user properties file doesn't exist yet
     */
    public static Properties getUserProperties() {
        if (userProperties.get() == null) {
            Properties props = new Properties();
            File userFile = new File(System.getProperty("user.home"), ".intnetappsrv.properties");
            if (userFile.exists()) {
				throw new CFUsageException(IntNetAppSetup.class,
					"getUserProperties",
					String.format("%1$s already exists - application initialization previously completed", userFile.getPath ( ) ), String.format ( "%1$s already exists - application initialization previously completed", userFile.getPath()));
                
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
        Inz.addPathEntry(IInzPathEntry.getService().getInstance("/opt/cf/v3_1/java" + "/server.markhome.ycf.v3_1.intnet.intnetappsetup/src/main/resources/" + "/server.markhome.ycf.v3_1.intnet.intnetappsetup".replace(".","/") + "/langs"));

        // This weird looking cadence ensures that all the sub-property lists are prepared before getMergedProperties() is invoked, ensuring that any errors and exceptions along the way are thrown first and in predictable order
        Properties mergedProperties = getApplicationProperties();
        mergedProperties = getUserDefaultProperties();
        mergedProperties = getSystemProperties();
        mergedProperties = getUserProperties();
        mergedProperties = getMergedProperties();
        System.getProperties().putAll(mergedProperties);

        SpringApplication app = new SpringApplication(IntNetAppSetup.class);
        app.addInitializers((applicationContext) -> {
            ConfigurableEnvironment env = applicationContext.getEnvironment();
            env.getPropertySources().addLast(new org.springframework.core.env.PropertiesPropertySource("userProperties", userProperties.get()));
        });
		int finalvalue = 0xf00000;
		SecureBuffSchema buffSecure = new SecureBuffSchema();
		finalvalue = buffSecure.initClassMapEntries(finalvalue);
		buffSecure.setSecureSchema(buffSecure);
		IntNetBuffSchema buffIntNet = new IntNetBuffSchema();
		finalvalue = buffIntNet.initClassMapEntries(finalvalue);
		buffIntNet.setIntNetSchema(buffIntNet);
		logStartupInfo(args);
		logger.info("Runtime class codes are " + 0xf00000 + ".." + (finalvalue-1) + " (" + (finalvalue-0xf00000-1) + " tables in total)");
        Application.launch(IntNetAppSetupFxApplication.class, args);
    }

	public static void logStartupInfo(String[] args) {
		logger.info(startingupMessage);
		String argsString = "";
		if (args != null && args.length > 0) {
			StringBuilder sb = new StringBuilder(argsString);
			for (int i = 0; i < args.length; i++) {
				sb.append("arg ").append(i).append(" = >>>").append(args[i]).append("<<<");
			}
			argsString = sb.toString();
		}
		String message = "Spring boot Application args >>>" + argsString + "<<<";
		logger.info("The IntNet Application Setup is starting with args >>>{}<<<", message);
		String currentDirectory = new File(".").getAbsolutePath();
		message = "Application current Directory is: >>>" + currentDirectory + "<<<";
		logger.info(message);
	}

}



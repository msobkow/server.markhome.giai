
// Description: Java 25 Main for testing the Secure schema instance creation

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

package server.markhome.ycf.v3_1.secure.secureramtest;

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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.Inz;
import server.markhome.cf.InzPathEntry;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureram.*;
import server.markhome.ycf.v3_1.intnet.intnetram.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureram.*;

@SpringBootApplication
@ComponentScan(basePackages = {
    "server.markhome.ycf.v3_1.secure.secureramtest.spring"   // if you have service beans here
})
@EnableAutoConfiguration(exclude = {
})
public class SecureRamTest
{
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
            try (var in = SecureRamTest.class.getClassLoader().getResourceAsStream("application.properties")) {
                if (in != null) {
                    props.load(in);
                } else {
                    throw new RuntimeException(Inz.x("secureramtest.ApplicationPropertiesNotFound"));
                }
            } catch (IOException e) {
                throw new RuntimeException(Inz.x("secureramtest.CouldNotLoadApplicationProperties"), e);
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
            try (var in = SecureRamTest.class.getClassLoader().getResourceAsStream("user-default.properties")) {
                if (in != null) {
                    props.load(in);
                } else {
                    throw new RuntimeException(Inz.x("secureramtest.UserDefaultPropertiesNotFound"));
                }
            } catch (IOException e) {
                throw new RuntimeException(Inz.x("secureramtest.FailedToLoadUserDefaultProperties"), e);
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
            File userFile = new File(System.getProperty("user.home"), ".secureramtest.properties");
            if (userFile.exists()) {
                try (FileInputStream fis = new FileInputStream(userFile)) {
                    props.load(fis);
                } catch (IOException e) {
                    throw new RuntimeException(Inz.x("secureramtest.FailedToLoadUserProperties"), e);
                }
            } else {
                try (var in = SecureRamTest.class.getClassLoader().getResourceAsStream("user-default.properties")) {
                    if (in != null) {
                        Files.copy(in, userFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println(String.format(Inz.x("secureramtest.NewUserPropsFileCreatedAt"), userFile.getAbsolutePath()));
                        System.out.println(Inz.x("secureramtest.PleaseCustomizeThisFile"));
                        System.exit(0);
                    }
                    else {
                        var subin = SecureRamTest.class.getClassLoader().getResourceAsStream("application.properties");
                        if (subin != null) {
                            Files.copy(subin, userFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println(String.format(Inz.x("secureramtest.NewUserPropsFileCreatedAt"), userFile.getAbsolutePath()));
                            System.out.println(Inz.x("secureramtest.PleaseCustomizeThisFile"));
                            System.exit(0);
                        } else {
                            throw new RuntimeException(Inz.x("secureramtest.NeitherUserDefaultNorApplicationPropertiesFound"));
                        }
                    }
                } catch (IOException e) {
                    System.err.println(String.format(Inz.x("secureramtest.FailedToCreateUserPropertiesFile"), userFile.getAbsolutePath(), e.getMessage()));
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
        Inz.addPathEntry(IInzPathEntry.getService().getInstance("/opt/cf/v3_1/java" + "/server.markhome.ycf.v3_1.secure.secureramtest/src/main/resources/" + "/server.markhome.ycf.v3_1.secure.secureramtest".replace(".","/") + "/langs"));

        // This weird looking cadence ensures that all the sub-property lists are prepared before getMergedProperties() is invoked, ensuring that any errors and exceptions along the way are thrown first and in predictable order
        Properties mergedProperties = getApplicationProperties();
        mergedProperties = getUserDefaultProperties();
        mergedProperties = getSystemProperties();
        mergedProperties = getUserProperties();
        mergedProperties = getMergedProperties();
        System.getProperties().putAll(mergedProperties);

        SpringApplication app = new SpringApplication(SecureRamTest.class);
        app.addInitializers((applicationContext) -> {
            ConfigurableEnvironment env = applicationContext.getEnvironment();
            env.getPropertySources().addLast(new org.springframework.core.env.PropertiesPropertySource("userProperties", userProperties.get()));
        });
		int finalvalue = 0xf00000;
		SecureRamSchema jsSecure = new SecureRamSchema();
		finalvalue = jsSecure.initClassMapEntries(finalvalue);
		jsSecure.setSecureSchema(jsSecure);
		jsSecure.wireTableTableInstances();

		System.err.println("Runtime class codes are " + 0xf00000 + ".." + (finalvalue-1) + " (" + (finalvalue-0xf00000-1) + " tables in total)");
        app.run(args);
    }
}


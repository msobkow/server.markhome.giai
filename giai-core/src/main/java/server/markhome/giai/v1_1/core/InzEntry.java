/*
 *	server.markhome.giai - Guided Intelligence Architecture Implementation v1.1 Core Services
 *	
 *	Copyright (c) 2016-2027 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *	
 *	The core foundation library CFLib is Licensed under the GNU Library General Public License, Version 3.0 or later; all other modules are Licensed under
 *	the GNU General Public License, Version 3.0 or later, or under a Commercial License purchased from Mark Stephen Sobkow by contacting him at mark.sobkow@gmail.com
 *	and negotiating terms to cover your legal requirements for your product and tool development plans, arrange payment using Canadian legal currency transfer
 *	facilities, and receive your customized Commercial License granting permission to extend and enhance the GNU GPL 3.0 or later licensed code base.
 *	
 *	In the event that you purchase a Commercial Development License, your License will be terminated if your organization distributes the application source
 *	code externally, allows external users to access the resulting applications, or the organization is rebranded, merged, or restructured, or if you violate
 *	International or Canadian Legal Restrictions on Software Development and Deployment.
 *	
 *	In the event that you purchase a Commercial Distribution License, your License will be terminated if your oganization is rebranded, merged, or restructured.
 *	
 *	In the event that you purchase a Transferrable Commercial License, your License is only terminated if your organization develops or produces illegal software
 *	tools and technologies according to International Treaty Law, or Laws of the Country of Canada, in accordance with the legal restrictions on Canadian Application
 *	Source Code Development, Deployment, and Distribution.
 *	
 *	Any one of these Licenses comprises your organization's "License". You may not use these files nor derive variations of them except in compliance with the
 *	License or Commercial License applicable to the source code files in question.
 *	
 *	Samples of the Commercial License permission grants are available at the following URL.  You should also have received samples of the commercial licenses with
 *	this module of application code or configuration and driver data.
 *	
 *		https://msobkow.github.io/mark-stephen-sobkows-licenses/
 *		file:sample-giai-v1_1-ethical-development-license.txt
 *		file:sample-giai-v1_1-ethical-deployment-license.txt
 *		file:sample-giai-v1_1-ethical-distribution-license.txt
 *		file:sample-giai-v1_1-transferrable-ethical-license.txt
 *	
 *	but do not actually grant any permissions to your organization as they have not yet been negotiated for, paid for, or delivered to your organization; they are
 *	only examples of what permissions the Commercial Licenses grant.
 *	
 *	You may obtain a copy of the Open Source Licenses supported at:
 *	
 *	    http://gnu.org/
 *	
 *	Unless required by applicable law or agreed to in writing, software distributed under the Licenses is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *	either express or implied, unless required by International Law and Treaty Agreements with Canada as a Signatory as interpreted by the International Criminal Court, the Canadian
 *	Constition, the Canadian Charter of Rights, or Canadian Federal Law as interpreted by our Supreme Court of Canada.  See the Licenses for the specific language governing permissions
 *	and limitations under the Licenses.
 *	
 *	If you wish to modify and use this code without publishing your changes, or integrate it with proprietary code, please contact Mark Stephen
 *	Sobkow for a commercial license at mark.sobkow@gmail.com.
 *	
 *	SPDX-License-Identifier: LGPL-3.0-or-later
 *	SPDX-License-Identifier: GPL-3.0-or-later
 */

package server.markhome.giai.v1_1.core;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import java.util.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * An InzEntry contains all InzLang entries for a given entry in the language path defined by Inz.langPath.
 * 
 * When Inz does the top-level translation search, it probes the InzEntry data in path-order sequence until
 * it finds a match for the requested key.  If the key ultimately could not be found, it returns "!key!".
 * 
 * InzEntry is not intended to be instantiated directly by users of CFLib, but rather is used internally
 * by Inz to manage the language entries loaded from the properties files in the langPath.
 * 
 * @author Mark Stephen Sobkow
 * @see Inz
 * @see InzLang
 */
public class InzEntry implements IInzEntry {
    protected InzPathEntry pathEntry = null;
    protected HashMap<String, InzLang> langs = new HashMap<>();
    
    /**
     * Construct an InzEntry for the specified pathName, using it to open the directory specified as pathEntry,
     * and then loading all the InzLang entries from the properties files in that directory.
     * 
     * @param pathName
     */
    public InzEntry(InzPathEntry pathEntry) {
        if (pathEntry == null) {
            throw new IllegalArgumentException("Path entry cannot be null.");
        }
        this.pathEntry = pathEntry;
        loadLangs();
    }

    /**
     * Load all InzLang entries from the properties files in the pathEntry directory.
     * Each properties file should be named with the language code (e.g., "en.properties" for English).
     * The InzLang instances are stored in the langs map, keyed by their language code.
     * 
     * This method reads each properties file, validates the required properties,
     * and creates an InzLang instance for each valid file. It also handles fallback languages
     * by linking them to their respective InzLang instances.
     * 
     * If a properties file does not contain the required properties or has mismatched language codes,
     * an IllegalArgumentException is thrown.
     * 
     * In the case of resource entries, it expects to find a "propnames.txt" file that lists the names of the properties files.
     * 
     * @throws IOException if there is an error reading the directory or files.
     * @throws RuntimeException if there is an error loading the language files.
     * @throws IllegalArgumentException if a properties file is invalid or missing required properties.
     * @see InzLang#LANG_CODE_PROP
     * @see InzLang#ENGLISH_NAME_PROP
     * @see InzLang#NLS_NAME_PROP
     * @see InzLang#FALLBACK_LANG_PROP
     * @see InzLang#setTranslations(Properties)
     * @see InzLang#setFallbackLang(InzLang)
     * 
     * Note: This method assumes that the properties files are well-formed and contain the required properties.
     * It does not handle malformed files or unexpected formats, which should be validated before calling this method.
     */
    protected final void loadLangs() {
        String propnames;
        InputStream input = pathEntry.getInputStream("propnames.txt");
        if (input == null) {
            throw new IllegalArgumentException("Resource or file not found: " + pathEntry.getPath() + "/propnames.txt");
        }
        try {
            propnames = new String(input.readAllBytes());
            propnames = propnames.replace("\r", "").trim(); // Normalize line endings
            propnames = propnames.replace("\n", " ").trim(); // Replace newlines with spaces
            propnames = propnames.replace("  ", " "); // Replace multiple spaces with a single space
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to read propnames.txt for path entry " + pathEntry.getPath(), e);
        }
        finally {
            try {
                input.close();
            } catch (IOException e) {
                // Ignore close exception
            }
        }
        String[] propNamesArray = propnames.split(" ");
        for (String propname: propNamesArray) {
            input = null;
            Properties properties = new Properties();
            try {
                input = pathEntry.getInputStream(propname);
                if (input == null) {
                    throw new IllegalArgumentException("Resource or file not found: " + propname + " for path entry " + pathEntry.getPath());
                }
                properties.load(input);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load language resource or file: " + propname + " for path entry " + pathEntry.getPath(), e);
            }
            finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        // Ignore close exception
                    }
                }
            }

            String langCode = propname.substring(0, propname.length() - 11); // Remove ".properties"
            String loadedLangCodeString;
            String englishName;
            String nlsName;

            loadedLangCodeString = properties.getProperty(InzLang.LANG_CODE_PROP);
            if (loadedLangCodeString == null || loadedLangCodeString.isEmpty()) {
                throw new IllegalArgumentException("Language file " + propname + " must contain " +
                        InzLang.LANG_CODE_PROP + " property for path entry " + pathEntry.getPath());
            }
            if (!loadedLangCodeString.toLowerCase().equals(langCode.toLowerCase())) {
                throw new IllegalArgumentException("Language file " + propname + " has mismatched language code: " +
                        loadedLangCodeString.toLowerCase() + ", expected: " + langCode.toLowerCase() + " for path entry " + pathEntry.getPath());
            }
            englishName = properties.getProperty(InzLang.ENGLISH_NAME_PROP);
            nlsName = properties.getProperty(InzLang.NLS_NAME_PROP);
            if (englishName == null || nlsName == null || englishName.isEmpty() || nlsName.isEmpty()) {
                throw new IllegalArgumentException("Language file " + propname + " must contain " +
                        InzLang.ENGLISH_NAME_PROP + " and " + InzLang.NLS_NAME_PROP + " properties for path entry " + pathEntry.getPath());
            }

            // Create an InzLang instance and add it to the langs map
            InzLang lang = new InzLang(langCode.toLowerCase(), englishName, nlsName);
            lang.setTranslations(properties);
            langs.put(langCode, lang);
        }
    }

    /**
     * Search for a translation for the given key using the Inz.getEffectiveLangId() value.
     * 
     * @param key
     * @return
     */
    public String x(String key) {
        return x(key, Inz.getEffectiveLangCode());
    }

    /**
     * Search for a translation for the given key, starting with the specified language code.
     * If the key is not found in the specified language, it will search through the fallback languages
     * until it finds a match or exhausts all options.
     * 
     * @param key The translation key to search for.
     * @param langCode The language code to start the search from.
     * @return The translation for the key, or "!key!" if not found in any language.
     */
    public String x(String key, String langCode) {
        InzLang lang = langs.get(langCode.toLowerCase());
        if (lang != null) {
            return lang.x(key);
        }
        return null;
    }

    /**
     * Get the path entry of this InzEntry.
     * 
     * @return The path entry associated with this InzEntry.
     */
    public InzPathEntry getPathEntry() {
        return pathEntry;
    }

    /**
     * Get the map of language codes to InzLang instances for this InzEntry.
     * 
     * @return A HashMap containing language codes and their corresponding InzLang instances.
     */
    protected HashMap<String, InzLang> getLangs() {
        return langs;
    }

    /**
     * Get the InzLang instance for the specified language code.
     * 
     * @param langCode The language code to retrieve the InzLang instance for.
     * @return The InzLang instance for the specified language code, or null if not found.
     */
    protected InzLang getLang(String langCode) {
        return langs.get(langCode.toLowerCase());
    }
}

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

import java.util.concurrent.atomic.AtomicReference;

/**
 * IInz is the main interface for the IGiAI Internationalization (IInz) library.
 * It provides a framework for managing translations and language files.
 * The IInz interface is responsible for loading language files, managing language codes,
 * and providing access to translations through the IInzLang interface.
 */
public interface IInz extends IGiAIAnyObj {

	/**
	 *	The service singleton has to be thread-safe.
	 */
	@JSProperty
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance(null);

	/**
	 *	Get the service singleton.
	 *
	 *	@return The service singleton.
	 */
	@JSExport
	public static IInz getService() {
		IInz ref = ((IInz)(singleton.get()));
		if (ref == null) {
			ref = new Inz();
			singleton.set(null, ref);
			ref = ((IInz)(singleton.get()));
		}
		return(ref);
	}

//    public static final String IGiAILIB_INZ_PATH = "/server.markhome.giai/v3_1/giai-core/src/main/resources/inz/langs/giailib";
    public static final String IGiAILIB_INZ_PATH = "resource://inz/langs/giailib";

    /**
     * The default language code used when no specific language is set.
     * This is typically "en" for English.
     */
    public static final String DEFAULT_LANG_CODE = "en";

	public static String systemLangCode = DEFAULT_LANG_CODE;

	/**
	 * The initial default effective language code handler returns the system language code.
	 */
	public static IInzEffectiveLangCodeCallback effectiveLangCode = new IInzEffectiveLangCodeCallback() {
																@Override
																public String getEffectiveLangCode() {
																	return(systemLangCode);
																}
															};

    /**
     * The language file path is a list of semicolon-separated path names to language file directories.
     * In each directory may be any number of 2 or 5 letter .properties files which are loaded on a per-language basis,
     * with the pre-".properties" portion of the file name used as the language code.
     * The built-in default path is "resource:server.markhome.giai.langs".  Although the only populated
     * language in that resource directory is "en", there is a hierarchy of accepted language codes and their fallbacks
     * defined with no actual translations in them, so the default for CFLib is to report all exceptions in English.
     */
    protected static final ArrayList<InzPathEntry> pathEntries = new ArrayList<>(new InzPathEntry(Inz.class, GiAILIB_INZ_PATH));

    /**
     * The language file entries matching the langPath.
     */
    protected static final ArrayList<InzEntry> entries = new ArrayList<>();

    /**
     * Set the callback hook for getting the current session's language id String.
     * 
     * @param callback
     * @return The previously registered callback
	 */
	@JSExport
    public static IInzEffectiveLangCodeCallback installEffectiveLangCodeCallback(IInzEffectiveLangCodeCallback callback) {
		if (callback == null) {
			return(effectiveLangCode);
		}
		else {
			IInzEffectiveLangCodeCallback ret = effectiveLangCode;
			effectiveLangCode = callback;
			return(ret);
		}
	}

    /**
     * Get the callback hook for getting the current session's language id String.
     * 
     * @return The IIInzEffectiveLangId callback that was most recently installed; initially null.
	 */
	@JSExport
    public static IInzEffectiveLangCodeCallback getEffectiveLangCodeCallback() {
		return(effectiveLangCode);
	}

    /**
     * Get the current effective language id.  If any exceptions are thrown by the most recently installed callback, the system language code is used. If that isn't valid, the language defaults to "en".
     * 
     * @return The current effective language id.
     *
     * public static String getEffectiveLangCode()
	 */
	@JSExport
	public static String getEffectiveLangCode() {
		String langcode;
		try {
			langcode = effectiveLangCode.getEffectiveLangCode();
		}
		catch(Throwable t) {
			langcode = getSystemLangCode();
		}
		return(langcode);
	}

    /**
     * Add a language path entry to the list of path entries, load and initialize it, and wire it for translations
	 *
     * @param pathEntry The IInzPathEntry to add.
     */
	@JSExport
    public static void addPathEntry(IInzPathEntry pathEntry) {
		if (pathEntry == null || pathEntry.getPath() == null || pathEntry.getPath().isEmpty()) {
			return;
		}
		for (IInzPathEntry entry: pathEntries) {
			if(entry.getPath().equals(pathEntry.getPath())) {
				return;
			}
		}
		pathEntries.add(0, pathEntry);
	}

    /**
     * Get the list of path entries.
     * This method returns the current list of IInzPathEntry objects.
     *
     * @return The list of IInzPathEntry objects.
     */
	@JSExport
    public static ArrayList<IInzPathEntry> getPathEntries() {
		return(new ArrayList<>(pathEntries));
	}

    /**
     * Load the language entries and their language translations from the path specified.
     * This method will clear existing entries if forceReload is true.
     * It will throw an IllegalStateException if the language path is not set or is empty.
     * It will throw an IllegalArgumentException if the path does not exist or is not a directory.
     * If any error occurs while loading the entries, it will throw a RuntimeException.
     *
     * @param forceReload If true, existing entries will be cleared before loading new ones.
     * @throws IllegalStateException if the language path is not set or is empty.
     * @throws IllegalArgumentException if the path does not exist or is not a directory.
     * @throws RuntimeException if an error occurs while loading the entries.
     * @see IInzEntry#loadLangs()
     * @see IInzLang
     * @see IInz#x(String, String)
     * @see IInzEntry
     * @see IInzLang#x(String)
     * 
     * This method is typically called to initialize the language entries before using the translation methods.
     * It allows for dynamic loading of language files from specified directories.
     * If the language path is not set, it will throw an exception to ensure that the user sets it before attempting to load entries.
     * The method supports reloading of entries by clearing existing ones if `forceReload` is true.
     * It iterates through each path in the semicolon-separated list, checking if the path exists and is a directory,
     * and then attempts to load language files from that directory.
     * If any path does not exist or is not a directory, it throws an IllegalArgumentException.
     * If an error occurs while loading the language files, it throws a RuntimeException with the error details.
     * The method ensures that all loaded entries are added to the `entries` list for later use in translations.
     * 
     * Example usage:
     * <pre>
     * IInz inz = new IInz();
     * inz.setLangPath("path/to/languages");
     * inz.loadLangEntries(true); // Load entries, clearing existing ones if any
     * String translation = inz.x("greeting", "en"); // Get translation for 'greeting' in English
     * </pre>
	 */
	@JSExport
    public static void loadLangEntries(boolean forceReload) {
        if (pathEntries == null || pathEntries.isEmpty()) {
            throw new IllegalStateException("Path entries are not set");
        }
        if (forceReload) {
            entries.clear(); // Clear existing entries if force reload is requested
        }
        if (entries.size() <= 1) {
            if (entries.isEmpty()) {
                entries.add(GiAILIB_INZ_ENTRY); // Ensure the CFLib InzEntry is present
            }
            for (int idx = 1; idx < pathEntries.size(); idx++) {
                InzPathEntry pathEntry = pathEntries.get(idx);
                if (pathEntry == null || pathEntry.getPath() == null || pathEntry.getPath().isEmpty()) {
                    throw new IllegalStateException("Path entry is not set for index: " + idx);
                }
                InzEntry entry = new InzEntry(pathEntry);
                try {
                    entry.loadLangs();
                    entries.add(entry);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to load language entries from path: " + pathEntry.getPath(), e);
                }
            }
        }
    }

    /**
     * Get the current system language code.
     * This method returns the language code currently set for the system.
     *
     * @return The current system language code as a String.
     */
	@JSExport
    public static String getSystemLangCode() {
		return(systemLangCode);
	}

    /**
     * Set the current system language code.
     * @param langCode
     */
     public static void setSystemLangCode(String langCode) {
		if (langCode == null || langCode.isEmpty()) {
			return;
		}
		if (langCode.length() == 2 || (langCode.length() == 5 && langCode.charAt(2) == '-')) {
			systemLangCode = langCode.toLowerCase();
		}
		else {
			throw new MCFInvalidArgumentException(IInz.class, "setSystemLangCode", 1, "langCode", "Language code \"" + langCode + "\" must be a two or five character ISO language code", "Language code \"" + langCode + "\" must be a two or five character ISO language code");
		}
	}

    /**
     * Get a translation for a given key in the current system language, probing each of the path entries in order
     * until a non-null translation is found.  If no translation is found, it returns "!key!".
     * @param key The translation key to look up.
     * @return The translated String if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key is null or empty.
     * @see IInzEntry#x(String, String)
     * @see IInzLang#x(String)
     */
	@JSExport
    public static String x(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        return x(key, getEffectiveLangCode());
    }

    /**
     * Get a translation for a given key in the specified language, probing each of the path entries in order
     * until a non-null translation is found.  If no translation is found, it returns "!key!".
     * This method is case-insensitive for both the key and the language code.
     * @param key The translation key to look up.
     * @param langCode The language code to use for the translation.
     * @return The translated String if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key or language code is null or empty.
     * @see IInzEntry#x(String, String)
     * @see IInzLang#x(String)
	 */
	@JSExport
    public static String x(String key, String langCode) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        if (langCode == null || langCode.isEmpty()) {
            throw new IllegalArgumentException("Language code cannot be null or empty.");
        }
        if (langCode.length() != 2 && !(langCode.length() == 5 && langCode.charAt(2) == '-')) {
            throw new IllegalArgumentException("Language code must be a 2-character or 5-character language code");
        }
        String lowerLangCode = langCode.toLowerCase();
        while (lowerLangCode != null) {
            for (int i = entries.size() - 1; i >= 0; i--) {
                InzEntry entry = entries.get(i);
                String translation = entry.x(key, lowerLangCode);
                if (translation != null) {
                    return translation; // Return the first non-null translation found
                }
            }
            if (lowerLangCode.length() == 5) {
                lowerLangCode = lowerLangCode.subString(0,1);
            }
            else {
                if ("en".equals(lowerLangCode)) {
                    lowerLangCode = null;
                }
                else {
                    lowerLangCode = "en";
                }
            }
        }
        // If no translation is found, return the key wrapped in exclamation marks
        return "!" + key + "!";
    }

    /**
     * Get a system English translation for a given key using resource path entries only.
     * @param key The translation key to look up.
     * @return The translated String if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key is null or empty.
     * @see IInzEntry#x(String, String)
     * @see IInzLang#x(String)
	 */
	@JSExport
    public static String s(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        for (int i = entries.size() - 1; i >= 0; i--) {
            InzEntry entry = entries.get(i);
            if (entry.getPathEntry().getClazz() != null && entry.getPathEntry().getPath().startsWith("resource:")) {
                String translation = entry.x(key, "en");
                if (translation != null) {
                    return translation; // Return the first non-null translation found
                }
            }
        }
        // If no translation is found, return the key wrapped in exclamation marks
        return "!" + key + "!";
    }
}

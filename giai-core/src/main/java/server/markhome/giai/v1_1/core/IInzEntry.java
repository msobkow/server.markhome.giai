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
 * An IInzEntry contains all IInzLang entries for a given entry in the language path defined by IInz.langPath.
 * 
 * When IInz does the top-level translation search, it probes the IInzEntry data in path-order sequence until
 * it finds a match for the requested key.  If the key ultimately could not be found, it returns "!key!".
 * 
 * IInzEntry is not intended to be instantiated directly by users of IGiAI, but rather is used internally
 * by IInz to manage the language entries loaded from the properties files in the langPath.
 * 
 * @author Mark Stephen Sobkow
 * @see IInz
 * @see IInzLang
 */
public interface IInzEntry extends IGiAIAnyObj {

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
	public static IInzEntry getService() {
		IInzEntry ref = ((IInzEntry)(singleton.get()));
		if (ref == null) {
			ref = new InzEntry();
			singleton.set(null, ref);
			ref = ((IInzEntry)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	Get an instance that implements the service methods of the interface.
	 *
	 *	@return IInzEntry An instance of the interface.
	 */
	@JSExport
	public static IInzEntry InzEntry_getInstance() {
		IInzEntry retval = new InzEntry();
		return(retval);
	}

	/**
	 *	Get an instance that implements the service methods of the interface.
	 *
	 *	@return IInzEntry An instance of the interface.
	 */
	@JSExport
	public static IInzEntry InzEntry_getInstance(String pathName) {
		IInzEntry retval = new InzEntry(pathName);
		return(retval);
	}

	/**
     *	Construct an IInzEntry for the specified pathName, using it to open the directory specified as pathEntry,
     *	and then loading all the IInzLang entries from the properties files in that directory.
     * 
     *	@param IInzPathEntry pathEntry The path entry to construct the instance over; not allowed to be null.
	 *
	 *	@return IInzEntry An instance of the interface.
	 */
	@JSExport
	public static IInzEntry InzEntry_getInstance(IInzPathEntry pathEntry) {
		IInzEntry retval = new InzEntry(pathEntry);
		return(retval);
	}

    /**
     *	Construct an IInzEntry for the specified pathName, using it to open the directory specified as pathEntry,
     *	and then loading all the IInzLang entries from the properties files in that directory.
     * 
     *	@param IInzPathEntry pathEntry The path entry to construct the instance over; not allowed to be null.
	 *
	 *	@return IInzEntry An instance of the interface.
	 */
	@JSExport
    public IInzEntry getInstance(IInzPathEntry pathEntry);

	/**
	 *	Get the path name for an instance of the interface.
	 *
	 *	@return String The path name.
	 */
	@JSExport
	public static String InzEntry_getPathName(IInzEntry jthis) {
		if (jthis != null) {
			return(jthis.getPathName());
		}
		else {
			return(null);
		}
	}

	/**
	 *	Set the path name for an instance of the interface.
	 *
	 *	@param IInzEntry jthis A reference to the instance in question.
	 *	@param String expected The expected value of the current path name.
	 *	@param String value The path name to be applied.
	 *
	 *	@return String The path name of the instance, which might be different than either parameter.
	 */
	@JSExport
	public static String InzEntry_setPathName(IInzEntry jthis, String expected, String value) {
		if (jthis != null) {
			if(jthis.getPathName() == expected || (jthis.getPathName() != null && jthis.getPathName().equals(value))) {
				jthis.setPathName(expected, value);
				String retval = jthis.getPathName();
				return(retval);
			}
			else {
				return(null);
			}
		}
		else {
			return(null);
		}
	}

	/**
	 *	Get the path entry for an instance of the interface.
	 *
	 *	@return IInzPathEntry The path entry.
	 */
	@JSExport
	public static IInzPathEntry InzEntry_getPathEntry(IInzEntry jthis) {
		if (jthis != null) {
			return(jthis.getPathEntry());
		}
		else {
			return(null);
		}
	}

	/**
	 *	Set the path entry for an instance of the interface.
	 *
	 *	@param IInzEntry jthis A reference to the instance in question.
	 *	@param String expected The expected value of the current path entry.
	 *	@param String value The path entry to be applied.
	 *
	 *	@return String The path entry of the instance, which might be different than either parameter.
	 */
	@JSExport
	public static IInzPathEntry InzEntry_setPathEntry(IInzEntry jthis, IInzPathEntry expected, IInzPathEntry value) {
		if (jthis != null) {
			if(jthis.getPathEntry() == expected || (jthis.getPathEntry() != null && jthis.getPathEntry().equals(value))) {
				jthis.setPathEntry(expected, value);
				String retval = jthis.getPathEntry();
				return(retval);
			}
			else {
				return(null);
			}
		}
		else {
			return(null);
		}
	}

	/**
	 *	Get an instance that implements the service methods of the interface.
	 *
	 *	@return IInzEntry An instance of the interface.
	 */
	@JSExport
	public IInzEntry getInstance();

	/**
	 *	Get an instance that implements the service methods of the interface.
	 *
	 *	@param String pathName The path name to be searched.
	 *
	 *	@return IInzEntry An instance of the interface.
	 */
	@JSExport
	public IInzEntry getInstance(String pathName);

	/**
	 *	Get an instance that implements the service methods of the interface.
	 *
	 *	@param IInzPathEntry pathEntry The path entry to be searched.
	 *
	 *	@return IInzEntry An instance of the interface.
	 */
	@JSExport
	public IInzEntry getInstance(IInzPathEntry pathEntry);

    /**
     * Get the path name.
	 *
     * @return String The current path name.
     */
	@JSProperty
    public String getPathName();

    /**
     * Set the path name.
	 *
     * @param String expected The current path name.
     * @param String value The path name to apply.
	 *
     * @return String The new path name.
     */
	@JSProperty
    public String setPathName(String expected, String value);

    /**
     * Get the path entry.
	 *
     * @return IInzPathEntry The current path name.
     */
	@JSProperty
    public IInzPathEntry getPathEntry();

    /**
     * Set the path entry.
	 *
     * @param IInzPathEntry expected The current path name.
     * @param IInzPathEntry value The path name to apply.
	 *
     * @return IInzPathEntry The new path name.
     */
	@JSProperty
    public IInzPathEntry setPathEntry(IInzPathEntry expected, IInzPathEntry value);

    /**
     * Load all IInzLang entries from the properties files in the pathEntry directory.
     * Each properties file should be named with the language code (e.g., "en.properties" for English).
     * The IInzLang instances are stored in the langs map, keyed by their language code.
     * 
     * This method reads each properties file, validates the required properties,
     * and creates an IInzLang instance for each valid file. It also handles fallback languages
     * by linking them to their respective IInzLang instances.
     * 
     * If a properties file does not contain the required properties or has mismatched language codes,
     * an IllegalArgumentException is thrown.
     * 
     * In the case of resource entries, it expects to find a "propnames.txt" file that lists the names of the properties files.
     * 
     * @throws IOException if there is an error reading the directory or files.
     * @throws RuntimeException if there is an error loading the language files.
     * @throws IllegalArgumentException if a properties file is invalid or missing required properties.
     * @see IInzLang#LANG_CODE_PROP
     * @see IInzLang#ENGLISH_NAME_PROP
     * @see IInzLang#NLS_NAME_PROP
     * @see IInzLang#FALLBACK_LANG_PROP
     * @see IInzLang#setTranslations(Properties)
     * @see IInzLang#setFallbackLang(IInzLang)
     * 
     * Note: This method assumes that the properties files are well-formed and contain the required properties.
     * It does not handle malformed files or unexpected formats, which should be validated before calling this method.
	 */
	@JSExport
	public void loadLangs();

    /**
     * Load all IInzLang entries from the properties files in the pathEntry directory.
     * Each properties file should be named with the language code (e.g., "en.properties" for English).
     * The IInzLang instances are stored in the langs map, keyed by their language code.
     * 
     * This method reads each properties file, validates the required properties,
     * and creates an IInzLang instance for each valid file. It also handles fallback languages
     * by linking them to their respective IInzLang instances.
     * 
     * If a properties file does not contain the required properties or has mismatched language codes,
     * an IllegalArgumentException is thrown.
     * 
     * In the case of resource entries, it expects to find a "propnames.txt" file that lists the names of the properties files.
     * 
     * @throws IOException if there is an error reading the directory or files.
     * @throws RuntimeException if there is an error loading the language files.
     * @throws IllegalArgumentException if a properties file is invalid or missing required properties.
     * @see IInzLang#LANG_CODE_PROP
     * @see IInzLang#ENGLISH_NAME_PROP
     * @see IInzLang#NLS_NAME_PROP
     * @see IInzLang#FALLBACK_LANG_PROP
     * @see IInzLang#setTranslations(Properties)
     * @see IInzLang#setFallbackLang(IInzLang)
     * 
     * Note: This method assumes that the properties files are well-formed and contain the required properties.
     * It does not handle malformed files or unexpected formats, which should be validated before calling this method.
	 */
	@JSExport
    static public void GiAIInzEntry_loadLangs();

    /**
     * Search for a translation for the given key, starting with the specified language code.
     * If the key is not found in the specified language, it will search through the fallback languages
     * until it finds a match or exhausts all options.
     * 
     * @param key The translation key to search for.
     * @return The translation for the key, or "!?key?!" if not found in any language.
     */
	@JSExport
	public static String GiAIInzEntry_x(String key) {
		if (key == null || key.isEmpty() || key.isBlank()) {
			return(null);
		}
		String useLangCode = IInz.getSingleton().getEffectiveLangCode();
		HashMap<String, IInzLang> map = GiAIInzEntry_getLangs(this);
		if(map != null) {
			IInzLang lang = map.get(useLangCode);
			if(lang != null) {
				try {
					String retval = lang.x(key);
					return(retval);
				}
				catch(Throwable th) {
					// "Caught and ignored exception %1$s - %2$s"
					IGiAIConsoleLog.getSingleton().getLog().warn(IInz.getSingleton().x("giai.inzentry.warn.caughtignoredexception"), th.getClass().getSimpleName(), th.getMessage());
					return("!?" + key + "?!");
				}
			}
			else {
				return("!?" + key + "?!");
			}
		}
		else {
			return("!?" + key + "?!");
		}
	}

    /**
     * Search for a translation for the given key using the IInz.getEffectiveLangId() value.
     * 
     * @param key
     * @return
     */
	@JSExport
    public String x(String key);

    /**
     * Search for a translation for the given key, starting with the specified language code.
     * If the key is not found in the specified language, it will search through the fallback languages
     * until it finds a match or exhausts all options.
     * 
     * @param key The translation key to search for.
     * @param langCode The language code to start the search from.
     * @return The translation for the key, or "!?key?!" if not found in any language.
     */
	@JSExport
	public static String GiAIInzEntry_x(String key, String langCode) {
		if (key == null || key.isEmpty() || key.isBlank()) {
			return(null);
		}
		String useLangCode = langCode;
		if(useLangCode == null || useLangCode.isEmpty() || useLangCode.isBlank()) {
			useLangCode = IInz.getSingleton().getEffectiveLangCode();
		}
		HashMap<String, IInzLang> map = GiAIInzEntry_getLangs(this);
		if(map != null) {
			IInzLang lang = map.get(useLangCode);
			if(lang != null) {
				try {
					String retval = lang.x(key);
					return(retval);
				}
				catch(Throwable th) {
					// "Caught and ignored exception %1$s - %2$s"
					IGiAIConsoleLog.getSingleton().getLog().warn(IInz.getSingleton().x("giai.inzentry.warn.caughtignoredexception"), th.getClass().getSimpleName(), th.getMessage());
					return("!?" + key + "?!");
				}
			}
			else {
				return("!?" + key + "?!");
			}
		}
		else {
			return("!?" + key + "?!");
		}
	}

    /**
     * Search for a translation for the given key, starting with the specified language code.
     * If the key is not found in the specified language, it will search through the fallback languages
     * until it finds a match or exhausts all options.
     * 
     * @param key The translation key to search for.
     * @param langCode The language code to start the search from.
     * @return The translation for the key, or "!?key?!" if not found in any language.
     */
	@JSExport
    public String x(String key, String langCode);

    /**
     * Get the map of language codes to IInzLang instances for this IInzEntry.
     * 
	 *	@param IInzEntry jthis The instance to be evaluated
	 *
     *	@return A HashMap containing language codes and their corresponding IInzLang instances.
	 */
	@JSExport
    public static HashMap<String, IInzLang> GiAIInzEntry_getLangs(IInzEntry jthis);

    /**
     * Get the map of language codes to IInzLang instances for this IInzEntry.
     * 
     * @return A HashMap containing language codes and their corresponding IInzLang instances.
	 */
	@JSExport
    public HashMap<String, IInzLang> getLangs();

    /**
     * Get the IInzLang instance for the specified language code.
     * 
     * @param langCode The language code to retrieve the IInzLang instance for.
     * @return The IInzLang instance for the specified language code, or null if not found.
	 */
	@JSExport
    public static IInzLang GiAIInzEntry_getLang(String langCode);

    /**
     * Get the IInzLang instance for the specified language code.
     * 
     * @param langCode The language code to retrieve the IInzLang instance for.
     * @return The IInzLang instance for the specified language code, or null if not found.
	 */
	@JSExport
    public IInzLang getLang(String langCode);
}

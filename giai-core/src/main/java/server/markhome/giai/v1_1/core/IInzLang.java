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

import server.markhome.giai.*;

import java.util.Properties;

/**
 * IInzLang is a language property loader/container for the translations associated with a given language code.
 * There are 3 properties required for each .properties file associated with an IInzLang instance: _IInzLangCode (primary key),
 * _IInzEnglishName, and _IInzNlsName (the NLS name for the language in the regional dialect of the language.)
 * 
 * _IInzLangCode is either a 2-letter ISO-639 code, or a 5-character value consisting of a 2-letter ISO-639 code followed by "-"
 * and a ISO 3166-1 alpha-2 code for the country/region of specialization. Thus "fr-ca" falls back to "fr" and then "en" for probing.
 * 
 * The translations attribute is the loaded .properties for the language translations themselves.  IInzLang is a reference to the
 * cached, loaded IInzLang instance for the fallback language.
 * 
 * IInzLang implements Comparable<IInzLang> so that it can be sorted in a list of languages by langCode.
 * 
 * IInzLang also implements equals() and hashCode() based on the langCode, so that it can be used in collections like HashMap.
 * 
 * The x(String key) method is used to retrieve a translation for a given key, falling back to null if the key is not found.
 * 
 * The addTranslation(String key, String value) method allows adding translations dynamically to the IInzLang instance.
 * 
 * The toString() method provides a string representation of the IInzLang instance, not including the properties themselves, as
 * they will often number in the hundreds or thousands.
 * 
 * NOTE: GPT-4.1 seems to be auto-completing a lot of code as I edit with VSCode, so some credit to the tool for this implementation
 * is due. It seems to be learning the intent and purpose of the code as I write it, so there is more contextual awareness to
 * GPT-4.1 than previous releases of any LLM's I've tried to date of any size. I presume, however, that Microsoft's Copilot
 * is running a "full-fat" customized LLM that would require me to buy thousands of dollars worth of hardware to use locally.
 * 
 * One place where GPT-4.1 really shines is documenting the code I wrote.  It has a much better understanding of intent than
 * prior versions.
 * 
 * @author Mark Stephen Sobkow
 */
public interface IInzLang extends IGiAIAnyObj {

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
	public static IInzLang getService() {
		IInzLang ref = ((IInzLang)(singleton.get()));
		if (ref == null) {
			ref = new Inz();
			singleton.set(null, ref);
			ref = ((IInzLang)(singleton.get()));
		}
		return(ref);
	}

    public final static String LANG_CODE_PROP = "_IInzLangCode";
    public final static String ENGLISH_NAME_PROP = "_IInzEnglishName";
    public final static String NLS_NAME_PROP = "_IInzNlsName";

    /**
     * Construct and IInzLang specifying the langCode, englishName, and nlsName, in that order.
     * 
     * @param langCode
     * @param englishName
     * @param nlsName
     */

    /**
     * Returns the language code for this IInzLang instance.
     * The langCode is either a 2-letter ISO-639 code or a 5-character code consisting of a 2-letter ISO-639 code
     * followed by a hyphen and a 2-letter ISO 3166-1 alpha-2 code.
     *
     * @see #setLangCode(String)
     * @see #getIso639()
     * @see #getIso3166()
     * 
     * @throws IllegalArgumentException if langCode is null, empty, or blank, or if it is not 2 or 5 characters long,
     *         or if a 5-character langCode does not have a hyphen separating the codes.
     * @return the language code as a String, always in lowercase.
     */
	@JSProperty
    public final default String getLangCode() {
        return langCode;
    }

    /**
     * Sets the language code for this IInzLang instance.
     * The langCode must be either a 2-letter ISO-639 code or a 5-character code consisting of a 2-letter ISO-639 code
     * followed by a hyphen and a 2-letter ISO 3166-1 alpha-2 code.
     * If the langCode is 2 characters, it defaults the fallbackLangCode to "en" if not already set.
     * If the langCode is 5 characters, it sets the iso639 and iso3166 properties accordingly.
     *
     * @see #getLangCode()
     * @see #getIso639()
     * @see #getIso3166()
     *
     * @throws IllegalArgumentException if langCode is null, empty, or blank, or if it is not 2 or 5 characters long,
     *         or if a 5-character langCode does not have a hyphen separating the codes.
     * @param langCode
     */
	@JSProperty
    public final default void setLangCode(String langCode) {
        if (langCode == null || langCode.isEmpty() || langCode.isBlank()) {
            throw new IllegalArgumentException("langCode is required");
        }
        if (langCode.length() == 2) {
            this.langCode = langCode.toLowerCase();
            this.iso639 = langCode;
            this.iso3166 = null;
        }
        else if (langCode.length() == 5) {
            if(langCode.charAt(2) != '-') {
                throw new IllegalArgumentException("5-character langCode must be separated by a hyphen in between the pair of 2-letter codes");
            }
            this.langCode = langCode.toLowerCase();
            this.iso639 = langCode.substring(0, 1);
            this.iso3166 = langCode.substring(3, 4);
        }
        else {
            throw new IllegalArgumentException("langCode must be either 2 or 5 characters");
        }
    }

    /**
     * Returns the English name of the language.
     * This is the name of the language in English, which is used for display purposes.
     *
     * @see #setEnglishName(String)
     * @return the English name of the language as a String.
     * 
     * @throws IllegalArgumentException if englishName is null, empty, or blank.
     */
	@JSProperty
    public final default String getEnglishName() {
        return englishName;
    }

    /**
     * Sets the English name of the language.
     * This is the name of the language in English, which is used for display purposes.
     *
     * @see #getEnglishName()
     *
     * @throws IllegalArgumentException if englishName is null, empty, or blank.
     * @param englishName the English name of the language as a String.
     */
	@JSProperty
    public final default void setEnglishName(String englishName) {
        if (englishName == null || englishName.isEmpty() || englishName.isBlank()) {
            throw new IllegalArgumentException("englishName is required");
        }
        this.englishName = englishName;
    }

    /**
     * Returns the NLS name of the language.
     * This is the name of the language in its native script or regional dialect, used for display purposes.
     *
     * @see #setNlsName(String)
     * @return the NLS name of the language as a String.
     * 
     * @throws IllegalArgumentException if nlsName is null, empty, or blank.
     */
	@JSProperty
    public final default String getNlsName() {
        return nlsName;
    }

    /**
     * Sets the NLS name of the language.
     * This is the name of the language in its native script or regional dialect, used for display
     * purposes.
     *
     * @see #getNlsName()
     *
     * @throws IllegalArgumentException if nlsName is null, empty, or blank.
     * @param nlsName the NLS name of the language as a String.
     */
	@JSProperty
    public final default void setNlsName(String nlsName) {
        if (nlsName == null || nlsName.isEmpty() || nlsName.isBlank()) {
            throw new IllegalArgumentException("nlsName is required");
        }
        this.nlsName = nlsName;
    }

    /**
     * Returns the ISO 639 code for this IInzLang instance.
     * This is the 2-letter ISO-639 code that represents the language.
     *
     * @see #setLangCode(String)
     * @return the ISO 639 code as a String.
     */
	@JSProperty
    public final default String getIso639() {
        return iso639;
    }

    /**
     * Returns the ISO 3166 code for this IInzLang instance.
     * This is the 2-letter ISO 3166-1 alpha-2 code that represents the country or region of specialization.
     *
     * @see #setLangCode(String)
     * @return the ISO 3166 code as a String, or null if not applicable.
     */
	@JSProperty
    public final default String getIso3166() {
        return iso3166;
    }

    /**
     * Retrieves a translation for a given key from the translations of this IInzLang instance.
     * If the key is not found in the current language's translations, it falls back to the fallback language's translations.
     *
     * @param key the key for which to retrieve the translation.
     * @return the translation value as a String, or null if the key is not found in either language's translations.
     * 
     * @throws IllegalStateException if translations have not been loaded for this language.
     */
	@Export
    public default String x(String key) {
        if (translations == null) {
            throw new IllegalStateException("Translations not loaded for language: " + langCode);
        }
        String value = translations.getProperty(key);
        return value;
    }

    /**
     * Adds a translation for a given key to the translations of this IInzLang instance.
     * If the translations Properties object is null, it initializes it.
     * If the key is null, empty, or blank, it throws an IllegalArgumentException.
     * If the value is null, it throws an IllegalArgumentException.
     *
     * @param key the key for the translation.
     * @param value the translation value to be added.
     * 
     * @throws IllegalArgumentException if key is null, empty, or blank, or if value is null.
     */
	@JSExport
    public default void addTranslation(String key, String value) {
        if (translations == null) {
            translations = new Properties();
        }
        if (key == null || key.isEmpty() || key.isBlank()) {
            throw new IllegalArgumentException("Translation key cannot be null or empty");
        }
        if (value == null) {
            throw new IllegalArgumentException("Translation value cannot be null");
        }
        translations.setProperty(key, value);
    }

    /**
     * Check if this instance contains the specified key.
     * This method checks if the translations Properties object contains the specified key.
     * If the translations are null, it returns false.
     */
	@JSExport
    public default boolean containsKey(String key) {
        if (translations == null) {
            return false; // No translations loaded, so no keys can be present
        }
        return translations.containsKey(key);
    }

    /**
     *  Compares this IInzLang instance with another IInzLang instance based on the langCode.
     *  If the other instance is null, this instance is considered greater.
     *  The comparison is done lexicographically based on the langCode.
     *
     *  @param other the IInzLang instance to compare with.
     *  @return a negative integer, zero, or a positive integer as this instance's langCode is less than,
     *          equal to, or greater than the specified instance's langCode.
     */
    @Override
	@JSExport
    public default int compareTo(IInzLang other) {
        if (other == null) {
            return 1; // This instance is greater than null
        }
        return this.langCode.compareTo(other.langCode);
    }

    /**
     * Checks if this IInzLang instance is equal to another object.
     * Two IInzLang instances are considered equal if their langCode values are the same.
     * @param obj the object to compare with.
     * @return true if the other object is an IInzLang instance with the same langCode, false otherwise.
     */
    @Override
	@JSExport
    public default boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IInzLang)) return false;
        IInzLang other = (IInzLang) obj;
        return langCode.equals(other.langCode);
    }
    
    /**
     * Returns the hash code for this IInzLang instance.
     * The hash code is based on the langCode, which is used for equality checks in collections like HashMap.
     *
     * @return the hash code as an int.
     */
    @Override
	@JSExport
    public default int hashCode() {
        return langCode.hashCode();
    }

    /**
     * Returns a string representation of this IInzLang instance.
     * The string includes the langCode, englishName, nlsName, fallbackLangCode, iso639, and iso3166.
     * It does not include the translations properties themselves, as they can be numerous.
     *
     * @return a string representation of this IInzLang instance.
     */
    @Override
	@JSExport
    public default String toString() {
        return "IInzLang{" +
                "langCode='" + langCode + '\'' +
                ", englishName='" + englishName + '\'' +
                ", nlsName='" + nlsName + '\'' +
                ", iso639='" + iso639 + '\'' +
                ", iso3166='" + iso3166 + '\'' +
                '}';
    }

    /**
     * Load the attributes of this IInzLang instance from the given Properties object.
     * This method is typically used to initialize the IInzLang instance with translations loaded from a .properties file.
     * It sets the langCode, englishName, nlsName, and fallbackLangCode based on the properties provided.
     * @see #setLangCode(String)
     * @see #setEnglishName(String)
     * @see #setNlsName(String)
     * @see #setFallbackLangCode(String)
     * @throws IllegalArgumentException if the required properties are not present in the Properties object.
     * @param properties the Properties object containing the language attributes.
     */
	@JSExport
    public default void loadFromProperties(Properties properties) {
        if (properties == null) {
            throw new IllegalArgumentException("Properties cannot be null");
        }
        String langCode = properties.getProperty(LANG_CODE_PROP);
        if (langCode == null || langCode.isEmpty() || langCode.isBlank()) {
            throw new IllegalArgumentException("Language code (_IInzLangCode) is required");
        }
        setLangCode(langCode);
        
        String englishName = properties.getProperty(ENGLISH_NAME_PROP);
        if (englishName == null || englishName.isEmpty() || englishName.isBlank()) {
            throw new IllegalArgumentException("English name (_IInzEnglishName) is required");
        }
        setEnglishName(englishName);
        
        String nlsName = properties.getProperty(NLS_NAME_PROP);
        if (nlsName == null || nlsName.isEmpty() || nlsName.isBlank()) {
            throw new IllegalArgumentException("NLS name (_IInzNlsName) is required");
        }
        setNlsName(nlsName);
        
        Properties translations = new Properties();
        for (String key : properties.stringPropertyNames()) {
            translations.setProperty(key, properties.getProperty(key));
        }
        setTranslations(translations);
    }

    /**
     * Apply the IInzLang instance to the given Properties object.
     * This method is typically used to apply the translations to a Properties object for use in the application.
     * It does not modify the IInzLang instance itself, but rather applies its translations to the provided Properties object.
     *
     * @param properties the Properties object to which the translations will be applied.
     */
	@JSExport
    public default void applyToProperties(Properties properties) {
        if (translations != null) {
            for (String key : translations.stringPropertyNames()) {
                properties.setProperty(key, translations.getProperty(key));
            }
        }
        // Note: This method does not apply the fallbackLang translations, as it is assumed that
        // the caller will handle that if needed. The IInzLang instance itself remains unchanged.
    }

    /**
     * Initialize the translations member of this instance as a new Properties object.
     * This method is typically called when the translations are not yet loaded, and it prepares the instance
     * to hold translations that can be added later. The required properties _IInzLangCode, _IInzEnglishName,
     * _IInzNlsName, and optionally _IInzFallbackLangCode are set in the newly created translations Properties object,
     * which overwrites any existing translations.
     * 
     * Do NOT invoke this method if you already have translations in the instance, as it will remove them.
     *
     * @see #addTranslation(String, String)
     */
	@JSExport
    public default void initTranslations() {
        if (translations == null) {
            translations = new Properties();
        }
        translations.setProperty(LANG_CODE_PROP, langCode);
        translations.setProperty(ENGLISH_NAME_PROP, englishName);
        translations.setProperty(NLS_NAME_PROP, nlsName);
    }
}

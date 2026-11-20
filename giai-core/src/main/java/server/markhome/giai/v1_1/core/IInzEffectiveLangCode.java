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

/**
 *  IInzEffectiveLangCode callbacks implementing this interface are registered with IInz to allow different user presentation layers to wire a current-session-language type hook based on the APIs for the presentation layer, instead of making assumptions or imposing restrictions on how such callbacks are registered.
 *	<p>
 *	All methods of the interface are expected to be synchronized through the use of the IGiAIMt interfaces and their implementations.
 * 
 *  @see IInz
 */
public interface IInzEffectiveLangCode extends IGiAIAnyObj {

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
	public static IInzEffectiveLangCode getService() {
		IInzEffectiveLangCode ref = ((IInzEffectiveLangCode)(singleton.get()));
		if (ref == null) {
			ref = new Inz();
			singleton.set(null, ref);
			ref = ((IInzEffectiveLangCode)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	Get an instance that implements the service methods of the interface.
	 *
	 *	@return IInzEffectiveLangCode An instance of the interface.
	 *
	 *	@JSExport
	 *	public static IInzEffectiveLangCode InzEffectiveLangCode_getInstance();
	 */

	/**
	 *	Get an instance that implements the service methods of the interface.
	 *
	 *	@return IInzEffectiveLangCode An instance of the interface.
	 */
	@JSExport
	public IInzEffectiveLangCode getInstance();

    /**
     * Get the effective language code for NLS translation.
	 *
     * @return String The current effective language code.
     */
	@JSProperty
    public String getEffectiveLangCode();

    /**
     * Set the effective language code for NLS translation.
	 *
     * @param String expected The current effective language code.
     * @param String value The language code to apply.
	 *
     * @return String The new effective language code.
     */
	@JSProperty
    public String setEffectiveLangCode(String expected, String value);

    /**
     * Get the effective language name for NLS translation.
	 *
     * @return String The current effective language name.
     */
	@JSProperty
    public String getEffectiveLangName();

    /**
     * Set the effective language name for NLS translation.
	 *
     * @param String expected The current effective language name.
     * @param String value The language name to apply.
	 *
     * @return String The new effective language name.
     */
	@JSProperty
    public String setEffectiveLangName(String expected, String value);

    /**
     * Get the effective language description for NLS translation.
	 *
     * @return String The current effective language description.
     */
	@JSProperty
    public String getEffectiveLangDescription();

    /**
     * Set the effective language description for NLS translation.
	 *
     * @param String expected The current effective language description.
     * @param String value The language description to apply.
	 *
     * @return String The new effective language description.
     */
	@JSProperty
    public String setEffectiveLangDescription(String expected, String value);

    /**
     * Get the effective translated language code for NLS translation.
	 *
     * @return String The current effective translated language code.
     */
	@JSProperty
    public String getEffectiveXLangCode();

    /**
     * Set the effective translated language code for NLS translation.
	 *
     * @param String expected The current effective translated language code.
     * @param String value The language code to apply.
	 *
     * @return String The new effective translated language code.
     */
	@JSProperty
    public String setEffectiveXLangCode(String expected, String value);

    /**
     * Get the effective translated language name for NLS translation.
	 *
     * @return String The current effective translated language name.
     */
	@JSProperty
    public String getEffectiveXLangName();

    /**
     * Set the effective translated language name for NLS translation.
	 *
     * @param String expected The current effective translated language name.
     * @param String value The language name to apply.
	 *
     * @return String The new effective translated language name.
     */
	@JSProperty
    public String setEffectiveXLangName(String expected, String value);

    /**
     * Get the effective translated language description for NLS translation.
	 *
     * @return String The current effective translated language description.
     */
	@JSProperty
    public String getEffectiveXLangDescription();

    /**
     * Set the effective translated language description for NLS translation.
	 *
     * @param String expected The current effective translated language description.
     * @param String value The language description to apply.
	 *
     * @return String The new effective translated language description.
     */
	@JSProperty
    public String setEffectiveXLangDescription(String expected, String value);
}

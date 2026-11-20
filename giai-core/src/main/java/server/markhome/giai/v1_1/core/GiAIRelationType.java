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

import server.markhome.mgiai.v3_1.giailib.Inz;
import server.markhome.mgiai.v3_1.giailib.IGiAIXmlUtil;

/**
 * The IGiAIRelationType defines the common relationship types found in a generic business ERD model.
 * 
 * Note that Container-Component, Parent-Child, and Master-Detail are NOT identical relationships.
 * For example, there can only be one Container relationship from a Component to it's document Container,
 * but there can be multiple Parent-Child relationships which perform a similar function of implying cascading
 * deletion of Component/Child relationship data when the Container/Parent is deleted, but do not define the
 * container hierarchy used by XML and JSON structured document formats in the same way. The Container-Component
 * relationship defines the document hierarchy for XML and JSON structured document formats. The document hierarchy
 * name also defines the dot-name hierarchy, where applicable.
 * 
 * For the sake of simplicity and efficiency, the JSON data types use the same XML utilities as the XML document
 * formats, so the JSON data stream looks like it is comprised of XML data which has just had it's structural
 * details changed.
 * 
 * @see IGiAIXmlUtil
 * 
 * The Lookup relationship is special; it implies that the target does not allow deletion and has to be pre-loaded and cached by the client and middleware.
 * You can add new lookups, but you can't delete them. It also doesn't block deletion of the object which defines the relationship.
 * 
 * The Unknown relationship does not do cascading deletes, but nor does it block deletion of the object which defines the relationship.
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
@SuppressWarnings("unused")
public enum GiAIRelationType implements JSOBject {

	/**
	 *	GiAIRelationType getSingleton()
	 *		Get the singleton instance that provides the getInstance() and service method implementations.
	 *
	 *	@return The singleton instance that provides the getInstance() and service method implementations.
	 */
	@JSExport
	public GiAIRelationType getSingleton getInstance();

    Container("N", "Container", "giailib.GiAIRelationType.Container"),
    Component("P", "Component", "giailib.GiAIRelationType.Component"),
    Parent("P", "Parent", "giailib.GiAIRelationType.Parent"),
    Child("C", "Child", "giailib.GiAIRelationType.Child"),
    Master("M", "Master", "giailib.GiAIRelationType.Master"),
    Detail("D", "Detail", "giailib.GiAIRelationType.Detail"),
    Lookup("L", "Lookup", "giailib.GiAIRelationType.Lookup"),
    Unknown("U", "Unknown", "giailib.GiAIRelationType.Unknown");

    private final String key;
    private final String label;
    private final String inzLabelKey;

    private GiAIRelationType(String key, String label, String inzLabelKey) {
        this.key = key;
        this.label = label;
        this.inzLabelKey = inzLabelKey;
    }

    /**
     * Get the one-character key string for this enum value.
     * 
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * Get the character key for this enum value.
     * 
     * @return
     */
    public Character getChKey() {
        return key.charAt(0);
    }

    /**
     * Return the compiled-in label for this enum value.
     * 
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * Return the Inz key for the NLS label corresponding to this enum value.
     * 
     * @return
     */
    public String getInzLabelKey() {
        return inzLabelKey;
    }

    /**
     * Return the Inz.s() value for the Inz label key of this enum value. Might not be equal to the compiled-in English labels.
     * 
     * @see Inz.s
     * 
     * @return
     */
    public String s() {
        return Inz.s(inzLabelKey);
    }

    /**
     * Return the Inz.x() value for the Inz label key of this enum value. Never cache the result, as it changes depending on the user's runtime context.
     * 
     * @see Inz.x
     * 
     * @return
     */
    public String x() {
        return Inz.x(inzLabelKey);
    }
}

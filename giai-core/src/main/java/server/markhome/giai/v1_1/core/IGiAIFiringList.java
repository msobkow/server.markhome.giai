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

import server.markhome.giai.IGiAIFireOnInstanceOf;

/**
 *	Get a list of instance classes that should be fired upon when detected.  The list is evaluated in the order that entries were added, so be careful to add sub-class entries before their superclass entry.
 *
 *	@since 2016
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIFiringList extends IGiAIAnyObj {

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
	public static IGiAIFiringList getService() {
		IGiAIFiringList ref = ((IGiAIFiringList)(singleton.get()));
		if (ref == null) {
			ref = new GiAIFiringList();
			singleton.set(null, ref);
			ref = ((IGiAIFiringList)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIFiringList getInstance()
	 *		Get an instance that provides the getInstance() and service method implementations.
	 *
	 *	@return IGiAIFiringList An instance implementing the interface.
	 */
	@JSExport
	public static IGiAIFiringList GiAIFiringList_getInstance();

	/**
	 *	IGiAIFiringList getInstance()
	 *		Get an instance that provides the getInstance() and service method implementations.
	 *
	 *	@return IGiAIFiringList An instance implementing the interface.
	 */
	@JSExport
	public IGiAIFiringList getInstance();

	/**
	 *	fireOnInstanceOf(obj)
	 *		Fire the obj trigger when obj matches their pattern.  Needs to be overloaded by application implementations.
	 */
	@JSExport
	public static void GiAIFiringList_fireOnInstanceOf(IGiAIFiringList jthis, IGiAIAnyObj obj);

	/**
	 *	fireOnInstanceOf(obj)
	 *		Fire list of triggers when obj matches their pattern.  Needs to be overloaded by application implementations.
	 *
	 *	@param obj The object to check for a matching class and fire upon when a match occurs.
	 */
	@JSExport
	public void fireOnInstanceOf(IGiAIAnyObj obj);

	/**
	 *	Get the firing item registered for the specified class from this list, if any.
	 *
	 *	@param jthis Reference to the instance to be evaluated.
	 *	@param clazz The class to be scanned for.
	 *
	 *	@return IGiAIFireOnInstanceOf The firing instance registed for the class if any, null otherwise.
	 */
	@JSExport
	public static IGiAIFireOnInstanceOf GiAIFiringList_find(IGiAIFiringList jthis, Class<?> clazz);

	/**
	 *	Get the firing item registered for the specified class from this list, if any.
	 *
	 *	@param clazz The class to be scanned for.
	 *
	 *	@return IGiAIFireOnInstanceOf The firing instance registed for the class if any, null otherwise.
	 */
	@JSExport
	public IGiAIFireOnInstanceOf find(Class<?> clazz);

	/**
	 *	Add a firing item to be registered for the specified class to this list, if the class is not already present.
	 *
	 *	@param jthis Reference to the instance to be evaluated.
	 *	@param clazz The class to be scanned for.
	 *	@param value The firing item to trigger.
	 *
	 *	@return IGiAIFireOnInstanceOf The firing instance previously registed for the class if any, otherwise value.
	 */
	@JSExport
	public static IGiAIFireOnInstanceOf GiAIFiringList_add(IGiAIFiringList jthis, Class<?> clazz, IGiAIFireOnInstanceOf value);

	/**
	 *	Add a firing item to be registered for the specified class to this list, if the class is not already present.
	 *
	 *	@param clazz The class to be scanned for.
	 *	@param value The firing item to trigger.
	 *
	 *	@return IGiAIFireOnInstanceOf The firing instance previously registed for the class if any, otherwise value.
	 */
	@JSExport
	public IGiAIFireOnInstanceOf add(Class<?> clazz, IGiAIFireOnInstanceOf value);
}

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

/**
 *	IGiAIFireOnInstanceOf Fires when an instance of the class specified at construction is detected by the <tt>onInstanceOf(value)</tt> method.
 *
 *	@since 2016
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIFireOnInstanceOf extends IGiAIAnyObj {

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
	public static IGiAIFireOnInstanceOf getService() {
		IGiAIFireOnInstanceOf ref = ((IGiAIFireOnInstanceOf)(singleton.get()));
		if (ref == null) {
			ref = new GiAIFireOnInstanceOf();
			singleton.set(null, ref);
			ref = ((IGiAIFireOnInstanceOf)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIFireOnInstanceOf GiAIFireOnInstanceOf_getInstance()
	 *		Get an instance that provides the getInstance() and service method implementations.
	 *
	 *	@return IGiAIFireOnInstanceOf An instance for the implementation.
	 */
	@JSExport
	public static IGiAIFireOnInstanceOf GiAIFireOnInstanceOf_getInstance();

	/**
	 *	IGiAIFireOnInstanceOf getInstance()
	 *		Get an instance that provides the getInstance() and service method implementations.
	 *
	 *	@return IGiAIFireOnInstanceOf An instance for the implementation.
	 */
	@JSExport
	public IGiAIFireOnInstanceOf getInstance();

	/**
	 *	void GiAIFireOnInstanceOf_setInstanceOf(Class<?> value)
	 *		Set a class template for the kind of instances to detect for firing.
	 *
	 *	@param Class<?> value Fire when an instance of the class is detected.
	 */
	@JSExport
	public static void GiAIFireOnInstanceOf_setInstanceOf(IGiAIFireOnInstanceOf jthis, Class<?> value);

	/**
	 *	void setInstanceOf(Class<?> value)
	 *		Set a class template for the kind of instances to detect for firing.
	 *
	 *	@param Class<?> value Fire when an instance of the class is detected.
	 */
	@JSExport
	public void setInstanceOf(Class<?> value);

	/**
	 *	Class<?> GiAIFireOnInstanceOf_getInstanceOf()
	 *		Get the class template for the kind of instances to detect for firing.
	 *
	 *	@return Class<?> value Fire when an instance of the class is detected.
	 */
	@JSExport
	public static Class<?> GiAIFireOnInstanceOf_getInstanceOf(IGiAIFireOnInstanceOf jthis);

	/**
	 *	Class<?> getInstanceOf()
	 *		Get the class template for the kind of instances to detect for firing.
	 *
	 *	@return Class<?> value Fire when an instance of the class is detected.
	 */
	@JSExport
	public Class<?> getInstanceOf();

	/**
	 *	boolean GiAIFireOnInstanceOf_isInstanceOf()
	 *		Is the argument instance of the class associated with this firing entry?
	 *
	 *	@return True if the argument is an instance of the class associated with this firing entry, otherwise false.
	 */
	@JSExport
	public static boolean GiAIFireOnInstanceOf_isInstanceOf(IGiAIFireOnInstanceOf jthis, IGiAIAnyObj obj);

	/**
	 *	boolean isInstanceOf()
	 *		Is the argument instance of the class associated with this firing entry?
	 *
	 *	@return True if the argument is an instance of the class associated with this firing entry, otherwise false.
	 */
	@JSExport
	public boolean isInstanceOf(IGiAIAnyObj obj);

	/**
	 *	GiAIFireOnInstanceOf_onInstanceOf(jthis, obj)
	 *		This method is invoked if the argument obj is an instance of the correct class and not null.
	 */
	@JSExport
	public static void GiAIFireOnInstanceOf_onInstanceOf(IGiAIFireOnInstanceOf jthis, IGiAIAnyObj obj);

	/**
	 *	onInstanceOf(obj)
	 *		This method is invoked if the argument obj is an instance of the correct class and not null.
	 */
	@JSExport
	public void onInstanceOf(IGiAIAnyObj obj);

	/**
	 *	GiAIFireOnInstanceOf_fireOnInstanceOf(jthis, obj)
	 *		Invokes GiAIFireOnInstanceOf_onInstanceOf(jthis, obj) if obj is an instance of the correct class and not null.
	 */
	@JSExport
	public static void GiAIFireOnInstanceOf_onInstanceOf(IGiAIFireOnInstanceOf jthis, IGiAIAnyObj obj);

	/**
	 *	fireOnInstanceOf(obj)
	 *		Invokes GiAIFireOnInstanceOf_onInstanceOf(jthis, obj) if obj is an instance of the correct class and not null.
	 */
	@JSExport
	public void onInstanceOf(IGiAIAnyObj obj);
}

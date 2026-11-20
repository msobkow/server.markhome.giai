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
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAILibEntry extends IGiAIAnyObj {

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
	public static IGiAILibEntry getService() {
		IGiAILibEntry ref = ((IGiAILibEntry)(singleton.get()));
		if (ref == null) {
			ref = new GiAILibEntry();
			singleton.set(null, ref);
			ref = ((IGiAILibEntry)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	The public resource name for the parent library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<i>public static final String GiAI_LIB_PARENT_NAME = "server.markhome";</i>
	 */
	public static final String GiAI_LIB_PARENT_NAME = "server.markhome";

	/**
	 *	The parent resource name for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<i>public static final String GiAI_LIB_PARENT_VERSION = "3.1.42-20260918";</i>
	 */
	public static final String GiAI_LIB_PARENT_VERSION = "3.1.42-20260918";

	/**
	 *	The public resource name for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<i>public static final String GiAI_LIB_NAME = GiAI_LIB_PARENT_NAME + ".giai";</i>
	 */
	public static final String GiAI_LIB_NAME = GiAI_LIB_PARENT_NAME + ".giai";

	/**
	 *	The public version string for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<i>public static final String GiAI_LIB_VERSION = GiAI_LIB_PARENT_VERSION;</i>
	 */
	public static final String GiAI_LIB_VERSION = GiAI_LIB_PARENT_VERSION;

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	Implementations should define a public static final method with the following signature, using the uppercase package name before "Lib" as appropriate.
	 *
	 *	<i>public static boolean execIGiAILibEntryLibReset(boolean yesReally)</i>
	 *
	 *	@param	yesReally Are you sure you want to reset the value?
	 */
	@JSExport
	public static boolean libReset(boolean yesReally) {
		IGiAILibEntry sgl = singleton.get();
		boolean retval;
		if (sgl == null || yesReally) {
			retval = false;

			if (yesReally && sgl != null) {
				singleton.set(sgl, null);
			}

			sgl = getService();
			assert sgl != null: "Singleton must not be null after initialization";

			retval = true;
		}
		else {
			retval = false;
		}
		return (retval);
	}

	/**
	 *	Reset the singleton and any other data caches after an application reload or other package or executable reloading event.
	 *
	 *	Invokes libReset(false) under the hood.
	 *
	 *	@return True if the library was reinitialized, false if the code detected that the library has not been used since the last reinitialization.
	 */
	@JSExport
	public static boolean libReset() { return libReset(false); }

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	@param	yesReally Are you sure you want to reset the value?
	 *
	 *	@return	True if the singleton was reset, false if the singleton was set and yesReally was false.
	 */
	@JSExport
	public static boolean resetLib(boolean yesReally) { return libReset(yesReally); }

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	@return	True if the value was reset, false if the singleton was already initialized.
	 */
	@JSExport
	public static boolean resetLib() { return(libReset(false)); }

	/**
	 *	Get the parent's public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The parent's public resource name used for named resource resolution.
	 */
	@JSExport
	public static String getParentLibName() { return(GiAI_LIB_PARENT_NAME); }

	/**
	 *	Get name public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	@JSExport
	public static String getParentLibVersion() { return(GiAI_LIB_PARENT_VERSION); }

	/**
	 *	Get the public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	@JSExport
	public static String getLibName() { return(GiAI_LIB_NAME); }

	/**
	 *	Get the public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	@JSExport
	public static String getLibVersion() { return(GiAI_LIB_VERSION); }

	/**
	 *	The default main does nothing.
	 *
	 *	<i>public static void main(int argc, String[] argv) { return 0; }</i>
	 */
	@JSExport
	public static void main(int argc, String[] argv) { }

	/**
	 *	The default main does nothing.
	 *
	 *	<i>public static void main(String[] argv) { main(argv.length, argv); }</i>
	 */
	@JSExport
	public static void main(String[] argv) { main(argv.length, argv); }
}

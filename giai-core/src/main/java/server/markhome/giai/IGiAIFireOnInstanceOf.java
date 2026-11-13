/**
 *	server.markhome.giai-core - Guided Intelligence Architecture Implementation Core Services
 *
 *	Copyright 2026 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://apache.org
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	SPDX-License-Identifier: Apache-2.0
**/

package server.markhome.giai;

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
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance();

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

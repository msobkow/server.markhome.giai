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

import java.util.*;

/**
 * IGiAIRequired is the base interface used to specify the accessors used to manipulate not-null values.
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIRequired extends IGiAIAnyObj {

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
	public static IGiAIRequired getService() {
		IGiAIRequired ref = ((IGiAIRequired)(singleton.get()));
		if (ref == null) {
			ref = new GiAIRequired();
			singleton.set(null, ref);
			ref = ((IGiAIRequired)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIRequired getInstance()
	 *		Get an instance that provides the service method implementations.
	 *
	 *	@return An instance that provides the service method implementations.
	 */
	@JSExport
	public IGiAIRequired getInstance();

	/**
	 *	Is this value null?
	 *	@return true if the value is null, otherwise false
	 */
	public default boolean isNull() { return false; }

	/**
	 *	Make this value null.
	 */
	public default void setNull() {
		throw new IGiAINullArgumentException(getClass(), "setNull", 0, "value");
	};
}

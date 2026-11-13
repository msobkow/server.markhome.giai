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
 * IGiAIReqKeyHash256 extends IGiAIKeyHash256 with the appropriate behavior for the isNull() and setNull() method signatures.
 *
 *	@since 2026
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIReqKeyHash256 extends IGiAIKeyHash256 {

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
	public static IGiAIReqKeyHash256 getService() {
		IGiAIReqKeyHash256 ref = ((IGiAIReqKeyHash256)(singleton.get()));
		if (ref == null) {
			ref = new GiAIReqKeyHash256();
			singleton.set(null, ref);
			ref = ((IGiAIReqKeyHash256)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	IGiAIReqKeyHash256 getInstance()
	 *		Get an instance that provides the service method implementations.
	 *
	 *	@return An instance that provides the service method implementations.
	 */
	@JSExport
	public IGiAIReqKeyHash256 getInstance();

	/**
	 *	Is this value null?
	 *
	 *	@throws IGiAIInvalidStateException if the superinterface implementation of isNull() returns true.
	 */
	@Override
	public boolean isNull() {
		if (super.isNull()) {
			throw new IGiAIInvalidStateException(getClass(), "isNull", 0, "super.isNull()", "superinterface value is not allowed to be null", null);
		}
		return(false);
	}

	/**
	 *	Make this value null.
	 *
	 *	@throws IGiAINullArgumentException
	 */
	@Override
	public void setNull() {
		throw new IGiAINullArgumentException(getClass(), "setNull", 0, "required-attribute");
	}
}

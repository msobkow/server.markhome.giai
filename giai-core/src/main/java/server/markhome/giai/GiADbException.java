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

import server.markhome.giai.Inz;

/**
 * GiAIDbException is thrown when a JPA database persistent store exception is thrown and caught/mapped.
 */
public class GiAIDbException extends GiAIRuntimeException {

	protected Object indexKey = null;

	public GiAIDbException(
		String enMsg,
		String xMsg)
	{
		super(enMsg, xMsg);
	}

	public GiAIDbException(
		String enMsg,
		String xMsg,
		Object indexKey)
	{
		super(enMsg, xMsg);
		this.indexKey = indexKey;
	}

	public GiAIDbException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public GiAIDbException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Object indexKey)
	{
		super(throwingClass, methName, enMsg, xMsg);
		this.indexKey = indexKey;
	}

	public GiAIDbException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	public GiAIDbException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Object indexKey,
		Throwable th)
	{
		super(throwingClass, methName, enMsg, xMsg, th);
		this.indexKey = indexKey;
	}

	public GiAIDbException(
		Class<?> throwingClass,
		String methName,
		Throwable th)
	{
		super(	String.format(Inz.s("giailib.GiAIDbException.sqlexcept"),
					(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					th.getMessage()),
				String.format(Inz.x("giailib.GiAIDbException.sqlexcept"),
					(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
					th.getMessage()),
				th);
	}

	public GiAIDbException(
		Class<?> throwingClass,
		String methName,
		Object indexKey)
	{
		super(((indexKey != null)
					? String.format(Inz.s("giailib.GiAIDbException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
						indexKey.toString())
					: String.format(Inz.s("giailib.GiAIDbException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")))),
				((indexKey != null)
					? String.format(Inz.x("giailib.GiAIDbException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
						indexKey.toString())
					: String.format(Inz.s("giailib.GiAIDbException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")))));
		this.indexKey = indexKey;
	}

	public GiAIDbException(
		Class<?> throwingClass,
		String methName,
		Object indexKey,
		Throwable th)
	{
		super(((indexKey != null)
					? String.format(Inz.s("giailib.GiAIDbException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
						indexKey.toString())
					: String.format(Inz.s("giailib.GiAIDbException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")))),
				((indexKey != null)
					? String.format(Inz.x("giailib.GiAIDbException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")),
						indexKey.toString())
					: String.format(Inz.s("giailib.GiAIDbException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty())? ("." + methName + "()") : "")))),
			th);
		this.indexKey = indexKey;
	}

	public Object getIndexKey() {
		return(indexKey);
	}
}

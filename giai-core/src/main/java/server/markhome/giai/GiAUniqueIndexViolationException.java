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

import server.markhome.giai.Inz;

/**
 * GiAIUniqueIndexViolationException is thrown when there is a violation of a unique index other than the primary key index for an underlying table.
 */
public class GiAIUniqueIndexViolationException extends IllegalStateException {

	protected String localMessage = null;
	protected Object indexKey = null;

	public GiAIUniqueIndexViolationException(
		String enMsg,
		String xMsg)
	{
		super(enMsg);
		this.localMessage = xMsg;
	}

	public GiAIUniqueIndexViolationException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.FldMsg"),
				enFieldName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldMsg"),
				(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.FldMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.FldMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIUniqueIndexViolationException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIUniqueIndexViolationException()
	{
		super(String.format(Inz.s("giailib.GiAIUniqueIndexViolation.default"), "").trim());
		this.localMessage = String.format(Inz.x("giailib.GiAIUniqueIndexViolation.default"), "").trim();
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAIUniqueIndexViolation.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim());
		this.localMessage = String.format(Inz.x("giailib.GiAIUniqueIndexViolation.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim();
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIUniqueIndexViolation.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim(),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIUniqueIndexViolation.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim();
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enArgIndexName,
		String xArgIndexName,
		Object argKey)
	{
		super((argKey != null) ? String.format(Inz.s("giailib.GiAIUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					enArgIndexName,
					argKey.toString())
				: String.format(Inz.s("giailib.GiAIUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					enArgIndexName));
		this.localMessage = (argKey != null) ? String.format(Inz.x("giailib.GiAIUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName,
					argKey.toString())
				: String.format(Inz.x("giailib.GiAIUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName);
		this.indexKey = argKey;
	}

	public GiAIUniqueIndexViolationException(
		Class<?> throwingClass,
		String methName,
		String enArgIndexName,
		String xArgIndexName,
		Object argKey,
		Throwable th)
	{
		super((argKey != null) ? String.format(Inz.s("giailib.GiAIUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					enArgIndexName,
					argKey.toString())
				: String.format(Inz.s("giailib.GiAIUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					enArgIndexName));
		this.localMessage = (argKey != null) ? String.format(Inz.x("giailib.GiAIUniqueIndexViolation.indexkey"),//%1$s Detected violation of unique index %2$s for key %3$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName,
					argKey.toString())
				: String.format(Inz.x("giailib.GiAIUniqueIndexViolation.index"),//%1$s Detected violation of unique index %2$s
					throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
					(xArgIndexName != null && !xArgIndexName.isEmpty()) ? xArgIndexName : enArgIndexName);
		this.indexKey = argKey;
	}

	public Object getIndexKey() {
		return(indexKey);
	}

	@Override
	public String getLocalizedMessage() {
		if (localMessage != null) {
			return localMessage;
		}
		else {
			return getMessage();
		}
	}
}

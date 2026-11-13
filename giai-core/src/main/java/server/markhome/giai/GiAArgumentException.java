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
 * GiAIArgumentException provides the base implementation for a number of argument exceptions, including GiAIArgumentOverflowException,
 * GiAIArgumentRangeExxception, GiAIArgumentUnderflowException, GiAIEmptyArgumentExeption, GiAIInvalidArgumentException, and GiAINullArgumentException.
 * 
 * There is a rich set of constructors for the class, with variations that accept the class object for the caller and a method name, and versions that accept nationalized field names and method names.
 */
public class GiAIArgumentException extends IllegalArgumentException {

	protected String localMessage = null;

	public GiAIArgumentException(
		String enMsg,
		String xMsg)
	{
		super(enMsg);
		this.localMessage = xMsg;
	}

	public GiAIArgumentException(
		String enMsg, String xMsg, Throwable cause) {
			super(enMsg, cause);
			this.localMessage = xMsg;
	}

	public GiAIArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "")),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIArgumentException(
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

	public GiAIArgumentException(
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
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIArgumentException(
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
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentException.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIArgumentException(
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
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
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

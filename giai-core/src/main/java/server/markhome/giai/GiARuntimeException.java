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
 * The base exception for many others in the GiAI exception hierarchy, GiAIRuntimeException specializes RuntimException with localization hooks and support
 */
public class GiAIRuntimeException extends RuntimeException {

	protected String localMessage = null;

	public GiAIRuntimeException(
		String enMsg,
		String xMsg)
	{
		super(enMsg);
		this.localMessage = xMsg;
	}

	public GiAIRuntimeException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public GiAIRuntimeException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIRuntimeException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIRuntimeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIRuntimeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIRuntimeException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.FldMsg"),
				enFieldName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.FldMsg"),
				(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIRuntimeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIRuntimeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIRuntimeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIRuntimeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIRuntimeException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIRuntimeException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
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

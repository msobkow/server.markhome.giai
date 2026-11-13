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
 * GiAIPermissionDeniedException is thrown when data cannot be found that should exist
 */
public class GiAIPermissionDeniedException extends SecurityException {

	protected String localMessage = null;
	protected Object indexKey = null;

	public GiAIPermissionDeniedException(
		String enMsg,
		String xMsg)
	{
		super(enMsg);
		this.localMessage = xMsg;
	}

	public GiAIPermissionDeniedException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIPermissionDeniedException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.FldMsg"),
				enFieldName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.FldMsg"),
				(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	}

	public GiAIPermissionDeniedException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.FldMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIPermissionDeniedException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.FldMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIPermissionDeniedException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIPermissionDeniedException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDeniedException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDeniedException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName,
				(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public GiAIPermissionDeniedException()
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDenied.default"), "").trim());
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDenied.default"), "").trim();
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDenied.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim());
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDenied.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim();
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDenied.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim(),
				th);
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDenied.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")).trim();
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName,
		String permGroupName,
		String schemaName,
		String tableName,
		String userId)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDenied.full"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
			permGroupName,
			schemaName,
			tableName,
			userId));
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDenied.full"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
			permGroupName,
			schemaName,
			tableName,
			userId);
	}

	public GiAIPermissionDeniedException(
		Class<?> throwingClass,
		String methName,
		String permGroupName,
		String schemaName,
		String tableName,
		String userId,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIPermissionDenied.full"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
			permGroupName,
			schemaName,
			tableName,
			userId),
		th);
		this.localMessage = String.format(Inz.x("giailib.GiAIPermissionDenied.full"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
			permGroupName,
			schemaName,
			tableName,
			userId);
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

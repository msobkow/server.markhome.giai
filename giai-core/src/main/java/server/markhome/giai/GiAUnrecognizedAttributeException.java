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
 * GiAIUnrecognizedAttributeException is primarily thrown by the manufacted XML parsers.
 */
public class GiAIUnrecognizedAttributeException extends NoSuchElementException {

	protected String localMessage = null;
	protected String locInfo = null;
	protected String attrName = null;

	public GiAIUnrecognizedAttributeException(
		String enMsg,
		String xMsg)
	{
		super(enMsg);
		this.localMessage = xMsg;
	}

	public GiAIUnrecognizedAttributeException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	// public GiAIUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg)
	// {
	// 	super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
	// 			(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
	// 	this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
	// 			(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	// public GiAIUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th)
	// {
	// 	super(String.format(Inz.s("giailib.GiAIArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
	// 			(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
	// 			th);
	// 	this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
	// 			(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	public GiAIUnrecognizedAttributeException(
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

	public GiAIUnrecognizedAttributeException(
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

	// public GiAIUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg)
	// {
	// 	super(String.format(Inz.s("giailib.GiAIArgumentException.FldMsg"),
	// 			enFieldName,
	// 			(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: "")));
	// 	this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldMsg"),
	// 			(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
	// 			(((enMsg != null) && (enMsg.length() > 0)) ? enMsg	: ""));
	// }

	// public GiAIUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg)
	// {
	// 	super(String.format(Inz.s("giailib.GiAIArgumentException.FldMsg"),
	// 			enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
	// 			(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")));
	// 	this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
	// 			(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	// public GiAIUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th)
	// {
	// 	super(String.format(Inz.s("giailib.GiAIArgumentException.FldMsg"),
	// 			enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
	// 			(((enMsg != null) && (enMsg.length() > 0)) ? enMsg : "")),
	// 			th);
	// 	this.localMessage = String.format(Inz.x("giailib.GiAIArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
	// 			(((xMsg != null) && (xMsg.length() > 0)) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	public GiAIUnrecognizedAttributeException(
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

	public GiAIUnrecognizedAttributeException(
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

	public GiAIUnrecognizedAttributeException()
	{
		super(String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.default"),
				"").trim());
		this.localMessage = String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.default"),
				"").trim();
	}

	public GiAIUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.default"),
				throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""));
	}

	public GiAIUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName)
	{
		super((locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo,
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.default"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo,
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.default"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public GiAIUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName,
		Throwable th)
	{
		super((locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo,
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.default"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo,
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.loc"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.attr"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.default"),
							throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}



	public GiAIUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.default"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
		this.localMessage = String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""));
	}

	public GiAIUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName)
	{
		super((locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.locattr"),
							(enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
							locInfo,
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.loc"),
							(enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.attr"),
							(enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.default"),
							(enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.locattr"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
							locInfo,
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.loc"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public GiAIUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName,
		Throwable th)
	{
		super((locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.locattr"),
							enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo,
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.loc"),
							enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.attr"),
							enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							attrName)
					: String.format(Inz.s("giailib.GiAIUnrecognizedAttributeException.default"),
							enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.locattr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo,
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.loc"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
							attrName)
					: String.format(Inz.x("giailib.GiAIUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}


	public String getLocInfo() {
		return locInfo;
	}

	public String getAttrName() {
		return attrName;
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

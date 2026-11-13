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
 * GiAIEmptyArgumentException is thrown when an argument is null or empty.
 */
public class GiAIInvalidStateException extends GiAIArgumentException {

	// Inherited constructor patterns

	public GiAIInvalidStateException(
		String enMsg,
		String xMsg)
	{
		super(enMsg, xMsg);
	}

	public GiAIInvalidStateException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, xMsg, th);
	}

//	public GiAIInvalidStateException(
//		Class<?> throwingClass,
//		String methName,
//		String enMsg,
//		String xMsg)
//	{
//		super(throwingClass, methName, enMsg, xMsg);
//	}

//	public GiAIInvalidStateException(
//		Class<?> throwingClass,
//		String methName,
//		String enMsg,
//		String xMsg,
//		Throwable th)
//	{
//		super(throwingClass, methName, enMsg, xMsg, th);
//	}

	public GiAIInvalidStateException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg)
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	}

	public GiAIInvalidStateException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg,
	 	Throwable th)
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg, th);
	}

	public GiAIInvalidStateException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg)
	{
		super(enFieldName, xFieldName, enMsg, xMsg);
	}

//	public GiAIInvalidStateException(
//		String enFieldName,
//		String xFieldName,
//		String methName,
//		String enMsg,
//		String xMsg)
//	{
//		super(enFieldName, xFieldName, methName, enMsg, xMsg);
//	}

//	public GiAIInvalidStateException(
//		String enFieldName,
//		String xFieldName,
//		String methName,
//		String enMsg,
//		String xMsg,
//		Throwable th)
//	{
//		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
//	}

	public GiAIInvalidStateException(
	 	String enFieldName,
		String xFieldName,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
		String xMsg)
	{
	 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg);
	}

	public GiAIInvalidStateException(
	 	String enFieldName,
		String xFieldName,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg,
	 	Throwable th)
	{
	 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg, th);
	}

	// Custom/most-often-used constructors

	public GiAIInvalidStateException(
		Class<?> throwingClass,
		String methName,
		String enReason,
		String xReason)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				enReason),
			String.format(Inz.x("giailib.GiAIInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				xReason));
	}

	public GiAIInvalidStateException(
		Class<?> throwingClass,
		String methName,
		String enReason,
		String xReason,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				enReason),
		String.format(Inz.x("giailib.GiAIInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				xReason),
			th);
	}

	public GiAIInvalidStateException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enReason,
		String xReason)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidStateException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				enReason),
		String.format(Inz.x("giailib.GiAIInvalidStateException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				xReason));
	}

	public GiAIInvalidStateException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enReason,
		String xReason,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidStateException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				enReason),
		String.format(Inz.x("giailib.GiAIInvalidStateException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				xReason),
				th);
	}
}

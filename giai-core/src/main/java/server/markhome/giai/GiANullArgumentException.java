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
 * GiAINullArgumentException is thrown when a required argument is null.
 */
public class GiAINullArgumentException extends GiAIArgumentException {

	// Inherited constructor patterns

	public GiAINullArgumentException(
		String enMsg,
		String xMsg)
	{
		super(enMsg, xMsg);
	}

	public GiAINullArgumentException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(enMsg, xMsg, th);
	}

	public GiAINullArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public GiAINullArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	public GiAINullArgumentException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg)
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	}

	public GiAINullArgumentException(
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

	// public GiAINullArgumentException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg)
	// {
	// 	super(enFieldName, xFieldName, enMsg, xMsg);
	// }

	public GiAINullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg);
	}

	public GiAINullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
	}

	public GiAINullArgumentException(
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

	public GiAINullArgumentException(
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

	public GiAINullArgumentException(
		Class<?> throwingClass,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			String.format(Inz.x("giailib.GiAINullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
	}

	public GiAINullArgumentException(
		Class<?> throwingClass,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			String.format(Inz.x("giailib.GiAINullArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			th);
	}

	public GiAINullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAINullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName));
	}

	public GiAINullArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAINullArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			th);
	}

	public GiAINullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			String.format(Inz.x("giailib.GiAINullArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
	}

	public GiAINullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.FldMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			String.format(Inz.x("giailib.GiAINullArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			th);
	}

	public GiAINullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAINullArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName));
	}

	public GiAINullArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAINullArgumentException.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAINullArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			th);
	}
}

/*
 *	server.markhome.giai - Guided Intelligence Architecture Implementation v1.1 Core Services
 *	
 *	Copyright (c) 2016-2027 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *	
 *	The core foundation library CFLib is Licensed under the GNU Library General Public License, Version 3.0 or later; all other modules are Licensed under
 *	the GNU General Public License, Version 3.0 or later, or under a Commercial License purchased from Mark Stephen Sobkow by contacting him at mark.sobkow@gmail.com
 *	and negotiating terms to cover your legal requirements for your product and tool development plans, arrange payment using Canadian legal currency transfer
 *	facilities, and receive your customized Commercial License granting permission to extend and enhance the GNU GPL 3.0 or later licensed code base.
 *	
 *	In the event that you purchase a Commercial Development License, your License will be terminated if your organization distributes the application source
 *	code externally, allows external users to access the resulting applications, or the organization is rebranded, merged, or restructured, or if you violate
 *	International or Canadian Legal Restrictions on Software Development and Deployment.
 *	
 *	In the event that you purchase a Commercial Distribution License, your License will be terminated if your oganization is rebranded, merged, or restructured.
 *	
 *	In the event that you purchase a Transferrable Commercial License, your License is only terminated if your organization develops or produces illegal software
 *	tools and technologies according to International Treaty Law, or Laws of the Country of Canada, in accordance with the legal restrictions on Canadian Application
 *	Source Code Development, Deployment, and Distribution.
 *	
 *	Any one of these Licenses comprises your organization's "License". You may not use these files nor derive variations of them except in compliance with the
 *	License or Commercial License applicable to the source code files in question.
 *	
 *	Samples of the Commercial License permission grants are available at the following URL.  You should also have received samples of the commercial licenses with
 *	this module of application code or configuration and driver data.
 *	
 *		https://msobkow.github.io/mark-stephen-sobkows-licenses/
 *		file:sample-giai-v1_1-ethical-development-license.txt
 *		file:sample-giai-v1_1-ethical-deployment-license.txt
 *		file:sample-giai-v1_1-ethical-distribution-license.txt
 *		file:sample-giai-v1_1-transferrable-ethical-license.txt
 *	
 *	but do not actually grant any permissions to your organization as they have not yet been negotiated for, paid for, or delivered to your organization; they are
 *	only examples of what permissions the Commercial Licenses grant.
 *	
 *	You may obtain a copy of the Open Source Licenses supported at:
 *	
 *	    http://gnu.org/
 *	
 *	Unless required by applicable law or agreed to in writing, software distributed under the Licenses is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *	either express or implied, unless required by International Law and Treaty Agreements with Canada as a Signatory as interpreted by the International Criminal Court, the Canadian
 *	Constition, the Canadian Charter of Rights, or Canadian Federal Law as interpreted by our Supreme Court of Canada.  See the Licenses for the specific language governing permissions
 *	and limitations under the Licenses.
 *	
 *	If you wish to modify and use this code without publishing your changes, or integrate it with proprietary code, please contact Mark Stephen
 *	Sobkow for a commercial license at mark.sobkow@gmail.com.
 *	
 *	SPDX-License-Identifier: LGPL-3.0-or-later
 *	SPDX-License-Identifier: GPL-3.0-or-later
 */

package server.markhome.giai.v1_1.core;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import java.util.*;

import java.math.*;

/**
 * GiAIArgumentOverflowException indicates that an argument exceeds the permitted value range.
 */
public class GiAIArgumentOverflowException extends GiAIArgumentException {

	public GiAIArgumentOverflowException getInstance(
		String enMsg,
		String xMsg)
	{
		super(enMsg, xMsg);
	}

	public GiAIArgumentOverflowException getInstance(
		String enMsg, String xMsg, Throwable cause) {
			super(enMsg, xMsg, cause);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	// public GiAIArgumentOverflowException getInstance(
	//  	Class<?> throwingClass,
	//  	String methName,
	//  	int argNo,
	//  	String argName,
	//  	String enMsg,
	//  	String xMsg)
	// {
	//  	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	// }

	// public GiAIArgumentOverflowException getInstance(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th)
	// {
	// 	super(throwingClass, methName, argNo, argName, enMsg, xMsg, th);
	// }

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg)
	{
		super(enFieldName, xFieldName, enMsg, xMsg);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
	}

	// public GiAIArgumentOverflowException getInstance(
	// 	String enFieldName,
	//  	String xFieldName,
	//  	String methName,
	//  	int argNo,
	//  	String argName,
	//  	String enMsg,
	//  	String xMsg)
	// {
	//  	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg);
	// }

	// public GiAIArgumentOverflowException getInstance(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th)
	// {
	// 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg, th);
	// }


	
	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public GiAIArgumentOverflowException getInstance(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public GiAIArgumentOverflowException getInstance(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()"	: ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("giailib.GiAIArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}
}

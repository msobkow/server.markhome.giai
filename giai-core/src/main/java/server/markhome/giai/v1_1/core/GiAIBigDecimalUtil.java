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

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;

public class GiAIBigDecimalUtil {

	public final static int MAX_DIGITS = 31;
	public final static int MAX_PRECISION = 30;
	
	final static String S_Hashes = "###############################";
	final static String S_Zeroes = "0000000000000000000000000000000";
	final static String S_Nines =  "9999999999999999999999999999999";

	public static Format getNumberFormat(String enFieldName, String xFieldName, int argDigits, int argPrecis) {
		final String S_ProcName = "getNumberFormat";

		if((enFieldName == null) || (enFieldName.length() <= 0)) {
			throw new GiAINullArgumentException(GiAIBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName");
		}

		if(argDigits < 1) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1);
		}
		else if(argDigits > MAX_DIGITS) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS);
		}

		if(argPrecis < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0);
		}
		else if(argPrecis > MAX_PRECISION) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION);
		}

		if(argPrecis >= argDigits) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1);
		}

		int integerDigits = argDigits - argPrecis;
		
		String usePrefixHash = S_Hashes.substring(0, integerDigits - 1);
		
		String useSuffix;
		if(argPrecis > 0) {
			useSuffix = "." + S_Zeroes.substring(0, argPrecis);
		}
		else {
			useSuffix = "";
		}
		
		Format numberFormat = new DecimalFormat(
			usePrefixHash + "0" + useSuffix + ";-" + usePrefixHash + "0" + useSuffix);
		
		return(numberFormat);
	}

	public static Format getNumberFormat(Class<?> clazz, int argDigits, int argPrecis) {
		final String S_ProcName = "getNumberFormat";

		if((clazz == null)) {
			throw new GiAINullArgumentException(GiAIBigDecimalUtil.class,
				S_ProcName,
				1,
				"clazz");
		}

		if(argDigits < 1) {
			throw new GiAIArgumentUnderflowException(clazz,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1);
		}
		else if(argDigits > MAX_DIGITS) {
			throw new GiAIArgumentOverflowException(clazz,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS);
		}

		if(argPrecis < 0) {
			throw new GiAIArgumentUnderflowException(clazz,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0);
		}
		else if(argPrecis > MAX_PRECISION) {
			throw new GiAIArgumentOverflowException(clazz,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION);
		}

		if(argPrecis >= argDigits) {
			throw new GiAIArgumentOverflowException(clazz,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1);
		}

		int integerDigits = argDigits - argPrecis;
		
		String usePrefixHash = S_Hashes.substring(0, integerDigits - 1);
		
		String useSuffix;
		if(argPrecis > 0) {
			useSuffix = "." + S_Zeroes.substring(0, argPrecis);
		}
		else {
			useSuffix = "";
		}
		
		Format numberFormat = new DecimalFormat(
			usePrefixHash + "0" + useSuffix + ";-" + usePrefixHash + "0" + useSuffix);
		
		return(numberFormat);
	}

	public static BigDecimal getAbsoluteMinValue(String enFieldName, String xFieldName, int argDigits, int argPrecis) {
		final String S_ProcName = "getAbsoluteMinValue";

		if((enFieldName == null) || (enFieldName.length() <= 0)) {
			throw new GiAINullArgumentException(GiAIBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName");
		}

		if(argDigits < 1) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1);
		}
		else if(argDigits > MAX_DIGITS) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS);
		}

		if(argPrecis < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0);
		}
		else if(argPrecis > MAX_PRECISION) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION);
		}

		if(argPrecis >= argDigits) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1);
		}

		int integerDigits = argDigits - argPrecis;

		String strval;
		if(argPrecis == 0) {
			strval = "-" + S_Nines.substring(0, integerDigits);
		}
		else {
			strval = "-" + S_Nines.substring(0, integerDigits) + "." + S_Nines.substring(0, argPrecis);
		}
		
		BigDecimal absoluteMinValue = new BigDecimal(strval);
		
		return(absoluteMinValue);
	}

	public static BigDecimal getAbsoluteMaxValue(String enFieldName, String xFieldName, int argDigits, int argPrecis) {
		final String S_ProcName = "getAbsoluteMaxValue";

		if((enFieldName == null) || (enFieldName.length() <= 0)) {
			throw new GiAINullArgumentException(GiAIBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName");
		}

		if(argDigits < 1) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1);
		}
		else if(argDigits > MAX_DIGITS) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS);
		}

		if(argPrecis < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0);
		}
		else if(argPrecis > MAX_PRECISION) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION);
		}

		if(argPrecis >= argDigits) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1);
		}

		int integerDigits = argDigits - argPrecis;

		String strval;
		if(argPrecis == 0) {
			strval = S_Nines.substring(0, integerDigits);
		}
		else {
			strval = S_Nines.substring(0, integerDigits) + "." + S_Nines.substring(0, argPrecis);
		}
		
		BigDecimal absoluteMaxValue = new BigDecimal(strval);
		
		return(absoluteMaxValue);
	}

	public static BigDecimal coerce(String enFieldName, String xFieldName, int argDigits, int argPrecis, BigDecimal value) {
		final String S_ProcName = "coerce";

		if((enFieldName == null) || (enFieldName.length() <= 0)) {
			throw new GiAINullArgumentException(GiAIBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName");
		}

		if(value == null) {
			throw new GiAINullArgumentException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value");
		}
		
		if(argDigits < 1) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1);
		}
		else if(argDigits > MAX_DIGITS) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS);
		}

		if(argPrecis < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0);
		}
		else if(argPrecis > MAX_PRECISION) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION);
		}

		if(argPrecis >= argDigits) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1);
		}

		BigDecimal minValue = getAbsoluteMinValue(enFieldName, xFieldName, argDigits, argPrecis);
		if(value.compareTo(minValue) < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				minValue);
		}
		
		BigDecimal maxValue = getAbsoluteMaxValue(enFieldName, xFieldName, argDigits, argPrecis);
		if(value.compareTo(maxValue) > 0) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				maxValue);
		}

		String coercedString = getNumberFormat(enFieldName, xFieldName, argDigits, argPrecis).format(value);
		
		BigDecimal coercedValue = new BigDecimal(coercedString);
		
		return(coercedValue);
	}

	public static BigDecimal parse(String enFieldName, String xFieldName, int argDigits, int argPrecis, String value) {
		final String S_ProcName = "parse";

		if((enFieldName == null) || (enFieldName.length() <= 0)) {
			throw new GiAINullArgumentException(GiAIBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName");
		}

		if((value == null) || (value.length() <= 0)) {
			return(null);
		}
		
		if(argDigits < 1) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1);
		}
		else if(argDigits > MAX_DIGITS) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS);
		}

		if(argPrecis < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0);
		}
		else if(argPrecis > MAX_PRECISION) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION);
		}

		if(argPrecis >= argDigits) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1);
		}
		
		BigDecimal rawValue = new BigDecimal(value);
		BigDecimal minValue = getAbsoluteMinValue(enFieldName, xFieldName, argDigits, argPrecis);
		BigDecimal maxValue = getAbsoluteMaxValue(enFieldName, xFieldName, argDigits, argPrecis);

		if(rawValue.compareTo(minValue) < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				rawValue,
				minValue);
		}
		
		if(rawValue.compareTo(maxValue) > 0) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				rawValue,
				maxValue);
		}

		String coercedString = getNumberFormat(enFieldName, xFieldName, argDigits, argPrecis).format(rawValue);
		
		BigDecimal coercedValue = new BigDecimal(coercedString);
		
		return(coercedValue);
	}

	public static String format(String enFieldName, String xFieldName, int argDigits, int argPrecis, BigDecimal value) {
		final String S_ProcName = "format";

		if((enFieldName == null) || (enFieldName.length() <= 0)) {
			throw new GiAINullArgumentException(GiAIBigDecimalUtil.class,
				S_ProcName,
				1,
				"enFieldName");
		}

		if(value == null) {
			throw new GiAINullArgumentException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value");
		}
		
		if(argDigits < 1) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				1);
		}
		else if(argDigits > MAX_DIGITS) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				3,
				"argDigits",
				argDigits,
				MAX_DIGITS);
		}

		if(argPrecis < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				0);
		}
		else if(argPrecis > MAX_PRECISION) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				MAX_PRECISION);
		}

		if(argPrecis >= argDigits) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				4,
				"argPrecis",
				argPrecis,
				argDigits - 1);
		}

		BigDecimal minValue = getAbsoluteMinValue(enFieldName, xFieldName, argDigits, argPrecis);
		if(value.compareTo(minValue) < 0) {
			throw new GiAIArgumentUnderflowException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				minValue);
		}
		
		BigDecimal maxValue = getAbsoluteMaxValue(enFieldName, xFieldName, argDigits, argPrecis);
		if(value.compareTo(maxValue) > 0) {
			throw new GiAIArgumentOverflowException(enFieldName,
				xFieldName,
				S_ProcName,
				5,
				"value",
				value,
				maxValue);
		}

		String coercedString = getNumberFormat(enFieldName, xFieldName, argDigits, argPrecis).format(value);
		
		return(coercedString);
	}
}

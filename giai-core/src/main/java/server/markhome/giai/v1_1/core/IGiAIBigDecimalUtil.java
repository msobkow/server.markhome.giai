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

/**
 *	IGiAIBigDecimalUtil defines the service methods which are used to instantiate, parse, clone, and prepare a BigDecimal value for marshalling/unmarshalling as a byte array.
 *
 *	@since 2016
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIBigDecimalUtil extends IGiAIAnyObj {

	/**
	 *	The service singleton has to be thread-safe.
	 */
	@JSProperty
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance(null);

	/**
	 *	Get the service singleton.
	 *
	 *	@return The service singleton.
	 */
	@JSExport
	public static IGiAIBigDecimalUtil getService() {
		IGiAIBigDecimalUtil ref = ((IGiAIBigDecimalUtil)(singleton.get()));
		if (ref == null) {
			ref = new GiAIBigDecimalUtil();
			singleton.set(null, ref);
			ref = ((IGiAIBigDecimalUtil)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	The maximum number of digits supported is 31, in keeping with database NUMBER limitations from the majority of vendors.
	 */
	public final static int MAX_DIGITS = 31;

	/**
	 *	There must be at least a one's digit, so only 30 digits precision can be specified.
	 */
	public final static int MAX_PRECISION = 30;
	
	final static String S_Hashes = "###############################";
	final static String S_Zeroes = "0000000000000000000000000000000";
	final static String S_Nines =  "9999999999999999999999999999999";

	/**
	 *	Get a Format object for a number with the specified field name, translated field name, number of digits, and precision.
	 *
	 *	@param String enFieldName The English field name
	 *	@param String xFieldName The translated field name
	 *	@param int argDigits The maximum number of digits to display
	 *	@param int argPrecis The number of digits to show after the decimal point, or if negative, as zeroes before the decimal point.
	 */
	@JSExport
	public Format getNumberFormat(String enFieldName, String xFieldName, int argDigits, int argPrecis);

	/**
	 *	Get a Format object for a number with the specified field name, translated field name, number of digits, and precision.
	 *
	 *	@param Class<?> clazz The class formatting the number
	 *	@param int argDigits The maximum number of digits to display
	 *	@param int argPrecis The number of digits to show after the decimal point, or if negative, as zeroes before the decimal point.
	 */
	@JSExport
	public static Format getNumberFormat(Class<?> clazz, int argDigits, int argPrecis);

	/**
	 *	Get the absolute minimum value for a number with the specified field name, translated field name, number of digits, and precision.
	 *
	 *	@param String enFieldName The English field name
	 *	@param String xFieldName The translated field name
	 *	@param int argDigits The maximum number of digits to display
	 *	@param int argPrecis The number of digits to show after the decimal point, or if negative, as zeroes before the decimal point.
	 */
	@JSExport
	public BigDecimal getAbsoluteMinValue(String enFieldName, String xFieldName, int argDigits, int argPrecis);

	/**
	 *	Get the absolute maximum value for a number with the specified field name, translated field name, number of digits, and precision.
	 *
	 *	@param String enFieldName The English field name
	 *	@param String xFieldName The translated field name
	 *	@param int argDigits The maximum number of digits to display
	 *	@param int argPrecis The number of digits to show after the decimal point, or if negative, as zeroes before the decimal point.
	 */
	@JSExport
	public BigDecimal getAbsoluteMaxValue(String enFieldName, String xFieldName, int argDigits, int argPrecis);

	/**
	 *	Coerce a BigDecimal value to a number with the specified field name, translated field name, number of digits, and precision.
	 *
	 *	@param String enFieldName The English field name
	 *	@param String xFieldName The translated field name
	 *	@param int argDigits The maximum number of digits to display
	 *	@param int argPrecis The number of digits to show after the decimal point, or if negative, as zeroes before the decimal point.
	 */
	@JSExport
	public BigDecimal coerce(String enFieldName, String xFieldName, int argDigits, int argPrecis, BigDecimal value);

	/**
	 *	Parse a BigDecimal value string into a number with the specified field name, translated field name, number of digits, and precision.
	 *
	 *	@param String enFieldName The English field name
	 *	@param String xFieldName The translated field name
	 *	@param int argDigits The maximum number of digits to display
	 *	@param int argPrecis The number of digits to show after the decimal point, or if negative, as zeroes before the decimal point.
	 */
	@JSExport
	public BigDecimal parse(String enFieldName, String xFieldName, int argDigits, int argPrecis, String value);

	/**
	 *	Format BigDecimal value into a string with the specified field name, translated field name, number of digits, and precision.
	 *
	 *	@param String enFieldName The English field name
	 *	@param String xFieldName The translated field name
	 *	@param int argDigits The maximum number of digits to display
	 *	@param int argPrecis The number of digits to show after the decimal point, or if negative, as zeroes before the decimal point.
	 */
	@JSExport
	public String format(String enFieldName, String xFieldName, int argDigits, int argPrecis, BigDecimal value);
}

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

import server.markhome.giai.Inz;

import java.math.*;

/**
 * IGiAIArgumentUnderflowException indicates that an argument is outside the permitted value range.
 */
public interface IGiAIArgumentUnderflowException extends IGiAIArgumentException {

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
	public static IGiAIArgumentUnderflowException getService() {
		IGiAIArgumentUnderflowException ref = ((IGiAIArgumentUnderflowException)(singleton.get()));
		if (ref == null) {
			ref = new GiAIArgumentUnderflowException();
			singleton.set(null, ref);
			ref = ((IGiAIArgumentUnderflowException)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	Get an exception instance with the specified English and translated messages.
	 *
	 *	@param enMsg English message text
	 *	@param xMsg Translated message text
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enMsg, String xMsg);

	/**
	 *	Get an exception instance with the specified English and translated messages.
	 *
	 *	@param enMsg English message text
	 *	@param xMsg Translated message text
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enMsg, String xMsg, Throwable cause);

	/**
	 *	Get an exception instance with the specified English and translated messages and source.
	 *
	 *	@param throwingClass Class throwing the exception
	 *	@param methName Method name
	 *	@param enMsg English message text
	 *	@param xMsg Translated message text
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, String enMsg, String xMsg);

	/**
	 *	Get an exception instance with the specified English and translated messages and source.
	 *
	 *	@param throwingClass Class throwing the exception
	 *	@param methName Method name
	 *	@param enMsg English message text
	 *	@param xMsg Translated message text
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, String enMsg, String xMsg, Throwable cause);

	/**
	 *	Get an exception instance with the specified English and translated messages and source.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param enMsg English message text
	 *	@param xMsg Translated message text
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String enMsg, String xMsg);

	/**
	 *	Get an exception instance with the specified English and translated messages and source.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method Name
	 *	@param enMsg English message text
	 *	@param xMsg Translated message text
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, String enMsg, String xMsg);

	/**
	 *	Get an exception instance with the specified English and translated messages and source.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method Name
	 *	@param enMsg English message text
	 *	@param xMsg Translated message text
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, String enMsg, String xMsg, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, short argObj, short minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, short argObj, short minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, int argObj, int minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, int argObj, int minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, long argObj, long minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, long argObj, long minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, float argObj, float minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, float argObj, float minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, double argObj, double minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, double argObj, double minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, LocalDate argObj, LocalDate minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, LocalDate argObj, LocalDate minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, LocalTime argObj, LocalTime minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, LocalTime argObj, LocalTime minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, LocalDateTime argObj, LocalDateTime minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, LocalDateTime argObj, LocalDateTime minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, String argObj, String minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, String argObj, String minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, BigDecimal argObj, BigDecimal minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, BigDecimal argObj, BigDecimal minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, Object minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, Object minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, Object minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, short argObj, short minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, short argObj, short minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, int argObj, int minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, int argObj, int minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, long argObj, long minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, long argObj, long minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, float argObj, float minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, float argObj, float minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, double argObj, double minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, double argObj, double minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, LocalDate argObj, LocalDate minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, LocalDate argObj, LocalDate minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, LocalTime argObj, LocalTime minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, LocalTime argObj, LocalTime minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, LocalDateTime argObj, LocalDateTime minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, LocalDateTime argObj, LocalDateTime minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, String argObj, String minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, String argObj, String minValue, Throwable cause);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, BigDecimal argObj, BigDecimal minValue);

	/**
	 *	Get an exception instance with the default message for the situation.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, BigDecimal argObj, BigDecimal minValue, Throwable cause);

	/**
	 *	Get an exception instance with the specified English and translated messages and source.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, Object argObj, Object minValue);

	/**
	 *	Get an exception instance with the specified English and translated messages and source.
	 *
	 *	@param enFieldName English field name
	 *	@param xFieldName Translated field name
	 *	@param methName Method name
	 *	@param argNo Argument number
	 *	@param argName Argument name
	 *	@param argObj The object (typically a PKey, Key, Buff, or Obj instance) causing the exception
	 *	@param minValue Minimum limit enforced by the exception
	 *	@param cause Throwable which caused the exception
	 *
	 *	@return IGiAIArgumentUnderflowException A new instance with the specified messages and source.
	 */
	@JSExport
	public IGiAIArgumentUnderflowException getInstance(String enFieldName, String xFieldName, String methName, int argNo, String argName, Object argObj, Object minValue, Throwable cause);

	/**
	 *	Get the argument minimum Object value provided at construction, if any.
	 *
	 *	@return The minium value object.
	 */
	@JSExport
	public Object getMinValue();
}

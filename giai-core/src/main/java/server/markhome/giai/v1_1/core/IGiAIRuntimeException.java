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

/**
 *	IGiAIRuntimeException is the base exception interface for the majority of the IGiAI exception interfaces, extending IGiAIAnyObj and providing an enhanded set of signatures based on those specified by Java's RuntimeException instance method and member signatures, adding specialized methods and constructors for language localization and application code argument pattern hooks and support. GiAIRuntimeException implements the constructors and service and instance method signatures of the following see-referenced objects, as well as the additional method signatures specied by the IGiAIRuntimeException interface. The method signatures defined by IGiAIRuntimeException do not Override any of method signatures inherited from JDK, TeaVM, or other third-party interfaces and classes referenced by the method signature specifications in question.
 *
 *	The service singletons and inteface implementations provide thread-safety through the use of the <tt>server.markhome.giai.v3_1.core.IGiAIMt*</tt> services and instances, such as IGiAIMtReference.
 *
 *	The TeaVM supporting interfaces, classes, and tooling require that application code provide standalone method bodies, constants, and static variables for the assets defined by the following modules, interfaces, and classes without overloading any of the service and instance method signatures of TeaVM's see-referenced classes, interfaces, and resources from the <tt>org.teavm.jso.*</tt> packages more than one time each.
 *
 *	@see java.util
 *	@see org.teavm.jso
 *	@see org.teavm.jso.JSObject
 *	@see org.teavm.jso.JSProperty
 *	@see org.teavm.jso.JSExport
 *	@see server.markhome.giai
 *	@see server.markhome.giai.v3_1
 *	@see server.markhome.giai.v3_1.core
 *	@see server.markhome.giai.v3_1.core.IGiAIAnyObj
 *	@see server.markhome.giai.v3_1.core.IGiAIMtReference
 *	@see server.markhome.giai.v3_1.core.IGiAIRuntimeException
 *
 *	@author mark.sobkow@gmail.com
 *	@copyright 2026-2027 Mark Stephen Sobkow
 *	@email mark.sobkow@gmail.com
 *	@since 2026
 */
public interface IGiAIRuntimeException extends IGiAIAnyObj {

	/**
	 *	The IGiAIRuntimeException service singleton.
	 */
	@JSProperty
	static final IGiAIMtReference mtReferenceRuntimeExceptionSingleton = IGiAIMtReference.getMtReferenceService().getMtReferenceInstance(null);

	/**
	 *	Get the const IGiAIRuntimeException service singleton which implements the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return const IGiAIRuntimeException The const IGiAIRuntimeException service singleton instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 */
	@JSExport
	public static const IGiAIRuntimeException getRuntimeExceptionService() {
		IGiAIRuntimeException ref = ((IGiAIRuntimeException)(mtReferenceRuntimeExceptionSingleton.get()));
		if (ref == null) {
			ref = new GiAIRuntimeException();
			ref = ((IGiAIRuntimeException)mtReferenceRuntimeExceptionSingleton.set(null, ref));
		}
		return(ref);
	}

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance();

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(String enMsg, String xMsg, Throwable cause);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(Class<?> throwingClass, String methName, String enMsg, String xMsg);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(Class<?> throwingClass, String methName, String enMsg, String xMsg, Throwable cause);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, String enMsg, String xMsg);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, String enMsg, String xMsg, Throwable cause);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param cause Root cause thrown by code
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, Throwable cause);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(String enFieldName, String xFieldName, String enMsg, String xMsg);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj, String enMsg, String xMsg);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj, String enMsg, String xMsg, Throwable cause);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj);

	/**
	 *	Get a new implementation of a IGiAIRuntimeException implementing the constructors and service and instance method signatures of the see-referenced classes, interfaces, and resources defined by this inteface file, inherited by it, or implemented by any implementations of it.
	 *
	 *	@return IGiAIRuntimeException A new IGiAIRuntimeException service instance implementing the constructors, service method signatures, and instance method signatures specified by, inherited by, or implemented by this interface file.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param cause Root cause thrown by code
	 */
	@JSExport
	public IGiAIRuntimeException getRuntimeExceptionInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj, Throwable cause);

	/**
	 *	Get the source of the exception (either the field name and possible argument number and name, or the class and method with possible argument number and name) if provided. If none was provided, the location information from the inherited exception of the implementation is returned.
	 *
	 *	@return The source of the exception.
	 */
	@JSExport
	public String getSource();

	/**
	 *	Get the English version of the exception message.  If none was provided, the default inherited exception class message is returned.
	 *
	 *	@return The English exception message body.
	 */
	@JSExport
	public String getEnMessage();

	/**
	 *	Get the localized/translated version of the exception message for the exception.  If none was provided, the value returned by <tt>getEnMessage()</tt> is returned.
	 *
	 *	@return The localized/translated exception message body.
	 */
	@JSExport
	public String getXMessage();

	/**
	 *	Get the argument index provided at construction.  If none was provided, 0 is returned.
	 *
	 *	@return The argument index provided at construction or 0.
	 */
	@JSExport
	public int getArgNo();

	/**
	 *	Get the argument name provided at construction.  If none was provided, an empty string is returned.
	 *
	 *	@return The argument name provided at construction or an empty string.
	 */
	@JSExport
	public String getArgName();

	/**
	 *	Get the argument Object value provided at construction.  If none was provided, null is returned.
	 *
	 *	@return The argument object.
	 */
	@JSExport
	public Object getArgObj();
}

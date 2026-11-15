/**
 *	server.markhome.giai-core - Guided Intelligence Architecture Implementation Core Services
 *
 *	Copyright 2026-2027 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *
 *	The Guided Intelligence Architecture Implementation Core Services are licensed under
 *	the GiAIDualLGPL-3.0-or-later license.  You should have received a copy of the
 *	GiAIDualLGPL-3.0-or-later license text with appropriate file types and content
 *	for this module of source code's files.  If you did not receive the copies, you
 *	can download the appropriate ones from:
 *
 *		https://msobkow.github.io/mark-sobkow-giai-licenses/
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	SPDX-License-Identifier: LicenseRef-GiAIDualLGPL-3.0-or-later
**/

package server.markhome.giai.core;

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

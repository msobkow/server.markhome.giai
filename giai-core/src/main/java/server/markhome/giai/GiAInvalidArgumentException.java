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

import server.markhome.giai.IInz;

/**
 * GiAIInvalidArgumentException is thrown when an argument is invalid for some reason, usually specified by nationalized cause phrases.
 */
public class GiAIInvalidArgumentException extends GiAIArgumentException implements IGiAIInvalidArgumentException {

	/**
	 *	The protected attributes need to be exported as properties, but not private attributes.
	 */
	@JSProperty
	protected static IGiAIMtReference<IGiAIInvalidArgumentException> mtSingleton = IGiAIMtReference.getInstance<>(null);

	/**
	 *	IGiAIInvalidArgumentException getSingleton()
	 *		Get the singleton instance that provides the getInstance() implementations.
	 *
	 *	@return IGiAIInvalidArgumentException The singleton for the exception implementation.
	 */
	//@JSExport
	//public IGiAIInvalidArgumentException getSingleton();

	/**
	 *	IGiAIInvalidArgumentException(enMsg, xMsg)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(String enMsg, String xMsg) {
		return new GiAIInvalidArgumentException(enMsg, xMsg);
	}
}

	/**
	 *	IGiAIInvalidArgumentException(enMsg, xMsg, cause)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(String enMsg, String xMsg, Throwable cause) {
		return new GiAIInvalidArgumentException(enMsg, xMsg, cause);
	}
	/**
	 *	IGiAIInvalidArgumentException(throwingClass, methName, enMsg, xMsg)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(Class<?> throwingClass, String methName, String enMsg, String xMsg) {
		return new GiAIInvalidArgumentException(throwingClass, methName, enMsg, xMsg);
	}

	/**
	 *	IGiAIInvalidArgumentException(throwingClass, methName, enMsg, xMsg)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(Class<?> throwingClass, String methName, String enMsg, String xMsg, Throwable cause) {
		return new GiAIInvalidArgumentException(throwingClass, methName, enMsg, xMsg, cause);
	}

	/**
	 *	IGiAIInvalidArgumentException(throwingClass, methName, argNo, argName, argObj, enMsg, xMsg)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, String enMsg, String xMsg) {
		return new GiAIInvalidArgumentException(throwingClass, methName, argNo, argName, argObj, enMsg, xMsg);
	}

	/**
	 *	IGiAIInvalidArgumentException(throwingClass, methName, enMsg, xMsg)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, String enMsg, String xMsg, Throwable cause) {
		return new GiAIInvalidArgumentException(throwingClass, methName, argNo, argName, argObj, enMsg, xMsg, cause);
	}

	/**
	 *	IGiAIInvalidArgumentException(throwingClass, methName, xFieldName, argNo, argName, argObj)
	 *		Construct an argument exception with the default formatted message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj) {
		return new GiAIInvalidArgumentException(throwingClass, methName, argNo, argName, argObj);
	}

	/**
	 *	IGiAIInvalidArgumentException(throwingClass, methName, argNo, argName, argObj, cause)
	 *		Construct an argument exception with the default formatted message for the situation.
	 *
	 *	@param throwingClass The class throwing the exception
	 *	@param methName Method name which is throwing the exception; include a "-variant" distinguishing sub-tag if the method has overloaded implementations and signatures.
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param cause Root cause thrown by code
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(Class<?> throwingClass, String methName, int argNo, String argName, Object argObj, Throwable cause) {
		return new GiAIInvalidArgumentException(throwingClass, methName, argNo, argName, argObj, cause);
	}
	/**
	 *	IGiAIInvalidArgumentException(enFieldName, xFieldName, enMsg, xMsg)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(String enFieldName, String xFieldName, String enMsg, String xMsg) {
		return new GiAIInvalidArgumentException(enFieldName, xFieldName, enMsg, xMsg);
	}

	/**
	 *	IGiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj, enMsg, xMsg, cause)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj, String enMsg, String xMsg) {
		return new GiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj, enMsg, xMsg);
	}

	/**
	 *	IGiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj, enMsg, xMsg, cause)
	 *		Construct an argument exception with the provided English and NLS-translated message bodies.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param enMsg Text message body
	 *	@param xMsg Translated text message body
	 *	@param cause Root cause thrown by code
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj, String enMsg, String xMsg, Throwable cause) {
		return new GiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj, enMsg, xMsg, cause);
	}

	/**
	 *	IGiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj)
	 *		Construct an argument exception with the default formatted message for the situation.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj) {
		return new GiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj);
	}
	/**
	 *	IGiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj, cause)
	 *		Construct an argument exception with the default formatted message for the situation.
	 *
	 *	@param enFieldName Field name having the issue
	 *	@param xFieldName Translated field name having the issue
	 *	@param argNo Argument number or index
	 *	@param argName Name of the argument with/causing the exception to be thrown
	 *	@param argObj The object (typically a PKey, Key, or Buff instance) causing the issue
	 *	@param cause Root cause thrown by code
	 *
	 *	@return IGiAIInvalidArgumentException An exception instance with the specified messages.
	 */
	@JSExport
	public IGiAIInvalidArgumentException getInstance(String enFieldName, String xFieldName, int argNo, String argName, Object argObj, Throwable cause) {
		return new GiAIInvalidArgumentException(enFieldName, xFieldName, argNo, argName, argObj, cause);
	}

	// Inherited constructor patterns

	public GiAIInvalidArgumentException(
		String enMsg,
		String xMsg)
	{
		super(enMsg, xMsg);
	}

	public GiAIInvalidArgumentException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(enMsg, xMsg, th);
	}

	public GiAIInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public GiAIInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	public GiAIInvalidArgumentException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg)
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	}

	public GiAIInvalidArgumentException(
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

	// public GiAIInvalidArgumentException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg)
	// {
	// 	super(enFieldName, xFieldName, enMsg, xMsg);
	// }

	public GiAIInvalidArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg)
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg);
	}

	public GiAIInvalidArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th)
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
	}

	public GiAIInvalidArgumentException(
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

	public GiAIInvalidArgumentException(
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

	public GiAIInvalidArgumentException(
		Class<?> throwingClass,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
	}

	public GiAIInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : "")),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			th);
	}

	public GiAIInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName));
	}

	public GiAIInvalidArgumentException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			th);
	}

	public GiAIInvalidArgumentException(
		String enFieldName,
		String xFieldName,
		String methName)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.FldMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : "")),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")));
	}

	public GiAIInvalidArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.FldMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : "")),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
			th);
	}

	public GiAIInvalidArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName));
	}

	public GiAIInvalidArgumentException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Throwable th)
	{
		super(String.format(Inz.s("giailib.GiAIInvalidArgumentException.FldArgMsg"),
				enFieldName + (((methName != null) && !methName.isEmpty()) ? "." + methName + "()" : ""),
				argNo,
				argName),
			String.format(Inz.x("giailib.GiAIInvalidArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : ""),
				argNo,
				argName),
			th);
	}
}

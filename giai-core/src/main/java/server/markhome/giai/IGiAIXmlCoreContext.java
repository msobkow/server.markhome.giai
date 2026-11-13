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

import java.util.HashMap;
import java.util.Map;

import server.markhome.giai.IGiAIMessageLog;

/**
 *	An XML Core Context is a processing stack entry pushed
 *	at the start of each element or document and popped
 *	at the end of their processing.
 *
 *	@since 2016
 *	@author Mark Sobkow (mark.sobkow@gmail.com)
 */
public interface IGiAIXmlCoreContext extends IGiAIAnyObj {

	/**
	 *	The service singleton has to be thread-safe.
	 */
	static final IGiAIMtReference singleton = IGiAIMtReference.getService().getInstance();

	/**
	 *	Get the service singleton.
	 *
	 *	@return The service singleton.
	 */
	@JSExport
	public static IGiAIXmlCoreContext getService() {
		IGiAIXmlCoreContext ref = ((IGiAIXmlCoreContext)(singleton.get()));
		if (ref == null) {
			ref = new GiAIXmlCoreContext();
			singleton.set(null, ref);
			ref = ((IGiAIXmlCoreContext)(singleton.get()));
		}
		return(ref);
	}

	/**
	 *	Copy and link an XML Core Context.
	 *	<p>
	 *	The specified source element becomes the PrevContext.
	 *
	 *	@param	src	The context to copy.
	 *	@param	qName	The QName of the element about to be processed.
	 *	@param	handler	The XmlCoreElementHandler which will be used for processing.
	 */
	@JSExport
	public IGiAIXmlCoreContext getInstance(
		IGiAIXmlCoreContext src,
		String qName,
		IGiAIXmlCoreElementHandler handler);

	/**
	 *	Construct a "root" XML Core Context instance.
	 *
	 *	@param	coreParser	The parser which owns this instance.
	 *	@param	jlog	Log4J log to use, if null, use parser's log.
	 *	@param	handler	The XmlCoreElementHandler which will be processing the doc root.
	 */
	@JSExport
	public IGiAIXmlCoreContext getInstance(
		IGiAIXmlCoreParser coreParser,
		IGiAIMessageLog jlog,
		IGiAIXmlCoreElementHandler elementHandler);

	/**
	 *	Get the previous context in the stack.
	 *
	 *	@return	The previous context or null if this is
	 *			the bottom of the stack.
	 */
	@JSExpot
	public IGiAIXmlCoreContext getPrevContext();

	/**
	 *	Is there a mapping for the named value slot?
	 *
	 *	@param	name	The name of the object
	 *
	 *	@return	True if there is a mapping for the name.
	 */
	@JSExport
	public boolean hasNamedValue(String key);

	/**
	 *	Get the object for the named value slot.
	 *
	 *	@param	name	The name of the object
	 *	@return	The object associated with the name or null.
	 */
	@JSExport
	public Object getNamedValue(String key);

	/**
	 *	Put a named value.
	 *
	 *	@param	name	The name of the object
	 *	@param	value	The object to store for the name
	 *
	 *	@return	The object previously associated with the name or null
	 */
	@JSExport
	public Object putNamedValue(String key, Object value);

	/**
	 *	Get the XML Core Parser which owns this element handler.
	 *
	 *	@return	The XML Core Parser which owns this element handler.
	 */
	@JSExport
	public IGiAIXmlCoreParser getParser();

	/**
	 *	Get the runtime processing log.
	 *
	 *	@return	Log4J log
	 */
	@JSExport
	public IGiAIMessageLog getLog();

	/**
	 *	Set the runtime processing log.
	 *
	 *	@param	jlog	The log to use for runtime processing messages
	 */
	@JSExport
	public void setLog(IGiAIMessageLog jlog);

	/**
	 *	Get the ElementText for the current context.
	 *
	 * 	@return	The element text collected so far.
	 */
	@JSExport
	public String getElementText();

	/**
	 *	Append a character segment to the element text.
	 */
	@JSExport
	public void appendElementText(char ch[], int start, int length);

	/**
	 *	Retrieve the element handler for this processing context.
	 *
	 *	@return	The element handler selected for processing the current element.
	 */
	@JSExport
	public IGiAIXmlCoreElementHandler getElementHandler();

	/**
	 *	Set the element handler and QName for this processing context.
	 *
	 *	@param	qName	The QName of the element or document being processed.
	 *	@param	handler	The XmlCoreElementHandler selected to process the element.
	 */
	@JSExport
	public void setQNameElementHandler(String qName, IGiAIXmlCoreElementHandler handler);
}

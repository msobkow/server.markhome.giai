/*
 *	MSS Code Factory YCFLib 2.13 Common Application Functionality
 *
 *	Copyright (C) 2016-2026 Mark Stephen Sobkow (mailto:mark.sobkow@gmail.com)
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.IYCFLibMessageLog;

/**
 *	An XML Core Context Factory instantiates new instances
 *	derived from XmlCoreContext. 
 */
public interface YCFLibXmlCoreContextFactory {

	/**
	 *	Get the application processing logger.
	 *
	 *	@return	The application processing Log4J Logger.
	 */
	public IYCFLibMessageLog getLog();

	/**
	 *	Copy an XML Core Context.
	 *
	 *	@param	src	The context to copy.
	 *	@param	qName	The QName of the element about to be processed.
	 *	@param	handler	The XmlCoreElementHandler which will be used for processing.
	 */
	public YCFLibXmlCoreContext newXmlCoreContext(
		YCFLibXmlCoreContext src,
		String qName,
		YCFLibXmlCoreElementHandler handler );

	/**
	 *	Construct a "root" XML Core Context instance.
	 *
	 *	@param	coreParser	The parser which owns this instance.
	 *	@param	log	IYCFLibMessageLog to use, if null, use parser's logger.
	 *	@param	handler	The XmlCoreElementHandler which will be processing the doc root.
	 */
	public YCFLibXmlCoreContext newXmlCoreContext(
		YCFLibXmlCoreParser coreParser,
		IYCFLibMessageLog jLogger,
		YCFLibXmlCoreElementHandler elementHandler );

}

/*
 *	MSS Code Factory YCFBam 2.13 CustXmlLoader
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package org.mssycf.mssycf.v2_13.ycfbamcust.YCFBamXmlLoader;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamXmlLoaderTableAddendumHandler SAX Element Handler implementation
 */
public class YCFBamXmlLoaderTableAddendumHandler
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamXmlLoaderTableAddendumHandler( YCFBamXmlLoader saxLoader ) {
		super( saxLoader );
	}

	public void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs )
	throws SAXException
	{
		final String S_ProcName = "startElement";

		// TableRelations attributes
		String		attrFromTable = null;

		// Attribute Extraction
		String	attrLocalName;
		int		numAttrs;
		int		idxAttr;

		assert qName.equals( "TableAddendum" );

		numAttrs = attrs.getLength();
		for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
			attrLocalName = attrs.getLocalName( idxAttr );
			if( attrLocalName.equals( "FromTable" ) ) {
				if( attrFromTable != null ) {
					throw new YCFLibUniqueIndexViolationException( getClass(),
						S_ProcName,
						attrLocalName );
				}
				attrFromTable = attrs.getValue( idxAttr );
			}
			else if( attrLocalName.equals( "schemaLocation" ) ) {
				// ignored
			}
			else {
				throw new YCFLibUnrecognizedAttributeException( getClass(),
					S_ProcName,
					"LocalName",
					attrLocalName );
			}
		}

		if( ( attrFromTable == null ) || ( attrFromTable.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(),
				S_ProcName,
				0,
				"FromTable" );
		}

		YCFBamXmlLoader saxLoader = (YCFBamXmlLoader)getParser();
		if( saxLoader == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"getParser()" );
		}

		YCFLibXmlCoreContext curContext = saxLoader.getCurContext();
		if( curContext == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"getParser().getCurContext()" );
		}

		IYCFBamSchemaObj schemaObj = saxLoader.getSchemaObj();
		if( schemaObj == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"getParser().getSchemaObj()" );
		}

		if( ! YCFBamXmlLoader.getProcessSchema( curContext ) ) {
			return;
		}

		YCFLibXmlCoreContext prevContext = curContext.getPrevContext();
		IYCFBamSchemaDefObj schemaDef = (IYCFBamSchemaDefObj)( prevContext.getNamedValue( "Object" ) );
		IYCFBamTableObj fromTable = schemaObj.getTableTableObj().readTableByUNameIdx( schemaDef.getRequiredTenantId(),
			schemaDef.getRequiredId(),
			attrFromTable );
		if( fromTable == null ) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				" Could not resolve FromTable \""
					+ attrFromTable + "\" in Schema \""
					+ schemaDef.getObjFullName()
					+ "\"" );
		}
		curContext.putNamedValue( "FromTable", fromTable );

		// No scope to add here, just resolving a table context
		curContext.putNamedValue( "Object", fromTable );
	}

	public void endElement(
		String		uri,
		String		localName,
		String		qName )
	throws SAXException
	{
	}
}

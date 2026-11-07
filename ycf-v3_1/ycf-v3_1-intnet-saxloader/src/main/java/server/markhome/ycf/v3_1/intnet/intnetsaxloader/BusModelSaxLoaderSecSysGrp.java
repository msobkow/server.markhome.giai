
// Description: Java 25 XML SAX Element Handler for SecSysGrp

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.intnet.intnetsaxloader;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.xml.sax.*;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.Inz;
import server.markhome.cf.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

/*
 *	BusModelSaxLoaderSecSysGrpParse XML SAX Element Handler implementation
 *	for SecSysGrp.
 */
public class BusModelSaxLoaderSecSysGrp
	extends CFLibXmlCoreElementHandler
{
	public BusModelSaxLoaderSecSysGrp( BusModelSaxLoader saxLoader ) {
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
		IBusModelSecSysGrpObj origBuff = null;
		IBusModelSecSysGrpEditObj editBuff = null;
		// Common XML Attributes
		String attrId = null;
		// SecSysGrp Attributes
		String attrName = null;
		String attrSecLevel = null;
		String attrImplSysRole = null;
		// SecSysGrp References
		// Attribute Extraction
		String attrLocalName;
		int numAttrs;
		int idxAttr;
		final String S_LocalName = "LocalName";
		try {
			assert qName.equals( "SecSysGrp" );

			BusModelSaxLoader saxLoader = (BusModelSaxLoader)getParser();
			if( saxLoader == null ) {
				throw IYCFNullArgumentException.getService().getInstance( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			IBusModelSchemaObj schemaObj = saxLoader.getSchemaObj();
			if( schemaObj == null ) {
				throw IYCFNullArgumentException.getService().getInstance( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Instantiate an edit buffer for the parsed information
			origBuff = (IBusModelSecSysGrpObj)schemaObj.getSecSysGrpTableObj().newInstance();
			editBuff = (IBusModelSecSysGrpEditObj)origBuff.beginEdit();

			// Extract Attributes
			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Id" ) ) {
					if( attrId != null ) {
						throw IYCFUniqueIndexViolationException.getService().getInstance( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Name" ) ) {
					if( attrName != null ) {
						throw IYCFUniqueIndexViolationException.getService().getInstance( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "SecLevel" ) ) {
					if( attrSecLevel != null ) {
						throw IYCFUniqueIndexViolationException.getService().getInstance( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSecLevel = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ImplSysRole" ) ) {
					if( attrImplSysRole != null ) {
						throw IYCFUniqueIndexViolationException.getService().getInstance( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrImplSysRole = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					throw IYCFUnrecognizedAttributeException.getService().getInstance( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( attrName == null ) {
				throw IYCFNullArgumentException.getService().getInstance( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( ( attrSecLevel == null ) || ( attrSecLevel.length() <= 0 ) ) {
				throw IYCFNullArgumentException.getService().getInstance( getClass(),
					S_ProcName,
					0,
					"SecLevel" );
			}

			// Save named attributes to context
			CFLibXmlCoreContext curContext = getParser().getCurContext();
			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "Name", attrName );
			curContext.putNamedValue( "SecLevel", attrSecLevel );
			curContext.putNamedValue( "ImplSysRole", attrImplSysRole );

			// Convert string attributes to native Java types
			// and apply the converted attributes to the editBuff.

			Integer natId;
			if( ( attrId != null ) && ( attrId.length() > 0 ) ) {
				natId = Integer.valueOf( Integer.parseInt( attrId ) );
			}
			else {
				natId = null;
			}
			String natName = attrName;
			editBuff.setRequiredName( natName );

			ISecureSchema.SecLevelEnum natSecLevel = ISecureSchema.parseSecLevelEnum( attrSecLevel );
			editBuff.setRequiredSecLevel( natSecLevel );

			// Get the scope/container object

			CFLibXmlCoreContext parentContext = curContext.getPrevContext();
			Object scopeObj;
			if( parentContext != null ) {
				scopeObj = parentContext.getNamedValue( "Object" );
			}
			else {
				scopeObj = null;
			}

			BusModelSaxLoader.LoaderBehaviourEnum loaderBehaviour = saxLoader.getSecSysGrpLoaderBehaviour();
			IBusModelSecSysGrpEditObj editSecSysGrp = null;
			IBusModelSecSysGrpObj origSecSysGrp = (IBusModelSecSysGrpObj)schemaObj.getSecSysGrpTableObj().readSecSysGrpByUNameIdx( editBuff.getRequiredName() );
			if( origSecSysGrp == null ) {
				editSecSysGrp = editBuff;
			}
			else {
				switch( loaderBehaviour ) {
					case Insert:
						break;
					case Update:
						editSecSysGrp = (IBusModelSecSysGrpEditObj)origSecSysGrp.beginEdit();
						editSecSysGrp.setRequiredName( editBuff.getRequiredName() );
						editSecSysGrp.setRequiredSecLevel( editBuff.getRequiredSecLevel() );
						break;
					case Replace:
						editSecSysGrp = (IBusModelSecSysGrpEditObj)origSecSysGrp.beginEdit();
						editSecSysGrp.deleteInstance();
						editSecSysGrp = null;
						origSecSysGrp = null;
						editSecSysGrp = editBuff;
						break;
				}
			}

			if( editSecSysGrp != null ) {
				if( origSecSysGrp != null ) {
					editSecSysGrp.update();
				}
				else {
					origSecSysGrp = (IBusModelSecSysGrpObj)editSecSysGrp.create();
				}
				editSecSysGrp = null;
			}

			curContext.putNamedValue( "Object", origSecSysGrp );
		}
		catch( RuntimeException e ) {
			throw new SAXException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage(),
				e );
		}
		catch( Error e ) {
			throw new SAXException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getName() + " - " + e.getMessage() );
		}
	}

	public void endElement(
		String		uri,
		String		localName,
		String		qName )
	throws SAXException
	{
	}
}

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
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.dbutil.YCFLibDbKeyHash128;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamXmlLoaderDbKeyHash128GenParse XML SAX Element Handler implementation
 *	for DbKeyHash128Gen.
 */
public class YCFBamXmlLoaderDbKeyHash128GenHandler
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamXmlLoaderDbKeyHash128GenHandler( YCFBamXmlLoader saxLoader ) {
		super( saxLoader );
	}

	public void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs )
	throws SAXException
	{
		try {
			// Common XML Attributes
			String	attrId = null;
			// Value Attributes
			String	attrName = null;
			String	attrShortName = null;
			String	attrLabel = null;
			String	attrShortDescription = null;
			String	attrDescription = null;
			String	attrIsNullable = null;
			String	attrGenerateId = null;
			String	attrCodeVis = null;
			// Value References
			IYCFBamTenantObj refTenant = null;
			IYCFBamScopeObj refScope = null;
			// Atom Attributes
			String	attrDbName = null;
			// Atom References
			// DbKeyHash128Def Attributes
			String	attrInitValue = null;
			// DbKeyHash128Def References
			// DbKeyHash128Type Attributes
			// DbKeyHash128Type References
			IYCFBamSchemaDefObj refSchemaDef = null;
			// DbKeyHash128Gen Attributes
			String	attrSlice = null;
			String	attrBlockSize = null;
			String	attrDispenser = null;
			// DbKeyHash128Gen References
			IYCFBamTableObj refDispenser = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "DbKeyHash128Gen" );

			YCFBamXmlLoader saxLoader = (YCFBamXmlLoader)getParser();
			if( saxLoader == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser()" );
			}

			IYCFBamSchemaObj schemaObj = saxLoader.getSchemaObj();
			if( schemaObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"getParser().getSchemaObj()" );
			}

			// Instantiate an edit buffer for the parsed information
			IYCFBamDbKeyHash128GenEditObj editBuff = (IYCFBamDbKeyHash128GenEditObj)schemaObj.getDbKeyHash128GenTableObj().newInstance().beginEdit();

			// Extract Attributes
			numAttrs = attrs.getLength();
			for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
				attrLocalName = attrs.getLocalName( idxAttr );
				if( attrLocalName.equals( "Id" ) ) {
					if( attrId != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Name" ) ) {
					if( attrName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ShortName" ) ) {
					if( attrShortName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrShortName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Label" ) ) {
					if( attrLabel != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrLabel = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ShortDescription" ) ) {
					if( attrShortDescription != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrShortDescription = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Description" ) ) {
					if( attrDescription != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDescription = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "IsNullable" ) ) {
					if( attrIsNullable != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrIsNullable = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "GenerateId" ) ) {
					if( attrGenerateId != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrGenerateId = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "DbName" ) ) {
					if( attrDbName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDbName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "InitValue" ) ) {
					if( attrInitValue != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrInitValue = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Slice" ) ) {
					if( attrSlice != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSlice = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "BlockSize" ) ) {
					if( attrBlockSize != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrBlockSize = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Dispenser" ) ) {
					if( attrDispenser != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDispenser = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "CodeVis" ) ) {
					if( attrCodeVis != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrCodeVis = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "schemaLocation" ) ) {
					// ignored
				}
				else {
					throw new YCFLibUnrecognizedAttributeException( getClass(),
						S_ProcName,
						getParser().getLocationInfo(),
						attrLocalName );
				}
			}

			// Ensure that required attributes have values
			if( attrName == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Name" );
			}
			if( ( attrIsNullable == null ) || ( attrIsNullable.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IsNullable" );
			}
			if( ( attrSlice == null ) || ( attrSlice.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"Slice" );
			}
			if( ( attrBlockSize == null ) || ( attrBlockSize.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"BlockSize" );
			}
			if( ( attrBlockSize == null ) || ( attrBlockSize.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"BlockSize" );
			}
			if( ( attrCodeVis == null ) || ( attrCodeVis.length() <= 0 ) ) {
				attrCodeVis = "Public";
			}

			// Save named attributes to context
			YCFLibXmlCoreContext curContext = getParser().getCurContext();
			if( ! YCFBamXmlLoader.getProcessSchema( curContext ) ) {
				return;
			}

			curContext.putNamedValue( "Id", attrId );
			curContext.putNamedValue( "Name", attrName );
			curContext.putNamedValue( "ShortName", attrShortName );
			curContext.putNamedValue( "Label", attrLabel );
			curContext.putNamedValue( "ShortDescription", attrShortDescription );
			curContext.putNamedValue( "Description", attrDescription );
			curContext.putNamedValue( "IsNullable", attrIsNullable );
			curContext.putNamedValue( "GenerateId", attrGenerateId );
			curContext.putNamedValue( "DbName", attrDbName );
			curContext.putNamedValue( "InitValue", attrInitValue );
			curContext.putNamedValue( "BlockSize", attrBlockSize );
			curContext.putNamedValue( "Dispenser", attrDispenser );
			curContext.putNamedValue( "CodeVis", attrCodeVis );

			// Convert string attributes to native Cafe types
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

			String natShortName = attrShortName;
			editBuff.setOptionalShortName( natShortName );

			String natLabel = attrLabel;
			editBuff.setOptionalLabel( natLabel );

			String natShortDescription = attrShortDescription;
			editBuff.setOptionalShortDescription( natShortDescription );

			String natDescription = attrDescription;
			editBuff.setOptionalDescription( natDescription );

			boolean natIsNullable;
			if( attrIsNullable.equals( "true" ) || attrIsNullable.equals( "yes" ) || attrIsNullable.equals( "1" ) ) {
				natIsNullable = true;
			}
			else if( attrIsNullable.equals( "false" ) || attrIsNullable.equals( "no" ) || attrIsNullable.equals( "0" ) ) {
				natIsNullable = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected IsNullable value, must be one of true, false, yes, no, 1, or 0, not \"" + attrIsNullable + "\"" );
			}
			editBuff.setRequiredIsNullable( natIsNullable );

			Boolean natGenerateId;
			if( ( attrGenerateId == null ) || ( attrGenerateId.length() <= 0 ) ) {
				natGenerateId = null;
			}
			else if( attrGenerateId.equals( "true" ) || attrGenerateId.equals( "yes" ) || attrGenerateId.equals( "1" ) ) {
				natGenerateId = true;
			}
			else if( attrGenerateId.equals( "false" ) || attrGenerateId.equals( "no" ) || attrGenerateId.equals( "0" ) ) {
				natGenerateId = false;
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unexpected GenerateId value, must be one of true, false, yes, no, 1, or 0, not \"" + attrGenerateId + "\"" );
			}
			editBuff.setOptionalGenerateId( natGenerateId );

			String natDbName = attrDbName;
			editBuff.setOptionalDbName( natDbName );

			YCFLibDbKeyHash128 natInitValue;
			if( ( attrInitValue == null ) || ( attrInitValue.length() <= 0 ) ) {
				natInitValue = YCFLibDbKeyHash128.nullGet();
			}
			else {
				natInitValue = YCFLibDbKeyHash128.fromHex( attrInitValue );
			}
			editBuff.setOptionalInitValue( natInitValue.toString() );
			// editBuff.setOptionalInitValue(attrInitValue);

			short natSlice = Short.parseShort( attrSlice );
			editBuff.setRequiredSlice( natSlice );

			int natBlockSize = Integer.parseInt( attrBlockSize );
			editBuff.setRequiredBlockSize( natBlockSize );

			IYCFBamSchema.CodeVisibilityEnum natCodeVis = YCFBamSchema.parseCodeVisibilityEnum( attrCodeVis );
			editBuff.setRequiredCodeVis( natCodeVis );

			// Get the scope/container object

			YCFLibXmlCoreContext parentContext = curContext.getPrevContext();
			Object scopeObj;
			if( parentContext != null ) {
				scopeObj = parentContext.getNamedValue( "Object" );
			}
			else {
				scopeObj = null;
			}

			// Resolve and apply required Container reference
			// Resolve and apply Owner reference

			if( scopeObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"scopeObj" );
			}
			else if( scopeObj instanceof IYCFBamSchemaDefObj ) {
				refSchemaDef = (IYCFBamSchemaDefObj) scopeObj;
				editBuff.setRequiredContainerSchemaDef( refSchemaDef );
				refTenant = (IYCFBamTenantObj)editBuff.getRequiredOwnerTenant();
				editBuff.setRequiredOwnerTenant( refTenant );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFBamSchemaDefObj" );
			}

			refScope = refSchemaDef;

			// Lookup refDispenser by qualified name

			if( ( attrDispenser != null ) && ( attrDispenser.length() > 0 ) ) {
				refDispenser = schemaObj.getTableTableObj().readTableByUNameIdx( refSchemaDef.getRequiredTenantId(),
					refSchemaDef.getRequiredId(),
					attrDispenser );
				if( refDispenser == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve Dispenser reference qualified name \"" + attrDispenser + "\" to table Table" );
				}
			}
			else {
				refDispenser = null;
			}
			editBuff.setOptionalLookupDispenser( refDispenser );

			IYCFBamDbKeyHash128GenEditObj editDbKeyHash128Gen = editBuff;
			IYCFBamDbKeyHash128GenObj origDbKeyHash128Gen = (IYCFBamDbKeyHash128GenObj)editDbKeyHash128Gen.create();
			editDbKeyHash128Gen = null;

			curContext.putNamedValue( "Object", origDbKeyHash128Gen );
		}
		catch( RuntimeException e ) {
			throw new RuntimeException( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getSimpleName() + " - " + e.getMessage(),
				e );
		}
		catch( Error e ) {
			throw new Error( "Near " + getParser().getLocationInfo() + ": Caught and rethrew " + e.getClass().getSimpleName() + " - " + e.getMessage(),
				e );
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

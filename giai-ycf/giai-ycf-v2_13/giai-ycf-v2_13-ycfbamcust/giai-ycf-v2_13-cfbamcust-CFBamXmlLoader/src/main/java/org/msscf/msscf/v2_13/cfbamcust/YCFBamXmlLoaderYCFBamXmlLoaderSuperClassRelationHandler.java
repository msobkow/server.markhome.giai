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
 *	YCFBamXmlLoaderRelationParse XML SAX Element Handler implementation
 *	for Relation.
 */
public class YCFBamXmlLoaderSuperClassRelationHandler
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamXmlLoaderSuperClassRelationHandler( YCFBamXmlLoader saxLoader ) {
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
			// Scope Attributes
			// Scope References
			IYCFBamTenantObj refTenant = null;
			// Relation Attributes
			String	attrName = null;
			String	attrShortName = null;
			String	attrLabel = null;
			String	attrShortDescription = null;
			String	attrDescription = null;
			String	attrDbName = null;
			String	attrSuffix = null;
			String	attrFromIndex = null;
			String	attrToIndex = null;
			String	attrNarrowed = null;
			String	attrPopDepChain = null;
			// Relation References
			IYCFBamTenantObj refRelTenant = null;
			IYCFBamSchema.RelationTypeEnum refRelationType = null;
			IYCFBamTableObj refFromTable = null;
			IYCFBamIndexObj refFromIndex = null;
			IYCFBamTableObj refToTable = null;
			IYCFBamIndexObj refToIndex = null;
			IYCFBamRelationObj refNarrowed = null;
			// Attribute Extraction
			String	attrLocalName;
			int		numAttrs;
			int		idxAttr;
			final String S_ProcName = "startElement";
			final String S_LocalName = "LocalName";

			assert qName.equals( "SuperClassRelation" );

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
			IYCFBamRelationEditObj editBuff = (IYCFBamRelationEditObj)schemaObj.getRelationTableObj().newInstance().beginEdit();

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
				else if( attrLocalName.equals( "DbName" ) ) {
					if( attrDbName != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrDbName = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Suffix" ) ) {
					if( attrSuffix != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrSuffix = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "FromIndex" ) ) {
					if( attrFromIndex != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrFromIndex = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "ToIndex" ) ) {
					if( attrToIndex != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrToIndex = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "Narrowed" ) ) {
					if( attrNarrowed != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrNarrowed = attrs.getValue( idxAttr );
				}
				else if( attrLocalName.equals( "PopDepChain" ) ) {
					if( attrPopDepChain != null ) {
						throw new YCFLibUniqueIndexViolationException( getClass(),
							S_ProcName,
							S_LocalName,
							attrLocalName );
					}
					attrPopDepChain = attrs.getValue( idxAttr );
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
			if( ( attrFromIndex == null ) || ( attrFromIndex.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"FromIndex" );
			}
			if( ( attrToIndex == null ) || ( attrToIndex.length() <= 0 ) ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"ToIndex" );
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
			curContext.putNamedValue( "DbName", attrDbName );
			curContext.putNamedValue( "Suffix", attrSuffix );
			curContext.putNamedValue( "FromIndex", attrFromIndex );
			curContext.putNamedValue( "ToIndex", attrToIndex );
			curContext.putNamedValue( "Narrowed", attrNarrowed );
			curContext.putNamedValue( "PopDepChain", attrPopDepChain );

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

			String natDbName = attrDbName;
			editBuff.setOptionalDbName( natDbName );

			String natSuffix = attrSuffix;
			editBuff.setOptionalSuffix( natSuffix );

			editBuff.setRequiredIsRequired( true );

			editBuff.setRequiredIsXsdContainer( false );

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

			if( scopeObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"scopeObj" );
			}
			else if( scopeObj instanceof IYCFBamTableObj ) {
				refFromTable = (IYCFBamTableObj) scopeObj;
				editBuff.setRequiredContainerFromTable( refFromTable );
				refRelTenant = (IYCFBamTenantObj)editBuff.getRequiredOwnerRelTenant();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"scopeObj",
					scopeObj,
					"IYCFBamTableObj" );
			}

			// Resolve and apply Owner reference

			if( refRelTenant == null ) {
				if( scopeObj instanceof IYCFBamTenantObj ) {
					refRelTenant = (IYCFBamTenantObj) scopeObj;
					editBuff.setRequiredOwnerRelTenant( refRelTenant );
				}
				else {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Owner<RelTenant>" );
				}
			}

			refTenant = refRelTenant;
			// Lookup refRelationType by key name value attr
			refRelationType = IYCFBamSchema.RelationTypeEnum.Superclass;
			editBuff.setRequiredRelationType( refRelationType );

			// Lookup refFromIndex by qualified name
			if( ( attrFromIndex != null ) && ( attrFromIndex.length() > 0 ) ) {
				refFromIndex = (IYCFBamIndexObj)(refFromTable.getNamedObject( attrFromIndex ) );
				if( refFromIndex == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve FromIndex reference qualified name \"" + attrFromIndex + "\" to table Index" );
				}
			}
			else {
				refFromIndex = null;
			}
			editBuff.setRequiredLookupFromIndex( refFromIndex );

			// Lookup refToIndex by qualified name
			if( ( attrToIndex != null ) && ( attrToIndex.length() > 0 ) ) {
				refToIndex = (IYCFBamIndexObj)(editBuff.getNamedObject( schemaObj.getIndexTableObj().getObjQualifyingClass(),
					attrToIndex ) );
				if( refToIndex == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve ToIndex reference qualified name \"" + attrToIndex + "\" to table Index" );
				}
			}
			else {
				refToIndex = null;
			}
			editBuff.setRequiredLookupToIndex( refToIndex );
			editBuff.setRequiredLookupToTable( refToIndex.getRequiredContainerTable() );

			// Lookup refNarrowed by qualified name
			if( ( attrNarrowed != null ) && ( attrNarrowed.length() > 0 ) ) {
				refNarrowed = (IYCFBamRelationObj)(editBuff.getNamedObject( schemaObj.getRelationTableObj().getObjQualifyingClass(),
					attrNarrowed ) );
				if( refNarrowed == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"Resolve Narrowed reference qualified name \"" + attrNarrowed + "\" to table Relation" );
				}
			}
			else {
				refNarrowed = null;
			}
			editBuff.setOptionalLookupNarrowed( refNarrowed );

			IYCFBamRelationEditObj editRelation = editBuff;
			IYCFBamRelationObj origRelation = (IYCFBamRelationObj)editRelation.create();
			editRelation = null;

			curContext.putNamedValue( "Object", origRelation );

			int firstDot;
			IYCFBamRelationTableObj relationTable = schemaObj.getRelationTableObj();

			if( attrPopDepChain != null ) {
				IYCFBamTableObj curTable = refFromTable;
				firstDot = attrPopDepChain.indexOf( '.' );
				String nextRelationName;
				String remainder;
				if( firstDot > 0 ) {
					nextRelationName = attrPopDepChain.substring( 0, firstDot );
					remainder = attrPopDepChain.substring( firstDot + 1 );
				}
				else {
					nextRelationName = attrPopDepChain;
					remainder = null;
				}
				IYCFBamRelationObj resolvedRelation = resolveInheritedRelation( relationTable, curTable, nextRelationName );
				if( resolvedRelation == null ) {
					throw new YCFLibRuntimeException( getClass(),
							S_ProcName,
							getParser().getLocationInfo() + "Relation \""
								+ nextRelationName
								+ "\" not found for table \""
								+ curTable.getRequiredContainerSchemaDef().getRequiredName()
								+ "."
								+ curTable.getRequiredName()
								+ "\"" );
				}
				IYCFBamPopTopDepObj origTopDep = schemaObj.getPopTopDepTableObj().newInstance();
				IYCFBamPopTopDepEditObj editTopDep = (IYCFBamPopTopDepEditObj)origTopDep.beginEdit();
				editTopDep.setRequiredOwnerTenant( refFromTable.getRequiredOwnerTenant() );
				editTopDep.setRequiredContainerContRelation( origRelation );
				editTopDep.setRequiredName( "PopTopDep_" + resolvedRelation.getRequiredName() );
				editTopDep.setRequiredLookupRelation( resolvedRelation );
				origTopDep = (IYCFBamPopTopDepObj)editTopDep.create();

				if( remainder != null ) {
					curTable = origTopDep.getRequiredLookupRelation().getRequiredLookupToTable();
					firstDot = remainder.indexOf( '.' );
					if( firstDot > 0 ) {
						nextRelationName = remainder.substring( 0, firstDot );
						remainder = remainder.substring( firstDot + 1 );
					}
					else {
						nextRelationName = remainder;
						remainder = null;
					}
					resolvedRelation = resolveInheritedRelation( relationTable, curTable, nextRelationName );
					if( resolvedRelation == null ) {
						throw new YCFLibRuntimeException( getClass(),
								S_ProcName,
								getParser().getLocationInfo() + "Relation \""
									+ nextRelationName
									+ "\" not found for table \""
									+ curTable.getRequiredContainerSchemaDef().getRequiredName()
									+ "."
									+ curTable.getRequiredName()
									+ "\"" );
					}
					IYCFBamPopSubDep1Obj origSubDep1 = schemaObj.getPopSubDep1TableObj().newInstance();
					IYCFBamPopSubDep1EditObj editSubDep1 = (IYCFBamPopSubDep1EditObj)origSubDep1.beginEdit();
					editSubDep1.setRequiredOwnerTenant( refFromTable.getRequiredOwnerTenant() );
					editSubDep1.setRequiredContainerContPopTopDep( origTopDep );
					editSubDep1.setRequiredName( resolvedRelation.getRequiredName() );
					editSubDep1.setRequiredLookupRelation( resolvedRelation );
					origSubDep1 = (IYCFBamPopSubDep1Obj)editSubDep1.create();

					if( remainder != null ) {
						curTable = origSubDep1.getRequiredLookupRelation().getRequiredLookupToTable();
						firstDot = remainder.indexOf( '.' );
						if( firstDot > 0 ) {
							nextRelationName = remainder.substring( 0, firstDot );
							remainder = remainder.substring( firstDot + 1 );
						}
						else {
							nextRelationName = remainder;
							remainder = null;
						}
						resolvedRelation = resolveInheritedRelation( relationTable, curTable, nextRelationName );
						if( resolvedRelation == null ) {
							throw new YCFLibRuntimeException( getClass(),
									S_ProcName,
									getParser().getLocationInfo() + "Relation \""
										+ nextRelationName
										+ "\" not found for table \""
										+ curTable.getRequiredContainerSchemaDef().getRequiredName()
										+ "."
										+ curTable.getRequiredName()
										+ "\"" );
						}
						IYCFBamPopSubDep2Obj origSubDep2 = schemaObj.getPopSubDep2TableObj().newInstance();
						IYCFBamPopSubDep2EditObj editSubDep2 = (IYCFBamPopSubDep2EditObj)origSubDep2.beginEdit();
						editSubDep2.setRequiredOwnerTenant( refFromTable.getRequiredOwnerTenant() );
						editSubDep2.setRequiredContainerPopSubDep1( origSubDep1 );
						editSubDep2.setRequiredName( resolvedRelation.getRequiredName() );
						editSubDep2.setRequiredLookupRelation( resolvedRelation );
						origSubDep2 = (IYCFBamPopSubDep2Obj)editSubDep2.create();

						if( remainder != null ) {
							curTable = origSubDep2.getRequiredLookupRelation().getRequiredLookupToTable();
							firstDot = remainder.indexOf( '.' );
							if( firstDot > 0 ) {
								throw new YCFLibRuntimeException( getClass(),
									S_ProcName,
									"Relation PopDepChain is invalid -- only 4 levels of indirection are supported" );
							}
							else {
								nextRelationName = remainder;
								remainder = null;
							}
							resolvedRelation = resolveInheritedRelation( relationTable, curTable, nextRelationName );
							if( resolvedRelation == null ) {
								throw new YCFLibRuntimeException( getClass(),
										S_ProcName,
										getParser().getLocationInfo() + "Relation \""
											+ nextRelationName
											+ "\" not found for table \""
											+ curTable.getRequiredContainerSchemaDef().getRequiredName()
											+ "."
											+ curTable.getRequiredName()
											+ "\"" );
							}
							IYCFBamPopSubDep3Obj origSubDep3 = schemaObj.getPopSubDep3TableObj().newInstance();
							IYCFBamPopSubDep3EditObj editSubDep3 = (IYCFBamPopSubDep3EditObj)origSubDep3.beginEdit();
							editSubDep3.setRequiredOwnerTenant( refFromTable.getRequiredOwnerTenant() );
							editSubDep3.setRequiredContainerPopSubDep2( origSubDep2 );
							editSubDep3.setRequiredName( resolvedRelation.getRequiredName() );
							editSubDep3.setRequiredLookupRelation( resolvedRelation );
							origSubDep3 = (IYCFBamPopSubDep3Obj)editSubDep3.create();
						}
					}
				}
			}
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

	protected IYCFBamRelationObj resolveInheritedRelation( IYCFBamRelationTableObj relationTable, IYCFBamTableObj tbl, String relName ) {
		IYCFBamRelationObj curRelation;
		IYCFBamRelationObj superRelation;
		IYCFBamRelationObj retval = null;
		IYCFBamTableObj curTable = tbl;
		while( ( retval == null ) && ( curTable != null ) ) {
			retval = relationTable.readRelationByUNameIdx( curTable.getRequiredTenantId(),
					curTable.getRequiredId(),
					relName );
			if( retval == null ) {
				Iterator<IYCFBamRelationObj> relIter = curTable.getOptionalComponentsRelation().iterator();
				superRelation = null;
				while( ( superRelation == null ) && relIter.hasNext() ) {
					curRelation = relIter.next();
					if( curRelation.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
						superRelation = curRelation;
					}
				}
				if( superRelation != null ) {
					curTable = superRelation.getRequiredLookupToTable();
				}
				else {
					curTable = null;
				}
			}
		}
		return( retval );
	}

	public void endElement(
		String		uri,
		String		localName,
		String		qName )
	throws SAXException
	{
	}
}

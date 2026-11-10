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
import org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF.*;

/*
 *	YCFBamXmlLoaderSchemaRefParse XML SAX Element Handler implementation
 *	for SchemaRef.
 */
public class YCFBamXmlLoaderSchemaRefHandler
	extends YCFLibXmlCoreElementHandler
{
	public YCFBamXmlLoaderSchemaRefHandler( YCFBamXmlLoader saxLoader ) {
		super( saxLoader );
	}

	protected void importMergeSchemaTypes( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTypes";
		List<IYCFBamValueObj> components = src.getOptionalComponentsTypes();
		Iterator<IYCFBamValueObj> componentValues = components.iterator();
		IYCFBamValueTableObj dstValueTableObj = dst.getSchema().getValueTableObj();
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		IYCFBamTableObj srcDispenser;
		IYCFBamTableObj dstDispenser;
		IYCFBamValueObj value;
		while( componentValues.hasNext() ) {
			value = componentValues.next();
			if( null == dstValueTableObj.readValueByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), value.getRequiredName() ) ) {
				if( value instanceof IYCFBamBoolTypeObj ) {
					IYCFBamBoolTypeTableObj GenTableObj = dst.getSchema().getBoolTypeTableObj();
					IYCFBamBoolTypeObj srcGenDef = (IYCFBamBoolTypeObj)value;
					IYCFBamBoolTypeObj dstOrigDef = GenTableObj.readBoolTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamBoolTypeEditObj dstEditDef = (IYCFBamBoolTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalFalseString( srcGenDef.getOptionalFalseString() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalNullString( srcGenDef.getOptionalNullString() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setOptionalTrueString( srcGenDef.getOptionalTrueString() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamBoolTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamBlobTypeObj ) {
					IYCFBamBlobTypeTableObj GenTableObj = dst.getSchema().getBlobTypeTableObj();
					IYCFBamBlobTypeObj srcGenDef = (IYCFBamBlobTypeObj)value;
					IYCFBamBlobTypeObj dstOrigDef = GenTableObj.readBlobTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamBlobTypeEditObj dstEditDef = (IYCFBamBlobTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamBlobTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamId16GenObj ) {
					IYCFBamId16GenTableObj GenTableObj = dst.getSchema().getId16GenTableObj();
					IYCFBamId16GenObj srcGenDef = (IYCFBamId16GenObj)value;
					IYCFBamId16GenObj dstOrigGenDef = GenTableObj.readId16GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamId16GenEditObj dstEditGenDef = (IYCFBamId16GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditGenDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamId16GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamId32GenObj ) {
					IYCFBamId32GenTableObj GenTableObj = dst.getSchema().getId32GenTableObj();
					IYCFBamId32GenObj srcGenDef = (IYCFBamId32GenObj)value;
					IYCFBamId32GenObj dstOrigGenDef = GenTableObj.readId32GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamId32GenEditObj dstEditGenDef = (IYCFBamId32GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditGenDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamId32GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamId64GenObj ) {
					IYCFBamId64GenTableObj GenTableObj = dst.getSchema().getId64GenTableObj();
					IYCFBamId64GenObj srcGenDef = (IYCFBamId64GenObj)value;
					IYCFBamId64GenObj dstOrigGenDef = GenTableObj.readId64GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamId64GenEditObj dstEditGenDef = (IYCFBamId64GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditGenDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamId64GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamUuidGenObj ) {
					IYCFBamUuidGenTableObj GenTableObj = dst.getSchema().getUuidGenTableObj();
					IYCFBamUuidGenObj srcGenDef = (IYCFBamUuidGenObj)value;
					IYCFBamUuidGenObj dstOrigGenDef = GenTableObj.readUuidGenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamUuidGenEditObj dstEditGenDef = (IYCFBamUuidGenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamUuidGenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamUuid6GenObj ) {
					IYCFBamUuid6GenTableObj GenTableObj = dst.getSchema().getUuid6GenTableObj();
					IYCFBamUuid6GenObj srcGenDef = (IYCFBamUuid6GenObj)value;
					IYCFBamUuid6GenObj dstOrigGenDef = GenTableObj.readUuid6GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamUuid6GenEditObj dstEditGenDef = (IYCFBamUuid6GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamUuid6GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash128GenObj ) {
					IYCFBamDbKeyHash128GenTableObj GenTableObj = dst.getSchema().getDbKeyHash128GenTableObj();
					IYCFBamDbKeyHash128GenObj srcGenDef = (IYCFBamDbKeyHash128GenObj)value;
					IYCFBamDbKeyHash128GenObj dstOrigGenDef = GenTableObj.readDbKeyHash128GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash128GenEditObj dstEditGenDef = (IYCFBamDbKeyHash128GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamDbKeyHash128GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash160GenObj ) {
					IYCFBamDbKeyHash160GenTableObj GenTableObj = dst.getSchema().getDbKeyHash160GenTableObj();
					IYCFBamDbKeyHash160GenObj srcGenDef = (IYCFBamDbKeyHash160GenObj)value;
					IYCFBamDbKeyHash160GenObj dstOrigGenDef = GenTableObj.readDbKeyHash160GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash160GenEditObj dstEditGenDef = (IYCFBamDbKeyHash160GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamDbKeyHash160GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash224GenObj ) {
					IYCFBamDbKeyHash224GenTableObj GenTableObj = dst.getSchema().getDbKeyHash224GenTableObj();
					IYCFBamDbKeyHash224GenObj srcGenDef = (IYCFBamDbKeyHash224GenObj)value;
					IYCFBamDbKeyHash224GenObj dstOrigGenDef = GenTableObj.readDbKeyHash224GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash224GenEditObj dstEditGenDef = (IYCFBamDbKeyHash224GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamDbKeyHash224GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash256GenObj ) {
					IYCFBamDbKeyHash256GenTableObj GenTableObj = dst.getSchema().getDbKeyHash256GenTableObj();
					IYCFBamDbKeyHash256GenObj srcGenDef = (IYCFBamDbKeyHash256GenObj)value;
					IYCFBamDbKeyHash256GenObj dstOrigGenDef = GenTableObj.readDbKeyHash256GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash256GenEditObj dstEditGenDef = (IYCFBamDbKeyHash256GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamDbKeyHash256GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash384GenObj ) {
					IYCFBamDbKeyHash384GenTableObj GenTableObj = dst.getSchema().getDbKeyHash384GenTableObj();
					IYCFBamDbKeyHash384GenObj srcGenDef = (IYCFBamDbKeyHash384GenObj)value;
					IYCFBamDbKeyHash384GenObj dstOrigGenDef = GenTableObj.readDbKeyHash384GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash384GenEditObj dstEditGenDef = (IYCFBamDbKeyHash384GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamDbKeyHash384GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash512GenObj ) {
					IYCFBamDbKeyHash512GenTableObj GenTableObj = dst.getSchema().getDbKeyHash512GenTableObj();
					IYCFBamDbKeyHash512GenObj srcGenDef = (IYCFBamDbKeyHash512GenObj)value;
					IYCFBamDbKeyHash512GenObj dstOrigGenDef = GenTableObj.readDbKeyHash512GenByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigGenDef == null ) {

						srcDispenser = srcGenDef.getOptionalLookupDispenser();
						if( srcDispenser != null ) {
							dstDispenser = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
								dst.getRequiredId(),
								srcDispenser.getRequiredName() );
							if( dstDispenser == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstDispenser " + srcDispenser.getRequiredName() );
							}
						}
						else {
							dstDispenser = null;
						}

						dstOrigGenDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash512GenEditObj dstEditGenDef = (IYCFBamDbKeyHash512GenEditObj)dstOrigGenDef.beginEdit();
						dstEditGenDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditGenDef.setRequiredContainerSchemaDef( dst );
						dstEditGenDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditGenDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditGenDef.setOptionalLookupDispenser( dstDispenser );
						dstEditGenDef.setRequiredSlice( srcGenDef.getRequiredSlice() );
						dstEditGenDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditGenDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditGenDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditGenDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditGenDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditGenDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditGenDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditGenDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigGenDef = (IYCFBamDbKeyHash512GenObj)dstEditGenDef.create();
						dstEditGenDef = null;
					}
				}
				else if( value instanceof IYCFBamEnumTypeObj ) {
					IYCFBamEnumTypeTableObj GenTableObj = dst.getSchema().getEnumTypeTableObj();
					IYCFBamEnumTagTableObj srcEnumTagTableObj = src.getSchema().getEnumTagTableObj();
					IYCFBamEnumTagTableObj dstEnumTagTableObj = dst.getSchema().getEnumTagTableObj();
					IYCFBamEnumTypeObj srcGenDef = (IYCFBamEnumTypeObj)value;
					IYCFBamEnumTypeObj dstOrigDef = GenTableObj.readEnumTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamEnumTypeEditObj dstEditDef = (IYCFBamEnumTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamEnumTypeObj)dstEditDef.create();
						dstEditDef = null;

						List<IYCFBamEnumTagObj> srcOrigEnumTags = srcEnumTagTableObj.readEnumTagByEnumIdx( srcGenDef.getRequiredTenantId(), srcGenDef.getRequiredId() );
						if( srcOrigEnumTags != null ) {
							IYCFBamEnumTagObj srcEnumTag;
							IYCFBamEnumTagObj dstOrigEnumTag;
							IYCFBamEnumTagEditObj dstEditEnumTag;
							Iterator<IYCFBamEnumTagObj> iterSrcEnumTag = srcOrigEnumTags.iterator();
							if( iterSrcEnumTag != null ) {
								while( iterSrcEnumTag.hasNext() ) {
									srcEnumTag = iterSrcEnumTag.next();
									if( srcEnumTag != null ) {
										dstOrigEnumTag = dstEnumTagTableObj.readEnumTagByEnumNameIdx( dstOrigDef.getRequiredTenantId(), dstOrigDef.getRequiredId(), srcEnumTag.getRequiredName() );
										if( dstOrigEnumTag == null ) {
											dstOrigEnumTag = dstEnumTagTableObj.newInstance();
											dstEditEnumTag = (IYCFBamEnumTagEditObj)dstOrigEnumTag.beginEdit();
											dstEditEnumTag.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
											dstEditEnumTag.setRequiredContainerEnumDef( dstOrigDef );
											dstEditEnumTag.setRequiredName( srcEnumTag.getRequiredName() );
											dstEditEnumTag.setOptionalEnumCode( srcEnumTag.getOptionalEnumCode() );
											lookupSchema = srcEnumTag.getOptionalLookupDefSchema();
											if( lookupSchema == null ) {
												lookupSchema = src;
											}
											dstEditEnumTag.setOptionalLookupDefSchema( lookupSchema );
											dstOrigEnumTag = (IYCFBamEnumTagObj)dstEditEnumTag.create();
											dstEditEnumTag = null;
										}
									}
								}
							}
						}
					}
				}
				else if( value instanceof IYCFBamInt16TypeObj ) {
					IYCFBamInt16TypeTableObj GenTableObj = dst.getSchema().getInt16TypeTableObj();
					IYCFBamInt16TypeObj srcGenDef = (IYCFBamInt16TypeObj)value;
					IYCFBamInt16TypeObj dstOrigDef = GenTableObj.readInt16TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamInt16TypeEditObj dstEditDef = (IYCFBamInt16TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamInt16TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamInt32TypeObj ) {
					IYCFBamInt32TypeTableObj GenTableObj = dst.getSchema().getInt32TypeTableObj();
					IYCFBamInt32TypeObj srcGenDef = (IYCFBamInt32TypeObj)value;
					IYCFBamInt32TypeObj dstOrigDef = GenTableObj.readInt32TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamInt32TypeEditObj dstEditDef = (IYCFBamInt32TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamInt32TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamInt64TypeObj ) {
					IYCFBamInt64TypeTableObj GenTableObj = dst.getSchema().getInt64TypeTableObj();
					IYCFBamInt64TypeObj srcGenDef = (IYCFBamInt64TypeObj)value;
					IYCFBamInt64TypeObj dstOrigDef = GenTableObj.readInt64TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamInt64TypeEditObj dstEditDef = (IYCFBamInt64TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamInt64TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamUInt16TypeObj ) {
					IYCFBamUInt16TypeTableObj GenTableObj = dst.getSchema().getUInt16TypeTableObj();
					IYCFBamUInt16TypeObj srcGenDef = (IYCFBamUInt16TypeObj)value;
					IYCFBamUInt16TypeObj dstOrigDef = GenTableObj.readUInt16TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamUInt16TypeEditObj dstEditDef = (IYCFBamUInt16TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUInt16TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamUInt32TypeObj ) {
					IYCFBamUInt32TypeTableObj GenTableObj = dst.getSchema().getUInt32TypeTableObj();
					IYCFBamUInt32TypeObj srcGenDef = (IYCFBamUInt32TypeObj)value;
					IYCFBamUInt32TypeObj dstOrigDef = GenTableObj.readUInt32TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamUInt32TypeEditObj dstEditDef = (IYCFBamUInt32TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUInt32TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamUInt64TypeObj ) {
					IYCFBamUInt64TypeTableObj GenTableObj = dst.getSchema().getUInt64TypeTableObj();
					IYCFBamUInt64TypeObj srcGenDef = (IYCFBamUInt64TypeObj)value;
					IYCFBamUInt64TypeObj dstOrigDef = GenTableObj.readUInt64TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamUInt64TypeEditObj dstEditDef = (IYCFBamUInt64TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUInt64TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamNumberTypeObj ) {
					IYCFBamNumberTypeTableObj GenTableObj = dst.getSchema().getNumberTypeTableObj();
					IYCFBamNumberTypeObj srcGenDef = (IYCFBamNumberTypeObj)value;
					IYCFBamNumberTypeObj dstOrigDef = GenTableObj.readNumberTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamNumberTypeEditObj dstEditDef = (IYCFBamNumberTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setRequiredDigits( srcGenDef.getRequiredDigits() );
						dstEditDef.setRequiredPrecis( srcGenDef.getRequiredPrecis() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamNumberTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamFloatTypeObj ) {
					IYCFBamFloatTypeTableObj GenTableObj = dst.getSchema().getFloatTypeTableObj();
					IYCFBamFloatTypeObj srcGenDef = (IYCFBamFloatTypeObj)value;
					IYCFBamFloatTypeObj dstOrigDef = GenTableObj.readFloatTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamFloatTypeEditObj dstEditDef = (IYCFBamFloatTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamFloatTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDoubleTypeObj ) {
					IYCFBamDoubleTypeTableObj GenTableObj = dst.getSchema().getDoubleTypeTableObj();
					IYCFBamDoubleTypeObj srcGenDef = (IYCFBamDoubleTypeObj)value;
					IYCFBamDoubleTypeObj dstOrigDef = GenTableObj.readDoubleTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDoubleTypeEditObj dstEditDef = (IYCFBamDoubleTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDoubleTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamNmTokensTypeObj ) {
					IYCFBamNmTokensTypeTableObj GenTableObj = dst.getSchema().getNmTokensTypeTableObj();
					IYCFBamNmTokensTypeObj srcGenDef = (IYCFBamNmTokensTypeObj)value;
					IYCFBamNmTokensTypeObj dstOrigDef = GenTableObj.readNmTokensTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamNmTokensTypeEditObj dstEditDef = (IYCFBamNmTokensTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamNmTokensTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamNmTokenTypeObj ) {
					IYCFBamNmTokenTypeTableObj GenTableObj = dst.getSchema().getNmTokenTypeTableObj();
					IYCFBamNmTokenTypeObj srcGenDef = (IYCFBamNmTokenTypeObj)value;
					IYCFBamNmTokenTypeObj dstOrigDef = GenTableObj.readNmTokenTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamNmTokenTypeEditObj dstEditDef = (IYCFBamNmTokenTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamNmTokenTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamStringTypeObj ) {
					IYCFBamStringTypeTableObj GenTableObj = dst.getSchema().getStringTypeTableObj();
					IYCFBamStringTypeObj srcGenDef = (IYCFBamStringTypeObj)value;
					IYCFBamStringTypeObj dstOrigDef = GenTableObj.readStringTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamStringTypeEditObj dstEditDef = (IYCFBamStringTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamStringTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamTextTypeObj ) {
					IYCFBamTextTypeTableObj GenTableObj = dst.getSchema().getTextTypeTableObj();
					IYCFBamTextTypeObj srcGenDef = (IYCFBamTextTypeObj)value;
					IYCFBamTextTypeObj dstOrigDef = GenTableObj.readTextTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamTextTypeEditObj dstEditDef = (IYCFBamTextTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalXmlElementName( srcGenDef.getOptionalXmlElementName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTextTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamTokenTypeObj ) {
					IYCFBamTokenTypeTableObj GenTableObj = dst.getSchema().getTokenTypeTableObj();
					IYCFBamTokenTypeObj srcGenDef = (IYCFBamTokenTypeObj)value;
					IYCFBamTokenTypeObj dstOrigDef = GenTableObj.readTokenTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamTokenTypeEditObj dstEditDef = (IYCFBamTokenTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTokenTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDateTypeObj ) {
					IYCFBamDateTypeTableObj GenTableObj = dst.getSchema().getDateTypeTableObj();
					IYCFBamDateTypeObj srcGenDef = (IYCFBamDateTypeObj)value;
					IYCFBamDateTypeObj dstOrigDef = GenTableObj.readDateTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDateTypeEditObj dstEditDef = (IYCFBamDateTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDateTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamTimeTypeObj ) {
					IYCFBamTimeTypeTableObj GenTableObj = dst.getSchema().getTimeTypeTableObj();
					IYCFBamTimeTypeObj srcGenDef = (IYCFBamTimeTypeObj)value;
					IYCFBamTimeTypeObj dstOrigDef = GenTableObj.readTimeTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamTimeTypeEditObj dstEditDef = (IYCFBamTimeTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTimeTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamTimestampTypeObj ) {
					IYCFBamTimestampTypeTableObj GenTableObj = dst.getSchema().getTimestampTypeTableObj();
					IYCFBamTimestampTypeObj srcGenDef = (IYCFBamTimestampTypeObj)value;
					IYCFBamTimestampTypeObj dstOrigDef = GenTableObj.readTimestampTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamTimestampTypeEditObj dstEditDef = (IYCFBamTimestampTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTimestampTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamTZDateTypeObj ) {
					IYCFBamTZDateTypeTableObj GenTableObj = dst.getSchema().getTZDateTypeTableObj();
					IYCFBamTZDateTypeObj srcGenDef = (IYCFBamTZDateTypeObj)value;
					IYCFBamTZDateTypeObj dstOrigDef = GenTableObj.readTZDateTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamTZDateTypeEditObj dstEditDef = (IYCFBamTZDateTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTZDateTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamTZTimeTypeObj ) {
					IYCFBamTZTimeTypeTableObj GenTableObj = dst.getSchema().getTZTimeTypeTableObj();
					IYCFBamTZTimeTypeObj srcGenDef = (IYCFBamTZTimeTypeObj)value;
					IYCFBamTZTimeTypeObj dstOrigDef = GenTableObj.readTZTimeTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamTZTimeTypeEditObj dstEditDef = (IYCFBamTZTimeTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTZTimeTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamTZTimestampTypeObj ) {
					IYCFBamTZTimestampTypeTableObj GenTableObj = dst.getSchema().getTZTimestampTypeTableObj();
					IYCFBamTZTimestampTypeObj srcGenDef = (IYCFBamTZTimestampTypeObj)value;
					IYCFBamTZTimestampTypeObj dstOrigDef = GenTableObj.readTZTimestampTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamTZTimestampTypeEditObj dstEditDef = (IYCFBamTZTimestampTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTZTimestampTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamUuidTypeObj ) {
					IYCFBamUuidTypeTableObj GenTableObj = dst.getSchema().getUuidTypeTableObj();
					IYCFBamUuidTypeObj srcGenDef = (IYCFBamUuidTypeObj)value;
					IYCFBamUuidTypeObj dstOrigDef = GenTableObj.readUuidTypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamUuidTypeEditObj dstEditDef = (IYCFBamUuidTypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUuidTypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamUuid6TypeObj ) {
					IYCFBamUuid6TypeTableObj GenTableObj = dst.getSchema().getUuid6TypeTableObj();
					IYCFBamUuid6TypeObj srcGenDef = (IYCFBamUuid6TypeObj)value;
					IYCFBamUuid6TypeObj dstOrigDef = GenTableObj.readUuid6TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamUuid6TypeEditObj dstEditDef = (IYCFBamUuid6TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUuid6TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash128TypeObj ) {
					IYCFBamDbKeyHash128TypeTableObj GenTableObj = dst.getSchema().getDbKeyHash128TypeTableObj();
					IYCFBamDbKeyHash128TypeObj srcGenDef = (IYCFBamDbKeyHash128TypeObj)value;
					IYCFBamDbKeyHash128TypeObj dstOrigDef = GenTableObj.readDbKeyHash128TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash128TypeEditObj dstEditDef = (IYCFBamDbKeyHash128TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash128TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash160TypeObj ) {
					IYCFBamDbKeyHash160TypeTableObj GenTableObj = dst.getSchema().getDbKeyHash160TypeTableObj();
					IYCFBamDbKeyHash160TypeObj srcGenDef = (IYCFBamDbKeyHash160TypeObj)value;
					IYCFBamDbKeyHash160TypeObj dstOrigDef = GenTableObj.readDbKeyHash160TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash160TypeEditObj dstEditDef = (IYCFBamDbKeyHash160TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash160TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash224TypeObj ) {
					IYCFBamDbKeyHash224TypeTableObj GenTableObj = dst.getSchema().getDbKeyHash224TypeTableObj();
					IYCFBamDbKeyHash224TypeObj srcGenDef = (IYCFBamDbKeyHash224TypeObj)value;
					IYCFBamDbKeyHash224TypeObj dstOrigDef = GenTableObj.readDbKeyHash224TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash224TypeEditObj dstEditDef = (IYCFBamDbKeyHash224TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash224TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash256TypeObj ) {
					IYCFBamDbKeyHash256TypeTableObj GenTableObj = dst.getSchema().getDbKeyHash256TypeTableObj();
					IYCFBamDbKeyHash256TypeObj srcGenDef = (IYCFBamDbKeyHash256TypeObj)value;
					IYCFBamDbKeyHash256TypeObj dstOrigDef = GenTableObj.readDbKeyHash256TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash256TypeEditObj dstEditDef = (IYCFBamDbKeyHash256TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash256TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash384TypeObj ) {
					IYCFBamDbKeyHash384TypeTableObj GenTableObj = dst.getSchema().getDbKeyHash384TypeTableObj();
					IYCFBamDbKeyHash384TypeObj srcGenDef = (IYCFBamDbKeyHash384TypeObj)value;
					IYCFBamDbKeyHash384TypeObj dstOrigDef = GenTableObj.readDbKeyHash384TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash384TypeEditObj dstEditDef = (IYCFBamDbKeyHash384TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash384TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else if( value instanceof IYCFBamDbKeyHash512TypeObj ) {
					IYCFBamDbKeyHash512TypeTableObj GenTableObj = dst.getSchema().getDbKeyHash512TypeTableObj();
					IYCFBamDbKeyHash512TypeObj srcGenDef = (IYCFBamDbKeyHash512TypeObj)value;
					IYCFBamDbKeyHash512TypeObj dstOrigDef = GenTableObj.readDbKeyHash512TypeByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
					if( dstOrigDef == null ) {
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash512TypeEditObj dstEditDef = (IYCFBamDbKeyHash512TypeEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerSchemaDef( dst );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash512TypeObj)dstEditDef.create();
						dstEditDef = null;
					}
				}
				else {
					throw new YCFLibUnsupportedClassException( getClass(),
						S_ProcName,
						"value",
						value,
						"Hard-coded list of schema definition types" );
				}
			}
		}
	}

	protected void importMergeSchemaRoles( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaRoles";
		List<IYCFBamSchemaRoleObj> components = src.getOptionalComponentsRoles();
		Iterator<IYCFBamSchemaRoleObj> componentRoles = components.iterator();
		IYCFBamSchemaRoleTableObj dstSchemaRoleTableObj = dst.getSchema().getSchemaRoleTableObj();
		IYCFBamSchemaRoleObj role;
		while( componentRoles.hasNext() ) {
			role = componentRoles.next();
			if( null == dstSchemaRoleTableObj.readSchemaRoleByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), role.getRequiredName() ) ) {
				IYCFBamSchemaRoleObj dstOrigDef = dstSchemaRoleTableObj.newInstance();
				IYCFBamSchemaRoleEditObj dstEditDef = (IYCFBamSchemaRoleEditObj)dstOrigDef.beginEdit();
				dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
				dstEditDef.setRequiredContainerSchemaDef( dst );
				dstEditDef.setRequiredName( role.getRequiredName() );
				dstEditDef.setRequiredIncludes(role.getRequiredIncludes());
				dstEditDef.setRequiredEnables(role.getRequiredEnables());
				dstEditDef.setRequiredRoleScope(role.getRequiredRoleScope());
				IYCFBamSchemaDefObj lookupSchema = role.getOptionalLookupDefSchema();
				if( lookupSchema == null ) {
					lookupSchema = src;
				}
				dstEditDef.setOptionalLookupDefSchema( lookupSchema );
				dstOrigDef = (IYCFBamSchemaRoleObj)dstEditDef.create();
				dstEditDef = null;
			}
		}
	}

	protected void importMergeSchemaTables( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTables";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamTableEditObj editDstTable;
		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(),
				dst.getRequiredId(),
				srcTable.getRequiredName() );
			if( origDstTable == null ) {
				origDstTable = dstTableTableObj.newInstance();
				editDstTable = (IYCFBamTableEditObj)origDstTable.beginEdit();
				editDstTable.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
				editDstTable.setRequiredContainerSchemaDef( dst );
				editDstTable.setRequiredHasAuditColumns( srcTable.getRequiredHasAuditColumns() );
				editDstTable.setRequiredHasHistory( srcTable.getRequiredHasHistory() );
				editDstTable.setRequiredIsInstantiable( srcTable.getRequiredIsInstantiable() );
				editDstTable.setRequiredPageData( srcTable.getRequiredPageData() );
				editDstTable.setRequiredIsMutable( srcTable.getRequiredIsMutable() );
				editDstTable.setRequiredIsServerOnly( srcTable.getRequiredIsServerOnly() );
				editDstTable.setRequiredCodeVis(srcTable.getRequiredCodeVis());
				editDstTable.setOptionalJDb2LUWTableImplementation( srcTable.getOptionalJDb2LUWTableImplementation() );
				editDstTable.setOptionalJDb2LUWTableImport( srcTable.getOptionalJDb2LUWTableImport() );
				editDstTable.setOptionalJDb2LUWTableMembers( srcTable.getOptionalJDb2LUWTableMembers() );
				editDstTable.setOptionalJEditObjImplementation( srcTable.getOptionalJEditObjImplementation() );
				editDstTable.setOptionalJEditObjImport( srcTable.getOptionalJEditObjImport() );
				editDstTable.setOptionalJEditObjInterface( srcTable.getOptionalJEditObjInterface() );
				editDstTable.setOptionalJMSSqlTableImplementation( srcTable.getOptionalJMSSqlTableImplementation() );
				editDstTable.setOptionalJMSSqlTableImport( srcTable.getOptionalJMSSqlTableImport() );
				editDstTable.setOptionalJMSSqlTableMembers( srcTable.getOptionalJMSSqlTableMembers() );
				editDstTable.setOptionalJMySqlTableImplementation( srcTable.getOptionalJMySqlTableImplementation() );
				editDstTable.setOptionalJMySqlTableImport( srcTable.getOptionalJMySqlTableImport() );
				editDstTable.setOptionalJMySqlTableMembers( srcTable.getOptionalJMySqlTableMembers() );
				editDstTable.setOptionalJObjImplementation( srcTable.getOptionalJObjImplementation() );
				editDstTable.setOptionalJObjImport( srcTable.getOptionalJObjImport() );
				editDstTable.setOptionalJObjInterface( srcTable.getOptionalJObjInterface() );
				editDstTable.setOptionalJObjMembers( srcTable.getOptionalJObjMembers() );
				editDstTable.setOptionalJOracleTableImplementation( srcTable.getOptionalJOracleTableImplementation() );
				editDstTable.setOptionalJOracleTableImport( srcTable.getOptionalJOracleTableImport() );
				editDstTable.setOptionalJOracleTableMembers( srcTable.getOptionalJOracleTableMembers() );
				editDstTable.setOptionalJPgSqlTableImplementation( srcTable.getOptionalJPgSqlTableImplementation() );
				editDstTable.setOptionalJPgSqlTableImport( srcTable.getOptionalJPgSqlTableImport() );
				editDstTable.setOptionalJPgSqlTableMembers( srcTable.getOptionalJPgSqlTableMembers() );
				editDstTable.setOptionalJRamTableImplementation( srcTable.getOptionalJRamTableImplementation() );
				editDstTable.setOptionalJRamTableImport( srcTable.getOptionalJRamTableImport() );
				editDstTable.setOptionalJRamTableMembers( srcTable.getOptionalJRamTableMembers() );
				editDstTable.setOptionalJSaxLoaderEndElement( srcTable.getOptionalJSaxLoaderEndElement() );
				editDstTable.setOptionalJSaxLoaderImport( srcTable.getOptionalJSaxLoaderImport() );
				editDstTable.setOptionalJSaxLoaderStartElement( srcTable.getOptionalJSaxLoaderStartElement() );
				editDstTable.setOptionalJTableImplementation( srcTable.getOptionalJTableImplementation() );
				editDstTable.setOptionalJTableImport( srcTable.getOptionalJTableImport() );
				editDstTable.setOptionalJTableInterface( srcTable.getOptionalJTableInterface() );
				editDstTable.setOptionalJTableMembers( srcTable.getOptionalJTableMembers() );
				editDstTable.setOptionalJTableObjImplementation( srcTable.getOptionalJTableObjImplementation() );
				editDstTable.setOptionalJTableObjImport( srcTable.getOptionalJTableObjImport() );
				editDstTable.setOptionalJTableObjInterface( srcTable.getOptionalJTableObjInterface() );
				editDstTable.setOptionalJTableObjMembers( srcTable.getOptionalJTableObjMembers() );
				editDstTable.setOptionalJXMsgClientTableImport( srcTable.getOptionalJXMsgClientTableImport() );
				editDstTable.setOptionalJXMsgClientTableBody( srcTable.getOptionalJXMsgClientTableBody() );
				editDstTable.setOptionalJXMsgRqstTableBody( srcTable.getOptionalJXMsgRqstTableBody() );
				editDstTable.setOptionalJXMsgRqstTableImport( srcTable.getOptionalJXMsgRqstTableImport() );
				editDstTable.setOptionalJXMsgRspnTableBody( srcTable.getOptionalJXMsgRspnTableBody() );
				editDstTable.setOptionalJXMsgRspnTableImport( srcTable.getOptionalJXMsgRspnTableImport() );
				editDstTable.setOptionalJXMsgTableFormatters( srcTable.getOptionalJXMsgTableFormatters() );
				editDstTable.setOptionalJXMsgTableImport( srcTable.getOptionalJXMsgTableImport() );
				editDstTable.setOptionalHppDb2LUWTableImplementation( srcTable.getOptionalHppDb2LUWTableImplementation() );
				editDstTable.setOptionalHppDb2LUWTableInclude( srcTable.getOptionalHppDb2LUWTableInclude() );
				editDstTable.setOptionalHppDb2LUWTableMembers( srcTable.getOptionalHppDb2LUWTableMembers() );
				editDstTable.setOptionalHppEditObjImplementation( srcTable.getOptionalHppEditObjImplementation() );
				editDstTable.setOptionalHppEditObjInclude( srcTable.getOptionalHppEditObjInclude() );
				editDstTable.setOptionalHppEditObjInterface( srcTable.getOptionalHppEditObjInterface() );
				editDstTable.setOptionalHppMSSqlTableImplementation( srcTable.getOptionalHppMSSqlTableImplementation() );
				editDstTable.setOptionalHppMSSqlTableInclude( srcTable.getOptionalHppMSSqlTableInclude() );
				editDstTable.setOptionalHppMSSqlTableMembers( srcTable.getOptionalHppMSSqlTableMembers() );
				editDstTable.setOptionalHppMySqlTableImplementation( srcTable.getOptionalHppMySqlTableImplementation() );
				editDstTable.setOptionalHppMySqlTableInclude( srcTable.getOptionalHppMySqlTableInclude() );
				editDstTable.setOptionalHppMySqlTableMembers( srcTable.getOptionalHppMySqlTableMembers() );
				editDstTable.setOptionalHppObjImplementation( srcTable.getOptionalHppObjImplementation() );
				editDstTable.setOptionalHppObjInclude( srcTable.getOptionalHppObjInclude() );
				editDstTable.setOptionalHppObjInterface( srcTable.getOptionalHppObjInterface() );
				editDstTable.setOptionalHppObjMembers( srcTable.getOptionalHppObjMembers() );
				editDstTable.setOptionalHppOracleTableImplementation( srcTable.getOptionalHppOracleTableImplementation() );
				editDstTable.setOptionalHppOracleTableInclude( srcTable.getOptionalHppOracleTableInclude() );
				editDstTable.setOptionalHppOracleTableMembers( srcTable.getOptionalHppOracleTableMembers() );
				editDstTable.setOptionalHppPgSqlTableImplementation( srcTable.getOptionalHppPgSqlTableImplementation() );
				editDstTable.setOptionalHppPgSqlTableInclude( srcTable.getOptionalHppPgSqlTableInclude() );
				editDstTable.setOptionalHppPgSqlTableMembers( srcTable.getOptionalHppPgSqlTableMembers() );
				editDstTable.setOptionalHppRamTableImplementation( srcTable.getOptionalHppRamTableImplementation() );
				editDstTable.setOptionalHppRamTableInclude( srcTable.getOptionalHppRamTableInclude() );
				editDstTable.setOptionalHppRamTableMembers( srcTable.getOptionalHppRamTableMembers() );
				editDstTable.setOptionalHppSaxLoaderEndElement( srcTable.getOptionalHppSaxLoaderEndElement() );
				editDstTable.setOptionalHppSaxLoaderInclude( srcTable.getOptionalHppSaxLoaderInclude() );
				editDstTable.setOptionalHppSaxLoaderStartElement( srcTable.getOptionalHppSaxLoaderStartElement() );
				editDstTable.setOptionalHppTableImplementation( srcTable.getOptionalHppTableImplementation() );
				editDstTable.setOptionalHppTableInclude( srcTable.getOptionalHppTableInclude() );
				editDstTable.setOptionalHppTableInterface( srcTable.getOptionalHppTableInterface() );
				editDstTable.setOptionalHppTableMembers( srcTable.getOptionalHppTableMembers() );
				editDstTable.setOptionalHppTableObjImplementation( srcTable.getOptionalHppTableObjImplementation() );
				editDstTable.setOptionalHppTableObjInclude( srcTable.getOptionalHppTableObjInclude() );
				editDstTable.setOptionalHppTableObjInterface( srcTable.getOptionalHppTableObjInterface() );
				editDstTable.setOptionalHppTableObjMembers( srcTable.getOptionalHppTableObjMembers() );
				editDstTable.setOptionalHppXMsgClientTableInclude( srcTable.getOptionalHppXMsgClientTableInclude() );
				editDstTable.setOptionalHppXMsgClientTableBody( srcTable.getOptionalHppXMsgClientTableBody() );
				editDstTable.setOptionalHppXMsgRqstTableBody( srcTable.getOptionalHppXMsgRqstTableBody() );
				editDstTable.setOptionalHppXMsgRqstTableInclude( srcTable.getOptionalHppXMsgRqstTableInclude() );
				editDstTable.setOptionalHppXMsgRspnTableBody( srcTable.getOptionalHppXMsgRspnTableBody() );
				editDstTable.setOptionalHppXMsgRspnTableInclude( srcTable.getOptionalHppXMsgRspnTableInclude() );
				editDstTable.setOptionalHppXMsgTableFormatters( srcTable.getOptionalHppXMsgTableFormatters() );
				editDstTable.setOptionalHppXMsgTableInclude( srcTable.getOptionalHppXMsgTableInclude() );
				editDstTable.setOptionalCppDb2LUWTableImplementation( srcTable.getOptionalCppDb2LUWTableImplementation() );
				editDstTable.setOptionalCppDb2LUWTableInclude( srcTable.getOptionalCppDb2LUWTableInclude() );
				editDstTable.setOptionalCppDb2LUWTableMembers( srcTable.getOptionalCppDb2LUWTableMembers() );
				editDstTable.setOptionalCppEditObjImplementation( srcTable.getOptionalCppEditObjImplementation() );
				editDstTable.setOptionalCppEditObjInclude( srcTable.getOptionalCppEditObjInclude() );
				editDstTable.setOptionalCppEditObjInterface( srcTable.getOptionalCppEditObjInterface() );
				editDstTable.setOptionalCppMSSqlTableImplementation( srcTable.getOptionalCppMSSqlTableImplementation() );
				editDstTable.setOptionalCppMSSqlTableInclude( srcTable.getOptionalCppMSSqlTableInclude() );
				editDstTable.setOptionalCppMSSqlTableMembers( srcTable.getOptionalCppMSSqlTableMembers() );
				editDstTable.setOptionalCppMySqlTableImplementation( srcTable.getOptionalCppMySqlTableImplementation() );
				editDstTable.setOptionalCppMySqlTableInclude( srcTable.getOptionalCppMySqlTableInclude() );
				editDstTable.setOptionalCppMySqlTableMembers( srcTable.getOptionalCppMySqlTableMembers() );
				editDstTable.setOptionalCppObjImplementation( srcTable.getOptionalCppObjImplementation() );
				editDstTable.setOptionalCppObjInclude( srcTable.getOptionalCppObjInclude() );
				editDstTable.setOptionalCppObjInterface( srcTable.getOptionalCppObjInterface() );
				editDstTable.setOptionalCppObjMembers( srcTable.getOptionalCppObjMembers() );
				editDstTable.setOptionalCppOracleTableImplementation( srcTable.getOptionalCppOracleTableImplementation() );
				editDstTable.setOptionalCppOracleTableInclude( srcTable.getOptionalCppOracleTableInclude() );
				editDstTable.setOptionalCppOracleTableMembers( srcTable.getOptionalCppOracleTableMembers() );
				editDstTable.setOptionalCppPgSqlTableImplementation( srcTable.getOptionalCppPgSqlTableImplementation() );
				editDstTable.setOptionalCppPgSqlTableInclude( srcTable.getOptionalCppPgSqlTableInclude() );
				editDstTable.setOptionalCppPgSqlTableMembers( srcTable.getOptionalCppPgSqlTableMembers() );
				editDstTable.setOptionalCppRamTableImplementation( srcTable.getOptionalCppRamTableImplementation() );
				editDstTable.setOptionalCppRamTableInclude( srcTable.getOptionalCppRamTableInclude() );
				editDstTable.setOptionalCppRamTableMembers( srcTable.getOptionalCppRamTableMembers() );
				editDstTable.setOptionalCppSaxLoaderEndElement( srcTable.getOptionalCppSaxLoaderEndElement() );
				editDstTable.setOptionalCppSaxLoaderInclude( srcTable.getOptionalCppSaxLoaderInclude() );
				editDstTable.setOptionalCppSaxLoaderStartElement( srcTable.getOptionalCppSaxLoaderStartElement() );
				editDstTable.setOptionalCppTableImplementation( srcTable.getOptionalCppTableImplementation() );
				editDstTable.setOptionalCppTableInclude( srcTable.getOptionalCppTableInclude() );
				editDstTable.setOptionalCppTableInterface( srcTable.getOptionalCppTableInterface() );
				editDstTable.setOptionalCppTableMembers( srcTable.getOptionalCppTableMembers() );
				editDstTable.setOptionalCppTableObjImplementation( srcTable.getOptionalCppTableObjImplementation() );
				editDstTable.setOptionalCppTableObjInclude( srcTable.getOptionalCppTableObjInclude() );
				editDstTable.setOptionalCppTableObjInterface( srcTable.getOptionalCppTableObjInterface() );
				editDstTable.setOptionalCppTableObjMembers( srcTable.getOptionalCppTableObjMembers() );
				editDstTable.setOptionalCppXMsgClientTableInclude( srcTable.getOptionalCppXMsgClientTableInclude() );
				editDstTable.setOptionalCppXMsgClientTableBody( srcTable.getOptionalCppXMsgClientTableBody() );
				editDstTable.setOptionalCppXMsgRqstTableBody( srcTable.getOptionalCppXMsgRqstTableBody() );
				editDstTable.setOptionalCppXMsgRqstTableInclude( srcTable.getOptionalCppXMsgRqstTableInclude() );
				editDstTable.setOptionalCppXMsgRspnTableBody( srcTable.getOptionalCppXMsgRspnTableBody() );
				editDstTable.setOptionalCppXMsgRspnTableInclude( srcTable.getOptionalCppXMsgRspnTableInclude() );
				editDstTable.setOptionalCppXMsgTableFormatters( srcTable.getOptionalCppXMsgTableFormatters() );
				editDstTable.setOptionalCppXMsgTableInclude( srcTable.getOptionalCppXMsgTableInclude() );
				editDstTable.setOptionalCsDb2LUWTableImplementation( srcTable.getOptionalCsDb2LUWTableImplementation() );
				editDstTable.setOptionalCsDb2LUWTableUsing( srcTable.getOptionalCsDb2LUWTableUsing() );
				editDstTable.setOptionalCsDb2LUWTableMembers( srcTable.getOptionalCsDb2LUWTableMembers() );
				editDstTable.setOptionalCsEditObjImplementation( srcTable.getOptionalCsEditObjImplementation() );
				editDstTable.setOptionalCsEditObjUsing( srcTable.getOptionalCsEditObjUsing() );
				editDstTable.setOptionalCsEditObjInterface( srcTable.getOptionalCsEditObjInterface() );
				editDstTable.setOptionalCsMSSqlTableImplementation( srcTable.getOptionalCsMSSqlTableImplementation() );
				editDstTable.setOptionalCsMSSqlTableUsing( srcTable.getOptionalCsMSSqlTableUsing() );
				editDstTable.setOptionalCsMSSqlTableMembers( srcTable.getOptionalCsMSSqlTableMembers() );
				editDstTable.setOptionalCsMySqlTableImplementation( srcTable.getOptionalCsMySqlTableImplementation() );
				editDstTable.setOptionalCsMySqlTableUsing( srcTable.getOptionalCsMySqlTableUsing() );
				editDstTable.setOptionalCsMySqlTableMembers( srcTable.getOptionalCsMySqlTableMembers() );
				editDstTable.setOptionalCsObjImplementation( srcTable.getOptionalCsObjImplementation() );
				editDstTable.setOptionalCsObjUsing( srcTable.getOptionalCsObjUsing() );
				editDstTable.setOptionalCsObjInterface( srcTable.getOptionalCsObjInterface() );
				editDstTable.setOptionalCsObjMembers( srcTable.getOptionalCsObjMembers() );
				editDstTable.setOptionalCsOracleTableImplementation( srcTable.getOptionalCsOracleTableImplementation() );
				editDstTable.setOptionalCsOracleTableUsing( srcTable.getOptionalCsOracleTableUsing() );
				editDstTable.setOptionalCsOracleTableMembers( srcTable.getOptionalCsOracleTableMembers() );
				editDstTable.setOptionalCsPgSqlTableImplementation( srcTable.getOptionalCsPgSqlTableImplementation() );
				editDstTable.setOptionalCsPgSqlTableUsing( srcTable.getOptionalCsPgSqlTableUsing() );
				editDstTable.setOptionalCsPgSqlTableMembers( srcTable.getOptionalCsPgSqlTableMembers() );
				editDstTable.setOptionalCsRamTableImplementation( srcTable.getOptionalCsRamTableImplementation() );
				editDstTable.setOptionalCsRamTableUsing( srcTable.getOptionalCsRamTableUsing() );
				editDstTable.setOptionalCsRamTableMembers( srcTable.getOptionalCsRamTableMembers() );
				editDstTable.setOptionalCsSaxLoaderEndElement( srcTable.getOptionalCsSaxLoaderEndElement() );
				editDstTable.setOptionalCsSaxLoaderUsing( srcTable.getOptionalCsSaxLoaderUsing() );
				editDstTable.setOptionalCsSaxLoaderStartElement( srcTable.getOptionalCsSaxLoaderStartElement() );
				editDstTable.setOptionalCsTableImplementation( srcTable.getOptionalCsTableImplementation() );
				editDstTable.setOptionalCsTableUsing( srcTable.getOptionalCsTableUsing() );
				editDstTable.setOptionalCsTableInterface( srcTable.getOptionalCsTableInterface() );
				editDstTable.setOptionalCsTableMembers( srcTable.getOptionalCsTableMembers() );
				editDstTable.setOptionalCsTableObjImplementation( srcTable.getOptionalCsTableObjImplementation() );
				editDstTable.setOptionalCsTableObjUsing( srcTable.getOptionalCsTableObjUsing() );
				editDstTable.setOptionalCsTableObjInterface( srcTable.getOptionalCsTableObjInterface() );
				editDstTable.setOptionalCsTableObjMembers( srcTable.getOptionalCsTableObjMembers() );
				editDstTable.setOptionalCsXMsgClientTableUsing( srcTable.getOptionalCsXMsgClientTableUsing() );
				editDstTable.setOptionalCsXMsgClientTableBody( srcTable.getOptionalCsXMsgClientTableBody() );
				editDstTable.setOptionalCsXMsgRqstTableBody( srcTable.getOptionalCsXMsgRqstTableBody() );
				editDstTable.setOptionalCsXMsgRqstTableUsing( srcTable.getOptionalCsXMsgRqstTableUsing() );
				editDstTable.setOptionalCsXMsgRspnTableBody( srcTable.getOptionalCsXMsgRspnTableBody() );
				editDstTable.setOptionalCsXMsgRspnTableUsing( srcTable.getOptionalCsXMsgRspnTableUsing() );
				editDstTable.setOptionalCsXMsgTableFormatters( srcTable.getOptionalCsXMsgTableFormatters() );
				editDstTable.setOptionalCsXMsgTableUsing( srcTable.getOptionalCsXMsgTableUsing() );
				editDstTable.setRequiredLoaderBehaviour( srcTable.getRequiredLoaderBehaviour() );
				editDstTable.setRequiredSecScope( srcTable.getRequiredSecScope() );
				editDstTable.setRequiredName( srcTable.getRequiredName() );
				editDstTable.setRequiredTableClassCode( srcTable.getRequiredTableClassCode() );
				editDstTable.setOptionalDbName( srcTable.getOptionalDbName() );
				editDstTable.setOptionalDescription( srcTable.getOptionalDescription() );
				editDstTable.setOptionalLabel( srcTable.getOptionalLabel() );
				editDstTable.setOptionalShortDescription( srcTable.getOptionalShortDescription() );
				editDstTable.setOptionalShortName( srcTable.getOptionalShortName() );
				IYCFBamSchemaDefObj lookupSchema = srcTable.getOptionalLookupDefSchema();
				IYCFBamTableObj srcQualTable = srcTable.getOptionalLookupQualTable();
				if( srcQualTable == null ) {
					editDstTable.setOptionalLookupQualTable( null );
				}
				else {
					String srcQualTableName = srcQualTable.getRequiredName();
					IYCFBamTableObj dstQualTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcQualTableName );
					if( dstQualTable == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							"Could not resolve destination qualifying table " + srcQualTableName + " referenced by table " + editDstTable.getRequiredName() );
					}
					editDstTable.setOptionalLookupQualTable( dstQualTable );
				}
				if( lookupSchema == null ) {
					lookupSchema = src;
				}
				editDstTable.setOptionalLookupDefSchema( lookupSchema );
				origDstTable = (IYCFBamTableObj)editDstTable.create();
				editDstTable = null;

				origDstTable.getSchema().getId16GenTableObj().readId16GenByDispIdx( origDstTable.getRequiredTenantId(),
						origDstTable.getRequiredId() );
				origDstTable.getSchema().getId32GenTableObj().readId32GenByDispIdx( origDstTable.getRequiredTenantId(),
						origDstTable.getRequiredId() );
				origDstTable.getSchema().getId64GenTableObj().readId64GenByDispIdx( origDstTable.getRequiredTenantId(),
						origDstTable.getRequiredId() );
			}
		}
	}

	protected void importMergeSchemaTableColumns( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableColumns";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		IYCFBamValueTableObj dstValueTableObj = dst.getSchema().getValueTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamValueObj value;
		IYCFBamValueObj origDstColumn;
		IYCFBamTableObj dstDispenser;
		IYCFBamTableObj srcDispenser;
		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			List<IYCFBamValueObj> srcColumns = srcTable.getOptionalComponentsColumns();
			Iterator<IYCFBamValueObj> iterSrcColumns = srcColumns.iterator();
			while( iterSrcColumns.hasNext() ) {
				value = iterSrcColumns.next();
				origDstColumn = dstValueTableObj.readValueByUNameIdx( origDstTable.getRequiredTenantId(), origDstTable.getRequiredId(), value.getRequiredName() );
				if( origDstColumn == null ) {
					if( value instanceof IYCFBamTableColObj ) {
						IYCFBamTableColTableObj GenTableObj = dst.getSchema().getTableColTableObj();
						IYCFBamValueTableObj valueTableObj = dst.getSchema().getValueTableObj();
						IYCFBamTableColObj srcGenDef = (IYCFBamTableColObj)value;
						IYCFBamTableColObj dstOrigDef = GenTableObj.readTableColByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
						if( dstOrigDef == null ) {
							IYCFBamValueObj srcLookupData = srcGenDef.getRequiredParentDataType();
							IYCFBamValueObj dstLookupData = valueTableObj.readValueByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(), origDstTable.getRequiredContainerSchemaDef().getRequiredId(), srcLookupData.getRequiredName() );
							if( dstLookupData == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstLookupData" );
							}

							dstOrigDef = GenTableObj.newInstance();
							IYCFBamTableColEditObj dstEditDef = (IYCFBamTableColEditObj)dstOrigDef.beginEdit();
							dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
							dstEditDef.setRequiredContainerTable( origDstTable );
							dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
							dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
							dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
							dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
							dstEditDef.setRequiredParentDataType( dstLookupData );
							dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
							dstEditDef.setOptionalXmlElementName( srcGenDef.getOptionalXmlElementName() );
							dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
							dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
							dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
							dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
							dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
							dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
							IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
							if( lookupSchema == null ) {
								lookupSchema = src;
							}
							dstEditDef.setOptionalLookupDefSchema( lookupSchema );

							dstOrigDef = (IYCFBamTableColObj)dstEditDef.create();
							dstEditDef = null;
						}
					}
					else if( value instanceof IYCFBamBoolColObj ) {
						IYCFBamBoolColTableObj GenTableObj = dst.getSchema().getBoolColTableObj();
						IYCFBamBoolColObj srcGenDef = (IYCFBamBoolColObj)value;
						IYCFBamBoolColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamBoolColEditObj dstEditDef = (IYCFBamBoolColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalFalseString( srcGenDef.getOptionalFalseString() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalNullString( srcGenDef.getOptionalNullString() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setOptionalTrueString( srcGenDef.getOptionalTrueString() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamBoolColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamBlobColObj ) {
						IYCFBamBlobColTableObj GenTableObj = dst.getSchema().getBlobColTableObj();
						IYCFBamBlobColObj srcGenDef = (IYCFBamBlobColObj)value;
						IYCFBamBlobColObj dstOrigDef = GenTableObj.readBlobColByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcGenDef.getRequiredName() );
						dstOrigDef = GenTableObj.newInstance();
						IYCFBamBlobColEditObj dstEditDef = (IYCFBamBlobColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamBlobColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamInt16ColObj ) {
						IYCFBamInt16ColTableObj GenTableObj = dst.getSchema().getInt16ColTableObj();
						IYCFBamInt16ColObj srcGenDef = (IYCFBamInt16ColObj)value;
						IYCFBamInt16ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamInt16ColEditObj dstEditDef = (IYCFBamInt16ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamInt16ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamInt32ColObj ) {
						IYCFBamInt32ColTableObj GenTableObj = dst.getSchema().getInt32ColTableObj();
						IYCFBamInt32ColObj srcGenDef = (IYCFBamInt32ColObj)value;
						IYCFBamInt32ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamInt32ColEditObj dstEditDef = (IYCFBamInt32ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamInt32ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamInt64ColObj ) {
						IYCFBamInt64ColTableObj GenTableObj = dst.getSchema().getInt64ColTableObj();
						IYCFBamInt64ColObj srcGenDef = (IYCFBamInt64ColObj)value;
						IYCFBamInt64ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamInt64ColEditObj dstEditDef = (IYCFBamInt64ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamInt64ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamUInt16ColObj ) {
						IYCFBamUInt16ColTableObj GenTableObj = dst.getSchema().getUInt16ColTableObj();
						IYCFBamUInt16ColObj srcGenDef = (IYCFBamUInt16ColObj)value;
						IYCFBamUInt16ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamUInt16ColEditObj dstEditDef = (IYCFBamUInt16ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUInt16ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamUInt32ColObj ) {
						IYCFBamUInt32ColTableObj GenTableObj = dst.getSchema().getUInt32ColTableObj();
						IYCFBamUInt32ColObj srcGenDef = (IYCFBamUInt32ColObj)value;
						IYCFBamUInt32ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamUInt32ColEditObj dstEditDef = (IYCFBamUInt32ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUInt32ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamUInt64ColObj ) {
						IYCFBamUInt64ColTableObj GenTableObj = dst.getSchema().getUInt64ColTableObj();
						IYCFBamUInt64ColObj srcGenDef = (IYCFBamUInt64ColObj)value;
						IYCFBamUInt64ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamUInt64ColEditObj dstEditDef = (IYCFBamUInt64ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUInt64ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamNumberColObj ) {
						IYCFBamNumberColTableObj GenTableObj = dst.getSchema().getNumberColTableObj();
						IYCFBamNumberColObj srcGenDef = (IYCFBamNumberColObj)value;
						IYCFBamNumberColObj dstOrigDef =  GenTableObj.newInstance();
						IYCFBamNumberColEditObj dstEditDef = (IYCFBamNumberColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setRequiredDigits( srcGenDef.getRequiredDigits() );
						dstEditDef.setRequiredPrecis( srcGenDef.getRequiredPrecis() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamNumberColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamFloatColObj ) {
						IYCFBamFloatColTableObj GenTableObj = dst.getSchema().getFloatColTableObj();
						IYCFBamFloatColObj srcGenDef = (IYCFBamFloatColObj)value;
						IYCFBamFloatColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamFloatColEditObj dstEditDef = (IYCFBamFloatColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamFloatColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDoubleColObj ) {
						IYCFBamDoubleColTableObj GenTableObj = dst.getSchema().getDoubleColTableObj();
						IYCFBamDoubleColObj srcGenDef = (IYCFBamDoubleColObj)value;
						IYCFBamDoubleColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDoubleColEditObj dstEditDef = (IYCFBamDoubleColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalMaxValue( srcGenDef.getOptionalMaxValue() );
						dstEditDef.setOptionalMinValue( srcGenDef.getOptionalMinValue() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDoubleColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamNmTokensColObj ) {
						IYCFBamNmTokensColTableObj GenTableObj = dst.getSchema().getNmTokensColTableObj();
						IYCFBamNmTokensColObj srcGenDef = (IYCFBamNmTokensColObj)value;
						IYCFBamNmTokensColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamNmTokensColEditObj dstEditDef = (IYCFBamNmTokensColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamNmTokensColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamNmTokenColObj ) {
						IYCFBamNmTokenColTableObj GenTableObj = dst.getSchema().getNmTokenColTableObj();
						IYCFBamNmTokenColObj srcGenDef = (IYCFBamNmTokenColObj)value;
						IYCFBamNmTokenColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamNmTokenColEditObj dstEditDef = (IYCFBamNmTokenColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamNmTokenColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamTextColObj ) {
						IYCFBamTextColTableObj GenTableObj = dst.getSchema().getTextColTableObj();
						IYCFBamTextColObj srcGenDef = (IYCFBamTextColObj)value;
						IYCFBamTextColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamTextColEditObj dstEditDef = (IYCFBamTextColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalXmlElementName( srcGenDef.getOptionalXmlElementName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTextColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamStringColObj ) {
						IYCFBamStringColTableObj GenTableObj = dst.getSchema().getStringColTableObj();
						IYCFBamStringColObj srcGenDef = (IYCFBamStringColObj)value;
						IYCFBamStringColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamStringColEditObj dstEditDef = (IYCFBamStringColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setRequiredIsPolymorph( srcGenDef.getRequiredIsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamStringColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamTokenColObj ) {
						IYCFBamTokenColTableObj GenTableObj = dst.getSchema().getTokenColTableObj();
						IYCFBamTokenColObj srcGenDef = (IYCFBamTokenColObj)value;
						IYCFBamTokenColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamTokenColEditObj dstEditDef = (IYCFBamTokenColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredMaxLen( srcGenDef.getRequiredMaxLen() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTokenColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDateColObj ) {
						IYCFBamDateColTableObj GenTableObj = dst.getSchema().getDateColTableObj();
						IYCFBamDateColObj srcGenDef = (IYCFBamDateColObj)value;
						IYCFBamDateColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDateColEditObj dstEditDef = (IYCFBamDateColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDateColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamTimeColObj ) {
						IYCFBamTimeColTableObj GenTableObj = dst.getSchema().getTimeColTableObj();
						IYCFBamTimeColObj srcGenDef = (IYCFBamTimeColObj)value;
						IYCFBamTimeColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamTimeColEditObj dstEditDef = (IYCFBamTimeColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTimeColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamTimestampColObj ) {
						IYCFBamTimestampColTableObj GenTableObj = dst.getSchema().getTimestampColTableObj();
						IYCFBamTimestampColObj srcGenDef = (IYCFBamTimestampColObj)value;
						IYCFBamTimestampColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamTimestampColEditObj dstEditDef = (IYCFBamTimestampColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTimestampColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamTZDateColObj ) {
						IYCFBamTZDateColTableObj GenTableObj = dst.getSchema().getTZDateColTableObj();
						IYCFBamTZDateColObj srcGenDef = (IYCFBamTZDateColObj)value;
						IYCFBamTZDateColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamTZDateColEditObj dstEditDef = (IYCFBamTZDateColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTZDateColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamTZTimeColObj ) {
						IYCFBamTZTimeColTableObj GenTableObj = dst.getSchema().getTZTimeColTableObj();
						IYCFBamTZTimeColObj srcGenDef = (IYCFBamTZTimeColObj)value;
						IYCFBamTZTimeColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamTZTimeColEditObj dstEditDef = (IYCFBamTZTimeColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTZTimeColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamTZTimestampColObj ) {
						IYCFBamTZTimestampColTableObj GenTableObj = dst.getSchema().getTZTimestampColTableObj();
						IYCFBamTZTimestampColObj srcGenDef = (IYCFBamTZTimestampColObj)value;
						IYCFBamTZTimestampColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamTZTimestampColEditObj dstEditDef = (IYCFBamTZTimestampColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamTZTimestampColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamUuidColObj ) {
						IYCFBamUuidColTableObj GenTableObj = dst.getSchema().getUuidColTableObj();
						IYCFBamUuidColObj srcGenDef = (IYCFBamUuidColObj)value;
						IYCFBamUuidColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamUuidColEditObj dstEditDef = (IYCFBamUuidColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUuidColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamUuid6ColObj ) {
						IYCFBamUuid6ColTableObj GenTableObj = dst.getSchema().getUuid6ColTableObj();
						IYCFBamUuid6ColObj srcGenDef = (IYCFBamUuid6ColObj)value;
						IYCFBamUuid6ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamUuid6ColEditObj dstEditDef = (IYCFBamUuid6ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamUuid6ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDbKeyHash128ColObj ) {
						IYCFBamDbKeyHash128ColTableObj GenTableObj = dst.getSchema().getDbKeyHash128ColTableObj();
						IYCFBamDbKeyHash128ColObj srcGenDef = (IYCFBamDbKeyHash128ColObj)value;
						IYCFBamDbKeyHash128ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash128ColEditObj dstEditDef = (IYCFBamDbKeyHash128ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash128ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDbKeyHash160ColObj ) {
						IYCFBamDbKeyHash160ColTableObj GenTableObj = dst.getSchema().getDbKeyHash160ColTableObj();
						IYCFBamDbKeyHash160ColObj srcGenDef = (IYCFBamDbKeyHash160ColObj)value;
						IYCFBamDbKeyHash160ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash160ColEditObj dstEditDef = (IYCFBamDbKeyHash160ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash160ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDbKeyHash224ColObj ) {
						IYCFBamDbKeyHash224ColTableObj GenTableObj = dst.getSchema().getDbKeyHash224ColTableObj();
						IYCFBamDbKeyHash224ColObj srcGenDef = (IYCFBamDbKeyHash224ColObj)value;
						IYCFBamDbKeyHash224ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash224ColEditObj dstEditDef = (IYCFBamDbKeyHash224ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash224ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDbKeyHash256ColObj ) {
						IYCFBamDbKeyHash256ColTableObj GenTableObj = dst.getSchema().getDbKeyHash256ColTableObj();
						IYCFBamDbKeyHash256ColObj srcGenDef = (IYCFBamDbKeyHash256ColObj)value;
						IYCFBamDbKeyHash256ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash256ColEditObj dstEditDef = (IYCFBamDbKeyHash256ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash256ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDbKeyHash384ColObj ) {
						IYCFBamDbKeyHash384ColTableObj GenTableObj = dst.getSchema().getDbKeyHash384ColTableObj();
						IYCFBamDbKeyHash384ColObj srcGenDef = (IYCFBamDbKeyHash384ColObj)value;
						IYCFBamDbKeyHash384ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash384ColEditObj dstEditDef = (IYCFBamDbKeyHash384ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash384ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else if( value instanceof IYCFBamDbKeyHash512ColObj ) {
						IYCFBamDbKeyHash512ColTableObj GenTableObj = dst.getSchema().getDbKeyHash512ColTableObj();
						IYCFBamDbKeyHash512ColObj srcGenDef = (IYCFBamDbKeyHash512ColObj)value;
						IYCFBamDbKeyHash512ColObj dstOrigDef = GenTableObj.newInstance();
						IYCFBamDbKeyHash512ColEditObj dstEditDef = (IYCFBamDbKeyHash512ColEditObj)dstOrigDef.beginEdit();
						dstEditDef.setRequiredOwnerTenant( dst.getRequiredOwnerTenant() );
						dstEditDef.setRequiredContainerTable( origDstTable );
						dstEditDef.setRequiredIsNullable( srcGenDef.getRequiredIsNullable() );
						dstEditDef.setRequiredName( srcGenDef.getRequiredName() );
						dstEditDef.setOptionalDefaultXmlValue( srcGenDef.getOptionalDefaultXmlValue() );
						dstEditDef.setRequiredImplementsPolymorph( srcGenDef.getRequiredImplementsPolymorph() );
						dstEditDef.setOptionalDbName( srcGenDef.getOptionalDbName() );
						dstEditDef.setOptionalDescription( srcGenDef.getOptionalDescription() );
						dstEditDef.setOptionalGenerateId( srcGenDef.getOptionalGenerateId() );
						dstEditDef.setOptionalInitValue( srcGenDef.getOptionalInitValue() );
						dstEditDef.setOptionalLabel( srcGenDef.getOptionalLabel() );
						dstEditDef.setOptionalShortDescription( srcGenDef.getOptionalShortDescription() );
						dstEditDef.setOptionalShortName( srcGenDef.getOptionalShortName() );
						dstEditDef.setRequiredCodeVis(srcGenDef.getRequiredCodeVis());
						IYCFBamSchemaDefObj lookupSchema = srcGenDef.getOptionalLookupDefSchema();
						if( lookupSchema == null ) {
							lookupSchema = src;
						}
						dstEditDef.setOptionalLookupDefSchema( lookupSchema );
						dstOrigDef = (IYCFBamDbKeyHash512ColObj)dstEditDef.create();
						dstEditDef = null;
					}
					else {
						throw new YCFLibUnsupportedClassException( getClass(),
							S_ProcName,
							"srcColumn",
							value,
							"Hard-coded list of table column types" );
					}
				}
			}
		}
	}

	public IYCFBamIndexObj importMergeIndex( IYCFBamTableObj origDstTable, IYCFBamIndexObj srcIndex ) {
		final String S_ProcName = "importMergeIndex";
		IYCFBamIndexTableObj dstIndexTableObj = origDstTable.getSchema().getIndexTableObj();
		String indexName = srcIndex.getRequiredName();
		IYCFBamIndexObj origDstIndex = dstIndexTableObj.readIndexByUNameIdx( origDstTable.getRequiredTenantId(),
			origDstTable.getRequiredId(),
			indexName );
		if( origDstIndex != null ) {
			return( origDstIndex );
		}

		IYCFBamSchemaDefObj defSchema = srcIndex.getOptionalLookupDefSchema();
		if( defSchema == null ) {
			defSchema = srcIndex.getRequiredContainerTable().getRequiredContainerSchemaDef();
		}

		origDstIndex = dstIndexTableObj.newInstance();
		IYCFBamIndexEditObj editDstIndex = (IYCFBamIndexEditObj)origDstIndex.beginEdit();
		editDstIndex.setRequiredOwnerTenant( origDstTable.getRequiredOwnerTenant() );
		editDstIndex.setRequiredContainerTable( origDstTable );
		editDstIndex.setRequiredIsDbMapped( srcIndex.getRequiredIsDbMapped() );
		editDstIndex.setRequiredIsUnique( srcIndex.getRequiredIsUnique() );
		editDstIndex.setRequiredName( srcIndex.getRequiredName() );
		editDstIndex.setRequiredCodeVis(srcIndex.getRequiredCodeVis() );
		editDstIndex.setOptionalDbName( srcIndex.getOptionalDbName() );
		editDstIndex.setOptionalDescription( srcIndex.getOptionalDescription() );
		editDstIndex.setOptionalLabel( srcIndex.getOptionalLabel() );
		editDstIndex.setOptionalShortDescription( srcIndex.getOptionalShortDescription() );
		editDstIndex.setOptionalShortName( srcIndex.getOptionalShortName() );
		editDstIndex.setOptionalSuffix( srcIndex.getOptionalSuffix() );
		editDstIndex.setOptionalLookupDefSchema( defSchema );
		origDstIndex = (IYCFBamIndexObj)editDstIndex.create();
		editDstIndex = null;

		IYCFBamTenantObj dstTenant = (IYCFBamTenantObj)origDstIndex.getRequiredOwnerTenant();
		IYCFBamTableTableObj dstTableTableObj = origDstIndex.getSchema().getTableTableObj();
		IYCFBamIndexColTableObj dstIndexColTableObj = origDstIndex.getSchema().getIndexColTableObj();
		IYCFBamValueTableObj dstValueTableObj = origDstIndex.getSchema().getValueTableObj();
		IYCFBamTableObj srcTable;
		IYCFBamIndexObj dstIndex = origDstIndex;

		Iterator<IYCFBamIndexColObj> iterSrcColumn;
		List<IYCFBamIndexColObj> srcColumns;
		List<IYCFBamIndexObj> componentIndexes;
		Iterator<IYCFBamIndexObj> iterSrcIndex;
		IYCFBamIndexColObj dstColumn;
		IYCFBamIndexColObj srcColumn;
		IYCFBamIndexColEditObj dstEditColumn;
		IYCFBamIndexColObj dstIndexColumn;
		IYCFBamValueObj dstLookupColumn;
		IYCFBamValueObj srcLookupColumn;

		srcColumns = srcIndex.getOptionalComponentsColumns();
		if( srcColumns != null ) {
			iterSrcColumn = srcColumns.iterator();
			if( iterSrcColumn == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					srcIndex.getRequiredName() + ".srcColumns.iterator()" );
			}

			while( iterSrcColumn.hasNext() ) {
				srcColumn = iterSrcColumn.next();
				srcLookupColumn = srcColumn.getRequiredLookupColumn();
				dstLookupColumn = dstValueTableObj.readValueByUNameIdx( origDstTable.getRequiredTenantId(),
					origDstTable.getRequiredId(),
					srcColumn.getRequiredName() );
				if( dstLookupColumn == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"dstLookupColumn( " + srcColumn.getRequiredName() + " )" );
				}

				dstColumn = dstIndexColTableObj.newInstance();
				dstEditColumn = (IYCFBamIndexColEditObj)dstColumn.beginEdit();
				dstEditColumn.setRequiredOwnerTenant( dstTenant );
				dstEditColumn.setRequiredContainerIndex( origDstIndex );
				dstEditColumn.setRequiredLookupColumn( dstLookupColumn );
				dstEditColumn.setRequiredName( srcColumn.getRequiredName() );
				dstEditColumn.setOptionalDescription( srcColumn.getOptionalDescription() );
				dstEditColumn.setOptionalLabel( srcColumn.getOptionalLabel() );
				dstEditColumn.setOptionalShortDescription( srcColumn.getOptionalShortDescription() );
				dstEditColumn.setOptionalShortName( srcColumn.getOptionalShortName() );
				dstEditColumn.setOptionalLookupDefSchema( defSchema );
				if( null == dstIndexColTableObj.readIndexColByUNameIdx( origDstIndex.getRequiredTenantId(),
					origDstIndex.getRequiredId(),
					srcColumn.getRequiredName() ) )
				{
					dstColumn = (IYCFBamIndexColObj)dstEditColumn.create();
				}
				dstEditColumn = null;
			}
		}

		return( origDstIndex );
	}

	protected void importMergeSchemaTableIndexes( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableIndexes";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamIndexObj dstIndex;
		IYCFBamIndexObj srcIndex;
		List<IYCFBamIndexObj> componentIndexes;
		Iterator<IYCFBamIndexObj> iterSrcIndex;

		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			componentIndexes = srcTable.getOptionalComponentsIndex();
			if( componentIndexes != null ) {
				iterSrcIndex = componentIndexes.iterator();
				while( iterSrcIndex.hasNext() ) {
					srcIndex = iterSrcIndex.next();
					dstIndex = importMergeIndex( origDstTable, srcIndex );
				}
			}
		}
	}

	public IYCFBamServerMethodObj importMergeServerMethod( IYCFBamTableObj origDstTable, IYCFBamServerMethodObj srcServerMethod ) {
		final String S_ProcName = "importMergeServerMethod";
		IYCFBamSchemaDefObj origDstSchemaDef = origDstTable.getRequiredContainerSchemaDef();
		IYCFBamTableTableObj dstTableTableObj = origDstTable.getSchema().getTableTableObj();
		IYCFBamServerMethodTableObj dstServerMethodTableObj = origDstTable.getSchema().getServerMethodTableObj();
		IYCFBamServerProcTableObj dstServerProcTableObj = origDstTable.getSchema().getServerProcTableObj();
		IYCFBamServerObjFuncTableObj dstServerObjFuncTableObj = origDstTable.getSchema().getServerObjFuncTableObj();
		IYCFBamServerListFuncTableObj dstServerListFuncTableObj = origDstTable.getSchema().getServerListFuncTableObj();
		String serverMethodName = srcServerMethod.getRequiredName();
		IYCFBamServerMethodObj origDstServerMethod = dstServerMethodTableObj.readServerMethodByUNameIdx( origDstTable.getRequiredTenantId(),
			origDstTable.getRequiredId(),
			serverMethodName );
		if( origDstServerMethod != null ) {
			return( origDstServerMethod );
		}

		IYCFBamSchemaDefObj defSchema = srcServerMethod.getOptionalLookupDefSchema();
		if( defSchema == null ) {
			defSchema = srcServerMethod.getRequiredContainerForTable().getRequiredContainerSchemaDef();
		}

		if( srcServerMethod instanceof IYCFBamServerProcObj ) {
			origDstServerMethod = dstServerProcTableObj.newInstance();
		}
		else if( srcServerMethod instanceof IYCFBamServerObjFuncObj ) {
			origDstServerMethod = dstServerObjFuncTableObj.newInstance();
		}
		else if( srcServerMethod instanceof IYCFBamServerListFuncObj ) {
			origDstServerMethod = dstServerListFuncTableObj.newInstance();
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"srcServerMethod",
				srcServerMethod,
				"IYCFBamServerProcObj, IYCFBamServerObjFuncObj, IYCFBamServerListFuncObj" );
		}

		IYCFBamServerMethodEditObj editDstServerMethod = (IYCFBamServerMethodEditObj)origDstServerMethod.beginEdit();
		editDstServerMethod.setRequiredOwnerTenant( origDstTable.getRequiredOwnerTenant() );
		editDstServerMethod.setRequiredContainerForTable( origDstTable );
		editDstServerMethod.setRequiredIsInstanceMethod( srcServerMethod.getRequiredIsInstanceMethod() );
		editDstServerMethod.setRequiredName( srcServerMethod.getRequiredName() );
		editDstServerMethod.setRequiredIsServerOnly( srcServerMethod.getRequiredIsServerOnly() );
		editDstServerMethod.setRequiredJMethodBody( srcServerMethod.getRequiredJMethodBody() );
		editDstServerMethod.setRequiredCppMethodBody( srcServerMethod.getRequiredCppMethodBody() );
		editDstServerMethod.setRequiredCsMethodBody( srcServerMethod.getRequiredCsMethodBody() );
		editDstServerMethod.setRequiredCodeVis( srcServerMethod.getRequiredCodeVis() );
		editDstServerMethod.setOptionalDescription( srcServerMethod.getOptionalDescription() );
		editDstServerMethod.setOptionalLabel( srcServerMethod.getOptionalLabel() );
		editDstServerMethod.setOptionalShortDescription( srcServerMethod.getOptionalShortDescription() );
		editDstServerMethod.setOptionalShortName( srcServerMethod.getOptionalShortName() );
		editDstServerMethod.setOptionalSuffix( srcServerMethod.getOptionalSuffix() );
		editDstServerMethod.setOptionalLookupDefSchema( defSchema );
		editDstServerMethod.setOptionalLookupDefSchema( defSchema );
		if( srcServerMethod instanceof IYCFBamServerObjFuncObj ) {
			IYCFBamTableObj srcRetTable = ((IYCFBamServerObjFuncObj)srcServerMethod).getOptionalLookupRetTable();
			IYCFBamTableObj dstRetTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredTenantId(),
				origDstTable.getRequiredSchemaDefId(),
				srcRetTable.getObjName() );
			if( dstRetTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"dstRetTable" );
			}
			((IYCFBamServerObjFuncEditObj)editDstServerMethod).setOptionalLookupRetTable( dstRetTable );
		}
		else if( srcServerMethod instanceof IYCFBamServerListFuncObj ) {
			IYCFBamTableObj srcRetTable = ((IYCFBamServerListFuncObj)srcServerMethod).getOptionalLookupRetTable();
			IYCFBamTableObj dstRetTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredTenantId(),
				origDstTable.getRequiredSchemaDefId(),
				srcRetTable.getObjName() );
			if( dstRetTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"dstRetTable" );
			}
			((IYCFBamServerListFuncEditObj)editDstServerMethod).setOptionalLookupRetTable( dstRetTable );
		}
		origDstServerMethod = (IYCFBamServerMethodObj)editDstServerMethod.create();
		editDstServerMethod = null;

		IYCFBamTenantObj dstTenant = (IYCFBamTenantObj)origDstServerMethod.getRequiredOwnerTenant();
		IYCFBamParamTableObj dstParamTableObj = origDstServerMethod.getSchema().getParamTableObj();
		IYCFBamValueTableObj dstValueTableObj = origDstServerMethod.getSchema().getValueTableObj();

		Iterator<IYCFBamParamObj> iterSrcParam;
		List<IYCFBamParamObj> srcParams;
		IYCFBamParamObj dstParam;
		IYCFBamParamObj srcParam;
		IYCFBamParamEditObj dstEditParam;
		IYCFBamValueObj dstLookupType;
		IYCFBamValueObj srcLookupType;

		srcParams = srcServerMethod.getOptionalComponentsParams();
		if( srcParams != null ) {
			iterSrcParam = srcParams.iterator();
			if( iterSrcParam == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					srcServerMethod.getRequiredName() + ".srcParams.iterator()" );
			}

			while( iterSrcParam.hasNext() ) {
				srcParam = iterSrcParam.next();
				srcLookupType = srcParam.getRequiredLookupType();
				dstLookupType = dstValueTableObj.readValueByUNameIdx( origDstTable.getRequiredTenantId(),
					origDstSchemaDef.getRequiredId(),
					srcLookupType.getRequiredName() );
				if( dstLookupType == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"dstLookupType( " + srcLookupType.getRequiredName() + " )" );
				}

				dstParam = dstParamTableObj.newInstance();
				dstEditParam = (IYCFBamParamEditObj)dstParam.beginEdit();
				dstEditParam.setRequiredOwnerTenant( dstTenant );
				dstEditParam.setRequiredContainerServerMeth( origDstServerMethod );
				dstEditParam.setRequiredLookupType( dstLookupType );
				dstEditParam.setRequiredName( srcParam.getRequiredName() );
				dstEditParam.setOptionalDescription( srcParam.getOptionalDescription() );
				dstEditParam.setOptionalShortDescription( srcParam.getOptionalShortDescription() );
				dstEditParam.setOptionalLookupDefSchema( defSchema );
				if( null == dstParamTableObj.readParamByUNameIdx( origDstServerMethod.getRequiredTenantId(),
					origDstServerMethod.getRequiredId(),
					srcParam.getRequiredName() ) )
				{
					dstParam = (IYCFBamParamObj)dstEditParam.create();
				}
				dstEditParam = null;
			}
		}

		return( origDstServerMethod );
	}

	protected void importMergeSchemaTableServerMethods( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableServerMethods";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamServerMethodObj dstServerMethod;
		IYCFBamServerMethodObj srcServerMethod;
		List<IYCFBamServerMethodObj> componentServerMethods;
		Iterator<IYCFBamServerMethodObj> iterSrcServerMethod;

		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			componentServerMethods = srcTable.getOptionalComponentsServerMethods();
			if( componentServerMethods != null ) {
				iterSrcServerMethod = componentServerMethods.iterator();
				while( iterSrcServerMethod.hasNext() ) {
					srcServerMethod = iterSrcServerMethod.next();
					dstServerMethod = importMergeServerMethod( origDstTable, srcServerMethod );
				}
			}
		}
	}

	protected void importMergeSchemaTableResolvePrimaryIndexes( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableResolvePrimaryIndexes";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		IYCFBamIndexTableObj dstIndexTableObj = dst.getSchema().getIndexTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamIndexObj dstPrimaryIndex;
		IYCFBamIndexObj srcPrimaryIndex;
		IYCFBamTableEditObj editDstTable;
		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			dstPrimaryIndex = origDstTable.getOptionalLookupPrimaryIndex();
			if( dstPrimaryIndex == null ) {
				srcPrimaryIndex = srcTable.getOptionalLookupPrimaryIndex();
				if( srcPrimaryIndex != null ) {
					dstPrimaryIndex = dstIndexTableObj.readIndexByUNameIdx( origDstTable.getRequiredTenantId(), origDstTable.getRequiredId(),
						srcPrimaryIndex.getRequiredName() );
					if( dstPrimaryIndex == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"dstPrimaryIndex " + srcPrimaryIndex.getRequiredName() );
					}

					editDstTable = (IYCFBamTableEditObj)origDstTable.beginEdit();
					editDstTable.setOptionalLookupPrimaryIndex( dstPrimaryIndex );
					editDstTable.update();
					editDstTable = null;
				}
			}
		}
	}

	protected void importMergeSchemaTableResolveLookupIndexes( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableResolveLookupIndexes";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		IYCFBamIndexTableObj dstIndexTableObj = dst.getSchema().getIndexTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamIndexObj dstLookupIndex;
		IYCFBamIndexObj srcLookupIndex;
		IYCFBamTableEditObj editDstTable;
		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			dstLookupIndex = origDstTable.getOptionalLookupLookupIndex();
			if( dstLookupIndex == null ) {
				srcLookupIndex = srcTable.getOptionalLookupLookupIndex();
				if( srcLookupIndex != null ) {
					dstLookupIndex = dstIndexTableObj.readIndexByUNameIdx( origDstTable.getRequiredTenantId(),
						origDstTable.getRequiredId(),
						srcLookupIndex.getRequiredName() );
					if( dstLookupIndex == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"dstLookupIndex " + srcLookupIndex.getRequiredName() );
					}

					editDstTable = (IYCFBamTableEditObj)origDstTable.beginEdit();
					editDstTable.setOptionalLookupLookupIndex( dstLookupIndex );
					editDstTable.update();
					editDstTable = null;
				}
			}
		}
	}

	public IYCFBamRelationObj importMergeRelation( IYCFBamTableObj origDstTable, IYCFBamRelationObj srcRelation ) {
		final String S_ProcName = "importMergeRelation";
		IYCFBamRelationTableObj dstRelationTableObj = origDstTable.getSchema().getRelationTableObj();
		String indexName = srcRelation.getRequiredName();
		IYCFBamRelationObj origDstRelation = dstRelationTableObj.readRelationByUNameIdx( origDstTable.getRequiredTenantId(),
			origDstTable.getRequiredId(),
			indexName );
		if( origDstRelation != null ) {
			return( origDstRelation );
		}

		IYCFBamSchemaDefObj dstSchemaDef = origDstTable.getRequiredContainerSchemaDef();
		IYCFBamSchemaDefObj defSchema = srcRelation.getOptionalLookupDefSchema();
		if( defSchema == null ) {
			defSchema = srcRelation.getRequiredContainerFromTable().getRequiredContainerSchemaDef();
		}

		IYCFBamTableTableObj dstTableTableObj = origDstTable.getSchema().getTableTableObj();
		IYCFBamIndexTableObj dstIndexTableObj = origDstTable.getSchema().getIndexTableObj();
		IYCFBamTableObj srcRelationToTable;
		IYCFBamIndexObj srcRelationToIndex;
		IYCFBamTableObj dstRelationToTable;
		IYCFBamIndexObj dstRelationToIndex;
		IYCFBamTableObj srcRelationFromTable;
		IYCFBamIndexObj srcRelationFromIndex;
		IYCFBamTableObj dstRelationFromTable;
		IYCFBamIndexObj dstRelationFromIndex;
		IYCFBamTenantObj dstTenant = (IYCFBamTenantObj)origDstTable.getRequiredOwnerTenant();

		srcRelationFromTable = srcRelation.getRequiredContainerFromTable();
		dstRelationFromTable = dstTableTableObj.readTableByUNameIdx( dstSchemaDef.getRequiredTenantId(),
			dstSchemaDef.getRequiredId(),
			srcRelationFromTable.getRequiredName() );
		if( dstRelationFromTable == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"dstTableTableObj.readFromTable( " + srcRelationFromTable.getRequiredName() + " )" );
		}

		srcRelationToTable = srcRelation.getRequiredLookupToTable();
		dstRelationToTable = dstTableTableObj.readTableByUNameIdx( dstSchemaDef.getRequiredTenantId(),
			dstSchemaDef.getRequiredId(),
			srcRelationToTable.getRequiredName() );
		if( dstRelationToTable == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"dstTableTableObj.readToTable( " + srcRelationToTable.getRequiredName() + " )" );
		}

		srcRelationFromIndex = srcRelation.getRequiredLookupFromIndex();
		dstRelationFromIndex = dstIndexTableObj.readIndexByUNameIdx( dstRelationFromTable.getRequiredTenantId(),
			dstRelationFromTable.getRequiredId(),
			srcRelationFromIndex.getRequiredName() );
		if( dstRelationFromIndex == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"dstIndexTableObj.readFromIndex( " + srcRelationFromIndex.getRequiredName() + " )" );
		}

		srcRelationToIndex = srcRelation.getRequiredLookupToIndex();
		dstRelationToIndex = dstIndexTableObj.readIndexByUNameIdx( dstRelationToTable.getRequiredTenantId(),
			dstRelationToTable.getRequiredId(),
			srcRelationToIndex.getRequiredName() );
		if( dstRelationToIndex == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"dstIndexTableObj.readToIndex( " + srcRelationToIndex.getRequiredName() + " )" );
		}

		origDstRelation = dstRelationTableObj.newInstance();
		IYCFBamRelationEditObj editDstRelation = (IYCFBamRelationEditObj)origDstRelation.beginEdit();
		editDstRelation.setRequiredOwnerTenant( dstTenant );
		editDstRelation.setRequiredContainerFromTable( origDstTable );
		editDstRelation.setRequiredLookupFromIndex( dstRelationFromIndex );
		editDstRelation.setRequiredLookupToTable( dstRelationToTable );
		editDstRelation.setRequiredLookupToIndex( dstRelationToIndex );
		editDstRelation.setRequiredRelationType( srcRelation.getRequiredRelationType() );
		editDstRelation.setRequiredName( srcRelation.getRequiredName() );
		editDstRelation.setRequiredAllowAddendum( srcRelation.getRequiredAllowAddendum() );
		editDstRelation.setRequiredIsRequired( srcRelation.getRequiredIsRequired() );
		editDstRelation.setRequiredIsXsdContainer( srcRelation.getRequiredIsXsdContainer() );
		editDstRelation.setRequiredIsLateResolver( srcRelation.getRequiredIsLateResolver() );
		editDstRelation.setRequiredCodeVis( srcRelation.getRequiredCodeVis() );
		editDstRelation.setOptionalDbName( srcRelation.getOptionalDbName() );
		editDstRelation.setOptionalDescription( srcRelation.getOptionalDescription() );
		editDstRelation.setOptionalLabel( srcRelation.getOptionalLabel() );
		editDstRelation.setOptionalShortDescription( srcRelation.getOptionalShortDescription() );
		editDstRelation.setOptionalShortName( srcRelation.getOptionalShortName() );
		editDstRelation.setOptionalSuffix( srcRelation.getOptionalSuffix() );
		editDstRelation.setOptionalLookupDefSchema( defSchema );
		origDstRelation = (IYCFBamRelationObj)editDstRelation.create();
		editDstRelation = null;

		IYCFBamIndexColTableObj dstIndexColTableObj = origDstRelation.getSchema().getIndexColTableObj();
		IYCFBamRelationColTableObj dstRelationColTableObj = origDstRelation.getSchema().getRelationColTableObj();
		IYCFBamRelationObj dstRelation = origDstRelation;

		Iterator<IYCFBamRelationColObj> iterSrcColumn;
		List<IYCFBamRelationColObj> srcColumns;
		IYCFBamRelationColObj dstColumn;
		IYCFBamRelationColObj srcColumn;
		IYCFBamRelationColEditObj dstEditColumn;
		IYCFBamRelationColObj dstLookupFromCol;
		IYCFBamIndexColObj srcLookupFromCol;
		IYCFBamIndexColObj srcLookupToCol;
		IYCFBamIndexColObj dstLookupFromIndexCol;
		IYCFBamIndexColObj dstLookupToIndexCol;

		srcColumns = srcRelation.getOptionalComponentsColumns();
		if( srcColumns != null ) {
			iterSrcColumn = srcColumns.iterator();
			if( iterSrcColumn == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					srcRelation.getRequiredName() + ".srcColumns.iterator()" );
			}

			while( iterSrcColumn.hasNext() ) {
				srcColumn = iterSrcColumn.next();
				dstColumn = dstRelationColTableObj.readRelationColByUNameIdx( dstRelation.getRequiredTenantId(),
					dstRelation.getRequiredId(),
					srcColumn.getRequiredName() );
				if( dstColumn == null ) {
					srcLookupFromCol = srcColumn.getRequiredLookupFromCol();
					dstLookupFromCol = dstRelationColTableObj.readRelationColByUNameIdx( origDstRelation.getRequiredTenantId(),
						origDstRelation.getRequiredId(),
						srcColumn.getRequiredName() );

					if( dstLookupFromCol == null ) {
						srcLookupToCol = srcColumn.getRequiredLookupToCol();

						dstLookupToIndexCol = dstIndexColTableObj.readIndexColByUNameIdx( dstRelationToIndex.getRequiredTenantId(),
							dstRelationToIndex.getRequiredId(),
							srcLookupToCol.getRequiredName() );
						if( dstLookupToIndexCol == null ) {
							throw new YCFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"dstLookupToIndexColumn( " + srcLookupToCol.getRequiredName() + " )" );
						}

						dstLookupFromIndexCol = dstIndexColTableObj.readIndexColByUNameIdx( dstRelationFromIndex.getRequiredTenantId(),
							dstRelationFromIndex.getRequiredId(),
							srcLookupFromCol.getRequiredName() );
						if( dstLookupFromIndexCol == null ) {
							throw new YCFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"dstLookupFromIndexColumn( " + srcLookupFromCol.getRequiredName() + " )" );
						}

						dstColumn = dstRelationColTableObj.newInstance();
						dstEditColumn = (IYCFBamRelationColEditObj)dstColumn.beginEdit();
						dstEditColumn.setRequiredOwnerTenant( dstTenant );
						dstEditColumn.setRequiredContainerRelation( origDstRelation );
						dstEditColumn.setRequiredLookupFromCol( dstLookupFromIndexCol );
						dstEditColumn.setRequiredLookupToCol( dstLookupToIndexCol );
						dstEditColumn.setRequiredName( srcColumn.getRequiredName() );
						dstEditColumn.setOptionalDescription( srcColumn.getOptionalDescription() );
						dstEditColumn.setOptionalLabel( srcColumn.getOptionalLabel() );
						dstEditColumn.setOptionalShortDescription( srcColumn.getOptionalShortDescription() );
						dstEditColumn.setOptionalShortName( srcColumn.getOptionalShortName() );
						dstEditColumn.setOptionalLookupDefSchema( defSchema );
						if( null == dstRelationColTableObj.readRelationColByUNameIdx( origDstRelation.getRequiredTenantId(),
							origDstRelation.getRequiredId(),
							srcColumn.getRequiredName() ) )
						{
							dstColumn = (IYCFBamRelationColObj)dstEditColumn.create();
						}
						dstEditColumn = null;
					}
				}
			}
		}

		return( origDstRelation );
	}

	protected void importMergeSchemaTableRelations( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableRelations";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamRelationObj dstRelation;
		IYCFBamRelationObj srcRelation;
		List<IYCFBamRelationObj> componentRelations;
		Iterator<IYCFBamRelationObj> iterSrcRelation;

		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			componentRelations = srcTable.getOptionalComponentsRelation();
			if( componentRelations != null ) {
				iterSrcRelation = componentRelations.iterator();
				while( iterSrcRelation.hasNext() ) {
					srcRelation = iterSrcRelation.next();
					dstRelation = importMergeRelation( origDstTable, srcRelation );
				}
			}
		}
	}

	protected void importMergeRelationPopDeps( IYCFBamTableObj origDstTable, IYCFBamRelationObj srcRelation ) {
		final String S_ProcName = "importMergeRelationPopDeps";
		IYCFBamSchemaDefObj srcSchema = srcRelation.getOptionalLookupDefSchema();
		if( srcSchema == null ) {
			srcSchema = srcRelation.getSchemaDef();
		}
		IYCFBamRelationTableObj dstRelationTableObj = origDstTable.getSchema().getRelationTableObj();
		String relationName = srcRelation.getRequiredName();
		IYCFBamRelationObj origDstRelation = dstRelationTableObj.readRelationByUNameIdx( origDstTable.getRequiredTenantId(),
			origDstTable.getRequiredId(),
			relationName );

		IYCFBamSchemaDefObj dstSchemaDef = origDstTable.getRequiredContainerSchemaDef();
		IYCFBamSchemaDefObj defSchema = srcRelation.getOptionalLookupDefSchema();
		if( defSchema == null ) {
			defSchema = srcRelation.getRequiredContainerFromTable().getRequiredContainerSchemaDef();
		}

		IYCFBamTableTableObj dstTableTableObj = origDstTable.getSchema().getTableTableObj();
		IYCFBamPopTopDepTableObj dstPopTopDepTableObj = origDstTable.getSchema().getPopTopDepTableObj();
		IYCFBamPopSubDep1TableObj dstPopSubDep1TableObj = origDstTable.getSchema().getPopSubDep1TableObj();
		IYCFBamPopSubDep2TableObj dstPopSubDep2TableObj = origDstTable.getSchema().getPopSubDep2TableObj();
		IYCFBamPopSubDep3TableObj dstPopSubDep3TableObj = origDstTable.getSchema().getPopSubDep3TableObj();
		IYCFBamPopTopDepObj srcPopTopDep = null;
		IYCFBamPopSubDep1Obj srcPopSubDep1 = null;
		IYCFBamPopSubDep2Obj srcPopSubDep2 = null;
		IYCFBamPopSubDep3Obj srcPopSubDep3 = null;
		IYCFBamTenantObj dstTenant = (IYCFBamTenantObj)origDstTable.getRequiredOwnerTenant();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj dstTable;
		IYCFBamRelationObj dstRelation;

		Iterator<IYCFBamPopTopDepObj> iterSrcPopTopDep;
		List<IYCFBamPopTopDepObj> srcPopTopDepMap = srcRelation.getOptionalComponentsPopDep();
		if( srcPopTopDepMap != null ) {
			iterSrcPopTopDep = srcPopTopDepMap.iterator();
			if( iterSrcPopTopDep.hasNext() ) {
				srcPopTopDep = iterSrcPopTopDep.next();
				List<IYCFBamPopSubDep1Obj> srcPopSubDep1Map = srcPopTopDep.getOptionalComponentsPopDep();
				Iterator<IYCFBamPopSubDep1Obj> iterSrcPopSubDep1 = srcPopSubDep1Map.iterator();
				if( iterSrcPopSubDep1.hasNext() ) {
					srcPopSubDep1 = iterSrcPopSubDep1.next();
					List<IYCFBamPopSubDep2Obj> srcPopSubDep2Map = srcPopSubDep1.getOptionalComponentsPopDep();
					Iterator<IYCFBamPopSubDep2Obj> iterSrcPopSubDep2 = srcPopSubDep2Map.iterator();
					if( iterSrcPopSubDep2.hasNext() ) {
						srcPopSubDep2 = iterSrcPopSubDep2.next();
						List<IYCFBamPopSubDep3Obj> srcPopSubDep3Map = srcPopSubDep2.getOptionalComponentsPopDep();
						Iterator<IYCFBamPopSubDep3Obj> iterSrcPopSubDep3 = srcPopSubDep3Map.iterator();
						if( iterSrcPopSubDep3.hasNext() ) {
							srcPopSubDep3 = iterSrcPopSubDep3.next();
						}
					}
				}
			}
		}

		if( srcPopTopDep != null ) {
			IYCFBamPopTopDepObj origDstPopTopDep = dstPopTopDepTableObj.readPopTopDepByUNameIdx( origDstRelation.getRequiredTenantId(),
				origDstRelation.getRequiredId(),
				srcPopTopDep.getRequiredName() );
			if( origDstPopTopDep == null ) {

				srcRelation = srcPopTopDep.getRequiredLookupRelation();
				srcTable = srcRelation.getRequiredContainerFromTable();
				dstTable = dstTableTableObj.readTableByUNameIdx( dstSchemaDef.getRequiredTenantId(),
					dstSchemaDef.getRequiredId(),
					srcTable.getRequiredName() );
				dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
					dstTable.getRequiredId(),
					srcRelation.getRequiredName() );

				origDstPopTopDep = dstPopTopDepTableObj.newInstance();
				IYCFBamPopTopDepEditObj editDstPopTopDep = (IYCFBamPopTopDepEditObj)origDstPopTopDep.beginEdit();
				editDstPopTopDep.setRequiredOwnerTenant( dstTenant );
				editDstPopTopDep.setRequiredContainerContRelation( origDstRelation );
				editDstPopTopDep.setRequiredLookupRelation( dstRelation );
				editDstPopTopDep.setRequiredName( srcPopTopDep.getRequiredName() );
				editDstPopTopDep.setOptionalLookupDefSchema( srcSchema );
				origDstPopTopDep = (IYCFBamPopTopDepObj)editDstPopTopDep.create();
				editDstPopTopDep = null;

				if( srcPopSubDep1 != null ) {
					srcRelation = srcPopSubDep1.getRequiredLookupRelation();
					srcTable = srcRelation.getRequiredContainerFromTable();
					dstTable = dstTableTableObj.readTableByUNameIdx( dstSchemaDef.getRequiredTenantId(),
						dstSchemaDef.getRequiredId(),
						srcTable.getRequiredName() );
					dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
						dstTable.getRequiredId(),
						srcRelation.getRequiredName() );

					IYCFBamPopSubDep1Obj origDstPopSubDep1 = dstPopSubDep1TableObj.newInstance();
					IYCFBamPopSubDep1EditObj editDstPopSubDep1 = (IYCFBamPopSubDep1EditObj)origDstPopSubDep1.beginEdit();
					editDstPopSubDep1.setRequiredOwnerTenant( dstTenant );
					editDstPopSubDep1.setRequiredContainerContPopTopDep( origDstPopTopDep );
					editDstPopSubDep1.setRequiredLookupRelation( dstRelation );
					editDstPopSubDep1.setRequiredName( srcPopSubDep1.getRequiredName() );
					editDstPopSubDep1.setOptionalLookupDefSchema( srcSchema );
					origDstPopSubDep1 = (IYCFBamPopSubDep1Obj)editDstPopSubDep1.create();
					editDstPopSubDep1 = null;

					if( srcPopSubDep2 != null ) {
						srcRelation = srcPopSubDep2.getRequiredLookupRelation();
						srcTable = srcRelation.getRequiredContainerFromTable();
						dstTable = dstTableTableObj.readTableByUNameIdx( dstSchemaDef.getRequiredTenantId(),
							dstSchemaDef.getRequiredId(),
							srcTable.getRequiredName() );
						dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
							dstTable.getRequiredId(),
							srcRelation.getRequiredName() );

						IYCFBamPopSubDep2Obj origDstPopSubDep2 = dstPopSubDep2TableObj.newInstance();
						IYCFBamPopSubDep2EditObj editDstPopSubDep2 = (IYCFBamPopSubDep2EditObj)origDstPopSubDep2.beginEdit();
						editDstPopSubDep2.setRequiredOwnerTenant( dstTenant );
						editDstPopSubDep2.setRequiredContainerPopSubDep1( origDstPopSubDep1 );
						editDstPopSubDep2.setRequiredLookupRelation( dstRelation );
						editDstPopSubDep2.setRequiredName( srcPopSubDep2.getRequiredName() );
						editDstPopSubDep2.setOptionalLookupDefSchema( srcSchema );
						origDstPopSubDep2 = (IYCFBamPopSubDep2Obj)editDstPopSubDep2.create();
						editDstPopSubDep2 = null;

						if( srcPopSubDep3 != null ) {
							srcRelation = srcPopSubDep3.getRequiredLookupRelation();
							srcTable = srcRelation.getRequiredContainerFromTable();
							dstTable = dstTableTableObj.readTableByUNameIdx( dstSchemaDef.getRequiredTenantId(),
								dstSchemaDef.getRequiredId(),
								srcTable.getRequiredName() );
							dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
								dstTable.getRequiredId(),
								srcRelation.getRequiredName() );

							IYCFBamPopSubDep3Obj origDstPopSubDep3 = dstPopSubDep3TableObj.newInstance();
							IYCFBamPopSubDep3EditObj editDstPopSubDep3 = (IYCFBamPopSubDep3EditObj)origDstPopSubDep3.beginEdit();
							editDstPopSubDep3.setRequiredOwnerTenant( dstTenant );
							editDstPopSubDep3.setRequiredContainerPopSubDep2( origDstPopSubDep2 );
							editDstPopSubDep3.setRequiredLookupRelation( dstRelation );
							editDstPopSubDep3.setRequiredName( srcPopSubDep3.getRequiredName() );
							editDstPopSubDep3.setOptionalLookupDefSchema( srcSchema );
							origDstPopSubDep3 = (IYCFBamPopSubDep3Obj)editDstPopSubDep3.create();
							editDstPopSubDep3 = null;
						}
					}
				}
			}
		}
	}

	protected void importMergeSchemaTableRelationPopDeps( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableRelationPopDeps";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamRelationObj srcRelation;
		List<IYCFBamRelationObj> componentRelations;
		Iterator<IYCFBamRelationObj> iterSrcRelation;

		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			componentRelations = srcTable.getOptionalComponentsRelation();
			if( componentRelations != null ) {
				iterSrcRelation = componentRelations.iterator();
				while( iterSrcRelation.hasNext() ) {
					srcRelation = iterSrcRelation.next();
					importMergeRelationPopDeps( origDstTable, srcRelation );
				}
			}
		}
	}

	protected void importMergeTableDelDeps( IYCFBamTableObj origDstTable, IYCFBamTableObj srcTable ) {
		final String S_ProcName = "importMergeTableDelDeps";
		IYCFBamRelationTableObj dstRelationTableObj = origDstTable.getSchema().getRelationTableObj();
		String indexName = srcTable.getRequiredName();

		IYCFBamSchemaDefObj dstSchemaDef = origDstTable.getRequiredContainerSchemaDef();
		IYCFBamSchemaDefObj defSchema = srcTable.getRequiredContainerSchemaDef();

		IYCFBamTableTableObj dstTableTableObj = origDstTable.getSchema().getTableTableObj();
		IYCFBamDelTopDepTableObj dstDelTopDepTableObj = origDstTable.getSchema().getDelTopDepTableObj();
		IYCFBamDelSubDep1TableObj dstDelSubDep1TableObj = origDstTable.getSchema().getDelSubDep1TableObj();
		IYCFBamDelSubDep2TableObj dstDelSubDep2TableObj = origDstTable.getSchema().getDelSubDep2TableObj();
		IYCFBamDelSubDep3TableObj dstDelSubDep3TableObj = origDstTable.getSchema().getDelSubDep3TableObj();
		IYCFBamDelTopDepObj srcDelTopDep = null;
		IYCFBamDelSubDep1Obj srcDelSubDep1 = null;
		IYCFBamDelSubDep2Obj srcDelSubDep2 = null;
		IYCFBamDelSubDep3Obj srcDelSubDep3 = null;
		List<IYCFBamDelSubDep1Obj> srcDelSubDep1Map;
		Iterator<IYCFBamDelSubDep1Obj> iterSrcDelSubDep1;
		List<IYCFBamDelSubDep2Obj> srcDelSubDep2Map;
		Iterator<IYCFBamDelSubDep2Obj> iterSrcDelSubDep2;
		List<IYCFBamDelSubDep3Obj> srcDelSubDep3Map;
		Iterator<IYCFBamDelSubDep3Obj> iterSrcDelSubDep3;
		IYCFBamRelationObj srcRelation;
		IYCFBamTableObj dstTable;
		IYCFBamRelationObj dstRelation;
		IYCFBamDelTopDepObj origDstDelTopDep;
		IYCFBamDelTopDepEditObj editDstDelTopDep;
		IYCFBamDelSubDep1Obj origDstDelSubDep1;
		IYCFBamDelSubDep1EditObj editDstDelSubDep1;
		IYCFBamDelSubDep2Obj origDstDelSubDep2;
		IYCFBamDelSubDep2EditObj editDstDelSubDep2;
		IYCFBamDelSubDep3Obj origDstDelSubDep3;
		IYCFBamDelSubDep3EditObj editDstDelSubDep3;
		IYCFBamTenantObj dstTenant = (IYCFBamTenantObj)origDstTable.getRequiredOwnerTenant();

		Iterator<IYCFBamDelTopDepObj> iterSrcDelTopDep;
		List<IYCFBamDelTopDepObj> srcDelTopDepMap = srcTable.getOptionalComponentsDelDep();
		if( srcDelTopDepMap != null ) {
			iterSrcDelTopDep = srcDelTopDepMap.iterator();
			while( iterSrcDelTopDep.hasNext() ) {

				srcDelTopDep = iterSrcDelTopDep.next();
				srcDelSubDep1 = null;
				srcDelSubDep2 = null;
				srcDelSubDep3 = null;

				IYCFBamSchemaDefObj srcSchema = srcDelTopDep.getOptionalLookupDefSchema();
				if( srcSchema == null ) {
					srcSchema = srcDelTopDep.getRequiredContainerTable().getRequiredContainerSchemaDef();
				}

				srcDelSubDep1Map = srcDelTopDep.getOptionalComponentsDelDep();
				iterSrcDelSubDep1 = srcDelSubDep1Map.iterator();
				if( iterSrcDelSubDep1.hasNext() ) {
					srcDelSubDep1 = iterSrcDelSubDep1.next();
					srcDelSubDep2Map = srcDelSubDep1.getOptionalComponentsDelDep();
					iterSrcDelSubDep2 = srcDelSubDep2Map.iterator();
					if( iterSrcDelSubDep2.hasNext() ) {
						srcDelSubDep2 = iterSrcDelSubDep2.next();
						srcDelSubDep3Map = srcDelSubDep2.getOptionalComponentsDelDep();
						iterSrcDelSubDep3 = srcDelSubDep3Map.iterator();
						if( iterSrcDelSubDep3.hasNext() ) {
							srcDelSubDep3 = iterSrcDelSubDep3.next();
						}
					}
				}

				origDstDelTopDep = dstDelTopDepTableObj.readDelTopDepByUNameIdx( origDstTable.getRequiredTenantId(),
					origDstTable.getRequiredId(),
					srcDelTopDep.getRequiredName() );
				if( origDstDelTopDep == null ) {
					origDstDelTopDep = dstDelTopDepTableObj.newInstance();
					editDstDelTopDep = (IYCFBamDelTopDepEditObj)origDstDelTopDep.beginEdit();

					srcRelation = srcDelTopDep.getRequiredLookupRelation();
					srcTable = srcRelation.getRequiredContainerFromTable();
					dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
						origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
						srcTable.getRequiredName() );
					dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
						dstTable.getRequiredId(),
						srcRelation.getRequiredName() );
					editDstDelTopDep.setRequiredOwnerTenant( dstTenant );
					editDstDelTopDep.setRequiredContainerTable( origDstTable );
					editDstDelTopDep.setRequiredLookupRelation( dstRelation );
					editDstDelTopDep.setRequiredName( srcDelTopDep.getRequiredName() );
					editDstDelTopDep.setOptionalLookupDefSchema( srcSchema );
					origDstDelTopDep = (IYCFBamDelTopDepObj)editDstDelTopDep.create();
					editDstDelTopDep = null;

					if( srcDelSubDep1 != null ) {
						srcRelation = srcDelSubDep1.getRequiredLookupRelation();
						srcTable = srcRelation.getRequiredContainerFromTable();
						dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
							origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
							srcTable.getRequiredName() );
						dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
							dstTable.getRequiredId(),
							srcRelation.getRequiredName() );

						origDstDelSubDep1 = dstDelSubDep1TableObj.newInstance();
						editDstDelSubDep1 = (IYCFBamDelSubDep1EditObj)origDstDelSubDep1.beginEdit();
						editDstDelSubDep1.setRequiredOwnerTenant( dstTenant );
						editDstDelSubDep1.setRequiredContainerDelTopDep( origDstDelTopDep );
						editDstDelSubDep1.setRequiredLookupRelation( dstRelation );
						editDstDelSubDep1.setRequiredName( srcDelSubDep1.getRequiredName() );
						editDstDelSubDep1.setOptionalLookupDefSchema( srcSchema );
						origDstDelSubDep1 = (IYCFBamDelSubDep1Obj)editDstDelSubDep1.create();
						editDstDelSubDep1 = null;

						if( srcDelSubDep2 != null ) {

							srcRelation = srcDelSubDep2.getRequiredLookupRelation();
							srcTable = srcRelation.getRequiredContainerFromTable();
							dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
								origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
								srcTable.getRequiredName() );
							dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
								dstTable.getRequiredId(),
								srcRelation.getRequiredName() );

							origDstDelSubDep2 = dstDelSubDep2TableObj.newInstance();
							editDstDelSubDep2 = (IYCFBamDelSubDep2EditObj)origDstDelSubDep2.beginEdit();
							editDstDelSubDep2.setRequiredOwnerTenant( dstTenant );
							editDstDelSubDep2.setRequiredContainerDelSubDep1( origDstDelSubDep1 );
							editDstDelSubDep2.setRequiredLookupRelation( dstRelation );
							editDstDelSubDep2.setRequiredName( srcDelSubDep2.getRequiredName() );
							editDstDelSubDep2.setOptionalLookupDefSchema( srcSchema );
							origDstDelSubDep2 = (IYCFBamDelSubDep2Obj)editDstDelSubDep2.create();
							editDstDelSubDep2 = null;

							if( srcDelSubDep3 != null ) {
								srcRelation = srcDelTopDep.getRequiredLookupRelation();
								srcTable = srcRelation.getRequiredContainerFromTable();
								dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
									origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
									srcTable.getRequiredName() );
								dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
									dstTable.getRequiredId(),
									srcRelation.getRequiredName() );
								origDstDelSubDep3 = dstDelSubDep3TableObj.newInstance();
								editDstDelSubDep3 = (IYCFBamDelSubDep3EditObj)origDstDelSubDep3.beginEdit();
								editDstDelSubDep3.setRequiredOwnerTenant( dstTenant );
								editDstDelSubDep3.setRequiredContainerDelSubDep2( origDstDelSubDep2 );
								editDstDelSubDep3.setRequiredLookupRelation( dstRelation );
								editDstDelSubDep3.setRequiredName( srcDelSubDep3.getRequiredName() );
								editDstDelSubDep3.setOptionalLookupDefSchema( srcSchema );
								origDstDelSubDep3 = (IYCFBamDelSubDep3Obj)editDstDelSubDep3.create();
								editDstDelSubDep3 = null;
							}
						}
					}
				}
			}
		}
	}

	protected void importMergeSchemaTableTableDelDeps( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableTableDelDeps";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}
			importMergeTableDelDeps( origDstTable, srcTable );
		}
	}

	protected void importMergeTableClearDeps( IYCFBamTableObj origDstTable, IYCFBamTableObj srcTable ) {
		final String S_ProcName = "importMergeTableClearDeps";
		IYCFBamRelationTableObj dstRelationTableObj = origDstTable.getSchema().getRelationTableObj();
		String indexName = srcTable.getRequiredName();

		IYCFBamSchemaDefObj dstSchemaDef = origDstTable.getRequiredContainerSchemaDef();
		IYCFBamSchemaDefObj defSchema = srcTable.getRequiredContainerSchemaDef();

		IYCFBamTableTableObj dstTableTableObj = origDstTable.getSchema().getTableTableObj();
		IYCFBamClearTopDepTableObj dstClearTopDepTableObj = origDstTable.getSchema().getClearTopDepTableObj();
		IYCFBamClearSubDep1TableObj dstClearSubDep1TableObj = origDstTable.getSchema().getClearSubDep1TableObj();
		IYCFBamClearSubDep2TableObj dstClearSubDep2TableObj = origDstTable.getSchema().getClearSubDep2TableObj();
		IYCFBamClearSubDep3TableObj dstClearSubDep3TableObj = origDstTable.getSchema().getClearSubDep3TableObj();
		IYCFBamClearTopDepObj srcClearTopDep = null;
		IYCFBamClearSubDep1Obj srcClearSubDep1 = null;
		IYCFBamClearSubDep2Obj srcClearSubDep2 = null;
		IYCFBamClearSubDep3Obj srcClearSubDep3 = null;
		List<IYCFBamClearSubDep1Obj> srcClearSubDep1Map;
		Iterator<IYCFBamClearSubDep1Obj> iterSrcClearSubDep1;
		List<IYCFBamClearSubDep2Obj> srcClearSubDep2Map;
		Iterator<IYCFBamClearSubDep2Obj> iterSrcClearSubDep2;
		List<IYCFBamClearSubDep3Obj> srcClearSubDep3Map;
		Iterator<IYCFBamClearSubDep3Obj> iterSrcClearSubDep3;
		IYCFBamRelationObj srcRelation;
		IYCFBamTableObj dstTable;
		IYCFBamRelationObj dstRelation;
		IYCFBamClearTopDepObj origDstClearTopDep;
		IYCFBamClearTopDepEditObj editDstClearTopDep;
		IYCFBamClearSubDep1Obj origDstClearSubDep1;
		IYCFBamClearSubDep1EditObj editDstClearSubDep1;
		IYCFBamClearSubDep2Obj origDstClearSubDep2;
		IYCFBamClearSubDep2EditObj editDstClearSubDep2;
		IYCFBamClearSubDep3Obj origDstClearSubDep3;
		IYCFBamClearSubDep3EditObj editDstClearSubDep3;
		IYCFBamTenantObj dstTenant = (IYCFBamTenantObj)origDstTable.getRequiredOwnerTenant();

		Iterator<IYCFBamClearTopDepObj> iterSrcClearTopDep;
		List<IYCFBamClearTopDepObj> srcClearTopDepMap = srcTable.getOptionalComponentsClearDep();
		if( srcClearTopDepMap != null ) {
			iterSrcClearTopDep = srcClearTopDepMap.iterator();
			while( iterSrcClearTopDep.hasNext() ) {

				srcClearTopDep = iterSrcClearTopDep.next();
				srcClearSubDep1 = null;
				srcClearSubDep2 = null;
				srcClearSubDep3 = null;

				srcClearSubDep1Map = srcClearTopDep.getOptionalComponentsClearDep();
				iterSrcClearSubDep1 = srcClearSubDep1Map.iterator();
				if( iterSrcClearSubDep1.hasNext() ) {
					srcClearSubDep1 = iterSrcClearSubDep1.next();
					srcClearSubDep2Map = srcClearSubDep1.getOptionalComponentsClearDep();
					iterSrcClearSubDep2 = srcClearSubDep2Map.iterator();
					if( iterSrcClearSubDep2.hasNext() ) {
						srcClearSubDep2 = iterSrcClearSubDep2.next();
						srcClearSubDep3Map = srcClearSubDep2.getOptionalComponentsClearDep();
						iterSrcClearSubDep3 = srcClearSubDep3Map.iterator();
						if( iterSrcClearSubDep3.hasNext() ) {
							srcClearSubDep3 = iterSrcClearSubDep3.next();
						}
					}
				}

				IYCFBamSchemaDefObj srcSchema = srcClearTopDep.getOptionalLookupDefSchema();
				if( srcSchema == null ) {
					srcSchema = srcClearTopDep.getRequiredContainerTable().getRequiredContainerSchemaDef();
				}

				origDstClearTopDep = dstClearTopDepTableObj.readClearTopDepByUNameIdx( origDstTable.getRequiredTenantId(),
					origDstTable.getRequiredId(),
					srcClearTopDep.getRequiredName() );
				if( origDstClearTopDep == null ) {
					origDstClearTopDep = dstClearTopDepTableObj.newInstance();
					editDstClearTopDep = (IYCFBamClearTopDepEditObj)origDstClearTopDep.beginEdit();

					srcRelation = srcClearTopDep.getRequiredLookupRelation();
					srcTable = srcRelation.getRequiredContainerFromTable();
					dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
						origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
						srcTable.getRequiredName() );
					dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
						dstTable.getRequiredId(),
						srcRelation.getRequiredName() );
					editDstClearTopDep.setRequiredOwnerTenant( dstTenant );
					editDstClearTopDep.setRequiredContainerTable( origDstTable );
					editDstClearTopDep.setRequiredLookupRelation( dstRelation );
					editDstClearTopDep.setRequiredName( srcClearTopDep.getRequiredName() );
					editDstClearTopDep.setOptionalLookupDefSchema( srcSchema );
					origDstClearTopDep = (IYCFBamClearTopDepObj)editDstClearTopDep.create();
					editDstClearTopDep = null;

					if( srcClearSubDep1 != null ) {
						srcRelation = srcClearSubDep1.getRequiredLookupRelation();
						srcTable = srcRelation.getRequiredContainerFromTable();
						dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
							origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
							srcTable.getRequiredName() );
						dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
							dstTable.getRequiredId(),
							srcRelation.getRequiredName() );

						origDstClearSubDep1 = dstClearSubDep1TableObj.newInstance();
						editDstClearSubDep1 = (IYCFBamClearSubDep1EditObj)origDstClearSubDep1.beginEdit();
						editDstClearSubDep1.setRequiredOwnerTenant( dstTenant );
						editDstClearSubDep1.setRequiredContainerClearTopDep( origDstClearTopDep );
						editDstClearSubDep1.setRequiredLookupRelation( dstRelation );
						editDstClearSubDep1.setRequiredName( srcClearSubDep1.getRequiredName() );
						editDstClearSubDep1.setOptionalLookupDefSchema( srcSchema );
						origDstClearSubDep1 = (IYCFBamClearSubDep1Obj)editDstClearSubDep1.create();
						editDstClearSubDep1 = null;

						if( srcClearSubDep2 != null ) {

							srcRelation = srcClearSubDep2.getRequiredLookupRelation();
							srcTable = srcRelation.getRequiredContainerFromTable();
							dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
								origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
								srcTable.getRequiredName() );
							dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
								dstTable.getRequiredId(),
								srcRelation.getRequiredName() );

							origDstClearSubDep2 = dstClearSubDep2TableObj.newInstance();
							editDstClearSubDep2 = (IYCFBamClearSubDep2EditObj)origDstClearSubDep2.beginEdit();
							editDstClearSubDep2.setRequiredOwnerTenant( dstTenant );
							editDstClearSubDep2.setRequiredContainerClearSubDep1( origDstClearSubDep1 );
							editDstClearSubDep2.setRequiredLookupRelation( dstRelation );
							editDstClearSubDep2.setRequiredName( srcClearSubDep2.getRequiredName() );
							editDstClearSubDep2.setOptionalLookupDefSchema( srcSchema );
							origDstClearSubDep2 = (IYCFBamClearSubDep2Obj)editDstClearSubDep2.create();
							editDstClearSubDep2 = null;

							if( srcClearSubDep3 != null ) {
								srcRelation = srcClearTopDep.getRequiredLookupRelation();
								srcTable = srcRelation.getRequiredContainerFromTable();
								dstTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
									origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
									srcTable.getRequiredName() );
								dstRelation = dstRelationTableObj.readRelationByUNameIdx( dstTable.getRequiredTenantId(),
									dstTable.getRequiredId(),
									srcRelation.getRequiredName() );
								origDstClearSubDep3 = dstClearSubDep3TableObj.newInstance();
								editDstClearSubDep3 = (IYCFBamClearSubDep3EditObj)origDstClearSubDep3.beginEdit();
								editDstClearSubDep3.setRequiredOwnerTenant( dstTenant );
								editDstClearSubDep3.setRequiredContainerClearSubDep2( origDstClearSubDep2 );
								editDstClearSubDep3.setRequiredLookupRelation( dstRelation );
								editDstClearSubDep3.setRequiredName( srcClearSubDep3.getRequiredName() );
								editDstClearSubDep3.setOptionalLookupDefSchema( srcSchema );
								origDstClearSubDep3 = (IYCFBamClearSubDep3Obj)editDstClearSubDep3.create();
								editDstClearSubDep3 = null;
							}
						}
					}
				}
			}
		}
	}

	protected void importMergeSchemaTableTableClearDeps( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableTableClearDeps";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}
			importMergeTableClearDeps( origDstTable, srcTable );
		}
	}

	protected void importMergeTableChains( IYCFBamTableObj origDstTable, IYCFBamTableObj srcTable ) {
		final String S_ProcName = "importMergeTableChains";
		IYCFBamRelationTableObj dstRelationTableObj = origDstTable.getSchema().getRelationTableObj();
		String indexName = srcTable.getRequiredName();

		IYCFBamSchemaDefObj dstSchemaDef = origDstTable.getRequiredContainerSchemaDef();
		IYCFBamSchemaDefObj defSchema = srcTable.getRequiredContainerSchemaDef();

		IYCFBamTableTableObj dstTableTableObj = origDstTable.getSchema().getTableTableObj();
		IYCFBamChainTableObj dstChainTableObj = origDstTable.getSchema().getChainTableObj();
		IYCFBamChainObj srcChain = null;
		IYCFBamTableObj srcPrevTable;
		IYCFBamRelationObj srcPrevRelation;
		IYCFBamTableObj dstPrevTable;
		IYCFBamRelationObj dstPrevRelation;

		IYCFBamTableObj srcNextTable;
		IYCFBamRelationObj srcNextRelation;
		IYCFBamTableObj dstNextTable;
		IYCFBamRelationObj dstNextRelation;
		IYCFBamChainObj origDstChain;
		IYCFBamChainEditObj editDstChain;
		IYCFBamTenantObj dstTenant = (IYCFBamTenantObj)origDstTable.getRequiredOwnerTenant();

		Iterator<IYCFBamChainObj> iterSrcChain;
		List<IYCFBamChainObj> srcChainList = srcTable.getOptionalComponentsChains();
		if( srcChainList != null ) {
			iterSrcChain = srcChainList.iterator();
			while( iterSrcChain.hasNext() ) {

				srcChain = iterSrcChain.next();

				origDstChain = dstChainTableObj.readChainByUNameIdx( origDstTable.getRequiredTenantId(),
					origDstTable.getRequiredId(),
					srcChain.getRequiredName() );
				if( origDstChain == null ) {
					origDstChain = dstChainTableObj.newInstance();
					editDstChain = (IYCFBamChainEditObj)origDstChain.beginEdit();

					srcPrevRelation = srcChain.getRequiredLookupPrevRel();
					srcPrevTable = srcPrevRelation.getRequiredContainerFromTable();
					dstPrevTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
						origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
						srcPrevTable.getRequiredName() );
					dstPrevRelation = dstRelationTableObj.readRelationByUNameIdx( dstPrevTable.getRequiredTenantId(),
						dstPrevTable.getRequiredId(),
						srcPrevRelation.getRequiredName() );

					srcNextRelation = srcChain.getRequiredLookupNextRel();
					srcNextTable = srcNextRelation.getRequiredContainerFromTable();
					dstNextTable = dstTableTableObj.readTableByUNameIdx( origDstTable.getRequiredContainerSchemaDef().getRequiredTenantId(),
						origDstTable.getRequiredContainerSchemaDef().getRequiredId(),
						srcNextTable.getRequiredName() );
					dstNextRelation = dstRelationTableObj.readRelationByUNameIdx( dstNextTable.getRequiredTenantId(),
						dstNextTable.getRequiredId(),
						srcNextRelation.getRequiredName() );

					editDstChain.setRequiredOwnerTenant( dstTenant );
					editDstChain.setRequiredContainerTable( origDstTable );
					editDstChain.setRequiredLookupPrevRel( dstPrevRelation );
					editDstChain.setRequiredLookupNextRel( dstNextRelation );
					editDstChain.setRequiredName( srcChain.getRequiredName() );
					editDstChain.setOptionalDescription( srcChain.getOptionalDescription() );
					editDstChain.setOptionalLabel( srcChain.getOptionalLabel() );
					editDstChain.setOptionalShortDescription( srcChain.getOptionalShortDescription() );
					editDstChain.setOptionalShortName( srcChain.getOptionalShortName() );
					editDstChain.setOptionalLookupDefSchema( defSchema );
					origDstChain = (IYCFBamChainObj)editDstChain.create();
					editDstChain = null;
				}
			}
		}
	}

	protected void importMergeSchemaTableTableChains( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableTableChains";
		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		while( iterSrcTable.hasNext() ) {
			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}
			importMergeTableChains( origDstTable, srcTable );
		}
	}

	protected void importMergeSchemaTableResolveNarrowedRelations( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchemaTableResolveNarrowedRelations";

		IYCFBamTableTableObj dstTableTableObj = dst.getSchema().getTableTableObj();
		IYCFBamRelationTableObj dstRelationTableObj = dst.getSchema().getRelationTableObj();
		List<IYCFBamTableObj> srcTables = src.getOptionalComponentsTables();
		Iterator<IYCFBamTableObj> iterSrcTable = srcTables.iterator();
		IYCFBamTableObj srcTable;
		IYCFBamTableObj origDstTable;
		IYCFBamRelationObj srcRelation;
		IYCFBamRelationObj dstRelation;
		List<IYCFBamRelationObj> srcRelations;
		Iterator<IYCFBamRelationObj> iterSrcRelations;
		IYCFBamRelationObj srcRelationNarrowed;
		IYCFBamRelationObj dstRelationNarrowed;
		String srcRelationNarrowedTableName;
		IYCFBamTableObj srcRelationNarrowedTable;
		IYCFBamTableObj dstRelationNarrowedTable;
		IYCFBamRelationEditObj editDstRelation;

		while( iterSrcTable.hasNext() ) {

			srcTable = iterSrcTable.next();
			origDstTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), dst.getRequiredId(), srcTable.getRequiredName() );
			if( origDstTable == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"origDstTable " + srcTable.getRequiredName() );
			}

			srcRelations  = srcTable.getOptionalComponentsRelation();
			if( srcRelations != null ) {
				iterSrcRelations = srcRelations.iterator();
				if( iterSrcRelations != null ) {
					while( iterSrcRelations.hasNext() ) {
						srcRelation = iterSrcRelations.next();
						if( srcRelation != null ) {
							dstRelation = dstRelationTableObj.readRelationByUNameIdx( origDstTable.getRequiredTenantId(),
								origDstTable.getRequiredId(),
								srcRelation.getRequiredName() );
							if( dstRelation == null ) {
								throw new YCFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"dstRelationTableObj.readRelationByUNameIdx( origDefTable.getRequiredId(), \"" + srcRelation.getRequiredName() + "\" )" );
							}

							srcRelationNarrowed = srcRelation.getOptionalLookupNarrowed();
							if( srcRelationNarrowed == null ) {
								srcRelationNarrowedTableName = null;
								srcRelationNarrowedTable = null;
								dstRelationNarrowedTable = null;
								dstRelationNarrowed = null;
							}
							else {
								srcRelationNarrowedTableName = srcRelationNarrowed.getRequiredContainerFromTable().getRequiredName();
								dstRelationNarrowedTable = dstTableTableObj.readTableByUNameIdx( dst.getRequiredTenantId(), 
									dst.getRequiredId(),
									srcRelationNarrowedTableName );
								if( dstRelationNarrowedTable == null ) {
									throw new YCFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"dstTableTableObj.readTableByUNameIdx( dst.getRequiredId(), \"" + srcRelationNarrowedTableName + "\" )" ); 
								}

								dstRelationNarrowed = dstRelationTableObj.readRelationByUNameIdx( dstRelationNarrowedTable.getRequiredTenantId(),
									dstRelationNarrowedTable.getRequiredId(),
									srcRelationNarrowed.getRequiredName() );
								if( dstRelationNarrowed == null ) {
									throw new YCFLibNullArgumentException( getClass(),
											S_ProcName,
											0,
											"dstRelationTableObj.readRelationByUNameIdx( " + srcRelationNarrowedTableName + ".getRequiredId(), \"" + srcRelationNarrowed.getRequiredName() + "\" )" ); 
								}
							}

							editDstRelation = (IYCFBamRelationEditObj)dstRelation.beginEdit();
							editDstRelation.setOptionalLookupNarrowed( dstRelationNarrowed );
							editDstRelation.update();
							editDstRelation = null;
						}
						else {
							dstRelation = null;
						}
					}
				}
			}
		}
	}

	public void importMergeSchema( IYCFBamSchemaDefObj dst, IYCFBamSchemaDefObj src ) {
		final String S_ProcName = "importMergeSchema";

		if( dst == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"dst" );
		}

		if( src == null ) {
			return;
		}

		if( dst == src ) {
			return;
		}

		dst.getSchema().getId16GenTableObj().readId16GenByDispIdx( dst.getRequiredTenantId(),
			0L );
		dst.getSchema().getId32GenTableObj().readId32GenByDispIdx( dst.getRequiredTenantId(),
			0L );
		dst.getSchema().getId64GenTableObj().readId64GenByDispIdx( dst.getRequiredTenantId(),
			0L );

		importMergeSchemaTables( dst, src );
		importMergeSchemaTypes( dst, src );
		importMergeSchemaTableColumns( dst, src );
		importMergeSchemaTableIndexes( dst, src );
		importMergeSchemaTableResolvePrimaryIndexes( dst, src );
		importMergeSchemaTableResolveLookupIndexes( dst, src );
		importMergeSchemaTableRelations( dst, src );
		importMergeSchemaTableResolveNarrowedRelations( dst, src );
		importMergeSchemaTableTableChains( dst, src );
		importMergeSchemaTableRelationPopDeps( dst, src );
		importMergeSchemaTableTableClearDeps( dst, src );
		importMergeSchemaTableTableDelDeps( dst, src );
		importMergeSchemaTableServerMethods( dst, src );
		importMergeSchemaRoles( dst, src );
	}

	public void startElement(
		String		uri,
		String		localName,
		String		qName,
		Attributes	attrs )
	throws SAXException
	{
		final String S_ProcName = "startElement";
		final String S_LocalNameIndex = "localName";

		// SchemaRef attributes
		String	attrId = null;
		String	attrName = null;
		String	attrRefModelName = null;
		String	attrIncludeRoot = null;

		// Attribute Extraction
		String	attrLocalName;
		int		numAttrs;
		int		idxAttr;

		assert qName.equals( "SchemaRef" );

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

		IYCFBamTenantObj tenantObj = (IYCFBamTenantObj)saxLoader.getTenant();

		numAttrs = attrs.getLength();
		for( idxAttr = 0; idxAttr < numAttrs; idxAttr++ ) {
			attrLocalName = attrs.getLocalName( idxAttr );
			if( attrLocalName.equals( "Id" ) ) {
				if( attrId != null ) {
					throw new YCFLibUniqueIndexViolationException( getClass(),
						S_ProcName,
						S_LocalNameIndex,
						attrLocalName );
				}
				attrId = attrs.getValue( idxAttr );
			}
			else if( attrLocalName.equals( "Name" ) ) {
				if( attrName != null ) {
					throw new YCFLibUniqueIndexViolationException( getClass(),
						S_ProcName,
						S_LocalNameIndex,
						attrLocalName );
				}
				attrName = attrs.getValue( idxAttr );
			}
			else if( attrLocalName.equals( "RefModelName" ) ) {
				if( attrRefModelName != null ) {
					throw new YCFLibUniqueIndexViolationException( getClass(),
						S_ProcName,
						S_LocalNameIndex,
						attrLocalName );
				}
				attrRefModelName = attrs.getValue( idxAttr );
			}
			else if( attrLocalName.equals( "IncludeRoot" ) ) {
				if( attrIncludeRoot != null ) {
					throw new YCFLibUniqueIndexViolationException( getClass(),
						S_ProcName,
						S_LocalNameIndex,
						attrLocalName );
				}
				attrIncludeRoot = attrs.getValue( idxAttr );
			}
			else if( attrLocalName.equals( "schemaLocation" ) ) {
				// ignored
			}
			else {
				throw new YCFLibUnrecognizedAttributeException( getClass(),
					S_ProcName,
					saxLoader.getLocationInfo(),
					attrLocalName );
			}
		}

		if( ( attrName == null ) || ( attrName.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(),
				S_ProcName,
				0,
				"Name" );
		}

		if( ( attrRefModelName == null ) || ( attrRefModelName.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(),
				S_ProcName,
				0,
				"RefModelName" );
		}

		if( ( attrIncludeRoot == null ) || ( attrIncludeRoot.length() <= 0 ) ) {
			throw new YCFLibEmptyArgumentException( getClass(),
				S_ProcName,
				0,
				"IncludeRoot" );
		}

		YCFLibXmlCoreContext curContext = getParser().getCurContext();
		curContext.putNamedValue( "Id", attrId );
		curContext.putNamedValue( "Name", attrName );
		curContext.putNamedValue( "RefModelName", attrRefModelName );
		curContext.putNamedValue( "IncludeRoot", attrIncludeRoot );

		if( saxLoader.getProcessSchema( curContext ) ) { 

			YCFLibXmlCoreContext parentContext = curContext.getPrevContext();
			Object parentObject = parentContext.getNamedValue( "Object" );
			IYCFBamSchemaDefObj parentSchema;
			if( parentObject == null ) {
				throw new YCFLibNullArgumentException(this.getClass(), S_ProcName, 0, "Object" );
			}
			else if ( parentObject instanceof IYCFBamSchemaDefObj ) {
				parentSchema = (IYCFBamSchemaDefObj)parentObject;
			}
			else {
				throw new YCFLibUnsupportedClassException( this.getClass(), S_ProcName, "Object", 0, "IYCFBamSchemaDefObj" );
			}

			IYCFBamSchemaRefTableObj schemaRefTableObj = schemaObj.getSchemaRefTableObj();
			IYCFBamSchemaRefObj origSchemaRef = schemaRefTableObj.readSchemaRefByUNameIdx( parentSchema.getRequiredTenantId(), parentSchema.getRequiredId(), attrName );
			IYCFBamSchemaRefObj schemaRef;
			IYCFBamSchemaRefEditObj editSchemaRef;
			IYCFBamSchemaDefObj referencedSchemaDef = null;

			boolean needToLoad;

			if( origSchemaRef != null ) {
				schemaRef = origSchemaRef;
				referencedSchemaDef = schemaRef.getOptionalLookupRefSchema();
				needToLoad = false;
			}
			else {
				schemaRef = schemaRefTableObj.newInstance();
				editSchemaRef = (IYCFBamSchemaRefEditObj)schemaRef.beginEdit();
				editSchemaRef.setRequiredOwnerTenant( parentSchema.getRequiredOwnerTenant() );
				editSchemaRef.setRequiredContainerSchema( parentSchema );
				editSchemaRef.setRequiredName( attrName );
				editSchemaRef.setRequiredRefModelName( attrRefModelName );
				editSchemaRef.setRequiredIncludeRoot( attrIncludeRoot );
				schemaRef = (IYCFBamSchemaRefObj)editSchemaRef.create();
				editSchemaRef = null;
				needToLoad = true;
				referencedSchemaDef = null;
			}

			curContext.putNamedValue( "Object", schemaRef );

			IYCFLibAnyObj resolvedObj;
			try {
				resolvedObj = tenantObj.getNamedObject( attrIncludeRoot );
				if( resolvedObj != null ) {
					needToLoad = false;
				}
				else {
					needToLoad = true;
				}
			}
			catch( RuntimeException e ) {
				resolvedObj = null;
				needToLoad = true;
			}

			IYCFLibMessageLog log = getLog();

			if( needToLoad ) {
				MSSBamYCFEngine engine = saxLoader.getBamEngine();
				if( engine == null ) {
					throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"Engine" );
				}

				if( ! ( engine instanceof MSSBamYCFEngine ) ) {
					throw new YCFLibUnsupportedClassException(getClass(),
						S_ProcName,
						"Engine", engine, "MSSBamYCFEngine" );
				}

				YCFBamXmlLoader subParser = new YCFBamXmlLoader( engine, log );
				subParser.setSchemaObj( saxLoader.getSchemaObj() );
				subParser.setTenant( saxLoader.getTenant() );

				subParser.loadTenant( attrRefModelName );
			}

			// Re-attempt the resolution by name and complain if the load didn't fix the problem

			try {
				resolvedObj = tenantObj.getNamedObject( attrIncludeRoot );
			}
			catch( YCFLibNullArgumentException e ) {
				resolvedObj = null;
			}

			if( resolvedObj == null ) {
				log.message( "WARNING: Could not resolve named object \"" + attrIncludeRoot + "\"\n" );
				referencedSchemaDef = null;
			}
			else if( resolvedObj instanceof IYCFBamSchemaDefObj ) {
				referencedSchemaDef = (IYCFBamSchemaDefObj)resolvedObj;
				editSchemaRef = (IYCFBamSchemaRefEditObj)schemaRef.beginEdit();
				editSchemaRef.setOptionalLookupRefSchema( referencedSchemaDef );
				editSchemaRef.update();
				editSchemaRef = null;
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					attrIncludeRoot,
					resolvedObj,
					"IYCFBamSchemaDefObj" );
			}
			curContext.putNamedValue( "ReferencedSchemaDef", referencedSchemaDef );

			importMergeSchema( parentSchema, referencedSchemaDef );
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

/*
 *	MSS Code Factory YCFBam 2.13 CustMSSBamYCF
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

package org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFGenBindBaseModelAtomClass
	extends MssYCFGenBindObj
{
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public MSSBamYCFGenBindBaseModelAtomClass() {
		super();
	}

	public MSSBamYCFGenBindBaseModelAtomClass(
		MSSBamYCFEngine argSchema,
		String toolset,
		String scopeDefClassName,
		String genDefClassName,
		String itemName)
	{
		super( argSchema, toolset, scopeDefClassName, genDefClassName, itemName);
	}

	public String expandBody( MssYCFGenContext genContext ) {
		IYCFLibAnyObj genDef;
		final String S_ProcName = "expandBody";

		if (genContext == null) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		genDef = genContext.getGenDef();
		if (genDef == null) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"genContext.GenDef" );
		}

		String ret = recurseExpandBody( genDef );
		return( ret );
	}

	private String recurseExpandBody( IYCFLibAnyObj genDef )
	{
		String		ret = null;
		final String S_ProcName = "recurseExpandBody";

		if( genDef instanceof IYCFBamAtomObj ) {
			if( genDef instanceof IYCFBamBlobDefObj ) {
				ret = "BlobDef";
			}
			else if( genDef instanceof IYCFBamBoolDefObj ) {
				ret = "BoolDef";
			}
			else if (genDef instanceof IYCFBamId16GenObj) {
				ret = "Id16Gen";
			}
			else if (genDef instanceof IYCFBamId32GenObj) {
				ret = "Id32Gen";
			}
			else if (genDef instanceof IYCFBamId64GenObj) {
				ret = "Id64Gen";
			}
			else if (genDef instanceof IYCFBamDbKeyHash128GenObj) {
				ret = "DbKeyHash128Gen";
			}
			else if (genDef instanceof IYCFBamDbKeyHash160GenObj) {
				ret = "DbKeyHash160Gen";
			}
			else if (genDef instanceof IYCFBamDbKeyHash224GenObj) {
				ret = "DbKeyHash224Gen";
			}
			else if (genDef instanceof IYCFBamDbKeyHash256GenObj) {
				ret = "DbKeyHash256Gen";
			}
			else if (genDef instanceof IYCFBamDbKeyHash384GenObj) {
				ret = "DbKeyHash384Gen";
			}
			else if (genDef instanceof IYCFBamDbKeyHash512GenObj) {
				ret = "DbKeyHash512Gen";
			}
			else if (genDef instanceof IYCFBamUuid6GenObj) {
				ret = "Uuid6Gen";
			}
			else if (genDef instanceof IYCFBamUuidGenObj) {
				ret = "UuidGen";
			}
			else if (genDef instanceof IYCFBamEnumDefObj) {
				ret = "EnumDef";
			}
			else if (genDef instanceof IYCFBamUInt16DefObj) {
				ret = "UInt16Def";
			}
			else if (genDef instanceof IYCFBamUInt32DefObj) {
				ret = "UInt32Def";
			}
			else if (genDef instanceof IYCFBamUInt64DefObj) {
				ret = "UInt64Def";
			}
			else if (genDef instanceof IYCFBamInt16DefObj) {
				ret = "Int16Def";
			}
			else if( genDef instanceof IYCFBamInt32DefObj ) {
				ret = "Int32Def";
			}
			else if( genDef instanceof IYCFBamInt64DefObj ) {
				ret = "Int64Def";
			}
			else if( genDef instanceof IYCFBamFloatDefObj ) {
				ret = "FloatDef";
			}
			else if( genDef instanceof IYCFBamDoubleDefObj ) {
				ret = "DoubleDef";
			}
			else if( genDef instanceof IYCFBamNumberDefObj ) {
				ret = "NumberDef";
			}
			else if (genDef instanceof IYCFBamNmTokensDefObj)
			{
				ret = "NmTokensDef";
			}
			else if (genDef instanceof IYCFBamNmTokenDefObj) {
				ret = "NmTokenDef";
			}
			else if (genDef instanceof IYCFBamTokenDefObj) {
				ret = "TokenDef";
			}
			else if (genDef instanceof IYCFBamStringDefObj) {
				ret = "StringDef";
			}
			else if( genDef instanceof IYCFBamTextDefObj ) {
				ret = "TextDef";
			}
			else if( genDef instanceof IYCFBamDateDefObj ) {
				ret = "DateDef";
			}
			else if( genDef instanceof IYCFBamTimeDefObj ) {
				ret = "TimeDef";
			}
			else if( genDef instanceof IYCFBamTimestampDefObj ) {
				ret = "TimestampDef";
			}
			else if (genDef instanceof IYCFBamTZDateDefObj) {
				ret = "TZDateDef";
			}
			else if (genDef instanceof IYCFBamTZTimeDefObj) {
				ret = "TZTimeDef";
			}
			else if (genDef instanceof IYCFBamTZTimestampDefObj) {
				ret = "TZTimestampDef";
			}
			else if (genDef instanceof IYCFBamDbKeyHash128DefObj) {
				ret = "DbKeyHash128Def";
			}
			else if (genDef instanceof IYCFBamDbKeyHash160DefObj) {
				ret = "DbKeyHash160Def";
			}
			else if (genDef instanceof IYCFBamDbKeyHash224DefObj) {
				ret = "DbKeyHash224Def";
			}
			else if (genDef instanceof IYCFBamDbKeyHash256DefObj) {
				ret = "DbKeyHash256Def";
			}
			else if (genDef instanceof IYCFBamDbKeyHash384DefObj) {
				ret = "DbKeyHash384Def";
			}
			else if (genDef instanceof IYCFBamDbKeyHash512DefObj) {
				ret = "DbKeyHash512Def";
			}
			else if (genDef instanceof IYCFBamUuid6DefObj) {
				ret = "Uuid6Def";
			}
			else if( genDef instanceof IYCFBamUuidDefObj ) {
				ret = "UuidDef";
			}
			else
			{
				throw new RuntimeException( S_ProcName + "Instance of "
					+ genDef.getClass().getSimpleName()
					+ " is not recognized");
			}
		}
		else if( genDef instanceof IYCFBamTableColObj ) {
			IYCFLibAnyObj dataDef = ((IYCFBamTableColObj)genDef).getRequiredParentDataType();
			if (dataDef == null)
			{
				throw new RuntimeException(S_ProcName + "TableColDef.getLookupData() is null");
			}
			ret = recurseExpandBody( dataDef );
		}
		else if( genDef instanceof IYCFBamIndexColObj ) {
			IYCFLibAnyObj dataDef = ((IYCFBamIndexColObj)genDef).getRequiredLookupColumn();
			if (dataDef == null)
			{
				throw new RuntimeException(S_ProcName + "IndexColDef.getRequiredLookupColumn() is null");
			}
			ret = recurseExpandBody(dataDef);
		}
		else {
			throw new RuntimeException(S_ProcName + "Instance of "
				+ genDef.getClass().getSimpleName()
				+ " does not derive from a supported definition class"  );
		}

		return( ret );
	}	
}

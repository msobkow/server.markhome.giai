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

import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.IYCFBamIndexColObj;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.IYCFBamIndexObj;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.IYCFBamRelationColObj;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.IYCFBamRelationObj;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.IYCFBamTableObj;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.IYCFBamValueObj;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;

public class MSSBamYCFGenBindIsRelationInPrimaryIndex
	extends MssYCFGenBindObj
{
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public MSSBamYCFGenBindIsRelationInPrimaryIndex() {
		super();
	}

	public MSSBamYCFGenBindIsRelationInPrimaryIndex(
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

		IYCFBamRelationObj relnToCheck;
		if( genDef instanceof IYCFBamRelationObj ) {
			relnToCheck = (IYCFBamRelationObj)genDef;
			if (isRelationInPrimaryIndex(relnToCheck)) {
				return( "yes" );
			}
			else {
				return( "no" );
			}
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.GenDef",
				genDef,
				"IYCFBamRelationObj" );
		}
	}

	public static boolean isRelationInPrimaryIndex( IYCFBamRelationObj relnToCheck ) {
		if (relnToCheck == null) {
			return false;
		}

		// Check all the inherited defintions of the primary index, not just the one in the base table
		IYCFBamTableObj tbl = relnToCheck.getRequiredContainerFromTable();
		IYCFBamRelationObj superRelation = tbl.getSuperClassRelation();
		while (superRelation != null) {
			tbl = superRelation.getRequiredLookupToTable();
			if (tbl != null) {
				superRelation = tbl.getSuperClassRelation();
			}
			else {
				superRelation = null;
			}
		}
		IYCFBamIndexObj pidx = tbl.getPrimaryKeyIndex();
		tbl = relnToCheck.getRequiredContainerFromTable();
		do {
			boolean anyColsMissing = false;
			for (IYCFBamRelationColObj col: relnToCheck.getOptionalComponentsColumns()) {
				IYCFBamValueObj fromcol = col.getRequiredLookupFromCol().getRequiredLookupColumn();
				boolean colNotInList = true;
				for (IYCFBamIndexColObj idxcol: pidx.getOptionalComponentsColumns()) {
					IYCFBamValueObj rcol = idxcol.getRequiredLookupColumn();
					if (fromcol == rcol) {
						colNotInList = false;
						break;
					}
				}
				if (colNotInList) {
					anyColsMissing = true;
					break;
				}
			}
			if (!anyColsMissing) {
				return true;
			}
			superRelation = tbl.getSuperClassRelation();
			if (superRelation != null) {
				tbl = superRelation.getRequiredLookupToTable();
			}
			else {
				tbl = null;
			}
		} while (tbl != null);
		return( false );
	}
}

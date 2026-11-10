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

import java.util.List;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFGenBindHasInheritedLookupIndex
	extends MssYCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public MSSBamYCFGenBindHasInheritedLookupIndex() {
		super();
	}

	public MSSBamYCFGenBindHasInheritedLookupIndex(
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

		IYCFBamTableObj curTable = null;

		if (genDef instanceof IYCFBamTableObj) {
			curTable = (IYCFBamTableObj)genDef;
		}
		else if (genDef instanceof IYCFBamAtomObj) {
			IYCFLibAnyObj atomScope = ((IYCFBamAtomObj)genDef).getObjScope();
			if ((atomScope != null) && (atomScope instanceof IYCFBamTableObj)) {
				curTable = (IYCFBamTableObj)atomScope;
			}
		}
		else if (genDef instanceof IYCFBamTableColObj) {
			curTable = (IYCFBamTableObj)((IYCFBamTableColObj)genDef).getRequiredContainerTable();
		}
		else if (genDef instanceof IYCFBamIndexObj) {
			curTable = (IYCFBamTableObj)((IYCFBamIndexObj)genDef).getRequiredContainerTable();
		}
		else if (genDef instanceof IYCFBamIndexColObj) {
			IYCFBamIndexObj colIndex = ((IYCFBamIndexColObj)genDef).getRequiredContainerIndex();
			if (colIndex == null) {
				throw new RuntimeException(S_ProcName + "genContext.getGenDef()<IndexColDef>.getRequiredContainerIndex() is null");
			}
			curTable = (IYCFBamTableObj)colIndex.getRequiredContainerTable();
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.GenDef",
				genDef,
				"IYCFBamTableObj, IYCFBamAtomObj, IYCFBamTableColObj, IYCFBamIndexObj, IYCFBamIndexColObj" );
		}

		if (curTable == null) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Could not locate current table for genContext.getGenDef()<"
					+ genDef.getClass().getSimpleName() + ">");
		}

		IYCFBamIndexObj lookupIndex = null;

		while ((lookupIndex == null) && (curTable != null)) {
			lookupIndex = curTable.getOptionalLookupLookupIndex();
			if( lookupIndex == null ) {
				IYCFBamRelationObj superClassRelation = MSSBamYCFTableObj.getSuperClassRelation(curTable);
				if (superClassRelation != null) {
					IYCFBamTableObj superClassTable = superClassRelation.getRequiredLookupToTable();
					if (superClassTable == null) {
						throw new YCFLibRuntimeException( getClass(),
							S_ProcName,
							"Could not resolve Superclass for TableDef "
								+ curTable.getObjFullName() );
					}
					curTable = superClassTable;
				}
				else {
					curTable = null;
				}
			}
		}

		String ret;

		if ( lookupIndex != null ) {
			ret = "yes";
		}
		else {
			ret = "no";
		}

		return (ret);
	}
}

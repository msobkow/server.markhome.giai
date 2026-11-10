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

import java.util.Iterator;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFGenReferenceObjNameColumn
	extends MssYCFGenReferenceObj
{
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public MSSBamYCFGenReferenceObjNameColumn() {
		super();
	}

	public MSSBamYCFGenReferenceObjNameColumn(
		MSSBamYCFEngine argSchema,
		String toolset,
		String scopeDefClassName,
		String genDefClassName,
		String itemName)
	{
		super(argSchema, toolset, scopeDefClassName, genDefClassName, itemName, "Value");
	}

	public IYCFLibAnyObj dereference( MssYCFGenContext genContext) {
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
			IYCFLibAnyObj atomScope = ((IYCFBamAtomObj)genDef).getRequiredContainerScope();
			if ((atomScope != null) && (atomScope instanceof IYCFBamTableObj))
			{
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
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"IndexColDef.getRequiredContainerIndex()" );
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

		IYCFBamTableObj startTable = curTable;

		while ((lookupIndex == null) && (curTable != null)) {
			lookupIndex = curTable.getOptionalLookupLookupIndex();
			if (lookupIndex == null) {
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

		IYCFBamValueObj nameCol = null;

		if( lookupIndex != null ) {
			Iterator<IYCFBamIndexColObj> iter = lookupIndex.getOptionalComponentsColumns().iterator();
			IYCFBamIndexColObj last = null;
			while( iter.hasNext() ) {
				last = iter.next();
			}
			if( last == null ) {
				throw new YCFLibRuntimeException( getClass(),
						S_ProcName,
						"Current TableDef " + startTable.getObjFullName() + " LookupIndex has no columns" );
			}
			nameCol = last.getRequiredLookupColumn();
		}

		if( nameCol == null ) {
			// Try to find a column named "Name" in the table
			curTable = startTable;
			Iterator<IYCFBamValueObj> iter;
			IYCFBamValueObj cur;
			while( ( nameCol == null ) && ( curTable != null ) ) {
				iter = curTable.getOptionalComponentsColumns().iterator();
				while( ( nameCol == null ) && iter.hasNext() ) {
					cur = iter.next();
					if( "Name".equalsIgnoreCase( cur.getRequiredName() ) ) {
						nameCol = cur;
					}
				}
				if( nameCol == null ) {
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
		}

		if( nameCol == null ) {
			// Use the last column of the primary key
			IYCFBamIndexObj pkey = startTable.getOptionalLookupPrimaryIndex();
			if( pkey != null ) {
				Iterator<IYCFBamIndexColObj> iter = pkey.getOptionalComponentsColumns().iterator();
				IYCFBamIndexColObj indexcol = null;
				while( iter.hasNext() ) {
					indexcol = iter.next();
				}
				if( indexcol == null ) {
					throw new YCFLibRuntimeException( getClass(),
						S_ProcName,
						"Current TableDef " + startTable.getObjFullName() + " does not specify a LookupIndex, have a Name column, or specify a PrimaryIndex" );
				}
				nameCol = indexcol.getRequiredLookupColumn();
			}
		}

		if (nameCol == null) {
			throw new YCFLibRuntimeException( getClass(),
				S_ProcName,
				"Current TableDef " + startTable.getObjFullName() + " does not specify a LookupIndex, have a Name column, or specify a PrimaryIndex" );
		}

		return ( nameCol );
	}
}

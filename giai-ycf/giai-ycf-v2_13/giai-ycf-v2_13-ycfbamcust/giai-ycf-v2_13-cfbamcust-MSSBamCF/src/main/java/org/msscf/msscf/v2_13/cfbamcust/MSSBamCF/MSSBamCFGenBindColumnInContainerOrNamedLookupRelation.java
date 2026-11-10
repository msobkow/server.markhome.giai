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
import java.util.List;
import java.util.ListIterator;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFGenBindColumnInContainerOrNamedLookupRelation
	extends MssYCFGenBindObj
{
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	public MSSBamYCFGenBindColumnInContainerOrNamedLookupRelation() {
		super();
	}

	public MSSBamYCFGenBindColumnInContainerOrNamedLookupRelation(
		MSSBamYCFEngine argSchema,
		String toolset,
		String scopeDefClassName,
		String genDefClassName,
		String itemName)
	{
		super( argSchema, toolset, scopeDefClassName, genDefClassName, itemName);
	}

	/**
	 *	The core evaluation of ColumnInOwnerLookupRelation is also to determine
	 *	if an index definition is in an owner relation.
	 *	<P>
	 *	WORKING: Yes, I know.  This should be a business method instead
	 *	of copying the code in IYCFBamIndexObj and MSIsaGenBindColumnInOwnerLookupRelation.
	 *
	 *	@param	genDef to be considered
	 *	@return	True if the column participates in an owner relation.
	 */
	public static Boolean isColumnInContainerOrNamedLookupRelation(IYCFLibAnyObj genDef) {

		IYCFLibAnyObj		focusDef;
		IYCFBamTableObj		tableDef;
		final String S_ProcName = "isColumnInContainerOrNamedLookupRelation";

		if( genDef instanceof IYCFBamAtomObj ) {
			IYCFBamAtomObj atomDef = (IYCFBamAtomObj)genDef;
			IYCFLibAnyObj atomScopeDef = atomDef.getObjScope();
			tableDef = (IYCFBamTableObj)atomScopeDef;
			focusDef = genDef;
		}
		else if( genDef instanceof IYCFBamTableColObj ) {
			IYCFBamTableColObj tableColDef = (IYCFBamTableColObj)genDef;
			IYCFLibAnyObj tableColScopeDef = tableColDef.getObjScope();
			tableDef = (IYCFBamTableObj)tableColScopeDef;
			focusDef = genDef;
		}
		else if( genDef instanceof IYCFBamIndexColObj ) {
			IYCFBamIndexColObj indexColDef = (IYCFBamIndexColObj)genDef;
			focusDef = indexColDef.getRequiredLookupColumn();
			if( focusDef instanceof IYCFBamAtomObj ) {
				tableDef = (IYCFBamTableObj)((IYCFBamAtomObj)focusDef).getObjScope();
			}
			else if( focusDef instanceof IYCFBamTableColObj ) {
				tableDef = (IYCFBamTableObj)((IYCFBamTableColObj)focusDef).getObjScope();
			}
			else {
				throw new YCFLibUnsupportedClassException( MSSBamYCFGenBindColumnInContainerOrNamedLookupRelation.class,
					S_ProcName,
					"genContext.GenDef.LookupColumn",
					genDef,
					"IYCFBamAtomObj, IYCFBamTableColObj" );
			}
		}
		else if( genDef instanceof IYCFBamRelationColObj ) {
			IYCFBamRelationColObj relColDef = (IYCFBamRelationColObj)genDef;
			IYCFLibAnyObj columnDef = relColDef.getRequiredLookupFromCol();
			if( columnDef instanceof IYCFBamAtomObj ) {
				focusDef = columnDef;
				tableDef = (IYCFBamTableObj)columnDef.getObjScope();
			}
			else if( columnDef instanceof IYCFBamTableColObj ) {
				focusDef = columnDef;
				tableDef = (IYCFBamTableObj)columnDef.getObjScope();
			}
			else {
				throw new YCFLibUnsupportedClassException( MSSBamYCFGenBindColumnInContainerOrNamedLookupRelation.class,
					S_ProcName,
					"genContext.GenDef.FromCol",
					genDef,
					"IYCFBamAtomObj, IYCFBamTableColObj" );
			}
		}
		else {
			throw new YCFLibUnsupportedClassException( MSSBamYCFGenBindColumnInContainerOrNamedLookupRelation.class,
				S_ProcName,
				"genContext.GenDef",
				genDef,
				"IYCFBamAtomObj, IYCFBamTableColObj, IYCFBamIndexColObj, IYCFBamRelationColObj" );
		}

		List<IYCFBamRelationObj> containerNamedLookupRelations = MSSBamYCFTableObj.getOwnerContainerNamedLookupChainRelations( tableDef );
		if( ( containerNamedLookupRelations == null )
		 || ( ( containerNamedLookupRelations != null ) && ( containerNamedLookupRelations.size() == 0 ) ) )
		{
			return( false );
		}

		ListIterator<IYCFBamRelationObj> ownerEnumerator = containerNamedLookupRelations.listIterator();

		IYCFBamRelationObj ownerRelation;
		IYCFBamRelationColObj ownerRelationCol;
		IYCFBamIndexColObj indexCol;
		Iterator<IYCFBamRelationColObj> ownerRelationCols;

		while( ownerEnumerator.hasNext() ) {

			ownerRelation = ownerEnumerator.next();
			ownerRelationCols = ownerRelation.getOptionalComponentsColumns().iterator();
			while( ownerRelationCols.hasNext() ) {
				ownerRelationCol = ownerRelationCols.next();
				indexCol = ownerRelationCol.getRequiredLookupFromCol();
				if( indexCol.getRequiredLookupColumn() == focusDef ) {
					return( true );
				}
			}
		}

		return( false );
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

		if (isColumnInContainerOrNamedLookupRelation(genDef)) {
			return ( "yes" );
		}
		else {
			return ( "no" );
		}
	}
}

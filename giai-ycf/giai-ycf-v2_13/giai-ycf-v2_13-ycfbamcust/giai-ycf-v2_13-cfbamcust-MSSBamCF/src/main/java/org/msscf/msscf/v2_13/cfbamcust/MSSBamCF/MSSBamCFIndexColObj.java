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

import java.util.*;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.IYCFGenKbDefClassObj;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;

public class MSSBamYCFIndexColObj
{
	public MSSBamYCFIndexColObj() {
	}

	protected static IYCFBamTableColObj probeForFromColumn( IYCFBamTableObj searchTable,
		IYCFBamSchema.RelationTypeEnum relationType,
		boolean isNullable,
		IYCFBamValueObj typeSpec )
	{
		IYCFBamRelationObj searchSuperRelation = MSSBamYCFTableObj.getSuperClassRelation( searchTable );
		if( searchSuperRelation != null ) {
			IYCFBamTableColObj superValue = probeForFromColumn( searchSuperRelation.getRequiredLookupToTable(),
				relationType,
				isNullable,
				typeSpec );
			if( superValue != null ) {
				return( superValue );
			}
		}

		IYCFBamRelationObj relation;
		IYCFBamRelationColObj relationCol;
		IYCFBamIndexColObj fromCol;
		IYCFBamValueObj dataCol;
		IYCFBamTableColObj fromTableCol;
		Iterator<IYCFBamRelationObj> iterRelations = searchTable.getOptionalComponentsRelation().iterator();
		Iterator<IYCFBamRelationColObj> iterRelationColumns;

		while( iterRelations.hasNext() ) {
			relation = iterRelations.next();
			if( relation.getRequiredRelationType() == relationType ) {
				iterRelationColumns = relation.getOptionalComponentsColumns().iterator();
				while( iterRelationColumns.hasNext() ) {
					relationCol = iterRelationColumns.next();
					fromCol = relationCol.getRequiredLookupFromCol();
					dataCol = fromCol.getRequiredLookupColumn();
					if( dataCol instanceof IYCFBamTableColObj ) {
						fromTableCol = (IYCFBamTableColObj)dataCol;
						if( fromTableCol.getRequiredIsNullable() == isNullable ) {
							if( fromTableCol.getRequiredParentDataType() == typeSpec ) {
								return( fromTableCol );
							}
						}
					}
				}
			}
		}

		return( null );
	}

	protected static IYCFBamTableColObj probeForFromColumn( IYCFBamTableObj searchTable,
		String relationTypeName,
		boolean isNullable,
		IYCFBamValueObj typeSpec )
	{
		IYCFBamSchema.RelationTypeEnum relationType = YCFBamSchema.parseRelationTypeEnum( relationTypeName ); 
		if( relationType == null ) {
			throw new YCFLibNullArgumentException( YCFBamIndexColObj.class,
				"probeForFromColumn",
				1,
				"Resolution of RelationType " + relationTypeName );
		}
		return( probeForFromColumn( searchTable, relationType, isNullable, typeSpec ) );
	}

	public static IYCFBamValueObj getWidestLookupColumn( IYCFBamIndexColObj targetIndexCol, MSSBamYCFGenContext genContext )
	{
		final String S_ProcName = "YCFBamIndexColObj.getWidestLookupColumn() ";

		MssYCFEngine genEngine = genContext.getGenEngine();

		/*
		 *	In order to implement the named lookups, what I need
		 *	to do is iterate through the columns of the lookup,
		 *	then for each one, pop to the top tabledef and search for
		 *	a matching inherited mandatory column type and use that
		 *	to pass the argument.
		 *
		 *	If no mandatory column is found, then an optional one
		 *	will be searched for.
		 *
		 *	I think I'll call the GEL verb SatisfyWidestLookupColumn
		 *	for a scope of IndexColumn, on the assumption that you're
		 *	iterating through the columns of the LookupIndex when
		 *	invoking this specialized verb.  The widest specification
		 *	is the one closest to the base class, not the first one
		 *	encountered in the inheritance tree.  Thus this will need
		 *	to be a recursive function that only considers the current
		 *	table's columns if the superclass could not find a match.
		 *
		 *	The first pass should only consider columns which are in the
		 *	Owner relationships of the table hierarchy.  Then a second
		 *	pass which considers columns of the Container relationships
		 *	should be performed.  The required passes should be made before
		 *	any optional passes are made.
		 *
		 *	Only if we can't resolve the column using an Owner or Container
		 *	relationship should we widen the search to general columns.
		 */

		// Determine the target column type

		IYCFBamValueObj targetColumn = targetIndexCol.getRequiredLookupColumn();

		IYCFBamValueObj typeSpec;
		if( targetColumn instanceof IYCFBamTableColObj ) {
			typeSpec = ((IYCFBamTableColObj)targetColumn).getRequiredParentDataType();
		}
		else {
			genEngine.getLog().message( S_ProcName + "Can only resolve TableCol columns, not "
				+ targetColumn.getClass().getSimpleName() + " "
				+ targetColumn.getRequiredContainerScope().getObjName() + "." + targetColumn.getRequiredName() );
			return( null );
		}

		// Emulate a "poptop Table" to get the table to be searched

		String goalTypeName = "Table";
		IYCFGenKbDefClassObj goalType = genEngine.getDefClassTableObj().readDefClassByNameIdx(goalTypeName);
		if( goalType == null ) {
			genEngine.getLog().message( S_ProcName + "Could not find goal class \"" + goalTypeName + "\""
				+ "\" is invalid" );
			return( null );
		}

		IYCFGenKbDefClassObj	objectDefType = genEngine.getDefClassTableObj().readDefClassByNameIdx( "Object" );
		if( objectDefType == null ) {
			genEngine.getLog().message( S_ProcName + "Could not find object type \"Object\". \"" );
			return( null );
		}

		MSSBamYCFGenContext goalContext = genContext;
		MSSBamYCFGenContext prevContext;
		MSSBamYCFGenContext topContext = null;
		String searchTypeName;
		IYCFGenKbDefClassObj searchType;

		while (goalContext != null) {
			searchTypeName = goalContext.getRequiredLookupGenDef().getRequiredName();
			searchType = genEngine.getDefClassTableObj().readDefClassByNameIdx(searchTypeName);
			if( searchType == null ) {
				genEngine.getLog().message( S_ProcName + "Could not find search class \"" + searchTypeName + "\"." );
				return( null );
			}

			while ( (searchType != null ) && ( searchType != goalType )) {
				if( searchType != objectDefType ) {
					searchType = searchType.getOptionalParentBaseDefClass();
				}
				else {
					searchType = null;
				}
			}

			if (searchType != null) {
				// The goal context definition derives from the target type
				topContext = goalContext;
			}

			prevContext = (MSSBamYCFGenContext)goalContext.getPrevContext();
			if (prevContext != goalContext) {
				goalContext = prevContext;
			}
			else {
				goalContext = null;
			}
		}

		if (topContext == null) {
			genEngine.getLog().message( S_ProcName + "Could not find top context with a definition derived from \"" + goalTypeName + "\"");
			return (null);
		}

		IYCFBamTableObj searchTable;
		IYCFLibAnyObj refDef = topContext.getGenDef();
		if( refDef instanceof IYCFBamTableObj ) {
			searchTable = (IYCFBamTableObj)refDef;
		}
		else {
			genEngine.getLog().message( S_ProcName + "Top context says it has a definition derived from \"" + goalTypeName + "\", but returned an "
				+ refDef.getClass().getSimpleName() );
			return (null);
		}

		// Search for the shallowest required Owner attribute derived from the specified data type
		// If not found, search for the shallowest required Container attribute derived from the specified data type
		// If not found, search for the shallowest required Parent attribute derived from the specified data type
		// If not found, search for the shallowest required Lookup attribute derived from the specified data type
		// If not found, search for the shallowest optional Owner attribute derived from the specified data type
		// If not found, search for the shallowest optional Container attribute derived from the specified data type
		// If not found, search for the shallowest optional Parent attribute derived from the specified data type
		// If not found, search for the shallowest optional Lookup attribute derived from the specified data type
		// If not found, barf

		IYCFBamTableColObj matchingTableCol = probeForFromColumn( searchTable, "Owner", false, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		matchingTableCol = probeForFromColumn( searchTable, "Container", false, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		matchingTableCol = probeForFromColumn( searchTable, "Parent", false, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		matchingTableCol = probeForFromColumn( searchTable, "Lookup", false, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		matchingTableCol = probeForFromColumn( searchTable, "Owner", true, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		matchingTableCol = probeForFromColumn( searchTable, "Container", true, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		matchingTableCol = probeForFromColumn( searchTable, "Parent", true, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		matchingTableCol = probeForFromColumn( searchTable, "Lookup", true, typeSpec );
		if( matchingTableCol != null ) {
			return( matchingTableCol );
		}

		genEngine.getLog().message( S_ProcName + "Could not find a matching " + searchTable.getRequiredName() + " column for type spec \"" + typeSpec.getRequiredName() + "\"" );
		return( null );
	}
}

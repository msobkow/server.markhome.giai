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

import java.math.*;
import java.text.*;
import java.util.*;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFTableColObj
{
	public MSSBamYCFTableColObj() {
	}

    public static IYCFBamRelationObj getIdGenResolverRelation(IYCFBamTableColObj tableColDef)
    {
        final String S_ProcName = "RMTableColDefObj.getIdGenResolverRelation() ";

	    // Determine the target dispenser table

	    IYCFBamTableObj dispenserDef = null;
        IYCFBamValueObj valueDef = tableColDef.getRequiredParentDataType();
        if( valueDef instanceof IYCFBamId16GenObj ) {
	        dispenserDef = ((IYCFBamId16GenObj)valueDef).getOptionalLookupDispenser();
        }
        else if( valueDef instanceof IYCFBamId32GenObj ) {
	        dispenserDef = ((IYCFBamId32GenObj)valueDef).getOptionalLookupDispenser();
        }
        else if( valueDef instanceof IYCFBamId64GenObj ) {
	        dispenserDef = ((IYCFBamId64GenObj)valueDef).getOptionalLookupDispenser();
        }

        // If there is no dispenser table, we have nothing to resolve
        if( dispenserDef == null ) {
            throw new RuntimeException(S_ProcName + "No dispenser specified for tableColDef \"" + tableColDef.getRequiredName() + "\"!");
        }

        IYCFBamTableObj tableDef = tableColDef.getRequiredContainerTable();
        IYCFBamRelationObj superClassRelation = MSSBamYCFTableObj.getSuperClassRelation( tableDef );

        Iterator<IYCFBamRelationObj> ownerRelations;
        IYCFBamRelationObj ownerRelation;
        IYCFBamTableObj ownedByTable;
        Boolean ownerDerivesFromDispenser;

        /*
         *	Build a list of candidate relations which reference a ToTableDef that
         *	derives from the dispenser table definition.
         */
        List<IYCFBamRelationObj> candidates = new ArrayList<IYCFBamRelationObj>();
        while( tableDef != null ) {
            ownerRelations = MSSBamYCFTableObj.getContainerOwnerRelations(tableDef).iterator();
	        while( ownerRelations.hasNext() ) {
		        ownerRelation = ownerRelations.next();
		        ownedByTable = ownerRelation.getRequiredLookupToIndex().getRequiredContainerTable();
		        ownerDerivesFromDispenser = false;
		        while( ( ! ownerDerivesFromDispenser ) && ( ownedByTable != null ) ) {
			        if( ownedByTable == dispenserDef ) {
				        ownerDerivesFromDispenser = true;
			        }
			        else {
				        superClassRelation = MSSBamYCFTableObj.getSuperClassRelation( ownedByTable );
				        if( superClassRelation != null ) {
					        ownedByTable = superClassRelation.getRequiredLookupToIndex().getRequiredContainerTable();
				        }
				        else {
					        ownedByTable = null;
				        }
			        }
		        }
		        if( ownerDerivesFromDispenser ) {
			        candidates.add( ownerRelation );
		        }
	        }

	        superClassRelation = MSSBamYCFTableObj.getSuperClassRelation( tableDef );
	        if( superClassRelation != null ) {
		        tableDef = superClassRelation.getRequiredLookupToIndex().getRequiredContainerTable();
	        }
	        else {
		        tableDef = null;
	        }
        }

        if (candidates.size() == 0)
        {
            throw new RuntimeException(S_ProcName + "Could not find any candidate owner relations");
        }

        int idx = candidates.size() - 1;
        IYCFBamRelationObj idGenResolverRelation = candidates.get(idx);

        // If we don't find one at all, the engine will complain in due time

        return (idGenResolverRelation);
    }
}

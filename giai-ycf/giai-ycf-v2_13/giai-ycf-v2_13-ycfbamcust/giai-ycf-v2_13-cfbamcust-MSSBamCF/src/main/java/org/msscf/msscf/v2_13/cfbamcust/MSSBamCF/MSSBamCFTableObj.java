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

public class MSSBamYCFTableObj
{
	public MSSBamYCFTableObj() {
	}

    public static List<IYCFBamId16GenObj> getId16Generators( IYCFBamTableObj tableDef )
    {
        List<IYCFBamId16GenObj> list = new LinkedList<IYCFBamId16GenObj>();
        Iterator<IYCFBamValueObj> childrenColumns = tableDef.getOptionalComponentsColumns().iterator();
        while (childrenColumns.hasNext())
        {
            IYCFBamAtomObj atomDef = null;
            IYCFLibAnyObj colDef = childrenColumns.next();
            if (colDef instanceof IYCFBamTableColObj)
            {
                atomDef = (IYCFBamAtomObj)((IYCFBamTableColObj)colDef).getRequiredParentDataType();
            }
            else if (colDef instanceof IYCFBamAtomObj)
            {
                atomDef = (IYCFBamAtomObj)colDef;
            }
            if (atomDef != null)
            {
                if (atomDef instanceof IYCFBamId16GenObj)
                {
                    list.add((IYCFBamId16GenObj)atomDef);
                }
            }
        }
        return (list);
    }

    public static List<IYCFBamId32GenObj> getId32Generators(IYCFBamTableObj tableDef)
    {
        List<IYCFBamId32GenObj> list = new LinkedList<IYCFBamId32GenObj>();
        Iterator<IYCFBamValueObj> childrenColumns = tableDef.getOptionalComponentsColumns().iterator();
        while (childrenColumns.hasNext())
        {
            IYCFBamAtomObj atomDef = null;
            IYCFLibAnyObj colDef = childrenColumns.next();
            if (colDef instanceof IYCFBamTableColObj)
            {
                atomDef = (IYCFBamAtomObj)((IYCFBamTableColObj)colDef).getRequiredParentDataType();
            }
            else if (colDef instanceof IYCFBamAtomObj)
            {
                atomDef = (IYCFBamAtomObj)colDef;
            }
            if (atomDef != null)
            {
                if (atomDef instanceof IYCFBamId32GenObj)
                {
                    list.add((IYCFBamId32GenObj)atomDef);
                }
            }
        }
        return (list);
    }

    public static List<IYCFBamId64GenObj> getId64Generators(IYCFBamTableObj tableDef)
    {
        List<IYCFBamId64GenObj> list = new LinkedList<IYCFBamId64GenObj>();
        Iterator<IYCFBamValueObj> childrenColumns = tableDef.getOptionalComponentsColumns().iterator();
        while (childrenColumns.hasNext())
        {
            IYCFBamAtomObj atomDef = null;
            IYCFLibAnyObj colDef = childrenColumns.next();
            if (colDef instanceof IYCFBamTableColObj)
            {
                atomDef = (IYCFBamAtomObj)((IYCFBamTableColObj)colDef).getRequiredParentDataType();
            }
            else if (colDef instanceof IYCFBamAtomObj)
            {
                atomDef = (IYCFBamAtomObj)colDef;
            }
            if (atomDef != null)
            {
                if (atomDef instanceof IYCFBamId64GenObj)
                {
                    list.add((IYCFBamId64GenObj)atomDef);
                }
            }
        }
        return (list);
    }

    public static List<IYCFBamId16GenObj> getDispensedId16Generators(IYCFBamTableObj tableDef)
    {
        List<IYCFBamId16GenObj> list = new LinkedList<IYCFBamId16GenObj>();
        Iterator<IYCFBamId16GenObj> dispensed = tableDef.getSchema().getId16GenTableObj().readId16GenByDispIdx(tableDef.getRequiredTenantId(), tableDef.getRequiredId()).iterator();
        while (dispensed.hasNext())
        {
            list.add(dispensed.next());
        }
        return (list);
    }

    public static List<IYCFBamId32GenObj> getDispensedId32Generators(IYCFBamTableObj tableDef)
    {
        List<IYCFBamId32GenObj> list = new LinkedList<IYCFBamId32GenObj>();
        Iterator<IYCFBamId32GenObj> dispensed = tableDef.getSchema().getId32GenTableObj().readId32GenByDispIdx(tableDef.getRequiredTenantId(), tableDef.getRequiredId()).iterator();
        while (dispensed.hasNext())
        {
            list.add(dispensed.next());
        }
        return (list);
    }

    public static List<IYCFBamId64GenObj> getDispensedId64Generators(IYCFBamTableObj tableDef)
    {
        List<IYCFBamId64GenObj> list = new LinkedList<IYCFBamId64GenObj>();
        Iterator<IYCFBamId64GenObj> dispensed = tableDef.getSchema().getId64GenTableObj().readId64GenByDispIdx(tableDef.getRequiredTenantId(), tableDef.getRequiredId()).iterator();
        while (dispensed.hasNext())
        {
            list.add(dispensed.next());
        }
        return (list);
    }

    public static List<IYCFBamRelationObj> getOnlyOwnerRelations( IYCFBamTableObj tableDef )
    {
        IYCFBamRelationObj relationDef = null;
        List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
        Iterator<IYCFBamRelationObj> childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext()) {
            relationDef = childrenRelations.next();
            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
                list.add(relationDef);
            }
        }

        IYCFBamRelationObj superClass = getSuperClassRelation( tableDef );
        while( superClass != null ) {
        	tableDef = superClass.getRequiredLookupToTable();
            childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
            while (childrenRelations.hasNext()) {
                relationDef = childrenRelations.next();
                if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
                    list.add(relationDef);
                }
            }
        	superClass = getSuperClassRelation( tableDef );
        }

        childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext()) {
            relationDef = childrenRelations.next();
            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
                list.add(relationDef);
            }
        }

        superClass = getSuperClassRelation( tableDef );
        while( superClass != null ) {
        	tableDef = superClass.getRequiredLookupToTable();
            childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
            while (childrenRelations.hasNext()) {
                relationDef = childrenRelations.next();
                if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
                    list.add(relationDef);
                }
            }
        	superClass = getSuperClassRelation( tableDef );
        }

        return (list);
    }

    public static List<IYCFBamRelationObj> getContainerOwnerRelations( IYCFBamTableObj tableDef )
    {
        IYCFBamRelationObj relationDef = null;
        String relationTag = null;
        List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
        Iterator<IYCFBamRelationObj> childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext()) {
            relationDef = childrenRelations.next();
            if( ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Parent )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) )
            {
                list.add(relationDef);
            }
        }

        IYCFBamRelationObj superClass = getSuperClassRelation( tableDef );
        while( superClass != null ) {
        	tableDef = superClass.getRequiredLookupToTable();
            childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
            while (childrenRelations.hasNext()) {
                relationDef = childrenRelations.next();
                if( ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner )
                 || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Parent )
                 || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) )
                {
                	list.add(relationDef);
                }
            }
        	superClass = getSuperClassRelation( tableDef );
        }

        return (list);
    }

    public static IYCFBamRelationObj getContainerRelation(IYCFBamTableObj tableDef)
    {
        IYCFBamRelationObj relationDef;
        Iterator<IYCFBamRelationObj> childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext()) {
            relationDef = childrenRelations.next();
            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
                return (relationDef);
            }
        }
        return (null);
    }

    public static IYCFBamRelationObj getInheritedContainerRelation(IYCFBamTableObj tableDef)
    {
    	IYCFBamRelationObj inheritedContainerRelation = null;
        IYCFBamRelationObj relationDef;
        Iterator<IYCFBamRelationObj> childrenRelations;
    	while( ( inheritedContainerRelation == null ) && ( tableDef != null ) ) {
	        childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
	        while (childrenRelations.hasNext()) {
	            relationDef = childrenRelations.next();
	            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container ) {
            		return( relationDef );
	            }
	        }
	        relationDef = getSuperClassRelation( tableDef );
	        if( relationDef == null ) {
	        	tableDef = null;
	        }
	        else {
	        	tableDef = relationDef.getRequiredLookupToTable();
	        }
    	}
        return (null);
    }

    public static IYCFBamRelationObj getOwnerRelation(IYCFBamTableObj tableDef)
    {
        IYCFBamRelationObj relationDef;
        Iterator<IYCFBamRelationObj> childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext()) {
            relationDef = childrenRelations.next();
            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
                return (relationDef);
            }
        }
        return (null);
    }

    public static IYCFBamRelationObj getInheritedOwnerRelation(IYCFBamTableObj tableDef)
    {
    	IYCFBamRelationObj inheritedOwnerRelation = null;
        IYCFBamRelationObj relationDef;
        Iterator<IYCFBamRelationObj> childrenRelations;
    	while( ( inheritedOwnerRelation == null ) && ( tableDef != null ) ) {
	        childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
	        while (childrenRelations.hasNext()) {
	            relationDef = childrenRelations.next();
	            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) {
            		return( relationDef );
	            }
	        }
	        relationDef = getSuperClassRelation( tableDef );
	        if( relationDef == null ) {
	        	tableDef = null;
	        }
	        else {
	        	tableDef = relationDef.getRequiredLookupToTable();
	        }
    	}
        return (null);
    }

    public static List<IYCFBamRelationObj> getOwnerLookupRelations(IYCFBamTableObj tableDef)
    {
        List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
        Iterator<IYCFBamRelationObj> childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext())
        {
            IYCFBamRelationObj relationDef = childrenRelations.next();
            if( ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Parent )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Lookup )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner ) )
            {
                list.add(relationDef);
            }
        }
        return (list);
    }

    public static List<IYCFBamRelationObj> getOwnerContainerNamedLookupChainRelations(IYCFBamTableObj tableDef)
    {
        List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
        List<IYCFBamChainObj> componentChains = tableDef.getOptionalComponentsChains();
        Iterator<IYCFBamRelationObj> childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext()) {
            IYCFBamRelationObj relationDef = childrenRelations.next();
            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
            	;
            }
            else if( ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Owner )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Container )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Parent )
             || ( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Lookup ) )
            {
               list.add(relationDef);
            }
            else {
            	if( ! relationDef.getRequiredIsXsdContainer() ) {
	            	IYCFBamIndexObj toIndex = relationDef.getRequiredLookupToIndex();
	            	if( toIndex.getRequiredIsUnique() ) {
	            		boolean referencedByChain = false;
	            		Iterator<IYCFBamChainObj> iterChain = componentChains.iterator();
	            		while( ( ! referencedByChain ) && iterChain.hasNext() ) {
	            			IYCFBamChainObj chain = iterChain.next();
	            			if( chain.getRequiredLookupPrevRel() == relationDef ) {
	            				referencedByChain = true;
	            			}
	            			else if( chain.getRequiredLookupNextRel() == relationDef ) {
	            				referencedByChain = true;
	            			}
	            		}
	            		if( referencedByChain ) {
	            			list.add( relationDef );
	            		}
	            		else {
			            	IYCFBamTableObj toTable = relationDef.getRequiredLookupToTable();
			            	IYCFBamIndexObj lookupIndex = toTable.getOptionalLookupLookupIndex();
			            	while( ( lookupIndex == null ) && ( toTable != null ) ) {
			            		IYCFBamRelationObj superRelation = getSuperClassRelation( toTable );
			            		if( superRelation != null ) {
			            			toTable = superRelation.getRequiredLookupToTable();
				            		if( toTable != null ) {
				            			lookupIndex = toTable.getOptionalLookupLookupIndex();
				            		}
			            		}
			            		else {
			            			toTable = null;
			            		}
			            	}
			            	if( lookupIndex != null ) {
			            		list.add( relationDef );
			            	}
	            		}
	            	}
            	}
            }
        }
        return (list);
    }

    public static List<IYCFBamAtomObj> getChildrenAtoms( IYCFBamTableObj tableDef )
    {
        List<IYCFBamAtomObj> list = new LinkedList<IYCFBamAtomObj>();
        Iterator<IYCFBamValueObj> childrenColumns = tableDef.getOptionalComponentsColumns().iterator();
        while (childrenColumns.hasNext())
        {
            IYCFBamValueObj colDef = childrenColumns.next();
            if (colDef instanceof IYCFBamAtomObj)
            {
                list.add( (IYCFBamAtomObj)colDef);
            }
        }
        return (list);
    }

    public static IYCFBamRelationObj getSuperClassRelation( IYCFBamTableObj tableDef )
    {
        Iterator<IYCFBamRelationObj> childrenRelations = tableDef.getOptionalComponentsRelation().iterator();
        while (childrenRelations.hasNext())
        {
            IYCFBamRelationObj relationDef = childrenRelations.next();
            if( relationDef.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
                return( relationDef );
            }
        }
        return (null);
    }

    public static List<IYCFBamRelationObj> getSubClassRelations(IYCFBamTableObj tableDef)
    {
        List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
        Iterator<IYCFBamRelationObj> reverseRelations = tableDef.getOptionalChildrenReverseRelations().iterator();
        while (reverseRelations.hasNext())
        {
            IYCFBamRelationObj reverseRelation = reverseRelations.next();
            if( reverseRelation.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
                list.add(reverseRelation);
            }
        }
        return (list);
    }

    public static IYCFBamIndexObj getPrimaryKeyIndex(IYCFBamTableObj tableDef)
    {
        IYCFBamIndexObj primaryIndex = tableDef.getOptionalLookupPrimaryIndex();
        return (primaryIndex);
    }

    public static List<IYCFBamRelationObj> getFactoryOwnerRelations(IYCFBamTableObj tableDef)
    {
        List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
        Iterator<IYCFBamRelationObj> ownerRelations = getContainerOwnerRelations(tableDef).iterator();
        while (ownerRelations.hasNext())
        {
            // throw new NotImplementedException();
            IYCFBamRelationObj ownerRelation = ownerRelations.next();
            if( ownerRelation.getRequiredRelationType() == IYCFBamSchema.RelationTypeEnum.Superclass ) {
                list.add(ownerRelation);
            }
        }
        return (list);
    }

    public static List<IYCFBamIndexObj> getInheritedIndexes(IYCFBamTableObj tableDef)
    {
        List<IYCFBamIndexObj> list = new LinkedList<IYCFBamIndexObj>();
        IYCFBamRelationObj superClassRelation = getSuperClassRelation(tableDef);
        if (superClassRelation != null)
        {
            Iterator<IYCFBamIndexObj> superClassInheritedIndexes
                = getInheritedIndexes(superClassRelation.getRequiredLookupToTable()).iterator();
            while (superClassInheritedIndexes.hasNext())
            {
                list.add(superClassInheritedIndexes.next());
            }
            Iterator<IYCFBamIndexObj> myIndexes
                = getChildrenIndexes( tableDef ).iterator();
            while( myIndexes.hasNext() )
            {
                list.add( myIndexes.next() );
            }
        }
        return (list);
    }

    public static List<IYCFBamIndexObj> getChildrenIndexes(IYCFBamTableObj tableDef)
    {
        Iterator<IYCFBamIndexObj> iter = tableDef.getOptionalComponentsIndex().iterator();
        List<IYCFBamIndexObj> list = new LinkedList<IYCFBamIndexObj>();
        while( iter.hasNext() ) {
        	list.add( iter.next() );
        }
        return( list );
    }

    public static List<IYCFBamRelationObj> getInheritedRelations(IYCFBamTableObj tableDef)
    {
        List<IYCFBamRelationObj> list = new LinkedList<IYCFBamRelationObj>();
        IYCFBamRelationObj superClassRelation = getSuperClassRelation(tableDef);
        if (superClassRelation != null)
        {
            Iterator<IYCFBamRelationObj> superClassInheritedRelations
                = getInheritedRelations(superClassRelation.getRequiredLookupToTable()).iterator();
            while (superClassInheritedRelations.hasNext())
            {
                list.add(superClassInheritedRelations.next());
            }
            Iterator<IYCFBamRelationObj> myRelations
                = getChildrenRelations(tableDef).iterator();
            while (myRelations.hasNext())
            {
                list.add(myRelations.next());
            }
        }
        return (list);
    }

    public static List<IYCFBamRelationObj> getChildrenRelations(IYCFBamTableObj tableDef)
    {
        List<IYCFBamRelationObj> childrenRelations = new LinkedList<IYCFBamRelationObj>();
        Collection<IYCFBamRelationObj> cltn = tableDef.getOptionalComponentsRelation();
        Iterator<IYCFBamRelationObj> iter = cltn.iterator();
        while( iter.hasNext() ) {
        	childrenRelations.add( iter.next() );
        }
        return (childrenRelations);
    }

    public static List<IYCFBamValueObj> getTableIdGenerators(IYCFBamTableObj tableDef)
    {
        List<IYCFBamValueObj> list = new LinkedList<IYCFBamValueObj>();
        Iterator<IYCFBamId16GenObj> id16Generators = getId16Generators(tableDef).iterator();
        while (id16Generators.hasNext())
        {
            list.add(id16Generators.next());
        }
        Iterator<IYCFBamId32GenObj> id32Generators = getId32Generators(tableDef).iterator();
        while (id32Generators.hasNext())
        {
            list.add(id32Generators.next());
        }
        Iterator<IYCFBamId64GenObj> id64Generators = getId64Generators(tableDef).iterator();
        while (id64Generators.hasNext())
        {
            list.add(id64Generators.next());
        }
        return (list);
    }
}

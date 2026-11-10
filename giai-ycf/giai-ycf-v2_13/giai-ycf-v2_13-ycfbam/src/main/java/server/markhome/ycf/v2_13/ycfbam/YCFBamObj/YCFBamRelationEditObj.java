// Description: Java 11 edit object instance implementation for YCFBam Relation.

/*
 *	org.mssycf.mssycf.YCFBam
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
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamRelationEditObj
	extends YCFBamScopeEditObj

	implements IYCFBamRelationEditObj
{
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamTableObj requiredContainerFromTable;
	protected IYCFSecTenantObj requiredOwnerRelTenant;
	protected IYCFBamIndexObj requiredLookupFromIndex;
	protected IYCFBamTableObj requiredLookupToTable;
	protected IYCFBamIndexObj requiredLookupToIndex;
	protected IYCFBamRelationObj optionalLookupNarrowed;

	public YCFBamRelationEditObj( IYCFBamRelationObj argOrig ) {
		super( argOrig );
		optionalLookupDefSchema = null;
		requiredContainerFromTable = null;
		requiredOwnerRelTenant = null;
		requiredLookupFromIndex = null;
		requiredLookupToTable = null;
		requiredLookupToIndex = null;
		optionalLookupNarrowed = null;
	}

	public String getClassCode() {
		return( YCFBamRelationObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Relation" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamTableObj scope = getRequiredContainerFromTable();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamTableObj scope = getRequiredContainerFromTable();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public IYCFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		IYCFLibAnyObj subObj = null;
		IYCFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getRelationColTableObj().readRelationColByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof IYCFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public IYCFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamRelationObj retobj = getSchema().getRelationTableObj().realiseRelation( (IYCFBamRelationObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsRelation().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamRelationObj retobj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getRelationTableObj().createRelation( getOrigAsRelation() );
		if( retobj == getOrigAsRelation() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getRelationTableObj().updateRelation( (IYCFBamRelationObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getRelationTableObj().deleteRelation( getOrigAsRelation() );
		return( null );
	}

	public IYCFBamRelationTableObj getRelationTable() {
		return( orig.getSchema().getRelationTableObj() );
	}

	public IYCFBamRelationEditObj getEditAsRelation() {
		return( (IYCFBamRelationEditObj)this );
	}

	public IYCFBamRelationObj getOrigAsRelation() {
		return( (IYCFBamRelationObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsRelation().getSchema().getBackingStore()).getFactoryRelation().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDefSchema = null;
			requiredContainerFromTable = null;
			requiredOwnerRelTenant = null;
			requiredLookupFromIndex = null;
			requiredLookupToTable = null;
			requiredLookupToIndex = null;
			optionalLookupNarrowed = null;
		}
	}

	public YCFBamRelationBuff getRelationBuff() {
		return( (YCFBamRelationBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getRelationBuff().getRequiredTableId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getRelationBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getRelationBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getRelationBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getRelationBuff().getRequiredName() != value ) {
			getRelationBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortName() {
		return( getRelationBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getRelationBuff().getOptionalShortName() != value ) {
			getRelationBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getRelationBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getRelationBuff().getOptionalLabel() != value ) {
			getRelationBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getRelationBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getRelationBuff().getOptionalShortDescription() != value ) {
			getRelationBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getRelationBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getRelationBuff().getOptionalDescription() != value ) {
			getRelationBuff().setOptionalDescription( value );
		}
	}

	public IYCFBamSchema.RelationTypeEnum getRequiredRelationType() {
		return( getRelationBuff().getRequiredRelationType() );
	}

	public void setRequiredRelationType( IYCFBamSchema.RelationTypeEnum value ) {
		if( getRelationBuff().getRequiredRelationType() != value ) {
			getRelationBuff().setRequiredRelationType( value );
		}
	}

	public String getOptionalDbName() {
		return( getRelationBuff().getOptionalDbName() );
	}

	public void setOptionalDbName( String value ) {
		if( getRelationBuff().getOptionalDbName() != value ) {
			getRelationBuff().setOptionalDbName( value );
		}
	}

	public String getOptionalSuffix() {
		return( getRelationBuff().getOptionalSuffix() );
	}

	public void setOptionalSuffix( String value ) {
		if( getRelationBuff().getOptionalSuffix() != value ) {
			getRelationBuff().setOptionalSuffix( value );
		}
	}

	public long getRequiredFromIndexId() {
		return( getRelationBuff().getRequiredFromIndexId() );
	}

	public long getRequiredToTableId() {
		return( getRelationBuff().getRequiredToTableId() );
	}

	public long getRequiredToIndexId() {
		return( getRelationBuff().getRequiredToIndexId() );
	}

	public boolean getRequiredIsRequired() {
		return( getRelationBuff().getRequiredIsRequired() );
	}

	public void setRequiredIsRequired( boolean value ) {
		if( getRelationBuff().getRequiredIsRequired() != value ) {
			getRelationBuff().setRequiredIsRequired( value );
		}
	}

	public boolean getRequiredIsXsdContainer() {
		return( getRelationBuff().getRequiredIsXsdContainer() );
	}

	public void setRequiredIsXsdContainer( boolean value ) {
		if( getRelationBuff().getRequiredIsXsdContainer() != value ) {
			getRelationBuff().setRequiredIsXsdContainer( value );
		}
	}

	public boolean getRequiredIsLateResolver() {
		return( getRelationBuff().getRequiredIsLateResolver() );
	}

	public void setRequiredIsLateResolver( boolean value ) {
		if( getRelationBuff().getRequiredIsLateResolver() != value ) {
			getRelationBuff().setRequiredIsLateResolver( value );
		}
	}

	public boolean getRequiredAllowAddendum() {
		return( getRelationBuff().getRequiredAllowAddendum() );
	}

	public void setRequiredAllowAddendum( boolean value ) {
		if( getRelationBuff().getRequiredAllowAddendum() != value ) {
			getRelationBuff().setRequiredAllowAddendum( value );
		}
	}

	public Long getOptionalNarrowedTenantId() {
		return( getRelationBuff().getOptionalNarrowedTenantId() );
	}

	public Long getOptionalNarrowedId() {
		return( getRelationBuff().getOptionalNarrowedId() );
	}

	public IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return( getRelationBuff().getRequiredCodeVis() );
	}

	public void setRequiredCodeVis( IYCFBamSchema.CodeVisibilityEnum value ) {
		if( getRelationBuff().getRequiredCodeVis() != value ) {
			getRelationBuff().setRequiredCodeVis( value );
		}
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getRelationBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getRelationBuff().getOptionalDefSchemaTenantId(),
					getRelationBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getRelationBuff();
			}
			if( value != null ) {
				getRelationBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getRelationBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getRelationBuff().setOptionalDefSchemaTenantId( null );
				getRelationBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public IYCFBamTableObj getRequiredContainerFromTable() {
		return( getRequiredContainerFromTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerFromTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerFromTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getRelationBuff().getRequiredTableId() );
				requiredContainerFromTable = obj;
				if( obj != null ) {
					getRelationBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getRelationBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerFromTable = obj;
				}
			}
		}
		return( requiredContainerFromTable );
	}

	public void setRequiredContainerFromTable( IYCFBamTableObj value ) {
			if( buff == null ) {
				getRelationBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerFromTable = value;
	}

	public List<IYCFBamRelationColObj> getOptionalComponentsColumns() {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getRelationColTableObj().readRelationColByRelationIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamRelationColObj> getOptionalComponentsColumns( boolean forceRead ) {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getRelationColTableObj().readRelationColByRelationIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamPopTopDepObj> getOptionalComponentsPopDep() {
		List<IYCFBamPopTopDepObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getPopTopDepTableObj().readPopTopDepByContRelIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamPopTopDepObj> getOptionalComponentsPopDep( boolean forceRead ) {
		List<IYCFBamPopTopDepObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getPopTopDepTableObj().readPopTopDepByContRelIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFSecTenantObj getRequiredOwnerRelTenant() {
		return( getRequiredOwnerRelTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerRelTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerRelTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerRelTenant = obj;
			}
		}
		return( requiredOwnerRelTenant );
	}

	public void setRequiredOwnerRelTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getRelationBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getRelationBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerRelTenant = value;
			super.setRequiredOwnerTenant( value );
	}

	public IYCFBamIndexObj getRequiredLookupFromIndex() {
		return( getRequiredLookupFromIndex( false ) );
	}

	public IYCFBamIndexObj getRequiredLookupFromIndex( boolean forceRead ) {
		if( forceRead || ( requiredLookupFromIndex == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamIndexObj obj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getIndexTableObj().readIndexByIdIdx( getPKey().getRequiredTenantId(),
					getRelationBuff().getRequiredFromIndexId() );
				requiredLookupFromIndex = obj;
			}
		}
		return( requiredLookupFromIndex );
	}

	public void setRequiredLookupFromIndex( IYCFBamIndexObj value ) {
			if( buff == null ) {
				getRelationBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredFromIndexId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupFromIndex = value;
	}

	public IYCFBamTableObj getRequiredLookupToTable() {
		return( getRequiredLookupToTable( false ) );
	}

	public IYCFBamTableObj getRequiredLookupToTable( boolean forceRead ) {
		if( forceRead || ( requiredLookupToTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getRelationBuff().getRequiredToTableId() );
				requiredLookupToTable = obj;
			}
		}
		return( requiredLookupToTable );
	}

	public void setRequiredLookupToTable( IYCFBamTableObj value ) {
			if( buff == null ) {
				getRelationBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredToTableId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupToTable = value;
	}

	public IYCFBamIndexObj getRequiredLookupToIndex() {
		return( getRequiredLookupToIndex( false ) );
	}

	public IYCFBamIndexObj getRequiredLookupToIndex( boolean forceRead ) {
		if( forceRead || ( requiredLookupToIndex == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamIndexObj obj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getIndexTableObj().readIndexByIdIdx( getPKey().getRequiredTenantId(),
					getRelationBuff().getRequiredToIndexId() );
				requiredLookupToIndex = obj;
			}
		}
		return( requiredLookupToIndex );
	}

	public void setRequiredLookupToIndex( IYCFBamIndexObj value ) {
			if( buff == null ) {
				getRelationBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationBuff().setRequiredToIndexId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupToIndex = value;
	}

	public IYCFBamRelationObj getOptionalLookupNarrowed() {
		return( getOptionalLookupNarrowed( false ) );
	}

	public IYCFBamRelationObj getOptionalLookupNarrowed( boolean forceRead ) {
		if( forceRead || ( optionalLookupNarrowed == null ) ) {
			boolean anyMissing = false;
			if( getRelationBuff().getOptionalNarrowedTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationBuff().getOptionalNarrowedId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamRelationObj obj = ((IYCFBamSchemaObj)getOrigAsRelation().getSchema()).getRelationTableObj().readRelationByIdIdx( getRelationBuff().getOptionalNarrowedTenantId(),
					getRelationBuff().getOptionalNarrowedId() );
				optionalLookupNarrowed = obj;
			}
		}
		return( optionalLookupNarrowed );
	}

	public void setOptionalLookupNarrowed( IYCFBamRelationObj value ) {
			if( buff == null ) {
				getRelationBuff();
			}
			if( value != null ) {
				getRelationBuff().setOptionalNarrowedTenantId( value.getRequiredTenantId() );
				getRelationBuff().setOptionalNarrowedId( value.getRequiredId() );
			}
			else {
				getRelationBuff().setOptionalNarrowedTenantId( null );
				getRelationBuff().setOptionalNarrowedId( null );
			}
			optionalLookupNarrowed = value;
	}

	public void copyBuffToOrig() {
		YCFBamRelationBuff origBuff = getOrigAsRelation().getRelationBuff();
		YCFBamRelationBuff myBuff = getRelationBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamRelationBuff origBuff = getOrigAsRelation().getRelationBuff();
		YCFBamRelationBuff myBuff = getRelationBuff();
		myBuff.set( origBuff );
	}

	public IYCFBamSubProjectObj getProject() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamSubProjectObj ) {
				return ((IYCFBamSubProjectObj)curDef);
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	public IYCFBamTopDomainObj getCompany() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamTopDomainObj ) {
				return ((IYCFBamTopDomainObj)curDef);
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	public IYCFBamSchemaDefObj getSchemaDef() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamSchemaDefObj ) {
				return ((IYCFBamSchemaDefObj)curDef);
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	public IYCFBamMinorVersionObj getVersion() {
		for( IYCFLibAnyObj curDef = this; curDef != null; curDef = curDef.getObjScope() ) {
			if( curDef instanceof IYCFBamMinorVersionObj ) {
				return ((IYCFBamMinorVersionObj)curDef);
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamSubProjectObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamTopProjectObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamTopDomainObj ) {
				return( null );
			}
			else if( curDef instanceof IYCFBamTldObj ) {
				return( null );
			}
		}
		return( null );
	}

	protected String getVersionStringForVersion( IYCFLibAnyObj value ) {
		String ret;
		if( value instanceof IYCFBamMinorVersionObj ) {
			ret = ((IYCFBamMinorVersionObj)value).getRequiredName();
		}
		else if( value instanceof IYCFBamMajorVersionObj ) {
			ret = ((IYCFBamMajorVersionObj)value).getRequiredName();
		}
		else {
			ret = null;
		}
		return( ret );
	}

	public String getVersionString() {
		IYCFLibAnyObj scopeDef;
		IYCFLibAnyObj curDef = getVersion();
		List<String> invertedNodeNames = new ArrayList<String>();
		while (curDef != null) {
			if( curDef instanceof IYCFBamMinorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj) curDef ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj) curDef ) );
			}
			scopeDef = curDef.getObjScope();
			if( scopeDef == null) {
				curDef = null;
			}
			else if( scopeDef instanceof IYCFBamMinorVersionObj ) {
				curDef = scopeDef;
			}
			else if( scopeDef instanceof IYCFBamMajorVersionObj ) {
				curDef = scopeDef;
			}
			else {
				curDef = null;
			}
		}
		String ret = "";
		for( int idx = invertedNodeNames.size() - 1; idx >= 0; idx-- )
		{
			if( ret.length() == 0) {
				ret = invertedNodeNames.get(idx);
			}
			else {
				ret = ret + "-" + invertedNodeNames.get(idx);
			}
		}
		return( ret );
	}

	public String getPackedVersionString() {
		IYCFLibAnyObj scopeDef;
		IYCFLibAnyObj curDef = getVersion();
		List<String> invertedNodeNames = new ArrayList<String>();
		while (curDef != null) {
			if( curDef instanceof IYCFBamMinorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj) curDef ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj) curDef ) );
			}
			scopeDef = curDef.getObjScope();
			if( scopeDef == null) {
				curDef = null;
			}
			else if( scopeDef instanceof IYCFBamMinorVersionObj ) {
				curDef = scopeDef;
			}
			else if( scopeDef instanceof IYCFBamMajorVersionObj ) {
				curDef = scopeDef;
			}
			else {
				curDef = null;
			}
		}
		String ret = "";
		for( int idx = invertedNodeNames.size() - 1; idx >= 0; idx-- )
		{
			if( ret.length() == 0) {
				ret = invertedNodeNames.get(idx);
			}
			else {
				ret = ret + invertedNodeNames.get(idx);
			}
		}
		return( ret );
	}

	public Boolean isColumnInOwnerRelation() {

		IYCFLibAnyObj		focusDef;
		IYCFBamTableObj		tableDef;
		final String S_ProcName = "isColumnInOwnerRelation() ";

		if( this instanceof IYCFBamAtomObj ) {
			IYCFBamAtomObj atomDef = (IYCFBamAtomObj)this;
			IYCFLibAnyObj atomScopeDef = atomDef.getObjScope();
			tableDef = (IYCFBamTableObj)atomScopeDef;
			focusDef = this;
		}
		else if( this instanceof IYCFBamTableColObj ) {
			IYCFBamTableColObj tableColDef = (IYCFBamTableColObj)this;
			IYCFLibAnyObj tableColScopeDef = tableColDef.getObjScope();
			tableDef = (IYCFBamTableObj)tableColScopeDef;
			focusDef = this;
		}
		else if( this instanceof IYCFBamIndexColObj ) {
			IYCFBamIndexColObj indexColDef = (IYCFBamIndexColObj)this;
			focusDef = indexColDef.getRequiredLookupColumn();
			if( focusDef instanceof IYCFBamAtomObj ) {
				tableDef = (IYCFBamTableObj)((IYCFBamAtomObj)focusDef).getObjScope();
			}
			else if( focusDef instanceof IYCFBamTableColObj ) {
				tableDef = (IYCFBamTableObj)((IYCFBamTableColObj)focusDef).getObjScope();
			}
			else {
				throw new RuntimeException(
					S_ProcName + "genContext.getGenDef().getColumnDef() for a IYCFBamIndexColObj did not return a IYCFBamAtomObj"
						+	" nor a IYCFBamTableColObj" );
			}
		}
		else if( this instanceof IYCFBamRelationColObj ) {
			IYCFBamRelationColObj relColDef = (IYCFBamRelationColObj)this;
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
				throw new RuntimeException(
					S_ProcName + "genContext.getGenDef().getFromColumnDef() for a IYCFBamIndexColObj did not return a IYCFBamAtomObj"
						+	" nor a IYCFBamTableColObj" );
			}
		}
		else {
			throw new RuntimeException(
				S_ProcName + "genContext.getGenDef() did not return a IYCFBamAtomObj, IYCFBamTableColObj, nor IYCFBamIndexColObj instance" );
		}

		List<IYCFBamRelationObj> ownerRelations = tableDef.getContainerOwnerRelations();
		if( ( ownerRelations == null )
		 || ( ( ownerRelations != null ) && ( ownerRelations.size() == 0 ) ) )
		{
			return( false );
		}

		ListIterator<IYCFBamRelationObj> ownerEnumerator = ownerRelations.listIterator();

		IYCFBamRelationObj ownerRelation;
		IYCFBamRelationColObj ownerRelationCol;
		Iterator<IYCFBamRelationColObj> ownerRelationCols;

		while( ownerEnumerator.hasNext() ) {

			ownerRelation = ownerEnumerator.next();
			ownerRelationCols = ownerRelation.getOptionalComponentsColumns().iterator();

			while( ownerRelationCols.hasNext() ) {
				ownerRelationCol = ownerRelationCols.next();
				if( ownerRelationCol.getRequiredLookupFromCol() == focusDef ) {
					return( true );
				}
			}
		}

		return( false );
	}
}

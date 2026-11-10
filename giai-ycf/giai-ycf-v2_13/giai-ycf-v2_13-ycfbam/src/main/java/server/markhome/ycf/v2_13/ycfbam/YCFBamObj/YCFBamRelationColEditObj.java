// Description: Java 11 edit object instance implementation for YCFBam RelationCol.

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

public class YCFBamRelationColEditObj
	implements IYCFBamRelationColEditObj
{
	protected IYCFBamRelationColObj orig;
	protected YCFBamRelationColBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFBamRelationObj requiredContainerRelation;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamRelationColObj optionalLookupPrev;
	protected IYCFBamRelationColObj optionalLookupNext;
	protected IYCFBamIndexColObj requiredLookupFromCol;
	protected IYCFBamIndexColObj requiredLookupToCol;

	public YCFBamRelationColEditObj( IYCFBamRelationColObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFBamRelationColBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerRelation = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupFromCol = null;
		requiredLookupToCol = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamRelationColBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamRelationColBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public void setCreatedBy( IYCFSecSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( IYCFSecSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( YCFBamRelationColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RelationCol" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamRelationObj scope = getRequiredContainerRelation();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamRelationObj scope = getRequiredContainerRelation();
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

	public IYCFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		IYCFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		IYCFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
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

	public String getObjFullName() {
		String fullName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				fullName = containerName + "." + fullName;
				container = container.getObjScope();
			}
		}
		return( fullName );
	}

	public IYCFBamRelationColObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamRelationColObj retobj = getSchema().getRelationColTableObj().realiseRelationCol( (IYCFBamRelationColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsRelationCol().forget();
	}

	public IYCFBamRelationColObj read() {
		IYCFBamRelationColObj retval = getOrigAsRelationCol().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamRelationColObj read( boolean forceRead ) {
		IYCFBamRelationColObj retval = getOrigAsRelationCol().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamRelationColObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamRelationColObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamRelationColObj create() {
		copyBuffToOrig();
		IYCFBamRelationColObj retobj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getRelationColTableObj().createRelationCol( getOrigAsRelationCol() );
		if( retobj == getOrigAsRelationCol() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamRelationColEditObj update() {
		getSchema().getRelationColTableObj().updateRelationCol( (IYCFBamRelationColObj)this );
		return( null );
	}

	public YCFBamRelationColEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getRelationColTableObj().deleteRelationCol( getOrigAsRelationCol() );
		return( null );
	}

	public IYCFBamRelationColTableObj getRelationColTable() {
		return( orig.getSchema().getRelationColTableObj() );
	}

	public IYCFBamRelationColEditObj getEdit() {
		return( (IYCFBamRelationColEditObj)this );
	}

	public IYCFBamRelationColEditObj getEditAsRelationCol() {
		return( (IYCFBamRelationColEditObj)this );
	}

	public IYCFBamRelationColEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFBamRelationColObj getOrig() {
		return( orig );
	}

	public IYCFBamRelationColObj getOrigAsRelationCol() {
		return( (IYCFBamRelationColObj)orig );
	}

	public IYCFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFBamRelationColBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsRelationCol().getSchema().getBackingStore()).getFactoryRelationCol().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamRelationColBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerRelation = null;
			requiredOwnerTenant = null;
			optionalLookupDefSchema = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
			requiredLookupFromCol = null;
			requiredLookupToCol = null;
		}
	}

	public YCFBamRelationColBuff getRelationColBuff() {
		return( (YCFBamRelationColBuff)getBuff() );
	}

	public YCFBamRelationColPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFBamRelationColPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredRelationId() {
		return( getRelationColBuff().getRequiredRelationId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getRelationColBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getRelationColBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getRelationColBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getRelationColBuff().getRequiredName() != value ) {
			getRelationColBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortName() {
		return( getRelationColBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getRelationColBuff().getOptionalShortName() != value ) {
			getRelationColBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getRelationColBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getRelationColBuff().getOptionalLabel() != value ) {
			getRelationColBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getRelationColBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getRelationColBuff().getOptionalShortDescription() != value ) {
			getRelationColBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getRelationColBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getRelationColBuff().getOptionalDescription() != value ) {
			getRelationColBuff().setOptionalDescription( value );
		}
	}

	public long getRequiredFromColId() {
		return( getRelationColBuff().getRequiredFromColId() );
	}

	public long getRequiredToColId() {
		return( getRelationColBuff().getRequiredToColId() );
	}

	public Long getOptionalPrevTenantId() {
		return( getRelationColBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getRelationColBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getRelationColBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getRelationColBuff().getOptionalNextId() );
	}

	public IYCFBamRelationObj getRequiredContainerRelation() {
		return( getRequiredContainerRelation( false ) );
	}

	public IYCFBamRelationObj getRequiredContainerRelation( boolean forceRead ) {
		if( forceRead || ( requiredContainerRelation == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamRelationObj obj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getRelationTableObj().readRelationByIdIdx( getPKey().getRequiredTenantId(),
					getRelationColBuff().getRequiredRelationId() );
				requiredContainerRelation = obj;
				if( obj != null ) {
					getRelationColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getRelationColBuff().setRequiredRelationId( obj.getRequiredId() );
					requiredContainerRelation = obj;
				}
			}
		}
		return( requiredContainerRelation );
	}

	public void setRequiredContainerRelation( IYCFBamRelationObj value ) {
			if( buff == null ) {
				getRelationColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setRequiredRelationId( value.getRequiredId() );
			}
			requiredContainerRelation = value;
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getRelationColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getRelationColBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getRelationColBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationColBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getRelationColBuff().getOptionalDefSchemaTenantId(),
					getRelationColBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getRelationColBuff();
			}
			if( value != null ) {
				getRelationColBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getRelationColBuff().setOptionalDefSchemaTenantId( null );
				getRelationColBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public IYCFBamRelationColObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamRelationColObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getRelationColBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationColBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamRelationColObj obj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getRelationColTableObj().readRelationColByIdIdx( getRelationColBuff().getOptionalPrevTenantId(),
					getRelationColBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( IYCFBamRelationColObj value ) {
			if( buff == null ) {
				getRelationColBuff();
			}
			if( value != null ) {
				getRelationColBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getRelationColBuff().setOptionalPrevTenantId( null );
				getRelationColBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public IYCFBamRelationColObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamRelationColObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getRelationColBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getRelationColBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamRelationColObj obj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getRelationColTableObj().readRelationColByIdIdx( getRelationColBuff().getOptionalNextTenantId(),
					getRelationColBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( IYCFBamRelationColObj value ) {
			if( buff == null ) {
				getRelationColBuff();
			}
			if( value != null ) {
				getRelationColBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getRelationColBuff().setOptionalNextTenantId( null );
				getRelationColBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public IYCFBamIndexColObj getRequiredLookupFromCol() {
		return( getRequiredLookupFromCol( false ) );
	}

	public IYCFBamIndexColObj getRequiredLookupFromCol( boolean forceRead ) {
		if( forceRead || ( requiredLookupFromCol == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamIndexColObj obj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getIndexColTableObj().readIndexColByIdIdx( getPKey().getRequiredTenantId(),
					getRelationColBuff().getRequiredFromColId() );
				requiredLookupFromCol = obj;
			}
		}
		return( requiredLookupFromCol );
	}

	public void setRequiredLookupFromCol( IYCFBamIndexColObj value ) {
			if( buff == null ) {
				getRelationColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setRequiredFromColId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupFromCol = value;
	}

	public IYCFBamIndexColObj getRequiredLookupToCol() {
		return( getRequiredLookupToCol( false ) );
	}

	public IYCFBamIndexColObj getRequiredLookupToCol( boolean forceRead ) {
		if( forceRead || ( requiredLookupToCol == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamIndexColObj obj = ((IYCFBamSchemaObj)getOrigAsRelationCol().getSchema()).getIndexColTableObj().readIndexColByIdIdx( getPKey().getRequiredTenantId(),
					getRelationColBuff().getRequiredToColId() );
				requiredLookupToCol = obj;
			}
		}
		return( requiredLookupToCol );
	}

	public void setRequiredLookupToCol( IYCFBamIndexColObj value ) {
			if( buff == null ) {
				getRelationColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRelationColBuff().setRequiredToColId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupToCol = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFBamRelationColBuff origBuff = getOrigAsRelationCol().getRelationColBuff();
		YCFBamRelationColBuff myBuff = getRelationColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamRelationColBuff origBuff = getOrigAsRelationCol().getRelationColBuff();
		YCFBamRelationColBuff myBuff = getRelationColBuff();
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
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj)( curDef ) ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj)( curDef ) ) );
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
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMinorVersionObj)( curDef ) ) );
			}
			else if( curDef instanceof IYCFBamMajorVersionObj ) {
				invertedNodeNames.add( getVersionStringForVersion( (IYCFBamMajorVersionObj)( curDef ) ) );
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

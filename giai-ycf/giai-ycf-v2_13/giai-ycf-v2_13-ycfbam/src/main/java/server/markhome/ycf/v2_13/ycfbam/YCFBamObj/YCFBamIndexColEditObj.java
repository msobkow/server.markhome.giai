// Description: Java 11 edit object instance implementation for YCFBam IndexCol.

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

public class YCFBamIndexColEditObj
	implements IYCFBamIndexColEditObj
{
	protected IYCFBamIndexColObj orig;
	protected YCFBamIndexColBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamIndexObj requiredContainerIndex;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamIndexColObj optionalLookupPrev;
	protected IYCFBamIndexColObj optionalLookupNext;
	protected IYCFBamValueObj requiredLookupColumn;

	public YCFBamIndexColEditObj( IYCFBamIndexColObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFBamIndexColBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerIndex = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupColumn = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamIndexColBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamIndexColBuff buff = getBuff();
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
		return( YCFBamIndexColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "IndexCol" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamIndexObj scope = getRequiredContainerIndex();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamIndexObj scope = getRequiredContainerIndex();
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

	public IYCFBamIndexColObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamIndexColObj retobj = getSchema().getIndexColTableObj().realiseIndexCol( (IYCFBamIndexColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsIndexCol().forget();
	}

	public IYCFBamIndexColObj read() {
		IYCFBamIndexColObj retval = getOrigAsIndexCol().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamIndexColObj read( boolean forceRead ) {
		IYCFBamIndexColObj retval = getOrigAsIndexCol().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamIndexColObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamIndexColObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamIndexColObj create() {
		copyBuffToOrig();
		IYCFBamIndexColObj retobj = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getIndexColTableObj().createIndexCol( getOrigAsIndexCol() );
		if( retobj == getOrigAsIndexCol() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamIndexColEditObj update() {
		getSchema().getIndexColTableObj().updateIndexCol( (IYCFBamIndexColObj)this );
		return( null );
	}

	public YCFBamIndexColEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getIndexColTableObj().deleteIndexCol( getOrigAsIndexCol() );
		return( null );
	}

	public IYCFBamIndexColTableObj getIndexColTable() {
		return( orig.getSchema().getIndexColTableObj() );
	}

	public IYCFBamIndexColEditObj getEdit() {
		return( (IYCFBamIndexColEditObj)this );
	}

	public IYCFBamIndexColEditObj getEditAsIndexCol() {
		return( (IYCFBamIndexColEditObj)this );
	}

	public IYCFBamIndexColEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFBamIndexColObj getOrig() {
		return( orig );
	}

	public IYCFBamIndexColObj getOrigAsIndexCol() {
		return( (IYCFBamIndexColObj)orig );
	}

	public IYCFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFBamIndexColBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsIndexCol().getSchema().getBackingStore()).getFactoryIndexCol().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamIndexColBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerIndex = null;
			optionalLookupDefSchema = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
			requiredLookupColumn = null;
		}
	}

	public YCFBamIndexColBuff getIndexColBuff() {
		return( (YCFBamIndexColBuff)getBuff() );
	}

	public YCFBamIndexColPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFBamIndexColPKey value ) {
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

	public long getRequiredIndexId() {
		return( getIndexColBuff().getRequiredIndexId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getIndexColBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getIndexColBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getIndexColBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getIndexColBuff().getRequiredName() != value ) {
			getIndexColBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortName() {
		return( getIndexColBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getIndexColBuff().getOptionalShortName() != value ) {
			getIndexColBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getIndexColBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getIndexColBuff().getOptionalLabel() != value ) {
			getIndexColBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getIndexColBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getIndexColBuff().getOptionalShortDescription() != value ) {
			getIndexColBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getIndexColBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getIndexColBuff().getOptionalDescription() != value ) {
			getIndexColBuff().setOptionalDescription( value );
		}
	}

	public long getRequiredColumnId() {
		return( getIndexColBuff().getRequiredColumnId() );
	}

	public boolean getRequiredIsAscending() {
		return( getIndexColBuff().getRequiredIsAscending() );
	}

	public void setRequiredIsAscending( boolean value ) {
		if( getIndexColBuff().getRequiredIsAscending() != value ) {
			getIndexColBuff().setRequiredIsAscending( value );
		}
	}

	public Long getOptionalPrevTenantId() {
		return( getIndexColBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getIndexColBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getIndexColBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getIndexColBuff().getOptionalNextId() );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getIndexColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getIndexColBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFBamIndexObj getRequiredContainerIndex() {
		return( getRequiredContainerIndex( false ) );
	}

	public IYCFBamIndexObj getRequiredContainerIndex( boolean forceRead ) {
		if( forceRead || ( requiredContainerIndex == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamIndexObj obj = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getIndexTableObj().readIndexByIdIdx( getPKey().getRequiredTenantId(),
					getIndexColBuff().getRequiredIndexId() );
				requiredContainerIndex = obj;
				if( obj != null ) {
					getIndexColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getIndexColBuff().setRequiredIndexId( obj.getRequiredId() );
					requiredContainerIndex = obj;
				}
			}
		}
		return( requiredContainerIndex );
	}

	public void setRequiredContainerIndex( IYCFBamIndexObj value ) {
			if( buff == null ) {
				getIndexColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexColBuff().setRequiredIndexId( value.getRequiredId() );
			}
			requiredContainerIndex = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getIndexColBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getIndexColBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getIndexColBuff().getOptionalDefSchemaTenantId(),
					getIndexColBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getIndexColBuff();
			}
			if( value != null ) {
				getIndexColBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getIndexColBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getIndexColBuff().setOptionalDefSchemaTenantId( null );
				getIndexColBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelFromCol() {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getRelationColTableObj().readRelationColByFromColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelFromCol( boolean forceRead ) {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getRelationColTableObj().readRelationColByFromColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelToCol() {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getRelationColTableObj().readRelationColByToColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelToCol( boolean forceRead ) {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getRelationColTableObj().readRelationColByToColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamIndexColObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamIndexColObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getIndexColBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getIndexColBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamIndexColObj obj = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getIndexColTableObj().readIndexColByIdIdx( getIndexColBuff().getOptionalPrevTenantId(),
					getIndexColBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( IYCFBamIndexColObj value ) {
			if( buff == null ) {
				getIndexColBuff();
			}
			if( value != null ) {
				getIndexColBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getIndexColBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getIndexColBuff().setOptionalPrevTenantId( null );
				getIndexColBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public IYCFBamIndexColObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamIndexColObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getIndexColBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getIndexColBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamIndexColObj obj = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getIndexColTableObj().readIndexColByIdIdx( getIndexColBuff().getOptionalNextTenantId(),
					getIndexColBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( IYCFBamIndexColObj value ) {
			if( buff == null ) {
				getIndexColBuff();
			}
			if( value != null ) {
				getIndexColBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getIndexColBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getIndexColBuff().setOptionalNextTenantId( null );
				getIndexColBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public IYCFBamValueObj getRequiredLookupColumn() {
		return( getRequiredLookupColumn( false ) );
	}

	public IYCFBamValueObj getRequiredLookupColumn( boolean forceRead ) {
		if( forceRead || ( requiredLookupColumn == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamValueObj obj = ((IYCFBamSchemaObj)getOrigAsIndexCol().getSchema()).getValueTableObj().readValueByIdIdx( getPKey().getRequiredTenantId(),
					getIndexColBuff().getRequiredColumnId() );
				requiredLookupColumn = obj;
			}
		}
		return( requiredLookupColumn );
	}

	public void setRequiredLookupColumn( IYCFBamValueObj value ) {
			if( buff == null ) {
				getIndexColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexColBuff().setRequiredColumnId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupColumn = value;
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
		YCFBamIndexColBuff origBuff = getOrigAsIndexCol().getIndexColBuff();
		YCFBamIndexColBuff myBuff = getIndexColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamIndexColBuff origBuff = getOrigAsIndexCol().getIndexColBuff();
		YCFBamIndexColBuff myBuff = getIndexColBuff();
		myBuff.set( origBuff );
	}
}

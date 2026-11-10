// Description: Java 11 base object instance implementation for YCFBam IndexCol.

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

public class YCFBamIndexColObj
	implements IYCFBamIndexColObj
{
	public final static String CLASS_CODE = "a825";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFBamIndexColEditObj edit;
	protected IYCFBamSchemaObj schema;
	protected YCFBamIndexColPKey pKey;
	protected YCFBamIndexColBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamIndexObj requiredContainerIndex;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamIndexColObj optionalLookupPrev;
	protected IYCFBamIndexColObj optionalLookupNext;
	protected IYCFBamValueObj requiredLookupColumn;

	public YCFBamIndexColObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerIndex = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupColumn = null;
	}

	public YCFBamIndexColObj( IYCFBamSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerIndex = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupColumn = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFBamIndexColObj retobj = ((IYCFBamSchemaObj)schema).getIndexColTableObj().realiseIndexCol(
			(IYCFBamIndexColObj)this );
		return( (IYCFBamIndexColObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getIndexColTableObj().reallyDeepDisposeIndexCol( (IYCFBamIndexColObj)this );
	}

	public IYCFBamIndexColObj read() {
		IYCFBamIndexColObj retobj = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamIndexColObj)retobj );
	}

	public IYCFBamIndexColObj read( boolean forceRead ) {
		IYCFBamIndexColObj retobj = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamIndexColObj)retobj );
	}

	public IYCFBamIndexColObj moveUp() {
		IYCFBamIndexColObj retobj = ((IYCFBamSchemaObj)schema).getIndexColTableObj().moveUpIndexCol( this );
		return( (IYCFBamIndexColObj)retobj );
	}

	public IYCFBamIndexColObj moveDown() {
		IYCFBamIndexColObj retobj = ((IYCFBamSchemaObj)schema).getIndexColTableObj().moveDownIndexCol( this );
		return( (IYCFBamIndexColObj)retobj );
	}

	public IYCFBamIndexColTableObj getIndexColTable() {
		return( ((IYCFBamSchemaObj)schema).getIndexColTableObj() );
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = value;
	}

	public YCFBamIndexColBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexCol().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamIndexColBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamIndexColBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamIndexColBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerIndex = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupColumn = null;
	}

	public YCFBamIndexColBuff getIndexColBuff() {
		return( (YCFBamIndexColBuff)getBuff() );
	}

	public YCFBamIndexColPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexCol().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFBamIndexColPKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToBuff();
		}
	}

	public boolean getIsNew() {
		return( isNew );
	}

	public void setIsNew( boolean value ) {
		isNew = value;
	}

	public IYCFBamIndexColEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamIndexColObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamIndexColObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getIndexColTableObj().lockIndexCol( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getIndexColTableObj().newEditInstance( lockobj );
		return( (IYCFBamIndexColEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFBamIndexColEditObj getEdit() {
		return( edit );
	}

	public IYCFBamIndexColEditObj getEditAsIndexCol() {
		return( (IYCFBamIndexColEditObj)edit );
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

	public String getOptionalShortName() {
		return( getIndexColBuff().getOptionalShortName() );
	}

	public String getOptionalLabel() {
		return( getIndexColBuff().getOptionalLabel() );
	}

	public String getOptionalShortDescription() {
		return( getIndexColBuff().getOptionalShortDescription() );
	}

	public String getOptionalDescription() {
		return( getIndexColBuff().getOptionalDescription() );
	}

	public long getRequiredColumnId() {
		return( getIndexColBuff().getRequiredColumnId() );
	}

	public boolean getRequiredIsAscending() {
		return( getIndexColBuff().getRequiredIsAscending() );
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
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((IYCFBamSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public IYCFBamIndexObj getRequiredContainerIndex() {
		return( getRequiredContainerIndex( false ) );
	}

	public IYCFBamIndexObj getRequiredContainerIndex( boolean forceRead ) {
		if( ( requiredContainerIndex == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerIndex = ((IYCFBamSchemaObj)schema).getIndexTableObj().readIndexByIdIdx( getPKey().getRequiredTenantId(),
					getIndexColBuff().getRequiredIndexId(), forceRead );
			}
		}
		return( requiredContainerIndex );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getIndexColBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getIndexColBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getIndexColBuff().getOptionalDefSchemaTenantId(),
					getIndexColBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelFromCol() {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByFromColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelFromCol( boolean forceRead ) {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByFromColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelToCol() {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByToColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamRelationColObj> getOptionalChildrenRefRelToCol( boolean forceRead ) {
		List<IYCFBamRelationColObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getRelationColTableObj().readRelationColByToColIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamIndexColObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamIndexColObj getOptionalLookupPrev( boolean forceRead ) {
		if( ( optionalLookupPrev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getIndexColBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getIndexColBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrev = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByIdIdx( getIndexColBuff().getOptionalPrevTenantId(),
					getIndexColBuff().getOptionalPrevId(), forceRead );
			}
		}
		return( optionalLookupPrev );
	}

	public IYCFBamIndexColObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamIndexColObj getOptionalLookupNext( boolean forceRead ) {
		if( ( optionalLookupNext == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getIndexColBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getIndexColBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNext = ((IYCFBamSchemaObj)schema).getIndexColTableObj().readIndexColByIdIdx( getIndexColBuff().getOptionalNextTenantId(),
					getIndexColBuff().getOptionalNextId(), forceRead );
			}
		}
		return( optionalLookupNext );
	}

	public IYCFBamValueObj getRequiredLookupColumn() {
		return( getRequiredLookupColumn( false ) );
	}

	public IYCFBamValueObj getRequiredLookupColumn( boolean forceRead ) {
		if( ( requiredLookupColumn == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredLookupColumn = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByIdIdx( getPKey().getRequiredTenantId(),
					getIndexColBuff().getRequiredColumnId(), forceRead );
			}
		}
		return( requiredLookupColumn );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}

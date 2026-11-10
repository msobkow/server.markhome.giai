// Description: Java 11 base object instance implementation for YCFBam Param.

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

public class YCFBamParamObj
	implements IYCFBamParamObj
{
	public final static String CLASS_CODE = "a832";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFBamParamEditObj edit;
	protected IYCFBamSchemaObj schema;
	protected YCFBamParamPKey pKey;
	protected YCFBamParamBuff buff;
	protected IYCFBamServerMethodObj requiredContainerServerMeth;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamParamObj optionalLookupPrev;
	protected IYCFBamParamObj optionalLookupNext;
	protected IYCFBamValueObj requiredLookupType;

	public YCFBamParamObj() {
		isNew = true;
		requiredContainerServerMeth = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupType = null;
	}

	public YCFBamParamObj( IYCFBamSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerServerMeth = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupType = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Param" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamServerMethodObj scope = getRequiredContainerServerMeth();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamServerMethodObj scope = getRequiredContainerServerMeth();
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

	public IYCFBamParamObj realise() {
		IYCFBamParamObj retobj = ((IYCFBamSchemaObj)schema).getParamTableObj().realiseParam(
			(IYCFBamParamObj)this );
		return( (IYCFBamParamObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getParamTableObj().reallyDeepDisposeParam( (IYCFBamParamObj)this );
	}

	public IYCFBamParamObj read() {
		IYCFBamParamObj retobj = ((IYCFBamSchemaObj)schema).getParamTableObj().readParamByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamParamObj)retobj );
	}

	public IYCFBamParamObj read( boolean forceRead ) {
		IYCFBamParamObj retobj = ((IYCFBamSchemaObj)schema).getParamTableObj().readParamByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamParamObj)retobj );
	}

	public IYCFBamParamObj moveUp() {
		IYCFBamParamObj retobj = ((IYCFBamSchemaObj)schema).getParamTableObj().moveUpParam( this );
		return( (IYCFBamParamObj)retobj );
	}

	public IYCFBamParamObj moveDown() {
		IYCFBamParamObj retobj = ((IYCFBamSchemaObj)schema).getParamTableObj().moveDownParam( this );
		return( (IYCFBamParamObj)retobj );
	}

	public IYCFBamParamTableObj getParamTable() {
		return( ((IYCFBamSchemaObj)schema).getParamTableObj() );
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = value;
	}

	public YCFBamParamBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableParam().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamParamBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamParamBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamParamBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerServerMeth = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupType = null;
	}

	public YCFBamParamBuff getParamBuff() {
		return( (YCFBamParamBuff)getBuff() );
	}

	public YCFBamParamPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryParam().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFBamParamPKey value ) {
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

	public IYCFBamParamEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamParamObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamParamObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getParamTableObj().lockParam( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getParamTableObj().newEditInstance( lockobj );
		return( (IYCFBamParamEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFBamParamEditObj getEdit() {
		return( edit );
	}

	public IYCFBamParamEditObj getEditAsParam() {
		return( (IYCFBamParamEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamParamBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamParamBuff buff = getBuff();
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

	public long getRequiredServerMethodId() {
		return( getParamBuff().getRequiredServerMethodId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getParamBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getParamBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getParamBuff().getRequiredName() );
	}

	public String getOptionalShortDescription() {
		return( getParamBuff().getOptionalShortDescription() );
	}

	public String getOptionalDescription() {
		return( getParamBuff().getOptionalDescription() );
	}

	public boolean getRequiredIsNullable() {
		return( getParamBuff().getRequiredIsNullable() );
	}

	public Long getOptionalTypeTenantId() {
		return( getParamBuff().getOptionalTypeTenantId() );
	}

	public Long getOptionalTypeId() {
		return( getParamBuff().getOptionalTypeId() );
	}

	public Long getOptionalPrevTenantId() {
		return( getParamBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getParamBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getParamBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getParamBuff().getOptionalNextId() );
	}

	public IYCFBamServerMethodObj getRequiredContainerServerMeth() {
		return( getRequiredContainerServerMeth( false ) );
	}

	public IYCFBamServerMethodObj getRequiredContainerServerMeth( boolean forceRead ) {
		if( ( requiredContainerServerMeth == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerServerMeth = ((IYCFBamSchemaObj)schema).getServerMethodTableObj().readServerMethodByIdIdx( getPKey().getRequiredTenantId(),
					getParamBuff().getRequiredServerMethodId(), forceRead );
			}
		}
		return( requiredContainerServerMeth );
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

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getParamBuff().getOptionalDefSchemaTenantId(),
					getParamBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public IYCFBamParamObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamParamObj getOptionalLookupPrev( boolean forceRead ) {
		if( ( optionalLookupPrev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrev = ((IYCFBamSchemaObj)schema).getParamTableObj().readParamByIdIdx( getParamBuff().getOptionalPrevTenantId(),
					getParamBuff().getOptionalPrevId(), forceRead );
			}
		}
		return( optionalLookupPrev );
	}

	public IYCFBamParamObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamParamObj getOptionalLookupNext( boolean forceRead ) {
		if( ( optionalLookupNext == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNext = ((IYCFBamSchemaObj)schema).getParamTableObj().readParamByIdIdx( getParamBuff().getOptionalNextTenantId(),
					getParamBuff().getOptionalNextId(), forceRead );
			}
		}
		return( optionalLookupNext );
	}

	public IYCFBamValueObj getRequiredLookupType() {
		return( getRequiredLookupType( false ) );
	}

	public IYCFBamValueObj getRequiredLookupType( boolean forceRead ) {
		if( ( requiredLookupType == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalTypeTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalTypeId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				requiredLookupType = ((IYCFBamSchemaObj)schema).getValueTableObj().readValueByIdIdx( getParamBuff().getOptionalTypeTenantId(),
					getParamBuff().getOptionalTypeId(), forceRead );
			}
		}
		return( requiredLookupType );
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

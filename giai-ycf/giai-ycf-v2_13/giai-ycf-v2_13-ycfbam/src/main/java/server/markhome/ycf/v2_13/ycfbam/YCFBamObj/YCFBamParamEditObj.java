// Description: Java 11 edit object instance implementation for YCFBam Param.

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

public class YCFBamParamEditObj
	implements IYCFBamParamEditObj
{
	protected IYCFBamParamObj orig;
	protected YCFBamParamBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFBamServerMethodObj requiredContainerServerMeth;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamParamObj optionalLookupPrev;
	protected IYCFBamParamObj optionalLookupNext;
	protected IYCFBamValueObj requiredLookupType;

	public YCFBamParamEditObj( IYCFBamParamObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFBamParamBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerServerMeth = null;
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredLookupType = null;
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
		return( YCFBamParamObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamParamObj retobj = getSchema().getParamTableObj().realiseParam( (IYCFBamParamObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsParam().forget();
	}

	public IYCFBamParamObj read() {
		IYCFBamParamObj retval = getOrigAsParam().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamParamObj read( boolean forceRead ) {
		IYCFBamParamObj retval = getOrigAsParam().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamParamObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamParamObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamParamObj create() {
		copyBuffToOrig();
		IYCFBamParamObj retobj = ((IYCFBamSchemaObj)getOrigAsParam().getSchema()).getParamTableObj().createParam( getOrigAsParam() );
		if( retobj == getOrigAsParam() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamParamEditObj update() {
		getSchema().getParamTableObj().updateParam( (IYCFBamParamObj)this );
		return( null );
	}

	public YCFBamParamEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getParamTableObj().deleteParam( getOrigAsParam() );
		return( null );
	}

	public IYCFBamParamTableObj getParamTable() {
		return( orig.getSchema().getParamTableObj() );
	}

	public IYCFBamParamEditObj getEdit() {
		return( (IYCFBamParamEditObj)this );
	}

	public IYCFBamParamEditObj getEditAsParam() {
		return( (IYCFBamParamEditObj)this );
	}

	public IYCFBamParamEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFBamParamObj getOrig() {
		return( orig );
	}

	public IYCFBamParamObj getOrigAsParam() {
		return( (IYCFBamParamObj)orig );
	}

	public IYCFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFBamParamBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsParam().getSchema().getBackingStore()).getFactoryParam().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamParamBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerServerMeth = null;
			requiredOwnerTenant = null;
			optionalLookupDefSchema = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
			requiredLookupType = null;
		}
	}

	public YCFBamParamBuff getParamBuff() {
		return( (YCFBamParamBuff)getBuff() );
	}

	public YCFBamParamPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFBamParamPKey value ) {
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

	public void setRequiredName( String value ) {
		if( getParamBuff().getRequiredName() != value ) {
			getParamBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getParamBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getParamBuff().getOptionalShortDescription() != value ) {
			getParamBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getParamBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getParamBuff().getOptionalDescription() != value ) {
			getParamBuff().setOptionalDescription( value );
		}
	}

	public boolean getRequiredIsNullable() {
		return( getParamBuff().getRequiredIsNullable() );
	}

	public void setRequiredIsNullable( boolean value ) {
		if( getParamBuff().getRequiredIsNullable() != value ) {
			getParamBuff().setRequiredIsNullable( value );
		}
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
		if( forceRead || ( requiredContainerServerMeth == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamServerMethodObj obj = ((IYCFBamSchemaObj)getOrigAsParam().getSchema()).getServerMethodTableObj().readServerMethodByIdIdx( getPKey().getRequiredTenantId(),
					getParamBuff().getRequiredServerMethodId() );
				requiredContainerServerMeth = obj;
				if( obj != null ) {
					getParamBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getParamBuff().setRequiredServerMethodId( obj.getRequiredId() );
					requiredContainerServerMeth = obj;
				}
			}
		}
		return( requiredContainerServerMeth );
	}

	public void setRequiredContainerServerMeth( IYCFBamServerMethodObj value ) {
			if( buff == null ) {
				getParamBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getParamBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getParamBuff().setRequiredServerMethodId( value.getRequiredId() );
			}
			requiredContainerServerMeth = value;
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsParam().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getParamBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getParamBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsParam().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getParamBuff().getOptionalDefSchemaTenantId(),
					getParamBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getParamBuff();
			}
			if( value != null ) {
				getParamBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getParamBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getParamBuff().setOptionalDefSchemaTenantId( null );
				getParamBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public IYCFBamParamObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamParamObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamParamObj obj = ((IYCFBamSchemaObj)getOrigAsParam().getSchema()).getParamTableObj().readParamByIdIdx( getParamBuff().getOptionalPrevTenantId(),
					getParamBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( IYCFBamParamObj value ) {
			if( buff == null ) {
				getParamBuff();
			}
			if( value != null ) {
				getParamBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getParamBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getParamBuff().setOptionalPrevTenantId( null );
				getParamBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public IYCFBamParamObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamParamObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamParamObj obj = ((IYCFBamSchemaObj)getOrigAsParam().getSchema()).getParamTableObj().readParamByIdIdx( getParamBuff().getOptionalNextTenantId(),
					getParamBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( IYCFBamParamObj value ) {
			if( buff == null ) {
				getParamBuff();
			}
			if( value != null ) {
				getParamBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getParamBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getParamBuff().setOptionalNextTenantId( null );
				getParamBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public IYCFBamValueObj getRequiredLookupType() {
		return( getRequiredLookupType( false ) );
	}

	public IYCFBamValueObj getRequiredLookupType( boolean forceRead ) {
		if( forceRead || ( requiredLookupType == null ) ) {
			boolean anyMissing = false;
			if( getParamBuff().getOptionalTypeTenantId() == null ) {
				anyMissing = true;
			}
			if( getParamBuff().getOptionalTypeId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamValueObj obj = ((IYCFBamSchemaObj)getOrigAsParam().getSchema()).getValueTableObj().readValueByIdIdx( getParamBuff().getOptionalTypeTenantId(),
					getParamBuff().getOptionalTypeId() );
				requiredLookupType = obj;
			}
		}
		return( requiredLookupType );
	}

	public void setRequiredLookupType( IYCFBamValueObj value ) {
			if( buff == null ) {
				getParamBuff();
			}
			if( value != null ) {
				getParamBuff().setOptionalTypeTenantId( value.getRequiredTenantId() );
				getParamBuff().setOptionalTypeId( value.getRequiredId() );
			}
			else {
				getParamBuff().setOptionalTypeTenantId( null );
				getParamBuff().setOptionalTypeId( null );
			}
			requiredLookupType = value;
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
		YCFBamParamBuff origBuff = getOrigAsParam().getParamBuff();
		YCFBamParamBuff myBuff = getParamBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamParamBuff origBuff = getOrigAsParam().getParamBuff();
		YCFBamParamBuff myBuff = getParamBuff();
		myBuff.set( origBuff );
	}
}

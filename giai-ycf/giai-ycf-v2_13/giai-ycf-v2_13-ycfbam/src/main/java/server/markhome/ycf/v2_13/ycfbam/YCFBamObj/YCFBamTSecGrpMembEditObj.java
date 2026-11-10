// Description: Java 11 edit object instance implementation for YCFBam TSecGrpMemb.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
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

public class YCFBamTSecGrpMembEditObj
	implements IYCFBamTSecGrpMembEditObj
{
	protected IYCFSecTSecGrpMembObj orig;
	protected YCFSecTSecGrpMembBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFSecTSecGroupObj requiredContainerGroup;
	protected IYCFSecSecUserObj requiredParentUser;

	public YCFBamTSecGrpMembEditObj( IYCFSecTSecGrpMembObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecTSecGrpMembBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecTSecGrpMembBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecTSecGrpMembBuff buff = getBuff();
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
		return( YCFBamTSecGrpMembObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TSecGrpMemb" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecTSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecTSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredTSecGrpMembId();
		objName = Long.toString( val );
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

	public IYCFSecTSecGrpMembObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecTSecGrpMembObj retobj = getSchema().getTSecGrpMembTableObj().realiseTSecGrpMemb( (IYCFBamTSecGrpMembObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTSecGrpMemb().forget();
	}

	public IYCFSecTSecGrpMembObj read() {
		IYCFSecTSecGrpMembObj retval = getOrigAsTSecGrpMemb().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTSecGrpMembObj read( boolean forceRead ) {
		IYCFSecTSecGrpMembObj retval = getOrigAsTSecGrpMemb().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTSecGrpMembObj create() {
		copyBuffToOrig();
		IYCFSecTSecGrpMembObj retobj = ((IYCFBamSchemaObj)getOrigAsTSecGrpMemb().getSchema()).getTSecGrpMembTableObj().createTSecGrpMemb( getOrigAsTSecGrpMemb() );
		if( retobj == getOrigAsTSecGrpMemb() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecTSecGrpMembEditObj update() {
		getSchema().getTSecGrpMembTableObj().updateTSecGrpMemb( (IYCFSecTSecGrpMembObj)this );
		return( null );
	}

	public YCFSecTSecGrpMembEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTSecGrpMembTableObj().deleteTSecGrpMemb( getOrigAsTSecGrpMemb() );
		return( null );
	}

	public IYCFSecTSecGrpMembTableObj getTSecGrpMembTable() {
		return( orig.getSchema().getTSecGrpMembTableObj() );
	}

	public IYCFSecTSecGrpMembEditObj getEdit() {
		return( (IYCFSecTSecGrpMembEditObj)this );
	}

	public IYCFSecTSecGrpMembEditObj getEditAsTSecGrpMemb() {
		return( (IYCFSecTSecGrpMembEditObj)this );
	}

	public IYCFSecTSecGrpMembEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecTSecGrpMembObj getOrig() {
		return( orig );
	}

	public IYCFSecTSecGrpMembObj getOrigAsTSecGrpMemb() {
		return( (IYCFSecTSecGrpMembObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecTSecGrpMembBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsTSecGrpMemb().getSchema().getBackingStore()).getFactoryTSecGrpMemb().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecTSecGrpMembBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerGroup = null;
			requiredParentUser = null;
		}
	}

	public YCFSecTSecGrpMembBuff getTSecGrpMembBuff() {
		return( (YCFSecTSecGrpMembBuff)getBuff() );
	}

	public YCFSecTSecGrpMembPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecTSecGrpMembPKey value ) {
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

	public long getRequiredTSecGrpMembId() {
		return( getPKey().getRequiredTSecGrpMembId() );
	}

	public int getRequiredTSecGroupId() {
		return( getTSecGrpMembBuff().getRequiredTSecGroupId() );
	}

	public UUID getRequiredSecUserId() {
		return( getTSecGrpMembBuff().getRequiredSecUserId() );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsTSecGrpMemb().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getTSecGrpMembBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTSecGrpMembBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFSecTSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecTSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( forceRead || ( requiredContainerGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTSecGroupObj obj = ((IYCFBamSchemaObj)getOrigAsTSecGrpMemb().getSchema()).getTSecGroupTableObj().readTSecGroupByIdIdx( getPKey().getRequiredTenantId(),
					getTSecGrpMembBuff().getRequiredTSecGroupId() );
				requiredContainerGroup = obj;
				if( obj != null ) {
					getTSecGrpMembBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTSecGrpMembBuff().setRequiredTSecGroupId( obj.getRequiredTSecGroupId() );
					requiredContainerGroup = obj;
				}
			}
		}
		return( requiredContainerGroup );
	}

	public void setRequiredContainerGroup( IYCFSecTSecGroupObj value ) {
			if( buff == null ) {
				getTSecGrpMembBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpMembBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpMembBuff().setRequiredTSecGroupId( value.getRequiredTSecGroupId() );
			}
			requiredContainerGroup = value;
	}

	public IYCFSecSecUserObj getRequiredParentUser() {
		return( getRequiredParentUser( false ) );
	}

	public IYCFSecSecUserObj getRequiredParentUser( boolean forceRead ) {
		if( forceRead || ( requiredParentUser == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecUserObj obj = ((IYCFBamSchemaObj)getOrigAsTSecGrpMemb().getSchema()).getSecUserTableObj().readSecUserByIdIdx( getTSecGrpMembBuff().getRequiredSecUserId() );
				requiredParentUser = obj;
			}
		}
		return( requiredParentUser );
	}

	public void setRequiredParentUser( IYCFSecSecUserObj value ) {
			if( buff == null ) {
				getTSecGrpMembBuff();
			}
			if( value != null ) {
				getTSecGrpMembBuff().setRequiredSecUserId( value.getRequiredSecUserId() );
			}
			else {
			}
			requiredParentUser = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredTSecGrpMembId( getPKey().getRequiredTSecGrpMembId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredTSecGrpMembId( buff.getRequiredTSecGrpMembId() );
	}

	public void copyBuffToOrig() {
		YCFSecTSecGrpMembBuff origBuff = getOrigAsTSecGrpMemb().getTSecGrpMembBuff();
		YCFSecTSecGrpMembBuff myBuff = getTSecGrpMembBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecTSecGrpMembBuff origBuff = getOrigAsTSecGrpMemb().getTSecGrpMembBuff();
		YCFSecTSecGrpMembBuff myBuff = getTSecGrpMembBuff();
		myBuff.set( origBuff );
	}
}

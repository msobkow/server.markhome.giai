// Description: Java 11 edit object instance implementation for YCFInt SecGrpMemb.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntSecGrpMembEditObj
	implements IYCFIntSecGrpMembEditObj
{
	protected IYCFSecSecGrpMembObj orig;
	protected YCFSecSecGrpMembBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecGroupObj requiredContainerGroup;
	protected IYCFSecSecUserObj requiredParentUser;

	public YCFIntSecGrpMembEditObj( IYCFSecSecGrpMembObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecGrpMembBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecGrpMembBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecGrpMembBuff buff = getBuff();
			updatedBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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
		return( YCFIntSecGrpMembObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGrpMemb" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredSecGrpMembId();
		objName = Long.toString( val );
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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

	public IYCFSecSecGrpMembObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecGrpMembObj retobj = getSchema().getSecGrpMembTableObj().realiseSecGrpMemb( (IYCFIntSecGrpMembObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGrpMemb().forget();
	}

	public IYCFSecSecGrpMembObj read() {
		IYCFSecSecGrpMembObj retval = getOrigAsSecGrpMemb().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGrpMembObj read( boolean forceRead ) {
		IYCFSecSecGrpMembObj retval = getOrigAsSecGrpMemb().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGrpMembObj create() {
		copyBuffToOrig();
		IYCFSecSecGrpMembObj retobj = ((IYCFIntSchemaObj)getOrigAsSecGrpMemb().getSchema()).getSecGrpMembTableObj().createSecGrpMemb( getOrigAsSecGrpMemb() );
		if( retobj == getOrigAsSecGrpMemb() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecGrpMembEditObj update() {
		getSchema().getSecGrpMembTableObj().updateSecGrpMemb( (IYCFSecSecGrpMembObj)this );
		return( null );
	}

	public YCFSecSecGrpMembEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGrpMembTableObj().deleteSecGrpMemb( getOrigAsSecGrpMemb() );
		return( null );
	}

	public IYCFSecSecGrpMembTableObj getSecGrpMembTable() {
		return( orig.getSchema().getSecGrpMembTableObj() );
	}

	public IYCFSecSecGrpMembEditObj getEdit() {
		return( (IYCFSecSecGrpMembEditObj)this );
	}

	public IYCFSecSecGrpMembEditObj getEditAsSecGrpMemb() {
		return( (IYCFSecSecGrpMembEditObj)this );
	}

	public IYCFSecSecGrpMembEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecGrpMembObj getOrig() {
		return( orig );
	}

	public IYCFSecSecGrpMembObj getOrigAsSecGrpMemb() {
		return( (IYCFSecSecGrpMembObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecGrpMembBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsSecGrpMemb().getSchema().getBackingStore()).getFactorySecGrpMemb().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGrpMembBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerGroup = null;
			requiredParentUser = null;
		}
	}

	public YCFSecSecGrpMembBuff getSecGrpMembBuff() {
		return( (YCFSecSecGrpMembBuff)getBuff() );
	}

	public YCFSecSecGrpMembPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecGrpMembPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredClusterId() {
		return( getPKey().getRequiredClusterId() );
	}

	public long getRequiredSecGrpMembId() {
		return( getPKey().getRequiredSecGrpMembId() );
	}

	public int getRequiredSecGroupId() {
		return( getSecGrpMembBuff().getRequiredSecGroupId() );
	}

	public UUID getRequiredSecUserId() {
		return( getSecGrpMembBuff().getRequiredSecUserId() );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFIntSchemaObj)getOrigAsSecGrpMemb().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getSecGrpMembBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGrpMembBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredOwnerCluster = value;
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( forceRead || ( requiredContainerGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecGroupObj obj = ((IYCFIntSchemaObj)getOrigAsSecGrpMemb().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpMembBuff().getRequiredSecGroupId() );
				requiredContainerGroup = obj;
				if( obj != null ) {
					getSecGrpMembBuff().setRequiredClusterId( obj.getRequiredClusterId() );
					getSecGrpMembBuff().setRequiredSecGroupId( obj.getRequiredSecGroupId() );
					requiredContainerGroup = obj;
				}
			}
		}
		return( requiredContainerGroup );
	}

	public void setRequiredContainerGroup( IYCFSecSecGroupObj value ) {
			if( buff == null ) {
				getSecGrpMembBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpMembBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpMembBuff().setRequiredSecGroupId( value.getRequiredSecGroupId() );
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
				IYCFSecSecUserObj obj = ((IYCFIntSchemaObj)getOrigAsSecGrpMemb().getSchema()).getSecUserTableObj().readSecUserByIdIdx( getSecGrpMembBuff().getRequiredSecUserId() );
				requiredParentUser = obj;
			}
		}
		return( requiredParentUser );
	}

	public void setRequiredParentUser( IYCFSecSecUserObj value ) {
			if( buff == null ) {
				getSecGrpMembBuff();
			}
			if( value != null ) {
				getSecGrpMembBuff().setRequiredSecUserId( value.getRequiredSecUserId() );
			}
			else {
			}
			requiredParentUser = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecGrpMembId( getPKey().getRequiredSecGrpMembId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGrpMembId( buff.getRequiredSecGrpMembId() );
	}

	public void copyBuffToOrig() {
		YCFSecSecGrpMembBuff origBuff = getOrigAsSecGrpMemb().getSecGrpMembBuff();
		YCFSecSecGrpMembBuff myBuff = getSecGrpMembBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecGrpMembBuff origBuff = getOrigAsSecGrpMemb().getSecGrpMembBuff();
		YCFSecSecGrpMembBuff myBuff = getSecGrpMembBuff();
		myBuff.set( origBuff );
	}
}

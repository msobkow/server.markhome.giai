// Description: Java 11 base object instance implementation for YCFInt SecGrpMemb.

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

public class YCFIntSecGrpMembObj
	implements IYCFIntSecGrpMembObj
{
	public final static String CLASS_CODE = "a00f";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecGrpMembEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecGrpMembPKey pKey;
	protected YCFSecSecGrpMembBuff buff;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecGroupObj requiredContainerGroup;
	protected IYCFSecSecUserObj requiredParentUser;

	public YCFIntSecGrpMembObj() {
		isNew = true;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public YCFIntSecGrpMembObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFSecSecGrpMembObj retobj = ((IYCFIntSchemaObj)schema).getSecGrpMembTableObj().realiseSecGrpMemb(
			(IYCFSecSecGrpMembObj)this );
		return( (IYCFSecSecGrpMembObj)retobj );
	}

	public void forget() {
		((IYCFIntSchemaObj)schema).getSecGrpMembTableObj().reallyDeepDisposeSecGrpMemb( (IYCFSecSecGrpMembObj)this );
	}

	public IYCFSecSecGrpMembObj read() {
		IYCFSecSecGrpMembObj retobj = ((IYCFIntSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGrpMembId(), false );
		return( (IYCFSecSecGrpMembObj)retobj );
	}

	public IYCFSecSecGrpMembObj read( boolean forceRead ) {
		IYCFSecSecGrpMembObj retobj = ((IYCFIntSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGrpMembId(), forceRead );
		return( (IYCFSecSecGrpMembObj)retobj );
	}

	public IYCFSecSecGrpMembTableObj getSecGrpMembTable() {
		return( ((IYCFIntSchemaObj)schema).getSecGrpMembTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecGrpMembBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpMemb().readDerivedByIdIdx( ((IYCFIntSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecGrpMembId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGrpMembBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecGrpMembBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecGrpMembBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public YCFSecSecGrpMembBuff getSecGrpMembBuff() {
		return( (YCFSecSecGrpMembBuff)getBuff() );
	}

	public YCFSecSecGrpMembPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpMemb().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecGrpMembPKey value ) {
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

	public IYCFSecSecGrpMembEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecGrpMembObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecGrpMembObj)this;
		}
		else {
			lockobj = ((IYCFIntSchemaObj)schema).getSecGrpMembTableObj().lockSecGrpMemb( getPKey() );
		}
		edit = ((IYCFIntSchemaObj)schema).getSecGrpMembTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecGrpMembEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecGrpMembEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecGrpMembEditObj getEditAsSecGrpMemb() {
		return( (IYCFSecSecGrpMembEditObj)edit );
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
		if( ( requiredOwnerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerCluster = ((IYCFIntSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredOwnerCluster );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( ( requiredContainerGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerGroup = ((IYCFIntSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpMembBuff().getRequiredSecGroupId(), forceRead );
			}
		}
		return( requiredContainerGroup );
	}

	public IYCFSecSecUserObj getRequiredParentUser() {
		return( getRequiredParentUser( false ) );
	}

	public IYCFSecSecUserObj getRequiredParentUser( boolean forceRead ) {
		if( ( requiredParentUser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentUser = ((IYCFIntSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getSecGrpMembBuff().getRequiredSecUserId(), forceRead );
			}
		}
		return( requiredParentUser );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecGrpMembId( getPKey().getRequiredSecGrpMembId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGrpMembId( buff.getRequiredSecGrpMembId() );
	}
}

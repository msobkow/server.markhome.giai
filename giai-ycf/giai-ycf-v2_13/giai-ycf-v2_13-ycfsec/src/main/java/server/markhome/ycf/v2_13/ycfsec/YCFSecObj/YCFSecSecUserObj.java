// Description: Java 11 base object instance implementation for YCFSec SecUser.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFSecSecUserObj
	implements IYCFSecSecUserObj
{
	public final static String CLASS_CODE = "a011";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecUserEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecUserPKey pKey;
	protected YCFSecSecUserBuff buff;
	protected IYCFSecSecDeviceObj optionalLookupDefDev;

	public YCFSecSecUserObj() {
		isNew = true;
		optionalLookupDefDev = null;
	}

	public YCFSecSecUserObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		optionalLookupDefDev = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecUser" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredLoginId();
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFSecClusterObj ) {
					break;
				}
				else if( container instanceof IYCFSecTenantObj ) {
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
				if( container instanceof IYCFSecClusterObj ) {
					break;
				}
				else if( container instanceof IYCFSecTenantObj ) {
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
		if( subObj == null ) {
			subObj = ((IYCFSecSchemaObj)getSchema()).getSecDeviceTableObj().readSecDeviceByNameIdx( getRequiredSecUserId(),
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

	public IYCFSecSecUserObj realise() {
		IYCFSecSecUserObj retobj = ((IYCFSecSchemaObj)schema).getSecUserTableObj().realiseSecUser(
			(IYCFSecSecUserObj)this );
		return( (IYCFSecSecUserObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getSecUserTableObj().reallyDeepDisposeSecUser( (IYCFSecSecUserObj)this );
	}

	public IYCFSecSecUserObj read() {
		IYCFSecSecUserObj retobj = ((IYCFSecSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId(), false );
		return( (IYCFSecSecUserObj)retobj );
	}

	public IYCFSecSecUserObj read( boolean forceRead ) {
		IYCFSecSecUserObj retobj = ((IYCFSecSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId(), forceRead );
		return( (IYCFSecSecUserObj)retobj );
	}

	public IYCFSecSecUserTableObj getSecUserTable() {
		return( ((IYCFSecSchemaObj)schema).getSecUserTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecUserBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecUser().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecUser().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSecUserId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecUserBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecUserBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecUserBuff" );
		}
		buff = value;
		copyBuffToPKey();
		optionalLookupDefDev = null;
	}

	public YCFSecSecUserBuff getSecUserBuff() {
		return( (YCFSecSecUserBuff)getBuff() );
	}

	public YCFSecSecUserPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecUserPKey value ) {
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

	public IYCFSecSecUserEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecUserObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecUserObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getSecUserTableObj().lockSecUser( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getSecUserTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecUserEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecUserEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecUserEditObj getEditAsSecUser() {
		return( (IYCFSecSecUserEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecUserBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecUserBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public UUID getRequiredSecUserId() {
		return( getPKey().getRequiredSecUserId() );
	}

	public String getRequiredLoginId() {
		return( getSecUserBuff().getRequiredLoginId() );
	}

	public String getRequiredEMailAddress() {
		return( getSecUserBuff().getRequiredEMailAddress() );
	}

	public UUID getOptionalEMailConfirmUuid() {
		return( getSecUserBuff().getOptionalEMailConfirmUuid() );
	}

	public UUID getOptionalDfltDevUserId() {
		return( getSecUserBuff().getOptionalDfltDevUserId() );
	}

	public String getOptionalDfltDevName() {
		return( getSecUserBuff().getOptionalDfltDevName() );
	}

	public String getRequiredPasswordHash() {
		return( getSecUserBuff().getRequiredPasswordHash() );
	}

	public UUID getOptionalPasswordResetUuid() {
		return( getSecUserBuff().getOptionalPasswordResetUuid() );
	}

	public List<IYCFSecSecDeviceObj> getOptionalComponentsSecDev() {
		List<IYCFSecSecDeviceObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead ) {
		List<IYCFSecSecDeviceObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public IYCFSecSecDeviceObj getOptionalLookupDefDev() {
		return( getOptionalLookupDefDev( false ) );
	}

	public IYCFSecSecDeviceObj getOptionalLookupDefDev( boolean forceRead ) {
		if( ( optionalLookupDefDev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getSecUserBuff().getOptionalDfltDevUserId() == null ) {
				anyMissing = true;
			}
			if( getSecUserBuff().getOptionalDfltDevName() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefDev = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByIdIdx( getSecUserBuff().getOptionalDfltDevUserId(),
					getSecUserBuff().getOptionalDfltDevName(), forceRead );
			}
		}
		return( optionalLookupDefDev );
	}

	public List<IYCFSecSecSessionObj> getOptionalComponentsSecSess() {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecSessionObj> getOptionalComponentsSecSess( boolean forceRead ) {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecSessionObj> getOptionalChildrenSecProxy() {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead ) {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb() {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead ) {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb() {
		List<IYCFSecTSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead ) {
		List<IYCFSecTSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredSecUserId( getPKey().getRequiredSecUserId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSecUserId( buff.getRequiredSecUserId() );
	}
}

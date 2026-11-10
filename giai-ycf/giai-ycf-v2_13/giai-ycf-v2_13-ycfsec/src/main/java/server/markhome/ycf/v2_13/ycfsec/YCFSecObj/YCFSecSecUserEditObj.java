// Description: Java 11 edit object instance implementation for YCFSec SecUser.

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

public class YCFSecSecUserEditObj
	implements IYCFSecSecUserEditObj
{
	protected IYCFSecSecUserObj orig;
	protected YCFSecSecUserBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecSecDeviceObj optionalLookupDefDev;

	public YCFSecSecUserEditObj( IYCFSecSecUserObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecUserBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		optionalLookupDefDev = null;
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
		return( YCFSecSecUserObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecUserObj retobj = getSchema().getSecUserTableObj().realiseSecUser( (IYCFSecSecUserObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecUser().forget();
	}

	public IYCFSecSecUserObj read() {
		IYCFSecSecUserObj retval = getOrigAsSecUser().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecUserObj read( boolean forceRead ) {
		IYCFSecSecUserObj retval = getOrigAsSecUser().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecUserObj create() {
		copyBuffToOrig();
		IYCFSecSecUserObj retobj = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecUserTableObj().createSecUser( getOrigAsSecUser() );
		if( retobj == getOrigAsSecUser() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecUserEditObj update() {
		getSchema().getSecUserTableObj().updateSecUser( (IYCFSecSecUserObj)this );
		return( null );
	}

	public YCFSecSecUserEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecUserTableObj().deleteSecUser( getOrigAsSecUser() );
		return( null );
	}

	public IYCFSecSecUserTableObj getSecUserTable() {
		return( orig.getSchema().getSecUserTableObj() );
	}

	public IYCFSecSecUserEditObj getEdit() {
		return( (IYCFSecSecUserEditObj)this );
	}

	public IYCFSecSecUserEditObj getEditAsSecUser() {
		return( (IYCFSecSecUserEditObj)this );
	}

	public IYCFSecSecUserEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecUserObj getOrig() {
		return( orig );
	}

	public IYCFSecSecUserObj getOrigAsSecUser() {
		return( (IYCFSecSecUserObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecUserBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsSecUser().getSchema().getBackingStore()).getFactorySecUser().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecUserBuff value ) {
		if( buff != value ) {
			buff = value;
			optionalLookupDefDev = null;
		}
	}

	public YCFSecSecUserBuff getSecUserBuff() {
		return( (YCFSecSecUserBuff)getBuff() );
	}

	public YCFSecSecUserPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecUserPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public UUID getRequiredSecUserId() {
		return( getPKey().getRequiredSecUserId() );
	}

	public String getRequiredLoginId() {
		return( getSecUserBuff().getRequiredLoginId() );
	}

	public void setRequiredLoginId( String value ) {
		if( getSecUserBuff().getRequiredLoginId() != value ) {
			getSecUserBuff().setRequiredLoginId( value );
		}
	}

	public String getRequiredEMailAddress() {
		return( getSecUserBuff().getRequiredEMailAddress() );
	}

	public void setRequiredEMailAddress( String value ) {
		if( getSecUserBuff().getRequiredEMailAddress() != value ) {
			getSecUserBuff().setRequiredEMailAddress( value );
		}
	}

	public UUID getOptionalEMailConfirmUuid() {
		return( getSecUserBuff().getOptionalEMailConfirmUuid() );
	}

	public void setOptionalEMailConfirmUuid( UUID value ) {
		if( getSecUserBuff().getOptionalEMailConfirmUuid() != value ) {
			getSecUserBuff().setOptionalEMailConfirmUuid( value );
		}
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

	public void setRequiredPasswordHash( String value ) {
		if( getSecUserBuff().getRequiredPasswordHash() != value ) {
			getSecUserBuff().setRequiredPasswordHash( value );
		}
	}

	public UUID getOptionalPasswordResetUuid() {
		return( getSecUserBuff().getOptionalPasswordResetUuid() );
	}

	public void setOptionalPasswordResetUuid( UUID value ) {
		if( getSecUserBuff().getOptionalPasswordResetUuid() != value ) {
			getSecUserBuff().setOptionalPasswordResetUuid( value );
		}
	}

	public List<IYCFSecSecDeviceObj> getOptionalComponentsSecDev() {
		List<IYCFSecSecDeviceObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead ) {
		List<IYCFSecSecDeviceObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public IYCFSecSecDeviceObj getOptionalLookupDefDev() {
		return( getOptionalLookupDefDev( false ) );
	}

	public IYCFSecSecDeviceObj getOptionalLookupDefDev( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefDev == null ) ) {
			boolean anyMissing = false;
			if( getSecUserBuff().getOptionalDfltDevUserId() == null ) {
				anyMissing = true;
			}
			if( getSecUserBuff().getOptionalDfltDevName() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFSecSecDeviceObj obj = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecDeviceTableObj().readSecDeviceByIdIdx( getSecUserBuff().getOptionalDfltDevUserId(),
					getSecUserBuff().getOptionalDfltDevName() );
				optionalLookupDefDev = obj;
			}
		}
		return( optionalLookupDefDev );
	}

	public void setOptionalLookupDefDev( IYCFSecSecDeviceObj value ) {
			if( buff == null ) {
				getSecUserBuff();
			}
			if( value != null ) {
				getSecUserBuff().setOptionalDfltDevUserId( value.getRequiredSecUserId() );
				getSecUserBuff().setOptionalDfltDevName( value.getRequiredDevName() );
			}
			else {
				getSecUserBuff().setOptionalDfltDevUserId( null );
				getSecUserBuff().setOptionalDfltDevName( null );
			}
			optionalLookupDefDev = value;
	}

	public List<IYCFSecSecSessionObj> getOptionalComponentsSecSess() {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecSessionObj> getOptionalComponentsSecSess( boolean forceRead ) {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecSessionObj> getOptionalChildrenSecProxy() {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead ) {
		List<IYCFSecSecSessionObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb() {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead ) {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb() {
		List<IYCFSecTSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead ) {
		List<IYCFSecTSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecUser().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredSecUserId( getPKey().getRequiredSecUserId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSecUserId( buff.getRequiredSecUserId() );
	}

	public void copyBuffToOrig() {
		YCFSecSecUserBuff origBuff = getOrigAsSecUser().getSecUserBuff();
		YCFSecSecUserBuff myBuff = getSecUserBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecUserBuff origBuff = getOrigAsSecUser().getSecUserBuff();
		YCFSecSecUserBuff myBuff = getSecUserBuff();
		myBuff.set( origBuff );
	}
}

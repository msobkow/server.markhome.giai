// Description: Java 11 edit object instance implementation for YCFSec SecDevice.

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

public class YCFSecSecDeviceEditObj
	implements IYCFSecSecDeviceEditObj
{
	protected IYCFSecSecDeviceObj orig;
	protected YCFSecSecDeviceBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecSecUserObj requiredContainerSecUser;

	public YCFSecSecDeviceEditObj( IYCFSecSecDeviceObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecDeviceBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerSecUser = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecDeviceBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecDeviceBuff buff = getBuff();
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
		return( YCFSecSecDeviceObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecDevice" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecSecUserObj scope = getRequiredContainerSecUser();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecSecUserObj scope = getRequiredContainerSecUser();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredDevName();
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

	public IYCFSecSecDeviceObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecDeviceObj retobj = getSchema().getSecDeviceTableObj().realiseSecDevice( (IYCFSecSecDeviceObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecDevice().forget();
	}

	public IYCFSecSecDeviceObj read() {
		IYCFSecSecDeviceObj retval = getOrigAsSecDevice().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecDeviceObj read( boolean forceRead ) {
		IYCFSecSecDeviceObj retval = getOrigAsSecDevice().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecDeviceObj create() {
		copyBuffToOrig();
		IYCFSecSecDeviceObj retobj = ((IYCFSecSchemaObj)getOrigAsSecDevice().getSchema()).getSecDeviceTableObj().createSecDevice( getOrigAsSecDevice() );
		if( retobj == getOrigAsSecDevice() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecDeviceEditObj update() {
		getSchema().getSecDeviceTableObj().updateSecDevice( (IYCFSecSecDeviceObj)this );
		return( null );
	}

	public YCFSecSecDeviceEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecDeviceTableObj().deleteSecDevice( getOrigAsSecDevice() );
		return( null );
	}

	public IYCFSecSecDeviceTableObj getSecDeviceTable() {
		return( orig.getSchema().getSecDeviceTableObj() );
	}

	public IYCFSecSecDeviceEditObj getEdit() {
		return( (IYCFSecSecDeviceEditObj)this );
	}

	public IYCFSecSecDeviceEditObj getEditAsSecDevice() {
		return( (IYCFSecSecDeviceEditObj)this );
	}

	public IYCFSecSecDeviceEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecDeviceObj getOrig() {
		return( orig );
	}

	public IYCFSecSecDeviceObj getOrigAsSecDevice() {
		return( (IYCFSecSecDeviceObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecDeviceBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsSecDevice().getSchema().getBackingStore()).getFactorySecDevice().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecDeviceBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerSecUser = null;
		}
	}

	public YCFSecSecDeviceBuff getSecDeviceBuff() {
		return( (YCFSecSecDeviceBuff)getBuff() );
	}

	public YCFSecSecDevicePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecDevicePKey value ) {
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

	public String getRequiredDevName() {
		return( getPKey().getRequiredDevName() );
	}

	public void setRequiredDevName( String value ) {
		if( getPKey().getRequiredDevName() != value ) {
			getPKey().setRequiredDevName( value );
		}
		if( getSecDeviceBuff().getRequiredDevName() != value ) {
			getSecDeviceBuff().setRequiredDevName( value );
		}
	}

	public String getOptionalPubKey() {
		return( getSecDeviceBuff().getOptionalPubKey() );
	}

	public void setOptionalPubKey( String value ) {
		if( getSecDeviceBuff().getOptionalPubKey() != value ) {
			getSecDeviceBuff().setOptionalPubKey( value );
		}
	}

	public IYCFSecSecUserObj getRequiredContainerSecUser() {
		return( getRequiredContainerSecUser( false ) );
	}

	public IYCFSecSecUserObj getRequiredContainerSecUser( boolean forceRead ) {
		if( forceRead || ( requiredContainerSecUser == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecUserObj obj = ((IYCFSecSchemaObj)getOrigAsSecDevice().getSchema()).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId() );
				requiredContainerSecUser = obj;
				if( obj != null ) {
					getSecDeviceBuff().setRequiredSecUserId( obj.getRequiredSecUserId() );
					requiredContainerSecUser = obj;
				}
			}
		}
		return( requiredContainerSecUser );
	}

	public void setRequiredContainerSecUser( IYCFSecSecUserObj value ) {
			if( buff == null ) {
				getSecDeviceBuff();
			}
			if( value != null ) {
				getPKey().setRequiredSecUserId( value.getRequiredSecUserId() );
				getSecDeviceBuff().setRequiredSecUserId( value.getRequiredSecUserId() );
			}
			requiredContainerSecUser = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredSecUserId( getPKey().getRequiredSecUserId() );
		buff.setRequiredDevName( getPKey().getRequiredDevName() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSecUserId( buff.getRequiredSecUserId() );
		getPKey().setRequiredDevName( buff.getRequiredDevName() );
	}

	public void copyBuffToOrig() {
		YCFSecSecDeviceBuff origBuff = getOrigAsSecDevice().getSecDeviceBuff();
		YCFSecSecDeviceBuff myBuff = getSecDeviceBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecDeviceBuff origBuff = getOrigAsSecDevice().getSecDeviceBuff();
		YCFSecSecDeviceBuff myBuff = getSecDeviceBuff();
		myBuff.set( origBuff );
	}
}

// Description: Java 11 base object instance implementation for YCFSec SecDevice.

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

public class YCFSecSecDeviceObj
	implements IYCFSecSecDeviceObj
{
	public final static String CLASS_CODE = "a00a";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecDeviceEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecDevicePKey pKey;
	protected YCFSecSecDeviceBuff buff;
	protected IYCFSecSecUserObj requiredContainerSecUser;

	public YCFSecSecDeviceObj() {
		isNew = true;
		requiredContainerSecUser = null;
	}

	public YCFSecSecDeviceObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerSecUser = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFSecSecDeviceObj retobj = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().realiseSecDevice(
			(IYCFSecSecDeviceObj)this );
		return( (IYCFSecSecDeviceObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getSecDeviceTableObj().reallyDeepDisposeSecDevice( (IYCFSecSecDeviceObj)this );
	}

	public IYCFSecSecDeviceObj read() {
		IYCFSecSecDeviceObj retobj = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByIdIdx( getPKey().getRequiredSecUserId(),
			getPKey().getRequiredDevName(), false );
		return( (IYCFSecSecDeviceObj)retobj );
	}

	public IYCFSecSecDeviceObj read( boolean forceRead ) {
		IYCFSecSecDeviceObj retobj = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByIdIdx( getPKey().getRequiredSecUserId(),
			getPKey().getRequiredDevName(), forceRead );
		return( (IYCFSecSecDeviceObj)retobj );
	}

	public IYCFSecSecDeviceTableObj getSecDeviceTable() {
		return( ((IYCFSecSchemaObj)schema).getSecDeviceTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecDeviceBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecDevice().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSecUserId(),
						getPKey().getRequiredDevName() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecDeviceBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecDeviceBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecDeviceBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerSecUser = null;
	}

	public YCFSecSecDeviceBuff getSecDeviceBuff() {
		return( (YCFSecSecDeviceBuff)getBuff() );
	}

	public YCFSecSecDevicePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecDevicePKey value ) {
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

	public IYCFSecSecDeviceEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecDeviceObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecDeviceObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().lockSecDevice( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getSecDeviceTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecDeviceEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecDeviceEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecDeviceEditObj getEditAsSecDevice() {
		return( (IYCFSecSecDeviceEditObj)edit );
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

	public UUID getRequiredSecUserId() {
		return( getPKey().getRequiredSecUserId() );
	}

	public String getRequiredDevName() {
		return( getPKey().getRequiredDevName() );
	}

	public String getOptionalPubKey() {
		return( getSecDeviceBuff().getOptionalPubKey() );
	}

	public IYCFSecSecUserObj getRequiredContainerSecUser() {
		return( getRequiredContainerSecUser( false ) );
	}

	public IYCFSecSecUserObj getRequiredContainerSecUser( boolean forceRead ) {
		if( ( requiredContainerSecUser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerSecUser = ((IYCFSecSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId(), forceRead );
			}
		}
		return( requiredContainerSecUser );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredSecUserId( getPKey().getRequiredSecUserId() );
			buff.setRequiredDevName( getPKey().getRequiredDevName() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSecUserId( buff.getRequiredSecUserId() );
		getPKey().setRequiredDevName( buff.getRequiredDevName() );
	}
}

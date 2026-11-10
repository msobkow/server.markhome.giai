// Description: Java 11 base object instance implementation for YCFGenKb SecDevice.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public class YCFGenKbSecDeviceObj
	implements IYCFGenKbSecDeviceObj
{
	public final static String CLASS_CODE = "a905";
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFGenKbSecDeviceEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbSecDevicePKey pKey;
	protected YCFGenKbSecDeviceBuff buff;
	protected IYCFGenKbSecUserObj requiredContainerSecUser;

	public YCFGenKbSecDeviceObj() {
		isNew = true;
		requiredContainerSecUser = null;
	}

	public YCFGenKbSecDeviceObj( IYCFGenKbSchemaObj argSchema ) {
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
		IYCFGenKbSecUserObj scope = getRequiredContainerSecUser();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbSecUserObj scope = getRequiredContainerSecUser();
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
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
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
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
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
			if( container instanceof IYCFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFGenKbTenantObj ) {
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
			if( container instanceof IYCFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFGenKbTenantObj ) {
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

	public IYCFGenKbSecDeviceObj realise() {
		IYCFGenKbSecDeviceObj retobj = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().realiseSecDevice(
			(IYCFGenKbSecDeviceObj)this );
		return( (IYCFGenKbSecDeviceObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().reallyDeepDisposeSecDevice( (IYCFGenKbSecDeviceObj)this );
	}

	public IYCFGenKbSecDeviceObj read() {
		IYCFGenKbSecDeviceObj retobj = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByIdIdx( getPKey().getRequiredSecUserId(),
			getPKey().getRequiredDevName(), false );
		return( (IYCFGenKbSecDeviceObj)retobj );
	}

	public IYCFGenKbSecDeviceObj read( boolean forceRead ) {
		IYCFGenKbSecDeviceObj retobj = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByIdIdx( getPKey().getRequiredSecUserId(),
			getPKey().getRequiredDevName(), forceRead );
		return( (IYCFGenKbSecDeviceObj)retobj );
	}

	public IYCFGenKbSecDeviceTableObj getSecDeviceTable() {
		return( ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbSecDeviceBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSecUserId(),
						getPKey().getRequiredDevName() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecDeviceBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbSecDeviceBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbSecDeviceBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerSecUser = null;
	}

	public YCFGenKbSecDeviceBuff getSecDeviceBuff() {
		return( (YCFGenKbSecDeviceBuff)getBuff() );
	}

	public YCFGenKbSecDevicePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbSecDevicePKey value ) {
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

	public IYCFGenKbSecDeviceEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbSecDeviceObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbSecDeviceObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().lockSecDevice( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbSecDeviceEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbSecDeviceEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbSecDeviceEditObj getEditAsSecDevice() {
		return( (IYCFGenKbSecDeviceEditObj)edit );
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecDeviceBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecDeviceBuff buff = getBuff();
			updatedBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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

	public IYCFGenKbSecUserObj getRequiredContainerSecUser() {
		return( getRequiredContainerSecUser( false ) );
	}

	public IYCFGenKbSecUserObj getRequiredContainerSecUser( boolean forceRead ) {
		if( ( requiredContainerSecUser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerSecUser = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId(), forceRead );
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

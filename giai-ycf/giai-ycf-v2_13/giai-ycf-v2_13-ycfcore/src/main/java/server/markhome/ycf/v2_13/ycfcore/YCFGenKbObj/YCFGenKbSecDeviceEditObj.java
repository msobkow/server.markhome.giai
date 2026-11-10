// Description: Java 11 edit object instance implementation for YCFGenKb SecDevice.

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

public class YCFGenKbSecDeviceEditObj
	implements IYCFGenKbSecDeviceEditObj
{
	protected IYCFGenKbSecDeviceObj orig;
	protected YCFGenKbSecDeviceBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbSecUserObj requiredContainerSecUser;

	public YCFGenKbSecDeviceEditObj( IYCFGenKbSecDeviceObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecDeviceBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerSecUser = null;
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

	public void setCreatedBy( IYCFGenKbSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( IYCFGenKbSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( YCFGenKbSecDeviceObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecDeviceObj retobj = getSchema().getSecDeviceTableObj().realiseSecDevice( (IYCFGenKbSecDeviceObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecDevice().forget();
	}

	public IYCFGenKbSecDeviceObj read() {
		IYCFGenKbSecDeviceObj retval = getOrigAsSecDevice().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecDeviceObj read( boolean forceRead ) {
		IYCFGenKbSecDeviceObj retval = getOrigAsSecDevice().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecDeviceObj create() {
		copyBuffToOrig();
		IYCFGenKbSecDeviceObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecDevice().getSchema()).getSecDeviceTableObj().createSecDevice( getOrigAsSecDevice() );
		if( retobj == getOrigAsSecDevice() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecDeviceEditObj update() {
		getSchema().getSecDeviceTableObj().updateSecDevice( (IYCFGenKbSecDeviceObj)this );
		return( null );
	}

	public YCFGenKbSecDeviceEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecDeviceTableObj().deleteSecDevice( getOrigAsSecDevice() );
		return( null );
	}

	public IYCFGenKbSecDeviceTableObj getSecDeviceTable() {
		return( orig.getSchema().getSecDeviceTableObj() );
	}

	public IYCFGenKbSecDeviceEditObj getEdit() {
		return( (IYCFGenKbSecDeviceEditObj)this );
	}

	public IYCFGenKbSecDeviceEditObj getEditAsSecDevice() {
		return( (IYCFGenKbSecDeviceEditObj)this );
	}

	public IYCFGenKbSecDeviceEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecDeviceObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecDeviceObj getOrigAsSecDevice() {
		return( (IYCFGenKbSecDeviceObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecDeviceBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecDevice().getSchema().getBackingStore()).getFactorySecDevice().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecDeviceBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerSecUser = null;
		}
	}

	public YCFGenKbSecDeviceBuff getSecDeviceBuff() {
		return( (YCFGenKbSecDeviceBuff)getBuff() );
	}

	public YCFGenKbSecDevicePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecDevicePKey value ) {
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

	public IYCFGenKbSecUserObj getRequiredContainerSecUser() {
		return( getRequiredContainerSecUser( false ) );
	}

	public IYCFGenKbSecUserObj getRequiredContainerSecUser( boolean forceRead ) {
		if( forceRead || ( requiredContainerSecUser == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbSecUserObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecDevice().getSchema()).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId() );
				requiredContainerSecUser = obj;
				if( obj != null ) {
					getSecDeviceBuff().setRequiredSecUserId( obj.getRequiredSecUserId() );
					requiredContainerSecUser = obj;
				}
			}
		}
		return( requiredContainerSecUser );
	}

	public void setRequiredContainerSecUser( IYCFGenKbSecUserObj value ) {
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
		YCFGenKbSecDeviceBuff origBuff = getOrigAsSecDevice().getSecDeviceBuff();
		YCFGenKbSecDeviceBuff myBuff = getSecDeviceBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecDeviceBuff origBuff = getOrigAsSecDevice().getSecDeviceBuff();
		YCFGenKbSecDeviceBuff myBuff = getSecDeviceBuff();
		myBuff.set( origBuff );
	}
}

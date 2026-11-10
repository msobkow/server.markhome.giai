// Description: Java 11 edit object instance implementation for YCFGenKb SecUser.

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

public class YCFGenKbSecUserEditObj
	implements IYCFGenKbSecUserEditObj
{
	protected IYCFGenKbSecUserObj orig;
	protected YCFGenKbSecUserBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbSecDeviceObj optionalLookupDefDev;

	public YCFGenKbSecUserEditObj( IYCFGenKbSecUserObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecUserBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		optionalLookupDefDev = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecUserBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecUserBuff buff = getBuff();
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
		return( YCFGenKbSecUserObj.CLASS_CODE );
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
		if( subObj == null ) {
			subObj = ((IYCFGenKbSchemaObj)getSchema()).getSecDeviceTableObj().readSecDeviceByNameIdx( getRequiredSecUserId(),
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

	public IYCFGenKbSecUserObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecUserObj retobj = getSchema().getSecUserTableObj().realiseSecUser( (IYCFGenKbSecUserObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecUser().forget();
	}

	public IYCFGenKbSecUserObj read() {
		IYCFGenKbSecUserObj retval = getOrigAsSecUser().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecUserObj read( boolean forceRead ) {
		IYCFGenKbSecUserObj retval = getOrigAsSecUser().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecUserObj create() {
		copyBuffToOrig();
		IYCFGenKbSecUserObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecUserTableObj().createSecUser( getOrigAsSecUser() );
		if( retobj == getOrigAsSecUser() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecUserEditObj update() {
		getSchema().getSecUserTableObj().updateSecUser( (IYCFGenKbSecUserObj)this );
		return( null );
	}

	public YCFGenKbSecUserEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecUserTableObj().deleteSecUser( getOrigAsSecUser() );
		return( null );
	}

	public IYCFGenKbSecUserTableObj getSecUserTable() {
		return( orig.getSchema().getSecUserTableObj() );
	}

	public IYCFGenKbSecUserEditObj getEdit() {
		return( (IYCFGenKbSecUserEditObj)this );
	}

	public IYCFGenKbSecUserEditObj getEditAsSecUser() {
		return( (IYCFGenKbSecUserEditObj)this );
	}

	public IYCFGenKbSecUserEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecUserObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecUserObj getOrigAsSecUser() {
		return( (IYCFGenKbSecUserObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecUserBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecUser().getSchema().getBackingStore()).getFactorySecUser().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecUserBuff value ) {
		if( buff != value ) {
			buff = value;
			optionalLookupDefDev = null;
		}
	}

	public YCFGenKbSecUserBuff getSecUserBuff() {
		return( (YCFGenKbSecUserBuff)getBuff() );
	}

	public YCFGenKbSecUserPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecUserPKey value ) {
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

	public List<IYCFGenKbSecDeviceObj> getOptionalComponentsSecDev() {
		List<IYCFGenKbSecDeviceObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead ) {
		List<IYCFGenKbSecDeviceObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public IYCFGenKbSecDeviceObj getOptionalLookupDefDev() {
		return( getOptionalLookupDefDev( false ) );
	}

	public IYCFGenKbSecDeviceObj getOptionalLookupDefDev( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefDev == null ) ) {
			boolean anyMissing = false;
			if( getSecUserBuff().getOptionalDfltDevUserId() == null ) {
				anyMissing = true;
			}
			if( getSecUserBuff().getOptionalDfltDevName() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbSecDeviceObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecDeviceTableObj().readSecDeviceByIdIdx( getSecUserBuff().getOptionalDfltDevUserId(),
					getSecUserBuff().getOptionalDfltDevName() );
				optionalLookupDefDev = obj;
			}
		}
		return( optionalLookupDefDev );
	}

	public void setOptionalLookupDefDev( IYCFGenKbSecDeviceObj value ) {
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

	public List<IYCFGenKbSecSessionObj> getOptionalComponentsSecSess() {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecSessionObj> getOptionalComponentsSecSess( boolean forceRead ) {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecSessionObj> getOptionalChildrenSecProxy() {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead ) {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb() {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead ) {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb() {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead ) {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsSecUser().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
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
		YCFGenKbSecUserBuff origBuff = getOrigAsSecUser().getSecUserBuff();
		YCFGenKbSecUserBuff myBuff = getSecUserBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecUserBuff origBuff = getOrigAsSecUser().getSecUserBuff();
		YCFGenKbSecUserBuff myBuff = getSecUserBuff();
		myBuff.set( origBuff );
	}
}

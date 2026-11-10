// Description: Java 11 base object instance implementation for YCFGenKb SecUser.

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

public class YCFGenKbSecUserObj
	implements IYCFGenKbSecUserObj
{
	public final static String CLASS_CODE = "a90e";
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFGenKbSecUserEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbSecUserPKey pKey;
	protected YCFGenKbSecUserBuff buff;
	protected IYCFGenKbSecDeviceObj optionalLookupDefDev;

	public YCFGenKbSecUserObj() {
		isNew = true;
		optionalLookupDefDev = null;
	}

	public YCFGenKbSecUserObj( IYCFGenKbSchemaObj argSchema ) {
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
		IYCFGenKbSecUserObj retobj = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().realiseSecUser(
			(IYCFGenKbSecUserObj)this );
		return( (IYCFGenKbSecUserObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getSecUserTableObj().reallyDeepDisposeSecUser( (IYCFGenKbSecUserObj)this );
	}

	public IYCFGenKbSecUserObj read() {
		IYCFGenKbSecUserObj retobj = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId(), false );
		return( (IYCFGenKbSecUserObj)retobj );
	}

	public IYCFGenKbSecUserObj read( boolean forceRead ) {
		IYCFGenKbSecUserObj retobj = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getPKey().getRequiredSecUserId(), forceRead );
		return( (IYCFGenKbSecUserObj)retobj );
	}

	public IYCFGenKbSecUserTableObj getSecUserTable() {
		return( ((IYCFGenKbSchemaObj)schema).getSecUserTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbSecUserBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSecUserId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecUserBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbSecUserBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbSecUserBuff" );
		}
		buff = value;
		copyBuffToPKey();
		optionalLookupDefDev = null;
	}

	public YCFGenKbSecUserBuff getSecUserBuff() {
		return( (YCFGenKbSecUserBuff)getBuff() );
	}

	public YCFGenKbSecUserPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbSecUserPKey value ) {
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

	public IYCFGenKbSecUserEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbSecUserObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbSecUserObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().lockSecUser( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbSecUserEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbSecUserEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbSecUserEditObj getEditAsSecUser() {
		return( (IYCFGenKbSecUserEditObj)edit );
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

	public List<IYCFGenKbSecDeviceObj> getOptionalComponentsSecDev() {
		List<IYCFGenKbSecDeviceObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead ) {
		List<IYCFGenKbSecDeviceObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public IYCFGenKbSecDeviceObj getOptionalLookupDefDev() {
		return( getOptionalLookupDefDev( false ) );
	}

	public IYCFGenKbSecDeviceObj getOptionalLookupDefDev( boolean forceRead ) {
		if( ( optionalLookupDefDev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getSecUserBuff().getOptionalDfltDevUserId() == null ) {
				anyMissing = true;
			}
			if( getSecUserBuff().getOptionalDfltDevName() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefDev = ((IYCFGenKbSchemaObj)schema).getSecDeviceTableObj().readSecDeviceByIdIdx( getSecUserBuff().getOptionalDfltDevUserId(),
					getSecUserBuff().getOptionalDfltDevName(), forceRead );
			}
		}
		return( optionalLookupDefDev );
	}

	public List<IYCFGenKbSecSessionObj> getOptionalComponentsSecSess() {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecSessionObj> getOptionalComponentsSecSess( boolean forceRead ) {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecSessionObj> getOptionalChildrenSecProxy() {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead ) {
		List<IYCFGenKbSecSessionObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().readSecSessionBySecProxyIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb() {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead ) {
		List<IYCFGenKbSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			forceRead );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb() {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead ) {
		List<IYCFGenKbTSecGrpMembObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getTSecGrpMembTableObj().readTSecGrpMembByUserIdx( getPKey().getRequiredSecUserId(),
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

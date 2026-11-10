// Description: Java 11 edit object instance implementation for YCFGenKb SecGrpMemb.

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

public class YCFGenKbSecGrpMembEditObj
	implements IYCFGenKbSecGrpMembEditObj
{
	protected IYCFGenKbSecGrpMembObj orig;
	protected YCFGenKbSecGrpMembBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredOwnerCluster;
	protected IYCFGenKbSecGroupObj requiredContainerGroup;
	protected IYCFGenKbSecUserObj requiredParentUser;

	public YCFGenKbSecGrpMembEditObj( IYCFGenKbSecGrpMembObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecGrpMembBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecGrpMembBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecGrpMembBuff buff = getBuff();
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
		return( YCFGenKbSecGrpMembObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGrpMemb" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbSecGroupObj scope = getRequiredContainerGroup();
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

	public IYCFGenKbSecGrpMembObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecGrpMembObj retobj = getSchema().getSecGrpMembTableObj().realiseSecGrpMemb( (IYCFGenKbSecGrpMembObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGrpMemb().forget();
	}

	public IYCFGenKbSecGrpMembObj read() {
		IYCFGenKbSecGrpMembObj retval = getOrigAsSecGrpMemb().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGrpMembObj read( boolean forceRead ) {
		IYCFGenKbSecGrpMembObj retval = getOrigAsSecGrpMemb().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGrpMembObj create() {
		copyBuffToOrig();
		IYCFGenKbSecGrpMembObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpMemb().getSchema()).getSecGrpMembTableObj().createSecGrpMemb( getOrigAsSecGrpMemb() );
		if( retobj == getOrigAsSecGrpMemb() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecGrpMembEditObj update() {
		getSchema().getSecGrpMembTableObj().updateSecGrpMemb( (IYCFGenKbSecGrpMembObj)this );
		return( null );
	}

	public YCFGenKbSecGrpMembEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGrpMembTableObj().deleteSecGrpMemb( getOrigAsSecGrpMemb() );
		return( null );
	}

	public IYCFGenKbSecGrpMembTableObj getSecGrpMembTable() {
		return( orig.getSchema().getSecGrpMembTableObj() );
	}

	public IYCFGenKbSecGrpMembEditObj getEdit() {
		return( (IYCFGenKbSecGrpMembEditObj)this );
	}

	public IYCFGenKbSecGrpMembEditObj getEditAsSecGrpMemb() {
		return( (IYCFGenKbSecGrpMembEditObj)this );
	}

	public IYCFGenKbSecGrpMembEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecGrpMembObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecGrpMembObj getOrigAsSecGrpMemb() {
		return( (IYCFGenKbSecGrpMembObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecGrpMembBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecGrpMemb().getSchema().getBackingStore()).getFactorySecGrpMemb().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecGrpMembBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerGroup = null;
			requiredParentUser = null;
		}
	}

	public YCFGenKbSecGrpMembBuff getSecGrpMembBuff() {
		return( (YCFGenKbSecGrpMembBuff)getBuff() );
	}

	public YCFGenKbSecGrpMembPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecGrpMembPKey value ) {
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

	public IYCFGenKbClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpMemb().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getSecGrpMembBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGrpMembBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredOwnerCluster = value;
	}

	public IYCFGenKbSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFGenKbSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( forceRead || ( requiredContainerGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbSecGroupObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpMemb().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
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

	public void setRequiredContainerGroup( IYCFGenKbSecGroupObj value ) {
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

	public IYCFGenKbSecUserObj getRequiredParentUser() {
		return( getRequiredParentUser( false ) );
	}

	public IYCFGenKbSecUserObj getRequiredParentUser( boolean forceRead ) {
		if( forceRead || ( requiredParentUser == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbSecUserObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpMemb().getSchema()).getSecUserTableObj().readSecUserByIdIdx( getSecGrpMembBuff().getRequiredSecUserId() );
				requiredParentUser = obj;
			}
		}
		return( requiredParentUser );
	}

	public void setRequiredParentUser( IYCFGenKbSecUserObj value ) {
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
		YCFGenKbSecGrpMembBuff origBuff = getOrigAsSecGrpMemb().getSecGrpMembBuff();
		YCFGenKbSecGrpMembBuff myBuff = getSecGrpMembBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecGrpMembBuff origBuff = getOrigAsSecGrpMemb().getSecGrpMembBuff();
		YCFGenKbSecGrpMembBuff myBuff = getSecGrpMembBuff();
		myBuff.set( origBuff );
	}
}

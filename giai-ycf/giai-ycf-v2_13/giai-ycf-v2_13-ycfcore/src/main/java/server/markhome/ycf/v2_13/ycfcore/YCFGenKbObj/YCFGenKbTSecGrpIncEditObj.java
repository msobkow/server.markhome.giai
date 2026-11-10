// Description: Java 11 edit object instance implementation for YCFGenKb TSecGrpInc.

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

public class YCFGenKbTSecGrpIncEditObj
	implements IYCFGenKbTSecGrpIncEditObj
{
	protected IYCFGenKbTSecGrpIncObj orig;
	protected YCFGenKbTSecGrpIncBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbTenantObj requiredOwnerTenant;
	protected IYCFGenKbTSecGroupObj requiredContainerGroup;
	protected IYCFGenKbTSecGroupObj requiredParentSubGroup;

	public YCFGenKbTSecGrpIncEditObj( IYCFGenKbTSecGrpIncObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbTSecGrpIncBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbTSecGrpIncBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbTSecGrpIncBuff buff = getBuff();
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
		return( YCFGenKbTSecGrpIncObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TSecGrpInc" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbTSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbTSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredTSecGrpIncId();
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

	public IYCFGenKbTSecGrpIncObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbTSecGrpIncObj retobj = getSchema().getTSecGrpIncTableObj().realiseTSecGrpInc( (IYCFGenKbTSecGrpIncObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTSecGrpInc().forget();
	}

	public IYCFGenKbTSecGrpIncObj read() {
		IYCFGenKbTSecGrpIncObj retval = getOrigAsTSecGrpInc().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbTSecGrpIncObj read( boolean forceRead ) {
		IYCFGenKbTSecGrpIncObj retval = getOrigAsTSecGrpInc().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbTSecGrpIncObj create() {
		copyBuffToOrig();
		IYCFGenKbTSecGrpIncObj retobj = ((IYCFGenKbSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTSecGrpIncTableObj().createTSecGrpInc( getOrigAsTSecGrpInc() );
		if( retobj == getOrigAsTSecGrpInc() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbTSecGrpIncEditObj update() {
		getSchema().getTSecGrpIncTableObj().updateTSecGrpInc( (IYCFGenKbTSecGrpIncObj)this );
		return( null );
	}

	public YCFGenKbTSecGrpIncEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTSecGrpIncTableObj().deleteTSecGrpInc( getOrigAsTSecGrpInc() );
		return( null );
	}

	public IYCFGenKbTSecGrpIncTableObj getTSecGrpIncTable() {
		return( orig.getSchema().getTSecGrpIncTableObj() );
	}

	public IYCFGenKbTSecGrpIncEditObj getEdit() {
		return( (IYCFGenKbTSecGrpIncEditObj)this );
	}

	public IYCFGenKbTSecGrpIncEditObj getEditAsTSecGrpInc() {
		return( (IYCFGenKbTSecGrpIncEditObj)this );
	}

	public IYCFGenKbTSecGrpIncEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbTSecGrpIncObj getOrig() {
		return( orig );
	}

	public IYCFGenKbTSecGrpIncObj getOrigAsTSecGrpInc() {
		return( (IYCFGenKbTSecGrpIncObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbTSecGrpIncBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsTSecGrpInc().getSchema().getBackingStore()).getFactoryTSecGrpInc().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbTSecGrpIncBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerGroup = null;
			requiredParentSubGroup = null;
		}
	}

	public YCFGenKbTSecGrpIncBuff getTSecGrpIncBuff() {
		return( (YCFGenKbTSecGrpIncBuff)getBuff() );
	}

	public YCFGenKbTSecGrpIncPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbTSecGrpIncPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredTSecGrpIncId() {
		return( getPKey().getRequiredTSecGrpIncId() );
	}

	public int getRequiredTSecGroupId() {
		return( getTSecGrpIncBuff().getRequiredTSecGroupId() );
	}

	public int getRequiredIncludeGroupId() {
		return( getTSecGrpIncBuff().getRequiredIncludeGroupId() );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTenantObj obj = ((IYCFGenKbSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFGenKbTenantObj value ) {
			if( buff == null ) {
				getTSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTSecGrpIncBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFGenKbTSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFGenKbTSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( forceRead || ( requiredContainerGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTSecGroupObj obj = ((IYCFGenKbSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTSecGroupTableObj().readTSecGroupByIdIdx( getPKey().getRequiredTenantId(),
					getTSecGrpIncBuff().getRequiredTSecGroupId() );
				requiredContainerGroup = obj;
				if( obj != null ) {
					getTSecGrpIncBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTSecGrpIncBuff().setRequiredTSecGroupId( obj.getRequiredTSecGroupId() );
					requiredContainerGroup = obj;
				}
			}
		}
		return( requiredContainerGroup );
	}

	public void setRequiredContainerGroup( IYCFGenKbTSecGroupObj value ) {
			if( buff == null ) {
				getTSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredTSecGroupId( value.getRequiredTSecGroupId() );
			}
			requiredContainerGroup = value;
	}

	public IYCFGenKbTSecGroupObj getRequiredParentSubGroup() {
		return( getRequiredParentSubGroup( false ) );
	}

	public IYCFGenKbTSecGroupObj getRequiredParentSubGroup( boolean forceRead ) {
		if( forceRead || ( requiredParentSubGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTSecGroupObj obj = ((IYCFGenKbSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTSecGroupTableObj().readTSecGroupByIdIdx( getPKey().getRequiredTenantId(),
					getTSecGrpIncBuff().getRequiredIncludeGroupId() );
				requiredParentSubGroup = obj;
			}
		}
		return( requiredParentSubGroup );
	}

	public void setRequiredParentSubGroup( IYCFGenKbTSecGroupObj value ) {
			if( buff == null ) {
				getTSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredIncludeGroupId( value.getRequiredTSecGroupId() );
			}
			else {
			}
			requiredParentSubGroup = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredTSecGrpIncId( getPKey().getRequiredTSecGrpIncId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredTSecGrpIncId( buff.getRequiredTSecGrpIncId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbTSecGrpIncBuff origBuff = getOrigAsTSecGrpInc().getTSecGrpIncBuff();
		YCFGenKbTSecGrpIncBuff myBuff = getTSecGrpIncBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbTSecGrpIncBuff origBuff = getOrigAsTSecGrpInc().getTSecGrpIncBuff();
		YCFGenKbTSecGrpIncBuff myBuff = getTSecGrpIncBuff();
		myBuff.set( origBuff );
	}
}

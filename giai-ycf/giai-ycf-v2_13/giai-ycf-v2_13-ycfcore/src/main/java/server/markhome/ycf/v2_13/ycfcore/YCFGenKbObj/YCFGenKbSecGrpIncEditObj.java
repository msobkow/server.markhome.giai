// Description: Java 11 edit object instance implementation for YCFGenKb SecGrpInc.

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

public class YCFGenKbSecGrpIncEditObj
	implements IYCFGenKbSecGrpIncEditObj
{
	protected IYCFGenKbSecGrpIncObj orig;
	protected YCFGenKbSecGrpIncBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredOwnerCluster;
	protected IYCFGenKbSecGroupObj requiredContainerGroup;
	protected IYCFGenKbSecGroupObj requiredParentSubGroup;

	public YCFGenKbSecGrpIncEditObj( IYCFGenKbSecGrpIncObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecGrpIncBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecGrpIncBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecGrpIncBuff buff = getBuff();
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
		return( YCFGenKbSecGrpIncObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGrpInc" );
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
		long val = getRequiredSecGrpIncId();
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

	public IYCFGenKbSecGrpIncObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecGrpIncObj retobj = getSchema().getSecGrpIncTableObj().realiseSecGrpInc( (IYCFGenKbSecGrpIncObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGrpInc().forget();
	}

	public IYCFGenKbSecGrpIncObj read() {
		IYCFGenKbSecGrpIncObj retval = getOrigAsSecGrpInc().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGrpIncObj read( boolean forceRead ) {
		IYCFGenKbSecGrpIncObj retval = getOrigAsSecGrpInc().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGrpIncObj create() {
		copyBuffToOrig();
		IYCFGenKbSecGrpIncObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpInc().getSchema()).getSecGrpIncTableObj().createSecGrpInc( getOrigAsSecGrpInc() );
		if( retobj == getOrigAsSecGrpInc() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecGrpIncEditObj update() {
		getSchema().getSecGrpIncTableObj().updateSecGrpInc( (IYCFGenKbSecGrpIncObj)this );
		return( null );
	}

	public YCFGenKbSecGrpIncEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGrpIncTableObj().deleteSecGrpInc( getOrigAsSecGrpInc() );
		return( null );
	}

	public IYCFGenKbSecGrpIncTableObj getSecGrpIncTable() {
		return( orig.getSchema().getSecGrpIncTableObj() );
	}

	public IYCFGenKbSecGrpIncEditObj getEdit() {
		return( (IYCFGenKbSecGrpIncEditObj)this );
	}

	public IYCFGenKbSecGrpIncEditObj getEditAsSecGrpInc() {
		return( (IYCFGenKbSecGrpIncEditObj)this );
	}

	public IYCFGenKbSecGrpIncEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecGrpIncObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecGrpIncObj getOrigAsSecGrpInc() {
		return( (IYCFGenKbSecGrpIncObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecGrpIncBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecGrpInc().getSchema().getBackingStore()).getFactorySecGrpInc().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecGrpIncBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerGroup = null;
			requiredParentSubGroup = null;
		}
	}

	public YCFGenKbSecGrpIncBuff getSecGrpIncBuff() {
		return( (YCFGenKbSecGrpIncBuff)getBuff() );
	}

	public YCFGenKbSecGrpIncPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecGrpIncPKey value ) {
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

	public long getRequiredSecGrpIncId() {
		return( getPKey().getRequiredSecGrpIncId() );
	}

	public int getRequiredSecGroupId() {
		return( getSecGrpIncBuff().getRequiredSecGroupId() );
	}

	public int getRequiredIncludeGroupId() {
		return( getSecGrpIncBuff().getRequiredIncludeGroupId() );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpInc().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGrpIncBuff().setRequiredClusterId( value.getRequiredId() );
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
				IYCFGenKbSecGroupObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpInc().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredSecGroupId() );
				requiredContainerGroup = obj;
				if( obj != null ) {
					getSecGrpIncBuff().setRequiredClusterId( obj.getRequiredClusterId() );
					getSecGrpIncBuff().setRequiredSecGroupId( obj.getRequiredSecGroupId() );
					requiredContainerGroup = obj;
				}
			}
		}
		return( requiredContainerGroup );
	}

	public void setRequiredContainerGroup( IYCFGenKbSecGroupObj value ) {
			if( buff == null ) {
				getSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredSecGroupId( value.getRequiredSecGroupId() );
			}
			requiredContainerGroup = value;
	}

	public IYCFGenKbSecGroupObj getRequiredParentSubGroup() {
		return( getRequiredParentSubGroup( false ) );
	}

	public IYCFGenKbSecGroupObj getRequiredParentSubGroup( boolean forceRead ) {
		if( forceRead || ( requiredParentSubGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbSecGroupObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGrpInc().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredIncludeGroupId() );
				requiredParentSubGroup = obj;
			}
		}
		return( requiredParentSubGroup );
	}

	public void setRequiredParentSubGroup( IYCFGenKbSecGroupObj value ) {
			if( buff == null ) {
				getSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredIncludeGroupId( value.getRequiredSecGroupId() );
			}
			else {
			}
			requiredParentSubGroup = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecGrpIncId( getPKey().getRequiredSecGrpIncId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGrpIncId( buff.getRequiredSecGrpIncId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbSecGrpIncBuff origBuff = getOrigAsSecGrpInc().getSecGrpIncBuff();
		YCFGenKbSecGrpIncBuff myBuff = getSecGrpIncBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecGrpIncBuff origBuff = getOrigAsSecGrpInc().getSecGrpIncBuff();
		YCFGenKbSecGrpIncBuff myBuff = getSecGrpIncBuff();
		myBuff.set( origBuff );
	}
}

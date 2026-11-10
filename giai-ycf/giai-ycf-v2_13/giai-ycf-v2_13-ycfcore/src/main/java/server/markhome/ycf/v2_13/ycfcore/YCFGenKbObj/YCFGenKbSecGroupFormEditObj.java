// Description: Java 11 edit object instance implementation for YCFGenKb SecGroupForm.

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

public class YCFGenKbSecGroupFormEditObj
	implements IYCFGenKbSecGroupFormEditObj
{
	protected IYCFGenKbSecGroupFormObj orig;
	protected YCFGenKbSecGroupFormBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredOwnerCluster;
	protected IYCFGenKbSecGroupObj requiredContainerGroup;
	protected IYCFGenKbSecAppObj requiredParentApp;
	protected IYCFGenKbSecFormObj requiredParentForm;

	public YCFGenKbSecGroupFormEditObj( IYCFGenKbSecGroupFormObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSecGroupFormBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentApp = null;
		requiredParentForm = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbSecGroupFormBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbSecGroupFormBuff buff = getBuff();
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
		return( YCFGenKbSecGroupFormObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGroupForm" );
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
		long val = getRequiredSecGroupFormId();
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

	public IYCFGenKbSecGroupFormObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSecGroupFormObj retobj = getSchema().getSecGroupFormTableObj().realiseSecGroupForm( (IYCFGenKbSecGroupFormObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGroupForm().forget();
	}

	public IYCFGenKbSecGroupFormObj read() {
		IYCFGenKbSecGroupFormObj retval = getOrigAsSecGroupForm().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGroupFormObj read( boolean forceRead ) {
		IYCFGenKbSecGroupFormObj retval = getOrigAsSecGroupForm().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSecGroupFormObj create() {
		copyBuffToOrig();
		IYCFGenKbSecGroupFormObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecGroupFormTableObj().createSecGroupForm( getOrigAsSecGroupForm() );
		if( retobj == getOrigAsSecGroupForm() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSecGroupFormEditObj update() {
		getSchema().getSecGroupFormTableObj().updateSecGroupForm( (IYCFGenKbSecGroupFormObj)this );
		return( null );
	}

	public YCFGenKbSecGroupFormEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGroupFormTableObj().deleteSecGroupForm( getOrigAsSecGroupForm() );
		return( null );
	}

	public IYCFGenKbSecGroupFormTableObj getSecGroupFormTable() {
		return( orig.getSchema().getSecGroupFormTableObj() );
	}

	public IYCFGenKbSecGroupFormEditObj getEdit() {
		return( (IYCFGenKbSecGroupFormEditObj)this );
	}

	public IYCFGenKbSecGroupFormEditObj getEditAsSecGroupForm() {
		return( (IYCFGenKbSecGroupFormEditObj)this );
	}

	public IYCFGenKbSecGroupFormEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSecGroupFormObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSecGroupFormObj getOrigAsSecGroupForm() {
		return( (IYCFGenKbSecGroupFormObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSecGroupFormBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSecGroupForm().getSchema().getBackingStore()).getFactorySecGroupForm().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecGroupFormBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerGroup = null;
			requiredParentApp = null;
			requiredParentForm = null;
		}
	}

	public YCFGenKbSecGroupFormBuff getSecGroupFormBuff() {
		return( (YCFGenKbSecGroupFormBuff)getBuff() );
	}

	public YCFGenKbSecGroupFormPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSecGroupFormPKey value ) {
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

	public long getRequiredSecGroupFormId() {
		return( getPKey().getRequiredSecGroupFormId() );
	}

	public int getRequiredSecGroupId() {
		return( getSecGroupFormBuff().getRequiredSecGroupId() );
	}

	public int getRequiredSecAppId() {
		return( getSecGroupFormBuff().getRequiredSecAppId() );
	}

	public int getRequiredSecFormId() {
		return( getSecGroupFormBuff().getRequiredSecFormId() );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGroupForm().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getSecGroupFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGroupFormBuff().setRequiredClusterId( value.getRequiredId() );
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
				IYCFGenKbSecGroupObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecGroupId() );
				requiredContainerGroup = obj;
				if( obj != null ) {
					getSecGroupFormBuff().setRequiredClusterId( obj.getRequiredClusterId() );
					getSecGroupFormBuff().setRequiredSecGroupId( obj.getRequiredSecGroupId() );
					requiredContainerGroup = obj;
				}
			}
		}
		return( requiredContainerGroup );
	}

	public void setRequiredContainerGroup( IYCFGenKbSecGroupObj value ) {
			if( buff == null ) {
				getSecGroupFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGroupFormBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGroupFormBuff().setRequiredSecGroupId( value.getRequiredSecGroupId() );
			}
			requiredContainerGroup = value;
	}

	public IYCFGenKbSecAppObj getRequiredParentApp() {
		return( getRequiredParentApp( false ) );
	}

	public IYCFGenKbSecAppObj getRequiredParentApp( boolean forceRead ) {
		if( forceRead || ( requiredParentApp == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbSecAppObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecAppId() );
				requiredParentApp = obj;
			}
		}
		return( requiredParentApp );
	}

	public void setRequiredParentApp( IYCFGenKbSecAppObj value ) {
			if( buff == null ) {
				getSecGroupFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGroupFormBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGroupFormBuff().setRequiredSecAppId( value.getRequiredSecAppId() );
			}
			else {
			}
			requiredParentApp = value;
	}

	public IYCFGenKbSecFormObj getRequiredParentForm() {
		return( getRequiredParentForm( false ) );
	}

	public IYCFGenKbSecFormObj getRequiredParentForm( boolean forceRead ) {
		if( forceRead || ( requiredParentForm == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbSecFormObj obj = ((IYCFGenKbSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecFormTableObj().readSecFormByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecFormId() );
				requiredParentForm = obj;
			}
		}
		return( requiredParentForm );
	}

	public void setRequiredParentForm( IYCFGenKbSecFormObj value ) {
			if( buff == null ) {
				getSecGroupFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGroupFormBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGroupFormBuff().setRequiredSecFormId( value.getRequiredSecFormId() );
			}
			else {
			}
			requiredParentForm = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecGroupFormId( getPKey().getRequiredSecGroupFormId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGroupFormId( buff.getRequiredSecGroupFormId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbSecGroupFormBuff origBuff = getOrigAsSecGroupForm().getSecGroupFormBuff();
		YCFGenKbSecGroupFormBuff myBuff = getSecGroupFormBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSecGroupFormBuff origBuff = getOrigAsSecGroupForm().getSecGroupFormBuff();
		YCFGenKbSecGroupFormBuff myBuff = getSecGroupFormBuff();
		myBuff.set( origBuff );
	}
}

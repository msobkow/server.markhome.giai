// Description: Java 11 edit object instance implementation for YCFInt SecGroupForm.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntSecGroupFormEditObj
	implements IYCFIntSecGroupFormEditObj
{
	protected IYCFSecSecGroupFormObj orig;
	protected YCFSecSecGroupFormBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecGroupObj requiredContainerGroup;
	protected IYCFSecSecAppObj requiredParentApp;
	protected IYCFSecSecFormObj requiredParentForm;

	public YCFIntSecGroupFormEditObj( IYCFSecSecGroupFormObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecGroupFormBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentApp = null;
		requiredParentForm = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecGroupFormBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecGroupFormBuff buff = getBuff();
			updatedBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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
		return( YCFIntSecGroupFormObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGroupForm" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecSecGroupObj scope = getRequiredContainerGroup();
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
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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

	public IYCFSecSecGroupFormObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecGroupFormObj retobj = getSchema().getSecGroupFormTableObj().realiseSecGroupForm( (IYCFIntSecGroupFormObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGroupForm().forget();
	}

	public IYCFSecSecGroupFormObj read() {
		IYCFSecSecGroupFormObj retval = getOrigAsSecGroupForm().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGroupFormObj read( boolean forceRead ) {
		IYCFSecSecGroupFormObj retval = getOrigAsSecGroupForm().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGroupFormObj create() {
		copyBuffToOrig();
		IYCFSecSecGroupFormObj retobj = ((IYCFIntSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecGroupFormTableObj().createSecGroupForm( getOrigAsSecGroupForm() );
		if( retobj == getOrigAsSecGroupForm() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecGroupFormEditObj update() {
		getSchema().getSecGroupFormTableObj().updateSecGroupForm( (IYCFSecSecGroupFormObj)this );
		return( null );
	}

	public YCFSecSecGroupFormEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGroupFormTableObj().deleteSecGroupForm( getOrigAsSecGroupForm() );
		return( null );
	}

	public IYCFSecSecGroupFormTableObj getSecGroupFormTable() {
		return( orig.getSchema().getSecGroupFormTableObj() );
	}

	public IYCFSecSecGroupFormEditObj getEdit() {
		return( (IYCFSecSecGroupFormEditObj)this );
	}

	public IYCFSecSecGroupFormEditObj getEditAsSecGroupForm() {
		return( (IYCFSecSecGroupFormEditObj)this );
	}

	public IYCFSecSecGroupFormEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecGroupFormObj getOrig() {
		return( orig );
	}

	public IYCFSecSecGroupFormObj getOrigAsSecGroupForm() {
		return( (IYCFSecSecGroupFormObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecGroupFormBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsSecGroupForm().getSchema().getBackingStore()).getFactorySecGroupForm().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGroupFormBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerGroup = null;
			requiredParentApp = null;
			requiredParentForm = null;
		}
	}

	public YCFSecSecGroupFormBuff getSecGroupFormBuff() {
		return( (YCFSecSecGroupFormBuff)getBuff() );
	}

	public YCFSecSecGroupFormPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecGroupFormPKey value ) {
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

	public IYCFSecClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFIntSchemaObj)getOrigAsSecGroupForm().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getSecGroupFormBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGroupFormBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredOwnerCluster = value;
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( forceRead || ( requiredContainerGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecGroupObj obj = ((IYCFIntSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
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

	public void setRequiredContainerGroup( IYCFSecSecGroupObj value ) {
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

	public IYCFSecSecAppObj getRequiredParentApp() {
		return( getRequiredParentApp( false ) );
	}

	public IYCFSecSecAppObj getRequiredParentApp( boolean forceRead ) {
		if( forceRead || ( requiredParentApp == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecAppObj obj = ((IYCFIntSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecAppId() );
				requiredParentApp = obj;
			}
		}
		return( requiredParentApp );
	}

	public void setRequiredParentApp( IYCFSecSecAppObj value ) {
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

	public IYCFSecSecFormObj getRequiredParentForm() {
		return( getRequiredParentForm( false ) );
	}

	public IYCFSecSecFormObj getRequiredParentForm( boolean forceRead ) {
		if( forceRead || ( requiredParentForm == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecFormObj obj = ((IYCFIntSchemaObj)getOrigAsSecGroupForm().getSchema()).getSecFormTableObj().readSecFormByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecFormId() );
				requiredParentForm = obj;
			}
		}
		return( requiredParentForm );
	}

	public void setRequiredParentForm( IYCFSecSecFormObj value ) {
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
		YCFSecSecGroupFormBuff origBuff = getOrigAsSecGroupForm().getSecGroupFormBuff();
		YCFSecSecGroupFormBuff myBuff = getSecGroupFormBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecGroupFormBuff origBuff = getOrigAsSecGroupForm().getSecGroupFormBuff();
		YCFSecSecGroupFormBuff myBuff = getSecGroupFormBuff();
		myBuff.set( origBuff );
	}
}

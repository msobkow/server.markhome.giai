// Description: Java 11 base object instance implementation for YCFBam SecGroupForm.

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamSecGroupFormObj
	implements IYCFBamSecGroupFormObj
{
	public final static String CLASS_CODE = "a00d";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecGroupFormEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecGroupFormPKey pKey;
	protected YCFSecSecGroupFormBuff buff;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecGroupObj requiredContainerGroup;
	protected IYCFSecSecAppObj requiredParentApp;
	protected IYCFSecSecFormObj requiredParentForm;

	public YCFBamSecGroupFormObj() {
		isNew = true;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentApp = null;
		requiredParentForm = null;
	}

	public YCFBamSecGroupFormObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentApp = null;
		requiredParentForm = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
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
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
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
		IYCFSecSecGroupFormObj retobj = ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().realiseSecGroupForm(
			(IYCFSecSecGroupFormObj)this );
		return( (IYCFSecSecGroupFormObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().reallyDeepDisposeSecGroupForm( (IYCFSecSecGroupFormObj)this );
	}

	public IYCFSecSecGroupFormObj read() {
		IYCFSecSecGroupFormObj retobj = ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().readSecGroupFormByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGroupFormId(), false );
		return( (IYCFSecSecGroupFormObj)retobj );
	}

	public IYCFSecSecGroupFormObj read( boolean forceRead ) {
		IYCFSecSecGroupFormObj retobj = ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().readSecGroupFormByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGroupFormId(), forceRead );
		return( (IYCFSecSecGroupFormObj)retobj );
	}

	public IYCFSecSecGroupFormTableObj getSecGroupFormTable() {
		return( ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecGroupFormBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecGroupForm().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecGroupFormId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGroupFormBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecGroupFormBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecGroupFormBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentApp = null;
		requiredParentForm = null;
	}

	public YCFSecSecGroupFormBuff getSecGroupFormBuff() {
		return( (YCFSecSecGroupFormBuff)getBuff() );
	}

	public YCFSecSecGroupFormPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecGroupFormPKey value ) {
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

	public IYCFSecSecGroupFormEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecGroupFormObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecGroupFormObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().lockSecGroupForm( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecGroupFormEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecGroupFormEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecGroupFormEditObj getEditAsSecGroupForm() {
		return( (IYCFSecSecGroupFormEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecGroupFormBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecGroupFormBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
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
		if( ( requiredOwnerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerCluster = ((IYCFBamSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredOwnerCluster );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( ( requiredContainerGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerGroup = ((IYCFBamSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecGroupId(), forceRead );
			}
		}
		return( requiredContainerGroup );
	}

	public IYCFSecSecAppObj getRequiredParentApp() {
		return( getRequiredParentApp( false ) );
	}

	public IYCFSecSecAppObj getRequiredParentApp( boolean forceRead ) {
		if( ( requiredParentApp == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentApp = ((IYCFBamSchemaObj)schema).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecAppId(), forceRead );
			}
		}
		return( requiredParentApp );
	}

	public IYCFSecSecFormObj getRequiredParentForm() {
		return( getRequiredParentForm( false ) );
	}

	public IYCFSecSecFormObj getRequiredParentForm( boolean forceRead ) {
		if( ( requiredParentForm == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentForm = ((IYCFBamSchemaObj)schema).getSecFormTableObj().readSecFormByIdIdx( getPKey().getRequiredClusterId(),
					getSecGroupFormBuff().getRequiredSecFormId(), forceRead );
			}
		}
		return( requiredParentForm );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecGroupFormId( getPKey().getRequiredSecGroupFormId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGroupFormId( buff.getRequiredSecGroupFormId() );
	}
}

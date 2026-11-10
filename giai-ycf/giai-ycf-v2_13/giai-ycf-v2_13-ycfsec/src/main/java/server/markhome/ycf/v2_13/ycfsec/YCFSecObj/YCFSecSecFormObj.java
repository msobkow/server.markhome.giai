// Description: Java 11 base object instance implementation for YCFSec SecForm.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFSecSecFormObj
	implements IYCFSecSecFormObj
{
	public final static String CLASS_CODE = "a00b";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecFormEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecFormPKey pKey;
	protected YCFSecSecFormBuff buff;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecAppObj requiredContainerApplication;

	public YCFSecSecFormObj() {
		isNew = true;
		requiredOwnerCluster = null;
		requiredContainerApplication = null;
	}

	public YCFSecSecFormObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerCluster = null;
		requiredContainerApplication = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecForm" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecSecAppObj scope = getRequiredContainerApplication();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecSecAppObj scope = getRequiredContainerApplication();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredJEEServletMapName();
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFSecClusterObj ) {
					break;
				}
				else if( container instanceof IYCFSecTenantObj ) {
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
				if( container instanceof IYCFSecClusterObj ) {
					break;
				}
				else if( container instanceof IYCFSecTenantObj ) {
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

	public IYCFSecSecFormObj realise() {
		IYCFSecSecFormObj retobj = ((IYCFSecSchemaObj)schema).getSecFormTableObj().realiseSecForm(
			(IYCFSecSecFormObj)this );
		return( (IYCFSecSecFormObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getSecFormTableObj().reallyDeepDisposeSecForm( (IYCFSecSecFormObj)this );
	}

	public IYCFSecSecFormObj read() {
		IYCFSecSecFormObj retobj = ((IYCFSecSchemaObj)schema).getSecFormTableObj().readSecFormByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecFormId(), false );
		return( (IYCFSecSecFormObj)retobj );
	}

	public IYCFSecSecFormObj read( boolean forceRead ) {
		IYCFSecSecFormObj retobj = ((IYCFSecSchemaObj)schema).getSecFormTableObj().readSecFormByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecFormId(), forceRead );
		return( (IYCFSecSecFormObj)retobj );
	}

	public IYCFSecSecFormTableObj getSecFormTable() {
		return( ((IYCFSecSchemaObj)schema).getSecFormTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecFormBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecForm().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecForm().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecFormId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecFormBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecFormBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecFormBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerCluster = null;
		requiredContainerApplication = null;
	}

	public YCFSecSecFormBuff getSecFormBuff() {
		return( (YCFSecSecFormBuff)getBuff() );
	}

	public YCFSecSecFormPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecFormPKey value ) {
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

	public IYCFSecSecFormEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecFormObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecFormObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getSecFormTableObj().lockSecForm( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getSecFormTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecFormEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecFormEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecFormEditObj getEditAsSecForm() {
		return( (IYCFSecSecFormEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecFormBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecFormBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredClusterId() {
		return( getPKey().getRequiredClusterId() );
	}

	public int getRequiredSecFormId() {
		return( getPKey().getRequiredSecFormId() );
	}

	public int getRequiredSecAppId() {
		return( getSecFormBuff().getRequiredSecAppId() );
	}

	public String getRequiredJEEServletMapName() {
		return( getSecFormBuff().getRequiredJEEServletMapName() );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( ( requiredOwnerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerCluster = ((IYCFSecSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredOwnerCluster );
	}

	public IYCFSecSecAppObj getRequiredContainerApplication() {
		return( getRequiredContainerApplication( false ) );
	}

	public IYCFSecSecAppObj getRequiredContainerApplication( boolean forceRead ) {
		if( ( requiredContainerApplication == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerApplication = ((IYCFSecSchemaObj)schema).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
					getSecFormBuff().getRequiredSecAppId(), forceRead );
			}
		}
		return( requiredContainerApplication );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecFormId( getPKey().getRequiredSecFormId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecFormId( buff.getRequiredSecFormId() );
	}
}

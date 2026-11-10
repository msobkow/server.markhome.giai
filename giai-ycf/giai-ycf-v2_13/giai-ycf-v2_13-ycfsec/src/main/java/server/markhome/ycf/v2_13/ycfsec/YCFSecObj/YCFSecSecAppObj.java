// Description: Java 11 base object instance implementation for YCFSec SecApp.

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

public class YCFSecSecAppObj
	implements IYCFSecSecAppObj
{
	public final static String CLASS_CODE = "a009";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecAppEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecAppPKey pKey;
	protected YCFSecSecAppBuff buff;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFSecSecAppObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public YCFSecSecAppObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecApp" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredJEEMountName();
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
		if( subObj == null ) {
			subObj = ((IYCFSecSchemaObj)getSchema()).getSecFormTableObj().readSecFormByUJEEServletIdx( getRequiredClusterId(),
				getRequiredSecAppId(),
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

	public IYCFSecSecAppObj realise() {
		IYCFSecSecAppObj retobj = ((IYCFSecSchemaObj)schema).getSecAppTableObj().realiseSecApp(
			(IYCFSecSecAppObj)this );
		return( (IYCFSecSecAppObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getSecAppTableObj().reallyDeepDisposeSecApp( (IYCFSecSecAppObj)this );
	}

	public IYCFSecSecAppObj read() {
		IYCFSecSecAppObj retobj = ((IYCFSecSchemaObj)schema).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecAppId(), false );
		return( (IYCFSecSecAppObj)retobj );
	}

	public IYCFSecSecAppObj read( boolean forceRead ) {
		IYCFSecSecAppObj retobj = ((IYCFSecSchemaObj)schema).getSecAppTableObj().readSecAppByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecAppId(), forceRead );
		return( (IYCFSecSecAppObj)retobj );
	}

	public IYCFSecSecAppTableObj getSecAppTable() {
		return( ((IYCFSecSchemaObj)schema).getSecAppTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecAppBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecApp().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecApp().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecAppId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecAppBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecAppBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecAppBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public YCFSecSecAppBuff getSecAppBuff() {
		return( (YCFSecSecAppBuff)getBuff() );
	}

	public YCFSecSecAppPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecApp().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecAppPKey value ) {
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

	public IYCFSecSecAppEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecAppObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecAppObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getSecAppTableObj().lockSecApp( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getSecAppTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecAppEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecAppEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecAppEditObj getEditAsSecApp() {
		return( (IYCFSecSecAppEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecAppBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecAppBuff buff = getBuff();
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

	public int getRequiredSecAppId() {
		return( getPKey().getRequiredSecAppId() );
	}

	public String getRequiredJEEMountName() {
		return( getSecAppBuff().getRequiredJEEMountName() );
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((IYCFSecSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public List<IYCFSecSecFormObj> getOptionalComponentsForm() {
		List<IYCFSecSecFormObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecFormTableObj().readSecFormBySecAppIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecAppId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecFormObj> getOptionalComponentsForm( boolean forceRead ) {
		List<IYCFSecSecFormObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getSecFormTableObj().readSecFormBySecAppIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecAppId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecAppId( getPKey().getRequiredSecAppId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecAppId( buff.getRequiredSecAppId() );
	}
}

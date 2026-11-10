// Description: Java 11 base object instance implementation for YCFSec Tenant.

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

public class YCFSecTenantObj
	implements IYCFSecTenantObj
{
	public final static String CLASS_CODE = "a015";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecTenantEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecTenantPKey pKey;
	protected YCFSecTenantBuff buff;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFSecTenantObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public YCFSecTenantObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Tenant" );
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
		objName = getRequiredTenantName();
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
			subObj = ((IYCFSecSchemaObj)getSchema()).getTSecGroupTableObj().readTSecGroupByUNameIdx( getRequiredId(),
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

	public IYCFSecTenantObj realise() {
		IYCFSecTenantObj retobj = ((IYCFSecSchemaObj)schema).getTenantTableObj().realiseTenant(
			(IYCFSecTenantObj)this );
		return( (IYCFSecTenantObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getTenantTableObj().reallyDeepDisposeTenant( (IYCFSecTenantObj)this );
	}

	public IYCFSecTenantObj read() {
		IYCFSecTenantObj retobj = ((IYCFSecSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredId(), false );
		return( (IYCFSecTenantObj)retobj );
	}

	public IYCFSecTenantObj read( boolean forceRead ) {
		IYCFSecTenantObj retobj = ((IYCFSecSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (IYCFSecTenantObj)retobj );
	}

	public IYCFSecTenantTableObj getTenantTable() {
		return( ((IYCFSecSchemaObj)schema).getTenantTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecTenantBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTenant().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableTenant().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecTenantBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecTenantBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecTenantBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public YCFSecTenantBuff getTenantBuff() {
		return( (YCFSecTenantBuff)getBuff() );
	}

	public YCFSecTenantPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryTenant().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecTenantPKey value ) {
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

	public IYCFSecTenantEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecTenantObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecTenantObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getTenantTableObj().lockTenant( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getTenantTableObj().newEditInstance( lockobj );
		return( (IYCFSecTenantEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecTenantEditObj getEdit() {
		return( edit );
	}

	public IYCFSecTenantEditObj getEditAsTenant() {
		return( (IYCFSecTenantEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecTenantBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecTenantBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredClusterId() {
		return( getTenantBuff().getRequiredClusterId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredTenantName() {
		return( getTenantBuff().getRequiredTenantName() );
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((IYCFSecSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getTenantBuff().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public List<IYCFSecTSecGroupObj> getOptionalComponentsTSecGroup() {
		List<IYCFSecTSecGroupObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead ) {
		List<IYCFSecTSecGroupObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}

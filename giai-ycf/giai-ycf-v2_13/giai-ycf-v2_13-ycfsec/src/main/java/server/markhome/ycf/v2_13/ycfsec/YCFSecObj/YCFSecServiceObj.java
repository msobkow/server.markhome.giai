// Description: Java 11 base object instance implementation for YCFSec Service.

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

public class YCFSecServiceObj
	implements IYCFSecServiceObj
{
	public final static String CLASS_CODE = "a012";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecServiceEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecServicePKey pKey;
	protected YCFSecServiceBuff buff;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecHostNodeObj optionalContainerHost;
	protected IYCFSecServiceTypeObj optionalParentServiceType;

	public YCFSecServiceObj() {
		isNew = true;
		requiredOwnerCluster = null;
		optionalContainerHost = null;
		optionalParentServiceType = null;
	}

	public YCFSecServiceObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerCluster = null;
		optionalContainerHost = null;
		optionalParentServiceType = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Service" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecHostNodeObj scope = getOptionalContainerHost();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecHostNodeObj scope = getOptionalContainerHost();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredServiceId();
		objName = Long.toString( val );
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

	public IYCFSecServiceObj realise() {
		IYCFSecServiceObj retobj = ((IYCFSecSchemaObj)schema).getServiceTableObj().realiseService(
			(IYCFSecServiceObj)this );
		return( (IYCFSecServiceObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getServiceTableObj().reallyDeepDisposeService( (IYCFSecServiceObj)this );
	}

	public IYCFSecServiceObj read() {
		IYCFSecServiceObj retobj = ((IYCFSecSchemaObj)schema).getServiceTableObj().readServiceByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredServiceId(), false );
		return( (IYCFSecServiceObj)retobj );
	}

	public IYCFSecServiceObj read( boolean forceRead ) {
		IYCFSecServiceObj retobj = ((IYCFSecSchemaObj)schema).getServiceTableObj().readServiceByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredServiceId(), forceRead );
		return( (IYCFSecServiceObj)retobj );
	}

	public IYCFSecServiceTableObj getServiceTable() {
		return( ((IYCFSecSchemaObj)schema).getServiceTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecServiceBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactoryService().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableService().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredServiceId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecServiceBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecServiceBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecServiceBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerCluster = null;
		optionalContainerHost = null;
		optionalParentServiceType = null;
	}

	public YCFSecServiceBuff getServiceBuff() {
		return( (YCFSecServiceBuff)getBuff() );
	}

	public YCFSecServicePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryService().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecServicePKey value ) {
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

	public IYCFSecServiceEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecServiceObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecServiceObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getServiceTableObj().lockService( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getServiceTableObj().newEditInstance( lockobj );
		return( (IYCFSecServiceEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecServiceEditObj getEdit() {
		return( edit );
	}

	public IYCFSecServiceEditObj getEditAsService() {
		return( (IYCFSecServiceEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecServiceBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecServiceBuff buff = getBuff();
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

	public long getRequiredServiceId() {
		return( getPKey().getRequiredServiceId() );
	}

	public long getRequiredHostNodeId() {
		return( getServiceBuff().getRequiredHostNodeId() );
	}

	public int getRequiredServiceTypeId() {
		return( getServiceBuff().getRequiredServiceTypeId() );
	}

	public short getRequiredHostPort() {
		return( getServiceBuff().getRequiredHostPort() );
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

	public IYCFSecHostNodeObj getOptionalContainerHost() {
		return( getOptionalContainerHost( false ) );
	}

	public IYCFSecHostNodeObj getOptionalContainerHost( boolean forceRead ) {
		if( ( optionalContainerHost == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				optionalContainerHost = ((IYCFSecSchemaObj)schema).getHostNodeTableObj().readHostNodeByIdIdx( getPKey().getRequiredClusterId(),
					getServiceBuff().getRequiredHostNodeId(), forceRead );
			}
		}
		return( optionalContainerHost );
	}

	public IYCFSecServiceTypeObj getOptionalParentServiceType() {
		return( getOptionalParentServiceType( false ) );
	}

	public IYCFSecServiceTypeObj getOptionalParentServiceType( boolean forceRead ) {
		if( ( optionalParentServiceType == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				optionalParentServiceType = ((IYCFSecSchemaObj)schema).getServiceTypeTableObj().readServiceTypeByIdIdx( getServiceBuff().getRequiredServiceTypeId(), forceRead );
			}
		}
		return( optionalParentServiceType );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredServiceId( getPKey().getRequiredServiceId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredServiceId( buff.getRequiredServiceId() );
	}
}

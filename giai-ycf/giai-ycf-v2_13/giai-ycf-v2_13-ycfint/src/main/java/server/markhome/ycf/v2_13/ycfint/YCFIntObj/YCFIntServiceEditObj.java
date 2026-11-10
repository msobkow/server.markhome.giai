// Description: Java 11 edit object instance implementation for YCFInt Service.

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

public class YCFIntServiceEditObj
	implements IYCFIntServiceEditObj
{
	protected IYCFSecServiceObj orig;
	protected YCFSecServiceBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecHostNodeObj optionalContainerHost;
	protected IYCFSecServiceTypeObj optionalParentServiceType;

	public YCFIntServiceEditObj( IYCFSecServiceObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecServiceBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		optionalContainerHost = null;
		optionalParentServiceType = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecServiceBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecServiceBuff buff = getBuff();
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
		return( YCFIntServiceObj.CLASS_CODE );
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

	public IYCFSecServiceObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecServiceObj retobj = getSchema().getServiceTableObj().realiseService( (IYCFIntServiceObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsService().forget();
	}

	public IYCFSecServiceObj read() {
		IYCFSecServiceObj retval = getOrigAsService().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecServiceObj read( boolean forceRead ) {
		IYCFSecServiceObj retval = getOrigAsService().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecServiceObj create() {
		copyBuffToOrig();
		IYCFSecServiceObj retobj = ((IYCFIntSchemaObj)getOrigAsService().getSchema()).getServiceTableObj().createService( getOrigAsService() );
		if( retobj == getOrigAsService() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecServiceEditObj update() {
		getSchema().getServiceTableObj().updateService( (IYCFSecServiceObj)this );
		return( null );
	}

	public YCFSecServiceEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getServiceTableObj().deleteService( getOrigAsService() );
		return( null );
	}

	public IYCFSecServiceTableObj getServiceTable() {
		return( orig.getSchema().getServiceTableObj() );
	}

	public IYCFSecServiceEditObj getEdit() {
		return( (IYCFSecServiceEditObj)this );
	}

	public IYCFSecServiceEditObj getEditAsService() {
		return( (IYCFSecServiceEditObj)this );
	}

	public IYCFSecServiceEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecServiceObj getOrig() {
		return( orig );
	}

	public IYCFSecServiceObj getOrigAsService() {
		return( (IYCFSecServiceObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecServiceBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsService().getSchema().getBackingStore()).getFactoryService().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecServiceBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			optionalContainerHost = null;
			optionalParentServiceType = null;
		}
	}

	public YCFSecServiceBuff getServiceBuff() {
		return( (YCFSecServiceBuff)getBuff() );
	}

	public YCFSecServicePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecServicePKey value ) {
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

	public void setRequiredHostPort( short value ) {
		if( getServiceBuff().getRequiredHostPort() != value ) {
			getServiceBuff().setRequiredHostPort( value );
		}
	}

	public IYCFSecClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFIntSchemaObj)getOrigAsService().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getServiceBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getServiceBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredOwnerCluster = value;
	}

	public IYCFSecHostNodeObj getOptionalContainerHost() {
		return( getOptionalContainerHost( false ) );
	}

	public IYCFSecHostNodeObj getOptionalContainerHost( boolean forceRead ) {
		if( forceRead || ( optionalContainerHost == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecHostNodeObj obj = ((IYCFIntSchemaObj)getOrigAsService().getSchema()).getHostNodeTableObj().readHostNodeByIdIdx( getPKey().getRequiredClusterId(),
					getServiceBuff().getRequiredHostNodeId() );
				optionalContainerHost = obj;
				if( obj != null ) {
					getServiceBuff().setRequiredClusterId( obj.getRequiredClusterId() );
					getServiceBuff().setRequiredHostNodeId( obj.getRequiredHostNodeId() );
					optionalContainerHost = obj;
				}
			}
		}
		return( optionalContainerHost );
	}

	public void setOptionalContainerHost( IYCFSecHostNodeObj value ) {
			if( buff == null ) {
				getServiceBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getServiceBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getServiceBuff().setRequiredHostNodeId( value.getRequiredHostNodeId() );
			}
			optionalContainerHost = value;
	}

	public IYCFSecServiceTypeObj getOptionalParentServiceType() {
		return( getOptionalParentServiceType( false ) );
	}

	public IYCFSecServiceTypeObj getOptionalParentServiceType( boolean forceRead ) {
		if( forceRead || ( optionalParentServiceType == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecServiceTypeObj obj = ((IYCFIntSchemaObj)getOrigAsService().getSchema()).getServiceTypeTableObj().readServiceTypeByIdIdx( getServiceBuff().getRequiredServiceTypeId() );
				optionalParentServiceType = obj;
			}
		}
		return( optionalParentServiceType );
	}

	public void setOptionalParentServiceType( IYCFSecServiceTypeObj value ) {
			if( buff == null ) {
				getServiceBuff();
			}
			if( value != null ) {
				getServiceBuff().setRequiredServiceTypeId( value.getRequiredServiceTypeId() );
			}
			else {
			}
			optionalParentServiceType = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredServiceId( getPKey().getRequiredServiceId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredServiceId( buff.getRequiredServiceId() );
	}

	public void copyBuffToOrig() {
		YCFSecServiceBuff origBuff = getOrigAsService().getServiceBuff();
		YCFSecServiceBuff myBuff = getServiceBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecServiceBuff origBuff = getOrigAsService().getServiceBuff();
		YCFSecServiceBuff myBuff = getServiceBuff();
		myBuff.set( origBuff );
	}
}

// Description: Java 11 edit object instance implementation for YCFSec HostNode.

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

public class YCFSecHostNodeEditObj
	implements IYCFSecHostNodeEditObj
{
	protected IYCFSecHostNodeObj orig;
	protected YCFSecHostNodeBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFSecHostNodeEditObj( IYCFSecHostNodeObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecHostNodeBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecHostNodeBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecHostNodeBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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
		return( YCFSecHostNodeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "HostNode" );
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
		objName = getRequiredHostName();
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

	public IYCFSecHostNodeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecHostNodeObj retobj = getSchema().getHostNodeTableObj().realiseHostNode( (IYCFSecHostNodeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsHostNode().forget();
	}

	public IYCFSecHostNodeObj read() {
		IYCFSecHostNodeObj retval = getOrigAsHostNode().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecHostNodeObj read( boolean forceRead ) {
		IYCFSecHostNodeObj retval = getOrigAsHostNode().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecHostNodeObj create() {
		copyBuffToOrig();
		IYCFSecHostNodeObj retobj = ((IYCFSecSchemaObj)getOrigAsHostNode().getSchema()).getHostNodeTableObj().createHostNode( getOrigAsHostNode() );
		if( retobj == getOrigAsHostNode() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecHostNodeEditObj update() {
		getSchema().getHostNodeTableObj().updateHostNode( (IYCFSecHostNodeObj)this );
		return( null );
	}

	public YCFSecHostNodeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getHostNodeTableObj().deleteHostNode( getOrigAsHostNode() );
		return( null );
	}

	public IYCFSecHostNodeTableObj getHostNodeTable() {
		return( orig.getSchema().getHostNodeTableObj() );
	}

	public IYCFSecHostNodeEditObj getEdit() {
		return( (IYCFSecHostNodeEditObj)this );
	}

	public IYCFSecHostNodeEditObj getEditAsHostNode() {
		return( (IYCFSecHostNodeEditObj)this );
	}

	public IYCFSecHostNodeEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecHostNodeObj getOrig() {
		return( orig );
	}

	public IYCFSecHostNodeObj getOrigAsHostNode() {
		return( (IYCFSecHostNodeObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecHostNodeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsHostNode().getSchema().getBackingStore()).getFactoryHostNode().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecHostNodeBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFSecHostNodeBuff getHostNodeBuff() {
		return( (YCFSecHostNodeBuff)getBuff() );
	}

	public YCFSecHostNodePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecHostNodePKey value ) {
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

	public long getRequiredHostNodeId() {
		return( getPKey().getRequiredHostNodeId() );
	}

	public String getRequiredDescription() {
		return( getHostNodeBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getHostNodeBuff().getRequiredDescription() != value ) {
			getHostNodeBuff().setRequiredDescription( value );
		}
	}

	public String getRequiredHostName() {
		return( getHostNodeBuff().getRequiredHostName() );
	}

	public void setRequiredHostName( String value ) {
		if( getHostNodeBuff().getRequiredHostName() != value ) {
			getHostNodeBuff().setRequiredHostName( value );
		}
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFSecSchemaObj)getOrigAsHostNode().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getHostNodeBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getHostNodeBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getHostNodeBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public List<IYCFSecServiceObj> getOptionalComponentsService() {
		List<IYCFSecServiceObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsHostNode().getSchema()).getServiceTableObj().readServiceByHostIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredHostNodeId(),
			false );
		return( retval );
	}

	public List<IYCFSecServiceObj> getOptionalComponentsService( boolean forceRead ) {
		List<IYCFSecServiceObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsHostNode().getSchema()).getServiceTableObj().readServiceByHostIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredHostNodeId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredHostNodeId( getPKey().getRequiredHostNodeId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredHostNodeId( buff.getRequiredHostNodeId() );
	}

	public void copyBuffToOrig() {
		YCFSecHostNodeBuff origBuff = getOrigAsHostNode().getHostNodeBuff();
		YCFSecHostNodeBuff myBuff = getHostNodeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecHostNodeBuff origBuff = getOrigAsHostNode().getHostNodeBuff();
		YCFSecHostNodeBuff myBuff = getHostNodeBuff();
		myBuff.set( origBuff );
	}
}

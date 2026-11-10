// Description: Java 11 edit object instance implementation for YCFInt Cluster.

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

public class YCFIntClusterEditObj
	implements IYCFIntClusterEditObj
{
	protected IYCFSecClusterObj orig;
	protected YCFSecClusterBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFIntClusterEditObj( IYCFSecClusterObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecClusterBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecClusterBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecClusterBuff buff = getBuff();
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
		return( YCFIntClusterObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Cluster" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredFullDomName();
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
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getHostNodeTableObj().readHostNodeByHostNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getTenantTableObj().readTenantByUNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getSecAppTableObj().readSecAppByUJEEMountIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFIntSchemaObj)getSchema()).getSecGroupTableObj().readSecGroupByUNameIdx( getRequiredId(),
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

	public IYCFSecClusterObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecClusterObj retobj = getSchema().getClusterTableObj().realiseCluster( (IYCFIntClusterObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsCluster().forget();
	}

	public IYCFSecClusterObj read() {
		IYCFSecClusterObj retval = getOrigAsCluster().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecClusterObj read( boolean forceRead ) {
		IYCFSecClusterObj retval = getOrigAsCluster().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecClusterObj create() {
		copyBuffToOrig();
		IYCFSecClusterObj retobj = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getClusterTableObj().createCluster( getOrigAsCluster() );
		if( retobj == getOrigAsCluster() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecClusterEditObj update() {
		getSchema().getClusterTableObj().updateCluster( (IYCFSecClusterObj)this );
		return( null );
	}

	public YCFSecClusterEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClusterTableObj().deleteCluster( getOrigAsCluster() );
		return( null );
	}

	public IYCFSecClusterTableObj getClusterTable() {
		return( orig.getSchema().getClusterTableObj() );
	}

	public IYCFSecClusterEditObj getEdit() {
		return( (IYCFSecClusterEditObj)this );
	}

	public IYCFSecClusterEditObj getEditAsCluster() {
		return( (IYCFSecClusterEditObj)this );
	}

	public IYCFSecClusterEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecClusterObj getOrig() {
		return( orig );
	}

	public IYCFSecClusterObj getOrigAsCluster() {
		return( (IYCFSecClusterObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecClusterBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsCluster().getSchema().getBackingStore()).getFactoryCluster().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecClusterBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFSecClusterBuff getClusterBuff() {
		return( (YCFSecClusterBuff)getBuff() );
	}

	public YCFSecClusterPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecClusterPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredFullDomName() {
		return( getClusterBuff().getRequiredFullDomName() );
	}

	public void setRequiredFullDomName( String value ) {
		if( getClusterBuff().getRequiredFullDomName() != value ) {
			getClusterBuff().setRequiredFullDomName( value );
		}
	}

	public String getRequiredDescription() {
		return( getClusterBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getClusterBuff().getRequiredDescription() != value ) {
			getClusterBuff().setRequiredDescription( value );
		}
	}

	public List<IYCFSecHostNodeObj> getOptionalComponentsHostNode() {
		List<IYCFSecHostNodeObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecHostNodeObj> getOptionalComponentsHostNode( boolean forceRead ) {
		List<IYCFSecHostNodeObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getHostNodeTableObj().readHostNodeByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecTenantObj> getOptionalComponentsTenant() {
		List<IYCFSecTenantObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecTenantObj> getOptionalComponentsTenant( boolean forceRead ) {
		List<IYCFSecTenantObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getTenantTableObj().readTenantByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecAppObj> getOptionalComponentsSecApp() {
		List<IYCFSecSecAppObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecAppObj> getOptionalComponentsSecApp( boolean forceRead ) {
		List<IYCFSecSecAppObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getSecAppTableObj().readSecAppByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGroupObj> getOptionalComponentsSecGroup() {
		List<IYCFSecSecGroupObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGroupObj> getOptionalComponentsSecGroup( boolean forceRead ) {
		List<IYCFSecSecGroupObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getSecGroupTableObj().readSecGroupByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSysClusterObj> getOptionalComponentsSysCluster() {
		List<IYCFSecSysClusterObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecSysClusterObj> getOptionalComponentsSysCluster( boolean forceRead ) {
		List<IYCFSecSysClusterObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsCluster().getSchema()).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFSecClusterBuff origBuff = getOrigAsCluster().getClusterBuff();
		YCFSecClusterBuff myBuff = getClusterBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecClusterBuff origBuff = getOrigAsCluster().getClusterBuff();
		YCFSecClusterBuff myBuff = getClusterBuff();
		myBuff.set( origBuff );
	}
}

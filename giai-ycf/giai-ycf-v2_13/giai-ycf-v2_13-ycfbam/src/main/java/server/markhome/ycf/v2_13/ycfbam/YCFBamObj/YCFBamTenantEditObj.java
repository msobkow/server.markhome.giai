// Description: Java 11 edit object instance implementation for YCFBam Tenant.

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

public class YCFBamTenantEditObj
	implements IYCFBamTenantEditObj
{
	protected IYCFSecTenantObj orig;
	protected YCFSecTenantBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFBamTenantEditObj( IYCFSecTenantObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecTenantBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecTenantBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecTenantBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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
		return( YCFBamTenantObj.CLASS_CODE );
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
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTSecGroupTableObj().readTSecGroupByUNameIdx( getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTldTableObj().readTldByNameIdx( getRequiredId(),
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecTenantObj retobj = getSchema().getTenantTableObj().realiseTenant( (IYCFBamTenantObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTenant().forget();
	}

	public IYCFSecTenantObj read() {
		IYCFSecTenantObj retval = getOrigAsTenant().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTenantObj read( boolean forceRead ) {
		IYCFSecTenantObj retval = getOrigAsTenant().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTenantObj create() {
		copyBuffToOrig();
		IYCFSecTenantObj retobj = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getTenantTableObj().createTenant( getOrigAsTenant() );
		if( retobj == getOrigAsTenant() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecTenantEditObj update() {
		getSchema().getTenantTableObj().updateTenant( (IYCFSecTenantObj)this );
		return( null );
	}

	public YCFSecTenantEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTenantTableObj().deleteTenant( getOrigAsTenant() );
		return( null );
	}

	public IYCFSecTenantTableObj getTenantTable() {
		return( orig.getSchema().getTenantTableObj() );
	}

	public IYCFSecTenantEditObj getEdit() {
		return( (IYCFSecTenantEditObj)this );
	}

	public IYCFSecTenantEditObj getEditAsTenant() {
		return( (IYCFSecTenantEditObj)this );
	}

	public IYCFSecTenantEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecTenantObj getOrig() {
		return( orig );
	}

	public IYCFSecTenantObj getOrigAsTenant() {
		return( (IYCFSecTenantObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecTenantBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsTenant().getSchema().getBackingStore()).getFactoryTenant().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecTenantBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFSecTenantBuff getTenantBuff() {
		return( (YCFSecTenantBuff)getBuff() );
	}

	public YCFSecTenantPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecTenantPKey value ) {
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
		return( getTenantBuff().getRequiredClusterId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredTenantName() {
		return( getTenantBuff().getRequiredTenantName() );
	}

	public void setRequiredTenantName( String value ) {
		if( getTenantBuff().getRequiredTenantName() != value ) {
			getTenantBuff().setRequiredTenantName( value );
		}
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getClusterTableObj().readClusterByIdIdx( getTenantBuff().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getTenantBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getTenantBuff();
			}
			if( value != null ) {
				getTenantBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public List<IYCFSecTSecGroupObj> getOptionalComponentsTSecGroup() {
		List<IYCFSecTSecGroupObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFSecTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead ) {
		List<IYCFSecTSecGroupObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getTSecGroupTableObj().readTSecGroupByTenantIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFIntTldObj> getOptionalComponentsTld() {
		List<IYCFIntTldObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getTldTableObj().readTldByTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFIntTldObj> getOptionalComponentsTld( boolean forceRead ) {
		List<IYCFIntTldObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getTldTableObj().readTldByTenantIdx( getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamSchemaDefObj> getOptionalComponentsSchema() {
		List<IYCFBamSchemaDefObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getSchemaDefTableObj().readSchemaDefByCTenantIdx( getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamSchemaDefObj> getOptionalComponentsSchema( boolean forceRead ) {
		List<IYCFBamSchemaDefObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsTenant().getSchema()).getSchemaDefTableObj().readSchemaDefByCTenantIdx( getPKey().getRequiredId(),
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
		YCFSecTenantBuff origBuff = getOrigAsTenant().getTenantBuff();
		YCFSecTenantBuff myBuff = getTenantBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecTenantBuff origBuff = getOrigAsTenant().getTenantBuff();
		YCFSecTenantBuff myBuff = getTenantBuff();
		myBuff.set( origBuff );
	}
}

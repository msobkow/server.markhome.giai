// Description: Java 11 edit object instance implementation for YCFSec TSecGroup.

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

public class YCFSecTSecGroupEditObj
	implements IYCFSecTSecGroupEditObj
{
	protected IYCFSecTSecGroupObj orig;
	protected YCFSecTSecGroupBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredContainerTenant;

	public YCFSecTSecGroupEditObj( IYCFSecTSecGroupObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecTSecGroupBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerTenant = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecTSecGroupBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecTSecGroupBuff buff = getBuff();
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
		return( YCFSecTSecGroupObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TSecGroup" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecTenantObj scope = getRequiredContainerTenant();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecTenantObj scope = getRequiredContainerTenant();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
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

	public IYCFSecTSecGroupObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecTSecGroupObj retobj = getSchema().getTSecGroupTableObj().realiseTSecGroup( (IYCFSecTSecGroupObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTSecGroup().forget();
	}

	public IYCFSecTSecGroupObj read() {
		IYCFSecTSecGroupObj retval = getOrigAsTSecGroup().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTSecGroupObj read( boolean forceRead ) {
		IYCFSecTSecGroupObj retval = getOrigAsTSecGroup().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTSecGroupObj create() {
		copyBuffToOrig();
		IYCFSecTSecGroupObj retobj = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGroupTableObj().createTSecGroup( getOrigAsTSecGroup() );
		if( retobj == getOrigAsTSecGroup() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecTSecGroupEditObj update() {
		getSchema().getTSecGroupTableObj().updateTSecGroup( (IYCFSecTSecGroupObj)this );
		return( null );
	}

	public YCFSecTSecGroupEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTSecGroupTableObj().deleteTSecGroup( getOrigAsTSecGroup() );
		return( null );
	}

	public IYCFSecTSecGroupTableObj getTSecGroupTable() {
		return( orig.getSchema().getTSecGroupTableObj() );
	}

	public IYCFSecTSecGroupEditObj getEdit() {
		return( (IYCFSecTSecGroupEditObj)this );
	}

	public IYCFSecTSecGroupEditObj getEditAsTSecGroup() {
		return( (IYCFSecTSecGroupEditObj)this );
	}

	public IYCFSecTSecGroupEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecTSecGroupObj getOrig() {
		return( orig );
	}

	public IYCFSecTSecGroupObj getOrigAsTSecGroup() {
		return( (IYCFSecTSecGroupObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecTSecGroupBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsTSecGroup().getSchema().getBackingStore()).getFactoryTSecGroup().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecTSecGroupBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerTenant = null;
		}
	}

	public YCFSecTSecGroupBuff getTSecGroupBuff() {
		return( (YCFSecTSecGroupBuff)getBuff() );
	}

	public YCFSecTSecGroupPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecTSecGroupPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public int getRequiredTSecGroupId() {
		return( getPKey().getRequiredTSecGroupId() );
	}

	public String getRequiredName() {
		return( getTSecGroupBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getTSecGroupBuff().getRequiredName() != value ) {
			getTSecGroupBuff().setRequiredName( value );
		}
	}

	public boolean getRequiredIsVisible() {
		return( getTSecGroupBuff().getRequiredIsVisible() );
	}

	public void setRequiredIsVisible( boolean value ) {
		if( getTSecGroupBuff().getRequiredIsVisible() != value ) {
			getTSecGroupBuff().setRequiredIsVisible( value );
		}
	}

	public IYCFSecTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( forceRead || ( requiredContainerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredContainerTenant = obj;
				if( obj != null ) {
					getTSecGroupBuff().setRequiredTenantId( obj.getRequiredId() );
					requiredContainerTenant = obj;
				}
			}
		}
		return( requiredContainerTenant );
	}

	public void setRequiredContainerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getTSecGroupBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTSecGroupBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredContainerTenant = value;
	}

	public List<IYCFSecTSecGrpIncObj> getOptionalComponentsInclude() {
		List<IYCFSecTSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecTSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead ) {
		List<IYCFSecTSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecTSecGrpMembObj> getOptionalComponentsMember() {
		List<IYCFSecTSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecTSecGrpMembObj> getOptionalComponentsMember( boolean forceRead ) {
		List<IYCFSecTSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpMembTableObj().readTSecGrpMembByGroupIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecTSecGrpIncObj> getRequiredChildrenIncByGroup() {
		List<IYCFSecTSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByIncludeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecTSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead ) {
		List<IYCFSecTSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsTSecGroup().getSchema()).getTSecGrpIncTableObj().readTSecGrpIncByIncludeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredTSecGroupId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredTSecGroupId( getPKey().getRequiredTSecGroupId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredTSecGroupId( buff.getRequiredTSecGroupId() );
	}

	public void copyBuffToOrig() {
		YCFSecTSecGroupBuff origBuff = getOrigAsTSecGroup().getTSecGroupBuff();
		YCFSecTSecGroupBuff myBuff = getTSecGroupBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecTSecGroupBuff origBuff = getOrigAsTSecGroup().getTSecGroupBuff();
		YCFSecTSecGroupBuff myBuff = getTSecGroupBuff();
		myBuff.set( origBuff );
	}
}

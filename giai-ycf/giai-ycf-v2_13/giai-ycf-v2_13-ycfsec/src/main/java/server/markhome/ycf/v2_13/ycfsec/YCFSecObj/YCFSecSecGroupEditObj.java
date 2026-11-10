// Description: Java 11 edit object instance implementation for YCFSec SecGroup.

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

public class YCFSecSecGroupEditObj
	implements IYCFSecSecGroupEditObj
{
	protected IYCFSecSecGroupObj orig;
	protected YCFSecSecGroupBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFSecSecGroupEditObj( IYCFSecSecGroupObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecGroupBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecGroupBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecGroupBuff buff = getBuff();
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
		return( YCFSecSecGroupObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGroup" );
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

	public IYCFSecSecGroupObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecGroupObj retobj = getSchema().getSecGroupTableObj().realiseSecGroup( (IYCFSecSecGroupObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGroup().forget();
	}

	public IYCFSecSecGroupObj read() {
		IYCFSecSecGroupObj retval = getOrigAsSecGroup().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGroupObj read( boolean forceRead ) {
		IYCFSecSecGroupObj retval = getOrigAsSecGroup().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGroupObj create() {
		copyBuffToOrig();
		IYCFSecSecGroupObj retobj = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGroupTableObj().createSecGroup( getOrigAsSecGroup() );
		if( retobj == getOrigAsSecGroup() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecGroupEditObj update() {
		getSchema().getSecGroupTableObj().updateSecGroup( (IYCFSecSecGroupObj)this );
		return( null );
	}

	public YCFSecSecGroupEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGroupTableObj().deleteSecGroup( getOrigAsSecGroup() );
		return( null );
	}

	public IYCFSecSecGroupTableObj getSecGroupTable() {
		return( orig.getSchema().getSecGroupTableObj() );
	}

	public IYCFSecSecGroupEditObj getEdit() {
		return( (IYCFSecSecGroupEditObj)this );
	}

	public IYCFSecSecGroupEditObj getEditAsSecGroup() {
		return( (IYCFSecSecGroupEditObj)this );
	}

	public IYCFSecSecGroupEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecGroupObj getOrig() {
		return( orig );
	}

	public IYCFSecSecGroupObj getOrigAsSecGroup() {
		return( (IYCFSecSecGroupObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecGroupBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsSecGroup().getSchema().getBackingStore()).getFactorySecGroup().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGroupBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFSecSecGroupBuff getSecGroupBuff() {
		return( (YCFSecSecGroupBuff)getBuff() );
	}

	public YCFSecSecGroupPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecGroupPKey value ) {
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

	public int getRequiredSecGroupId() {
		return( getPKey().getRequiredSecGroupId() );
	}

	public String getRequiredName() {
		return( getSecGroupBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getSecGroupBuff().getRequiredName() != value ) {
			getSecGroupBuff().setRequiredName( value );
		}
	}

	public boolean getRequiredIsVisible() {
		return( getSecGroupBuff().getRequiredIsVisible() );
	}

	public void setRequiredIsVisible( boolean value ) {
		if( getSecGroupBuff().getRequiredIsVisible() != value ) {
			getSecGroupBuff().setRequiredIsVisible( value );
		}
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getSecGroupBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getSecGroupBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGroupBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public List<IYCFSecSecGrpIncObj> getOptionalComponentsInclude() {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead ) {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalComponentsMember() {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalComponentsMember( boolean forceRead ) {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGrpIncObj> getRequiredChildrenIncByGroup() {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead ) {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGroupFormObj> getOptionalComponentsForm() {
		List<IYCFSecSecGroupFormObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGroupFormObj> getOptionalComponentsForm( boolean forceRead ) {
		List<IYCFSecSecGroupFormObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsSecGroup().getSchema()).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecGroupId( getPKey().getRequiredSecGroupId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGroupId( buff.getRequiredSecGroupId() );
	}

	public void copyBuffToOrig() {
		YCFSecSecGroupBuff origBuff = getOrigAsSecGroup().getSecGroupBuff();
		YCFSecSecGroupBuff myBuff = getSecGroupBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecGroupBuff origBuff = getOrigAsSecGroup().getSecGroupBuff();
		YCFSecSecGroupBuff myBuff = getSecGroupBuff();
		myBuff.set( origBuff );
	}
}

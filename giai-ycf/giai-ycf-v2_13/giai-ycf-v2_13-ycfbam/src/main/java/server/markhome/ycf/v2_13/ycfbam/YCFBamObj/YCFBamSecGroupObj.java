// Description: Java 11 base object instance implementation for YCFBam SecGroup.

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

public class YCFBamSecGroupObj
	implements IYCFBamSecGroupObj
{
	public final static String CLASS_CODE = "a00c";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecGroupEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecGroupPKey pKey;
	protected YCFSecSecGroupBuff buff;
	protected IYCFSecClusterObj requiredContainerCluster;

	public YCFBamSecGroupObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public YCFBamSecGroupObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFSecSecGroupObj retobj = ((IYCFBamSchemaObj)schema).getSecGroupTableObj().realiseSecGroup(
			(IYCFSecSecGroupObj)this );
		return( (IYCFSecSecGroupObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getSecGroupTableObj().reallyDeepDisposeSecGroup( (IYCFSecSecGroupObj)this );
	}

	public IYCFSecSecGroupObj read() {
		IYCFSecSecGroupObj retobj = ((IYCFBamSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGroupId(), false );
		return( (IYCFSecSecGroupObj)retobj );
	}

	public IYCFSecSecGroupObj read( boolean forceRead ) {
		IYCFSecSecGroupObj retobj = ((IYCFBamSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGroupId(), forceRead );
		return( (IYCFSecSecGroupObj)retobj );
	}

	public IYCFSecSecGroupTableObj getSecGroupTable() {
		return( ((IYCFBamSchemaObj)schema).getSecGroupTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecGroupBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecGroup().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecGroupId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGroupBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecGroupBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecGroupBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public YCFSecSecGroupBuff getSecGroupBuff() {
		return( (YCFSecSecGroupBuff)getBuff() );
	}

	public YCFSecSecGroupPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecGroupPKey value ) {
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

	public IYCFSecSecGroupEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecGroupObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecGroupObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getSecGroupTableObj().lockSecGroup( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getSecGroupTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecGroupEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecGroupEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecGroupEditObj getEditAsSecGroup() {
		return( (IYCFSecSecGroupEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecGroupBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecGroupBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
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

	public boolean getRequiredIsVisible() {
		return( getSecGroupBuff().getRequiredIsVisible() );
	}

	public IYCFSecClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((IYCFBamSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public List<IYCFSecSecGrpIncObj> getOptionalComponentsInclude() {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead ) {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalComponentsMember() {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpMembObj> getOptionalComponentsMember( boolean forceRead ) {
		List<IYCFSecSecGrpMembObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGrpMembTableObj().readSecGrpMembByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGrpIncObj> getRequiredChildrenIncByGroup() {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead ) {
		List<IYCFSecSecGrpIncObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIncludeIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecSecGroupFormObj> getOptionalComponentsForm() {
		List<IYCFSecSecGroupFormObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			false );
		return( retval );
	}

	public List<IYCFSecSecGroupFormObj> getOptionalComponentsForm( boolean forceRead ) {
		List<IYCFSecSecGroupFormObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getSecGroupFormTableObj().readSecGroupFormByGroupIdx( getPKey().getRequiredClusterId(),
					getPKey().getRequiredSecGroupId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecGroupId( getPKey().getRequiredSecGroupId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGroupId( buff.getRequiredSecGroupId() );
	}
}

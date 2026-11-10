// Description: Java 11 base object instance implementation for YCFInt SecGrpInc.

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

public class YCFIntSecGrpIncObj
	implements IYCFIntSecGrpIncObj
{
	public final static String CLASS_CODE = "a00e";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecSecGrpIncEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecGrpIncPKey pKey;
	protected YCFSecSecGrpIncBuff buff;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecGroupObj requiredContainerGroup;
	protected IYCFSecSecGroupObj requiredParentSubGroup;

	public YCFIntSecGrpIncObj() {
		isNew = true;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public YCFIntSecGrpIncObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecGrpInc" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredSecGrpIncId();
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

	public IYCFSecSecGrpIncObj realise() {
		IYCFSecSecGrpIncObj retobj = ((IYCFIntSchemaObj)schema).getSecGrpIncTableObj().realiseSecGrpInc(
			(IYCFSecSecGrpIncObj)this );
		return( (IYCFSecSecGrpIncObj)retobj );
	}

	public void forget() {
		((IYCFIntSchemaObj)schema).getSecGrpIncTableObj().reallyDeepDisposeSecGrpInc( (IYCFSecSecGrpIncObj)this );
	}

	public IYCFSecSecGrpIncObj read() {
		IYCFSecSecGrpIncObj retobj = ((IYCFIntSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGrpIncId(), false );
		return( (IYCFSecSecGrpIncObj)retobj );
	}

	public IYCFSecSecGrpIncObj read( boolean forceRead ) {
		IYCFSecSecGrpIncObj retobj = ((IYCFIntSchemaObj)schema).getSecGrpIncTableObj().readSecGrpIncByIdIdx( getPKey().getRequiredClusterId(),
			getPKey().getRequiredSecGrpIncId(), forceRead );
		return( (IYCFSecSecGrpIncObj)retobj );
	}

	public IYCFSecSecGrpIncTableObj getSecGrpIncTable() {
		return( ((IYCFIntSchemaObj)schema).getSecGrpIncTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecGrpIncBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpInc().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecGrpInc().readDerivedByIdIdx( ((IYCFIntSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredClusterId(),
						getPKey().getRequiredSecGrpIncId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGrpIncBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecGrpIncBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecGrpIncBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public YCFSecSecGrpIncBuff getSecGrpIncBuff() {
		return( (YCFSecSecGrpIncBuff)getBuff() );
	}

	public YCFSecSecGrpIncPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecGrpInc().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecGrpIncPKey value ) {
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

	public IYCFSecSecGrpIncEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecGrpIncObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecGrpIncObj)this;
		}
		else {
			lockobj = ((IYCFIntSchemaObj)schema).getSecGrpIncTableObj().lockSecGrpInc( getPKey() );
		}
		edit = ((IYCFIntSchemaObj)schema).getSecGrpIncTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecGrpIncEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecGrpIncEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecGrpIncEditObj getEditAsSecGrpInc() {
		return( (IYCFSecSecGrpIncEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecGrpIncBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecGrpIncBuff buff = getBuff();
			updatedBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredClusterId() {
		return( getPKey().getRequiredClusterId() );
	}

	public long getRequiredSecGrpIncId() {
		return( getPKey().getRequiredSecGrpIncId() );
	}

	public int getRequiredSecGroupId() {
		return( getSecGrpIncBuff().getRequiredSecGroupId() );
	}

	public int getRequiredIncludeGroupId() {
		return( getSecGrpIncBuff().getRequiredIncludeGroupId() );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster() {
		return( getRequiredOwnerCluster( false ) );
	}

	public IYCFSecClusterObj getRequiredOwnerCluster( boolean forceRead ) {
		if( ( requiredOwnerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerCluster = ((IYCFIntSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredOwnerCluster );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( ( requiredContainerGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerGroup = ((IYCFIntSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredSecGroupId(), forceRead );
			}
		}
		return( requiredContainerGroup );
	}

	public IYCFSecSecGroupObj getRequiredParentSubGroup() {
		return( getRequiredParentSubGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredParentSubGroup( boolean forceRead ) {
		if( ( requiredParentSubGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentSubGroup = ((IYCFIntSchemaObj)schema).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredIncludeGroupId(), forceRead );
			}
		}
		return( requiredParentSubGroup );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
			buff.setRequiredSecGrpIncId( getPKey().getRequiredSecGrpIncId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGrpIncId( buff.getRequiredSecGrpIncId() );
	}
}

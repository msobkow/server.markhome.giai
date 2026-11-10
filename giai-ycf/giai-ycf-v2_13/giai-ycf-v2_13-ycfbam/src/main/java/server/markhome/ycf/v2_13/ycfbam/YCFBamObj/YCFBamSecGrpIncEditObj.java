// Description: Java 11 edit object instance implementation for YCFBam SecGrpInc.

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

public class YCFBamSecGrpIncEditObj
	implements IYCFBamSecGrpIncEditObj
{
	protected IYCFSecSecGrpIncObj orig;
	protected YCFSecSecGrpIncBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecClusterObj requiredOwnerCluster;
	protected IYCFSecSecGroupObj requiredContainerGroup;
	protected IYCFSecSecGroupObj requiredParentSubGroup;

	public YCFBamSecGrpIncEditObj( IYCFSecSecGrpIncObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecGrpIncBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerCluster = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecSecGrpIncBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecSecGrpIncBuff buff = getBuff();
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
		return( YCFBamSecGrpIncObj.CLASS_CODE );
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

	public IYCFSecSecGrpIncObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecGrpIncObj retobj = getSchema().getSecGrpIncTableObj().realiseSecGrpInc( (IYCFBamSecGrpIncObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecGrpInc().forget();
	}

	public IYCFSecSecGrpIncObj read() {
		IYCFSecSecGrpIncObj retval = getOrigAsSecGrpInc().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGrpIncObj read( boolean forceRead ) {
		IYCFSecSecGrpIncObj retval = getOrigAsSecGrpInc().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecGrpIncObj create() {
		copyBuffToOrig();
		IYCFSecSecGrpIncObj retobj = ((IYCFBamSchemaObj)getOrigAsSecGrpInc().getSchema()).getSecGrpIncTableObj().createSecGrpInc( getOrigAsSecGrpInc() );
		if( retobj == getOrigAsSecGrpInc() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecGrpIncEditObj update() {
		getSchema().getSecGrpIncTableObj().updateSecGrpInc( (IYCFSecSecGrpIncObj)this );
		return( null );
	}

	public YCFSecSecGrpIncEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecGrpIncTableObj().deleteSecGrpInc( getOrigAsSecGrpInc() );
		return( null );
	}

	public IYCFSecSecGrpIncTableObj getSecGrpIncTable() {
		return( orig.getSchema().getSecGrpIncTableObj() );
	}

	public IYCFSecSecGrpIncEditObj getEdit() {
		return( (IYCFSecSecGrpIncEditObj)this );
	}

	public IYCFSecSecGrpIncEditObj getEditAsSecGrpInc() {
		return( (IYCFSecSecGrpIncEditObj)this );
	}

	public IYCFSecSecGrpIncEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecGrpIncObj getOrig() {
		return( orig );
	}

	public IYCFSecSecGrpIncObj getOrigAsSecGrpInc() {
		return( (IYCFSecSecGrpIncObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecGrpIncBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsSecGrpInc().getSchema().getBackingStore()).getFactorySecGrpInc().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecGrpIncBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerCluster = null;
			requiredContainerGroup = null;
			requiredParentSubGroup = null;
		}
	}

	public YCFSecSecGrpIncBuff getSecGrpIncBuff() {
		return( (YCFSecSecGrpIncBuff)getBuff() );
	}

	public YCFSecSecGrpIncPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecGrpIncPKey value ) {
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
		if( forceRead || ( requiredOwnerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecClusterObj obj = ((IYCFBamSchemaObj)getOrigAsSecGrpInc().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredOwnerCluster = obj;
			}
		}
		return( requiredOwnerCluster );
	}

	public void setRequiredOwnerCluster( IYCFSecClusterObj value ) {
			if( buff == null ) {
				getSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getSecGrpIncBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredOwnerCluster = value;
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( forceRead || ( requiredContainerGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecGroupObj obj = ((IYCFBamSchemaObj)getOrigAsSecGrpInc().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredSecGroupId() );
				requiredContainerGroup = obj;
				if( obj != null ) {
					getSecGrpIncBuff().setRequiredClusterId( obj.getRequiredClusterId() );
					getSecGrpIncBuff().setRequiredSecGroupId( obj.getRequiredSecGroupId() );
					requiredContainerGroup = obj;
				}
			}
		}
		return( requiredContainerGroup );
	}

	public void setRequiredContainerGroup( IYCFSecSecGroupObj value ) {
			if( buff == null ) {
				getSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredSecGroupId( value.getRequiredSecGroupId() );
			}
			requiredContainerGroup = value;
	}

	public IYCFSecSecGroupObj getRequiredParentSubGroup() {
		return( getRequiredParentSubGroup( false ) );
	}

	public IYCFSecSecGroupObj getRequiredParentSubGroup( boolean forceRead ) {
		if( forceRead || ( requiredParentSubGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecGroupObj obj = ((IYCFBamSchemaObj)getOrigAsSecGrpInc().getSchema()).getSecGroupTableObj().readSecGroupByIdIdx( getPKey().getRequiredClusterId(),
					getSecGrpIncBuff().getRequiredIncludeGroupId() );
				requiredParentSubGroup = obj;
			}
		}
		return( requiredParentSubGroup );
	}

	public void setRequiredParentSubGroup( IYCFSecSecGroupObj value ) {
			if( buff == null ) {
				getSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredClusterId( value.getRequiredClusterId() );
				getSecGrpIncBuff().setRequiredIncludeGroupId( value.getRequiredSecGroupId() );
			}
			else {
			}
			requiredParentSubGroup = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredSecGrpIncId( getPKey().getRequiredSecGrpIncId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredSecGrpIncId( buff.getRequiredSecGrpIncId() );
	}

	public void copyBuffToOrig() {
		YCFSecSecGrpIncBuff origBuff = getOrigAsSecGrpInc().getSecGrpIncBuff();
		YCFSecSecGrpIncBuff myBuff = getSecGrpIncBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecGrpIncBuff origBuff = getOrigAsSecGrpInc().getSecGrpIncBuff();
		YCFSecSecGrpIncBuff myBuff = getSecGrpIncBuff();
		myBuff.set( origBuff );
	}
}

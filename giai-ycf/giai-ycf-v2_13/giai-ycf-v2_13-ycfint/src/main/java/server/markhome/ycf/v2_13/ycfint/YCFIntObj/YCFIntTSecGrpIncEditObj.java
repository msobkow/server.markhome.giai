// Description: Java 11 edit object instance implementation for YCFInt TSecGrpInc.

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

public class YCFIntTSecGrpIncEditObj
	implements IYCFIntTSecGrpIncEditObj
{
	protected IYCFSecTSecGrpIncObj orig;
	protected YCFSecTSecGrpIncBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFSecTSecGroupObj requiredContainerGroup;
	protected IYCFSecTSecGroupObj requiredParentSubGroup;

	public YCFIntTSecGrpIncEditObj( IYCFSecTSecGrpIncObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecTSecGrpIncBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerGroup = null;
		requiredParentSubGroup = null;
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecTSecGrpIncBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecTSecGrpIncBuff buff = getBuff();
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
		return( YCFIntTSecGrpIncObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TSecGrpInc" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecTSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecTSecGroupObj scope = getRequiredContainerGroup();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredTSecGrpIncId();
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

	public IYCFSecTSecGrpIncObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecTSecGrpIncObj retobj = getSchema().getTSecGrpIncTableObj().realiseTSecGrpInc( (IYCFIntTSecGrpIncObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTSecGrpInc().forget();
	}

	public IYCFSecTSecGrpIncObj read() {
		IYCFSecTSecGrpIncObj retval = getOrigAsTSecGrpInc().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTSecGrpIncObj read( boolean forceRead ) {
		IYCFSecTSecGrpIncObj retval = getOrigAsTSecGrpInc().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecTSecGrpIncObj create() {
		copyBuffToOrig();
		IYCFSecTSecGrpIncObj retobj = ((IYCFIntSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTSecGrpIncTableObj().createTSecGrpInc( getOrigAsTSecGrpInc() );
		if( retobj == getOrigAsTSecGrpInc() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecTSecGrpIncEditObj update() {
		getSchema().getTSecGrpIncTableObj().updateTSecGrpInc( (IYCFSecTSecGrpIncObj)this );
		return( null );
	}

	public YCFSecTSecGrpIncEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTSecGrpIncTableObj().deleteTSecGrpInc( getOrigAsTSecGrpInc() );
		return( null );
	}

	public IYCFSecTSecGrpIncTableObj getTSecGrpIncTable() {
		return( orig.getSchema().getTSecGrpIncTableObj() );
	}

	public IYCFSecTSecGrpIncEditObj getEdit() {
		return( (IYCFSecTSecGrpIncEditObj)this );
	}

	public IYCFSecTSecGrpIncEditObj getEditAsTSecGrpInc() {
		return( (IYCFSecTSecGrpIncEditObj)this );
	}

	public IYCFSecTSecGrpIncEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecTSecGrpIncObj getOrig() {
		return( orig );
	}

	public IYCFSecTSecGrpIncObj getOrigAsTSecGrpInc() {
		return( (IYCFSecTSecGrpIncObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecTSecGrpIncBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsTSecGrpInc().getSchema().getBackingStore()).getFactoryTSecGrpInc().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecTSecGrpIncBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerGroup = null;
			requiredParentSubGroup = null;
		}
	}

	public YCFSecTSecGrpIncBuff getTSecGrpIncBuff() {
		return( (YCFSecTSecGrpIncBuff)getBuff() );
	}

	public YCFSecTSecGrpIncPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecTSecGrpIncPKey value ) {
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

	public long getRequiredTSecGrpIncId() {
		return( getPKey().getRequiredTSecGrpIncId() );
	}

	public int getRequiredTSecGroupId() {
		return( getTSecGrpIncBuff().getRequiredTSecGroupId() );
	}

	public int getRequiredIncludeGroupId() {
		return( getTSecGrpIncBuff().getRequiredIncludeGroupId() );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFIntSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getTSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getTSecGrpIncBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFSecTSecGroupObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	public IYCFSecTSecGroupObj getRequiredContainerGroup( boolean forceRead ) {
		if( forceRead || ( requiredContainerGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTSecGroupObj obj = ((IYCFIntSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTSecGroupTableObj().readTSecGroupByIdIdx( getPKey().getRequiredTenantId(),
					getTSecGrpIncBuff().getRequiredTSecGroupId() );
				requiredContainerGroup = obj;
				if( obj != null ) {
					getTSecGrpIncBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTSecGrpIncBuff().setRequiredTSecGroupId( obj.getRequiredTSecGroupId() );
					requiredContainerGroup = obj;
				}
			}
		}
		return( requiredContainerGroup );
	}

	public void setRequiredContainerGroup( IYCFSecTSecGroupObj value ) {
			if( buff == null ) {
				getTSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredTSecGroupId( value.getRequiredTSecGroupId() );
			}
			requiredContainerGroup = value;
	}

	public IYCFSecTSecGroupObj getRequiredParentSubGroup() {
		return( getRequiredParentSubGroup( false ) );
	}

	public IYCFSecTSecGroupObj getRequiredParentSubGroup( boolean forceRead ) {
		if( forceRead || ( requiredParentSubGroup == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTSecGroupObj obj = ((IYCFIntSchemaObj)getOrigAsTSecGrpInc().getSchema()).getTSecGroupTableObj().readTSecGroupByIdIdx( getPKey().getRequiredTenantId(),
					getTSecGrpIncBuff().getRequiredIncludeGroupId() );
				requiredParentSubGroup = obj;
			}
		}
		return( requiredParentSubGroup );
	}

	public void setRequiredParentSubGroup( IYCFSecTSecGroupObj value ) {
			if( buff == null ) {
				getTSecGrpIncBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTSecGrpIncBuff().setRequiredIncludeGroupId( value.getRequiredTSecGroupId() );
			}
			else {
			}
			requiredParentSubGroup = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredTSecGrpIncId( getPKey().getRequiredTSecGrpIncId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredTSecGrpIncId( buff.getRequiredTSecGrpIncId() );
	}

	public void copyBuffToOrig() {
		YCFSecTSecGrpIncBuff origBuff = getOrigAsTSecGrpInc().getTSecGrpIncBuff();
		YCFSecTSecGrpIncBuff myBuff = getTSecGrpIncBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecTSecGrpIncBuff origBuff = getOrigAsTSecGrpInc().getTSecGrpIncBuff();
		YCFSecTSecGrpIncBuff myBuff = getTSecGrpIncBuff();
		myBuff.set( origBuff );
	}
}

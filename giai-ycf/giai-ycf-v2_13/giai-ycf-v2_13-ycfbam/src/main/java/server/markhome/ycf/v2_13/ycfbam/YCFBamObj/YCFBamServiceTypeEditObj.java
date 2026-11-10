// Description: Java 11 edit object instance implementation for YCFBam ServiceType.

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

public class YCFBamServiceTypeEditObj
	implements IYCFBamServiceTypeEditObj
{
	protected IYCFSecServiceTypeObj orig;
	protected YCFSecServiceTypeBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFBamServiceTypeEditObj( IYCFSecServiceTypeObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecServiceTypeBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecServiceTypeBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecServiceTypeBuff buff = getBuff();
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
		return( YCFBamServiceTypeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ServiceType" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredDescription();
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

	public IYCFSecServiceTypeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecServiceTypeObj retobj = getSchema().getServiceTypeTableObj().realiseServiceType( (IYCFBamServiceTypeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsServiceType().forget();
	}

	public IYCFSecServiceTypeObj read() {
		IYCFSecServiceTypeObj retval = getOrigAsServiceType().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecServiceTypeObj read( boolean forceRead ) {
		IYCFSecServiceTypeObj retval = getOrigAsServiceType().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecServiceTypeObj create() {
		copyBuffToOrig();
		IYCFSecServiceTypeObj retobj = ((IYCFBamSchemaObj)getOrigAsServiceType().getSchema()).getServiceTypeTableObj().createServiceType( getOrigAsServiceType() );
		if( retobj == getOrigAsServiceType() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecServiceTypeEditObj update() {
		getSchema().getServiceTypeTableObj().updateServiceType( (IYCFSecServiceTypeObj)this );
		return( null );
	}

	public YCFSecServiceTypeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getServiceTypeTableObj().deleteServiceType( getOrigAsServiceType() );
		return( null );
	}

	public IYCFSecServiceTypeTableObj getServiceTypeTable() {
		return( orig.getSchema().getServiceTypeTableObj() );
	}

	public IYCFSecServiceTypeEditObj getEdit() {
		return( (IYCFSecServiceTypeEditObj)this );
	}

	public IYCFSecServiceTypeEditObj getEditAsServiceType() {
		return( (IYCFSecServiceTypeEditObj)this );
	}

	public IYCFSecServiceTypeEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecServiceTypeObj getOrig() {
		return( orig );
	}

	public IYCFSecServiceTypeObj getOrigAsServiceType() {
		return( (IYCFSecServiceTypeObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecServiceTypeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsServiceType().getSchema().getBackingStore()).getFactoryServiceType().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecServiceTypeBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFSecServiceTypeBuff getServiceTypeBuff() {
		return( (YCFSecServiceTypeBuff)getBuff() );
	}

	public YCFSecServiceTypePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecServiceTypePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public int getRequiredServiceTypeId() {
		return( getPKey().getRequiredServiceTypeId() );
	}

	public String getRequiredDescription() {
		return( getServiceTypeBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getServiceTypeBuff().getRequiredDescription() != value ) {
			getServiceTypeBuff().setRequiredDescription( value );
		}
	}

	public List<IYCFSecServiceObj> getOptionalChildrenDeployed() {
		List<IYCFSecServiceObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsServiceType().getSchema()).getServiceTableObj().readServiceByTypeIdx( getPKey().getRequiredServiceTypeId(),
			false );
		return( retval );
	}

	public List<IYCFSecServiceObj> getOptionalChildrenDeployed( boolean forceRead ) {
		List<IYCFSecServiceObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsServiceType().getSchema()).getServiceTableObj().readServiceByTypeIdx( getPKey().getRequiredServiceTypeId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredServiceTypeId( getPKey().getRequiredServiceTypeId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredServiceTypeId( buff.getRequiredServiceTypeId() );
	}

	public void copyBuffToOrig() {
		YCFSecServiceTypeBuff origBuff = getOrigAsServiceType().getServiceTypeBuff();
		YCFSecServiceTypeBuff myBuff = getServiceTypeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecServiceTypeBuff origBuff = getOrigAsServiceType().getServiceTypeBuff();
		YCFSecServiceTypeBuff myBuff = getServiceTypeBuff();
		myBuff.set( origBuff );
	}
}

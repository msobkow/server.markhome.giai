// Description: Java 11 base object instance implementation for YCFSec ServiceType.

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

public class YCFSecServiceTypeObj
	implements IYCFSecServiceTypeObj
{
	public final static String CLASS_CODE = "a013";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecServiceTypeEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecServiceTypePKey pKey;
	protected YCFSecServiceTypeBuff buff;

	public YCFSecServiceTypeObj() {
		isNew = true;
	}

	public YCFSecServiceTypeObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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

	public IYCFSecServiceTypeObj realise() {
		IYCFSecServiceTypeObj retobj = ((IYCFSecSchemaObj)schema).getServiceTypeTableObj().realiseServiceType(
			(IYCFSecServiceTypeObj)this );
		return( (IYCFSecServiceTypeObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getServiceTypeTableObj().reallyDeepDisposeServiceType( (IYCFSecServiceTypeObj)this );
	}

	public IYCFSecServiceTypeObj read() {
		IYCFSecServiceTypeObj retobj = ((IYCFSecSchemaObj)schema).getServiceTypeTableObj().readServiceTypeByIdIdx( getPKey().getRequiredServiceTypeId(), false );
		return( (IYCFSecServiceTypeObj)retobj );
	}

	public IYCFSecServiceTypeObj read( boolean forceRead ) {
		IYCFSecServiceTypeObj retobj = ((IYCFSecSchemaObj)schema).getServiceTypeTableObj().readServiceTypeByIdIdx( getPKey().getRequiredServiceTypeId(), forceRead );
		return( (IYCFSecServiceTypeObj)retobj );
	}

	public IYCFSecServiceTypeTableObj getServiceTypeTable() {
		return( ((IYCFSecSchemaObj)schema).getServiceTypeTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecServiceTypeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactoryServiceType().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableServiceType().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredServiceTypeId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecServiceTypeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecServiceTypeBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecServiceTypeBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFSecServiceTypeBuff getServiceTypeBuff() {
		return( (YCFSecServiceTypeBuff)getBuff() );
	}

	public YCFSecServiceTypePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryServiceType().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecServiceTypePKey value ) {
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

	public IYCFSecServiceTypeEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecServiceTypeObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecServiceTypeObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getServiceTypeTableObj().lockServiceType( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getServiceTypeTableObj().newEditInstance( lockobj );
		return( (IYCFSecServiceTypeEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecServiceTypeEditObj getEdit() {
		return( edit );
	}

	public IYCFSecServiceTypeEditObj getEditAsServiceType() {
		return( (IYCFSecServiceTypeEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecServiceTypeBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecServiceTypeBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public int getRequiredServiceTypeId() {
		return( getPKey().getRequiredServiceTypeId() );
	}

	public String getRequiredDescription() {
		return( getServiceTypeBuff().getRequiredDescription() );
	}

	public List<IYCFSecServiceObj> getOptionalChildrenDeployed() {
		List<IYCFSecServiceObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getServiceTableObj().readServiceByTypeIdx( getPKey().getRequiredServiceTypeId(),
			false );
		return( retval );
	}

	public List<IYCFSecServiceObj> getOptionalChildrenDeployed( boolean forceRead ) {
		List<IYCFSecServiceObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getServiceTableObj().readServiceByTypeIdx( getPKey().getRequiredServiceTypeId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredServiceTypeId( getPKey().getRequiredServiceTypeId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredServiceTypeId( buff.getRequiredServiceTypeId() );
	}
}

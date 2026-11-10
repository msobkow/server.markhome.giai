// Description: Java 11 base object instance implementation for YCFSec ISOCcy.

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

public class YCFSecISOCcyObj
	implements IYCFSecISOCcyObj
{
	public final static String CLASS_CODE = "a003";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecISOCcyEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecISOCcyPKey pKey;
	protected YCFSecISOCcyBuff buff;

	public YCFSecISOCcyObj() {
		isNew = true;
	}

	public YCFSecISOCcyObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOCcy" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredISOCode();
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

	public IYCFSecISOCcyObj realise() {
		IYCFSecISOCcyObj retobj = ((IYCFSecSchemaObj)schema).getISOCcyTableObj().realiseISOCcy(
			(IYCFSecISOCcyObj)this );
		return( (IYCFSecISOCcyObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getISOCcyTableObj().reallyDeepDisposeISOCcy( (IYCFSecISOCcyObj)this );
	}

	public IYCFSecISOCcyObj read() {
		IYCFSecISOCcyObj retobj = ((IYCFSecSchemaObj)schema).getISOCcyTableObj().readISOCcyByIdIdx( getPKey().getRequiredISOCcyId(), false );
		return( (IYCFSecISOCcyObj)retobj );
	}

	public IYCFSecISOCcyObj read( boolean forceRead ) {
		IYCFSecISOCcyObj retobj = ((IYCFSecSchemaObj)schema).getISOCcyTableObj().readISOCcyByIdIdx( getPKey().getRequiredISOCcyId(), forceRead );
		return( (IYCFSecISOCcyObj)retobj );
	}

	public IYCFSecISOCcyTableObj getISOCcyTable() {
		return( ((IYCFSecSchemaObj)schema).getISOCcyTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecISOCcyBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCcy().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOCcyId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecISOCcyBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecISOCcyBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecISOCcyBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFSecISOCcyBuff getISOCcyBuff() {
		return( (YCFSecISOCcyBuff)getBuff() );
	}

	public YCFSecISOCcyPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecISOCcyPKey value ) {
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

	public IYCFSecISOCcyEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecISOCcyObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecISOCcyObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getISOCcyTableObj().lockISOCcy( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getISOCcyTableObj().newEditInstance( lockobj );
		return( (IYCFSecISOCcyEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecISOCcyEditObj getEdit() {
		return( edit );
	}

	public IYCFSecISOCcyEditObj getEditAsISOCcy() {
		return( (IYCFSecISOCcyEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOCcyBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOCcyBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public short getRequiredISOCcyId() {
		return( getPKey().getRequiredISOCcyId() );
	}

	public String getRequiredISOCode() {
		return( getISOCcyBuff().getRequiredISOCode() );
	}

	public String getRequiredName() {
		return( getISOCcyBuff().getRequiredName() );
	}

	public String getOptionalUnitSymbol() {
		return( getISOCcyBuff().getOptionalUnitSymbol() );
	}

	public short getRequiredPrecis() {
		return( getISOCcyBuff().getRequiredPrecis() );
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalChildrenCtry() {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByCcyIdx( getPKey().getRequiredISOCcyId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalChildrenCtry( boolean forceRead ) {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFSecSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByCcyIdx( getPKey().getRequiredISOCcyId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOCcyId( getPKey().getRequiredISOCcyId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCcyId( buff.getRequiredISOCcyId() );
	}
}

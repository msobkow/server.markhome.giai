// Description: Java 11 base object instance implementation for YCFBam ISOCtryCcy.

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

public class YCFBamISOCtryCcyObj
	implements IYCFBamISOCtryCcyObj
{
	public final static String CLASS_CODE = "a005";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecISOCtryCcyEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecISOCtryCcyPKey pKey;
	protected YCFSecISOCtryCcyBuff buff;
	protected IYCFSecISOCtryObj requiredContainerCtry;
	protected IYCFSecISOCcyObj requiredParentCcy;

	public YCFBamISOCtryCcyObj() {
		isNew = true;
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	public YCFBamISOCtryCcyObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOCtryCcy" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFSecISOCtryObj scope = getRequiredContainerCtry();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecISOCtryObj scope = getRequiredContainerCtry();
		return( scope );
	}

	public String getObjName() {
		String objName;
		short val = getRequiredISOCcyId();
		objName = Short.toString( val );
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

	public IYCFSecISOCtryCcyObj realise() {
		IYCFSecISOCtryCcyObj retobj = ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().realiseISOCtryCcy(
			(IYCFSecISOCtryCcyObj)this );
		return( (IYCFSecISOCtryCcyObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().reallyDeepDisposeISOCtryCcy( (IYCFSecISOCtryCcyObj)this );
	}

	public IYCFSecISOCtryCcyObj read() {
		IYCFSecISOCtryCcyObj retobj = ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOCcyId(), false );
		return( (IYCFSecISOCtryCcyObj)retobj );
	}

	public IYCFSecISOCtryCcyObj read( boolean forceRead ) {
		IYCFSecISOCtryCcyObj retobj = ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOCcyId(), forceRead );
		return( (IYCFSecISOCtryCcyObj)retobj );
	}

	public IYCFSecISOCtryCcyTableObj getISOCtryCcyTable() {
		return( ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecISOCtryCcyBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableISOCtryCcy().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOCtryId(),
						getPKey().getRequiredISOCcyId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecISOCtryCcyBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecISOCtryCcyBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecISOCtryCcyBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	public YCFSecISOCtryCcyBuff getISOCtryCcyBuff() {
		return( (YCFSecISOCtryCcyBuff)getBuff() );
	}

	public YCFSecISOCtryCcyPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecISOCtryCcyPKey value ) {
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

	public IYCFSecISOCtryCcyEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecISOCtryCcyObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecISOCtryCcyObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().lockISOCtryCcy( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().newEditInstance( lockobj );
		return( (IYCFSecISOCtryCcyEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecISOCtryCcyEditObj getEdit() {
		return( edit );
	}

	public IYCFSecISOCtryCcyEditObj getEditAsISOCtryCcy() {
		return( (IYCFSecISOCtryCcyEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOCtryCcyBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOCtryCcyBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public short getRequiredISOCtryId() {
		return( getPKey().getRequiredISOCtryId() );
	}

	public short getRequiredISOCcyId() {
		return( getPKey().getRequiredISOCcyId() );
	}

	public IYCFSecISOCtryObj getRequiredContainerCtry() {
		return( getRequiredContainerCtry( false ) );
	}

	public IYCFSecISOCtryObj getRequiredContainerCtry( boolean forceRead ) {
		if( ( requiredContainerCtry == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCtry = ((IYCFBamSchemaObj)schema).getISOCtryTableObj().readISOCtryByIdIdx( getPKey().getRequiredISOCtryId(), forceRead );
			}
		}
		return( requiredContainerCtry );
	}

	public IYCFSecISOCcyObj getRequiredParentCcy() {
		return( getRequiredParentCcy( false ) );
	}

	public IYCFSecISOCcyObj getRequiredParentCcy( boolean forceRead ) {
		if( ( requiredParentCcy == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentCcy = ((IYCFBamSchemaObj)schema).getISOCcyTableObj().readISOCcyByIdIdx( getPKey().getRequiredISOCcyId(), forceRead );
			}
		}
		return( requiredParentCcy );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOCtryId( getPKey().getRequiredISOCtryId() );
			buff.setRequiredISOCcyId( getPKey().getRequiredISOCcyId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCtryId( buff.getRequiredISOCtryId() );
		getPKey().setRequiredISOCcyId( buff.getRequiredISOCcyId() );
	}
}

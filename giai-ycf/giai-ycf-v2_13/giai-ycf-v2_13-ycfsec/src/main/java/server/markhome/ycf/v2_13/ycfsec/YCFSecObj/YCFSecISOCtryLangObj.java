// Description: Java 11 base object instance implementation for YCFSec ISOCtryLang.

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

public class YCFSecISOCtryLangObj
	implements IYCFSecISOCtryLangObj
{
	public final static String CLASS_CODE = "a006";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecISOCtryLangEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecISOCtryLangPKey pKey;
	protected YCFSecISOCtryLangBuff buff;
	protected IYCFSecISOCtryObj requiredContainerCtry;
	protected IYCFSecISOLangObj requiredParentLang;

	public YCFSecISOCtryLangObj() {
		isNew = true;
		requiredContainerCtry = null;
		requiredParentLang = null;
	}

	public YCFSecISOCtryLangObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCtry = null;
		requiredParentLang = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOCtryLang" );
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
		short val = getRequiredISOLangId();
		objName = Short.toString( val );
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

	public IYCFSecISOCtryLangObj realise() {
		IYCFSecISOCtryLangObj retobj = ((IYCFSecSchemaObj)schema).getISOCtryLangTableObj().realiseISOCtryLang(
			(IYCFSecISOCtryLangObj)this );
		return( (IYCFSecISOCtryLangObj)retobj );
	}

	public void forget() {
		((IYCFSecSchemaObj)schema).getISOCtryLangTableObj().reallyDeepDisposeISOCtryLang( (IYCFSecISOCtryLangObj)this );
	}

	public IYCFSecISOCtryLangObj read() {
		IYCFSecISOCtryLangObj retobj = ((IYCFSecSchemaObj)schema).getISOCtryLangTableObj().readISOCtryLangByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOLangId(), false );
		return( (IYCFSecISOCtryLangObj)retobj );
	}

	public IYCFSecISOCtryLangObj read( boolean forceRead ) {
		IYCFSecISOCtryLangObj retobj = ((IYCFSecSchemaObj)schema).getISOCtryLangTableObj().readISOCtryLangByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOLangId(), forceRead );
		return( (IYCFSecISOCtryLangObj)retobj );
	}

	public IYCFSecISOCtryLangTableObj getISOCtryLangTable() {
		return( ((IYCFSecSchemaObj)schema).getISOCtryLangTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecISOCtryLangBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().readDerivedByIdIdx( ((IYCFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOCtryId(),
						getPKey().getRequiredISOLangId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecISOCtryLangBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecISOCtryLangBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecISOCtryLangBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCtry = null;
		requiredParentLang = null;
	}

	public YCFSecISOCtryLangBuff getISOCtryLangBuff() {
		return( (YCFSecISOCtryLangBuff)getBuff() );
	}

	public YCFSecISOCtryLangPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecISOCtryLangPKey value ) {
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

	public IYCFSecISOCtryLangEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecISOCtryLangObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecISOCtryLangObj)this;
		}
		else {
			lockobj = ((IYCFSecSchemaObj)schema).getISOCtryLangTableObj().lockISOCtryLang( getPKey() );
		}
		edit = ((IYCFSecSchemaObj)schema).getISOCtryLangTableObj().newEditInstance( lockobj );
		return( (IYCFSecISOCtryLangEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecISOCtryLangEditObj getEdit() {
		return( edit );
	}

	public IYCFSecISOCtryLangEditObj getEditAsISOCtryLang() {
		return( (IYCFSecISOCtryLangEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOCtryLangBuff buff = getBuff();
			createdBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOCtryLangBuff buff = getBuff();
			updatedBy = ((IYCFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public short getRequiredISOCtryId() {
		return( getPKey().getRequiredISOCtryId() );
	}

	public short getRequiredISOLangId() {
		return( getPKey().getRequiredISOLangId() );
	}

	public IYCFSecISOCtryObj getRequiredContainerCtry() {
		return( getRequiredContainerCtry( false ) );
	}

	public IYCFSecISOCtryObj getRequiredContainerCtry( boolean forceRead ) {
		if( ( requiredContainerCtry == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCtry = ((IYCFSecSchemaObj)schema).getISOCtryTableObj().readISOCtryByIdIdx( getPKey().getRequiredISOCtryId(), forceRead );
			}
		}
		return( requiredContainerCtry );
	}

	public IYCFSecISOLangObj getRequiredParentLang() {
		return( getRequiredParentLang( false ) );
	}

	public IYCFSecISOLangObj getRequiredParentLang( boolean forceRead ) {
		if( ( requiredParentLang == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentLang = ((IYCFSecSchemaObj)schema).getISOLangTableObj().readISOLangByIdIdx( getPKey().getRequiredISOLangId(), forceRead );
			}
		}
		return( requiredParentLang );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOCtryId( getPKey().getRequiredISOCtryId() );
			buff.setRequiredISOLangId( getPKey().getRequiredISOLangId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCtryId( buff.getRequiredISOCtryId() );
		getPKey().setRequiredISOLangId( buff.getRequiredISOLangId() );
	}
}

// Description: Java 11 base object instance implementation for YCFInt ISOLang.

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

public class YCFIntISOLangObj
	implements IYCFIntISOLangObj
{
	public final static String CLASS_CODE = "a007";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecISOLangEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecISOLangPKey pKey;
	protected YCFSecISOLangBuff buff;

	public YCFIntISOLangObj() {
		isNew = true;
	}

	public YCFIntISOLangObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOLang" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredISO6392Code();
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

	public IYCFSecISOLangObj realise() {
		IYCFSecISOLangObj retobj = ((IYCFIntSchemaObj)schema).getISOLangTableObj().realiseISOLang(
			(IYCFSecISOLangObj)this );
		return( (IYCFSecISOLangObj)retobj );
	}

	public void forget() {
		((IYCFIntSchemaObj)schema).getISOLangTableObj().reallyDeepDisposeISOLang( (IYCFSecISOLangObj)this );
	}

	public IYCFSecISOLangObj read() {
		IYCFSecISOLangObj retobj = ((IYCFIntSchemaObj)schema).getISOLangTableObj().readISOLangByIdIdx( getPKey().getRequiredISOLangId(), false );
		return( (IYCFSecISOLangObj)retobj );
	}

	public IYCFSecISOLangObj read( boolean forceRead ) {
		IYCFSecISOLangObj retobj = ((IYCFIntSchemaObj)schema).getISOLangTableObj().readISOLangByIdIdx( getPKey().getRequiredISOLangId(), forceRead );
		return( (IYCFSecISOLangObj)retobj );
	}

	public IYCFSecISOLangTableObj getISOLangTable() {
		return( ((IYCFIntSchemaObj)schema).getISOLangTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecISOLangBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFIntSchema)schema.getBackingStore()).getFactoryISOLang().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFIntSchema)schema.getBackingStore()).getTableISOLang().readDerivedByIdIdx( ((IYCFIntSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOLangId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecISOLangBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecISOLangBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecISOLangBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFSecISOLangBuff getISOLangBuff() {
		return( (YCFSecISOLangBuff)getBuff() );
	}

	public YCFSecISOLangPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryISOLang().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecISOLangPKey value ) {
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

	public IYCFSecISOLangEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecISOLangObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecISOLangObj)this;
		}
		else {
			lockobj = ((IYCFIntSchemaObj)schema).getISOLangTableObj().lockISOLang( getPKey() );
		}
		edit = ((IYCFIntSchemaObj)schema).getISOLangTableObj().newEditInstance( lockobj );
		return( (IYCFSecISOLangEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecISOLangEditObj getEdit() {
		return( edit );
	}

	public IYCFSecISOLangEditObj getEditAsISOLang() {
		return( (IYCFSecISOLangEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOLangBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOLangBuff buff = getBuff();
			updatedBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public short getRequiredISOLangId() {
		return( getPKey().getRequiredISOLangId() );
	}

	public String getRequiredISO6392Code() {
		return( getISOLangBuff().getRequiredISO6392Code() );
	}

	public String getOptionalISO6391Code() {
		return( getISOLangBuff().getOptionalISO6391Code() );
	}

	public String getRequiredEnglishName() {
		return( getISOLangBuff().getRequiredEnglishName() );
	}

	public List<IYCFSecISOCtryLangObj> getOptionalChildrenCtry() {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getISOCtryLangTableObj().readISOCtryLangByLangIdx( getPKey().getRequiredISOLangId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryLangObj> getOptionalChildrenCtry( boolean forceRead ) {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFIntSchemaObj)schema).getISOCtryLangTableObj().readISOCtryLangByLangIdx( getPKey().getRequiredISOLangId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOLangId( getPKey().getRequiredISOLangId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOLangId( buff.getRequiredISOLangId() );
	}
}

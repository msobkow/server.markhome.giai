// Description: Java 11 base object instance implementation for YCFBam ISOCtry.

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

public class YCFBamISOCtryObj
	implements IYCFBamISOCtryObj
{
	public final static String CLASS_CODE = "a004";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecISOCtryEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecISOCtryPKey pKey;
	protected YCFSecISOCtryBuff buff;

	public YCFBamISOCtryObj() {
		isNew = true;
	}

	public YCFBamISOCtryObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOCtry" );
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

	public IYCFSecISOCtryObj realise() {
		IYCFSecISOCtryObj retobj = ((IYCFBamSchemaObj)schema).getISOCtryTableObj().realiseISOCtry(
			(IYCFSecISOCtryObj)this );
		return( (IYCFSecISOCtryObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getISOCtryTableObj().reallyDeepDisposeISOCtry( (IYCFSecISOCtryObj)this );
	}

	public IYCFSecISOCtryObj read() {
		IYCFSecISOCtryObj retobj = ((IYCFBamSchemaObj)schema).getISOCtryTableObj().readISOCtryByIdIdx( getPKey().getRequiredISOCtryId(), false );
		return( (IYCFSecISOCtryObj)retobj );
	}

	public IYCFSecISOCtryObj read( boolean forceRead ) {
		IYCFSecISOCtryObj retobj = ((IYCFBamSchemaObj)schema).getISOCtryTableObj().readISOCtryByIdIdx( getPKey().getRequiredISOCtryId(), forceRead );
		return( (IYCFSecISOCtryObj)retobj );
	}

	public IYCFSecISOCtryTableObj getISOCtryTable() {
		return( ((IYCFBamSchemaObj)schema).getISOCtryTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecISOCtryBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryISOCtry().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableISOCtry().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOCtryId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecISOCtryBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecISOCtryBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecISOCtryBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFSecISOCtryBuff getISOCtryBuff() {
		return( (YCFSecISOCtryBuff)getBuff() );
	}

	public YCFSecISOCtryPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecISOCtryPKey value ) {
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

	public IYCFSecISOCtryEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecISOCtryObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecISOCtryObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getISOCtryTableObj().lockISOCtry( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getISOCtryTableObj().newEditInstance( lockobj );
		return( (IYCFSecISOCtryEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecISOCtryEditObj getEdit() {
		return( edit );
	}

	public IYCFSecISOCtryEditObj getEditAsISOCtry() {
		return( (IYCFSecISOCtryEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOCtryBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOCtryBuff buff = getBuff();
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

	public String getRequiredISOCode() {
		return( getISOCtryBuff().getRequiredISOCode() );
	}

	public String getRequiredName() {
		return( getISOCtryBuff().getRequiredName() );
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalComponentsCcy() {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByCtryIdx( getPKey().getRequiredISOCtryId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalComponentsCcy( boolean forceRead ) {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByCtryIdx( getPKey().getRequiredISOCtryId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecISOCtryLangObj> getOptionalComponentsLang() {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getISOCtryLangTableObj().readISOCtryLangByCtryIdx( getPKey().getRequiredISOCtryId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryLangObj> getOptionalComponentsLang( boolean forceRead ) {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFBamSchemaObj)schema).getISOCtryLangTableObj().readISOCtryLangByCtryIdx( getPKey().getRequiredISOCtryId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOCtryId( getPKey().getRequiredISOCtryId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCtryId( buff.getRequiredISOCtryId() );
	}
}

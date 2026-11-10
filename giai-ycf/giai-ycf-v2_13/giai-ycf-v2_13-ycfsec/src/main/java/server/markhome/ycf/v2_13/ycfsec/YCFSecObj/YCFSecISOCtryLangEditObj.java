// Description: Java 11 edit object instance implementation for YCFSec ISOCtryLang.

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

public class YCFSecISOCtryLangEditObj
	implements IYCFSecISOCtryLangEditObj
{
	protected IYCFSecISOCtryLangObj orig;
	protected YCFSecISOCtryLangBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecISOCtryObj requiredContainerCtry;
	protected IYCFSecISOLangObj requiredParentLang;

	public YCFSecISOCtryLangEditObj( IYCFSecISOCtryLangObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecISOCtryLangBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCtry = null;
		requiredParentLang = null;
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
		return( YCFSecISOCtryLangObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecISOCtryLangObj retobj = getSchema().getISOCtryLangTableObj().realiseISOCtryLang( (IYCFSecISOCtryLangObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsISOCtryLang().forget();
	}

	public IYCFSecISOCtryLangObj read() {
		IYCFSecISOCtryLangObj retval = getOrigAsISOCtryLang().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOCtryLangObj read( boolean forceRead ) {
		IYCFSecISOCtryLangObj retval = getOrigAsISOCtryLang().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOCtryLangObj create() {
		copyBuffToOrig();
		IYCFSecISOCtryLangObj retobj = ((IYCFSecSchemaObj)getOrigAsISOCtryLang().getSchema()).getISOCtryLangTableObj().createISOCtryLang( getOrigAsISOCtryLang() );
		if( retobj == getOrigAsISOCtryLang() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecISOCtryLangEditObj update() {
		getSchema().getISOCtryLangTableObj().updateISOCtryLang( (IYCFSecISOCtryLangObj)this );
		return( null );
	}

	public YCFSecISOCtryLangEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getISOCtryLangTableObj().deleteISOCtryLang( getOrigAsISOCtryLang() );
		return( null );
	}

	public IYCFSecISOCtryLangTableObj getISOCtryLangTable() {
		return( orig.getSchema().getISOCtryLangTableObj() );
	}

	public IYCFSecISOCtryLangEditObj getEdit() {
		return( (IYCFSecISOCtryLangEditObj)this );
	}

	public IYCFSecISOCtryLangEditObj getEditAsISOCtryLang() {
		return( (IYCFSecISOCtryLangEditObj)this );
	}

	public IYCFSecISOCtryLangEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecISOCtryLangObj getOrig() {
		return( orig );
	}

	public IYCFSecISOCtryLangObj getOrigAsISOCtryLang() {
		return( (IYCFSecISOCtryLangObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecISOCtryLangBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsISOCtryLang().getSchema().getBackingStore()).getFactoryISOCtryLang().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecISOCtryLangBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCtry = null;
			requiredParentLang = null;
		}
	}

	public YCFSecISOCtryLangBuff getISOCtryLangBuff() {
		return( (YCFSecISOCtryLangBuff)getBuff() );
	}

	public YCFSecISOCtryLangPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecISOCtryLangPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
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
		if( forceRead || ( requiredContainerCtry == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecISOCtryObj obj = ((IYCFSecSchemaObj)getOrigAsISOCtryLang().getSchema()).getISOCtryTableObj().readISOCtryByIdIdx( getPKey().getRequiredISOCtryId() );
				requiredContainerCtry = obj;
				if( obj != null ) {
					getISOCtryLangBuff().setRequiredISOCtryId( obj.getRequiredISOCtryId() );
					requiredContainerCtry = obj;
				}
			}
		}
		return( requiredContainerCtry );
	}

	public void setRequiredContainerCtry( IYCFSecISOCtryObj value ) {
			if( buff == null ) {
				getISOCtryLangBuff();
			}
			if( value != null ) {
				getPKey().setRequiredISOCtryId( value.getRequiredISOCtryId() );
				getISOCtryLangBuff().setRequiredISOCtryId( value.getRequiredISOCtryId() );
			}
			requiredContainerCtry = value;
	}

	public IYCFSecISOLangObj getRequiredParentLang() {
		return( getRequiredParentLang( false ) );
	}

	public IYCFSecISOLangObj getRequiredParentLang( boolean forceRead ) {
		if( forceRead || ( requiredParentLang == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecISOLangObj obj = ((IYCFSecSchemaObj)getOrigAsISOCtryLang().getSchema()).getISOLangTableObj().readISOLangByIdIdx( getPKey().getRequiredISOLangId() );
				requiredParentLang = obj;
			}
		}
		return( requiredParentLang );
	}

	public void setRequiredParentLang( IYCFSecISOLangObj value ) {
			if( buff == null ) {
				getISOCtryLangBuff();
			}
			if( value != null ) {
				getPKey().setRequiredISOLangId( value.getRequiredISOLangId() );
				getISOCtryLangBuff().setRequiredISOLangId( value.getRequiredISOLangId() );
			}
			else {
			}
			requiredParentLang = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredISOCtryId( getPKey().getRequiredISOCtryId() );
		buff.setRequiredISOLangId( getPKey().getRequiredISOLangId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCtryId( buff.getRequiredISOCtryId() );
		getPKey().setRequiredISOLangId( buff.getRequiredISOLangId() );
	}

	public void copyBuffToOrig() {
		YCFSecISOCtryLangBuff origBuff = getOrigAsISOCtryLang().getISOCtryLangBuff();
		YCFSecISOCtryLangBuff myBuff = getISOCtryLangBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecISOCtryLangBuff origBuff = getOrigAsISOCtryLang().getISOCtryLangBuff();
		YCFSecISOCtryLangBuff myBuff = getISOCtryLangBuff();
		myBuff.set( origBuff );
	}
}

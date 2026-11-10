// Description: Java 11 edit object instance implementation for YCFInt ISOLang.

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

public class YCFIntISOLangEditObj
	implements IYCFIntISOLangEditObj
{
	protected IYCFSecISOLangObj orig;
	protected YCFSecISOLangBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFIntISOLangEditObj( IYCFSecISOLangObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecISOLangBuff origBuff = orig.getBuff();
		buff.set( origBuff );
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
		return( YCFIntISOLangObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecISOLangObj retobj = getSchema().getISOLangTableObj().realiseISOLang( (IYCFIntISOLangObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsISOLang().forget();
	}

	public IYCFSecISOLangObj read() {
		IYCFSecISOLangObj retval = getOrigAsISOLang().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOLangObj read( boolean forceRead ) {
		IYCFSecISOLangObj retval = getOrigAsISOLang().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOLangObj create() {
		copyBuffToOrig();
		IYCFSecISOLangObj retobj = ((IYCFIntSchemaObj)getOrigAsISOLang().getSchema()).getISOLangTableObj().createISOLang( getOrigAsISOLang() );
		if( retobj == getOrigAsISOLang() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecISOLangEditObj update() {
		getSchema().getISOLangTableObj().updateISOLang( (IYCFSecISOLangObj)this );
		return( null );
	}

	public YCFSecISOLangEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getISOLangTableObj().deleteISOLang( getOrigAsISOLang() );
		return( null );
	}

	public IYCFSecISOLangTableObj getISOLangTable() {
		return( orig.getSchema().getISOLangTableObj() );
	}

	public IYCFSecISOLangEditObj getEdit() {
		return( (IYCFSecISOLangEditObj)this );
	}

	public IYCFSecISOLangEditObj getEditAsISOLang() {
		return( (IYCFSecISOLangEditObj)this );
	}

	public IYCFSecISOLangEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecISOLangObj getOrig() {
		return( orig );
	}

	public IYCFSecISOLangObj getOrigAsISOLang() {
		return( (IYCFSecISOLangObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecISOLangBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsISOLang().getSchema().getBackingStore()).getFactoryISOLang().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecISOLangBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFSecISOLangBuff getISOLangBuff() {
		return( (YCFSecISOLangBuff)getBuff() );
	}

	public YCFSecISOLangPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecISOLangPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public short getRequiredISOLangId() {
		return( getPKey().getRequiredISOLangId() );
	}

	public String getRequiredISO6392Code() {
		return( getISOLangBuff().getRequiredISO6392Code() );
	}

	public void setRequiredISO6392Code( String value ) {
		if( getISOLangBuff().getRequiredISO6392Code() != value ) {
			getISOLangBuff().setRequiredISO6392Code( value );
		}
	}

	public String getOptionalISO6391Code() {
		return( getISOLangBuff().getOptionalISO6391Code() );
	}

	public void setOptionalISO6391Code( String value ) {
		if( getISOLangBuff().getOptionalISO6391Code() != value ) {
			getISOLangBuff().setOptionalISO6391Code( value );
		}
	}

	public String getRequiredEnglishName() {
		return( getISOLangBuff().getRequiredEnglishName() );
	}

	public void setRequiredEnglishName( String value ) {
		if( getISOLangBuff().getRequiredEnglishName() != value ) {
			getISOLangBuff().setRequiredEnglishName( value );
		}
	}

	public List<IYCFSecISOCtryLangObj> getOptionalChildrenCtry() {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsISOLang().getSchema()).getISOCtryLangTableObj().readISOCtryLangByLangIdx( getPKey().getRequiredISOLangId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryLangObj> getOptionalChildrenCtry( boolean forceRead ) {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsISOLang().getSchema()).getISOCtryLangTableObj().readISOCtryLangByLangIdx( getPKey().getRequiredISOLangId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredISOLangId( getPKey().getRequiredISOLangId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOLangId( buff.getRequiredISOLangId() );
	}

	public void copyBuffToOrig() {
		YCFSecISOLangBuff origBuff = getOrigAsISOLang().getISOLangBuff();
		YCFSecISOLangBuff myBuff = getISOLangBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecISOLangBuff origBuff = getOrigAsISOLang().getISOLangBuff();
		YCFSecISOLangBuff myBuff = getISOLangBuff();
		myBuff.set( origBuff );
	}
}

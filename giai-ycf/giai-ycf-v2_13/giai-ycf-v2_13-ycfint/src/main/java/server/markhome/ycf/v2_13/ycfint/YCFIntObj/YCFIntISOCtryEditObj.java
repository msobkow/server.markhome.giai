// Description: Java 11 edit object instance implementation for YCFInt ISOCtry.

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

public class YCFIntISOCtryEditObj
	implements IYCFIntISOCtryEditObj
{
	protected IYCFSecISOCtryObj orig;
	protected YCFSecISOCtryBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFIntISOCtryEditObj( IYCFSecISOCtryObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecISOCtryBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOCtryBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOCtryBuff buff = getBuff();
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
		return( YCFIntISOCtryObj.CLASS_CODE );
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

	public IYCFSecISOCtryObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecISOCtryObj retobj = getSchema().getISOCtryTableObj().realiseISOCtry( (IYCFIntISOCtryObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsISOCtry().forget();
	}

	public IYCFSecISOCtryObj read() {
		IYCFSecISOCtryObj retval = getOrigAsISOCtry().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOCtryObj read( boolean forceRead ) {
		IYCFSecISOCtryObj retval = getOrigAsISOCtry().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOCtryObj create() {
		copyBuffToOrig();
		IYCFSecISOCtryObj retobj = ((IYCFIntSchemaObj)getOrigAsISOCtry().getSchema()).getISOCtryTableObj().createISOCtry( getOrigAsISOCtry() );
		if( retobj == getOrigAsISOCtry() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecISOCtryEditObj update() {
		getSchema().getISOCtryTableObj().updateISOCtry( (IYCFSecISOCtryObj)this );
		return( null );
	}

	public YCFSecISOCtryEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getISOCtryTableObj().deleteISOCtry( getOrigAsISOCtry() );
		return( null );
	}

	public IYCFSecISOCtryTableObj getISOCtryTable() {
		return( orig.getSchema().getISOCtryTableObj() );
	}

	public IYCFSecISOCtryEditObj getEdit() {
		return( (IYCFSecISOCtryEditObj)this );
	}

	public IYCFSecISOCtryEditObj getEditAsISOCtry() {
		return( (IYCFSecISOCtryEditObj)this );
	}

	public IYCFSecISOCtryEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecISOCtryObj getOrig() {
		return( orig );
	}

	public IYCFSecISOCtryObj getOrigAsISOCtry() {
		return( (IYCFSecISOCtryObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecISOCtryBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsISOCtry().getSchema().getBackingStore()).getFactoryISOCtry().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecISOCtryBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFSecISOCtryBuff getISOCtryBuff() {
		return( (YCFSecISOCtryBuff)getBuff() );
	}

	public YCFSecISOCtryPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecISOCtryPKey value ) {
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

	public String getRequiredISOCode() {
		return( getISOCtryBuff().getRequiredISOCode() );
	}

	public void setRequiredISOCode( String value ) {
		if( getISOCtryBuff().getRequiredISOCode() != value ) {
			getISOCtryBuff().setRequiredISOCode( value );
		}
	}

	public String getRequiredName() {
		return( getISOCtryBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getISOCtryBuff().getRequiredName() != value ) {
			getISOCtryBuff().setRequiredName( value );
		}
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalComponentsCcy() {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsISOCtry().getSchema()).getISOCtryCcyTableObj().readISOCtryCcyByCtryIdx( getPKey().getRequiredISOCtryId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalComponentsCcy( boolean forceRead ) {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsISOCtry().getSchema()).getISOCtryCcyTableObj().readISOCtryCcyByCtryIdx( getPKey().getRequiredISOCtryId(),
			forceRead );
		return( retval );
	}

	public List<IYCFSecISOCtryLangObj> getOptionalComponentsLang() {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsISOCtry().getSchema()).getISOCtryLangTableObj().readISOCtryLangByCtryIdx( getPKey().getRequiredISOCtryId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryLangObj> getOptionalComponentsLang( boolean forceRead ) {
		List<IYCFSecISOCtryLangObj> retval;
		retval = ((IYCFIntSchemaObj)getOrigAsISOCtry().getSchema()).getISOCtryLangTableObj().readISOCtryLangByCtryIdx( getPKey().getRequiredISOCtryId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredISOCtryId( getPKey().getRequiredISOCtryId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCtryId( buff.getRequiredISOCtryId() );
	}

	public void copyBuffToOrig() {
		YCFSecISOCtryBuff origBuff = getOrigAsISOCtry().getISOCtryBuff();
		YCFSecISOCtryBuff myBuff = getISOCtryBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecISOCtryBuff origBuff = getOrigAsISOCtry().getISOCtryBuff();
		YCFSecISOCtryBuff myBuff = getISOCtryBuff();
		myBuff.set( origBuff );
	}
}

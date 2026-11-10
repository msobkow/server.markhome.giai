// Description: Java 11 edit object instance implementation for YCFSec ISOCcy.

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

public class YCFSecISOCcyEditObj
	implements IYCFSecISOCcyEditObj
{
	protected IYCFSecISOCcyObj orig;
	protected YCFSecISOCcyBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFSecISOCcyEditObj( IYCFSecISOCcyObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecISOCcyBuff origBuff = orig.getBuff();
		buff.set( origBuff );
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
		return( YCFSecISOCcyObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecISOCcyObj retobj = getSchema().getISOCcyTableObj().realiseISOCcy( (IYCFSecISOCcyObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsISOCcy().forget();
	}

	public IYCFSecISOCcyObj read() {
		IYCFSecISOCcyObj retval = getOrigAsISOCcy().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOCcyObj read( boolean forceRead ) {
		IYCFSecISOCcyObj retval = getOrigAsISOCcy().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOCcyObj create() {
		copyBuffToOrig();
		IYCFSecISOCcyObj retobj = ((IYCFSecSchemaObj)getOrigAsISOCcy().getSchema()).getISOCcyTableObj().createISOCcy( getOrigAsISOCcy() );
		if( retobj == getOrigAsISOCcy() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecISOCcyEditObj update() {
		getSchema().getISOCcyTableObj().updateISOCcy( (IYCFSecISOCcyObj)this );
		return( null );
	}

	public YCFSecISOCcyEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getISOCcyTableObj().deleteISOCcy( getOrigAsISOCcy() );
		return( null );
	}

	public IYCFSecISOCcyTableObj getISOCcyTable() {
		return( orig.getSchema().getISOCcyTableObj() );
	}

	public IYCFSecISOCcyEditObj getEdit() {
		return( (IYCFSecISOCcyEditObj)this );
	}

	public IYCFSecISOCcyEditObj getEditAsISOCcy() {
		return( (IYCFSecISOCcyEditObj)this );
	}

	public IYCFSecISOCcyEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecISOCcyObj getOrig() {
		return( orig );
	}

	public IYCFSecISOCcyObj getOrigAsISOCcy() {
		return( (IYCFSecISOCcyObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecISOCcyBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFSecSchema)getOrigAsISOCcy().getSchema().getBackingStore()).getFactoryISOCcy().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecISOCcyBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFSecISOCcyBuff getISOCcyBuff() {
		return( (YCFSecISOCcyBuff)getBuff() );
	}

	public YCFSecISOCcyPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecISOCcyPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public short getRequiredISOCcyId() {
		return( getPKey().getRequiredISOCcyId() );
	}

	public String getRequiredISOCode() {
		return( getISOCcyBuff().getRequiredISOCode() );
	}

	public void setRequiredISOCode( String value ) {
		if( getISOCcyBuff().getRequiredISOCode() != value ) {
			getISOCcyBuff().setRequiredISOCode( value );
		}
	}

	public String getRequiredName() {
		return( getISOCcyBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getISOCcyBuff().getRequiredName() != value ) {
			getISOCcyBuff().setRequiredName( value );
		}
	}

	public String getOptionalUnitSymbol() {
		return( getISOCcyBuff().getOptionalUnitSymbol() );
	}

	public void setOptionalUnitSymbol( String value ) {
		if( getISOCcyBuff().getOptionalUnitSymbol() != value ) {
			getISOCcyBuff().setOptionalUnitSymbol( value );
		}
	}

	public short getRequiredPrecis() {
		return( getISOCcyBuff().getRequiredPrecis() );
	}

	public void setRequiredPrecis( short value ) {
		if( getISOCcyBuff().getRequiredPrecis() != value ) {
			getISOCcyBuff().setRequiredPrecis( value );
		}
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalChildrenCtry() {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsISOCcy().getSchema()).getISOCtryCcyTableObj().readISOCtryCcyByCcyIdx( getPKey().getRequiredISOCcyId(),
			false );
		return( retval );
	}

	public List<IYCFSecISOCtryCcyObj> getOptionalChildrenCtry( boolean forceRead ) {
		List<IYCFSecISOCtryCcyObj> retval;
		retval = ((IYCFSecSchemaObj)getOrigAsISOCcy().getSchema()).getISOCtryCcyTableObj().readISOCtryCcyByCcyIdx( getPKey().getRequiredISOCcyId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredISOCcyId( getPKey().getRequiredISOCcyId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCcyId( buff.getRequiredISOCcyId() );
	}

	public void copyBuffToOrig() {
		YCFSecISOCcyBuff origBuff = getOrigAsISOCcy().getISOCcyBuff();
		YCFSecISOCcyBuff myBuff = getISOCcyBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecISOCcyBuff origBuff = getOrigAsISOCcy().getISOCcyBuff();
		YCFSecISOCcyBuff myBuff = getISOCcyBuff();
		myBuff.set( origBuff );
	}
}

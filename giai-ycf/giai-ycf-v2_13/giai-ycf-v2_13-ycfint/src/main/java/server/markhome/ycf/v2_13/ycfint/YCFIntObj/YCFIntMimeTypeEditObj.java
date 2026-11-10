// Description: Java 11 edit object instance implementation for YCFInt MimeType.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

public class YCFIntMimeTypeEditObj
	implements IYCFIntMimeTypeEditObj
{
	protected IYCFIntMimeTypeObj orig;
	protected YCFIntMimeTypeBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFIntMimeTypeEditObj( IYCFIntMimeTypeObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntMimeTypeBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntMimeTypeBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntMimeTypeBuff buff = getBuff();
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
		return( YCFIntMimeTypeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "MimeType" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
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

	public IYCFIntMimeTypeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntMimeTypeObj retobj = getSchema().getMimeTypeTableObj().realiseMimeType( (IYCFIntMimeTypeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsMimeType().forget();
	}

	public IYCFIntMimeTypeObj read() {
		IYCFIntMimeTypeObj retval = getOrigAsMimeType().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntMimeTypeObj read( boolean forceRead ) {
		IYCFIntMimeTypeObj retval = getOrigAsMimeType().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntMimeTypeObj create() {
		copyBuffToOrig();
		IYCFIntMimeTypeObj retobj = ((IYCFIntSchemaObj)getOrigAsMimeType().getSchema()).getMimeTypeTableObj().createMimeType( getOrigAsMimeType() );
		if( retobj == getOrigAsMimeType() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntMimeTypeEditObj update() {
		getSchema().getMimeTypeTableObj().updateMimeType( (IYCFIntMimeTypeObj)this );
		return( null );
	}

	public YCFIntMimeTypeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getMimeTypeTableObj().deleteMimeType( getOrigAsMimeType() );
		return( null );
	}

	public IYCFIntMimeTypeTableObj getMimeTypeTable() {
		return( orig.getSchema().getMimeTypeTableObj() );
	}

	public IYCFIntMimeTypeEditObj getEdit() {
		return( (IYCFIntMimeTypeEditObj)this );
	}

	public IYCFIntMimeTypeEditObj getEditAsMimeType() {
		return( (IYCFIntMimeTypeEditObj)this );
	}

	public IYCFIntMimeTypeEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntMimeTypeObj getOrig() {
		return( orig );
	}

	public IYCFIntMimeTypeObj getOrigAsMimeType() {
		return( (IYCFIntMimeTypeObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntMimeTypeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsMimeType().getSchema().getBackingStore()).getFactoryMimeType().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntMimeTypeBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFIntMimeTypeBuff getMimeTypeBuff() {
		return( (YCFIntMimeTypeBuff)getBuff() );
	}

	public YCFIntMimeTypePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntMimeTypePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public int getRequiredMimeTypeId() {
		return( getPKey().getRequiredMimeTypeId() );
	}

	public String getRequiredName() {
		return( getMimeTypeBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getMimeTypeBuff().getRequiredName() != value ) {
			getMimeTypeBuff().setRequiredName( value );
		}
	}

	public String getOptionalFileTypes() {
		return( getMimeTypeBuff().getOptionalFileTypes() );
	}

	public void setOptionalFileTypes( String value ) {
		if( getMimeTypeBuff().getOptionalFileTypes() != value ) {
			getMimeTypeBuff().setOptionalFileTypes( value );
		}
	}

	public void copyPKeyToBuff() {
		buff.setRequiredMimeTypeId( getPKey().getRequiredMimeTypeId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredMimeTypeId( buff.getRequiredMimeTypeId() );
	}

	public void copyBuffToOrig() {
		YCFIntMimeTypeBuff origBuff = getOrigAsMimeType().getMimeTypeBuff();
		YCFIntMimeTypeBuff myBuff = getMimeTypeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntMimeTypeBuff origBuff = getOrigAsMimeType().getMimeTypeBuff();
		YCFIntMimeTypeBuff myBuff = getMimeTypeBuff();
		myBuff.set( origBuff );
	}
}

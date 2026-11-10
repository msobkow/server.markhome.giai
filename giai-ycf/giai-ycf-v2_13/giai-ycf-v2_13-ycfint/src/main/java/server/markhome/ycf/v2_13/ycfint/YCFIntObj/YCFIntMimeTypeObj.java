// Description: Java 11 base object instance implementation for YCFInt MimeType.

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

public class YCFIntMimeTypeObj
	implements IYCFIntMimeTypeObj
{
	public final static String CLASS_CODE = "a103";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFIntMimeTypeEditObj edit;
	protected IYCFIntSchemaObj schema;
	protected YCFIntMimeTypePKey pKey;
	protected YCFIntMimeTypeBuff buff;

	public YCFIntMimeTypeObj() {
		isNew = true;
	}

	public YCFIntMimeTypeObj( IYCFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFIntMimeTypeObj retobj = ((IYCFIntSchemaObj)schema).getMimeTypeTableObj().realiseMimeType(
			(IYCFIntMimeTypeObj)this );
		return( (IYCFIntMimeTypeObj)retobj );
	}

	public void forget() {
		((IYCFIntSchemaObj)schema).getMimeTypeTableObj().reallyDeepDisposeMimeType( (IYCFIntMimeTypeObj)this );
	}

	public IYCFIntMimeTypeObj read() {
		IYCFIntMimeTypeObj retobj = ((IYCFIntSchemaObj)schema).getMimeTypeTableObj().readMimeTypeByIdIdx( getPKey().getRequiredMimeTypeId(), false );
		return( (IYCFIntMimeTypeObj)retobj );
	}

	public IYCFIntMimeTypeObj read( boolean forceRead ) {
		IYCFIntMimeTypeObj retobj = ((IYCFIntSchemaObj)schema).getMimeTypeTableObj().readMimeTypeByIdIdx( getPKey().getRequiredMimeTypeId(), forceRead );
		return( (IYCFIntMimeTypeObj)retobj );
	}

	public IYCFIntMimeTypeTableObj getMimeTypeTable() {
		return( ((IYCFIntSchemaObj)schema).getMimeTypeTableObj() );
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = value;
	}

	public YCFIntMimeTypeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMimeType().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFIntSchema)schema.getBackingStore()).getTableMimeType().readDerivedByIdIdx( ((IYCFIntSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredMimeTypeId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFIntMimeTypeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFIntMimeTypeBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFIntMimeTypeBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFIntMimeTypeBuff getMimeTypeBuff() {
		return( (YCFIntMimeTypeBuff)getBuff() );
	}

	public YCFIntMimeTypePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMimeType().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFIntMimeTypePKey value ) {
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

	public IYCFIntMimeTypeEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFIntMimeTypeObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFIntMimeTypeObj)this;
		}
		else {
			lockobj = ((IYCFIntSchemaObj)schema).getMimeTypeTableObj().lockMimeType( getPKey() );
		}
		edit = ((IYCFIntSchemaObj)schema).getMimeTypeTableObj().newEditInstance( lockobj );
		return( (IYCFIntMimeTypeEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFIntMimeTypeEditObj getEdit() {
		return( edit );
	}

	public IYCFIntMimeTypeEditObj getEditAsMimeType() {
		return( (IYCFIntMimeTypeEditObj)edit );
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

	public int getRequiredMimeTypeId() {
		return( getPKey().getRequiredMimeTypeId() );
	}

	public String getRequiredName() {
		return( getMimeTypeBuff().getRequiredName() );
	}

	public String getOptionalFileTypes() {
		return( getMimeTypeBuff().getOptionalFileTypes() );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredMimeTypeId( getPKey().getRequiredMimeTypeId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredMimeTypeId( buff.getRequiredMimeTypeId() );
	}
}

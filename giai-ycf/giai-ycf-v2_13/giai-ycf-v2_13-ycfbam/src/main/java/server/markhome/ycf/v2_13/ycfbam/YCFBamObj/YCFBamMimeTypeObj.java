// Description: Java 11 base object instance implementation for CFBam MimeType.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFInt.
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

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamMimeTypeObj
	implements ICFBamMimeTypeObj
{
	public final static String CLASS_CODE = "a103";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFIntMimeTypeEditObj edit;
	protected ICFIntSchemaObj schema;
	protected CFIntMimeTypePKey pKey;
	protected CFIntMimeTypeBuff buff;

	public CFBamMimeTypeObj() {
		isNew = true;
	}

	public CFBamMimeTypeObj( ICFIntSchemaObj argSchema ) {
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

	public ICFLibAnyObj getScope() {
		return( null );
	}

	public ICFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
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
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
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
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
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
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
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

	public ICFIntMimeTypeObj realise() {
		ICFIntMimeTypeObj retobj = ((ICFBamSchemaObj)schema).getMimeTypeTableObj().realiseMimeType(
			(ICFIntMimeTypeObj)this );
		return( (ICFIntMimeTypeObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getMimeTypeTableObj().reallyDeepDisposeMimeType( (ICFIntMimeTypeObj)this );
	}

	public ICFIntMimeTypeObj read() {
		ICFIntMimeTypeObj retobj = ((ICFBamSchemaObj)schema).getMimeTypeTableObj().readMimeTypeByIdIdx( getPKey().getRequiredMimeTypeId(), false );
		return( (ICFIntMimeTypeObj)retobj );
	}

	public ICFIntMimeTypeObj read( boolean forceRead ) {
		ICFIntMimeTypeObj retobj = ((ICFBamSchemaObj)schema).getMimeTypeTableObj().readMimeTypeByIdIdx( getPKey().getRequiredMimeTypeId(), forceRead );
		return( (ICFIntMimeTypeObj)retobj );
	}

	public ICFIntMimeTypeTableObj getMimeTypeTable() {
		return( ((ICFBamSchemaObj)schema).getMimeTypeTableObj() );
	}

	public ICFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFIntSchemaObj value ) {
		schema = value;
	}

	public CFIntMimeTypeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryMimeType().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableMimeType().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredMimeTypeId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFIntMimeTypeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFIntMimeTypeBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFIntMimeTypeBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public CFIntMimeTypeBuff getMimeTypeBuff() {
		return( (CFIntMimeTypeBuff)getBuff() );
	}

	public CFIntMimeTypePKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactoryMimeType().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFIntMimeTypePKey value ) {
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

	public ICFIntMimeTypeEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFIntMimeTypeObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFIntMimeTypeObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getMimeTypeTableObj().lockMimeType( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getMimeTypeTableObj().newEditInstance( lockobj );
		return( (ICFIntMimeTypeEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFIntMimeTypeEditObj getEdit() {
		return( edit );
	}

	public ICFIntMimeTypeEditObj getEditAsMimeType() {
		return( (ICFIntMimeTypeEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFIntMimeTypeBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFIntMimeTypeBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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

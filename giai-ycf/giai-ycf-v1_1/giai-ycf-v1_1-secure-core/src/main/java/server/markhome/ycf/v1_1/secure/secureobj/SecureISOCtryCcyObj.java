// Description: Java 25 base object instance implementation for ISOCtryCcy

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.secure.secureobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

public class SecureISOCtryCcyObj
	implements ISecureISOCtryCcyObj
{
	protected ISecureSecUserObj createdBy = null;
	protected ISecureSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ISecureISOCtryCcyEditObj edit;
	protected ISecureSchemaObj schema;
	protected ISecureISOCtryCcyPKey pKey;
	protected ISecureISOCtryCcy rec;
	protected ISecureISOCtryObj requiredContainerCtry;
	protected ISecureISOCcyObj requiredParentCcy;

	public SecureISOCtryCcyObj() {
		isNew = true;
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	public SecureISOCtryCcyObj( ISecureSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	@Override
	public int getClassCode() {
		return( ((ISecureSchemaObj)schema).getISOCtryCcyTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "ISOCtryCcy" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		ISecureISOCtryObj scope = getRequiredContainerCtry();
		return( scope );
	}

	@Override
	public String getObjName() {
		String objName;
		short val = rec.getRequiredISOCcyId();
		objName = Short.toString( val );
		return( objName );
	}

	@Override
	public ICFAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ISecureClusterObj ) {
					break;
				}
				else if( container instanceof ISecureTenantObj ) {
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
				if( container instanceof ISecureClusterObj ) {
					break;
				}
				else if( container instanceof ISecureTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	@Override
	public ICFAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
	}

	@Override
	public ICFAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFAnyObj subObj = null;
		ICFAnyObj retObj;
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

	@Override
	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ISecureClusterObj ) {
				container = null;
			}
			else if( container instanceof ISecureTenantObj ) {
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

	@Override
	public String getObjFullName() {
		String fullName = getObjName();
		ICFAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ISecureClusterObj ) {
				container = null;
			}
			else if( container instanceof ISecureTenantObj ) {
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

	@Override
	public ISecureISOCtryCcyObj realise() {
		ISecureISOCtryCcyObj retobj = ((ISecureSchemaObj)getSchema()).getISOCtryCcyTableObj().realiseISOCtryCcy(
			(ISecureISOCtryCcyObj)this );
		return( (ISecureISOCtryCcyObj)retobj );
	}

	@Override
	public void forget() {
		((ISecureSchemaObj)getSchema()).getISOCtryCcyTableObj().reallyDeepDisposeISOCtryCcy( (ISecureISOCtryCcyObj)this );
	}

	@Override
	public ISecureISOCtryCcyObj read() {
		ISecureISOCtryCcyObj retobj = ((ISecureSchemaObj)getSchema()).getISOCtryCcyTableObj().readISOCtryCcyByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOCcyId(), false );
		return( (ISecureISOCtryCcyObj)retobj );
	}

	@Override
	public ISecureISOCtryCcyObj read( boolean forceRead ) {
		ISecureISOCtryCcyObj retobj = ((ISecureSchemaObj)getSchema()).getISOCtryCcyTableObj().readISOCtryCcyByIdIdx( getPKey().getRequiredISOCtryId(),
			getPKey().getRequiredISOCcyId(), forceRead );
		return( (ISecureISOCtryCcyObj)retobj );
	}

	@Override
	public ISecureISOCtryCcyTableObj getISOCtryCcyTable() {
		return( ((ISecureSchemaObj)getSchema()).getISOCtryCcyTableObj() );
	}

	@Override
	public ISecureSchemaObj getSchema() {
		return( schema );
	}

	@Override
	public void setSchema( ISecureSchemaObj value ) {
		schema = value;
	}

	@Override
	public ISecureISOCtryCcy getRec() {
		if( rec == null ) {
			if( isNew ) {
				rec = getSchema().getSecureBackingStore().getSecureFactory().getFactoryISOCtryCcy().newRec();
			}
			else {
				// Read the data rec via the backing store
				rec = getSchema().getSecureBackingStore().getTableISOCtryCcy().readDerivedByIdIdx( ((ISecureSchemaObj)getSchema()).getAuthorization(),
						getPKey().getRequiredISOCtryId(),
						getPKey().getRequiredISOCcyId() );
				if( rec != null ) {
					copyRecToPKey();
				}
			}
		}
		return( rec );
	}

	@Override
	public void setRec( ISecureISOCtryCcy value ) {
		if( ! ( ( value == null ) || ! ( value instanceof ISecureISOCtryCcy ) ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRec",
				"value",
				value,
				"SecureISOCtryCcyRec" );
		}
		rec = value;
		copyRecToPKey();
		requiredContainerCtry = null;
		requiredParentCcy = null;
	}

	@Override
	public ISecureISOCtryCcy getISOCtryCcyRec() {
		return( (ISecureISOCtryCcy)getRec() );
	}

	@Override
	public ISecureISOCtryCcyPKey getPKey() {
		if( pKey == null ) {
			pKey = getSchema().getSecureBackingStore().getSecureFactory().getFactoryISOCtryCcy().newPKey();
		}
		return( pKey );
	}

	@Override
	public void setPKey( ISecureISOCtryCcyPKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToRec();
		}
	}

	@Override
	public boolean getIsNew() {
		return( isNew );
	}

	@Override
	public void setIsNew( boolean value ) {
		isNew = value;
	}

	@Override
	public ISecureISOCtryCcyEditObj beginEdit() {
		if( edit != null ) {
			throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
		}
		ISecureISOCtryCcyObj lockobj;
		if( getIsNew() ) {
			lockobj = (ISecureISOCtryCcyObj)this;
		}
		else {
			lockobj = ((ISecureSchemaObj)getSchema()).getISOCtryCcyTableObj().lockISOCtryCcy( getPKey() );
		}
		edit = ((ISecureSchemaObj)getSchema()).getISOCtryCcyTableObj().newEditInstance( lockobj );
		return( (ISecureISOCtryCcyEditObj)edit );
	}

	@Override
	public void endEdit() {
		edit = null;
	}

	@Override
	public ISecureISOCtryCcyEditObj getEdit() {
		return( edit );
	}

	@Override
	public ISecureISOCtryCcyEditObj getEditAsISOCtryCcy() {
		return( (ISecureISOCtryCcyEditObj)edit );
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			ISecureISOCtryCcy rec = getRec();
			createdBy = ((ISecureSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getCreatedByUserId() );
		}
		return( createdBy );
	}

	@Override
	public LocalDateTime getCreatedAt() {
		return( getRec().getCreatedAt() );
	}

	@Override
	public ISecureSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			ISecureISOCtryCcy rec = getRec();
			updatedBy = ((ISecureSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( getRec().getUpdatedAt() );
	}

	@Override
	public short getRequiredISOCtryId() {
		return( getPKey().getRequiredISOCtryId() );
	}

	@Override
	public short getRequiredISOCcyId() {
		return( getPKey().getRequiredISOCcyId() );
	}

	@Override
	public ISecureISOCtryObj getRequiredContainerCtry() {
		return( getRequiredContainerCtry( false ) );
	}

	@Override
	public ISecureISOCtryObj getRequiredContainerCtry( boolean forceRead ) {
		if( ( requiredContainerCtry == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCtry = ((ISecureSchemaObj)getSchema()).getISOCtryTableObj().readISOCtryByIdIdx( getPKey().getRequiredISOCtryId(), forceRead );
			}
		}
		return( requiredContainerCtry );
	}

	@Override
	public ISecureISOCcyObj getRequiredParentCcy() {
		return( getRequiredParentCcy( false ) );
	}

	@Override
	public ISecureISOCcyObj getRequiredParentCcy( boolean forceRead ) {
		if( ( requiredParentCcy == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentCcy = ((ISecureSchemaObj)getSchema()).getISOCcyTableObj().readISOCcyByIdIdx( getPKey().getRequiredISOCcyId(), forceRead );
			}
		}
		return( requiredParentCcy );
	}

	@Override
	public void copyPKeyToRec() {
		if( rec != null ) {
			rec.getPKey().setRequiredISOCtryId(getPKey().getRequiredISOCtryId());
			rec.getPKey().setRequiredISOCcyId(getPKey().getRequiredISOCcyId());
		}
		if( edit != null ) {
			edit.copyPKeyToRec();
		}
	}

	@Override
	public void copyRecToPKey() {
		if( rec != null ) {
			getPKey().setRequiredISOCtryId(rec.getPKey().getRequiredISOCtryId());
			getPKey().setRequiredISOCcyId(rec.getPKey().getRequiredISOCcyId());
		}
	}
}

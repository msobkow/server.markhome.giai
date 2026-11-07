// Description: Java 25 base object instance implementation for SecUserPWReset

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

public class SecureSecUserPWResetObj
	implements ISecureSecUserPWResetObj
{
	protected ISecureSecUserObj createdBy = null;
	protected ISecureSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ISecureSecUserPWResetEditObj edit;
	protected ISecureSchemaObj schema;
	protected $implCommaIJavaOptAtomType$ pKey;
	protected ISecureSecUserPWReset rec;
	protected ISecureSecUserObj requiredContainerUser;

	public SecureSecUserPWResetObj() {
		isNew = true;
		requiredContainerUser = null;
	}

	public SecureSecUserPWResetObj( ISecureSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerUser = null;
	}

	@Override
	public int getClassCode() {
		return( ((ISecureSchemaObj)schema).getSecUserPWResetTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "SecUserPWReset" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		ISecureSecUserObj scope = getRequiredContainerUser();
		return( scope );
	}

	@Override
	public String getObjName() {
		String objName;
		ICFUuid6 val = rec.getRequiredPasswordResetUuid6();
		if (val != null) {
			objName = val.toString();
		}
		else {
			objName = "";
		}
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
	public ISecureSecUserPWResetObj realise() {
		ISecureSecUserPWResetObj retobj = ((ISecureSchemaObj)getSchema()).getSecUserPWResetTableObj().realiseSecUserPWReset(
			(ISecureSecUserPWResetObj)this );
		return( (ISecureSecUserPWResetObj)retobj );
	}

	@Override
	public void forget() {
		((ISecureSchemaObj)getSchema()).getSecUserPWResetTableObj().reallyDeepDisposeSecUserPWReset( (ISecureSecUserPWResetObj)this );
	}

	@Override
	public ISecureSecUserPWResetObj read() {
		ISecureSecUserPWResetObj retobj = ((ISecureSchemaObj)getSchema()).getSecUserPWResetTableObj().readSecUserPWResetByIdIdx( getPKey(), false );
		return( (ISecureSecUserPWResetObj)retobj );
	}

	@Override
	public ISecureSecUserPWResetObj read( boolean forceRead ) {
		ISecureSecUserPWResetObj retobj = ((ISecureSchemaObj)getSchema()).getSecUserPWResetTableObj().readSecUserPWResetByIdIdx( getPKey(), forceRead );
		return( (ISecureSecUserPWResetObj)retobj );
	}

	@Override
	public ISecureSecUserPWResetTableObj getSecUserPWResetTable() {
		return( ((ISecureSchemaObj)getSchema()).getSecUserPWResetTableObj() );
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
	public ISecureSecUserPWReset getRec() {
		if( rec == null ) {
			if( isNew ) {
				rec = getSchema().getSecureBackingStore().getSecureFactory().getFactorySecUserPWReset().newRec();
			}
			else {
				// Read the data rec via the backing store
				rec = getSchema().getSecureBackingStore().getTableSecUserPWReset().readDerivedByIdIdx( ((ISecureSchemaObj)getSchema()).getAuthorization(),
						getPKey() );
				if( rec != null ) {
					copyRecToPKey();
				}
			}
		}
		return( rec );
	}

	@Override
	public void setRec( ISecureSecUserPWReset value ) {
		if( ! ( ( value == null ) || ! ( value instanceof ISecureSecUserPWReset ) ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRec",
				"value",
				value,
				"SecureSecUserPWResetRec" );
		}
		rec = value;
		copyRecToPKey();
		requiredContainerUser = null;
	}

	@Override
	public ISecureSecUserPWReset getSecUserPWResetRec() {
		return( (ISecureSecUserPWReset)getRec() );
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return( pKey );
	}

	@Override
	public void setPKey( $implCommaIJavaOptAtomType$ value ) {
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
	public ISecureSecUserPWResetEditObj beginEdit() {
		if( edit != null ) {
			throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
		}
		ISecureSecUserPWResetObj lockobj;
		if( getIsNew() ) {
			lockobj = (ISecureSecUserPWResetObj)this;
		}
		else {
			lockobj = ((ISecureSchemaObj)getSchema()).getSecUserPWResetTableObj().lockSecUserPWReset( getPKey() );
		}
		edit = ((ISecureSchemaObj)getSchema()).getSecUserPWResetTableObj().newEditInstance( lockobj );
		return( (ISecureSecUserPWResetEditObj)edit );
	}

	@Override
	public void endEdit() {
		edit = null;
	}

	@Override
	public ISecureSecUserPWResetEditObj getEdit() {
		return( edit );
	}

	@Override
	public ISecureSecUserPWResetEditObj getEditAsSecUserPWReset() {
		return( (ISecureSecUserPWResetEditObj)edit );
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			ISecureSecUserPWReset rec = getRec();
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
			ISecureSecUserPWReset rec = getRec();
			updatedBy = ((ISecureSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( getRec().getUpdatedAt() );
	}

	@Override
	public ICFKeyHash256 getRequiredSecUserId() {
		return( getPKey() );
	}

	@Override
	public ISecureSecUserObj getRequiredContainerUser() {
		return( getRequiredContainerUser( false ) );
	}

	@Override
	public ISecureSecUserObj getRequiredContainerUser( boolean forceRead ) {
		if( ( requiredContainerUser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerUser = ((ISecureSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( getPKey(), forceRead );
			}
		}
		return( requiredContainerUser );
	}

	@Override
	public String getRequiredSentToEMailAddr() {
		return( getSecUserPWResetRec().getRequiredSentToEMailAddr() );
	}

	@Override
	public ICFUuid6 getRequiredPasswordResetUuid6() {
		return( getSecUserPWResetRec().getRequiredPasswordResetUuid6() );
	}

	@Override
	public boolean getRequiredNewAccount() {
		return( getSecUserPWResetRec().getRequiredNewAccount() );
	}

	@Override
	public void copyPKeyToRec() {
		if( rec != null ) {
			if (getPKey() != rec.getPKey()) {
				rec.setPKey(getPKey());
			}
		}
		if( edit != null ) {
			edit.copyPKeyToRec();
		}
	}

	@Override
	public void copyRecToPKey() {
		if( rec != null ) {
			if (getPKey() != rec.getPKey()) {
				setPKey(rec.getPKey());
			}
		}
	}
}

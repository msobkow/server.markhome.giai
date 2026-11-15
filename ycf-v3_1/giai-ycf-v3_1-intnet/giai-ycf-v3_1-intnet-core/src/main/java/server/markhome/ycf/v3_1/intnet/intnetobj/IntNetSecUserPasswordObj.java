// Description: Java 25 base object instance implementation for SecUserPassword

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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public class IntNetSecUserPasswordObj
	implements IIntNetSecUserPasswordObj
{
	protected boolean isNew;
	protected ISecureSecUserPasswordEditObj edit;
	protected ISecureSchemaObj schema;
	protected $implCommaIJavaOptAtomType$ pKey;
	protected ISecureSecUserPassword rec;
	protected ISecureSecUserObj requiredContainerUser;

	public IntNetSecUserPasswordObj() {
		isNew = true;
		requiredContainerUser = null;
	}

	public IntNetSecUserPasswordObj( ISecureSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerUser = null;
	}

	@Override
	public int getClassCode() {
		return( ((ISecureSchemaObj)schema).getSecUserPasswordTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "SecUserPassword" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		ISecureSecUserObj scope = getRequiredContainerUser();
		return( scope );
	}

	@Override
	public String getObjName() {
		String objName;
		CFDbKeyHash256 val = rec.getRequiredSecUserId();
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
				if( container instanceof IIntNetClusterObj ) {
					break;
				}
				else if( container instanceof IIntNetTenantObj ) {
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
				if( container instanceof IIntNetClusterObj ) {
					break;
				}
				else if( container instanceof IIntNetTenantObj ) {
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
	public ISecureSecUserPasswordObj realise() {
		ISecureSecUserPasswordObj retobj = ((IIntNetSchemaObj)getSchema()).getSecUserPasswordTableObj().realiseSecUserPassword(
			(ISecureSecUserPasswordObj)this );
		return( (ISecureSecUserPasswordObj)retobj );
	}

	@Override
	public void forget() {
		((IIntNetSchemaObj)getSchema()).getSecUserPasswordTableObj().reallyDeepDisposeSecUserPassword( (ISecureSecUserPasswordObj)this );
	}

	@Override
	public ISecureSecUserPasswordObj read() {
		ISecureSecUserPasswordObj retobj = ((IIntNetSchemaObj)getSchema()).getSecUserPasswordTableObj().readSecUserPasswordByIdIdx( getPKey(), false );
		return( (ISecureSecUserPasswordObj)retobj );
	}

	@Override
	public ISecureSecUserPasswordObj read( boolean forceRead ) {
		ISecureSecUserPasswordObj retobj = ((IIntNetSchemaObj)getSchema()).getSecUserPasswordTableObj().readSecUserPasswordByIdIdx( getPKey(), forceRead );
		return( (ISecureSecUserPasswordObj)retobj );
	}

	@Override
	public ISecureSecUserPasswordTableObj getSecUserPasswordTable() {
		return( ((IIntNetSchemaObj)getSchema()).getSecUserPasswordTableObj() );
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
	public ISecureSecUserPassword getRec() {
		if( rec == null ) {
			if( isNew ) {
				rec = getSchema().getSecureBackingStore().getSecureFactory().getFactorySecUserPassword().newRec();
			}
			else {
				// Read the data rec via the backing store
				rec = getSchema().getSecureBackingStore().getTableSecUserPassword().readDerivedByIdIdx( ((IIntNetSchemaObj)getSchema()).getAuthorization(),
						getPKey() );
				if( rec != null ) {
					copyRecToPKey();
				}
			}
		}
		return( rec );
	}

	@Override
	public void setRec( ISecureSecUserPassword value ) {
		if( ! ( ( value == null ) || ! ( value instanceof ISecureSecUserPassword ) ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRec",
				"value",
				value,
				"SecureSecUserPasswordRec" );
		}
		rec = value;
		copyRecToPKey();
		requiredContainerUser = null;
	}

	@Override
	public ISecureSecUserPassword getSecUserPasswordRec() {
		return( (ISecureSecUserPassword)getRec() );
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
	public ISecureSecUserPasswordEditObj beginEdit() {
		if( edit != null ) {
			throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
		}
		ISecureSecUserPasswordObj lockobj;
		if( getIsNew() ) {
			lockobj = (ISecureSecUserPasswordObj)this;
		}
		else {
			lockobj = ((IIntNetSchemaObj)getSchema()).getSecUserPasswordTableObj().lockSecUserPassword( getPKey() );
		}
		edit = ((IIntNetSchemaObj)getSchema()).getSecUserPasswordTableObj().newEditInstance( lockobj );
		return( (ISecureSecUserPasswordEditObj)edit );
	}

	@Override
	public void endEdit() {
		edit = null;
	}

	@Override
	public ISecureSecUserPasswordEditObj getEdit() {
		return( edit );
	}

	@Override
	public ISecureSecUserPasswordEditObj getEditAsSecUserPassword() {
		return( (ISecureSecUserPasswordEditObj)edit );
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
				requiredContainerUser = ((IIntNetSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( getPKey(), forceRead );
			}
		}
		return( requiredContainerUser );
	}

	@Override
	public LocalDateTime getRequiredPWSetStamp() {
		return( getSecUserPasswordRec().getRequiredPWSetStamp() );
	}

	@Override
	public String getRequiredPasswordHash() {
		return( getSecUserPasswordRec().getRequiredPasswordHash() );
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

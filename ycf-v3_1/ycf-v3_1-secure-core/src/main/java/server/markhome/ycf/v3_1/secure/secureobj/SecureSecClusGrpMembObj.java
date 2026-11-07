// Description: Java 25 base object instance implementation for SecClusGrpMemb

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

public class SecureSecClusGrpMembObj
	implements ISecureSecClusGrpMembObj
{
	protected ISecureSecUserObj createdBy = null;
	protected ISecureSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ISecureSecClusGrpMembEditObj edit;
	protected ISecureSchemaObj schema;
	protected ISecureSecClusGrpMembPKey pKey;
	protected ISecureSecClusGrpMemb rec;
	protected ISecureSecClusGrpObj requiredContainerGroup;
	protected ISecureSecUserObj requiredParentUser;

	public SecureSecClusGrpMembObj() {
		isNew = true;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public SecureSecClusGrpMembObj( ISecureSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	@Override
	public int getClassCode() {
		return( ((ISecureSchemaObj)schema).getSecClusGrpMembTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "SecClusGrpMemb" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		ISecureSecClusGrpObj scope = getRequiredContainerGroup();
		return( scope );
	}

	@Override
	public String getObjName() {
		String objName;
		objName = getRequiredLoginId();
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
	public ISecureSecClusGrpMembObj realise() {
		ISecureSecClusGrpMembObj retobj = ((ISecureSchemaObj)getSchema()).getSecClusGrpMembTableObj().realiseSecClusGrpMemb(
			(ISecureSecClusGrpMembObj)this );
		return( (ISecureSecClusGrpMembObj)retobj );
	}

	@Override
	public void forget() {
		((ISecureSchemaObj)getSchema()).getSecClusGrpMembTableObj().reallyDeepDisposeSecClusGrpMemb( (ISecureSecClusGrpMembObj)this );
	}

	@Override
	public ISecureSecClusGrpMembObj read() {
		ISecureSecClusGrpMembObj retobj = ((ISecureSchemaObj)getSchema()).getSecClusGrpMembTableObj().readSecClusGrpMembByIdIdx( getPKey().getRequiredSecClusGrpId(),
			getPKey().getRequiredLoginId(), false );
		return( (ISecureSecClusGrpMembObj)retobj );
	}

	@Override
	public ISecureSecClusGrpMembObj read( boolean forceRead ) {
		ISecureSecClusGrpMembObj retobj = ((ISecureSchemaObj)getSchema()).getSecClusGrpMembTableObj().readSecClusGrpMembByIdIdx( getPKey().getRequiredSecClusGrpId(),
			getPKey().getRequiredLoginId(), forceRead );
		return( (ISecureSecClusGrpMembObj)retobj );
	}

	@Override
	public ISecureSecClusGrpMembTableObj getSecClusGrpMembTable() {
		return( ((ISecureSchemaObj)getSchema()).getSecClusGrpMembTableObj() );
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
	public ISecureSecClusGrpMemb getRec() {
		if( rec == null ) {
			if( isNew ) {
				rec = getSchema().getSecureBackingStore().getSecureFactory().getFactorySecClusGrpMemb().newRec();
			}
			else {
				// Read the data rec via the backing store
				rec = getSchema().getSecureBackingStore().getTableSecClusGrpMemb().readDerivedByIdIdx( ((ISecureSchemaObj)getSchema()).getAuthorization(),
						getPKey().getRequiredSecClusGrpId(),
						getPKey().getRequiredLoginId() );
				if( rec != null ) {
					copyRecToPKey();
				}
			}
		}
		return( rec );
	}

	@Override
	public void setRec( ISecureSecClusGrpMemb value ) {
		if( ! ( ( value == null ) || ! ( value instanceof ISecureSecClusGrpMemb ) ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRec",
				"value",
				value,
				"SecureSecClusGrpMembRec" );
		}
		rec = value;
		copyRecToPKey();
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	@Override
	public ISecureSecClusGrpMemb getSecClusGrpMembRec() {
		return( (ISecureSecClusGrpMemb)getRec() );
	}

	@Override
	public ISecureSecClusGrpMembPKey getPKey() {
		if( pKey == null ) {
			pKey = getSchema().getSecureBackingStore().getSecureFactory().getFactorySecClusGrpMemb().newPKey();
		}
		return( pKey );
	}

	@Override
	public void setPKey( ISecureSecClusGrpMembPKey value ) {
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
	public ISecureSecClusGrpMembEditObj beginEdit() {
		if( edit != null ) {
			throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
		}
		ISecureSecClusGrpMembObj lockobj;
		if( getIsNew() ) {
			lockobj = (ISecureSecClusGrpMembObj)this;
		}
		else {
			lockobj = ((ISecureSchemaObj)getSchema()).getSecClusGrpMembTableObj().lockSecClusGrpMemb( getPKey() );
		}
		edit = ((ISecureSchemaObj)getSchema()).getSecClusGrpMembTableObj().newEditInstance( lockobj );
		return( (ISecureSecClusGrpMembEditObj)edit );
	}

	@Override
	public void endEdit() {
		edit = null;
	}

	@Override
	public ISecureSecClusGrpMembEditObj getEdit() {
		return( edit );
	}

	@Override
	public ISecureSecClusGrpMembEditObj getEditAsSecClusGrpMemb() {
		return( (ISecureSecClusGrpMembEditObj)edit );
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			ISecureSecClusGrpMemb rec = getRec();
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
			ISecureSecClusGrpMemb rec = getRec();
			updatedBy = ((ISecureSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( getRec().getUpdatedAt() );
	}

	@Override
	public ICFKeyHash256 getRequiredSecClusGrpId() {
		return( getPKey().getRequiredSecClusGrpId() );
	}

	@Override
	public String getRequiredLoginId() {
		return( getPKey().getRequiredLoginId() );
	}

	@Override
	public ISecureSecClusGrpObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	@Override
	public ISecureSecClusGrpObj getRequiredContainerGroup( boolean forceRead ) {
		if( ( requiredContainerGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerGroup = ((ISecureSchemaObj)getSchema()).getSecClusGrpTableObj().readSecClusGrpByIdIdx( getPKey().getRequiredSecClusGrpId(), forceRead );
			}
		}
		return( requiredContainerGroup );
	}

	@Override
	public ISecureSecUserObj getRequiredParentUser() {
		return( getRequiredParentUser( false ) );
	}

	@Override
	public ISecureSecUserObj getRequiredParentUser( boolean forceRead ) {
		if( ( requiredParentUser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentUser = ((ISecureSchemaObj)getSchema()).getSecUserTableObj().readSecUserByULoginIdx( getPKey().getRequiredLoginId(), forceRead );
			}
		}
		return( requiredParentUser );
	}

	@Override
	public void copyPKeyToRec() {
		if( rec != null ) {
			rec.getPKey().setRequiredSecClusGrpId(getPKey().getRequiredSecClusGrpId());
			rec.getPKey().setRequiredLoginId(getPKey().getRequiredLoginId());
		}
		if( edit != null ) {
			edit.copyPKeyToRec();
		}
	}

	@Override
	public void copyRecToPKey() {
		if( rec != null ) {
			getPKey().setRequiredSecClusGrpId(rec.getPKey().getRequiredSecClusGrpId());
			getPKey().setRequiredLoginId(rec.getPKey().getRequiredLoginId());
		}
	}
}

// Description: Java 25 base object instance implementation for SecSysGrpMemb

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

package server.markhome.ycf.v3_1.busmodel.busmodelobj;

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

public class BusModelSecSysGrpMembObj
	implements IBusModelSecSysGrpMembObj
{
	protected ISecureSecUserObj createdBy = null;
	protected ISecureSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ISecureSecSysGrpMembEditObj edit;
	protected ISecureSchemaObj schema;
	protected ISecureSecSysGrpMembPKey pKey;
	protected ISecureSecSysGrpMemb rec;
	protected ISecureSecSysGrpObj requiredContainerGroup;
	protected ISecureSecUserObj requiredParentUser;

	public BusModelSecSysGrpMembObj() {
		isNew = true;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	public BusModelSecSysGrpMembObj( ISecureSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	@Override
	public int getClassCode() {
		return( ((ISecureSchemaObj)schema).getSecSysGrpMembTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "SecSysGrpMemb" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		ISecureSecSysGrpObj scope = getRequiredContainerGroup();
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
				if( container instanceof IBusModelClusterObj ) {
					break;
				}
				else if( container instanceof IBusModelTenantObj ) {
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
				if( container instanceof IBusModelClusterObj ) {
					break;
				}
				else if( container instanceof IBusModelTenantObj ) {
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
	public ISecureSecSysGrpMembObj realise() {
		ISecureSecSysGrpMembObj retobj = ((IBusModelSchemaObj)getSchema()).getSecSysGrpMembTableObj().realiseSecSysGrpMemb(
			(ISecureSecSysGrpMembObj)this );
		return( (ISecureSecSysGrpMembObj)retobj );
	}

	@Override
	public void forget() {
		((IBusModelSchemaObj)getSchema()).getSecSysGrpMembTableObj().reallyDeepDisposeSecSysGrpMemb( (ISecureSecSysGrpMembObj)this );
	}

	@Override
	public ISecureSecSysGrpMembObj read() {
		ISecureSecSysGrpMembObj retobj = ((IBusModelSchemaObj)getSchema()).getSecSysGrpMembTableObj().readSecSysGrpMembByIdIdx( getPKey().getRequiredSecSysGrpId(),
			getPKey().getRequiredLoginId(), false );
		return( (ISecureSecSysGrpMembObj)retobj );
	}

	@Override
	public ISecureSecSysGrpMembObj read( boolean forceRead ) {
		ISecureSecSysGrpMembObj retobj = ((IBusModelSchemaObj)getSchema()).getSecSysGrpMembTableObj().readSecSysGrpMembByIdIdx( getPKey().getRequiredSecSysGrpId(),
			getPKey().getRequiredLoginId(), forceRead );
		return( (ISecureSecSysGrpMembObj)retobj );
	}

	@Override
	public ISecureSecSysGrpMembTableObj getSecSysGrpMembTable() {
		return( ((IBusModelSchemaObj)getSchema()).getSecSysGrpMembTableObj() );
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
	public ISecureSecSysGrpMemb getRec() {
		if( rec == null ) {
			if( isNew ) {
				rec = getSchema().getSecureBackingStore().getSecureFactory().getFactorySecSysGrpMemb().newRec();
			}
			else {
				// Read the data rec via the backing store
				rec = getSchema().getSecureBackingStore().getTableSecSysGrpMemb().readDerivedByIdIdx( ((IBusModelSchemaObj)getSchema()).getAuthorization(),
						getPKey().getRequiredSecSysGrpId(),
						getPKey().getRequiredLoginId() );
				if( rec != null ) {
					copyRecToPKey();
				}
			}
		}
		return( rec );
	}

	@Override
	public void setRec( ISecureSecSysGrpMemb value ) {
		if( ! ( ( value == null ) || ! ( value instanceof ISecureSecSysGrpMemb ) ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRec",
				"value",
				value,
				"SecureSecSysGrpMembRec" );
		}
		rec = value;
		copyRecToPKey();
		requiredContainerGroup = null;
		requiredParentUser = null;
	}

	@Override
	public ISecureSecSysGrpMemb getSecSysGrpMembRec() {
		return( (ISecureSecSysGrpMemb)getRec() );
	}

	@Override
	public ISecureSecSysGrpMembPKey getPKey() {
		if( pKey == null ) {
			pKey = getSchema().getSecureBackingStore().getSecureFactory().getFactorySecSysGrpMemb().newPKey();
		}
		return( pKey );
	}

	@Override
	public void setPKey( ISecureSecSysGrpMembPKey value ) {
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
	public ISecureSecSysGrpMembEditObj beginEdit() {
		if( edit != null ) {
			throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
		}
		ISecureSecSysGrpMembObj lockobj;
		if( getIsNew() ) {
			lockobj = (ISecureSecSysGrpMembObj)this;
		}
		else {
			lockobj = ((IBusModelSchemaObj)getSchema()).getSecSysGrpMembTableObj().lockSecSysGrpMemb( getPKey() );
		}
		edit = ((IBusModelSchemaObj)getSchema()).getSecSysGrpMembTableObj().newEditInstance( lockobj );
		return( (ISecureSecSysGrpMembEditObj)edit );
	}

	@Override
	public void endEdit() {
		edit = null;
	}

	@Override
	public ISecureSecSysGrpMembEditObj getEdit() {
		return( edit );
	}

	@Override
	public ISecureSecSysGrpMembEditObj getEditAsSecSysGrpMemb() {
		return( (ISecureSecSysGrpMembEditObj)edit );
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			ISecureSecSysGrpMemb rec = getRec();
			createdBy = ((IBusModelSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getCreatedByUserId() );
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
			ISecureSecSysGrpMemb rec = getRec();
			updatedBy = ((IBusModelSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( getRec().getUpdatedAt() );
	}

	@Override
	public ICFKeyHash256 getRequiredSecSysGrpId() {
		return( getPKey().getRequiredSecSysGrpId() );
	}

	@Override
	public String getRequiredLoginId() {
		return( getPKey().getRequiredLoginId() );
	}

	@Override
	public ISecureSecSysGrpObj getRequiredContainerGroup() {
		return( getRequiredContainerGroup( false ) );
	}

	@Override
	public ISecureSecSysGrpObj getRequiredContainerGroup( boolean forceRead ) {
		if( ( requiredContainerGroup == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerGroup = ((IBusModelSchemaObj)getSchema()).getSecSysGrpTableObj().readSecSysGrpByIdIdx( getPKey().getRequiredSecSysGrpId(), forceRead );
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
				requiredParentUser = ((IBusModelSchemaObj)getSchema()).getSecUserTableObj().readSecUserByULoginIdx( getPKey().getRequiredLoginId(), forceRead );
			}
		}
		return( requiredParentUser );
	}

	@Override
	public void copyPKeyToRec() {
		if( rec != null ) {
			rec.getPKey().setRequiredSecSysGrpId(getPKey().getRequiredSecSysGrpId());
			rec.getPKey().setRequiredLoginId(getPKey().getRequiredLoginId());
		}
		if( edit != null ) {
			edit.copyPKeyToRec();
		}
	}

	@Override
	public void copyRecToPKey() {
		if( rec != null ) {
			getPKey().setRequiredSecSysGrpId(rec.getPKey().getRequiredSecSysGrpId());
			getPKey().setRequiredLoginId(rec.getPKey().getRequiredLoginId());
		}
	}
}

// Description: Java 25 base object instance implementation for Cluster

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

public class SecureClusterObj
	implements ISecureClusterObj
{
	protected ISecureSecUserObj createdBy = null;
	protected ISecureSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ISecureClusterEditObj edit;
	protected ISecureSchemaObj schema;
	protected $implCommaIJavaOptAtomType$ pKey;
	protected ISecureCluster rec;
	protected List<ISecureTenantObj> optionalComponentsTenant;
	protected List<ISecureSecClusGrpObj> optionalComponentsSecGroup;
	protected List<ISecureSecClusRoleObj> optionalComponentsSecRole;
	protected List<ISecureSysClusterObj> optionalComponentsSysCluster;

	public SecureClusterObj() {
		isNew = true;
	}

	public SecureClusterObj( ISecureSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	@Override
	public int getClassCode() {
		return( ((ISecureSchemaObj)schema).getClusterTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "Cluster" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		return( null );
	}

	@Override
	public String getObjName() {
		String objName;
		objName = getRequiredFullDomName();
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
		if( subObj == null ) {
			try {
				if (nextName == null) {
					throw new CFNullArgumentException(getClass(), "getNamedObject", 0, "RequiredTenantName");
				}
				String natNextName = nextName;
				subObj = ((ISecureSchemaObj)getSchema()).getTenantTableObj().readTenantByUNameIdx( getRequiredId(),
				natNextName, false );
			}
			catch (Throwable th) {
				subObj = null;
			}
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
	public ISecureClusterObj realise() {
		ISecureClusterObj retobj = ((ISecureSchemaObj)getSchema()).getClusterTableObj().realiseCluster(
			(ISecureClusterObj)this );
		return( (ISecureClusterObj)retobj );
	}

	@Override
	public void forget() {
		((ISecureSchemaObj)getSchema()).getClusterTableObj().reallyDeepDisposeCluster( (ISecureClusterObj)this );
	}

	@Override
	public ISecureClusterObj read() {
		ISecureClusterObj retobj = ((ISecureSchemaObj)getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey(), false );
		return( (ISecureClusterObj)retobj );
	}

	@Override
	public ISecureClusterObj read( boolean forceRead ) {
		ISecureClusterObj retobj = ((ISecureSchemaObj)getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey(), forceRead );
		return( (ISecureClusterObj)retobj );
	}

	@Override
	public ISecureClusterTableObj getClusterTable() {
		return( ((ISecureSchemaObj)getSchema()).getClusterTableObj() );
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
	public ISecureCluster getRec() {
		if( rec == null ) {
			if( isNew ) {
				rec = getSchema().getSecureBackingStore().getSecureFactory().getFactoryCluster().newRec();
			}
			else {
				// Read the data rec via the backing store
				rec = getSchema().getSecureBackingStore().getTableCluster().readDerivedByIdIdx( ((ISecureSchemaObj)getSchema()).getAuthorization(),
						getPKey() );
				if( rec != null ) {
					copyRecToPKey();
				}
			}
		}
		return( rec );
	}

	@Override
	public void setRec( ISecureCluster value ) {
		if( ! ( ( value == null ) || ! ( value instanceof ISecureCluster ) ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRec",
				"value",
				value,
				"SecureClusterRec" );
		}
		rec = value;
		copyRecToPKey();
	}

	@Override
	public ISecureCluster getClusterRec() {
		return( (ISecureCluster)getRec() );
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
	public ISecureClusterEditObj beginEdit() {
		if( edit != null ) {
			throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
		}
		ISecureClusterObj lockobj;
		if( getIsNew() ) {
			lockobj = (ISecureClusterObj)this;
		}
		else {
			lockobj = ((ISecureSchemaObj)getSchema()).getClusterTableObj().lockCluster( getPKey() );
		}
		edit = ((ISecureSchemaObj)getSchema()).getClusterTableObj().newEditInstance( lockobj );
		return( (ISecureClusterEditObj)edit );
	}

	@Override
	public void endEdit() {
		edit = null;
	}

	@Override
	public ISecureClusterEditObj getEdit() {
		return( edit );
	}

	@Override
	public ISecureClusterEditObj getEditAsCluster() {
		return( (ISecureClusterEditObj)edit );
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			ISecureCluster rec = getRec();
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
			ISecureCluster rec = getRec();
			updatedBy = ((ISecureSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	@Override
	public LocalDateTime getUpdatedAt() {
		return( getRec().getUpdatedAt() );
	}

	@Override
	public ICFKeyHash256 getRequiredId() {
		return( getPKey() );
	}

	@Override
	public List<ISecureTenantObj> getOptionalComponentsTenant() {
		List<ISecureTenantObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getTenantTableObj().readTenantByClusterIdx( getPKey(),
			false );
		return( retval );
	}

	@Override
	public List<ISecureTenantObj> getOptionalComponentsTenant( boolean forceRead ) {
		List<ISecureTenantObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getTenantTableObj().readTenantByClusterIdx( getPKey(),
			forceRead );
		return( retval );
	}

	@Override
	public List<ISecureSecClusGrpObj> getOptionalComponentsSecGroup() {
		List<ISecureSecClusGrpObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getSecClusGrpTableObj().readSecClusGrpByClusterIdx( getPKey(),
			false );
		return( retval );
	}

	@Override
	public List<ISecureSecClusGrpObj> getOptionalComponentsSecGroup( boolean forceRead ) {
		List<ISecureSecClusGrpObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getSecClusGrpTableObj().readSecClusGrpByClusterIdx( getPKey(),
			forceRead );
		return( retval );
	}

	@Override
	public List<ISecureSecClusRoleObj> getOptionalComponentsSecRole() {
		List<ISecureSecClusRoleObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getSecClusRoleTableObj().readSecClusRoleByClusterIdx( getPKey(),
			false );
		return( retval );
	}

	@Override
	public List<ISecureSecClusRoleObj> getOptionalComponentsSecRole( boolean forceRead ) {
		List<ISecureSecClusRoleObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getSecClusRoleTableObj().readSecClusRoleByClusterIdx( getPKey(),
			forceRead );
		return( retval );
	}

	@Override
	public List<ISecureSysClusterObj> getOptionalComponentsSysCluster() {
		List<ISecureSysClusterObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey(),
			false );
		return( retval );
	}

	@Override
	public List<ISecureSysClusterObj> getOptionalComponentsSysCluster( boolean forceRead ) {
		List<ISecureSysClusterObj> retval;
		retval = ((ISecureSchemaObj)getSchema()).getSysClusterTableObj().readSysClusterByClusterIdx( getPKey(),
			forceRead );
		return( retval );
	}

	@Override
	public String getRequiredFullDomName() {
		return( getClusterRec().getRequiredFullDomName() );
	}

	@Override
	public String getRequiredDescription() {
		return( getClusterRec().getRequiredDescription() );
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

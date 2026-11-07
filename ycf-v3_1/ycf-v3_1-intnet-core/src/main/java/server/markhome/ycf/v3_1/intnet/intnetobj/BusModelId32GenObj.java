// Description: Java 25 base object instance implementation for Id32Gen

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public class BusModelId32GenObj
	extends BusModelInt32TypeObj
	implements IBusModelId32GenObj
{

	public BusModelId32GenObj() {
		super();
	}

	public BusModelId32GenObj( IBusModelSchemaObj argSchema ) {
		super( argSchema );
	}

	@Override
	public int getClassCode() {
		return( ((IBusModelSchemaObj)schema).getId32GenTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "Id32Gen" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	@Override
	public String getObjName() {
		String objName;
		objName = getRequiredName();
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
			else if( container instanceof IBusModelSchemaDefObj ) {
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
	public IBusModelValueObj realise() {
		IBusModelId32GenObj retobj = ((IBusModelSchemaObj)getSchema()).getId32GenTableObj().realiseId32Gen(
			(IBusModelId32GenObj)this );
		return( (IBusModelValueObj)retobj );
	}

	@Override
	public void forget() {
		((IBusModelSchemaObj)getSchema()).getId32GenTableObj().reallyDeepDisposeId32Gen( (IBusModelId32GenObj)this );
	}

	@Override
	public IBusModelValueObj read() {
		IBusModelId32GenObj retobj = ((IBusModelSchemaObj)getSchema()).getId32GenTableObj().readId32GenByIdIdx( getPKey(), false );
		return( (IBusModelValueObj)retobj );
	}

	@Override
	public IBusModelValueObj read( boolean forceRead ) {
		IBusModelId32GenObj retobj = ((IBusModelSchemaObj)getSchema()).getId32GenTableObj().readId32GenByIdIdx( getPKey(), forceRead );
		return( (IBusModelValueObj)retobj );
	}

	@Override
	public IBusModelValueObj moveUp() {
		IBusModelId32GenObj retobj = ((IBusModelSchemaObj)getSchema()).getId32GenTableObj().moveUpId32Gen( this );
		return( (IBusModelValueObj)retobj );
	}

	@Override
	public IBusModelValueObj moveDown() {
		IBusModelId32GenObj retobj = ((IBusModelSchemaObj)getSchema()).getId32GenTableObj().moveDownId32Gen( this );
		return( (IBusModelValueObj)retobj );
	}

	@Override
	public IBusModelId32GenTableObj getId32GenTable() {
		return( ((IBusModelSchemaObj)getSchema()).getId32GenTableObj() );
	}

	@Override
	public IBusModelValue getRec() {
		if( rec == null ) {
			if( isNew ) {
				rec = getSchema().getBusModelBackingStore().getBusModelFactory().getFactoryId32Gen().newRec();
			}
			else {
				// Read the data rec via the backing store
				rec = getSchema().getBusModelBackingStore().getTableId32Gen().readDerivedByIdIdx( ((IBusModelSchemaObj)getSchema()).getAuthorization(),
						getPKey() );
				if( rec != null ) {
					copyRecToPKey();
				}
			}
		}
		return( rec );
	}

	@Override
	public void setRec( IBusModelValue value ) {
		if( ! ( ( value == null ) || ! ( value instanceof IBusModelId32Gen ) ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRec",
				"value",
				value,
				"BusModelId32GenRec" );
		}
		rec = value;
		copyRecToPKey();
		requiredContainerScope = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredContainerSchemaDef = null;
	}

	@Override
	public IBusModelId32Gen getId32GenRec() {
		return( (IBusModelId32Gen)getRec() );
	}

	@Override
	public IBusModelValueEditObj beginEdit() {
		if( edit != null ) {
			throw new CFEditAlreadyOpenException( getClass(), "beginEdit" );
		}
		IBusModelId32GenObj lockobj;
		if( getIsNew() ) {
			lockobj = (IBusModelId32GenObj)this;
		}
		else {
			lockobj = ((IBusModelSchemaObj)getSchema()).getId32GenTableObj().lockId32Gen( getPKey() );
		}
		edit = ((IBusModelSchemaObj)getSchema()).getId32GenTableObj().newEditInstance( lockobj );
		return( (IBusModelValueEditObj)edit );
	}

	@Override
	public IBusModelId32GenEditObj getEditAsId32Gen() {
		return( (IBusModelId32GenEditObj)edit );
	}

	@Override
	public ISecureSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			IBusModelValue rec = getRec();
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
			IBusModelValue rec = getRec();
			updatedBy = ((IBusModelSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( rec.getUpdatedByUserId() );
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
	public short getRequiredSlice() {
		return( getId32GenRec().getRequiredSlice() );
	}

	@Override
	public int getRequiredBlockSize() {
		return( getId32GenRec().getRequiredBlockSize() );
	}
}

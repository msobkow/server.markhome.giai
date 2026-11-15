// Description: Java 25 edit object instance implementation for BusModel DbKeyHash160Col.

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
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public class BusModelDbKeyHash160ColEditObj
	extends BusModelDbKeyHash160DefEditObj

	implements IBusModelDbKeyHash160ColEditObj
{
	protected IBusModelTableObj requiredContainerTable;

	public BusModelDbKeyHash160ColEditObj( IBusModelDbKeyHash160ColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	@Override
	public int getClassCode() {
		return( ((IBusModelSchemaObj)orig.getSchema()).getDbKeyHash160ColTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "DbKeyHash160Col" );
	}

	@Override
	public ICFAnyObj getObjScope() {
		IBusModelTableObj scope = getRequiredContainerTable();
		return( scope );
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
		// We realise this so that it's record will get copied to orig during realization
		IBusModelDbKeyHash160ColObj retobj = getSchema().getDbKeyHash160ColTableObj().realiseDbKeyHash160Col( (IBusModelDbKeyHash160ColObj)this );
		return( retobj );
	}

	@Override
	public void forget() {
		getOrigAsDbKeyHash160Col().forget();
	}

	@Override
	public IBusModelValueObj moveUp() {
		throw new CFCannotMoveEditedObjectException( getClass(),	"moveUp" );
	}

	@Override
	public IBusModelValueObj moveDown() {
		throw new CFCannotMoveEditedObjectException( getClass(),	"moveDown" );
	}

	@Override
	public IBusModelValueObj create() {
		copyRecToOrig();
		IBusModelDbKeyHash160ColObj retobj = ((IBusModelSchemaObj)getOrigAsDbKeyHash160Col().getSchema()).getDbKeyHash160ColTableObj().createDbKeyHash160Col( getOrigAsDbKeyHash160Col() );
		if( retobj == getOrigAsDbKeyHash160Col() ) {
			copyOrigToRec();
		}
		return( retobj );
	}

	@Override
	public BusModelValueEditObj update() {
		getSchema().getDbKeyHash160ColTableObj().updateDbKeyHash160Col( (IBusModelDbKeyHash160ColObj)this );
		return( null );
	}

	@Override
	public BusModelValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFCannotDeleteNewInstanceException( getClass(), "delete" );
		}
		getSchema().getDbKeyHash160ColTableObj().deleteDbKeyHash160Col( getOrigAsDbKeyHash160Col() );
		return( null );
	}

	@Override
	public IBusModelDbKeyHash160ColTableObj getDbKeyHash160ColTable() {
		return( orig.getSchema().getDbKeyHash160ColTableObj() );
	}

	@Override
	public IBusModelDbKeyHash160ColEditObj getEditAsDbKeyHash160Col() {
		return( (IBusModelDbKeyHash160ColEditObj)this );
	}

	@Override
	public IBusModelDbKeyHash160ColObj getOrigAsDbKeyHash160Col() {
		return( (IBusModelDbKeyHash160ColObj)orig );
	}

	@Override
	public IBusModelValue getRec() {
		if( rec == null ) {
			rec = getOrigAsDbKeyHash160Col().getSchema().getBusModelBackingStore().getBusModelFactory().getFactoryDbKeyHash160Col().newRec();
			rec.set( orig.getRec() );
		}
		return( rec );
	}

	@Override
	public void setRec( IBusModelValue value ) {
		if( rec != value ) {
			super.setRec( value );
			requiredContainerTable = null;
		}
	}

	@Override
	public IBusModelDbKeyHash160Col getDbKeyHash160ColRec() {
		return( (IBusModelDbKeyHash160Col)getRec() );
	}

	@Override
	public ICFKeyHash256 getRequiredId() {
		return( getPKey() );
	}

	@Override
	public void setRequiredId(ICFKeyHash256 value) {
		if (getPKey() != value) {
			setPKey(value);
			requiredContainerScope = null;
			optionalLookupDefSchema = null;
			optionalChildrenRefTableCol = null;
			optionalChildrenRefIndexCol = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredTableId() {
		return( getDbKeyHash160ColRec().getRequiredTableId() );
	}

	@Override
	public void setRequiredContainerScope( IBusModelScopeObj value ) {
		final String S_ProcName = "BusModelDbKeyHash160ColEditObj.setRequiredContainerScope() ";
		if( value == null ) {
			setRequiredContainerTable( null );
		}
		else if( ! ( value instanceof IBusModelTableObj ) ) {
			throw new CFUnsupportedClassException( getClass(),
				"setRequiredContainerScope",
				"value",
				value,
				"IBusModelTableObj" );
		}
		else {
			setRequiredContainerTable( (IBusModelTableObj)value );
		}
	}

	@Override
	public IBusModelTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	@Override
	public IBusModelTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IBusModelTableObj obj = ((IBusModelSchemaObj)getOrigAsDbKeyHash160Col().getSchema()).getTableTableObj().readTableByIdIdx( getDbKeyHash160ColRec().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	@Override
	public void setRequiredContainerTable( IBusModelTableObj value ) {
		if( rec == null ) {
			getDbKeyHash160ColRec();
		}
		if( value != null ) {
			requiredContainerTable = value;
			getDbKeyHash160ColRec().setRequiredContainerTable(value.getTableRec());
		}
		requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	@Override
	public void copyRecToOrig() {
		IBusModelDbKeyHash160Col origRec = getOrigAsDbKeyHash160Col().getDbKeyHash160ColRec();
		IBusModelDbKeyHash160Col myRec = getDbKeyHash160ColRec();
		origRec.set( myRec );
	}

	@Override
	public void copyOrigToRec() {
		IBusModelDbKeyHash160Col origRec = getOrigAsDbKeyHash160Col().getDbKeyHash160ColRec();
		IBusModelDbKeyHash160Col myRec = getDbKeyHash160ColRec();
		myRec.set( origRec );
	}
}

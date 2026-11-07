// Description: Java 25 edit object instance implementation for BusModel DbKeyHash224Col.

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

public class BusModelDbKeyHash224ColEditObj
	extends BusModelDbKeyHash224DefEditObj

	implements IBusModelDbKeyHash224ColEditObj
{
	protected IBusModelTableObj requiredContainerTable;

	public BusModelDbKeyHash224ColEditObj( IBusModelDbKeyHash224ColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	@Override
	public int getClassCode() {
		return( ((IBusModelSchemaObj)orig.getSchema()).getDbKeyHash224ColTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "DbKeyHash224Col" );
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
		IBusModelDbKeyHash224ColObj retobj = getSchema().getDbKeyHash224ColTableObj().realiseDbKeyHash224Col( (IBusModelDbKeyHash224ColObj)this );
		return( retobj );
	}

	@Override
	public void forget() {
		getOrigAsDbKeyHash224Col().forget();
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
		IBusModelDbKeyHash224ColObj retobj = ((IBusModelSchemaObj)getOrigAsDbKeyHash224Col().getSchema()).getDbKeyHash224ColTableObj().createDbKeyHash224Col( getOrigAsDbKeyHash224Col() );
		if( retobj == getOrigAsDbKeyHash224Col() ) {
			copyOrigToRec();
		}
		return( retobj );
	}

	@Override
	public BusModelValueEditObj update() {
		getSchema().getDbKeyHash224ColTableObj().updateDbKeyHash224Col( (IBusModelDbKeyHash224ColObj)this );
		return( null );
	}

	@Override
	public BusModelValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFCannotDeleteNewInstanceException( getClass(), "delete" );
		}
		getSchema().getDbKeyHash224ColTableObj().deleteDbKeyHash224Col( getOrigAsDbKeyHash224Col() );
		return( null );
	}

	@Override
	public IBusModelDbKeyHash224ColTableObj getDbKeyHash224ColTable() {
		return( orig.getSchema().getDbKeyHash224ColTableObj() );
	}

	@Override
	public IBusModelDbKeyHash224ColEditObj getEditAsDbKeyHash224Col() {
		return( (IBusModelDbKeyHash224ColEditObj)this );
	}

	@Override
	public IBusModelDbKeyHash224ColObj getOrigAsDbKeyHash224Col() {
		return( (IBusModelDbKeyHash224ColObj)orig );
	}

	@Override
	public IBusModelValue getRec() {
		if( rec == null ) {
			rec = getOrigAsDbKeyHash224Col().getSchema().getBusModelBackingStore().getBusModelFactory().getFactoryDbKeyHash224Col().newRec();
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
	public IBusModelDbKeyHash224Col getDbKeyHash224ColRec() {
		return( (IBusModelDbKeyHash224Col)getRec() );
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
		return( getDbKeyHash224ColRec().getRequiredTableId() );
	}

	@Override
	public void setRequiredContainerScope( IBusModelScopeObj value ) {
		final String S_ProcName = "BusModelDbKeyHash224ColEditObj.setRequiredContainerScope() ";
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
				IBusModelTableObj obj = ((IBusModelSchemaObj)getOrigAsDbKeyHash224Col().getSchema()).getTableTableObj().readTableByIdIdx( getDbKeyHash224ColRec().getRequiredTableId() );
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
			getDbKeyHash224ColRec();
		}
		if( value != null ) {
			requiredContainerTable = value;
			getDbKeyHash224ColRec().setRequiredContainerTable(value.getTableRec());
		}
		requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	@Override
	public void copyRecToOrig() {
		IBusModelDbKeyHash224Col origRec = getOrigAsDbKeyHash224Col().getDbKeyHash224ColRec();
		IBusModelDbKeyHash224Col myRec = getDbKeyHash224ColRec();
		origRec.set( myRec );
	}

	@Override
	public void copyOrigToRec() {
		IBusModelDbKeyHash224Col origRec = getOrigAsDbKeyHash224Col().getDbKeyHash224ColRec();
		IBusModelDbKeyHash224Col myRec = getDbKeyHash224ColRec();
		myRec.set( origRec );
	}
}

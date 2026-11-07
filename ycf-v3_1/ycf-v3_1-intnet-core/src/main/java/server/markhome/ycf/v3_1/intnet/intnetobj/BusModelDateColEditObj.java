// Description: Java 25 edit object instance implementation for BusModel DateCol.

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

public class BusModelDateColEditObj
	extends BusModelDateDefEditObj

	implements IBusModelDateColEditObj
{
	protected IBusModelTableObj requiredContainerTable;

	public BusModelDateColEditObj( IBusModelDateColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	@Override
	public int getClassCode() {
		return( ((IBusModelSchemaObj)orig.getSchema()).getDateColTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "DateCol" );
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
		IBusModelDateColObj retobj = getSchema().getDateColTableObj().realiseDateCol( (IBusModelDateColObj)this );
		return( retobj );
	}

	@Override
	public void forget() {
		getOrigAsDateCol().forget();
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
		IBusModelDateColObj retobj = ((IBusModelSchemaObj)getOrigAsDateCol().getSchema()).getDateColTableObj().createDateCol( getOrigAsDateCol() );
		if( retobj == getOrigAsDateCol() ) {
			copyOrigToRec();
		}
		return( retobj );
	}

	@Override
	public BusModelValueEditObj update() {
		getSchema().getDateColTableObj().updateDateCol( (IBusModelDateColObj)this );
		return( null );
	}

	@Override
	public BusModelValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFCannotDeleteNewInstanceException( getClass(), "delete" );
		}
		getSchema().getDateColTableObj().deleteDateCol( getOrigAsDateCol() );
		return( null );
	}

	@Override
	public IBusModelDateColTableObj getDateColTable() {
		return( orig.getSchema().getDateColTableObj() );
	}

	@Override
	public IBusModelDateColEditObj getEditAsDateCol() {
		return( (IBusModelDateColEditObj)this );
	}

	@Override
	public IBusModelDateColObj getOrigAsDateCol() {
		return( (IBusModelDateColObj)orig );
	}

	@Override
	public IBusModelValue getRec() {
		if( rec == null ) {
			rec = getOrigAsDateCol().getSchema().getBusModelBackingStore().getBusModelFactory().getFactoryDateCol().newRec();
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
	public IBusModelDateCol getDateColRec() {
		return( (IBusModelDateCol)getRec() );
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
		return( getDateColRec().getRequiredTableId() );
	}

	@Override
	public void setRequiredContainerScope( IBusModelScopeObj value ) {
		final String S_ProcName = "BusModelDateColEditObj.setRequiredContainerScope() ";
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
				IBusModelTableObj obj = ((IBusModelSchemaObj)getOrigAsDateCol().getSchema()).getTableTableObj().readTableByIdIdx( getDateColRec().getRequiredTableId() );
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
			getDateColRec();
		}
		if( value != null ) {
			requiredContainerTable = value;
			getDateColRec().setRequiredContainerTable(value.getTableRec());
		}
		requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	@Override
	public void copyRecToOrig() {
		IBusModelDateCol origRec = getOrigAsDateCol().getDateColRec();
		IBusModelDateCol myRec = getDateColRec();
		origRec.set( myRec );
	}

	@Override
	public void copyOrigToRec() {
		IBusModelDateCol origRec = getOrigAsDateCol().getDateColRec();
		IBusModelDateCol myRec = getDateColRec();
		myRec.set( origRec );
	}
}

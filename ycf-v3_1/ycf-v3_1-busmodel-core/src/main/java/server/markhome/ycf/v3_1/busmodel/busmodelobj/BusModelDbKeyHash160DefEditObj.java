// Description: Java 25 edit object instance implementation for BusModel DbKeyHash160Def.

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

public class BusModelDbKeyHash160DefEditObj
	extends BusModelAtomEditObj

	implements IBusModelDbKeyHash160DefEditObj
{

	public BusModelDbKeyHash160DefEditObj( IBusModelDbKeyHash160DefObj argOrig ) {
		super( argOrig );
	}

	@Override
	public int getClassCode() {
		return( ((IBusModelSchemaObj)orig.getSchema()).getDbKeyHash160DefTableObj().getClassCode() );
	}

	@Override
	public String getGenDefName() {
		return( "DbKeyHash160Def" );
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
		// We realise this so that it's record will get copied to orig during realization
		IBusModelDbKeyHash160DefObj retobj = getSchema().getDbKeyHash160DefTableObj().realiseDbKeyHash160Def( (IBusModelDbKeyHash160DefObj)this );
		return( retobj );
	}

	@Override
	public void forget() {
		getOrigAsDbKeyHash160Def().forget();
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
		IBusModelDbKeyHash160DefObj retobj = ((IBusModelSchemaObj)getOrigAsDbKeyHash160Def().getSchema()).getDbKeyHash160DefTableObj().createDbKeyHash160Def( getOrigAsDbKeyHash160Def() );
		if( retobj == getOrigAsDbKeyHash160Def() ) {
			copyOrigToRec();
		}
		return( retobj );
	}

	@Override
	public BusModelValueEditObj update() {
		getSchema().getDbKeyHash160DefTableObj().updateDbKeyHash160Def( (IBusModelDbKeyHash160DefObj)this );
		return( null );
	}

	@Override
	public BusModelValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFCannotDeleteNewInstanceException( getClass(), "delete" );
		}
		getSchema().getDbKeyHash160DefTableObj().deleteDbKeyHash160Def( getOrigAsDbKeyHash160Def() );
		return( null );
	}

	@Override
	public IBusModelDbKeyHash160DefTableObj getDbKeyHash160DefTable() {
		return( orig.getSchema().getDbKeyHash160DefTableObj() );
	}

	@Override
	public IBusModelDbKeyHash160DefEditObj getEditAsDbKeyHash160Def() {
		return( (IBusModelDbKeyHash160DefEditObj)this );
	}

	@Override
	public IBusModelDbKeyHash160DefObj getOrigAsDbKeyHash160Def() {
		return( (IBusModelDbKeyHash160DefObj)orig );
	}

	@Override
	public IBusModelValue getRec() {
		if( rec == null ) {
			rec = getOrigAsDbKeyHash160Def().getSchema().getBusModelBackingStore().getBusModelFactory().getFactoryDbKeyHash160Def().newRec();
			rec.set( orig.getRec() );
		}
		return( rec );
	}

	@Override
	public void setRec( IBusModelValue value ) {
		if( rec != value ) {
			super.setRec( value );
		}
	}

	@Override
	public IBusModelDbKeyHash160Def getDbKeyHash160DefRec() {
		return( (IBusModelDbKeyHash160Def)getRec() );
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
	public String getOptionalInitValue() {
		return( getDbKeyHash160DefRec().getOptionalInitValue() );
	}

	@Override
	public void setOptionalInitValue( String value ) {
		if( getDbKeyHash160DefRec().getOptionalInitValue() != value ) {
			getDbKeyHash160DefRec().setOptionalInitValue( value );
		}
	}

	@Override
	public void copyRecToOrig() {
		IBusModelDbKeyHash160Def origRec = getOrigAsDbKeyHash160Def().getDbKeyHash160DefRec();
		IBusModelDbKeyHash160Def myRec = getDbKeyHash160DefRec();
		origRec.set( myRec );
	}

	@Override
	public void copyOrigToRec() {
		IBusModelDbKeyHash160Def origRec = getOrigAsDbKeyHash160Def().getDbKeyHash160DefRec();
		IBusModelDbKeyHash160Def myRec = getDbKeyHash160DefRec();
		myRec.set( origRec );
	}
}

// Description: Java 17 implJustProtementation of a ClearTopDep buffer

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

package server.markhome.ycf.v3_1.intnet.intnet.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public class BusModelProtBuffClearTopDep
	extends BusModelProtBuffClearDep
	implements IBusModelClearTopDep
{
	protected ICFKeyHash256 requiredTableId;
	protected String requiredName;
	protected ICFKeyHash256 optionalPrevId;
	protected ICFKeyHash256 optionalNextId;

	public BusModelProtBuffClearTopDep() {
		super();
		requiredTableId = CFDbKeyHash256.fromHex( IBusModelPubClearTopDep.TABLEID_INIT_VALUE.toString() );
		requiredName = IBusModelPubClearTopDep.NAME_INIT_VALUE;
		optionalPrevId = CFDbKeyHash256.nullGet();
		optionalNextId = CFDbKeyHash256.nullGet();
	}

	@Override
	public int getClassCode() {
		return( IBusModelProtClearTopDep.CLASS_CODE );
	}

	@Override
	public IBusModelProtTable getRequiredContainerTable(ICFKeyHash256 argTableId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtTableTable targetTable = targetBackingBusModel.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTable", 0, "IBusModelProtSchema.getBackingBusModel().getTableTable()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTableId()));
	}

	@Override
	public void setRequiredContainerTable(ICFKeyHash256 argTableId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable-args", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtTableTable targetTable = targetBackingBusModel.getTableTable();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable", 0, "IBusModelSchema.getBackingBusModel().getTableTable()");
		}
		IBusModelProtTable found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTableId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTable-args", 0, "found");
		}
		else if (found instanceof IBusModelProtTable) || (found instanceof IBusModelProtTable) || (found instanceof IBusModelPubTable)) {
			super.setRequiredContainerTable(argTableId);
		requiredTableId = argTableId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerTable-args", "found", found, "IBusModelProtTableIBusModelProtTableIBusModelPubTable");
		}
	}

	@Override
	public void setRequiredContainerTable(IBusModelProtTable argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTable", 1, "argObj");
		}
		else {
			setJustProtRequiredTableId(argObj.getRequiredId());
		}
	}

	@Override
	public void setRequiredContainerTable(IBusModelPubTable argObj) {

		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTable", 1, "argObj");
		}
		else {
			setJustProtRequiredTableId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelProtClearTopDep getOptionalLookupPrev(ICFKeyHash256 argPrevId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupPrev", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtClearTopDepTable targetTable = targetBackingBusModel.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupPrev", 0, "IBusModelProtSchema.getBackingBusModel().getTableClearTopDep()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalPrevId()));
	}

	@Override
	public void setOptionalLookupPrev(ICFKeyHash256 argPrevId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev-args", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtClearTopDepTable targetTable = targetBackingBusModel.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupPrev", 0, "IBusModelSchema.getBackingBusModel().getTableClearTopDep()");
		}
		IBusModelProtClearTopDep found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argPrevId);
		if (found == null || (found != null && ((found instanceof IBusModelProtClearTopDep) || (found instanceof IBusModelProtClearTopDep) || (found instanceof IBusModelPubClearTopDep)))) {
			super.setOptionalLookupPrev(argPrevId);
		optionalPrevId = argPrevId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupPrev-args", "found", found, "IBusModelProtClearTopDepIBusModelProtClearTopDepIBusModelPubClearTopDep");
		}
	}

	@Override
	public void setOptionalLookupPrev(IBusModelProtClearTopDep argObj) {

		if(argObj == null) {
			setJustProtOptionalPrevId(null);
		}
		else {
			setJustProtOptionalPrevId(argObj.getRequiredId());
		}
	}

	@Override
	public void setOptionalLookupPrev(IBusModelPubClearTopDep argObj) {

		if(argObj == null) {
			setJustProtOptionalPrevId(null);
		}
		else {
			setJustProtOptionalPrevId(argObj.getRequiredId());
		}
	}

	@Override
	public IBusModelProtClearTopDep getOptionalLookupNext(ICFKeyHash256 argNextId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupNext", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtClearTopDepTable targetTable = targetBackingBusModel.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalLookupNext", 0, "IBusModelProtSchema.getBackingBusModel().getTableClearTopDep()");
		}
		return(targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalNextId()));
	}

	@Override
	public void setOptionalLookupNext(ICFKeyHash256 argNextId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext-args", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtClearTopDepTable targetTable = targetBackingBusModel.getTableClearTopDep();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalLookupNext", 0, "IBusModelSchema.getBackingBusModel().getTableClearTopDep()");
		}
		IBusModelProtClearTopDep found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argNextId);
		if (found == null || (found != null && ((found instanceof IBusModelProtClearTopDep) || (found instanceof IBusModelProtClearTopDep) || (found instanceof IBusModelPubClearTopDep)))) {
			super.setOptionalLookupNext(argNextId);
		optionalNextId = argNextId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalLookupNext-args", "found", found, "IBusModelProtClearTopDepIBusModelProtClearTopDepIBusModelPubClearTopDep");
		}
	}

	@Override
	public void setOptionalLookupNext(IBusModelProtClearTopDep argObj) {

		if(argObj == null) {
			setJustProtOptionalNextId(null);
		}
		else {
			setJustProtOptionalNextId(argObj.getRequiredId());
		}
	}

	@Override
	public void setOptionalLookupNext(IBusModelPubClearTopDep argObj) {

		if(argObj == null) {
			setJustProtOptionalNextId(null);
		}
		else {
			setJustProtOptionalNextId(argObj.getRequiredId());
		}
	}

	@Override
	public List<IBusModelProtClearSubDep1> getOptionalComponentsClearDep(ICFKeyHash256 argId) {
		IBusModelProtSchema targetBackingBusModel = IBusModelProtSchema.getBackingBusModel();
		if (targetBackingBusModel == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsClearDep", 0, "IBusModelProtSchema.getBackingBusModel()");
		}
		IBusModelProtClearSubDep1Table targetTable = targetBackingBusModel.getTableClearSubDep1();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalComponentsClearDep", 0, "IBusModelProtSchema.getBackingBusModel().getTableClearSubDep1()");
		}
		IBusModelProtClearSubDep1[] targetArr = targetTable.readDerivedByClearTopDepIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredId());
		if( targetArr != null ) {
			List<IBusModelProtClearSubDep1> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return(results);
		}
		else {
			List<IBusModelProtClearSubDep1> results = new ArrayList<>();
			return(results);
		}
	}

	@Override
	public ICFKeyHash256 getRequiredTableId() {
		return(requiredTableId);
	}

	public void setRequiredTableId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTableId",
				1,
				"value" );
		}
		requiredTableId = value;
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 192 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	@Override
	public ICFKeyHash256 getOptionalPrevId() {
		return(optionalPrevId);
	}

	public void setOptionalPrevId( ICFKeyHash256 value ) {
		optionalPrevId = value;
	}

	@Override
	public ICFKeyHash256 getOptionalNextId() {
		return(optionalNextId);
	}

	public void setOptionalNextId( ICFKeyHash256 value ) {
		optionalNextId = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IBusModelProtClearTopDep rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtScopeHPKey ) {
			IBusModelProtScopeHPKey rhs = (IBusModelProtScopeHPKey)obj;
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByClrTopDepTblIdxKey rhs ) {
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByUNameIdxKey rhs ) {
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByPrevIdxKey rhs ) {
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByNextIdxKey rhs ) {
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubClearTopDep rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubClearTopDepH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelPubScopeHPKey rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByClrTopDepTblIdxKey rhs ) {
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByUNameIdxKey rhs ) {
			if( getRequiredTableId() != null ) {
				if( rhs.getRequiredTableId() != null ) {
					if( ! getRequiredTableId().equals( rhs.getRequiredTableId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByPrevIdxKey rhs ) {
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					if( ! getOptionalPrevId().equals( rhs.getOptionalPrevId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IBusModelProtClearTopDepByNextIdxKey rhs ) {
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					if( ! getOptionalNextId().equals( rhs.getOptionalNextId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredTableId().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalPrevId() != null ) {
			hashCode = hashCode + getOptionalPrevId().hashCode();
		}
		if( getOptionalNextId() != null ) {
			hashCode = hashCode + getOptionalNextId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IBusModelProtClearTopDep rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
 		}
		else if( obj instanceof IBusModelProtScopeHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelProtClearTopDepH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelProtClearTopDepByClrTopDepTblIdxKey rhs ) {
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtClearTopDepByUNameIdxKey rhs ) {
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtClearTopDepByPrevIdxKey rhs ) {
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof IBusModelProtClearTopDepByNextIdxKey rhs ) {
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearTopDep rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelPubScopeHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearTopDepH rhs ) {
			cmp = super.compareTo( rhs );
			if( cmp != 0 ) {
				return( cmp );
			}
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearTopDepByClrTopDepTblIdxKey rhs ) {
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearTopDepByUNameIdxKey rhs ) {
			if (getRequiredTableId() != null) {
				if (rhs.getRequiredTableId() != null) {
					cmp = getRequiredTableId().compareTo( rhs.getRequiredTableId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearTopDepByPrevIdxKey rhs ) {
			if( getOptionalPrevId() != null ) {
				if( rhs.getOptionalPrevId() != null ) {
					cmp = getOptionalPrevId().compareTo( rhs.getOptionalPrevId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPrevId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof IBusModelPubClearTopDepByNextIdxKey rhs ) {
			if( getOptionalNextId() != null ) {
				if( rhs.getOptionalNextId() != null ) {
					cmp = getOptionalNextId().compareTo( rhs.getOptionalNextId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalNextId() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else {
			cmp = super.compareTo( obj );
			return( cmp );
		}
	}

	@Override
	public void set( IBusModelProtScope src ) {
		if( src instanceof BusModelProtBuffClearTopDep ) {
			setJustProtClearTopDep( (BusModelProtBuffClearTopDep)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelProtBuffClearTopDep" );
		}
	}

	@Override
	public void setClearTopDep( IBusModelProtClearTopDep src ) {
		super.setClearDep( src );
		setJustProtRequiredContainerTable(src.getRequiredContainerTable());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredTableId(src.getRequiredTableId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelProtScopeH src ) {
		if( src instanceof IBusModelPubClearTopDepH ) {
			setClearTopDep( (IBusModelPubClearTopDepH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubClearTopDepH" );
		}
	}

	@Override
	public void setClearTopDep( IBusModelProtClearTopDepH src ) {
		super.setClearDep( src );
		setJustProtRequiredContainerTable(src.getRequiredContainerTable());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredTableId(src.getRequiredTableId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelPubScope src ) {
		if( src instanceof BusModelPubProtBuffClearTopDep ) {
			setJustProtClearTopDep( (BusModelPubProtBuffClearTopDep)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"BusModelPubProtBuffClearTopDep" );
		}
	}

	@Override
	public void setClearTopDep( IBusModelPubClearTopDep src ) {
		super.setClearDep( src );
		setJustProtRequiredContainerTable(src.getRequiredContainerTable());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredTableId(src.getRequiredTableId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public void set( IBusModelPubScopeH src ) {
		if( src instanceof IBusModelPubClearTopDepH ) {
			setClearTopDep( (IBusModelPubClearTopDepH)src );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
					"set",
					"src",
					src,
					"IBusModelPubClearTopDepH" );
		}
	}

	@Override
	public void setClearTopDep( IBusModelPubClearTopDepH src ) {
		super.setClearDep( src );
		setJustProtRequiredContainerTable(src.getRequiredContainerTable());
		setJustProtOptionalLookupPrev(src.getOptionalLookupPrev());
		setJustProtOptionalLookupNext(src.getOptionalLookupNext());
		setJustProtRequiredTableId(src.getRequiredTableId());
		setJustProtRequiredName(src.getRequiredName());
		setJustProtOptionalPrevId(src.getOptionalPrevId());
		setJustProtOptionalNextId(src.getOptionalNextId());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = super.getXmlAttrFragment()  + "\"" + getRequiredId().toString() + "\"" + "\"" + getRequiredTableId().toString() + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\"" + ( ( getOptionalPrevId() == null ) ? "null" : "\"" + getOptionalPrevId().toString() + "\"" ) + ( ( getOptionalNextId() == null ) ? "null" : "\"" + getOptionalNextId().toString() + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<BusModelProtBuffClearTopDep" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}

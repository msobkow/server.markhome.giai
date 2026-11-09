// Description: Java 11 base object instance implementation for CFBam ServerMethod.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamServerMethodObj
	extends CFBamScopeObj
	implements ICFBamServerMethodObj
{
	public final static String CLASS_CODE = "a804";
	protected ICFBamSchemaDefObj optionalLookupDefSchema;
	protected ICFBamTableObj requiredContainerForTable;

	public CFBamServerMethodObj() {
		super();
		optionalLookupDefSchema = null;
		requiredContainerForTable = null;
	}

	public CFBamServerMethodObj( ICFBamSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupDefSchema = null;
		requiredContainerForTable = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ServerMethod" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamTableObj scope = getRequiredContainerForTable();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamTableObj scope = getRequiredContainerForTable();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
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
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
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

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
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

	public ICFBamScopeObj realise() {
		ICFBamServerMethodObj retobj = ((ICFBamSchemaObj)schema).getServerMethodTableObj().realiseServerMethod(
			(ICFBamServerMethodObj)this );
		return( (ICFBamScopeObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getServerMethodTableObj().reallyDeepDisposeServerMethod( (ICFBamServerMethodObj)this );
	}

	public ICFBamScopeObj read() {
		ICFBamServerMethodObj retobj = ((ICFBamSchemaObj)schema).getServerMethodTableObj().readServerMethodByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamScopeObj read( boolean forceRead ) {
		ICFBamServerMethodObj retobj = ((ICFBamSchemaObj)schema).getServerMethodTableObj().readServerMethodByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamServerMethodTableObj getServerMethodTable() {
		return( ((ICFBamSchemaObj)schema).getServerMethodTableObj() );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFBamServerMethodBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFBamServerMethodBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		optionalLookupDefSchema = null;
		requiredContainerForTable = null;
	}

	public CFBamServerMethodBuff getServerMethodBuff() {
		return( (CFBamServerMethodBuff)getBuff() );
	}

	public ICFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFBamServerMethodObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFBamServerMethodObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getServerMethodTableObj().lockServerMethod( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getServerMethodTableObj().newEditInstance( lockobj );
		return( (ICFBamScopeEditObj)edit );
	}

	public ICFBamServerMethodEditObj getEditAsServerMethod() {
		return( (ICFBamServerMethodEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFBamScopeBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFBamScopeBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredTableId() {
		return( getServerMethodBuff().getRequiredTableId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getServerMethodBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getServerMethodBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getServerMethodBuff().getRequiredName() );
	}

	public String getOptionalShortName() {
		return( getServerMethodBuff().getOptionalShortName() );
	}

	public String getOptionalLabel() {
		return( getServerMethodBuff().getOptionalLabel() );
	}

	public String getOptionalShortDescription() {
		return( getServerMethodBuff().getOptionalShortDescription() );
	}

	public String getOptionalDescription() {
		return( getServerMethodBuff().getOptionalDescription() );
	}

	public String getOptionalSuffix() {
		return( getServerMethodBuff().getOptionalSuffix() );
	}

	public boolean getRequiredIsInstanceMethod() {
		return( getServerMethodBuff().getRequiredIsInstanceMethod() );
	}

	public boolean getRequiredIsServerOnly() {
		return( getServerMethodBuff().getRequiredIsServerOnly() );
	}

	public ICFBamSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return( getServerMethodBuff().getRequiredCodeVis() );
	}

	public String getRequiredJMethodBody() {
		return( getServerMethodBuff().getRequiredJMethodBody() );
	}

	public String getRequiredCppMethodBody() {
		return( getServerMethodBuff().getRequiredCppMethodBody() );
	}

	public String getRequiredCsMethodBody() {
		return( getServerMethodBuff().getRequiredCsMethodBody() );
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getServerMethodBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getServerMethodBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((ICFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getServerMethodBuff().getOptionalDefSchemaTenantId(),
					getServerMethodBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public ICFBamTableObj getRequiredContainerForTable() {
		return( getRequiredContainerForTable( false ) );
	}

	public ICFBamTableObj getRequiredContainerForTable( boolean forceRead ) {
		if( ( requiredContainerForTable == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerForTable = ((ICFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getServerMethodBuff().getRequiredTableId(), forceRead );
			}
		}
		return( requiredContainerForTable );
	}

	public List<ICFBamParamObj> getOptionalComponentsParams() {
		List<ICFBamParamObj> retval;
		retval = ((ICFBamSchemaObj)schema).getParamTableObj().readParamByServerMethodIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamParamObj> getOptionalComponentsParams( boolean forceRead ) {
		List<ICFBamParamObj> retval;
		retval = ((ICFBamSchemaObj)schema).getParamTableObj().readParamByServerMethodIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}
}

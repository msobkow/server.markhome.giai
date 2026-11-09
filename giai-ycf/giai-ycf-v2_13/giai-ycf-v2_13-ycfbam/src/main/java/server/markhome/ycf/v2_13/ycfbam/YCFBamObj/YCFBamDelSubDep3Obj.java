// Description: Java 11 base object instance implementation for CFBam DelSubDep3.

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

public class CFBamDelSubDep3Obj
	extends CFBamDelDepObj
	implements ICFBamDelSubDep3Obj
{
	public final static String CLASS_CODE = "a81d";
	protected ICFBamDelSubDep2Obj requiredContainerDelSubDep2;

	public CFBamDelSubDep3Obj() {
		super();
		requiredContainerDelSubDep2 = null;
	}

	public CFBamDelSubDep3Obj( ICFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerDelSubDep2 = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelSubDep3" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamDelSubDep2Obj scope = getRequiredContainerDelSubDep2();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamDelSubDep2Obj scope = getRequiredContainerDelSubDep2();
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
		ICFBamDelSubDep3Obj retobj = ((ICFBamSchemaObj)schema).getDelSubDep3TableObj().realiseDelSubDep3(
			(ICFBamDelSubDep3Obj)this );
		return( (ICFBamScopeObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getDelSubDep3TableObj().reallyDeepDisposeDelSubDep3( (ICFBamDelSubDep3Obj)this );
	}

	public ICFBamScopeObj read() {
		ICFBamDelSubDep3Obj retobj = ((ICFBamSchemaObj)schema).getDelSubDep3TableObj().readDelSubDep3ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamScopeObj read( boolean forceRead ) {
		ICFBamDelSubDep3Obj retobj = ((ICFBamSchemaObj)schema).getDelSubDep3TableObj().readDelSubDep3ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFBamScopeObj)retobj );
	}

	public ICFBamDelSubDep3TableObj getDelSubDep3Table() {
		return( ((ICFBamSchemaObj)schema).getDelSubDep3TableObj() );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof CFBamDelSubDep3Buff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFBamDelSubDep3Buff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
		requiredContainerDelSubDep2 = null;
	}

	public CFBamDelSubDep3Buff getDelSubDep3Buff() {
		return( (CFBamDelSubDep3Buff)getBuff() );
	}

	public ICFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFBamDelSubDep3Obj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFBamDelSubDep3Obj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getDelSubDep3TableObj().lockDelSubDep3( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getDelSubDep3TableObj().newEditInstance( lockobj );
		return( (ICFBamScopeEditObj)edit );
	}

	public ICFBamDelSubDep3EditObj getEditAsDelSubDep3() {
		return( (ICFBamDelSubDep3EditObj)edit );
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

	public long getRequiredDelSubDep2TenantId() {
		return( getDelSubDep3Buff().getRequiredDelSubDep2TenantId() );
	}

	public long getRequiredDelSubDep2Id() {
		return( getDelSubDep3Buff().getRequiredDelSubDep2Id() );
	}

	public String getRequiredName() {
		return( getDelSubDep3Buff().getRequiredName() );
	}

	public ICFBamDelSubDep2Obj getRequiredContainerDelSubDep2() {
		return( getRequiredContainerDelSubDep2( false ) );
	}

	public ICFBamDelSubDep2Obj getRequiredContainerDelSubDep2( boolean forceRead ) {
		if( ( requiredContainerDelSubDep2 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerDelSubDep2 = ((ICFBamSchemaObj)schema).getDelSubDep2TableObj().readDelSubDep2ByIdIdx( getDelSubDep3Buff().getRequiredDelSubDep2TenantId(),
					getDelSubDep3Buff().getRequiredDelSubDep2Id(), forceRead );
			}
		}
		return( requiredContainerDelSubDep2 );
	}
}

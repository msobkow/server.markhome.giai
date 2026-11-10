// Description: Java 11 base object instance implementation for YCFBam DelSubDep2.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
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
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamDelSubDep2Obj
	extends YCFBamDelDepObj
	implements IYCFBamDelSubDep2Obj
{
	public final static String CLASS_CODE = "a81c";
	protected IYCFBamDelSubDep1Obj requiredContainerDelSubDep1;

	public YCFBamDelSubDep2Obj() {
		super();
		requiredContainerDelSubDep1 = null;
	}

	public YCFBamDelSubDep2Obj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerDelSubDep1 = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelSubDep2" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamDelSubDep1Obj scope = getRequiredContainerDelSubDep1();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamDelSubDep1Obj scope = getRequiredContainerDelSubDep1();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
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
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public IYCFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		IYCFLibAnyObj subObj = null;
		IYCFLibAnyObj retObj;
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
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof IYCFBamSchemaDefObj ) {
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

	public IYCFBamScopeObj realise() {
		IYCFBamDelSubDep2Obj retobj = ((IYCFBamSchemaObj)schema).getDelSubDep2TableObj().realiseDelSubDep2(
			(IYCFBamDelSubDep2Obj)this );
		return( (IYCFBamScopeObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getDelSubDep2TableObj().reallyDeepDisposeDelSubDep2( (IYCFBamDelSubDep2Obj)this );
	}

	public IYCFBamScopeObj read() {
		IYCFBamDelSubDep2Obj retobj = ((IYCFBamSchemaObj)schema).getDelSubDep2TableObj().readDelSubDep2ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamScopeObj read( boolean forceRead ) {
		IYCFBamDelSubDep2Obj retobj = ((IYCFBamSchemaObj)schema).getDelSubDep2TableObj().readDelSubDep2ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamDelSubDep2TableObj getDelSubDep2Table() {
		return( ((IYCFBamSchemaObj)schema).getDelSubDep2TableObj() );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamDelSubDep2Buff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamDelSubDep2Buff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
		requiredContainerDelSubDep1 = null;
	}

	public YCFBamDelSubDep2Buff getDelSubDep2Buff() {
		return( (YCFBamDelSubDep2Buff)getBuff() );
	}

	public IYCFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamDelSubDep2Obj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamDelSubDep2Obj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getDelSubDep2TableObj().lockDelSubDep2( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getDelSubDep2TableObj().newEditInstance( lockobj );
		return( (IYCFBamScopeEditObj)edit );
	}

	public IYCFBamDelSubDep2EditObj getEditAsDelSubDep2() {
		return( (IYCFBamDelSubDep2EditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamScopeBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamScopeBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredDelSubDep1TenantId() {
		return( getDelSubDep2Buff().getRequiredDelSubDep1TenantId() );
	}

	public long getRequiredDelSubDep1Id() {
		return( getDelSubDep2Buff().getRequiredDelSubDep1Id() );
	}

	public String getRequiredName() {
		return( getDelSubDep2Buff().getRequiredName() );
	}

	public IYCFBamDelSubDep1Obj getRequiredContainerDelSubDep1() {
		return( getRequiredContainerDelSubDep1( false ) );
	}

	public IYCFBamDelSubDep1Obj getRequiredContainerDelSubDep1( boolean forceRead ) {
		if( ( requiredContainerDelSubDep1 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerDelSubDep1 = ((IYCFBamSchemaObj)schema).getDelSubDep1TableObj().readDelSubDep1ByIdIdx( getDelSubDep2Buff().getRequiredDelSubDep1TenantId(),
					getDelSubDep2Buff().getRequiredDelSubDep1Id(), forceRead );
			}
		}
		return( requiredContainerDelSubDep1 );
	}

	public List<IYCFBamDelSubDep3Obj> getOptionalComponentsDelDep() {
		List<IYCFBamDelSubDep3Obj> retval;
		retval = ((IYCFBamSchemaObj)schema).getDelSubDep3TableObj().readDelSubDep3ByDelSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamDelSubDep3Obj> getOptionalComponentsDelDep( boolean forceRead ) {
		List<IYCFBamDelSubDep3Obj> retval;
		retval = ((IYCFBamSchemaObj)schema).getDelSubDep3TableObj().readDelSubDep3ByDelSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}
}

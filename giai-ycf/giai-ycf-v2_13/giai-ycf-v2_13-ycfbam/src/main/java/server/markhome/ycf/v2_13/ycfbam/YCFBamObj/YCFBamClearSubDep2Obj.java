// Description: Java 11 base object instance implementation for YCFBam ClearSubDep2.

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

public class YCFBamClearSubDep2Obj
	extends YCFBamClearDepObj
	implements IYCFBamClearSubDep2Obj
{
	public final static String CLASS_CODE = "a815";
	protected IYCFBamClearSubDep1Obj requiredContainerClearSubDep1;

	public YCFBamClearSubDep2Obj() {
		super();
		requiredContainerClearSubDep1 = null;
	}

	public YCFBamClearSubDep2Obj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerClearSubDep1 = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearSubDep2" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamClearSubDep1Obj scope = getRequiredContainerClearSubDep1();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamClearSubDep1Obj scope = getRequiredContainerClearSubDep1();
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
		IYCFBamClearSubDep2Obj retobj = ((IYCFBamSchemaObj)schema).getClearSubDep2TableObj().realiseClearSubDep2(
			(IYCFBamClearSubDep2Obj)this );
		return( (IYCFBamScopeObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getClearSubDep2TableObj().reallyDeepDisposeClearSubDep2( (IYCFBamClearSubDep2Obj)this );
	}

	public IYCFBamScopeObj read() {
		IYCFBamClearSubDep2Obj retobj = ((IYCFBamSchemaObj)schema).getClearSubDep2TableObj().readClearSubDep2ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamScopeObj read( boolean forceRead ) {
		IYCFBamClearSubDep2Obj retobj = ((IYCFBamSchemaObj)schema).getClearSubDep2TableObj().readClearSubDep2ByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamClearSubDep2TableObj getClearSubDep2Table() {
		return( ((IYCFBamSchemaObj)schema).getClearSubDep2TableObj() );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFBamClearSubDep2Buff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamClearSubDep2Buff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
		requiredContainerClearSubDep1 = null;
	}

	public YCFBamClearSubDep2Buff getClearSubDep2Buff() {
		return( (YCFBamClearSubDep2Buff)getBuff() );
	}

	public IYCFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamClearSubDep2Obj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamClearSubDep2Obj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getClearSubDep2TableObj().lockClearSubDep2( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getClearSubDep2TableObj().newEditInstance( lockobj );
		return( (IYCFBamScopeEditObj)edit );
	}

	public IYCFBamClearSubDep2EditObj getEditAsClearSubDep2() {
		return( (IYCFBamClearSubDep2EditObj)edit );
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

	public long getRequiredClearSubDep1TenantId() {
		return( getClearSubDep2Buff().getRequiredClearSubDep1TenantId() );
	}

	public long getRequiredClearSubDep1Id() {
		return( getClearSubDep2Buff().getRequiredClearSubDep1Id() );
	}

	public String getRequiredName() {
		return( getClearSubDep2Buff().getRequiredName() );
	}

	public IYCFBamClearSubDep1Obj getRequiredContainerClearSubDep1() {
		return( getRequiredContainerClearSubDep1( false ) );
	}

	public IYCFBamClearSubDep1Obj getRequiredContainerClearSubDep1( boolean forceRead ) {
		if( ( requiredContainerClearSubDep1 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerClearSubDep1 = ((IYCFBamSchemaObj)schema).getClearSubDep1TableObj().readClearSubDep1ByIdIdx( getClearSubDep2Buff().getRequiredClearSubDep1TenantId(),
					getClearSubDep2Buff().getRequiredClearSubDep1Id(), forceRead );
			}
		}
		return( requiredContainerClearSubDep1 );
	}

	public List<IYCFBamClearSubDep3Obj> getOptionalComponentsClearDep() {
		List<IYCFBamClearSubDep3Obj> retval;
		retval = ((IYCFBamSchemaObj)schema).getClearSubDep3TableObj().readClearSubDep3ByClearSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamClearSubDep3Obj> getOptionalComponentsClearDep( boolean forceRead ) {
		List<IYCFBamClearSubDep3Obj> retval;
		retval = ((IYCFBamSchemaObj)schema).getClearSubDep3TableObj().readClearSubDep3ByClearSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}
}

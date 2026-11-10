// Description: Java 11 base object instance implementation for YCFBam ClearTopDep.

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

public class YCFBamClearTopDepObj
	extends YCFBamClearDepObj
	implements IYCFBamClearTopDepObj
{
	public final static String CLASS_CODE = "a817";
	protected IYCFBamTableObj requiredContainerTable;
	protected IYCFBamClearTopDepObj optionalLookupPrev;
	protected IYCFBamClearTopDepObj optionalLookupNext;

	public YCFBamClearTopDepObj() {
		super();
		requiredContainerTable = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public YCFBamClearTopDepObj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerTable = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearTopDep" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamTableObj scope = getRequiredContainerTable();
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
		IYCFBamClearTopDepObj retobj = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().realiseClearTopDep(
			(IYCFBamClearTopDepObj)this );
		return( (IYCFBamScopeObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getClearTopDepTableObj().reallyDeepDisposeClearTopDep( (IYCFBamClearTopDepObj)this );
	}

	public IYCFBamScopeObj read() {
		IYCFBamClearTopDepObj retobj = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().readClearTopDepByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamScopeObj read( boolean forceRead ) {
		IYCFBamClearTopDepObj retobj = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().readClearTopDepByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamScopeObj)retobj );
	}

	public IYCFBamClearTopDepObj moveUp() {
		IYCFBamClearTopDepObj retobj = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().moveUpClearTopDep( this );
		return( (IYCFBamClearTopDepObj)retobj );
	}

	public IYCFBamClearTopDepObj moveDown() {
		IYCFBamClearTopDepObj retobj = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().moveDownClearTopDep( this );
		return( (IYCFBamClearTopDepObj)retobj );
	}

	public IYCFBamClearTopDepTableObj getClearTopDepTable() {
		return( ((IYCFBamSchemaObj)schema).getClearTopDepTableObj() );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearTopDep().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearTopDep().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFBamClearTopDepBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamClearTopDepBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
		requiredContainerTable = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public YCFBamClearTopDepBuff getClearTopDepBuff() {
		return( (YCFBamClearTopDepBuff)getBuff() );
	}

	public IYCFBamScopeEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamClearTopDepObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamClearTopDepObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().lockClearTopDep( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().newEditInstance( lockobj );
		return( (IYCFBamScopeEditObj)edit );
	}

	public IYCFBamClearTopDepEditObj getEditAsClearTopDep() {
		return( (IYCFBamClearTopDepEditObj)edit );
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

	public long getRequiredTableTenantId() {
		return( getClearTopDepBuff().getRequiredTableTenantId() );
	}

	public long getRequiredTableId() {
		return( getClearTopDepBuff().getRequiredTableId() );
	}

	public String getRequiredName() {
		return( getClearTopDepBuff().getRequiredName() );
	}

	public Long getOptionalPrevTenantId() {
		return( getClearTopDepBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getClearTopDepBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getClearTopDepBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getClearTopDepBuff().getOptionalNextId() );
	}

	public IYCFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( ( requiredContainerTable == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerTable = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getClearTopDepBuff().getRequiredTableTenantId(),
					getClearTopDepBuff().getRequiredTableId(), forceRead );
			}
		}
		return( requiredContainerTable );
	}

	public List<IYCFBamClearSubDep1Obj> getOptionalComponentsClearDep() {
		List<IYCFBamClearSubDep1Obj> retval;
		retval = ((IYCFBamSchemaObj)schema).getClearSubDep1TableObj().readClearSubDep1ByClearTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamClearSubDep1Obj> getOptionalComponentsClearDep( boolean forceRead ) {
		List<IYCFBamClearSubDep1Obj> retval;
		retval = ((IYCFBamSchemaObj)schema).getClearSubDep1TableObj().readClearSubDep1ByClearTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamClearTopDepObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamClearTopDepObj getOptionalLookupPrev( boolean forceRead ) {
		if( ( optionalLookupPrev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getClearTopDepBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getClearTopDepBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrev = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().readClearTopDepByIdIdx( getClearTopDepBuff().getOptionalPrevTenantId(),
					getClearTopDepBuff().getOptionalPrevId(), forceRead );
			}
		}
		return( optionalLookupPrev );
	}

	public IYCFBamClearTopDepObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamClearTopDepObj getOptionalLookupNext( boolean forceRead ) {
		if( ( optionalLookupNext == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getClearTopDepBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getClearTopDepBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNext = ((IYCFBamSchemaObj)schema).getClearTopDepTableObj().readClearTopDepByIdIdx( getClearTopDepBuff().getOptionalNextTenantId(),
					getClearTopDepBuff().getOptionalNextId(), forceRead );
			}
		}
		return( optionalLookupNext );
	}
}

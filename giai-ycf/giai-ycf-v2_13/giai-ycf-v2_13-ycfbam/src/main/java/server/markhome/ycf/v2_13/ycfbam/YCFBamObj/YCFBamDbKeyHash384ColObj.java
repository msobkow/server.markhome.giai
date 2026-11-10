// Description: Java 11 base object instance implementation for YCFBam DbKeyHash384Col.

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

public class YCFBamDbKeyHash384ColObj
	extends YCFBamDbKeyHash384DefObj
	implements IYCFBamDbKeyHash384ColObj
{
	public final static String CLASS_CODE = "a84c";
	protected IYCFBamTableObj requiredContainerTable;

	public YCFBamDbKeyHash384ColObj() {
		super();
		requiredContainerTable = null;
	}

	public YCFBamDbKeyHash384ColObj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		requiredContainerTable = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash384Col" );
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

	public IYCFBamValueObj realise() {
		IYCFBamDbKeyHash384ColObj retobj = ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().realiseDbKeyHash384Col(
			(IYCFBamDbKeyHash384ColObj)this );
		return( (IYCFBamValueObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().reallyDeepDisposeDbKeyHash384Col( (IYCFBamDbKeyHash384ColObj)this );
	}

	public IYCFBamValueObj read() {
		IYCFBamDbKeyHash384ColObj retobj = ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().readDbKeyHash384ColByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj read( boolean forceRead ) {
		IYCFBamDbKeyHash384ColObj retobj = ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().readDbKeyHash384ColByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveUp() {
		IYCFBamDbKeyHash384ColObj retobj = ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().moveUpDbKeyHash384Col( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveDown() {
		IYCFBamDbKeyHash384ColObj retobj = ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().moveDownDbKeyHash384Col( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamDbKeyHash384ColTableObj getDbKeyHash384ColTable() {
		return( ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj() );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash384Col().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash384Col().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamValueBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamDbKeyHash384ColBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamDbKeyHash384ColBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerScope = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredContainerTable = null;
	}

	public YCFBamDbKeyHash384ColBuff getDbKeyHash384ColBuff() {
		return( (YCFBamDbKeyHash384ColBuff)getBuff() );
	}

	public IYCFBamValueEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamDbKeyHash384ColObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamDbKeyHash384ColObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().lockDbKeyHash384Col( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getDbKeyHash384ColTableObj().newEditInstance( lockobj );
		return( (IYCFBamValueEditObj)edit );
	}

	public IYCFBamDbKeyHash384ColEditObj getEditAsDbKeyHash384Col() {
		return( (IYCFBamDbKeyHash384ColEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamValueBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamValueBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredTableId() {
		return( getDbKeyHash384ColBuff().getRequiredTableId() );
	}

	public IYCFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( ( requiredContainerTable == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerTable = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getDbKeyHash384ColBuff().getRequiredTableId(), forceRead );
			}
		}
		return( requiredContainerTable );
	}
}

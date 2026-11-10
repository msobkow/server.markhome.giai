// Description: Java 11 base object instance implementation for YCFBam UuidGen.

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

public class YCFBamUuidGenObj
	extends YCFBamUuidTypeObj
	implements IYCFBamUuidGenObj
{
	public final static String CLASS_CODE = "a88b";
	protected IYCFBamTableObj optionalLookupDispenser;

	public YCFBamUuidGenObj() {
		super();
		optionalLookupDispenser = null;
	}

	public YCFBamUuidGenObj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "UuidGen" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
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
		IYCFBamUuidGenObj retobj = ((IYCFBamSchemaObj)schema).getUuidGenTableObj().realiseUuidGen(
			(IYCFBamUuidGenObj)this );
		return( (IYCFBamValueObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getUuidGenTableObj().reallyDeepDisposeUuidGen( (IYCFBamUuidGenObj)this );
	}

	public IYCFBamValueObj read() {
		IYCFBamUuidGenObj retobj = ((IYCFBamSchemaObj)schema).getUuidGenTableObj().readUuidGenByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj read( boolean forceRead ) {
		IYCFBamUuidGenObj retobj = ((IYCFBamSchemaObj)schema).getUuidGenTableObj().readUuidGenByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveUp() {
		IYCFBamUuidGenObj retobj = ((IYCFBamSchemaObj)schema).getUuidGenTableObj().moveUpUuidGen( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveDown() {
		IYCFBamUuidGenObj retobj = ((IYCFBamSchemaObj)schema).getUuidGenTableObj().moveDownUuidGen( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamUuidGenTableObj getUuidGenTable() {
		return( ((IYCFBamSchemaObj)schema).getUuidGenTableObj() );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryUuidGen().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableUuidGen().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFBamUuidGenBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamUuidGenBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerScope = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
		requiredContainerSchemaDef = null;
		optionalLookupDispenser = null;
	}

	public YCFBamUuidGenBuff getUuidGenBuff() {
		return( (YCFBamUuidGenBuff)getBuff() );
	}

	public IYCFBamValueEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamUuidGenObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamUuidGenObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getUuidGenTableObj().lockUuidGen( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getUuidGenTableObj().newEditInstance( lockobj );
		return( (IYCFBamValueEditObj)edit );
	}

	public IYCFBamUuidGenEditObj getEditAsUuidGen() {
		return( (IYCFBamUuidGenEditObj)edit );
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

	public Long getOptionalDispenserTenantId() {
		return( getUuidGenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getUuidGenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getUuidGenBuff().getRequiredSlice() );
	}

	public int getRequiredBlockSize() {
		return( getUuidGenBuff().getRequiredBlockSize() );
	}

	public IYCFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public IYCFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( ( optionalLookupDispenser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getUuidGenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getUuidGenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDispenser = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getUuidGenBuff().getOptionalDispenserTenantId(),
					getUuidGenBuff().getOptionalDispenserId(), forceRead );
			}
		}
		return( optionalLookupDispenser );
	}
}

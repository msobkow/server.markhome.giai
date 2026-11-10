// Description: Java 11 base object instance implementation for YCFBam Uuid6Gen.

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

public class YCFBamUuid6GenObj
	extends YCFBamUuid6TypeObj
	implements IYCFBamUuid6GenObj
{
	public final static String CLASS_CODE = "a88c";
	protected IYCFBamTableObj optionalLookupDispenser;

	public YCFBamUuid6GenObj() {
		super();
		optionalLookupDispenser = null;
	}

	public YCFBamUuid6GenObj( IYCFBamSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Uuid6Gen" );
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
		IYCFBamUuid6GenObj retobj = ((IYCFBamSchemaObj)schema).getUuid6GenTableObj().realiseUuid6Gen(
			(IYCFBamUuid6GenObj)this );
		return( (IYCFBamValueObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getUuid6GenTableObj().reallyDeepDisposeUuid6Gen( (IYCFBamUuid6GenObj)this );
	}

	public IYCFBamValueObj read() {
		IYCFBamUuid6GenObj retobj = ((IYCFBamSchemaObj)schema).getUuid6GenTableObj().readUuid6GenByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj read( boolean forceRead ) {
		IYCFBamUuid6GenObj retobj = ((IYCFBamSchemaObj)schema).getUuid6GenTableObj().readUuid6GenByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveUp() {
		IYCFBamUuid6GenObj retobj = ((IYCFBamSchemaObj)schema).getUuid6GenTableObj().moveUpUuid6Gen( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamValueObj moveDown() {
		IYCFBamUuid6GenObj retobj = ((IYCFBamSchemaObj)schema).getUuid6GenTableObj().moveDownUuid6Gen( this );
		return( (IYCFBamValueObj)retobj );
	}

	public IYCFBamUuid6GenTableObj getUuid6GenTable() {
		return( ((IYCFBamSchemaObj)schema).getUuid6GenTableObj() );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryUuid6Gen().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableUuid6Gen().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFBamUuid6GenBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamUuid6GenBuff" );
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

	public YCFBamUuid6GenBuff getUuid6GenBuff() {
		return( (YCFBamUuid6GenBuff)getBuff() );
	}

	public IYCFBamValueEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamUuid6GenObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamUuid6GenObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getUuid6GenTableObj().lockUuid6Gen( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getUuid6GenTableObj().newEditInstance( lockobj );
		return( (IYCFBamValueEditObj)edit );
	}

	public IYCFBamUuid6GenEditObj getEditAsUuid6Gen() {
		return( (IYCFBamUuid6GenEditObj)edit );
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
		return( getUuid6GenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getUuid6GenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getUuid6GenBuff().getRequiredSlice() );
	}

	public int getRequiredBlockSize() {
		return( getUuid6GenBuff().getRequiredBlockSize() );
	}

	public IYCFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public IYCFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( ( optionalLookupDispenser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getUuid6GenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getUuid6GenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDispenser = ((IYCFBamSchemaObj)schema).getTableTableObj().readTableByIdIdx( getUuid6GenBuff().getOptionalDispenserTenantId(),
					getUuid6GenBuff().getOptionalDispenserId(), forceRead );
			}
		}
		return( optionalLookupDispenser );
	}
}

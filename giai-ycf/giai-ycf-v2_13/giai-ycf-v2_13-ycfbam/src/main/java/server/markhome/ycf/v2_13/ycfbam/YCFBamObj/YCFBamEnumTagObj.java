// Description: Java 11 base object instance implementation for CFBam EnumTag.

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

public class CFBamEnumTagObj
	implements ICFBamEnumTagObj
{
	public final static String CLASS_CODE = "a821";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFBamEnumTagEditObj edit;
	protected ICFBamSchemaObj schema;
	protected CFBamEnumTagPKey pKey;
	protected CFBamEnumTagBuff buff;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFBamEnumDefObj requiredContainerEnumDef;
	protected ICFBamSchemaDefObj optionalLookupDefSchema;
	protected ICFBamEnumTagObj optionalLookupPrev;
	protected ICFBamEnumTagObj optionalLookupNext;

	public CFBamEnumTagObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerEnumDef = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public CFBamEnumTagObj( ICFBamSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
		requiredContainerEnumDef = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "EnumTag" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamEnumDefObj scope = getRequiredContainerEnumDef();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamEnumDefObj scope = getRequiredContainerEnumDef();
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

	public ICFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
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

	public String getObjFullName() {
		String fullName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				fullName = containerName + "." + fullName;
				container = container.getObjScope();
			}
		}
		return( fullName );
	}

	public ICFBamEnumTagObj realise() {
		ICFBamEnumTagObj retobj = ((ICFBamSchemaObj)schema).getEnumTagTableObj().realiseEnumTag(
			(ICFBamEnumTagObj)this );
		return( (ICFBamEnumTagObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getEnumTagTableObj().reallyDeepDisposeEnumTag( (ICFBamEnumTagObj)this );
	}

	public ICFBamEnumTagObj read() {
		ICFBamEnumTagObj retobj = ((ICFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFBamEnumTagObj)retobj );
	}

	public ICFBamEnumTagObj read( boolean forceRead ) {
		ICFBamEnumTagObj retobj = ((ICFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFBamEnumTagObj)retobj );
	}

	public ICFBamEnumTagObj moveUp() {
		ICFBamEnumTagObj retobj = ((ICFBamSchemaObj)schema).getEnumTagTableObj().moveUpEnumTag( this );
		return( (ICFBamEnumTagObj)retobj );
	}

	public ICFBamEnumTagObj moveDown() {
		ICFBamEnumTagObj retobj = ((ICFBamSchemaObj)schema).getEnumTagTableObj().moveDownEnumTag( this );
		return( (ICFBamEnumTagObj)retobj );
	}

	public ICFBamEnumTagTableObj getEnumTagTable() {
		return( ((ICFBamSchemaObj)schema).getEnumTagTableObj() );
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = value;
	}

	public CFBamEnumTagBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFBamEnumTagBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFBamEnumTagBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFBamEnumTagBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerEnumDef = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public CFBamEnumTagBuff getEnumTagBuff() {
		return( (CFBamEnumTagBuff)getBuff() );
	}

	public CFBamEnumTagPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFBamEnumTagPKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToBuff();
		}
	}

	public boolean getIsNew() {
		return( isNew );
	}

	public void setIsNew( boolean value ) {
		isNew = value;
	}

	public ICFBamEnumTagEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFBamEnumTagObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFBamEnumTagObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getEnumTagTableObj().lockEnumTag( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getEnumTagTableObj().newEditInstance( lockobj );
		return( (ICFBamEnumTagEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFBamEnumTagEditObj getEdit() {
		return( edit );
	}

	public ICFBamEnumTagEditObj getEditAsEnumTag() {
		return( (ICFBamEnumTagEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFBamEnumTagBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFBamEnumTagBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getEnumTagBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getEnumTagBuff().getOptionalDefSchemaId() );
	}

	public long getRequiredEnumId() {
		return( getEnumTagBuff().getRequiredEnumId() );
	}

	public Short getOptionalEnumCode() {
		return( getEnumTagBuff().getOptionalEnumCode() );
	}

	public String getRequiredName() {
		return( getEnumTagBuff().getRequiredName() );
	}

	public Long getOptionalPrevTenantId() {
		return( getEnumTagBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getEnumTagBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getEnumTagBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getEnumTagBuff().getOptionalNextId() );
	}

	public ICFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((ICFBamSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public ICFBamEnumDefObj getRequiredContainerEnumDef() {
		return( getRequiredContainerEnumDef( false ) );
	}

	public ICFBamEnumDefObj getRequiredContainerEnumDef( boolean forceRead ) {
		if( ( requiredContainerEnumDef == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerEnumDef = ((ICFBamSchemaObj)schema).getEnumDefTableObj().readEnumDefByIdIdx( getPKey().getRequiredTenantId(),
					getEnumTagBuff().getRequiredEnumId(), forceRead );
			}
		}
		return( requiredContainerEnumDef );
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((ICFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getEnumTagBuff().getOptionalDefSchemaTenantId(),
					getEnumTagBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public ICFBamEnumTagObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public ICFBamEnumTagObj getOptionalLookupPrev( boolean forceRead ) {
		if( ( optionalLookupPrev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrev = ((ICFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getEnumTagBuff().getOptionalPrevTenantId(),
					getEnumTagBuff().getOptionalPrevId(), forceRead );
			}
		}
		return( optionalLookupPrev );
	}

	public ICFBamEnumTagObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public ICFBamEnumTagObj getOptionalLookupNext( boolean forceRead ) {
		if( ( optionalLookupNext == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNext = ((ICFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getEnumTagBuff().getOptionalNextTenantId(),
					getEnumTagBuff().getOptionalNextId(), forceRead );
			}
		}
		return( optionalLookupNext );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}

// Description: Java 11 base object instance implementation for YCFBam EnumTag.

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

public class YCFBamEnumTagObj
	implements IYCFBamEnumTagObj
{
	public final static String CLASS_CODE = "a821";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFBamEnumTagEditObj edit;
	protected IYCFBamSchemaObj schema;
	protected YCFBamEnumTagPKey pKey;
	protected YCFBamEnumTagBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamEnumDefObj requiredContainerEnumDef;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamEnumTagObj optionalLookupPrev;
	protected IYCFBamEnumTagObj optionalLookupNext;

	public YCFBamEnumTagObj() {
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerEnumDef = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public YCFBamEnumTagObj( IYCFBamSchemaObj argSchema ) {
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

	public IYCFLibAnyObj getScope() {
		IYCFBamEnumDefObj scope = getRequiredContainerEnumDef();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamEnumDefObj scope = getRequiredContainerEnumDef();
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

	public IYCFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		IYCFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		IYCFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
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

	public String getObjFullName() {
		String fullName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
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

	public IYCFBamEnumTagObj realise() {
		IYCFBamEnumTagObj retobj = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().realiseEnumTag(
			(IYCFBamEnumTagObj)this );
		return( (IYCFBamEnumTagObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getEnumTagTableObj().reallyDeepDisposeEnumTag( (IYCFBamEnumTagObj)this );
	}

	public IYCFBamEnumTagObj read() {
		IYCFBamEnumTagObj retobj = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamEnumTagObj)retobj );
	}

	public IYCFBamEnumTagObj read( boolean forceRead ) {
		IYCFBamEnumTagObj retobj = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamEnumTagObj)retobj );
	}

	public IYCFBamEnumTagObj moveUp() {
		IYCFBamEnumTagObj retobj = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().moveUpEnumTag( this );
		return( (IYCFBamEnumTagObj)retobj );
	}

	public IYCFBamEnumTagObj moveDown() {
		IYCFBamEnumTagObj retobj = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().moveDownEnumTag( this );
		return( (IYCFBamEnumTagObj)retobj );
	}

	public IYCFBamEnumTagTableObj getEnumTagTable() {
		return( ((IYCFBamSchemaObj)schema).getEnumTagTableObj() );
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = value;
	}

	public YCFBamEnumTagBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableEnumTag().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamEnumTagBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamEnumTagBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamEnumTagBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerEnumDef = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public YCFBamEnumTagBuff getEnumTagBuff() {
		return( (YCFBamEnumTagBuff)getBuff() );
	}

	public YCFBamEnumTagPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryEnumTag().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFBamEnumTagPKey value ) {
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

	public IYCFBamEnumTagEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamEnumTagObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamEnumTagObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().lockEnumTag( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().newEditInstance( lockobj );
		return( (IYCFBamEnumTagEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFBamEnumTagEditObj getEdit() {
		return( edit );
	}

	public IYCFBamEnumTagEditObj getEditAsEnumTag() {
		return( (IYCFBamEnumTagEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamEnumTagBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamEnumTagBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((IYCFBamSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public IYCFBamEnumDefObj getRequiredContainerEnumDef() {
		return( getRequiredContainerEnumDef( false ) );
	}

	public IYCFBamEnumDefObj getRequiredContainerEnumDef( boolean forceRead ) {
		if( ( requiredContainerEnumDef == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerEnumDef = ((IYCFBamSchemaObj)schema).getEnumDefTableObj().readEnumDefByIdIdx( getPKey().getRequiredTenantId(),
					getEnumTagBuff().getRequiredEnumId(), forceRead );
			}
		}
		return( requiredContainerEnumDef );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getEnumTagBuff().getOptionalDefSchemaTenantId(),
					getEnumTagBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
	}

	public IYCFBamEnumTagObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamEnumTagObj getOptionalLookupPrev( boolean forceRead ) {
		if( ( optionalLookupPrev == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrev = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getEnumTagBuff().getOptionalPrevTenantId(),
					getEnumTagBuff().getOptionalPrevId(), forceRead );
			}
		}
		return( optionalLookupPrev );
	}

	public IYCFBamEnumTagObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamEnumTagObj getOptionalLookupNext( boolean forceRead ) {
		if( ( optionalLookupNext == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNext = ((IYCFBamSchemaObj)schema).getEnumTagTableObj().readEnumTagByIdIdx( getEnumTagBuff().getOptionalNextTenantId(),
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

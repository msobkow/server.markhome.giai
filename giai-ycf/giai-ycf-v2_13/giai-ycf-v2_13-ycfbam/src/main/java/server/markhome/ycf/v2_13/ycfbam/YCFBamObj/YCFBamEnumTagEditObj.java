// Description: Java 11 edit object instance implementation for YCFBam EnumTag.

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

public class YCFBamEnumTagEditObj
	implements IYCFBamEnumTagEditObj
{
	protected IYCFBamEnumTagObj orig;
	protected YCFBamEnumTagBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamEnumDefObj requiredContainerEnumDef;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamEnumTagObj optionalLookupPrev;
	protected IYCFBamEnumTagObj optionalLookupNext;

	public YCFBamEnumTagEditObj( IYCFBamEnumTagObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFBamEnumTagBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerEnumDef = null;
		optionalLookupDefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
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

	public void setCreatedBy( IYCFSecSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( IYCFSecSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( YCFBamEnumTagObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamEnumTagObj retobj = getSchema().getEnumTagTableObj().realiseEnumTag( (IYCFBamEnumTagObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsEnumTag().forget();
	}

	public IYCFBamEnumTagObj read() {
		IYCFBamEnumTagObj retval = getOrigAsEnumTag().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamEnumTagObj read( boolean forceRead ) {
		IYCFBamEnumTagObj retval = getOrigAsEnumTag().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamEnumTagObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamEnumTagObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamEnumTagObj create() {
		copyBuffToOrig();
		IYCFBamEnumTagObj retobj = ((IYCFBamSchemaObj)getOrigAsEnumTag().getSchema()).getEnumTagTableObj().createEnumTag( getOrigAsEnumTag() );
		if( retobj == getOrigAsEnumTag() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamEnumTagEditObj update() {
		getSchema().getEnumTagTableObj().updateEnumTag( (IYCFBamEnumTagObj)this );
		return( null );
	}

	public YCFBamEnumTagEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getEnumTagTableObj().deleteEnumTag( getOrigAsEnumTag() );
		return( null );
	}

	public IYCFBamEnumTagTableObj getEnumTagTable() {
		return( orig.getSchema().getEnumTagTableObj() );
	}

	public IYCFBamEnumTagEditObj getEdit() {
		return( (IYCFBamEnumTagEditObj)this );
	}

	public IYCFBamEnumTagEditObj getEditAsEnumTag() {
		return( (IYCFBamEnumTagEditObj)this );
	}

	public IYCFBamEnumTagEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFBamEnumTagObj getOrig() {
		return( orig );
	}

	public IYCFBamEnumTagObj getOrigAsEnumTag() {
		return( (IYCFBamEnumTagObj)orig );
	}

	public IYCFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFBamEnumTagBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsEnumTag().getSchema().getBackingStore()).getFactoryEnumTag().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamEnumTagBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerEnumDef = null;
			optionalLookupDefSchema = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
		}
	}

	public YCFBamEnumTagBuff getEnumTagBuff() {
		return( (YCFBamEnumTagBuff)getBuff() );
	}

	public YCFBamEnumTagPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFBamEnumTagPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
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

	public void setOptionalEnumCode( Short value ) {
		if( getEnumTagBuff().getOptionalEnumCode() != value ) {
			getEnumTagBuff().setOptionalEnumCode( value );
		}
	}

	public String getRequiredName() {
		return( getEnumTagBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getEnumTagBuff().getRequiredName() != value ) {
			getEnumTagBuff().setRequiredName( value );
		}
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
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsEnumTag().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getEnumTagBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getEnumTagBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFBamEnumDefObj getRequiredContainerEnumDef() {
		return( getRequiredContainerEnumDef( false ) );
	}

	public IYCFBamEnumDefObj getRequiredContainerEnumDef( boolean forceRead ) {
		if( forceRead || ( requiredContainerEnumDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamEnumDefObj obj = ((IYCFBamSchemaObj)getOrigAsEnumTag().getSchema()).getEnumDefTableObj().readEnumDefByIdIdx( getPKey().getRequiredTenantId(),
					getEnumTagBuff().getRequiredEnumId() );
				requiredContainerEnumDef = obj;
				if( obj != null ) {
					getEnumTagBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getEnumTagBuff().setRequiredEnumId( obj.getRequiredId() );
					requiredContainerEnumDef = obj;
				}
			}
		}
		return( requiredContainerEnumDef );
	}

	public void setRequiredContainerEnumDef( IYCFBamEnumDefObj value ) {
			if( buff == null ) {
				getEnumTagBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getEnumTagBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getEnumTagBuff().setRequiredEnumId( value.getRequiredId() );
			}
			requiredContainerEnumDef = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsEnumTag().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getEnumTagBuff().getOptionalDefSchemaTenantId(),
					getEnumTagBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getEnumTagBuff();
			}
			if( value != null ) {
				getEnumTagBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getEnumTagBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getEnumTagBuff().setOptionalDefSchemaTenantId( null );
				getEnumTagBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public IYCFBamEnumTagObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamEnumTagObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamEnumTagObj obj = ((IYCFBamSchemaObj)getOrigAsEnumTag().getSchema()).getEnumTagTableObj().readEnumTagByIdIdx( getEnumTagBuff().getOptionalPrevTenantId(),
					getEnumTagBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( IYCFBamEnumTagObj value ) {
			if( buff == null ) {
				getEnumTagBuff();
			}
			if( value != null ) {
				getEnumTagBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getEnumTagBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getEnumTagBuff().setOptionalPrevTenantId( null );
				getEnumTagBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public IYCFBamEnumTagObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamEnumTagObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getEnumTagBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getEnumTagBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamEnumTagObj obj = ((IYCFBamSchemaObj)getOrigAsEnumTag().getSchema()).getEnumTagTableObj().readEnumTagByIdIdx( getEnumTagBuff().getOptionalNextTenantId(),
					getEnumTagBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( IYCFBamEnumTagObj value ) {
			if( buff == null ) {
				getEnumTagBuff();
			}
			if( value != null ) {
				getEnumTagBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getEnumTagBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getEnumTagBuff().setOptionalNextTenantId( null );
				getEnumTagBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFBamEnumTagBuff origBuff = getOrigAsEnumTag().getEnumTagBuff();
		YCFBamEnumTagBuff myBuff = getEnumTagBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamEnumTagBuff origBuff = getOrigAsEnumTag().getEnumTagBuff();
		YCFBamEnumTagBuff myBuff = getEnumTagBuff();
		myBuff.set( origBuff );
	}
}

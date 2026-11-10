// Description: Java 11 base object instance implementation for YCFBam RoleDef.

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

public class YCFBamRoleDefObj
	implements IYCFBamRoleDefObj
{
	public final static String CLASS_CODE = "a88d";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFBamRoleDefEditObj edit;
	protected IYCFBamSchemaObj schema;
	protected YCFBamRoleDefPKey pKey;
	protected YCFBamRoleDefBuff buff;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamScopeObj requiredContainerScopeDef;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;

	public YCFBamRoleDefObj() {
		getPKey().setClassCode( getClassCode() );
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerScopeDef = null;
		optionalLookupDefSchema = null;
	}

	public YCFBamRoleDefObj( IYCFBamSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		getPKey().setClassCode( getClassCode() );
		requiredOwnerTenant = null;
		requiredContainerScopeDef = null;
		optionalLookupDefSchema = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RoleDef" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamScopeObj scope = getRequiredContainerScopeDef();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamScopeObj scope = getRequiredContainerScopeDef();
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

	public IYCFBamRoleDefObj realise() {
		IYCFBamRoleDefObj retobj = ((IYCFBamSchemaObj)schema).getRoleDefTableObj().realiseRoleDef(
			(IYCFBamRoleDefObj)this );
		return( (IYCFBamRoleDefObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getRoleDefTableObj().reallyDeepDisposeRoleDef( (IYCFBamRoleDefObj)this );
	}

	public IYCFBamRoleDefObj read() {
		IYCFBamRoleDefObj retobj = ((IYCFBamSchemaObj)schema).getRoleDefTableObj().readRoleDefByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFBamRoleDefObj)retobj );
	}

	public IYCFBamRoleDefObj read( boolean forceRead ) {
		IYCFBamRoleDefObj retobj = ((IYCFBamSchemaObj)schema).getRoleDefTableObj().readRoleDefByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFBamRoleDefObj)retobj );
	}

	public IYCFBamRoleDefTableObj getRoleDefTable() {
		return( ((IYCFBamSchemaObj)schema).getRoleDefTableObj() );
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = value;
	}

	public YCFBamRoleDefBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFBamRoleDefBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFBamRoleDefBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFBamRoleDefBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerScopeDef = null;
		optionalLookupDefSchema = null;
	}

	public YCFBamRoleDefBuff getRoleDefBuff() {
		return( (YCFBamRoleDefBuff)getBuff() );
	}

	public YCFBamRoleDefPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFBamRoleDefPKey value ) {
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

	public IYCFBamRoleDefEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFBamRoleDefObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFBamRoleDefObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getRoleDefTableObj().lockRoleDef( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getRoleDefTableObj().newEditInstance( lockobj );
		return( (IYCFBamRoleDefEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFBamRoleDefEditObj getEdit() {
		return( edit );
	}

	public IYCFBamRoleDefEditObj getEditAsRoleDef() {
		return( (IYCFBamRoleDefEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFBamRoleDefBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFBamRoleDefBuff buff = getBuff();
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

	public long getRequiredScopeId() {
		return( getRoleDefBuff().getRequiredScopeId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getRoleDefBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getRoleDefBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getRoleDefBuff().getRequiredName() );
	}

	public String getRequiredEnables() {
		return( getRoleDefBuff().getRequiredEnables() );
	}

	public String getRequiredIncludes() {
		return( getRoleDefBuff().getRequiredIncludes() );
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

	public IYCFBamScopeObj getRequiredContainerScopeDef() {
		return( getRequiredContainerScopeDef( false ) );
	}

	public IYCFBamScopeObj getRequiredContainerScopeDef( boolean forceRead ) {
		if( ( requiredContainerScopeDef == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerScopeDef = ((IYCFBamSchemaObj)schema).getScopeTableObj().readScopeByIdIdx( getPKey().getRequiredTenantId(),
					getRoleDefBuff().getRequiredScopeId(), forceRead );
			}
		}
		return( requiredContainerScopeDef );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( ( optionalLookupDefSchema == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getRoleDefBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getRoleDefBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupDefSchema = ((IYCFBamSchemaObj)schema).getSchemaDefTableObj().readSchemaDefByIdIdx( getRoleDefBuff().getOptionalDefSchemaTenantId(),
					getRoleDefBuff().getOptionalDefSchemaId(), forceRead );
			}
		}
		return( optionalLookupDefSchema );
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
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}

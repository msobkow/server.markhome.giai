// Description: Java 11 edit object instance implementation for CFBam RoleDef.

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

public class CFBamRoleDefEditObj
	implements ICFBamRoleDefEditObj
{
	protected ICFBamRoleDefObj orig;
	protected CFBamRoleDefBuff buff;
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected ICFSecTenantObj requiredOwnerTenant;
	protected ICFBamScopeObj requiredContainerScopeDef;
	protected ICFBamSchemaDefObj optionalLookupDefSchema;

	public CFBamRoleDefEditObj( ICFBamRoleDefObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFBamRoleDefBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerScopeDef = null;
		optionalLookupDefSchema = null;
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFBamRoleDefBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFBamRoleDefBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public void setCreatedBy( ICFSecSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( ICFSecSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( CFBamRoleDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RoleDef" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamScopeObj scope = getRequiredContainerScopeDef();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamScopeObj scope = getRequiredContainerScopeDef();
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

	public ICFBamRoleDefObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamRoleDefObj retobj = getSchema().getRoleDefTableObj().realiseRoleDef( (ICFBamRoleDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsRoleDef().forget();
	}

	public ICFBamRoleDefObj read() {
		ICFBamRoleDefObj retval = getOrigAsRoleDef().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFBamRoleDefObj read( boolean forceRead ) {
		ICFBamRoleDefObj retval = getOrigAsRoleDef().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFBamRoleDefObj create() {
		copyBuffToOrig();
		ICFBamRoleDefObj retobj = ((ICFBamSchemaObj)getOrigAsRoleDef().getSchema()).getRoleDefTableObj().createRoleDef( getOrigAsRoleDef() );
		if( retobj == getOrigAsRoleDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamRoleDefEditObj update() {
		getSchema().getRoleDefTableObj().updateRoleDef( (ICFBamRoleDefObj)this );
		return( null );
	}

	public CFBamRoleDefEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getRoleDefTableObj().deleteRoleDef( getOrigAsRoleDef() );
		return( null );
	}

	public ICFBamRoleDefTableObj getRoleDefTable() {
		return( orig.getSchema().getRoleDefTableObj() );
	}

	public ICFBamRoleDefEditObj getEdit() {
		return( (ICFBamRoleDefEditObj)this );
	}

	public ICFBamRoleDefEditObj getEditAsRoleDef() {
		return( (ICFBamRoleDefEditObj)this );
	}

	public ICFBamRoleDefEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFBamRoleDefObj getOrig() {
		return( orig );
	}

	public ICFBamRoleDefObj getOrigAsRoleDef() {
		return( (ICFBamRoleDefObj)orig );
	}

	public ICFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFBamRoleDefBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsRoleDef().getSchema().getBackingStore()).getFactoryRoleDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamRoleDefBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerScopeDef = null;
			optionalLookupDefSchema = null;
		}
	}

	public CFBamRoleDefBuff getRoleDefBuff() {
		return( (CFBamRoleDefBuff)getBuff() );
	}

	public CFBamRoleDefPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFBamRoleDefPKey value ) {
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

	public void setRequiredName( String value ) {
		if( getRoleDefBuff().getRequiredName() != value ) {
			getRoleDefBuff().setRequiredName( value );
		}
	}

	public String getRequiredEnables() {
		return( getRoleDefBuff().getRequiredEnables() );
	}

	public void setRequiredEnables( String value ) {
		if( getRoleDefBuff().getRequiredEnables() != value ) {
			getRoleDefBuff().setRequiredEnables( value );
		}
	}

	public String getRequiredIncludes() {
		return( getRoleDefBuff().getRequiredIncludes() );
	}

	public void setRequiredIncludes( String value ) {
		if( getRoleDefBuff().getRequiredIncludes() != value ) {
			getRoleDefBuff().setRequiredIncludes( value );
		}
	}

	public ICFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFSecTenantObj obj = ((ICFBamSchemaObj)getOrigAsRoleDef().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( ICFSecTenantObj value ) {
			if( buff == null ) {
				getRoleDefBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getRoleDefBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public ICFBamScopeObj getRequiredContainerScopeDef() {
		return( getRequiredContainerScopeDef( false ) );
	}

	public ICFBamScopeObj getRequiredContainerScopeDef( boolean forceRead ) {
		if( forceRead || ( requiredContainerScopeDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamScopeObj obj = ((ICFBamSchemaObj)getOrigAsRoleDef().getSchema()).getScopeTableObj().readScopeByIdIdx( getPKey().getRequiredTenantId(),
					getRoleDefBuff().getRequiredScopeId() );
				requiredContainerScopeDef = obj;
				if( obj != null ) {
					getRoleDefBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getRoleDefBuff().setRequiredScopeId( obj.getRequiredId() );
					requiredContainerScopeDef = obj;
				}
			}
		}
		return( requiredContainerScopeDef );
	}

	public void setRequiredContainerScopeDef( ICFBamScopeObj value ) {
			if( buff == null ) {
				getRoleDefBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getRoleDefBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getRoleDefBuff().setRequiredScopeId( value.getRequiredId() );
			}
			requiredContainerScopeDef = value;
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getRoleDefBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getRoleDefBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsRoleDef().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getRoleDefBuff().getOptionalDefSchemaTenantId(),
					getRoleDefBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getRoleDefBuff();
			}
			if( value != null ) {
				getRoleDefBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getRoleDefBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getRoleDefBuff().setOptionalDefSchemaTenantId( null );
				getRoleDefBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		CFBamRoleDefBuff origBuff = getOrigAsRoleDef().getRoleDefBuff();
		CFBamRoleDefBuff myBuff = getRoleDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamRoleDefBuff origBuff = getOrigAsRoleDef().getRoleDefBuff();
		CFBamRoleDefBuff myBuff = getRoleDefBuff();
		myBuff.set( origBuff );
	}
}

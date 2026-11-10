// Description: Java 11 edit object instance implementation for YCFBam RoleDef.

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

public class YCFBamRoleDefEditObj
	implements IYCFBamRoleDefEditObj
{
	protected IYCFBamRoleDefObj orig;
	protected YCFBamRoleDefBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected IYCFSecTenantObj requiredOwnerTenant;
	protected IYCFBamScopeObj requiredContainerScopeDef;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;

	public YCFBamRoleDefEditObj( IYCFBamRoleDefObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFBamRoleDefBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerScopeDef = null;
		optionalLookupDefSchema = null;
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
		return( YCFBamRoleDefObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamRoleDefObj retobj = getSchema().getRoleDefTableObj().realiseRoleDef( (IYCFBamRoleDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsRoleDef().forget();
	}

	public IYCFBamRoleDefObj read() {
		IYCFBamRoleDefObj retval = getOrigAsRoleDef().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamRoleDefObj read( boolean forceRead ) {
		IYCFBamRoleDefObj retval = getOrigAsRoleDef().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFBamRoleDefObj create() {
		copyBuffToOrig();
		IYCFBamRoleDefObj retobj = ((IYCFBamSchemaObj)getOrigAsRoleDef().getSchema()).getRoleDefTableObj().createRoleDef( getOrigAsRoleDef() );
		if( retobj == getOrigAsRoleDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamRoleDefEditObj update() {
		getSchema().getRoleDefTableObj().updateRoleDef( (IYCFBamRoleDefObj)this );
		return( null );
	}

	public YCFBamRoleDefEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getRoleDefTableObj().deleteRoleDef( getOrigAsRoleDef() );
		return( null );
	}

	public IYCFBamRoleDefTableObj getRoleDefTable() {
		return( orig.getSchema().getRoleDefTableObj() );
	}

	public IYCFBamRoleDefEditObj getEdit() {
		return( (IYCFBamRoleDefEditObj)this );
	}

	public IYCFBamRoleDefEditObj getEditAsRoleDef() {
		return( (IYCFBamRoleDefEditObj)this );
	}

	public IYCFBamRoleDefEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFBamRoleDefObj getOrig() {
		return( orig );
	}

	public IYCFBamRoleDefObj getOrigAsRoleDef() {
		return( (IYCFBamRoleDefObj)orig );
	}

	public IYCFBamSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFBamRoleDefBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsRoleDef().getSchema().getBackingStore()).getFactoryRoleDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamRoleDefBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerScopeDef = null;
			optionalLookupDefSchema = null;
		}
	}

	public YCFBamRoleDefBuff getRoleDefBuff() {
		return( (YCFBamRoleDefBuff)getBuff() );
	}

	public YCFBamRoleDefPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFBamRoleDefPKey value ) {
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

	public IYCFSecTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsRoleDef().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getRoleDefBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getRoleDefBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFBamScopeObj getRequiredContainerScopeDef() {
		return( getRequiredContainerScopeDef( false ) );
	}

	public IYCFBamScopeObj getRequiredContainerScopeDef( boolean forceRead ) {
		if( forceRead || ( requiredContainerScopeDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamScopeObj obj = ((IYCFBamSchemaObj)getOrigAsRoleDef().getSchema()).getScopeTableObj().readScopeByIdIdx( getPKey().getRequiredTenantId(),
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

	public void setRequiredContainerScopeDef( IYCFBamScopeObj value ) {
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

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getRoleDefBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getRoleDefBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsRoleDef().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getRoleDefBuff().getOptionalDefSchemaTenantId(),
					getRoleDefBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
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
		YCFBamRoleDefBuff origBuff = getOrigAsRoleDef().getRoleDefBuff();
		YCFBamRoleDefBuff myBuff = getRoleDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamRoleDefBuff origBuff = getOrigAsRoleDef().getRoleDefBuff();
		YCFBamRoleDefBuff myBuff = getRoleDefBuff();
		myBuff.set( origBuff );
	}
}

// Description: Java 11 edit object instance implementation for YCFBam SchemaRef.

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

public class YCFBamSchemaRefEditObj
	extends YCFBamScopeEditObj

	implements IYCFBamSchemaRefEditObj
{
	protected IYCFBamSchemaDefObj requiredContainerSchema;
	protected IYCFBamSchemaDefObj optionalLookupRefSchema;
	protected IYCFBamSchemaRefObj optionalLookupPrev;
	protected IYCFBamSchemaRefObj optionalLookupNext;

	public YCFBamSchemaRefEditObj( IYCFBamSchemaRefObj argOrig ) {
		super( argOrig );
		requiredContainerSchema = null;
		optionalLookupRefSchema = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public String getClassCode() {
		return( YCFBamSchemaRefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SchemaRef" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamSchemaDefObj scope = getRequiredContainerSchema();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamSchemaDefObj scope = getRequiredContainerSchema();
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
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public IYCFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamSchemaRefObj retobj = getSchema().getSchemaRefTableObj().realiseSchemaRef( (IYCFBamSchemaRefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSchemaRef().forget();
	}

	public IYCFBamSchemaRefObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamSchemaRefObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamSchemaRefObj retobj = ((IYCFBamSchemaObj)getOrigAsSchemaRef().getSchema()).getSchemaRefTableObj().createSchemaRef( getOrigAsSchemaRef() );
		if( retobj == getOrigAsSchemaRef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getSchemaRefTableObj().updateSchemaRef( (IYCFBamSchemaRefObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSchemaRefTableObj().deleteSchemaRef( getOrigAsSchemaRef() );
		return( null );
	}

	public IYCFBamSchemaRefTableObj getSchemaRefTable() {
		return( orig.getSchema().getSchemaRefTableObj() );
	}

	public IYCFBamSchemaRefEditObj getEditAsSchemaRef() {
		return( (IYCFBamSchemaRefEditObj)this );
	}

	public IYCFBamSchemaRefObj getOrigAsSchemaRef() {
		return( (IYCFBamSchemaRefObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsSchemaRef().getSchema().getBackingStore()).getFactorySchemaRef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerSchema = null;
			optionalLookupRefSchema = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
		}
	}

	public YCFBamSchemaRefBuff getSchemaRefBuff() {
		return( (YCFBamSchemaRefBuff)getBuff() );
	}

	public long getRequiredSchemaId() {
		return( getSchemaRefBuff().getRequiredSchemaId() );
	}

	public String getRequiredName() {
		return( getSchemaRefBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getSchemaRefBuff().getRequiredName() != value ) {
			getSchemaRefBuff().setRequiredName( value );
		}
	}

	public String getRequiredRefModelName() {
		return( getSchemaRefBuff().getRequiredRefModelName() );
	}

	public void setRequiredRefModelName( String value ) {
		if( getSchemaRefBuff().getRequiredRefModelName() != value ) {
			getSchemaRefBuff().setRequiredRefModelName( value );
		}
	}

	public String getRequiredIncludeRoot() {
		return( getSchemaRefBuff().getRequiredIncludeRoot() );
	}

	public void setRequiredIncludeRoot( String value ) {
		if( getSchemaRefBuff().getRequiredIncludeRoot() != value ) {
			getSchemaRefBuff().setRequiredIncludeRoot( value );
		}
	}

	public Long getOptionalRefSchemaTenantId() {
		return( getSchemaRefBuff().getOptionalRefSchemaTenantId() );
	}

	public Long getOptionalRefSchemaId() {
		return( getSchemaRefBuff().getOptionalRefSchemaId() );
	}

	public Long getOptionalPrevTenantId() {
		return( getSchemaRefBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getSchemaRefBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getSchemaRefBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getSchemaRefBuff().getOptionalNextId() );
	}

	public IYCFBamSchemaDefObj getRequiredContainerSchema() {
		return( getRequiredContainerSchema( false ) );
	}

	public IYCFBamSchemaDefObj getRequiredContainerSchema( boolean forceRead ) {
		if( forceRead || ( requiredContainerSchema == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsSchemaRef().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
					getSchemaRefBuff().getRequiredSchemaId() );
				requiredContainerSchema = obj;
				if( obj != null ) {
					getSchemaRefBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getSchemaRefBuff().setRequiredSchemaId( obj.getRequiredId() );
					requiredContainerSchema = obj;
				}
			}
		}
		return( requiredContainerSchema );
	}

	public void setRequiredContainerSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getSchemaRefBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getSchemaRefBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getSchemaRefBuff().setRequiredSchemaId( value.getRequiredId() );
			}
			requiredContainerSchema = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupRefSchema() {
		return( getOptionalLookupRefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupRefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupRefSchema == null ) ) {
			boolean anyMissing = false;
			if( getSchemaRefBuff().getOptionalRefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getSchemaRefBuff().getOptionalRefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsSchemaRef().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getSchemaRefBuff().getOptionalRefSchemaTenantId(),
					getSchemaRefBuff().getOptionalRefSchemaId() );
				optionalLookupRefSchema = obj;
			}
		}
		return( optionalLookupRefSchema );
	}

	public void setOptionalLookupRefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getSchemaRefBuff();
			}
			if( value != null ) {
				getSchemaRefBuff().setOptionalRefSchemaTenantId( value.getRequiredTenantId() );
				getSchemaRefBuff().setOptionalRefSchemaId( value.getRequiredId() );
			}
			else {
				getSchemaRefBuff().setOptionalRefSchemaTenantId( null );
				getSchemaRefBuff().setOptionalRefSchemaId( null );
			}
			optionalLookupRefSchema = value;
	}

	public IYCFBamSchemaRefObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamSchemaRefObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getSchemaRefBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getSchemaRefBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaRefObj obj = ((IYCFBamSchemaObj)getOrigAsSchemaRef().getSchema()).getSchemaRefTableObj().readSchemaRefByIdIdx( getSchemaRefBuff().getOptionalPrevTenantId(),
					getSchemaRefBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( IYCFBamSchemaRefObj value ) {
			if( buff == null ) {
				getSchemaRefBuff();
			}
			if( value != null ) {
				getSchemaRefBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getSchemaRefBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getSchemaRefBuff().setOptionalPrevTenantId( null );
				getSchemaRefBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public IYCFBamSchemaRefObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamSchemaRefObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getSchemaRefBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getSchemaRefBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaRefObj obj = ((IYCFBamSchemaObj)getOrigAsSchemaRef().getSchema()).getSchemaRefTableObj().readSchemaRefByIdIdx( getSchemaRefBuff().getOptionalNextTenantId(),
					getSchemaRefBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( IYCFBamSchemaRefObj value ) {
			if( buff == null ) {
				getSchemaRefBuff();
			}
			if( value != null ) {
				getSchemaRefBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getSchemaRefBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getSchemaRefBuff().setOptionalNextTenantId( null );
				getSchemaRefBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public void copyBuffToOrig() {
		YCFBamSchemaRefBuff origBuff = getOrigAsSchemaRef().getSchemaRefBuff();
		YCFBamSchemaRefBuff myBuff = getSchemaRefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamSchemaRefBuff origBuff = getOrigAsSchemaRef().getSchemaRefBuff();
		YCFBamSchemaRefBuff myBuff = getSchemaRefBuff();
		myBuff.set( origBuff );
	}
}

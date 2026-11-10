// Description: Java 11 edit object instance implementation for YCFBam DelDep.

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

public class YCFBamDelDepEditObj
	extends YCFBamScopeEditObj

	implements IYCFBamDelDepEditObj
{
	protected IYCFBamRelationObj requiredLookupRelation;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;

	public YCFBamDelDepEditObj( IYCFBamDelDepObj argOrig ) {
		super( argOrig );
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
	}

	public String getClassCode() {
		return( YCFBamDelDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelDep" );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredId();
		objName = Long.toString( val );
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

	public IYCFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamDelDepObj retobj = getSchema().getDelDepTableObj().realiseDelDep( (IYCFBamDelDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelDep().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamDelDepObj retobj = ((IYCFBamSchemaObj)getOrigAsDelDep().getSchema()).getDelDepTableObj().createDelDep( getOrigAsDelDep() );
		if( retobj == getOrigAsDelDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getDelDepTableObj().updateDelDep( (IYCFBamDelDepObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelDepTableObj().deleteDelDep( getOrigAsDelDep() );
		return( null );
	}

	public IYCFBamDelDepTableObj getDelDepTable() {
		return( orig.getSchema().getDelDepTableObj() );
	}

	public IYCFBamDelDepEditObj getEditAsDelDep() {
		return( (IYCFBamDelDepEditObj)this );
	}

	public IYCFBamDelDepObj getOrigAsDelDep() {
		return( (IYCFBamDelDepObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsDelDep().getSchema().getBackingStore()).getFactoryDelDep().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredLookupRelation = null;
			optionalLookupDefSchema = null;
		}
	}

	public YCFBamDelDepBuff getDelDepBuff() {
		return( (YCFBamDelDepBuff)getBuff() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getDelDepBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getDelDepBuff().getOptionalDefSchemaId() );
	}

	public long getRequiredRelationTenantId() {
		return( getDelDepBuff().getRequiredRelationTenantId() );
	}

	public long getRequiredRelationId() {
		return( getDelDepBuff().getRequiredRelationId() );
	}

	public IYCFBamRelationObj getRequiredLookupRelation() {
		return( getRequiredLookupRelation( false ) );
	}

	public IYCFBamRelationObj getRequiredLookupRelation( boolean forceRead ) {
		if( forceRead || ( requiredLookupRelation == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamRelationObj obj = ((IYCFBamSchemaObj)getOrigAsDelDep().getSchema()).getRelationTableObj().readRelationByIdIdx( getDelDepBuff().getRequiredRelationTenantId(),
					getDelDepBuff().getRequiredRelationId() );
				requiredLookupRelation = obj;
			}
		}
		return( requiredLookupRelation );
	}

	public void setRequiredLookupRelation( IYCFBamRelationObj value ) {
			if( buff == null ) {
				getDelDepBuff();
			}
			if( value != null ) {
				getDelDepBuff().setRequiredRelationTenantId( value.getRequiredTenantId() );
				getDelDepBuff().setRequiredRelationId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupRelation = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getDelDepBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getDelDepBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsDelDep().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getDelDepBuff().getOptionalDefSchemaTenantId(),
					getDelDepBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getDelDepBuff();
			}
			if( value != null ) {
				getDelDepBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getDelDepBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getDelDepBuff().setOptionalDefSchemaTenantId( null );
				getDelDepBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public void copyBuffToOrig() {
		YCFBamDelDepBuff origBuff = getOrigAsDelDep().getDelDepBuff();
		YCFBamDelDepBuff myBuff = getDelDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamDelDepBuff origBuff = getOrigAsDelDep().getDelDepBuff();
		YCFBamDelDepBuff myBuff = getDelDepBuff();
		myBuff.set( origBuff );
	}
}

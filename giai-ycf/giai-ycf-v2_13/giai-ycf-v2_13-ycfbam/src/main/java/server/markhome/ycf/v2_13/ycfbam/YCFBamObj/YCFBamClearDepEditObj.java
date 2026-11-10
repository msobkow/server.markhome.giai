// Description: Java 11 edit object instance implementation for YCFBam ClearDep.

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

public class YCFBamClearDepEditObj
	extends YCFBamScopeEditObj

	implements IYCFBamClearDepEditObj
{
	protected IYCFBamRelationObj requiredLookupRelation;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;

	public YCFBamClearDepEditObj( IYCFBamClearDepObj argOrig ) {
		super( argOrig );
		requiredLookupRelation = null;
		optionalLookupDefSchema = null;
	}

	public String getClassCode() {
		return( YCFBamClearDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearDep" );
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
		IYCFBamClearDepObj retobj = getSchema().getClearDepTableObj().realiseClearDep( (IYCFBamClearDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsClearDep().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamClearDepObj retobj = ((IYCFBamSchemaObj)getOrigAsClearDep().getSchema()).getClearDepTableObj().createClearDep( getOrigAsClearDep() );
		if( retobj == getOrigAsClearDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getClearDepTableObj().updateClearDep( (IYCFBamClearDepObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClearDepTableObj().deleteClearDep( getOrigAsClearDep() );
		return( null );
	}

	public IYCFBamClearDepTableObj getClearDepTable() {
		return( orig.getSchema().getClearDepTableObj() );
	}

	public IYCFBamClearDepEditObj getEditAsClearDep() {
		return( (IYCFBamClearDepEditObj)this );
	}

	public IYCFBamClearDepObj getOrigAsClearDep() {
		return( (IYCFBamClearDepObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsClearDep().getSchema().getBackingStore()).getFactoryClearDep().newBuff();
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

	public YCFBamClearDepBuff getClearDepBuff() {
		return( (YCFBamClearDepBuff)getBuff() );
	}

	public long getRequiredRelationId() {
		return( getClearDepBuff().getRequiredRelationId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getClearDepBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getClearDepBuff().getOptionalDefSchemaId() );
	}

	public IYCFBamRelationObj getRequiredLookupRelation() {
		return( getRequiredLookupRelation( false ) );
	}

	public IYCFBamRelationObj getRequiredLookupRelation( boolean forceRead ) {
		if( forceRead || ( requiredLookupRelation == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamRelationObj obj = ((IYCFBamSchemaObj)getOrigAsClearDep().getSchema()).getRelationTableObj().readRelationByIdIdx( getPKey().getRequiredTenantId(),
					getClearDepBuff().getRequiredRelationId() );
				requiredLookupRelation = obj;
			}
		}
		return( requiredLookupRelation );
	}

	public void setRequiredLookupRelation( IYCFBamRelationObj value ) {
			if( buff == null ) {
				getClearDepBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getClearDepBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getClearDepBuff().setRequiredRelationId( value.getRequiredId() );
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
			if( getClearDepBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getClearDepBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsClearDep().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getClearDepBuff().getOptionalDefSchemaTenantId(),
					getClearDepBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getClearDepBuff();
			}
			if( value != null ) {
				getClearDepBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getClearDepBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getClearDepBuff().setOptionalDefSchemaTenantId( null );
				getClearDepBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public void copyBuffToOrig() {
		YCFBamClearDepBuff origBuff = getOrigAsClearDep().getClearDepBuff();
		YCFBamClearDepBuff myBuff = getClearDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamClearDepBuff origBuff = getOrigAsClearDep().getClearDepBuff();
		YCFBamClearDepBuff myBuff = getClearDepBuff();
		myBuff.set( origBuff );
	}
}

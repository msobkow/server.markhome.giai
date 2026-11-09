// Description: Java 11 edit object instance implementation for CFBam DbKeyHash512Gen.

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

public class CFBamDbKeyHash512GenEditObj
	extends CFBamDbKeyHash512TypeEditObj

	implements ICFBamDbKeyHash512GenEditObj
{
	protected ICFBamTableObj optionalLookupDispenser;

	public CFBamDbKeyHash512GenEditObj( ICFBamDbKeyHash512GenObj argOrig ) {
		super( argOrig );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( CFBamDbKeyHash512GenObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash512Gen" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
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

	public ICFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamDbKeyHash512GenObj retobj = getSchema().getDbKeyHash512GenTableObj().realiseDbKeyHash512Gen( (ICFBamDbKeyHash512GenObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash512Gen().forget();
	}

	public ICFBamValueObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj create() {
		copyBuffToOrig();
		ICFBamDbKeyHash512GenObj retobj = ((ICFBamSchemaObj)getOrigAsDbKeyHash512Gen().getSchema()).getDbKeyHash512GenTableObj().createDbKeyHash512Gen( getOrigAsDbKeyHash512Gen() );
		if( retobj == getOrigAsDbKeyHash512Gen() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getDbKeyHash512GenTableObj().updateDbKeyHash512Gen( (ICFBamDbKeyHash512GenObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash512GenTableObj().deleteDbKeyHash512Gen( getOrigAsDbKeyHash512Gen() );
		return( null );
	}

	public ICFBamDbKeyHash512GenTableObj getDbKeyHash512GenTable() {
		return( orig.getSchema().getDbKeyHash512GenTableObj() );
	}

	public ICFBamDbKeyHash512GenEditObj getEditAsDbKeyHash512Gen() {
		return( (ICFBamDbKeyHash512GenEditObj)this );
	}

	public ICFBamDbKeyHash512GenObj getOrigAsDbKeyHash512Gen() {
		return( (ICFBamDbKeyHash512GenObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsDbKeyHash512Gen().getSchema().getBackingStore()).getFactoryDbKeyHash512Gen().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDispenser = null;
		}
	}

	public CFBamDbKeyHash512GenBuff getDbKeyHash512GenBuff() {
		return( (CFBamDbKeyHash512GenBuff)getBuff() );
	}

	public Long getOptionalDispenserTenantId() {
		return( getDbKeyHash512GenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getDbKeyHash512GenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getDbKeyHash512GenBuff().getRequiredSlice() );
	}

	public void setRequiredSlice( short value ) {
		if( getDbKeyHash512GenBuff().getRequiredSlice() != value ) {
			getDbKeyHash512GenBuff().setRequiredSlice( value );
		}
	}

	public int getRequiredBlockSize() {
		return( getDbKeyHash512GenBuff().getRequiredBlockSize() );
	}

	public void setRequiredBlockSize( int value ) {
		if( getDbKeyHash512GenBuff().getRequiredBlockSize() != value ) {
			getDbKeyHash512GenBuff().setRequiredBlockSize( value );
		}
	}

	public ICFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public ICFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( forceRead || ( optionalLookupDispenser == null ) ) {
			boolean anyMissing = false;
			if( getDbKeyHash512GenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getDbKeyHash512GenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsDbKeyHash512Gen().getSchema()).getTableTableObj().readTableByIdIdx( getDbKeyHash512GenBuff().getOptionalDispenserTenantId(),
					getDbKeyHash512GenBuff().getOptionalDispenserId() );
				optionalLookupDispenser = obj;
			}
		}
		return( optionalLookupDispenser );
	}

	public void setOptionalLookupDispenser( ICFBamTableObj value ) {
			if( buff == null ) {
				getDbKeyHash512GenBuff();
			}
			if( value != null ) {
				getDbKeyHash512GenBuff().setOptionalDispenserTenantId( value.getRequiredTenantId() );
				getDbKeyHash512GenBuff().setOptionalDispenserId( value.getRequiredId() );
			}
			else {
				getDbKeyHash512GenBuff().setOptionalDispenserTenantId( null );
				getDbKeyHash512GenBuff().setOptionalDispenserId( null );
			}
			optionalLookupDispenser = value;
	}

	public void copyBuffToOrig() {
		CFBamDbKeyHash512GenBuff origBuff = getOrigAsDbKeyHash512Gen().getDbKeyHash512GenBuff();
		CFBamDbKeyHash512GenBuff myBuff = getDbKeyHash512GenBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamDbKeyHash512GenBuff origBuff = getOrigAsDbKeyHash512Gen().getDbKeyHash512GenBuff();
		CFBamDbKeyHash512GenBuff myBuff = getDbKeyHash512GenBuff();
		myBuff.set( origBuff );
	}
}

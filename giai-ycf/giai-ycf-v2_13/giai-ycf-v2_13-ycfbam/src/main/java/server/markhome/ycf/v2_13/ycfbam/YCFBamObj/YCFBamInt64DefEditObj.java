// Description: Java 11 edit object instance implementation for CFBam Int64Def.

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

public class CFBamInt64DefEditObj
	extends CFBamAtomEditObj

	implements ICFBamInt64DefEditObj
{

	public CFBamInt64DefEditObj( ICFBamInt64DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFBamInt64DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Int64Def" );
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
		ICFBamInt64DefObj retobj = getSchema().getInt64DefTableObj().realiseInt64Def( (ICFBamInt64DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsInt64Def().forget();
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
		ICFBamInt64DefObj retobj = ((ICFBamSchemaObj)getOrigAsInt64Def().getSchema()).getInt64DefTableObj().createInt64Def( getOrigAsInt64Def() );
		if( retobj == getOrigAsInt64Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getInt64DefTableObj().updateInt64Def( (ICFBamInt64DefObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getInt64DefTableObj().deleteInt64Def( getOrigAsInt64Def() );
		return( null );
	}

	public ICFBamInt64DefTableObj getInt64DefTable() {
		return( orig.getSchema().getInt64DefTableObj() );
	}

	public ICFBamInt64DefEditObj getEditAsInt64Def() {
		return( (ICFBamInt64DefEditObj)this );
	}

	public ICFBamInt64DefObj getOrigAsInt64Def() {
		return( (ICFBamInt64DefObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsInt64Def().getSchema().getBackingStore()).getFactoryInt64Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFBamInt64DefBuff getInt64DefBuff() {
		return( (CFBamInt64DefBuff)getBuff() );
	}

	public Long getOptionalInitValue() {
		return( getInt64DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( Long value ) {
		if( getInt64DefBuff().getOptionalInitValue() != value ) {
			getInt64DefBuff().setOptionalInitValue( value );
		}
	}

	public Long getOptionalMinValue() {
		return( getInt64DefBuff().getOptionalMinValue() );
	}

	public void setOptionalMinValue( Long value ) {
		if( getInt64DefBuff().getOptionalMinValue() != value ) {
			getInt64DefBuff().setOptionalMinValue( value );
		}
	}

	public Long getOptionalMaxValue() {
		return( getInt64DefBuff().getOptionalMaxValue() );
	}

	public void setOptionalMaxValue( Long value ) {
		if( getInt64DefBuff().getOptionalMaxValue() != value ) {
			getInt64DefBuff().setOptionalMaxValue( value );
		}
	}

	public void copyBuffToOrig() {
		CFBamInt64DefBuff origBuff = getOrigAsInt64Def().getInt64DefBuff();
		CFBamInt64DefBuff myBuff = getInt64DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamInt64DefBuff origBuff = getOrigAsInt64Def().getInt64DefBuff();
		CFBamInt64DefBuff myBuff = getInt64DefBuff();
		myBuff.set( origBuff );
	}
}

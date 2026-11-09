// Description: Java 11 edit object instance implementation for CFBam PopSubDep3.

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

public class CFBamPopSubDep3EditObj
	extends CFBamPopDepEditObj

	implements ICFBamPopSubDep3EditObj
{
	protected ICFBamPopSubDep2Obj requiredContainerPopSubDep2;

	public CFBamPopSubDep3EditObj( ICFBamPopSubDep3Obj argOrig ) {
		super( argOrig );
		requiredContainerPopSubDep2 = null;
	}

	public String getClassCode() {
		return( CFBamPopSubDep3Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "PopSubDep3" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamPopSubDep2Obj scope = getRequiredContainerPopSubDep2();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamPopSubDep2Obj scope = getRequiredContainerPopSubDep2();
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

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamPopSubDep3Obj retobj = getSchema().getPopSubDep3TableObj().realisePopSubDep3( (ICFBamPopSubDep3Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsPopSubDep3().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamPopSubDep3Obj retobj = ((ICFBamSchemaObj)getOrigAsPopSubDep3().getSchema()).getPopSubDep3TableObj().createPopSubDep3( getOrigAsPopSubDep3() );
		if( retobj == getOrigAsPopSubDep3() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getPopSubDep3TableObj().updatePopSubDep3( (ICFBamPopSubDep3Obj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getPopSubDep3TableObj().deletePopSubDep3( getOrigAsPopSubDep3() );
		return( null );
	}

	public ICFBamPopSubDep3TableObj getPopSubDep3Table() {
		return( orig.getSchema().getPopSubDep3TableObj() );
	}

	public ICFBamPopSubDep3EditObj getEditAsPopSubDep3() {
		return( (ICFBamPopSubDep3EditObj)this );
	}

	public ICFBamPopSubDep3Obj getOrigAsPopSubDep3() {
		return( (ICFBamPopSubDep3Obj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsPopSubDep3().getSchema().getBackingStore()).getFactoryPopSubDep3().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerPopSubDep2 = null;
		}
	}

	public CFBamPopSubDep3Buff getPopSubDep3Buff() {
		return( (CFBamPopSubDep3Buff)getBuff() );
	}

	public long getRequiredPopSubDep2TenantId() {
		return( getPopSubDep3Buff().getRequiredPopSubDep2TenantId() );
	}

	public long getRequiredPopSubDep2Id() {
		return( getPopSubDep3Buff().getRequiredPopSubDep2Id() );
	}

	public String getRequiredName() {
		return( getPopSubDep3Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getPopSubDep3Buff().getRequiredName() != value ) {
			getPopSubDep3Buff().setRequiredName( value );
		}
	}

	public ICFBamPopSubDep2Obj getRequiredContainerPopSubDep2() {
		return( getRequiredContainerPopSubDep2( false ) );
	}

	public ICFBamPopSubDep2Obj getRequiredContainerPopSubDep2( boolean forceRead ) {
		if( forceRead || ( requiredContainerPopSubDep2 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamPopSubDep2Obj obj = ((ICFBamSchemaObj)getOrigAsPopSubDep3().getSchema()).getPopSubDep2TableObj().readPopSubDep2ByIdIdx( getPopSubDep3Buff().getRequiredPopSubDep2TenantId(),
					getPopSubDep3Buff().getRequiredPopSubDep2Id() );
				requiredContainerPopSubDep2 = obj;
				if( obj != null ) {
					getPopSubDep3Buff().setRequiredPopSubDep2TenantId( obj.getRequiredTenantId() );
					getPopSubDep3Buff().setRequiredPopSubDep2Id( obj.getRequiredId() );
					requiredContainerPopSubDep2 = obj;
				}
			}
		}
		return( requiredContainerPopSubDep2 );
	}

	public void setRequiredContainerPopSubDep2( ICFBamPopSubDep2Obj value ) {
			if( buff == null ) {
				getPopSubDep3Buff();
			}
			if( value != null ) {
				getPopSubDep3Buff().setRequiredPopSubDep2TenantId( value.getRequiredTenantId() );
				getPopSubDep3Buff().setRequiredPopSubDep2Id( value.getRequiredId() );
			}
			requiredContainerPopSubDep2 = value;
	}

	public void copyBuffToOrig() {
		CFBamPopSubDep3Buff origBuff = getOrigAsPopSubDep3().getPopSubDep3Buff();
		CFBamPopSubDep3Buff myBuff = getPopSubDep3Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamPopSubDep3Buff origBuff = getOrigAsPopSubDep3().getPopSubDep3Buff();
		CFBamPopSubDep3Buff myBuff = getPopSubDep3Buff();
		myBuff.set( origBuff );
	}
}

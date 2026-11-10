// Description: Java 11 edit object instance implementation for YCFBam ClearSubDep1.

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

public class YCFBamClearSubDep1EditObj
	extends YCFBamClearDepEditObj

	implements IYCFBamClearSubDep1EditObj
{
	protected IYCFBamClearTopDepObj requiredContainerClearTopDep;

	public YCFBamClearSubDep1EditObj( IYCFBamClearSubDep1Obj argOrig ) {
		super( argOrig );
		requiredContainerClearTopDep = null;
	}

	public String getClassCode() {
		return( YCFBamClearSubDep1Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearSubDep1" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamClearTopDepObj scope = getRequiredContainerClearTopDep();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamClearTopDepObj scope = getRequiredContainerClearTopDep();
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
		IYCFBamClearSubDep1Obj retobj = getSchema().getClearSubDep1TableObj().realiseClearSubDep1( (IYCFBamClearSubDep1Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsClearSubDep1().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamClearSubDep1Obj retobj = ((IYCFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearSubDep1TableObj().createClearSubDep1( getOrigAsClearSubDep1() );
		if( retobj == getOrigAsClearSubDep1() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getClearSubDep1TableObj().updateClearSubDep1( (IYCFBamClearSubDep1Obj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClearSubDep1TableObj().deleteClearSubDep1( getOrigAsClearSubDep1() );
		return( null );
	}

	public IYCFBamClearSubDep1TableObj getClearSubDep1Table() {
		return( orig.getSchema().getClearSubDep1TableObj() );
	}

	public IYCFBamClearSubDep1EditObj getEditAsClearSubDep1() {
		return( (IYCFBamClearSubDep1EditObj)this );
	}

	public IYCFBamClearSubDep1Obj getOrigAsClearSubDep1() {
		return( (IYCFBamClearSubDep1Obj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsClearSubDep1().getSchema().getBackingStore()).getFactoryClearSubDep1().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerClearTopDep = null;
		}
	}

	public YCFBamClearSubDep1Buff getClearSubDep1Buff() {
		return( (YCFBamClearSubDep1Buff)getBuff() );
	}

	public long getRequiredClearTopDepTenantId() {
		return( getClearSubDep1Buff().getRequiredClearTopDepTenantId() );
	}

	public long getRequiredClearTopDepId() {
		return( getClearSubDep1Buff().getRequiredClearTopDepId() );
	}

	public String getRequiredName() {
		return( getClearSubDep1Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getClearSubDep1Buff().getRequiredName() != value ) {
			getClearSubDep1Buff().setRequiredName( value );
		}
	}

	public IYCFBamClearTopDepObj getRequiredContainerClearTopDep() {
		return( getRequiredContainerClearTopDep( false ) );
	}

	public IYCFBamClearTopDepObj getRequiredContainerClearTopDep( boolean forceRead ) {
		if( forceRead || ( requiredContainerClearTopDep == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamClearTopDepObj obj = ((IYCFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearTopDepTableObj().readClearTopDepByIdIdx( getClearSubDep1Buff().getRequiredClearTopDepTenantId(),
					getClearSubDep1Buff().getRequiredClearTopDepId() );
				requiredContainerClearTopDep = obj;
				if( obj != null ) {
					getClearSubDep1Buff().setRequiredClearTopDepTenantId( obj.getRequiredTenantId() );
					getClearSubDep1Buff().setRequiredClearTopDepId( obj.getRequiredId() );
					requiredContainerClearTopDep = obj;
				}
			}
		}
		return( requiredContainerClearTopDep );
	}

	public void setRequiredContainerClearTopDep( IYCFBamClearTopDepObj value ) {
			if( buff == null ) {
				getClearSubDep1Buff();
			}
			if( value != null ) {
				getClearSubDep1Buff().setRequiredClearTopDepTenantId( value.getRequiredTenantId() );
				getClearSubDep1Buff().setRequiredClearTopDepId( value.getRequiredId() );
			}
			requiredContainerClearTopDep = value;
	}

	public List<IYCFBamClearSubDep2Obj> getOptionalComponentsClearDep() {
		List<IYCFBamClearSubDep2Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearSubDep2TableObj().readClearSubDep2ByClearSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamClearSubDep2Obj> getOptionalComponentsClearDep( boolean forceRead ) {
		List<IYCFBamClearSubDep2Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsClearSubDep1().getSchema()).getClearSubDep2TableObj().readClearSubDep2ByClearSubDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		YCFBamClearSubDep1Buff origBuff = getOrigAsClearSubDep1().getClearSubDep1Buff();
		YCFBamClearSubDep1Buff myBuff = getClearSubDep1Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamClearSubDep1Buff origBuff = getOrigAsClearSubDep1().getClearSubDep1Buff();
		YCFBamClearSubDep1Buff myBuff = getClearSubDep1Buff();
		myBuff.set( origBuff );
	}
}

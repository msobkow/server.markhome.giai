// Description: Java 11 edit object instance implementation for YCFBam ClearSubDep3.

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

public class YCFBamClearSubDep3EditObj
	extends YCFBamClearDepEditObj

	implements IYCFBamClearSubDep3EditObj
{
	protected IYCFBamClearSubDep2Obj requiredContainerClearSubDep2;

	public YCFBamClearSubDep3EditObj( IYCFBamClearSubDep3Obj argOrig ) {
		super( argOrig );
		requiredContainerClearSubDep2 = null;
	}

	public String getClassCode() {
		return( YCFBamClearSubDep3Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ClearSubDep3" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamClearSubDep2Obj scope = getRequiredContainerClearSubDep2();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamClearSubDep2Obj scope = getRequiredContainerClearSubDep2();
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
		IYCFBamClearSubDep3Obj retobj = getSchema().getClearSubDep3TableObj().realiseClearSubDep3( (IYCFBamClearSubDep3Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsClearSubDep3().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamClearSubDep3Obj retobj = ((IYCFBamSchemaObj)getOrigAsClearSubDep3().getSchema()).getClearSubDep3TableObj().createClearSubDep3( getOrigAsClearSubDep3() );
		if( retobj == getOrigAsClearSubDep3() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getClearSubDep3TableObj().updateClearSubDep3( (IYCFBamClearSubDep3Obj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getClearSubDep3TableObj().deleteClearSubDep3( getOrigAsClearSubDep3() );
		return( null );
	}

	public IYCFBamClearSubDep3TableObj getClearSubDep3Table() {
		return( orig.getSchema().getClearSubDep3TableObj() );
	}

	public IYCFBamClearSubDep3EditObj getEditAsClearSubDep3() {
		return( (IYCFBamClearSubDep3EditObj)this );
	}

	public IYCFBamClearSubDep3Obj getOrigAsClearSubDep3() {
		return( (IYCFBamClearSubDep3Obj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsClearSubDep3().getSchema().getBackingStore()).getFactoryClearSubDep3().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerClearSubDep2 = null;
		}
	}

	public YCFBamClearSubDep3Buff getClearSubDep3Buff() {
		return( (YCFBamClearSubDep3Buff)getBuff() );
	}

	public long getRequiredClearSubDep2TenantId() {
		return( getClearSubDep3Buff().getRequiredClearSubDep2TenantId() );
	}

	public long getRequiredClearSubDep2Id() {
		return( getClearSubDep3Buff().getRequiredClearSubDep2Id() );
	}

	public String getRequiredName() {
		return( getClearSubDep3Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getClearSubDep3Buff().getRequiredName() != value ) {
			getClearSubDep3Buff().setRequiredName( value );
		}
	}

	public IYCFBamClearSubDep2Obj getRequiredContainerClearSubDep2() {
		return( getRequiredContainerClearSubDep2( false ) );
	}

	public IYCFBamClearSubDep2Obj getRequiredContainerClearSubDep2( boolean forceRead ) {
		if( forceRead || ( requiredContainerClearSubDep2 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamClearSubDep2Obj obj = ((IYCFBamSchemaObj)getOrigAsClearSubDep3().getSchema()).getClearSubDep2TableObj().readClearSubDep2ByIdIdx( getClearSubDep3Buff().getRequiredClearSubDep2TenantId(),
					getClearSubDep3Buff().getRequiredClearSubDep2Id() );
				requiredContainerClearSubDep2 = obj;
				if( obj != null ) {
					getClearSubDep3Buff().setRequiredClearSubDep2TenantId( obj.getRequiredTenantId() );
					getClearSubDep3Buff().setRequiredClearSubDep2Id( obj.getRequiredId() );
					requiredContainerClearSubDep2 = obj;
				}
			}
		}
		return( requiredContainerClearSubDep2 );
	}

	public void setRequiredContainerClearSubDep2( IYCFBamClearSubDep2Obj value ) {
			if( buff == null ) {
				getClearSubDep3Buff();
			}
			if( value != null ) {
				getClearSubDep3Buff().setRequiredClearSubDep2TenantId( value.getRequiredTenantId() );
				getClearSubDep3Buff().setRequiredClearSubDep2Id( value.getRequiredId() );
			}
			requiredContainerClearSubDep2 = value;
	}

	public void copyBuffToOrig() {
		YCFBamClearSubDep3Buff origBuff = getOrigAsClearSubDep3().getClearSubDep3Buff();
		YCFBamClearSubDep3Buff myBuff = getClearSubDep3Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamClearSubDep3Buff origBuff = getOrigAsClearSubDep3().getClearSubDep3Buff();
		YCFBamClearSubDep3Buff myBuff = getClearSubDep3Buff();
		myBuff.set( origBuff );
	}
}

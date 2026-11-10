// Description: Java 11 edit object instance implementation for YCFBam PopSubDep3.

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

public class YCFBamPopSubDep3EditObj
	extends YCFBamPopDepEditObj

	implements IYCFBamPopSubDep3EditObj
{
	protected IYCFBamPopSubDep2Obj requiredContainerPopSubDep2;

	public YCFBamPopSubDep3EditObj( IYCFBamPopSubDep3Obj argOrig ) {
		super( argOrig );
		requiredContainerPopSubDep2 = null;
	}

	public String getClassCode() {
		return( YCFBamPopSubDep3Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "PopSubDep3" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamPopSubDep2Obj scope = getRequiredContainerPopSubDep2();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamPopSubDep2Obj scope = getRequiredContainerPopSubDep2();
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
		IYCFBamPopSubDep3Obj retobj = getSchema().getPopSubDep3TableObj().realisePopSubDep3( (IYCFBamPopSubDep3Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsPopSubDep3().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamPopSubDep3Obj retobj = ((IYCFBamSchemaObj)getOrigAsPopSubDep3().getSchema()).getPopSubDep3TableObj().createPopSubDep3( getOrigAsPopSubDep3() );
		if( retobj == getOrigAsPopSubDep3() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getPopSubDep3TableObj().updatePopSubDep3( (IYCFBamPopSubDep3Obj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getPopSubDep3TableObj().deletePopSubDep3( getOrigAsPopSubDep3() );
		return( null );
	}

	public IYCFBamPopSubDep3TableObj getPopSubDep3Table() {
		return( orig.getSchema().getPopSubDep3TableObj() );
	}

	public IYCFBamPopSubDep3EditObj getEditAsPopSubDep3() {
		return( (IYCFBamPopSubDep3EditObj)this );
	}

	public IYCFBamPopSubDep3Obj getOrigAsPopSubDep3() {
		return( (IYCFBamPopSubDep3Obj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsPopSubDep3().getSchema().getBackingStore()).getFactoryPopSubDep3().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerPopSubDep2 = null;
		}
	}

	public YCFBamPopSubDep3Buff getPopSubDep3Buff() {
		return( (YCFBamPopSubDep3Buff)getBuff() );
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

	public IYCFBamPopSubDep2Obj getRequiredContainerPopSubDep2() {
		return( getRequiredContainerPopSubDep2( false ) );
	}

	public IYCFBamPopSubDep2Obj getRequiredContainerPopSubDep2( boolean forceRead ) {
		if( forceRead || ( requiredContainerPopSubDep2 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamPopSubDep2Obj obj = ((IYCFBamSchemaObj)getOrigAsPopSubDep3().getSchema()).getPopSubDep2TableObj().readPopSubDep2ByIdIdx( getPopSubDep3Buff().getRequiredPopSubDep2TenantId(),
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

	public void setRequiredContainerPopSubDep2( IYCFBamPopSubDep2Obj value ) {
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
		YCFBamPopSubDep3Buff origBuff = getOrigAsPopSubDep3().getPopSubDep3Buff();
		YCFBamPopSubDep3Buff myBuff = getPopSubDep3Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamPopSubDep3Buff origBuff = getOrigAsPopSubDep3().getPopSubDep3Buff();
		YCFBamPopSubDep3Buff myBuff = getPopSubDep3Buff();
		myBuff.set( origBuff );
	}
}

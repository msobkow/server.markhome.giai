// Description: Java 11 edit object instance implementation for YCFBam DelSubDep3.

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

public class YCFBamDelSubDep3EditObj
	extends YCFBamDelDepEditObj

	implements IYCFBamDelSubDep3EditObj
{
	protected IYCFBamDelSubDep2Obj requiredContainerDelSubDep2;

	public YCFBamDelSubDep3EditObj( IYCFBamDelSubDep3Obj argOrig ) {
		super( argOrig );
		requiredContainerDelSubDep2 = null;
	}

	public String getClassCode() {
		return( YCFBamDelSubDep3Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelSubDep3" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamDelSubDep2Obj scope = getRequiredContainerDelSubDep2();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamDelSubDep2Obj scope = getRequiredContainerDelSubDep2();
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
		IYCFBamDelSubDep3Obj retobj = getSchema().getDelSubDep3TableObj().realiseDelSubDep3( (IYCFBamDelSubDep3Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelSubDep3().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamDelSubDep3Obj retobj = ((IYCFBamSchemaObj)getOrigAsDelSubDep3().getSchema()).getDelSubDep3TableObj().createDelSubDep3( getOrigAsDelSubDep3() );
		if( retobj == getOrigAsDelSubDep3() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getDelSubDep3TableObj().updateDelSubDep3( (IYCFBamDelSubDep3Obj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelSubDep3TableObj().deleteDelSubDep3( getOrigAsDelSubDep3() );
		return( null );
	}

	public IYCFBamDelSubDep3TableObj getDelSubDep3Table() {
		return( orig.getSchema().getDelSubDep3TableObj() );
	}

	public IYCFBamDelSubDep3EditObj getEditAsDelSubDep3() {
		return( (IYCFBamDelSubDep3EditObj)this );
	}

	public IYCFBamDelSubDep3Obj getOrigAsDelSubDep3() {
		return( (IYCFBamDelSubDep3Obj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsDelSubDep3().getSchema().getBackingStore()).getFactoryDelSubDep3().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerDelSubDep2 = null;
		}
	}

	public YCFBamDelSubDep3Buff getDelSubDep3Buff() {
		return( (YCFBamDelSubDep3Buff)getBuff() );
	}

	public long getRequiredDelSubDep2TenantId() {
		return( getDelSubDep3Buff().getRequiredDelSubDep2TenantId() );
	}

	public long getRequiredDelSubDep2Id() {
		return( getDelSubDep3Buff().getRequiredDelSubDep2Id() );
	}

	public String getRequiredName() {
		return( getDelSubDep3Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDelSubDep3Buff().getRequiredName() != value ) {
			getDelSubDep3Buff().setRequiredName( value );
		}
	}

	public IYCFBamDelSubDep2Obj getRequiredContainerDelSubDep2() {
		return( getRequiredContainerDelSubDep2( false ) );
	}

	public IYCFBamDelSubDep2Obj getRequiredContainerDelSubDep2( boolean forceRead ) {
		if( forceRead || ( requiredContainerDelSubDep2 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamDelSubDep2Obj obj = ((IYCFBamSchemaObj)getOrigAsDelSubDep3().getSchema()).getDelSubDep2TableObj().readDelSubDep2ByIdIdx( getDelSubDep3Buff().getRequiredDelSubDep2TenantId(),
					getDelSubDep3Buff().getRequiredDelSubDep2Id() );
				requiredContainerDelSubDep2 = obj;
				if( obj != null ) {
					getDelSubDep3Buff().setRequiredDelSubDep2TenantId( obj.getRequiredTenantId() );
					getDelSubDep3Buff().setRequiredDelSubDep2Id( obj.getRequiredId() );
					requiredContainerDelSubDep2 = obj;
				}
			}
		}
		return( requiredContainerDelSubDep2 );
	}

	public void setRequiredContainerDelSubDep2( IYCFBamDelSubDep2Obj value ) {
			if( buff == null ) {
				getDelSubDep3Buff();
			}
			if( value != null ) {
				getDelSubDep3Buff().setRequiredDelSubDep2TenantId( value.getRequiredTenantId() );
				getDelSubDep3Buff().setRequiredDelSubDep2Id( value.getRequiredId() );
			}
			requiredContainerDelSubDep2 = value;
	}

	public void copyBuffToOrig() {
		YCFBamDelSubDep3Buff origBuff = getOrigAsDelSubDep3().getDelSubDep3Buff();
		YCFBamDelSubDep3Buff myBuff = getDelSubDep3Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamDelSubDep3Buff origBuff = getOrigAsDelSubDep3().getDelSubDep3Buff();
		YCFBamDelSubDep3Buff myBuff = getDelSubDep3Buff();
		myBuff.set( origBuff );
	}
}

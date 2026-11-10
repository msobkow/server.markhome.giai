// Description: Java 11 edit object instance implementation for YCFBam DelSubDep2.

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

public class YCFBamDelSubDep2EditObj
	extends YCFBamDelDepEditObj

	implements IYCFBamDelSubDep2EditObj
{
	protected IYCFBamDelSubDep1Obj requiredContainerDelSubDep1;

	public YCFBamDelSubDep2EditObj( IYCFBamDelSubDep2Obj argOrig ) {
		super( argOrig );
		requiredContainerDelSubDep1 = null;
	}

	public String getClassCode() {
		return( YCFBamDelSubDep2Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelSubDep2" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamDelSubDep1Obj scope = getRequiredContainerDelSubDep1();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamDelSubDep1Obj scope = getRequiredContainerDelSubDep1();
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
		IYCFBamDelSubDep2Obj retobj = getSchema().getDelSubDep2TableObj().realiseDelSubDep2( (IYCFBamDelSubDep2Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelSubDep2().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamDelSubDep2Obj retobj = ((IYCFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep2TableObj().createDelSubDep2( getOrigAsDelSubDep2() );
		if( retobj == getOrigAsDelSubDep2() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getDelSubDep2TableObj().updateDelSubDep2( (IYCFBamDelSubDep2Obj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelSubDep2TableObj().deleteDelSubDep2( getOrigAsDelSubDep2() );
		return( null );
	}

	public IYCFBamDelSubDep2TableObj getDelSubDep2Table() {
		return( orig.getSchema().getDelSubDep2TableObj() );
	}

	public IYCFBamDelSubDep2EditObj getEditAsDelSubDep2() {
		return( (IYCFBamDelSubDep2EditObj)this );
	}

	public IYCFBamDelSubDep2Obj getOrigAsDelSubDep2() {
		return( (IYCFBamDelSubDep2Obj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsDelSubDep2().getSchema().getBackingStore()).getFactoryDelSubDep2().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerDelSubDep1 = null;
		}
	}

	public YCFBamDelSubDep2Buff getDelSubDep2Buff() {
		return( (YCFBamDelSubDep2Buff)getBuff() );
	}

	public long getRequiredDelSubDep1TenantId() {
		return( getDelSubDep2Buff().getRequiredDelSubDep1TenantId() );
	}

	public long getRequiredDelSubDep1Id() {
		return( getDelSubDep2Buff().getRequiredDelSubDep1Id() );
	}

	public String getRequiredName() {
		return( getDelSubDep2Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDelSubDep2Buff().getRequiredName() != value ) {
			getDelSubDep2Buff().setRequiredName( value );
		}
	}

	public IYCFBamDelSubDep1Obj getRequiredContainerDelSubDep1() {
		return( getRequiredContainerDelSubDep1( false ) );
	}

	public IYCFBamDelSubDep1Obj getRequiredContainerDelSubDep1( boolean forceRead ) {
		if( forceRead || ( requiredContainerDelSubDep1 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamDelSubDep1Obj obj = ((IYCFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep1TableObj().readDelSubDep1ByIdIdx( getDelSubDep2Buff().getRequiredDelSubDep1TenantId(),
					getDelSubDep2Buff().getRequiredDelSubDep1Id() );
				requiredContainerDelSubDep1 = obj;
				if( obj != null ) {
					getDelSubDep2Buff().setRequiredDelSubDep1TenantId( obj.getRequiredTenantId() );
					getDelSubDep2Buff().setRequiredDelSubDep1Id( obj.getRequiredId() );
					requiredContainerDelSubDep1 = obj;
				}
			}
		}
		return( requiredContainerDelSubDep1 );
	}

	public void setRequiredContainerDelSubDep1( IYCFBamDelSubDep1Obj value ) {
			if( buff == null ) {
				getDelSubDep2Buff();
			}
			if( value != null ) {
				getDelSubDep2Buff().setRequiredDelSubDep1TenantId( value.getRequiredTenantId() );
				getDelSubDep2Buff().setRequiredDelSubDep1Id( value.getRequiredId() );
			}
			requiredContainerDelSubDep1 = value;
	}

	public List<IYCFBamDelSubDep3Obj> getOptionalComponentsDelDep() {
		List<IYCFBamDelSubDep3Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep3TableObj().readDelSubDep3ByDelSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamDelSubDep3Obj> getOptionalComponentsDelDep( boolean forceRead ) {
		List<IYCFBamDelSubDep3Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsDelSubDep2().getSchema()).getDelSubDep3TableObj().readDelSubDep3ByDelSubDep2Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		YCFBamDelSubDep2Buff origBuff = getOrigAsDelSubDep2().getDelSubDep2Buff();
		YCFBamDelSubDep2Buff myBuff = getDelSubDep2Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamDelSubDep2Buff origBuff = getOrigAsDelSubDep2().getDelSubDep2Buff();
		YCFBamDelSubDep2Buff myBuff = getDelSubDep2Buff();
		myBuff.set( origBuff );
	}
}

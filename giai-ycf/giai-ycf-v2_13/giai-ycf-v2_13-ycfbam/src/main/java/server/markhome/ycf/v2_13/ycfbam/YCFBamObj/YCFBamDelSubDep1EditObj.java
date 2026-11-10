// Description: Java 11 edit object instance implementation for YCFBam DelSubDep1.

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

public class YCFBamDelSubDep1EditObj
	extends YCFBamDelDepEditObj

	implements IYCFBamDelSubDep1EditObj
{
	protected IYCFBamDelTopDepObj requiredContainerDelTopDep;

	public YCFBamDelSubDep1EditObj( IYCFBamDelSubDep1Obj argOrig ) {
		super( argOrig );
		requiredContainerDelTopDep = null;
	}

	public String getClassCode() {
		return( YCFBamDelSubDep1Obj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelSubDep1" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamDelTopDepObj scope = getRequiredContainerDelTopDep();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamDelTopDepObj scope = getRequiredContainerDelTopDep();
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
		IYCFBamDelSubDep1Obj retobj = getSchema().getDelSubDep1TableObj().realiseDelSubDep1( (IYCFBamDelSubDep1Obj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelSubDep1().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamDelSubDep1Obj retobj = ((IYCFBamSchemaObj)getOrigAsDelSubDep1().getSchema()).getDelSubDep1TableObj().createDelSubDep1( getOrigAsDelSubDep1() );
		if( retobj == getOrigAsDelSubDep1() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getDelSubDep1TableObj().updateDelSubDep1( (IYCFBamDelSubDep1Obj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelSubDep1TableObj().deleteDelSubDep1( getOrigAsDelSubDep1() );
		return( null );
	}

	public IYCFBamDelSubDep1TableObj getDelSubDep1Table() {
		return( orig.getSchema().getDelSubDep1TableObj() );
	}

	public IYCFBamDelSubDep1EditObj getEditAsDelSubDep1() {
		return( (IYCFBamDelSubDep1EditObj)this );
	}

	public IYCFBamDelSubDep1Obj getOrigAsDelSubDep1() {
		return( (IYCFBamDelSubDep1Obj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsDelSubDep1().getSchema().getBackingStore()).getFactoryDelSubDep1().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerDelTopDep = null;
		}
	}

	public YCFBamDelSubDep1Buff getDelSubDep1Buff() {
		return( (YCFBamDelSubDep1Buff)getBuff() );
	}

	public long getRequiredDelTopDepTenantId() {
		return( getDelSubDep1Buff().getRequiredDelTopDepTenantId() );
	}

	public long getRequiredDelTopDepId() {
		return( getDelSubDep1Buff().getRequiredDelTopDepId() );
	}

	public String getRequiredName() {
		return( getDelSubDep1Buff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDelSubDep1Buff().getRequiredName() != value ) {
			getDelSubDep1Buff().setRequiredName( value );
		}
	}

	public IYCFBamDelTopDepObj getRequiredContainerDelTopDep() {
		return( getRequiredContainerDelTopDep( false ) );
	}

	public IYCFBamDelTopDepObj getRequiredContainerDelTopDep( boolean forceRead ) {
		if( forceRead || ( requiredContainerDelTopDep == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamDelTopDepObj obj = ((IYCFBamSchemaObj)getOrigAsDelSubDep1().getSchema()).getDelTopDepTableObj().readDelTopDepByIdIdx( getDelSubDep1Buff().getRequiredDelTopDepTenantId(),
					getDelSubDep1Buff().getRequiredDelTopDepId() );
				requiredContainerDelTopDep = obj;
				if( obj != null ) {
					getDelSubDep1Buff().setRequiredDelTopDepTenantId( obj.getRequiredTenantId() );
					getDelSubDep1Buff().setRequiredDelTopDepId( obj.getRequiredId() );
					requiredContainerDelTopDep = obj;
				}
			}
		}
		return( requiredContainerDelTopDep );
	}

	public void setRequiredContainerDelTopDep( IYCFBamDelTopDepObj value ) {
			if( buff == null ) {
				getDelSubDep1Buff();
			}
			if( value != null ) {
				getDelSubDep1Buff().setRequiredDelTopDepTenantId( value.getRequiredTenantId() );
				getDelSubDep1Buff().setRequiredDelTopDepId( value.getRequiredId() );
			}
			requiredContainerDelTopDep = value;
	}

	public List<IYCFBamDelSubDep2Obj> getOptionalComponentsDelDep() {
		List<IYCFBamDelSubDep2Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsDelSubDep1().getSchema()).getDelSubDep2TableObj().readDelSubDep2ByContDelDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamDelSubDep2Obj> getOptionalComponentsDelDep( boolean forceRead ) {
		List<IYCFBamDelSubDep2Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsDelSubDep1().getSchema()).getDelSubDep2TableObj().readDelSubDep2ByContDelDep1Idx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		YCFBamDelSubDep1Buff origBuff = getOrigAsDelSubDep1().getDelSubDep1Buff();
		YCFBamDelSubDep1Buff myBuff = getDelSubDep1Buff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamDelSubDep1Buff origBuff = getOrigAsDelSubDep1().getDelSubDep1Buff();
		YCFBamDelSubDep1Buff myBuff = getDelSubDep1Buff();
		myBuff.set( origBuff );
	}
}

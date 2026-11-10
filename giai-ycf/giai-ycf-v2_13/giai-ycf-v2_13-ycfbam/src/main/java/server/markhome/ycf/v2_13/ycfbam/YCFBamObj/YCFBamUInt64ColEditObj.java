// Description: Java 11 edit object instance implementation for YCFBam UInt64Col.

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

public class YCFBamUInt64ColEditObj
	extends YCFBamUInt64DefEditObj

	implements IYCFBamUInt64ColEditObj
{
	protected IYCFBamTableObj requiredContainerTable;

	public YCFBamUInt64ColEditObj( IYCFBamUInt64ColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	public String getClassCode() {
		return( YCFBamUInt64ColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "UInt64Col" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamTableObj scope = getRequiredContainerTable();
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

	public IYCFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamUInt64ColObj retobj = getSchema().getUInt64ColTableObj().realiseUInt64Col( (IYCFBamUInt64ColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsUInt64Col().forget();
	}

	public IYCFBamValueObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamValueObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamValueObj create() {
		copyBuffToOrig();
		IYCFBamUInt64ColObj retobj = ((IYCFBamSchemaObj)getOrigAsUInt64Col().getSchema()).getUInt64ColTableObj().createUInt64Col( getOrigAsUInt64Col() );
		if( retobj == getOrigAsUInt64Col() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamValueEditObj update() {
		getSchema().getUInt64ColTableObj().updateUInt64Col( (IYCFBamUInt64ColObj)this );
		return( null );
	}

	public YCFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getUInt64ColTableObj().deleteUInt64Col( getOrigAsUInt64Col() );
		return( null );
	}

	public IYCFBamUInt64ColTableObj getUInt64ColTable() {
		return( orig.getSchema().getUInt64ColTableObj() );
	}

	public IYCFBamUInt64ColEditObj getEditAsUInt64Col() {
		return( (IYCFBamUInt64ColEditObj)this );
	}

	public IYCFBamUInt64ColObj getOrigAsUInt64Col() {
		return( (IYCFBamUInt64ColObj)orig );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsUInt64Col().getSchema().getBackingStore()).getFactoryUInt64Col().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerTable = null;
		}
	}

	public YCFBamUInt64ColBuff getUInt64ColBuff() {
		return( (YCFBamUInt64ColBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getUInt64ColBuff().getRequiredTableId() );
	}

	public void setRequiredContainerScope( IYCFBamScopeObj value ) {
		final String S_ProcName = "YCFBamUInt64ColEditObj.setRequiredContainerScope() ";
		if( value == null ) {
			setRequiredContainerTable( null );
		}
		else if( ! ( value instanceof IYCFBamTableObj ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScope",
				"value",
				value,
				"IYCFBamTableObj" );
		}
		else {
			setRequiredContainerTable( (IYCFBamTableObj)value );
		}
	}

	public IYCFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsUInt64Col().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getUInt64ColBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getUInt64ColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getUInt64ColBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( IYCFBamTableObj value ) {
			if( buff == null ) {
				getUInt64ColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getUInt64ColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getUInt64ColBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		YCFBamUInt64ColBuff origBuff = getOrigAsUInt64Col().getUInt64ColBuff();
		YCFBamUInt64ColBuff myBuff = getUInt64ColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamUInt64ColBuff origBuff = getOrigAsUInt64Col().getUInt64ColBuff();
		YCFBamUInt64ColBuff myBuff = getUInt64ColBuff();
		myBuff.set( origBuff );
	}
}

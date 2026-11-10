// Description: Java 11 edit object instance implementation for YCFBam DbKeyHash160Gen.

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

public class YCFBamDbKeyHash160GenEditObj
	extends YCFBamDbKeyHash160TypeEditObj

	implements IYCFBamDbKeyHash160GenEditObj
{
	protected IYCFBamTableObj optionalLookupDispenser;

	public YCFBamDbKeyHash160GenEditObj( IYCFBamDbKeyHash160GenObj argOrig ) {
		super( argOrig );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( YCFBamDbKeyHash160GenObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DbKeyHash160Gen" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
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
		IYCFBamDbKeyHash160GenObj retobj = getSchema().getDbKeyHash160GenTableObj().realiseDbKeyHash160Gen( (IYCFBamDbKeyHash160GenObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDbKeyHash160Gen().forget();
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
		IYCFBamDbKeyHash160GenObj retobj = ((IYCFBamSchemaObj)getOrigAsDbKeyHash160Gen().getSchema()).getDbKeyHash160GenTableObj().createDbKeyHash160Gen( getOrigAsDbKeyHash160Gen() );
		if( retobj == getOrigAsDbKeyHash160Gen() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamValueEditObj update() {
		getSchema().getDbKeyHash160GenTableObj().updateDbKeyHash160Gen( (IYCFBamDbKeyHash160GenObj)this );
		return( null );
	}

	public YCFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDbKeyHash160GenTableObj().deleteDbKeyHash160Gen( getOrigAsDbKeyHash160Gen() );
		return( null );
	}

	public IYCFBamDbKeyHash160GenTableObj getDbKeyHash160GenTable() {
		return( orig.getSchema().getDbKeyHash160GenTableObj() );
	}

	public IYCFBamDbKeyHash160GenEditObj getEditAsDbKeyHash160Gen() {
		return( (IYCFBamDbKeyHash160GenEditObj)this );
	}

	public IYCFBamDbKeyHash160GenObj getOrigAsDbKeyHash160Gen() {
		return( (IYCFBamDbKeyHash160GenObj)orig );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsDbKeyHash160Gen().getSchema().getBackingStore()).getFactoryDbKeyHash160Gen().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDispenser = null;
		}
	}

	public YCFBamDbKeyHash160GenBuff getDbKeyHash160GenBuff() {
		return( (YCFBamDbKeyHash160GenBuff)getBuff() );
	}

	public Long getOptionalDispenserTenantId() {
		return( getDbKeyHash160GenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getDbKeyHash160GenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getDbKeyHash160GenBuff().getRequiredSlice() );
	}

	public void setRequiredSlice( short value ) {
		if( getDbKeyHash160GenBuff().getRequiredSlice() != value ) {
			getDbKeyHash160GenBuff().setRequiredSlice( value );
		}
	}

	public int getRequiredBlockSize() {
		return( getDbKeyHash160GenBuff().getRequiredBlockSize() );
	}

	public void setRequiredBlockSize( int value ) {
		if( getDbKeyHash160GenBuff().getRequiredBlockSize() != value ) {
			getDbKeyHash160GenBuff().setRequiredBlockSize( value );
		}
	}

	public IYCFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public IYCFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( forceRead || ( optionalLookupDispenser == null ) ) {
			boolean anyMissing = false;
			if( getDbKeyHash160GenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getDbKeyHash160GenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsDbKeyHash160Gen().getSchema()).getTableTableObj().readTableByIdIdx( getDbKeyHash160GenBuff().getOptionalDispenserTenantId(),
					getDbKeyHash160GenBuff().getOptionalDispenserId() );
				optionalLookupDispenser = obj;
			}
		}
		return( optionalLookupDispenser );
	}

	public void setOptionalLookupDispenser( IYCFBamTableObj value ) {
			if( buff == null ) {
				getDbKeyHash160GenBuff();
			}
			if( value != null ) {
				getDbKeyHash160GenBuff().setOptionalDispenserTenantId( value.getRequiredTenantId() );
				getDbKeyHash160GenBuff().setOptionalDispenserId( value.getRequiredId() );
			}
			else {
				getDbKeyHash160GenBuff().setOptionalDispenserTenantId( null );
				getDbKeyHash160GenBuff().setOptionalDispenserId( null );
			}
			optionalLookupDispenser = value;
	}

	public void copyBuffToOrig() {
		YCFBamDbKeyHash160GenBuff origBuff = getOrigAsDbKeyHash160Gen().getDbKeyHash160GenBuff();
		YCFBamDbKeyHash160GenBuff myBuff = getDbKeyHash160GenBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamDbKeyHash160GenBuff origBuff = getOrigAsDbKeyHash160Gen().getDbKeyHash160GenBuff();
		YCFBamDbKeyHash160GenBuff myBuff = getDbKeyHash160GenBuff();
		myBuff.set( origBuff );
	}
}

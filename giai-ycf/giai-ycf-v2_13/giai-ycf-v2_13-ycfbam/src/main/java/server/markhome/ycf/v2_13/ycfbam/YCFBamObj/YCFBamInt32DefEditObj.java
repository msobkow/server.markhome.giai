// Description: Java 11 edit object instance implementation for YCFBam Int32Def.

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

public class YCFBamInt32DefEditObj
	extends YCFBamAtomEditObj

	implements IYCFBamInt32DefEditObj
{

	public YCFBamInt32DefEditObj( IYCFBamInt32DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( YCFBamInt32DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Int32Def" );
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
		IYCFBamInt32DefObj retobj = getSchema().getInt32DefTableObj().realiseInt32Def( (IYCFBamInt32DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsInt32Def().forget();
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
		IYCFBamInt32DefObj retobj = ((IYCFBamSchemaObj)getOrigAsInt32Def().getSchema()).getInt32DefTableObj().createInt32Def( getOrigAsInt32Def() );
		if( retobj == getOrigAsInt32Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamValueEditObj update() {
		getSchema().getInt32DefTableObj().updateInt32Def( (IYCFBamInt32DefObj)this );
		return( null );
	}

	public YCFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getInt32DefTableObj().deleteInt32Def( getOrigAsInt32Def() );
		return( null );
	}

	public IYCFBamInt32DefTableObj getInt32DefTable() {
		return( orig.getSchema().getInt32DefTableObj() );
	}

	public IYCFBamInt32DefEditObj getEditAsInt32Def() {
		return( (IYCFBamInt32DefEditObj)this );
	}

	public IYCFBamInt32DefObj getOrigAsInt32Def() {
		return( (IYCFBamInt32DefObj)orig );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsInt32Def().getSchema().getBackingStore()).getFactoryInt32Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public YCFBamInt32DefBuff getInt32DefBuff() {
		return( (YCFBamInt32DefBuff)getBuff() );
	}

	public Integer getOptionalInitValue() {
		return( getInt32DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( Integer value ) {
		if( getInt32DefBuff().getOptionalInitValue() != value ) {
			getInt32DefBuff().setOptionalInitValue( value );
		}
	}

	public Integer getOptionalMinValue() {
		return( getInt32DefBuff().getOptionalMinValue() );
	}

	public void setOptionalMinValue( Integer value ) {
		if( getInt32DefBuff().getOptionalMinValue() != value ) {
			getInt32DefBuff().setOptionalMinValue( value );
		}
	}

	public Integer getOptionalMaxValue() {
		return( getInt32DefBuff().getOptionalMaxValue() );
	}

	public void setOptionalMaxValue( Integer value ) {
		if( getInt32DefBuff().getOptionalMaxValue() != value ) {
			getInt32DefBuff().setOptionalMaxValue( value );
		}
	}

	public void copyBuffToOrig() {
		YCFBamInt32DefBuff origBuff = getOrigAsInt32Def().getInt32DefBuff();
		YCFBamInt32DefBuff myBuff = getInt32DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamInt32DefBuff origBuff = getOrigAsInt32Def().getInt32DefBuff();
		YCFBamInt32DefBuff myBuff = getInt32DefBuff();
		myBuff.set( origBuff );
	}
}

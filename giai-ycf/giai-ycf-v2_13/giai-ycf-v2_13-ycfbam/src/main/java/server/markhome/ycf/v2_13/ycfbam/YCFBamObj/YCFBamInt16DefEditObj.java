// Description: Java 11 edit object instance implementation for YCFBam Int16Def.

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

public class YCFBamInt16DefEditObj
	extends YCFBamAtomEditObj

	implements IYCFBamInt16DefEditObj
{

	public YCFBamInt16DefEditObj( IYCFBamInt16DefObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( YCFBamInt16DefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Int16Def" );
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
		IYCFBamInt16DefObj retobj = getSchema().getInt16DefTableObj().realiseInt16Def( (IYCFBamInt16DefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsInt16Def().forget();
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
		IYCFBamInt16DefObj retobj = ((IYCFBamSchemaObj)getOrigAsInt16Def().getSchema()).getInt16DefTableObj().createInt16Def( getOrigAsInt16Def() );
		if( retobj == getOrigAsInt16Def() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamValueEditObj update() {
		getSchema().getInt16DefTableObj().updateInt16Def( (IYCFBamInt16DefObj)this );
		return( null );
	}

	public YCFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getInt16DefTableObj().deleteInt16Def( getOrigAsInt16Def() );
		return( null );
	}

	public IYCFBamInt16DefTableObj getInt16DefTable() {
		return( orig.getSchema().getInt16DefTableObj() );
	}

	public IYCFBamInt16DefEditObj getEditAsInt16Def() {
		return( (IYCFBamInt16DefEditObj)this );
	}

	public IYCFBamInt16DefObj getOrigAsInt16Def() {
		return( (IYCFBamInt16DefObj)orig );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsInt16Def().getSchema().getBackingStore()).getFactoryInt16Def().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public YCFBamInt16DefBuff getInt16DefBuff() {
		return( (YCFBamInt16DefBuff)getBuff() );
	}

	public Short getOptionalInitValue() {
		return( getInt16DefBuff().getOptionalInitValue() );
	}

	public void setOptionalInitValue( Short value ) {
		if( getInt16DefBuff().getOptionalInitValue() != value ) {
			getInt16DefBuff().setOptionalInitValue( value );
		}
	}

	public Short getOptionalMinValue() {
		return( getInt16DefBuff().getOptionalMinValue() );
	}

	public void setOptionalMinValue( Short value ) {
		if( getInt16DefBuff().getOptionalMinValue() != value ) {
			getInt16DefBuff().setOptionalMinValue( value );
		}
	}

	public Short getOptionalMaxValue() {
		return( getInt16DefBuff().getOptionalMaxValue() );
	}

	public void setOptionalMaxValue( Short value ) {
		if( getInt16DefBuff().getOptionalMaxValue() != value ) {
			getInt16DefBuff().setOptionalMaxValue( value );
		}
	}

	public void copyBuffToOrig() {
		YCFBamInt16DefBuff origBuff = getOrigAsInt16Def().getInt16DefBuff();
		YCFBamInt16DefBuff myBuff = getInt16DefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamInt16DefBuff origBuff = getOrigAsInt16Def().getInt16DefBuff();
		YCFBamInt16DefBuff myBuff = getInt16DefBuff();
		myBuff.set( origBuff );
	}
}

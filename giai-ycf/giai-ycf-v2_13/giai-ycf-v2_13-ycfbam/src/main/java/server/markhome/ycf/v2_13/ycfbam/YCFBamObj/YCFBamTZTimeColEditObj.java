// Description: Java 11 edit object instance implementation for YCFBam TZTimeCol.

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

public class YCFBamTZTimeColEditObj
	extends YCFBamTZTimeDefEditObj

	implements IYCFBamTZTimeColEditObj
{
	protected IYCFBamTableObj requiredContainerTable;

	public YCFBamTZTimeColEditObj( IYCFBamTZTimeColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
	}

	public String getClassCode() {
		return( YCFBamTZTimeColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TZTimeCol" );
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
		IYCFBamTZTimeColObj retobj = getSchema().getTZTimeColTableObj().realiseTZTimeCol( (IYCFBamTZTimeColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTZTimeCol().forget();
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
		IYCFBamTZTimeColObj retobj = ((IYCFBamSchemaObj)getOrigAsTZTimeCol().getSchema()).getTZTimeColTableObj().createTZTimeCol( getOrigAsTZTimeCol() );
		if( retobj == getOrigAsTZTimeCol() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamValueEditObj update() {
		getSchema().getTZTimeColTableObj().updateTZTimeCol( (IYCFBamTZTimeColObj)this );
		return( null );
	}

	public YCFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTZTimeColTableObj().deleteTZTimeCol( getOrigAsTZTimeCol() );
		return( null );
	}

	public IYCFBamTZTimeColTableObj getTZTimeColTable() {
		return( orig.getSchema().getTZTimeColTableObj() );
	}

	public IYCFBamTZTimeColEditObj getEditAsTZTimeCol() {
		return( (IYCFBamTZTimeColEditObj)this );
	}

	public IYCFBamTZTimeColObj getOrigAsTZTimeCol() {
		return( (IYCFBamTZTimeColObj)orig );
	}

	public YCFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsTZTimeCol().getSchema().getBackingStore()).getFactoryTZTimeCol().newBuff();
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

	public YCFBamTZTimeColBuff getTZTimeColBuff() {
		return( (YCFBamTZTimeColBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getTZTimeColBuff().getRequiredTableId() );
	}

	public void setRequiredContainerScope( IYCFBamScopeObj value ) {
		final String S_ProcName = "YCFBamTZTimeColEditObj.setRequiredContainerScope() ";
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
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsTZTimeCol().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getTZTimeColBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getTZTimeColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTZTimeColBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( IYCFBamTableObj value ) {
			if( buff == null ) {
				getTZTimeColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTZTimeColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTZTimeColBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	public void copyBuffToOrig() {
		YCFBamTZTimeColBuff origBuff = getOrigAsTZTimeCol().getTZTimeColBuff();
		YCFBamTZTimeColBuff myBuff = getTZTimeColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamTZTimeColBuff origBuff = getOrigAsTZTimeCol().getTZTimeColBuff();
		YCFBamTZTimeColBuff myBuff = getTZTimeColBuff();
		myBuff.set( origBuff );
	}
}

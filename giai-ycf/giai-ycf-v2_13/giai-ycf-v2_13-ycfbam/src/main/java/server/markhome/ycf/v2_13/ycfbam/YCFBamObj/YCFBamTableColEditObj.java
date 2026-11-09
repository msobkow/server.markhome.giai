// Description: Java 11 edit object instance implementation for CFBam TableCol.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamTableColEditObj
	extends CFBamValueEditObj

	implements ICFBamTableColEditObj
{
	protected ICFBamTableObj requiredContainerTable;
	protected ICFBamValueObj requiredParentDataType;

	public CFBamTableColEditObj( ICFBamTableColObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
		requiredParentDataType = null;
	}

	public String getClassCode() {
		return( CFBamTableColObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "TableCol" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamTableObj scope = getRequiredContainerTable();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
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
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
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
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
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

	public ICFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamTableColObj retobj = getSchema().getTableColTableObj().realiseTableCol( (ICFBamTableColObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTableCol().forget();
	}

	public ICFBamValueObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj create() {
		copyBuffToOrig();
		ICFBamTableColObj retobj = ((ICFBamSchemaObj)getOrigAsTableCol().getSchema()).getTableColTableObj().createTableCol( getOrigAsTableCol() );
		if( retobj == getOrigAsTableCol() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getTableColTableObj().updateTableCol( (ICFBamTableColObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getTableColTableObj().deleteTableCol( getOrigAsTableCol() );
		return( null );
	}

	public ICFBamTableColTableObj getTableColTable() {
		return( orig.getSchema().getTableColTableObj() );
	}

	public ICFBamTableColEditObj getEditAsTableCol() {
		return( (ICFBamTableColEditObj)this );
	}

	public ICFBamTableColObj getOrigAsTableCol() {
		return( (ICFBamTableColObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsTableCol().getSchema().getBackingStore()).getFactoryTableCol().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerTable = null;
			requiredParentDataType = null;
		}
	}

	public CFBamTableColBuff getTableColBuff() {
		return( (CFBamTableColBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getTableColBuff().getRequiredTableId() );
	}

	public String getOptionalDbName() {
		return( getTableColBuff().getOptionalDbName() );
	}

	public void setOptionalDbName( String value ) {
		if( getTableColBuff().getOptionalDbName() != value ) {
			getTableColBuff().setOptionalDbName( value );
		}
	}

	public Long getOptionalDataTenantId() {
		return( getTableColBuff().getOptionalDataTenantId() );
	}

	public Long getOptionalDataId() {
		return( getTableColBuff().getOptionalDataId() );
	}

	public String getOptionalXmlElementName() {
		return( getTableColBuff().getOptionalXmlElementName() );
	}

	public void setOptionalXmlElementName( String value ) {
		if( getTableColBuff().getOptionalXmlElementName() != value ) {
			getTableColBuff().setOptionalXmlElementName( value );
		}
	}

	public void setRequiredContainerScope( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamTableColEditObj.setRequiredContainerScope() ";
		if( value == null ) {
			setRequiredContainerTable( null );
		}
		else if( ! ( value instanceof ICFBamTableObj ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScope",
				"value",
				value,
				"ICFBamTableObj" );
		}
		else {
			setRequiredContainerTable( (ICFBamTableObj)value );
		}
	}

	public ICFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public ICFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsTableCol().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getTableColBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getTableColBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getTableColBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getTableColBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getTableColBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getTableColBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
			super.setRequiredContainerScope( value );
	}

	public ICFBamValueObj getRequiredParentDataType() {
		return( getRequiredParentDataType( false ) );
	}

	public ICFBamValueObj getRequiredParentDataType( boolean forceRead ) {
		if( forceRead || ( requiredParentDataType == null ) ) {
			boolean anyMissing = false;
			if( getTableColBuff().getOptionalDataTenantId() == null ) {
				anyMissing = true;
			}
			if( getTableColBuff().getOptionalDataId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamValueObj obj = ((ICFBamSchemaObj)getOrigAsTableCol().getSchema()).getValueTableObj().readValueByIdIdx( getTableColBuff().getOptionalDataTenantId(),
					getTableColBuff().getOptionalDataId() );
				requiredParentDataType = obj;
			}
		}
		return( requiredParentDataType );
	}

	public void setRequiredParentDataType( ICFBamValueObj value ) {
			if( buff == null ) {
				getTableColBuff();
			}
			if( value != null ) {
				getTableColBuff().setOptionalDataTenantId( value.getRequiredTenantId() );
				getTableColBuff().setOptionalDataId( value.getRequiredId() );
			}
			else {
				getTableColBuff().setOptionalDataTenantId( null );
				getTableColBuff().setOptionalDataId( null );
			}
			requiredParentDataType = value;
	}

	public void copyBuffToOrig() {
		CFBamTableColBuff origBuff = getOrigAsTableCol().getTableColBuff();
		CFBamTableColBuff myBuff = getTableColBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamTableColBuff origBuff = getOrigAsTableCol().getTableColBuff();
		CFBamTableColBuff myBuff = getTableColBuff();
		myBuff.set( origBuff );
	}
}

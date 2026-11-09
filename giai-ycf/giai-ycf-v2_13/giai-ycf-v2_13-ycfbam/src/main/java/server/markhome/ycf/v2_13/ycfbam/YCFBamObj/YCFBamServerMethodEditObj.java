// Description: Java 11 edit object instance implementation for CFBam ServerMethod.

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

public class CFBamServerMethodEditObj
	extends CFBamScopeEditObj

	implements ICFBamServerMethodEditObj
{
	protected ICFBamSchemaDefObj optionalLookupDefSchema;
	protected ICFBamTableObj requiredContainerForTable;

	public CFBamServerMethodEditObj( ICFBamServerMethodObj argOrig ) {
		super( argOrig );
		optionalLookupDefSchema = null;
		requiredContainerForTable = null;
	}

	public String getClassCode() {
		return( CFBamServerMethodObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ServerMethod" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamTableObj scope = getRequiredContainerForTable();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamTableObj scope = getRequiredContainerForTable();
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

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamServerMethodObj retobj = getSchema().getServerMethodTableObj().realiseServerMethod( (ICFBamServerMethodObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsServerMethod().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamServerMethodObj retobj = ((ICFBamSchemaObj)getOrigAsServerMethod().getSchema()).getServerMethodTableObj().createServerMethod( getOrigAsServerMethod() );
		if( retobj == getOrigAsServerMethod() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getServerMethodTableObj().updateServerMethod( (ICFBamServerMethodObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getServerMethodTableObj().deleteServerMethod( getOrigAsServerMethod() );
		return( null );
	}

	public ICFBamServerMethodTableObj getServerMethodTable() {
		return( orig.getSchema().getServerMethodTableObj() );
	}

	public ICFBamServerMethodEditObj getEditAsServerMethod() {
		return( (ICFBamServerMethodEditObj)this );
	}

	public ICFBamServerMethodObj getOrigAsServerMethod() {
		return( (ICFBamServerMethodObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsServerMethod().getSchema().getBackingStore()).getFactoryServerMethod().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDefSchema = null;
			requiredContainerForTable = null;
		}
	}

	public CFBamServerMethodBuff getServerMethodBuff() {
		return( (CFBamServerMethodBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getServerMethodBuff().getRequiredTableId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getServerMethodBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getServerMethodBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getServerMethodBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getServerMethodBuff().getRequiredName() != value ) {
			getServerMethodBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortName() {
		return( getServerMethodBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getServerMethodBuff().getOptionalShortName() != value ) {
			getServerMethodBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getServerMethodBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getServerMethodBuff().getOptionalLabel() != value ) {
			getServerMethodBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getServerMethodBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getServerMethodBuff().getOptionalShortDescription() != value ) {
			getServerMethodBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getServerMethodBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getServerMethodBuff().getOptionalDescription() != value ) {
			getServerMethodBuff().setOptionalDescription( value );
		}
	}

	public String getOptionalSuffix() {
		return( getServerMethodBuff().getOptionalSuffix() );
	}

	public void setOptionalSuffix( String value ) {
		if( getServerMethodBuff().getOptionalSuffix() != value ) {
			getServerMethodBuff().setOptionalSuffix( value );
		}
	}

	public boolean getRequiredIsInstanceMethod() {
		return( getServerMethodBuff().getRequiredIsInstanceMethod() );
	}

	public void setRequiredIsInstanceMethod( boolean value ) {
		if( getServerMethodBuff().getRequiredIsInstanceMethod() != value ) {
			getServerMethodBuff().setRequiredIsInstanceMethod( value );
		}
	}

	public boolean getRequiredIsServerOnly() {
		return( getServerMethodBuff().getRequiredIsServerOnly() );
	}

	public void setRequiredIsServerOnly( boolean value ) {
		if( getServerMethodBuff().getRequiredIsServerOnly() != value ) {
			getServerMethodBuff().setRequiredIsServerOnly( value );
		}
	}

	public ICFBamSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return( getServerMethodBuff().getRequiredCodeVis() );
	}

	public void setRequiredCodeVis( ICFBamSchema.CodeVisibilityEnum value ) {
		if( getServerMethodBuff().getRequiredCodeVis() != value ) {
			getServerMethodBuff().setRequiredCodeVis( value );
		}
	}

	public String getRequiredJMethodBody() {
		return( getServerMethodBuff().getRequiredJMethodBody() );
	}

	public void setRequiredJMethodBody( String value ) {
		if( getServerMethodBuff().getRequiredJMethodBody() != value ) {
			getServerMethodBuff().setRequiredJMethodBody( value );
		}
	}

	public String getRequiredCppMethodBody() {
		return( getServerMethodBuff().getRequiredCppMethodBody() );
	}

	public void setRequiredCppMethodBody( String value ) {
		if( getServerMethodBuff().getRequiredCppMethodBody() != value ) {
			getServerMethodBuff().setRequiredCppMethodBody( value );
		}
	}

	public String getRequiredCsMethodBody() {
		return( getServerMethodBuff().getRequiredCsMethodBody() );
	}

	public void setRequiredCsMethodBody( String value ) {
		if( getServerMethodBuff().getRequiredCsMethodBody() != value ) {
			getServerMethodBuff().setRequiredCsMethodBody( value );
		}
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public ICFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getServerMethodBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getServerMethodBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsServerMethod().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getServerMethodBuff().getOptionalDefSchemaTenantId(),
					getServerMethodBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getServerMethodBuff();
			}
			if( value != null ) {
				getServerMethodBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getServerMethodBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getServerMethodBuff().setOptionalDefSchemaTenantId( null );
				getServerMethodBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public ICFBamTableObj getRequiredContainerForTable() {
		return( getRequiredContainerForTable( false ) );
	}

	public ICFBamTableObj getRequiredContainerForTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerForTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsServerMethod().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getServerMethodBuff().getRequiredTableId() );
				requiredContainerForTable = obj;
				if( obj != null ) {
					getServerMethodBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getServerMethodBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerForTable = obj;
				}
			}
		}
		return( requiredContainerForTable );
	}

	public void setRequiredContainerForTable( ICFBamTableObj value ) {
			if( buff == null ) {
				getServerMethodBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getServerMethodBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getServerMethodBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerForTable = value;
	}

	public List<ICFBamParamObj> getOptionalComponentsParams() {
		List<ICFBamParamObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsServerMethod().getSchema()).getParamTableObj().readParamByServerMethodIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamParamObj> getOptionalComponentsParams( boolean forceRead ) {
		List<ICFBamParamObj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsServerMethod().getSchema()).getParamTableObj().readParamByServerMethodIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		CFBamServerMethodBuff origBuff = getOrigAsServerMethod().getServerMethodBuff();
		CFBamServerMethodBuff myBuff = getServerMethodBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamServerMethodBuff origBuff = getOrigAsServerMethod().getServerMethodBuff();
		CFBamServerMethodBuff myBuff = getServerMethodBuff();
		myBuff.set( origBuff );
	}
}

// Description: Java 11 edit object instance implementation for YCFBam ServerMethod.

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

public class YCFBamServerMethodEditObj
	extends YCFBamScopeEditObj

	implements IYCFBamServerMethodEditObj
{
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFBamTableObj requiredContainerForTable;

	public YCFBamServerMethodEditObj( IYCFBamServerMethodObj argOrig ) {
		super( argOrig );
		optionalLookupDefSchema = null;
		requiredContainerForTable = null;
	}

	public String getClassCode() {
		return( YCFBamServerMethodObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ServerMethod" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFBamTableObj scope = getRequiredContainerForTable();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFBamTableObj scope = getRequiredContainerForTable();
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
		IYCFBamServerMethodObj retobj = getSchema().getServerMethodTableObj().realiseServerMethod( (IYCFBamServerMethodObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsServerMethod().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamServerMethodObj retobj = ((IYCFBamSchemaObj)getOrigAsServerMethod().getSchema()).getServerMethodTableObj().createServerMethod( getOrigAsServerMethod() );
		if( retobj == getOrigAsServerMethod() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getServerMethodTableObj().updateServerMethod( (IYCFBamServerMethodObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getServerMethodTableObj().deleteServerMethod( getOrigAsServerMethod() );
		return( null );
	}

	public IYCFBamServerMethodTableObj getServerMethodTable() {
		return( orig.getSchema().getServerMethodTableObj() );
	}

	public IYCFBamServerMethodEditObj getEditAsServerMethod() {
		return( (IYCFBamServerMethodEditObj)this );
	}

	public IYCFBamServerMethodObj getOrigAsServerMethod() {
		return( (IYCFBamServerMethodObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsServerMethod().getSchema().getBackingStore()).getFactoryServerMethod().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDefSchema = null;
			requiredContainerForTable = null;
		}
	}

	public YCFBamServerMethodBuff getServerMethodBuff() {
		return( (YCFBamServerMethodBuff)getBuff() );
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

	public IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return( getServerMethodBuff().getRequiredCodeVis() );
	}

	public void setRequiredCodeVis( IYCFBamSchema.CodeVisibilityEnum value ) {
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

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getServerMethodBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getServerMethodBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsServerMethod().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getServerMethodBuff().getOptionalDefSchemaTenantId(),
					getServerMethodBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
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

	public IYCFBamTableObj getRequiredContainerForTable() {
		return( getRequiredContainerForTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerForTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerForTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsServerMethod().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
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

	public void setRequiredContainerForTable( IYCFBamTableObj value ) {
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

	public List<IYCFBamParamObj> getOptionalComponentsParams() {
		List<IYCFBamParamObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsServerMethod().getSchema()).getParamTableObj().readParamByServerMethodIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamParamObj> getOptionalComponentsParams( boolean forceRead ) {
		List<IYCFBamParamObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsServerMethod().getSchema()).getParamTableObj().readParamByServerMethodIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		YCFBamServerMethodBuff origBuff = getOrigAsServerMethod().getServerMethodBuff();
		YCFBamServerMethodBuff myBuff = getServerMethodBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamServerMethodBuff origBuff = getOrigAsServerMethod().getServerMethodBuff();
		YCFBamServerMethodBuff myBuff = getServerMethodBuff();
		myBuff.set( origBuff );
	}
}

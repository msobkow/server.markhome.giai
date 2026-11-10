// Description: Java 11 edit object instance implementation for YCFBam Index.

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

public class YCFBamIndexEditObj
	extends YCFBamScopeEditObj

	implements IYCFBamIndexEditObj
{
	protected IYCFBamTableObj requiredContainerTable;
	protected IYCFBamSchemaDefObj optionalLookupDefSchema;
	protected IYCFSecTenantObj requiredOwnerIdxTenant;

	public YCFBamIndexEditObj( IYCFBamIndexObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
		optionalLookupDefSchema = null;
		requiredOwnerIdxTenant = null;
	}

	public String getClassCode() {
		return( YCFBamIndexObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Index" );
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
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getIndexColTableObj().readIndexColByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getIndexTweakTableObj().readIndexTweakByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
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
		IYCFBamIndexObj retobj = getSchema().getIndexTableObj().realiseIndex( (IYCFBamIndexObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsIndex().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamIndexObj retobj = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getIndexTableObj().createIndex( getOrigAsIndex() );
		if( retobj == getOrigAsIndex() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getIndexTableObj().updateIndex( (IYCFBamIndexObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getIndexTableObj().deleteIndex( getOrigAsIndex() );
		return( null );
	}

	public IYCFBamIndexTableObj getIndexTable() {
		return( orig.getSchema().getIndexTableObj() );
	}

	public IYCFBamIndexEditObj getEditAsIndex() {
		return( (IYCFBamIndexEditObj)this );
	}

	public IYCFBamIndexObj getOrigAsIndex() {
		return( (IYCFBamIndexObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsIndex().getSchema().getBackingStore()).getFactoryIndex().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerTable = null;
			optionalLookupDefSchema = null;
			requiredOwnerIdxTenant = null;
		}
	}

	public YCFBamIndexBuff getIndexBuff() {
		return( (YCFBamIndexBuff)getBuff() );
	}

	public long getRequiredTableId() {
		return( getIndexBuff().getRequiredTableId() );
	}

	public Long getOptionalDefSchemaTenantId() {
		return( getIndexBuff().getOptionalDefSchemaTenantId() );
	}

	public Long getOptionalDefSchemaId() {
		return( getIndexBuff().getOptionalDefSchemaId() );
	}

	public String getRequiredName() {
		return( getIndexBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getIndexBuff().getRequiredName() != value ) {
			getIndexBuff().setRequiredName( value );
		}
	}

	public String getOptionalShortName() {
		return( getIndexBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getIndexBuff().getOptionalShortName() != value ) {
			getIndexBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getIndexBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getIndexBuff().getOptionalLabel() != value ) {
			getIndexBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getIndexBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getIndexBuff().getOptionalShortDescription() != value ) {
			getIndexBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getIndexBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getIndexBuff().getOptionalDescription() != value ) {
			getIndexBuff().setOptionalDescription( value );
		}
	}

	public String getOptionalDbName() {
		return( getIndexBuff().getOptionalDbName() );
	}

	public void setOptionalDbName( String value ) {
		if( getIndexBuff().getOptionalDbName() != value ) {
			getIndexBuff().setOptionalDbName( value );
		}
	}

	public String getOptionalSuffix() {
		return( getIndexBuff().getOptionalSuffix() );
	}

	public void setOptionalSuffix( String value ) {
		if( getIndexBuff().getOptionalSuffix() != value ) {
			getIndexBuff().setOptionalSuffix( value );
		}
	}

	public boolean getRequiredIsUnique() {
		return( getIndexBuff().getRequiredIsUnique() );
	}

	public void setRequiredIsUnique( boolean value ) {
		if( getIndexBuff().getRequiredIsUnique() != value ) {
			getIndexBuff().setRequiredIsUnique( value );
		}
	}

	public boolean getRequiredIsDbMapped() {
		return( getIndexBuff().getRequiredIsDbMapped() );
	}

	public void setRequiredIsDbMapped( boolean value ) {
		if( getIndexBuff().getRequiredIsDbMapped() != value ) {
			getIndexBuff().setRequiredIsDbMapped( value );
		}
	}

	public IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis() {
		return( getIndexBuff().getRequiredCodeVis() );
	}

	public void setRequiredCodeVis( IYCFBamSchema.CodeVisibilityEnum value ) {
		if( getIndexBuff().getRequiredCodeVis() != value ) {
			getIndexBuff().setRequiredCodeVis( value );
		}
	}

	public IYCFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getTableTableObj().readTableByIdIdx( getPKey().getRequiredTenantId(),
					getIndexBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getIndexBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getIndexBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( IYCFBamTableObj value ) {
			if( buff == null ) {
				getIndexBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema() {
		return( getOptionalLookupDefSchema( false ) );
	}

	public IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead ) {
		if( forceRead || ( optionalLookupDefSchema == null ) ) {
			boolean anyMissing = false;
			if( getIndexBuff().getOptionalDefSchemaTenantId() == null ) {
				anyMissing = true;
			}
			if( getIndexBuff().getOptionalDefSchemaId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamSchemaDefObj obj = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getIndexBuff().getOptionalDefSchemaTenantId(),
					getIndexBuff().getOptionalDefSchemaId() );
				optionalLookupDefSchema = obj;
			}
		}
		return( optionalLookupDefSchema );
	}

	public void setOptionalLookupDefSchema( IYCFBamSchemaDefObj value ) {
			if( buff == null ) {
				getIndexBuff();
			}
			if( value != null ) {
				getIndexBuff().setOptionalDefSchemaTenantId( value.getRequiredTenantId() );
				getIndexBuff().setOptionalDefSchemaId( value.getRequiredId() );
			}
			else {
				getIndexBuff().setOptionalDefSchemaTenantId( null );
				getIndexBuff().setOptionalDefSchemaId( null );
			}
			optionalLookupDefSchema = value;
	}

	public List<IYCFBamIndexColObj> getOptionalComponentsColumns() {
		List<IYCFBamIndexColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getIndexColTableObj().readIndexColByIndexIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamIndexColObj> getOptionalComponentsColumns( boolean forceRead ) {
		List<IYCFBamIndexColObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getIndexColTableObj().readIndexColByIndexIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamIndexTweakObj> getOptionalComponentsTweaks() {
		List<IYCFBamIndexTweakObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getIndexTweakTableObj().readIndexTweakByIndexIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamIndexTweakObj> getOptionalComponentsTweaks( boolean forceRead ) {
		List<IYCFBamIndexTweakObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getIndexTweakTableObj().readIndexTweakByIndexIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFSecTenantObj getRequiredOwnerIdxTenant() {
		return( getRequiredOwnerIdxTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerIdxTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerIdxTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsIndex().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerIdxTenant = obj;
			}
		}
		return( requiredOwnerIdxTenant );
	}

	public void setRequiredOwnerIdxTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getIndexBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getIndexBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerIdxTenant = value;
			super.setRequiredOwnerTenant( value );
	}

	public void copyBuffToOrig() {
		YCFBamIndexBuff origBuff = getOrigAsIndex().getIndexBuff();
		YCFBamIndexBuff myBuff = getIndexBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamIndexBuff origBuff = getOrigAsIndex().getIndexBuff();
		YCFBamIndexBuff myBuff = getIndexBuff();
		myBuff.set( origBuff );
	}
}

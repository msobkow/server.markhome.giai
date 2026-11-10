// Description: Java 11 edit object instance implementation for YCFBam DelTopDep.

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

public class YCFBamDelTopDepEditObj
	extends YCFBamDelDepEditObj

	implements IYCFBamDelTopDepEditObj
{
	protected IYCFBamTableObj requiredContainerTable;
	protected IYCFBamDelTopDepObj optionalLookupPrev;
	protected IYCFBamDelTopDepObj optionalLookupNext;

	public YCFBamDelTopDepEditObj( IYCFBamDelTopDepObj argOrig ) {
		super( argOrig );
		requiredContainerTable = null;
		optionalLookupPrev = null;
		optionalLookupNext = null;
	}

	public String getClassCode() {
		return( YCFBamDelTopDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DelTopDep" );
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

	public IYCFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamDelTopDepObj retobj = getSchema().getDelTopDepTableObj().realiseDelTopDep( (IYCFBamDelTopDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDelTopDep().forget();
	}

	public IYCFBamDelTopDepObj moveUp() {
		throw new YCFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamDelTopDepObj moveDown() {
		throw new YCFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamDelTopDepObj retobj = ((IYCFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelTopDepTableObj().createDelTopDep( getOrigAsDelTopDep() );
		if( retobj == getOrigAsDelTopDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getDelTopDepTableObj().updateDelTopDep( (IYCFBamDelTopDepObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDelTopDepTableObj().deleteDelTopDep( getOrigAsDelTopDep() );
		return( null );
	}

	public IYCFBamDelTopDepTableObj getDelTopDepTable() {
		return( orig.getSchema().getDelTopDepTableObj() );
	}

	public IYCFBamDelTopDepEditObj getEditAsDelTopDep() {
		return( (IYCFBamDelTopDepEditObj)this );
	}

	public IYCFBamDelTopDepObj getOrigAsDelTopDep() {
		return( (IYCFBamDelTopDepObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsDelTopDep().getSchema().getBackingStore()).getFactoryDelTopDep().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerTable = null;
			optionalLookupPrev = null;
			optionalLookupNext = null;
		}
	}

	public YCFBamDelTopDepBuff getDelTopDepBuff() {
		return( (YCFBamDelTopDepBuff)getBuff() );
	}

	public String getRequiredName() {
		return( getDelTopDepBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDelTopDepBuff().getRequiredName() != value ) {
			getDelTopDepBuff().setRequiredName( value );
		}
	}

	public long getRequiredTableTenantId() {
		return( getDelTopDepBuff().getRequiredTableTenantId() );
	}

	public long getRequiredTableId() {
		return( getDelTopDepBuff().getRequiredTableId() );
	}

	public Long getOptionalPrevTenantId() {
		return( getDelTopDepBuff().getOptionalPrevTenantId() );
	}

	public Long getOptionalPrevId() {
		return( getDelTopDepBuff().getOptionalPrevId() );
	}

	public Long getOptionalNextTenantId() {
		return( getDelTopDepBuff().getOptionalNextTenantId() );
	}

	public Long getOptionalNextId() {
		return( getDelTopDepBuff().getOptionalNextId() );
	}

	public IYCFBamTableObj getRequiredContainerTable() {
		return( getRequiredContainerTable( false ) );
	}

	public IYCFBamTableObj getRequiredContainerTable( boolean forceRead ) {
		if( forceRead || ( requiredContainerTable == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFBamTableObj obj = ((IYCFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getTableTableObj().readTableByIdIdx( getDelTopDepBuff().getRequiredTableTenantId(),
					getDelTopDepBuff().getRequiredTableId() );
				requiredContainerTable = obj;
				if( obj != null ) {
					getDelTopDepBuff().setRequiredTableTenantId( obj.getRequiredTenantId() );
					getDelTopDepBuff().setRequiredTableId( obj.getRequiredId() );
					requiredContainerTable = obj;
				}
			}
		}
		return( requiredContainerTable );
	}

	public void setRequiredContainerTable( IYCFBamTableObj value ) {
			if( buff == null ) {
				getDelTopDepBuff();
			}
			if( value != null ) {
				getDelTopDepBuff().setRequiredTableTenantId( value.getRequiredTenantId() );
				getDelTopDepBuff().setRequiredTableId( value.getRequiredId() );
			}
			requiredContainerTable = value;
	}

	public List<IYCFBamDelSubDep1Obj> getOptionalComponentsDelDep() {
		List<IYCFBamDelSubDep1Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelSubDep1TableObj().readDelSubDep1ByDelTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamDelSubDep1Obj> getOptionalComponentsDelDep( boolean forceRead ) {
		List<IYCFBamDelSubDep1Obj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelSubDep1TableObj().readDelSubDep1ByDelTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFBamDelTopDepObj getOptionalLookupPrev() {
		return( getOptionalLookupPrev( false ) );
	}

	public IYCFBamDelTopDepObj getOptionalLookupPrev( boolean forceRead ) {
		if( forceRead || ( optionalLookupPrev == null ) ) {
			boolean anyMissing = false;
			if( getDelTopDepBuff().getOptionalPrevTenantId() == null ) {
				anyMissing = true;
			}
			if( getDelTopDepBuff().getOptionalPrevId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamDelTopDepObj obj = ((IYCFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelTopDepTableObj().readDelTopDepByIdIdx( getDelTopDepBuff().getOptionalPrevTenantId(),
					getDelTopDepBuff().getOptionalPrevId() );
				optionalLookupPrev = obj;
			}
		}
		return( optionalLookupPrev );
	}

	public void setOptionalLookupPrev( IYCFBamDelTopDepObj value ) {
			if( buff == null ) {
				getDelTopDepBuff();
			}
			if( value != null ) {
				getDelTopDepBuff().setOptionalPrevTenantId( value.getRequiredTenantId() );
				getDelTopDepBuff().setOptionalPrevId( value.getRequiredId() );
			}
			else {
				getDelTopDepBuff().setOptionalPrevTenantId( null );
				getDelTopDepBuff().setOptionalPrevId( null );
			}
			optionalLookupPrev = value;
	}

	public IYCFBamDelTopDepObj getOptionalLookupNext() {
		return( getOptionalLookupNext( false ) );
	}

	public IYCFBamDelTopDepObj getOptionalLookupNext( boolean forceRead ) {
		if( forceRead || ( optionalLookupNext == null ) ) {
			boolean anyMissing = false;
			if( getDelTopDepBuff().getOptionalNextTenantId() == null ) {
				anyMissing = true;
			}
			if( getDelTopDepBuff().getOptionalNextId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFBamDelTopDepObj obj = ((IYCFBamSchemaObj)getOrigAsDelTopDep().getSchema()).getDelTopDepTableObj().readDelTopDepByIdIdx( getDelTopDepBuff().getOptionalNextTenantId(),
					getDelTopDepBuff().getOptionalNextId() );
				optionalLookupNext = obj;
			}
		}
		return( optionalLookupNext );
	}

	public void setOptionalLookupNext( IYCFBamDelTopDepObj value ) {
			if( buff == null ) {
				getDelTopDepBuff();
			}
			if( value != null ) {
				getDelTopDepBuff().setOptionalNextTenantId( value.getRequiredTenantId() );
				getDelTopDepBuff().setOptionalNextId( value.getRequiredId() );
			}
			else {
				getDelTopDepBuff().setOptionalNextTenantId( null );
				getDelTopDepBuff().setOptionalNextId( null );
			}
			optionalLookupNext = value;
	}

	public void copyBuffToOrig() {
		YCFBamDelTopDepBuff origBuff = getOrigAsDelTopDep().getDelTopDepBuff();
		YCFBamDelTopDepBuff myBuff = getDelTopDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamDelTopDepBuff origBuff = getOrigAsDelTopDep().getDelTopDepBuff();
		YCFBamDelTopDepBuff myBuff = getDelTopDepBuff();
		myBuff.set( origBuff );
	}
}

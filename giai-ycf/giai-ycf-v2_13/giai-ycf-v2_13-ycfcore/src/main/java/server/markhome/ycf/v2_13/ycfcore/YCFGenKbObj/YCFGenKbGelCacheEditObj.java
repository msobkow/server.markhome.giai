// Description: Java 11 edit object instance implementation for YCFGenKb GelCache.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFEngine;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public class YCFGenKbGelCacheEditObj
	implements IYCFGenKbGelCacheEditObj
{
	protected IYCFGenKbGelCacheObj orig;
	protected YCFGenKbGelCacheBuff buff;
	protected IYCFGenKbTenantObj requiredOwnerTenant;

	public YCFGenKbGelCacheEditObj( IYCFGenKbGelCacheObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbGelCacheBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
	}

	public String getClassCode() {
		return( YCFGenKbGelCacheObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelCache" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelCacheId();
		objName = Long.toString( val );
		return( objName );
	}

	public IYCFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		IYCFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
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
				if( container instanceof IYCFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof IYCFGenKbTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public IYCFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		IYCFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		IYCFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
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
			if( container instanceof IYCFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFGenKbTenantObj ) {
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

	public String getObjFullName() {
		String fullName = getObjName();
		IYCFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof IYCFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFGenKbTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				fullName = containerName + "." + fullName;
				container = container.getObjScope();
			}
		}
		return( fullName );
	}

	public IYCFGenKbGelCacheObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbGelCacheObj retobj = getSchema().getGelCacheTableObj().realiseGelCache( (IYCFGenKbGelCacheObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelCache().forget();
	}

	public IYCFGenKbGelCacheObj read() {
		IYCFGenKbGelCacheObj retval = getOrigAsGelCache().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGelCacheObj read( boolean forceRead ) {
		IYCFGenKbGelCacheObj retval = getOrigAsGelCache().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGelCacheObj create() {
		copyBuffToOrig();
		IYCFGenKbGelCacheObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelCache().getSchema()).getGelCacheTableObj().createGelCache( getOrigAsGelCache() );
		if( retobj == getOrigAsGelCache() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelCacheEditObj update() {
		getSchema().getGelCacheTableObj().updateGelCache( (IYCFGenKbGelCacheObj)this );
		return( null );
	}

	public YCFGenKbGelCacheEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelCacheTableObj().deleteGelCache( getOrigAsGelCache() );
		return( null );
	}

	public IYCFGenKbGelCacheTableObj getGelCacheTable() {
		return( orig.getSchema().getGelCacheTableObj() );
	}

	public IYCFGenKbGelCacheEditObj getEdit() {
		return( (IYCFGenKbGelCacheEditObj)this );
	}

	public IYCFGenKbGelCacheEditObj getEditAsGelCache() {
		return( (IYCFGenKbGelCacheEditObj)this );
	}

	public IYCFGenKbGelCacheEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbGelCacheObj getOrig() {
		return( orig );
	}

	public IYCFGenKbGelCacheObj getOrigAsGelCache() {
		return( (IYCFGenKbGelCacheObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbGelCacheBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelCache().getSchema().getBackingStore()).getFactoryGelCache().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelCacheBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
		}
	}

	public YCFGenKbGelCacheBuff getGelCacheBuff() {
		return( (YCFGenKbGelCacheBuff)getBuff() );
	}

	public YCFGenKbGelCachePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbGelCachePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredGelCacheId() {
		return( getPKey().getRequiredGelCacheId() );
	}

	public String getRequiredCacheName() {
		return( getGelCacheBuff().getRequiredCacheName() );
	}

	public void setRequiredCacheName( String value ) {
		if( getGelCacheBuff().getRequiredCacheName() != value ) {
			getGelCacheBuff().setRequiredCacheName( value );
		}
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTenantObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelCache().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFGenKbTenantObj value ) {
			if( buff == null ) {
				getGelCacheBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getGelCacheBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbGelCacheBuff origBuff = getOrigAsGelCache().getGelCacheBuff();
		YCFGenKbGelCacheBuff myBuff = getGelCacheBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelCacheBuff origBuff = getOrigAsGelCache().getGelCacheBuff();
		YCFGenKbGelCacheBuff myBuff = getGelCacheBuff();
		myBuff.set( origBuff );
	}

	public IYCFGenKbGelInstructionObj lookupMacro( String macroBody ) {
		throw new YCFLibUsageException( getClass(), "lookupMacro", "You are not allowed to manipulate macros while objects are being edited" );
	}

	public IYCFGenKbGelInstructionObj rememberMacro( String macroBody, IYCFGenKbGelInstructionObj gel ) {
		throw new YCFLibUsageException( getClass(), "rememberMacro", "You are not allowed to manipulate macros while objects are being edited" );
	}

	public IYCFGenKbGelExecutableObj lookupExecutable( String execName ) {
		throw new YCFLibUsageException( getClass(), "lookupExecutable", "You are not allowed to manipulate macros while objects are being edited" );
	}

	public IYCFGenKbGelExecutableObj rememberExecutable( String execName, IYCFGenKbGelExecutableObj gel ) {
		throw new YCFLibUsageException( getClass(), "rememberExecutable", "You are not allowed to manipulate macros while objects are being edited" );
	}
}

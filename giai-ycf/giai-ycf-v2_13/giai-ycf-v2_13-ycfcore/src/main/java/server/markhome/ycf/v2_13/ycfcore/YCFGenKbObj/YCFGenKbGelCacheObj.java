// Description: Java 11 base object instance implementation for YCFGenKb GelCache.

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

public class YCFGenKbGelCacheObj
	implements IYCFGenKbGelCacheObj
{
	public final static String CLASS_CODE = "a915";
	protected boolean isNew;
	protected IYCFGenKbGelCacheEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbGelCachePKey pKey;
	protected YCFGenKbGelCacheBuff buff;
	protected IYCFGenKbTenantObj requiredOwnerTenant;
	protected Map< String, IYCFGenKbGelInstructionObj > mapMacro = new HashMap< String, IYCFGenKbGelInstructionObj >();
	protected Map< String, IYCFGenKbGelExecutableObj > mapExecutable = new HashMap< String, IYCFGenKbGelExecutableObj >();

	public YCFGenKbGelCacheObj() {
		isNew = true;
		requiredOwnerTenant = null;
	}

	public YCFGenKbGelCacheObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFGenKbGelCacheObj retobj = ((IYCFGenKbSchemaObj)schema).getGelCacheTableObj().realiseGelCache(
			(IYCFGenKbGelCacheObj)this );
		return( (IYCFGenKbGelCacheObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelCacheTableObj().reallyDeepDisposeGelCache( (IYCFGenKbGelCacheObj)this );
	}

	public IYCFGenKbGelCacheObj read() {
		IYCFGenKbGelCacheObj retobj = ((IYCFGenKbSchemaObj)schema).getGelCacheTableObj().readGelCacheByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(), false );
		return( (IYCFGenKbGelCacheObj)retobj );
	}

	public IYCFGenKbGelCacheObj read( boolean forceRead ) {
		IYCFGenKbGelCacheObj retobj = ((IYCFGenKbSchemaObj)schema).getGelCacheTableObj().readGelCacheByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(), forceRead );
		return( (IYCFGenKbGelCacheObj)retobj );
	}

	public IYCFGenKbGelCacheTableObj getGelCacheTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelCacheTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbGelCacheBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelCacheBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelCacheBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelCacheBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
	}

	public YCFGenKbGelCacheBuff getGelCacheBuff() {
		return( (YCFGenKbGelCacheBuff)getBuff() );
	}

	public YCFGenKbGelCachePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbGelCachePKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToBuff();
		}
	}

	public boolean getIsNew() {
		return( isNew );
	}

	public void setIsNew( boolean value ) {
		isNew = value;
	}

	public IYCFGenKbGelCacheEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelCacheObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelCacheObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelCacheTableObj().lockGelCache( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelCacheTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelCacheEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbGelCacheEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbGelCacheEditObj getEditAsGelCache() {
		return( (IYCFGenKbGelCacheEditObj)edit );
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

	public IYCFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
	}

	public IYCFGenKbGelInstructionObj lookupMacro( String macroBody ) {
		IYCFGenKbGelInstructionObj gel = mapMacro.get( macroBody );
		return( gel );
	}

	public IYCFGenKbGelInstructionObj rememberMacro( String macroBody, IYCFGenKbGelInstructionObj gel ) {
		IYCFGenKbGelInstructionObj found;
		found = mapMacro.get( macroBody );
		if( found == null ) {
			mapMacro.put( macroBody, gel );
			found = gel;
		}
		return( found );
	}

	public IYCFGenKbGelExecutableObj lookupExecutable( String execName ) {
		IYCFGenKbGelExecutableObj gel = mapExecutable.get( execName );
		return( gel );
	}

	public IYCFGenKbGelExecutableObj rememberExecutable( String execName, IYCFGenKbGelExecutableObj gel ) {
		IYCFGenKbGelExecutableObj found;
		found = mapExecutable.get( execName );
		if( found == null ) {
			mapExecutable.put( execName, gel );
			found = gel;
		}
		return( found );
	}
}

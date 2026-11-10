// Description: Java 11 edit object instance implementation for YCFGenKb GelInstruction.

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

public class YCFGenKbGelInstructionEditObj
	implements IYCFGenKbGelInstructionEditObj
{
	protected IYCFGenKbGelInstructionObj orig;
	protected YCFGenKbGelInstructionBuff buff;
	protected IYCFGenKbTenantObj requiredOwnerTenant;
	protected IYCFGenKbGelCacheObj requiredContainerGelCache;
	protected IYCFGenKbGelInstructionObj optionalLookupChainInst;

	public YCFGenKbGelInstructionEditObj( IYCFGenKbGelInstructionObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbGelInstructionBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public String getClassCode() {
		return( YCFGenKbGelInstructionObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelInstruction" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbGelCacheObj scope = getRequiredContainerGelCache();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbGelCacheObj scope = getRequiredContainerGelCache();
		return( scope );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelInstId();
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

	public IYCFGenKbGelInstructionObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbGelInstructionObj retobj = getSchema().getGelInstructionTableObj().realiseGelInstruction( (IYCFGenKbGelInstructionObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelInstruction().forget();
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelInstructionObj retval = getOrigAsGelInstruction().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelInstructionObj retval = getOrigAsGelInstruction().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		IYCFGenKbGelInstructionObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelInstruction().getSchema()).getGelInstructionTableObj().createGelInstruction( getOrigAsGelInstruction() );
		if( retobj == getOrigAsGelInstruction() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelInstructionEditObj update() {
		getSchema().getGelInstructionTableObj().updateGelInstruction( (IYCFGenKbGelInstructionObj)this );
		return( null );
	}

	public YCFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelInstructionTableObj().deleteGelInstruction( getOrigAsGelInstruction() );
		return( null );
	}

	public IYCFGenKbGelInstructionTableObj getGelInstructionTable() {
		return( orig.getSchema().getGelInstructionTableObj() );
	}

	public IYCFGenKbGelInstructionEditObj getEdit() {
		return( (IYCFGenKbGelInstructionEditObj)this );
	}

	public IYCFGenKbGelInstructionEditObj getEditAsGelInstruction() {
		return( (IYCFGenKbGelInstructionEditObj)this );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbGelInstructionObj getOrig() {
		return( orig );
	}

	public IYCFGenKbGelInstructionObj getOrigAsGelInstruction() {
		return( (IYCFGenKbGelInstructionObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelInstruction().getSchema().getBackingStore()).getFactoryGelInstruction().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerGelCache = null;
			optionalLookupChainInst = null;
		}
	}

	public YCFGenKbGelInstructionBuff getGelInstructionBuff() {
		return( (YCFGenKbGelInstructionBuff)getBuff() );
	}

	public YCFGenKbGelInstructionPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbGelInstructionPKey value ) {
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

	public long getRequiredGelInstId() {
		return( getPKey().getRequiredGelInstId() );
	}

	public Long getOptionalChainInstTenantId() {
		return( getGelInstructionBuff().getOptionalChainInstTenantId() );
	}

	public Long getOptionalChainInstGelCacheId() {
		return( getGelInstructionBuff().getOptionalChainInstGelCacheId() );
	}

	public Long getOptionalChainInstGelInstId() {
		return( getGelInstructionBuff().getOptionalChainInstGelInstId() );
	}

	public String getRequiredSourceText() {
		return( getGelInstructionBuff().getRequiredSourceText() );
	}

	public void setRequiredSourceText( String value ) {
		if( getGelInstructionBuff().getRequiredSourceText() != value ) {
			getGelInstructionBuff().setRequiredSourceText( value );
		}
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTenantObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelInstruction().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFGenKbTenantObj value ) {
			if( buff == null ) {
				getGelInstructionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getGelInstructionBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFGenKbGelCacheObj getRequiredContainerGelCache() {
		return( getRequiredContainerGelCache( false ) );
	}

	public IYCFGenKbGelCacheObj getRequiredContainerGelCache( boolean forceRead ) {
		if( forceRead || ( requiredContainerGelCache == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbGelCacheObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelInstruction().getSchema()).getGelCacheTableObj().readGelCacheByIdIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId() );
				requiredContainerGelCache = obj;
				if( obj != null ) {
					getGelInstructionBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getGelInstructionBuff().setRequiredGelCacheId( obj.getRequiredGelCacheId() );
					requiredContainerGelCache = obj;
				}
			}
		}
		return( requiredContainerGelCache );
	}

	public void setRequiredContainerGelCache( IYCFGenKbGelCacheObj value ) {
			if( buff == null ) {
				getGelInstructionBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getGelInstructionBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getPKey().setRequiredGelCacheId( value.getRequiredGelCacheId() );
				getGelInstructionBuff().setRequiredGelCacheId( value.getRequiredGelCacheId() );
			}
			requiredContainerGelCache = value;
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupChainInst() {
		return( getOptionalLookupChainInst( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupChainInst( boolean forceRead ) {
		if( forceRead || ( optionalLookupChainInst == null ) ) {
			boolean anyMissing = false;
			if( getGelInstructionBuff().getOptionalChainInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelInstructionBuff().getOptionalChainInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelInstructionBuff().getOptionalChainInstGelInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbGelInstructionObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelInstruction().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelInstructionBuff().getOptionalChainInstTenantId(),
					getGelInstructionBuff().getOptionalChainInstGelCacheId(),
					getGelInstructionBuff().getOptionalChainInstGelInstId() );
				optionalLookupChainInst = obj;
			}
		}
		return( optionalLookupChainInst );
	}

	public void setOptionalLookupChainInst( IYCFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelInstructionBuff();
			}
			if( value != null ) {
				getGelInstructionBuff().setOptionalChainInstTenantId( value.getRequiredTenantId() );
				getGelInstructionBuff().setOptionalChainInstGelCacheId( value.getRequiredGelCacheId() );
				getGelInstructionBuff().setOptionalChainInstGelInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelInstructionBuff().setOptionalChainInstTenantId( null );
				getGelInstructionBuff().setOptionalChainInstGelCacheId( null );
				getGelInstructionBuff().setOptionalChainInstGelInstId( null );
			}
			optionalLookupChainInst = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
		buff.setRequiredGelInstId( getPKey().getRequiredGelInstId() );
	}

	public void copyBuffToPKey() {
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
		getPKey().setRequiredGelInstId( buff.getRequiredGelInstId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbGelInstructionBuff origBuff = getOrigAsGelInstruction().getGelInstructionBuff();
		YCFGenKbGelInstructionBuff myBuff = getGelInstructionBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelInstructionBuff origBuff = getOrigAsGelInstruction().getGelInstructionBuff();
		YCFGenKbGelInstructionBuff myBuff = getGelInstructionBuff();
		myBuff.set( origBuff );
	}

	public void linkChainInstruction( IYCFGenKbGelInstructionObj calledInstruction ) {
		throw new RuntimeException( "YCFGenKbGelInstructionEditObj.linkChainInstruction() You are not allowed to link an instruction during edits" );
	}

	public void addCalledInstruction( IYCFGenKbGelCacheObj gelCache, IYCFGenKbGelInstructionObj calledInstruction ) {
		throw new RuntimeException( "YCFGenKbGelInstructionEditObj.linkChainInstruction() You are not allowed to add an instruction during edits" );
	}

	public String expand( MssYCFGenContext genContext ) {
		throw new RuntimeException( "YCFGenKbGelInstructionEditObj.expand() You are not allowed to expand an object while it is being edited" );
	}
}

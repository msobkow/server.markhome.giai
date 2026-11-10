// Description: Java 11 base object instance implementation for YCFGenKb GelInstruction.

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

public class YCFGenKbGelInstructionObj
	implements IYCFGenKbGelInstructionObj
{
	public final static String CLASS_CODE = "a916";
	protected boolean isNew;
	protected IYCFGenKbGelInstructionEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbGelInstructionPKey pKey;
	protected YCFGenKbGelInstructionBuff buff;
	protected IYCFGenKbTenantObj requiredOwnerTenant;
	protected IYCFGenKbGelCacheObj requiredContainerGelCache;
	protected IYCFGenKbGelInstructionObj optionalLookupChainInst;

	public YCFGenKbGelInstructionObj() {
		getPKey().setClassCode( getClassCode() );
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public YCFGenKbGelInstructionObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		getPKey().setClassCode( getClassCode() );
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFGenKbGelInstructionObj retobj = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().realiseGelInstruction(
			(IYCFGenKbGelInstructionObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().reallyDeepDisposeGelInstruction( (IYCFGenKbGelInstructionObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelInstructionObj retobj = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelInstructionObj retobj = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionTableObj getGelInstructionTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId(),
						getPKey().getRequiredGelInstId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelInstructionBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelInstructionBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public YCFGenKbGelInstructionBuff getGelInstructionBuff() {
		return( (YCFGenKbGelInstructionBuff)getBuff() );
	}

	public YCFGenKbGelInstructionPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbGelInstructionPKey value ) {
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

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelInstructionObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelInstructionObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().lockGelInstruction( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbGelInstructionEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbGelInstructionEditObj getEditAsGelInstruction() {
		return( (IYCFGenKbGelInstructionEditObj)edit );
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

	public IYCFGenKbGelCacheObj getRequiredContainerGelCache() {
		return( getRequiredContainerGelCache( false ) );
	}

	public IYCFGenKbGelCacheObj getRequiredContainerGelCache( boolean forceRead ) {
		if( ( requiredContainerGelCache == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerGelCache = ((IYCFGenKbSchemaObj)schema).getGelCacheTableObj().readGelCacheByIdIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(), forceRead );
			}
		}
		return( requiredContainerGelCache );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupChainInst() {
		return( getOptionalLookupChainInst( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupChainInst( boolean forceRead ) {
		if( ( optionalLookupChainInst == null ) || forceRead ) {
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
				optionalLookupChainInst = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelInstructionBuff().getOptionalChainInstTenantId(),
					getGelInstructionBuff().getOptionalChainInstGelCacheId(),
					getGelInstructionBuff().getOptionalChainInstGelInstId(), forceRead );
			}
		}
		return( optionalLookupChainInst );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
			buff.setRequiredGelInstId( getPKey().getRequiredGelInstId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
		getPKey().setRequiredGelInstId( buff.getRequiredGelInstId() );
	}

	public void linkChainInstruction( IYCFGenKbGelInstructionObj calledInstruction ) {
		final String S_ProcName = "linkChainInstruction";
		final String S_ChainInstAlreadySet = "ChainInst lookup already set for instruction ";
		if( null != getOptionalLookupChainInst() ) {
			throw new YCFLibUsageException( getClass(), S_ProcName, S_ChainInstAlreadySet + getPKey().toString() );
		}
		IYCFGenKbGelInstructionEditObj editSelf = (IYCFGenKbGelInstructionEditObj)beginEdit();
		editSelf.setOptionalLookupChainInst( calledInstruction );
		editSelf.update();
		editSelf = null;
	}

	public void addCalledInstruction( IYCFGenKbGelCacheObj gelCache, IYCFGenKbGelInstructionObj calledInstruction ) {
		final String S_ProcName = "addCalledInstruction";
		final String S_ChainInstAlreadySet = "ChainInst lookup already set for instruction ";
		if( null != getOptionalLookupChainInst() ) {
			throw new YCFLibUsageException( getClass(), S_ProcName, S_ChainInstAlreadySet + getPKey().toString() );
		}
		IYCFGenKbGelInstructionEditObj editSelf = (IYCFGenKbGelInstructionEditObj)beginEdit();
		editSelf.setOptionalLookupChainInst( calledInstruction );
		editSelf.update();
		editSelf = null;
	}

	public String expand( MssYCFGenContext genContext ) {
		throw new RuntimeException( "YCFGenKbGelInstructionObj.expand() Must be overloaded by specializing instruction implementation" );
	}
}

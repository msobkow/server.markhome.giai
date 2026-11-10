// Description: Java 11 base object instance implementation for YCFGenKb GelPrefixLine.

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
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;

public class YCFGenKbGelPrefixLineObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelPrefixLineObj
{
	public final static String CLASS_CODE = "a91a";
	protected IYCFGenKbGelInstructionObj optionalLookupRemainder;

	public YCFGenKbGelPrefixLineObj() {
		super();
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelPrefixLineObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelPrefixLine" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
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

	public IYCFGenKbGelInstructionObj realise() {
		IYCFGenKbGelPrefixLineObj retobj = ((IYCFGenKbSchemaObj)schema).getGelPrefixLineTableObj().realiseGelPrefixLine(
			(IYCFGenKbGelPrefixLineObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelPrefixLineTableObj().reallyDeepDisposeGelPrefixLine( (IYCFGenKbGelPrefixLineObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelPrefixLineObj retobj = ((IYCFGenKbSchemaObj)schema).getGelPrefixLineTableObj().readGelPrefixLineByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelPrefixLineObj retobj = ((IYCFGenKbSchemaObj)schema).getGelPrefixLineTableObj().readGelPrefixLineByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelPrefixLineTableObj getGelPrefixLineTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelPrefixLineTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelPrefixLine().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelPrefixLine().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelPrefixLineBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelPrefixLineBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelPrefixLineBuff getGelPrefixLineBuff() {
		return( (YCFGenKbGelPrefixLineBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelPrefixLineObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelPrefixLineObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelPrefixLineTableObj().lockGelPrefixLine( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelPrefixLineTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelPrefixLineEditObj getEditAsGelPrefixLine() {
		return( (IYCFGenKbGelPrefixLineEditObj)edit );
	}

	public String getRequiredPrefixName() {
		return( getGelPrefixLineBuff().getRequiredPrefixName() );
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelPrefixLineBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelPrefixLineBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelPrefixLineBuff().getOptionalRemainderInstId() );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( ( optionalLookupRemainder == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelPrefixLineBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelPrefixLineBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupRemainder = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelPrefixLineBuff().getOptionalRemainderTenantId(),
					getGelPrefixLineBuff().getRequiredRemainderGelCacheId(),
					getGelPrefixLineBuff().getOptionalRemainderInstId(), forceRead );
			}
		}
		return( optionalLookupRemainder );
	}

	public String expand( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFGenKbGelPrefixLineObj.expand() ";

		String prefixName = getRequiredPrefixName();
		if( ( prefixName == null ) || ( prefixName.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "Required PrefixName was not specified" );
		}

		String prefixStrValue;
		IYCFGenKbGenItemObj prefixItem = genContext.getGenEngine().findContextItem(genContext, prefixName );
		if( prefixItem == null ) {
			throw new RuntimeException( S_ProcName + "Could not resolve prefix \"" + prefixName + "\", $" + getRequiredSourceText() + "$ is invalid" );
		}

		if( prefixItem instanceof MssYCFGenFileObj ) {
			prefixStrValue = ((MssYCFGenFileObj)prefixItem).expandBody( genContext );
		}
		else if( prefixItem instanceof MssYCFGenRuleObj ) {
			prefixStrValue = ((MssYCFGenRuleObj)prefixItem).expandBody( genContext );
		}
		else if (prefixItem instanceof MssYCFGenTruncObj)
		{
			prefixStrValue = ((MssYCFGenTruncObj)prefixItem).expandBody( genContext );
		}
		else if (prefixItem instanceof MssYCFGenBindObj)
		{
			prefixStrValue = ((MssYCFGenBindObj)prefixItem).expandBody( genContext );
		}
		else if( prefixItem instanceof MssYCFGenReferenceObj ) {
			throw new RuntimeException(S_ProcName + "Cannot expand reference " + prefixItem.getRequiredName() + " directly");
		}
		else if( prefixItem instanceof MssYCFGenIteratorObj ) {
			prefixStrValue = ((MssYCFGenIteratorObj)prefixItem).expandBody( genContext );
		}
		else {
			throw new RuntimeException( S_ProcName +  "Unsupported generation item class" );
		}

		if( prefixStrValue == null ) {
			prefixStrValue = "$" + prefixName + "$";
		}

		IYCFGenKbGelInstructionObj remainder = getOptionalLookupRemainder();
		if( remainder == null ) {
			throw new RuntimeException( S_ProcName + "Remainder of macro was not properly compiled" );
		}

		String body = remainder.expand( genContext );
		if (body == null) {
			body = "$" + remainder.getRequiredSourceText() + "$";
		}

		String retval = prefixStrValue + body.replace("\n", "\n" + prefixStrValue );

		return( retval );
	}
}

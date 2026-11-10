// Description: Java 11 base object instance implementation for YCFGenKb GelExpansion.

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

public class YCFGenKbGelExpansionObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelExpansionObj
{
	public final static String CLASS_CODE = "a92f";

	public YCFGenKbGelExpansionObj() {
		super();
	}

	public YCFGenKbGelExpansionObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelExpansion" );
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
		IYCFGenKbGelExpansionObj retobj = ((IYCFGenKbSchemaObj)schema).getGelExpansionTableObj().realiseGelExpansion(
			(IYCFGenKbGelExpansionObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelExpansionTableObj().reallyDeepDisposeGelExpansion( (IYCFGenKbGelExpansionObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelExpansionObj retobj = ((IYCFGenKbSchemaObj)schema).getGelExpansionTableObj().readGelExpansionByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelExpansionObj retobj = ((IYCFGenKbSchemaObj)schema).getGelExpansionTableObj().readGelExpansionByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelExpansionTableObj getGelExpansionTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelExpansionTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExpansion().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExpansion().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelExpansionBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelExpansionBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public YCFGenKbGelExpansionBuff getGelExpansionBuff() {
		return( (YCFGenKbGelExpansionBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelExpansionObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelExpansionObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelExpansionTableObj().lockGelExpansion( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelExpansionTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelExpansionEditObj getEditAsGelExpansion() {
		return( (IYCFGenKbGelExpansionEditObj)edit );
	}

	public String getRequiredMacroName() {
		return( getGelExpansionBuff().getRequiredMacroName() );
	}

	public String expand( MssYCFGenContext genContext ) {
		String retval;
		final String S_ProcName = "YCFGenKbGelExpansion.expand() ";
		IYCFGenKbGenItemObj genItem = genContext.getGenEngine().findContextItem(genContext, getRequiredMacroName() );
		if( genItem != null ) {
			if( genItem instanceof MssYCFGenFileObj ) {
				retval = ((MssYCFGenFileObj)genItem).expandBody( genContext );
			}
			else if( genItem instanceof MssYCFGenRuleObj ) {
				retval = ((MssYCFGenRuleObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenTruncObj)
			{
				retval = ((MssYCFGenTruncObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenBindObj)
			{
				retval = ((MssYCFGenBindObj)genItem).expandBody( genContext );
			}
			else if( genItem instanceof MssYCFGenReferenceObj ) {
				throw new RuntimeException(S_ProcName + "Cannot expand reference " + genItem.getRequiredName() + " directly");
			}
			else if( genItem instanceof MssYCFGenIteratorObj ) {
				retval = ((MssYCFGenIteratorObj)genItem).expandBody( genContext );
			}
			else {
				throw new RuntimeException( S_ProcName +  "Unsupported generation item class" );
			}
		}
		else {
			retval = "$" + getRequiredMacroName() + "$";
		}
		return( retval );
	}
}

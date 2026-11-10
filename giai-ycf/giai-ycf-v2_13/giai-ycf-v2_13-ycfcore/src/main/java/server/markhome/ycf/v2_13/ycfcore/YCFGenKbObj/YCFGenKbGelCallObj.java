// Description: Java 11 base object instance implementation for YCFGenKb GelCall.

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

public class YCFGenKbGelCallObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelCallObj
{
	public final static String CLASS_CODE = "a91c";
	protected IYCFGenKbGelSequenceObj optionalParentSeqInst;
	protected IYCFGenKbGelInstructionObj optionalLookupCallInst;
	protected IYCFGenKbGelCallObj optionalLookupPrevInst;
	protected IYCFGenKbGelCallObj optionalLookupNextInst;

	public YCFGenKbGelCallObj() {
		super();
		optionalParentSeqInst = null;
		optionalLookupCallInst = null;
		optionalLookupPrevInst = null;
		optionalLookupNextInst = null;
	}

	public YCFGenKbGelCallObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalParentSeqInst = null;
		optionalLookupCallInst = null;
		optionalLookupPrevInst = null;
		optionalLookupNextInst = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelCall" );
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
		IYCFGenKbGelCallObj retobj = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().realiseGelCall(
			(IYCFGenKbGelCallObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelCallTableObj().reallyDeepDisposeGelCall( (IYCFGenKbGelCallObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelCallObj retobj = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelCallObj retobj = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelCallTableObj getGelCallTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelCallTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelCallBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelCallBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalParentSeqInst = null;
		optionalLookupCallInst = null;
		optionalLookupPrevInst = null;
		optionalLookupNextInst = null;
	}

	public YCFGenKbGelCallBuff getGelCallBuff() {
		return( (YCFGenKbGelCallBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelCallObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelCallObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().lockGelCall( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelCallEditObj getEditAsGelCall() {
		return( (IYCFGenKbGelCallEditObj)edit );
	}

	public Long getOptionalSeqInstTenantId() {
		return( getGelCallBuff().getOptionalSeqInstTenantId() );
	}

	public Long getOptionalSeqInstGelCacheId() {
		return( getGelCallBuff().getOptionalSeqInstGelCacheId() );
	}

	public Long getOptionalSeqInstId() {
		return( getGelCallBuff().getOptionalSeqInstId() );
	}

	public Long getOptionalCallInstTenantId() {
		return( getGelCallBuff().getOptionalCallInstTenantId() );
	}

	public Long getOptionalCallInstGelCacheId() {
		return( getGelCallBuff().getOptionalCallInstGelCacheId() );
	}

	public Long getOptionalCallInstId() {
		return( getGelCallBuff().getOptionalCallInstId() );
	}

	public Long getOptionalPrevInstTenantId() {
		return( getGelCallBuff().getOptionalPrevInstTenantId() );
	}

	public Long getOptionalPrevInstGelCacheId() {
		return( getGelCallBuff().getOptionalPrevInstGelCacheId() );
	}

	public Long getOptionalPrevInstGelInstId() {
		return( getGelCallBuff().getOptionalPrevInstGelInstId() );
	}

	public Long getOptionalNextInstTenantId() {
		return( getGelCallBuff().getOptionalNextInstTenantId() );
	}

	public Long getOptionalNextInstGelCacheId() {
		return( getGelCallBuff().getOptionalNextInstGelCacheId() );
	}

	public Long getOptionalNextInstGelInstId() {
		return( getGelCallBuff().getOptionalNextInstGelInstId() );
	}

	public IYCFGenKbGelSequenceObj getOptionalParentSeqInst() {
		return( getOptionalParentSeqInst( false ) );
	}

	public IYCFGenKbGelSequenceObj getOptionalParentSeqInst( boolean forceRead ) {
		if( ( optionalParentSeqInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalSeqInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalSeqInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalSeqInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalParentSeqInst = ((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj().readGelSequenceByPIdx( getGelCallBuff().getOptionalSeqInstTenantId(),
					getGelCallBuff().getOptionalSeqInstGelCacheId(),
					getGelCallBuff().getOptionalSeqInstId(), forceRead );
			}
		}
		return( optionalParentSeqInst );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupCallInst() {
		return( getOptionalLookupCallInst( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupCallInst( boolean forceRead ) {
		if( ( optionalLookupCallInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalCallInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalCallInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalCallInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupCallInst = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelCallBuff().getOptionalCallInstTenantId(),
					getGelCallBuff().getOptionalCallInstGelCacheId(),
					getGelCallBuff().getOptionalCallInstId(), forceRead );
			}
		}
		return( optionalLookupCallInst );
	}

	public IYCFGenKbGelCallObj getOptionalLookupPrevInst() {
		return( getOptionalLookupPrevInst( false ) );
	}

	public IYCFGenKbGelCallObj getOptionalLookupPrevInst( boolean forceRead ) {
		if( ( optionalLookupPrevInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalPrevInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalPrevInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalPrevInstGelInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrevInst = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getGelCallBuff().getOptionalPrevInstTenantId(),
					getGelCallBuff().getOptionalPrevInstGelCacheId(),
					getGelCallBuff().getOptionalPrevInstGelInstId(), forceRead );
			}
		}
		return( optionalLookupPrevInst );
	}

	public IYCFGenKbGelCallObj getOptionalLookupNextInst() {
		return( getOptionalLookupNextInst( false ) );
	}

	public IYCFGenKbGelCallObj getOptionalLookupNextInst( boolean forceRead ) {
		if( ( optionalLookupNextInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalNextInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalNextInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalNextInstGelInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNextInst = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getGelCallBuff().getOptionalNextInstTenantId(),
					getGelCallBuff().getOptionalNextInstGelCacheId(),
					getGelCallBuff().getOptionalNextInstGelInstId(), forceRead );
			}
		}
		return( optionalLookupNextInst );
	}

	public String expand( MssYCFGenContext genContext ) {
		final String S_ProcName = "expand";
		final String S_GenContext = "genContext";

		if( genContext == null ) {
			throw new YCFLibNullArgumentException( getClass(), S_ProcName, 1, S_GenContext );
		}

		String subExpansion;

		IYCFGenKbGelInstructionObj called = getOptionalLookupCallInst();
		if( called != null ) {
			subExpansion = called.expand( genContext );
			if( subExpansion == null ) {
				subExpansion = "$" + called.getRequiredSourceText() + "$";
			}
		}
		else {
			subExpansion = "$" + getRequiredSourceText() + "$";
		}

		return( subExpansion );
	}
}

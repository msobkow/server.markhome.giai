// Description: Java 11 base object instance implementation for YCFGenKb GelSequence.

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

public class YCFGenKbGelSequenceObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelSequenceObj
{
	public final static String CLASS_CODE = "a91d";
	protected IYCFGenKbGelCallObj optionalLookupFirstInst;
	protected IYCFGenKbGelCallObj optionalLookupLastInst;

	public YCFGenKbGelSequenceObj() {
		super();
		optionalLookupFirstInst = null;
		optionalLookupLastInst = null;
	}

	public YCFGenKbGelSequenceObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupFirstInst = null;
		optionalLookupLastInst = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSequence" );
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
		IYCFGenKbGelSequenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj().realiseGelSequence(
			(IYCFGenKbGelSequenceObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj().reallyDeepDisposeGelSequence( (IYCFGenKbGelSequenceObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelSequenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj().readGelSequenceByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelSequenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj().readGelSequenceByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelSequenceTableObj getGelSequenceTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSequence().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSequence().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelSequenceBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelSequenceBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupFirstInst = null;
		optionalLookupLastInst = null;
	}

	public YCFGenKbGelSequenceBuff getGelSequenceBuff() {
		return( (YCFGenKbGelSequenceBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelSequenceObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelSequenceObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj().lockGelSequence( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelSequenceTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelSequenceEditObj getEditAsGelSequence() {
		return( (IYCFGenKbGelSequenceEditObj)edit );
	}

	public Long getOptionalFirstInstTenantId() {
		return( getGelSequenceBuff().getOptionalFirstInstTenantId() );
	}

	public Long getOptionalFirstInstGelCacheId() {
		return( getGelSequenceBuff().getOptionalFirstInstGelCacheId() );
	}

	public Long getOptionalFirstInstId() {
		return( getGelSequenceBuff().getOptionalFirstInstId() );
	}

	public Long getOptionalLastInstTenantId() {
		return( getGelSequenceBuff().getOptionalLastInstTenantId() );
	}

	public Long getOptionalLastInstGelCacheId() {
		return( getGelSequenceBuff().getOptionalLastInstGelCacheId() );
	}

	public Long getOptionalLastInstId() {
		return( getGelSequenceBuff().getOptionalLastInstId() );
	}

	public List<IYCFGenKbGelCallObj> getOptionalChildrenCalls() {
		List<IYCFGenKbGelCallObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallBySeqIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbGelCallObj> getOptionalChildrenCalls( boolean forceRead ) {
		List<IYCFGenKbGelCallObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallBySeqIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			forceRead );
		return( retval );
	}

	public IYCFGenKbGelCallObj getOptionalLookupFirstInst() {
		return( getOptionalLookupFirstInst( false ) );
	}

	public IYCFGenKbGelCallObj getOptionalLookupFirstInst( boolean forceRead ) {
		if( ( optionalLookupFirstInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelSequenceBuff().getOptionalFirstInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalFirstInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalFirstInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupFirstInst = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getGelSequenceBuff().getOptionalFirstInstTenantId(),
					getGelSequenceBuff().getOptionalFirstInstGelCacheId(),
					getGelSequenceBuff().getOptionalFirstInstId(), forceRead );
			}
		}
		return( optionalLookupFirstInst );
	}

	public IYCFGenKbGelCallObj getOptionalLookupLastInst() {
		return( getOptionalLookupLastInst( false ) );
	}

	public IYCFGenKbGelCallObj getOptionalLookupLastInst( boolean forceRead ) {
		if( ( optionalLookupLastInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelSequenceBuff().getOptionalLastInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalLastInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalLastInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupLastInst = ((IYCFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getGelSequenceBuff().getOptionalLastInstTenantId(),
					getGelSequenceBuff().getOptionalLastInstGelCacheId(),
					getGelSequenceBuff().getOptionalLastInstId(), forceRead );
			}
		}
		return( optionalLookupLastInst );
	}

	public void addCalledInstruction( IYCFGenKbGelCacheObj gelCache, IYCFGenKbGelInstructionObj calledInstruction ) {
		IYCFGenKbGelCallObj newCallObj = schema.getGelCallTableObj().newInstance();
		IYCFGenKbGelCallEditObj editNewCall = (IYCFGenKbGelCallEditObj)( newCallObj.beginEdit() );
		editNewCall.setRequiredOwnerTenant( getRequiredOwnerTenant() );
		editNewCall.setRequiredContainerGelCache( getRequiredContainerGelCache() );
		editNewCall.setOptionalParentSeqInst( this );
		editNewCall.setOptionalLookupCallInst( calledInstruction );
		editNewCall.setOptionalLookupNextInst( null );
		IYCFGenKbGelCallObj lastObj = getOptionalLookupLastInst();
		editNewCall.setOptionalLookupPrevInst( lastObj );
		newCallObj = (IYCFGenKbGelCallObj)( editNewCall.create() );
		editNewCall = null;
		IYCFGenKbGelSequenceEditObj editMe = (IYCFGenKbGelSequenceEditObj)beginEdit();
		if( lastObj != null ) {
			IYCFGenKbGelCallEditObj editLast = (IYCFGenKbGelCallEditObj)( lastObj.beginEdit() );
			editLast.setOptionalLookupNextInst( newCallObj );
			editLast.update();
			editLast = null;
		}
		else {
			editMe.setOptionalLookupFirstInst( newCallObj );
		}
		editMe.setOptionalLookupLastInst( newCallObj );
		editMe.update();
		editMe = null;
	}

	public String expand( MssYCFGenContext genContext ) {
		final String S_ProcName = "expand";
		final String S_GenContext = "genContext";

		if( genContext == null ) {
			throw new YCFLibNullArgumentException( getClass(), S_ProcName, 1, S_GenContext );
		}

		StringBuffer expansion = new StringBuffer();
		String subExpansion;

		// Preload the instructions to avoid a read storm
		genContext.getGenEngine().getGelCallTableObj().readGelCallBySeqIdx( getRequiredTenantId(), getRequiredGelCacheId(), getRequiredGelInstId() );

		IYCFGenKbGelInstructionObj nextCalled;
		IYCFGenKbGelCallObj nextCall = getOptionalLookupFirstInst();
		while( nextCall != null ) {
			nextCalled = nextCall.getOptionalLookupCallInst();
			if( nextCalled != null ) {
				subExpansion = nextCalled.expand( genContext );
				if( subExpansion == null ) {
					subExpansion = "$" + nextCalled.getRequiredSourceText() + "$";
				}
				expansion.append( subExpansion );
			}
			nextCall = nextCall.getOptionalLookupNextInst();
		}

		return( expansion.toString() );
	}
}

// Description: Java 11 base object instance implementation for YCFGenKb GelExecutable.

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

public class YCFGenKbGelExecutableObj
	extends YCFGenKbGelSequenceObj
	implements IYCFGenKbGelExecutableObj
{
	public final static String CLASS_CODE = "a92e";

	public YCFGenKbGelExecutableObj() {
		super();
	}

	public YCFGenKbGelExecutableObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelExecutable" );
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
		IYCFGenKbGelExecutableObj retobj = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().realiseGelExecutable(
			(IYCFGenKbGelExecutableObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().reallyDeepDisposeGelExecutable( (IYCFGenKbGelExecutableObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelExecutableObj retobj = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelExecutableObj retobj = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelExecutableTableObj getGelExecutableTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelExecutableBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelExecutableBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupFirstInst = null;
		optionalLookupLastInst = null;
	}

	public YCFGenKbGelExecutableBuff getGelExecutableBuff() {
		return( (YCFGenKbGelExecutableBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelExecutableObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelExecutableObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().lockGelExecutable( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelExecutableEditObj getEditAsGelExecutable() {
		return( (IYCFGenKbGelExecutableEditObj)edit );
	}

	public long getRequiredGenItemId() {
		return( getGelExecutableBuff().getRequiredGenItemId() );
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

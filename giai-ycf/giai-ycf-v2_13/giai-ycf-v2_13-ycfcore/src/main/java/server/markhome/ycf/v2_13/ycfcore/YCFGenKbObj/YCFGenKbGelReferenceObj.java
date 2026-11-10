// Description: Java 11 base object instance implementation for YCFGenKb GelReference.

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

public class YCFGenKbGelReferenceObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelReferenceObj
{
	public final static String CLASS_CODE = "a91b";
	protected IYCFGenKbGelInstructionObj optionalLookupRemainder;

	public YCFGenKbGelReferenceObj() {
		super();
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelReferenceObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelReference" );
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
		IYCFGenKbGelReferenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGelReferenceTableObj().realiseGelReference(
			(IYCFGenKbGelReferenceObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelReferenceTableObj().reallyDeepDisposeGelReference( (IYCFGenKbGelReferenceObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelReferenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGelReferenceTableObj().readGelReferenceByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelReferenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGelReferenceTableObj().readGelReferenceByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelReferenceTableObj getGelReferenceTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelReferenceTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelReference().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelReference().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelReferenceBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelReferenceBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupRemainder = null;
	}

	public YCFGenKbGelReferenceBuff getGelReferenceBuff() {
		return( (YCFGenKbGelReferenceBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelReferenceObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelReferenceObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelReferenceTableObj().lockGelReference( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelReferenceTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelReferenceEditObj getEditAsGelReference() {
		return( (IYCFGenKbGelReferenceEditObj)edit );
	}

	public String getRequiredReferenceName() {
		return( getGelReferenceBuff().getRequiredReferenceName() );
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelReferenceBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelReferenceBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelReferenceBuff().getOptionalRemainderInstId() );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public IYCFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( ( optionalLookupRemainder == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelReferenceBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelReferenceBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupRemainder = ((IYCFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelReferenceBuff().getOptionalRemainderTenantId(),
					getGelReferenceBuff().getRequiredRemainderGelCacheId(),
					getGelReferenceBuff().getOptionalRemainderInstId(), forceRead );
			}
		}
		return( optionalLookupRemainder );
	}

	public String expand( MssYCFGenContext genContext ) {
		String retval;
		final String S_ProcName = "YCFGenKbGelReference.expand() ";
		String referenceName = getRequiredReferenceName();

		String generatingBuild = genContext.getGeneratingBuild();

		IYCFGenKbGenItemObj genItem = genContext.getGenEngine().findContextItem(genContext, referenceName );
		if( genItem == null ) {
			genContext.getGenEngine().getLog().message( "Could not resolve reference method \""
				+ referenceName
				+ "\". \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		if( ! ( genItem instanceof MssYCFGenReferenceObj ) ) {
			genContext.getGenEngine().getLog().message( "Resolution of reference method \""
				+ referenceName
				+ "\" returned a "
				+ genItem.getClass().getPackage().getName() + "." + genItem.getClass().getSimpleName()
				+ ", not a MssYCFGenReferenceObj. \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		MssYCFGenReferenceObj reference = (MssYCFGenReferenceObj)genItem;

		IYCFLibAnyObj refDef = reference.dereference( genContext );
		if( refDef == null ) {
			genContext.getGenEngine().getLog().message( "Resolution of reference \""
				+ referenceName
				+ "\" returned null. \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		MssYCFGenContext refContext = genContext.buildRefContext( generatingBuild, refDef );
		if( refContext == null ) {
			throw new RuntimeException( S_ProcName +  "buildRefContext() failed" );
		}

		IYCFGenKbGelInstructionObj remainder = getOptionalLookupRemainder();

		String expansion;
		if( remainder == null ) {
			expansion = "";
		}
		else {
			expansion = remainder.expand( refContext );
		}

		return( expansion );
	}
}

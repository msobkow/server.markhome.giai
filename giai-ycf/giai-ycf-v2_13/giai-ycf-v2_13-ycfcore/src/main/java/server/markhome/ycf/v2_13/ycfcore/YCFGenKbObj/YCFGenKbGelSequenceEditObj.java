// Description: Java 11 edit object instance implementation for YCFGenKb GelSequence.

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

public class YCFGenKbGelSequenceEditObj
	extends YCFGenKbGelInstructionEditObj

	implements IYCFGenKbGelSequenceEditObj
{
	protected IYCFGenKbGelCallObj optionalLookupFirstInst;
	protected IYCFGenKbGelCallObj optionalLookupLastInst;

	public YCFGenKbGelSequenceEditObj( IYCFGenKbGelSequenceObj argOrig ) {
		super( argOrig );
		optionalLookupFirstInst = null;
		optionalLookupLastInst = null;
	}

	public String getClassCode() {
		return( YCFGenKbGelSequenceObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbGelSequenceObj retobj = getSchema().getGelSequenceTableObj().realiseGelSequence( (IYCFGenKbGelSequenceObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelSequence().forget();
	}

	public IYCFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		IYCFGenKbGelSequenceObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelSequenceTableObj().createGelSequence( getOrigAsGelSequence() );
		if( retobj == getOrigAsGelSequence() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelInstructionEditObj update() {
		getSchema().getGelSequenceTableObj().updateGelSequence( (IYCFGenKbGelSequenceObj)this );
		return( null );
	}

	public YCFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelSequenceTableObj().deleteGelSequence( getOrigAsGelSequence() );
		return( null );
	}

	public IYCFGenKbGelSequenceTableObj getGelSequenceTable() {
		return( orig.getSchema().getGelSequenceTableObj() );
	}

	public IYCFGenKbGelSequenceEditObj getEditAsGelSequence() {
		return( (IYCFGenKbGelSequenceEditObj)this );
	}

	public IYCFGenKbGelSequenceObj getOrigAsGelSequence() {
		return( (IYCFGenKbGelSequenceObj)orig );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelSequence().getSchema().getBackingStore()).getFactoryGelSequence().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupFirstInst = null;
			optionalLookupLastInst = null;
		}
	}

	public YCFGenKbGelSequenceBuff getGelSequenceBuff() {
		return( (YCFGenKbGelSequenceBuff)getBuff() );
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
		retval = ((IYCFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallBySeqIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbGelCallObj> getOptionalChildrenCalls( boolean forceRead ) {
		List<IYCFGenKbGelCallObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallBySeqIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			forceRead );
		return( retval );
	}

	public IYCFGenKbGelCallObj getOptionalLookupFirstInst() {
		return( getOptionalLookupFirstInst( false ) );
	}

	public IYCFGenKbGelCallObj getOptionalLookupFirstInst( boolean forceRead ) {
		if( forceRead || ( optionalLookupFirstInst == null ) ) {
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
				IYCFGenKbGelCallObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallByPIdx( getGelSequenceBuff().getOptionalFirstInstTenantId(),
					getGelSequenceBuff().getOptionalFirstInstGelCacheId(),
					getGelSequenceBuff().getOptionalFirstInstId() );
				optionalLookupFirstInst = obj;
			}
		}
		return( optionalLookupFirstInst );
	}

	public void setOptionalLookupFirstInst( IYCFGenKbGelCallObj value ) {
			if( buff == null ) {
				getGelSequenceBuff();
			}
			if( value != null ) {
				getGelSequenceBuff().setOptionalFirstInstTenantId( value.getRequiredTenantId() );
				getGelSequenceBuff().setOptionalFirstInstGelCacheId( value.getRequiredGelCacheId() );
				getGelSequenceBuff().setOptionalFirstInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelSequenceBuff().setOptionalFirstInstTenantId( null );
				getGelSequenceBuff().setOptionalFirstInstGelCacheId( null );
				getGelSequenceBuff().setOptionalFirstInstId( null );
			}
			optionalLookupFirstInst = value;
	}

	public IYCFGenKbGelCallObj getOptionalLookupLastInst() {
		return( getOptionalLookupLastInst( false ) );
	}

	public IYCFGenKbGelCallObj getOptionalLookupLastInst( boolean forceRead ) {
		if( forceRead || ( optionalLookupLastInst == null ) ) {
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
				IYCFGenKbGelCallObj obj = ((IYCFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallByPIdx( getGelSequenceBuff().getOptionalLastInstTenantId(),
					getGelSequenceBuff().getOptionalLastInstGelCacheId(),
					getGelSequenceBuff().getOptionalLastInstId() );
				optionalLookupLastInst = obj;
			}
		}
		return( optionalLookupLastInst );
	}

	public void setOptionalLookupLastInst( IYCFGenKbGelCallObj value ) {
			if( buff == null ) {
				getGelSequenceBuff();
			}
			if( value != null ) {
				getGelSequenceBuff().setOptionalLastInstTenantId( value.getRequiredTenantId() );
				getGelSequenceBuff().setOptionalLastInstGelCacheId( value.getRequiredGelCacheId() );
				getGelSequenceBuff().setOptionalLastInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelSequenceBuff().setOptionalLastInstTenantId( null );
				getGelSequenceBuff().setOptionalLastInstGelCacheId( null );
				getGelSequenceBuff().setOptionalLastInstId( null );
			}
			optionalLookupLastInst = value;
	}

	public void copyBuffToOrig() {
		YCFGenKbGelSequenceBuff origBuff = getOrigAsGelSequence().getGelSequenceBuff();
		YCFGenKbGelSequenceBuff myBuff = getGelSequenceBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelSequenceBuff origBuff = getOrigAsGelSequence().getGelSequenceBuff();
		YCFGenKbGelSequenceBuff myBuff = getGelSequenceBuff();
		myBuff.set( origBuff );
	}
}

// Description: Java 11 base object instance implementation for YCFGenKb GelSwitch.

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

public class YCFGenKbGelSwitchObj
	extends YCFGenKbGelInstructionObj
	implements IYCFGenKbGelSwitchObj
{
	public final static String CLASS_CODE = "a91e";

	public YCFGenKbGelSwitchObj() {
		super();
	}

	public YCFGenKbGelSwitchObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSwitch" );
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
		IYCFGenKbGelSwitchObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj().realiseGelSwitch(
			(IYCFGenKbGelSwitchObj)this );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj().reallyDeepDisposeGelSwitch( (IYCFGenKbGelSwitchObj)this );
	}

	public IYCFGenKbGelInstructionObj read() {
		IYCFGenKbGelSwitchObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj().readGelSwitchByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelInstructionObj read( boolean forceRead ) {
		IYCFGenKbGelSwitchObj retobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj().readGelSwitchByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (IYCFGenKbGelInstructionObj)retobj );
	}

	public IYCFGenKbGelSwitchTableObj getGelSwitchTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj() );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitch().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelSwitch().readDerivedByPIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGelSwitchBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGelSwitchBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public YCFGenKbGelSwitchBuff getGelSwitchBuff() {
		return( (YCFGenKbGelSwitchBuff)getBuff() );
	}

	public IYCFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGelSwitchObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGelSwitchObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj().lockGelSwitch( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGelSwitchTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGelInstructionEditObj)edit );
	}

	public IYCFGenKbGelSwitchEditObj getEditAsGelSwitch() {
		return( (IYCFGenKbGelSwitchEditObj)edit );
	}

	public String getRequiredValueExpansion() {
		return( getGelSwitchBuff().getRequiredValueExpansion() );
	}

	public String getOptionalNilExpansion() {
		return( getGelSwitchBuff().getOptionalNilExpansion() );
	}

	public String getOptionalEmptyExpansion() {
		return( getGelSwitchBuff().getOptionalEmptyExpansion() );
	}

	public String getRequiredDefaultExpansion() {
		return( getGelSwitchBuff().getRequiredDefaultExpansion() );
	}

	public List<IYCFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb() {
		List<IYCFGenKbGelSwitchLimbObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().readGelSwitchLimbBySwitchIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb( boolean forceRead ) {
		List<IYCFGenKbGelSwitchLimbObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().readGelSwitchLimbBySwitchIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			forceRead );
		return( retval );
	}

	public String expand( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFGenKbGelSwitchObj.expand() ";

		String valueExpansion = getRequiredValueExpansion();
		if( ( valueExpansion == null ) || ( valueExpansion.length() == 0 ) ) {
			throw new RuntimeException( S_ProcName + "ValueExpansion was not properly set" );
		}

		IYCFGenKbGenItemObj valueItem = genContext.getGenEngine().findContextItem(genContext, valueExpansion );
		if( valueItem == null ) {
			throw new RuntimeException( S_ProcName + "Could not resolve Value expansion \"" + valueExpansion + "\"" );
		}

		String valueStrValue;
		if( valueItem instanceof MssYCFGenFileObj ) {
			valueStrValue = ((MssYCFGenFileObj)valueItem).expandBody( genContext );
		}
		else if( valueItem instanceof MssYCFGenRuleObj ) {
			valueStrValue = ((MssYCFGenRuleObj)valueItem).expandBody( genContext );
		}
		else if (valueItem instanceof MssYCFGenTruncObj) {
			valueStrValue = ((MssYCFGenTruncObj)valueItem).expandBody( genContext );
		}
		else if (valueItem instanceof MssYCFGenBindObj) {
			valueStrValue = ((MssYCFGenBindObj)valueItem).expandBody( genContext );
		}
		else if( valueItem instanceof MssYCFGenReferenceObj ) {
			throw new RuntimeException(S_ProcName + "Cannot expand reference " + valueItem.getRequiredName() + " directly");
		}
		else if( valueItem instanceof MssYCFGenIteratorObj ) {
			valueStrValue = ((MssYCFGenIteratorObj)valueItem).expandBody( genContext );
		}
		else {
			throw new RuntimeException( S_ProcName +  "Unsupported generation item class" );
		}

		//	If null was returned, invoke either the nil or default macro
		//	and return the result

		String retval;
		if( valueStrValue == null ) {

			String effectiveExpansion = getOptionalNilExpansion();
			if( ( effectiveExpansion == null ) || ( effectiveExpansion.length() == 0 ) ) {
				effectiveExpansion = getRequiredDefaultExpansion();
				if( ( effectiveExpansion == null ) || ( effectiveExpansion.length() == 0 ) ) {
					throw new RuntimeException( S_ProcName + "Neither NilExpansion nor DefaultExpansion were compiled properly" );
				}
			}

			IYCFGenKbGenItemObj genItem = genContext.getGenEngine().findContextItem(genContext, effectiveExpansion );
			if( genItem == null ) {
				throw new RuntimeException( S_ProcName + "Could not resolve expansion \"" + effectiveExpansion + "\"" );
			}

			if( genItem instanceof MssYCFGenFileObj ) {
				retval = ((MssYCFGenFileObj)genItem).expandBody( genContext );
			}
			else if( genItem instanceof MssYCFGenRuleObj ) {
				retval = ((MssYCFGenRuleObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenTruncObj) {
				retval = ((MssYCFGenTruncObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenBindObj) {
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
		else if( valueStrValue.length() == 0 ) {

			String effectiveExpansion = getOptionalEmptyExpansion();
			if( ( effectiveExpansion == null ) || ( effectiveExpansion.length() == 0 ) ) {
				effectiveExpansion = getRequiredDefaultExpansion();
				if( ( effectiveExpansion == null ) || ( effectiveExpansion.length() == 0 ) ) {
					throw new RuntimeException( S_ProcName + "Neither EmptyExpansion nor DefaultExpansion were compiled properly" );
				}
			}

			IYCFGenKbGenItemObj genItem = genContext.getGenEngine().findContextItem(genContext, effectiveExpansion );
			if( genItem == null ) {
				throw new RuntimeException( S_ProcName + "Could not resolve expansion \"" + effectiveExpansion + "\"" );
			}

			if( genItem instanceof MssYCFGenFileObj ) {
				retval = ((MssYCFGenFileObj)genItem).expandBody( genContext );
			}
			else if( genItem instanceof MssYCFGenRuleObj ) {
				retval = ((MssYCFGenRuleObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenTruncObj) {
				retval = ((MssYCFGenTruncObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenBindObj) {
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
			String effectiveExpansion;
			IYCFGenKbGelSwitchLimbObj switchLimb = genContext.getGenEngine().getGelSwitchLimbTableObj().readGelSwitchLimbByPIdx( getRequiredTenantId(), getRequiredGelCacheId(), getRequiredGelInstId(), valueStrValue );
			if( switchLimb != null ) {
				effectiveExpansion = switchLimb.getRequiredLimbExpansion();
				if( ( effectiveExpansion == null ) || ( effectiveExpansion.length() == 0 ) ) {
					throw new RuntimeException( S_ProcName + "Switch limb for " + valueStrValue + " nas a null or empty LimbExpansion" );
				}
			}
			else {
				effectiveExpansion = getRequiredDefaultExpansion();
				if( ( effectiveExpansion == null ) || ( effectiveExpansion.length() == 0 ) ) {
					throw new RuntimeException( S_ProcName + "Switch nas a null or empty DefaultExpansion" );
				}
			}

			IYCFGenKbGenItemObj genItem = genContext.getGenEngine().findContextItem(genContext, effectiveExpansion );
			if( genItem == null ) {
				throw new RuntimeException( S_ProcName + "Could not resolve expansion \"" + effectiveExpansion + "\"" );
			}

			if( genItem instanceof MssYCFGenFileObj ) {
				retval = ((MssYCFGenFileObj)genItem).expandBody( genContext );
			}
			else if( genItem instanceof MssYCFGenRuleObj ) {
				retval = ((MssYCFGenRuleObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenTruncObj) {
				retval = ((MssYCFGenTruncObj)genItem).expandBody( genContext );
			}
			else if (genItem instanceof MssYCFGenBindObj) {
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

		if( retval == null ) {
			retval = "$" + getRequiredSourceText() + "$";
		}

		return( retval );
	}
}

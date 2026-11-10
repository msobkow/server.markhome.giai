// Description: Java 11 base object instance implementation for YCFGenKb GenRule.

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
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGelCompiler;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.MssYCFGenContext;

public class YCFGenKbGenRuleObj
	extends YCFGenKbGenItemObj
	implements IYCFGenKbGenRuleObj
{
	public final static String CLASS_CODE = "a923";
	protected IYCFGenKbGelExecutableObj optionalComponentsBodyGel;

	public YCFGenKbGenRuleObj() {
		super();
	}

	public YCFGenKbGenRuleObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenRule" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
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

	public IYCFGenKbGenItemObj realise() {
		IYCFGenKbGenRuleObj retobj = ((IYCFGenKbSchemaObj)schema).getGenRuleTableObj().realiseGenRule(
			(IYCFGenKbGenRuleObj)this );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGenRuleTableObj().reallyDeepDisposeGenRule( (IYCFGenKbGenRuleObj)this );
	}

	public IYCFGenKbGenItemObj read() {
		IYCFGenKbGenRuleObj retobj = ((IYCFGenKbSchemaObj)schema).getGenRuleTableObj().readGenRuleByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), false );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenItemObj read( boolean forceRead ) {
		IYCFGenKbGenRuleObj retobj = ((IYCFGenKbSchemaObj)schema).getGenRuleTableObj().readGenRuleByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), forceRead );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenRuleTableObj getGenRuleTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGenRuleTableObj() );
	}

	public YCFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenRule().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenRule().readDerivedByItemIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredCartridgeId(),
						getPKey().getRequiredItemId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGenItemBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGenRuleBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGenRuleBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerCartridge = null;
		requiredLookupRuleType = null;
		requiredLookupToolSet = null;
		optionalLookupScopeDef = null;
		requiredLookupGenDef = null;
		optionalLookupProbe = null;
	}

	public YCFGenKbGenRuleBuff getGenRuleBuff() {
		return( (YCFGenKbGenRuleBuff)getBuff() );
	}

	public IYCFGenKbGenItemEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGenRuleObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGenRuleObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGenRuleTableObj().lockGenRule( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGenRuleTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGenItemEditObj)edit );
	}

	public IYCFGenKbGenRuleEditObj getEditAsGenRule() {
		return( (IYCFGenKbGenRuleEditObj)edit );
	}

	public String getRequiredDefinedNear() {
		return( getGenRuleBuff().getRequiredDefinedNear() );
	}

	public String getRequiredBody() {
		return( getGenRuleBuff().getRequiredBody() );
	}

	public Long getOptionalBodyTenantId() {
		return( getGenRuleBuff().getOptionalBodyTenantId() );
	}

	public Long getOptionalBodyGelCacheId() {
		return( getGenRuleBuff().getOptionalBodyGelCacheId() );
	}

	public Long getOptionalBodyGelId() {
		return( getGenRuleBuff().getOptionalBodyGelId() );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsBodyGel() {
		return( getOptionalComponentsBodyGel( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsBodyGel( boolean forceRead ) {
		if( ( optionalComponentsBodyGel == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenRuleBuff().getOptionalBodyTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenRuleBuff().getOptionalBodyGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenRuleBuff().getOptionalBodyGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsBodyGel = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenRuleBuff().getOptionalBodyTenantId(),
					getGenRuleBuff().getOptionalBodyGelCacheId(),
					getGenRuleBuff().getOptionalBodyGelId(), forceRead );
			}
		}
		return( optionalComponentsBodyGel );
	}

	public static IYCFGenKbGelExecutableObj getBodyBin( MssYCFGelCompiler gelCompiler, IYCFGenKbGenRuleObj genRule ) {
		final String S_ProcName = "YCFGenKbGenRuleObj.getBodyBin() ";
		IYCFGenKbGelExecutableObj bin = genRule.getOptionalComponentsBodyGel();
		if( bin == null ) {
			String execName = genRule.getRequiredLookupToolSet().getRequiredName()
				+ "::" + genRule.getRequiredLookupRuleType().getRequiredName()
				+ "::" + (( genRule.getOptionalLookupScopeDef() == null ) ? "Object" : genRule.getOptionalLookupScopeDef().getRequiredName() )
				+ "::" + genRule.getRequiredLookupGenDef().getRequiredName()
				+ "::" + genRule.getRequiredName()
				+ "::Body";
			String source = genRule.getRequiredBody();
			bin = gelCompiler.compileExecutable( execName, source );
			if( bin == null ) {
				throw new RuntimeException( S_ProcName + "Could not compile Body GEL executable from source \"" + source + "\"" );
			}

			IYCFGenKbGenRuleEditObj editRule = genRule.getEditAsGenRule();
			if( editRule != null ) {
				editRule.setOptionalComponentsBodyGel( bin );
			}
			else {
				editRule = (IYCFGenKbGenRuleEditObj)genRule.beginEdit();
				editRule.setOptionalComponentsBodyGel( bin );
				editRule.update();
				editRule = null;
			}
		}
		return( bin );
	}
}

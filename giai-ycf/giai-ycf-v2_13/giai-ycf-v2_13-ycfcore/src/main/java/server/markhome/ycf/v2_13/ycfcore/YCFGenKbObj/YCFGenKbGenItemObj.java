// Description: Java 11 base object instance implementation for YCFGenKb GenItem.

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

public class YCFGenKbGenItemObj
	implements IYCFGenKbGenItemObj
{
	public final static String CLASS_CODE = "a920";
	protected boolean isNew;
	protected IYCFGenKbGenItemEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbGenItemPKey pKey;
	protected YCFGenKbGenItemBuff buff;
	protected IYCFGenKbTenantObj requiredOwnerTenant;
	protected IYCFGenKbRuleCartObj requiredContainerCartridge;
	protected IYCFGenKbRuleTypeObj requiredLookupRuleType;
	protected IYCFGenKbToolSetObj requiredLookupToolSet;
	protected IYCFGenKbDefClassObj optionalLookupScopeDef;
	protected IYCFGenKbDefClassObj requiredLookupGenDef;
	protected IYCFGenKbGelExecutableObj optionalComponentsGelExec;
	protected IYCFGenKbGenItemObj optionalLookupProbe;

	public YCFGenKbGenItemObj() {
		getPKey().setClassCode( getClassCode() );
		isNew = true;
		requiredOwnerTenant = null;
		requiredContainerCartridge = null;
		requiredLookupRuleType = null;
		requiredLookupToolSet = null;
		optionalLookupScopeDef = null;
		requiredLookupGenDef = null;
		optionalLookupProbe = null;
	}

	public YCFGenKbGenItemObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		getPKey().setClassCode( getClassCode() );
		requiredOwnerTenant = null;
		requiredContainerCartridge = null;
		requiredLookupRuleType = null;
		requiredLookupToolSet = null;
		optionalLookupScopeDef = null;
		requiredLookupGenDef = null;
		optionalLookupProbe = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenItem" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbRuleCartObj scope = getRequiredContainerCartridge();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbRuleCartObj scope = getRequiredContainerCartridge();
		return( scope );
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

	public IYCFGenKbGenItemObj realise() {
		IYCFGenKbGenItemObj retobj = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().realiseGenItem(
			(IYCFGenKbGenItemObj)this );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGenItemTableObj().reallyDeepDisposeGenItem( (IYCFGenKbGenItemObj)this );
	}

	public IYCFGenKbGenItemObj read() {
		IYCFGenKbGenItemObj retobj = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().readGenItemByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), false );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenItemObj read( boolean forceRead ) {
		IYCFGenKbGenItemObj retobj = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().readGenItemByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), forceRead );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenItemTableObj getGenItemTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGenItemTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenItem().readDerivedByItemIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGenItemBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGenItemBuff" );
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

	public YCFGenKbGenItemBuff getGenItemBuff() {
		return( (YCFGenKbGenItemBuff)getBuff() );
	}

	public YCFGenKbGenItemPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenItem().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbGenItemPKey value ) {
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

	public IYCFGenKbGenItemEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGenItemObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGenItemObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().lockGenItem( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGenItemEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbGenItemEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbGenItemEditObj getEditAsGenItem() {
		return( (IYCFGenKbGenItemEditObj)edit );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredCartridgeId() {
		return( getPKey().getRequiredCartridgeId() );
	}

	public long getRequiredItemId() {
		return( getPKey().getRequiredItemId() );
	}

	public short getRequiredRuleTypeId() {
		return( getGenItemBuff().getRequiredRuleTypeId() );
	}

	public String getRequiredName() {
		return( getGenItemBuff().getRequiredName() );
	}

	public short getRequiredToolSetId() {
		return( getGenItemBuff().getRequiredToolSetId() );
	}

	public Short getOptionalScopeDefId() {
		return( getGenItemBuff().getOptionalScopeDefId() );
	}

	public short getRequiredGenDefId() {
		return( getGenItemBuff().getRequiredGenDefId() );
	}

	public Long getOptionalGelExecutableTenantId() {
		return( getGenItemBuff().getOptionalGelExecutableTenantId() );
	}

	public Long getOptionalGelExecutableGelCacheId() {
		return( getGenItemBuff().getOptionalGelExecutableGelCacheId() );
	}

	public Long getOptionalGelExecutableId() {
		return( getGenItemBuff().getOptionalGelExecutableId() );
	}

	public Long getOptionalProbeTenantId() {
		return( getGenItemBuff().getOptionalProbeTenantId() );
	}

	public Long getOptionalProbeCartridgeId() {
		return( getGenItemBuff().getOptionalProbeCartridgeId() );
	}

	public Long getOptionalProbeGenItemId() {
		return( getGenItemBuff().getOptionalProbeGenItemId() );
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

	public IYCFGenKbRuleCartObj getRequiredContainerCartridge() {
		return( getRequiredContainerCartridge( false ) );
	}

	public IYCFGenKbRuleCartObj getRequiredContainerCartridge( boolean forceRead ) {
		if( ( requiredContainerCartridge == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCartridge = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().readRuleCartByIdIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredCartridgeId(), forceRead );
			}
		}
		return( requiredContainerCartridge );
	}

	public IYCFGenKbRuleTypeObj getRequiredLookupRuleType() {
		return( getRequiredLookupRuleType( false ) );
	}

	public IYCFGenKbRuleTypeObj getRequiredLookupRuleType( boolean forceRead ) {
		if( ( requiredLookupRuleType == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredLookupRuleType = ((IYCFGenKbSchemaObj)schema).getRuleTypeTableObj().readRuleTypeByIdIdx( getGenItemBuff().getRequiredRuleTypeId(), forceRead );
			}
		}
		return( requiredLookupRuleType );
	}

	public IYCFGenKbToolSetObj getRequiredLookupToolSet() {
		return( getRequiredLookupToolSet( false ) );
	}

	public IYCFGenKbToolSetObj getRequiredLookupToolSet( boolean forceRead ) {
		if( ( requiredLookupToolSet == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredLookupToolSet = ((IYCFGenKbSchemaObj)schema).getToolSetTableObj().readToolSetByIdIdx( getGenItemBuff().getRequiredToolSetId(), forceRead );
			}
		}
		return( requiredLookupToolSet );
	}

	public IYCFGenKbDefClassObj getOptionalLookupScopeDef() {
		return( getOptionalLookupScopeDef( false ) );
	}

	public IYCFGenKbDefClassObj getOptionalLookupScopeDef( boolean forceRead ) {
		if( ( optionalLookupScopeDef == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenItemBuff().getOptionalScopeDefId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupScopeDef = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().readDefClassByIdIdx( getGenItemBuff().getOptionalScopeDefId(), forceRead );
			}
		}
		return( optionalLookupScopeDef );
	}

	public IYCFGenKbDefClassObj getRequiredLookupGenDef() {
		return( getRequiredLookupGenDef( false ) );
	}

	public IYCFGenKbDefClassObj getRequiredLookupGenDef( boolean forceRead ) {
		if( ( requiredLookupGenDef == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredLookupGenDef = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().readDefClassByIdIdx( getGenItemBuff().getRequiredGenDefId(), forceRead );
			}
		}
		return( requiredLookupGenDef );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsGelExec() {
		return( getOptionalComponentsGelExec( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsGelExec( boolean forceRead ) {
		if( ( optionalComponentsGelExec == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenItemBuff().getOptionalGelExecutableTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenItemBuff().getOptionalGelExecutableGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenItemBuff().getOptionalGelExecutableId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalComponentsGelExec = ((IYCFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getGenItemBuff().getOptionalGelExecutableTenantId(),
					getGenItemBuff().getOptionalGelExecutableGelCacheId(),
					getGenItemBuff().getOptionalGelExecutableId(), forceRead );
			}
		}
		return( optionalComponentsGelExec );
	}

	public IYCFGenKbGenItemObj getOptionalLookupProbe() {
		return( getOptionalLookupProbe( false ) );
	}

	public IYCFGenKbGenItemObj getOptionalLookupProbe( boolean forceRead ) {
		if( ( optionalLookupProbe == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGenItemBuff().getOptionalProbeTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenItemBuff().getOptionalProbeCartridgeId() == null ) {
				anyMissing = true;
			}
			if( getGenItemBuff().getOptionalProbeGenItemId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupProbe = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().readGenItemByItemIdIdx( getGenItemBuff().getOptionalProbeTenantId(),
					getGenItemBuff().getOptionalProbeCartridgeId(),
					getGenItemBuff().getOptionalProbeGenItemId(), forceRead );
			}
		}
		return( optionalLookupProbe );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredCartridgeId( getPKey().getRequiredCartridgeId() );
			buff.setRequiredItemId( getPKey().getRequiredItemId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredCartridgeId( buff.getRequiredCartridgeId() );
		getPKey().setRequiredItemId( buff.getRequiredItemId() );
	}
}

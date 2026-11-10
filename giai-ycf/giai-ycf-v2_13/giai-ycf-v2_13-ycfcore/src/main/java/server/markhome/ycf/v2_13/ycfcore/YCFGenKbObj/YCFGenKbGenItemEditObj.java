// Description: Java 11 edit object instance implementation for YCFGenKb GenItem.

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

public class YCFGenKbGenItemEditObj
	implements IYCFGenKbGenItemEditObj
{
	protected IYCFGenKbGenItemObj orig;
	protected YCFGenKbGenItemBuff buff;
	protected IYCFGenKbTenantObj requiredOwnerTenant;
	protected IYCFGenKbRuleCartObj requiredContainerCartridge;
	protected IYCFGenKbRuleTypeObj requiredLookupRuleType;
	protected IYCFGenKbToolSetObj requiredLookupToolSet;
	protected IYCFGenKbDefClassObj optionalLookupScopeDef;
	protected IYCFGenKbDefClassObj requiredLookupGenDef;
	protected IYCFGenKbGelExecutableObj optionalComponentsGelExec;
	protected IYCFGenKbGenItemObj optionalLookupProbe;

	public YCFGenKbGenItemEditObj( IYCFGenKbGenItemObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbGenItemBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
		requiredContainerCartridge = null;
		requiredLookupRuleType = null;
		requiredLookupToolSet = null;
		optionalLookupScopeDef = null;
		requiredLookupGenDef = null;
		optionalLookupProbe = null;
	}

	public String getClassCode() {
		return( YCFGenKbGenItemObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbGenItemObj retobj = getSchema().getGenItemTableObj().realiseGenItem( (IYCFGenKbGenItemObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGenItem().forget();
	}

	public IYCFGenKbGenItemObj read() {
		IYCFGenKbGenItemObj retval = getOrigAsGenItem().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGenItemObj read( boolean forceRead ) {
		IYCFGenKbGenItemObj retval = getOrigAsGenItem().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbGenItemObj create() {
		copyBuffToOrig();
		IYCFGenKbGenItemObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getGenItemTableObj().createGenItem( getOrigAsGenItem() );
		if( retobj == getOrigAsGenItem() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGenItemEditObj update() {
		getSchema().getGenItemTableObj().updateGenItem( (IYCFGenKbGenItemObj)this );
		return( null );
	}

	public YCFGenKbGenItemEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGenItemTableObj().deleteGenItem( getOrigAsGenItem() );
		return( null );
	}

	public IYCFGenKbGenItemTableObj getGenItemTable() {
		return( orig.getSchema().getGenItemTableObj() );
	}

	public IYCFGenKbGenItemEditObj getEdit() {
		return( (IYCFGenKbGenItemEditObj)this );
	}

	public IYCFGenKbGenItemEditObj getEditAsGenItem() {
		return( (IYCFGenKbGenItemEditObj)this );
	}

	public IYCFGenKbGenItemEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbGenItemObj getOrig() {
		return( orig );
	}

	public IYCFGenKbGenItemObj getOrigAsGenItem() {
		return( (IYCFGenKbGenItemObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGenItem().getSchema().getBackingStore()).getFactoryGenItem().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGenItemBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
			requiredContainerCartridge = null;
			requiredLookupRuleType = null;
			requiredLookupToolSet = null;
			optionalLookupScopeDef = null;
			requiredLookupGenDef = null;
			optionalLookupProbe = null;
		}
	}

	public YCFGenKbGenItemBuff getGenItemBuff() {
		return( (YCFGenKbGenItemBuff)getBuff() );
	}

	public YCFGenKbGenItemPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbGenItemPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
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

	public void setRequiredName( String value ) {
		if( getGenItemBuff().getRequiredName() != value ) {
			getGenItemBuff().setRequiredName( value );
		}
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
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTenantObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( IYCFGenKbTenantObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getGenItemBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public IYCFGenKbRuleCartObj getRequiredContainerCartridge() {
		return( getRequiredContainerCartridge( false ) );
	}

	public IYCFGenKbRuleCartObj getRequiredContainerCartridge( boolean forceRead ) {
		if( forceRead || ( requiredContainerCartridge == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbRuleCartObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getRuleCartTableObj().readRuleCartByIdIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredCartridgeId() );
				requiredContainerCartridge = obj;
				if( obj != null ) {
					getGenItemBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getGenItemBuff().setRequiredCartridgeId( obj.getRequiredId() );
					requiredContainerCartridge = obj;
				}
			}
		}
		return( requiredContainerCartridge );
	}

	public void setRequiredContainerCartridge( IYCFGenKbRuleCartObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getGenItemBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getPKey().setRequiredCartridgeId( value.getRequiredId() );
				getGenItemBuff().setRequiredCartridgeId( value.getRequiredId() );
			}
			requiredContainerCartridge = value;
	}

	public IYCFGenKbRuleTypeObj getRequiredLookupRuleType() {
		return( getRequiredLookupRuleType( false ) );
	}

	public IYCFGenKbRuleTypeObj getRequiredLookupRuleType( boolean forceRead ) {
		if( forceRead || ( requiredLookupRuleType == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbRuleTypeObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getRuleTypeTableObj().readRuleTypeByIdIdx( getGenItemBuff().getRequiredRuleTypeId() );
				requiredLookupRuleType = obj;
			}
		}
		return( requiredLookupRuleType );
	}

	public void setRequiredLookupRuleType( IYCFGenKbRuleTypeObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getGenItemBuff().setRequiredRuleTypeId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupRuleType = value;
	}

	public IYCFGenKbToolSetObj getRequiredLookupToolSet() {
		return( getRequiredLookupToolSet( false ) );
	}

	public IYCFGenKbToolSetObj getRequiredLookupToolSet( boolean forceRead ) {
		if( forceRead || ( requiredLookupToolSet == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbToolSetObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getToolSetTableObj().readToolSetByIdIdx( getGenItemBuff().getRequiredToolSetId() );
				requiredLookupToolSet = obj;
			}
		}
		return( requiredLookupToolSet );
	}

	public void setRequiredLookupToolSet( IYCFGenKbToolSetObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getGenItemBuff().setRequiredToolSetId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupToolSet = value;
	}

	public IYCFGenKbDefClassObj getOptionalLookupScopeDef() {
		return( getOptionalLookupScopeDef( false ) );
	}

	public IYCFGenKbDefClassObj getOptionalLookupScopeDef( boolean forceRead ) {
		if( forceRead || ( optionalLookupScopeDef == null ) ) {
			boolean anyMissing = false;
			if( getGenItemBuff().getOptionalScopeDefId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbDefClassObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getDefClassTableObj().readDefClassByIdIdx( getGenItemBuff().getOptionalScopeDefId() );
				optionalLookupScopeDef = obj;
			}
		}
		return( optionalLookupScopeDef );
	}

	public void setOptionalLookupScopeDef( IYCFGenKbDefClassObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getGenItemBuff().setOptionalScopeDefId( value.getRequiredId() );
			}
			else {
				getGenItemBuff().setOptionalScopeDefId( null );
			}
			optionalLookupScopeDef = value;
	}

	public IYCFGenKbDefClassObj getRequiredLookupGenDef() {
		return( getRequiredLookupGenDef( false ) );
	}

	public IYCFGenKbDefClassObj getRequiredLookupGenDef( boolean forceRead ) {
		if( forceRead || ( requiredLookupGenDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbDefClassObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getDefClassTableObj().readDefClassByIdIdx( getGenItemBuff().getRequiredGenDefId() );
				requiredLookupGenDef = obj;
			}
		}
		return( requiredLookupGenDef );
	}

	public void setRequiredLookupGenDef( IYCFGenKbDefClassObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getGenItemBuff().setRequiredGenDefId( value.getRequiredId() );
			}
			else {
			}
			requiredLookupGenDef = value;
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsGelExec() {
		return( getOptionalComponentsGelExec( false ) );
	}

	public IYCFGenKbGelExecutableObj getOptionalComponentsGelExec( boolean forceRead ) {
		if( forceRead || ( optionalComponentsGelExec == null ) ) {
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
				IYCFGenKbGelExecutableObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenItemBuff().getOptionalGelExecutableTenantId(),
					getGenItemBuff().getOptionalGelExecutableGelCacheId(),
					getGenItemBuff().getOptionalGelExecutableId() );
				optionalComponentsGelExec = obj;
			}
		}
		return( optionalComponentsGelExec );
	}

	public void setOptionalComponentsGelExec( IYCFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getGenItemBuff().setOptionalGelExecutableTenantId( value.getRequiredTenantId() );
				getGenItemBuff().setOptionalGelExecutableGelCacheId( value.getRequiredGelCacheId() );
				getGenItemBuff().setOptionalGelExecutableId( value.getRequiredGelInstId() );
			}
			else {
				getGenItemBuff().setOptionalGelExecutableTenantId( null );
				getGenItemBuff().setOptionalGelExecutableGelCacheId( null );
				getGenItemBuff().setOptionalGelExecutableId( null );
			}
			optionalComponentsGelExec = value;
	}

	public IYCFGenKbGenItemObj getOptionalLookupProbe() {
		return( getOptionalLookupProbe( false ) );
	}

	public IYCFGenKbGenItemObj getOptionalLookupProbe( boolean forceRead ) {
		if( forceRead || ( optionalLookupProbe == null ) ) {
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
				IYCFGenKbGenItemObj obj = ((IYCFGenKbSchemaObj)getOrigAsGenItem().getSchema()).getGenItemTableObj().readGenItemByItemIdIdx( getGenItemBuff().getOptionalProbeTenantId(),
					getGenItemBuff().getOptionalProbeCartridgeId(),
					getGenItemBuff().getOptionalProbeGenItemId() );
				optionalLookupProbe = obj;
			}
		}
		return( optionalLookupProbe );
	}

	public void setOptionalLookupProbe( IYCFGenKbGenItemObj value ) {
			if( buff == null ) {
				getGenItemBuff();
			}
			if( value != null ) {
				getGenItemBuff().setOptionalProbeTenantId( value.getRequiredTenantId() );
				getGenItemBuff().setOptionalProbeCartridgeId( value.getRequiredCartridgeId() );
				getGenItemBuff().setOptionalProbeGenItemId( value.getRequiredItemId() );
			}
			else {
				getGenItemBuff().setOptionalProbeTenantId( null );
				getGenItemBuff().setOptionalProbeCartridgeId( null );
				getGenItemBuff().setOptionalProbeGenItemId( null );
			}
			optionalLookupProbe = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredCartridgeId( getPKey().getRequiredCartridgeId() );
		buff.setRequiredItemId( getPKey().getRequiredItemId() );
	}

	public void copyBuffToPKey() {
		getPKey().setClassCode( buff.getClassCode() );
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredCartridgeId( buff.getRequiredCartridgeId() );
		getPKey().setRequiredItemId( buff.getRequiredItemId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbGenItemBuff origBuff = getOrigAsGenItem().getGenItemBuff();
		YCFGenKbGenItemBuff myBuff = getGenItemBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGenItemBuff origBuff = getOrigAsGenItem().getGenItemBuff();
		YCFGenKbGenItemBuff myBuff = getGenItemBuff();
		myBuff.set( origBuff );
	}
}

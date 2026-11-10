// Description: Java 11 base object instance implementation for YCFGenKb RuleCart.

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

public class YCFGenKbRuleCartObj
	implements IYCFGenKbRuleCartObj
{
	public final static String CLASS_CODE = "a925";
	protected boolean isNew;
	protected IYCFGenKbRuleCartEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbRuleCartPKey pKey;
	protected YCFGenKbRuleCartBuff buff;
	protected IYCFGenKbTenantObj requiredContainerTenant;

	public YCFGenKbRuleCartObj() {
		isNew = true;
		requiredContainerTenant = null;
	}

	public YCFGenKbRuleCartObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RuleCart" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbTenantObj scope = getRequiredContainerTenant();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbTenantObj scope = getRequiredContainerTenant();
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

	public IYCFGenKbRuleCartObj realise() {
		IYCFGenKbRuleCartObj retobj = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().realiseRuleCart(
			(IYCFGenKbRuleCartObj)this );
		return( (IYCFGenKbRuleCartObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().reallyDeepDisposeRuleCart( (IYCFGenKbRuleCartObj)this );
	}

	public IYCFGenKbRuleCartObj read() {
		IYCFGenKbRuleCartObj retobj = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().readRuleCartByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (IYCFGenKbRuleCartObj)retobj );
	}

	public IYCFGenKbRuleCartObj read( boolean forceRead ) {
		IYCFGenKbRuleCartObj retobj = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().readRuleCartByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (IYCFGenKbRuleCartObj)retobj );
	}

	public IYCFGenKbRuleCartTableObj getRuleCartTable() {
		return( ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbRuleCartBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbRuleCartBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbRuleCartBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbRuleCartBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerTenant = null;
	}

	public YCFGenKbRuleCartBuff getRuleCartBuff() {
		return( (YCFGenKbRuleCartBuff)getBuff() );
	}

	public YCFGenKbRuleCartPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbRuleCartPKey value ) {
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

	public IYCFGenKbRuleCartEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbRuleCartObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbRuleCartObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().lockRuleCart( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getRuleCartTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbRuleCartEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbRuleCartEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbRuleCartEditObj getEditAsRuleCart() {
		return( (IYCFGenKbRuleCartEditObj)edit );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getRuleCartBuff().getRequiredName() );
	}

	public String getOptionalDescr() {
		return( getRuleCartBuff().getOptionalDescr() );
	}

	public String getOptionalRevisionString() {
		return( getRuleCartBuff().getOptionalRevisionString() );
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( ( requiredContainerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerTenant = ((IYCFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredContainerTenant );
	}

	public List<IYCFGenKbGenItemObj> getOptionalComponentsRule() {
		List<IYCFGenKbGenItemObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().readGenItemByCartIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbGenItemObj> getOptionalComponentsRule( boolean forceRead ) {
		List<IYCFGenKbGenItemObj> retval;
		retval = ((IYCFGenKbSchemaObj)schema).getGenItemTableObj().readGenItemByCartIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}

// Description: Java 11 edit object instance implementation for YCFGenKb RuleCart.

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

public class YCFGenKbRuleCartEditObj
	implements IYCFGenKbRuleCartEditObj
{
	protected IYCFGenKbRuleCartObj orig;
	protected YCFGenKbRuleCartBuff buff;
	protected IYCFGenKbTenantObj requiredContainerTenant;

	public YCFGenKbRuleCartEditObj( IYCFGenKbRuleCartObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbRuleCartBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerTenant = null;
	}

	public String getClassCode() {
		return( YCFGenKbRuleCartObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbRuleCartObj retobj = getSchema().getRuleCartTableObj().realiseRuleCart( (IYCFGenKbRuleCartObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsRuleCart().forget();
	}

	public IYCFGenKbRuleCartObj read() {
		IYCFGenKbRuleCartObj retval = getOrigAsRuleCart().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbRuleCartObj read( boolean forceRead ) {
		IYCFGenKbRuleCartObj retval = getOrigAsRuleCart().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbRuleCartObj create() {
		copyBuffToOrig();
		IYCFGenKbRuleCartObj retobj = ((IYCFGenKbSchemaObj)getOrigAsRuleCart().getSchema()).getRuleCartTableObj().createRuleCart( getOrigAsRuleCart() );
		if( retobj == getOrigAsRuleCart() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbRuleCartEditObj update() {
		getSchema().getRuleCartTableObj().updateRuleCart( (IYCFGenKbRuleCartObj)this );
		return( null );
	}

	public YCFGenKbRuleCartEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getRuleCartTableObj().deleteRuleCart( getOrigAsRuleCart() );
		return( null );
	}

	public IYCFGenKbRuleCartTableObj getRuleCartTable() {
		return( orig.getSchema().getRuleCartTableObj() );
	}

	public IYCFGenKbRuleCartEditObj getEdit() {
		return( (IYCFGenKbRuleCartEditObj)this );
	}

	public IYCFGenKbRuleCartEditObj getEditAsRuleCart() {
		return( (IYCFGenKbRuleCartEditObj)this );
	}

	public IYCFGenKbRuleCartEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbRuleCartObj getOrig() {
		return( orig );
	}

	public IYCFGenKbRuleCartObj getOrigAsRuleCart() {
		return( (IYCFGenKbRuleCartObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbRuleCartBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsRuleCart().getSchema().getBackingStore()).getFactoryRuleCart().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbRuleCartBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerTenant = null;
		}
	}

	public YCFGenKbRuleCartBuff getRuleCartBuff() {
		return( (YCFGenKbRuleCartBuff)getBuff() );
	}

	public YCFGenKbRuleCartPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbRuleCartPKey value ) {
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

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getRuleCartBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getRuleCartBuff().getRequiredName() != value ) {
			getRuleCartBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescr() {
		return( getRuleCartBuff().getOptionalDescr() );
	}

	public void setOptionalDescr( String value ) {
		if( getRuleCartBuff().getOptionalDescr() != value ) {
			getRuleCartBuff().setOptionalDescr( value );
		}
	}

	public String getOptionalRevisionString() {
		return( getRuleCartBuff().getOptionalRevisionString() );
	}

	public void setOptionalRevisionString( String value ) {
		if( getRuleCartBuff().getOptionalRevisionString() != value ) {
			getRuleCartBuff().setOptionalRevisionString( value );
		}
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public IYCFGenKbTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( forceRead || ( requiredContainerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbTenantObj obj = ((IYCFGenKbSchemaObj)getOrigAsRuleCart().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredContainerTenant = obj;
				if( obj != null ) {
					getRuleCartBuff().setRequiredTenantId( obj.getRequiredId() );
					requiredContainerTenant = obj;
				}
			}
		}
		return( requiredContainerTenant );
	}

	public void setRequiredContainerTenant( IYCFGenKbTenantObj value ) {
			if( buff == null ) {
				getRuleCartBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getRuleCartBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredContainerTenant = value;
	}

	public List<IYCFGenKbGenItemObj> getOptionalComponentsRule() {
		List<IYCFGenKbGenItemObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsRuleCart().getSchema()).getGenItemTableObj().readGenItemByCartIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFGenKbGenItemObj> getOptionalComponentsRule( boolean forceRead ) {
		List<IYCFGenKbGenItemObj> retval;
		retval = ((IYCFGenKbSchemaObj)getOrigAsRuleCart().getSchema()).getGenItemTableObj().readGenItemByCartIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbRuleCartBuff origBuff = getOrigAsRuleCart().getRuleCartBuff();
		YCFGenKbRuleCartBuff myBuff = getRuleCartBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbRuleCartBuff origBuff = getOrigAsRuleCart().getRuleCartBuff();
		YCFGenKbRuleCartBuff myBuff = getRuleCartBuff();
		myBuff.set( origBuff );
	}
}

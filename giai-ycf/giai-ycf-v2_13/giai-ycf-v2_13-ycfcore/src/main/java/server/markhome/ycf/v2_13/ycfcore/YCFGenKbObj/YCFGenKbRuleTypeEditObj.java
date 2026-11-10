// Description: Java 11 edit object instance implementation for YCFGenKb RuleType.

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

public class YCFGenKbRuleTypeEditObj
	implements IYCFGenKbRuleTypeEditObj
{
	protected IYCFGenKbRuleTypeObj orig;
	protected YCFGenKbRuleTypeBuff buff;

	public YCFGenKbRuleTypeEditObj( IYCFGenKbRuleTypeObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbRuleTypeBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public String getClassCode() {
		return( YCFGenKbRuleTypeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RuleType" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
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

	public IYCFGenKbRuleTypeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbRuleTypeObj retobj = getSchema().getRuleTypeTableObj().realiseRuleType( (IYCFGenKbRuleTypeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsRuleType().forget();
	}

	public IYCFGenKbRuleTypeObj read() {
		IYCFGenKbRuleTypeObj retval = getOrigAsRuleType().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbRuleTypeObj read( boolean forceRead ) {
		IYCFGenKbRuleTypeObj retval = getOrigAsRuleType().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbRuleTypeObj create() {
		copyBuffToOrig();
		IYCFGenKbRuleTypeObj retobj = ((IYCFGenKbSchemaObj)getOrigAsRuleType().getSchema()).getRuleTypeTableObj().createRuleType( getOrigAsRuleType() );
		if( retobj == getOrigAsRuleType() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbRuleTypeEditObj update() {
		getSchema().getRuleTypeTableObj().updateRuleType( (IYCFGenKbRuleTypeObj)this );
		return( null );
	}

	public YCFGenKbRuleTypeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getRuleTypeTableObj().deleteRuleType( getOrigAsRuleType() );
		return( null );
	}

	public IYCFGenKbRuleTypeTableObj getRuleTypeTable() {
		return( orig.getSchema().getRuleTypeTableObj() );
	}

	public IYCFGenKbRuleTypeEditObj getEdit() {
		return( (IYCFGenKbRuleTypeEditObj)this );
	}

	public IYCFGenKbRuleTypeEditObj getEditAsRuleType() {
		return( (IYCFGenKbRuleTypeEditObj)this );
	}

	public IYCFGenKbRuleTypeEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbRuleTypeObj getOrig() {
		return( orig );
	}

	public IYCFGenKbRuleTypeObj getOrigAsRuleType() {
		return( (IYCFGenKbRuleTypeObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbRuleTypeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsRuleType().getSchema().getBackingStore()).getFactoryRuleType().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbRuleTypeBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFGenKbRuleTypeBuff getRuleTypeBuff() {
		return( (YCFGenKbRuleTypeBuff)getBuff() );
	}

	public YCFGenKbRuleTypePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbRuleTypePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public short getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getRuleTypeBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getRuleTypeBuff().getRequiredName() != value ) {
			getRuleTypeBuff().setRequiredName( value );
		}
	}

	public void copyPKeyToBuff() {
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbRuleTypeBuff origBuff = getOrigAsRuleType().getRuleTypeBuff();
		YCFGenKbRuleTypeBuff myBuff = getRuleTypeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbRuleTypeBuff origBuff = getOrigAsRuleType().getRuleTypeBuff();
		YCFGenKbRuleTypeBuff myBuff = getRuleTypeBuff();
		myBuff.set( origBuff );
	}
}

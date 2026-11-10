// Description: Java 11 edit object instance implementation for YCFGenKb GelBoilerplate.

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

public class YCFGenKbGelBoilerplateEditObj
	extends YCFGenKbGelInstructionEditObj

	implements IYCFGenKbGelBoilerplateEditObj
{

	public YCFGenKbGelBoilerplateEditObj( IYCFGenKbGelBoilerplateObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( YCFGenKbGelBoilerplateObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelBoilerplate" );
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
		IYCFGenKbGelBoilerplateObj retobj = getSchema().getGelBoilerplateTableObj().realiseGelBoilerplate( (IYCFGenKbGelBoilerplateObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelBoilerplate().forget();
	}

	public IYCFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		IYCFGenKbGelBoilerplateObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelBoilerplate().getSchema()).getGelBoilerplateTableObj().createGelBoilerplate( getOrigAsGelBoilerplate() );
		if( retobj == getOrigAsGelBoilerplate() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelInstructionEditObj update() {
		getSchema().getGelBoilerplateTableObj().updateGelBoilerplate( (IYCFGenKbGelBoilerplateObj)this );
		return( null );
	}

	public YCFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelBoilerplateTableObj().deleteGelBoilerplate( getOrigAsGelBoilerplate() );
		return( null );
	}

	public IYCFGenKbGelBoilerplateTableObj getGelBoilerplateTable() {
		return( orig.getSchema().getGelBoilerplateTableObj() );
	}

	public IYCFGenKbGelBoilerplateEditObj getEditAsGelBoilerplate() {
		return( (IYCFGenKbGelBoilerplateEditObj)this );
	}

	public IYCFGenKbGelBoilerplateObj getOrigAsGelBoilerplate() {
		return( (IYCFGenKbGelBoilerplateObj)orig );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelBoilerplate().getSchema().getBackingStore()).getFactoryGelBoilerplate().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public YCFGenKbGelBoilerplateBuff getGelBoilerplateBuff() {
		return( (YCFGenKbGelBoilerplateBuff)getBuff() );
	}

	public void copyBuffToOrig() {
		YCFGenKbGelBoilerplateBuff origBuff = getOrigAsGelBoilerplate().getGelBoilerplateBuff();
		YCFGenKbGelBoilerplateBuff myBuff = getGelBoilerplateBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelBoilerplateBuff origBuff = getOrigAsGelBoilerplate().getGelBoilerplateBuff();
		YCFGenKbGelBoilerplateBuff myBuff = getGelBoilerplateBuff();
		myBuff.set( origBuff );
	}
}

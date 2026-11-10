// Description: Java 11 edit object instance implementation for YCFGenKb GelIterator.

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

public class YCFGenKbGelIteratorEditObj
	extends YCFGenKbGelInstructionEditObj

	implements IYCFGenKbGelIteratorEditObj
{

	public YCFGenKbGelIteratorEditObj( IYCFGenKbGelIteratorObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( YCFGenKbGelIteratorObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelIterator" );
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
		IYCFGenKbGelIteratorObj retobj = getSchema().getGelIteratorTableObj().realiseGelIterator( (IYCFGenKbGelIteratorObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelIterator().forget();
	}

	public IYCFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		IYCFGenKbGelIteratorObj retobj = ((IYCFGenKbSchemaObj)getOrigAsGelIterator().getSchema()).getGelIteratorTableObj().createGelIterator( getOrigAsGelIterator() );
		if( retobj == getOrigAsGelIterator() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbGelInstructionEditObj update() {
		getSchema().getGelIteratorTableObj().updateGelIterator( (IYCFGenKbGelIteratorObj)this );
		return( null );
	}

	public YCFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelIteratorTableObj().deleteGelIterator( getOrigAsGelIterator() );
		return( null );
	}

	public IYCFGenKbGelIteratorTableObj getGelIteratorTable() {
		return( orig.getSchema().getGelIteratorTableObj() );
	}

	public IYCFGenKbGelIteratorEditObj getEditAsGelIterator() {
		return( (IYCFGenKbGelIteratorEditObj)this );
	}

	public IYCFGenKbGelIteratorObj getOrigAsGelIterator() {
		return( (IYCFGenKbGelIteratorObj)orig );
	}

	public YCFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsGelIterator().getSchema().getBackingStore()).getFactoryGelIterator().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public YCFGenKbGelIteratorBuff getGelIteratorBuff() {
		return( (YCFGenKbGelIteratorBuff)getBuff() );
	}

	public String getRequiredIteratorName() {
		return( getGelIteratorBuff().getRequiredIteratorName() );
	}

	public void setRequiredIteratorName( String value ) {
		if( getGelIteratorBuff().getRequiredIteratorName() != value ) {
			getGelIteratorBuff().setRequiredIteratorName( value );
		}
	}

	public String getOptionalExpandBefore() {
		return( getGelIteratorBuff().getOptionalExpandBefore() );
	}

	public void setOptionalExpandBefore( String value ) {
		if( getGelIteratorBuff().getOptionalExpandBefore() != value ) {
			getGelIteratorBuff().setOptionalExpandBefore( value );
		}
	}

	public String getOptionalExpandFirst() {
		return( getGelIteratorBuff().getOptionalExpandFirst() );
	}

	public void setOptionalExpandFirst( String value ) {
		if( getGelIteratorBuff().getOptionalExpandFirst() != value ) {
			getGelIteratorBuff().setOptionalExpandFirst( value );
		}
	}

	public String getRequiredExpandEach() {
		return( getGelIteratorBuff().getRequiredExpandEach() );
	}

	public void setRequiredExpandEach( String value ) {
		if( getGelIteratorBuff().getRequiredExpandEach() != value ) {
			getGelIteratorBuff().setRequiredExpandEach( value );
		}
	}

	public String getOptionalExpandLast() {
		return( getGelIteratorBuff().getOptionalExpandLast() );
	}

	public void setOptionalExpandLast( String value ) {
		if( getGelIteratorBuff().getOptionalExpandLast() != value ) {
			getGelIteratorBuff().setOptionalExpandLast( value );
		}
	}

	public String getOptionalExpandLone() {
		return( getGelIteratorBuff().getOptionalExpandLone() );
	}

	public void setOptionalExpandLone( String value ) {
		if( getGelIteratorBuff().getOptionalExpandLone() != value ) {
			getGelIteratorBuff().setOptionalExpandLone( value );
		}
	}

	public String getOptionalExpandEmpty() {
		return( getGelIteratorBuff().getOptionalExpandEmpty() );
	}

	public void setOptionalExpandEmpty( String value ) {
		if( getGelIteratorBuff().getOptionalExpandEmpty() != value ) {
			getGelIteratorBuff().setOptionalExpandEmpty( value );
		}
	}

	public String getOptionalExpandAfter() {
		return( getGelIteratorBuff().getOptionalExpandAfter() );
	}

	public void setOptionalExpandAfter( String value ) {
		if( getGelIteratorBuff().getOptionalExpandAfter() != value ) {
			getGelIteratorBuff().setOptionalExpandAfter( value );
		}
	}

	public void copyBuffToOrig() {
		YCFGenKbGelIteratorBuff origBuff = getOrigAsGelIterator().getGelIteratorBuff();
		YCFGenKbGelIteratorBuff myBuff = getGelIteratorBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbGelIteratorBuff origBuff = getOrigAsGelIterator().getGelIteratorBuff();
		YCFGenKbGelIteratorBuff myBuff = getGelIteratorBuff();
		myBuff.set( origBuff );
	}
}

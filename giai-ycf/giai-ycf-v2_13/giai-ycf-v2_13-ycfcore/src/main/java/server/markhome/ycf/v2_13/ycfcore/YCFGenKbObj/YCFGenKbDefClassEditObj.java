// Description: Java 11 edit object instance implementation for YCFGenKb DefClass.

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

public class YCFGenKbDefClassEditObj
	implements IYCFGenKbDefClassEditObj
{
	protected IYCFGenKbDefClassObj orig;
	protected YCFGenKbDefClassBuff buff;
	protected IYCFGenKbDefClassObj optionalParentBaseDefClass;

	public YCFGenKbDefClassEditObj( IYCFGenKbDefClassObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbDefClassBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		optionalParentBaseDefClass = null;
	}

	public String getClassCode() {
		return( YCFGenKbDefClassObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "DefClass" );
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

	public IYCFGenKbDefClassObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbDefClassObj retobj = getSchema().getDefClassTableObj().realiseDefClass( (IYCFGenKbDefClassObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsDefClass().forget();
	}

	public IYCFGenKbDefClassObj read() {
		IYCFGenKbDefClassObj retval = getOrigAsDefClass().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbDefClassObj read( boolean forceRead ) {
		IYCFGenKbDefClassObj retval = getOrigAsDefClass().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbDefClassObj create() {
		copyBuffToOrig();
		IYCFGenKbDefClassObj retobj = ((IYCFGenKbSchemaObj)getOrigAsDefClass().getSchema()).getDefClassTableObj().createDefClass( getOrigAsDefClass() );
		if( retobj == getOrigAsDefClass() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbDefClassEditObj update() {
		getSchema().getDefClassTableObj().updateDefClass( (IYCFGenKbDefClassObj)this );
		return( null );
	}

	public YCFGenKbDefClassEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getDefClassTableObj().deleteDefClass( getOrigAsDefClass() );
		return( null );
	}

	public IYCFGenKbDefClassTableObj getDefClassTable() {
		return( orig.getSchema().getDefClassTableObj() );
	}

	public IYCFGenKbDefClassEditObj getEdit() {
		return( (IYCFGenKbDefClassEditObj)this );
	}

	public IYCFGenKbDefClassEditObj getEditAsDefClass() {
		return( (IYCFGenKbDefClassEditObj)this );
	}

	public IYCFGenKbDefClassEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbDefClassObj getOrig() {
		return( orig );
	}

	public IYCFGenKbDefClassObj getOrigAsDefClass() {
		return( (IYCFGenKbDefClassObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbDefClassBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsDefClass().getSchema().getBackingStore()).getFactoryDefClass().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbDefClassBuff value ) {
		if( buff != value ) {
			buff = value;
			optionalParentBaseDefClass = null;
		}
	}

	public YCFGenKbDefClassBuff getDefClassBuff() {
		return( (YCFGenKbDefClassBuff)getBuff() );
	}

	public YCFGenKbDefClassPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbDefClassPKey value ) {
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
		return( getDefClassBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getDefClassBuff().getRequiredName() != value ) {
			getDefClassBuff().setRequiredName( value );
		}
	}

	public Short getOptionalBaseId() {
		return( getDefClassBuff().getOptionalBaseId() );
	}

	public IYCFGenKbDefClassObj getOptionalParentBaseDefClass() {
		return( getOptionalParentBaseDefClass( false ) );
	}

	public IYCFGenKbDefClassObj getOptionalParentBaseDefClass( boolean forceRead ) {
		if( forceRead || ( optionalParentBaseDefClass == null ) ) {
			boolean anyMissing = false;
			if( getDefClassBuff().getOptionalBaseId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbDefClassObj obj = ((IYCFGenKbSchemaObj)getOrigAsDefClass().getSchema()).getDefClassTableObj().readDefClassByIdIdx( getDefClassBuff().getOptionalBaseId() );
				optionalParentBaseDefClass = obj;
			}
		}
		return( optionalParentBaseDefClass );
	}

	public void setOptionalParentBaseDefClass( IYCFGenKbDefClassObj value ) {
			if( buff == null ) {
				getDefClassBuff();
			}
			if( value != null ) {
				getDefClassBuff().setOptionalBaseId( value.getRequiredId() );
			}
			else {
				getDefClassBuff().setOptionalBaseId( null );
			}
			optionalParentBaseDefClass = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbDefClassBuff origBuff = getOrigAsDefClass().getDefClassBuff();
		YCFGenKbDefClassBuff myBuff = getDefClassBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbDefClassBuff origBuff = getOrigAsDefClass().getDefClassBuff();
		YCFGenKbDefClassBuff myBuff = getDefClassBuff();
		myBuff.set( origBuff );
	}
}

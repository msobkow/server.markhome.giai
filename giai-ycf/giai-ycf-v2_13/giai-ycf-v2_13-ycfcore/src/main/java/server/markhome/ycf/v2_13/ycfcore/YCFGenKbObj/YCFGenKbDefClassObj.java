// Description: Java 11 base object instance implementation for YCFGenKb DefClass.

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

public class YCFGenKbDefClassObj
	implements IYCFGenKbDefClassObj
{
	public final static String CLASS_CODE = "a914";
	protected boolean isNew;
	protected IYCFGenKbDefClassEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbDefClassPKey pKey;
	protected YCFGenKbDefClassBuff buff;
	protected IYCFGenKbDefClassObj optionalParentBaseDefClass;

	public YCFGenKbDefClassObj() {
		isNew = true;
		optionalParentBaseDefClass = null;
	}

	public YCFGenKbDefClassObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		optionalParentBaseDefClass = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFGenKbDefClassObj retobj = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().realiseDefClass(
			(IYCFGenKbDefClassObj)this );
		return( (IYCFGenKbDefClassObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getDefClassTableObj().reallyDeepDisposeDefClass( (IYCFGenKbDefClassObj)this );
	}

	public IYCFGenKbDefClassObj read() {
		IYCFGenKbDefClassObj retobj = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().readDefClassByIdIdx( getPKey().getRequiredId(), false );
		return( (IYCFGenKbDefClassObj)retobj );
	}

	public IYCFGenKbDefClassObj read( boolean forceRead ) {
		IYCFGenKbDefClassObj retobj = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().readDefClassByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (IYCFGenKbDefClassObj)retobj );
	}

	public IYCFGenKbDefClassTableObj getDefClassTable() {
		return( ((IYCFGenKbSchemaObj)schema).getDefClassTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbDefClassBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbDefClassBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbDefClassBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbDefClassBuff" );
		}
		buff = value;
		copyBuffToPKey();
		optionalParentBaseDefClass = null;
	}

	public YCFGenKbDefClassBuff getDefClassBuff() {
		return( (YCFGenKbDefClassBuff)getBuff() );
	}

	public YCFGenKbDefClassPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbDefClassPKey value ) {
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

	public IYCFGenKbDefClassEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbDefClassObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbDefClassObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().lockDefClass( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbDefClassEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbDefClassEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbDefClassEditObj getEditAsDefClass() {
		return( (IYCFGenKbDefClassEditObj)edit );
	}

	public short getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getDefClassBuff().getRequiredName() );
	}

	public Short getOptionalBaseId() {
		return( getDefClassBuff().getOptionalBaseId() );
	}

	public IYCFGenKbDefClassObj getOptionalParentBaseDefClass() {
		return( getOptionalParentBaseDefClass( false ) );
	}

	public IYCFGenKbDefClassObj getOptionalParentBaseDefClass( boolean forceRead ) {
		if( ( optionalParentBaseDefClass == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getDefClassBuff().getOptionalBaseId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalParentBaseDefClass = ((IYCFGenKbSchemaObj)schema).getDefClassTableObj().readDefClassByIdIdx( getDefClassBuff().getOptionalBaseId(), forceRead );
			}
		}
		return( optionalParentBaseDefClass );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}

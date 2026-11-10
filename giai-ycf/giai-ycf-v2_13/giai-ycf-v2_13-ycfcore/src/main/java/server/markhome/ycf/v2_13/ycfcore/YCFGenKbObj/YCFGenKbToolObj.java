// Description: Java 11 base object instance implementation for YCFGenKb Tool.

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

public class YCFGenKbToolObj
	implements IYCFGenKbToolObj
{
	public final static String CLASS_CODE = "a927";
	protected boolean isNew;
	protected IYCFGenKbToolEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbToolPKey pKey;
	protected YCFGenKbToolBuff buff;
	protected IYCFGenKbToolObj optionalLookupReplaces;

	public YCFGenKbToolObj() {
		isNew = true;
		optionalLookupReplaces = null;
	}

	public YCFGenKbToolObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		optionalLookupReplaces = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Tool" );
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

	public IYCFGenKbToolObj realise() {
		IYCFGenKbToolObj retobj = ((IYCFGenKbSchemaObj)schema).getToolTableObj().realiseTool(
			(IYCFGenKbToolObj)this );
		return( (IYCFGenKbToolObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getToolTableObj().reallyDeepDisposeTool( (IYCFGenKbToolObj)this );
	}

	public IYCFGenKbToolObj read() {
		IYCFGenKbToolObj retobj = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getPKey().getRequiredId(), false );
		return( (IYCFGenKbToolObj)retobj );
	}

	public IYCFGenKbToolObj read( boolean forceRead ) {
		IYCFGenKbToolObj retobj = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (IYCFGenKbToolObj)retobj );
	}

	public IYCFGenKbToolTableObj getToolTable() {
		return( ((IYCFGenKbSchemaObj)schema).getToolTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbToolBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbToolBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbToolBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbToolBuff" );
		}
		buff = value;
		copyBuffToPKey();
		optionalLookupReplaces = null;
	}

	public YCFGenKbToolBuff getToolBuff() {
		return( (YCFGenKbToolBuff)getBuff() );
	}

	public YCFGenKbToolPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbToolPKey value ) {
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

	public IYCFGenKbToolEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbToolObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbToolObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getToolTableObj().lockTool( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getToolTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbToolEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbToolEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbToolEditObj getEditAsTool() {
		return( (IYCFGenKbToolEditObj)edit );
	}

	public short getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getToolBuff().getRequiredName() );
	}

	public Short getOptionalReplacesId() {
		return( getToolBuff().getOptionalReplacesId() );
	}

	public boolean getRequiredIsSupported() {
		return( getToolBuff().getRequiredIsSupported() );
	}

	public IYCFGenKbToolObj getOptionalLookupReplaces() {
		return( getOptionalLookupReplaces( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupReplaces( boolean forceRead ) {
		if( ( optionalLookupReplaces == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolBuff().getOptionalReplacesId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupReplaces = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolBuff().getOptionalReplacesId(), forceRead );
			}
		}
		return( optionalLookupReplaces );
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

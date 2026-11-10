// Description: Java 11 base object instance implementation for YCFGenKb ToolSet.

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

public class YCFGenKbToolSetObj
	implements IYCFGenKbToolSetObj
{
	public final static String CLASS_CODE = "a928";
	protected boolean isNew;
	protected IYCFGenKbToolSetEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbToolSetPKey pKey;
	protected YCFGenKbToolSetBuff buff;
	protected IYCFGenKbToolObj requiredLookupTool0;
	protected IYCFGenKbToolObj optionalLookupTool1;
	protected IYCFGenKbToolObj optionalLookupTool2;
	protected IYCFGenKbToolObj optionalLookupTool3;
	protected IYCFGenKbToolObj optionalLookupTool4;
	protected IYCFGenKbToolObj optionalLookupTool5;
	protected IYCFGenKbToolObj optionalLookupTool6;
	protected IYCFGenKbToolObj optionalLookupTool7;

	public YCFGenKbToolSetObj() {
		isNew = true;
		requiredLookupTool0 = null;
		optionalLookupTool1 = null;
		optionalLookupTool2 = null;
		optionalLookupTool3 = null;
		optionalLookupTool4 = null;
		optionalLookupTool5 = null;
		optionalLookupTool6 = null;
		optionalLookupTool7 = null;
	}

	public YCFGenKbToolSetObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredLookupTool0 = null;
		optionalLookupTool1 = null;
		optionalLookupTool2 = null;
		optionalLookupTool3 = null;
		optionalLookupTool4 = null;
		optionalLookupTool5 = null;
		optionalLookupTool6 = null;
		optionalLookupTool7 = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ToolSet" );
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

	public IYCFGenKbToolSetObj realise() {
		IYCFGenKbToolSetObj retobj = ((IYCFGenKbSchemaObj)schema).getToolSetTableObj().realiseToolSet(
			(IYCFGenKbToolSetObj)this );
		return( (IYCFGenKbToolSetObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getToolSetTableObj().reallyDeepDisposeToolSet( (IYCFGenKbToolSetObj)this );
	}

	public IYCFGenKbToolSetObj read() {
		IYCFGenKbToolSetObj retobj = ((IYCFGenKbSchemaObj)schema).getToolSetTableObj().readToolSetByIdIdx( getPKey().getRequiredId(), false );
		return( (IYCFGenKbToolSetObj)retobj );
	}

	public IYCFGenKbToolSetObj read( boolean forceRead ) {
		IYCFGenKbToolSetObj retobj = ((IYCFGenKbSchemaObj)schema).getToolSetTableObj().readToolSetByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (IYCFGenKbToolSetObj)retobj );
	}

	public IYCFGenKbToolSetTableObj getToolSetTable() {
		return( ((IYCFGenKbSchemaObj)schema).getToolSetTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbToolSetBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbToolSetBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbToolSetBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbToolSetBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredLookupTool0 = null;
		optionalLookupTool1 = null;
		optionalLookupTool2 = null;
		optionalLookupTool3 = null;
		optionalLookupTool4 = null;
		optionalLookupTool5 = null;
		optionalLookupTool6 = null;
		optionalLookupTool7 = null;
	}

	public YCFGenKbToolSetBuff getToolSetBuff() {
		return( (YCFGenKbToolSetBuff)getBuff() );
	}

	public YCFGenKbToolSetPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbToolSetPKey value ) {
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

	public IYCFGenKbToolSetEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbToolSetObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbToolSetObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getToolSetTableObj().lockToolSet( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getToolSetTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbToolSetEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbToolSetEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbToolSetEditObj getEditAsToolSet() {
		return( (IYCFGenKbToolSetEditObj)edit );
	}

	public short getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getToolSetBuff().getRequiredName() );
	}

	public String getOptionalDescr() {
		return( getToolSetBuff().getOptionalDescr() );
	}

	public String getOptionalRevisionString() {
		return( getToolSetBuff().getOptionalRevisionString() );
	}

	public boolean getRequiredIsSupported() {
		return( getToolSetBuff().getRequiredIsSupported() );
	}

	public boolean getRequiredGenerate() {
		return( getToolSetBuff().getRequiredGenerate() );
	}

	public short getRequiredToolId0() {
		return( getToolSetBuff().getRequiredToolId0() );
	}

	public Short getOptionalToolId1() {
		return( getToolSetBuff().getOptionalToolId1() );
	}

	public Short getOptionalToolId2() {
		return( getToolSetBuff().getOptionalToolId2() );
	}

	public Short getOptionalToolId3() {
		return( getToolSetBuff().getOptionalToolId3() );
	}

	public Short getOptionalToolId4() {
		return( getToolSetBuff().getOptionalToolId4() );
	}

	public Short getOptionalToolId5() {
		return( getToolSetBuff().getOptionalToolId5() );
	}

	public Short getOptionalToolId6() {
		return( getToolSetBuff().getOptionalToolId6() );
	}

	public Short getOptionalToolId7() {
		return( getToolSetBuff().getOptionalToolId7() );
	}

	public IYCFGenKbToolObj getRequiredLookupTool0() {
		return( getRequiredLookupTool0( false ) );
	}

	public IYCFGenKbToolObj getRequiredLookupTool0( boolean forceRead ) {
		if( ( requiredLookupTool0 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredLookupTool0 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getRequiredToolId0(), forceRead );
			}
		}
		return( requiredLookupTool0 );
	}

	public IYCFGenKbToolObj getOptionalLookupTool1() {
		return( getOptionalLookupTool1( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool1( boolean forceRead ) {
		if( ( optionalLookupTool1 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId1() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupTool1 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId1(), forceRead );
			}
		}
		return( optionalLookupTool1 );
	}

	public IYCFGenKbToolObj getOptionalLookupTool2() {
		return( getOptionalLookupTool2( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool2( boolean forceRead ) {
		if( ( optionalLookupTool2 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId2() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupTool2 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId2(), forceRead );
			}
		}
		return( optionalLookupTool2 );
	}

	public IYCFGenKbToolObj getOptionalLookupTool3() {
		return( getOptionalLookupTool3( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool3( boolean forceRead ) {
		if( ( optionalLookupTool3 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId3() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupTool3 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId3(), forceRead );
			}
		}
		return( optionalLookupTool3 );
	}

	public IYCFGenKbToolObj getOptionalLookupTool4() {
		return( getOptionalLookupTool4( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool4( boolean forceRead ) {
		if( ( optionalLookupTool4 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId4() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupTool4 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId4(), forceRead );
			}
		}
		return( optionalLookupTool4 );
	}

	public IYCFGenKbToolObj getOptionalLookupTool5() {
		return( getOptionalLookupTool5( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool5( boolean forceRead ) {
		if( ( optionalLookupTool5 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId5() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupTool5 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId5(), forceRead );
			}
		}
		return( optionalLookupTool5 );
	}

	public IYCFGenKbToolObj getOptionalLookupTool6() {
		return( getOptionalLookupTool6( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool6( boolean forceRead ) {
		if( ( optionalLookupTool6 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId6() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupTool6 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId6(), forceRead );
			}
		}
		return( optionalLookupTool6 );
	}

	public IYCFGenKbToolObj getOptionalLookupTool7() {
		return( getOptionalLookupTool7( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool7( boolean forceRead ) {
		if( ( optionalLookupTool7 == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId7() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupTool7 = ((IYCFGenKbSchemaObj)schema).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId7(), forceRead );
			}
		}
		return( optionalLookupTool7 );
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

// Description: Java 11 edit object instance implementation for YCFGenKb ToolSet.

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

public class YCFGenKbToolSetEditObj
	implements IYCFGenKbToolSetEditObj
{
	protected IYCFGenKbToolSetObj orig;
	protected YCFGenKbToolSetBuff buff;
	protected IYCFGenKbToolObj requiredLookupTool0;
	protected IYCFGenKbToolObj optionalLookupTool1;
	protected IYCFGenKbToolObj optionalLookupTool2;
	protected IYCFGenKbToolObj optionalLookupTool3;
	protected IYCFGenKbToolObj optionalLookupTool4;
	protected IYCFGenKbToolObj optionalLookupTool5;
	protected IYCFGenKbToolObj optionalLookupTool6;
	protected IYCFGenKbToolObj optionalLookupTool7;

	public YCFGenKbToolSetEditObj( IYCFGenKbToolSetObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbToolSetBuff origBuff = orig.getBuff();
		buff.set( origBuff );
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
		return( YCFGenKbToolSetObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbToolSetObj retobj = getSchema().getToolSetTableObj().realiseToolSet( (IYCFGenKbToolSetObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsToolSet().forget();
	}

	public IYCFGenKbToolSetObj read() {
		IYCFGenKbToolSetObj retval = getOrigAsToolSet().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbToolSetObj read( boolean forceRead ) {
		IYCFGenKbToolSetObj retval = getOrigAsToolSet().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbToolSetObj create() {
		copyBuffToOrig();
		IYCFGenKbToolSetObj retobj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolSetTableObj().createToolSet( getOrigAsToolSet() );
		if( retobj == getOrigAsToolSet() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbToolSetEditObj update() {
		getSchema().getToolSetTableObj().updateToolSet( (IYCFGenKbToolSetObj)this );
		return( null );
	}

	public YCFGenKbToolSetEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getToolSetTableObj().deleteToolSet( getOrigAsToolSet() );
		return( null );
	}

	public IYCFGenKbToolSetTableObj getToolSetTable() {
		return( orig.getSchema().getToolSetTableObj() );
	}

	public IYCFGenKbToolSetEditObj getEdit() {
		return( (IYCFGenKbToolSetEditObj)this );
	}

	public IYCFGenKbToolSetEditObj getEditAsToolSet() {
		return( (IYCFGenKbToolSetEditObj)this );
	}

	public IYCFGenKbToolSetEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbToolSetObj getOrig() {
		return( orig );
	}

	public IYCFGenKbToolSetObj getOrigAsToolSet() {
		return( (IYCFGenKbToolSetObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbToolSetBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsToolSet().getSchema().getBackingStore()).getFactoryToolSet().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbToolSetBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredLookupTool0 = null;
			optionalLookupTool1 = null;
			optionalLookupTool2 = null;
			optionalLookupTool3 = null;
			optionalLookupTool4 = null;
			optionalLookupTool5 = null;
			optionalLookupTool6 = null;
			optionalLookupTool7 = null;
		}
	}

	public YCFGenKbToolSetBuff getToolSetBuff() {
		return( (YCFGenKbToolSetBuff)getBuff() );
	}

	public YCFGenKbToolSetPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbToolSetPKey value ) {
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
		return( getToolSetBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getToolSetBuff().getRequiredName() != value ) {
			getToolSetBuff().setRequiredName( value );
		}
	}

	public String getOptionalDescr() {
		return( getToolSetBuff().getOptionalDescr() );
	}

	public void setOptionalDescr( String value ) {
		if( getToolSetBuff().getOptionalDescr() != value ) {
			getToolSetBuff().setOptionalDescr( value );
		}
	}

	public String getOptionalRevisionString() {
		return( getToolSetBuff().getOptionalRevisionString() );
	}

	public void setOptionalRevisionString( String value ) {
		if( getToolSetBuff().getOptionalRevisionString() != value ) {
			getToolSetBuff().setOptionalRevisionString( value );
		}
	}

	public boolean getRequiredIsSupported() {
		return( getToolSetBuff().getRequiredIsSupported() );
	}

	public void setRequiredIsSupported( boolean value ) {
		if( getToolSetBuff().getRequiredIsSupported() != value ) {
			getToolSetBuff().setRequiredIsSupported( value );
		}
	}

	public boolean getRequiredGenerate() {
		return( getToolSetBuff().getRequiredGenerate() );
	}

	public void setRequiredGenerate( boolean value ) {
		if( getToolSetBuff().getRequiredGenerate() != value ) {
			getToolSetBuff().setRequiredGenerate( value );
		}
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
		if( forceRead || ( requiredLookupTool0 == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getRequiredToolId0() );
				requiredLookupTool0 = obj;
			}
		}
		return( requiredLookupTool0 );
	}

	public void setRequiredLookupTool0( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setRequiredToolId0( value.getRequiredId() );
			}
			else {
			}
			requiredLookupTool0 = value;
	}

	public IYCFGenKbToolObj getOptionalLookupTool1() {
		return( getOptionalLookupTool1( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool1( boolean forceRead ) {
		if( forceRead || ( optionalLookupTool1 == null ) ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId1() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId1() );
				optionalLookupTool1 = obj;
			}
		}
		return( optionalLookupTool1 );
	}

	public void setOptionalLookupTool1( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setOptionalToolId1( value.getRequiredId() );
			}
			else {
				getToolSetBuff().setOptionalToolId1( null );
			}
			optionalLookupTool1 = value;
	}

	public IYCFGenKbToolObj getOptionalLookupTool2() {
		return( getOptionalLookupTool2( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool2( boolean forceRead ) {
		if( forceRead || ( optionalLookupTool2 == null ) ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId2() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId2() );
				optionalLookupTool2 = obj;
			}
		}
		return( optionalLookupTool2 );
	}

	public void setOptionalLookupTool2( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setOptionalToolId2( value.getRequiredId() );
			}
			else {
				getToolSetBuff().setOptionalToolId2( null );
			}
			optionalLookupTool2 = value;
	}

	public IYCFGenKbToolObj getOptionalLookupTool3() {
		return( getOptionalLookupTool3( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool3( boolean forceRead ) {
		if( forceRead || ( optionalLookupTool3 == null ) ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId3() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId3() );
				optionalLookupTool3 = obj;
			}
		}
		return( optionalLookupTool3 );
	}

	public void setOptionalLookupTool3( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setOptionalToolId3( value.getRequiredId() );
			}
			else {
				getToolSetBuff().setOptionalToolId3( null );
			}
			optionalLookupTool3 = value;
	}

	public IYCFGenKbToolObj getOptionalLookupTool4() {
		return( getOptionalLookupTool4( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool4( boolean forceRead ) {
		if( forceRead || ( optionalLookupTool4 == null ) ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId4() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId4() );
				optionalLookupTool4 = obj;
			}
		}
		return( optionalLookupTool4 );
	}

	public void setOptionalLookupTool4( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setOptionalToolId4( value.getRequiredId() );
			}
			else {
				getToolSetBuff().setOptionalToolId4( null );
			}
			optionalLookupTool4 = value;
	}

	public IYCFGenKbToolObj getOptionalLookupTool5() {
		return( getOptionalLookupTool5( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool5( boolean forceRead ) {
		if( forceRead || ( optionalLookupTool5 == null ) ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId5() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId5() );
				optionalLookupTool5 = obj;
			}
		}
		return( optionalLookupTool5 );
	}

	public void setOptionalLookupTool5( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setOptionalToolId5( value.getRequiredId() );
			}
			else {
				getToolSetBuff().setOptionalToolId5( null );
			}
			optionalLookupTool5 = value;
	}

	public IYCFGenKbToolObj getOptionalLookupTool6() {
		return( getOptionalLookupTool6( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool6( boolean forceRead ) {
		if( forceRead || ( optionalLookupTool6 == null ) ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId6() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId6() );
				optionalLookupTool6 = obj;
			}
		}
		return( optionalLookupTool6 );
	}

	public void setOptionalLookupTool6( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setOptionalToolId6( value.getRequiredId() );
			}
			else {
				getToolSetBuff().setOptionalToolId6( null );
			}
			optionalLookupTool6 = value;
	}

	public IYCFGenKbToolObj getOptionalLookupTool7() {
		return( getOptionalLookupTool7( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupTool7( boolean forceRead ) {
		if( forceRead || ( optionalLookupTool7 == null ) ) {
			boolean anyMissing = false;
			if( getToolSetBuff().getOptionalToolId7() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsToolSet().getSchema()).getToolTableObj().readToolByIdIdx( getToolSetBuff().getOptionalToolId7() );
				optionalLookupTool7 = obj;
			}
		}
		return( optionalLookupTool7 );
	}

	public void setOptionalLookupTool7( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolSetBuff();
			}
			if( value != null ) {
				getToolSetBuff().setOptionalToolId7( value.getRequiredId() );
			}
			else {
				getToolSetBuff().setOptionalToolId7( null );
			}
			optionalLookupTool7 = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbToolSetBuff origBuff = getOrigAsToolSet().getToolSetBuff();
		YCFGenKbToolSetBuff myBuff = getToolSetBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbToolSetBuff origBuff = getOrigAsToolSet().getToolSetBuff();
		YCFGenKbToolSetBuff myBuff = getToolSetBuff();
		myBuff.set( origBuff );
	}
}

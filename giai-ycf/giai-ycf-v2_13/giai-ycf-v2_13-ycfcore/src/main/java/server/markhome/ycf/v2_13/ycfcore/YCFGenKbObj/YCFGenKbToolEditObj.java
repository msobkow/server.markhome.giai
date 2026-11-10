// Description: Java 11 edit object instance implementation for YCFGenKb Tool.

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

public class YCFGenKbToolEditObj
	implements IYCFGenKbToolEditObj
{
	protected IYCFGenKbToolObj orig;
	protected YCFGenKbToolBuff buff;
	protected IYCFGenKbToolObj optionalLookupReplaces;

	public YCFGenKbToolEditObj( IYCFGenKbToolObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbToolBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		optionalLookupReplaces = null;
	}

	public String getClassCode() {
		return( YCFGenKbToolObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbToolObj retobj = getSchema().getToolTableObj().realiseTool( (IYCFGenKbToolObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsTool().forget();
	}

	public IYCFGenKbToolObj read() {
		IYCFGenKbToolObj retval = getOrigAsTool().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbToolObj read( boolean forceRead ) {
		IYCFGenKbToolObj retval = getOrigAsTool().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbToolObj create() {
		copyBuffToOrig();
		IYCFGenKbToolObj retobj = ((IYCFGenKbSchemaObj)getOrigAsTool().getSchema()).getToolTableObj().createTool( getOrigAsTool() );
		if( retobj == getOrigAsTool() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbToolEditObj update() {
		getSchema().getToolTableObj().updateTool( (IYCFGenKbToolObj)this );
		return( null );
	}

	public YCFGenKbToolEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getToolTableObj().deleteTool( getOrigAsTool() );
		return( null );
	}

	public IYCFGenKbToolTableObj getToolTable() {
		return( orig.getSchema().getToolTableObj() );
	}

	public IYCFGenKbToolEditObj getEdit() {
		return( (IYCFGenKbToolEditObj)this );
	}

	public IYCFGenKbToolEditObj getEditAsTool() {
		return( (IYCFGenKbToolEditObj)this );
	}

	public IYCFGenKbToolEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbToolObj getOrig() {
		return( orig );
	}

	public IYCFGenKbToolObj getOrigAsTool() {
		return( (IYCFGenKbToolObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbToolBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsTool().getSchema().getBackingStore()).getFactoryTool().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbToolBuff value ) {
		if( buff != value ) {
			buff = value;
			optionalLookupReplaces = null;
		}
	}

	public YCFGenKbToolBuff getToolBuff() {
		return( (YCFGenKbToolBuff)getBuff() );
	}

	public YCFGenKbToolPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbToolPKey value ) {
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
		return( getToolBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getToolBuff().getRequiredName() != value ) {
			getToolBuff().setRequiredName( value );
		}
	}

	public Short getOptionalReplacesId() {
		return( getToolBuff().getOptionalReplacesId() );
	}

	public boolean getRequiredIsSupported() {
		return( getToolBuff().getRequiredIsSupported() );
	}

	public void setRequiredIsSupported( boolean value ) {
		if( getToolBuff().getRequiredIsSupported() != value ) {
			getToolBuff().setRequiredIsSupported( value );
		}
	}

	public IYCFGenKbToolObj getOptionalLookupReplaces() {
		return( getOptionalLookupReplaces( false ) );
	}

	public IYCFGenKbToolObj getOptionalLookupReplaces( boolean forceRead ) {
		if( forceRead || ( optionalLookupReplaces == null ) ) {
			boolean anyMissing = false;
			if( getToolBuff().getOptionalReplacesId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFGenKbToolObj obj = ((IYCFGenKbSchemaObj)getOrigAsTool().getSchema()).getToolTableObj().readToolByIdIdx( getToolBuff().getOptionalReplacesId() );
				optionalLookupReplaces = obj;
			}
		}
		return( optionalLookupReplaces );
	}

	public void setOptionalLookupReplaces( IYCFGenKbToolObj value ) {
			if( buff == null ) {
				getToolBuff();
			}
			if( value != null ) {
				getToolBuff().setOptionalReplacesId( value.getRequiredId() );
			}
			else {
				getToolBuff().setOptionalReplacesId( null );
			}
			optionalLookupReplaces = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbToolBuff origBuff = getOrigAsTool().getToolBuff();
		YCFGenKbToolBuff myBuff = getToolBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbToolBuff origBuff = getOrigAsTool().getToolBuff();
		YCFGenKbToolBuff myBuff = getToolBuff();
		myBuff.set( origBuff );
	}
}

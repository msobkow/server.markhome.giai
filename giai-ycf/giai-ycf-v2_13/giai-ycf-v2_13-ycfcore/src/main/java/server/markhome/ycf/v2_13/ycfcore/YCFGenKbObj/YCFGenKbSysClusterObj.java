// Description: Java 11 base object instance implementation for YCFGenKb SysCluster.

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

public class YCFGenKbSysClusterObj
	implements IYCFGenKbSysClusterObj
{
	public final static String CLASS_CODE = "a90f";
	protected boolean isNew;
	protected IYCFGenKbSysClusterEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbSysClusterPKey pKey;
	protected YCFGenKbSysClusterBuff buff;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbSysClusterObj() {
		isNew = true;
		requiredContainerCluster = null;
	}

	public YCFGenKbSysClusterObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SysCluster" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public String getObjName() {
		String objName;
		int val = getRequiredSingletonId();
		objName = Integer.toString( val );
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

	public IYCFGenKbSysClusterObj realise() {
		IYCFGenKbSysClusterObj retobj = ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().realiseSysCluster(
			(IYCFGenKbSysClusterObj)this );
		return( (IYCFGenKbSysClusterObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().reallyDeepDisposeSysCluster( (IYCFGenKbSysClusterObj)this );
	}

	public IYCFGenKbSysClusterObj read() {
		IYCFGenKbSysClusterObj retobj = ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().readSysClusterByIdIdx( getPKey().getRequiredSingletonId(), false );
		return( (IYCFGenKbSysClusterObj)retobj );
	}

	public IYCFGenKbSysClusterObj read( boolean forceRead ) {
		IYCFGenKbSysClusterObj retobj = ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().readSysClusterByIdIdx( getPKey().getRequiredSingletonId(), forceRead );
		return( (IYCFGenKbSysClusterObj)retobj );
	}

	public IYCFGenKbSysClusterTableObj getSysClusterTable() {
		return( ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbSysClusterBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSingletonId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSysClusterBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbSysClusterBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbSysClusterBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerCluster = null;
	}

	public YCFGenKbSysClusterBuff getSysClusterBuff() {
		return( (YCFGenKbSysClusterBuff)getBuff() );
	}

	public YCFGenKbSysClusterPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbSysClusterPKey value ) {
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

	public IYCFGenKbSysClusterEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbSysClusterObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbSysClusterObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().lockSysCluster( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getSysClusterTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbSysClusterEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbSysClusterEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbSysClusterEditObj getEditAsSysCluster() {
		return( (IYCFGenKbSysClusterEditObj)edit );
	}

	public int getRequiredSingletonId() {
		return( getPKey().getRequiredSingletonId() );
	}

	public long getRequiredClusterId() {
		return( getSysClusterBuff().getRequiredClusterId() );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( ( requiredContainerCluster == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerCluster = ((IYCFGenKbSchemaObj)schema).getClusterTableObj().readClusterByIdIdx( getSysClusterBuff().getRequiredClusterId(), forceRead );
			}
		}
		return( requiredContainerCluster );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredSingletonId( getPKey().getRequiredSingletonId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSingletonId( buff.getRequiredSingletonId() );
	}
}

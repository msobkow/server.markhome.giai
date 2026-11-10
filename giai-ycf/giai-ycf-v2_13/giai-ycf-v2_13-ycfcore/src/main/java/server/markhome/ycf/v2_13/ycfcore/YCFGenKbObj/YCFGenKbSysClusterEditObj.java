// Description: Java 11 edit object instance implementation for YCFGenKb SysCluster.

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

public class YCFGenKbSysClusterEditObj
	implements IYCFGenKbSysClusterEditObj
{
	protected IYCFGenKbSysClusterObj orig;
	protected YCFGenKbSysClusterBuff buff;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbSysClusterEditObj( IYCFGenKbSysClusterObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbSysClusterBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( YCFGenKbSysClusterObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbSysClusterObj retobj = getSchema().getSysClusterTableObj().realiseSysCluster( (IYCFGenKbSysClusterObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSysCluster().forget();
	}

	public IYCFGenKbSysClusterObj read() {
		IYCFGenKbSysClusterObj retval = getOrigAsSysCluster().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSysClusterObj read( boolean forceRead ) {
		IYCFGenKbSysClusterObj retval = getOrigAsSysCluster().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbSysClusterObj create() {
		copyBuffToOrig();
		IYCFGenKbSysClusterObj retobj = ((IYCFGenKbSchemaObj)getOrigAsSysCluster().getSchema()).getSysClusterTableObj().createSysCluster( getOrigAsSysCluster() );
		if( retobj == getOrigAsSysCluster() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbSysClusterEditObj update() {
		getSchema().getSysClusterTableObj().updateSysCluster( (IYCFGenKbSysClusterObj)this );
		return( null );
	}

	public YCFGenKbSysClusterEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSysClusterTableObj().deleteSysCluster( getOrigAsSysCluster() );
		return( null );
	}

	public IYCFGenKbSysClusterTableObj getSysClusterTable() {
		return( orig.getSchema().getSysClusterTableObj() );
	}

	public IYCFGenKbSysClusterEditObj getEdit() {
		return( (IYCFGenKbSysClusterEditObj)this );
	}

	public IYCFGenKbSysClusterEditObj getEditAsSysCluster() {
		return( (IYCFGenKbSysClusterEditObj)this );
	}

	public IYCFGenKbSysClusterEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbSysClusterObj getOrig() {
		return( orig );
	}

	public IYCFGenKbSysClusterObj getOrigAsSysCluster() {
		return( (IYCFGenKbSysClusterObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbSysClusterBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsSysCluster().getSchema().getBackingStore()).getFactorySysCluster().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSysClusterBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFGenKbSysClusterBuff getSysClusterBuff() {
		return( (YCFGenKbSysClusterBuff)getBuff() );
	}

	public YCFGenKbSysClusterPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbSysClusterPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public int getRequiredSingletonId() {
		return( getPKey().getRequiredSingletonId() );
	}

	public void setRequiredSingletonId( int value ) {
		if( getPKey().getRequiredSingletonId() != value ) {
			getPKey().setRequiredSingletonId( value );
		}
		if( getSysClusterBuff().getRequiredSingletonId() != value ) {
			getSysClusterBuff().setRequiredSingletonId( value );
		}
	}

	public long getRequiredClusterId() {
		return( getSysClusterBuff().getRequiredClusterId() );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsSysCluster().getSchema()).getClusterTableObj().readClusterByIdIdx( getSysClusterBuff().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getSysClusterBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getSysClusterBuff();
			}
			if( value != null ) {
				getSysClusterBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredSingletonId( getPKey().getRequiredSingletonId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSingletonId( buff.getRequiredSingletonId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbSysClusterBuff origBuff = getOrigAsSysCluster().getSysClusterBuff();
		YCFGenKbSysClusterBuff myBuff = getSysClusterBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbSysClusterBuff origBuff = getOrigAsSysCluster().getSysClusterBuff();
		YCFGenKbSysClusterBuff myBuff = getSysClusterBuff();
		myBuff.set( origBuff );
	}
}

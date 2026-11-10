// Description: Java 11 edit object instance implementation for YCFGenKb HostNode.

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

public class YCFGenKbHostNodeEditObj
	implements IYCFGenKbHostNodeEditObj
{
	protected IYCFGenKbHostNodeObj orig;
	protected YCFGenKbHostNodeBuff buff;
	protected IYCFGenKbSecUserObj createdBy = null;
	protected IYCFGenKbSecUserObj updatedBy = null;
	protected IYCFGenKbClusterObj requiredContainerCluster;

	public YCFGenKbHostNodeEditObj( IYCFGenKbHostNodeObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFGenKbHostNodeBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public IYCFGenKbSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFGenKbHostNodeBuff buff = getBuff();
			createdBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFGenKbSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFGenKbHostNodeBuff buff = getBuff();
			updatedBy = ((IYCFGenKbSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public void setCreatedBy( IYCFGenKbSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( IYCFGenKbSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( YCFGenKbHostNodeObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "HostNode" );
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
		objName = getRequiredHostName();
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

	public IYCFGenKbHostNodeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFGenKbHostNodeObj retobj = getSchema().getHostNodeTableObj().realiseHostNode( (IYCFGenKbHostNodeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsHostNode().forget();
	}

	public IYCFGenKbHostNodeObj read() {
		IYCFGenKbHostNodeObj retval = getOrigAsHostNode().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbHostNodeObj read( boolean forceRead ) {
		IYCFGenKbHostNodeObj retval = getOrigAsHostNode().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFGenKbHostNodeObj create() {
		copyBuffToOrig();
		IYCFGenKbHostNodeObj retobj = ((IYCFGenKbSchemaObj)getOrigAsHostNode().getSchema()).getHostNodeTableObj().createHostNode( getOrigAsHostNode() );
		if( retobj == getOrigAsHostNode() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFGenKbHostNodeEditObj update() {
		getSchema().getHostNodeTableObj().updateHostNode( (IYCFGenKbHostNodeObj)this );
		return( null );
	}

	public YCFGenKbHostNodeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getHostNodeTableObj().deleteHostNode( getOrigAsHostNode() );
		return( null );
	}

	public IYCFGenKbHostNodeTableObj getHostNodeTable() {
		return( orig.getSchema().getHostNodeTableObj() );
	}

	public IYCFGenKbHostNodeEditObj getEdit() {
		return( (IYCFGenKbHostNodeEditObj)this );
	}

	public IYCFGenKbHostNodeEditObj getEditAsHostNode() {
		return( (IYCFGenKbHostNodeEditObj)this );
	}

	public IYCFGenKbHostNodeEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFGenKbHostNodeObj getOrig() {
		return( orig );
	}

	public IYCFGenKbHostNodeObj getOrigAsHostNode() {
		return( (IYCFGenKbHostNodeObj)orig );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFGenKbHostNodeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFGenKbSchema)getOrigAsHostNode().getSchema().getBackingStore()).getFactoryHostNode().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFGenKbHostNodeBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public YCFGenKbHostNodeBuff getHostNodeBuff() {
		return( (YCFGenKbHostNodeBuff)getBuff() );
	}

	public YCFGenKbHostNodePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFGenKbHostNodePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredClusterId() {
		return( getPKey().getRequiredClusterId() );
	}

	public long getRequiredHostNodeId() {
		return( getPKey().getRequiredHostNodeId() );
	}

	public String getRequiredDescription() {
		return( getHostNodeBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getHostNodeBuff().getRequiredDescription() != value ) {
			getHostNodeBuff().setRequiredDescription( value );
		}
	}

	public String getRequiredHostName() {
		return( getHostNodeBuff().getRequiredHostName() );
	}

	public void setRequiredHostName( String value ) {
		if( getHostNodeBuff().getRequiredHostName() != value ) {
			getHostNodeBuff().setRequiredHostName( value );
		}
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public IYCFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFGenKbClusterObj obj = ((IYCFGenKbSchemaObj)getOrigAsHostNode().getSchema()).getClusterTableObj().readClusterByIdIdx( getPKey().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getHostNodeBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( IYCFGenKbClusterObj value ) {
			if( buff == null ) {
				getHostNodeBuff();
			}
			if( value != null ) {
				getPKey().setRequiredClusterId( value.getRequiredId() );
				getHostNodeBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredClusterId( getPKey().getRequiredClusterId() );
		buff.setRequiredHostNodeId( getPKey().getRequiredHostNodeId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredClusterId( buff.getRequiredClusterId() );
		getPKey().setRequiredHostNodeId( buff.getRequiredHostNodeId() );
	}

	public void copyBuffToOrig() {
		YCFGenKbHostNodeBuff origBuff = getOrigAsHostNode().getHostNodeBuff();
		YCFGenKbHostNodeBuff myBuff = getHostNodeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFGenKbHostNodeBuff origBuff = getOrigAsHostNode().getHostNodeBuff();
		YCFGenKbHostNodeBuff myBuff = getHostNodeBuff();
		myBuff.set( origBuff );
	}
}

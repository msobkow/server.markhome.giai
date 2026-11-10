// Description: Java 11 base object instance implementation for YCFGenKb SecSession.

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

public class YCFGenKbSecSessionObj
	implements IYCFGenKbSecSessionObj
{
	public final static String CLASS_CODE = "a90d";
	protected boolean isNew;
	protected IYCFGenKbSecSessionEditObj edit;
	protected IYCFGenKbSchemaObj schema;
	protected YCFGenKbSecSessionPKey pKey;
	protected YCFGenKbSecSessionBuff buff;
	protected IYCFGenKbSecUserObj requiredContainerSecUser;
	protected IYCFGenKbSecUserObj requiredParentSecProxy;

	public YCFGenKbSecSessionObj() {
		isNew = true;
		requiredContainerSecUser = null;
		requiredParentSecProxy = null;
	}

	public YCFGenKbSecSessionObj( IYCFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerSecUser = null;
		requiredParentSecProxy = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SecSession" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFGenKbSecUserObj scope = getRequiredContainerSecUser();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFGenKbSecUserObj scope = getRequiredContainerSecUser();
		return( scope );
	}

	public String getObjName() {
		String objName;
		UUID val = getRequiredSecSessionId();
		objName = val.toString();
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

	public IYCFGenKbSecSessionObj realise() {
		IYCFGenKbSecSessionObj retobj = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().realiseSecSession(
			(IYCFGenKbSecSessionObj)this );
		return( (IYCFGenKbSecSessionObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().reallyDeepDisposeSecSession( (IYCFGenKbSecSessionObj)this );
	}

	public IYCFGenKbSecSessionObj read() {
		IYCFGenKbSecSessionObj retobj = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().readSecSessionByIdIdx( getPKey().getRequiredSecSessionId(), false );
		return( (IYCFGenKbSecSessionObj)retobj );
	}

	public IYCFGenKbSecSessionObj read( boolean forceRead ) {
		IYCFGenKbSecSessionObj retobj = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().readSecSessionByIdIdx( getPKey().getRequiredSecSessionId(), forceRead );
		return( (IYCFGenKbSecSessionObj)retobj );
	}

	public IYCFGenKbSecSessionTableObj getSecSessionTable() {
		return( ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj() );
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = value;
	}

	public YCFGenKbSecSessionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedByIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSecSessionId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbSecSessionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbSecSessionBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbSecSessionBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerSecUser = null;
		requiredParentSecProxy = null;
	}

	public YCFGenKbSecSessionBuff getSecSessionBuff() {
		return( (YCFGenKbSecSessionBuff)getBuff() );
	}

	public YCFGenKbSecSessionPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFGenKbSecSessionPKey value ) {
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

	public IYCFGenKbSecSessionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbSecSessionObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbSecSessionObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().lockSecSession( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getSecSessionTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbSecSessionEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFGenKbSecSessionEditObj getEdit() {
		return( edit );
	}

	public IYCFGenKbSecSessionEditObj getEditAsSecSession() {
		return( (IYCFGenKbSecSessionEditObj)edit );
	}

	public UUID getRequiredSecSessionId() {
		return( getPKey().getRequiredSecSessionId() );
	}

	public UUID getRequiredSecUserId() {
		return( getSecSessionBuff().getRequiredSecUserId() );
	}

	public String getOptionalSecDevName() {
		return( getSecSessionBuff().getOptionalSecDevName() );
	}

	public Calendar getRequiredStart() {
		return( getSecSessionBuff().getRequiredStart() );
	}

	public Calendar getOptionalFinish() {
		return( getSecSessionBuff().getOptionalFinish() );
	}

	public UUID getOptionalSecProxyId() {
		return( getSecSessionBuff().getOptionalSecProxyId() );
	}

	public IYCFGenKbSecUserObj getRequiredContainerSecUser() {
		return( getRequiredContainerSecUser( false ) );
	}

	public IYCFGenKbSecUserObj getRequiredContainerSecUser( boolean forceRead ) {
		if( ( requiredContainerSecUser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerSecUser = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getSecSessionBuff().getRequiredSecUserId(), forceRead );
			}
		}
		return( requiredContainerSecUser );
	}

	public IYCFGenKbSecUserObj getRequiredParentSecProxy() {
		return( getRequiredParentSecProxy( false ) );
	}

	public IYCFGenKbSecUserObj getRequiredParentSecProxy( boolean forceRead ) {
		if( ( requiredParentSecProxy == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getSecSessionBuff().getOptionalSecProxyId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				requiredParentSecProxy = ((IYCFGenKbSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getSecSessionBuff().getOptionalSecProxyId(), forceRead );
			}
		}
		return( requiredParentSecProxy );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredSecSessionId( getPKey().getRequiredSecSessionId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSecSessionId( buff.getRequiredSecSessionId() );
	}
}

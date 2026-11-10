// Description: Java 11 base object instance implementation for YCFBam SecSession.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamSecSessionObj
	implements IYCFBamSecSessionObj
{
	public final static String CLASS_CODE = "a010";
	protected boolean isNew;
	protected IYCFSecSecSessionEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecSecSessionPKey pKey;
	protected YCFSecSecSessionBuff buff;
	protected IYCFSecSecUserObj requiredContainerSecUser;
	protected IYCFSecSecUserObj requiredParentSecProxy;

	public YCFBamSecSessionObj() {
		isNew = true;
		requiredContainerSecUser = null;
		requiredParentSecProxy = null;
	}

	public YCFBamSecSessionObj( IYCFSecSchemaObj argSchema ) {
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
		IYCFSecSecUserObj scope = getRequiredContainerSecUser();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFSecSecUserObj scope = getRequiredContainerSecUser();
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
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
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
				if( container instanceof IYCFBamClusterObj ) {
					break;
				}
				else if( container instanceof IYCFBamTenantObj ) {
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
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
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
			if( container instanceof IYCFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof IYCFSecTenantObj ) {
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

	public IYCFSecSecSessionObj realise() {
		IYCFSecSecSessionObj retobj = ((IYCFBamSchemaObj)schema).getSecSessionTableObj().realiseSecSession(
			(IYCFSecSecSessionObj)this );
		return( (IYCFSecSecSessionObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getSecSessionTableObj().reallyDeepDisposeSecSession( (IYCFSecSecSessionObj)this );
	}

	public IYCFSecSecSessionObj read() {
		IYCFSecSecSessionObj retobj = ((IYCFBamSchemaObj)schema).getSecSessionTableObj().readSecSessionByIdIdx( getPKey().getRequiredSecSessionId(), false );
		return( (IYCFSecSecSessionObj)retobj );
	}

	public IYCFSecSecSessionObj read( boolean forceRead ) {
		IYCFSecSecSessionObj retobj = ((IYCFBamSchemaObj)schema).getSecSessionTableObj().readSecSessionByIdIdx( getPKey().getRequiredSecSessionId(), forceRead );
		return( (IYCFSecSecSessionObj)retobj );
	}

	public IYCFSecSecSessionTableObj getSecSessionTable() {
		return( ((IYCFBamSchemaObj)schema).getSecSessionTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecSecSessionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecSession().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredSecSessionId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecSecSessionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecSecSessionBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecSecSessionBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerSecUser = null;
		requiredParentSecProxy = null;
	}

	public YCFSecSecSessionBuff getSecSessionBuff() {
		return( (YCFSecSecSessionBuff)getBuff() );
	}

	public YCFSecSecSessionPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecSecSessionPKey value ) {
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

	public IYCFSecSecSessionEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecSecSessionObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecSecSessionObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getSecSessionTableObj().lockSecSession( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getSecSessionTableObj().newEditInstance( lockobj );
		return( (IYCFSecSecSessionEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecSecSessionEditObj getEdit() {
		return( edit );
	}

	public IYCFSecSecSessionEditObj getEditAsSecSession() {
		return( (IYCFSecSecSessionEditObj)edit );
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

	public IYCFSecSecUserObj getRequiredContainerSecUser() {
		return( getRequiredContainerSecUser( false ) );
	}

	public IYCFSecSecUserObj getRequiredContainerSecUser( boolean forceRead ) {
		if( ( requiredContainerSecUser == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerSecUser = ((IYCFBamSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getSecSessionBuff().getRequiredSecUserId(), forceRead );
			}
		}
		return( requiredContainerSecUser );
	}

	public IYCFSecSecUserObj getRequiredParentSecProxy() {
		return( getRequiredParentSecProxy( false ) );
	}

	public IYCFSecSecUserObj getRequiredParentSecProxy( boolean forceRead ) {
		if( ( requiredParentSecProxy == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getSecSessionBuff().getOptionalSecProxyId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				requiredParentSecProxy = ((IYCFBamSchemaObj)schema).getSecUserTableObj().readSecUserByIdIdx( getSecSessionBuff().getOptionalSecProxyId(), forceRead );
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

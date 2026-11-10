// Description: Java 11 edit object instance implementation for YCFBam SecSession.

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

public class YCFBamSecSessionEditObj
	implements IYCFBamSecSessionEditObj
{
	protected IYCFSecSecSessionObj orig;
	protected YCFSecSecSessionBuff buff;
	protected IYCFSecSecUserObj requiredContainerSecUser;
	protected IYCFSecSecUserObj requiredParentSecProxy;

	public YCFBamSecSessionEditObj( IYCFSecSecSessionObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecSecSessionBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerSecUser = null;
		requiredParentSecProxy = null;
	}

	public String getClassCode() {
		return( YCFBamSecSessionObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecSecSessionObj retobj = getSchema().getSecSessionTableObj().realiseSecSession( (IYCFBamSecSessionObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSecSession().forget();
	}

	public IYCFSecSecSessionObj read() {
		IYCFSecSecSessionObj retval = getOrigAsSecSession().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecSessionObj read( boolean forceRead ) {
		IYCFSecSecSessionObj retval = getOrigAsSecSession().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecSecSessionObj create() {
		copyBuffToOrig();
		IYCFSecSecSessionObj retobj = ((IYCFBamSchemaObj)getOrigAsSecSession().getSchema()).getSecSessionTableObj().createSecSession( getOrigAsSecSession() );
		if( retobj == getOrigAsSecSession() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecSecSessionEditObj update() {
		getSchema().getSecSessionTableObj().updateSecSession( (IYCFSecSecSessionObj)this );
		return( null );
	}

	public YCFSecSecSessionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSecSessionTableObj().deleteSecSession( getOrigAsSecSession() );
		return( null );
	}

	public IYCFSecSecSessionTableObj getSecSessionTable() {
		return( orig.getSchema().getSecSessionTableObj() );
	}

	public IYCFSecSecSessionEditObj getEdit() {
		return( (IYCFSecSecSessionEditObj)this );
	}

	public IYCFSecSecSessionEditObj getEditAsSecSession() {
		return( (IYCFSecSecSessionEditObj)this );
	}

	public IYCFSecSecSessionEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecSecSessionObj getOrig() {
		return( orig );
	}

	public IYCFSecSecSessionObj getOrigAsSecSession() {
		return( (IYCFSecSecSessionObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecSecSessionBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsSecSession().getSchema().getBackingStore()).getFactorySecSession().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecSecSessionBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerSecUser = null;
			requiredParentSecProxy = null;
		}
	}

	public YCFSecSecSessionBuff getSecSessionBuff() {
		return( (YCFSecSecSessionBuff)getBuff() );
	}

	public YCFSecSecSessionPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecSecSessionPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
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

	public void setOptionalSecDevName( String value ) {
		if( getSecSessionBuff().getOptionalSecDevName() != value ) {
			getSecSessionBuff().setOptionalSecDevName( value );
		}
	}

	public Calendar getRequiredStart() {
		return( getSecSessionBuff().getRequiredStart() );
	}

	public void setRequiredStart( Calendar value ) {
		if( getSecSessionBuff().getRequiredStart() != value ) {
			getSecSessionBuff().setRequiredStart( value );
		}
	}

	public Calendar getOptionalFinish() {
		return( getSecSessionBuff().getOptionalFinish() );
	}

	public void setOptionalFinish( Calendar value ) {
		if( getSecSessionBuff().getOptionalFinish() != value ) {
			getSecSessionBuff().setOptionalFinish( value );
		}
	}

	public UUID getOptionalSecProxyId() {
		return( getSecSessionBuff().getOptionalSecProxyId() );
	}

	public IYCFSecSecUserObj getRequiredContainerSecUser() {
		return( getRequiredContainerSecUser( false ) );
	}

	public IYCFSecSecUserObj getRequiredContainerSecUser( boolean forceRead ) {
		if( forceRead || ( requiredContainerSecUser == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecSecUserObj obj = ((IYCFBamSchemaObj)getOrigAsSecSession().getSchema()).getSecUserTableObj().readSecUserByIdIdx( getSecSessionBuff().getRequiredSecUserId() );
				requiredContainerSecUser = obj;
				if( obj != null ) {
					getSecSessionBuff().setRequiredSecUserId( obj.getRequiredSecUserId() );
					requiredContainerSecUser = obj;
				}
			}
		}
		return( requiredContainerSecUser );
	}

	public void setRequiredContainerSecUser( IYCFSecSecUserObj value ) {
			if( buff == null ) {
				getSecSessionBuff();
			}
			if( value != null ) {
				getSecSessionBuff().setRequiredSecUserId( value.getRequiredSecUserId() );
			}
			requiredContainerSecUser = value;
	}

	public IYCFSecSecUserObj getRequiredParentSecProxy() {
		return( getRequiredParentSecProxy( false ) );
	}

	public IYCFSecSecUserObj getRequiredParentSecProxy( boolean forceRead ) {
		if( forceRead || ( requiredParentSecProxy == null ) ) {
			boolean anyMissing = false;
			if( getSecSessionBuff().getOptionalSecProxyId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				IYCFSecSecUserObj obj = ((IYCFBamSchemaObj)getOrigAsSecSession().getSchema()).getSecUserTableObj().readSecUserByIdIdx( getSecSessionBuff().getOptionalSecProxyId() );
				requiredParentSecProxy = obj;
			}
		}
		return( requiredParentSecProxy );
	}

	public void setRequiredParentSecProxy( IYCFSecSecUserObj value ) {
			if( buff == null ) {
				getSecSessionBuff();
			}
			if( value != null ) {
				getSecSessionBuff().setOptionalSecProxyId( value.getRequiredSecUserId() );
			}
			else {
				getSecSessionBuff().setOptionalSecProxyId( null );
			}
			requiredParentSecProxy = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredSecSessionId( getPKey().getRequiredSecSessionId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSecSessionId( buff.getRequiredSecSessionId() );
	}

	public void copyBuffToOrig() {
		YCFSecSecSessionBuff origBuff = getOrigAsSecSession().getSecSessionBuff();
		YCFSecSecSessionBuff myBuff = getSecSessionBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecSecSessionBuff origBuff = getOrigAsSecSession().getSecSessionBuff();
		YCFSecSecSessionBuff myBuff = getSecSessionBuff();
		myBuff.set( origBuff );
	}
}

// Description: Java 11 edit object instance implementation for YCFBam URLProtocol.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

public class YCFBamURLProtocolEditObj
	implements IYCFBamURLProtocolEditObj
{
	protected IYCFIntURLProtocolObj orig;
	protected YCFIntURLProtocolBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFBamURLProtocolEditObj( IYCFIntURLProtocolObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFIntURLProtocolBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFIntURLProtocolBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFIntURLProtocolBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public void setCreatedBy( IYCFSecSecUserObj value ) {
		createdBy = value;
		if( value != null ) {
			getBuff().setCreatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setCreatedAt( Calendar value ) {
		getBuff().setCreatedAt( value );
	}

	public void setUpdatedBy( IYCFSecSecUserObj value ) {
		updatedBy = value;
		if( value != null ) {
			getBuff().setUpdatedByUserId( value.getRequiredSecUserId() );
		}
	}

	public void setUpdatedAt( Calendar value ) {
		getBuff().setUpdatedAt( value );
	}

	public String getClassCode() {
		return( YCFBamURLProtocolObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "URLProtocol" );
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

	public IYCFIntURLProtocolObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFIntURLProtocolObj retobj = getSchema().getURLProtocolTableObj().realiseURLProtocol( (IYCFBamURLProtocolObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsURLProtocol().forget();
	}

	public IYCFIntURLProtocolObj read() {
		IYCFIntURLProtocolObj retval = getOrigAsURLProtocol().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntURLProtocolObj read( boolean forceRead ) {
		IYCFIntURLProtocolObj retval = getOrigAsURLProtocol().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFIntURLProtocolObj create() {
		copyBuffToOrig();
		IYCFIntURLProtocolObj retobj = ((IYCFBamSchemaObj)getOrigAsURLProtocol().getSchema()).getURLProtocolTableObj().createURLProtocol( getOrigAsURLProtocol() );
		if( retobj == getOrigAsURLProtocol() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFIntURLProtocolEditObj update() {
		getSchema().getURLProtocolTableObj().updateURLProtocol( (IYCFIntURLProtocolObj)this );
		return( null );
	}

	public YCFIntURLProtocolEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getURLProtocolTableObj().deleteURLProtocol( getOrigAsURLProtocol() );
		return( null );
	}

	public IYCFIntURLProtocolTableObj getURLProtocolTable() {
		return( orig.getSchema().getURLProtocolTableObj() );
	}

	public IYCFIntURLProtocolEditObj getEdit() {
		return( (IYCFIntURLProtocolEditObj)this );
	}

	public IYCFIntURLProtocolEditObj getEditAsURLProtocol() {
		return( (IYCFIntURLProtocolEditObj)this );
	}

	public IYCFIntURLProtocolEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFIntURLProtocolObj getOrig() {
		return( orig );
	}

	public IYCFIntURLProtocolObj getOrigAsURLProtocol() {
		return( (IYCFIntURLProtocolObj)orig );
	}

	public IYCFIntSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFIntURLProtocolBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsURLProtocol().getSchema().getBackingStore()).getFactoryURLProtocol().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFIntURLProtocolBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFIntURLProtocolBuff getURLProtocolBuff() {
		return( (YCFIntURLProtocolBuff)getBuff() );
	}

	public YCFIntURLProtocolPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFIntURLProtocolPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public int getRequiredURLProtocolId() {
		return( getPKey().getRequiredURLProtocolId() );
	}

	public String getRequiredName() {
		return( getURLProtocolBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getURLProtocolBuff().getRequiredName() != value ) {
			getURLProtocolBuff().setRequiredName( value );
		}
	}

	public String getRequiredDescription() {
		return( getURLProtocolBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getURLProtocolBuff().getRequiredDescription() != value ) {
			getURLProtocolBuff().setRequiredDescription( value );
		}
	}

	public boolean getRequiredIsSecure() {
		return( getURLProtocolBuff().getRequiredIsSecure() );
	}

	public void setRequiredIsSecure( boolean value ) {
		if( getURLProtocolBuff().getRequiredIsSecure() != value ) {
			getURLProtocolBuff().setRequiredIsSecure( value );
		}
	}

	public void copyPKeyToBuff() {
		buff.setRequiredURLProtocolId( getPKey().getRequiredURLProtocolId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredURLProtocolId( buff.getRequiredURLProtocolId() );
	}

	public void copyBuffToOrig() {
		YCFIntURLProtocolBuff origBuff = getOrigAsURLProtocol().getURLProtocolBuff();
		YCFIntURLProtocolBuff myBuff = getURLProtocolBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFIntURLProtocolBuff origBuff = getOrigAsURLProtocol().getURLProtocolBuff();
		YCFIntURLProtocolBuff myBuff = getURLProtocolBuff();
		myBuff.set( origBuff );
	}
}

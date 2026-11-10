// Description: Java 11 base object instance implementation for YCFBam URLProtocol.

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

public class YCFBamURLProtocolObj
	implements IYCFBamURLProtocolObj
{
	public final static String CLASS_CODE = "a109";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFIntURLProtocolEditObj edit;
	protected IYCFIntSchemaObj schema;
	protected YCFIntURLProtocolPKey pKey;
	protected YCFIntURLProtocolBuff buff;

	public YCFBamURLProtocolObj() {
		isNew = true;
	}

	public YCFBamURLProtocolObj( IYCFIntSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		IYCFIntURLProtocolObj retobj = ((IYCFBamSchemaObj)schema).getURLProtocolTableObj().realiseURLProtocol(
			(IYCFIntURLProtocolObj)this );
		return( (IYCFIntURLProtocolObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getURLProtocolTableObj().reallyDeepDisposeURLProtocol( (IYCFIntURLProtocolObj)this );
	}

	public IYCFIntURLProtocolObj read() {
		IYCFIntURLProtocolObj retobj = ((IYCFBamSchemaObj)schema).getURLProtocolTableObj().readURLProtocolByIdIdx( getPKey().getRequiredURLProtocolId(), false );
		return( (IYCFIntURLProtocolObj)retobj );
	}

	public IYCFIntURLProtocolObj read( boolean forceRead ) {
		IYCFIntURLProtocolObj retobj = ((IYCFBamSchemaObj)schema).getURLProtocolTableObj().readURLProtocolByIdIdx( getPKey().getRequiredURLProtocolId(), forceRead );
		return( (IYCFIntURLProtocolObj)retobj );
	}

	public IYCFIntURLProtocolTableObj getURLProtocolTable() {
		return( ((IYCFBamSchemaObj)schema).getURLProtocolTableObj() );
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = value;
	}

	public YCFIntURLProtocolBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableURLProtocol().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredURLProtocolId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFIntURLProtocolBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFIntURLProtocolBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFIntURLProtocolBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFIntURLProtocolBuff getURLProtocolBuff() {
		return( (YCFIntURLProtocolBuff)getBuff() );
	}

	public YCFIntURLProtocolPKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFIntURLProtocolPKey value ) {
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

	public IYCFIntURLProtocolEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFIntURLProtocolObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFIntURLProtocolObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getURLProtocolTableObj().lockURLProtocol( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getURLProtocolTableObj().newEditInstance( lockobj );
		return( (IYCFIntURLProtocolEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFIntURLProtocolEditObj getEdit() {
		return( edit );
	}

	public IYCFIntURLProtocolEditObj getEditAsURLProtocol() {
		return( (IYCFIntURLProtocolEditObj)edit );
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

	public int getRequiredURLProtocolId() {
		return( getPKey().getRequiredURLProtocolId() );
	}

	public String getRequiredName() {
		return( getURLProtocolBuff().getRequiredName() );
	}

	public String getRequiredDescription() {
		return( getURLProtocolBuff().getRequiredDescription() );
	}

	public boolean getRequiredIsSecure() {
		return( getURLProtocolBuff().getRequiredIsSecure() );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredURLProtocolId( getPKey().getRequiredURLProtocolId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredURLProtocolId( buff.getRequiredURLProtocolId() );
	}
}

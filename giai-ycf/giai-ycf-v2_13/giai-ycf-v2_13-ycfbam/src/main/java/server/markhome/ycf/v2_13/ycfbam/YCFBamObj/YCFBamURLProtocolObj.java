// Description: Java 11 base object instance implementation for CFBam URLProtocol.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFInt.
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

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamURLProtocolObj
	implements ICFBamURLProtocolObj
{
	public final static String CLASS_CODE = "a109";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFIntURLProtocolEditObj edit;
	protected ICFIntSchemaObj schema;
	protected CFIntURLProtocolPKey pKey;
	protected CFIntURLProtocolBuff buff;

	public CFBamURLProtocolObj() {
		isNew = true;
	}

	public CFBamURLProtocolObj( ICFIntSchemaObj argSchema ) {
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

	public ICFLibAnyObj getScope() {
		return( null );
	}

	public ICFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
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
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
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
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
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
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
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

	public ICFIntURLProtocolObj realise() {
		ICFIntURLProtocolObj retobj = ((ICFBamSchemaObj)schema).getURLProtocolTableObj().realiseURLProtocol(
			(ICFIntURLProtocolObj)this );
		return( (ICFIntURLProtocolObj)retobj );
	}

	public void forget() {
		((ICFBamSchemaObj)schema).getURLProtocolTableObj().reallyDeepDisposeURLProtocol( (ICFIntURLProtocolObj)this );
	}

	public ICFIntURLProtocolObj read() {
		ICFIntURLProtocolObj retobj = ((ICFBamSchemaObj)schema).getURLProtocolTableObj().readURLProtocolByIdIdx( getPKey().getRequiredURLProtocolId(), false );
		return( (ICFIntURLProtocolObj)retobj );
	}

	public ICFIntURLProtocolObj read( boolean forceRead ) {
		ICFIntURLProtocolObj retobj = ((ICFBamSchemaObj)schema).getURLProtocolTableObj().readURLProtocolByIdIdx( getPKey().getRequiredURLProtocolId(), forceRead );
		return( (ICFIntURLProtocolObj)retobj );
	}

	public ICFIntURLProtocolTableObj getURLProtocolTable() {
		return( ((ICFBamSchemaObj)schema).getURLProtocolTableObj() );
	}

	public ICFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFIntSchemaObj value ) {
		schema = value;
	}

	public CFIntURLProtocolBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFBamSchema)schema.getBackingStore()).getTableURLProtocol().readDerivedByIdIdx( ((ICFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredURLProtocolId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFIntURLProtocolBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFIntURLProtocolBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFIntURLProtocolBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public CFIntURLProtocolBuff getURLProtocolBuff() {
		return( (CFIntURLProtocolBuff)getBuff() );
	}

	public CFIntURLProtocolPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFBamSchema)schema.getBackingStore()).getFactoryURLProtocol().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFIntURLProtocolPKey value ) {
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

	public ICFIntURLProtocolEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFIntURLProtocolObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFIntURLProtocolObj)this;
		}
		else {
			lockobj = ((ICFBamSchemaObj)schema).getURLProtocolTableObj().lockURLProtocol( getPKey() );
		}
		edit = ((ICFBamSchemaObj)schema).getURLProtocolTableObj().newEditInstance( lockobj );
		return( (ICFIntURLProtocolEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFIntURLProtocolEditObj getEdit() {
		return( edit );
	}

	public ICFIntURLProtocolEditObj getEditAsURLProtocol() {
		return( (ICFIntURLProtocolEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFIntURLProtocolBuff buff = getBuff();
			createdBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFIntURLProtocolBuff buff = getBuff();
			updatedBy = ((ICFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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

// Description: Java 11 base object instance implementation for YCFBam ISOTZone.

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

public class YCFBamISOTZoneObj
	implements IYCFBamISOTZoneObj
{
	public final static String CLASS_CODE = "a008";
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected IYCFSecISOTZoneEditObj edit;
	protected IYCFSecSchemaObj schema;
	protected YCFSecISOTZonePKey pKey;
	protected YCFSecISOTZoneBuff buff;

	public YCFBamISOTZoneObj() {
		isNew = true;
	}

	public YCFBamISOTZoneObj( IYCFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOTZone" );
	}

	public IYCFLibAnyObj getScope() {
		return( null );
	}

	public IYCFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredTZName();
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

	public IYCFSecISOTZoneObj realise() {
		IYCFSecISOTZoneObj retobj = ((IYCFBamSchemaObj)schema).getISOTZoneTableObj().realiseISOTZone(
			(IYCFSecISOTZoneObj)this );
		return( (IYCFSecISOTZoneObj)retobj );
	}

	public void forget() {
		((IYCFBamSchemaObj)schema).getISOTZoneTableObj().reallyDeepDisposeISOTZone( (IYCFSecISOTZoneObj)this );
	}

	public IYCFSecISOTZoneObj read() {
		IYCFSecISOTZoneObj retobj = ((IYCFBamSchemaObj)schema).getISOTZoneTableObj().readISOTZoneByIdIdx( getPKey().getRequiredISOTZoneId(), false );
		return( (IYCFSecISOTZoneObj)retobj );
	}

	public IYCFSecISOTZoneObj read( boolean forceRead ) {
		IYCFSecISOTZoneObj retobj = ((IYCFBamSchemaObj)schema).getISOTZoneTableObj().readISOTZoneByIdIdx( getPKey().getRequiredISOTZoneId(), forceRead );
		return( (IYCFSecISOTZoneObj)retobj );
	}

	public IYCFSecISOTZoneTableObj getISOTZoneTable() {
		return( ((IYCFBamSchemaObj)schema).getISOTZoneTableObj() );
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = value;
	}

	public YCFSecISOTZoneBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFBamSchema)schema.getBackingStore()).getFactoryISOTZone().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFBamSchema)schema.getBackingStore()).getTableISOTZone().readDerivedByIdIdx( ((IYCFBamSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOTZoneId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFSecISOTZoneBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFSecISOTZoneBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFSecISOTZoneBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public YCFSecISOTZoneBuff getISOTZoneBuff() {
		return( (YCFSecISOTZoneBuff)getBuff() );
	}

	public YCFSecISOTZonePKey getPKey() {
		if( pKey == null ) {
			pKey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey();
		}
		return( pKey );
	}

	public void setPKey( YCFSecISOTZonePKey value ) {
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

	public IYCFSecISOTZoneEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFSecISOTZoneObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFSecISOTZoneObj)this;
		}
		else {
			lockobj = ((IYCFBamSchemaObj)schema).getISOTZoneTableObj().lockISOTZone( getPKey() );
		}
		edit = ((IYCFBamSchemaObj)schema).getISOTZoneTableObj().newEditInstance( lockobj );
		return( (IYCFSecISOTZoneEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public IYCFSecISOTZoneEditObj getEdit() {
		return( edit );
	}

	public IYCFSecISOTZoneEditObj getEditAsISOTZone() {
		return( (IYCFSecISOTZoneEditObj)edit );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOTZoneBuff buff = getBuff();
			createdBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOTZoneBuff buff = getBuff();
			updatedBy = ((IYCFBamSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public short getRequiredISOTZoneId() {
		return( getPKey().getRequiredISOTZoneId() );
	}

	public String getRequiredIso8601() {
		return( getISOTZoneBuff().getRequiredIso8601() );
	}

	public String getRequiredTZName() {
		return( getISOTZoneBuff().getRequiredTZName() );
	}

	public short getRequiredTZHourOffset() {
		return( getISOTZoneBuff().getRequiredTZHourOffset() );
	}

	public short getRequiredTZMinOffset() {
		return( getISOTZoneBuff().getRequiredTZMinOffset() );
	}

	public String getRequiredDescription() {
		return( getISOTZoneBuff().getRequiredDescription() );
	}

	public boolean getRequiredVisible() {
		return( getISOTZoneBuff().getRequiredVisible() );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOTZoneId( getPKey().getRequiredISOTZoneId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOTZoneId( buff.getRequiredISOTZoneId() );
	}
}

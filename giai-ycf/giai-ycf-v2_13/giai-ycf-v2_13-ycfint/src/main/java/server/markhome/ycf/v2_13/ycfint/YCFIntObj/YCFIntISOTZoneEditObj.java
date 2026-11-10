// Description: Java 11 edit object instance implementation for YCFInt ISOTZone.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntISOTZoneEditObj
	implements IYCFIntISOTZoneEditObj
{
	protected IYCFSecISOTZoneObj orig;
	protected YCFSecISOTZoneBuff buff;
	protected IYCFSecSecUserObj createdBy = null;
	protected IYCFSecSecUserObj updatedBy = null;

	public YCFIntISOTZoneEditObj( IYCFSecISOTZoneObj argOrig ) {
		orig = argOrig;
		getBuff();
		YCFSecISOTZoneBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public IYCFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			YCFSecISOTZoneBuff buff = getBuff();
			createdBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public IYCFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			YCFSecISOTZoneBuff buff = getBuff();
			updatedBy = ((IYCFIntSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
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
		return( YCFIntISOTZoneObj.CLASS_CODE );
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
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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
				if( container instanceof IYCFIntClusterObj ) {
					break;
				}
				else if( container instanceof IYCFIntTenantObj ) {
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
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFSecISOTZoneObj retobj = getSchema().getISOTZoneTableObj().realiseISOTZone( (IYCFIntISOTZoneObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsISOTZone().forget();
	}

	public IYCFSecISOTZoneObj read() {
		IYCFSecISOTZoneObj retval = getOrigAsISOTZone().read();
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOTZoneObj read( boolean forceRead ) {
		IYCFSecISOTZoneObj retval = getOrigAsISOTZone().read( forceRead );
		if( retval != orig ) {
			throw new YCFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public IYCFSecISOTZoneObj create() {
		copyBuffToOrig();
		IYCFSecISOTZoneObj retobj = ((IYCFIntSchemaObj)getOrigAsISOTZone().getSchema()).getISOTZoneTableObj().createISOTZone( getOrigAsISOTZone() );
		if( retobj == getOrigAsISOTZone() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFSecISOTZoneEditObj update() {
		getSchema().getISOTZoneTableObj().updateISOTZone( (IYCFSecISOTZoneObj)this );
		return( null );
	}

	public YCFSecISOTZoneEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getISOTZoneTableObj().deleteISOTZone( getOrigAsISOTZone() );
		return( null );
	}

	public IYCFSecISOTZoneTableObj getISOTZoneTable() {
		return( orig.getSchema().getISOTZoneTableObj() );
	}

	public IYCFSecISOTZoneEditObj getEdit() {
		return( (IYCFSecISOTZoneEditObj)this );
	}

	public IYCFSecISOTZoneEditObj getEditAsISOTZone() {
		return( (IYCFSecISOTZoneEditObj)this );
	}

	public IYCFSecISOTZoneEditObj beginEdit() {
		throw new YCFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public IYCFSecISOTZoneObj getOrig() {
		return( orig );
	}

	public IYCFSecISOTZoneObj getOrigAsISOTZone() {
		return( (IYCFSecISOTZoneObj)orig );
	}

	public IYCFSecSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public YCFSecISOTZoneBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFIntSchema)getOrigAsISOTZone().getSchema().getBackingStore()).getFactoryISOTZone().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFSecISOTZoneBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public YCFSecISOTZoneBuff getISOTZoneBuff() {
		return( (YCFSecISOTZoneBuff)getBuff() );
	}

	public YCFSecISOTZonePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( YCFSecISOTZonePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public short getRequiredISOTZoneId() {
		return( getPKey().getRequiredISOTZoneId() );
	}

	public String getRequiredIso8601() {
		return( getISOTZoneBuff().getRequiredIso8601() );
	}

	public void setRequiredIso8601( String value ) {
		if( getISOTZoneBuff().getRequiredIso8601() != value ) {
			getISOTZoneBuff().setRequiredIso8601( value );
		}
	}

	public String getRequiredTZName() {
		return( getISOTZoneBuff().getRequiredTZName() );
	}

	public void setRequiredTZName( String value ) {
		if( getISOTZoneBuff().getRequiredTZName() != value ) {
			getISOTZoneBuff().setRequiredTZName( value );
		}
	}

	public short getRequiredTZHourOffset() {
		return( getISOTZoneBuff().getRequiredTZHourOffset() );
	}

	public void setRequiredTZHourOffset( short value ) {
		if( getISOTZoneBuff().getRequiredTZHourOffset() != value ) {
			getISOTZoneBuff().setRequiredTZHourOffset( value );
		}
	}

	public short getRequiredTZMinOffset() {
		return( getISOTZoneBuff().getRequiredTZMinOffset() );
	}

	public void setRequiredTZMinOffset( short value ) {
		if( getISOTZoneBuff().getRequiredTZMinOffset() != value ) {
			getISOTZoneBuff().setRequiredTZMinOffset( value );
		}
	}

	public String getRequiredDescription() {
		return( getISOTZoneBuff().getRequiredDescription() );
	}

	public void setRequiredDescription( String value ) {
		if( getISOTZoneBuff().getRequiredDescription() != value ) {
			getISOTZoneBuff().setRequiredDescription( value );
		}
	}

	public boolean getRequiredVisible() {
		return( getISOTZoneBuff().getRequiredVisible() );
	}

	public void setRequiredVisible( boolean value ) {
		if( getISOTZoneBuff().getRequiredVisible() != value ) {
			getISOTZoneBuff().setRequiredVisible( value );
		}
	}

	public void copyPKeyToBuff() {
		buff.setRequiredISOTZoneId( getPKey().getRequiredISOTZoneId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOTZoneId( buff.getRequiredISOTZoneId() );
	}

	public void copyBuffToOrig() {
		YCFSecISOTZoneBuff origBuff = getOrigAsISOTZone().getISOTZoneBuff();
		YCFSecISOTZoneBuff myBuff = getISOTZoneBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFSecISOTZoneBuff origBuff = getOrigAsISOTZone().getISOTZoneBuff();
		YCFSecISOTZoneBuff myBuff = getISOTZoneBuff();
		myBuff.set( origBuff );
	}
}

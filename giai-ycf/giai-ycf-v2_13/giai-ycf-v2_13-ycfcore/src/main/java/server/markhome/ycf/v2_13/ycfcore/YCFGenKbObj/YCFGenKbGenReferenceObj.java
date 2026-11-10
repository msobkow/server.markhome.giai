// Description: Java 11 base object instance implementation for YCFGenKb GenReference.

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

public class YCFGenKbGenReferenceObj
	extends YCFGenKbGenItemObj
	implements IYCFGenKbGenReferenceObj
{
	public final static String CLASS_CODE = "a922";

	public YCFGenKbGenReferenceObj() {
		super();
	}

	public YCFGenKbGenReferenceObj( IYCFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenReference" );
	}

	public IYCFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public IYCFLibAnyObj getObjScope() {
		return( super.getObjScope() );
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

	public IYCFGenKbGenItemObj realise() {
		IYCFGenKbGenReferenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj().realiseGenReference(
			(IYCFGenKbGenReferenceObj)this );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public void forget() {
		((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj().reallyDeepDisposeGenReference( (IYCFGenKbGenReferenceObj)this );
	}

	public IYCFGenKbGenItemObj read() {
		IYCFGenKbGenReferenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj().readGenReferenceByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), false );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenItemObj read( boolean forceRead ) {
		IYCFGenKbGenReferenceObj retobj = ((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj().readGenReferenceByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), forceRead );
		return( (IYCFGenKbGenItemObj)retobj );
	}

	public IYCFGenKbGenReferenceTableObj getGenReferenceTable() {
		return( ((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj() );
	}

	public YCFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGenReference().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGenReference().readDerivedByItemIdIdx( ((IYCFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredCartridgeId(),
						getPKey().getRequiredItemId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( YCFGenKbGenItemBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof YCFGenKbGenReferenceBuff ) ) ) {
			throw new YCFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"YCFGenKbGenReferenceBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerCartridge = null;
		requiredLookupRuleType = null;
		requiredLookupToolSet = null;
		optionalLookupScopeDef = null;
		requiredLookupGenDef = null;
		optionalLookupProbe = null;
	}

	public YCFGenKbGenReferenceBuff getGenReferenceBuff() {
		return( (YCFGenKbGenReferenceBuff)getBuff() );
	}

	public IYCFGenKbGenItemEditObj beginEdit() {
		if( edit != null ) {
			throw new YCFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		IYCFGenKbGenReferenceObj lockobj;
		if( getIsNew() ) {
			lockobj = (IYCFGenKbGenReferenceObj)this;
		}
		else {
			lockobj = ((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj().lockGenReference( getPKey() );
		}
		edit = ((IYCFGenKbSchemaObj)schema).getGenReferenceTableObj().newEditInstance( lockobj );
		return( (IYCFGenKbGenItemEditObj)edit );
	}

	public IYCFGenKbGenReferenceEditObj getEditAsGenReference() {
		return( (IYCFGenKbGenReferenceEditObj)edit );
	}
}

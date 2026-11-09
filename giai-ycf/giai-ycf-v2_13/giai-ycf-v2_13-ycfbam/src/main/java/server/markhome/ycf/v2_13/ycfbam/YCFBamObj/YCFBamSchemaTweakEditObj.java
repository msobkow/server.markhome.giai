// Description: Java 11 edit object instance implementation for CFBam SchemaTweak.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
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

public class CFBamSchemaTweakEditObj
	extends CFBamTweakEditObj

	implements ICFBamSchemaTweakEditObj
{
	protected ICFBamSchemaDefObj requiredContainerSchemaDef;

	public CFBamSchemaTweakEditObj( ICFBamSchemaTweakObj argOrig ) {
		super( argOrig );
		requiredContainerSchemaDef = null;
	}

	public String getClassCode() {
		return( CFBamSchemaTweakObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SchemaTweak" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamSchemaDefObj scope = getRequiredContainerSchemaDef();
		return( scope );
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
			else if( container instanceof ICFBamSchemaDefObj ) {
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

	public ICFBamTweakObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamSchemaTweakObj retobj = getSchema().getSchemaTweakTableObj().realiseSchemaTweak( (ICFBamSchemaTweakObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSchemaTweak().forget();
	}

	public ICFBamTweakObj create() {
		copyBuffToOrig();
		ICFBamSchemaTweakObj retobj = ((ICFBamSchemaObj)getOrigAsSchemaTweak().getSchema()).getSchemaTweakTableObj().createSchemaTweak( getOrigAsSchemaTweak() );
		if( retobj == getOrigAsSchemaTweak() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamTweakEditObj update() {
		getSchema().getSchemaTweakTableObj().updateSchemaTweak( (ICFBamSchemaTweakObj)this );
		return( null );
	}

	public CFBamTweakEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSchemaTweakTableObj().deleteSchemaTweak( getOrigAsSchemaTweak() );
		return( null );
	}

	public ICFBamSchemaTweakTableObj getSchemaTweakTable() {
		return( orig.getSchema().getSchemaTweakTableObj() );
	}

	public ICFBamSchemaTweakEditObj getEditAsSchemaTweak() {
		return( (ICFBamSchemaTweakEditObj)this );
	}

	public ICFBamSchemaTweakObj getOrigAsSchemaTweak() {
		return( (ICFBamSchemaTweakObj)orig );
	}

	public CFBamTweakBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsSchemaTweak().getSchema().getBackingStore()).getFactorySchemaTweak().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamTweakBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerSchemaDef = null;
		}
	}

	public CFBamSchemaTweakBuff getSchemaTweakBuff() {
		return( (CFBamSchemaTweakBuff)getBuff() );
	}

	public long getRequiredSchemaDefId() {
		return( getSchemaTweakBuff().getRequiredSchemaDefId() );
	}

	public void setRequiredContainerScopeDef( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamSchemaTweakEditObj.setRequiredContainerScopeDef() ";
		if( value == null ) {
			setRequiredContainerSchemaDef( null );
		}
		else if( ! ( value instanceof ICFBamSchemaDefObj ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScopeDef",
				"value",
				value,
				"ICFBamSchemaDefObj" );
		}
		else {
			setRequiredContainerSchemaDef( (ICFBamSchemaDefObj)value );
		}
	}

	public ICFBamSchemaDefObj getRequiredContainerSchemaDef() {
		return( getRequiredContainerSchemaDef( false ) );
	}

	public ICFBamSchemaDefObj getRequiredContainerSchemaDef( boolean forceRead ) {
		if( forceRead || ( requiredContainerSchemaDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamSchemaDefObj obj = ((ICFBamSchemaObj)getOrigAsSchemaTweak().getSchema()).getSchemaDefTableObj().readSchemaDefByIdIdx( getPKey().getRequiredTenantId(),
					getSchemaTweakBuff().getRequiredSchemaDefId() );
				requiredContainerSchemaDef = obj;
				if( obj != null ) {
					getSchemaTweakBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getSchemaTweakBuff().setRequiredSchemaDefId( obj.getRequiredId() );
					requiredContainerSchemaDef = obj;
				}
			}
		}
		return( requiredContainerSchemaDef );
	}

	public void setRequiredContainerSchemaDef( ICFBamSchemaDefObj value ) {
			if( buff == null ) {
				getSchemaTweakBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getSchemaTweakBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getSchemaTweakBuff().setRequiredSchemaDefId( value.getRequiredId() );
			}
			requiredContainerSchemaDef = value;
			super.setRequiredContainerScopeDef( value );
	}

	public void copyBuffToOrig() {
		CFBamSchemaTweakBuff origBuff = getOrigAsSchemaTweak().getSchemaTweakBuff();
		CFBamSchemaTweakBuff myBuff = getSchemaTweakBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamSchemaTweakBuff origBuff = getOrigAsSchemaTweak().getSchemaTweakBuff();
		CFBamSchemaTweakBuff myBuff = getSchemaTweakBuff();
		myBuff.set( origBuff );
	}
}

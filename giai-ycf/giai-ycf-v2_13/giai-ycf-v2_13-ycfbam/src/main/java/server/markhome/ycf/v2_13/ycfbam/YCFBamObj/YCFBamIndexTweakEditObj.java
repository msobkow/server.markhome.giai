// Description: Java 11 edit object instance implementation for CFBam IndexTweak.

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

public class CFBamIndexTweakEditObj
	extends CFBamTweakEditObj

	implements ICFBamIndexTweakEditObj
{
	protected ICFBamIndexObj requiredContainerIndexDef;

	public CFBamIndexTweakEditObj( ICFBamIndexTweakObj argOrig ) {
		super( argOrig );
		requiredContainerIndexDef = null;
	}

	public String getClassCode() {
		return( CFBamIndexTweakObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "IndexTweak" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamIndexObj scope = getRequiredContainerIndexDef();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamIndexObj scope = getRequiredContainerIndexDef();
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
		ICFBamIndexTweakObj retobj = getSchema().getIndexTweakTableObj().realiseIndexTweak( (ICFBamIndexTweakObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsIndexTweak().forget();
	}

	public ICFBamTweakObj create() {
		copyBuffToOrig();
		ICFBamIndexTweakObj retobj = ((ICFBamSchemaObj)getOrigAsIndexTweak().getSchema()).getIndexTweakTableObj().createIndexTweak( getOrigAsIndexTweak() );
		if( retobj == getOrigAsIndexTweak() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamTweakEditObj update() {
		getSchema().getIndexTweakTableObj().updateIndexTweak( (ICFBamIndexTweakObj)this );
		return( null );
	}

	public CFBamTweakEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getIndexTweakTableObj().deleteIndexTweak( getOrigAsIndexTweak() );
		return( null );
	}

	public ICFBamIndexTweakTableObj getIndexTweakTable() {
		return( orig.getSchema().getIndexTweakTableObj() );
	}

	public ICFBamIndexTweakEditObj getEditAsIndexTweak() {
		return( (ICFBamIndexTweakEditObj)this );
	}

	public ICFBamIndexTweakObj getOrigAsIndexTweak() {
		return( (ICFBamIndexTweakObj)orig );
	}

	public CFBamTweakBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsIndexTweak().getSchema().getBackingStore()).getFactoryIndexTweak().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamTweakBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerIndexDef = null;
		}
	}

	public CFBamIndexTweakBuff getIndexTweakBuff() {
		return( (CFBamIndexTweakBuff)getBuff() );
	}

	public long getRequiredIndexId() {
		return( getIndexTweakBuff().getRequiredIndexId() );
	}

	public void setRequiredContainerScopeDef( ICFBamScopeObj value ) {
		final String S_ProcName = "CFBamIndexTweakEditObj.setRequiredContainerScopeDef() ";
		if( value == null ) {
			setRequiredContainerIndexDef( null );
		}
		else if( ! ( value instanceof ICFBamIndexObj ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setRequiredContainerScopeDef",
				"value",
				value,
				"ICFBamIndexObj" );
		}
		else {
			setRequiredContainerIndexDef( (ICFBamIndexObj)value );
		}
	}

	public ICFBamIndexObj getRequiredContainerIndexDef() {
		return( getRequiredContainerIndexDef( false ) );
	}

	public ICFBamIndexObj getRequiredContainerIndexDef( boolean forceRead ) {
		if( forceRead || ( requiredContainerIndexDef == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamIndexObj obj = ((ICFBamSchemaObj)getOrigAsIndexTweak().getSchema()).getIndexTableObj().readIndexByIdIdx( getPKey().getRequiredTenantId(),
					getIndexTweakBuff().getRequiredIndexId() );
				requiredContainerIndexDef = obj;
				if( obj != null ) {
					getIndexTweakBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getIndexTweakBuff().setRequiredIndexId( obj.getRequiredId() );
					requiredContainerIndexDef = obj;
				}
			}
		}
		return( requiredContainerIndexDef );
	}

	public void setRequiredContainerIndexDef( ICFBamIndexObj value ) {
			if( buff == null ) {
				getIndexTweakBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexTweakBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getIndexTweakBuff().setRequiredIndexId( value.getRequiredId() );
			}
			requiredContainerIndexDef = value;
			super.setRequiredContainerScopeDef( value );
	}

	public void copyBuffToOrig() {
		CFBamIndexTweakBuff origBuff = getOrigAsIndexTweak().getIndexTweakBuff();
		CFBamIndexTweakBuff myBuff = getIndexTweakBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamIndexTweakBuff origBuff = getOrigAsIndexTweak().getIndexTweakBuff();
		CFBamIndexTweakBuff myBuff = getIndexTweakBuff();
		myBuff.set( origBuff );
	}
}

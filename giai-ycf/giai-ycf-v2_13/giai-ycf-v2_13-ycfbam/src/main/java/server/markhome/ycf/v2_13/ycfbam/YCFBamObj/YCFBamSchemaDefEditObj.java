// Description: Java 11 edit object instance implementation for YCFBam SchemaDef.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
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
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
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

public class YCFBamSchemaDefEditObj
	extends YCFBamScopeEditObj

	implements IYCFBamSchemaDefEditObj
{
	protected IYCFIntMinorVersionObj requiredContainerMinorVersion;
	protected IYCFSecTenantObj requiredOwnerCTenant;

	public YCFBamSchemaDefEditObj( IYCFBamSchemaDefObj argOrig ) {
		super( argOrig );
		requiredContainerMinorVersion = null;
		requiredOwnerCTenant = null;
	}

	public String getClassCode() {
		return( YCFBamSchemaDefObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SchemaDef" );
	}

	public IYCFLibAnyObj getScope() {
		IYCFIntMinorVersionObj scope = getRequiredContainerMinorVersion();
		return( scope );
	}

	public IYCFLibAnyObj getObjScope() {
		IYCFIntMinorVersionObj scope = getRequiredContainerMinorVersion();
		return( scope );
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
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTableTableObj().readTableByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getValueTableObj().readValueByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getTweakTableObj().readTweakByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
		}
		if( subObj == null ) {
			subObj = ((IYCFBamSchemaObj)getSchema()).getSchemaRoleTableObj().readSchemaRoleByUNameIdx( getRequiredTenantId(),
				getRequiredId(),
				nextName, false );
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
			else if( container instanceof IYCFBamSubProjectObj ) {
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

	public IYCFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		IYCFBamSchemaDefObj retobj = getSchema().getSchemaDefTableObj().realiseSchemaDef( (IYCFBamSchemaDefObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSchemaDef().forget();
	}

	public IYCFBamScopeObj create() {
		copyBuffToOrig();
		IYCFBamSchemaDefObj retobj = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getSchemaDefTableObj().createSchemaDef( getOrigAsSchemaDef() );
		if( retobj == getOrigAsSchemaDef() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public YCFBamScopeEditObj update() {
		getSchema().getSchemaDefTableObj().updateSchemaDef( (IYCFBamSchemaDefObj)this );
		return( null );
	}

	public YCFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new YCFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSchemaDefTableObj().deleteSchemaDef( getOrigAsSchemaDef() );
		return( null );
	}

	public IYCFBamSchemaDefTableObj getSchemaDefTable() {
		return( orig.getSchema().getSchemaDefTableObj() );
	}

	public IYCFBamSchemaDefEditObj getEditAsSchemaDef() {
		return( (IYCFBamSchemaDefEditObj)this );
	}

	public IYCFBamSchemaDefObj getOrigAsSchemaDef() {
		return( (IYCFBamSchemaDefObj)orig );
	}

	public YCFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((IYCFBamSchema)getOrigAsSchemaDef().getSchema().getBackingStore()).getFactorySchemaDef().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( YCFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerMinorVersion = null;
			requiredOwnerCTenant = null;
		}
	}

	public YCFBamSchemaDefBuff getSchemaDefBuff() {
		return( (YCFBamSchemaDefBuff)getBuff() );
	}

	public long getRequiredMinorVersionId() {
		return( getSchemaDefBuff().getRequiredMinorVersionId() );
	}

	public String getRequiredName() {
		return( getSchemaDefBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getSchemaDefBuff().getRequiredName() != value ) {
			getSchemaDefBuff().setRequiredName( value );
		}
	}

	public String getOptionalDbName() {
		return( getSchemaDefBuff().getOptionalDbName() );
	}

	public void setOptionalDbName( String value ) {
		if( getSchemaDefBuff().getOptionalDbName() != value ) {
			getSchemaDefBuff().setOptionalDbName( value );
		}
	}

	public String getOptionalShortName() {
		return( getSchemaDefBuff().getOptionalShortName() );
	}

	public void setOptionalShortName( String value ) {
		if( getSchemaDefBuff().getOptionalShortName() != value ) {
			getSchemaDefBuff().setOptionalShortName( value );
		}
	}

	public String getOptionalLabel() {
		return( getSchemaDefBuff().getOptionalLabel() );
	}

	public void setOptionalLabel( String value ) {
		if( getSchemaDefBuff().getOptionalLabel() != value ) {
			getSchemaDefBuff().setOptionalLabel( value );
		}
	}

	public String getOptionalShortDescription() {
		return( getSchemaDefBuff().getOptionalShortDescription() );
	}

	public void setOptionalShortDescription( String value ) {
		if( getSchemaDefBuff().getOptionalShortDescription() != value ) {
			getSchemaDefBuff().setOptionalShortDescription( value );
		}
	}

	public String getOptionalDescription() {
		return( getSchemaDefBuff().getOptionalDescription() );
	}

	public void setOptionalDescription( String value ) {
		if( getSchemaDefBuff().getOptionalDescription() != value ) {
			getSchemaDefBuff().setOptionalDescription( value );
		}
	}

	public String getRequiredCopyrightPeriod() {
		return( getSchemaDefBuff().getRequiredCopyrightPeriod() );
	}

	public void setRequiredCopyrightPeriod( String value ) {
		if( getSchemaDefBuff().getRequiredCopyrightPeriod() != value ) {
			getSchemaDefBuff().setRequiredCopyrightPeriod( value );
		}
	}

	public String getRequiredCopyrightHolder() {
		return( getSchemaDefBuff().getRequiredCopyrightHolder() );
	}

	public void setRequiredCopyrightHolder( String value ) {
		if( getSchemaDefBuff().getRequiredCopyrightHolder() != value ) {
			getSchemaDefBuff().setRequiredCopyrightHolder( value );
		}
	}

	public String getRequiredAuthorEMail() {
		return( getSchemaDefBuff().getRequiredAuthorEMail() );
	}

	public void setRequiredAuthorEMail( String value ) {
		if( getSchemaDefBuff().getRequiredAuthorEMail() != value ) {
			getSchemaDefBuff().setRequiredAuthorEMail( value );
		}
	}

	public String getRequiredProjectURL() {
		return( getSchemaDefBuff().getRequiredProjectURL() );
	}

	public void setRequiredProjectURL( String value ) {
		if( getSchemaDefBuff().getRequiredProjectURL() != value ) {
			getSchemaDefBuff().setRequiredProjectURL( value );
		}
	}

	public String getRequiredPublishURI() {
		return( getSchemaDefBuff().getRequiredPublishURI() );
	}

	public void setRequiredPublishURI( String value ) {
		if( getSchemaDefBuff().getRequiredPublishURI() != value ) {
			getSchemaDefBuff().setRequiredPublishURI( value );
		}
	}

	public String getRequiredCommonLicenseCode() {
		return( getSchemaDefBuff().getRequiredCommonLicenseCode() );
	}

	public void setRequiredCommonLicenseCode( String value ) {
		if( getSchemaDefBuff().getRequiredCommonLicenseCode() != value ) {
			getSchemaDefBuff().setRequiredCommonLicenseCode( value );
		}
	}

	public String getRequiredCommonLicenseName() {
		return( getSchemaDefBuff().getRequiredCommonLicenseName() );
	}

	public void setRequiredCommonLicenseName( String value ) {
		if( getSchemaDefBuff().getRequiredCommonLicenseName() != value ) {
			getSchemaDefBuff().setRequiredCommonLicenseName( value );
		}
	}

	public String getRequiredCommonLicenseText() {
		return( getSchemaDefBuff().getRequiredCommonLicenseText() );
	}

	public void setRequiredCommonLicenseText( String value ) {
		if( getSchemaDefBuff().getRequiredCommonLicenseText() != value ) {
			getSchemaDefBuff().setRequiredCommonLicenseText( value );
		}
	}

	public String getOptionalClientXFaceLicenseCode() {
		return( getSchemaDefBuff().getOptionalClientXFaceLicenseCode() );
	}

	public void setOptionalClientXFaceLicenseCode( String value ) {
		if( getSchemaDefBuff().getOptionalClientXFaceLicenseCode() != value ) {
			getSchemaDefBuff().setOptionalClientXFaceLicenseCode( value );
		}
	}

	public String getOptionalClientXFaceLicenseName() {
		return( getSchemaDefBuff().getOptionalClientXFaceLicenseName() );
	}

	public void setOptionalClientXFaceLicenseName( String value ) {
		if( getSchemaDefBuff().getOptionalClientXFaceLicenseName() != value ) {
			getSchemaDefBuff().setOptionalClientXFaceLicenseName( value );
		}
	}

	public String getOptionalClientXFaceLicenseText() {
		return( getSchemaDefBuff().getOptionalClientXFaceLicenseText() );
	}

	public void setOptionalClientXFaceLicenseText( String value ) {
		if( getSchemaDefBuff().getOptionalClientXFaceLicenseText() != value ) {
			getSchemaDefBuff().setOptionalClientXFaceLicenseText( value );
		}
	}

	public String getOptionalClientImplLicenseCode() {
		return( getSchemaDefBuff().getOptionalClientImplLicenseCode() );
	}

	public void setOptionalClientImplLicenseCode( String value ) {
		if( getSchemaDefBuff().getOptionalClientImplLicenseCode() != value ) {
			getSchemaDefBuff().setOptionalClientImplLicenseCode( value );
		}
	}

	public String getOptionalClientImplLicenseName() {
		return( getSchemaDefBuff().getOptionalClientImplLicenseName() );
	}

	public void setOptionalClientImplLicenseName( String value ) {
		if( getSchemaDefBuff().getOptionalClientImplLicenseName() != value ) {
			getSchemaDefBuff().setOptionalClientImplLicenseName( value );
		}
	}

	public String getOptionalClientImplLicenseText() {
		return( getSchemaDefBuff().getOptionalClientImplLicenseText() );
	}

	public void setOptionalClientImplLicenseText( String value ) {
		if( getSchemaDefBuff().getOptionalClientImplLicenseText() != value ) {
			getSchemaDefBuff().setOptionalClientImplLicenseText( value );
		}
	}

	public String getOptionalServerXFaceLicenseCode() {
		return( getSchemaDefBuff().getOptionalServerXFaceLicenseCode() );
	}

	public void setOptionalServerXFaceLicenseCode( String value ) {
		if( getSchemaDefBuff().getOptionalServerXFaceLicenseCode() != value ) {
			getSchemaDefBuff().setOptionalServerXFaceLicenseCode( value );
		}
	}

	public String getOptionalServerXFaceLicenseName() {
		return( getSchemaDefBuff().getOptionalServerXFaceLicenseName() );
	}

	public void setOptionalServerXFaceLicenseName( String value ) {
		if( getSchemaDefBuff().getOptionalServerXFaceLicenseName() != value ) {
			getSchemaDefBuff().setOptionalServerXFaceLicenseName( value );
		}
	}

	public String getOptionalServerXFaceLicenseText() {
		return( getSchemaDefBuff().getOptionalServerXFaceLicenseText() );
	}

	public void setOptionalServerXFaceLicenseText( String value ) {
		if( getSchemaDefBuff().getOptionalServerXFaceLicenseText() != value ) {
			getSchemaDefBuff().setOptionalServerXFaceLicenseText( value );
		}
	}

	public String getOptionalServerImplLicenseCode() {
		return( getSchemaDefBuff().getOptionalServerImplLicenseCode() );
	}

	public void setOptionalServerImplLicenseCode( String value ) {
		if( getSchemaDefBuff().getOptionalServerImplLicenseCode() != value ) {
			getSchemaDefBuff().setOptionalServerImplLicenseCode( value );
		}
	}

	public String getOptionalServerImplLicenseName() {
		return( getSchemaDefBuff().getOptionalServerImplLicenseName() );
	}

	public void setOptionalServerImplLicenseName( String value ) {
		if( getSchemaDefBuff().getOptionalServerImplLicenseName() != value ) {
			getSchemaDefBuff().setOptionalServerImplLicenseName( value );
		}
	}

	public String getOptionalServerImplLicenseText() {
		return( getSchemaDefBuff().getOptionalServerImplLicenseText() );
	}

	public void setOptionalServerImplLicenseText( String value ) {
		if( getSchemaDefBuff().getOptionalServerImplLicenseText() != value ) {
			getSchemaDefBuff().setOptionalServerImplLicenseText( value );
		}
	}

	public String getOptionalJSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJSchemaObjImport() );
	}

	public void setOptionalJSchemaObjImport( String value ) {
		if( getSchemaDefBuff().getOptionalJSchemaObjImport() != value ) {
			getSchemaDefBuff().setOptionalJSchemaObjImport( value );
		}
	}

	public String getOptionalJSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalJSchemaObjInterface() );
	}

	public void setOptionalJSchemaObjInterface( String value ) {
		if( getSchemaDefBuff().getOptionalJSchemaObjInterface() != value ) {
			getSchemaDefBuff().setOptionalJSchemaObjInterface( value );
		}
	}

	public String getOptionalJSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJSchemaObjMembers() );
	}

	public void setOptionalJSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalJSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalJSchemaObjMembers( value );
		}
	}

	public String getOptionalJSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalJSchemaObjImplementation() );
	}

	public void setOptionalJSchemaObjImplementation( String value ) {
		if( getSchemaDefBuff().getOptionalJSchemaObjImplementation() != value ) {
			getSchemaDefBuff().setOptionalJSchemaObjImplementation( value );
		}
	}

	public String getOptionalJDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjMembers() );
	}

	public void setOptionalJDb2LUWSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalJDb2LUWSchemaObjMembers( value );
		}
	}

	public String getOptionalJDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjImpl() );
	}

	public void setOptionalJDb2LUWSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalJDb2LUWSchemaObjImpl( value );
		}
	}

	public String getOptionalJDb2LUWSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjImport() );
	}

	public void setOptionalJDb2LUWSchemaObjImport( String value ) {
		if( getSchemaDefBuff().getOptionalJDb2LUWSchemaObjImport() != value ) {
			getSchemaDefBuff().setOptionalJDb2LUWSchemaObjImport( value );
		}
	}

	public String getOptionalJMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJMSSqlSchemaObjMembers() );
	}

	public void setOptionalJMSSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalJMSSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalJMSSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalJMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJMSSqlSchemaObjImpl() );
	}

	public void setOptionalJMSSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalJMSSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalJMSSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalJMSSqlSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJMSSqlSchemaObjImport() );
	}

	public void setOptionalJMSSqlSchemaObjImport( String value ) {
		if( getSchemaDefBuff().getOptionalJMSSqlSchemaObjImport() != value ) {
			getSchemaDefBuff().setOptionalJMSSqlSchemaObjImport( value );
		}
	}

	public String getOptionalJMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJMySqlSchemaObjMembers() );
	}

	public void setOptionalJMySqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalJMySqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalJMySqlSchemaObjMembers( value );
		}
	}

	public String getOptionalJMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJMySqlSchemaObjImpl() );
	}

	public void setOptionalJMySqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalJMySqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalJMySqlSchemaObjImpl( value );
		}
	}

	public String getOptionalJMySqlSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJMySqlSchemaObjImport() );
	}

	public void setOptionalJMySqlSchemaObjImport( String value ) {
		if( getSchemaDefBuff().getOptionalJMySqlSchemaObjImport() != value ) {
			getSchemaDefBuff().setOptionalJMySqlSchemaObjImport( value );
		}
	}

	public String getOptionalJOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJOracleSchemaObjMembers() );
	}

	public void setOptionalJOracleSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalJOracleSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalJOracleSchemaObjMembers( value );
		}
	}

	public String getOptionalJOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJOracleSchemaObjImpl() );
	}

	public void setOptionalJOracleSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalJOracleSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalJOracleSchemaObjImpl( value );
		}
	}

	public String getOptionalJOracleSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJOracleSchemaObjImport() );
	}

	public void setOptionalJOracleSchemaObjImport( String value ) {
		if( getSchemaDefBuff().getOptionalJOracleSchemaObjImport() != value ) {
			getSchemaDefBuff().setOptionalJOracleSchemaObjImport( value );
		}
	}

	public String getOptionalJPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJPgSqlSchemaObjMembers() );
	}

	public void setOptionalJPgSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalJPgSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalJPgSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalJPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJPgSqlSchemaObjImpl() );
	}

	public void setOptionalJPgSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalJPgSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalJPgSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalJPgSqlSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJPgSqlSchemaObjImport() );
	}

	public void setOptionalJPgSqlSchemaObjImport( String value ) {
		if( getSchemaDefBuff().getOptionalJPgSqlSchemaObjImport() != value ) {
			getSchemaDefBuff().setOptionalJPgSqlSchemaObjImport( value );
		}
	}

	public String getOptionalJRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalJRamSchemaObjMembers() );
	}

	public void setOptionalJRamSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalJRamSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalJRamSchemaObjMembers( value );
		}
	}

	public String getOptionalJRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalJRamSchemaObjImpl() );
	}

	public void setOptionalJRamSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalJRamSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalJRamSchemaObjImpl( value );
		}
	}

	public String getOptionalJRamSchemaObjImport() {
		return( getSchemaDefBuff().getOptionalJRamSchemaObjImport() );
	}

	public void setOptionalJRamSchemaObjImport( String value ) {
		if( getSchemaDefBuff().getOptionalJRamSchemaObjImport() != value ) {
			getSchemaDefBuff().setOptionalJRamSchemaObjImport( value );
		}
	}

	public String getOptionalJXMsgSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgSchemaImport() );
	}

	public void setOptionalJXMsgSchemaImport( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgSchemaImport() != value ) {
			getSchemaDefBuff().setOptionalJXMsgSchemaImport( value );
		}
	}

	public String getOptionalJXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalJXMsgSchemaFormatters() );
	}

	public void setOptionalJXMsgSchemaFormatters( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgSchemaFormatters() != value ) {
			getSchemaDefBuff().setOptionalJXMsgSchemaFormatters( value );
		}
	}

	public String getOptionalJXMsgClientSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgClientSchemaImport() );
	}

	public void setOptionalJXMsgClientSchemaImport( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgClientSchemaImport() != value ) {
			getSchemaDefBuff().setOptionalJXMsgClientSchemaImport( value );
		}
	}

	public String getOptionalJXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalJXMsgClientSchemaBody() );
	}

	public void setOptionalJXMsgClientSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgClientSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalJXMsgClientSchemaBody( value );
		}
	}

	public String getOptionalJXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaBody() );
	}

	public void setOptionalJXMsgRqstSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRqstSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRqstSchemaBody( value );
		}
	}

	public String getOptionalJXMsgRqstSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaImport() );
	}

	public void setOptionalJXMsgRqstSchemaImport( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRqstSchemaImport() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRqstSchemaImport( value );
		}
	}

	public String getOptionalJXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaWireParsers() );
	}

	public void setOptionalJXMsgRqstSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRqstSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRqstSchemaWireParsers( value );
		}
	}

	public String getOptionalJXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaXsdSpec() );
	}

	public void setOptionalJXMsgRqstSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRqstSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRqstSchemaXsdSpec( value );
		}
	}

	public String getOptionalJXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalJXMsgRqstSchemaXsdElementList() );
	}

	public void setOptionalJXMsgRqstSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRqstSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRqstSchemaXsdElementList( value );
		}
	}

	public String getOptionalJXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaBody() );
	}

	public void setOptionalJXMsgRspnSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRspnSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRspnSchemaBody( value );
		}
	}

	public String getOptionalJXMsgRspnSchemaImport() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaImport() );
	}

	public void setOptionalJXMsgRspnSchemaImport( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRspnSchemaImport() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRspnSchemaImport( value );
		}
	}

	public String getOptionalJXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaWireParsers() );
	}

	public void setOptionalJXMsgRspnSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRspnSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRspnSchemaWireParsers( value );
		}
	}

	public String getOptionalJXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaXsdElementList() );
	}

	public void setOptionalJXMsgRspnSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRspnSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRspnSchemaXsdElementList( value );
		}
	}

	public String getOptionalJXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalJXMsgRspnSchemaXsdSpec() );
	}

	public void setOptionalJXMsgRspnSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalJXMsgRspnSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalJXMsgRspnSchemaXsdSpec( value );
		}
	}

	public String getOptionalCppSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjInclude() );
	}

	public void setOptionalCppSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalCppSchemaObjInclude( value );
		}
	}

	public String getOptionalCppSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjInterface() );
	}

	public void setOptionalCppSchemaObjInterface( String value ) {
		if( getSchemaDefBuff().getOptionalCppSchemaObjInterface() != value ) {
			getSchemaDefBuff().setOptionalCppSchemaObjInterface( value );
		}
	}

	public String getOptionalCppSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjMembers() );
	}

	public void setOptionalCppSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCppSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCppSchemaObjMembers( value );
		}
	}

	public String getOptionalCppSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalCppSchemaObjImplementation() );
	}

	public void setOptionalCppSchemaObjImplementation( String value ) {
		if( getSchemaDefBuff().getOptionalCppSchemaObjImplementation() != value ) {
			getSchemaDefBuff().setOptionalCppSchemaObjImplementation( value );
		}
	}

	public String getOptionalCppDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjMembers() );
	}

	public void setOptionalCppDb2LUWSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCppDb2LUWSchemaObjMembers( value );
		}
	}

	public String getOptionalCppDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjImpl() );
	}

	public void setOptionalCppDb2LUWSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCppDb2LUWSchemaObjImpl( value );
		}
	}

	public String getOptionalCppDb2LUWSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjInclude() );
	}

	public void setOptionalCppDb2LUWSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppDb2LUWSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalCppDb2LUWSchemaObjInclude( value );
		}
	}

	public String getOptionalCppMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjMembers() );
	}

	public void setOptionalCppMSSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCppMSSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalCppMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjImpl() );
	}

	public void setOptionalCppMSSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCppMSSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalCppMSSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjInclude() );
	}

	public void setOptionalCppMSSqlSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppMSSqlSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalCppMSSqlSchemaObjInclude( value );
		}
	}

	public String getOptionalCppMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppMySqlSchemaObjMembers() );
	}

	public void setOptionalCppMySqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCppMySqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCppMySqlSchemaObjMembers( value );
		}
	}

	public String getOptionalCppMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppMySqlSchemaObjImpl() );
	}

	public void setOptionalCppMySqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCppMySqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCppMySqlSchemaObjImpl( value );
		}
	}

	public String getOptionalCppMySqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppMySqlSchemaObjInclude() );
	}

	public void setOptionalCppMySqlSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppMySqlSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalCppMySqlSchemaObjInclude( value );
		}
	}

	public String getOptionalCppOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppOracleSchemaObjMembers() );
	}

	public void setOptionalCppOracleSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCppOracleSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCppOracleSchemaObjMembers( value );
		}
	}

	public String getOptionalCppOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppOracleSchemaObjImpl() );
	}

	public void setOptionalCppOracleSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCppOracleSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCppOracleSchemaObjImpl( value );
		}
	}

	public String getOptionalCppOracleSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppOracleSchemaObjInclude() );
	}

	public void setOptionalCppOracleSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppOracleSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalCppOracleSchemaObjInclude( value );
		}
	}

	public String getOptionalCppPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjMembers() );
	}

	public void setOptionalCppPgSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCppPgSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalCppPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjImpl() );
	}

	public void setOptionalCppPgSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCppPgSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalCppPgSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjInclude() );
	}

	public void setOptionalCppPgSqlSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppPgSqlSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalCppPgSqlSchemaObjInclude( value );
		}
	}

	public String getOptionalCppRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCppRamSchemaObjMembers() );
	}

	public void setOptionalCppRamSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCppRamSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCppRamSchemaObjMembers( value );
		}
	}

	public String getOptionalCppRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCppRamSchemaObjImpl() );
	}

	public void setOptionalCppRamSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCppRamSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCppRamSchemaObjImpl( value );
		}
	}

	public String getOptionalCppRamSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalCppRamSchemaObjInclude() );
	}

	public void setOptionalCppRamSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppRamSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalCppRamSchemaObjInclude( value );
		}
	}

	public String getOptionalCppXMsgSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgSchemaInclude() );
	}

	public void setOptionalCppXMsgSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgSchemaInclude( value );
		}
	}

	public String getOptionalCppXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalCppXMsgSchemaFormatters() );
	}

	public void setOptionalCppXMsgSchemaFormatters( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgSchemaFormatters() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgSchemaFormatters( value );
		}
	}

	public String getOptionalCppXMsgClientSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgClientSchemaInclude() );
	}

	public void setOptionalCppXMsgClientSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgClientSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgClientSchemaInclude( value );
		}
	}

	public String getOptionalCppXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalCppXMsgClientSchemaBody() );
	}

	public void setOptionalCppXMsgClientSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgClientSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgClientSchemaBody( value );
		}
	}

	public String getOptionalCppXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaBody() );
	}

	public void setOptionalCppXMsgRqstSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRqstSchemaBody( value );
		}
	}

	public String getOptionalCppXMsgRqstSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaInclude() );
	}

	public void setOptionalCppXMsgRqstSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRqstSchemaInclude( value );
		}
	}

	public String getOptionalCppXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaWireParsers() );
	}

	public void setOptionalCppXMsgRqstSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRqstSchemaWireParsers( value );
		}
	}

	public String getOptionalCppXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaXsdSpec() );
	}

	public void setOptionalCppXMsgRqstSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRqstSchemaXsdSpec( value );
		}
	}

	public String getOptionalCppXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaXsdElementList() );
	}

	public void setOptionalCppXMsgRqstSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRqstSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRqstSchemaXsdElementList( value );
		}
	}

	public String getOptionalCppXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaBody() );
	}

	public void setOptionalCppXMsgRspnSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRspnSchemaBody( value );
		}
	}

	public String getOptionalCppXMsgRspnSchemaInclude() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaInclude() );
	}

	public void setOptionalCppXMsgRspnSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRspnSchemaInclude( value );
		}
	}

	public String getOptionalCppXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaWireParsers() );
	}

	public void setOptionalCppXMsgRspnSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRspnSchemaWireParsers( value );
		}
	}

	public String getOptionalCppXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaXsdElementList() );
	}

	public void setOptionalCppXMsgRspnSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRspnSchemaXsdElementList( value );
		}
	}

	public String getOptionalCppXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaXsdSpec() );
	}

	public void setOptionalCppXMsgRspnSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalCppXMsgRspnSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalCppXMsgRspnSchemaXsdSpec( value );
		}
	}

	public String getOptionalHppSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjInclude() );
	}

	public void setOptionalHppSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalHppSchemaObjInclude( value );
		}
	}

	public String getOptionalHppSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjInterface() );
	}

	public void setOptionalHppSchemaObjInterface( String value ) {
		if( getSchemaDefBuff().getOptionalHppSchemaObjInterface() != value ) {
			getSchemaDefBuff().setOptionalHppSchemaObjInterface( value );
		}
	}

	public String getOptionalHppSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjMembers() );
	}

	public void setOptionalHppSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalHppSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalHppSchemaObjMembers( value );
		}
	}

	public String getOptionalHppSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalHppSchemaObjImplementation() );
	}

	public void setOptionalHppSchemaObjImplementation( String value ) {
		if( getSchemaDefBuff().getOptionalHppSchemaObjImplementation() != value ) {
			getSchemaDefBuff().setOptionalHppSchemaObjImplementation( value );
		}
	}

	public String getOptionalHppDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjMembers() );
	}

	public void setOptionalHppDb2LUWSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalHppDb2LUWSchemaObjMembers( value );
		}
	}

	public String getOptionalHppDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjImpl() );
	}

	public void setOptionalHppDb2LUWSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalHppDb2LUWSchemaObjImpl( value );
		}
	}

	public String getOptionalHppDb2LUWSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjInclude() );
	}

	public void setOptionalHppDb2LUWSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppDb2LUWSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalHppDb2LUWSchemaObjInclude( value );
		}
	}

	public String getOptionalHppMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjMembers() );
	}

	public void setOptionalHppMSSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalHppMSSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalHppMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjImpl() );
	}

	public void setOptionalHppMSSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalHppMSSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalHppMSSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjInclude() );
	}

	public void setOptionalHppMSSqlSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppMSSqlSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalHppMSSqlSchemaObjInclude( value );
		}
	}

	public String getOptionalHppMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppMySqlSchemaObjMembers() );
	}

	public void setOptionalHppMySqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalHppMySqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalHppMySqlSchemaObjMembers( value );
		}
	}

	public String getOptionalHppMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppMySqlSchemaObjImpl() );
	}

	public void setOptionalHppMySqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalHppMySqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalHppMySqlSchemaObjImpl( value );
		}
	}

	public String getOptionalHppMySqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppMySqlSchemaObjInclude() );
	}

	public void setOptionalHppMySqlSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppMySqlSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalHppMySqlSchemaObjInclude( value );
		}
	}

	public String getOptionalHppOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppOracleSchemaObjMembers() );
	}

	public void setOptionalHppOracleSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalHppOracleSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalHppOracleSchemaObjMembers( value );
		}
	}

	public String getOptionalHppOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppOracleSchemaObjImpl() );
	}

	public void setOptionalHppOracleSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalHppOracleSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalHppOracleSchemaObjImpl( value );
		}
	}

	public String getOptionalHppOracleSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppOracleSchemaObjInclude() );
	}

	public void setOptionalHppOracleSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppOracleSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalHppOracleSchemaObjInclude( value );
		}
	}

	public String getOptionalHppPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjMembers() );
	}

	public void setOptionalHppPgSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalHppPgSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalHppPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjImpl() );
	}

	public void setOptionalHppPgSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalHppPgSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalHppPgSqlSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjInclude() );
	}

	public void setOptionalHppPgSqlSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppPgSqlSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalHppPgSqlSchemaObjInclude( value );
		}
	}

	public String getOptionalHppRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalHppRamSchemaObjMembers() );
	}

	public void setOptionalHppRamSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalHppRamSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalHppRamSchemaObjMembers( value );
		}
	}

	public String getOptionalHppRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalHppRamSchemaObjImpl() );
	}

	public void setOptionalHppRamSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalHppRamSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalHppRamSchemaObjImpl( value );
		}
	}

	public String getOptionalHppRamSchemaObjInclude() {
		return( getSchemaDefBuff().getOptionalHppRamSchemaObjInclude() );
	}

	public void setOptionalHppRamSchemaObjInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppRamSchemaObjInclude() != value ) {
			getSchemaDefBuff().setOptionalHppRamSchemaObjInclude( value );
		}
	}

	public String getOptionalHppXMsgSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgSchemaInclude() );
	}

	public void setOptionalHppXMsgSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgSchemaInclude( value );
		}
	}

	public String getOptionalHppXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalHppXMsgSchemaFormatters() );
	}

	public void setOptionalHppXMsgSchemaFormatters( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgSchemaFormatters() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgSchemaFormatters( value );
		}
	}

	public String getOptionalHppXMsgClientSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgClientSchemaInclude() );
	}

	public void setOptionalHppXMsgClientSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgClientSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgClientSchemaInclude( value );
		}
	}

	public String getOptionalHppXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalHppXMsgClientSchemaBody() );
	}

	public void setOptionalHppXMsgClientSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgClientSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgClientSchemaBody( value );
		}
	}

	public String getOptionalHppXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaBody() );
	}

	public void setOptionalHppXMsgRqstSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRqstSchemaBody( value );
		}
	}

	public String getOptionalHppXMsgRqstSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaInclude() );
	}

	public void setOptionalHppXMsgRqstSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRqstSchemaInclude( value );
		}
	}

	public String getOptionalHppXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaWireParsers() );
	}

	public void setOptionalHppXMsgRqstSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRqstSchemaWireParsers( value );
		}
	}

	public String getOptionalHppXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaXsdSpec() );
	}

	public void setOptionalHppXMsgRqstSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRqstSchemaXsdSpec( value );
		}
	}

	public String getOptionalHppXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaXsdElementList() );
	}

	public void setOptionalHppXMsgRqstSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRqstSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRqstSchemaXsdElementList( value );
		}
	}

	public String getOptionalHppXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaBody() );
	}

	public void setOptionalHppXMsgRspnSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRspnSchemaBody( value );
		}
	}

	public String getOptionalHppXMsgRspnSchemaInclude() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaInclude() );
	}

	public void setOptionalHppXMsgRspnSchemaInclude( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaInclude() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRspnSchemaInclude( value );
		}
	}

	public String getOptionalHppXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaWireParsers() );
	}

	public void setOptionalHppXMsgRspnSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRspnSchemaWireParsers( value );
		}
	}

	public String getOptionalHppXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaXsdElementList() );
	}

	public void setOptionalHppXMsgRspnSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRspnSchemaXsdElementList( value );
		}
	}

	public String getOptionalHppXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaXsdSpec() );
	}

	public void setOptionalHppXMsgRspnSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalHppXMsgRspnSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalHppXMsgRspnSchemaXsdSpec( value );
		}
	}

	public String getOptionalCsSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjUsing() );
	}

	public void setOptionalCsSchemaObjUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsSchemaObjUsing() != value ) {
			getSchemaDefBuff().setOptionalCsSchemaObjUsing( value );
		}
	}

	public String getOptionalCsSchemaObjInterface() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjInterface() );
	}

	public void setOptionalCsSchemaObjInterface( String value ) {
		if( getSchemaDefBuff().getOptionalCsSchemaObjInterface() != value ) {
			getSchemaDefBuff().setOptionalCsSchemaObjInterface( value );
		}
	}

	public String getOptionalCsSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjMembers() );
	}

	public void setOptionalCsSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCsSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCsSchemaObjMembers( value );
		}
	}

	public String getOptionalCsSchemaObjImplementation() {
		return( getSchemaDefBuff().getOptionalCsSchemaObjImplementation() );
	}

	public void setOptionalCsSchemaObjImplementation( String value ) {
		if( getSchemaDefBuff().getOptionalCsSchemaObjImplementation() != value ) {
			getSchemaDefBuff().setOptionalCsSchemaObjImplementation( value );
		}
	}

	public String getOptionalCsDb2LUWSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjMembers() );
	}

	public void setOptionalCsDb2LUWSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCsDb2LUWSchemaObjMembers( value );
		}
	}

	public String getOptionalCsDb2LUWSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjImpl() );
	}

	public void setOptionalCsDb2LUWSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCsDb2LUWSchemaObjImpl( value );
		}
	}

	public String getOptionalCsDb2LUWSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjUsing() );
	}

	public void setOptionalCsDb2LUWSchemaObjUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsDb2LUWSchemaObjUsing() != value ) {
			getSchemaDefBuff().setOptionalCsDb2LUWSchemaObjUsing( value );
		}
	}

	public String getOptionalCsMSSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjMembers() );
	}

	public void setOptionalCsMSSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCsMSSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalCsMSSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjImpl() );
	}

	public void setOptionalCsMSSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCsMSSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalCsMSSqlSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjUsing() );
	}

	public void setOptionalCsMSSqlSchemaObjUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsMSSqlSchemaObjUsing() != value ) {
			getSchemaDefBuff().setOptionalCsMSSqlSchemaObjUsing( value );
		}
	}

	public String getOptionalCsMySqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsMySqlSchemaObjMembers() );
	}

	public void setOptionalCsMySqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCsMySqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCsMySqlSchemaObjMembers( value );
		}
	}

	public String getOptionalCsMySqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsMySqlSchemaObjImpl() );
	}

	public void setOptionalCsMySqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCsMySqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCsMySqlSchemaObjImpl( value );
		}
	}

	public String getOptionalCsMySqlSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsMySqlSchemaObjUsing() );
	}

	public void setOptionalCsMySqlSchemaObjUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsMySqlSchemaObjUsing() != value ) {
			getSchemaDefBuff().setOptionalCsMySqlSchemaObjUsing( value );
		}
	}

	public String getOptionalCsOracleSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsOracleSchemaObjMembers() );
	}

	public void setOptionalCsOracleSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCsOracleSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCsOracleSchemaObjMembers( value );
		}
	}

	public String getOptionalCsOracleSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsOracleSchemaObjImpl() );
	}

	public void setOptionalCsOracleSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCsOracleSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCsOracleSchemaObjImpl( value );
		}
	}

	public String getOptionalCsOracleSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsOracleSchemaObjUsing() );
	}

	public void setOptionalCsOracleSchemaObjUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsOracleSchemaObjUsing() != value ) {
			getSchemaDefBuff().setOptionalCsOracleSchemaObjUsing( value );
		}
	}

	public String getOptionalCsPgSqlSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjMembers() );
	}

	public void setOptionalCsPgSqlSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCsPgSqlSchemaObjMembers( value );
		}
	}

	public String getOptionalCsPgSqlSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjImpl() );
	}

	public void setOptionalCsPgSqlSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCsPgSqlSchemaObjImpl( value );
		}
	}

	public String getOptionalCsPgSqlSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjUsing() );
	}

	public void setOptionalCsPgSqlSchemaObjUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsPgSqlSchemaObjUsing() != value ) {
			getSchemaDefBuff().setOptionalCsPgSqlSchemaObjUsing( value );
		}
	}

	public String getOptionalCsRamSchemaObjMembers() {
		return( getSchemaDefBuff().getOptionalCsRamSchemaObjMembers() );
	}

	public void setOptionalCsRamSchemaObjMembers( String value ) {
		if( getSchemaDefBuff().getOptionalCsRamSchemaObjMembers() != value ) {
			getSchemaDefBuff().setOptionalCsRamSchemaObjMembers( value );
		}
	}

	public String getOptionalCsRamSchemaObjImpl() {
		return( getSchemaDefBuff().getOptionalCsRamSchemaObjImpl() );
	}

	public void setOptionalCsRamSchemaObjImpl( String value ) {
		if( getSchemaDefBuff().getOptionalCsRamSchemaObjImpl() != value ) {
			getSchemaDefBuff().setOptionalCsRamSchemaObjImpl( value );
		}
	}

	public String getOptionalCsRamSchemaObjUsing() {
		return( getSchemaDefBuff().getOptionalCsRamSchemaObjUsing() );
	}

	public void setOptionalCsRamSchemaObjUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsRamSchemaObjUsing() != value ) {
			getSchemaDefBuff().setOptionalCsRamSchemaObjUsing( value );
		}
	}

	public String getOptionalCsXMsgSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgSchemaUsing() );
	}

	public void setOptionalCsXMsgSchemaUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgSchemaUsing() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgSchemaUsing( value );
		}
	}

	public String getOptionalCsXMsgSchemaFormatters() {
		return( getSchemaDefBuff().getOptionalCsXMsgSchemaFormatters() );
	}

	public void setOptionalCsXMsgSchemaFormatters( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgSchemaFormatters() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgSchemaFormatters( value );
		}
	}

	public String getOptionalCsXMsgClientSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgClientSchemaUsing() );
	}

	public void setOptionalCsXMsgClientSchemaUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgClientSchemaUsing() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgClientSchemaUsing( value );
		}
	}

	public String getOptionalCsXMsgClientSchemaBody() {
		return( getSchemaDefBuff().getOptionalCsXMsgClientSchemaBody() );
	}

	public void setOptionalCsXMsgClientSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgClientSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgClientSchemaBody( value );
		}
	}

	public String getOptionalCsXMsgRqstSchemaBody() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaBody() );
	}

	public void setOptionalCsXMsgRqstSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRqstSchemaBody( value );
		}
	}

	public String getOptionalCsXMsgRqstSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaUsing() );
	}

	public void setOptionalCsXMsgRqstSchemaUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaUsing() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRqstSchemaUsing( value );
		}
	}

	public String getOptionalCsXMsgRqstSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaWireParsers() );
	}

	public void setOptionalCsXMsgRqstSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRqstSchemaWireParsers( value );
		}
	}

	public String getOptionalCsXMsgRqstSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaXsdSpec() );
	}

	public void setOptionalCsXMsgRqstSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRqstSchemaXsdSpec( value );
		}
	}

	public String getOptionalCsXMsgRqstSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaXsdElementList() );
	}

	public void setOptionalCsXMsgRqstSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRqstSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRqstSchemaXsdElementList( value );
		}
	}

	public String getOptionalCsXMsgRspnSchemaBody() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaBody() );
	}

	public void setOptionalCsXMsgRspnSchemaBody( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaBody() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRspnSchemaBody( value );
		}
	}

	public String getOptionalCsXMsgRspnSchemaUsing() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaUsing() );
	}

	public void setOptionalCsXMsgRspnSchemaUsing( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaUsing() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRspnSchemaUsing( value );
		}
	}

	public String getOptionalCsXMsgRspnSchemaWireParsers() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaWireParsers() );
	}

	public void setOptionalCsXMsgRspnSchemaWireParsers( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaWireParsers() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRspnSchemaWireParsers( value );
		}
	}

	public String getOptionalCsXMsgRspnSchemaXsdElementList() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaXsdElementList() );
	}

	public void setOptionalCsXMsgRspnSchemaXsdElementList( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaXsdElementList() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRspnSchemaXsdElementList( value );
		}
	}

	public String getOptionalCsXMsgRspnSchemaXsdSpec() {
		return( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaXsdSpec() );
	}

	public void setOptionalCsXMsgRspnSchemaXsdSpec( String value ) {
		if( getSchemaDefBuff().getOptionalCsXMsgRspnSchemaXsdSpec() != value ) {
			getSchemaDefBuff().setOptionalCsXMsgRspnSchemaXsdSpec( value );
		}
	}

	public IYCFIntMinorVersionObj getRequiredContainerMinorVersion() {
		return( getRequiredContainerMinorVersion( false ) );
	}

	public IYCFIntMinorVersionObj getRequiredContainerMinorVersion( boolean forceRead ) {
		if( forceRead || ( requiredContainerMinorVersion == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFIntMinorVersionObj obj = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getMinorVersionTableObj().readMinorVersionByIdIdx( getPKey().getRequiredTenantId(),
					getSchemaDefBuff().getRequiredMinorVersionId() );
				requiredContainerMinorVersion = obj;
				if( obj != null ) {
					getSchemaDefBuff().setRequiredTenantId( obj.getRequiredTenantId() );
					getSchemaDefBuff().setRequiredMinorVersionId( obj.getRequiredId() );
					requiredContainerMinorVersion = obj;
				}
			}
		}
		return( requiredContainerMinorVersion );
	}

	public void setRequiredContainerMinorVersion( IYCFIntMinorVersionObj value ) {
			if( buff == null ) {
				getSchemaDefBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredTenantId() );
				getSchemaDefBuff().setRequiredTenantId( value.getRequiredTenantId() );
				getSchemaDefBuff().setRequiredMinorVersionId( value.getRequiredId() );
			}
			requiredContainerMinorVersion = value;
	}

	public List<IYCFBamTableObj> getOptionalComponentsTables() {
		List<IYCFBamTableObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getTableTableObj().readTableBySchemaDefIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamTableObj> getOptionalComponentsTables( boolean forceRead ) {
		List<IYCFBamTableObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getTableTableObj().readTableBySchemaDefIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamValueObj> getOptionalComponentsTypes() {
		List<IYCFBamValueObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getValueTableObj().readValueByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamValueObj> getOptionalComponentsTypes( boolean forceRead ) {
		List<IYCFBamValueObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getValueTableObj().readValueByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamSchemaRefObj> getOptionalComponentsSchemaRefs() {
		List<IYCFBamSchemaRefObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getSchemaRefTableObj().readSchemaRefBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamSchemaRefObj> getOptionalComponentsSchemaRefs( boolean forceRead ) {
		List<IYCFBamSchemaRefObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getSchemaRefTableObj().readSchemaRefBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamTweakObj> getOptionalComponentsTweaks() {
		List<IYCFBamTweakObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getTweakTableObj().readTweakByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamTweakObj> getOptionalComponentsTweaks( boolean forceRead ) {
		List<IYCFBamTweakObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getTweakTableObj().readTweakByScopeIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public List<IYCFBamSchemaRoleObj> getOptionalComponentsRoles() {
		List<IYCFBamSchemaRoleObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getSchemaRoleTableObj().readSchemaRoleBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<IYCFBamSchemaRoleObj> getOptionalComponentsRoles( boolean forceRead ) {
		List<IYCFBamSchemaRoleObj> retval;
		retval = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getSchemaRoleTableObj().readSchemaRoleBySchemaIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public IYCFSecTenantObj getRequiredOwnerCTenant() {
		return( getRequiredOwnerCTenant( false ) );
	}

	public IYCFSecTenantObj getRequiredOwnerCTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerCTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				IYCFSecTenantObj obj = ((IYCFBamSchemaObj)getOrigAsSchemaDef().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerCTenant = obj;
			}
		}
		return( requiredOwnerCTenant );
	}

	public void setRequiredOwnerCTenant( IYCFSecTenantObj value ) {
			if( buff == null ) {
				getSchemaDefBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getSchemaDefBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerCTenant = value;
			super.setRequiredOwnerTenant( value );
	}

	public void copyBuffToOrig() {
		YCFBamSchemaDefBuff origBuff = getOrigAsSchemaDef().getSchemaDefBuff();
		YCFBamSchemaDefBuff myBuff = getSchemaDefBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		YCFBamSchemaDefBuff origBuff = getOrigAsSchemaDef().getSchemaDefBuff();
		YCFBamSchemaDefBuff myBuff = getSchemaDefBuff();
		myBuff.set( origBuff );
	}
}

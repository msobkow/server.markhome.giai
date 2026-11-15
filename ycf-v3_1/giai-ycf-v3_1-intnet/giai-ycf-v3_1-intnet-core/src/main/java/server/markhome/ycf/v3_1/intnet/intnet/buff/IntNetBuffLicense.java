// Description: Java 25 implementation of a License buffer

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.intnet.intnet.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;

public class IntNetBuffLicense
	implements IIntNetLicense, Comparable<Object>, Serializable
{
	protected ICFKeyHash256 requiredId;
	protected int requiredRevision;
	protected ICFKeyHash256 requiredTenantId;
	protected ICFKeyHash256 requiredTopDomainId;
	protected String requiredName;
	protected String optionalDescription;
	protected String optionalEmbeddedText;
	protected String optionalFullText;

	public BusModelBuffLicense() {
		requiredId = CFDbKeyHash256.fromHex( IIntNetPubLicense.ID_INIT_VALUE.toString() );
		requiredTenantId = CFDbKeyHash256.fromHex( IIntNetPubLicense.TENANTID_INIT_VALUE.toString() );
		requiredTopDomainId = CFDbKeyHash256.fromHex( IIntNetPubLicense.TOPDOMAINID_INIT_VALUE.toString() );
		requiredName = IIntNetPubLicense.NAME_INIT_VALUE;
		optionalDescription = null;
		optionalEmbeddedText = null;
		optionalFullText = null;
	}

	@Override
	public $implCommaIJavaOptAtomType$ getPKey() {
		return (requiredId);
	}

	@Override
	public void setPKey($implCommaIJavaOptAtomType$ requiredId) {
		if(requiredId != null) {
			this.requiredId = requiredId;
		}
	}

	@Override
	public ICFKeyHash256 getRequiredId() {
		return(requiredId);
	}

	public void setRequiredId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredId",
				1,
				"value" );
		}
		requiredId = value;
	}

	@Override
	public int getRequiredRevision() {
		return( requiredRevision );
	}

	@Override
	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	@Override
	public int getClassCode() {
		return( IIntNetLicense.CLASS_CODE );
	}

	@Override
	public ISecureTenant getRequiredOwnerTenant() {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerTenant", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureTenantTable targetTable = targetBackingSecure.getTableTenant();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredOwnerTenant", 0, "ISecureSchema.getBackingSecure().getTableTenant()");
		}
		ISecurePubTenant targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTenantId());
		return(targetRec);
	}

	@Override
	public void setRequiredOwnerTenant(ICFKeyHash256 argTenantId) {
		ISecureSchema targetBackingSecure = ISecureSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant-args", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureTenantTable targetTable = targetBackingSecure.getTableTenant();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant", 0, "ISecureSchema.getBackingSecure()");
		}
		ISecureTenant found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTenantId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredOwnerTenant-args", 0, "found");
		}
		else if ((found instanceof ISecureTenant) || (found instanceof ISecureProtTenant) || (found instanceof ISecurePubTenant)) {
		requiredTenantId = argTenantId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredOwnerTenant-args", "found", found, "ISecureTenantISecureProtTenantISecurePubTenant");
		}
	}

	@Override
	public IIntNetTopDomain getRequiredContainerTopDomain() {
		IIntNetSchema targetBackingIntNet = IIntNetSchema.getBackingIntNet();
		if (targetBackingIntNet == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTopDomain", 0, "IIntNetSchema.getBackingIntNet()");
		}
		IIntNetTopDomainTable targetTable = targetBackingIntNet.getTableTopDomain();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTopDomain", 0, "IIntNetSchema.getBackingIntNet().getTableTopDomain()");
		}
		IIntNetTopDomain targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTopDomainId());
		return(targetRec);
	}

	@Override
	public IIntNetTopDomain getRequiredContainerTopDomain() {
		IIntNetSchema targetBackingIntNet = IIntNetSchema.getBackingIntNet();
		if (targetBackingIntNet == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTopDomain", 0, "IIntNetSchema.getBackingIntNet()");
		}
		IIntNetTopDomainTable targetTable = targetBackingIntNet.getTableTopDomain();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTopDomain", 0, "IIntNetSchema.getBackingIntNet().getTableTopDomain()");
		}
		IIntNetTopDomain targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTopDomainId());
		return(targetRec);
	}

	@Override
	public IIntNetTopDomain getRequiredContainerTopDomain() {
		IIntNetSchema targetBackingIntNet = IIntNetSchema.getBackingIntNet();
		if (targetBackingIntNet == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTopDomain", 0, "IIntNetSchema.getBackingIntNet()");
		}
		IIntNetTopDomainTable targetTable = targetBackingIntNet.getTableTopDomain();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getRequiredContainerTopDomain", 0, "IIntNetSchema.getBackingIntNet().getTableTopDomain()");
		}
		IIntNetPubTopDomain targetRec = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTopDomainId());
		return(targetRec);
	}

	@Override
	public void setRequiredContainerTopDomain(ICFKeyHash256 argTopDomainId) {
		IIntNetSchema targetBackingIntNet = IIntNetSchema.getBackingIntNet();
		if (targetBackingIntNet == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTopDomain-args", 0, "IIntNetSchema.getBackingIntNet()");
		}
		IIntNetTopDomainTable targetTable = targetBackingIntNet.getTableTopDomain();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTopDomain", 0, "IIntNetSchema.getBackingIntNet()");
		}
		IIntNetTopDomain found = targetTable.readDerived(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argTopDomainId);
		if (found == null) {
			throw new CFNullArgumentException(getClass(), "setRequiredContainerTopDomain-args", 0, "found");
		}
		else if ((found instanceof IIntNetTopDomain) || (found instanceof IIntNetProtTopDomain) || (found instanceof IIntNetPubTopDomain)) {
		requiredTopDomainId = argTopDomainId;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setRequiredContainerTopDomain-args", "found", found, "IIntNetTopDomainIIntNetProtTopDomainIIntNetPubTopDomain");
		}
	}

	@Override
	public void setRequiredContainerTopDomain(IIntNetTopDomain argObj) {
		if(argObj == null) {
			throw new CFNullArgumentException(getClass(), "setContainerTopDomain", 1, "argObj");
		}
		else {
			setRequiredTopDomainId(argObj.getRequiredId());
		}
	}

	@Override
	public ICFKeyHash256 getRequiredTenantId() {
		return(requiredTenantId);
	}

	public void setRequiredTenantId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTenantId",
				1,
				"value" );
		}
		requiredTenantId = value;
	}

	@Override
	public ICFKeyHash256 getRequiredTopDomainId() {
		return(requiredTopDomainId);
	}

	public void setRequiredTopDomainId( ICFKeyHash256 value ) {
		if( value == null || value.isNull() ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTopDomainId",
				1,
				"value" );
		}
		requiredTopDomainId = value;
	}

	@Override
	public String getRequiredName() {
		return(requiredName);
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredName = value;
	}

	@Override
	public String getOptionalDescription() {
		return(optionalDescription);
	}

	public void setOptionalDescription( String value ) {
		if( value != null && value.length() > 1024 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalDescription",
				1,
				"value.length()",
				value.length(),
				1024 );
		}
		optionalDescription = value;
	}

	@Override
	public String getOptionalEmbeddedText() {
		return(optionalEmbeddedText);
	}

	public void setOptionalEmbeddedText( String value ) {
		if( value != null && value.length() > 8000 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalEmbeddedText",
				1,
				"value.length()",
				value.length(),
				8000 );
		}
		optionalEmbeddedText = value;
	}

	@Override
	public String getOptionalFullText() {
		return(optionalFullText);
	}

	public void setOptionalFullText( String value ) {
		if( value != null && value.length() > 8000 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalFullText",
				1,
				"value.length()",
				value.length(),
				8000 );
		}
		optionalFullText = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof IIntNetLicense rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					if( ! getOptionalEmbeddedText().equals( rhs.getOptionalEmbeddedText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( false );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					if( ! getOptionalFullText().equals( rhs.getOptionalFullText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					if( ! getOptionalEmbeddedText().equals( rhs.getOptionalEmbeddedText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( false );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					if( ! getOptionalFullText().equals( rhs.getOptionalFullText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseHPKey ) {
			IIntNetLicenseHPKey rhs = (IIntNetLicenseHPKey)obj;
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByLicnTenantIdxKey rhs ) {
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByDomainIdxKey rhs ) {
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByUNameIdxKey rhs ) {
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetProtLicense rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					if( ! getOptionalEmbeddedText().equals( rhs.getOptionalEmbeddedText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( false );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					if( ! getOptionalFullText().equals( rhs.getOptionalFullText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetProtLicenseH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					if( ! getOptionalEmbeddedText().equals( rhs.getOptionalEmbeddedText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( false );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					if( ! getOptionalFullText().equals( rhs.getOptionalFullText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetProtLicenseHPKey rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByLicnTenantIdxKey rhs ) {
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByDomainIdxKey rhs ) {
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByUNameIdxKey rhs ) {
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubLicense rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					if( ! getOptionalEmbeddedText().equals( rhs.getOptionalEmbeddedText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( false );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					if( ! getOptionalFullText().equals( rhs.getOptionalFullText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubLicenseH rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					if( ! getOptionalDescription().equals( rhs.getOptionalDescription() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( false );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					if( ! getOptionalEmbeddedText().equals( rhs.getOptionalEmbeddedText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( false );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					if( ! getOptionalFullText().equals( rhs.getOptionalFullText() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetPubLicenseHPKey rhs ) {
			if( getRequiredId() != null ) {
				if( rhs.getRequiredId() != null ) {
					if( ! getRequiredId().equals( rhs.getRequiredId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByLicnTenantIdxKey rhs ) {
			if( getRequiredTenantId() != null ) {
				if( rhs.getRequiredTenantId() != null ) {
					if( ! getRequiredTenantId().equals( rhs.getRequiredTenantId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTenantId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByDomainIdxKey rhs ) {
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof IIntNetLicenseByUNameIdxKey rhs ) {
			if( getRequiredTopDomainId() != null ) {
				if( rhs.getRequiredTopDomainId() != null ) {
					if( ! getRequiredTopDomainId().equals( rhs.getRequiredTopDomainId() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTopDomainId() != null ) {
					return( false );
				}
			}
			if( getRequiredName() != null ) {
				if( rhs.getRequiredName() != null ) {
					if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredId().hashCode();
		hashCode = hashCode + getRequiredTenantId().hashCode();
		hashCode = hashCode + getRequiredTopDomainId().hashCode();
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		if( getOptionalDescription() != null ) {
			hashCode = hashCode + getOptionalDescription().hashCode();
		}
		if( getOptionalEmbeddedText() != null ) {
			hashCode = hashCode + getOptionalEmbeddedText().hashCode();
		}
		if( getOptionalFullText() != null ) {
			hashCode = hashCode + getOptionalFullText().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof IIntNetLicense rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					cmp = getOptionalEmbeddedText().compareTo( rhs.getOptionalEmbeddedText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					cmp = getOptionalFullText().compareTo( rhs.getOptionalFullText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetLicenseHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetLicenseH rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					cmp = getOptionalEmbeddedText().compareTo( rhs.getOptionalEmbeddedText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					cmp = getOptionalFullText().compareTo( rhs.getOptionalFullText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetLicenseByLicnTenantIdxKey rhs ) {
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetLicenseByDomainIdxKey rhs ) {
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetLicenseByUNameIdxKey rhs ) {
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetProtLicense rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					cmp = getOptionalEmbeddedText().compareTo( rhs.getOptionalEmbeddedText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					cmp = getOptionalFullText().compareTo( rhs.getOptionalFullText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( -1 );
				}
			}
			return( 0 );
 		}
		else if( obj instanceof IIntNetProtLicenseHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetProtLicenseH rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					cmp = getOptionalEmbeddedText().compareTo( rhs.getOptionalEmbeddedText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					cmp = getOptionalFullText().compareTo( rhs.getOptionalFullText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetProtLicenseByLicnTenantIdxKey rhs ) {
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetProtLicenseByDomainIdxKey rhs ) {
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetProtLicenseByUNameIdxKey rhs ) {
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetPubLicense rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					cmp = getOptionalEmbeddedText().compareTo( rhs.getOptionalEmbeddedText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					cmp = getOptionalFullText().compareTo( rhs.getOptionalFullText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubLicenseHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubLicenseH rhs ) {
			cmp = 0;
			if (getRequiredId() != null) {
				if (rhs.getRequiredId() != null) {
					cmp = getRequiredId().compareTo( rhs.getRequiredId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredId() != null) {
				return( -1 );
			}
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}
			if( getOptionalDescription() != null ) {
				if( rhs.getOptionalDescription() != null ) {
					cmp = getOptionalDescription().compareTo( rhs.getOptionalDescription() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDescription() != null ) {
					return( -1 );
				}
			}
			if( getOptionalEmbeddedText() != null ) {
				if( rhs.getOptionalEmbeddedText() != null ) {
					cmp = getOptionalEmbeddedText().compareTo( rhs.getOptionalEmbeddedText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalEmbeddedText() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFullText() != null ) {
				if( rhs.getOptionalFullText() != null ) {
					cmp = getOptionalFullText().compareTo( rhs.getOptionalFullText() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFullText() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof IIntNetPubLicenseByLicnTenantIdxKey rhs ) {
			if (getRequiredTenantId() != null) {
				if (rhs.getRequiredTenantId() != null) {
					cmp = getRequiredTenantId().compareTo( rhs.getRequiredTenantId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTenantId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetPubLicenseByDomainIdxKey rhs ) {
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof IIntNetPubLicenseByUNameIdxKey rhs ) {
			if (getRequiredTopDomainId() != null) {
				if (rhs.getRequiredTopDomainId() != null) {
					cmp = getRequiredTopDomainId().compareTo( rhs.getRequiredTopDomainId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTopDomainId() != null) {
				return( -1 );
			}
			if (getRequiredName() != null) {
				if (rhs.getRequiredName() != null) {
					cmp = getRequiredName().compareTo( rhs.getRequiredName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public void set( IIntNetLicense src ) {
		setLicense( src );
	}

	@Override
	public void setLicense( IIntNetLicense src ) {
		setRequiredId(src.getRequiredId());
		setRequiredRevision( src.getRequiredRevision() );
		setRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setRequiredContainerTopDomain(src.getRequiredContainerTopDomain());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredTopDomainId(src.getRequiredTopDomainId());
		setRequiredName(src.getRequiredName());
		setOptionalDescription(src.getOptionalDescription());
		setOptionalEmbeddedText(src.getOptionalEmbeddedText());
		setOptionalFullText(src.getOptionalFullText());
	}

	@Override
	public void set( IIntNetLicenseH src ) {
		setLicense( src );
	}

	@Override
	public void setLicense( IIntNetLicenseH src ) {
		setRequiredId(src.getRequiredId());
		setRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setRequiredContainerTopDomain(src.getRequiredContainerTopDomain());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredTopDomainId(src.getRequiredTopDomainId());
		setRequiredName(src.getRequiredName());
		setOptionalDescription(src.getOptionalDescription());
		setOptionalEmbeddedText(src.getOptionalEmbeddedText());
		setOptionalFullText(src.getOptionalFullText());
	}

	@Override
	public void set( IIntNetProtLicense src ) {
		setLicense( src );
	}

	@Override
	public void setLicense( IIntNetProtLicense src ) {
		setRequiredId(src.getRequiredId());
		setRequiredRevision( src.getRequiredRevision() );
		setRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setRequiredContainerTopDomain(src.getRequiredContainerTopDomain());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredTopDomainId(src.getRequiredTopDomainId());
		setRequiredName(src.getRequiredName());
		setOptionalDescription(src.getOptionalDescription());
		setOptionalEmbeddedText(src.getOptionalEmbeddedText());
		setOptionalFullText(src.getOptionalFullText());
	}

	@Override
	public void set( IIntNetProtLicenseH src ) {
		setLicense( src );
	}

	@Override
	public void setLicense( IIntNetProtLicenseH src ) {
		setRequiredId(src.getRequiredId());
		setRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setRequiredContainerTopDomain(src.getRequiredContainerTopDomain());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredTopDomainId(src.getRequiredTopDomainId());
		setRequiredName(src.getRequiredName());
		setOptionalDescription(src.getOptionalDescription());
		setOptionalEmbeddedText(src.getOptionalEmbeddedText());
		setOptionalFullText(src.getOptionalFullText());
	}

	@Override
	public void set( IIntNetPubLicense src ) {
		setLicense( src );
	}

	@Override
	public void setLicense( IIntNetPubLicense src ) {
		setRequiredId(src.getRequiredId());
		setRequiredRevision( src.getRequiredRevision() );
		setRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setRequiredContainerTopDomain(src.getRequiredContainerTopDomain());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredTopDomainId(src.getRequiredTopDomainId());
		setRequiredName(src.getRequiredName());
		setOptionalDescription(src.getOptionalDescription());
		setOptionalEmbeddedText(src.getOptionalEmbeddedText());
		setOptionalFullText(src.getOptionalFullText());
	}

	@Override
	public void set( IIntNetPubLicenseH src ) {
		setLicense( src );
	}

	@Override
	public void setLicense( IIntNetPubLicenseH src ) {
		setRequiredId(src.getRequiredId());
		setRequiredOwnerTenant(src.getRequiredOwnerTenant());
		setRequiredContainerTopDomain(src.getRequiredContainerTopDomain());
		setRequiredTenantId(src.getRequiredTenantId());
		setRequiredTopDomainId(src.getRequiredTopDomainId());
		setRequiredName(src.getRequiredName());
		setOptionalDescription(src.getOptionalDescription());
		setOptionalEmbeddedText(src.getOptionalEmbeddedText());
		setOptionalFullText(src.getOptionalFullText());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = ""
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\""
			+ " RequiredId=" + "\"" + getRequiredId().toString() + "\""
			+ " RequiredTenantId=" + "\"" + getRequiredTenantId().toString() + "\""
			+ " RequiredTopDomainId=" + "\"" + getRequiredTopDomainId().toString() + "\""
			+ " RequiredName=" + "\"" + StringEscapeUtils.escapeXml11( getRequiredName() ) + "\""
			+ " OptionalDescription=" + ( ( getOptionalDescription() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalDescription() ) + "\"" )
			+ " OptionalEmbeddedText=" + ( ( getOptionalEmbeddedText() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalEmbeddedText() ) + "\"" )
			+ " OptionalFullText=" + ( ( getOptionalFullText() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalFullText() ) + "\"" );
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<IntNetBuffLicense" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}

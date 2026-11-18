// Description: Java 25 public interface for a Tweak history object

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

package server.markhome.ycf.v3_1.intnet.intnetpub;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
//import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;

/**
 *	IBusModelPubTweakH provides access to public history records matching the BusModelPubTweak object change history.
 */
public interface IBusModelPubTweakH
{
	public int getClassCode();

	public CFDbKeyHash256 getCreatedByUserId();
	public void setCreatedByUserId( CFDbKeyHash256 value );
	public LocalDateTime getCreatedAt();
	public void setCreatedAt( LocalDateTime value );
	public CFDbKeyHash256 getUpdatedByUserId();
	public void setUpdatedByUserId( CFDbKeyHash256 value );
	public LocalDateTime getUpdatedAt();
	public void setUpdatedAt( LocalDateTime value );

	public IBusModelPubTweakHPKey getPubPKey();
	public void setPubPKey( IBusModelPubTweakHPKey pkey );
	public CFDbKeyHash256 getAuditClusterId();
	public void setAuditClusterId(CFDbKeyHash256 auditClusterId);
	public LocalDateTime getAuditStamp();
	public void setAuditStamp(LocalDateTime auditStamp);
	public short getAuditActionId();
	public void setAuditActionId(short auditActionId);
	public int getRequiredRevision();
	public void setRequiredRevision(int revision);
	public CFDbKeyHash256 getAuditSessionId();
	public void setAuditSessionId(CFDbKeyHash256 auditSessionId);

	public ICFKeyHash256 getRequiredId();
	public void setRequiredId( ICFKeyHash256 requiredId );

	public CFDbKeyHash256 getRequiredTenantId();
	public void setRequiredTenantId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getRequiredScopeId();
	public void setRequiredScopeId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalDefSchemaTenantId();
	public void setOptionalDefSchemaTenantId( CFDbKeyHash256 value );
	public CFDbKeyHash256 getOptionalDefSchemaId();
	public void setOptionalDefSchemaId( CFDbKeyHash256 value );
	public String getRequiredName();
	public void setRequiredName( String value );
	public boolean getRequiredReplacesInherited();
	public void setRequiredReplacesInherited( boolean value );
	public String getRequiredTweakGelText();
	public void setRequiredTweakGelText( String value );
	@Override
	public boolean equals( Object obj );

	@Override
	public int hashCode();

	//@Override
	public int compareTo( Object obj );

	public void set( IBusModelPubTweak src );
	public void set( IBusModelPubTweakH src );
	public void setTweak( IBusModelPubTweak src );
	public void setTweak( IBusModelPubTweakH src );
	public String getXmlAttrFragment();

	@Override
	public String toString();
}

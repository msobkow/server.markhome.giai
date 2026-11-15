// Description: Java 25 protlic interface for a SecTentRole history primary key object

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

package server.markhome.ycf.v3_1.secure.secureprot;

import java.io.Serializable;
import java.math.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
//import server.markhome.ycf.v3_1.secure.secureprot.*;

/**
 *	ISecureProtSecTentRoleHPKey Protected History Primary Key interface for SecTentRole has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 *		requiredSecTentRoleId	Required object attribute SecTentRoleId. */
public interface IBusModelProtSecTentRoleHPKey
{

	public CFDbKeyHash256 getAuditClusterId();
	public void setAuditClusterId( CFDbKeyHash256 value );

	public LocalDateTime getAuditStamp();
	public void setAuditStamp( LocalDateTime value );

	public short getAuditActionId();
	public void setAuditActionId( short value );

	public int getRequiredRevision();
	public void setRequiredRevision( int value );

	public CFDbKeyHash256 getAuditSessionId();
	public void setAuditSessionId( CFDbKeyHash256 value );

	public ICFKeyHash256 getRequiredSecTentRoleId();
	public void setRequiredSecTentRoleId( ICFKeyHash256 value );
	@Override
	public boolean equals( Object obj );

	@Override
	public int hashCode();

	//@Override
	public int compareTo( Object obj );

	public String getXmlAttrFragment();

	@Override
	public String toString();
}


// Description: Java JPA Factory interface for URLProtocol.

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

package server.markhome.ycf.v3_1.intnet.intnet;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

/*
 *	IIntNetURLProtocolFactory interface for URLProtocol
 */
public interface IIntNetURLProtocolFactory extends IIntNetProtURLProtocolFactory
{

	/**
	 *	Allocate a primary history key for URLProtocol instances.
	 *
	 *	@return	The new instance.
	 */
	IIntNetURLProtocolHPKey newHPKey();

	/**
	 *	Allocate a protected primary history key for URLProtocol instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetProtURLProtocolHPKey asProtected(IIntNetURLProtocolHPKey src);

	/**
	 *	Allocate a public primary history key for URLProtocol instances from a private instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetPubURLProtocolHPKey asPublic(IIntNetURLProtocolHPKey src);

	/**
	 *	Allocate a UNameIdx key over URLProtocol instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetURLProtocolByUNameIdxKey newByUNameIdxKey();

	/**
	 *	Allocate a protected UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtURLProtocolByUNameIdxKey asProtected(IIntNetURLProtocolByUNameIdxKey src);

	/**
	 *	Allocate a public UNameIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubURLProtocolByUNameIdxKey asPublic(IIntNetURLProtocolByUNameIdxKey src);

	/**
	 *	Allocate a IsSecureIdx key over URLProtocol instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetURLProtocolByIsSecureIdxKey newByIsSecureIdxKey();

	/**
	 *	Allocate a protected IsSecureIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtURLProtocolByIsSecureIdxKey asProtected(IIntNetURLProtocolByIsSecureIdxKey src);

	/**
	 *	Allocate a public IsSecureIdx key from a private instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubURLProtocolByIsSecureIdxKey asPublic(IIntNetURLProtocolByIsSecureIdxKey src);

	/**
	 *	Allocate a URLProtocol interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetURLProtocol newRec();

	/**
	 *	Allocate a protected URLProtocol interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtURLProtocol asProtected(IIntNetURLProtocol src);

	/**
	 *	Allocate a public URLProtocol interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubURLProtocol asPublic(IIntNetURLProtocol src);

	/**
	 *	Allocate a URLProtocol history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetURLProtocolH newHRec();

	/**
	 *	Allocate a protected URLProtocol history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtURLProtocolH asProtected(IIntNetURLProtocolH src);

	/**
	 *	Allocate a public URLProtocol history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubURLProtocolH asPublic(IIntNetURLProtocolH src);

}

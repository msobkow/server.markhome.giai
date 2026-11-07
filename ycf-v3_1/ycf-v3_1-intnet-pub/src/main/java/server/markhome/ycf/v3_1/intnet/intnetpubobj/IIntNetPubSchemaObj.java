// Description: Java 25 Public Schema Object interface for IntNetPub.

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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetPubSchemaObj
	extends ISecurePubSchemaObj
{
	public ISecurePubSchema getSecurePubBackingStore();
	public void setSecurePubBackingStore(ISecurePubSchema securepubBackingStore);

	public IIntNetPubSchema getIntNetPubBackingStore();
	public void setIntNetPubBackingStore(IIntNetPubSchema intnetpubBackingStore);

	/**
	 *	Get the License interface for the schema.
	 *
	 *	@return	The IIntNetPubLicenseTableObj interface implementation for the schema.
	 */
	IIntNetPubLicenseTableObj getLicenseTableObj();

	/**
	 *	Get the MajorVersion interface for the schema.
	 *
	 *	@return	The IIntNetPubMajorVersionTableObj interface implementation for the schema.
	 */
	IIntNetPubMajorVersionTableObj getMajorVersionTableObj();

	/**
	 *	Get the MimeType interface for the schema.
	 *
	 *	@return	The IIntNetPubMimeTypeTableObj interface implementation for the schema.
	 */
	IIntNetPubMimeTypeTableObj getMimeTypeTableObj();

	/**
	 *	Get the MinorVersion interface for the schema.
	 *
	 *	@return	The IIntNetPubMinorVersionTableObj interface implementation for the schema.
	 */
	IIntNetPubMinorVersionTableObj getMinorVersionTableObj();

	/**
	 *	Get the SubProject interface for the schema.
	 *
	 *	@return	The IIntNetPubSubProjectTableObj interface implementation for the schema.
	 */
	IIntNetPubSubProjectTableObj getSubProjectTableObj();

	/**
	 *	Get the Tld interface for the schema.
	 *
	 *	@return	The IIntNetPubTldTableObj interface implementation for the schema.
	 */
	IIntNetPubTldTableObj getTldTableObj();

	/**
	 *	Get the TopDomain interface for the schema.
	 *
	 *	@return	The IIntNetPubTopDomainTableObj interface implementation for the schema.
	 */
	IIntNetPubTopDomainTableObj getTopDomainTableObj();

	/**
	 *	Get the TopProject interface for the schema.
	 *
	 *	@return	The IIntNetPubTopProjectTableObj interface implementation for the schema.
	 */
	IIntNetPubTopProjectTableObj getTopProjectTableObj();

	/**
	 *	Get the URLProtocol interface for the schema.
	 *
	 *	@return	The IIntNetPubURLProtocolTableObj interface implementation for the schema.
	 */
	IIntNetPubURLProtocolTableObj getURLProtocolTableObj();
}

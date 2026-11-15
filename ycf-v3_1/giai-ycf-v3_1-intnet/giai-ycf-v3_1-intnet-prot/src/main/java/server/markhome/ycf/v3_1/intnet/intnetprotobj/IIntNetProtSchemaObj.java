// Description: Java 25 Protected Schema Object interface for IntNetProt.

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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

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
import server.markhome.ycf.v3_1.intnet.intnetprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IIntNetProtSchemaObj
	extends ISecurePubSchemaObj
{
	public ISecurePubSchema getSecureProtBackingStore();
	public void setSecureProtBackingStore(ISecurePubSchema secureprotBackingStore);

	public IIntNetProtSchema getIntNetProtBackingStore();
	public void setIntNetProtBackingStore(IIntNetProtSchema intnetprotBackingStore);

	/**
	 *	Get the License interface for the schema.
	 *
	 *	@return	The IIntNetProtLicenseTableObj interface implementation for the schema.
	 */
	IIntNetProtLicenseTableObj getLicenseTableObj();

	/**
	 *	Get the MajorVersion interface for the schema.
	 *
	 *	@return	The IIntNetProtMajorVersionTableObj interface implementation for the schema.
	 */
	IIntNetProtMajorVersionTableObj getMajorVersionTableObj();

	/**
	 *	Get the MimeType interface for the schema.
	 *
	 *	@return	The IIntNetProtMimeTypeTableObj interface implementation for the schema.
	 */
	IIntNetProtMimeTypeTableObj getMimeTypeTableObj();

	/**
	 *	Get the MinorVersion interface for the schema.
	 *
	 *	@return	The IIntNetProtMinorVersionTableObj interface implementation for the schema.
	 */
	IIntNetProtMinorVersionTableObj getMinorVersionTableObj();

	/**
	 *	Get the SubProject interface for the schema.
	 *
	 *	@return	The IIntNetProtSubProjectTableObj interface implementation for the schema.
	 */
	IIntNetProtSubProjectTableObj getSubProjectTableObj();

	/**
	 *	Get the Tld interface for the schema.
	 *
	 *	@return	The IIntNetProtTldTableObj interface implementation for the schema.
	 */
	IIntNetProtTldTableObj getTldTableObj();

	/**
	 *	Get the TopDomain interface for the schema.
	 *
	 *	@return	The IIntNetProtTopDomainTableObj interface implementation for the schema.
	 */
	IIntNetProtTopDomainTableObj getTopDomainTableObj();

	/**
	 *	Get the TopProject interface for the schema.
	 *
	 *	@return	The IIntNetProtTopProjectTableObj interface implementation for the schema.
	 */
	IIntNetProtTopProjectTableObj getTopProjectTableObj();

	/**
	 *	Get the URLProtocol interface for the schema.
	 *
	 *	@return	The IIntNetProtURLProtocolTableObj interface implementation for the schema.
	 */
	IIntNetProtURLProtocolTableObj getURLProtocolTableObj();
}

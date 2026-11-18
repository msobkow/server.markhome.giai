
// Description: Java Protected Factory interface for MinorVersion.

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

package server.markhome.ycf.v3_1.intnet.intnetprot;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetprotobj.*;

/*
 *	IIntNetProtMinorVersionFactory protected interface for MinorVersion
 */
public interface IIntNetProtMinorVersionFactory extends IIntNetPubMinorVersionFactory
{

	/**
	 *	Allocate a protected primary history key for MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	IIntNetProtMinorVersionHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for MinorVersion instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetPubMinorVersionHPKey asPublic(IIntNetProtMinorVersionHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMinorVersionByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMinorVersionByTenantIdxKey asPublic(IIntNetProtMinorVersionByTenantIdxKey src);

	/**
	 *	Allocate a protected MajorVerIdx key over protected MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMinorVersionByMajorVerIdxKey newProtByMajorVerIdxKey();

	/**
	 *	Allocate a public MajorVerIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMinorVersionByMajorVerIdxKey asPublic(IIntNetProtMinorVersionByMajorVerIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected MinorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMinorVersionByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMinorVersionByNameIdxKey asPublic(IIntNetProtMinorVersionByNameIdxKey src);

	/**
	 *	Allocate a protected MinorVersion interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMinorVersion newProtRec();

	/**
	 *	Allocate a public MinorVersion interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMinorVersion asPublic(IIntNetProtMinorVersion src);

	/**
	 *	Allocate a protected MinorVersion history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMinorVersionH newProtHRec();

	/**
	 *	Allocate a public MinorVersion history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMinorVersionH asPublic(IIntNetProtMinorVersionH src);

}

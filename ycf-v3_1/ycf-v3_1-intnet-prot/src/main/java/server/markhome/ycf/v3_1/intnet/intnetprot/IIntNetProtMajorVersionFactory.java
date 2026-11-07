
// Description: Java Protected Factory interface for MajorVersion.

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
 *	IIntNetProtMajorVersionFactory protected interface for MajorVersion
 */
public interface IIntNetProtMajorVersionFactory extends IIntNetPubMajorVersionFactory
{

	/**
	 *	Allocate a protected primary history key for MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	IIntNetProtMajorVersionHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for MajorVersion instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	IIntNetPubMajorVersionHPKey asPublic(IIntNetProtMajorVersionHPKey src);

	/**
	 *	Allocate a protected TenantIdx key over protected MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMajorVersionByTenantIdxKey newProtByTenantIdxKey();

	/**
	 *	Allocate a public TenantIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMajorVersionByTenantIdxKey asPublic(IIntNetProtMajorVersionByTenantIdxKey src);

	/**
	 *	Allocate a protected SubProjectIdx key over protected MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMajorVersionBySubProjectIdxKey newProtBySubProjectIdxKey();

	/**
	 *	Allocate a public SubProjectIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMajorVersionBySubProjectIdxKey asPublic(IIntNetProtMajorVersionBySubProjectIdxKey src);

	/**
	 *	Allocate a protected NameIdx key over protected MajorVersion instances.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMajorVersionByNameIdxKey newProtByNameIdxKey();

	/**
	 *	Allocate a public NameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMajorVersionByNameIdxKey asPublic(IIntNetProtMajorVersionByNameIdxKey src);

	/**
	 *	Allocate a protected MajorVersion interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMajorVersion newProtRec();

	/**
	 *	Allocate a public MajorVersion interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMajorVersion asPublic(IIntNetProtMajorVersion src);

	/**
	 *	Allocate a protected MajorVersion history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetProtMajorVersionH newProtHRec();

	/**
	 *	Allocate a public MajorVersion history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IIntNetPubMajorVersionH asPublic(IIntNetProtMajorVersionH src);

}

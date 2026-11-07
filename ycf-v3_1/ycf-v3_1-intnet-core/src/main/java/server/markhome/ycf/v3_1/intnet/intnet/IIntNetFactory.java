// Description: Java 25 interface for a IntNet data object factory.

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

public interface IIntNetFactory
{
	/**
	 *	Get the License Factory interface for the schema.
	 *
	 *	@return	The License Factory interface for the schema.
	 */
	public IIntNetLicenseFactory getFactoryLicense();

	/**
	 *	Get the MajorVersion Factory interface for the schema.
	 *
	 *	@return	The MajorVersion Factory interface for the schema.
	 */
	public IIntNetMajorVersionFactory getFactoryMajorVersion();

	/**
	 *	Get the MimeType Factory interface for the schema.
	 *
	 *	@return	The MimeType Factory interface for the schema.
	 */
	public IIntNetMimeTypeFactory getFactoryMimeType();

	/**
	 *	Get the MinorVersion Factory interface for the schema.
	 *
	 *	@return	The MinorVersion Factory interface for the schema.
	 */
	public IIntNetMinorVersionFactory getFactoryMinorVersion();

	/**
	 *	Get the SubProject Factory interface for the schema.
	 *
	 *	@return	The SubProject Factory interface for the schema.
	 */
	public IIntNetSubProjectFactory getFactorySubProject();

	/**
	 *	Get the Tld Factory interface for the schema.
	 *
	 *	@return	The Tld Factory interface for the schema.
	 */
	public IIntNetTldFactory getFactoryTld();

	/**
	 *	Get the TopDomain Factory interface for the schema.
	 *
	 *	@return	The TopDomain Factory interface for the schema.
	 */
	public IIntNetTopDomainFactory getFactoryTopDomain();

	/**
	 *	Get the TopProject Factory interface for the schema.
	 *
	 *	@return	The TopProject Factory interface for the schema.
	 */
	public IIntNetTopProjectFactory getFactoryTopProject();

	/**
	 *	Get the URLProtocol Factory interface for the schema.
	 *
	 *	@return	The URLProtocol Factory interface for the schema.
	 */
	public IIntNetURLProtocolFactory getFactoryURLProtocol();

}

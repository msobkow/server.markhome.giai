// Description: Java 25 buffer implementation of a IntNet factory service.

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import org.apache.commons.text.StringEscapeUtils;
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

@Service("intnet31BuffFactoryService")
public class IntNetBuffFactoryService
	implements IIntNetFactory
{

	@Autowired
	@Qualifier("intnet31BuffLicenseFactoryService")
	protected IntNetBuffLicenseFactoryService licenseFactoryService;

	@Autowired
	@Qualifier("intnet31BuffMajorVersionFactoryService")
	protected IntNetBuffMajorVersionFactoryService majorversionFactoryService;

	@Autowired
	@Qualifier("intnet31BuffMimeTypeFactoryService")
	protected IntNetBuffMimeTypeFactoryService mimetypeFactoryService;

	@Autowired
	@Qualifier("intnet31BuffMinorVersionFactoryService")
	protected IntNetBuffMinorVersionFactoryService minorversionFactoryService;

	@Autowired
	@Qualifier("intnet31BuffSubProjectFactoryService")
	protected IntNetBuffSubProjectFactoryService subprojectFactoryService;

	@Autowired
	@Qualifier("intnet31BuffTldFactoryService")
	protected IntNetBuffTldFactoryService tldFactoryService;

	@Autowired
	@Qualifier("intnet31BuffTopDomainFactoryService")
	protected IntNetBuffTopDomainFactoryService topdomainFactoryService;

	@Autowired
	@Qualifier("intnet31BuffTopProjectFactoryService")
	protected IntNetBuffTopProjectFactoryService topprojectFactoryService;

	@Autowired
	@Qualifier("intnet31BuffURLProtocolFactoryService")
	protected IntNetBuffURLProtocolFactoryService urlprotocolFactoryService;


	public BusModelBuffFactoryService() { }

	@Override
	public IIntNetLicenseFactory getFactoryLicense() {
		return(licenseFactoryService);
	}

	public IntNetBuffLicenseFactoryService getLicenseFactoryService() {
		return(licenseFactoryService);
	}

	@Override
	public IIntNetMajorVersionFactory getFactoryMajorVersion() {
		return(majorversionFactoryService);
	}

	public IntNetBuffMajorVersionFactoryService getMajorVersionFactoryService() {
		return(majorversionFactoryService);
	}

	@Override
	public IIntNetMimeTypeFactory getFactoryMimeType() {
		return(mimetypeFactoryService);
	}

	public IntNetBuffMimeTypeFactoryService getMimeTypeFactoryService() {
		return(mimetypeFactoryService);
	}

	@Override
	public IIntNetMinorVersionFactory getFactoryMinorVersion() {
		return(minorversionFactoryService);
	}

	public IntNetBuffMinorVersionFactoryService getMinorVersionFactoryService() {
		return(minorversionFactoryService);
	}

	@Override
	public IIntNetSubProjectFactory getFactorySubProject() {
		return(subprojectFactoryService);
	}

	public IntNetBuffSubProjectFactoryService getSubProjectFactoryService() {
		return(subprojectFactoryService);
	}

	@Override
	public IIntNetTldFactory getFactoryTld() {
		return(tldFactoryService);
	}

	public IntNetBuffTldFactoryService getTldFactoryService() {
		return(tldFactoryService);
	}

	@Override
	public IIntNetTopDomainFactory getFactoryTopDomain() {
		return(topdomainFactoryService);
	}

	public IntNetBuffTopDomainFactoryService getTopDomainFactoryService() {
		return(topdomainFactoryService);
	}

	@Override
	public IIntNetTopProjectFactory getFactoryTopProject() {
		return(topprojectFactoryService);
	}

	public IntNetBuffTopProjectFactoryService getTopProjectFactoryService() {
		return(topprojectFactoryService);
	}

	@Override
	public IIntNetURLProtocolFactory getFactoryURLProtocol() {
		return(urlprotocolFactoryService);
	}

	public IntNetBuffURLProtocolFactoryService getURLProtocolFactoryService() {
		return(urlprotocolFactoryService);
	}

}

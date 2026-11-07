// Description: Java 25 JPA implementation of a IntNet factory service.

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

package server.markhome.ycf.v3_1.intnet.intnet.jpa;

import java.io.Serializable;
import java.math.*;
import java.net.InetAddress;
import java.time.*;	
import java.util.*;
import jakarta.persistence.*;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;

/**
 *	JPA Factory Services for schema IntNet as specified by IIntNetFactory.
 */
@Service("intnet31JpaFactoryService")
public class IntNetJpaFactoryService
	implements IIntNetFactory
{

	@Autowired
	@Qualifier("intnet31JpaLicenseFactoryService")
	protected IntNetJpaLicenseFactoryService licenseFactoryService;

	@Autowired
	@Qualifier("intnet31JpaMajorVersionFactoryService")
	protected IntNetJpaMajorVersionFactoryService majorversionFactoryService;

	@Autowired
	@Qualifier("intnet31JpaMimeTypeFactoryService")
	protected IntNetJpaMimeTypeFactoryService mimetypeFactoryService;

	@Autowired
	@Qualifier("intnet31JpaMinorVersionFactoryService")
	protected IntNetJpaMinorVersionFactoryService minorversionFactoryService;

	@Autowired
	@Qualifier("intnet31JpaSubProjectFactoryService")
	protected IntNetJpaSubProjectFactoryService subprojectFactoryService;

	@Autowired
	@Qualifier("intnet31JpaTldFactoryService")
	protected IntNetJpaTldFactoryService tldFactoryService;

	@Autowired
	@Qualifier("intnet31JpaTopDomainFactoryService")
	protected IntNetJpaTopDomainFactoryService topdomainFactoryService;

	@Autowired
	@Qualifier("intnet31JpaTopProjectFactoryService")
	protected IntNetJpaTopProjectFactoryService topprojectFactoryService;

	@Autowired
	@Qualifier("intnet31JpaURLProtocolFactoryService")
	protected IntNetJpaURLProtocolFactoryService urlprotocolFactoryService;


	public IntNetJpaFactoryService() { }

	@Override
	public IIntNetLicenseFactory getFactoryLicense() {
		return(licenseFactoryService);
	}

	public IntNetJpaLicenseFactoryService getLicenseFactoryService() {
		return(licenseFactoryService);
	}

	@Override
	public IIntNetMajorVersionFactory getFactoryMajorVersion() {
		return(majorversionFactoryService);
	}

	public IntNetJpaMajorVersionFactoryService getMajorVersionFactoryService() {
		return(majorversionFactoryService);
	}

	@Override
	public IIntNetMimeTypeFactory getFactoryMimeType() {
		return(mimetypeFactoryService);
	}

	public IntNetJpaMimeTypeFactoryService getMimeTypeFactoryService() {
		return(mimetypeFactoryService);
	}

	@Override
	public IIntNetMinorVersionFactory getFactoryMinorVersion() {
		return(minorversionFactoryService);
	}

	public IntNetJpaMinorVersionFactoryService getMinorVersionFactoryService() {
		return(minorversionFactoryService);
	}

	@Override
	public IIntNetSubProjectFactory getFactorySubProject() {
		return(subprojectFactoryService);
	}

	public IntNetJpaSubProjectFactoryService getSubProjectFactoryService() {
		return(subprojectFactoryService);
	}

	@Override
	public IIntNetTldFactory getFactoryTld() {
		return(tldFactoryService);
	}

	public IntNetJpaTldFactoryService getTldFactoryService() {
		return(tldFactoryService);
	}

	@Override
	public IIntNetTopDomainFactory getFactoryTopDomain() {
		return(topdomainFactoryService);
	}

	public IntNetJpaTopDomainFactoryService getTopDomainFactoryService() {
		return(topdomainFactoryService);
	}

	@Override
	public IIntNetTopProjectFactory getFactoryTopProject() {
		return(topprojectFactoryService);
	}

	public IntNetJpaTopProjectFactoryService getTopProjectFactoryService() {
		return(topprojectFactoryService);
	}

	@Override
	public IIntNetURLProtocolFactory getFactoryURLProtocol() {
		return(urlprotocolFactoryService);
	}

	public IntNetJpaURLProtocolFactoryService getURLProtocolFactoryService() {
		return(urlprotocolFactoryService);
	}

}

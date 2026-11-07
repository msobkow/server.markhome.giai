// Description: Java 25 Spring JPA Hooks for IntNet

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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;

/**
 *	Hooks for schema IntNet Spring resources that need to be used by getter-wrappers for AtomicReference members of the multi-threaded wedge between Spring resources and POJO code.
 *	This implementation wraps the Spring singletons instantiated during Spring's boot process for the server.markhome.ycf.v3_1.intnet.intnet.jpa package.  It resolves all known standard Spring resources for the LocalContainerEntityManagerFactoryBean, SchemaService, IdGenService, and the IntNet*Repository and IntNet*Service singletons that the POJOs need to invoke.  However, it relies on late-initialization during dynamic instance creation (i.e. new IntNetJpaSchemaHooks()) instead of being initialized as a Spring singleton. As the Spring instance hierarchy is instantiated before any instances of this class are instantiated, the net result bridges the gap between POJO and Spring JPA.
 */
@Service("intnet31JpaHooksSchema")
public class IntNetJpaHooksSchema {

	@Autowired
	@Qualifier("intnet31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean intnet31EntityManagerFactory;

	@Autowired
	private IntNetJpaLicenseRepository licenseRepository;

	@Autowired
	private IntNetJpaMajorVersionRepository majorVersionRepository;

	@Autowired
	private IntNetJpaMimeTypeRepository mimeTypeRepository;

	@Autowired
	private IntNetJpaMinorVersionRepository minorVersionRepository;

	@Autowired
	private IntNetJpaSubProjectRepository subProjectRepository;

	@Autowired
	private IntNetJpaTldRepository tldRepository;

	@Autowired
	private IntNetJpaTopDomainRepository topDomainRepository;

	@Autowired
	private IntNetJpaTopProjectRepository topProjectRepository;

	@Autowired
	private IntNetJpaURLProtocolRepository uRLProtocolRepository;

	@Autowired
	@Qualifier("intnet31JpaSchemaService")
	private IntNetJpaSchemaService schemaService;

	@Autowired
	@Qualifier("intnet31JpaFactory")
	private IntNetJpaFactoryService factoryService;

	@Autowired
	@Qualifier("IntNet31JpaIdGenService")
	private IntNetJpaIdGenService idGenService;

	@Autowired
	@Qualifier("intnet31JpaLicenseService")
	private IntNetJpaLicenseService licenseService;

	@Autowired
	@Qualifier("intnet31JpaMajorVersionService")
	private IntNetJpaMajorVersionService majorVersionService;

	@Autowired
	@Qualifier("intnet31JpaMimeTypeService")
	private IntNetJpaMimeTypeService mimeTypeService;

	@Autowired
	@Qualifier("intnet31JpaMinorVersionService")
	private IntNetJpaMinorVersionService minorVersionService;

	@Autowired
	@Qualifier("intnet31JpaSubProjectService")
	private IntNetJpaSubProjectService subProjectService;

	@Autowired
	@Qualifier("intnet31JpaTldService")
	private IntNetJpaTldService tldService;

	@Autowired
	@Qualifier("intnet31JpaTopDomainService")
	private IntNetJpaTopDomainService topDomainService;

	@Autowired
	@Qualifier("intnet31JpaTopProjectService")
	private IntNetJpaTopProjectService topProjectService;

	@Autowired
	@Qualifier("intnet31JpaURLProtocolService")
	private IntNetJpaURLProtocolService uRLProtocolService;

	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
		if ( intnet31EntityManagerFactory == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getEntityManagerFactoryBean",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( intnet31EntityManagerFactory );
	}

	public IntNetJpaSchemaService getSchemaService() {
		if ( schemaService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSchemaService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( schemaService );
	}

	public IntNetJpaFactoryService getFactoryService() {
		if ( factoryService == null ) {
			// Dynamically resolve the factory by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getFactoryService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( factoryService );
	}

	public IntNetJpaIdGenService getIdGenService() {
		if ( idGenService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getIdGenService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( idGenService );
	}

	public IntNetJpaLicenseRepository getLicenseRepository() {
		if ( licenseRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getLicenseRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( licenseRepository );
	}

	public IntNetJpaMajorVersionRepository getMajorVersionRepository() {
		if ( majorVersionRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getMajorVersionRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( majorVersionRepository );
	}

	public IntNetJpaMimeTypeRepository getMimeTypeRepository() {
		if ( mimeTypeRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getMimeTypeRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( mimeTypeRepository );
	}

	public IntNetJpaMinorVersionRepository getMinorVersionRepository() {
		if ( minorVersionRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getMinorVersionRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( minorVersionRepository );
	}

	public IntNetJpaSubProjectRepository getSubProjectRepository() {
		if ( subProjectRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSubProjectRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( subProjectRepository );
	}

	public IntNetJpaTldRepository getTldRepository() {
		if ( tldRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getTldRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( tldRepository );
	}

	public IntNetJpaTopDomainRepository getTopDomainRepository() {
		if ( topDomainRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getTopDomainRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( topDomainRepository );
	}

	public IntNetJpaTopProjectRepository getTopProjectRepository() {
		if ( topProjectRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getTopProjectRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( topProjectRepository );
	}

	public IntNetJpaURLProtocolRepository getURLProtocolRepository() {
		if ( uRLProtocolRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getURLProtocolRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( uRLProtocolRepository );
	}

	public IntNetJpaLicenseService getLicenseService() {
		if ( licenseService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getLicenseService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( licenseService );
	}

	public IntNetJpaMajorVersionService getMajorVersionService() {
		if ( majorVersionService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getMajorVersionService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( majorVersionService );
	}

	public IntNetJpaMimeTypeService getMimeTypeService() {
		if ( mimeTypeService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getMimeTypeService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( mimeTypeService );
	}

	public IntNetJpaMinorVersionService getMinorVersionService() {
		if ( minorVersionService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getMinorVersionService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( minorVersionService );
	}

	public IntNetJpaSubProjectService getSubProjectService() {
		if ( subProjectService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSubProjectService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( subProjectService );
	}

	public IntNetJpaTldService getTldService() {
		if ( tldService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getTldService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( tldService );
	}

	public IntNetJpaTopDomainService getTopDomainService() {
		if ( topDomainService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getTopDomainService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( topDomainService );
	}

	public IntNetJpaTopProjectService getTopProjectService() {
		if ( topProjectService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getTopProjectService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( topProjectService );
	}

	public IntNetJpaURLProtocolService getURLProtocolService() {
		if ( uRLProtocolService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getURLProtocolService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( uRLProtocolService );
	}
}

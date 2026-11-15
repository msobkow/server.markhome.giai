// Description: Java 25 Spring JPA Hooks for Secure

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

package server.markhome.ycf.v3_1.secure.secure.jpa;

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
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;

/**
 *	Hooks for schema Secure Spring resources that need to be used by getter-wrappers for AtomicReference members of the multi-threaded wedge between Spring resources and POJO code.
 *	This implementation wraps the Spring singletons instantiated during Spring's boot process for the server.markhome.ycf.v3_1.secure.secure.jpa package.  It resolves all known standard Spring resources for the LocalContainerEntityManagerFactoryBean, SchemaService, IdGenService, and the Secure*Repository and Secure*Service singletons that the POJOs need to invoke.  However, it relies on late-initialization during dynamic instance creation (i.e. new SecureJpaSchemaHooks()) instead of being initialized as a Spring singleton. As the Spring instance hierarchy is instantiated before any instances of this class are instantiated, the net result bridges the gap between POJO and Spring JPA.
 */
@Service("secure31JpaHooksSchema")
public class SecureJpaHooksSchema {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaClusterRepository clusterRepository;

	@Autowired
	private SecureJpaTenantRepository tenantRepository;

	@Autowired
	private SecureJpaTableInfoRepository tableInfoRepository;

	@Autowired
	private SecureJpaISOCcyRepository iSOCcyRepository;

	@Autowired
	private SecureJpaISOCtryRepository iSOCtryRepository;

	@Autowired
	private SecureJpaISOCtryCcyRepository iSOCtryCcyRepository;

	@Autowired
	private SecureJpaISOCtryLangRepository iSOCtryLangRepository;

	@Autowired
	private SecureJpaISOLangRepository iSOLangRepository;

	@Autowired
	private SecureJpaISOTZoneRepository iSOTZoneRepository;

	@Autowired
	private SecureJpaSecUserRepository secUserRepository;

	@Autowired
	private SecureJpaSecUserPasswordRepository secUserPasswordRepository;

	@Autowired
	private SecureJpaSecUserEMConfRepository secUserEMConfRepository;

	@Autowired
	private SecureJpaSecUserPWResetRepository secUserPWResetRepository;

	@Autowired
	private SecureJpaSecUserPWHistoryRepository secUserPWHistoryRepository;

	@Autowired
	private SecureJpaSecSysGrpRepository secSysGrpRepository;

	@Autowired
	private SecureJpaSecSysGrpIncRepository secSysGrpIncRepository;

	@Autowired
	private SecureJpaSecSysGrpMembRepository secSysGrpMembRepository;

	@Autowired
	private SecureJpaSecClusGrpRepository secClusGrpRepository;

	@Autowired
	private SecureJpaSecClusGrpMembRepository secClusGrpMembRepository;

	@Autowired
	private SecureJpaSecTentGrpRepository secTentGrpRepository;

	@Autowired
	private SecureJpaSecTentGrpMembRepository secTentGrpMembRepository;

	@Autowired
	private SecureJpaSecSysRoleRepository secSysRoleRepository;

	@Autowired
	private SecureJpaSecSysRoleEnablesRepository secSysRoleEnablesRepository;

	@Autowired
	private SecureJpaSecSysRoleMembRepository secSysRoleMembRepository;

	@Autowired
	private SecureJpaSecClusRoleRepository secClusRoleRepository;

	@Autowired
	private SecureJpaSecClusRoleMembRepository secClusRoleMembRepository;

	@Autowired
	private SecureJpaSecTentRoleRepository secTentRoleRepository;

	@Autowired
	private SecureJpaSecTentRoleMembRepository secTentRoleMembRepository;

	@Autowired
	private SecureJpaSecSessionRepository secSessionRepository;

	@Autowired
	private SecureJpaSysClusterRepository sysClusterRepository;

	@Autowired
	@Qualifier("secure31JpaSchemaService")
	private SecureJpaSchemaService schemaService;

	@Autowired
	@Qualifier("secure31JpaFactory")
	private SecureJpaFactoryService factoryService;

	@Autowired
	@Qualifier("Secure31JpaIdGenService")
	private SecureJpaIdGenService idGenService;

	@Autowired
	@Qualifier("secure31JpaClusterService")
	private SecureJpaClusterService clusterService;

	@Autowired
	@Qualifier("secure31JpaTenantService")
	private SecureJpaTenantService tenantService;

	@Autowired
	@Qualifier("secure31JpaTableInfoService")
	private SecureJpaTableInfoService tableInfoService;

	@Autowired
	@Qualifier("secure31JpaISOCcyService")
	private SecureJpaISOCcyService iSOCcyService;

	@Autowired
	@Qualifier("secure31JpaISOCtryService")
	private SecureJpaISOCtryService iSOCtryService;

	@Autowired
	@Qualifier("secure31JpaISOCtryCcyService")
	private SecureJpaISOCtryCcyService iSOCtryCcyService;

	@Autowired
	@Qualifier("secure31JpaISOCtryLangService")
	private SecureJpaISOCtryLangService iSOCtryLangService;

	@Autowired
	@Qualifier("secure31JpaISOLangService")
	private SecureJpaISOLangService iSOLangService;

	@Autowired
	@Qualifier("secure31JpaISOTZoneService")
	private SecureJpaISOTZoneService iSOTZoneService;

	@Autowired
	@Qualifier("secure31JpaSecUserService")
	private SecureJpaSecUserService secUserService;

	@Autowired
	@Qualifier("secure31JpaSecUserPasswordService")
	private SecureJpaSecUserPasswordService secUserPasswordService;

	@Autowired
	@Qualifier("secure31JpaSecUserEMConfService")
	private SecureJpaSecUserEMConfService secUserEMConfService;

	@Autowired
	@Qualifier("secure31JpaSecUserPWResetService")
	private SecureJpaSecUserPWResetService secUserPWResetService;

	@Autowired
	@Qualifier("secure31JpaSecUserPWHistoryService")
	private SecureJpaSecUserPWHistoryService secUserPWHistoryService;

	@Autowired
	@Qualifier("secure31JpaSecSysGrpService")
	private SecureJpaSecSysGrpService secSysGrpService;

	@Autowired
	@Qualifier("secure31JpaSecSysGrpIncService")
	private SecureJpaSecSysGrpIncService secSysGrpIncService;

	@Autowired
	@Qualifier("secure31JpaSecSysGrpMembService")
	private SecureJpaSecSysGrpMembService secSysGrpMembService;

	@Autowired
	@Qualifier("secure31JpaSecClusGrpService")
	private SecureJpaSecClusGrpService secClusGrpService;

	@Autowired
	@Qualifier("secure31JpaSecClusGrpMembService")
	private SecureJpaSecClusGrpMembService secClusGrpMembService;

	@Autowired
	@Qualifier("secure31JpaSecTentGrpService")
	private SecureJpaSecTentGrpService secTentGrpService;

	@Autowired
	@Qualifier("secure31JpaSecTentGrpMembService")
	private SecureJpaSecTentGrpMembService secTentGrpMembService;

	@Autowired
	@Qualifier("secure31JpaSecSysRoleService")
	private SecureJpaSecSysRoleService secSysRoleService;

	@Autowired
	@Qualifier("secure31JpaSecSysRoleEnablesService")
	private SecureJpaSecSysRoleEnablesService secSysRoleEnablesService;

	@Autowired
	@Qualifier("secure31JpaSecSysRoleMembService")
	private SecureJpaSecSysRoleMembService secSysRoleMembService;

	@Autowired
	@Qualifier("secure31JpaSecClusRoleService")
	private SecureJpaSecClusRoleService secClusRoleService;

	@Autowired
	@Qualifier("secure31JpaSecClusRoleMembService")
	private SecureJpaSecClusRoleMembService secClusRoleMembService;

	@Autowired
	@Qualifier("secure31JpaSecTentRoleService")
	private SecureJpaSecTentRoleService secTentRoleService;

	@Autowired
	@Qualifier("secure31JpaSecTentRoleMembService")
	private SecureJpaSecTentRoleMembService secTentRoleMembService;

	@Autowired
	@Qualifier("secure31JpaSecSessionService")
	private SecureJpaSecSessionService secSessionService;

	@Autowired
	@Qualifier("secure31JpaSysClusterService")
	private SecureJpaSysClusterService sysClusterService;

	public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
		if ( secure31EntityManagerFactory == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getEntityManagerFactoryBean",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secure31EntityManagerFactory );
	}

	public SecureJpaSchemaService getSchemaService() {
		if ( schemaService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSchemaService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( schemaService );
	}

	public SecureJpaFactoryService getFactoryService() {
		if ( factoryService == null ) {
			// Dynamically resolve the factory by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getFactoryService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( factoryService );
	}

	public SecureJpaIdGenService getIdGenService() {
		if ( idGenService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getIdGenService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( idGenService );
	}

	public SecureJpaClusterRepository getClusterRepository() {
		if ( clusterRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getClusterRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( clusterRepository );
	}

	public SecureJpaTenantRepository getTenantRepository() {
		if ( tenantRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getTenantRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( tenantRepository );
	}

	public SecureJpaTableInfoRepository getTableInfoRepository() {
		if ( tableInfoRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getTableInfoRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( tableInfoRepository );
	}

	public SecureJpaISOCcyRepository getISOCcyRepository() {
		if ( iSOCcyRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getISOCcyRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCcyRepository );
	}

	public SecureJpaISOCtryRepository getISOCtryRepository() {
		if ( iSOCtryRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getISOCtryRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCtryRepository );
	}

	public SecureJpaISOCtryCcyRepository getISOCtryCcyRepository() {
		if ( iSOCtryCcyRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getISOCtryCcyRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCtryCcyRepository );
	}

	public SecureJpaISOCtryLangRepository getISOCtryLangRepository() {
		if ( iSOCtryLangRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getISOCtryLangRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCtryLangRepository );
	}

	public SecureJpaISOLangRepository getISOLangRepository() {
		if ( iSOLangRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getISOLangRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOLangRepository );
	}

	public SecureJpaISOTZoneRepository getISOTZoneRepository() {
		if ( iSOTZoneRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getISOTZoneRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOTZoneRepository );
	}

	public SecureJpaSecUserRepository getSecUserRepository() {
		if ( secUserRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecUserRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserRepository );
	}

	public SecureJpaSecUserPasswordRepository getSecUserPasswordRepository() {
		if ( secUserPasswordRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecUserPasswordRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserPasswordRepository );
	}

	public SecureJpaSecUserEMConfRepository getSecUserEMConfRepository() {
		if ( secUserEMConfRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecUserEMConfRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserEMConfRepository );
	}

	public SecureJpaSecUserPWResetRepository getSecUserPWResetRepository() {
		if ( secUserPWResetRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecUserPWResetRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserPWResetRepository );
	}

	public SecureJpaSecUserPWHistoryRepository getSecUserPWHistoryRepository() {
		if ( secUserPWHistoryRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecUserPWHistoryRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserPWHistoryRepository );
	}

	public SecureJpaSecSysGrpRepository getSecSysGrpRepository() {
		if ( secSysGrpRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecSysGrpRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysGrpRepository );
	}

	public SecureJpaSecSysGrpIncRepository getSecSysGrpIncRepository() {
		if ( secSysGrpIncRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecSysGrpIncRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysGrpIncRepository );
	}

	public SecureJpaSecSysGrpMembRepository getSecSysGrpMembRepository() {
		if ( secSysGrpMembRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecSysGrpMembRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysGrpMembRepository );
	}

	public SecureJpaSecClusGrpRepository getSecClusGrpRepository() {
		if ( secClusGrpRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecClusGrpRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusGrpRepository );
	}

	public SecureJpaSecClusGrpMembRepository getSecClusGrpMembRepository() {
		if ( secClusGrpMembRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecClusGrpMembRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusGrpMembRepository );
	}

	public SecureJpaSecTentGrpRepository getSecTentGrpRepository() {
		if ( secTentGrpRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecTentGrpRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentGrpRepository );
	}

	public SecureJpaSecTentGrpMembRepository getSecTentGrpMembRepository() {
		if ( secTentGrpMembRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecTentGrpMembRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentGrpMembRepository );
	}

	public SecureJpaSecSysRoleRepository getSecSysRoleRepository() {
		if ( secSysRoleRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecSysRoleRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysRoleRepository );
	}

	public SecureJpaSecSysRoleEnablesRepository getSecSysRoleEnablesRepository() {
		if ( secSysRoleEnablesRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecSysRoleEnablesRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysRoleEnablesRepository );
	}

	public SecureJpaSecSysRoleMembRepository getSecSysRoleMembRepository() {
		if ( secSysRoleMembRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecSysRoleMembRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysRoleMembRepository );
	}

	public SecureJpaSecClusRoleRepository getSecClusRoleRepository() {
		if ( secClusRoleRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecClusRoleRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusRoleRepository );
	}

	public SecureJpaSecClusRoleMembRepository getSecClusRoleMembRepository() {
		if ( secClusRoleMembRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecClusRoleMembRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusRoleMembRepository );
	}

	public SecureJpaSecTentRoleRepository getSecTentRoleRepository() {
		if ( secTentRoleRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecTentRoleRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentRoleRepository );
	}

	public SecureJpaSecTentRoleMembRepository getSecTentRoleMembRepository() {
		if ( secTentRoleMembRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecTentRoleMembRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentRoleMembRepository );
	}

	public SecureJpaSecSessionRepository getSecSessionRepository() {
		if ( secSessionRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSecSessionRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSessionRepository );
	}

	public SecureJpaSysClusterRepository getSysClusterRepository() {
		if ( sysClusterRepository == null ) {
			// Dynamically resolve the repository by interface type
			throw new CFNotImplementedYetException( getClass(), "getSysClusterRepository",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( sysClusterRepository );
	}

	public SecureJpaClusterService getClusterService() {
		if ( clusterService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getClusterService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( clusterService );
	}

	public SecureJpaTenantService getTenantService() {
		if ( tenantService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getTenantService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( tenantService );
	}

	public SecureJpaTableInfoService getTableInfoService() {
		if ( tableInfoService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getTableInfoService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( tableInfoService );
	}

	public SecureJpaISOCcyService getISOCcyService() {
		if ( iSOCcyService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getISOCcyService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCcyService );
	}

	public SecureJpaISOCtryService getISOCtryService() {
		if ( iSOCtryService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getISOCtryService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCtryService );
	}

	public SecureJpaISOCtryCcyService getISOCtryCcyService() {
		if ( iSOCtryCcyService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getISOCtryCcyService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCtryCcyService );
	}

	public SecureJpaISOCtryLangService getISOCtryLangService() {
		if ( iSOCtryLangService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getISOCtryLangService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOCtryLangService );
	}

	public SecureJpaISOLangService getISOLangService() {
		if ( iSOLangService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getISOLangService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOLangService );
	}

	public SecureJpaISOTZoneService getISOTZoneService() {
		if ( iSOTZoneService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getISOTZoneService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( iSOTZoneService );
	}

	public SecureJpaSecUserService getSecUserService() {
		if ( secUserService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecUserService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserService );
	}

	public SecureJpaSecUserPasswordService getSecUserPasswordService() {
		if ( secUserPasswordService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecUserPasswordService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserPasswordService );
	}

	public SecureJpaSecUserEMConfService getSecUserEMConfService() {
		if ( secUserEMConfService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecUserEMConfService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserEMConfService );
	}

	public SecureJpaSecUserPWResetService getSecUserPWResetService() {
		if ( secUserPWResetService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecUserPWResetService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserPWResetService );
	}

	public SecureJpaSecUserPWHistoryService getSecUserPWHistoryService() {
		if ( secUserPWHistoryService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecUserPWHistoryService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secUserPWHistoryService );
	}

	public SecureJpaSecSysGrpService getSecSysGrpService() {
		if ( secSysGrpService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecSysGrpService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysGrpService );
	}

	public SecureJpaSecSysGrpIncService getSecSysGrpIncService() {
		if ( secSysGrpIncService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecSysGrpIncService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysGrpIncService );
	}

	public SecureJpaSecSysGrpMembService getSecSysGrpMembService() {
		if ( secSysGrpMembService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecSysGrpMembService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysGrpMembService );
	}

	public SecureJpaSecClusGrpService getSecClusGrpService() {
		if ( secClusGrpService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecClusGrpService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusGrpService );
	}

	public SecureJpaSecClusGrpMembService getSecClusGrpMembService() {
		if ( secClusGrpMembService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecClusGrpMembService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusGrpMembService );
	}

	public SecureJpaSecTentGrpService getSecTentGrpService() {
		if ( secTentGrpService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecTentGrpService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentGrpService );
	}

	public SecureJpaSecTentGrpMembService getSecTentGrpMembService() {
		if ( secTentGrpMembService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecTentGrpMembService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentGrpMembService );
	}

	public SecureJpaSecSysRoleService getSecSysRoleService() {
		if ( secSysRoleService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecSysRoleService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysRoleService );
	}

	public SecureJpaSecSysRoleEnablesService getSecSysRoleEnablesService() {
		if ( secSysRoleEnablesService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecSysRoleEnablesService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysRoleEnablesService );
	}

	public SecureJpaSecSysRoleMembService getSecSysRoleMembService() {
		if ( secSysRoleMembService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecSysRoleMembService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSysRoleMembService );
	}

	public SecureJpaSecClusRoleService getSecClusRoleService() {
		if ( secClusRoleService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecClusRoleService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusRoleService );
	}

	public SecureJpaSecClusRoleMembService getSecClusRoleMembService() {
		if ( secClusRoleMembService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecClusRoleMembService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secClusRoleMembService );
	}

	public SecureJpaSecTentRoleService getSecTentRoleService() {
		if ( secTentRoleService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecTentRoleService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentRoleService );
	}

	public SecureJpaSecTentRoleMembService getSecTentRoleMembService() {
		if ( secTentRoleMembService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecTentRoleMembService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secTentRoleMembService );
	}

	public SecureJpaSecSessionService getSecSessionService() {
		if ( secSessionService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSecSessionService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( secSessionService );
	}

	public SecureJpaSysClusterService getSysClusterService() {
		if ( sysClusterService == null ) {
			// Dynamically resolve the repository by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getSysClusterService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( sysClusterService );
	}
}

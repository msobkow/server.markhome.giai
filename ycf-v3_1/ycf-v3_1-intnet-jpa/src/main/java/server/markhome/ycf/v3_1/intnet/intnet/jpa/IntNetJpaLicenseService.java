// Description: Java 25 Spring JPA Service for License

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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;

/**
 *	Service for the IntNetLicense entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa
 *	using the IntNetLicenseRepository to access them.
 */
@Service("intnet31JpaLicenseService")
public class IntNetJpaLicenseService {

	@Autowired
	@Qualifier("intnet31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean intnet31EntityManagerFactory;

	@Autowired
	private IntNetJpaLicenseRepository intnet31LicenseRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of IntNetJpaLicense, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense create(IntNetJpaLicense data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredId = data.getRequiredId();
		boolean generatedRequiredId = false;
		if (data.getRequiredOwnerTenant() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Owner",
				"Owner",
				"data.requiredOwnerTenant",
				"data.requiredOwnerTenant",
				"Tenant",
				"Tenant",
				null);
		}
		if (data.getRequiredContainerTopDomain() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerTopDomain",
				"data.requiredContainerTopDomain",
				"TopDomain",
				"TopDomain",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredTopDomainId() == null || data.getRequiredTopDomainId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTopDomainId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && intnet31LicenseRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (IntNetJpaLicense)(intnet31LicenseRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredId() == null || data.getRequiredId().isNull()) {
				data.setRequiredId(new CFDbKeyHash256(0));
				generatedRequiredId = true;
			}
			return intnet31LicenseRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredId) {
					data.setRequiredId(originalRequiredId);
				}
			throw new CFDbException(getClass(),
				S_ProcName,
				ex);
		}
	}

	/**
	 *	Update an existing entity.
	 *
	 *		@param	data	The entity to be updated.
	 *
	 *		@return The updated entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense update(IntNetJpaLicense data) {
		final String S_ProcName = "update";
		if (data == null) {
			return( null );
		}
		if (data.getPKey() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.getPKey()");
		}
		if (data.getRequiredOwnerTenant() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Owner",
				"Owner",
				"data.requiredOwnerTenant",
				"data.requiredOwnerTenant",
				"Tenant",
				"Tenant",
				null);
		}
		if (data.getRequiredContainerTopDomain() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerTopDomain",
				"data.requiredContainerTopDomain",
				"TopDomain",
				"TopDomain",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredTopDomainId() == null || data.getRequiredTopDomainId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTopDomainId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		// Ensure the entity exists and that the revision matches
		IntNetJpaLicense existing = intnet31LicenseRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of IntNetLicense to existing object
		existing.setRequiredOwnerTenant(data.getRequiredTenantId());
		existing.setRequiredContainerTopDomain(data.getRequiredContainerTopDomain());
		// Apply data columns of IntNetLicense to existing object
		existing.setRequiredTenantId(data.getRequiredTenantId());
		existing.setRequiredTopDomainId(data.getRequiredTopDomainId());
		existing.setRequiredName(data.getRequiredName());
		existing.setOptionalDescription(data.getOptionalDescription());
		existing.setOptionalEmbeddedText(data.getOptionalEmbeddedText());
		existing.setOptionalFullText(data.getOptionalFullText());
		// Save the changes we've made
		return intnet31LicenseRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense find(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31LicenseRepository.get(requiredId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> findAll() {
		return( intnet31LicenseRepository.findAll() );
	}

	// IntNetLicense specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetLicenseByLicnTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;IntNetJpaLicense&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> findByLicnTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31LicenseRepository.findByLicnTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetLicenseByLicnTenantIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetLicenseByLicnTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> findByLicnTenantIdx(IIntNetLicenseByLicnTenantIdxKey key) {
		return( intnet31LicenseRepository.findByLicnTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetLicenseByDomainIdxKey as arguments.
	 *
	 *		@param requiredTopDomainId
	 *
	 *		@return List&lt;IntNetJpaLicense&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> findByDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId) {
		return( intnet31LicenseRepository.findByDomainIdx(requiredTopDomainId));
	}

	/**
	 *	IIntNetLicenseByDomainIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetLicenseByDomainIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> findByDomainIdx(IIntNetLicenseByDomainIdxKey key) {
		return( intnet31LicenseRepository.findByDomainIdx(key.getRequiredTopDomainId()));
	}

	/**
	 *	Find an entity using the columns of the IIntNetLicenseByUNameIdxKey as arguments.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense findByUNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName) {
		return( intnet31LicenseRepository.findByUNameIdx(requiredTopDomainId,
			requiredName));
	}

	/**
	 *	IIntNetLicenseByUNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetLicenseByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense findByUNameIdx(IIntNetLicenseByUNameIdxKey key) {
		return( intnet31LicenseRepository.findByUNameIdx(key.getRequiredTopDomainId(), key.getRequiredName()));
	}

	// IntNetLicense specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense lockByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31LicenseRepository.lockByIdIdx(requiredId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> lockByLicnTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31LicenseRepository.lockByLicnTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetLicenseByLicnTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> lockByLicnTenantIdx(IIntNetLicenseByLicnTenantIdxKey key) {
		return( intnet31LicenseRepository.lockByLicnTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> lockByDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId) {
		return( intnet31LicenseRepository.lockByDomainIdx(requiredTopDomainId));
	}

	/**
	 *	IIntNetLicenseByDomainIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaLicense> lockByDomainIdx(IIntNetLicenseByDomainIdxKey key) {
		return( intnet31LicenseRepository.lockByDomainIdx(key.getRequiredTopDomainId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense lockByUNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName) {
		return( intnet31LicenseRepository.lockByUNameIdx(requiredTopDomainId,
			requiredName));
	}

	/**
	 *	IIntNetLicenseByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaLicense lockByUNameIdx(IIntNetLicenseByUNameIdxKey key) {
		return( intnet31LicenseRepository.lockByUNameIdx(key.getRequiredTopDomainId(), key.getRequiredName()));
	}

	// IntNetLicense specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		intnet31LicenseRepository.deleteByIdIdx(requiredId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByLicnTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		intnet31LicenseRepository.deleteByLicnTenantIdx(requiredTenantId);
	}

	/**
	 *	IIntNetLicenseByLicnTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetLicenseByLicnTenantIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByLicnTenantIdx(IIntNetLicenseByLicnTenantIdxKey key) {
		intnet31LicenseRepository.deleteByLicnTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId) {
		intnet31LicenseRepository.deleteByDomainIdx(requiredTopDomainId);
	}

	/**
	 *	IIntNetLicenseByDomainIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetLicenseByDomainIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByDomainIdx(IIntNetLicenseByDomainIdxKey key) {
		intnet31LicenseRepository.deleteByDomainIdx(key.getRequiredTopDomainId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByUNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName) {
		intnet31LicenseRepository.deleteByUNameIdx(requiredTopDomainId,
			requiredName);
	}

	/**
	 *	IIntNetLicenseByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetLicenseByUNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByUNameIdx(IIntNetLicenseByUNameIdxKey key) {
		intnet31LicenseRepository.deleteByUNameIdx(key.getRequiredTopDomainId(), key.getRequiredName());
	}

}

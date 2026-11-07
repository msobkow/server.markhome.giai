// Description: Java 25 Spring JPA Service for TopProject

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
 *	Service for the IntNetTopProject entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa
 *	using the IntNetTopProjectRepository to access them.
 */
@Service("intnet31JpaTopProjectService")
public class IntNetJpaTopProjectService {

	@Autowired
	@Qualifier("intnet31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean intnet31EntityManagerFactory;

	@Autowired
	private IntNetJpaTopProjectRepository intnet31TopProjectRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of IntNetJpaTopProject, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopProject create(IntNetJpaTopProject data) {
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
		if (data.getRequiredContainerParentSDom() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentSDom",
				"data.requiredContainerParentSDom",
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
			if(data.getPKey() != null && !data.getPKey().isNull() && intnet31TopProjectRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (IntNetJpaTopProject)(intnet31TopProjectRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredId() == null || data.getRequiredId().isNull()) {
				data.setRequiredId(new CFDbKeyHash256(0));
				generatedRequiredId = true;
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return intnet31TopProjectRepository.save(data);
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
	public IntNetJpaTopProject update(IntNetJpaTopProject data) {
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
		if (data.getRequiredContainerParentSDom() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentSDom",
				"data.requiredContainerParentSDom",
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
		IntNetJpaTopProject existing = intnet31TopProjectRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of IntNetTopProject to existing object
		existing.setRequiredOwnerTenant(data.getRequiredTenantId());
		existing.setRequiredContainerParentSDom(data.getRequiredContainerParentSDom());
		// Apply data columns of IntNetTopProject to existing object
		existing.setRequiredTenantId(data.getRequiredTenantId());
		existing.setRequiredTopDomainId(data.getRequiredTopDomainId());
		existing.setRequiredName(data.getRequiredName());
		existing.setOptionalDescription(data.getOptionalDescription());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return intnet31TopProjectRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopProject find(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31TopProjectRepository.get(requiredId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> findAll() {
		return( intnet31TopProjectRepository.findAll() );
	}

	// IntNetTopProject specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetTopProjectByTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;IntNetJpaTopProject&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> findByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31TopProjectRepository.findByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetTopProjectByTenantIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetTopProjectByTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> findByTenantIdx(IIntNetTopProjectByTenantIdxKey key) {
		return( intnet31TopProjectRepository.findByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetTopProjectByTopDomainIdxKey as arguments.
	 *
	 *		@param requiredTopDomainId
	 *
	 *		@return List&lt;IntNetJpaTopProject&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> findByTopDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId) {
		return( intnet31TopProjectRepository.findByTopDomainIdx(requiredTopDomainId));
	}

	/**
	 *	IIntNetTopProjectByTopDomainIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetTopProjectByTopDomainIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> findByTopDomainIdx(IIntNetTopProjectByTopDomainIdxKey key) {
		return( intnet31TopProjectRepository.findByTopDomainIdx(key.getRequiredTopDomainId()));
	}

	/**
	 *	Find an entity using the columns of the IIntNetTopProjectByNameIdxKey as arguments.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopProject findByNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName) {
		return( intnet31TopProjectRepository.findByNameIdx(requiredTopDomainId,
			requiredName));
	}

	/**
	 *	IIntNetTopProjectByNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetTopProjectByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopProject findByNameIdx(IIntNetTopProjectByNameIdxKey key) {
		return( intnet31TopProjectRepository.findByNameIdx(key.getRequiredTopDomainId(), key.getRequiredName()));
	}

	// IntNetTopProject specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopProject lockByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31TopProjectRepository.lockByIdIdx(requiredId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> lockByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31TopProjectRepository.lockByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetTopProjectByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> lockByTenantIdx(IIntNetTopProjectByTenantIdxKey key) {
		return( intnet31TopProjectRepository.lockByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> lockByTopDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId) {
		return( intnet31TopProjectRepository.lockByTopDomainIdx(requiredTopDomainId));
	}

	/**
	 *	IIntNetTopProjectByTopDomainIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaTopProject> lockByTopDomainIdx(IIntNetTopProjectByTopDomainIdxKey key) {
		return( intnet31TopProjectRepository.lockByTopDomainIdx(key.getRequiredTopDomainId()));
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
	public IntNetJpaTopProject lockByNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName) {
		return( intnet31TopProjectRepository.lockByNameIdx(requiredTopDomainId,
			requiredName));
	}

	/**
	 *	IIntNetTopProjectByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaTopProject lockByNameIdx(IIntNetTopProjectByNameIdxKey key) {
		return( intnet31TopProjectRepository.lockByNameIdx(key.getRequiredTopDomainId(), key.getRequiredName()));
	}

	// IntNetTopProject specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		intnet31TopProjectRepository.deleteByIdIdx(requiredId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		intnet31TopProjectRepository.deleteByTenantIdx(requiredTenantId);
	}

	/**
	 *	IIntNetTopProjectByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetTopProjectByTenantIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(IIntNetTopProjectByTenantIdxKey key) {
		intnet31TopProjectRepository.deleteByTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTopDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId) {
		intnet31TopProjectRepository.deleteByTopDomainIdx(requiredTopDomainId);
	}

	/**
	 *	IIntNetTopProjectByTopDomainIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetTopProjectByTopDomainIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTopDomainIdx(IIntNetTopProjectByTopDomainIdxKey key) {
		intnet31TopProjectRepository.deleteByTopDomainIdx(key.getRequiredTopDomainId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName) {
		intnet31TopProjectRepository.deleteByNameIdx(requiredTopDomainId,
			requiredName);
	}

	/**
	 *	IIntNetTopProjectByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetTopProjectByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(IIntNetTopProjectByNameIdxKey key) {
		intnet31TopProjectRepository.deleteByNameIdx(key.getRequiredTopDomainId(), key.getRequiredName());
	}

}

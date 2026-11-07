// Description: Java 25 Spring JPA Service for SubProject

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
 *	Service for the IntNetSubProject entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa
 *	using the IntNetSubProjectRepository to access them.
 */
@Service("intnet31JpaSubProjectService")
public class IntNetJpaSubProjectService {

	@Autowired
	@Qualifier("intnet31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean intnet31EntityManagerFactory;

	@Autowired
	private IntNetJpaSubProjectRepository intnet31SubProjectRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of IntNetJpaSubProject, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaSubProject create(IntNetJpaSubProject data) {
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
		if (data.getRequiredContainerParentTPrj() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentTPrj",
				"data.requiredContainerParentTPrj",
				"TopProject",
				"TopProject",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredTopProjectId() == null || data.getRequiredTopProjectId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTopProjectId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && intnet31SubProjectRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (IntNetJpaSubProject)(intnet31SubProjectRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
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
			return intnet31SubProjectRepository.save(data);
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
	public IntNetJpaSubProject update(IntNetJpaSubProject data) {
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
		if (data.getRequiredContainerParentTPrj() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentTPrj",
				"data.requiredContainerParentTPrj",
				"TopProject",
				"TopProject",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredTopProjectId() == null || data.getRequiredTopProjectId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTopProjectId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		// Ensure the entity exists and that the revision matches
		IntNetJpaSubProject existing = intnet31SubProjectRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of IntNetSubProject to existing object
		existing.setRequiredOwnerTenant(data.getRequiredTenantId());
		existing.setRequiredContainerParentTPrj(data.getRequiredContainerParentTPrj());
		// Apply data columns of IntNetSubProject to existing object
		existing.setRequiredTenantId(data.getRequiredTenantId());
		existing.setRequiredTopProjectId(data.getRequiredTopProjectId());
		existing.setRequiredName(data.getRequiredName());
		existing.setOptionalDescription(data.getOptionalDescription());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return intnet31SubProjectRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaSubProject find(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31SubProjectRepository.get(requiredId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> findAll() {
		return( intnet31SubProjectRepository.findAll() );
	}

	// IntNetSubProject specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetSubProjectByTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;IntNetJpaSubProject&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> findByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31SubProjectRepository.findByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetSubProjectByTenantIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetSubProjectByTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> findByTenantIdx(IIntNetSubProjectByTenantIdxKey key) {
		return( intnet31SubProjectRepository.findByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetSubProjectByTopProjectIdxKey as arguments.
	 *
	 *		@param requiredTopProjectId
	 *
	 *		@return List&lt;IntNetJpaSubProject&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> findByTopProjectIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId) {
		return( intnet31SubProjectRepository.findByTopProjectIdx(requiredTopProjectId));
	}

	/**
	 *	IIntNetSubProjectByTopProjectIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetSubProjectByTopProjectIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> findByTopProjectIdx(IIntNetSubProjectByTopProjectIdxKey key) {
		return( intnet31SubProjectRepository.findByTopProjectIdx(key.getRequiredTopProjectId()));
	}

	/**
	 *	Find an entity using the columns of the IIntNetSubProjectByNameIdxKey as arguments.
	 *
	 *		@param requiredTopProjectId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaSubProject findByNameIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId,
		@Param("name") String requiredName) {
		return( intnet31SubProjectRepository.findByNameIdx(requiredTopProjectId,
			requiredName));
	}

	/**
	 *	IIntNetSubProjectByNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetSubProjectByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaSubProject findByNameIdx(IIntNetSubProjectByNameIdxKey key) {
		return( intnet31SubProjectRepository.findByNameIdx(key.getRequiredTopProjectId(), key.getRequiredName()));
	}

	// IntNetSubProject specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaSubProject lockByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31SubProjectRepository.lockByIdIdx(requiredId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> lockByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31SubProjectRepository.lockByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetSubProjectByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> lockByTenantIdx(IIntNetSubProjectByTenantIdxKey key) {
		return( intnet31SubProjectRepository.lockByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> lockByTopProjectIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId) {
		return( intnet31SubProjectRepository.lockByTopProjectIdx(requiredTopProjectId));
	}

	/**
	 *	IIntNetSubProjectByTopProjectIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaSubProject> lockByTopProjectIdx(IIntNetSubProjectByTopProjectIdxKey key) {
		return( intnet31SubProjectRepository.lockByTopProjectIdx(key.getRequiredTopProjectId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaSubProject lockByNameIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId,
		@Param("name") String requiredName) {
		return( intnet31SubProjectRepository.lockByNameIdx(requiredTopProjectId,
			requiredName));
	}

	/**
	 *	IIntNetSubProjectByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaSubProject lockByNameIdx(IIntNetSubProjectByNameIdxKey key) {
		return( intnet31SubProjectRepository.lockByNameIdx(key.getRequiredTopProjectId(), key.getRequiredName()));
	}

	// IntNetSubProject specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		intnet31SubProjectRepository.deleteByIdIdx(requiredId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		intnet31SubProjectRepository.deleteByTenantIdx(requiredTenantId);
	}

	/**
	 *	IIntNetSubProjectByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetSubProjectByTenantIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(IIntNetSubProjectByTenantIdxKey key) {
		intnet31SubProjectRepository.deleteByTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTopProjectIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId) {
		intnet31SubProjectRepository.deleteByTopProjectIdx(requiredTopProjectId);
	}

	/**
	 *	IIntNetSubProjectByTopProjectIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetSubProjectByTopProjectIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTopProjectIdx(IIntNetSubProjectByTopProjectIdxKey key) {
		intnet31SubProjectRepository.deleteByTopProjectIdx(key.getRequiredTopProjectId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId,
		@Param("name") String requiredName) {
		intnet31SubProjectRepository.deleteByNameIdx(requiredTopProjectId,
			requiredName);
	}

	/**
	 *	IIntNetSubProjectByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetSubProjectByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(IIntNetSubProjectByNameIdxKey key) {
		intnet31SubProjectRepository.deleteByNameIdx(key.getRequiredTopProjectId(), key.getRequiredName());
	}

}

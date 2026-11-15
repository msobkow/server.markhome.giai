// Description: Java 25 Spring JPA Service for MajorVersion

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
 *	Service for the IntNetMajorVersion entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa
 *	using the IntNetMajorVersionRepository to access them.
 */
@Service("intnet31JpaMajorVersionService")
public class IntNetJpaMajorVersionService {

	@Autowired
	@Qualifier("intnet31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean intnet31EntityManagerFactory;

	@Autowired
	private IntNetJpaMajorVersionRepository intnet31MajorVersionRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of IntNetJpaMajorVersion, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion create(IntNetJpaMajorVersion data) {
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
		if (data.getRequiredContainerParentSPrj() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentSPrj",
				"data.requiredContainerParentSPrj",
				"SubProject",
				"SubProject",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredSubProjectId() == null || data.getRequiredSubProjectId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSubProjectId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && intnet31MajorVersionRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (IntNetJpaMajorVersion)(intnet31MajorVersionRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
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
			return intnet31MajorVersionRepository.save(data);
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
	public IntNetJpaMajorVersion update(IntNetJpaMajorVersion data) {
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
		if (data.getRequiredContainerParentSPrj() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentSPrj",
				"data.requiredContainerParentSPrj",
				"SubProject",
				"SubProject",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredSubProjectId() == null || data.getRequiredSubProjectId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSubProjectId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		// Ensure the entity exists and that the revision matches
		IntNetJpaMajorVersion existing = intnet31MajorVersionRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of IntNetMajorVersion to existing object
		existing.setRequiredOwnerTenant(data.getRequiredTenantId());
		existing.setRequiredContainerParentSPrj(data.getRequiredContainerParentSPrj());
		// Apply data columns of IntNetMajorVersion to existing object
		existing.setRequiredTenantId(data.getRequiredTenantId());
		existing.setRequiredSubProjectId(data.getRequiredSubProjectId());
		existing.setRequiredName(data.getRequiredName());
		existing.setOptionalDescription(data.getOptionalDescription());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return intnet31MajorVersionRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion find(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31MajorVersionRepository.get(requiredId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> findAll() {
		return( intnet31MajorVersionRepository.findAll() );
	}

	// IntNetMajorVersion specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetMajorVersionByTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;IntNetJpaMajorVersion&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> findByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31MajorVersionRepository.findByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetMajorVersionByTenantIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetMajorVersionByTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> findByTenantIdx(IIntNetMajorVersionByTenantIdxKey key) {
		return( intnet31MajorVersionRepository.findByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetMajorVersionBySubProjectIdxKey as arguments.
	 *
	 *		@param requiredSubProjectId
	 *
	 *		@return List&lt;IntNetJpaMajorVersion&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> findBySubProjectIdx(@Param("subProjectId") ICFKeyHash256 requiredSubProjectId) {
		return( intnet31MajorVersionRepository.findBySubProjectIdx(requiredSubProjectId));
	}

	/**
	 *	IIntNetMajorVersionBySubProjectIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetMajorVersionBySubProjectIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> findBySubProjectIdx(IIntNetMajorVersionBySubProjectIdxKey key) {
		return( intnet31MajorVersionRepository.findBySubProjectIdx(key.getRequiredSubProjectId()));
	}

	/**
	 *	Find an entity using the columns of the IIntNetMajorVersionByNameIdxKey as arguments.
	 *
	 *		@param requiredSubProjectId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion findByNameIdx(@Param("subProjectId") ICFKeyHash256 requiredSubProjectId,
		@Param("name") String requiredName) {
		return( intnet31MajorVersionRepository.findByNameIdx(requiredSubProjectId,
			requiredName));
	}

	/**
	 *	IIntNetMajorVersionByNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetMajorVersionByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion findByNameIdx(IIntNetMajorVersionByNameIdxKey key) {
		return( intnet31MajorVersionRepository.findByNameIdx(key.getRequiredSubProjectId(), key.getRequiredName()));
	}

	// IntNetMajorVersion specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion lockByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31MajorVersionRepository.lockByIdIdx(requiredId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> lockByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31MajorVersionRepository.lockByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetMajorVersionByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> lockByTenantIdx(IIntNetMajorVersionByTenantIdxKey key) {
		return( intnet31MajorVersionRepository.lockByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSubProjectId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> lockBySubProjectIdx(@Param("subProjectId") ICFKeyHash256 requiredSubProjectId) {
		return( intnet31MajorVersionRepository.lockBySubProjectIdx(requiredSubProjectId));
	}

	/**
	 *	IIntNetMajorVersionBySubProjectIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMajorVersion> lockBySubProjectIdx(IIntNetMajorVersionBySubProjectIdxKey key) {
		return( intnet31MajorVersionRepository.lockBySubProjectIdx(key.getRequiredSubProjectId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSubProjectId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion lockByNameIdx(@Param("subProjectId") ICFKeyHash256 requiredSubProjectId,
		@Param("name") String requiredName) {
		return( intnet31MajorVersionRepository.lockByNameIdx(requiredSubProjectId,
			requiredName));
	}

	/**
	 *	IIntNetMajorVersionByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMajorVersion lockByNameIdx(IIntNetMajorVersionByNameIdxKey key) {
		return( intnet31MajorVersionRepository.lockByNameIdx(key.getRequiredSubProjectId(), key.getRequiredName()));
	}

	// IntNetMajorVersion specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		intnet31MajorVersionRepository.deleteByIdIdx(requiredId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		intnet31MajorVersionRepository.deleteByTenantIdx(requiredTenantId);
	}

	/**
	 *	IIntNetMajorVersionByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetMajorVersionByTenantIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(IIntNetMajorVersionByTenantIdxKey key) {
		intnet31MajorVersionRepository.deleteByTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSubProjectId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteBySubProjectIdx(@Param("subProjectId") ICFKeyHash256 requiredSubProjectId) {
		intnet31MajorVersionRepository.deleteBySubProjectIdx(requiredSubProjectId);
	}

	/**
	 *	IIntNetMajorVersionBySubProjectIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetMajorVersionBySubProjectIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteBySubProjectIdx(IIntNetMajorVersionBySubProjectIdxKey key) {
		intnet31MajorVersionRepository.deleteBySubProjectIdx(key.getRequiredSubProjectId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSubProjectId
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(@Param("subProjectId") ICFKeyHash256 requiredSubProjectId,
		@Param("name") String requiredName) {
		intnet31MajorVersionRepository.deleteByNameIdx(requiredSubProjectId,
			requiredName);
	}

	/**
	 *	IIntNetMajorVersionByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetMajorVersionByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(IIntNetMajorVersionByNameIdxKey key) {
		intnet31MajorVersionRepository.deleteByNameIdx(key.getRequiredSubProjectId(), key.getRequiredName());
	}

}

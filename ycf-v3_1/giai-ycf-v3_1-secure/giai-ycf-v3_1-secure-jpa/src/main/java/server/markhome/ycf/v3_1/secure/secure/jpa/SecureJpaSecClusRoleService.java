// Description: Java 25 Spring JPA Service for SecClusRole

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
import server.markhome.ycf.v3_1.secure.secure.*;

/**
 *	Service for the SecureSecClusRole entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecClusRoleRepository to access them.
 */
@Service("secure31JpaSecClusRoleService")
public class SecureJpaSecClusRoleService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecClusRoleRepository secure31SecClusRoleRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecClusRole, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole create(SecureJpaSecClusRole data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredSecClusRoleId = data.getRequiredSecClusRoleId();
		boolean generatedRequiredSecClusRoleId = false;
		if (data.getRequiredOwnerCluster() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Owner",
				"Owner",
				"data.requiredOwnerCluster",
				"data.requiredOwnerCluster",
				"Cluster",
				"Cluster",
				null);
		}
		if (data.getRequiredContainerSysRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysRole",
				"data.requiredContainerSysRole",
				"SecSysGrp",
				"SecSysGrp",
				null);
		}
		if(data.getRequiredClusterId() == null || data.getRequiredClusterId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredClusterId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecClusRoleRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecClusRole)(secure31SecClusRoleRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredSecClusRoleId() == null || data.getRequiredSecClusRoleId().isNull()) {
				data.setRequiredSecClusRoleId(new CFDbKeyHash256(0));
				generatedRequiredSecClusRoleId = true;
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecClusRoleRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredSecClusRoleId) {
					data.setRequiredSecClusRoleId(originalRequiredSecClusRoleId);
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
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole update(SecureJpaSecClusRole data) {
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
		if (data.getRequiredOwnerCluster() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Owner",
				"Owner",
				"data.requiredOwnerCluster",
				"data.requiredOwnerCluster",
				"Cluster",
				"Cluster",
				null);
		}
		if (data.getRequiredContainerSysRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysRole",
				"data.requiredContainerSysRole",
				"SecSysGrp",
				"SecSysGrp",
				null);
		}
		if(data.getRequiredClusterId() == null || data.getRequiredClusterId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredClusterId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecClusRole existing = secure31SecClusRoleRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecClusRole to existing object
		existing.setRequiredOwnerCluster(data.getRequiredOwnerCluster());
		existing.setRequiredContainerSysRole(data.getRequiredContainerSysRole());
		// Apply data columns of SecureSecClusRole to existing object
		existing.setRequiredClusterId(data.getRequiredClusterId());
		existing.setRequiredName(data.getRequiredName());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecClusRoleRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecClusRoleId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole find(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId) {
		return( secure31SecClusRoleRepository.get(requiredSecClusRoleId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> findAll() {
		return( secure31SecClusRoleRepository.findAll() );
	}

	// SecureSecClusRole specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecClusRoleByClusterIdxKey as arguments.
	 *
	 *		@param requiredClusterId
	 *
	 *		@return List&lt;SecureJpaSecClusRole&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> findByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId) {
		return( secure31SecClusRoleRepository.findByClusterIdx(requiredClusterId));
	}

	/**
	 *	ISecureSecClusRoleByClusterIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleByClusterIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> findByClusterIdx(ISecureSecClusRoleByClusterIdxKey key) {
		return( secure31SecClusRoleRepository.findByClusterIdx(key.getRequiredClusterId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecClusRoleByNameIdxKey as arguments.
	 *
	 *		@param requiredName
	 *
	 *		@return List&lt;SecureJpaSecClusRole&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> findByNameIdx(@Param("name") String requiredName) {
		return( secure31SecClusRoleRepository.findByNameIdx(requiredName));
	}

	/**
	 *	ISecureSecClusRoleByNameIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> findByNameIdx(ISecureSecClusRoleByNameIdxKey key) {
		return( secure31SecClusRoleRepository.findByNameIdx(key.getRequiredName()));
	}

	/**
	 *	Find an entity using the columns of the ISecureSecClusRoleByUNameIdxKey as arguments.
	 *
	 *		@param requiredClusterId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole findByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("name") String requiredName) {
		return( secure31SecClusRoleRepository.findByUNameIdx(requiredClusterId,
			requiredName));
	}

	/**
	 *	ISecureSecClusRoleByUNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole findByUNameIdx(ISecureSecClusRoleByUNameIdxKey key) {
		return( secure31SecClusRoleRepository.findByUNameIdx(key.getRequiredClusterId(), key.getRequiredName()));
	}

	// SecureSecClusRole specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole lockByIdIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId) {
		return( secure31SecClusRoleRepository.lockByIdIdx(requiredSecClusRoleId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> lockByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId) {
		return( secure31SecClusRoleRepository.lockByClusterIdx(requiredClusterId));
	}

	/**
	 *	ISecureSecClusRoleByClusterIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> lockByClusterIdx(ISecureSecClusRoleByClusterIdxKey key) {
		return( secure31SecClusRoleRepository.lockByClusterIdx(key.getRequiredClusterId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> lockByNameIdx(@Param("name") String requiredName) {
		return( secure31SecClusRoleRepository.lockByNameIdx(requiredName));
	}

	/**
	 *	ISecureSecClusRoleByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRole> lockByNameIdx(ISecureSecClusRoleByNameIdxKey key) {
		return( secure31SecClusRoleRepository.lockByNameIdx(key.getRequiredName()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole lockByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("name") String requiredName) {
		return( secure31SecClusRoleRepository.lockByUNameIdx(requiredClusterId,
			requiredName));
	}

	/**
	 *	ISecureSecClusRoleByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRole lockByUNameIdx(ISecureSecClusRoleByUNameIdxKey key) {
		return( secure31SecClusRoleRepository.lockByUNameIdx(key.getRequiredClusterId(), key.getRequiredName()));
	}

	// SecureSecClusRole specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId) {
		secure31SecClusRoleRepository.deleteByIdIdx(requiredSecClusRoleId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId) {
		secure31SecClusRoleRepository.deleteByClusterIdx(requiredClusterId);
	}

	/**
	 *	ISecureSecClusRoleByClusterIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleByClusterIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByClusterIdx(ISecureSecClusRoleByClusterIdxKey key) {
		secure31SecClusRoleRepository.deleteByClusterIdx(key.getRequiredClusterId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(@Param("name") String requiredName) {
		secure31SecClusRoleRepository.deleteByNameIdx(requiredName);
	}

	/**
	 *	ISecureSecClusRoleByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(ISecureSecClusRoleByNameIdxKey key) {
		secure31SecClusRoleRepository.deleteByNameIdx(key.getRequiredName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("name") String requiredName) {
		secure31SecClusRoleRepository.deleteByUNameIdx(requiredClusterId,
			requiredName);
	}

	/**
	 *	ISecureSecClusRoleByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleByUNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUNameIdx(ISecureSecClusRoleByUNameIdxKey key) {
		secure31SecClusRoleRepository.deleteByUNameIdx(key.getRequiredClusterId(), key.getRequiredName());
	}

}

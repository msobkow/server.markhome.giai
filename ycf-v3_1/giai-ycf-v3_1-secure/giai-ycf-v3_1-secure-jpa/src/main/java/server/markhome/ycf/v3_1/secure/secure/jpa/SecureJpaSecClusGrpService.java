// Description: Java 25 Spring JPA Service for SecClusGrp

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
 *	Service for the SecureSecClusGrp entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecClusGrpRepository to access them.
 */
@Service("secure31JpaSecClusGrpService")
public class SecureJpaSecClusGrpService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecClusGrpRepository secure31SecClusGrpRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecClusGrp, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrp create(SecureJpaSecClusGrp data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredSecClusGrpId = data.getRequiredSecClusGrpId();
		boolean generatedRequiredSecClusGrpId = false;
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
		if (data.getRequiredContainerSysGrp() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysGrp",
				"data.requiredContainerSysGrp",
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
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecClusGrpRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecClusGrp)(secure31SecClusGrpRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredSecClusGrpId() == null || data.getRequiredSecClusGrpId().isNull()) {
				data.setRequiredSecClusGrpId(new CFDbKeyHash256(0));
				generatedRequiredSecClusGrpId = true;
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecClusGrpRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredSecClusGrpId) {
					data.setRequiredSecClusGrpId(originalRequiredSecClusGrpId);
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
	public SecureJpaSecClusGrp update(SecureJpaSecClusGrp data) {
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
		if (data.getRequiredContainerSysGrp() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysGrp",
				"data.requiredContainerSysGrp",
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
		SecureJpaSecClusGrp existing = secure31SecClusGrpRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecClusGrp to existing object
		existing.setRequiredOwnerCluster(data.getRequiredOwnerCluster());
		existing.setRequiredContainerSysGrp(data.getRequiredContainerSysGrp());
		// Apply data columns of SecureSecClusGrp to existing object
		existing.setRequiredClusterId(data.getRequiredClusterId());
		existing.setRequiredName(data.getRequiredName());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecClusGrpRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecClusGrpId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrp find(@Param("secClusGrpId") ICFKeyHash256 requiredSecClusGrpId) {
		return( secure31SecClusGrpRepository.get(requiredSecClusGrpId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> findAll() {
		return( secure31SecClusGrpRepository.findAll() );
	}

	// SecureSecClusGrp specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecClusGrpByClusterIdxKey as arguments.
	 *
	 *		@param requiredClusterId
	 *
	 *		@return List&lt;SecureJpaSecClusGrp&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> findByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId) {
		return( secure31SecClusGrpRepository.findByClusterIdx(requiredClusterId));
	}

	/**
	 *	ISecureSecClusGrpByClusterIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusGrpByClusterIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> findByClusterIdx(ISecureSecClusGrpByClusterIdxKey key) {
		return( secure31SecClusGrpRepository.findByClusterIdx(key.getRequiredClusterId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecClusGrpByNameIdxKey as arguments.
	 *
	 *		@param requiredName
	 *
	 *		@return List&lt;SecureJpaSecClusGrp&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> findByNameIdx(@Param("name") String requiredName) {
		return( secure31SecClusGrpRepository.findByNameIdx(requiredName));
	}

	/**
	 *	ISecureSecClusGrpByNameIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusGrpByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> findByNameIdx(ISecureSecClusGrpByNameIdxKey key) {
		return( secure31SecClusGrpRepository.findByNameIdx(key.getRequiredName()));
	}

	/**
	 *	Find an entity using the columns of the ISecureSecClusGrpByUNameIdxKey as arguments.
	 *
	 *		@param requiredClusterId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrp findByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("name") String requiredName) {
		return( secure31SecClusGrpRepository.findByUNameIdx(requiredClusterId,
			requiredName));
	}

	/**
	 *	ISecureSecClusGrpByUNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusGrpByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrp findByUNameIdx(ISecureSecClusGrpByUNameIdxKey key) {
		return( secure31SecClusGrpRepository.findByUNameIdx(key.getRequiredClusterId(), key.getRequiredName()));
	}

	// SecureSecClusGrp specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusGrpId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrp lockByIdIdx(@Param("secClusGrpId") ICFKeyHash256 requiredSecClusGrpId) {
		return( secure31SecClusGrpRepository.lockByIdIdx(requiredSecClusGrpId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> lockByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId) {
		return( secure31SecClusGrpRepository.lockByClusterIdx(requiredClusterId));
	}

	/**
	 *	ISecureSecClusGrpByClusterIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> lockByClusterIdx(ISecureSecClusGrpByClusterIdxKey key) {
		return( secure31SecClusGrpRepository.lockByClusterIdx(key.getRequiredClusterId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> lockByNameIdx(@Param("name") String requiredName) {
		return( secure31SecClusGrpRepository.lockByNameIdx(requiredName));
	}

	/**
	 *	ISecureSecClusGrpByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusGrp> lockByNameIdx(ISecureSecClusGrpByNameIdxKey key) {
		return( secure31SecClusGrpRepository.lockByNameIdx(key.getRequiredName()));
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
	public SecureJpaSecClusGrp lockByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("name") String requiredName) {
		return( secure31SecClusGrpRepository.lockByUNameIdx(requiredClusterId,
			requiredName));
	}

	/**
	 *	ISecureSecClusGrpByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusGrp lockByUNameIdx(ISecureSecClusGrpByUNameIdxKey key) {
		return( secure31SecClusGrpRepository.lockByUNameIdx(key.getRequiredClusterId(), key.getRequiredName()));
	}

	// SecureSecClusGrp specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusGrpId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secClusGrpId") ICFKeyHash256 requiredSecClusGrpId) {
		secure31SecClusGrpRepository.deleteByIdIdx(requiredSecClusGrpId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId) {
		secure31SecClusGrpRepository.deleteByClusterIdx(requiredClusterId);
	}

	/**
	 *	ISecureSecClusGrpByClusterIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusGrpByClusterIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByClusterIdx(ISecureSecClusGrpByClusterIdxKey key) {
		secure31SecClusGrpRepository.deleteByClusterIdx(key.getRequiredClusterId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(@Param("name") String requiredName) {
		secure31SecClusGrpRepository.deleteByNameIdx(requiredName);
	}

	/**
	 *	ISecureSecClusGrpByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusGrpByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(ISecureSecClusGrpByNameIdxKey key) {
		secure31SecClusGrpRepository.deleteByNameIdx(key.getRequiredName());
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
		secure31SecClusGrpRepository.deleteByUNameIdx(requiredClusterId,
			requiredName);
	}

	/**
	 *	ISecureSecClusGrpByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusGrpByUNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUNameIdx(ISecureSecClusGrpByUNameIdxKey key) {
		secure31SecClusGrpRepository.deleteByUNameIdx(key.getRequiredClusterId(), key.getRequiredName());
	}

}

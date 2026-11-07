// Description: Java 25 Spring JPA Service for SecTentGrp

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
 *	Service for the SecureSecTentGrp entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecTentGrpRepository to access them.
 */
@Service("secure31JpaSecTentGrpService")
public class SecureJpaSecTentGrpService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecTentGrpRepository secure31SecTentGrpRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecTentGrp, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrp create(SecureJpaSecTentGrp data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredSecTentGrpId = data.getRequiredSecTentGrpId();
		boolean generatedRequiredSecTentGrpId = false;
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
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecTentGrpRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecTentGrp)(secure31SecTentGrpRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredSecTentGrpId() == null || data.getRequiredSecTentGrpId().isNull()) {
				data.setRequiredSecTentGrpId(new CFDbKeyHash256(0));
				generatedRequiredSecTentGrpId = true;
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecTentGrpRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredSecTentGrpId) {
					data.setRequiredSecTentGrpId(originalRequiredSecTentGrpId);
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
	public SecureJpaSecTentGrp update(SecureJpaSecTentGrp data) {
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
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecTentGrp existing = secure31SecTentGrpRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecTentGrp to existing object
		existing.setRequiredOwnerTenant(data.getRequiredOwnerTenant());
		existing.setRequiredContainerSysGrp(data.getRequiredContainerSysGrp());
		// Apply data columns of SecureSecTentGrp to existing object
		existing.setRequiredTenantId(data.getRequiredTenantId());
		existing.setRequiredName(data.getRequiredName());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecTentGrpRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecTentGrpId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrp find(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId) {
		return( secure31SecTentGrpRepository.get(requiredSecTentGrpId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> findAll() {
		return( secure31SecTentGrpRepository.findAll() );
	}

	// SecureSecTentGrp specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecTentGrpByTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;SecureJpaSecTentGrp&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> findByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( secure31SecTentGrpRepository.findByTenantIdx(requiredTenantId));
	}

	/**
	 *	ISecureSecTentGrpByTenantIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpByTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> findByTenantIdx(ISecureSecTentGrpByTenantIdxKey key) {
		return( secure31SecTentGrpRepository.findByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecTentGrpByNameIdxKey as arguments.
	 *
	 *		@param requiredName
	 *
	 *		@return List&lt;SecureJpaSecTentGrp&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> findByNameIdx(@Param("name") String requiredName) {
		return( secure31SecTentGrpRepository.findByNameIdx(requiredName));
	}

	/**
	 *	ISecureSecTentGrpByNameIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> findByNameIdx(ISecureSecTentGrpByNameIdxKey key) {
		return( secure31SecTentGrpRepository.findByNameIdx(key.getRequiredName()));
	}

	/**
	 *	Find an entity using the columns of the ISecureSecTentGrpByUNameIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrp findByUNameIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId,
		@Param("name") String requiredName) {
		return( secure31SecTentGrpRepository.findByUNameIdx(requiredTenantId,
			requiredName));
	}

	/**
	 *	ISecureSecTentGrpByUNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrp findByUNameIdx(ISecureSecTentGrpByUNameIdxKey key) {
		return( secure31SecTentGrpRepository.findByUNameIdx(key.getRequiredTenantId(), key.getRequiredName()));
	}

	// SecureSecTentGrp specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentGrpId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrp lockByIdIdx(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId) {
		return( secure31SecTentGrpRepository.lockByIdIdx(requiredSecTentGrpId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> lockByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( secure31SecTentGrpRepository.lockByTenantIdx(requiredTenantId));
	}

	/**
	 *	ISecureSecTentGrpByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> lockByTenantIdx(ISecureSecTentGrpByTenantIdxKey key) {
		return( secure31SecTentGrpRepository.lockByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> lockByNameIdx(@Param("name") String requiredName) {
		return( secure31SecTentGrpRepository.lockByNameIdx(requiredName));
	}

	/**
	 *	ISecureSecTentGrpByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrp> lockByNameIdx(ISecureSecTentGrpByNameIdxKey key) {
		return( secure31SecTentGrpRepository.lockByNameIdx(key.getRequiredName()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrp lockByUNameIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId,
		@Param("name") String requiredName) {
		return( secure31SecTentGrpRepository.lockByUNameIdx(requiredTenantId,
			requiredName));
	}

	/**
	 *	ISecureSecTentGrpByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrp lockByUNameIdx(ISecureSecTentGrpByUNameIdxKey key) {
		return( secure31SecTentGrpRepository.lockByUNameIdx(key.getRequiredTenantId(), key.getRequiredName()));
	}

	// SecureSecTentGrp specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentGrpId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId) {
		secure31SecTentGrpRepository.deleteByIdIdx(requiredSecTentGrpId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		secure31SecTentGrpRepository.deleteByTenantIdx(requiredTenantId);
	}

	/**
	 *	ISecureSecTentGrpByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpByTenantIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTenantIdx(ISecureSecTentGrpByTenantIdxKey key) {
		secure31SecTentGrpRepository.deleteByTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(@Param("name") String requiredName) {
		secure31SecTentGrpRepository.deleteByNameIdx(requiredName);
	}

	/**
	 *	ISecureSecTentGrpByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(ISecureSecTentGrpByNameIdxKey key) {
		secure31SecTentGrpRepository.deleteByNameIdx(key.getRequiredName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUNameIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId,
		@Param("name") String requiredName) {
		secure31SecTentGrpRepository.deleteByUNameIdx(requiredTenantId,
			requiredName);
	}

	/**
	 *	ISecureSecTentGrpByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpByUNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUNameIdx(ISecureSecTentGrpByUNameIdxKey key) {
		secure31SecTentGrpRepository.deleteByUNameIdx(key.getRequiredTenantId(), key.getRequiredName());
	}

}

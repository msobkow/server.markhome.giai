// Description: Java 25 Spring JPA Service for SecTentRoleMemb

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
 *	Service for the SecureSecTentRoleMemb entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecTentRoleMembRepository to access them.
 */
@Service("secure31JpaSecTentRoleMembService")
public class SecureJpaSecTentRoleMembService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecTentRoleMembRepository secure31SecTentRoleMembRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecTentRoleMemb, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMemb create(SecureJpaSecTentRoleMemb data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		if (data.getRequiredContainerRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerRole",
				"data.requiredContainerRole",
				"SecTentRole",
				"SecTentRole",
				null);
		}
		if (data.getRequiredParentUser() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentUser",
				"data.requiredParentUser",
				"SecUser",
				"SecUser",
				null);
		}
		try {
			if(data.getPKey() != null && secure31SecTentRoleMembRepository.existsById((SecureJpaSecTentRoleMembPKey)data.getPKey())) {
				return( (SecureJpaSecTentRoleMemb)(secure31SecTentRoleMembRepository.findById((SecureJpaSecTentRoleMembPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecTentRoleMembRepository.save(data);
		}
		catch(Exception ex) {
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
	public SecureJpaSecTentRoleMemb update(SecureJpaSecTentRoleMemb data) {
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
		if (data.getRequiredContainerRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerRole",
				"data.requiredContainerRole",
				"SecTentRole",
				"SecTentRole",
				null);
		}
		if (data.getRequiredParentUser() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentUser",
				"data.requiredParentUser",
				"SecUser",
				"SecUser",
				null);
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecTentRoleMemb existing = secure31SecTentRoleMembRepository.findById((SecureJpaSecTentRoleMembPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecTentRoleMemb to existing object
		// Apply data columns of SecureSecTentRoleMemb to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecTentRoleMembRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecTentRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMemb find(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecTentRoleMembRepository.get(requiredSecTentRoleId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecTentRoleMembPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMemb find(ISecureSecTentRoleMembPKey key) {
		return( secure31SecTentRoleMembRepository.get(key.getRequiredSecTentRoleId(), key.getRequiredLoginId()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> findAll() {
		return( secure31SecTentRoleMembRepository.findAll() );
	}

	// SecureSecTentRoleMemb specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecTentRoleMembByTentRoleIdxKey as arguments.
	 *
	 *		@param requiredSecTentRoleId
	 *
	 *		@return List&lt;SecureJpaSecTentRoleMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> findByTentRoleIdx(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId) {
		return( secure31SecTentRoleMembRepository.findByTentRoleIdx(requiredSecTentRoleId));
	}

	/**
	 *	ISecureSecTentRoleMembByTentRoleIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecTentRoleMembByTentRoleIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> findByTentRoleIdx(ISecureSecTentRoleMembByTentRoleIdxKey key) {
		return( secure31SecTentRoleMembRepository.findByTentRoleIdx(key.getRequiredSecTentRoleId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecTentRoleMembByUserIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return List&lt;SecureJpaSecTentRoleMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> findByUserIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecTentRoleMembRepository.findByUserIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecTentRoleMembByUserIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecTentRoleMembByUserIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> findByUserIdx(ISecureSecTentRoleMembByUserIdxKey key) {
		return( secure31SecTentRoleMembRepository.findByUserIdx(key.getRequiredLoginId()));
	}

	// SecureSecTentRoleMemb specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMemb lockByIdIdx(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecTentRoleMembRepository.lockByIdIdx(requiredSecTentRoleId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecTentRoleMembPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentRoleMemb lockByIdIdx(ISecureSecTentRoleMembPKey key) {
		return( secure31SecTentRoleMembRepository.lockByIdIdx(key.getRequiredSecTentRoleId(), key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentRoleId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> lockByTentRoleIdx(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId) {
		return( secure31SecTentRoleMembRepository.lockByTentRoleIdx(requiredSecTentRoleId));
	}

	/**
	 *	ISecureSecTentRoleMembByTentRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> lockByTentRoleIdx(ISecureSecTentRoleMembByTentRoleIdxKey key) {
		return( secure31SecTentRoleMembRepository.lockByTentRoleIdx(key.getRequiredSecTentRoleId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> lockByUserIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecTentRoleMembRepository.lockByUserIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecTentRoleMembByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentRoleMemb> lockByUserIdx(ISecureSecTentRoleMembByUserIdxKey key) {
		return( secure31SecTentRoleMembRepository.lockByUserIdx(key.getRequiredLoginId()));
	}

	// SecureSecTentRoleMemb specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentRoleId
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId,
		@Param("loginId") String requiredLoginId) {
		secure31SecTentRoleMembRepository.deleteByIdIdx(requiredSecTentRoleId,
			requiredLoginId);
	}

	/**
	 *	ISecureSecTentRoleMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentRoleMembByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureSecTentRoleMembPKey key) {
		secure31SecTentRoleMembRepository.deleteByIdIdx(key.getRequiredSecTentRoleId(), key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentRoleId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTentRoleIdx(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId) {
		secure31SecTentRoleMembRepository.deleteByTentRoleIdx(requiredSecTentRoleId);
	}

	/**
	 *	ISecureSecTentRoleMembByTentRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentRoleMembByTentRoleIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTentRoleIdx(ISecureSecTentRoleMembByTentRoleIdxKey key) {
		secure31SecTentRoleMembRepository.deleteByTentRoleIdx(key.getRequiredSecTentRoleId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUserIdx(@Param("loginId") String requiredLoginId) {
		secure31SecTentRoleMembRepository.deleteByUserIdx(requiredLoginId);
	}

	/**
	 *	ISecureSecTentRoleMembByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentRoleMembByUserIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUserIdx(ISecureSecTentRoleMembByUserIdxKey key) {
		secure31SecTentRoleMembRepository.deleteByUserIdx(key.getRequiredLoginId());
	}

}

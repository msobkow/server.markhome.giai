// Description: Java 25 Spring JPA Service for SecClusRoleMemb

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
 *	Service for the SecureSecClusRoleMemb entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecClusRoleMembRepository to access them.
 */
@Service("secure31JpaSecClusRoleMembService")
public class SecureJpaSecClusRoleMembService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecClusRoleMembRepository secure31SecClusRoleMembRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecClusRoleMemb, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleMemb create(SecureJpaSecClusRoleMemb data) {
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
				"SecClusRole",
				"SecClusRole",
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
			if(data.getPKey() != null && secure31SecClusRoleMembRepository.existsById((SecureJpaSecClusRoleMembPKey)data.getPKey())) {
				return( (SecureJpaSecClusRoleMemb)(secure31SecClusRoleMembRepository.findById((SecureJpaSecClusRoleMembPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecClusRoleMembRepository.save(data);
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
	public SecureJpaSecClusRoleMemb update(SecureJpaSecClusRoleMemb data) {
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
				"SecClusRole",
				"SecClusRole",
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
		SecureJpaSecClusRoleMemb existing = secure31SecClusRoleMembRepository.findById((SecureJpaSecClusRoleMembPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecClusRoleMemb to existing object
		// Apply data columns of SecureSecClusRoleMemb to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecClusRoleMembRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecClusRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleMemb find(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecClusRoleMembRepository.get(requiredSecClusRoleId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecClusRoleMembPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleMemb find(ISecureSecClusRoleMembPKey key) {
		return( secure31SecClusRoleMembRepository.get(key.getRequiredSecClusRoleId(), key.getRequiredLoginId()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> findAll() {
		return( secure31SecClusRoleMembRepository.findAll() );
	}

	// SecureSecClusRoleMemb specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecClusRoleMembByClusRoleIdxKey as arguments.
	 *
	 *		@param requiredSecClusRoleId
	 *
	 *		@return List&lt;SecureJpaSecClusRoleMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> findByClusRoleIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId) {
		return( secure31SecClusRoleMembRepository.findByClusRoleIdx(requiredSecClusRoleId));
	}

	/**
	 *	ISecureSecClusRoleMembByClusRoleIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleMembByClusRoleIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> findByClusRoleIdx(ISecureSecClusRoleMembByClusRoleIdxKey key) {
		return( secure31SecClusRoleMembRepository.findByClusRoleIdx(key.getRequiredSecClusRoleId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecClusRoleMembByLoginIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return List&lt;SecureJpaSecClusRoleMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> findByLoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecClusRoleMembRepository.findByLoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecClusRoleMembByLoginIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleMembByLoginIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> findByLoginIdx(ISecureSecClusRoleMembByLoginIdxKey key) {
		return( secure31SecClusRoleMembRepository.findByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureSecClusRoleMemb specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleMemb lockByIdIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecClusRoleMembRepository.lockByIdIdx(requiredSecClusRoleId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecClusRoleMembPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecClusRoleMemb lockByIdIdx(ISecureSecClusRoleMembPKey key) {
		return( secure31SecClusRoleMembRepository.lockByIdIdx(key.getRequiredSecClusRoleId(), key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> lockByClusRoleIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId) {
		return( secure31SecClusRoleMembRepository.lockByClusRoleIdx(requiredSecClusRoleId));
	}

	/**
	 *	ISecureSecClusRoleMembByClusRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> lockByClusRoleIdx(ISecureSecClusRoleMembByClusRoleIdxKey key) {
		return( secure31SecClusRoleMembRepository.lockByClusRoleIdx(key.getRequiredSecClusRoleId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> lockByLoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecClusRoleMembRepository.lockByLoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecClusRoleMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecClusRoleMemb> lockByLoginIdx(ISecureSecClusRoleMembByLoginIdxKey key) {
		return( secure31SecClusRoleMembRepository.lockByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureSecClusRoleMemb specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId,
		@Param("loginId") String requiredLoginId) {
		secure31SecClusRoleMembRepository.deleteByIdIdx(requiredSecClusRoleId,
			requiredLoginId);
	}

	/**
	 *	ISecureSecClusRoleMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleMembByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureSecClusRoleMembPKey key) {
		secure31SecClusRoleMembRepository.deleteByIdIdx(key.getRequiredSecClusRoleId(), key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByClusRoleIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId) {
		secure31SecClusRoleMembRepository.deleteByClusRoleIdx(requiredSecClusRoleId);
	}

	/**
	 *	ISecureSecClusRoleMembByClusRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleMembByClusRoleIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByClusRoleIdx(ISecureSecClusRoleMembByClusRoleIdxKey key) {
		secure31SecClusRoleMembRepository.deleteByClusRoleIdx(key.getRequiredSecClusRoleId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLoginIdx(@Param("loginId") String requiredLoginId) {
		secure31SecClusRoleMembRepository.deleteByLoginIdx(requiredLoginId);
	}

	/**
	 *	ISecureSecClusRoleMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecClusRoleMembByLoginIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLoginIdx(ISecureSecClusRoleMembByLoginIdxKey key) {
		secure31SecClusRoleMembRepository.deleteByLoginIdx(key.getRequiredLoginId());
	}

}

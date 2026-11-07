// Description: Java 25 Spring JPA Service for SecSysRoleMemb

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
 *	Service for the SecureSecSysRoleMemb entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecSysRoleMembRepository to access them.
 */
@Service("secure31JpaSecSysRoleMembService")
public class SecureJpaSecSysRoleMembService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecSysRoleMembRepository secure31SecSysRoleMembRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecSysRoleMemb, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleMemb create(SecureJpaSecSysRoleMemb data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		if (data.getRequiredContainerSysRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysRole",
				"data.requiredContainerSysRole",
				"SecSysRole",
				"SecSysRole",
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
			if(data.getPKey() != null && secure31SecSysRoleMembRepository.existsById((SecureJpaSecSysRoleMembPKey)data.getPKey())) {
				return( (SecureJpaSecSysRoleMemb)(secure31SecSysRoleMembRepository.findById((SecureJpaSecSysRoleMembPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecSysRoleMembRepository.save(data);
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
	public SecureJpaSecSysRoleMemb update(SecureJpaSecSysRoleMemb data) {
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
		if (data.getRequiredContainerSysRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysRole",
				"data.requiredContainerSysRole",
				"SecSysRole",
				"SecSysRole",
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
		SecureJpaSecSysRoleMemb existing = secure31SecSysRoleMembRepository.findById((SecureJpaSecSysRoleMembPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecSysRoleMemb to existing object
		// Apply data columns of SecureSecSysRoleMemb to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecSysRoleMembRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleMemb find(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecSysRoleMembRepository.get(requiredSecSysRoleId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecSysRoleMembPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleMemb find(ISecureSecSysRoleMembPKey key) {
		return( secure31SecSysRoleMembRepository.get(key.getRequiredSecSysRoleId(), key.getRequiredLoginId()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> findAll() {
		return( secure31SecSysRoleMembRepository.findAll() );
	}

	// SecureSecSysRoleMemb specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSysRoleMembBySysRoleIdxKey as arguments.
	 *
	 *		@param requiredSecSysRoleId
	 *
	 *		@return List&lt;SecureJpaSecSysRoleMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> findBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId) {
		return( secure31SecSysRoleMembRepository.findBySysRoleIdx(requiredSecSysRoleId));
	}

	/**
	 *	ISecureSecSysRoleMembBySysRoleIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleMembBySysRoleIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> findBySysRoleIdx(ISecureSecSysRoleMembBySysRoleIdxKey key) {
		return( secure31SecSysRoleMembRepository.findBySysRoleIdx(key.getRequiredSecSysRoleId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSysRoleMembByLoginIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return List&lt;SecureJpaSecSysRoleMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> findByLoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecSysRoleMembRepository.findByLoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecSysRoleMembByLoginIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleMembByLoginIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> findByLoginIdx(ISecureSecSysRoleMembByLoginIdxKey key) {
		return( secure31SecSysRoleMembRepository.findByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureSecSysRoleMemb specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleMemb lockByIdIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecSysRoleMembRepository.lockByIdIdx(requiredSecSysRoleId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecSysRoleMembPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleMemb lockByIdIdx(ISecureSecSysRoleMembPKey key) {
		return( secure31SecSysRoleMembRepository.lockByIdIdx(key.getRequiredSecSysRoleId(), key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> lockBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId) {
		return( secure31SecSysRoleMembRepository.lockBySysRoleIdx(requiredSecSysRoleId));
	}

	/**
	 *	ISecureSecSysRoleMembBySysRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> lockBySysRoleIdx(ISecureSecSysRoleMembBySysRoleIdxKey key) {
		return( secure31SecSysRoleMembRepository.lockBySysRoleIdx(key.getRequiredSecSysRoleId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> lockByLoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecSysRoleMembRepository.lockByLoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecSysRoleMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleMemb> lockByLoginIdx(ISecureSecSysRoleMembByLoginIdxKey key) {
		return( secure31SecSysRoleMembRepository.lockByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureSecSysRoleMemb specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("loginId") String requiredLoginId) {
		secure31SecSysRoleMembRepository.deleteByIdIdx(requiredSecSysRoleId,
			requiredLoginId);
	}

	/**
	 *	ISecureSecSysRoleMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleMembByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureSecSysRoleMembPKey key) {
		secure31SecSysRoleMembRepository.deleteByIdIdx(key.getRequiredSecSysRoleId(), key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId) {
		secure31SecSysRoleMembRepository.deleteBySysRoleIdx(requiredSecSysRoleId);
	}

	/**
	 *	ISecureSecSysRoleMembBySysRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleMembBySysRoleIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySysRoleIdx(ISecureSecSysRoleMembBySysRoleIdxKey key) {
		secure31SecSysRoleMembRepository.deleteBySysRoleIdx(key.getRequiredSecSysRoleId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLoginIdx(@Param("loginId") String requiredLoginId) {
		secure31SecSysRoleMembRepository.deleteByLoginIdx(requiredLoginId);
	}

	/**
	 *	ISecureSecSysRoleMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleMembByLoginIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLoginIdx(ISecureSecSysRoleMembByLoginIdxKey key) {
		secure31SecSysRoleMembRepository.deleteByLoginIdx(key.getRequiredLoginId());
	}

}

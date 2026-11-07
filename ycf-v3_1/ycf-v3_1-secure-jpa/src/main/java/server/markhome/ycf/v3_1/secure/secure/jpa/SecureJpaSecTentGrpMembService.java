// Description: Java 25 Spring JPA Service for SecTentGrpMemb

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
 *	Service for the SecureSecTentGrpMemb entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecTentGrpMembRepository to access them.
 */
@Service("secure31JpaSecTentGrpMembService")
public class SecureJpaSecTentGrpMembService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecTentGrpMembRepository secure31SecTentGrpMembRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecTentGrpMemb, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMemb create(SecureJpaSecTentGrpMemb data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		if (data.getRequiredContainerGroup() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerGroup",
				"data.requiredContainerGroup",
				"SecTentGrp",
				"SecTentGrp",
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
			if(data.getPKey() != null && secure31SecTentGrpMembRepository.existsById((SecureJpaSecTentGrpMembPKey)data.getPKey())) {
				return( (SecureJpaSecTentGrpMemb)(secure31SecTentGrpMembRepository.findById((SecureJpaSecTentGrpMembPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecTentGrpMembRepository.save(data);
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
	public SecureJpaSecTentGrpMemb update(SecureJpaSecTentGrpMemb data) {
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
		if (data.getRequiredContainerGroup() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerGroup",
				"data.requiredContainerGroup",
				"SecTentGrp",
				"SecTentGrp",
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
		SecureJpaSecTentGrpMemb existing = secure31SecTentGrpMembRepository.findById((SecureJpaSecTentGrpMembPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecTentGrpMemb to existing object
		// Apply data columns of SecureSecTentGrpMemb to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecTentGrpMembRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecTentGrpId
	 *		@param requiredLoginId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMemb find(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecTentGrpMembRepository.get(requiredSecTentGrpId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecTentGrpMembPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMemb find(ISecureSecTentGrpMembPKey key) {
		return( secure31SecTentGrpMembRepository.get(key.getRequiredSecTentGrpId(), key.getRequiredLoginId()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> findAll() {
		return( secure31SecTentGrpMembRepository.findAll() );
	}

	// SecureSecTentGrpMemb specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecTentGrpMembByTentGrpIdxKey as arguments.
	 *
	 *		@param requiredSecTentGrpId
	 *
	 *		@return List&lt;SecureJpaSecTentGrpMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> findByTentGrpIdx(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId) {
		return( secure31SecTentGrpMembRepository.findByTentGrpIdx(requiredSecTentGrpId));
	}

	/**
	 *	ISecureSecTentGrpMembByTentGrpIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpMembByTentGrpIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> findByTentGrpIdx(ISecureSecTentGrpMembByTentGrpIdxKey key) {
		return( secure31SecTentGrpMembRepository.findByTentGrpIdx(key.getRequiredSecTentGrpId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecTentGrpMembByUserIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return List&lt;SecureJpaSecTentGrpMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> findByUserIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecTentGrpMembRepository.findByUserIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecTentGrpMembByUserIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpMembByUserIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> findByUserIdx(ISecureSecTentGrpMembByUserIdxKey key) {
		return( secure31SecTentGrpMembRepository.findByUserIdx(key.getRequiredLoginId()));
	}

	// SecureSecTentGrpMemb specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentGrpId
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMemb lockByIdIdx(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecTentGrpMembRepository.lockByIdIdx(requiredSecTentGrpId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecTentGrpMembPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecTentGrpMemb lockByIdIdx(ISecureSecTentGrpMembPKey key) {
		return( secure31SecTentGrpMembRepository.lockByIdIdx(key.getRequiredSecTentGrpId(), key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentGrpId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> lockByTentGrpIdx(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId) {
		return( secure31SecTentGrpMembRepository.lockByTentGrpIdx(requiredSecTentGrpId));
	}

	/**
	 *	ISecureSecTentGrpMembByTentGrpIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> lockByTentGrpIdx(ISecureSecTentGrpMembByTentGrpIdxKey key) {
		return( secure31SecTentGrpMembRepository.lockByTentGrpIdx(key.getRequiredSecTentGrpId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> lockByUserIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecTentGrpMembRepository.lockByUserIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecTentGrpMembByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecTentGrpMemb> lockByUserIdx(ISecureSecTentGrpMembByUserIdxKey key) {
		return( secure31SecTentGrpMembRepository.lockByUserIdx(key.getRequiredLoginId()));
	}

	// SecureSecTentGrpMemb specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentGrpId
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId,
		@Param("loginId") String requiredLoginId) {
		secure31SecTentGrpMembRepository.deleteByIdIdx(requiredSecTentGrpId,
			requiredLoginId);
	}

	/**
	 *	ISecureSecTentGrpMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpMembByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureSecTentGrpMembPKey key) {
		secure31SecTentGrpMembRepository.deleteByIdIdx(key.getRequiredSecTentGrpId(), key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentGrpId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTentGrpIdx(@Param("secTentGrpId") ICFKeyHash256 requiredSecTentGrpId) {
		secure31SecTentGrpMembRepository.deleteByTentGrpIdx(requiredSecTentGrpId);
	}

	/**
	 *	ISecureSecTentGrpMembByTentGrpIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpMembByTentGrpIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTentGrpIdx(ISecureSecTentGrpMembByTentGrpIdxKey key) {
		secure31SecTentGrpMembRepository.deleteByTentGrpIdx(key.getRequiredSecTentGrpId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUserIdx(@Param("loginId") String requiredLoginId) {
		secure31SecTentGrpMembRepository.deleteByUserIdx(requiredLoginId);
	}

	/**
	 *	ISecureSecTentGrpMembByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecTentGrpMembByUserIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUserIdx(ISecureSecTentGrpMembByUserIdxKey key) {
		secure31SecTentGrpMembRepository.deleteByUserIdx(key.getRequiredLoginId());
	}

}

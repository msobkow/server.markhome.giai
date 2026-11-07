// Description: Java 25 Spring JPA Service for SecSysGrpMemb

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
 *	Service for the SecureSecSysGrpMemb entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecSysGrpMembRepository to access them.
 */
@Service("secure31JpaSecSysGrpMembService")
public class SecureJpaSecSysGrpMembService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecSysGrpMembRepository secure31SecSysGrpMembRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecSysGrpMemb, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMemb create(SecureJpaSecSysGrpMemb data) {
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
				"SecSysGrp",
				"SecSysGrp",
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
			if(data.getPKey() != null && secure31SecSysGrpMembRepository.existsById((SecureJpaSecSysGrpMembPKey)data.getPKey())) {
				return( (SecureJpaSecSysGrpMemb)(secure31SecSysGrpMembRepository.findById((SecureJpaSecSysGrpMembPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecSysGrpMembRepository.save(data);
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
	public SecureJpaSecSysGrpMemb update(SecureJpaSecSysGrpMemb data) {
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
				"SecSysGrp",
				"SecSysGrp",
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
		SecureJpaSecSysGrpMemb existing = secure31SecSysGrpMembRepository.findById((SecureJpaSecSysGrpMembPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecSysGrpMemb to existing object
		// Apply data columns of SecureSecSysGrpMemb to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecSysGrpMembRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecSysGrpId
	 *		@param requiredLoginId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMemb find(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecSysGrpMembRepository.get(requiredSecSysGrpId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecSysGrpMembPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMemb find(ISecureSecSysGrpMembPKey key) {
		return( secure31SecSysGrpMembRepository.get(key.getRequiredSecSysGrpId(), key.getRequiredLoginId()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> findAll() {
		return( secure31SecSysGrpMembRepository.findAll() );
	}

	// SecureSecSysGrpMemb specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSysGrpMembBySysGrpIdxKey as arguments.
	 *
	 *		@param requiredSecSysGrpId
	 *
	 *		@return List&lt;SecureJpaSecSysGrpMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> findBySysGrpIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId) {
		return( secure31SecSysGrpMembRepository.findBySysGrpIdx(requiredSecSysGrpId));
	}

	/**
	 *	ISecureSecSysGrpMembBySysGrpIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpMembBySysGrpIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> findBySysGrpIdx(ISecureSecSysGrpMembBySysGrpIdxKey key) {
		return( secure31SecSysGrpMembRepository.findBySysGrpIdx(key.getRequiredSecSysGrpId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSysGrpMembByLoginIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return List&lt;SecureJpaSecSysGrpMemb&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> findByLoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecSysGrpMembRepository.findByLoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecSysGrpMembByLoginIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpMembByLoginIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> findByLoginIdx(ISecureSecSysGrpMembByLoginIdxKey key) {
		return( secure31SecSysGrpMembRepository.findByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureSecSysGrpMemb specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMemb lockByIdIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId,
		@Param("loginId") String requiredLoginId) {
		return( secure31SecSysGrpMembRepository.lockByIdIdx(requiredSecSysGrpId,
			requiredLoginId));
	}

	/**
	 *	ISecureSecSysGrpMembPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrpMemb lockByIdIdx(ISecureSecSysGrpMembPKey key) {
		return( secure31SecSysGrpMembRepository.lockByIdIdx(key.getRequiredSecSysGrpId(), key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> lockBySysGrpIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId) {
		return( secure31SecSysGrpMembRepository.lockBySysGrpIdx(requiredSecSysGrpId));
	}

	/**
	 *	ISecureSecSysGrpMembBySysGrpIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> lockBySysGrpIdx(ISecureSecSysGrpMembBySysGrpIdxKey key) {
		return( secure31SecSysGrpMembRepository.lockBySysGrpIdx(key.getRequiredSecSysGrpId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> lockByLoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecSysGrpMembRepository.lockByLoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecSysGrpMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrpMemb> lockByLoginIdx(ISecureSecSysGrpMembByLoginIdxKey key) {
		return( secure31SecSysGrpMembRepository.lockByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureSecSysGrpMemb specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId,
		@Param("loginId") String requiredLoginId) {
		secure31SecSysGrpMembRepository.deleteByIdIdx(requiredSecSysGrpId,
			requiredLoginId);
	}

	/**
	 *	ISecureSecSysGrpMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpMembByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureSecSysGrpMembPKey key) {
		secure31SecSysGrpMembRepository.deleteByIdIdx(key.getRequiredSecSysGrpId(), key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySysGrpIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId) {
		secure31SecSysGrpMembRepository.deleteBySysGrpIdx(requiredSecSysGrpId);
	}

	/**
	 *	ISecureSecSysGrpMembBySysGrpIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpMembBySysGrpIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySysGrpIdx(ISecureSecSysGrpMembBySysGrpIdxKey key) {
		secure31SecSysGrpMembRepository.deleteBySysGrpIdx(key.getRequiredSecSysGrpId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLoginIdx(@Param("loginId") String requiredLoginId) {
		secure31SecSysGrpMembRepository.deleteByLoginIdx(requiredLoginId);
	}

	/**
	 *	ISecureSecSysGrpMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpMembByLoginIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLoginIdx(ISecureSecSysGrpMembByLoginIdxKey key) {
		secure31SecSysGrpMembRepository.deleteByLoginIdx(key.getRequiredLoginId());
	}

}

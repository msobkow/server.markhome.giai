// Description: Java 25 Spring JPA Service for SecUser

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
 *	Service for the SecureSecUser entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecUserRepository to access them.
 */
@Service("secure31JpaSecUserService")
public class SecureJpaSecUserService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecUserRepository secure31SecUserRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecUser, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser create(SecureJpaSecUser data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredSecUserId = data.getRequiredSecUserId();
		boolean generatedRequiredSecUserId = false;
		if(data.getRequiredLoginId() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredLoginId");
		}
		if(data.getRequiredAccountStatus() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredAccountStatus");
		}
		if(data.getRequiredEMailAddress() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEMailAddress");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecUserRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecUser)(secure31SecUserRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredSecUserId() == null || data.getRequiredSecUserId().isNull()) {
				data.setRequiredSecUserId(new CFDbKeyHash256(0));
				generatedRequiredSecUserId = true;
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecUserRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredSecUserId) {
					data.setRequiredSecUserId(originalRequiredSecUserId);
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
	public SecureJpaSecUser update(SecureJpaSecUser data) {
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
		if(data.getRequiredLoginId() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredLoginId");
		}
		if(data.getRequiredAccountStatus() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredAccountStatus");
		}
		if(data.getRequiredEMailAddress() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEMailAddress");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecUser existing = secure31SecUserRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecUser to existing object
		// Apply data columns of SecureSecUser to existing object
		existing.setRequiredLoginId(data.getRequiredLoginId());
		existing.setRequiredAccountStatus(data.getRequiredAccountStatus());
		existing.setOptionalDfltSysGrpName(data.getOptionalDfltSysGrpName());
		existing.setOptionalDfltClusGrpName(data.getOptionalDfltClusGrpName());
		existing.setOptionalDfltTentGrpName(data.getOptionalDfltTentGrpName());
		existing.setRequiredEMailAddress(data.getRequiredEMailAddress());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecUserRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser find(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserRepository.get(requiredSecUserId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUser> findAll() {
		return( secure31SecUserRepository.findAll() );
	}

	// SecureSecUser specified index finders

	/**
	 *	Find an entity using the columns of the ISecureSecUserByULoginIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser findByULoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecUserRepository.findByULoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecUserByULoginIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserByULoginIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser findByULoginIdx(ISecureSecUserByULoginIdxKey key) {
		return( secure31SecUserRepository.findByULoginIdx(key.getRequiredLoginId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecUserByEMAddrIdxKey as arguments.
	 *
	 *		@param requiredEMailAddress
	 *
	 *		@return List&lt;SecureJpaSecUser&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUser> findByEMAddrIdx(@Param("eMailAddress") String requiredEMailAddress) {
		return( secure31SecUserRepository.findByEMAddrIdx(requiredEMailAddress));
	}

	/**
	 *	ISecureSecUserByEMAddrIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserByEMAddrIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUser> findByEMAddrIdx(ISecureSecUserByEMAddrIdxKey key) {
		return( secure31SecUserRepository.findByEMAddrIdx(key.getRequiredEMailAddress()));
	}

	// SecureSecUser specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserRepository.lockByIdIdx(requiredSecUserId));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser lockByULoginIdx(@Param("loginId") String requiredLoginId) {
		return( secure31SecUserRepository.lockByULoginIdx(requiredLoginId));
	}

	/**
	 *	ISecureSecUserByULoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUser lockByULoginIdx(ISecureSecUserByULoginIdxKey key) {
		return( secure31SecUserRepository.lockByULoginIdx(key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMailAddress
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUser> lockByEMAddrIdx(@Param("eMailAddress") String requiredEMailAddress) {
		return( secure31SecUserRepository.lockByEMAddrIdx(requiredEMailAddress));
	}

	/**
	 *	ISecureSecUserByEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUser> lockByEMAddrIdx(ISecureSecUserByEMAddrIdxKey key) {
		return( secure31SecUserRepository.lockByEMAddrIdx(key.getRequiredEMailAddress()));
	}

	// SecureSecUser specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		secure31SecUserRepository.deleteByIdIdx(requiredSecUserId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByULoginIdx(@Param("loginId") String requiredLoginId) {
		secure31SecUserRepository.deleteByULoginIdx(requiredLoginId);
	}

	/**
	 *	ISecureSecUserByULoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserByULoginIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByULoginIdx(ISecureSecUserByULoginIdxKey key) {
		secure31SecUserRepository.deleteByULoginIdx(key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMailAddress
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByEMAddrIdx(@Param("eMailAddress") String requiredEMailAddress) {
		secure31SecUserRepository.deleteByEMAddrIdx(requiredEMailAddress);
	}

	/**
	 *	ISecureSecUserByEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserByEMAddrIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByEMAddrIdx(ISecureSecUserByEMAddrIdxKey key) {
		secure31SecUserRepository.deleteByEMAddrIdx(key.getRequiredEMailAddress());
	}

}

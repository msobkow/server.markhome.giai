// Description: Java 25 Spring JPA Service for SecUserPWReset

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
 *	Service for the SecureSecUserPWReset entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecUserPWResetRepository to access them.
 */
@Service("secure31JpaSecUserPWResetService")
public class SecureJpaSecUserPWResetService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecUserPWResetRepository secure31SecUserPWResetRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecUserPWReset, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset create(SecureJpaSecUserPWReset data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		if (data.getRequiredContainerUser() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerUser",
				"data.requiredContainerUser",
				"SecUser",
				"SecUser",
				null);
		}
		if(data.getRequiredSentToEMailAddr() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSentToEMailAddr");
		}
		if(data.getRequiredPasswordResetUuid6() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPasswordResetUuid6");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecUserPWResetRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecUserPWReset)(secure31SecUserPWResetRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecUserPWResetRepository.save(data);
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
	public SecureJpaSecUserPWReset update(SecureJpaSecUserPWReset data) {
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
		if (data.getRequiredContainerUser() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerUser",
				"data.requiredContainerUser",
				"SecUser",
				"SecUser",
				null);
		}
		if(data.getRequiredSentToEMailAddr() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSentToEMailAddr");
		}
		if(data.getRequiredPasswordResetUuid6() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPasswordResetUuid6");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecUserPWReset existing = secure31SecUserPWResetRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecUserPWReset to existing object
		// Apply data columns of SecureSecUserPWReset to existing object
		existing.setRequiredSentToEMailAddr(data.getRequiredSentToEMailAddr());
		existing.setRequiredPasswordResetUuid6(data.getRequiredPasswordResetUuid6());
		existing.setRequiredNewAccount(data.getRequiredNewAccount());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecUserPWResetRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset find(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserPWResetRepository.get(requiredSecUserId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> findAll() {
		return( secure31SecUserPWResetRepository.findAll() );
	}

	// SecureSecUserPWReset specified index finders

	/**
	 *	Find an entity using the columns of the ISecureSecUserPWResetByUUuid6IdxKey as arguments.
	 *
	 *		@param requiredPasswordResetUuid6
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset findByUUuid6Idx(@Param("passwordResetUuid6") ICFUuid6 requiredPasswordResetUuid6) {
		return( secure31SecUserPWResetRepository.findByUUuid6Idx(requiredPasswordResetUuid6));
	}

	/**
	 *	ISecureSecUserPWResetByUUuid6IdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWResetByUUuid6IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset findByUUuid6Idx(ISecureSecUserPWResetByUUuid6IdxKey key) {
		return( secure31SecUserPWResetRepository.findByUUuid6Idx(key.getRequiredPasswordResetUuid6()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecUserPWResetBySentEMAddrIdxKey as arguments.
	 *
	 *		@param requiredSentToEMailAddr
	 *
	 *		@return List&lt;SecureJpaSecUserPWReset&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> findBySentEMAddrIdx(@Param("sentToEMailAddr") String requiredSentToEMailAddr) {
		return( secure31SecUserPWResetRepository.findBySentEMAddrIdx(requiredSentToEMailAddr));
	}

	/**
	 *	ISecureSecUserPWResetBySentEMAddrIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWResetBySentEMAddrIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> findBySentEMAddrIdx(ISecureSecUserPWResetBySentEMAddrIdxKey key) {
		return( secure31SecUserPWResetRepository.findBySentEMAddrIdx(key.getRequiredSentToEMailAddr()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecUserPWResetByNewAcctIdxKey as arguments.
	 *
	 *		@param requiredNewAccount
	 *
	 *		@return List&lt;SecureJpaSecUserPWReset&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> findByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount) {
		return( secure31SecUserPWResetRepository.findByNewAcctIdx(requiredNewAccount));
	}

	/**
	 *	ISecureSecUserPWResetByNewAcctIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWResetByNewAcctIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> findByNewAcctIdx(ISecureSecUserPWResetByNewAcctIdxKey key) {
		return( secure31SecUserPWResetRepository.findByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureSecUserPWReset specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserPWResetRepository.lockByIdIdx(requiredSecUserId));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPasswordResetUuid6
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset lockByUUuid6Idx(@Param("passwordResetUuid6") ICFUuid6 requiredPasswordResetUuid6) {
		return( secure31SecUserPWResetRepository.lockByUUuid6Idx(requiredPasswordResetUuid6));
	}

	/**
	 *	ISecureSecUserPWResetByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWReset lockByUUuid6Idx(ISecureSecUserPWResetByUUuid6IdxKey key) {
		return( secure31SecUserPWResetRepository.lockByUUuid6Idx(key.getRequiredPasswordResetUuid6()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSentToEMailAddr
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> lockBySentEMAddrIdx(@Param("sentToEMailAddr") String requiredSentToEMailAddr) {
		return( secure31SecUserPWResetRepository.lockBySentEMAddrIdx(requiredSentToEMailAddr));
	}

	/**
	 *	ISecureSecUserPWResetBySentEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> lockBySentEMAddrIdx(ISecureSecUserPWResetBySentEMAddrIdxKey key) {
		return( secure31SecUserPWResetRepository.lockBySentEMAddrIdx(key.getRequiredSentToEMailAddr()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredNewAccount
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> lockByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount) {
		return( secure31SecUserPWResetRepository.lockByNewAcctIdx(requiredNewAccount));
	}

	/**
	 *	ISecureSecUserPWResetByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWReset> lockByNewAcctIdx(ISecureSecUserPWResetByNewAcctIdxKey key) {
		return( secure31SecUserPWResetRepository.lockByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureSecUserPWReset specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		secure31SecUserPWResetRepository.deleteByIdIdx(requiredSecUserId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPasswordResetUuid6
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUUuid6Idx(@Param("passwordResetUuid6") ICFUuid6 requiredPasswordResetUuid6) {
		secure31SecUserPWResetRepository.deleteByUUuid6Idx(requiredPasswordResetUuid6);
	}

	/**
	 *	ISecureSecUserPWResetByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWResetByUUuid6IdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUUuid6Idx(ISecureSecUserPWResetByUUuid6IdxKey key) {
		secure31SecUserPWResetRepository.deleteByUUuid6Idx(key.getRequiredPasswordResetUuid6());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSentToEMailAddr
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySentEMAddrIdx(@Param("sentToEMailAddr") String requiredSentToEMailAddr) {
		secure31SecUserPWResetRepository.deleteBySentEMAddrIdx(requiredSentToEMailAddr);
	}

	/**
	 *	ISecureSecUserPWResetBySentEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWResetBySentEMAddrIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySentEMAddrIdx(ISecureSecUserPWResetBySentEMAddrIdxKey key) {
		secure31SecUserPWResetRepository.deleteBySentEMAddrIdx(key.getRequiredSentToEMailAddr());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredNewAccount
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount) {
		secure31SecUserPWResetRepository.deleteByNewAcctIdx(requiredNewAccount);
	}

	/**
	 *	ISecureSecUserPWResetByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWResetByNewAcctIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNewAcctIdx(ISecureSecUserPWResetByNewAcctIdxKey key) {
		secure31SecUserPWResetRepository.deleteByNewAcctIdx(key.getRequiredNewAccount());
	}

}

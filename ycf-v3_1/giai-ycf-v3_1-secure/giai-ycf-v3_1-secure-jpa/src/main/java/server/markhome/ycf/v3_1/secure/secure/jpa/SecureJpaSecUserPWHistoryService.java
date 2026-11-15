// Description: Java 25 Spring JPA Service for SecUserPWHistory

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
 *	Service for the SecureSecUserPWHistory entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecUserPWHistoryRepository to access them.
 */
@Service("secure31JpaSecUserPWHistoryService")
public class SecureJpaSecUserPWHistoryService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecUserPWHistoryRepository secure31SecUserPWHistoryRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecUserPWHistory, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory create(SecureJpaSecUserPWHistory data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		if(data.getRequiredPWReplacedStamp() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPWReplacedStamp");
		}
		if(data.getRequiredPasswordHash() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPasswordHash");
		}
		try {
			if(data.getPKey() != null && secure31SecUserPWHistoryRepository.existsById((SecureJpaSecUserPWHistoryPKey)data.getPKey())) {
				return( (SecureJpaSecUserPWHistory)(secure31SecUserPWHistoryRepository.findById((SecureJpaSecUserPWHistoryPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			return secure31SecUserPWHistoryRepository.save(data);
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
	public SecureJpaSecUserPWHistory update(SecureJpaSecUserPWHistory data) {
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
		if(data.getRequiredPWReplacedStamp() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPWReplacedStamp");
		}
		if(data.getRequiredPasswordHash() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPasswordHash");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecUserPWHistory existing = secure31SecUserPWHistoryRepository.findById((SecureJpaSecUserPWHistoryPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecUserPWHistory to existing object
		// Apply data columns of SecureSecUserPWHistory to existing object
		existing.setRequiredPWReplacedStamp(data.getRequiredPWReplacedStamp());
		existing.setRequiredPasswordHash(data.getRequiredPasswordHash());
		// Save the changes we've made
		return secure31SecUserPWHistoryRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredPWSetStamp
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory find(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		return( secure31SecUserPWHistoryRepository.get(requiredSecUserId,
			requiredPWSetStamp));
	}

	/**
	 *	ISecureSecUserPWHistoryPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory find(ISecureSecUserPWHistoryPKey key) {
		return( secure31SecUserPWHistoryRepository.get(key.getRequiredSecUserId(), key.getRequiredPWSetStamp()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPWHistory> findAll() {
		return( secure31SecUserPWHistoryRepository.findAll() );
	}

	// SecureSecUserPWHistory specified index finders

	/**
	 *	Find an entity using the columns of the ISecureSecUserPWHistoryByUserIdxKey as arguments.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory findByUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserPWHistoryRepository.findByUserIdx(requiredSecUserId));
	}

	/**
	 *	ISecureSecUserPWHistoryByUserIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWHistoryByUserIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory findByUserIdx(ISecureSecUserPWHistoryByUserIdxKey key) {
		return( secure31SecUserPWHistoryRepository.findByUserIdx(key.getRequiredSecUserId()));
	}

	/**
	 *	Find an entity using the columns of the ISecureSecUserPWHistoryBySetStampIdxKey as arguments.
	 *
	 *		@param requiredPWSetStamp
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory findBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		return( secure31SecUserPWHistoryRepository.findBySetStampIdx(requiredPWSetStamp));
	}

	/**
	 *	ISecureSecUserPWHistoryBySetStampIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWHistoryBySetStampIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory findBySetStampIdx(ISecureSecUserPWHistoryBySetStampIdxKey key) {
		return( secure31SecUserPWHistoryRepository.findBySetStampIdx(key.getRequiredPWSetStamp()));
	}

	/**
	 *	Find an entity using the columns of the ISecureSecUserPWHistoryByReplacedStampIdxKey as arguments.
	 *
	 *		@param requiredPWReplacedStamp
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory findByReplacedStampIdx(@Param("pWReplacedStamp") LocalDateTime requiredPWReplacedStamp) {
		return( secure31SecUserPWHistoryRepository.findByReplacedStampIdx(requiredPWReplacedStamp));
	}

	/**
	 *	ISecureSecUserPWHistoryByReplacedStampIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWHistoryByReplacedStampIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory findByReplacedStampIdx(ISecureSecUserPWHistoryByReplacedStampIdxKey key) {
		return( secure31SecUserPWHistoryRepository.findByReplacedStampIdx(key.getRequiredPWReplacedStamp()));
	}

	// SecureSecUserPWHistory specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredPWSetStamp
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		return( secure31SecUserPWHistoryRepository.lockByIdIdx(requiredSecUserId,
			requiredPWSetStamp));
	}

	/**
	 *	ISecureSecUserPWHistoryPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockByIdIdx(ISecureSecUserPWHistoryPKey key) {
		return( secure31SecUserPWHistoryRepository.lockByIdIdx(key.getRequiredSecUserId(), key.getRequiredPWSetStamp()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockByUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserPWHistoryRepository.lockByUserIdx(requiredSecUserId));
	}

	/**
	 *	ISecureSecUserPWHistoryByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockByUserIdx(ISecureSecUserPWHistoryByUserIdxKey key) {
		return( secure31SecUserPWHistoryRepository.lockByUserIdx(key.getRequiredSecUserId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWSetStamp
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		return( secure31SecUserPWHistoryRepository.lockBySetStampIdx(requiredPWSetStamp));
	}

	/**
	 *	ISecureSecUserPWHistoryBySetStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockBySetStampIdx(ISecureSecUserPWHistoryBySetStampIdxKey key) {
		return( secure31SecUserPWHistoryRepository.lockBySetStampIdx(key.getRequiredPWSetStamp()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWReplacedStamp
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockByReplacedStampIdx(@Param("pWReplacedStamp") LocalDateTime requiredPWReplacedStamp) {
		return( secure31SecUserPWHistoryRepository.lockByReplacedStampIdx(requiredPWReplacedStamp));
	}

	/**
	 *	ISecureSecUserPWHistoryByReplacedStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPWHistory lockByReplacedStampIdx(ISecureSecUserPWHistoryByReplacedStampIdxKey key) {
		return( secure31SecUserPWHistoryRepository.lockByReplacedStampIdx(key.getRequiredPWReplacedStamp()));
	}

	// SecureSecUserPWHistory specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredPWSetStamp
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		secure31SecUserPWHistoryRepository.deleteByIdIdx(requiredSecUserId,
			requiredPWSetStamp);
	}

	/**
	 *	ISecureSecUserPWHistoryByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWHistoryByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureSecUserPWHistoryPKey key) {
		secure31SecUserPWHistoryRepository.deleteByIdIdx(key.getRequiredSecUserId(), key.getRequiredPWSetStamp());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		secure31SecUserPWHistoryRepository.deleteByUserIdx(requiredSecUserId);
	}

	/**
	 *	ISecureSecUserPWHistoryByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWHistoryByUserIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUserIdx(ISecureSecUserPWHistoryByUserIdxKey key) {
		secure31SecUserPWHistoryRepository.deleteByUserIdx(key.getRequiredSecUserId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWSetStamp
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		secure31SecUserPWHistoryRepository.deleteBySetStampIdx(requiredPWSetStamp);
	}

	/**
	 *	ISecureSecUserPWHistoryBySetStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWHistoryBySetStampIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySetStampIdx(ISecureSecUserPWHistoryBySetStampIdxKey key) {
		secure31SecUserPWHistoryRepository.deleteBySetStampIdx(key.getRequiredPWSetStamp());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWReplacedStamp
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByReplacedStampIdx(@Param("pWReplacedStamp") LocalDateTime requiredPWReplacedStamp) {
		secure31SecUserPWHistoryRepository.deleteByReplacedStampIdx(requiredPWReplacedStamp);
	}

	/**
	 *	ISecureSecUserPWHistoryByReplacedStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPWHistoryByReplacedStampIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByReplacedStampIdx(ISecureSecUserPWHistoryByReplacedStampIdxKey key) {
		secure31SecUserPWHistoryRepository.deleteByReplacedStampIdx(key.getRequiredPWReplacedStamp());
	}

}

// Description: Java 25 Spring JPA Service for SecSession

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
 *	Service for the SecureSecSession entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecSessionRepository to access them.
 */
@Service("secure31JpaSecSessionService")
public class SecureJpaSecSessionService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecSessionRepository secure31SecSessionRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecSession, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession create(SecureJpaSecSession data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredSecSessionId = data.getRequiredSecSessionId();
		boolean generatedRequiredSecSessionId = false;
		if (data.getRequiredContainerSecUser() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSecUser",
				"data.requiredContainerSecUser",
				"SecUser",
				"SecUser",
				null);
		}
		if (data.getRequiredParentSecProxy() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentSecProxy",
				"data.requiredParentSecProxy",
				"SecUser",
				"SecUser",
				null);
		}
		if(data.getRequiredSecUserId() == null || data.getRequiredSecUserId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSecUserId");
		}
		if(data.getRequiredStart() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredStart");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecSessionRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecSession)(secure31SecSessionRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredSecSessionId() == null || data.getRequiredSecSessionId().isNull()) {
				data.setRequiredSecSessionId(new CFDbKeyHash256(0));
				generatedRequiredSecSessionId = true;
			}
			return secure31SecSessionRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredSecSessionId) {
					data.setRequiredSecSessionId(originalRequiredSecSessionId);
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
	public SecureJpaSecSession update(SecureJpaSecSession data) {
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
		if (data.getRequiredContainerSecUser() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSecUser",
				"data.requiredContainerSecUser",
				"SecUser",
				"SecUser",
				null);
		}
		if (data.getRequiredParentSecProxy() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentSecProxy",
				"data.requiredParentSecProxy",
				"SecUser",
				"SecUser",
				null);
		}
		if(data.getRequiredSecUserId() == null || data.getRequiredSecUserId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSecUserId");
		}
		if(data.getRequiredStart() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredStart");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecSession existing = secure31SecSessionRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecSession to existing object
		existing.setRequiredContainerSecUser(data.getRequiredContainerSecUser());
		existing.setRequiredParentSecProxy(data.getRequiredParentSecProxy());
		// Apply data columns of SecureSecSession to existing object
		existing.setRequiredSecUserId(data.getRequiredSecUserId());
		existing.setRequiredStart(data.getRequiredStart());
		existing.setOptionalFinish(data.getOptionalFinish());
		existing.setOptionalSecProxyId(data.getOptionalSecProxyId());
		// Save the changes we've made
		return secure31SecSessionRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecSessionId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession find(@Param("secSessionId") ICFKeyHash256 requiredSecSessionId) {
		return( secure31SecSessionRepository.get(requiredSecSessionId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> findAll() {
		return( secure31SecSessionRepository.findAll() );
	}

	// SecureSecSession specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSessionBySecUserIdxKey as arguments.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return List&lt;SecureJpaSecSession&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> findBySecUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecSessionRepository.findBySecUserIdx(requiredSecUserId));
	}

	/**
	 *	ISecureSecSessionBySecUserIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionBySecUserIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> findBySecUserIdx(ISecureSecSessionBySecUserIdxKey key) {
		return( secure31SecSessionRepository.findBySecUserIdx(key.getRequiredSecUserId()));
	}

	/**
	 *	Find an entity using the columns of the ISecureSecSessionByStartIdxKey as arguments.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredStart
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession findByStartIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("start") LocalDateTime requiredStart) {
		return( secure31SecSessionRepository.findByStartIdx(requiredSecUserId,
			requiredStart));
	}

	/**
	 *	ISecureSecSessionByStartIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionByStartIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession findByStartIdx(ISecureSecSessionByStartIdxKey key) {
		return( secure31SecSessionRepository.findByStartIdx(key.getRequiredSecUserId(), key.getRequiredStart()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSessionByFinishIdxKey as arguments.
	 *
	 *		@param requiredSecUserId
	 *		@param optionalFinish
	 *
	 *		@return List&lt;SecureJpaSecSession&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> findByFinishIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("finish") LocalDateTime optionalFinish) {
		return( secure31SecSessionRepository.findByFinishIdx(requiredSecUserId,
			optionalFinish));
	}

	/**
	 *	ISecureSecSessionByFinishIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionByFinishIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> findByFinishIdx(ISecureSecSessionByFinishIdxKey key) {
		return( secure31SecSessionRepository.findByFinishIdx(key.getRequiredSecUserId(), key.getOptionalFinish()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSessionBySecProxyIdxKey as arguments.
	 *
	 *		@param optionalSecProxyId
	 *
	 *		@return List&lt;SecureJpaSecSession&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> findBySecProxyIdx(@Param("secProxyId") ICFKeyHash256 optionalSecProxyId) {
		return( secure31SecSessionRepository.findBySecProxyIdx(optionalSecProxyId));
	}

	/**
	 *	ISecureSecSessionBySecProxyIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionBySecProxyIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> findBySecProxyIdx(ISecureSecSessionBySecProxyIdxKey key) {
		return( secure31SecSessionRepository.findBySecProxyIdx(key.getOptionalSecProxyId()));
	}

	// SecureSecSession specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSessionId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession lockByIdIdx(@Param("secSessionId") ICFKeyHash256 requiredSecSessionId) {
		return( secure31SecSessionRepository.lockByIdIdx(requiredSecSessionId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> lockBySecUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecSessionRepository.lockBySecUserIdx(requiredSecUserId));
	}

	/**
	 *	ISecureSecSessionBySecUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> lockBySecUserIdx(ISecureSecSessionBySecUserIdxKey key) {
		return( secure31SecSessionRepository.lockBySecUserIdx(key.getRequiredSecUserId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredStart
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession lockByStartIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("start") LocalDateTime requiredStart) {
		return( secure31SecSessionRepository.lockByStartIdx(requiredSecUserId,
			requiredStart));
	}

	/**
	 *	ISecureSecSessionByStartIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSession lockByStartIdx(ISecureSecSessionByStartIdxKey key) {
		return( secure31SecSessionRepository.lockByStartIdx(key.getRequiredSecUserId(), key.getRequiredStart()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param optionalFinish
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> lockByFinishIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("finish") LocalDateTime optionalFinish) {
		return( secure31SecSessionRepository.lockByFinishIdx(requiredSecUserId,
			optionalFinish));
	}

	/**
	 *	ISecureSecSessionByFinishIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> lockByFinishIdx(ISecureSecSessionByFinishIdxKey key) {
		return( secure31SecSessionRepository.lockByFinishIdx(key.getRequiredSecUserId(), key.getOptionalFinish()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalSecProxyId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> lockBySecProxyIdx(@Param("secProxyId") ICFKeyHash256 optionalSecProxyId) {
		return( secure31SecSessionRepository.lockBySecProxyIdx(optionalSecProxyId));
	}

	/**
	 *	ISecureSecSessionBySecProxyIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSession> lockBySecProxyIdx(ISecureSecSessionBySecProxyIdxKey key) {
		return( secure31SecSessionRepository.lockBySecProxyIdx(key.getOptionalSecProxyId()));
	}

	// SecureSecSession specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSessionId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secSessionId") ICFKeyHash256 requiredSecSessionId) {
		secure31SecSessionRepository.deleteByIdIdx(requiredSecSessionId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySecUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		secure31SecSessionRepository.deleteBySecUserIdx(requiredSecUserId);
	}

	/**
	 *	ISecureSecSessionBySecUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionBySecUserIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySecUserIdx(ISecureSecSessionBySecUserIdxKey key) {
		secure31SecSessionRepository.deleteBySecUserIdx(key.getRequiredSecUserId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredStart
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByStartIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("start") LocalDateTime requiredStart) {
		secure31SecSessionRepository.deleteByStartIdx(requiredSecUserId,
			requiredStart);
	}

	/**
	 *	ISecureSecSessionByStartIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionByStartIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByStartIdx(ISecureSecSessionByStartIdxKey key) {
		secure31SecSessionRepository.deleteByStartIdx(key.getRequiredSecUserId(), key.getRequiredStart());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param optionalFinish
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByFinishIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("finish") LocalDateTime optionalFinish) {
		secure31SecSessionRepository.deleteByFinishIdx(requiredSecUserId,
			optionalFinish);
	}

	/**
	 *	ISecureSecSessionByFinishIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionByFinishIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByFinishIdx(ISecureSecSessionByFinishIdxKey key) {
		secure31SecSessionRepository.deleteByFinishIdx(key.getRequiredSecUserId(), key.getOptionalFinish());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalSecProxyId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySecProxyIdx(@Param("secProxyId") ICFKeyHash256 optionalSecProxyId) {
		secure31SecSessionRepository.deleteBySecProxyIdx(optionalSecProxyId);
	}

	/**
	 *	ISecureSecSessionBySecProxyIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSessionBySecProxyIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySecProxyIdx(ISecureSecSessionBySecProxyIdxKey key) {
		secure31SecSessionRepository.deleteBySecProxyIdx(key.getOptionalSecProxyId());
	}

}

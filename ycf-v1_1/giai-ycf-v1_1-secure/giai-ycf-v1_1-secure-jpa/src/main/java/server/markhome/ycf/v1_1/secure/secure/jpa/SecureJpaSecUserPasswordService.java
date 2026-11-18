// Description: Java 25 Spring JPA Service for SecUserPassword

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
 *	Service for the SecureSecUserPassword entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecUserPasswordRepository to access them.
 */
@Service("secure31JpaSecUserPasswordService")
public class SecureJpaSecUserPasswordService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecUserPasswordRepository secure31SecUserPasswordRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecUserPassword, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPassword create(SecureJpaSecUserPassword data) {
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
		if(data.getRequiredPWSetStamp() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPWSetStamp");
		}
		if(data.getRequiredPasswordHash() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPasswordHash");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecUserPasswordRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecUserPassword)(secure31SecUserPasswordRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			return secure31SecUserPasswordRepository.save(data);
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
	public SecureJpaSecUserPassword update(SecureJpaSecUserPassword data) {
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
		if(data.getRequiredPWSetStamp() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPWSetStamp");
		}
		if(data.getRequiredPasswordHash() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredPasswordHash");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecUserPassword existing = secure31SecUserPasswordRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecUserPassword to existing object
		// Apply data columns of SecureSecUserPassword to existing object
		existing.setRequiredPWSetStamp(data.getRequiredPWSetStamp());
		existing.setRequiredPasswordHash(data.getRequiredPasswordHash());
		// Save the changes we've made
		return secure31SecUserPasswordRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPassword find(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserPasswordRepository.get(requiredSecUserId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPassword> findAll() {
		return( secure31SecUserPasswordRepository.findAll() );
	}

	// SecureSecUserPassword specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecUserPasswordBySetStampIdxKey as arguments.
	 *
	 *		@param requiredPWSetStamp
	 *
	 *		@return List&lt;SecureJpaSecUserPassword&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPassword> findBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		return( secure31SecUserPasswordRepository.findBySetStampIdx(requiredPWSetStamp));
	}

	/**
	 *	ISecureSecUserPasswordBySetStampIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPasswordBySetStampIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPassword> findBySetStampIdx(ISecureSecUserPasswordBySetStampIdxKey key) {
		return( secure31SecUserPasswordRepository.findBySetStampIdx(key.getRequiredPWSetStamp()));
	}

	// SecureSecUserPassword specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserPassword lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserPasswordRepository.lockByIdIdx(requiredSecUserId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWSetStamp
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPassword> lockBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		return( secure31SecUserPasswordRepository.lockBySetStampIdx(requiredPWSetStamp));
	}

	/**
	 *	ISecureSecUserPasswordBySetStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserPassword> lockBySetStampIdx(ISecureSecUserPasswordBySetStampIdxKey key) {
		return( secure31SecUserPasswordRepository.lockBySetStampIdx(key.getRequiredPWSetStamp()));
	}

	// SecureSecUserPassword specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		secure31SecUserPasswordRepository.deleteByIdIdx(requiredSecUserId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWSetStamp
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp) {
		secure31SecUserPasswordRepository.deleteBySetStampIdx(requiredPWSetStamp);
	}

	/**
	 *	ISecureSecUserPasswordBySetStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserPasswordBySetStampIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySetStampIdx(ISecureSecUserPasswordBySetStampIdxKey key) {
		secure31SecUserPasswordRepository.deleteBySetStampIdx(key.getRequiredPWSetStamp());
	}

}

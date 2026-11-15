// Description: Java 25 Spring JPA Service for ISOCtryCcy

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
 *	Service for the SecureISOCtryCcy entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureISOCtryCcyRepository to access them.
 */
@Service("secure31JpaISOCtryCcyService")
public class SecureJpaISOCtryCcyService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaISOCtryCcyRepository secure31ISOCtryCcyRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaISOCtryCcy, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcy create(SecureJpaISOCtryCcy data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		if (data.getRequiredContainerCtry() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerCtry",
				"data.requiredContainerCtry",
				"ISOCtry",
				"ISOCtry",
				null);
		}
		if (data.getRequiredParentCcy() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentCcy",
				"data.requiredParentCcy",
				"ISOCcy",
				"ISOCcy",
				null);
		}
		try {
			if(data.getPKey() != null && secure31ISOCtryCcyRepository.existsById((SecureJpaISOCtryCcyPKey)data.getPKey())) {
				return( (SecureJpaISOCtryCcy)(secure31ISOCtryCcyRepository.findById((SecureJpaISOCtryCcyPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31ISOCtryCcyRepository.save(data);
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
	public SecureJpaISOCtryCcy update(SecureJpaISOCtryCcy data) {
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
		if (data.getRequiredContainerCtry() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerCtry",
				"data.requiredContainerCtry",
				"ISOCtry",
				"ISOCtry",
				null);
		}
		if (data.getRequiredParentCcy() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentCcy",
				"data.requiredParentCcy",
				"ISOCcy",
				"ISOCcy",
				null);
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaISOCtryCcy existing = secure31ISOCtryCcyRepository.findById((SecureJpaISOCtryCcyPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureISOCtryCcy to existing object
		// Apply data columns of SecureISOCtryCcy to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31ISOCtryCcyRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOCcyId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcy find(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOCcyId") short requiredISOCcyId) {
		return( secure31ISOCtryCcyRepository.get(requiredISOCtryId,
			requiredISOCcyId));
	}

	/**
	 *	ISecureISOCtryCcyPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcy find(ISecureISOCtryCcyPKey key) {
		return( secure31ISOCtryCcyRepository.get(key.getRequiredISOCtryId(), key.getRequiredISOCcyId()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> findAll() {
		return( secure31ISOCtryCcyRepository.findAll() );
	}

	// SecureISOCtryCcy specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureISOCtryCcyByCtryIdxKey as arguments.
	 *
	 *		@param requiredISOCtryId
	 *
	 *		@return List&lt;SecureJpaISOCtryCcy&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> findByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId) {
		return( secure31ISOCtryCcyRepository.findByCtryIdx(requiredISOCtryId));
	}

	/**
	 *	ISecureISOCtryCcyByCtryIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryCcyByCtryIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> findByCtryIdx(ISecureISOCtryCcyByCtryIdxKey key) {
		return( secure31ISOCtryCcyRepository.findByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureISOCtryCcyByCcyIdxKey as arguments.
	 *
	 *		@param requiredISOCcyId
	 *
	 *		@return List&lt;SecureJpaISOCtryCcy&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> findByCcyIdx(@Param("iSOCcyId") short requiredISOCcyId) {
		return( secure31ISOCtryCcyRepository.findByCcyIdx(requiredISOCcyId));
	}

	/**
	 *	ISecureISOCtryCcyByCcyIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryCcyByCcyIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> findByCcyIdx(ISecureISOCtryCcyByCcyIdxKey key) {
		return( secure31ISOCtryCcyRepository.findByCcyIdx(key.getRequiredISOCcyId()));
	}

	// SecureISOCtryCcy specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOCcyId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcy lockByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOCcyId") short requiredISOCcyId) {
		return( secure31ISOCtryCcyRepository.lockByIdIdx(requiredISOCtryId,
			requiredISOCcyId));
	}

	/**
	 *	ISecureISOCtryCcyPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryCcy lockByIdIdx(ISecureISOCtryCcyPKey key) {
		return( secure31ISOCtryCcyRepository.lockByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOCcyId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> lockByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId) {
		return( secure31ISOCtryCcyRepository.lockByCtryIdx(requiredISOCtryId));
	}

	/**
	 *	ISecureISOCtryCcyByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> lockByCtryIdx(ISecureISOCtryCcyByCtryIdxKey key) {
		return( secure31ISOCtryCcyRepository.lockByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCcyId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> lockByCcyIdx(@Param("iSOCcyId") short requiredISOCcyId) {
		return( secure31ISOCtryCcyRepository.lockByCcyIdx(requiredISOCcyId));
	}

	/**
	 *	ISecureISOCtryCcyByCcyIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryCcy> lockByCcyIdx(ISecureISOCtryCcyByCcyIdxKey key) {
		return( secure31ISOCtryCcyRepository.lockByCcyIdx(key.getRequiredISOCcyId()));
	}

	// SecureISOCtryCcy specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOCcyId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOCcyId") short requiredISOCcyId) {
		secure31ISOCtryCcyRepository.deleteByIdIdx(requiredISOCtryId,
			requiredISOCcyId);
	}

	/**
	 *	ISecureISOCtryCcyByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryCcyByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureISOCtryCcyPKey key) {
		secure31ISOCtryCcyRepository.deleteByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOCcyId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId) {
		secure31ISOCtryCcyRepository.deleteByCtryIdx(requiredISOCtryId);
	}

	/**
	 *	ISecureISOCtryCcyByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryCcyByCtryIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCtryIdx(ISecureISOCtryCcyByCtryIdxKey key) {
		secure31ISOCtryCcyRepository.deleteByCtryIdx(key.getRequiredISOCtryId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCcyId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCcyIdx(@Param("iSOCcyId") short requiredISOCcyId) {
		secure31ISOCtryCcyRepository.deleteByCcyIdx(requiredISOCcyId);
	}

	/**
	 *	ISecureISOCtryCcyByCcyIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryCcyByCcyIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCcyIdx(ISecureISOCtryCcyByCcyIdxKey key) {
		secure31ISOCtryCcyRepository.deleteByCcyIdx(key.getRequiredISOCcyId());
	}

}

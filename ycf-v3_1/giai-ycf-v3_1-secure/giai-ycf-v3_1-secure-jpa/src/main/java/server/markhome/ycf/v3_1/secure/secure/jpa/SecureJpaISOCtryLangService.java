// Description: Java 25 Spring JPA Service for ISOCtryLang

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
 *	Service for the SecureISOCtryLang entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureISOCtryLangRepository to access them.
 */
@Service("secure31JpaISOCtryLangService")
public class SecureJpaISOCtryLangService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaISOCtryLangRepository secure31ISOCtryLangRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaISOCtryLang, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryLang create(SecureJpaISOCtryLang data) {
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
		if (data.getRequiredParentLang() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentLang",
				"data.requiredParentLang",
				"ISOLang",
				"ISOLang",
				null);
		}
		try {
			if(data.getPKey() != null && secure31ISOCtryLangRepository.existsById((SecureJpaISOCtryLangPKey)data.getPKey())) {
				return( (SecureJpaISOCtryLang)(secure31ISOCtryLangRepository.findById((SecureJpaISOCtryLangPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31ISOCtryLangRepository.save(data);
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
	public SecureJpaISOCtryLang update(SecureJpaISOCtryLang data) {
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
		if (data.getRequiredParentLang() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentLang",
				"data.requiredParentLang",
				"ISOLang",
				"ISOLang",
				null);
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaISOCtryLang existing = secure31ISOCtryLangRepository.findById((SecureJpaISOCtryLangPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureISOCtryLang to existing object
		// Apply data columns of SecureISOCtryLang to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31ISOCtryLangRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOLangId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryLang find(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOLangId") short requiredISOLangId) {
		return( secure31ISOCtryLangRepository.get(requiredISOCtryId,
			requiredISOLangId));
	}

	/**
	 *	ISecureISOCtryLangPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryLang find(ISecureISOCtryLangPKey key) {
		return( secure31ISOCtryLangRepository.get(key.getRequiredISOCtryId(), key.getRequiredISOLangId()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> findAll() {
		return( secure31ISOCtryLangRepository.findAll() );
	}

	// SecureISOCtryLang specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureISOCtryLangByCtryIdxKey as arguments.
	 *
	 *		@param requiredISOCtryId
	 *
	 *		@return List&lt;SecureJpaISOCtryLang&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> findByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId) {
		return( secure31ISOCtryLangRepository.findByCtryIdx(requiredISOCtryId));
	}

	/**
	 *	ISecureISOCtryLangByCtryIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryLangByCtryIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> findByCtryIdx(ISecureISOCtryLangByCtryIdxKey key) {
		return( secure31ISOCtryLangRepository.findByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureISOCtryLangByLangIdxKey as arguments.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return List&lt;SecureJpaISOCtryLang&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> findByLangIdx(@Param("iSOLangId") short requiredISOLangId) {
		return( secure31ISOCtryLangRepository.findByLangIdx(requiredISOLangId));
	}

	/**
	 *	ISecureISOCtryLangByLangIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryLangByLangIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> findByLangIdx(ISecureISOCtryLangByLangIdxKey key) {
		return( secure31ISOCtryLangRepository.findByLangIdx(key.getRequiredISOLangId()));
	}

	// SecureISOCtryLang specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOLangId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryLang lockByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOLangId") short requiredISOLangId) {
		return( secure31ISOCtryLangRepository.lockByIdIdx(requiredISOCtryId,
			requiredISOLangId));
	}

	/**
	 *	ISecureISOCtryLangPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCtryLang lockByIdIdx(ISecureISOCtryLangPKey key) {
		return( secure31ISOCtryLangRepository.lockByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOLangId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> lockByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId) {
		return( secure31ISOCtryLangRepository.lockByCtryIdx(requiredISOCtryId));
	}

	/**
	 *	ISecureISOCtryLangByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> lockByCtryIdx(ISecureISOCtryLangByCtryIdxKey key) {
		return( secure31ISOCtryLangRepository.lockByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> lockByLangIdx(@Param("iSOLangId") short requiredISOLangId) {
		return( secure31ISOCtryLangRepository.lockByLangIdx(requiredISOLangId));
	}

	/**
	 *	ISecureISOCtryLangByLangIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCtryLang> lockByLangIdx(ISecureISOCtryLangByLangIdxKey key) {
		return( secure31ISOCtryLangRepository.lockByLangIdx(key.getRequiredISOLangId()));
	}

	// SecureISOCtryLang specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOLangId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOLangId") short requiredISOLangId) {
		secure31ISOCtryLangRepository.deleteByIdIdx(requiredISOCtryId,
			requiredISOLangId);
	}

	/**
	 *	ISecureISOCtryLangByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryLangByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureISOCtryLangPKey key) {
		secure31ISOCtryLangRepository.deleteByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOLangId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId) {
		secure31ISOCtryLangRepository.deleteByCtryIdx(requiredISOCtryId);
	}

	/**
	 *	ISecureISOCtryLangByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryLangByCtryIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCtryIdx(ISecureISOCtryLangByCtryIdxKey key) {
		secure31ISOCtryLangRepository.deleteByCtryIdx(key.getRequiredISOCtryId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLangIdx(@Param("iSOLangId") short requiredISOLangId) {
		secure31ISOCtryLangRepository.deleteByLangIdx(requiredISOLangId);
	}

	/**
	 *	ISecureISOCtryLangByLangIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCtryLangByLangIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByLangIdx(ISecureISOCtryLangByLangIdxKey key) {
		secure31ISOCtryLangRepository.deleteByLangIdx(key.getRequiredISOLangId());
	}

}

// Description: Java 25 Spring JPA Service for ISOLang

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
 *	Service for the SecureISOLang entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureISOLangRepository to access them.
 */
@Service("secure31JpaISOLangService")
public class SecureJpaISOLangService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaISOLangRepository secure31ISOLangRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaISOLang, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang create(SecureJpaISOLang data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		short originalRequiredISOLangId = data.getRequiredISOLangId();
		boolean generatedRequiredISOLangId = false;
		if(data.getRequiredISO6392Code() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredISO6392Code");
		}
		if(data.getRequiredEnglishName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEnglishName");
		}
		try {
			if(data.getPKey() != null && secure31ISOLangRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaISOLang)(secure31ISOLangRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31ISOLangRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredISOLangId) {
					data.setRequiredISOLangId(originalRequiredISOLangId);
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
	public SecureJpaISOLang update(SecureJpaISOLang data) {
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
		if(data.getRequiredISO6392Code() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredISO6392Code");
		}
		if(data.getRequiredEnglishName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEnglishName");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaISOLang existing = secure31ISOLangRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureISOLang to existing object
		// Apply data columns of SecureISOLang to existing object
		existing.setRequiredISO6392Code(data.getRequiredISO6392Code());
		existing.setOptionalISO6391Code(data.getOptionalISO6391Code());
		existing.setRequiredEnglishName(data.getRequiredEnglishName());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31ISOLangRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang find(@Param("iSOLangId") short requiredISOLangId) {
		return( secure31ISOLangRepository.get(requiredISOLangId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOLang> findAll() {
		return( secure31ISOLangRepository.findAll() );
	}

	// SecureISOLang specified index finders

	/**
	 *	Find an entity using the columns of the ISecureISOLangByCode3IdxKey as arguments.
	 *
	 *		@param requiredISO6392Code
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang findByCode3Idx(@Param("iSO6392Code") String requiredISO6392Code) {
		return( secure31ISOLangRepository.findByCode3Idx(requiredISO6392Code));
	}

	/**
	 *	ISecureISOLangByCode3IdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOLangByCode3IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang findByCode3Idx(ISecureISOLangByCode3IdxKey key) {
		return( secure31ISOLangRepository.findByCode3Idx(key.getRequiredISO6392Code()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureISOLangByCode2IdxKey as arguments.
	 *
	 *		@param optionalISO6391Code
	 *
	 *		@return List&lt;SecureJpaISOLang&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOLang> findByCode2Idx(@Param("iSO6391Code") String optionalISO6391Code) {
		return( secure31ISOLangRepository.findByCode2Idx(optionalISO6391Code));
	}

	/**
	 *	ISecureISOLangByCode2IdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOLangByCode2IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOLang> findByCode2Idx(ISecureISOLangByCode2IdxKey key) {
		return( secure31ISOLangRepository.findByCode2Idx(key.getOptionalISO6391Code()));
	}

	// SecureISOLang specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang lockByIdIdx(@Param("iSOLangId") short requiredISOLangId) {
		return( secure31ISOLangRepository.lockByIdIdx(requiredISOLangId));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISO6392Code
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang lockByCode3Idx(@Param("iSO6392Code") String requiredISO6392Code) {
		return( secure31ISOLangRepository.lockByCode3Idx(requiredISO6392Code));
	}

	/**
	 *	ISecureISOLangByCode3IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOLang lockByCode3Idx(ISecureISOLangByCode3IdxKey key) {
		return( secure31ISOLangRepository.lockByCode3Idx(key.getRequiredISO6392Code()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalISO6391Code
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOLang> lockByCode2Idx(@Param("iSO6391Code") String optionalISO6391Code) {
		return( secure31ISOLangRepository.lockByCode2Idx(optionalISO6391Code));
	}

	/**
	 *	ISecureISOLangByCode2IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOLang> lockByCode2Idx(ISecureISOLangByCode2IdxKey key) {
		return( secure31ISOLangRepository.lockByCode2Idx(key.getOptionalISO6391Code()));
	}

	// SecureISOLang specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("iSOLangId") short requiredISOLangId) {
		secure31ISOLangRepository.deleteByIdIdx(requiredISOLangId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISO6392Code
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCode3Idx(@Param("iSO6392Code") String requiredISO6392Code) {
		secure31ISOLangRepository.deleteByCode3Idx(requiredISO6392Code);
	}

	/**
	 *	ISecureISOLangByCode3IdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOLangByCode3IdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCode3Idx(ISecureISOLangByCode3IdxKey key) {
		secure31ISOLangRepository.deleteByCode3Idx(key.getRequiredISO6392Code());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalISO6391Code
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCode2Idx(@Param("iSO6391Code") String optionalISO6391Code) {
		secure31ISOLangRepository.deleteByCode2Idx(optionalISO6391Code);
	}

	/**
	 *	ISecureISOLangByCode2IdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOLangByCode2IdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCode2Idx(ISecureISOLangByCode2IdxKey key) {
		secure31ISOLangRepository.deleteByCode2Idx(key.getOptionalISO6391Code());
	}

}

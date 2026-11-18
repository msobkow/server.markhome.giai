// Description: Java 25 Spring JPA Service for SecSysGrp

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
 *	Service for the SecureSecSysGrp entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecSysGrpRepository to access them.
 */
@Service("secure31JpaSecSysGrpService")
public class SecureJpaSecSysGrpService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecSysGrpRepository secure31SecSysGrpRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecSysGrp, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp create(SecureJpaSecSysGrp data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredSecSysGrpId = data.getRequiredSecSysGrpId();
		boolean generatedRequiredSecSysGrpId = false;
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		if(data.getRequiredSecLevel() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSecLevel");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecSysGrpRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecSysGrp)(secure31SecSysGrpRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredSecSysGrpId() == null || data.getRequiredSecSysGrpId().isNull()) {
				data.setRequiredSecSysGrpId(new CFDbKeyHash256(0));
				generatedRequiredSecSysGrpId = true;
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecSysGrpRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredSecSysGrpId) {
					data.setRequiredSecSysGrpId(originalRequiredSecSysGrpId);
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
	public SecureJpaSecSysGrp update(SecureJpaSecSysGrp data) {
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
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		if(data.getRequiredSecLevel() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSecLevel");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecSysGrp existing = secure31SecSysGrpRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecSysGrp to existing object
		// Apply data columns of SecureSecSysGrp to existing object
		existing.setRequiredName(data.getRequiredName());
		existing.setRequiredSecLevel(data.getRequiredSecLevel());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecSysGrpRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecSysGrpId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp find(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId) {
		return( secure31SecSysGrpRepository.get(requiredSecSysGrpId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrp> findAll() {
		return( secure31SecSysGrpRepository.findAll() );
	}

	// SecureSecSysGrp specified index finders

	/**
	 *	Find an entity using the columns of the ISecureSecSysGrpByUNameIdxKey as arguments.
	 *
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp findByUNameIdx(@Param("name") String requiredName) {
		return( secure31SecSysGrpRepository.findByUNameIdx(requiredName));
	}

	/**
	 *	ISecureSecSysGrpByUNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp findByUNameIdx(ISecureSecSysGrpByUNameIdxKey key) {
		return( secure31SecSysGrpRepository.findByUNameIdx(key.getRequiredName()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSysGrpBySecLevelIdxKey as arguments.
	 *
	 *		@param requiredSecLevel
	 *
	 *		@return List&lt;SecureJpaSecSysGrp&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrp> findBySecLevelIdx(@Param("secLevel") ISecurePubSchema.SecLevelEnum requiredSecLevel) {
		return( secure31SecSysGrpRepository.findBySecLevelIdx(requiredSecLevel));
	}

	/**
	 *	ISecureSecSysGrpBySecLevelIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpBySecLevelIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrp> findBySecLevelIdx(ISecureSecSysGrpBySecLevelIdxKey key) {
		return( secure31SecSysGrpRepository.findBySecLevelIdx(key.getRequiredSecLevel()));
	}

	// SecureSecSysGrp specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp lockByIdIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId) {
		return( secure31SecSysGrpRepository.lockByIdIdx(requiredSecSysGrpId));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp lockByUNameIdx(@Param("name") String requiredName) {
		return( secure31SecSysGrpRepository.lockByUNameIdx(requiredName));
	}

	/**
	 *	ISecureSecSysGrpByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysGrp lockByUNameIdx(ISecureSecSysGrpByUNameIdxKey key) {
		return( secure31SecSysGrpRepository.lockByUNameIdx(key.getRequiredName()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecLevel
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrp> lockBySecLevelIdx(@Param("secLevel") ISecurePubSchema.SecLevelEnum requiredSecLevel) {
		return( secure31SecSysGrpRepository.lockBySecLevelIdx(requiredSecLevel));
	}

	/**
	 *	ISecureSecSysGrpBySecLevelIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysGrp> lockBySecLevelIdx(ISecureSecSysGrpBySecLevelIdxKey key) {
		return( secure31SecSysGrpRepository.lockBySecLevelIdx(key.getRequiredSecLevel()));
	}

	// SecureSecSysGrp specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId) {
		secure31SecSysGrpRepository.deleteByIdIdx(requiredSecSysGrpId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUNameIdx(@Param("name") String requiredName) {
		secure31SecSysGrpRepository.deleteByUNameIdx(requiredName);
	}

	/**
	 *	ISecureSecSysGrpByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpByUNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUNameIdx(ISecureSecSysGrpByUNameIdxKey key) {
		secure31SecSysGrpRepository.deleteByUNameIdx(key.getRequiredName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecLevel
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySecLevelIdx(@Param("secLevel") ISecurePubSchema.SecLevelEnum requiredSecLevel) {
		secure31SecSysGrpRepository.deleteBySecLevelIdx(requiredSecLevel);
	}

	/**
	 *	ISecureSecSysGrpBySecLevelIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysGrpBySecLevelIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySecLevelIdx(ISecureSecSysGrpBySecLevelIdxKey key) {
		secure31SecSysGrpRepository.deleteBySecLevelIdx(key.getRequiredSecLevel());
	}

}

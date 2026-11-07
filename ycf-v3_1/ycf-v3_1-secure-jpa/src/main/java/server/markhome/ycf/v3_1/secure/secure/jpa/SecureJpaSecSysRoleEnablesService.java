// Description: Java 25 Spring JPA Service for SecSysRoleEnables

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
 *	Service for the SecureSecSysRoleEnables entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecSysRoleEnablesRepository to access them.
 */
@Service("secure31JpaSecSysRoleEnablesService")
public class SecureJpaSecSysRoleEnablesService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecSysRoleEnablesRepository secure31SecSysRoleEnablesRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecSysRoleEnables, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnables create(SecureJpaSecSysRoleEnables data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		if (data.getRequiredContainerSysRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysRole",
				"data.requiredContainerSysRole",
				"SecSysRole",
				"SecSysRole",
				null);
		}
		if (data.getRequiredParentEnableGroup() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentEnableGroup",
				"data.requiredParentEnableGroup",
				"SecSysGrp",
				"SecSysGrp",
				null);
		}
		try {
			if(data.getPKey() != null && secure31SecSysRoleEnablesRepository.existsById((SecureJpaSecSysRoleEnablesPKey)data.getPKey())) {
				return( (SecureJpaSecSysRoleEnables)(secure31SecSysRoleEnablesRepository.findById((SecureJpaSecSysRoleEnablesPKey)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecSysRoleEnablesRepository.save(data);
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
	public SecureJpaSecSysRoleEnables update(SecureJpaSecSysRoleEnables data) {
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
		if (data.getRequiredContainerSysRole() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerSysRole",
				"data.requiredContainerSysRole",
				"SecSysRole",
				"SecSysRole",
				null);
		}
		if (data.getRequiredParentEnableGroup() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Parent",
				"Parent",
				"data.requiredParentEnableGroup",
				"data.requiredParentEnableGroup",
				"SecSysGrp",
				"SecSysGrp",
				null);
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecSysRoleEnables existing = secure31SecSysRoleEnablesRepository.findById((SecureJpaSecSysRoleEnablesPKey)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecSysRoleEnables to existing object
		// Apply data columns of SecureSecSysRoleEnables to existing object
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecSysRoleEnablesRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredEnableName
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnables find(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("enableName") String requiredEnableName) {
		return( secure31SecSysRoleEnablesRepository.get(requiredSecSysRoleId,
			requiredEnableName));
	}

	/**
	 *	ISecureSecSysRoleEnablesPKey based find method for object-cored access.
	 *
	 *		@param key The key of the entity to be find.
	 *
	 *		@return The entity find, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnables find(ISecureSecSysRoleEnablesPKey key) {
		return( secure31SecSysRoleEnablesRepository.get(key.getRequiredSecSysRoleId(), key.getRequiredEnableName()));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> findAll() {
		return( secure31SecSysRoleEnablesRepository.findAll() );
	}

	// SecureSecSysRoleEnables specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSysRoleEnablesBySysRoleIdxKey as arguments.
	 *
	 *		@param requiredSecSysRoleId
	 *
	 *		@return List&lt;SecureJpaSecSysRoleEnables&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> findBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId) {
		return( secure31SecSysRoleEnablesRepository.findBySysRoleIdx(requiredSecSysRoleId));
	}

	/**
	 *	ISecureSecSysRoleEnablesBySysRoleIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleEnablesBySysRoleIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> findBySysRoleIdx(ISecureSecSysRoleEnablesBySysRoleIdxKey key) {
		return( secure31SecSysRoleEnablesRepository.findBySysRoleIdx(key.getRequiredSecSysRoleId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecSysRoleEnablesByNameIdxKey as arguments.
	 *
	 *		@param requiredEnableName
	 *
	 *		@return List&lt;SecureJpaSecSysRoleEnables&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> findByNameIdx(@Param("enableName") String requiredEnableName) {
		return( secure31SecSysRoleEnablesRepository.findByNameIdx(requiredEnableName));
	}

	/**
	 *	ISecureSecSysRoleEnablesByNameIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleEnablesByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> findByNameIdx(ISecureSecSysRoleEnablesByNameIdxKey key) {
		return( secure31SecSysRoleEnablesRepository.findByNameIdx(key.getRequiredEnableName()));
	}

	// SecureSecSysRoleEnables specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredEnableName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnables lockByIdIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("enableName") String requiredEnableName) {
		return( secure31SecSysRoleEnablesRepository.lockByIdIdx(requiredSecSysRoleId,
			requiredEnableName));
	}

	/**
	 *	ISecureSecSysRoleEnablesPKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecSysRoleEnables lockByIdIdx(ISecureSecSysRoleEnablesPKey key) {
		return( secure31SecSysRoleEnablesRepository.lockByIdIdx(key.getRequiredSecSysRoleId(), key.getRequiredEnableName()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> lockBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId) {
		return( secure31SecSysRoleEnablesRepository.lockBySysRoleIdx(requiredSecSysRoleId));
	}

	/**
	 *	ISecureSecSysRoleEnablesBySysRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> lockBySysRoleIdx(ISecureSecSysRoleEnablesBySysRoleIdxKey key) {
		return( secure31SecSysRoleEnablesRepository.lockBySysRoleIdx(key.getRequiredSecSysRoleId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEnableName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> lockByNameIdx(@Param("enableName") String requiredEnableName) {
		return( secure31SecSysRoleEnablesRepository.lockByNameIdx(requiredEnableName));
	}

	/**
	 *	ISecureSecSysRoleEnablesByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecSysRoleEnables> lockByNameIdx(ISecureSecSysRoleEnablesByNameIdxKey key) {
		return( secure31SecSysRoleEnablesRepository.lockByNameIdx(key.getRequiredEnableName()));
	}

	// SecureSecSysRoleEnables specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredEnableName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("enableName") String requiredEnableName) {
		secure31SecSysRoleEnablesRepository.deleteByIdIdx(requiredSecSysRoleId,
			requiredEnableName);
	}

	/**
	 *	ISecureSecSysRoleEnablesByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleEnablesByIdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(ISecureSecSysRoleEnablesPKey key) {
		secure31SecSysRoleEnablesRepository.deleteByIdIdx(key.getRequiredSecSysRoleId(), key.getRequiredEnableName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId) {
		secure31SecSysRoleEnablesRepository.deleteBySysRoleIdx(requiredSecSysRoleId);
	}

	/**
	 *	ISecureSecSysRoleEnablesBySysRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleEnablesBySysRoleIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySysRoleIdx(ISecureSecSysRoleEnablesBySysRoleIdxKey key) {
		secure31SecSysRoleEnablesRepository.deleteBySysRoleIdx(key.getRequiredSecSysRoleId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEnableName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(@Param("enableName") String requiredEnableName) {
		secure31SecSysRoleEnablesRepository.deleteByNameIdx(requiredEnableName);
	}

	/**
	 *	ISecureSecSysRoleEnablesByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecSysRoleEnablesByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNameIdx(ISecureSecSysRoleEnablesByNameIdxKey key) {
		secure31SecSysRoleEnablesRepository.deleteByNameIdx(key.getRequiredEnableName());
	}

}

// Description: Java 25 Spring JPA Service for TableInfo

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
 *	Service for the SecureTableInfo entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureTableInfoRepository to access them.
 */
@Service("secure31JpaTableInfoService")
public class SecureJpaTableInfoService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaTableInfoRepository secure31TableInfoRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaTableInfo, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo create(SecureJpaTableInfo data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		int originalRequiredTableInfoId = data.getRequiredTableInfoId();
		boolean generatedRequiredTableInfoId = false;
		if(data.getRequiredSchemaName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSchemaName");
		}
		if(data.getRequiredTableName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTableName");
		}
		if( data.getRequiredBackingClassCode() < ISecureTableInfo.BACKINGCLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredBackingClassCode()",
				data.getRequiredBackingClassCode(),
				ISecureTableInfo.BACKINGCLASSCODE_MIN_VALUE );
		}
		if( data.getRequiredRuntimeClassCode() < ISecureTableInfo.RUNTIMECLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredRuntimeClassCode()",
				data.getRequiredRuntimeClassCode(),
				ISecureTableInfo.RUNTIMECLASSCODE_MIN_VALUE );
		}
		if(data.getRequiredSecScopeName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSecScopeName");
		}
		if(data.getRequiredCodeVis() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredCodeVis");
		}
		try {
			if(data.getPKey() != null && secure31TableInfoRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaTableInfo)(secure31TableInfoRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			return secure31TableInfoRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredTableInfoId) {
					data.setRequiredTableInfoId(originalRequiredTableInfoId);
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
	public SecureJpaTableInfo update(SecureJpaTableInfo data) {
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
		if(data.getRequiredSchemaName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSchemaName");
		}
		if(data.getRequiredTableName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTableName");
		}
		if( data.getRequiredBackingClassCode() < ISecureTableInfo.BACKINGCLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredBackingClassCode()",
				data.getRequiredBackingClassCode(),
				ISecureTableInfo.BACKINGCLASSCODE_MIN_VALUE );
		}
		if( data.getRequiredRuntimeClassCode() < ISecureTableInfo.RUNTIMECLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredRuntimeClassCode()",
				data.getRequiredRuntimeClassCode(),
				ISecureTableInfo.RUNTIMECLASSCODE_MIN_VALUE );
		}
		if(data.getRequiredSecScopeName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredSecScopeName");
		}
		if(data.getRequiredCodeVis() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredCodeVis");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaTableInfo existing = secure31TableInfoRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureTableInfo to existing object
		existing.setOptionalParentSuperRef(data.getOptionalParentSuperRef());
		// Apply data columns of SecureTableInfo to existing object
		existing.setRequiredSchemaName(data.getRequiredSchemaName());
		existing.setRequiredTableName(data.getRequiredTableName());
		existing.setOptionalSuperName(data.getOptionalSuperName());
		existing.setRequiredBackingClassCode(data.getRequiredBackingClassCode());
		existing.setRequiredRuntimeClassCode(data.getRequiredRuntimeClassCode());
		existing.setRequiredHasHistory(data.getRequiredHasHistory());
		existing.setRequiredIsMutable(data.getRequiredIsMutable());
		existing.setRequiredSecScopeName(data.getRequiredSecScopeName());
		existing.setRequiredCodeVis(data.getRequiredCodeVis());
		// Save the changes we've made
		return secure31TableInfoRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredTableInfoId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo find(@Param("tableInfoId") int requiredTableInfoId) {
		return( secure31TableInfoRepository.get(requiredTableInfoId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> findAll() {
		return( secure31TableInfoRepository.findAll() );
	}

	// SecureTableInfo specified index finders

	/**
	 *	Find an entity using the columns of the ISecureTableInfoByTableNameIdxKey as arguments.
	 *
	 *		@param requiredTableName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo findByTableNameIdx(@Param("tableName") String requiredTableName) {
		return( secure31TableInfoRepository.findByTableNameIdx(requiredTableName));
	}

	/**
	 *	ISecureTableInfoByTableNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoByTableNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo findByTableNameIdx(ISecureTableInfoByTableNameIdxKey key) {
		return( secure31TableInfoRepository.findByTableNameIdx(key.getRequiredTableName()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureTableInfoBySuperNameIdxKey as arguments.
	 *
	 *		@param optionalSuperName
	 *
	 *		@return List&lt;SecureJpaTableInfo&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> findBySuperNameIdx(@Param("superName") String optionalSuperName) {
		return( secure31TableInfoRepository.findBySuperNameIdx(optionalSuperName));
	}

	/**
	 *	ISecureTableInfoBySuperNameIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySuperNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> findBySuperNameIdx(ISecureTableInfoBySuperNameIdxKey key) {
		return( secure31TableInfoRepository.findBySuperNameIdx(key.getOptionalSuperName()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureTableInfoBySchemaNameIdxKey as arguments.
	 *
	 *		@param requiredSchemaName
	 *
	 *		@return List&lt;SecureJpaTableInfo&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> findBySchemaNameIdx(@Param("schemaName") String requiredSchemaName) {
		return( secure31TableInfoRepository.findBySchemaNameIdx(requiredSchemaName));
	}

	/**
	 *	ISecureTableInfoBySchemaNameIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySchemaNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> findBySchemaNameIdx(ISecureTableInfoBySchemaNameIdxKey key) {
		return( secure31TableInfoRepository.findBySchemaNameIdx(key.getRequiredSchemaName()));
	}

	/**
	 *	Find an entity using the columns of the ISecureTableInfoBySchemaBkCodeIdxKey as arguments.
	 *
	 *		@param requiredSchemaName
	 *		@param requiredBackingClassCode
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo findBySchemaBkCodeIdx(@Param("schemaName") String requiredSchemaName,
		@Param("backingClassCode") int requiredBackingClassCode) {
		return( secure31TableInfoRepository.findBySchemaBkCodeIdx(requiredSchemaName,
			requiredBackingClassCode));
	}

	/**
	 *	ISecureTableInfoBySchemaBkCodeIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySchemaBkCodeIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo findBySchemaBkCodeIdx(ISecureTableInfoBySchemaBkCodeIdxKey key) {
		return( secure31TableInfoRepository.findBySchemaBkCodeIdx(key.getRequiredSchemaName(), key.getRequiredBackingClassCode()));
	}

	/**
	 *	Find an entity using the columns of the ISecureTableInfoBySchemaRTCodeIdxKey as arguments.
	 *
	 *		@param requiredRuntimeClassCode
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo findBySchemaRTCodeIdx(@Param("runtimeClassCode") int requiredRuntimeClassCode) {
		return( secure31TableInfoRepository.findBySchemaRTCodeIdx(requiredRuntimeClassCode));
	}

	/**
	 *	ISecureTableInfoBySchemaRTCodeIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySchemaRTCodeIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo findBySchemaRTCodeIdx(ISecureTableInfoBySchemaRTCodeIdxKey key) {
		return( secure31TableInfoRepository.findBySchemaRTCodeIdx(key.getRequiredRuntimeClassCode()));
	}

	// SecureTableInfo specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTableInfoId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo lockByIdIdx(@Param("tableInfoId") int requiredTableInfoId) {
		return( secure31TableInfoRepository.lockByIdIdx(requiredTableInfoId));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTableName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo lockByTableNameIdx(@Param("tableName") String requiredTableName) {
		return( secure31TableInfoRepository.lockByTableNameIdx(requiredTableName));
	}

	/**
	 *	ISecureTableInfoByTableNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo lockByTableNameIdx(ISecureTableInfoByTableNameIdxKey key) {
		return( secure31TableInfoRepository.lockByTableNameIdx(key.getRequiredTableName()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalSuperName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> lockBySuperNameIdx(@Param("superName") String optionalSuperName) {
		return( secure31TableInfoRepository.lockBySuperNameIdx(optionalSuperName));
	}

	/**
	 *	ISecureTableInfoBySuperNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> lockBySuperNameIdx(ISecureTableInfoBySuperNameIdxKey key) {
		return( secure31TableInfoRepository.lockBySuperNameIdx(key.getOptionalSuperName()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSchemaName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> lockBySchemaNameIdx(@Param("schemaName") String requiredSchemaName) {
		return( secure31TableInfoRepository.lockBySchemaNameIdx(requiredSchemaName));
	}

	/**
	 *	ISecureTableInfoBySchemaNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaTableInfo> lockBySchemaNameIdx(ISecureTableInfoBySchemaNameIdxKey key) {
		return( secure31TableInfoRepository.lockBySchemaNameIdx(key.getRequiredSchemaName()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSchemaName
	 *		@param requiredBackingClassCode
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo lockBySchemaBkCodeIdx(@Param("schemaName") String requiredSchemaName,
		@Param("backingClassCode") int requiredBackingClassCode) {
		return( secure31TableInfoRepository.lockBySchemaBkCodeIdx(requiredSchemaName,
			requiredBackingClassCode));
	}

	/**
	 *	ISecureTableInfoBySchemaBkCodeIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo lockBySchemaBkCodeIdx(ISecureTableInfoBySchemaBkCodeIdxKey key) {
		return( secure31TableInfoRepository.lockBySchemaBkCodeIdx(key.getRequiredSchemaName(), key.getRequiredBackingClassCode()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredRuntimeClassCode
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo lockBySchemaRTCodeIdx(@Param("runtimeClassCode") int requiredRuntimeClassCode) {
		return( secure31TableInfoRepository.lockBySchemaRTCodeIdx(requiredRuntimeClassCode));
	}

	/**
	 *	ISecureTableInfoBySchemaRTCodeIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaTableInfo lockBySchemaRTCodeIdx(ISecureTableInfoBySchemaRTCodeIdxKey key) {
		return( secure31TableInfoRepository.lockBySchemaRTCodeIdx(key.getRequiredRuntimeClassCode()));
	}

	// SecureTableInfo specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTableInfoId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("tableInfoId") int requiredTableInfoId) {
		secure31TableInfoRepository.deleteByIdIdx(requiredTableInfoId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTableName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTableNameIdx(@Param("tableName") String requiredTableName) {
		secure31TableInfoRepository.deleteByTableNameIdx(requiredTableName);
	}

	/**
	 *	ISecureTableInfoByTableNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoByTableNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByTableNameIdx(ISecureTableInfoByTableNameIdxKey key) {
		secure31TableInfoRepository.deleteByTableNameIdx(key.getRequiredTableName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalSuperName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySuperNameIdx(@Param("superName") String optionalSuperName) {
		secure31TableInfoRepository.deleteBySuperNameIdx(optionalSuperName);
	}

	/**
	 *	ISecureTableInfoBySuperNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySuperNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySuperNameIdx(ISecureTableInfoBySuperNameIdxKey key) {
		secure31TableInfoRepository.deleteBySuperNameIdx(key.getOptionalSuperName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSchemaName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySchemaNameIdx(@Param("schemaName") String requiredSchemaName) {
		secure31TableInfoRepository.deleteBySchemaNameIdx(requiredSchemaName);
	}

	/**
	 *	ISecureTableInfoBySchemaNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySchemaNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySchemaNameIdx(ISecureTableInfoBySchemaNameIdxKey key) {
		secure31TableInfoRepository.deleteBySchemaNameIdx(key.getRequiredSchemaName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSchemaName
	 *		@param requiredBackingClassCode
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySchemaBkCodeIdx(@Param("schemaName") String requiredSchemaName,
		@Param("backingClassCode") int requiredBackingClassCode) {
		secure31TableInfoRepository.deleteBySchemaBkCodeIdx(requiredSchemaName,
			requiredBackingClassCode);
	}

	/**
	 *	ISecureTableInfoBySchemaBkCodeIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySchemaBkCodeIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySchemaBkCodeIdx(ISecureTableInfoBySchemaBkCodeIdxKey key) {
		secure31TableInfoRepository.deleteBySchemaBkCodeIdx(key.getRequiredSchemaName(), key.getRequiredBackingClassCode());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredRuntimeClassCode
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySchemaRTCodeIdx(@Param("runtimeClassCode") int requiredRuntimeClassCode) {
		secure31TableInfoRepository.deleteBySchemaRTCodeIdx(requiredRuntimeClassCode);
	}

	/**
	 *	ISecureTableInfoBySchemaRTCodeIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureTableInfoBySchemaRTCodeIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySchemaRTCodeIdx(ISecureTableInfoBySchemaRTCodeIdxKey key) {
		secure31TableInfoRepository.deleteBySchemaRTCodeIdx(key.getRequiredRuntimeClassCode());
	}

}

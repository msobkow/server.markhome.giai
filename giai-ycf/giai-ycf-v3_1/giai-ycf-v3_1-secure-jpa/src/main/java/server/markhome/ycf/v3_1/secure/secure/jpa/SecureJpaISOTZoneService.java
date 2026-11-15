// Description: Java 25 Spring JPA Service for ISOTZone

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
 *	Service for the SecureISOTZone entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureISOTZoneRepository to access them.
 */
@Service("secure31JpaISOTZoneService")
public class SecureJpaISOTZoneService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaISOTZoneRepository secure31ISOTZoneRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaISOTZone, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOTZone create(SecureJpaISOTZone data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		short originalRequiredISOTZoneId = data.getRequiredISOTZoneId();
		boolean generatedRequiredISOTZoneId = false;
		if(data.getRequiredIso8601() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredIso8601");
		}
		if(data.getRequiredTZName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTZName");
		}
		if( data.getRequiredTZHourOffset() < ISecureISOTZone.TZHOUROFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZHourOffset()",
				data.getRequiredTZHourOffset(),
				ISecureISOTZone.TZHOUROFFSET_MIN_VALUE );
		}
		if( data.getRequiredTZHourOffset() > ISecureISOTZone.TZHOUROFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZHourOffset()",
				data.getRequiredTZHourOffset(),
				ISecureISOTZone.TZHOUROFFSET_MAX_VALUE );
		}
		if( data.getRequiredTZMinOffset() < ISecureISOTZone.TZMINOFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZMinOffset()",
				data.getRequiredTZMinOffset(),
				ISecureISOTZone.TZMINOFFSET_MIN_VALUE );
		}
		if( data.getRequiredTZMinOffset() > ISecureISOTZone.TZMINOFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZMinOffset()",
				data.getRequiredTZMinOffset(),
				ISecureISOTZone.TZMINOFFSET_MAX_VALUE );
		}
		if(data.getRequiredDescription() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredDescription");
		}
		try {
			if(data.getPKey() != null && secure31ISOTZoneRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaISOTZone)(secure31ISOTZoneRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31ISOTZoneRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredISOTZoneId) {
					data.setRequiredISOTZoneId(originalRequiredISOTZoneId);
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
	public SecureJpaISOTZone update(SecureJpaISOTZone data) {
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
		if(data.getRequiredIso8601() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredIso8601");
		}
		if(data.getRequiredTZName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTZName");
		}
		if( data.getRequiredTZHourOffset() < ISecureISOTZone.TZHOUROFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZHourOffset()",
				data.getRequiredTZHourOffset(),
				ISecureISOTZone.TZHOUROFFSET_MIN_VALUE );
		}
		if( data.getRequiredTZHourOffset() > ISecureISOTZone.TZHOUROFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZHourOffset()",
				data.getRequiredTZHourOffset(),
				ISecureISOTZone.TZHOUROFFSET_MAX_VALUE );
		}
		if( data.getRequiredTZMinOffset() < ISecureISOTZone.TZMINOFFSET_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZMinOffset()",
				data.getRequiredTZMinOffset(),
				ISecureISOTZone.TZMINOFFSET_MIN_VALUE );
		}
		if( data.getRequiredTZMinOffset() > ISecureISOTZone.TZMINOFFSET_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredTZMinOffset()",
				data.getRequiredTZMinOffset(),
				ISecureISOTZone.TZMINOFFSET_MAX_VALUE );
		}
		if(data.getRequiredDescription() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredDescription");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaISOTZone existing = secure31ISOTZoneRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureISOTZone to existing object
		// Apply data columns of SecureISOTZone to existing object
		existing.setRequiredIso8601(data.getRequiredIso8601());
		existing.setRequiredTZName(data.getRequiredTZName());
		existing.setRequiredTZHourOffset(data.getRequiredTZHourOffset());
		existing.setRequiredTZMinOffset(data.getRequiredTZMinOffset());
		existing.setRequiredDescription(data.getRequiredDescription());
		existing.setRequiredVisible(data.getRequiredVisible());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31ISOTZoneRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOTZoneId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOTZone find(@Param("iSOTZoneId") short requiredISOTZoneId) {
		return( secure31ISOTZoneRepository.get(requiredISOTZoneId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> findAll() {
		return( secure31ISOTZoneRepository.findAll() );
	}

	// SecureISOTZone specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureISOTZoneByOffsetIdxKey as arguments.
	 *
	 *		@param requiredTZHourOffset
	 *		@param requiredTZMinOffset
	 *
	 *		@return List&lt;SecureJpaISOTZone&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> findByOffsetIdx(@Param("tZHourOffset") short requiredTZHourOffset,
		@Param("tZMinOffset") short requiredTZMinOffset) {
		return( secure31ISOTZoneRepository.findByOffsetIdx(requiredTZHourOffset,
			requiredTZMinOffset));
	}

	/**
	 *	ISecureISOTZoneByOffsetIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOTZoneByOffsetIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> findByOffsetIdx(ISecureISOTZoneByOffsetIdxKey key) {
		return( secure31ISOTZoneRepository.findByOffsetIdx(key.getRequiredTZHourOffset(), key.getRequiredTZMinOffset()));
	}

	/**
	 *	Find an entity using the columns of the ISecureISOTZoneByUTZNameIdxKey as arguments.
	 *
	 *		@param requiredTZName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOTZone findByUTZNameIdx(@Param("tZName") String requiredTZName) {
		return( secure31ISOTZoneRepository.findByUTZNameIdx(requiredTZName));
	}

	/**
	 *	ISecureISOTZoneByUTZNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOTZoneByUTZNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOTZone findByUTZNameIdx(ISecureISOTZoneByUTZNameIdxKey key) {
		return( secure31ISOTZoneRepository.findByUTZNameIdx(key.getRequiredTZName()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureISOTZoneByIso8601IdxKey as arguments.
	 *
	 *		@param requiredIso8601
	 *
	 *		@return List&lt;SecureJpaISOTZone&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> findByIso8601Idx(@Param("iso8601") String requiredIso8601) {
		return( secure31ISOTZoneRepository.findByIso8601Idx(requiredIso8601));
	}

	/**
	 *	ISecureISOTZoneByIso8601IdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOTZoneByIso8601IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> findByIso8601Idx(ISecureISOTZoneByIso8601IdxKey key) {
		return( secure31ISOTZoneRepository.findByIso8601Idx(key.getRequiredIso8601()));
	}

	// SecureISOTZone specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOTZoneId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOTZone lockByIdIdx(@Param("iSOTZoneId") short requiredISOTZoneId) {
		return( secure31ISOTZoneRepository.lockByIdIdx(requiredISOTZoneId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTZHourOffset
	 *		@param requiredTZMinOffset
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> lockByOffsetIdx(@Param("tZHourOffset") short requiredTZHourOffset,
		@Param("tZMinOffset") short requiredTZMinOffset) {
		return( secure31ISOTZoneRepository.lockByOffsetIdx(requiredTZHourOffset,
			requiredTZMinOffset));
	}

	/**
	 *	ISecureISOTZoneByOffsetIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> lockByOffsetIdx(ISecureISOTZoneByOffsetIdxKey key) {
		return( secure31ISOTZoneRepository.lockByOffsetIdx(key.getRequiredTZHourOffset(), key.getRequiredTZMinOffset()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTZName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOTZone lockByUTZNameIdx(@Param("tZName") String requiredTZName) {
		return( secure31ISOTZoneRepository.lockByUTZNameIdx(requiredTZName));
	}

	/**
	 *	ISecureISOTZoneByUTZNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOTZone lockByUTZNameIdx(ISecureISOTZoneByUTZNameIdxKey key) {
		return( secure31ISOTZoneRepository.lockByUTZNameIdx(key.getRequiredTZName()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredIso8601
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> lockByIso8601Idx(@Param("iso8601") String requiredIso8601) {
		return( secure31ISOTZoneRepository.lockByIso8601Idx(requiredIso8601));
	}

	/**
	 *	ISecureISOTZoneByIso8601IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOTZone> lockByIso8601Idx(ISecureISOTZoneByIso8601IdxKey key) {
		return( secure31ISOTZoneRepository.lockByIso8601Idx(key.getRequiredIso8601()));
	}

	// SecureISOTZone specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOTZoneId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("iSOTZoneId") short requiredISOTZoneId) {
		secure31ISOTZoneRepository.deleteByIdIdx(requiredISOTZoneId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTZHourOffset
	 *		@param requiredTZMinOffset
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByOffsetIdx(@Param("tZHourOffset") short requiredTZHourOffset,
		@Param("tZMinOffset") short requiredTZMinOffset) {
		secure31ISOTZoneRepository.deleteByOffsetIdx(requiredTZHourOffset,
			requiredTZMinOffset);
	}

	/**
	 *	ISecureISOTZoneByOffsetIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOTZoneByOffsetIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByOffsetIdx(ISecureISOTZoneByOffsetIdxKey key) {
		secure31ISOTZoneRepository.deleteByOffsetIdx(key.getRequiredTZHourOffset(), key.getRequiredTZMinOffset());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTZName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUTZNameIdx(@Param("tZName") String requiredTZName) {
		secure31ISOTZoneRepository.deleteByUTZNameIdx(requiredTZName);
	}

	/**
	 *	ISecureISOTZoneByUTZNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOTZoneByUTZNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUTZNameIdx(ISecureISOTZoneByUTZNameIdxKey key) {
		secure31ISOTZoneRepository.deleteByUTZNameIdx(key.getRequiredTZName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredIso8601
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIso8601Idx(@Param("iso8601") String requiredIso8601) {
		secure31ISOTZoneRepository.deleteByIso8601Idx(requiredIso8601);
	}

	/**
	 *	ISecureISOTZoneByIso8601IdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOTZoneByIso8601IdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIso8601Idx(ISecureISOTZoneByIso8601IdxKey key) {
		secure31ISOTZoneRepository.deleteByIso8601Idx(key.getRequiredIso8601());
	}

}

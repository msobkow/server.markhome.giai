// Description: Java 25 Spring JPA Service for ISOCcy

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
 *	Service for the SecureISOCcy entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureISOCcyRepository to access them.
 */
@Service("secure31JpaISOCcyService")
public class SecureJpaISOCcyService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaISOCcyRepository secure31ISOCcyRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaISOCcy, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy create(SecureJpaISOCcy data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		short originalRequiredISOCcyId = data.getRequiredISOCcyId();
		boolean generatedRequiredISOCcyId = false;
		if(data.getRequiredISOCode() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredISOCode");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		if( data.getRequiredPrecis() < ISecureISOCcy.PRECIS_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredPrecis()",
				data.getRequiredPrecis(),
				ISecureISOCcy.PRECIS_MIN_VALUE );
		}
		if( data.getRequiredPrecis() > ISecureISOCcy.PRECIS_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredPrecis()",
				data.getRequiredPrecis(),
				ISecureISOCcy.PRECIS_MAX_VALUE );
		}
		try {
			if(data.getPKey() != null && secure31ISOCcyRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaISOCcy)(secure31ISOCcyRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31ISOCcyRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredISOCcyId) {
					data.setRequiredISOCcyId(originalRequiredISOCcyId);
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
	public SecureJpaISOCcy update(SecureJpaISOCcy data) {
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
		if(data.getRequiredISOCode() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredISOCode");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		if( data.getRequiredPrecis() < ISecureISOCcy.PRECIS_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredPrecis()",
				data.getRequiredPrecis(),
				ISecureISOCcy.PRECIS_MIN_VALUE );
		}
		if( data.getRequiredPrecis() > ISecureISOCcy.PRECIS_MAX_VALUE ) {
			throw new CFArgumentOverflowException( getClass(),
				S_ProcName,
				0,
				"getRequiredPrecis()",
				data.getRequiredPrecis(),
				ISecureISOCcy.PRECIS_MAX_VALUE );
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaISOCcy existing = secure31ISOCcyRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureISOCcy to existing object
		// Apply data columns of SecureISOCcy to existing object
		existing.setRequiredISOCode(data.getRequiredISOCode());
		existing.setRequiredName(data.getRequiredName());
		existing.setOptionalUnitSymbol(data.getOptionalUnitSymbol());
		existing.setRequiredPrecis(data.getRequiredPrecis());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31ISOCcyRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOCcyId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy find(@Param("iSOCcyId") short requiredISOCcyId) {
		return( secure31ISOCcyRepository.get(requiredISOCcyId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaISOCcy> findAll() {
		return( secure31ISOCcyRepository.findAll() );
	}

	// SecureISOCcy specified index finders

	/**
	 *	Find an entity using the columns of the ISecureISOCcyByCcyCdIdxKey as arguments.
	 *
	 *		@param requiredISOCode
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy findByCcyCdIdx(@Param("iSOCode") String requiredISOCode) {
		return( secure31ISOCcyRepository.findByCcyCdIdx(requiredISOCode));
	}

	/**
	 *	ISecureISOCcyByCcyCdIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOCcyByCcyCdIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy findByCcyCdIdx(ISecureISOCcyByCcyCdIdxKey key) {
		return( secure31ISOCcyRepository.findByCcyCdIdx(key.getRequiredISOCode()));
	}

	/**
	 *	Find an entity using the columns of the ISecureISOCcyByCcyNmIdxKey as arguments.
	 *
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy findByCcyNmIdx(@Param("name") String requiredName) {
		return( secure31ISOCcyRepository.findByCcyNmIdx(requiredName));
	}

	/**
	 *	ISecureISOCcyByCcyNmIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureISOCcyByCcyNmIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy findByCcyNmIdx(ISecureISOCcyByCcyNmIdxKey key) {
		return( secure31ISOCcyRepository.findByCcyNmIdx(key.getRequiredName()));
	}

	// SecureISOCcy specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCcyId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy lockByIdIdx(@Param("iSOCcyId") short requiredISOCcyId) {
		return( secure31ISOCcyRepository.lockByIdIdx(requiredISOCcyId));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCode
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy lockByCcyCdIdx(@Param("iSOCode") String requiredISOCode) {
		return( secure31ISOCcyRepository.lockByCcyCdIdx(requiredISOCode));
	}

	/**
	 *	ISecureISOCcyByCcyCdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy lockByCcyCdIdx(ISecureISOCcyByCcyCdIdxKey key) {
		return( secure31ISOCcyRepository.lockByCcyCdIdx(key.getRequiredISOCode()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy lockByCcyNmIdx(@Param("name") String requiredName) {
		return( secure31ISOCcyRepository.lockByCcyNmIdx(requiredName));
	}

	/**
	 *	ISecureISOCcyByCcyNmIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaISOCcy lockByCcyNmIdx(ISecureISOCcyByCcyNmIdxKey key) {
		return( secure31ISOCcyRepository.lockByCcyNmIdx(key.getRequiredName()));
	}

	// SecureISOCcy specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCcyId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("iSOCcyId") short requiredISOCcyId) {
		secure31ISOCcyRepository.deleteByIdIdx(requiredISOCcyId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCode
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCcyCdIdx(@Param("iSOCode") String requiredISOCode) {
		secure31ISOCcyRepository.deleteByCcyCdIdx(requiredISOCode);
	}

	/**
	 *	ISecureISOCcyByCcyCdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCcyByCcyCdIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCcyCdIdx(ISecureISOCcyByCcyCdIdxKey key) {
		secure31ISOCcyRepository.deleteByCcyCdIdx(key.getRequiredISOCode());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCcyNmIdx(@Param("name") String requiredName) {
		secure31ISOCcyRepository.deleteByCcyNmIdx(requiredName);
	}

	/**
	 *	ISecureISOCcyByCcyNmIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureISOCcyByCcyNmIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByCcyNmIdx(ISecureISOCcyByCcyNmIdxKey key) {
		secure31ISOCcyRepository.deleteByCcyNmIdx(key.getRequiredName());
	}

}

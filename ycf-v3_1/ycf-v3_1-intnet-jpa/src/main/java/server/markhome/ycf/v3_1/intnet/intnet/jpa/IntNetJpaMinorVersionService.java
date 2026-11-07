// Description: Java 25 Spring JPA Service for MinorVersion

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

package server.markhome.ycf.v3_1.intnet.intnet.jpa;

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
import server.markhome.ycf.v3_1.intnet.intnet.*;

/**
 *	Service for the IntNetMinorVersion entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa
 *	using the IntNetMinorVersionRepository to access them.
 */
@Service("intnet31JpaMinorVersionService")
public class IntNetJpaMinorVersionService {

	@Autowired
	@Qualifier("intnet31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean intnet31EntityManagerFactory;

	@Autowired
	private IntNetJpaMinorVersionRepository intnet31MinorVersionRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of IntNetJpaMinorVersion, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion create(IntNetJpaMinorVersion data) {
		final String S_ProcName = "create";
		if (data == null) {
			return( null );
		}
		ICFKeyHash256 originalRequiredId = data.getRequiredId();
		boolean generatedRequiredId = false;
		if (data.getRequiredOwnerTenant() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Owner",
				"Owner",
				"data.requiredOwnerTenant",
				"data.requiredOwnerTenant",
				"Tenant",
				"Tenant",
				null);
		}
		if (data.getRequiredContainerParentMajVer() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentMajVer",
				"data.requiredContainerParentMajVer",
				"MajorVersion",
				"MajorVersion",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredMajorVersionId() == null || data.getRequiredMajorVersionId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredMajorVersionId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && intnet31MinorVersionRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (IntNetJpaMinorVersion)(intnet31MinorVersionRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			if (data.getRequiredId() == null || data.getRequiredId().isNull()) {
				data.setRequiredId(new CFDbKeyHash256(0));
				generatedRequiredId = true;
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return intnet31MinorVersionRepository.save(data);
		}
		catch(Exception ex) {
				if(generatedRequiredId) {
					data.setRequiredId(originalRequiredId);
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
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion update(IntNetJpaMinorVersion data) {
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
		if (data.getRequiredOwnerTenant() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Owner",
				"Owner",
				"data.requiredOwnerTenant",
				"data.requiredOwnerTenant",
				"Tenant",
				"Tenant",
				null);
		}
		if (data.getRequiredContainerParentMajVer() == null) {
			throw new CFUnresolvedRelationException(getClass(),
				S_ProcName,
				"Container",
				"Container",
				"data.requiredContainerParentMajVer",
				"data.requiredContainerParentMajVer",
				"MajorVersion",
				"MajorVersion",
				null);
		}
		if(data.getRequiredTenantId() == null || data.getRequiredTenantId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredTenantId");
		}
		if(data.getRequiredMajorVersionId() == null || data.getRequiredMajorVersionId().isNull()) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredMajorVersionId");
		}
		if(data.getRequiredName() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredName");
		}
		// Ensure the entity exists and that the revision matches
		IntNetJpaMinorVersion existing = intnet31MinorVersionRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of IntNetMinorVersion to existing object
		existing.setRequiredOwnerTenant(data.getRequiredTenantId());
		existing.setRequiredContainerParentMajVer(data.getRequiredContainerParentMajVer());
		// Apply data columns of IntNetMinorVersion to existing object
		existing.setRequiredTenantId(data.getRequiredTenantId());
		existing.setRequiredMajorVersionId(data.getRequiredMajorVersionId());
		existing.setRequiredName(data.getRequiredName());
		existing.setOptionalDescription(data.getOptionalDescription());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return intnet31MinorVersionRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion find(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31MinorVersionRepository.get(requiredId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> findAll() {
		return( intnet31MinorVersionRepository.findAll() );
	}

	// IntNetMinorVersion specified index finders

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetMinorVersionByTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;IntNetJpaMinorVersion&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> findByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31MinorVersionRepository.findByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetMinorVersionByTenantIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetMinorVersionByTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> findByTenantIdx(IIntNetMinorVersionByTenantIdxKey key) {
		return( intnet31MinorVersionRepository.findByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the IIntNetMinorVersionByMajorVerIdxKey as arguments.
	 *
	 *		@param requiredMajorVersionId
	 *
	 *		@return List&lt;IntNetJpaMinorVersion&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> findByMajorVerIdx(@Param("majorVersionId") ICFKeyHash256 requiredMajorVersionId) {
		return( intnet31MinorVersionRepository.findByMajorVerIdx(requiredMajorVersionId));
	}

	/**
	 *	IIntNetMinorVersionByMajorVerIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetMinorVersionByMajorVerIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> findByMajorVerIdx(IIntNetMinorVersionByMajorVerIdxKey key) {
		return( intnet31MinorVersionRepository.findByMajorVerIdx(key.getRequiredMajorVersionId()));
	}

	/**
	 *	Find an entity using the columns of the IIntNetMinorVersionByNameIdxKey as arguments.
	 *
	 *		@param requiredMajorVersionId
	 *		@param requiredName
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion findByNameIdx(@Param("majorVersionId") ICFKeyHash256 requiredMajorVersionId,
		@Param("name") String requiredName) {
		return( intnet31MinorVersionRepository.findByNameIdx(requiredMajorVersionId,
			requiredName));
	}

	/**
	 *	IIntNetMinorVersionByNameIdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The IIntNetMinorVersionByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion findByNameIdx(IIntNetMinorVersionByNameIdxKey key) {
		return( intnet31MinorVersionRepository.findByNameIdx(key.getRequiredMajorVersionId(), key.getRequiredName()));
	}

	// IntNetMinorVersion specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion lockByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		return( intnet31MinorVersionRepository.lockByIdIdx(requiredId));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> lockByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		return( intnet31MinorVersionRepository.lockByTenantIdx(requiredTenantId));
	}

	/**
	 *	IIntNetMinorVersionByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> lockByTenantIdx(IIntNetMinorVersionByTenantIdxKey key) {
		return( intnet31MinorVersionRepository.lockByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredMajorVersionId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> lockByMajorVerIdx(@Param("majorVersionId") ICFKeyHash256 requiredMajorVersionId) {
		return( intnet31MinorVersionRepository.lockByMajorVerIdx(requiredMajorVersionId));
	}

	/**
	 *	IIntNetMinorVersionByMajorVerIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public List<IntNetJpaMinorVersion> lockByMajorVerIdx(IIntNetMinorVersionByMajorVerIdxKey key) {
		return( intnet31MinorVersionRepository.lockByMajorVerIdx(key.getRequiredMajorVersionId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredMajorVersionId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion lockByNameIdx(@Param("majorVersionId") ICFKeyHash256 requiredMajorVersionId,
		@Param("name") String requiredName) {
		return( intnet31MinorVersionRepository.lockByNameIdx(requiredMajorVersionId,
			requiredName));
	}

	/**
	 *	IIntNetMinorVersionByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public IntNetJpaMinorVersion lockByNameIdx(IIntNetMinorVersionByNameIdxKey key) {
		return( intnet31MinorVersionRepository.lockByNameIdx(key.getRequiredMajorVersionId(), key.getRequiredName()));
	}

	// IntNetMinorVersion specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId) {
		intnet31MinorVersionRepository.deleteByIdIdx(requiredId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId) {
		intnet31MinorVersionRepository.deleteByTenantIdx(requiredTenantId);
	}

	/**
	 *	IIntNetMinorVersionByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetMinorVersionByTenantIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByTenantIdx(IIntNetMinorVersionByTenantIdxKey key) {
		intnet31MinorVersionRepository.deleteByTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredMajorVersionId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByMajorVerIdx(@Param("majorVersionId") ICFKeyHash256 requiredMajorVersionId) {
		intnet31MinorVersionRepository.deleteByMajorVerIdx(requiredMajorVersionId);
	}

	/**
	 *	IIntNetMinorVersionByMajorVerIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetMinorVersionByMajorVerIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByMajorVerIdx(IIntNetMinorVersionByMajorVerIdxKey key) {
		intnet31MinorVersionRepository.deleteByMajorVerIdx(key.getRequiredMajorVersionId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredMajorVersionId
	 *		@param requiredName
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(@Param("majorVersionId") ICFKeyHash256 requiredMajorVersionId,
		@Param("name") String requiredName) {
		intnet31MinorVersionRepository.deleteByNameIdx(requiredMajorVersionId,
			requiredName);
	}

	/**
	 *	IIntNetMinorVersionByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IIntNetMinorVersionByNameIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void deleteByNameIdx(IIntNetMinorVersionByNameIdxKey key) {
		intnet31MinorVersionRepository.deleteByNameIdx(key.getRequiredMajorVersionId(), key.getRequiredName());
	}

}

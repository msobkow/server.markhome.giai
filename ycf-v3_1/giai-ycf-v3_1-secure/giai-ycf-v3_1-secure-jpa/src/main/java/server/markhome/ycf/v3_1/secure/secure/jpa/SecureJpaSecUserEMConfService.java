// Description: Java 25 Spring JPA Service for SecUserEMConf

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
 *	Service for the SecureSecUserEMConf entities defined in server.markhome.ycf.v3_1.secure.secure.jpa
 *	using the SecureSecUserEMConfRepository to access them.
 */
@Service("secure31JpaSecUserEMConfService")
public class SecureJpaSecUserEMConfService {

	@Autowired
	@Qualifier("secure31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean secure31EntityManagerFactory;

	@Autowired
	private SecureJpaSecUserEMConfRepository secure31SecUserEMConfRepository;

	/**
	 *	Create an entity, generating any database keys required along the way.
	 *
	 *		@param	data	The entity to be instantiated; must be a specific instance of SecureJpaSecUserEMConf, not a subclass.
	 *
	 *		@return The updated/created entity.
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf create(SecureJpaSecUserEMConf data) {
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
		if(data.getRequiredConfirmEMailAddr() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredConfirmEMailAddr");
		}
		if(data.getRequiredEMailSentStamp() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEMailSentStamp");
		}
		if(data.getRequiredEMConfirmationUuid6() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEMConfirmationUuid6");
		}
		try {
			if(data.getPKey() != null && !data.getPKey().isNull() && secure31SecUserEMConfRepository.existsById(($implCommaIJavaOptAtomType$)data.getPKey())) {
				return( (SecureJpaSecUserEMConf)(secure31SecUserEMConfRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey())).get()));
			}
			if (data.getRequiredRevision() <= 0) {
				data.setRequiredRevision(1);
			}
			LocalDateTime now = LocalDateTime.now();
			data.setCreatedAt(now);
			data.setUpdatedAt(now);
			return secure31SecUserEMConfRepository.save(data);
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
	public SecureJpaSecUserEMConf update(SecureJpaSecUserEMConf data) {
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
		if(data.getRequiredConfirmEMailAddr() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredConfirmEMailAddr");
		}
		if(data.getRequiredEMailSentStamp() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEMailSentStamp");
		}
		if(data.getRequiredEMConfirmationUuid6() == null) {
			throw new CFNullArgumentException(getClass(),
				S_ProcName,
				0,
				"data.requiredEMConfirmationUuid6");
		}
		// Ensure the entity exists and that the revision matches
		SecureJpaSecUserEMConf existing = secure31SecUserEMConfRepository.findById(($implCommaIJavaOptAtomType$)(data.getPKey()))
			.orElseThrow(() -> new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey()));
		if (existing.getRequiredRevision() != data.getRequiredRevision()) {
			throw new CFCollisionDetectedException(getClass(), S_ProcName, data.getPKey());
		}
		// Apply superior data relationships of SecureSecUserEMConf to existing object
		// Apply data columns of SecureSecUserEMConf to existing object
		existing.setRequiredConfirmEMailAddr(data.getRequiredConfirmEMailAddr());
		existing.setRequiredEMailSentStamp(data.getRequiredEMailSentStamp());
		existing.setRequiredEMConfirmationUuid6(data.getRequiredEMConfirmationUuid6());
		existing.setRequiredNewAccount(data.getRequiredNewAccount());
		// Update the audit columns
		data.setUpdatedAt(LocalDateTime.now());
		// Save the changes we've made
		return secure31SecUserEMConfRepository.save(existing);
	}

	/**
	 *	Argument-cored find database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The retrieved entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf find(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserEMConfRepository.get(requiredSecUserId));
	}

	/**
	 *	Retrieve all entities from the repository
	 *
	 *		@return The list of retrieved entities, which may be empty
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> findAll() {
		return( secure31SecUserEMConfRepository.findAll() );
	}

	// SecureSecUserEMConf specified index finders

	/**
	 *	Find an entity using the columns of the ISecureSecUserEMConfByUUuid6IdxKey as arguments.
	 *
	 *		@param requiredEMConfirmationUuid6
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf findByUUuid6Idx(@Param("eMConfirmationUuid6") ICFUuid6 requiredEMConfirmationUuid6) {
		return( secure31SecUserEMConfRepository.findByUUuid6Idx(requiredEMConfirmationUuid6));
	}

	/**
	 *	ISecureSecUserEMConfByUUuid6IdxKey entity finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfByUUuid6IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf findByUUuid6Idx(ISecureSecUserEMConfByUUuid6IdxKey key) {
		return( secure31SecUserEMConfRepository.findByUUuid6Idx(key.getRequiredEMConfirmationUuid6()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecUserEMConfByConfEMAddrIdxKey as arguments.
	 *
	 *		@param requiredConfirmEMailAddr
	 *
	 *		@return List&lt;SecureJpaSecUserEMConf&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> findByConfEMAddrIdx(@Param("confirmEMailAddr") String requiredConfirmEMailAddr) {
		return( secure31SecUserEMConfRepository.findByConfEMAddrIdx(requiredConfirmEMailAddr));
	}

	/**
	 *	ISecureSecUserEMConfByConfEMAddrIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfByConfEMAddrIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> findByConfEMAddrIdx(ISecureSecUserEMConfByConfEMAddrIdxKey key) {
		return( secure31SecUserEMConfRepository.findByConfEMAddrIdx(key.getRequiredConfirmEMailAddr()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecUserEMConfBySentStampIdxKey as arguments.
	 *
	 *		@param requiredEMailSentStamp
	 *
	 *		@return List&lt;SecureJpaSecUserEMConf&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> findBySentStampIdx(@Param("eMailSentStamp") LocalDateTime requiredEMailSentStamp) {
		return( secure31SecUserEMConfRepository.findBySentStampIdx(requiredEMailSentStamp));
	}

	/**
	 *	ISecureSecUserEMConfBySentStampIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfBySentStampIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> findBySentStampIdx(ISecureSecUserEMConfBySentStampIdxKey key) {
		return( secure31SecUserEMConfRepository.findBySentStampIdx(key.getRequiredEMailSentStamp()));
	}

	/**
	 *	Find zero or more entities into a List using the columns of the ISecureSecUserEMConfByNewAcctIdxKey as arguments.
	 *
	 *		@param requiredNewAccount
	 *
	 *		@return List&lt;SecureJpaSecUserEMConf&gt; of the found entities, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> findByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount) {
		return( secure31SecUserEMConfRepository.findByNewAcctIdx(requiredNewAccount));
	}

	/**
	 *	ISecureSecUserEMConfByNewAcctIdxKey entity list finder convenience method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfByNewAcctIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> findByNewAcctIdx(ISecureSecUserEMConfByNewAcctIdxKey key) {
		return( secure31SecUserEMConfRepository.findByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureSecUserEMConf specified lock-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		return( secure31SecUserEMConfRepository.lockByIdIdx(requiredSecUserId));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMConfirmationUuid6
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf lockByUUuid6Idx(@Param("eMConfirmationUuid6") ICFUuid6 requiredEMConfirmationUuid6) {
		return( secure31SecUserEMConfRepository.lockByUUuid6Idx(requiredEMConfirmationUuid6));
	}

	/**
	 *	ISecureSecUserEMConfByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public SecureJpaSecUserEMConf lockByUUuid6Idx(ISecureSecUserEMConfByUUuid6IdxKey key) {
		return( secure31SecUserEMConfRepository.lockByUUuid6Idx(key.getRequiredEMConfirmationUuid6()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredConfirmEMailAddr
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> lockByConfEMAddrIdx(@Param("confirmEMailAddr") String requiredConfirmEMailAddr) {
		return( secure31SecUserEMConfRepository.lockByConfEMAddrIdx(requiredConfirmEMailAddr));
	}

	/**
	 *	ISecureSecUserEMConfByConfEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> lockByConfEMAddrIdx(ISecureSecUserEMConfByConfEMAddrIdxKey key) {
		return( secure31SecUserEMConfRepository.lockByConfEMAddrIdx(key.getRequiredConfirmEMailAddr()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMailSentStamp
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> lockBySentStampIdx(@Param("eMailSentStamp") LocalDateTime requiredEMailSentStamp) {
		return( secure31SecUserEMConfRepository.lockBySentStampIdx(requiredEMailSentStamp));
	}

	/**
	 *	ISecureSecUserEMConfBySentStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> lockBySentStampIdx(ISecureSecUserEMConfBySentStampIdxKey key) {
		return( secure31SecUserEMConfRepository.lockBySentStampIdx(key.getRequiredEMailSentStamp()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredNewAccount
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> lockByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount) {
		return( secure31SecUserEMConfRepository.lockByNewAcctIdx(requiredNewAccount));
	}

	/**
	 *	ISecureSecUserEMConfByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public List<SecureJpaSecUserEMConf> lockByNewAcctIdx(ISecureSecUserEMConfByNewAcctIdxKey key) {
		return( secure31SecUserEMConfRepository.lockByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureSecUserEMConf specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId) {
		secure31SecUserEMConfRepository.deleteByIdIdx(requiredSecUserId);
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMConfirmationUuid6
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUUuid6Idx(@Param("eMConfirmationUuid6") ICFUuid6 requiredEMConfirmationUuid6) {
		secure31SecUserEMConfRepository.deleteByUUuid6Idx(requiredEMConfirmationUuid6);
	}

	/**
	 *	ISecureSecUserEMConfByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfByUUuid6IdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByUUuid6Idx(ISecureSecUserEMConfByUUuid6IdxKey key) {
		secure31SecUserEMConfRepository.deleteByUUuid6Idx(key.getRequiredEMConfirmationUuid6());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredConfirmEMailAddr
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByConfEMAddrIdx(@Param("confirmEMailAddr") String requiredConfirmEMailAddr) {
		secure31SecUserEMConfRepository.deleteByConfEMAddrIdx(requiredConfirmEMailAddr);
	}

	/**
	 *	ISecureSecUserEMConfByConfEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfByConfEMAddrIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByConfEMAddrIdx(ISecureSecUserEMConfByConfEMAddrIdxKey key) {
		secure31SecUserEMConfRepository.deleteByConfEMAddrIdx(key.getRequiredConfirmEMailAddr());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMailSentStamp
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySentStampIdx(@Param("eMailSentStamp") LocalDateTime requiredEMailSentStamp) {
		secure31SecUserEMConfRepository.deleteBySentStampIdx(requiredEMailSentStamp);
	}

	/**
	 *	ISecureSecUserEMConfBySentStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfBySentStampIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteBySentStampIdx(ISecureSecUserEMConfBySentStampIdxKey key) {
		secure31SecUserEMConfRepository.deleteBySentStampIdx(key.getRequiredEMailSentStamp());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredNewAccount
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount) {
		secure31SecUserEMConfRepository.deleteByNewAcctIdx(requiredNewAccount);
	}

	/**
	 *	ISecureSecUserEMConfByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The ISecureSecUserEMConfByNewAcctIdxKey of the entity to be locked.
	 */
	@Transactional(propagation = Propagation.REQUIRED, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void deleteByNewAcctIdx(ISecureSecUserEMConfByNewAcctIdxKey key) {
		secure31SecUserEMConfRepository.deleteByNewAcctIdx(key.getRequiredNewAccount());
	}

}

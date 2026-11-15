// Description: Java 25 Spring JPA Repository for SecUserEMConf

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
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.*;

/**
 *	JpaRepository for the SecureJpaSecUserEMConf entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaSecUserEMConfRepository extends JpaRepository<SecureJpaSecUserEMConf, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	SecureJpaSecUserEMConf save(SecureJpaSecUserEMConf obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredContainerUser.requiredSecUserId = :secUserId")
	SecureJpaSecUserEMConf get(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	// SecureJpaSecUserEMConf specified index readers

	/**
	 *	Read an entity using the columns of the SecureSecUserEMConfByUUuid6IdxKey as arguments.
	 *
	 *		@param requiredEMConfirmationUuid6
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredEMConfirmationUuid6 = :eMConfirmationUuid6")
	SecureJpaSecUserEMConf findByUUuid6Idx(@Param("eMConfirmationUuid6") ICFUuid6 requiredEMConfirmationUuid6);

	/**
	 *	SecureSecUserEMConfByUUuid6IdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfByUUuid6IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecUserEMConf findByUUuid6Idx(ISecureSecUserEMConfByUUuid6IdxKey key) {
		return( findByUUuid6Idx(key.getRequiredEMConfirmationUuid6()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecUserEMConfByConfEMAddrIdxKey as arguments.
	 *
	 *		@param requiredConfirmEMailAddr
	 *
	 *		@return List&lt;SecureJpaSecUserEMConf&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredConfirmEMailAddr = :confirmEMailAddr")
	List<SecureJpaSecUserEMConf> findByConfEMAddrIdx(@Param("confirmEMailAddr") String requiredConfirmEMailAddr);

	/**
	 *	SecureSecUserEMConfByConfEMAddrIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfByConfEMAddrIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecUserEMConf> findByConfEMAddrIdx(ISecureSecUserEMConfByConfEMAddrIdxKey key) {
		return( findByConfEMAddrIdx(key.getRequiredConfirmEMailAddr()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecUserEMConfBySentStampIdxKey as arguments.
	 *
	 *		@param requiredEMailSentStamp
	 *
	 *		@return List&lt;SecureJpaSecUserEMConf&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredEMailSentStamp = :eMailSentStamp")
	List<SecureJpaSecUserEMConf> findBySentStampIdx(@Param("eMailSentStamp") LocalDateTime requiredEMailSentStamp);

	/**
	 *	SecureSecUserEMConfBySentStampIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfBySentStampIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecUserEMConf> findBySentStampIdx(ISecureSecUserEMConfBySentStampIdxKey key) {
		return( findBySentStampIdx(key.getRequiredEMailSentStamp()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecUserEMConfByNewAcctIdxKey as arguments.
	 *
	 *		@param requiredNewAccount
	 *
	 *		@return List&lt;SecureJpaSecUserEMConf&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredNewAccount = :newAccount")
	List<SecureJpaSecUserEMConf> findByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount);

	/**
	 *	SecureSecUserEMConfByNewAcctIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfByNewAcctIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecUserEMConf> findByNewAcctIdx(ISecureSecUserEMConfByNewAcctIdxKey key) {
		return( findByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureJpaSecUserEMConf specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredContainerUser.requiredSecUserId = :secUserId")
	SecureJpaSecUserEMConf lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMConfirmationUuid6
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredEMConfirmationUuid6 = :eMConfirmationUuid6")
	SecureJpaSecUserEMConf lockByUUuid6Idx(@Param("eMConfirmationUuid6") ICFUuid6 requiredEMConfirmationUuid6);

	/**
	 *	SecureSecUserEMConfByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecUserEMConf lockByUUuid6Idx(ISecureSecUserEMConfByUUuid6IdxKey key) {
		return( lockByUUuid6Idx(key.getRequiredEMConfirmationUuid6()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredConfirmEMailAddr
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredConfirmEMailAddr = :confirmEMailAddr")
	List<SecureJpaSecUserEMConf> lockByConfEMAddrIdx(@Param("confirmEMailAddr") String requiredConfirmEMailAddr);

	/**
	 *	SecureSecUserEMConfByConfEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecUserEMConf> lockByConfEMAddrIdx(ISecureSecUserEMConfByConfEMAddrIdxKey key) {
		return( lockByConfEMAddrIdx(key.getRequiredConfirmEMailAddr()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMailSentStamp
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredEMailSentStamp = :eMailSentStamp")
	List<SecureJpaSecUserEMConf> lockBySentStampIdx(@Param("eMailSentStamp") LocalDateTime requiredEMailSentStamp);

	/**
	 *	SecureSecUserEMConfBySentStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecUserEMConf> lockBySentStampIdx(ISecureSecUserEMConfBySentStampIdxKey key) {
		return( lockBySentStampIdx(key.getRequiredEMailSentStamp()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredNewAccount
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserEMConf r where r.requiredNewAccount = :newAccount")
	List<SecureJpaSecUserEMConf> lockByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount);

	/**
	 *	SecureSecUserEMConfByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecUserEMConf> lockByNewAcctIdx(ISecureSecUserEMConfByNewAcctIdxKey key) {
		return( lockByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureJpaSecUserEMConf specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserEMConf r where r.requiredContainerUser.requiredSecUserId = :secUserId")
	void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMConfirmationUuid6
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserEMConf r where r.requiredEMConfirmationUuid6 = :eMConfirmationUuid6")
	void deleteByUUuid6Idx(@Param("eMConfirmationUuid6") ICFUuid6 requiredEMConfirmationUuid6);

	/**
	 *	SecureSecUserEMConfByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfByUUuid6IdxKey of the entity to be locked.
	 */
	default void deleteByUUuid6Idx(ISecureSecUserEMConfByUUuid6IdxKey key) {
		deleteByUUuid6Idx(key.getRequiredEMConfirmationUuid6());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredConfirmEMailAddr
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserEMConf r where r.requiredConfirmEMailAddr = :confirmEMailAddr")
	void deleteByConfEMAddrIdx(@Param("confirmEMailAddr") String requiredConfirmEMailAddr);

	/**
	 *	SecureSecUserEMConfByConfEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfByConfEMAddrIdxKey of the entity to be locked.
	 */
	default void deleteByConfEMAddrIdx(ISecureSecUserEMConfByConfEMAddrIdxKey key) {
		deleteByConfEMAddrIdx(key.getRequiredConfirmEMailAddr());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEMailSentStamp
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserEMConf r where r.requiredEMailSentStamp = :eMailSentStamp")
	void deleteBySentStampIdx(@Param("eMailSentStamp") LocalDateTime requiredEMailSentStamp);

	/**
	 *	SecureSecUserEMConfBySentStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfBySentStampIdxKey of the entity to be locked.
	 */
	default void deleteBySentStampIdx(ISecureSecUserEMConfBySentStampIdxKey key) {
		deleteBySentStampIdx(key.getRequiredEMailSentStamp());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredNewAccount
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserEMConf r where r.requiredNewAccount = :newAccount")
	void deleteByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount);

	/**
	 *	SecureSecUserEMConfByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserEMConfByNewAcctIdxKey of the entity to be locked.
	 */
	default void deleteByNewAcctIdx(ISecureSecUserEMConfByNewAcctIdxKey key) {
		deleteByNewAcctIdx(key.getRequiredNewAccount());
	}

}

// Description: Java 25 Spring JPA Repository for SecUserPWReset

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
 *	JpaRepository for the SecureJpaSecUserPWReset entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaSecUserPWResetRepository extends JpaRepository<SecureJpaSecUserPWReset, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	SecureJpaSecUserPWReset save(SecureJpaSecUserPWReset obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredContainerUser.requiredSecUserId = :secUserId")
	SecureJpaSecUserPWReset get(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	// SecureJpaSecUserPWReset specified index readers

	/**
	 *	Read an entity using the columns of the SecureSecUserPWResetByUUuid6IdxKey as arguments.
	 *
	 *		@param requiredPasswordResetUuid6
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredPasswordResetUuid6 = :passwordResetUuid6")
	SecureJpaSecUserPWReset findByUUuid6Idx(@Param("passwordResetUuid6") ICFUuid6 requiredPasswordResetUuid6);

	/**
	 *	SecureSecUserPWResetByUUuid6IdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWResetByUUuid6IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWReset findByUUuid6Idx(ISecureSecUserPWResetByUUuid6IdxKey key) {
		return( findByUUuid6Idx(key.getRequiredPasswordResetUuid6()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecUserPWResetBySentEMAddrIdxKey as arguments.
	 *
	 *		@param requiredSentToEMailAddr
	 *
	 *		@return List&lt;SecureJpaSecUserPWReset&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredSentToEMailAddr = :sentToEMailAddr")
	List<SecureJpaSecUserPWReset> findBySentEMAddrIdx(@Param("sentToEMailAddr") String requiredSentToEMailAddr);

	/**
	 *	SecureSecUserPWResetBySentEMAddrIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWResetBySentEMAddrIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecUserPWReset> findBySentEMAddrIdx(ISecureSecUserPWResetBySentEMAddrIdxKey key) {
		return( findBySentEMAddrIdx(key.getRequiredSentToEMailAddr()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecUserPWResetByNewAcctIdxKey as arguments.
	 *
	 *		@param requiredNewAccount
	 *
	 *		@return List&lt;SecureJpaSecUserPWReset&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredNewAccount = :newAccount")
	List<SecureJpaSecUserPWReset> findByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount);

	/**
	 *	SecureSecUserPWResetByNewAcctIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWResetByNewAcctIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecUserPWReset> findByNewAcctIdx(ISecureSecUserPWResetByNewAcctIdxKey key) {
		return( findByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureJpaSecUserPWReset specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredContainerUser.requiredSecUserId = :secUserId")
	SecureJpaSecUserPWReset lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPasswordResetUuid6
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredPasswordResetUuid6 = :passwordResetUuid6")
	SecureJpaSecUserPWReset lockByUUuid6Idx(@Param("passwordResetUuid6") ICFUuid6 requiredPasswordResetUuid6);

	/**
	 *	SecureSecUserPWResetByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWReset lockByUUuid6Idx(ISecureSecUserPWResetByUUuid6IdxKey key) {
		return( lockByUUuid6Idx(key.getRequiredPasswordResetUuid6()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSentToEMailAddr
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredSentToEMailAddr = :sentToEMailAddr")
	List<SecureJpaSecUserPWReset> lockBySentEMAddrIdx(@Param("sentToEMailAddr") String requiredSentToEMailAddr);

	/**
	 *	SecureSecUserPWResetBySentEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecUserPWReset> lockBySentEMAddrIdx(ISecureSecUserPWResetBySentEMAddrIdxKey key) {
		return( lockBySentEMAddrIdx(key.getRequiredSentToEMailAddr()));
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
	@Query("select r from SecureJpaSecUserPWReset r where r.requiredNewAccount = :newAccount")
	List<SecureJpaSecUserPWReset> lockByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount);

	/**
	 *	SecureSecUserPWResetByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecUserPWReset> lockByNewAcctIdx(ISecureSecUserPWResetByNewAcctIdxKey key) {
		return( lockByNewAcctIdx(key.getRequiredNewAccount()));
	}

	// SecureJpaSecUserPWReset specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWReset r where r.requiredContainerUser.requiredSecUserId = :secUserId")
	void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPasswordResetUuid6
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWReset r where r.requiredPasswordResetUuid6 = :passwordResetUuid6")
	void deleteByUUuid6Idx(@Param("passwordResetUuid6") ICFUuid6 requiredPasswordResetUuid6);

	/**
	 *	SecureSecUserPWResetByUUuid6IdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWResetByUUuid6IdxKey of the entity to be locked.
	 */
	default void deleteByUUuid6Idx(ISecureSecUserPWResetByUUuid6IdxKey key) {
		deleteByUUuid6Idx(key.getRequiredPasswordResetUuid6());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSentToEMailAddr
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWReset r where r.requiredSentToEMailAddr = :sentToEMailAddr")
	void deleteBySentEMAddrIdx(@Param("sentToEMailAddr") String requiredSentToEMailAddr);

	/**
	 *	SecureSecUserPWResetBySentEMAddrIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWResetBySentEMAddrIdxKey of the entity to be locked.
	 */
	default void deleteBySentEMAddrIdx(ISecureSecUserPWResetBySentEMAddrIdxKey key) {
		deleteBySentEMAddrIdx(key.getRequiredSentToEMailAddr());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredNewAccount
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWReset r where r.requiredNewAccount = :newAccount")
	void deleteByNewAcctIdx(@Param("newAccount") boolean requiredNewAccount);

	/**
	 *	SecureSecUserPWResetByNewAcctIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWResetByNewAcctIdxKey of the entity to be locked.
	 */
	default void deleteByNewAcctIdx(ISecureSecUserPWResetByNewAcctIdxKey key) {
		deleteByNewAcctIdx(key.getRequiredNewAccount());
	}

}

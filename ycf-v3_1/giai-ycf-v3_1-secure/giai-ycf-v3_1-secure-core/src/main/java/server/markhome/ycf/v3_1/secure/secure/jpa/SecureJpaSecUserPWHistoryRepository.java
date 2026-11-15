// Description: Java 25 Spring JPA Repository for SecUserPWHistory

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
 *	JpaRepository for the SecureJpaSecUserPWHistory entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaSecUserPWHistoryRepository extends JpaRepository<SecureJpaSecUserPWHistory, SecureJpaSecUserPWHistoryPKey> {

	@Transactional
	@Modifying
	SecureJpaSecUserPWHistory save(SecureJpaSecUserPWHistory obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredPWSetStamp
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserPWHistory r where r.pkey.requiredSecUserId = :secUserId and r.pkey.requiredPWSetStamp = :pWSetStamp")
	SecureJpaSecUserPWHistory get(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("pWSetStamp") LocalDateTime requiredPWSetStamp);

	/**
	 *	SecureSecUserPWHistoryPKey based read method for object-cored access.
	 *
	 *		@param key The key of the entity to be read.
	 *
	 *		@return The entity read, usually from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory get(ISecureSecUserPWHistoryPKey key) {
		return( get(key.getRequiredSecUserId(), key.getRequiredPWSetStamp()));
	}

	// SecureJpaSecUserPWHistory specified index readers

	/**
	 *	Read an entity using the columns of the SecureSecUserPWHistoryByUserIdxKey as arguments.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserPWHistory r where r.pkey.requiredSecUserId = :secUserId")
	SecureJpaSecUserPWHistory findByUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	/**
	 *	SecureSecUserPWHistoryByUserIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWHistoryByUserIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory findByUserIdx(ISecureSecUserPWHistoryByUserIdxKey key) {
		return( findByUserIdx(key.getRequiredSecUserId()));
	}

	/**
	 *	Read an entity using the columns of the SecureSecUserPWHistoryBySetStampIdxKey as arguments.
	 *
	 *		@param requiredPWSetStamp
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserPWHistory r where r.pkey.requiredPWSetStamp = :pWSetStamp")
	SecureJpaSecUserPWHistory findBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp);

	/**
	 *	SecureSecUserPWHistoryBySetStampIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWHistoryBySetStampIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory findBySetStampIdx(ISecureSecUserPWHistoryBySetStampIdxKey key) {
		return( findBySetStampIdx(key.getRequiredPWSetStamp()));
	}

	/**
	 *	Read an entity using the columns of the SecureSecUserPWHistoryByReplacedStampIdxKey as arguments.
	 *
	 *		@param requiredPWReplacedStamp
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecUserPWHistory r where r.requiredPWReplacedStamp = :pWReplacedStamp")
	SecureJpaSecUserPWHistory findByReplacedStampIdx(@Param("pWReplacedStamp") LocalDateTime requiredPWReplacedStamp);

	/**
	 *	SecureSecUserPWHistoryByReplacedStampIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWHistoryByReplacedStampIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory findByReplacedStampIdx(ISecureSecUserPWHistoryByReplacedStampIdxKey key) {
		return( findByReplacedStampIdx(key.getRequiredPWReplacedStamp()));
	}

	// SecureJpaSecUserPWHistory specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredPWSetStamp
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserPWHistory r where r.pkey.requiredSecUserId = :secUserId and r.pkey.requiredPWSetStamp = :pWSetStamp")
	SecureJpaSecUserPWHistory lockByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("pWSetStamp") LocalDateTime requiredPWSetStamp);

	/**
	 *	SecureSecUserPWHistoryByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory lockByIdIdx(ISecureSecUserPWHistoryPKey key) {
		return( lockByIdIdx(key.getRequiredSecUserId(), key.getRequiredPWSetStamp()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserPWHistory r where r.pkey.requiredSecUserId = :secUserId")
	SecureJpaSecUserPWHistory lockByUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	/**
	 *	SecureSecUserPWHistoryByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory lockByUserIdx(ISecureSecUserPWHistoryByUserIdxKey key) {
		return( lockByUserIdx(key.getRequiredSecUserId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWSetStamp
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserPWHistory r where r.pkey.requiredPWSetStamp = :pWSetStamp")
	SecureJpaSecUserPWHistory lockBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp);

	/**
	 *	SecureSecUserPWHistoryBySetStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory lockBySetStampIdx(ISecureSecUserPWHistoryBySetStampIdxKey key) {
		return( lockBySetStampIdx(key.getRequiredPWSetStamp()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWReplacedStamp
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecUserPWHistory r where r.requiredPWReplacedStamp = :pWReplacedStamp")
	SecureJpaSecUserPWHistory lockByReplacedStampIdx(@Param("pWReplacedStamp") LocalDateTime requiredPWReplacedStamp);

	/**
	 *	SecureSecUserPWHistoryByReplacedStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecUserPWHistory lockByReplacedStampIdx(ISecureSecUserPWHistoryByReplacedStampIdxKey key) {
		return( lockByReplacedStampIdx(key.getRequiredPWReplacedStamp()));
	}

	// SecureJpaSecUserPWHistory specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 *		@param requiredPWSetStamp
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWHistory r where r.pkey.requiredSecUserId = :secUserId and r.pkey.requiredPWSetStamp = :pWSetStamp")
	void deleteByIdIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId,
		@Param("pWSetStamp") LocalDateTime requiredPWSetStamp);

	/**
	 *	SecureSecUserPWHistoryByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWHistoryByIdIdxKey of the entity to be locked.
	 */
	default void deleteByIdIdx(ISecureSecUserPWHistoryPKey key) {
		deleteByIdIdx(key.getRequiredSecUserId(), key.getRequiredPWSetStamp());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecUserId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWHistory r where r.pkey.requiredSecUserId = :secUserId")
	void deleteByUserIdx(@Param("secUserId") ICFKeyHash256 requiredSecUserId);

	/**
	 *	SecureSecUserPWHistoryByUserIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWHistoryByUserIdxKey of the entity to be locked.
	 */
	default void deleteByUserIdx(ISecureSecUserPWHistoryByUserIdxKey key) {
		deleteByUserIdx(key.getRequiredSecUserId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWSetStamp
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWHistory r where r.pkey.requiredPWSetStamp = :pWSetStamp")
	void deleteBySetStampIdx(@Param("pWSetStamp") LocalDateTime requiredPWSetStamp);

	/**
	 *	SecureSecUserPWHistoryBySetStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWHistoryBySetStampIdxKey of the entity to be locked.
	 */
	default void deleteBySetStampIdx(ISecureSecUserPWHistoryBySetStampIdxKey key) {
		deleteBySetStampIdx(key.getRequiredPWSetStamp());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredPWReplacedStamp
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecUserPWHistory r where r.requiredPWReplacedStamp = :pWReplacedStamp")
	void deleteByReplacedStampIdx(@Param("pWReplacedStamp") LocalDateTime requiredPWReplacedStamp);

	/**
	 *	SecureSecUserPWHistoryByReplacedStampIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecUserPWHistoryByReplacedStampIdxKey of the entity to be locked.
	 */
	default void deleteByReplacedStampIdx(ISecureSecUserPWHistoryByReplacedStampIdxKey key) {
		deleteByReplacedStampIdx(key.getRequiredPWReplacedStamp());
	}

}

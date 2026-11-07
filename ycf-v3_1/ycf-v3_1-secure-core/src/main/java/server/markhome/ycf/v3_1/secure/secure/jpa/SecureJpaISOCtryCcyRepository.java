// Description: Java 25 Spring JPA Repository for ISOCtryCcy

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
 *	JpaRepository for the SecureJpaISOCtryCcy entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaISOCtryCcyRepository extends JpaRepository<SecureJpaISOCtryCcy, SecureJpaISOCtryCcyPKey> {

	@Transactional
	@Modifying
	SecureJpaISOCtryCcy save(SecureJpaISOCtryCcy obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOCcyId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaISOCtryCcy r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId and r.requiredParentCcy.requiredISOCcyId = :iSOCcyId")
	SecureJpaISOCtryCcy get(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOCcyId") short requiredISOCcyId);

	/**
	 *	SecureISOCtryCcyPKey based read method for object-cored access.
	 *
	 *		@param key The key of the entity to be read.
	 *
	 *		@return The entity read, usually from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaISOCtryCcy get(ISecureISOCtryCcyPKey key) {
		return( get(key.getRequiredISOCtryId(), key.getRequiredISOCcyId()));
	}

	// SecureJpaISOCtryCcy specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the SecureISOCtryCcyByCtryIdxKey as arguments.
	 *
	 *		@param requiredISOCtryId
	 *
	 *		@return List&lt;SecureJpaISOCtryCcy&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaISOCtryCcy r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId")
	List<SecureJpaISOCtryCcy> findByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId);

	/**
	 *	SecureISOCtryCcyByCtryIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureISOCtryCcyByCtryIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaISOCtryCcy> findByCtryIdx(ISecureISOCtryCcyByCtryIdxKey key) {
		return( findByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureISOCtryCcyByCcyIdxKey as arguments.
	 *
	 *		@param requiredISOCcyId
	 *
	 *		@return List&lt;SecureJpaISOCtryCcy&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaISOCtryCcy r where r.requiredParentCcy.requiredISOCcyId = :iSOCcyId")
	List<SecureJpaISOCtryCcy> findByCcyIdx(@Param("iSOCcyId") short requiredISOCcyId);

	/**
	 *	SecureISOCtryCcyByCcyIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureISOCtryCcyByCcyIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaISOCtryCcy> findByCcyIdx(ISecureISOCtryCcyByCcyIdxKey key) {
		return( findByCcyIdx(key.getRequiredISOCcyId()));
	}

	// SecureJpaISOCtryCcy specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOCcyId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOCtryCcy r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId and r.requiredParentCcy.requiredISOCcyId = :iSOCcyId")
	SecureJpaISOCtryCcy lockByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOCcyId") short requiredISOCcyId);

	/**
	 *	SecureISOCtryCcyByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaISOCtryCcy lockByIdIdx(ISecureISOCtryCcyPKey key) {
		return( lockByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOCcyId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOCtryCcy r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId")
	List<SecureJpaISOCtryCcy> lockByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId);

	/**
	 *	SecureISOCtryCcyByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaISOCtryCcy> lockByCtryIdx(ISecureISOCtryCcyByCtryIdxKey key) {
		return( lockByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCcyId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOCtryCcy r where r.requiredParentCcy.requiredISOCcyId = :iSOCcyId")
	List<SecureJpaISOCtryCcy> lockByCcyIdx(@Param("iSOCcyId") short requiredISOCcyId);

	/**
	 *	SecureISOCtryCcyByCcyIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaISOCtryCcy> lockByCcyIdx(ISecureISOCtryCcyByCcyIdxKey key) {
		return( lockByCcyIdx(key.getRequiredISOCcyId()));
	}

	// SecureJpaISOCtryCcy specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOCcyId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOCtryCcy r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId and r.requiredParentCcy.requiredISOCcyId = :iSOCcyId")
	void deleteByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOCcyId") short requiredISOCcyId);

	/**
	 *	SecureISOCtryCcyByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOCtryCcyByIdIdxKey of the entity to be locked.
	 */
	default void deleteByIdIdx(ISecureISOCtryCcyPKey key) {
		deleteByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOCcyId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOCtryCcy r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId")
	void deleteByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId);

	/**
	 *	SecureISOCtryCcyByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOCtryCcyByCtryIdxKey of the entity to be locked.
	 */
	default void deleteByCtryIdx(ISecureISOCtryCcyByCtryIdxKey key) {
		deleteByCtryIdx(key.getRequiredISOCtryId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCcyId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOCtryCcy r where r.requiredParentCcy.requiredISOCcyId = :iSOCcyId")
	void deleteByCcyIdx(@Param("iSOCcyId") short requiredISOCcyId);

	/**
	 *	SecureISOCtryCcyByCcyIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOCtryCcyByCcyIdxKey of the entity to be locked.
	 */
	default void deleteByCcyIdx(ISecureISOCtryCcyByCcyIdxKey key) {
		deleteByCcyIdx(key.getRequiredISOCcyId());
	}

}

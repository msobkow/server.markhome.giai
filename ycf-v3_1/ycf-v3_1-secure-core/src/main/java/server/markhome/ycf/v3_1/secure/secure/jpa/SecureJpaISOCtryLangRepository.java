// Description: Java 25 Spring JPA Repository for ISOCtryLang

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
 *	JpaRepository for the SecureJpaISOCtryLang entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaISOCtryLangRepository extends JpaRepository<SecureJpaISOCtryLang, SecureJpaISOCtryLangPKey> {

	@Transactional
	@Modifying
	SecureJpaISOCtryLang save(SecureJpaISOCtryLang obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOLangId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaISOCtryLang r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId and r.requiredParentLang.requiredISOLangId = :iSOLangId")
	SecureJpaISOCtryLang get(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	SecureISOCtryLangPKey based read method for object-cored access.
	 *
	 *		@param key The key of the entity to be read.
	 *
	 *		@return The entity read, usually from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaISOCtryLang get(ISecureISOCtryLangPKey key) {
		return( get(key.getRequiredISOCtryId(), key.getRequiredISOLangId()));
	}

	// SecureJpaISOCtryLang specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the SecureISOCtryLangByCtryIdxKey as arguments.
	 *
	 *		@param requiredISOCtryId
	 *
	 *		@return List&lt;SecureJpaISOCtryLang&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaISOCtryLang r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId")
	List<SecureJpaISOCtryLang> findByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId);

	/**
	 *	SecureISOCtryLangByCtryIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureISOCtryLangByCtryIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaISOCtryLang> findByCtryIdx(ISecureISOCtryLangByCtryIdxKey key) {
		return( findByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureISOCtryLangByLangIdxKey as arguments.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return List&lt;SecureJpaISOCtryLang&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaISOCtryLang r where r.requiredParentLang.requiredISOLangId = :iSOLangId")
	List<SecureJpaISOCtryLang> findByLangIdx(@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	SecureISOCtryLangByLangIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureISOCtryLangByLangIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaISOCtryLang> findByLangIdx(ISecureISOCtryLangByLangIdxKey key) {
		return( findByLangIdx(key.getRequiredISOLangId()));
	}

	// SecureJpaISOCtryLang specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOLangId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOCtryLang r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId and r.requiredParentLang.requiredISOLangId = :iSOLangId")
	SecureJpaISOCtryLang lockByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	SecureISOCtryLangByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaISOCtryLang lockByIdIdx(ISecureISOCtryLangPKey key) {
		return( lockByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOLangId()));
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
	@Query("select r from SecureJpaISOCtryLang r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId")
	List<SecureJpaISOCtryLang> lockByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId);

	/**
	 *	SecureISOCtryLangByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaISOCtryLang> lockByCtryIdx(ISecureISOCtryLangByCtryIdxKey key) {
		return( lockByCtryIdx(key.getRequiredISOCtryId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOCtryLang r where r.requiredParentLang.requiredISOLangId = :iSOLangId")
	List<SecureJpaISOCtryLang> lockByLangIdx(@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	SecureISOCtryLangByLangIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaISOCtryLang> lockByLangIdx(ISecureISOCtryLangByLangIdxKey key) {
		return( lockByLangIdx(key.getRequiredISOLangId()));
	}

	// SecureJpaISOCtryLang specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 *		@param requiredISOLangId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOCtryLang r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId and r.requiredParentLang.requiredISOLangId = :iSOLangId")
	void deleteByIdIdx(@Param("iSOCtryId") short requiredISOCtryId,
		@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	SecureISOCtryLangByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOCtryLangByIdIdxKey of the entity to be locked.
	 */
	default void deleteByIdIdx(ISecureISOCtryLangPKey key) {
		deleteByIdIdx(key.getRequiredISOCtryId(), key.getRequiredISOLangId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOCtryId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOCtryLang r where r.requiredContainerCtry.requiredISOCtryId = :iSOCtryId")
	void deleteByCtryIdx(@Param("iSOCtryId") short requiredISOCtryId);

	/**
	 *	SecureISOCtryLangByCtryIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOCtryLangByCtryIdxKey of the entity to be locked.
	 */
	default void deleteByCtryIdx(ISecureISOCtryLangByCtryIdxKey key) {
		deleteByCtryIdx(key.getRequiredISOCtryId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOCtryLang r where r.requiredParentLang.requiredISOLangId = :iSOLangId")
	void deleteByLangIdx(@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	SecureISOCtryLangByLangIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOCtryLangByLangIdxKey of the entity to be locked.
	 */
	default void deleteByLangIdx(ISecureISOCtryLangByLangIdxKey key) {
		deleteByLangIdx(key.getRequiredISOLangId());
	}

}

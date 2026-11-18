// Description: Java 25 Spring JPA Repository for ISOLang

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
 *	JpaRepository for the SecureJpaISOLang entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaISOLangRepository extends JpaRepository<SecureJpaISOLang, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	SecureJpaISOLang save(SecureJpaISOLang obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaISOLang r where r.requiredISOLangId = :iSOLangId")
	SecureJpaISOLang get(@Param("iSOLangId") short requiredISOLangId);

	// SecureJpaISOLang specified index readers

	/**
	 *	Read an entity using the columns of the SecureISOLangByCode3IdxKey as arguments.
	 *
	 *		@param requiredISO6392Code
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaISOLang r where r.requiredISO6392Code = :iSO6392Code")
	SecureJpaISOLang findByCode3Idx(@Param("iSO6392Code") String requiredISO6392Code);

	/**
	 *	SecureISOLangByCode3IdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureISOLangByCode3IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaISOLang findByCode3Idx(ISecureISOLangByCode3IdxKey key) {
		return( findByCode3Idx(key.getRequiredISO6392Code()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureISOLangByCode2IdxKey as arguments.
	 *
	 *		@param optionalISO6391Code
	 *
	 *		@return List&lt;SecureJpaISOLang&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaISOLang r where r.optionalISO6391Code = :iSO6391Code")
	List<SecureJpaISOLang> findByCode2Idx(@Param("iSO6391Code") String optionalISO6391Code);

	/**
	 *	SecureISOLangByCode2IdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureISOLangByCode2IdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaISOLang> findByCode2Idx(ISecureISOLangByCode2IdxKey key) {
		return( findByCode2Idx(key.getOptionalISO6391Code()));
	}

	// SecureJpaISOLang specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOLang r where r.requiredISOLangId = :iSOLangId")
	SecureJpaISOLang lockByIdIdx(@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISO6392Code
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOLang r where r.requiredISO6392Code = :iSO6392Code")
	SecureJpaISOLang lockByCode3Idx(@Param("iSO6392Code") String requiredISO6392Code);

	/**
	 *	SecureISOLangByCode3IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaISOLang lockByCode3Idx(ISecureISOLangByCode3IdxKey key) {
		return( lockByCode3Idx(key.getRequiredISO6392Code()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalISO6391Code
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaISOLang r where r.optionalISO6391Code = :iSO6391Code")
	List<SecureJpaISOLang> lockByCode2Idx(@Param("iSO6391Code") String optionalISO6391Code);

	/**
	 *	SecureISOLangByCode2IdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaISOLang> lockByCode2Idx(ISecureISOLangByCode2IdxKey key) {
		return( lockByCode2Idx(key.getOptionalISO6391Code()));
	}

	// SecureJpaISOLang specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISOLangId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOLang r where r.requiredISOLangId = :iSOLangId")
	void deleteByIdIdx(@Param("iSOLangId") short requiredISOLangId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredISO6392Code
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOLang r where r.requiredISO6392Code = :iSO6392Code")
	void deleteByCode3Idx(@Param("iSO6392Code") String requiredISO6392Code);

	/**
	 *	SecureISOLangByCode3IdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOLangByCode3IdxKey of the entity to be locked.
	 */
	default void deleteByCode3Idx(ISecureISOLangByCode3IdxKey key) {
		deleteByCode3Idx(key.getRequiredISO6392Code());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param optionalISO6391Code
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaISOLang r where r.optionalISO6391Code = :iSO6391Code")
	void deleteByCode2Idx(@Param("iSO6391Code") String optionalISO6391Code);

	/**
	 *	SecureISOLangByCode2IdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureISOLangByCode2IdxKey of the entity to be locked.
	 */
	default void deleteByCode2Idx(ISecureISOLangByCode2IdxKey key) {
		deleteByCode2Idx(key.getOptionalISO6391Code());
	}

}

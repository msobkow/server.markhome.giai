// Description: Java 25 Spring JPA Repository for URLProtocol

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
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;

/**
 *	JpaRepository for the IntNetJpaURLProtocol entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface IntNetJpaURLProtocolRepository extends JpaRepository<IntNetJpaURLProtocol, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	IntNetJpaURLProtocol save(IntNetJpaURLProtocol obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredURLProtocolId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from IntNetJpaURLProtocol r where r.requiredURLProtocolId = :uRLProtocolId")
	IntNetJpaURLProtocol get(@Param("uRLProtocolId") int requiredURLProtocolId);

	// IntNetJpaURLProtocol specified index readers

	/**
	 *	Read an entity using the columns of the IntNetURLProtocolByUNameIdxKey as arguments.
	 *
	 *		@param requiredName
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from IntNetJpaURLProtocol r where r.requiredName = :name")
	IntNetJpaURLProtocol findByUNameIdx(@Param("name") String requiredName);

	/**
	 *	IntNetURLProtocolByUNameIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetURLProtocolByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default IntNetJpaURLProtocol findByUNameIdx(IIntNetURLProtocolByUNameIdxKey key) {
		return( findByUNameIdx(key.getRequiredName()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the IntNetURLProtocolByIsSecureIdxKey as arguments.
	 *
	 *		@param requiredIsSecure
	 *
	 *		@return List&lt;IntNetJpaURLProtocol&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from IntNetJpaURLProtocol r where r.requiredIsSecure = :isSecure")
	List<IntNetJpaURLProtocol> findByIsSecureIdx(@Param("isSecure") boolean requiredIsSecure);

	/**
	 *	IntNetURLProtocolByIsSecureIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetURLProtocolByIsSecureIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<IntNetJpaURLProtocol> findByIsSecureIdx(IIntNetURLProtocolByIsSecureIdxKey key) {
		return( findByIsSecureIdx(key.getRequiredIsSecure()));
	}

	// IntNetJpaURLProtocol specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredURLProtocolId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaURLProtocol r where r.requiredURLProtocolId = :uRLProtocolId")
	IntNetJpaURLProtocol lockByIdIdx(@Param("uRLProtocolId") int requiredURLProtocolId);

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaURLProtocol r where r.requiredName = :name")
	IntNetJpaURLProtocol lockByUNameIdx(@Param("name") String requiredName);

	/**
	 *	IntNetURLProtocolByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default IntNetJpaURLProtocol lockByUNameIdx(IIntNetURLProtocolByUNameIdxKey key) {
		return( lockByUNameIdx(key.getRequiredName()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredIsSecure
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaURLProtocol r where r.requiredIsSecure = :isSecure")
	List<IntNetJpaURLProtocol> lockByIsSecureIdx(@Param("isSecure") boolean requiredIsSecure);

	/**
	 *	IntNetURLProtocolByIsSecureIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<IntNetJpaURLProtocol> lockByIsSecureIdx(IIntNetURLProtocolByIsSecureIdxKey key) {
		return( lockByIsSecureIdx(key.getRequiredIsSecure()));
	}

	// IntNetJpaURLProtocol specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredURLProtocolId
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaURLProtocol r where r.requiredURLProtocolId = :uRLProtocolId")
	void deleteByIdIdx(@Param("uRLProtocolId") int requiredURLProtocolId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaURLProtocol r where r.requiredName = :name")
	void deleteByUNameIdx(@Param("name") String requiredName);

	/**
	 *	IntNetURLProtocolByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetURLProtocolByUNameIdxKey of the entity to be locked.
	 */
	default void deleteByUNameIdx(IIntNetURLProtocolByUNameIdxKey key) {
		deleteByUNameIdx(key.getRequiredName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredIsSecure
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaURLProtocol r where r.requiredIsSecure = :isSecure")
	void deleteByIsSecureIdx(@Param("isSecure") boolean requiredIsSecure);

	/**
	 *	IntNetURLProtocolByIsSecureIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetURLProtocolByIsSecureIdxKey of the entity to be locked.
	 */
	default void deleteByIsSecureIdx(IIntNetURLProtocolByIsSecureIdxKey key) {
		deleteByIsSecureIdx(key.getRequiredIsSecure());
	}

}

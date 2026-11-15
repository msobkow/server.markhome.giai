// Description: Java 25 Spring JPA Repository for SubProject

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
 *	JpaRepository for the IntNetJpaSubProject entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface IntNetJpaSubProjectRepository extends JpaRepository<IntNetJpaSubProject, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	IntNetJpaSubProject save(IntNetJpaSubProject obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from IntNetJpaSubProject r where r.requiredId = :id")
	IntNetJpaSubProject get(@Param("id") ICFKeyHash256 requiredId);

	// IntNetJpaSubProject specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the IntNetSubProjectByTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;IntNetJpaSubProject&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from IntNetJpaSubProject r where r.requiredTenantId = :tenantId")
	List<IntNetJpaSubProject> findByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	IntNetSubProjectByTenantIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetSubProjectByTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<IntNetJpaSubProject> findByTenantIdx(IIntNetSubProjectByTenantIdxKey key) {
		return( findByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the IntNetSubProjectByTopProjectIdxKey as arguments.
	 *
	 *		@param requiredTopProjectId
	 *
	 *		@return List&lt;IntNetJpaSubProject&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from IntNetJpaSubProject r where r.requiredContainerParentTPrj.requiredId = :topProjectId")
	List<IntNetJpaSubProject> findByTopProjectIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId);

	/**
	 *	IntNetSubProjectByTopProjectIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetSubProjectByTopProjectIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<IntNetJpaSubProject> findByTopProjectIdx(IIntNetSubProjectByTopProjectIdxKey key) {
		return( findByTopProjectIdx(key.getRequiredTopProjectId()));
	}

	/**
	 *	Read an entity using the columns of the IntNetSubProjectByNameIdxKey as arguments.
	 *
	 *		@param requiredTopProjectId
	 *		@param requiredName
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from IntNetJpaSubProject r where r.requiredContainerParentTPrj.requiredId = :topProjectId and r.requiredName = :name")
	IntNetJpaSubProject findByNameIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId,
		@Param("name") String requiredName);

	/**
	 *	IntNetSubProjectByNameIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetSubProjectByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default IntNetJpaSubProject findByNameIdx(IIntNetSubProjectByNameIdxKey key) {
		return( findByNameIdx(key.getRequiredTopProjectId(), key.getRequiredName()));
	}

	// IntNetJpaSubProject specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaSubProject r where r.requiredId = :id")
	IntNetJpaSubProject lockByIdIdx(@Param("id") ICFKeyHash256 requiredId);

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaSubProject r where r.requiredTenantId = :tenantId")
	List<IntNetJpaSubProject> lockByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	IntNetSubProjectByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<IntNetJpaSubProject> lockByTenantIdx(IIntNetSubProjectByTenantIdxKey key) {
		return( lockByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaSubProject r where r.requiredContainerParentTPrj.requiredId = :topProjectId")
	List<IntNetJpaSubProject> lockByTopProjectIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId);

	/**
	 *	IntNetSubProjectByTopProjectIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<IntNetJpaSubProject> lockByTopProjectIdx(IIntNetSubProjectByTopProjectIdxKey key) {
		return( lockByTopProjectIdx(key.getRequiredTopProjectId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaSubProject r where r.requiredContainerParentTPrj.requiredId = :topProjectId and r.requiredName = :name")
	IntNetJpaSubProject lockByNameIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId,
		@Param("name") String requiredName);

	/**
	 *	IntNetSubProjectByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default IntNetJpaSubProject lockByNameIdx(IIntNetSubProjectByNameIdxKey key) {
		return( lockByNameIdx(key.getRequiredTopProjectId(), key.getRequiredName()));
	}

	// IntNetJpaSubProject specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaSubProject r where r.requiredId = :id")
	void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaSubProject r where r.requiredTenantId = :tenantId")
	void deleteByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	IntNetSubProjectByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetSubProjectByTenantIdxKey of the entity to be locked.
	 */
	default void deleteByTenantIdx(IIntNetSubProjectByTenantIdxKey key) {
		deleteByTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaSubProject r where r.requiredContainerParentTPrj.requiredId = :topProjectId")
	void deleteByTopProjectIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId);

	/**
	 *	IntNetSubProjectByTopProjectIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetSubProjectByTopProjectIdxKey of the entity to be locked.
	 */
	default void deleteByTopProjectIdx(IIntNetSubProjectByTopProjectIdxKey key) {
		deleteByTopProjectIdx(key.getRequiredTopProjectId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopProjectId
	 *		@param requiredName
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaSubProject r where r.requiredContainerParentTPrj.requiredId = :topProjectId and r.requiredName = :name")
	void deleteByNameIdx(@Param("topProjectId") ICFKeyHash256 requiredTopProjectId,
		@Param("name") String requiredName);

	/**
	 *	IntNetSubProjectByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetSubProjectByNameIdxKey of the entity to be locked.
	 */
	default void deleteByNameIdx(IIntNetSubProjectByNameIdxKey key) {
		deleteByNameIdx(key.getRequiredTopProjectId(), key.getRequiredName());
	}

}

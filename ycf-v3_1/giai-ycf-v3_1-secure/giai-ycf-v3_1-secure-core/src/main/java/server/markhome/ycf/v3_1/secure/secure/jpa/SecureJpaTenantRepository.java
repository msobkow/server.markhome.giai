// Description: Java 25 Spring JPA Repository for Tenant

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
 *	JpaRepository for the SecureJpaTenant entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaTenantRepository extends JpaRepository<SecureJpaTenant, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	SecureJpaTenant save(SecureJpaTenant obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaTenant r where r.requiredId = :id")
	SecureJpaTenant get(@Param("id") ICFKeyHash256 requiredId);

	// SecureJpaTenant specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the SecureTenantByClusterIdxKey as arguments.
	 *
	 *		@param requiredClusterId
	 *
	 *		@return List&lt;SecureJpaTenant&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaTenant r where r.requiredContainerCluster.requiredId = :clusterId")
	List<SecureJpaTenant> findByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId);

	/**
	 *	SecureTenantByClusterIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureTenantByClusterIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaTenant> findByClusterIdx(ISecureTenantByClusterIdxKey key) {
		return( findByClusterIdx(key.getRequiredClusterId()));
	}

	/**
	 *	Read an entity using the columns of the SecureTenantByUNameIdxKey as arguments.
	 *
	 *		@param requiredClusterId
	 *		@param requiredTenantName
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaTenant r where r.requiredContainerCluster.requiredId = :clusterId and r.requiredTenantName = :tenantName")
	SecureJpaTenant findByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("tenantName") String requiredTenantName);

	/**
	 *	SecureTenantByUNameIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureTenantByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaTenant findByUNameIdx(ISecureTenantByUNameIdxKey key) {
		return( findByUNameIdx(key.getRequiredClusterId(), key.getRequiredTenantName()));
	}

	// SecureJpaTenant specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaTenant r where r.requiredId = :id")
	SecureJpaTenant lockByIdIdx(@Param("id") ICFKeyHash256 requiredId);

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaTenant r where r.requiredContainerCluster.requiredId = :clusterId")
	List<SecureJpaTenant> lockByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId);

	/**
	 *	SecureTenantByClusterIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaTenant> lockByClusterIdx(ISecureTenantByClusterIdxKey key) {
		return( lockByClusterIdx(key.getRequiredClusterId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 *		@param requiredTenantName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaTenant r where r.requiredContainerCluster.requiredId = :clusterId and r.requiredTenantName = :tenantName")
	SecureJpaTenant lockByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("tenantName") String requiredTenantName);

	/**
	 *	SecureTenantByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaTenant lockByUNameIdx(ISecureTenantByUNameIdxKey key) {
		return( lockByUNameIdx(key.getRequiredClusterId(), key.getRequiredTenantName()));
	}

	// SecureJpaTenant specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaTenant r where r.requiredId = :id")
	void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaTenant r where r.requiredContainerCluster.requiredId = :clusterId")
	void deleteByClusterIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId);

	/**
	 *	SecureTenantByClusterIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureTenantByClusterIdxKey of the entity to be locked.
	 */
	default void deleteByClusterIdx(ISecureTenantByClusterIdxKey key) {
		deleteByClusterIdx(key.getRequiredClusterId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredClusterId
	 *		@param requiredTenantName
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaTenant r where r.requiredContainerCluster.requiredId = :clusterId and r.requiredTenantName = :tenantName")
	void deleteByUNameIdx(@Param("clusterId") ICFKeyHash256 requiredClusterId,
		@Param("tenantName") String requiredTenantName);

	/**
	 *	SecureTenantByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureTenantByUNameIdxKey of the entity to be locked.
	 */
	default void deleteByUNameIdx(ISecureTenantByUNameIdxKey key) {
		deleteByUNameIdx(key.getRequiredClusterId(), key.getRequiredTenantName());
	}

}

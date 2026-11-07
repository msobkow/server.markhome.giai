// Description: Java 25 Spring JPA Repository for SecTentRole

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
 *	JpaRepository for the SecureJpaSecTentRole entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaSecTentRoleRepository extends JpaRepository<SecureJpaSecTentRole, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	SecureJpaSecTentRole save(SecureJpaSecTentRole obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecTentRoleId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecTentRole r where r.requiredSecTentRoleId = :secTentRoleId")
	SecureJpaSecTentRole get(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId);

	// SecureJpaSecTentRole specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecTentRoleByTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;SecureJpaSecTentRole&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecTentRole r where r.requiredOwnerTenant.requiredId = :tenantId")
	List<SecureJpaSecTentRole> findByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	SecureSecTentRoleByTenantIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecTentRoleByTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecTentRole> findByTenantIdx(ISecureSecTentRoleByTenantIdxKey key) {
		return( findByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecTentRoleByNameIdxKey as arguments.
	 *
	 *		@param requiredName
	 *
	 *		@return List&lt;SecureJpaSecTentRole&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecTentRole r where r.requiredContainerSysRole.requiredName = :name")
	List<SecureJpaSecTentRole> findByNameIdx(@Param("name") String requiredName);

	/**
	 *	SecureSecTentRoleByNameIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecTentRoleByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecTentRole> findByNameIdx(ISecureSecTentRoleByNameIdxKey key) {
		return( findByNameIdx(key.getRequiredName()));
	}

	/**
	 *	Read an entity using the columns of the SecureSecTentRoleByUNameIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *		@param requiredName
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecTentRole r where r.requiredOwnerTenant.requiredId = :tenantId and r.requiredContainerSysRole.requiredName = :name")
	SecureJpaSecTentRole findByUNameIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId,
		@Param("name") String requiredName);

	/**
	 *	SecureSecTentRoleByUNameIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecTentRoleByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecTentRole findByUNameIdx(ISecureSecTentRoleByUNameIdxKey key) {
		return( findByUNameIdx(key.getRequiredTenantId(), key.getRequiredName()));
	}

	// SecureJpaSecTentRole specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentRoleId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecTentRole r where r.requiredSecTentRoleId = :secTentRoleId")
	SecureJpaSecTentRole lockByIdIdx(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId);

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecTentRole r where r.requiredOwnerTenant.requiredId = :tenantId")
	List<SecureJpaSecTentRole> lockByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	SecureSecTentRoleByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecTentRole> lockByTenantIdx(ISecureSecTentRoleByTenantIdxKey key) {
		return( lockByTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecTentRole r where r.requiredContainerSysRole.requiredName = :name")
	List<SecureJpaSecTentRole> lockByNameIdx(@Param("name") String requiredName);

	/**
	 *	SecureSecTentRoleByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecTentRole> lockByNameIdx(ISecureSecTentRoleByNameIdxKey key) {
		return( lockByNameIdx(key.getRequiredName()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecTentRole r where r.requiredOwnerTenant.requiredId = :tenantId and r.requiredContainerSysRole.requiredName = :name")
	SecureJpaSecTentRole lockByUNameIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId,
		@Param("name") String requiredName);

	/**
	 *	SecureSecTentRoleByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecTentRole lockByUNameIdx(ISecureSecTentRoleByUNameIdxKey key) {
		return( lockByUNameIdx(key.getRequiredTenantId(), key.getRequiredName()));
	}

	// SecureJpaSecTentRole specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecTentRoleId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecTentRole r where r.requiredSecTentRoleId = :secTentRoleId")
	void deleteByIdIdx(@Param("secTentRoleId") ICFKeyHash256 requiredSecTentRoleId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecTentRole r where r.requiredOwnerTenant.requiredId = :tenantId")
	void deleteByTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	SecureSecTentRoleByTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecTentRoleByTenantIdxKey of the entity to be locked.
	 */
	default void deleteByTenantIdx(ISecureSecTentRoleByTenantIdxKey key) {
		deleteByTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredName
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecTentRole r where r.requiredContainerSysRole.requiredName = :name")
	void deleteByNameIdx(@Param("name") String requiredName);

	/**
	 *	SecureSecTentRoleByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecTentRoleByNameIdxKey of the entity to be locked.
	 */
	default void deleteByNameIdx(ISecureSecTentRoleByNameIdxKey key) {
		deleteByNameIdx(key.getRequiredName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *		@param requiredName
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecTentRole r where r.requiredOwnerTenant.requiredId = :tenantId and r.requiredContainerSysRole.requiredName = :name")
	void deleteByUNameIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId,
		@Param("name") String requiredName);

	/**
	 *	SecureSecTentRoleByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecTentRoleByUNameIdxKey of the entity to be locked.
	 */
	default void deleteByUNameIdx(ISecureSecTentRoleByUNameIdxKey key) {
		deleteByUNameIdx(key.getRequiredTenantId(), key.getRequiredName());
	}

}

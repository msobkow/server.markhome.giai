// Description: Java 25 Spring JPA Repository for SecClusRoleMemb

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
 *	JpaRepository for the SecureJpaSecClusRoleMemb entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaSecClusRoleMembRepository extends JpaRepository<SecureJpaSecClusRoleMemb, SecureJpaSecClusRoleMembPKey> {

	@Transactional
	@Modifying
	SecureJpaSecClusRoleMemb save(SecureJpaSecClusRoleMemb obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecClusRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecClusRoleMemb r where r.requiredContainerRole.requiredSecClusRoleId = :secClusRoleId and r.requiredParentUser.requiredLoginId = :loginId")
	SecureJpaSecClusRoleMemb get(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId,
		@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecClusRoleMembPKey based read method for object-cored access.
	 *
	 *		@param key The key of the entity to be read.
	 *
	 *		@return The entity read, usually from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecClusRoleMemb get(ISecureSecClusRoleMembPKey key) {
		return( get(key.getRequiredSecClusRoleId(), key.getRequiredLoginId()));
	}

	// SecureJpaSecClusRoleMemb specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecClusRoleMembByClusRoleIdxKey as arguments.
	 *
	 *		@param requiredSecClusRoleId
	 *
	 *		@return List&lt;SecureJpaSecClusRoleMemb&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecClusRoleMemb r where r.requiredContainerRole.requiredSecClusRoleId = :secClusRoleId")
	List<SecureJpaSecClusRoleMemb> findByClusRoleIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId);

	/**
	 *	SecureSecClusRoleMembByClusRoleIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecClusRoleMembByClusRoleIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecClusRoleMemb> findByClusRoleIdx(ISecureSecClusRoleMembByClusRoleIdxKey key) {
		return( findByClusRoleIdx(key.getRequiredSecClusRoleId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecClusRoleMembByLoginIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return List&lt;SecureJpaSecClusRoleMemb&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecClusRoleMemb r where r.requiredParentUser.requiredLoginId = :loginId")
	List<SecureJpaSecClusRoleMemb> findByLoginIdx(@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecClusRoleMembByLoginIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecClusRoleMembByLoginIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecClusRoleMemb> findByLoginIdx(ISecureSecClusRoleMembByLoginIdxKey key) {
		return( findByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureJpaSecClusRoleMemb specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecClusRoleMemb r where r.requiredContainerRole.requiredSecClusRoleId = :secClusRoleId and r.requiredParentUser.requiredLoginId = :loginId")
	SecureJpaSecClusRoleMemb lockByIdIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId,
		@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecClusRoleMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecClusRoleMemb lockByIdIdx(ISecureSecClusRoleMembPKey key) {
		return( lockByIdIdx(key.getRequiredSecClusRoleId(), key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecClusRoleMemb r where r.requiredContainerRole.requiredSecClusRoleId = :secClusRoleId")
	List<SecureJpaSecClusRoleMemb> lockByClusRoleIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId);

	/**
	 *	SecureSecClusRoleMembByClusRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecClusRoleMemb> lockByClusRoleIdx(ISecureSecClusRoleMembByClusRoleIdxKey key) {
		return( lockByClusRoleIdx(key.getRequiredSecClusRoleId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecClusRoleMemb r where r.requiredParentUser.requiredLoginId = :loginId")
	List<SecureJpaSecClusRoleMemb> lockByLoginIdx(@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecClusRoleMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecClusRoleMemb> lockByLoginIdx(ISecureSecClusRoleMembByLoginIdxKey key) {
		return( lockByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureJpaSecClusRoleMemb specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 *		@param requiredLoginId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecClusRoleMemb r where r.requiredContainerRole.requiredSecClusRoleId = :secClusRoleId and r.requiredParentUser.requiredLoginId = :loginId")
	void deleteByIdIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId,
		@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecClusRoleMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecClusRoleMembByIdIdxKey of the entity to be locked.
	 */
	default void deleteByIdIdx(ISecureSecClusRoleMembPKey key) {
		deleteByIdIdx(key.getRequiredSecClusRoleId(), key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecClusRoleId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecClusRoleMemb r where r.requiredContainerRole.requiredSecClusRoleId = :secClusRoleId")
	void deleteByClusRoleIdx(@Param("secClusRoleId") ICFKeyHash256 requiredSecClusRoleId);

	/**
	 *	SecureSecClusRoleMembByClusRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecClusRoleMembByClusRoleIdxKey of the entity to be locked.
	 */
	default void deleteByClusRoleIdx(ISecureSecClusRoleMembByClusRoleIdxKey key) {
		deleteByClusRoleIdx(key.getRequiredSecClusRoleId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecClusRoleMemb r where r.requiredParentUser.requiredLoginId = :loginId")
	void deleteByLoginIdx(@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecClusRoleMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecClusRoleMembByLoginIdxKey of the entity to be locked.
	 */
	default void deleteByLoginIdx(ISecureSecClusRoleMembByLoginIdxKey key) {
		deleteByLoginIdx(key.getRequiredLoginId());
	}

}

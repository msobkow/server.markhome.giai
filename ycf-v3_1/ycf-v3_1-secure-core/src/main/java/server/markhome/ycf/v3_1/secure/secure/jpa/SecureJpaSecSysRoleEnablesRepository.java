// Description: Java 25 Spring JPA Repository for SecSysRoleEnables

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
 *	JpaRepository for the SecureJpaSecSysRoleEnables entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaSecSysRoleEnablesRepository extends JpaRepository<SecureJpaSecSysRoleEnables, SecureJpaSecSysRoleEnablesPKey> {

	@Transactional
	@Modifying
	SecureJpaSecSysRoleEnables save(SecureJpaSecSysRoleEnables obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredEnableName
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecSysRoleEnables r where r.requiredContainerSysRole.requiredSecSysRoleId = :secSysRoleId and r.requiredParentEnableGroup.requiredName = :enableName")
	SecureJpaSecSysRoleEnables get(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("enableName") String requiredEnableName);

	/**
	 *	SecureSecSysRoleEnablesPKey based read method for object-cored access.
	 *
	 *		@param key The key of the entity to be read.
	 *
	 *		@return The entity read, usually from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecSysRoleEnables get(ISecureSecSysRoleEnablesPKey key) {
		return( get(key.getRequiredSecSysRoleId(), key.getRequiredEnableName()));
	}

	// SecureJpaSecSysRoleEnables specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecSysRoleEnablesBySysRoleIdxKey as arguments.
	 *
	 *		@param requiredSecSysRoleId
	 *
	 *		@return List&lt;SecureJpaSecSysRoleEnables&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecSysRoleEnables r where r.requiredContainerSysRole.requiredSecSysRoleId = :secSysRoleId")
	List<SecureJpaSecSysRoleEnables> findBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId);

	/**
	 *	SecureSecSysRoleEnablesBySysRoleIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecSysRoleEnablesBySysRoleIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecSysRoleEnables> findBySysRoleIdx(ISecureSecSysRoleEnablesBySysRoleIdxKey key) {
		return( findBySysRoleIdx(key.getRequiredSecSysRoleId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecSysRoleEnablesByNameIdxKey as arguments.
	 *
	 *		@param requiredEnableName
	 *
	 *		@return List&lt;SecureJpaSecSysRoleEnables&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecSysRoleEnables r where r.requiredParentEnableGroup.requiredName = :enableName")
	List<SecureJpaSecSysRoleEnables> findByNameIdx(@Param("enableName") String requiredEnableName);

	/**
	 *	SecureSecSysRoleEnablesByNameIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecSysRoleEnablesByNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecSysRoleEnables> findByNameIdx(ISecureSecSysRoleEnablesByNameIdxKey key) {
		return( findByNameIdx(key.getRequiredEnableName()));
	}

	// SecureJpaSecSysRoleEnables specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredEnableName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecSysRoleEnables r where r.requiredContainerSysRole.requiredSecSysRoleId = :secSysRoleId and r.requiredParentEnableGroup.requiredName = :enableName")
	SecureJpaSecSysRoleEnables lockByIdIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("enableName") String requiredEnableName);

	/**
	 *	SecureSecSysRoleEnablesByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecSysRoleEnables lockByIdIdx(ISecureSecSysRoleEnablesPKey key) {
		return( lockByIdIdx(key.getRequiredSecSysRoleId(), key.getRequiredEnableName()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecSysRoleEnables r where r.requiredContainerSysRole.requiredSecSysRoleId = :secSysRoleId")
	List<SecureJpaSecSysRoleEnables> lockBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId);

	/**
	 *	SecureSecSysRoleEnablesBySysRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecSysRoleEnables> lockBySysRoleIdx(ISecureSecSysRoleEnablesBySysRoleIdxKey key) {
		return( lockBySysRoleIdx(key.getRequiredSecSysRoleId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEnableName
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecSysRoleEnables r where r.requiredParentEnableGroup.requiredName = :enableName")
	List<SecureJpaSecSysRoleEnables> lockByNameIdx(@Param("enableName") String requiredEnableName);

	/**
	 *	SecureSecSysRoleEnablesByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecSysRoleEnables> lockByNameIdx(ISecureSecSysRoleEnablesByNameIdxKey key) {
		return( lockByNameIdx(key.getRequiredEnableName()));
	}

	// SecureJpaSecSysRoleEnables specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 *		@param requiredEnableName
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecSysRoleEnables r where r.requiredContainerSysRole.requiredSecSysRoleId = :secSysRoleId and r.requiredParentEnableGroup.requiredName = :enableName")
	void deleteByIdIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId,
		@Param("enableName") String requiredEnableName);

	/**
	 *	SecureSecSysRoleEnablesByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecSysRoleEnablesByIdIdxKey of the entity to be locked.
	 */
	default void deleteByIdIdx(ISecureSecSysRoleEnablesPKey key) {
		deleteByIdIdx(key.getRequiredSecSysRoleId(), key.getRequiredEnableName());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysRoleId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecSysRoleEnables r where r.requiredContainerSysRole.requiredSecSysRoleId = :secSysRoleId")
	void deleteBySysRoleIdx(@Param("secSysRoleId") ICFKeyHash256 requiredSecSysRoleId);

	/**
	 *	SecureSecSysRoleEnablesBySysRoleIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecSysRoleEnablesBySysRoleIdxKey of the entity to be locked.
	 */
	default void deleteBySysRoleIdx(ISecureSecSysRoleEnablesBySysRoleIdxKey key) {
		deleteBySysRoleIdx(key.getRequiredSecSysRoleId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredEnableName
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecSysRoleEnables r where r.requiredParentEnableGroup.requiredName = :enableName")
	void deleteByNameIdx(@Param("enableName") String requiredEnableName);

	/**
	 *	SecureSecSysRoleEnablesByNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecSysRoleEnablesByNameIdxKey of the entity to be locked.
	 */
	default void deleteByNameIdx(ISecureSecSysRoleEnablesByNameIdxKey key) {
		deleteByNameIdx(key.getRequiredEnableName());
	}

}

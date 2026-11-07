// Description: Java 25 Spring JPA Repository for SecSysGrpMemb

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
 *	JpaRepository for the SecureJpaSecSysGrpMemb entities defined in server.markhome.ycf.v3_1.secure.secure.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface SecureJpaSecSysGrpMembRepository extends JpaRepository<SecureJpaSecSysGrpMemb, SecureJpaSecSysGrpMembPKey> {

	@Transactional
	@Modifying
	SecureJpaSecSysGrpMemb save(SecureJpaSecSysGrpMemb obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredSecSysGrpId
	 *		@param requiredLoginId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from SecureJpaSecSysGrpMemb r where r.requiredContainerGroup.requiredSecSysGrpId = :secSysGrpId and r.requiredParentUser.requiredLoginId = :loginId")
	SecureJpaSecSysGrpMemb get(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId,
		@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecSysGrpMembPKey based read method for object-cored access.
	 *
	 *		@param key The key of the entity to be read.
	 *
	 *		@return The entity read, usually from the JPA cache, or null if no such entity exists.
	 */
	default SecureJpaSecSysGrpMemb get(ISecureSecSysGrpMembPKey key) {
		return( get(key.getRequiredSecSysGrpId(), key.getRequiredLoginId()));
	}

	// SecureJpaSecSysGrpMemb specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecSysGrpMembBySysGrpIdxKey as arguments.
	 *
	 *		@param requiredSecSysGrpId
	 *
	 *		@return List&lt;SecureJpaSecSysGrpMemb&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecSysGrpMemb r where r.requiredContainerGroup.requiredSecSysGrpId = :secSysGrpId")
	List<SecureJpaSecSysGrpMemb> findBySysGrpIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId);

	/**
	 *	SecureSecSysGrpMembBySysGrpIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecSysGrpMembBySysGrpIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecSysGrpMemb> findBySysGrpIdx(ISecureSecSysGrpMembBySysGrpIdxKey key) {
		return( findBySysGrpIdx(key.getRequiredSecSysGrpId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the SecureSecSysGrpMembByLoginIdxKey as arguments.
	 *
	 *		@param requiredLoginId
	 *
	 *		@return List&lt;SecureJpaSecSysGrpMemb&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from SecureJpaSecSysGrpMemb r where r.requiredParentUser.requiredLoginId = :loginId")
	List<SecureJpaSecSysGrpMemb> findByLoginIdx(@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecSysGrpMembByLoginIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The SecureSecSysGrpMembByLoginIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<SecureJpaSecSysGrpMemb> findByLoginIdx(ISecureSecSysGrpMembByLoginIdxKey key) {
		return( findByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureJpaSecSysGrpMemb specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 *		@param requiredLoginId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecSysGrpMemb r where r.requiredContainerGroup.requiredSecSysGrpId = :secSysGrpId and r.requiredParentUser.requiredLoginId = :loginId")
	SecureJpaSecSysGrpMemb lockByIdIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId,
		@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecSysGrpMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default SecureJpaSecSysGrpMemb lockByIdIdx(ISecureSecSysGrpMembPKey key) {
		return( lockByIdIdx(key.getRequiredSecSysGrpId(), key.getRequiredLoginId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from SecureJpaSecSysGrpMemb r where r.requiredContainerGroup.requiredSecSysGrpId = :secSysGrpId")
	List<SecureJpaSecSysGrpMemb> lockBySysGrpIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId);

	/**
	 *	SecureSecSysGrpMembBySysGrpIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecSysGrpMemb> lockBySysGrpIdx(ISecureSecSysGrpMembBySysGrpIdxKey key) {
		return( lockBySysGrpIdx(key.getRequiredSecSysGrpId()));
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
	@Query("select r from SecureJpaSecSysGrpMemb r where r.requiredParentUser.requiredLoginId = :loginId")
	List<SecureJpaSecSysGrpMemb> lockByLoginIdx(@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecSysGrpMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<SecureJpaSecSysGrpMemb> lockByLoginIdx(ISecureSecSysGrpMembByLoginIdxKey key) {
		return( lockByLoginIdx(key.getRequiredLoginId()));
	}

	// SecureJpaSecSysGrpMemb specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 *		@param requiredLoginId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecSysGrpMemb r where r.requiredContainerGroup.requiredSecSysGrpId = :secSysGrpId and r.requiredParentUser.requiredLoginId = :loginId")
	void deleteByIdIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId,
		@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecSysGrpMembByIdIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecSysGrpMembByIdIdxKey of the entity to be locked.
	 */
	default void deleteByIdIdx(ISecureSecSysGrpMembPKey key) {
		deleteByIdIdx(key.getRequiredSecSysGrpId(), key.getRequiredLoginId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredSecSysGrpId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecSysGrpMemb r where r.requiredContainerGroup.requiredSecSysGrpId = :secSysGrpId")
	void deleteBySysGrpIdx(@Param("secSysGrpId") ICFKeyHash256 requiredSecSysGrpId);

	/**
	 *	SecureSecSysGrpMembBySysGrpIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecSysGrpMembBySysGrpIdxKey of the entity to be locked.
	 */
	default void deleteBySysGrpIdx(ISecureSecSysGrpMembBySysGrpIdxKey key) {
		deleteBySysGrpIdx(key.getRequiredSecSysGrpId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredLoginId
	 */
	@Transactional
	@Modifying
	@Query("delete from SecureJpaSecSysGrpMemb r where r.requiredParentUser.requiredLoginId = :loginId")
	void deleteByLoginIdx(@Param("loginId") String requiredLoginId);

	/**
	 *	SecureSecSysGrpMembByLoginIdxKey based lock method for object-cored access.
	 *
	 *		@param key The SecureSecSysGrpMembByLoginIdxKey of the entity to be locked.
	 */
	default void deleteByLoginIdx(ISecureSecSysGrpMembByLoginIdxKey key) {
		deleteByLoginIdx(key.getRequiredLoginId());
	}

}

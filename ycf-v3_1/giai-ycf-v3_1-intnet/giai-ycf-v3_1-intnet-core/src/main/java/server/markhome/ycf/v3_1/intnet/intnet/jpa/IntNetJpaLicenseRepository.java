// Description: Java 25 Spring JPA Repository for License

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
 *	JpaRepository for the IntNetJpaLicense entities defined in server.markhome.ycf.v3_1.intnet.intnet.jpa.
 *	The manufactured repositories try to provide a rich, do-it-all interface to the JPA data store, with both object and argument-cored implementations of the interface defined.
 */
@Transactional(readOnly = true)
public interface IntNetJpaLicenseRepository extends JpaRepository<IntNetJpaLicense, $implCommaIJavaOptAtomType$> {

	@Transactional
	@Modifying
	IntNetJpaLicense save(IntNetJpaLicense obj);

	/**
	 *	Argument-cored get database instance for compatibility with the current MSS code factory code base.
	 *
	 *		@param requiredId
	 *
	 *		@return The retrieved entity, usually from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from IntNetJpaLicense r where r.requiredId = :id")
	IntNetJpaLicense get(@Param("id") ICFKeyHash256 requiredId);

	// IntNetJpaLicense specified index readers

	/**
	 *	Read zero or more entities into a List using the columns of the IntNetLicenseByLicnTenantIdxKey as arguments.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return List&lt;IntNetJpaLicense&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from IntNetJpaLicense r where r.requiredTenantId = :tenantId")
	List<IntNetJpaLicense> findByLicnTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	IntNetLicenseByLicnTenantIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetLicenseByLicnTenantIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<IntNetJpaLicense> findByLicnTenantIdx(IIntNetLicenseByLicnTenantIdxKey key) {
		return( findByLicnTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Read zero or more entities into a List using the columns of the IntNetLicenseByDomainIdxKey as arguments.
	 *
	 *		@param requiredTopDomainId
	 *
	 *		@return List&lt;IntNetJpaLicense&gt; of the found entities, typically from the JPA cache, or an empty list if no such entities exist.
	 */
	@Query("select r from IntNetJpaLicense r where r.requiredContainerTopDomain.requiredId = :topDomainId")
	List<IntNetJpaLicense> findByDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId);

	/**
	 *	IntNetLicenseByDomainIdxKey entity list reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetLicenseByDomainIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity list, which may be empty, typically populated from the JPA cache.
	 */
	default List<IntNetJpaLicense> findByDomainIdx(IIntNetLicenseByDomainIdxKey key) {
		return( findByDomainIdx(key.getRequiredTopDomainId()));
	}

	/**
	 *	Read an entity using the columns of the IntNetLicenseByUNameIdxKey as arguments.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	@Query("select r from IntNetJpaLicense r where r.requiredContainerTopDomain.requiredId = :topDomainId and r.requiredName = :name")
	IntNetJpaLicense findByUNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName);

	/**
	 *	IntNetLicenseByUNameIdxKey entity reader convenience method for object-cored access.
	 *
	 *		@param key The IntNetLicenseByUNameIdxKey instance to use for the query arguments.
	 *
	 *		@return The found entity, typically from the JPA cache, or null if no such entity exists.
	 */
	default IntNetJpaLicense findByUNameIdx(IIntNetLicenseByUNameIdxKey key) {
		return( findByUNameIdx(key.getRequiredTopDomainId(), key.getRequiredName()));
	}

	// IntNetJpaLicense specified delete-by-index methods

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaLicense r where r.requiredId = :id")
	IntNetJpaLicense lockByIdIdx(@Param("id") ICFKeyHash256 requiredId);

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaLicense r where r.requiredTenantId = :tenantId")
	List<IntNetJpaLicense> lockByLicnTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	IntNetLicenseByLicnTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<IntNetJpaLicense> lockByLicnTenantIdx(IIntNetLicenseByLicnTenantIdxKey key) {
		return( lockByLicnTenantIdx(key.getRequiredTenantId()));
	}

	/**
	 *	Argument-cored lock database instance for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaLicense r where r.requiredContainerTopDomain.requiredId = :topDomainId")
	List<IntNetJpaLicense> lockByDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId);

	/**
	 *	IntNetLicenseByDomainIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return A list of locked entities, refreshed from the data store, or an empty list if no such entities exist.
	 */
	default List<IntNetJpaLicense> lockByDomainIdx(IIntNetLicenseByDomainIdxKey key) {
		return( lockByDomainIdx(key.getRequiredTopDomainId()));
	}

	/**
	 *	Argument-cored lock database entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity locks, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	@Transactional
	@Lock(LockModeType.WRITE)
	@Query("select r from IntNetJpaLicense r where r.requiredContainerTopDomain.requiredId = :topDomainId and r.requiredName = :name")
	IntNetJpaLicense lockByUNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName);

	/**
	 *	IntNetLicenseByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The key of the entity to be locked.
	 *
	 *		@return The locked entity, refreshed from the data store, or null if no such entity exists.
	 */
	default IntNetJpaLicense lockByUNameIdx(IIntNetLicenseByUNameIdxKey key) {
		return( lockByUNameIdx(key.getRequiredTopDomainId(), key.getRequiredName()));
	}

	// IntNetJpaLicense specified delete-by-index methods

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredId
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaLicense r where r.requiredId = :id")
	void deleteByIdIdx(@Param("id") ICFKeyHash256 requiredId);

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTenantId
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaLicense r where r.requiredTenantId = :tenantId")
	void deleteByLicnTenantIdx(@Param("tenantId") ICFKeyHash256 requiredTenantId);

	/**
	 *	IntNetLicenseByLicnTenantIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetLicenseByLicnTenantIdxKey of the entity to be locked.
	 */
	default void deleteByLicnTenantIdx(IIntNetLicenseByLicnTenantIdxKey key) {
		deleteByLicnTenantIdx(key.getRequiredTenantId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaLicense r where r.requiredContainerTopDomain.requiredId = :topDomainId")
	void deleteByDomainIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId);

	/**
	 *	IntNetLicenseByDomainIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetLicenseByDomainIdxKey of the entity to be locked.
	 */
	default void deleteByDomainIdx(IIntNetLicenseByDomainIdxKey key) {
		deleteByDomainIdx(key.getRequiredTopDomainId());
	}

	/**
	 *	Argument-cored delete entity for compatibility with the current MSS code factory code base, uses @Transactional to acquire a JPA entity lock, which may or may not imply an actual database lock during the transaction.
	 *
	 *		@param requiredTopDomainId
	 *		@param requiredName
	 */
	@Transactional
	@Modifying
	@Query("delete from IntNetJpaLicense r where r.requiredContainerTopDomain.requiredId = :topDomainId and r.requiredName = :name")
	void deleteByUNameIdx(@Param("topDomainId") ICFKeyHash256 requiredTopDomainId,
		@Param("name") String requiredName);

	/**
	 *	IntNetLicenseByUNameIdxKey based lock method for object-cored access.
	 *
	 *		@param key The IntNetLicenseByUNameIdxKey of the entity to be locked.
	 */
	default void deleteByUNameIdx(IIntNetLicenseByUNameIdxKey key) {
		deleteByUNameIdx(key.getRequiredTopDomainId(), key.getRequiredName());
	}

}

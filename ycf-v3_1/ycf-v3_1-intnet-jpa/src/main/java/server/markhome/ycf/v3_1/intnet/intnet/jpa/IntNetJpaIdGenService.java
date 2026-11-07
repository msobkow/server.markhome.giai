// Description: Java 25 Spring JPA Id Generator Service for IntNet

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;

/**
 *	Service for the IntNetId generation methods defined in server.markhome.ycf.v3_1.intnet.intnet application model.
 */
@Service("IntNet31JpaIdGenService")
public class IntNetJpaIdGenService {

    @Autowired
    @Qualifier("intnet31EntityManagerFactory")
    private LocalContainerEntityManagerFactoryBean intnetEntityManagerFactory;

	/**
	 *	Generate a MajorVersionIdGen CFDbKeyHash256 id.
	 *
	 *		@return A cryptographically-random generated CFDBKeyHash128 value
	 */
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	public CFDbKeyHash256 generateMajorVersionIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	*	Generate a MimeTypeIdGen integer id.
	*
	*		@return The next integer value for the MimeTypeIdGen type.
	*/
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	@SequenceGenerator(name = "MimeTypeIdGenSeq", allocationSize = 1, initialValue = 0, schema = "BusModel31")
	public int generateMimeTypeIdGen() {
		throw new CFNotImplementedYetException( getClass(), "generateMimeTypeIdGen" );
	}

	/**
	 *	Generate a MinorVersionIdGen CFDbKeyHash256 id.
	 *
	 *		@return A cryptographically-random generated CFDBKeyHash128 value
	 */
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	public CFDbKeyHash256 generateMinorVersionIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Generate a SubProjectIdGen CFDbKeyHash256 id.
	 *
	 *		@return A cryptographically-random generated CFDBKeyHash128 value
	 */
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	public CFDbKeyHash256 generateSubProjectIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Generate a TldIdGen CFDbKeyHash256 id.
	 *
	 *		@return A cryptographically-random generated CFDBKeyHash128 value
	 */
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	public CFDbKeyHash256 generateTldIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Generate a TopDomainIdGen CFDbKeyHash256 id.
	 *
	 *		@return A cryptographically-random generated CFDBKeyHash128 value
	 */
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	public CFDbKeyHash256 generateTopDomainIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	 *	Generate a TopProjectIdGen CFDbKeyHash256 id.
	 *
	 *		@return A cryptographically-random generated CFDBKeyHash128 value
	 */
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	public CFDbKeyHash256 generateTopProjectIdGen() {
		return( new CFDbKeyHash256(0) );
	}

	/**
	*	Generate a URLProtocolIdGen integer id.
	*
	*		@return The next integer value for the URLProtocolIdGen type.
	*/
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	@SequenceGenerator(name = "URLProtoIdGenSeq", allocationSize = 1, initialValue = 0, schema = "BusModel31")
	public int generateURLProtocolIdGen() {
		throw new CFNotImplementedYetException( getClass(), "generateURLProtocolIdGen" );
	}

	/**
	 *	Generate a LicenseIdGen CFDbKeyHash256 id.
	 *
	 *		@return A cryptographically-random generated CFDBKeyHash128 value
	 */
	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnetTransactionManager")
	public CFDbKeyHash256 generateLicenseIdGen() {
		return( new CFDbKeyHash256(0) );
	}

}

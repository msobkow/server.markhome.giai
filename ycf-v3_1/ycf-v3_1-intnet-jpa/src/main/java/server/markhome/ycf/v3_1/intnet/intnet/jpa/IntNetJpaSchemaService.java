// Description: Java 25 Spring JPA Service for IntNet

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
import java.net.InetAddress;
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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.secure.secure.jpa.*;
import server.markhome.ycf.v3_1.intnet.intnet.jpa.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

/**
 *	Services for schema IntNet defined in server.markhome.ycf.v3_1.intnet.intnet.jpa
 *	using the IntNet*Repository objects to access the data directly, bypassing normal application security for the bootstrap and login processing.
 */
@Service("intnet31JpaSchemaService")
public class IntNetJpaSchemaService {

	@Autowired
	@Qualifier("intnet31EntityManagerFactory")
	private LocalContainerEntityManagerFactoryBean intnet31EntityManagerFactory;
	@Autowired
	private IntNetJpaLicenseService licenseService;

	@Autowired
	private IntNetJpaMajorVersionService majorversionService;

	@Autowired
	private IntNetJpaMimeTypeService mimetypeService;

	@Autowired
	private IntNetJpaMinorVersionService minorversionService;

	@Autowired
	private IntNetJpaSubProjectService subprojectService;

	@Autowired
	private IntNetJpaTldService tldService;

	@Autowired
	private IntNetJpaTopDomainService topdomainService;

	@Autowired
	private IntNetJpaTopProjectService topprojectService;

	@Autowired
	private IntNetJpaURLProtocolService urlprotocolService;


	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "intnet31TransactionManager")
	public void bootstrapSchema(SecurePubTableData tableData[]) {
		ISecureSchema.getBackingSecure().bootstrapSchema(tableData);
	}

	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void bootstrapAllTablesSecurity(SecurePubTableData tableData[]) {
		bootstrapAllTablesSecurity(ISecureSchema.getSysClusterId(), ISecureSchema.getSysTenantId(), tableData);
	}

	@Transactional(propagation = Propagation.MANDATORY, noRollbackFor = NoResultException.class, transactionManager = "secure31TransactionManager")
	public void bootstrapAllTablesSecurity(CFDbKeyHash256 clusterId, CFDbKeyHash256 tenantId, SecurePubTableData tableData[]) {
		ISecureSchema.getBackingSecure().bootstrapAllTablesSecurity(clusterId, tenantId, tableData);
	}


		// Customized schematweak [Secure::IntNet].JpaSchemaServiceCustomServices
}

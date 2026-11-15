// Description: Java 25 Buffer Hooks for Secure

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

package server.markhome.ycf.v3_1.secure.secure.buff;

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
import org.springframework.stereotype.Service;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;

/**
 *	Hooks for schema Secure Spring resources that need to be used by getter-wrappers for AtomicReference members of the multi-threaded wedge between Spring resources and POJO code.
 *	This implementation wraps the Spring singletons instantiated during Spring's boot process for the server.markhome.ycf.v3_1.secure.secure.buff package.  It resolves all known standard Spring resources for the LocalContainerEntityManagerFactoryBean, SchemaService, IdGenService, and the Secure*Repository and Secure*Service singletons that the POJOs need to invoke.  However, it relies on late-initialization during dynamic instance creation (i.e. new SecureBuffSchemaHooks()) instead of being initialized as a Spring singleton. As the Spring instance hierarchy is instantiated before any instances of this class are instantiated, the net result bridges the gap between POJO and Buffer.
 */
@Service("secure31BuffHooksSchema")
public class SecureBuffHooksSchema {

//	@Autowired
//	@Qualifier("secure31BuffSchemaService")
//	private SecureBuffSchemaService schemaService;

	@Autowired
	@Qualifier("secure31BuffFactory")
	private SecureBuffFactoryService factoryService;

//	@Autowired
//	@Qualifier("Secure31BuffIdGenService")
//	private SecureBuffIdGenService idGenService;

	public SecureBuffFactoryService getFactoryService() {
		if ( factoryService == null ) {
			// Dynamically resolve the factory by qualifier name
			throw new CFNotImplementedYetException( getClass(), "getFactoryService",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either",
				"ERROR - do not know how to dynamically resolve Spring beans from POJO code yet and AspectJ did not resolve it either" );
		}
		return( factoryService );
	}
}

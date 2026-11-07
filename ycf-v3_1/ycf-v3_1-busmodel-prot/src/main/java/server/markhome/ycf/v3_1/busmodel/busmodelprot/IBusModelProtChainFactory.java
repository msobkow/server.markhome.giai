
// Description: Java Protected Factory interface for Chain.

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

package server.markhome.ycf.v3_1.busmodel.busmodelprot;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/*
 *	IBusModelProtChainFactory protected interface for Chain
 */
public interface IBusModelProtChainFactory extends IBusModelPubChainFactory
{

	/**
	 *	Allocate a protected primary history key for Chain instances.
	 *
	 *	@return	The new instance.
	 */
	IBusModelProtChainHPKey newProtHPKey();

	/**
	 *	Allocate a public primary history key for Chain instances from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	IBusModelPubChainHPKey asPublic(IBusModelProtChainHPKey src);

	/**
	 *	Allocate a protected ChainTableIdx key over protected Chain instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtChainByChainTableIdxKey newProtByChainTableIdxKey();

	/**
	 *	Allocate a public ChainTableIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubChainByChainTableIdxKey asPublic(IBusModelProtChainByChainTableIdxKey src);

	/**
	 *	Allocate a protected DefSchemaIdx key over protected Chain instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtChainByDefSchemaIdxKey newProtByDefSchemaIdxKey();

	/**
	 *	Allocate a public DefSchemaIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubChainByDefSchemaIdxKey asPublic(IBusModelProtChainByDefSchemaIdxKey src);

	/**
	 *	Allocate a protected UNameIdx key over protected Chain instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtChainByUNameIdxKey newProtByUNameIdxKey();

	/**
	 *	Allocate a public UNameIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubChainByUNameIdxKey asPublic(IBusModelProtChainByUNameIdxKey src);

	/**
	 *	Allocate a protected PrevRelIdx key over protected Chain instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtChainByPrevRelIdxKey newProtByPrevRelIdxKey();

	/**
	 *	Allocate a public PrevRelIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubChainByPrevRelIdxKey asPublic(IBusModelProtChainByPrevRelIdxKey src);

	/**
	 *	Allocate a protected NextRelIdx key over protected Chain instances.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtChainByNextRelIdxKey newProtByNextRelIdxKey();

	/**
	 *	Allocate a public NextRelIdx key from a protected instance.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubChainByNextRelIdxKey asPublic(IBusModelProtChainByNextRelIdxKey src);

	/**
	 *	Allocate a protected Chain interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtChain newProtRec();

	/**
	 *	Allocate a public Chain interface from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubChain asPublic(IBusModelProtChain src);

	/**
	 *	Allocate a protected Chain history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtChainH newProtHRec();

	/**
	 *	Allocate a public Chain history interface implementation from a protected interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubChainH asPublic(IBusModelProtChainH src);

}

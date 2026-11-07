
// Description: Java JPA Factory interface for TokenDef.

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

package server.markhome.ycf.v3_1.busmodel.busmodel;

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

import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/*
 *	IBusModelTokenDefFactory interface for TokenDef
 */
public interface IBusModelTokenDefFactory extends IBusModelProtTokenDefFactory
{

	/**
	 *	Allocate a TokenDef interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTokenDef newRec();

	/**
	 *	Allocate a protected TokenDef interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTokenDef asProtected(IBusModelTokenDef src);

	/**
	 *	Allocate a public TokenDef interface from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTokenDef asPublic(IBusModelTokenDef src);

	/**
	 *	Allocate a TokenDef history interface implementation.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelTokenDefH newHRec();

	/**
	 *	Allocate a protected TokenDef history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelProtTokenDefH asProtected(IBusModelTokenDefH src);

	/**
	 *	Allocate a public TokenDef history interface implementation from a private interface.
	 *
	 *	@return	The new instance.
	 */
	public IBusModelPubTokenDefH asPublic(IBusModelTokenDefH src);

}

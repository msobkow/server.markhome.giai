// Description: Java 25 Private Authorization Callback Interface.

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

package server.markhome.ycf.v3_1.secure.secure;

import java.lang.reflect.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.ycf.v3_1.secure.securepub.ISecurePubAuthorization;
import server.markhome.ycf.v3_1.secure.securepub.ISecurePubAuthorizationCallback;
import server.markhome.ycf.v3_1.secure.secureprot.ISecureProtAuthorization;
import server.markhome.ycf.v3_1.secure.secureprot.ISecureProtAuthorizationCallback;

/*
 *	An ISecureAuthorizationCallback is callback method hook for locating the currently applicable authorization object at runtime.
 */
public interface ISecureAuthorizationCallback extends ISecureProtAuthorizationCallback
{
	/**
	 *	Get the currently effective private authorization to be used for processing on behalf of the user behind the scenes.
	 *
	 *	@return	The currently effective private authorization. May be null if there is no currently active user session, in which case some code uses a default system session or rejects the request.
	 */
	public ISecureAuthorization getEffectiveAuthorization();

	/**
	 *	Get the currently effective protected authorization to be used for processing on behalf of the user behind the scenes.
	 *
	 *	@return	The currently effective protected authorization. May be null if there is no currently active user session, in which case some code uses a default system session or rejects the request.
	 */
	@Override
	public default ISecureProtAuthorization getEffectiveProtAuthorization() {
		return(getEffectiveAuthorization());
	}

	/**
	 *	Get the currently effective public authorization to be used for processing on behalf of the user behind the scenes.
	 *
	 *	@return	The currently effective public authorization. May be null if there is no currently active user session, in which case some code uses a default system session or rejects the request.
	 */
	@Override
	public default ISecurePubAuthorization getEffectivePubAuthorization() {
		return(getEffectiveAuthorization());
	}
}

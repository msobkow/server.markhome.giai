// Description: Java 25 Instance Edit Object interface for BusModel TextDef.

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

package server.markhome.ycf.v3_1.busmodel.busmodelobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpub.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprot.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public interface IBusModelTextDefEditObj
	extends IBusModelTextDefObj, IBusModelAtomEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IBusModelTextDefObj.
	 */
	IBusModelTextDefObj getOrigAsTextDef();

	/**
	 *	Get the required int attribute MaxLen.
	 *
	 *	@return	The required int attribute MaxLen.
	 */
	int getRequiredMaxLen();

	/**
	 *	Set the required int attribute MaxLen.
	 *
	 *	@param value The required int attribute MaxLen value to be applied.
	 */
	void setRequiredMaxLen(int value);

	/**
	 *	Get the optional String attribute InitValue.
	 *
	 *	@return	The optional String attribute InitValue.
	 */
	String getOptionalInitValue();

	/**
	 *	Set the optional String attribute InitValue.
	 *
	 *	@param value The optional String attribute InitValue value to be applied.
	 */
	void setOptionalInitValue(String value);

	/**
	 *	Get the optional String attribute XmlElementName.
	 *
	 *	@return	The optional String attribute XmlElementName.
	 */
	String getOptionalXmlElementName();

	/**
	 *	Set the optional String attribute XmlElementName.
	 *
	 *	@param value The optional String attribute XmlElementName value to be applied.
	 */
	void setOptionalXmlElementName(String value);

}

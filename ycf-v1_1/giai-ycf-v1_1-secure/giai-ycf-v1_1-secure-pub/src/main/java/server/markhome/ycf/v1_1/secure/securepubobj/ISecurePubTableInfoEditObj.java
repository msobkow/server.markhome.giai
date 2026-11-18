// Description: Java 25 Public Instance Edit Object interface for Secure TableInfo.

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

package server.markhome.ycf.v3_1.secure.securepubobj;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubTableInfoEditObj
	extends ISecurePubTableInfoObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ISecurePubTableInfoObj.
	 */
	ISecurePubTableInfoObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ISecurePubTableInfoObj.
	 */
	ISecurePubTableInfoObj getOrigAsTableInfo();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ISecurePubTableInfoObj create();

	/*
	 *	Update the instance.
	 */
	ISecurePubTableInfoEditObj update();

	/*
	 *	Delete the instance.
	 */
	ISecurePubTableInfoEditObj deleteInstance();

	/**
	 *	Get the ISecurePubTableInfoObj instance referenced by the SuperRef key.
	 *
	 *	@return	The ISecurePubTableInfoObj instance referenced by the SuperRef key.
	 */
	ISecurePubTableInfoObj getOptionalParentSuperRef();

	/**
	 *	Get the optional ISecurePubTableInfoObj instance referenced by the SuperRef key.
	 *
	 *	@return	The optional ISecurePubTableInfoObj instance referenced by the SuperRef key.
	 */
	ISecurePubTableInfoObj getOptionalParentSuperRef( boolean forceRead );

	/**
	 *	Set the ISecurePubTableInfoObj instance referenced by the SuperRef key.
	 *
	 *	@param	value	the ISecurePubTableInfoObj instance to be referenced by the SuperRef key.
	 */
	void setOptionalParentSuperRef( ISecurePubTableInfoObj value );

	/**
	 *	Get a list ISecurePubTableInfoObj instances referenced by the SubRefs key.
	 *
	 *	@return	The (potentially empty) list of ISecurePubTableInfoObj instances referenced by the SubRefs key.
	 */
	List<ISecurePubTableInfoObj> getOptionalChildrenSubRefs();

	/**
	 *	Get the required int attribute TableInfoId.
	 *
	 *	@return	The required int attribute TableInfoId.
	 */
	int getRequiredTableInfoId();

	/**
	 *	Set the required int attribute TableInfoId.
	 *
	 *	@param value The required int attribute TableInfoId value to be applied.
	 */
	void setRequiredTableInfoId(int value);

	/**
	 *	Get the required String attribute SchemaName.
	 *
	 *	@return	The required String attribute SchemaName.
	 */
	String getRequiredSchemaName();

	/**
	 *	Set the required String attribute SchemaName.
	 *
	 *	@param value The required String attribute SchemaName value to be applied.
	 */
	void setRequiredSchemaName(String value);

	/**
	 *	Get the required String attribute TableName.
	 *
	 *	@return	The required String attribute TableName.
	 */
	String getRequiredTableName();

	/**
	 *	Set the required String attribute TableName.
	 *
	 *	@param value The required String attribute TableName value to be applied.
	 */
	void setRequiredTableName(String value);

	/**
	 *	Get the optional String attribute SuperName.
	 *
	 *	@return	The optional String attribute SuperName.
	 */
	String getOptionalSuperName();

	/**
	 *	Get the required int attribute BackingClassCode.
	 *
	 *	@return	The required int attribute BackingClassCode.
	 */
	int getRequiredBackingClassCode();

	/**
	 *	Set the required int attribute BackingClassCode.
	 *
	 *	@param value The required int attribute BackingClassCode value to be applied.
	 */
	void setRequiredBackingClassCode(int value);

	/**
	 *	Get the required int attribute RuntimeClassCode.
	 *
	 *	@return	The required int attribute RuntimeClassCode.
	 */
	int getRequiredRuntimeClassCode();

	/**
	 *	Set the required int attribute RuntimeClassCode.
	 *
	 *	@param value The required int attribute RuntimeClassCode value to be applied.
	 */
	void setRequiredRuntimeClassCode(int value);

	/**
	 *	Get the required boolean attribute HasHistory.
	 *
	 *	@return	The required boolean attribute HasHistory.
	 */
	boolean getRequiredHasHistory();

	/**
	 *	Set the required boolean attribute HasHistory.
	 *
	 *	@param value The required boolean attribute HasHistory value to be applied.
	 */
	void setRequiredHasHistory(boolean value);

	/**
	 *	Get the required boolean attribute IsMutable.
	 *
	 *	@return	The required boolean attribute IsMutable.
	 */
	boolean getRequiredIsMutable();

	/**
	 *	Set the required boolean attribute IsMutable.
	 *
	 *	@param value The required boolean attribute IsMutable value to be applied.
	 */
	void setRequiredIsMutable(boolean value);

	/**
	 *	Get the required String attribute SecScopeName.
	 *
	 *	@return	The required String attribute SecScopeName.
	 */
	String getRequiredSecScopeName();

	/**
	 *	Set the required String attribute SecScopeName.
	 *
	 *	@param value The required String attribute SecScopeName value to be applied.
	 */
	void setRequiredSecScopeName(String value);

	/**
	 *	Get the required String attribute CodeVis.
	 *
	 *	@return	The required String attribute CodeVis.
	 */
	String getRequiredCodeVis();

	/**
	 *	Set the required String attribute CodeVis.
	 *
	 *	@param value The required String attribute CodeVis value to be applied.
	 */
	void setRequiredCodeVis(String value);

	public void copyRecToOrig();
	public void copyOrigToRec();

}

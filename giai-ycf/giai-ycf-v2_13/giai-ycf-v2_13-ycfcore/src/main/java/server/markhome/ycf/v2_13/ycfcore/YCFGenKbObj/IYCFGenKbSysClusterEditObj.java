// Description: Java 11 Instance Edit Object interface for YCFGenKb SysCluster.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbSysClusterEditObj
	extends IYCFGenKbSysClusterObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFGenKbSysClusterObj.
	 */
	IYCFGenKbSysClusterObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbSysClusterObj.
	 */
	IYCFGenKbSysClusterObj getOrigAsSysCluster();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFGenKbSysClusterObj create();

	/*
	 *	Update the instance.
	 */
	YCFGenKbSysClusterEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFGenKbSysClusterEditObj deleteInstance();

	/**
	 *	Get the required int attribute SingletonId.
	 *
	 *	@return	The int value of the attribute SingletonId.
	 */
	int getRequiredSingletonId();

	/**
	 *	Set the required int attribute SingletonId.
	 *
	 *	@param	value	the int value of the attribute SingletonId.
	 */
	void setRequiredSingletonId( int value );

	/**
	 *	Get the IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The IYCFGenKbClusterObj instance referenced by the Cluster key.
	 */
	IYCFGenKbClusterObj getRequiredContainerCluster();

	/**
	 *	Set the IYCFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the IYCFGenKbClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredContainerCluster( IYCFGenKbClusterObj value );
}

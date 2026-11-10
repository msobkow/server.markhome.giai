// Description: Java 11 Instance Edit Object interface for YCFGenKb SecSession.

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

public interface IYCFGenKbSecSessionEditObj
	extends IYCFGenKbSecSessionObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base IYCFGenKbSecSessionObj.
	 */
	IYCFGenKbSecSessionObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a IYCFGenKbSecSessionObj.
	 */
	IYCFGenKbSecSessionObj getOrigAsSecSession();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFGenKbSecSessionObj create();

	/*
	 *	Update the instance.
	 */
	YCFGenKbSecSessionEditObj update();

	/*
	 *	Delete the instance.
	 */
	YCFGenKbSecSessionEditObj deleteInstance();

	/**
	 *	Get the optional String attribute SecDevName.
	 *
	 *	@return	The String value of the attribute SecDevName.
	 */
	String getOptionalSecDevName();

	/**
	 *	Set the optional String attribute SecDevName.
	 *
	 *	@param	value	the String value of the attribute SecDevName.
	 */
	void setOptionalSecDevName( String value );

	/**
	 *	Get the required Calendar attribute Start.
	 *
	 *	@return	The Calendar value of the attribute Start.
	 */
	Calendar getRequiredStart();

	/**
	 *	Set the required Calendar attribute Start.
	 *
	 *	@param	value	the Calendar value of the attribute Start.
	 */
	void setRequiredStart( Calendar value );

	/**
	 *	Get the optional Calendar attribute Finish.
	 *
	 *	@return	The Calendar value of the attribute Finish.
	 */
	Calendar getOptionalFinish();

	/**
	 *	Set the optional Calendar attribute Finish.
	 *
	 *	@param	value	the Calendar value of the attribute Finish.
	 */
	void setOptionalFinish( Calendar value );

	/**
	 *	Get the IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 */
	IYCFGenKbSecUserObj getRequiredContainerSecUser();

	/**
	 *	Set the IYCFGenKbSecUserObj instance referenced by the SecUser key.
	 *
	 *	@param	value	the IYCFGenKbSecUserObj instance to be referenced by the SecUser key.
	 */
	void setRequiredContainerSecUser( IYCFGenKbSecUserObj value );

	/**
	 *	Get the IYCFGenKbSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The IYCFGenKbSecUserObj instance referenced by the SecProxy key.
	 */
	IYCFGenKbSecUserObj getRequiredParentSecProxy();

	/**
	 *	Set the IYCFGenKbSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@param	value	the IYCFGenKbSecUserObj instance to be referenced by the SecProxy key.
	 */
	void setRequiredParentSecProxy( IYCFGenKbSecUserObj value );
}

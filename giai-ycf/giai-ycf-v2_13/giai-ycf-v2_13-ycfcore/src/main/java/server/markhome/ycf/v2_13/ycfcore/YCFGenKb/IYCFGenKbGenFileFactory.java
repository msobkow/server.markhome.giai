
// Description: Java 11 Factory interface for GenFile.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

/*
 *	YCFGenKbGenFileFactory interface for GenFile
 */
public interface IYCFGenKbGenFileFactory
{

	/**
	 *	Allocate a XSrcBundle key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileByXSrcBundleKey newXSrcBundleKey();

	/**
	 *	Allocate a XModName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileByXModNameKey newXModNameKey();

	/**
	 *	Allocate a XBasePkg key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileByXBasePkgKey newXBasePkgKey();

	/**
	 *	Allocate a XSubPkg key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileByXSubPkgKey newXSubPkgKey();

	/**
	 *	Allocate a XExpClsName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileByXExpClsNameKey newXExpClsNameKey();

	/**
	 *	Allocate a XExpKeyName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileByXExpKeyNameKey newXExpKeyNameKey();

	/**
	 *	Allocate a XExpFileName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileByXExpFileNameKey newXExpFileNameKey();

	/**
	 *	Allocate a GenFile instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGenFileBuff newBuff();

}

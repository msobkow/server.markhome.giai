
// Description: Java 11 Factory interface for GelIterator.

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
 *	YCFGenKbGelIteratorFactory interface for GelIterator
 */
public interface IYCFGenKbGelIteratorFactory
{

	/**
	 *	Allocate a BeforeIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGelIteratorByBeforeIdxKey newBeforeIdxKey();

	/**
	 *	Allocate a FirstIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGelIteratorByFirstIdxKey newFirstIdxKey();

	/**
	 *	Allocate a EachIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGelIteratorByEachIdxKey newEachIdxKey();

	/**
	 *	Allocate a LastIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGelIteratorByLastIdxKey newLastIdxKey();

	/**
	 *	Allocate a LoneIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGelIteratorByLoneIdxKey newLoneIdxKey();

	/**
	 *	Allocate a EmptyIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGelIteratorByEmptyIdxKey newEmptyIdxKey();

	/**
	 *	Allocate a GelIterator instance buffer.
	 *
	 *	@return	The new instance.
	 */
	YCFGenKbGelIteratorBuff newBuff();

}

// Description: Java 11 interface for a YCFBam schema.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.Tip.YCFTipClientHandler;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public interface IYCFBamSchema
extends IYCFSecSchema,
	IYCFIntSchema
{
	public enum LoaderBehaviourEnum {
		Insert,
		Update,
		Replace
	};

	public enum RelationTypeEnum {
		Unknown,
		Lookup,
		Superclass,
		Container,
		Components,
		Owner,
		Parent,
		Children
	};

	public enum CodeVisibilityEnum {
		Public,
		Protected,
		Private
	};

	public enum SecScopeEnum {
		None,
		System,
		Global,
		Cluster,
		Tenant,
		SystemGroup,
		ClusterGroup,
		TenantGroup
	};

	public enum RoleScopeEnum {
		SysRole,
		ClusRole,
		TentRole
	};

	YCFSecConfigurationFile getConfigurationFile();
	void setConfigurationFile( YCFSecConfigurationFile value );

	String getJndiName();
	void setJndiName( String value );

	/**
	 *	Is the schema connected to a persistent storage server?
	 *
	 *	@return	True if the schema is connected to persistent storage,
	 *		otherwise false.
	 */
	boolean isConnected();

	/**
	 *	Connect to the persistent storage server.
	 *
	 *	@return	True if a connection was established, otherwise false.
	 */
	boolean connect();

	/**
	 *	Connect to the persistent storage server using the specified
	 *	user name and password with the server and database specified
	 *	by the configuration file.  JNDI names are ignored by this method.
	 *
	 *	@return	True if a connection was established, otherwise false.
	 */
	boolean connect( String username, String password );

	/**
	 *	Extended login format for GUI login screens
	 */
	boolean connect( String loginId, String password, String clusterName, String tenantName );

	/**
	 *	Disconnect from the persistent storage server.
	 */
	void disconnect( boolean doCommit );

	/**
	 *	Log out of the server, releasing the authorization information.
	 */
	void logout( YCFSecAuthorization auth );

	/**
	 *	Import the contents of the specified file name
	 *	and file contents by applying a SAX Loader parse.
	 */
	String fileImport( YCFSecAuthorization auth, String fileName, String fileContent );

	/**
	 *	Allocate a new schema instance.
	 *
	 *	@return	A new IYCFSecSchema instance.
	 */
	IYCFSecSchema newSchema();

	/**
	 *	Get the next ISOCcyIdGen identifier.
	 *
	 *	@return	The next ISOCcyIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	short nextISOCcyIdGen();

	/**
	 *	Get the next ISOCtryIdGen identifier.
	 *
	 *	@return	The next ISOCtryIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	short nextISOCtryIdGen();

	/**
	 *	Get the next ISOLangIdGen identifier.
	 *
	 *	@return	The next ISOLangIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	short nextISOLangIdGen();

	/**
	 *	Get the next ISOTZoneIdGen identifier.
	 *
	 *	@return	The next ISOTZoneIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	short nextISOTZoneIdGen();

	/**
	 *	Get the next ServiceTypeIdGen identifier.
	 *
	 *	@return	The next ServiceTypeIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	int nextServiceTypeIdGen();

	/**
	 *	Get the next MimeTypeIdGen identifier.
	 *
	 *	@return	The next MimeTypeIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	int nextMimeTypeIdGen();

	/**
	 *	Get the next URLProtocolIdGen identifier.
	 *
	 *	@return	The next URLProtocolIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	int nextURLProtocolIdGen();

	/**
	 *	Get the next ClusterIdGen identifier.
	 *
	 *	@return	The next ClusterIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	long nextClusterIdGen();

	/**
	 *	Get the next TenantIdGen identifier.
	 *
	 *	@return	The next TenantIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	long nextTenantIdGen();

	/**
	 *	Get the next SecSessionIdGen identifier.
	 *
	 *	@return	The next SecSessionIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	UUID nextSecSessionIdGen();

	/**
	 *	Get the next SecUserIdGen identifier.
	 *
	 *	@return	The next SecUserIdGen identifier.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	UUID nextSecUserIdGen();

	/**
	 *	Get the Atom Table interface for the schema.
	 *
	 *	@return	The Atom Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamAtomTable getTableAtom();

	/**
	 *	Get the Atom Factory interface for the schema.
	 *
	 *	@return	The Atom Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamAtomFactory getFactoryAtom();

	/**
	 *	Get the BlobCol Table interface for the schema.
	 *
	 *	@return	The BlobCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBlobColTable getTableBlobCol();

	/**
	 *	Get the BlobCol Factory interface for the schema.
	 *
	 *	@return	The BlobCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBlobColFactory getFactoryBlobCol();

	/**
	 *	Get the BlobDef Table interface for the schema.
	 *
	 *	@return	The BlobDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBlobDefTable getTableBlobDef();

	/**
	 *	Get the BlobDef Factory interface for the schema.
	 *
	 *	@return	The BlobDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBlobDefFactory getFactoryBlobDef();

	/**
	 *	Get the BlobType Table interface for the schema.
	 *
	 *	@return	The BlobType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBlobTypeTable getTableBlobType();

	/**
	 *	Get the BlobType Factory interface for the schema.
	 *
	 *	@return	The BlobType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBlobTypeFactory getFactoryBlobType();

	/**
	 *	Get the BoolCol Table interface for the schema.
	 *
	 *	@return	The BoolCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBoolColTable getTableBoolCol();

	/**
	 *	Get the BoolCol Factory interface for the schema.
	 *
	 *	@return	The BoolCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBoolColFactory getFactoryBoolCol();

	/**
	 *	Get the BoolDef Table interface for the schema.
	 *
	 *	@return	The BoolDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBoolDefTable getTableBoolDef();

	/**
	 *	Get the BoolDef Factory interface for the schema.
	 *
	 *	@return	The BoolDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBoolDefFactory getFactoryBoolDef();

	/**
	 *	Get the BoolType Table interface for the schema.
	 *
	 *	@return	The BoolType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBoolTypeTable getTableBoolType();

	/**
	 *	Get the BoolType Factory interface for the schema.
	 *
	 *	@return	The BoolType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamBoolTypeFactory getFactoryBoolType();

	/**
	 *	Get the Chain Table interface for the schema.
	 *
	 *	@return	The Chain Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamChainTable getTableChain();

	/**
	 *	Get the Chain Factory interface for the schema.
	 *
	 *	@return	The Chain Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamChainFactory getFactoryChain();

	/**
	 *	Get the ClearDep Table interface for the schema.
	 *
	 *	@return	The ClearDep Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearDepTable getTableClearDep();

	/**
	 *	Get the ClearDep Factory interface for the schema.
	 *
	 *	@return	The ClearDep Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearDepFactory getFactoryClearDep();

	/**
	 *	Get the ClearSubDep1 Table interface for the schema.
	 *
	 *	@return	The ClearSubDep1 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearSubDep1Table getTableClearSubDep1();

	/**
	 *	Get the ClearSubDep1 Factory interface for the schema.
	 *
	 *	@return	The ClearSubDep1 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearSubDep1Factory getFactoryClearSubDep1();

	/**
	 *	Get the ClearSubDep2 Table interface for the schema.
	 *
	 *	@return	The ClearSubDep2 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearSubDep2Table getTableClearSubDep2();

	/**
	 *	Get the ClearSubDep2 Factory interface for the schema.
	 *
	 *	@return	The ClearSubDep2 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearSubDep2Factory getFactoryClearSubDep2();

	/**
	 *	Get the ClearSubDep3 Table interface for the schema.
	 *
	 *	@return	The ClearSubDep3 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearSubDep3Table getTableClearSubDep3();

	/**
	 *	Get the ClearSubDep3 Factory interface for the schema.
	 *
	 *	@return	The ClearSubDep3 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearSubDep3Factory getFactoryClearSubDep3();

	/**
	 *	Get the ClearTopDep Table interface for the schema.
	 *
	 *	@return	The ClearTopDep Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearTopDepTable getTableClearTopDep();

	/**
	 *	Get the ClearTopDep Factory interface for the schema.
	 *
	 *	@return	The ClearTopDep Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamClearTopDepFactory getFactoryClearTopDep();

	/**
	 *	Get the Cluster Table interface for the schema.
	 *
	 *	@return	The Cluster Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecClusterTable getTableCluster();

	/**
	 *	Get the Cluster Factory interface for the schema.
	 *
	 *	@return	The Cluster Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecClusterFactory getFactoryCluster();

	/**
	 *	Get the DateCol Table interface for the schema.
	 *
	 *	@return	The DateCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDateColTable getTableDateCol();

	/**
	 *	Get the DateCol Factory interface for the schema.
	 *
	 *	@return	The DateCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDateColFactory getFactoryDateCol();

	/**
	 *	Get the DateDef Table interface for the schema.
	 *
	 *	@return	The DateDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDateDefTable getTableDateDef();

	/**
	 *	Get the DateDef Factory interface for the schema.
	 *
	 *	@return	The DateDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDateDefFactory getFactoryDateDef();

	/**
	 *	Get the DateType Table interface for the schema.
	 *
	 *	@return	The DateType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDateTypeTable getTableDateType();

	/**
	 *	Get the DateType Factory interface for the schema.
	 *
	 *	@return	The DateType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDateTypeFactory getFactoryDateType();

	/**
	 *	Get the DbKeyHash128Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128ColTable getTableDbKeyHash128Col();

	/**
	 *	Get the DbKeyHash128Col Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash128Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128ColFactory getFactoryDbKeyHash128Col();

	/**
	 *	Get the DbKeyHash128Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128DefTable getTableDbKeyHash128Def();

	/**
	 *	Get the DbKeyHash128Def Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash128Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128DefFactory getFactoryDbKeyHash128Def();

	/**
	 *	Get the DbKeyHash128Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128GenTable getTableDbKeyHash128Gen();

	/**
	 *	Get the DbKeyHash128Gen Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash128Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128GenFactory getFactoryDbKeyHash128Gen();

	/**
	 *	Get the DbKeyHash128Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128TypeTable getTableDbKeyHash128Type();

	/**
	 *	Get the DbKeyHash128Type Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash128Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash128TypeFactory getFactoryDbKeyHash128Type();

	/**
	 *	Get the DbKeyHash160Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160ColTable getTableDbKeyHash160Col();

	/**
	 *	Get the DbKeyHash160Col Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash160Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160ColFactory getFactoryDbKeyHash160Col();

	/**
	 *	Get the DbKeyHash160Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160DefTable getTableDbKeyHash160Def();

	/**
	 *	Get the DbKeyHash160Def Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash160Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160DefFactory getFactoryDbKeyHash160Def();

	/**
	 *	Get the DbKeyHash160Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160GenTable getTableDbKeyHash160Gen();

	/**
	 *	Get the DbKeyHash160Gen Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash160Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160GenFactory getFactoryDbKeyHash160Gen();

	/**
	 *	Get the DbKeyHash160Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160TypeTable getTableDbKeyHash160Type();

	/**
	 *	Get the DbKeyHash160Type Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash160Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash160TypeFactory getFactoryDbKeyHash160Type();

	/**
	 *	Get the DbKeyHash224Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224ColTable getTableDbKeyHash224Col();

	/**
	 *	Get the DbKeyHash224Col Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash224Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224ColFactory getFactoryDbKeyHash224Col();

	/**
	 *	Get the DbKeyHash224Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224DefTable getTableDbKeyHash224Def();

	/**
	 *	Get the DbKeyHash224Def Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash224Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224DefFactory getFactoryDbKeyHash224Def();

	/**
	 *	Get the DbKeyHash224Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224GenTable getTableDbKeyHash224Gen();

	/**
	 *	Get the DbKeyHash224Gen Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash224Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224GenFactory getFactoryDbKeyHash224Gen();

	/**
	 *	Get the DbKeyHash224Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224TypeTable getTableDbKeyHash224Type();

	/**
	 *	Get the DbKeyHash224Type Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash224Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash224TypeFactory getFactoryDbKeyHash224Type();

	/**
	 *	Get the DbKeyHash256Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256ColTable getTableDbKeyHash256Col();

	/**
	 *	Get the DbKeyHash256Col Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash256Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256ColFactory getFactoryDbKeyHash256Col();

	/**
	 *	Get the DbKeyHash256Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256DefTable getTableDbKeyHash256Def();

	/**
	 *	Get the DbKeyHash256Def Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash256Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256DefFactory getFactoryDbKeyHash256Def();

	/**
	 *	Get the DbKeyHash256Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256GenTable getTableDbKeyHash256Gen();

	/**
	 *	Get the DbKeyHash256Gen Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash256Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256GenFactory getFactoryDbKeyHash256Gen();

	/**
	 *	Get the DbKeyHash256Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256TypeTable getTableDbKeyHash256Type();

	/**
	 *	Get the DbKeyHash256Type Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash256Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash256TypeFactory getFactoryDbKeyHash256Type();

	/**
	 *	Get the DbKeyHash384Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384ColTable getTableDbKeyHash384Col();

	/**
	 *	Get the DbKeyHash384Col Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash384Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384ColFactory getFactoryDbKeyHash384Col();

	/**
	 *	Get the DbKeyHash384Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384DefTable getTableDbKeyHash384Def();

	/**
	 *	Get the DbKeyHash384Def Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash384Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384DefFactory getFactoryDbKeyHash384Def();

	/**
	 *	Get the DbKeyHash384Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384GenTable getTableDbKeyHash384Gen();

	/**
	 *	Get the DbKeyHash384Gen Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash384Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384GenFactory getFactoryDbKeyHash384Gen();

	/**
	 *	Get the DbKeyHash384Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384TypeTable getTableDbKeyHash384Type();

	/**
	 *	Get the DbKeyHash384Type Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash384Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash384TypeFactory getFactoryDbKeyHash384Type();

	/**
	 *	Get the DbKeyHash512Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512ColTable getTableDbKeyHash512Col();

	/**
	 *	Get the DbKeyHash512Col Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash512Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512ColFactory getFactoryDbKeyHash512Col();

	/**
	 *	Get the DbKeyHash512Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512DefTable getTableDbKeyHash512Def();

	/**
	 *	Get the DbKeyHash512Def Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash512Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512DefFactory getFactoryDbKeyHash512Def();

	/**
	 *	Get the DbKeyHash512Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512GenTable getTableDbKeyHash512Gen();

	/**
	 *	Get the DbKeyHash512Gen Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash512Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512GenFactory getFactoryDbKeyHash512Gen();

	/**
	 *	Get the DbKeyHash512Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512TypeTable getTableDbKeyHash512Type();

	/**
	 *	Get the DbKeyHash512Type Factory interface for the schema.
	 *
	 *	@return	The DbKeyHash512Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDbKeyHash512TypeFactory getFactoryDbKeyHash512Type();

	/**
	 *	Get the DelDep Table interface for the schema.
	 *
	 *	@return	The DelDep Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelDepTable getTableDelDep();

	/**
	 *	Get the DelDep Factory interface for the schema.
	 *
	 *	@return	The DelDep Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelDepFactory getFactoryDelDep();

	/**
	 *	Get the DelSubDep1 Table interface for the schema.
	 *
	 *	@return	The DelSubDep1 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelSubDep1Table getTableDelSubDep1();

	/**
	 *	Get the DelSubDep1 Factory interface for the schema.
	 *
	 *	@return	The DelSubDep1 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelSubDep1Factory getFactoryDelSubDep1();

	/**
	 *	Get the DelSubDep2 Table interface for the schema.
	 *
	 *	@return	The DelSubDep2 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelSubDep2Table getTableDelSubDep2();

	/**
	 *	Get the DelSubDep2 Factory interface for the schema.
	 *
	 *	@return	The DelSubDep2 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelSubDep2Factory getFactoryDelSubDep2();

	/**
	 *	Get the DelSubDep3 Table interface for the schema.
	 *
	 *	@return	The DelSubDep3 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelSubDep3Table getTableDelSubDep3();

	/**
	 *	Get the DelSubDep3 Factory interface for the schema.
	 *
	 *	@return	The DelSubDep3 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelSubDep3Factory getFactoryDelSubDep3();

	/**
	 *	Get the DelTopDep Table interface for the schema.
	 *
	 *	@return	The DelTopDep Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelTopDepTable getTableDelTopDep();

	/**
	 *	Get the DelTopDep Factory interface for the schema.
	 *
	 *	@return	The DelTopDep Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDelTopDepFactory getFactoryDelTopDep();

	/**
	 *	Get the DoubleCol Table interface for the schema.
	 *
	 *	@return	The DoubleCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDoubleColTable getTableDoubleCol();

	/**
	 *	Get the DoubleCol Factory interface for the schema.
	 *
	 *	@return	The DoubleCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDoubleColFactory getFactoryDoubleCol();

	/**
	 *	Get the DoubleDef Table interface for the schema.
	 *
	 *	@return	The DoubleDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDoubleDefTable getTableDoubleDef();

	/**
	 *	Get the DoubleDef Factory interface for the schema.
	 *
	 *	@return	The DoubleDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDoubleDefFactory getFactoryDoubleDef();

	/**
	 *	Get the DoubleType Table interface for the schema.
	 *
	 *	@return	The DoubleType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDoubleTypeTable getTableDoubleType();

	/**
	 *	Get the DoubleType Factory interface for the schema.
	 *
	 *	@return	The DoubleType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamDoubleTypeFactory getFactoryDoubleType();

	/**
	 *	Get the EnumDef Table interface for the schema.
	 *
	 *	@return	The EnumDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamEnumDefTable getTableEnumDef();

	/**
	 *	Get the EnumDef Factory interface for the schema.
	 *
	 *	@return	The EnumDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamEnumDefFactory getFactoryEnumDef();

	/**
	 *	Get the EnumTag Table interface for the schema.
	 *
	 *	@return	The EnumTag Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamEnumTagTable getTableEnumTag();

	/**
	 *	Get the EnumTag Factory interface for the schema.
	 *
	 *	@return	The EnumTag Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamEnumTagFactory getFactoryEnumTag();

	/**
	 *	Get the EnumType Table interface for the schema.
	 *
	 *	@return	The EnumType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamEnumTypeTable getTableEnumType();

	/**
	 *	Get the EnumType Factory interface for the schema.
	 *
	 *	@return	The EnumType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamEnumTypeFactory getFactoryEnumType();

	/**
	 *	Get the FloatCol Table interface for the schema.
	 *
	 *	@return	The FloatCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamFloatColTable getTableFloatCol();

	/**
	 *	Get the FloatCol Factory interface for the schema.
	 *
	 *	@return	The FloatCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamFloatColFactory getFactoryFloatCol();

	/**
	 *	Get the FloatDef Table interface for the schema.
	 *
	 *	@return	The FloatDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamFloatDefTable getTableFloatDef();

	/**
	 *	Get the FloatDef Factory interface for the schema.
	 *
	 *	@return	The FloatDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamFloatDefFactory getFactoryFloatDef();

	/**
	 *	Get the FloatType Table interface for the schema.
	 *
	 *	@return	The FloatType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamFloatTypeTable getTableFloatType();

	/**
	 *	Get the FloatType Factory interface for the schema.
	 *
	 *	@return	The FloatType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamFloatTypeFactory getFactoryFloatType();

	/**
	 *	Get the HostNode Table interface for the schema.
	 *
	 *	@return	The HostNode Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecHostNodeTable getTableHostNode();

	/**
	 *	Get the HostNode Factory interface for the schema.
	 *
	 *	@return	The HostNode Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecHostNodeFactory getFactoryHostNode();

	/**
	 *	Get the ISOCcy Table interface for the schema.
	 *
	 *	@return	The ISOCcy Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCcyTable getTableISOCcy();

	/**
	 *	Get the ISOCcy Factory interface for the schema.
	 *
	 *	@return	The ISOCcy Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCcyFactory getFactoryISOCcy();

	/**
	 *	Get the ISOCtry Table interface for the schema.
	 *
	 *	@return	The ISOCtry Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCtryTable getTableISOCtry();

	/**
	 *	Get the ISOCtry Factory interface for the schema.
	 *
	 *	@return	The ISOCtry Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCtryFactory getFactoryISOCtry();

	/**
	 *	Get the ISOCtryCcy Table interface for the schema.
	 *
	 *	@return	The ISOCtryCcy Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCtryCcyTable getTableISOCtryCcy();

	/**
	 *	Get the ISOCtryCcy Factory interface for the schema.
	 *
	 *	@return	The ISOCtryCcy Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCtryCcyFactory getFactoryISOCtryCcy();

	/**
	 *	Get the ISOCtryLang Table interface for the schema.
	 *
	 *	@return	The ISOCtryLang Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCtryLangTable getTableISOCtryLang();

	/**
	 *	Get the ISOCtryLang Factory interface for the schema.
	 *
	 *	@return	The ISOCtryLang Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOCtryLangFactory getFactoryISOCtryLang();

	/**
	 *	Get the ISOLang Table interface for the schema.
	 *
	 *	@return	The ISOLang Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOLangTable getTableISOLang();

	/**
	 *	Get the ISOLang Factory interface for the schema.
	 *
	 *	@return	The ISOLang Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOLangFactory getFactoryISOLang();

	/**
	 *	Get the ISOTZone Table interface for the schema.
	 *
	 *	@return	The ISOTZone Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOTZoneTable getTableISOTZone();

	/**
	 *	Get the ISOTZone Factory interface for the schema.
	 *
	 *	@return	The ISOTZone Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecISOTZoneFactory getFactoryISOTZone();

	/**
	 *	Get the Id16Gen Table interface for the schema.
	 *
	 *	@return	The Id16Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamId16GenTable getTableId16Gen();

	/**
	 *	Get the Id16Gen Factory interface for the schema.
	 *
	 *	@return	The Id16Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamId16GenFactory getFactoryId16Gen();

	/**
	 *	Get the Id32Gen Table interface for the schema.
	 *
	 *	@return	The Id32Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamId32GenTable getTableId32Gen();

	/**
	 *	Get the Id32Gen Factory interface for the schema.
	 *
	 *	@return	The Id32Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamId32GenFactory getFactoryId32Gen();

	/**
	 *	Get the Id64Gen Table interface for the schema.
	 *
	 *	@return	The Id64Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamId64GenTable getTableId64Gen();

	/**
	 *	Get the Id64Gen Factory interface for the schema.
	 *
	 *	@return	The Id64Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamId64GenFactory getFactoryId64Gen();

	/**
	 *	Get the Index Table interface for the schema.
	 *
	 *	@return	The Index Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamIndexTable getTableIndex();

	/**
	 *	Get the Index Factory interface for the schema.
	 *
	 *	@return	The Index Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamIndexFactory getFactoryIndex();

	/**
	 *	Get the IndexCol Table interface for the schema.
	 *
	 *	@return	The IndexCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamIndexColTable getTableIndexCol();

	/**
	 *	Get the IndexCol Factory interface for the schema.
	 *
	 *	@return	The IndexCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamIndexColFactory getFactoryIndexCol();

	/**
	 *	Get the IndexTweak Table interface for the schema.
	 *
	 *	@return	The IndexTweak Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamIndexTweakTable getTableIndexTweak();

	/**
	 *	Get the IndexTweak Factory interface for the schema.
	 *
	 *	@return	The IndexTweak Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamIndexTweakFactory getFactoryIndexTweak();

	/**
	 *	Get the Int16Col Table interface for the schema.
	 *
	 *	@return	The Int16Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt16ColTable getTableInt16Col();

	/**
	 *	Get the Int16Col Factory interface for the schema.
	 *
	 *	@return	The Int16Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt16ColFactory getFactoryInt16Col();

	/**
	 *	Get the Int16Def Table interface for the schema.
	 *
	 *	@return	The Int16Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt16DefTable getTableInt16Def();

	/**
	 *	Get the Int16Def Factory interface for the schema.
	 *
	 *	@return	The Int16Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt16DefFactory getFactoryInt16Def();

	/**
	 *	Get the Int16Type Table interface for the schema.
	 *
	 *	@return	The Int16Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt16TypeTable getTableInt16Type();

	/**
	 *	Get the Int16Type Factory interface for the schema.
	 *
	 *	@return	The Int16Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt16TypeFactory getFactoryInt16Type();

	/**
	 *	Get the Int32Col Table interface for the schema.
	 *
	 *	@return	The Int32Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt32ColTable getTableInt32Col();

	/**
	 *	Get the Int32Col Factory interface for the schema.
	 *
	 *	@return	The Int32Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt32ColFactory getFactoryInt32Col();

	/**
	 *	Get the Int32Def Table interface for the schema.
	 *
	 *	@return	The Int32Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt32DefTable getTableInt32Def();

	/**
	 *	Get the Int32Def Factory interface for the schema.
	 *
	 *	@return	The Int32Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt32DefFactory getFactoryInt32Def();

	/**
	 *	Get the Int32Type Table interface for the schema.
	 *
	 *	@return	The Int32Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt32TypeTable getTableInt32Type();

	/**
	 *	Get the Int32Type Factory interface for the schema.
	 *
	 *	@return	The Int32Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt32TypeFactory getFactoryInt32Type();

	/**
	 *	Get the Int64Col Table interface for the schema.
	 *
	 *	@return	The Int64Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt64ColTable getTableInt64Col();

	/**
	 *	Get the Int64Col Factory interface for the schema.
	 *
	 *	@return	The Int64Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt64ColFactory getFactoryInt64Col();

	/**
	 *	Get the Int64Def Table interface for the schema.
	 *
	 *	@return	The Int64Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt64DefTable getTableInt64Def();

	/**
	 *	Get the Int64Def Factory interface for the schema.
	 *
	 *	@return	The Int64Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt64DefFactory getFactoryInt64Def();

	/**
	 *	Get the Int64Type Table interface for the schema.
	 *
	 *	@return	The Int64Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt64TypeTable getTableInt64Type();

	/**
	 *	Get the Int64Type Factory interface for the schema.
	 *
	 *	@return	The Int64Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamInt64TypeFactory getFactoryInt64Type();

	/**
	 *	Get the License Table interface for the schema.
	 *
	 *	@return	The License Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntLicenseTable getTableLicense();

	/**
	 *	Get the License Factory interface for the schema.
	 *
	 *	@return	The License Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntLicenseFactory getFactoryLicense();

	/**
	 *	Get the MajorVersion Table interface for the schema.
	 *
	 *	@return	The MajorVersion Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntMajorVersionTable getTableMajorVersion();

	/**
	 *	Get the MajorVersion Factory interface for the schema.
	 *
	 *	@return	The MajorVersion Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntMajorVersionFactory getFactoryMajorVersion();

	/**
	 *	Get the MimeType Table interface for the schema.
	 *
	 *	@return	The MimeType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntMimeTypeTable getTableMimeType();

	/**
	 *	Get the MimeType Factory interface for the schema.
	 *
	 *	@return	The MimeType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntMimeTypeFactory getFactoryMimeType();

	/**
	 *	Get the MinorVersion Table interface for the schema.
	 *
	 *	@return	The MinorVersion Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntMinorVersionTable getTableMinorVersion();

	/**
	 *	Get the MinorVersion Factory interface for the schema.
	 *
	 *	@return	The MinorVersion Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntMinorVersionFactory getFactoryMinorVersion();

	/**
	 *	Get the NmTokenCol Table interface for the schema.
	 *
	 *	@return	The NmTokenCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokenColTable getTableNmTokenCol();

	/**
	 *	Get the NmTokenCol Factory interface for the schema.
	 *
	 *	@return	The NmTokenCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokenColFactory getFactoryNmTokenCol();

	/**
	 *	Get the NmTokenDef Table interface for the schema.
	 *
	 *	@return	The NmTokenDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokenDefTable getTableNmTokenDef();

	/**
	 *	Get the NmTokenDef Factory interface for the schema.
	 *
	 *	@return	The NmTokenDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokenDefFactory getFactoryNmTokenDef();

	/**
	 *	Get the NmTokenType Table interface for the schema.
	 *
	 *	@return	The NmTokenType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokenTypeTable getTableNmTokenType();

	/**
	 *	Get the NmTokenType Factory interface for the schema.
	 *
	 *	@return	The NmTokenType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokenTypeFactory getFactoryNmTokenType();

	/**
	 *	Get the NmTokensCol Table interface for the schema.
	 *
	 *	@return	The NmTokensCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokensColTable getTableNmTokensCol();

	/**
	 *	Get the NmTokensCol Factory interface for the schema.
	 *
	 *	@return	The NmTokensCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokensColFactory getFactoryNmTokensCol();

	/**
	 *	Get the NmTokensDef Table interface for the schema.
	 *
	 *	@return	The NmTokensDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokensDefTable getTableNmTokensDef();

	/**
	 *	Get the NmTokensDef Factory interface for the schema.
	 *
	 *	@return	The NmTokensDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokensDefFactory getFactoryNmTokensDef();

	/**
	 *	Get the NmTokensType Table interface for the schema.
	 *
	 *	@return	The NmTokensType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokensTypeTable getTableNmTokensType();

	/**
	 *	Get the NmTokensType Factory interface for the schema.
	 *
	 *	@return	The NmTokensType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNmTokensTypeFactory getFactoryNmTokensType();

	/**
	 *	Get the NumberCol Table interface for the schema.
	 *
	 *	@return	The NumberCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNumberColTable getTableNumberCol();

	/**
	 *	Get the NumberCol Factory interface for the schema.
	 *
	 *	@return	The NumberCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNumberColFactory getFactoryNumberCol();

	/**
	 *	Get the NumberDef Table interface for the schema.
	 *
	 *	@return	The NumberDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNumberDefTable getTableNumberDef();

	/**
	 *	Get the NumberDef Factory interface for the schema.
	 *
	 *	@return	The NumberDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNumberDefFactory getFactoryNumberDef();

	/**
	 *	Get the NumberType Table interface for the schema.
	 *
	 *	@return	The NumberType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNumberTypeTable getTableNumberType();

	/**
	 *	Get the NumberType Factory interface for the schema.
	 *
	 *	@return	The NumberType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamNumberTypeFactory getFactoryNumberType();

	/**
	 *	Get the Param Table interface for the schema.
	 *
	 *	@return	The Param Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamParamTable getTableParam();

	/**
	 *	Get the Param Factory interface for the schema.
	 *
	 *	@return	The Param Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamParamFactory getFactoryParam();

	/**
	 *	Get the PopDep Table interface for the schema.
	 *
	 *	@return	The PopDep Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopDepTable getTablePopDep();

	/**
	 *	Get the PopDep Factory interface for the schema.
	 *
	 *	@return	The PopDep Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopDepFactory getFactoryPopDep();

	/**
	 *	Get the PopSubDep1 Table interface for the schema.
	 *
	 *	@return	The PopSubDep1 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopSubDep1Table getTablePopSubDep1();

	/**
	 *	Get the PopSubDep1 Factory interface for the schema.
	 *
	 *	@return	The PopSubDep1 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopSubDep1Factory getFactoryPopSubDep1();

	/**
	 *	Get the PopSubDep2 Table interface for the schema.
	 *
	 *	@return	The PopSubDep2 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopSubDep2Table getTablePopSubDep2();

	/**
	 *	Get the PopSubDep2 Factory interface for the schema.
	 *
	 *	@return	The PopSubDep2 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopSubDep2Factory getFactoryPopSubDep2();

	/**
	 *	Get the PopSubDep3 Table interface for the schema.
	 *
	 *	@return	The PopSubDep3 Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopSubDep3Table getTablePopSubDep3();

	/**
	 *	Get the PopSubDep3 Factory interface for the schema.
	 *
	 *	@return	The PopSubDep3 Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopSubDep3Factory getFactoryPopSubDep3();

	/**
	 *	Get the PopTopDep Table interface for the schema.
	 *
	 *	@return	The PopTopDep Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopTopDepTable getTablePopTopDep();

	/**
	 *	Get the PopTopDep Factory interface for the schema.
	 *
	 *	@return	The PopTopDep Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamPopTopDepFactory getFactoryPopTopDep();

	/**
	 *	Get the Relation Table interface for the schema.
	 *
	 *	@return	The Relation Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamRelationTable getTableRelation();

	/**
	 *	Get the Relation Factory interface for the schema.
	 *
	 *	@return	The Relation Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamRelationFactory getFactoryRelation();

	/**
	 *	Get the RelationCol Table interface for the schema.
	 *
	 *	@return	The RelationCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamRelationColTable getTableRelationCol();

	/**
	 *	Get the RelationCol Factory interface for the schema.
	 *
	 *	@return	The RelationCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamRelationColFactory getFactoryRelationCol();

	/**
	 *	Get the RoleDef Table interface for the schema.
	 *
	 *	@return	The RoleDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamRoleDefTable getTableRoleDef();

	/**
	 *	Get the RoleDef Factory interface for the schema.
	 *
	 *	@return	The RoleDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamRoleDefFactory getFactoryRoleDef();

	/**
	 *	Get the SchemaDef Table interface for the schema.
	 *
	 *	@return	The SchemaDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaDefTable getTableSchemaDef();

	/**
	 *	Get the SchemaDef Factory interface for the schema.
	 *
	 *	@return	The SchemaDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaDefFactory getFactorySchemaDef();

	/**
	 *	Get the SchemaRef Table interface for the schema.
	 *
	 *	@return	The SchemaRef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaRefTable getTableSchemaRef();

	/**
	 *	Get the SchemaRef Factory interface for the schema.
	 *
	 *	@return	The SchemaRef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaRefFactory getFactorySchemaRef();

	/**
	 *	Get the SchemaRole Table interface for the schema.
	 *
	 *	@return	The SchemaRole Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaRoleTable getTableSchemaRole();

	/**
	 *	Get the SchemaRole Factory interface for the schema.
	 *
	 *	@return	The SchemaRole Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaRoleFactory getFactorySchemaRole();

	/**
	 *	Get the SchemaTweak Table interface for the schema.
	 *
	 *	@return	The SchemaTweak Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaTweakTable getTableSchemaTweak();

	/**
	 *	Get the SchemaTweak Factory interface for the schema.
	 *
	 *	@return	The SchemaTweak Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamSchemaTweakFactory getFactorySchemaTweak();

	/**
	 *	Get the Scope Table interface for the schema.
	 *
	 *	@return	The Scope Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamScopeTable getTableScope();

	/**
	 *	Get the Scope Factory interface for the schema.
	 *
	 *	@return	The Scope Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamScopeFactory getFactoryScope();

	/**
	 *	Get the SecApp Table interface for the schema.
	 *
	 *	@return	The SecApp Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecAppTable getTableSecApp();

	/**
	 *	Get the SecApp Factory interface for the schema.
	 *
	 *	@return	The SecApp Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecAppFactory getFactorySecApp();

	/**
	 *	Get the SecDevice Table interface for the schema.
	 *
	 *	@return	The SecDevice Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecDeviceTable getTableSecDevice();

	/**
	 *	Get the SecDevice Factory interface for the schema.
	 *
	 *	@return	The SecDevice Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecDeviceFactory getFactorySecDevice();

	/**
	 *	Get the SecForm Table interface for the schema.
	 *
	 *	@return	The SecForm Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecFormTable getTableSecForm();

	/**
	 *	Get the SecForm Factory interface for the schema.
	 *
	 *	@return	The SecForm Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecFormFactory getFactorySecForm();

	/**
	 *	Get the SecGroup Table interface for the schema.
	 *
	 *	@return	The SecGroup Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGroupTable getTableSecGroup();

	/**
	 *	Get the SecGroup Factory interface for the schema.
	 *
	 *	@return	The SecGroup Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGroupFactory getFactorySecGroup();

	/**
	 *	Get the SecGroupForm Table interface for the schema.
	 *
	 *	@return	The SecGroupForm Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGroupFormTable getTableSecGroupForm();

	/**
	 *	Get the SecGroupForm Factory interface for the schema.
	 *
	 *	@return	The SecGroupForm Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGroupFormFactory getFactorySecGroupForm();

	/**
	 *	Get the SecGrpInc Table interface for the schema.
	 *
	 *	@return	The SecGrpInc Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGrpIncTable getTableSecGrpInc();

	/**
	 *	Get the SecGrpInc Factory interface for the schema.
	 *
	 *	@return	The SecGrpInc Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGrpIncFactory getFactorySecGrpInc();

	/**
	 *	Get the SecGrpMemb Table interface for the schema.
	 *
	 *	@return	The SecGrpMemb Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGrpMembTable getTableSecGrpMemb();

	/**
	 *	Get the SecGrpMemb Factory interface for the schema.
	 *
	 *	@return	The SecGrpMemb Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecGrpMembFactory getFactorySecGrpMemb();

	/**
	 *	Get the SecSession Table interface for the schema.
	 *
	 *	@return	The SecSession Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecSessionTable getTableSecSession();

	/**
	 *	Get the SecSession Factory interface for the schema.
	 *
	 *	@return	The SecSession Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecSessionFactory getFactorySecSession();

	/**
	 *	Get the SecUser Table interface for the schema.
	 *
	 *	@return	The SecUser Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecUserTable getTableSecUser();

	/**
	 *	Get the SecUser Factory interface for the schema.
	 *
	 *	@return	The SecUser Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSecUserFactory getFactorySecUser();

	/**
	 *	Get the ServerListFunc Table interface for the schema.
	 *
	 *	@return	The ServerListFunc Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerListFuncTable getTableServerListFunc();

	/**
	 *	Get the ServerListFunc Factory interface for the schema.
	 *
	 *	@return	The ServerListFunc Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerListFuncFactory getFactoryServerListFunc();

	/**
	 *	Get the ServerMethod Table interface for the schema.
	 *
	 *	@return	The ServerMethod Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerMethodTable getTableServerMethod();

	/**
	 *	Get the ServerMethod Factory interface for the schema.
	 *
	 *	@return	The ServerMethod Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerMethodFactory getFactoryServerMethod();

	/**
	 *	Get the ServerObjFunc Table interface for the schema.
	 *
	 *	@return	The ServerObjFunc Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerObjFuncTable getTableServerObjFunc();

	/**
	 *	Get the ServerObjFunc Factory interface for the schema.
	 *
	 *	@return	The ServerObjFunc Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerObjFuncFactory getFactoryServerObjFunc();

	/**
	 *	Get the ServerProc Table interface for the schema.
	 *
	 *	@return	The ServerProc Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerProcTable getTableServerProc();

	/**
	 *	Get the ServerProc Factory interface for the schema.
	 *
	 *	@return	The ServerProc Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamServerProcFactory getFactoryServerProc();

	/**
	 *	Get the Service Table interface for the schema.
	 *
	 *	@return	The Service Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecServiceTable getTableService();

	/**
	 *	Get the Service Factory interface for the schema.
	 *
	 *	@return	The Service Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecServiceFactory getFactoryService();

	/**
	 *	Get the ServiceType Table interface for the schema.
	 *
	 *	@return	The ServiceType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecServiceTypeTable getTableServiceType();

	/**
	 *	Get the ServiceType Factory interface for the schema.
	 *
	 *	@return	The ServiceType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecServiceTypeFactory getFactoryServiceType();

	/**
	 *	Get the StringCol Table interface for the schema.
	 *
	 *	@return	The StringCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamStringColTable getTableStringCol();

	/**
	 *	Get the StringCol Factory interface for the schema.
	 *
	 *	@return	The StringCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamStringColFactory getFactoryStringCol();

	/**
	 *	Get the StringDef Table interface for the schema.
	 *
	 *	@return	The StringDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamStringDefTable getTableStringDef();

	/**
	 *	Get the StringDef Factory interface for the schema.
	 *
	 *	@return	The StringDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamStringDefFactory getFactoryStringDef();

	/**
	 *	Get the StringType Table interface for the schema.
	 *
	 *	@return	The StringType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamStringTypeTable getTableStringType();

	/**
	 *	Get the StringType Factory interface for the schema.
	 *
	 *	@return	The StringType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamStringTypeFactory getFactoryStringType();

	/**
	 *	Get the SubProject Table interface for the schema.
	 *
	 *	@return	The SubProject Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntSubProjectTable getTableSubProject();

	/**
	 *	Get the SubProject Factory interface for the schema.
	 *
	 *	@return	The SubProject Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntSubProjectFactory getFactorySubProject();

	/**
	 *	Get the SysCluster Table interface for the schema.
	 *
	 *	@return	The SysCluster Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSysClusterTable getTableSysCluster();

	/**
	 *	Get the SysCluster Factory interface for the schema.
	 *
	 *	@return	The SysCluster Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecSysClusterFactory getFactorySysCluster();

	/**
	 *	Get the TSecGroup Table interface for the schema.
	 *
	 *	@return	The TSecGroup Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTSecGroupTable getTableTSecGroup();

	/**
	 *	Get the TSecGroup Factory interface for the schema.
	 *
	 *	@return	The TSecGroup Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTSecGroupFactory getFactoryTSecGroup();

	/**
	 *	Get the TSecGrpInc Table interface for the schema.
	 *
	 *	@return	The TSecGrpInc Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTSecGrpIncTable getTableTSecGrpInc();

	/**
	 *	Get the TSecGrpInc Factory interface for the schema.
	 *
	 *	@return	The TSecGrpInc Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTSecGrpIncFactory getFactoryTSecGrpInc();

	/**
	 *	Get the TSecGrpMemb Table interface for the schema.
	 *
	 *	@return	The TSecGrpMemb Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTSecGrpMembTable getTableTSecGrpMemb();

	/**
	 *	Get the TSecGrpMemb Factory interface for the schema.
	 *
	 *	@return	The TSecGrpMemb Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTSecGrpMembFactory getFactoryTSecGrpMemb();

	/**
	 *	Get the TZDateCol Table interface for the schema.
	 *
	 *	@return	The TZDateCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZDateColTable getTableTZDateCol();

	/**
	 *	Get the TZDateCol Factory interface for the schema.
	 *
	 *	@return	The TZDateCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZDateColFactory getFactoryTZDateCol();

	/**
	 *	Get the TZDateDef Table interface for the schema.
	 *
	 *	@return	The TZDateDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZDateDefTable getTableTZDateDef();

	/**
	 *	Get the TZDateDef Factory interface for the schema.
	 *
	 *	@return	The TZDateDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZDateDefFactory getFactoryTZDateDef();

	/**
	 *	Get the TZDateType Table interface for the schema.
	 *
	 *	@return	The TZDateType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZDateTypeTable getTableTZDateType();

	/**
	 *	Get the TZDateType Factory interface for the schema.
	 *
	 *	@return	The TZDateType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZDateTypeFactory getFactoryTZDateType();

	/**
	 *	Get the TZTimeCol Table interface for the schema.
	 *
	 *	@return	The TZTimeCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimeColTable getTableTZTimeCol();

	/**
	 *	Get the TZTimeCol Factory interface for the schema.
	 *
	 *	@return	The TZTimeCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimeColFactory getFactoryTZTimeCol();

	/**
	 *	Get the TZTimeDef Table interface for the schema.
	 *
	 *	@return	The TZTimeDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimeDefTable getTableTZTimeDef();

	/**
	 *	Get the TZTimeDef Factory interface for the schema.
	 *
	 *	@return	The TZTimeDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimeDefFactory getFactoryTZTimeDef();

	/**
	 *	Get the TZTimeType Table interface for the schema.
	 *
	 *	@return	The TZTimeType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimeTypeTable getTableTZTimeType();

	/**
	 *	Get the TZTimeType Factory interface for the schema.
	 *
	 *	@return	The TZTimeType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimeTypeFactory getFactoryTZTimeType();

	/**
	 *	Get the TZTimestampCol Table interface for the schema.
	 *
	 *	@return	The TZTimestampCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimestampColTable getTableTZTimestampCol();

	/**
	 *	Get the TZTimestampCol Factory interface for the schema.
	 *
	 *	@return	The TZTimestampCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimestampColFactory getFactoryTZTimestampCol();

	/**
	 *	Get the TZTimestampDef Table interface for the schema.
	 *
	 *	@return	The TZTimestampDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimestampDefTable getTableTZTimestampDef();

	/**
	 *	Get the TZTimestampDef Factory interface for the schema.
	 *
	 *	@return	The TZTimestampDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimestampDefFactory getFactoryTZTimestampDef();

	/**
	 *	Get the TZTimestampType Table interface for the schema.
	 *
	 *	@return	The TZTimestampType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimestampTypeTable getTableTZTimestampType();

	/**
	 *	Get the TZTimestampType Factory interface for the schema.
	 *
	 *	@return	The TZTimestampType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTZTimestampTypeFactory getFactoryTZTimestampType();

	/**
	 *	Get the Table Table interface for the schema.
	 *
	 *	@return	The Table Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTableTable getTableTable();

	/**
	 *	Get the Table Factory interface for the schema.
	 *
	 *	@return	The Table Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTableFactory getFactoryTable();

	/**
	 *	Get the TableCol Table interface for the schema.
	 *
	 *	@return	The TableCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTableColTable getTableTableCol();

	/**
	 *	Get the TableCol Factory interface for the schema.
	 *
	 *	@return	The TableCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTableColFactory getFactoryTableCol();

	/**
	 *	Get the TableTweak Table interface for the schema.
	 *
	 *	@return	The TableTweak Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTableTweakTable getTableTableTweak();

	/**
	 *	Get the TableTweak Factory interface for the schema.
	 *
	 *	@return	The TableTweak Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTableTweakFactory getFactoryTableTweak();

	/**
	 *	Get the Tenant Table interface for the schema.
	 *
	 *	@return	The Tenant Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTenantTable getTableTenant();

	/**
	 *	Get the Tenant Factory interface for the schema.
	 *
	 *	@return	The Tenant Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTenantFactory getFactoryTenant();

	/**
	 *	Get the TextCol Table interface for the schema.
	 *
	 *	@return	The TextCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTextColTable getTableTextCol();

	/**
	 *	Get the TextCol Factory interface for the schema.
	 *
	 *	@return	The TextCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTextColFactory getFactoryTextCol();

	/**
	 *	Get the TextDef Table interface for the schema.
	 *
	 *	@return	The TextDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTextDefTable getTableTextDef();

	/**
	 *	Get the TextDef Factory interface for the schema.
	 *
	 *	@return	The TextDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTextDefFactory getFactoryTextDef();

	/**
	 *	Get the TextType Table interface for the schema.
	 *
	 *	@return	The TextType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTextTypeTable getTableTextType();

	/**
	 *	Get the TextType Factory interface for the schema.
	 *
	 *	@return	The TextType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTextTypeFactory getFactoryTextType();

	/**
	 *	Get the TimeCol Table interface for the schema.
	 *
	 *	@return	The TimeCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimeColTable getTableTimeCol();

	/**
	 *	Get the TimeCol Factory interface for the schema.
	 *
	 *	@return	The TimeCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimeColFactory getFactoryTimeCol();

	/**
	 *	Get the TimeDef Table interface for the schema.
	 *
	 *	@return	The TimeDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimeDefTable getTableTimeDef();

	/**
	 *	Get the TimeDef Factory interface for the schema.
	 *
	 *	@return	The TimeDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimeDefFactory getFactoryTimeDef();

	/**
	 *	Get the TimeType Table interface for the schema.
	 *
	 *	@return	The TimeType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimeTypeTable getTableTimeType();

	/**
	 *	Get the TimeType Factory interface for the schema.
	 *
	 *	@return	The TimeType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimeTypeFactory getFactoryTimeType();

	/**
	 *	Get the TimestampCol Table interface for the schema.
	 *
	 *	@return	The TimestampCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimestampColTable getTableTimestampCol();

	/**
	 *	Get the TimestampCol Factory interface for the schema.
	 *
	 *	@return	The TimestampCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimestampColFactory getFactoryTimestampCol();

	/**
	 *	Get the TimestampDef Table interface for the schema.
	 *
	 *	@return	The TimestampDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimestampDefTable getTableTimestampDef();

	/**
	 *	Get the TimestampDef Factory interface for the schema.
	 *
	 *	@return	The TimestampDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimestampDefFactory getFactoryTimestampDef();

	/**
	 *	Get the TimestampType Table interface for the schema.
	 *
	 *	@return	The TimestampType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimestampTypeTable getTableTimestampType();

	/**
	 *	Get the TimestampType Factory interface for the schema.
	 *
	 *	@return	The TimestampType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTimestampTypeFactory getFactoryTimestampType();

	/**
	 *	Get the Tld Table interface for the schema.
	 *
	 *	@return	The Tld Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntTldTable getTableTld();

	/**
	 *	Get the Tld Factory interface for the schema.
	 *
	 *	@return	The Tld Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntTldFactory getFactoryTld();

	/**
	 *	Get the TokenCol Table interface for the schema.
	 *
	 *	@return	The TokenCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTokenColTable getTableTokenCol();

	/**
	 *	Get the TokenCol Factory interface for the schema.
	 *
	 *	@return	The TokenCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTokenColFactory getFactoryTokenCol();

	/**
	 *	Get the TokenDef Table interface for the schema.
	 *
	 *	@return	The TokenDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTokenDefTable getTableTokenDef();

	/**
	 *	Get the TokenDef Factory interface for the schema.
	 *
	 *	@return	The TokenDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTokenDefFactory getFactoryTokenDef();

	/**
	 *	Get the TokenType Table interface for the schema.
	 *
	 *	@return	The TokenType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTokenTypeTable getTableTokenType();

	/**
	 *	Get the TokenType Factory interface for the schema.
	 *
	 *	@return	The TokenType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTokenTypeFactory getFactoryTokenType();

	/**
	 *	Get the TopDomain Table interface for the schema.
	 *
	 *	@return	The TopDomain Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntTopDomainTable getTableTopDomain();

	/**
	 *	Get the TopDomain Factory interface for the schema.
	 *
	 *	@return	The TopDomain Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntTopDomainFactory getFactoryTopDomain();

	/**
	 *	Get the TopProject Table interface for the schema.
	 *
	 *	@return	The TopProject Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntTopProjectTable getTableTopProject();

	/**
	 *	Get the TopProject Factory interface for the schema.
	 *
	 *	@return	The TopProject Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntTopProjectFactory getFactoryTopProject();

	/**
	 *	Get the Tweak Table interface for the schema.
	 *
	 *	@return	The Tweak Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTweakTable getTableTweak();

	/**
	 *	Get the Tweak Factory interface for the schema.
	 *
	 *	@return	The Tweak Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamTweakFactory getFactoryTweak();

	/**
	 *	Get the UInt16Col Table interface for the schema.
	 *
	 *	@return	The UInt16Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt16ColTable getTableUInt16Col();

	/**
	 *	Get the UInt16Col Factory interface for the schema.
	 *
	 *	@return	The UInt16Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt16ColFactory getFactoryUInt16Col();

	/**
	 *	Get the UInt16Def Table interface for the schema.
	 *
	 *	@return	The UInt16Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt16DefTable getTableUInt16Def();

	/**
	 *	Get the UInt16Def Factory interface for the schema.
	 *
	 *	@return	The UInt16Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt16DefFactory getFactoryUInt16Def();

	/**
	 *	Get the UInt16Type Table interface for the schema.
	 *
	 *	@return	The UInt16Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt16TypeTable getTableUInt16Type();

	/**
	 *	Get the UInt16Type Factory interface for the schema.
	 *
	 *	@return	The UInt16Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt16TypeFactory getFactoryUInt16Type();

	/**
	 *	Get the UInt32Col Table interface for the schema.
	 *
	 *	@return	The UInt32Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt32ColTable getTableUInt32Col();

	/**
	 *	Get the UInt32Col Factory interface for the schema.
	 *
	 *	@return	The UInt32Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt32ColFactory getFactoryUInt32Col();

	/**
	 *	Get the UInt32Def Table interface for the schema.
	 *
	 *	@return	The UInt32Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt32DefTable getTableUInt32Def();

	/**
	 *	Get the UInt32Def Factory interface for the schema.
	 *
	 *	@return	The UInt32Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt32DefFactory getFactoryUInt32Def();

	/**
	 *	Get the UInt32Type Table interface for the schema.
	 *
	 *	@return	The UInt32Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt32TypeTable getTableUInt32Type();

	/**
	 *	Get the UInt32Type Factory interface for the schema.
	 *
	 *	@return	The UInt32Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt32TypeFactory getFactoryUInt32Type();

	/**
	 *	Get the UInt64Col Table interface for the schema.
	 *
	 *	@return	The UInt64Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt64ColTable getTableUInt64Col();

	/**
	 *	Get the UInt64Col Factory interface for the schema.
	 *
	 *	@return	The UInt64Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt64ColFactory getFactoryUInt64Col();

	/**
	 *	Get the UInt64Def Table interface for the schema.
	 *
	 *	@return	The UInt64Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt64DefTable getTableUInt64Def();

	/**
	 *	Get the UInt64Def Factory interface for the schema.
	 *
	 *	@return	The UInt64Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt64DefFactory getFactoryUInt64Def();

	/**
	 *	Get the UInt64Type Table interface for the schema.
	 *
	 *	@return	The UInt64Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt64TypeTable getTableUInt64Type();

	/**
	 *	Get the UInt64Type Factory interface for the schema.
	 *
	 *	@return	The UInt64Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUInt64TypeFactory getFactoryUInt64Type();

	/**
	 *	Get the URLProtocol Table interface for the schema.
	 *
	 *	@return	The URLProtocol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntURLProtocolTable getTableURLProtocol();

	/**
	 *	Get the URLProtocol Factory interface for the schema.
	 *
	 *	@return	The URLProtocol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFIntURLProtocolFactory getFactoryURLProtocol();

	/**
	 *	Get the Uuid6Col Table interface for the schema.
	 *
	 *	@return	The Uuid6Col Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6ColTable getTableUuid6Col();

	/**
	 *	Get the Uuid6Col Factory interface for the schema.
	 *
	 *	@return	The Uuid6Col Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6ColFactory getFactoryUuid6Col();

	/**
	 *	Get the Uuid6Def Table interface for the schema.
	 *
	 *	@return	The Uuid6Def Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6DefTable getTableUuid6Def();

	/**
	 *	Get the Uuid6Def Factory interface for the schema.
	 *
	 *	@return	The Uuid6Def Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6DefFactory getFactoryUuid6Def();

	/**
	 *	Get the Uuid6Gen Table interface for the schema.
	 *
	 *	@return	The Uuid6Gen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6GenTable getTableUuid6Gen();

	/**
	 *	Get the Uuid6Gen Factory interface for the schema.
	 *
	 *	@return	The Uuid6Gen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6GenFactory getFactoryUuid6Gen();

	/**
	 *	Get the Uuid6Type Table interface for the schema.
	 *
	 *	@return	The Uuid6Type Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6TypeTable getTableUuid6Type();

	/**
	 *	Get the Uuid6Type Factory interface for the schema.
	 *
	 *	@return	The Uuid6Type Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuid6TypeFactory getFactoryUuid6Type();

	/**
	 *	Get the UuidCol Table interface for the schema.
	 *
	 *	@return	The UuidCol Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidColTable getTableUuidCol();

	/**
	 *	Get the UuidCol Factory interface for the schema.
	 *
	 *	@return	The UuidCol Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidColFactory getFactoryUuidCol();

	/**
	 *	Get the UuidDef Table interface for the schema.
	 *
	 *	@return	The UuidDef Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidDefTable getTableUuidDef();

	/**
	 *	Get the UuidDef Factory interface for the schema.
	 *
	 *	@return	The UuidDef Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidDefFactory getFactoryUuidDef();

	/**
	 *	Get the UuidGen Table interface for the schema.
	 *
	 *	@return	The UuidGen Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidGenTable getTableUuidGen();

	/**
	 *	Get the UuidGen Factory interface for the schema.
	 *
	 *	@return	The UuidGen Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidGenFactory getFactoryUuidGen();

	/**
	 *	Get the UuidType Table interface for the schema.
	 *
	 *	@return	The UuidType Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidTypeTable getTableUuidType();

	/**
	 *	Get the UuidType Factory interface for the schema.
	 *
	 *	@return	The UuidType Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamUuidTypeFactory getFactoryUuidType();

	/**
	 *	Get the Value Table interface for the schema.
	 *
	 *	@return	The Value Table interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamValueTable getTableValue();

	/**
	 *	Get the Value Factory interface for the schema.
	 *
	 *	@return	The Value Factory interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFBamValueFactory getFactoryValue();

	/**
	 *	If a transaction is already opened for the schema connection,
	 *	return false.  If a new transaction is successfully opened,
	 *	return true.  Otherwise throw a RuntimeException detailing
	 *	why a transaction could not be initiated.
	 *	<p>
	 *	This permits the database persistence implementations to
	 *	switch between participating in an existing transaction
	 *	or implementing an implicit atomic transaction that is
	 *	committed or rolled back before the method returns:
	 *	<p>
	 *		boolean txnInitiated = false;
	 *		try {
	 *			txnInitiated = schema.beginTransaction();
	 *			... business logic and presentation code ...
	 *			if( txnInitiated ) {
	 *				schema.commit();
	 *			}
	 *		}
	 *		catch( RuntimeException e ) {
	 *			if( txnInitiated ) {
	 *				try {
	 *					schema.rollback();
	 *				}
	 *				catch( RuntimeException e ) {
	 *				}
	 *			}
	 *			... report exception or throw exception with cause ...
	 *		}
	 *	<p>
	 *	As the current web-form focused implementation will be managing
	 *	the transactions in the Servlet page response, I don't need to
	 *	implement the atomic transaction wrappers yet.
	 */

	/**
	 *	The client-side implementations always return true for this method.
	 *
	 *	@return	True if there is currently a transaction open, otherwise false.
	 *		Client-side implementations always return true.
	 */
	boolean isTransactionOpen();

	/**
	 *	Begin a transaction.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	boolean beginTransaction();

	/**
	 *	Commit the current open transaction.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void commit();

	/**
	 *	Roll back the current open transaction.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void rollback();

	/**
	 *	Get the Table Permissions interface for the schema.
	 *
	 *	@return	The Table Permissions interface for the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	IYCFSecTablePerms getTablePerms();

	/**
	 *	Set the Table Permissions interface for the schema.
	 *
	 *	@param	value	The Table Permissions interface to be used by the schema.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void setTablePerms( IYCFSecTablePerms value );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@Exception YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();

	/**
	 *	When you first connect to a database, you can opt to specify a database
	 *	schema name to be used by the session.  The implementation code must always
	 *	be dynamically based on the invocation of <tt>String getDbSchemaName()</tt>
	 *	at runtime.
	 *	<p>
	 *	The initial value is defined by the implementing schema model which has inherited
	 *	the expression of the current schema model being expanded.  That is, it is specified
	 *	in the DbSchemaName attribute of a SchemaDef instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	String getDbSchemaName();
	String getLowerDbSchemaName();

	/**
	 *	The database is expected to override this implementation and invoke the
	 *	<tt>super.setDbSchemaName( String argDbSchemaName )</tt> early
	 *	on in the implementation of the cust body.  You should let the exceptions
	 *	which can be thrown by this implementation pass unimpeded.
	 *	<pg>
	 *	When you set the database schema name, the database-specific implementation
	 *	of this method does a "commit; use database"-type sequence to change
	 *	to the target database.  This should be specified globally for all
	 *	database connections in a given cluster, so that all of
	 *	the application implementation clients are using the same database instance
	 *	regardless of what's been provided by the cust client implementation,
	 *	be it as a Java application or a web interface written using JEE.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void setDbSchemaName( String argDbSchemaName );
}

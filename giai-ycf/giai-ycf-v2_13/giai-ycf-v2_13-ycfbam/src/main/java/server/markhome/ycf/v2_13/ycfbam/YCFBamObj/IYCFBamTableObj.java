// Description: Java 11 Object interface for YCFBam Table.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamTableObj
	extends IYCFBamScopeObj
{
	/**
	 *	Get the current edition of this Table instance as a IYCFBamTableEditObj.
	 *
	 *	@return	The IYCFBamTableEditObj edition of this instance.
	 */
	IYCFBamTableEditObj getEditAsTable();

	/**
	 *	Get the IYCFBamTableTableObj table cache which manages this instance.
	 *
	 *	@return	IYCFBamTableTableObj table cache which manages this instance.
	 */
	IYCFBamTableTableObj getTableTable();

	/**
	 *	Get the YCFBamTableBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	YCFBamTableBuff instance which currently backs this object.
	 */
	YCFBamTableBuff getTableBuff();

	/**
	 *	Get the required long attribute SchemaDefId.
	 *
	 *	@return	The required long attribute SchemaDefId.
	 */
	long getRequiredSchemaDefId();

	/**
	 *	Get the optional Long attribute DefSchemaTenantId.
	 *
	 *	@return	The optional Long attribute DefSchemaTenantId.
	 */
	Long getOptionalDefSchemaTenantId();

	/**
	 *	Get the optional Long attribute DefSchemaId.
	 *
	 *	@return	The optional Long attribute DefSchemaId.
	 */
	Long getOptionalDefSchemaId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute DbName.
	 *
	 *	@return	The optional String attribute DbName.
	 */
	String getOptionalDbName();

	/**
	 *	Get the optional String attribute ShortName.
	 *
	 *	@return	The optional String attribute ShortName.
	 */
	String getOptionalShortName();

	/**
	 *	Get the optional String attribute Label.
	 *
	 *	@return	The optional String attribute Label.
	 */
	String getOptionalLabel();

	/**
	 *	Get the optional String attribute ShortDescription.
	 *
	 *	@return	The optional String attribute ShortDescription.
	 */
	String getOptionalShortDescription();

	/**
	 *	Get the optional String attribute Description.
	 *
	 *	@return	The optional String attribute Description.
	 */
	String getOptionalDescription();

	/**
	 *	Get the required boolean attribute PageData.
	 *
	 *	@return	The required boolean attribute PageData.
	 */
	boolean getRequiredPageData();

	/**
	 *	Get the optional Long attribute PrimaryIndexTenantId.
	 *
	 *	@return	The optional Long attribute PrimaryIndexTenantId.
	 */
	Long getOptionalPrimaryIndexTenantId();

	/**
	 *	Get the optional Long attribute PrimaryIndexId.
	 *
	 *	@return	The optional Long attribute PrimaryIndexId.
	 */
	Long getOptionalPrimaryIndexId();

	/**
	 *	Get the required String attribute TableClassCode.
	 *
	 *	@return	The required String attribute TableClassCode.
	 */
	String getRequiredTableClassCode();

	/**
	 *	Get the optional Long attribute LookupIndexTenantId.
	 *
	 *	@return	The optional Long attribute LookupIndexTenantId.
	 */
	Long getOptionalLookupIndexTenantId();

	/**
	 *	Get the optional Long attribute LookupIndexId.
	 *
	 *	@return	The optional Long attribute LookupIndexId.
	 */
	Long getOptionalLookupIndexId();

	/**
	 *	Get the optional Long attribute AltIndexTenantId.
	 *
	 *	@return	The optional Long attribute AltIndexTenantId.
	 */
	Long getOptionalAltIndexTenantId();

	/**
	 *	Get the optional Long attribute AltIndexId.
	 *
	 *	@return	The optional Long attribute AltIndexId.
	 */
	Long getOptionalAltIndexId();

	/**
	 *	Get the optional Long attribute QualifyingTenantId.
	 *
	 *	@return	The optional Long attribute QualifyingTenantId.
	 */
	Long getOptionalQualifyingTenantId();

	/**
	 *	Get the optional Long attribute QualifyingTableId.
	 *
	 *	@return	The optional Long attribute QualifyingTableId.
	 */
	Long getOptionalQualifyingTableId();

	/**
	 *	Get the required boolean attribute IsInstantiable.
	 *
	 *	@return	The required boolean attribute IsInstantiable.
	 */
	boolean getRequiredIsInstantiable();

	/**
	 *	Get the required boolean attribute HasHistory.
	 *
	 *	@return	The required boolean attribute HasHistory.
	 */
	boolean getRequiredHasHistory();

	/**
	 *	Get the required boolean attribute HasAuditColumns.
	 *
	 *	@return	The required boolean attribute HasAuditColumns.
	 */
	boolean getRequiredHasAuditColumns();

	/**
	 *	Get the required boolean attribute IsMutable.
	 *
	 *	@return	The required boolean attribute IsMutable.
	 */
	boolean getRequiredIsMutable();

	/**
	 *	Get the required boolean attribute IsServerOnly.
	 *
	 *	@return	The required boolean attribute IsServerOnly.
	 */
	boolean getRequiredIsServerOnly();

	/**
	 *	Get the required IYCFBamSchema.LoaderBehaviourEnum attribute LoaderBehaviour.
	 *
	 *	@return	The required IYCFBamSchema.LoaderBehaviourEnum attribute LoaderBehaviour.
	 */
	IYCFBamSchema.LoaderBehaviourEnum getRequiredLoaderBehaviour();

	/**
	 *	Get the required IYCFBamSchema.SecScopeEnum attribute SecScope.
	 *
	 *	@return	The required IYCFBamSchema.SecScopeEnum attribute SecScope.
	 */
	IYCFBamSchema.SecScopeEnum getRequiredSecScope();

	/**
	 *	Get the required IYCFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 *
	 *	@return	The required IYCFBamSchema.CodeVisibilityEnum attribute CodeVis.
	 */
	IYCFBamSchema.CodeVisibilityEnum getRequiredCodeVis();

	/**
	 *	Get the optional String attribute JObjMembers.
	 *
	 *	@return	The optional String attribute JObjMembers.
	 */
	String getOptionalJObjMembers();

	/**
	 *	Get the optional String attribute JObjInterface.
	 *
	 *	@return	The optional String attribute JObjInterface.
	 */
	String getOptionalJObjInterface();

	/**
	 *	Get the optional String attribute JObjImport.
	 *
	 *	@return	The optional String attribute JObjImport.
	 */
	String getOptionalJObjImport();

	/**
	 *	Get the optional String attribute JObjImplementation.
	 *
	 *	@return	The optional String attribute JObjImplementation.
	 */
	String getOptionalJObjImplementation();

	/**
	 *	Get the optional String attribute JEditObjMembers.
	 *
	 *	@return	The optional String attribute JEditObjMembers.
	 */
	String getOptionalJEditObjMembers();

	/**
	 *	Get the optional String attribute JEditObjInterface.
	 *
	 *	@return	The optional String attribute JEditObjInterface.
	 */
	String getOptionalJEditObjInterface();

	/**
	 *	Get the optional String attribute JEditObjImport.
	 *
	 *	@return	The optional String attribute JEditObjImport.
	 */
	String getOptionalJEditObjImport();

	/**
	 *	Get the optional String attribute JEditObjImplementation.
	 *
	 *	@return	The optional String attribute JEditObjImplementation.
	 */
	String getOptionalJEditObjImplementation();

	/**
	 *	Get the optional String attribute JTableImport.
	 *
	 *	@return	The optional String attribute JTableImport.
	 */
	String getOptionalJTableImport();

	/**
	 *	Get the optional String attribute JTableMembers.
	 *
	 *	@return	The optional String attribute JTableMembers.
	 */
	String getOptionalJTableMembers();

	/**
	 *	Get the optional String attribute JTableInterface.
	 *
	 *	@return	The optional String attribute JTableInterface.
	 */
	String getOptionalJTableInterface();

	/**
	 *	Get the optional String attribute JTableImplementation.
	 *
	 *	@return	The optional String attribute JTableImplementation.
	 */
	String getOptionalJTableImplementation();

	/**
	 *	Get the optional String attribute JTableObjImport.
	 *
	 *	@return	The optional String attribute JTableObjImport.
	 */
	String getOptionalJTableObjImport();

	/**
	 *	Get the optional String attribute JTableObjMembers.
	 *
	 *	@return	The optional String attribute JTableObjMembers.
	 */
	String getOptionalJTableObjMembers();

	/**
	 *	Get the optional String attribute JTableObjInterface.
	 *
	 *	@return	The optional String attribute JTableObjInterface.
	 */
	String getOptionalJTableObjInterface();

	/**
	 *	Get the optional String attribute JTableObjImplementation.
	 *
	 *	@return	The optional String attribute JTableObjImplementation.
	 */
	String getOptionalJTableObjImplementation();

	/**
	 *	Get the optional String attribute JDb2LUWTableImport.
	 *
	 *	@return	The optional String attribute JDb2LUWTableImport.
	 */
	String getOptionalJDb2LUWTableImport();

	/**
	 *	Get the optional String attribute JDb2LUWTableMembers.
	 *
	 *	@return	The optional String attribute JDb2LUWTableMembers.
	 */
	String getOptionalJDb2LUWTableMembers();

	/**
	 *	Get the optional String attribute JDb2LUWTableImplementation.
	 *
	 *	@return	The optional String attribute JDb2LUWTableImplementation.
	 */
	String getOptionalJDb2LUWTableImplementation();

	/**
	 *	Get the optional String attribute JMSSqlTableImport.
	 *
	 *	@return	The optional String attribute JMSSqlTableImport.
	 */
	String getOptionalJMSSqlTableImport();

	/**
	 *	Get the optional String attribute JMSSqlTableMembers.
	 *
	 *	@return	The optional String attribute JMSSqlTableMembers.
	 */
	String getOptionalJMSSqlTableMembers();

	/**
	 *	Get the optional String attribute JMSSqlTableImplementation.
	 *
	 *	@return	The optional String attribute JMSSqlTableImplementation.
	 */
	String getOptionalJMSSqlTableImplementation();

	/**
	 *	Get the optional String attribute JMySqlTableImport.
	 *
	 *	@return	The optional String attribute JMySqlTableImport.
	 */
	String getOptionalJMySqlTableImport();

	/**
	 *	Get the optional String attribute JMySqlTableMembers.
	 *
	 *	@return	The optional String attribute JMySqlTableMembers.
	 */
	String getOptionalJMySqlTableMembers();

	/**
	 *	Get the optional String attribute JMySqlTableImplementation.
	 *
	 *	@return	The optional String attribute JMySqlTableImplementation.
	 */
	String getOptionalJMySqlTableImplementation();

	/**
	 *	Get the optional String attribute JOracleTableImport.
	 *
	 *	@return	The optional String attribute JOracleTableImport.
	 */
	String getOptionalJOracleTableImport();

	/**
	 *	Get the optional String attribute JOracleTableMembers.
	 *
	 *	@return	The optional String attribute JOracleTableMembers.
	 */
	String getOptionalJOracleTableMembers();

	/**
	 *	Get the optional String attribute JOracleTableImplementation.
	 *
	 *	@return	The optional String attribute JOracleTableImplementation.
	 */
	String getOptionalJOracleTableImplementation();

	/**
	 *	Get the optional String attribute JPgSqlTableImport.
	 *
	 *	@return	The optional String attribute JPgSqlTableImport.
	 */
	String getOptionalJPgSqlTableImport();

	/**
	 *	Get the optional String attribute JPgSqlTableMembers.
	 *
	 *	@return	The optional String attribute JPgSqlTableMembers.
	 */
	String getOptionalJPgSqlTableMembers();

	/**
	 *	Get the optional String attribute JPgSqlTableImplementation.
	 *
	 *	@return	The optional String attribute JPgSqlTableImplementation.
	 */
	String getOptionalJPgSqlTableImplementation();

	/**
	 *	Get the optional String attribute JRamTableImport.
	 *
	 *	@return	The optional String attribute JRamTableImport.
	 */
	String getOptionalJRamTableImport();

	/**
	 *	Get the optional String attribute JRamTableMembers.
	 *
	 *	@return	The optional String attribute JRamTableMembers.
	 */
	String getOptionalJRamTableMembers();

	/**
	 *	Get the optional String attribute JRamTableImplementation.
	 *
	 *	@return	The optional String attribute JRamTableImplementation.
	 */
	String getOptionalJRamTableImplementation();

	/**
	 *	Get the optional String attribute JSaxLoaderImport.
	 *
	 *	@return	The optional String attribute JSaxLoaderImport.
	 */
	String getOptionalJSaxLoaderImport();

	/**
	 *	Get the optional String attribute JSaxLoaderStartElement.
	 *
	 *	@return	The optional String attribute JSaxLoaderStartElement.
	 */
	String getOptionalJSaxLoaderStartElement();

	/**
	 *	Get the optional String attribute JSaxLoaderEndElement.
	 *
	 *	@return	The optional String attribute JSaxLoaderEndElement.
	 */
	String getOptionalJSaxLoaderEndElement();

	/**
	 *	Get the optional String attribute JXMsgTableImport.
	 *
	 *	@return	The optional String attribute JXMsgTableImport.
	 */
	String getOptionalJXMsgTableImport();

	/**
	 *	Get the optional String attribute JXMsgTableFormatters.
	 *
	 *	@return	The optional String attribute JXMsgTableFormatters.
	 */
	String getOptionalJXMsgTableFormatters();

	/**
	 *	Get the optional String attribute JXMsgRqstTableImport.
	 *
	 *	@return	The optional String attribute JXMsgRqstTableImport.
	 */
	String getOptionalJXMsgRqstTableImport();

	/**
	 *	Get the optional String attribute JXMsgRspnTableImport.
	 *
	 *	@return	The optional String attribute JXMsgRspnTableImport.
	 */
	String getOptionalJXMsgRspnTableImport();

	/**
	 *	Get the optional String attribute JXMsgClientTableImport.
	 *
	 *	@return	The optional String attribute JXMsgClientTableImport.
	 */
	String getOptionalJXMsgClientTableImport();

	/**
	 *	Get the optional String attribute JXMsgRqstTableBody.
	 *
	 *	@return	The optional String attribute JXMsgRqstTableBody.
	 */
	String getOptionalJXMsgRqstTableBody();

	/**
	 *	Get the optional String attribute JXMsgRspnTableBody.
	 *
	 *	@return	The optional String attribute JXMsgRspnTableBody.
	 */
	String getOptionalJXMsgRspnTableBody();

	/**
	 *	Get the optional String attribute JXMsgClientTableBody.
	 *
	 *	@return	The optional String attribute JXMsgClientTableBody.
	 */
	String getOptionalJXMsgClientTableBody();

	/**
	 *	Get the optional String attribute CppObjMembers.
	 *
	 *	@return	The optional String attribute CppObjMembers.
	 */
	String getOptionalCppObjMembers();

	/**
	 *	Get the optional String attribute CppObjInterface.
	 *
	 *	@return	The optional String attribute CppObjInterface.
	 */
	String getOptionalCppObjInterface();

	/**
	 *	Get the optional String attribute CppObjInclude.
	 *
	 *	@return	The optional String attribute CppObjInclude.
	 */
	String getOptionalCppObjInclude();

	/**
	 *	Get the optional String attribute CppObjImplementation.
	 *
	 *	@return	The optional String attribute CppObjImplementation.
	 */
	String getOptionalCppObjImplementation();

	/**
	 *	Get the optional String attribute CppEditObjMembers.
	 *
	 *	@return	The optional String attribute CppEditObjMembers.
	 */
	String getOptionalCppEditObjMembers();

	/**
	 *	Get the optional String attribute CppEditObjInterface.
	 *
	 *	@return	The optional String attribute CppEditObjInterface.
	 */
	String getOptionalCppEditObjInterface();

	/**
	 *	Get the optional String attribute CppEditObjInclude.
	 *
	 *	@return	The optional String attribute CppEditObjInclude.
	 */
	String getOptionalCppEditObjInclude();

	/**
	 *	Get the optional String attribute CppEditObjImplementation.
	 *
	 *	@return	The optional String attribute CppEditObjImplementation.
	 */
	String getOptionalCppEditObjImplementation();

	/**
	 *	Get the optional String attribute CppTableInclude.
	 *
	 *	@return	The optional String attribute CppTableInclude.
	 */
	String getOptionalCppTableInclude();

	/**
	 *	Get the optional String attribute CppTableMembers.
	 *
	 *	@return	The optional String attribute CppTableMembers.
	 */
	String getOptionalCppTableMembers();

	/**
	 *	Get the optional String attribute CppTableInterface.
	 *
	 *	@return	The optional String attribute CppTableInterface.
	 */
	String getOptionalCppTableInterface();

	/**
	 *	Get the optional String attribute CppTableImplementation.
	 *
	 *	@return	The optional String attribute CppTableImplementation.
	 */
	String getOptionalCppTableImplementation();

	/**
	 *	Get the optional String attribute CppTableObjInclude.
	 *
	 *	@return	The optional String attribute CppTableObjInclude.
	 */
	String getOptionalCppTableObjInclude();

	/**
	 *	Get the optional String attribute CppTableObjMembers.
	 *
	 *	@return	The optional String attribute CppTableObjMembers.
	 */
	String getOptionalCppTableObjMembers();

	/**
	 *	Get the optional String attribute CppTableObjInterface.
	 *
	 *	@return	The optional String attribute CppTableObjInterface.
	 */
	String getOptionalCppTableObjInterface();

	/**
	 *	Get the optional String attribute CppTableObjImplementation.
	 *
	 *	@return	The optional String attribute CppTableObjImplementation.
	 */
	String getOptionalCppTableObjImplementation();

	/**
	 *	Get the optional String attribute CppDb2LUWTableInclude.
	 *
	 *	@return	The optional String attribute CppDb2LUWTableInclude.
	 */
	String getOptionalCppDb2LUWTableInclude();

	/**
	 *	Get the optional String attribute CppDb2LUWTableMembers.
	 *
	 *	@return	The optional String attribute CppDb2LUWTableMembers.
	 */
	String getOptionalCppDb2LUWTableMembers();

	/**
	 *	Get the optional String attribute CppDb2LUWTableImplementation.
	 *
	 *	@return	The optional String attribute CppDb2LUWTableImplementation.
	 */
	String getOptionalCppDb2LUWTableImplementation();

	/**
	 *	Get the optional String attribute CppMSSqlTableInclude.
	 *
	 *	@return	The optional String attribute CppMSSqlTableInclude.
	 */
	String getOptionalCppMSSqlTableInclude();

	/**
	 *	Get the optional String attribute CppMSSqlTableMembers.
	 *
	 *	@return	The optional String attribute CppMSSqlTableMembers.
	 */
	String getOptionalCppMSSqlTableMembers();

	/**
	 *	Get the optional String attribute CppMSSqlTableImplementation.
	 *
	 *	@return	The optional String attribute CppMSSqlTableImplementation.
	 */
	String getOptionalCppMSSqlTableImplementation();

	/**
	 *	Get the optional String attribute CppMySqlTableInclude.
	 *
	 *	@return	The optional String attribute CppMySqlTableInclude.
	 */
	String getOptionalCppMySqlTableInclude();

	/**
	 *	Get the optional String attribute CppMySqlTableMembers.
	 *
	 *	@return	The optional String attribute CppMySqlTableMembers.
	 */
	String getOptionalCppMySqlTableMembers();

	/**
	 *	Get the optional String attribute CppMySqlTableImplementation.
	 *
	 *	@return	The optional String attribute CppMySqlTableImplementation.
	 */
	String getOptionalCppMySqlTableImplementation();

	/**
	 *	Get the optional String attribute CppOracleTableInclude.
	 *
	 *	@return	The optional String attribute CppOracleTableInclude.
	 */
	String getOptionalCppOracleTableInclude();

	/**
	 *	Get the optional String attribute CppOracleTableMembers.
	 *
	 *	@return	The optional String attribute CppOracleTableMembers.
	 */
	String getOptionalCppOracleTableMembers();

	/**
	 *	Get the optional String attribute CppOracleTableImplementation.
	 *
	 *	@return	The optional String attribute CppOracleTableImplementation.
	 */
	String getOptionalCppOracleTableImplementation();

	/**
	 *	Get the optional String attribute CppPgSqlTableInclude.
	 *
	 *	@return	The optional String attribute CppPgSqlTableInclude.
	 */
	String getOptionalCppPgSqlTableInclude();

	/**
	 *	Get the optional String attribute CppPgSqlTableMembers.
	 *
	 *	@return	The optional String attribute CppPgSqlTableMembers.
	 */
	String getOptionalCppPgSqlTableMembers();

	/**
	 *	Get the optional String attribute CppPgSqlTableImplementation.
	 *
	 *	@return	The optional String attribute CppPgSqlTableImplementation.
	 */
	String getOptionalCppPgSqlTableImplementation();

	/**
	 *	Get the optional String attribute CppRamTableInclude.
	 *
	 *	@return	The optional String attribute CppRamTableInclude.
	 */
	String getOptionalCppRamTableInclude();

	/**
	 *	Get the optional String attribute CppRamTableMembers.
	 *
	 *	@return	The optional String attribute CppRamTableMembers.
	 */
	String getOptionalCppRamTableMembers();

	/**
	 *	Get the optional String attribute CppRamTableImplementation.
	 *
	 *	@return	The optional String attribute CppRamTableImplementation.
	 */
	String getOptionalCppRamTableImplementation();

	/**
	 *	Get the optional String attribute CppSaxLoaderInclude.
	 *
	 *	@return	The optional String attribute CppSaxLoaderInclude.
	 */
	String getOptionalCppSaxLoaderInclude();

	/**
	 *	Get the optional String attribute CppSaxLoaderStartElement.
	 *
	 *	@return	The optional String attribute CppSaxLoaderStartElement.
	 */
	String getOptionalCppSaxLoaderStartElement();

	/**
	 *	Get the optional String attribute CppSaxLoaderEndElement.
	 *
	 *	@return	The optional String attribute CppSaxLoaderEndElement.
	 */
	String getOptionalCppSaxLoaderEndElement();

	/**
	 *	Get the optional String attribute CppXMsgTableInclude.
	 *
	 *	@return	The optional String attribute CppXMsgTableInclude.
	 */
	String getOptionalCppXMsgTableInclude();

	/**
	 *	Get the optional String attribute CppXMsgTableFormatters.
	 *
	 *	@return	The optional String attribute CppXMsgTableFormatters.
	 */
	String getOptionalCppXMsgTableFormatters();

	/**
	 *	Get the optional String attribute CppXMsgRqstTableInclude.
	 *
	 *	@return	The optional String attribute CppXMsgRqstTableInclude.
	 */
	String getOptionalCppXMsgRqstTableInclude();

	/**
	 *	Get the optional String attribute CppXMsgRspnTableInclude.
	 *
	 *	@return	The optional String attribute CppXMsgRspnTableInclude.
	 */
	String getOptionalCppXMsgRspnTableInclude();

	/**
	 *	Get the optional String attribute CppXMsgClientTableInclude.
	 *
	 *	@return	The optional String attribute CppXMsgClientTableInclude.
	 */
	String getOptionalCppXMsgClientTableInclude();

	/**
	 *	Get the optional String attribute CppXMsgRqstTableBody.
	 *
	 *	@return	The optional String attribute CppXMsgRqstTableBody.
	 */
	String getOptionalCppXMsgRqstTableBody();

	/**
	 *	Get the optional String attribute CppXMsgRspnTableBody.
	 *
	 *	@return	The optional String attribute CppXMsgRspnTableBody.
	 */
	String getOptionalCppXMsgRspnTableBody();

	/**
	 *	Get the optional String attribute CppXMsgClientTableBody.
	 *
	 *	@return	The optional String attribute CppXMsgClientTableBody.
	 */
	String getOptionalCppXMsgClientTableBody();

	/**
	 *	Get the optional String attribute HppObjMembers.
	 *
	 *	@return	The optional String attribute HppObjMembers.
	 */
	String getOptionalHppObjMembers();

	/**
	 *	Get the optional String attribute HppObjInterface.
	 *
	 *	@return	The optional String attribute HppObjInterface.
	 */
	String getOptionalHppObjInterface();

	/**
	 *	Get the optional String attribute HppObjInclude.
	 *
	 *	@return	The optional String attribute HppObjInclude.
	 */
	String getOptionalHppObjInclude();

	/**
	 *	Get the optional String attribute HppObjImplementation.
	 *
	 *	@return	The optional String attribute HppObjImplementation.
	 */
	String getOptionalHppObjImplementation();

	/**
	 *	Get the optional String attribute HppEditObjMembers.
	 *
	 *	@return	The optional String attribute HppEditObjMembers.
	 */
	String getOptionalHppEditObjMembers();

	/**
	 *	Get the optional String attribute HppEditObjInterface.
	 *
	 *	@return	The optional String attribute HppEditObjInterface.
	 */
	String getOptionalHppEditObjInterface();

	/**
	 *	Get the optional String attribute HppEditObjInclude.
	 *
	 *	@return	The optional String attribute HppEditObjInclude.
	 */
	String getOptionalHppEditObjInclude();

	/**
	 *	Get the optional String attribute HppEditObjImplementation.
	 *
	 *	@return	The optional String attribute HppEditObjImplementation.
	 */
	String getOptionalHppEditObjImplementation();

	/**
	 *	Get the optional String attribute HppTableInclude.
	 *
	 *	@return	The optional String attribute HppTableInclude.
	 */
	String getOptionalHppTableInclude();

	/**
	 *	Get the optional String attribute HppTableMembers.
	 *
	 *	@return	The optional String attribute HppTableMembers.
	 */
	String getOptionalHppTableMembers();

	/**
	 *	Get the optional String attribute HppTableInterface.
	 *
	 *	@return	The optional String attribute HppTableInterface.
	 */
	String getOptionalHppTableInterface();

	/**
	 *	Get the optional String attribute HppTableImplementation.
	 *
	 *	@return	The optional String attribute HppTableImplementation.
	 */
	String getOptionalHppTableImplementation();

	/**
	 *	Get the optional String attribute HppTableObjInclude.
	 *
	 *	@return	The optional String attribute HppTableObjInclude.
	 */
	String getOptionalHppTableObjInclude();

	/**
	 *	Get the optional String attribute HppTableObjMembers.
	 *
	 *	@return	The optional String attribute HppTableObjMembers.
	 */
	String getOptionalHppTableObjMembers();

	/**
	 *	Get the optional String attribute HppTableObjInterface.
	 *
	 *	@return	The optional String attribute HppTableObjInterface.
	 */
	String getOptionalHppTableObjInterface();

	/**
	 *	Get the optional String attribute HppTableObjImplementation.
	 *
	 *	@return	The optional String attribute HppTableObjImplementation.
	 */
	String getOptionalHppTableObjImplementation();

	/**
	 *	Get the optional String attribute HppDb2LUWTableInclude.
	 *
	 *	@return	The optional String attribute HppDb2LUWTableInclude.
	 */
	String getOptionalHppDb2LUWTableInclude();

	/**
	 *	Get the optional String attribute HppDb2LUWTableMembers.
	 *
	 *	@return	The optional String attribute HppDb2LUWTableMembers.
	 */
	String getOptionalHppDb2LUWTableMembers();

	/**
	 *	Get the optional String attribute HppDb2LUWTableImplementation.
	 *
	 *	@return	The optional String attribute HppDb2LUWTableImplementation.
	 */
	String getOptionalHppDb2LUWTableImplementation();

	/**
	 *	Get the optional String attribute HppMSSqlTableInclude.
	 *
	 *	@return	The optional String attribute HppMSSqlTableInclude.
	 */
	String getOptionalHppMSSqlTableInclude();

	/**
	 *	Get the optional String attribute HppMSSqlTableMembers.
	 *
	 *	@return	The optional String attribute HppMSSqlTableMembers.
	 */
	String getOptionalHppMSSqlTableMembers();

	/**
	 *	Get the optional String attribute HppMSSqlTableImplementation.
	 *
	 *	@return	The optional String attribute HppMSSqlTableImplementation.
	 */
	String getOptionalHppMSSqlTableImplementation();

	/**
	 *	Get the optional String attribute HppMySqlTableInclude.
	 *
	 *	@return	The optional String attribute HppMySqlTableInclude.
	 */
	String getOptionalHppMySqlTableInclude();

	/**
	 *	Get the optional String attribute HppMySqlTableMembers.
	 *
	 *	@return	The optional String attribute HppMySqlTableMembers.
	 */
	String getOptionalHppMySqlTableMembers();

	/**
	 *	Get the optional String attribute HppMySqlTableImplementation.
	 *
	 *	@return	The optional String attribute HppMySqlTableImplementation.
	 */
	String getOptionalHppMySqlTableImplementation();

	/**
	 *	Get the optional String attribute HppOracleTableInclude.
	 *
	 *	@return	The optional String attribute HppOracleTableInclude.
	 */
	String getOptionalHppOracleTableInclude();

	/**
	 *	Get the optional String attribute HppOracleTableMembers.
	 *
	 *	@return	The optional String attribute HppOracleTableMembers.
	 */
	String getOptionalHppOracleTableMembers();

	/**
	 *	Get the optional String attribute HppOracleTableImplementation.
	 *
	 *	@return	The optional String attribute HppOracleTableImplementation.
	 */
	String getOptionalHppOracleTableImplementation();

	/**
	 *	Get the optional String attribute HppPgSqlTableInclude.
	 *
	 *	@return	The optional String attribute HppPgSqlTableInclude.
	 */
	String getOptionalHppPgSqlTableInclude();

	/**
	 *	Get the optional String attribute HppPgSqlTableMembers.
	 *
	 *	@return	The optional String attribute HppPgSqlTableMembers.
	 */
	String getOptionalHppPgSqlTableMembers();

	/**
	 *	Get the optional String attribute HppPgSqlTableImplementation.
	 *
	 *	@return	The optional String attribute HppPgSqlTableImplementation.
	 */
	String getOptionalHppPgSqlTableImplementation();

	/**
	 *	Get the optional String attribute HppRamTableInclude.
	 *
	 *	@return	The optional String attribute HppRamTableInclude.
	 */
	String getOptionalHppRamTableInclude();

	/**
	 *	Get the optional String attribute HppRamTableMembers.
	 *
	 *	@return	The optional String attribute HppRamTableMembers.
	 */
	String getOptionalHppRamTableMembers();

	/**
	 *	Get the optional String attribute HppRamTableImplementation.
	 *
	 *	@return	The optional String attribute HppRamTableImplementation.
	 */
	String getOptionalHppRamTableImplementation();

	/**
	 *	Get the optional String attribute HppSaxLoaderInclude.
	 *
	 *	@return	The optional String attribute HppSaxLoaderInclude.
	 */
	String getOptionalHppSaxLoaderInclude();

	/**
	 *	Get the optional String attribute HppSaxLoaderStartElement.
	 *
	 *	@return	The optional String attribute HppSaxLoaderStartElement.
	 */
	String getOptionalHppSaxLoaderStartElement();

	/**
	 *	Get the optional String attribute HppSaxLoaderEndElement.
	 *
	 *	@return	The optional String attribute HppSaxLoaderEndElement.
	 */
	String getOptionalHppSaxLoaderEndElement();

	/**
	 *	Get the optional String attribute HppXMsgTableInclude.
	 *
	 *	@return	The optional String attribute HppXMsgTableInclude.
	 */
	String getOptionalHppXMsgTableInclude();

	/**
	 *	Get the optional String attribute HppXMsgTableFormatters.
	 *
	 *	@return	The optional String attribute HppXMsgTableFormatters.
	 */
	String getOptionalHppXMsgTableFormatters();

	/**
	 *	Get the optional String attribute HppXMsgRqstTableInclude.
	 *
	 *	@return	The optional String attribute HppXMsgRqstTableInclude.
	 */
	String getOptionalHppXMsgRqstTableInclude();

	/**
	 *	Get the optional String attribute HppXMsgRspnTableInclude.
	 *
	 *	@return	The optional String attribute HppXMsgRspnTableInclude.
	 */
	String getOptionalHppXMsgRspnTableInclude();

	/**
	 *	Get the optional String attribute HppXMsgClientTableInclude.
	 *
	 *	@return	The optional String attribute HppXMsgClientTableInclude.
	 */
	String getOptionalHppXMsgClientTableInclude();

	/**
	 *	Get the optional String attribute HppXMsgRqstTableBody.
	 *
	 *	@return	The optional String attribute HppXMsgRqstTableBody.
	 */
	String getOptionalHppXMsgRqstTableBody();

	/**
	 *	Get the optional String attribute HppXMsgRspnTableBody.
	 *
	 *	@return	The optional String attribute HppXMsgRspnTableBody.
	 */
	String getOptionalHppXMsgRspnTableBody();

	/**
	 *	Get the optional String attribute HppXMsgClientTableBody.
	 *
	 *	@return	The optional String attribute HppXMsgClientTableBody.
	 */
	String getOptionalHppXMsgClientTableBody();

	/**
	 *	Get the optional String attribute CsObjMembers.
	 *
	 *	@return	The optional String attribute CsObjMembers.
	 */
	String getOptionalCsObjMembers();

	/**
	 *	Get the optional String attribute CsObjInterface.
	 *
	 *	@return	The optional String attribute CsObjInterface.
	 */
	String getOptionalCsObjInterface();

	/**
	 *	Get the optional String attribute CsObjUsing.
	 *
	 *	@return	The optional String attribute CsObjUsing.
	 */
	String getOptionalCsObjUsing();

	/**
	 *	Get the optional String attribute CsObjImplementation.
	 *
	 *	@return	The optional String attribute CsObjImplementation.
	 */
	String getOptionalCsObjImplementation();

	/**
	 *	Get the optional String attribute CsEditObjMembers.
	 *
	 *	@return	The optional String attribute CsEditObjMembers.
	 */
	String getOptionalCsEditObjMembers();

	/**
	 *	Get the optional String attribute CsEditObjInterface.
	 *
	 *	@return	The optional String attribute CsEditObjInterface.
	 */
	String getOptionalCsEditObjInterface();

	/**
	 *	Get the optional String attribute CsEditObjUsing.
	 *
	 *	@return	The optional String attribute CsEditObjUsing.
	 */
	String getOptionalCsEditObjUsing();

	/**
	 *	Get the optional String attribute CsEditObjImplementation.
	 *
	 *	@return	The optional String attribute CsEditObjImplementation.
	 */
	String getOptionalCsEditObjImplementation();

	/**
	 *	Get the optional String attribute CsTableUsing.
	 *
	 *	@return	The optional String attribute CsTableUsing.
	 */
	String getOptionalCsTableUsing();

	/**
	 *	Get the optional String attribute CsTableMembers.
	 *
	 *	@return	The optional String attribute CsTableMembers.
	 */
	String getOptionalCsTableMembers();

	/**
	 *	Get the optional String attribute CsTableInterface.
	 *
	 *	@return	The optional String attribute CsTableInterface.
	 */
	String getOptionalCsTableInterface();

	/**
	 *	Get the optional String attribute CsTableImplementation.
	 *
	 *	@return	The optional String attribute CsTableImplementation.
	 */
	String getOptionalCsTableImplementation();

	/**
	 *	Get the optional String attribute CsTableObjUsing.
	 *
	 *	@return	The optional String attribute CsTableObjUsing.
	 */
	String getOptionalCsTableObjUsing();

	/**
	 *	Get the optional String attribute CsTableObjMembers.
	 *
	 *	@return	The optional String attribute CsTableObjMembers.
	 */
	String getOptionalCsTableObjMembers();

	/**
	 *	Get the optional String attribute CsTableObjInterface.
	 *
	 *	@return	The optional String attribute CsTableObjInterface.
	 */
	String getOptionalCsTableObjInterface();

	/**
	 *	Get the optional String attribute CsTableObjImplementation.
	 *
	 *	@return	The optional String attribute CsTableObjImplementation.
	 */
	String getOptionalCsTableObjImplementation();

	/**
	 *	Get the optional String attribute CsDb2LUWTableUsing.
	 *
	 *	@return	The optional String attribute CsDb2LUWTableUsing.
	 */
	String getOptionalCsDb2LUWTableUsing();

	/**
	 *	Get the optional String attribute CsDb2LUWTableMembers.
	 *
	 *	@return	The optional String attribute CsDb2LUWTableMembers.
	 */
	String getOptionalCsDb2LUWTableMembers();

	/**
	 *	Get the optional String attribute CsDb2LUWTableImplementation.
	 *
	 *	@return	The optional String attribute CsDb2LUWTableImplementation.
	 */
	String getOptionalCsDb2LUWTableImplementation();

	/**
	 *	Get the optional String attribute CsMSSqlTableUsing.
	 *
	 *	@return	The optional String attribute CsMSSqlTableUsing.
	 */
	String getOptionalCsMSSqlTableUsing();

	/**
	 *	Get the optional String attribute CsMSSqlTableMembers.
	 *
	 *	@return	The optional String attribute CsMSSqlTableMembers.
	 */
	String getOptionalCsMSSqlTableMembers();

	/**
	 *	Get the optional String attribute CsMSSqlTableImplementation.
	 *
	 *	@return	The optional String attribute CsMSSqlTableImplementation.
	 */
	String getOptionalCsMSSqlTableImplementation();

	/**
	 *	Get the optional String attribute CsMySqlTableUsing.
	 *
	 *	@return	The optional String attribute CsMySqlTableUsing.
	 */
	String getOptionalCsMySqlTableUsing();

	/**
	 *	Get the optional String attribute CsMySqlTableMembers.
	 *
	 *	@return	The optional String attribute CsMySqlTableMembers.
	 */
	String getOptionalCsMySqlTableMembers();

	/**
	 *	Get the optional String attribute CsMySqlTableImplementation.
	 *
	 *	@return	The optional String attribute CsMySqlTableImplementation.
	 */
	String getOptionalCsMySqlTableImplementation();

	/**
	 *	Get the optional String attribute CsOracleTableUsing.
	 *
	 *	@return	The optional String attribute CsOracleTableUsing.
	 */
	String getOptionalCsOracleTableUsing();

	/**
	 *	Get the optional String attribute CsOracleTableMembers.
	 *
	 *	@return	The optional String attribute CsOracleTableMembers.
	 */
	String getOptionalCsOracleTableMembers();

	/**
	 *	Get the optional String attribute CsOracleTableImplementation.
	 *
	 *	@return	The optional String attribute CsOracleTableImplementation.
	 */
	String getOptionalCsOracleTableImplementation();

	/**
	 *	Get the optional String attribute CsPgSqlTableUsing.
	 *
	 *	@return	The optional String attribute CsPgSqlTableUsing.
	 */
	String getOptionalCsPgSqlTableUsing();

	/**
	 *	Get the optional String attribute CsPgSqlTableMembers.
	 *
	 *	@return	The optional String attribute CsPgSqlTableMembers.
	 */
	String getOptionalCsPgSqlTableMembers();

	/**
	 *	Get the optional String attribute CsPgSqlTableImplementation.
	 *
	 *	@return	The optional String attribute CsPgSqlTableImplementation.
	 */
	String getOptionalCsPgSqlTableImplementation();

	/**
	 *	Get the optional String attribute CsRamTableUsing.
	 *
	 *	@return	The optional String attribute CsRamTableUsing.
	 */
	String getOptionalCsRamTableUsing();

	/**
	 *	Get the optional String attribute CsRamTableMembers.
	 *
	 *	@return	The optional String attribute CsRamTableMembers.
	 */
	String getOptionalCsRamTableMembers();

	/**
	 *	Get the optional String attribute CsRamTableImplementation.
	 *
	 *	@return	The optional String attribute CsRamTableImplementation.
	 */
	String getOptionalCsRamTableImplementation();

	/**
	 *	Get the optional String attribute CsSaxLoaderUsing.
	 *
	 *	@return	The optional String attribute CsSaxLoaderUsing.
	 */
	String getOptionalCsSaxLoaderUsing();

	/**
	 *	Get the optional String attribute CsSaxLoaderStartElement.
	 *
	 *	@return	The optional String attribute CsSaxLoaderStartElement.
	 */
	String getOptionalCsSaxLoaderStartElement();

	/**
	 *	Get the optional String attribute CsSaxLoaderEndElement.
	 *
	 *	@return	The optional String attribute CsSaxLoaderEndElement.
	 */
	String getOptionalCsSaxLoaderEndElement();

	/**
	 *	Get the optional String attribute CsXMsgTableUsing.
	 *
	 *	@return	The optional String attribute CsXMsgTableUsing.
	 */
	String getOptionalCsXMsgTableUsing();

	/**
	 *	Get the optional String attribute CsXMsgTableFormatters.
	 *
	 *	@return	The optional String attribute CsXMsgTableFormatters.
	 */
	String getOptionalCsXMsgTableFormatters();

	/**
	 *	Get the optional String attribute CsXMsgRqstTableUsing.
	 *
	 *	@return	The optional String attribute CsXMsgRqstTableUsing.
	 */
	String getOptionalCsXMsgRqstTableUsing();

	/**
	 *	Get the optional String attribute CsXMsgRspnTableUsing.
	 *
	 *	@return	The optional String attribute CsXMsgRspnTableUsing.
	 */
	String getOptionalCsXMsgRspnTableUsing();

	/**
	 *	Get the optional String attribute CsXMsgClientTableUsing.
	 *
	 *	@return	The optional String attribute CsXMsgClientTableUsing.
	 */
	String getOptionalCsXMsgClientTableUsing();

	/**
	 *	Get the optional String attribute CsXMsgRqstTableBody.
	 *
	 *	@return	The optional String attribute CsXMsgRqstTableBody.
	 */
	String getOptionalCsXMsgRqstTableBody();

	/**
	 *	Get the optional String attribute CsXMsgRspnTableBody.
	 *
	 *	@return	The optional String attribute CsXMsgRspnTableBody.
	 */
	String getOptionalCsXMsgRspnTableBody();

	/**
	 *	Get the optional String attribute CsXMsgClientTableBody.
	 *
	 *	@return	The optional String attribute CsXMsgClientTableBody.
	 */
	String getOptionalCsXMsgClientTableBody();

	/**
	 *	Get the required IYCFBamSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@return	The required IYCFBamSchemaDefObj instance referenced by the SchemaDef key.
	 */
	IYCFBamSchemaDefObj getRequiredContainerSchemaDef();

	/**
	 *	Get the required IYCFBamSchemaDefObj instance referenced by the SchemaDef key.
	 *
	 *	@return	The required IYCFBamSchemaDefObj instance referenced by the SchemaDef key.
	 */
	IYCFBamSchemaDefObj getRequiredContainerSchemaDef( boolean forceRead );

	/**
	 *	Get the optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupDefSchema();

	/**
	 *	Get the optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 *
	 *	@return	The optional IYCFBamSchemaDefObj instance referenced by the DefSchema key.
	 */
	IYCFBamSchemaDefObj getOptionalLookupDefSchema( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamRelationObj array of instances referenced by the Relation key.
	 *
	 *	@return	The optional IYCFBamRelationObj[] array of instances referenced by the Relation key.
	 */
	List<IYCFBamRelationObj> getOptionalComponentsRelation();

	/**
	 *	Get the array of optional IYCFBamRelationObj array of instances referenced by the Relation key.
	 *
	 *	@return	The optional IYCFBamRelationObj[] array of instances referenced by the Relation key.
	 */
	List<IYCFBamRelationObj> getOptionalComponentsRelation( boolean forceRead );

	/**
	 *	Get the optional IYCFBamIndexObj instance referenced by the LookupIndex key.
	 *
	 *	@return	The optional IYCFBamIndexObj instance referenced by the LookupIndex key.
	 */
	IYCFBamIndexObj getOptionalLookupLookupIndex();

	/**
	 *	Get the optional IYCFBamIndexObj instance referenced by the LookupIndex key.
	 *
	 *	@return	The optional IYCFBamIndexObj instance referenced by the LookupIndex key.
	 */
	IYCFBamIndexObj getOptionalLookupLookupIndex( boolean forceRead );

	/**
	 *	Get the optional IYCFBamIndexObj instance referenced by the AltIndex key.
	 *
	 *	@return	The optional IYCFBamIndexObj instance referenced by the AltIndex key.
	 */
	IYCFBamIndexObj getOptionalLookupAltIndex();

	/**
	 *	Get the optional IYCFBamIndexObj instance referenced by the AltIndex key.
	 *
	 *	@return	The optional IYCFBamIndexObj instance referenced by the AltIndex key.
	 */
	IYCFBamIndexObj getOptionalLookupAltIndex( boolean forceRead );

	/**
	 *	Get the optional IYCFBamTableObj instance referenced by the QualTable key.
	 *
	 *	@return	The optional IYCFBamTableObj instance referenced by the QualTable key.
	 */
	IYCFBamTableObj getOptionalLookupQualTable();

	/**
	 *	Get the optional IYCFBamTableObj instance referenced by the QualTable key.
	 *
	 *	@return	The optional IYCFBamTableObj instance referenced by the QualTable key.
	 */
	IYCFBamTableObj getOptionalLookupQualTable( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamIndexObj array of instances referenced by the Index key.
	 *
	 *	@return	The optional IYCFBamIndexObj[] array of instances referenced by the Index key.
	 */
	List<IYCFBamIndexObj> getOptionalComponentsIndex();

	/**
	 *	Get the array of optional IYCFBamIndexObj array of instances referenced by the Index key.
	 *
	 *	@return	The optional IYCFBamIndexObj[] array of instances referenced by the Index key.
	 */
	List<IYCFBamIndexObj> getOptionalComponentsIndex( boolean forceRead );

	/**
	 *	Get the optional IYCFBamIndexObj instance referenced by the PrimaryIndex key.
	 *
	 *	@return	The optional IYCFBamIndexObj instance referenced by the PrimaryIndex key.
	 */
	IYCFBamIndexObj getOptionalLookupPrimaryIndex();

	/**
	 *	Get the optional IYCFBamIndexObj instance referenced by the PrimaryIndex key.
	 *
	 *	@return	The optional IYCFBamIndexObj instance referenced by the PrimaryIndex key.
	 */
	IYCFBamIndexObj getOptionalLookupPrimaryIndex( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamValueObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional IYCFBamValueObj[] array of instances referenced by the Columns key.
	 */
	List<IYCFBamValueObj> getOptionalComponentsColumns();

	/**
	 *	Get the array of optional IYCFBamValueObj array of instances referenced by the Columns key.
	 *
	 *	@return	The optional IYCFBamValueObj[] array of instances referenced by the Columns key.
	 */
	List<IYCFBamValueObj> getOptionalComponentsColumns( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamRelationObj array of instances referenced by the ReverseRelations key.
	 *
	 *	@return	The optional IYCFBamRelationObj[] array of instances referenced by the ReverseRelations key.
	 */
	List<IYCFBamRelationObj> getOptionalChildrenReverseRelations();

	/**
	 *	Get the array of optional IYCFBamRelationObj array of instances referenced by the ReverseRelations key.
	 *
	 *	@return	The optional IYCFBamRelationObj[] array of instances referenced by the ReverseRelations key.
	 */
	List<IYCFBamRelationObj> getOptionalChildrenReverseRelations( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamChainObj array of instances referenced by the Chains key.
	 *
	 *	@return	The optional IYCFBamChainObj[] array of instances referenced by the Chains key.
	 */
	List<IYCFBamChainObj> getOptionalComponentsChains();

	/**
	 *	Get the array of optional IYCFBamChainObj array of instances referenced by the Chains key.
	 *
	 *	@return	The optional IYCFBamChainObj[] array of instances referenced by the Chains key.
	 */
	List<IYCFBamChainObj> getOptionalComponentsChains( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamDelTopDepObj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IYCFBamDelTopDepObj[] array of instances referenced by the DelDep key.
	 */
	List<IYCFBamDelTopDepObj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional IYCFBamDelTopDepObj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional IYCFBamDelTopDepObj[] array of instances referenced by the DelDep key.
	 */
	List<IYCFBamDelTopDepObj> getOptionalComponentsDelDep( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamClearTopDepObj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional IYCFBamClearTopDepObj[] array of instances referenced by the ClearDep key.
	 */
	List<IYCFBamClearTopDepObj> getOptionalComponentsClearDep();

	/**
	 *	Get the array of optional IYCFBamClearTopDepObj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional IYCFBamClearTopDepObj[] array of instances referenced by the ClearDep key.
	 */
	List<IYCFBamClearTopDepObj> getOptionalComponentsClearDep( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamId16GenObj array of instances referenced by the DispId16Gen key.
	 *
	 *	@return	The optional IYCFBamId16GenObj[] array of instances referenced by the DispId16Gen key.
	 */
	List<IYCFBamId16GenObj> getOptionalChildrenDispId16Gen();

	/**
	 *	Get the array of optional IYCFBamId16GenObj array of instances referenced by the DispId16Gen key.
	 *
	 *	@return	The optional IYCFBamId16GenObj[] array of instances referenced by the DispId16Gen key.
	 */
	List<IYCFBamId16GenObj> getOptionalChildrenDispId16Gen( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamId32GenObj array of instances referenced by the DispId32Gen key.
	 *
	 *	@return	The optional IYCFBamId32GenObj[] array of instances referenced by the DispId32Gen key.
	 */
	List<IYCFBamId32GenObj> getOptionalChildrenDispId32Gen();

	/**
	 *	Get the array of optional IYCFBamId32GenObj array of instances referenced by the DispId32Gen key.
	 *
	 *	@return	The optional IYCFBamId32GenObj[] array of instances referenced by the DispId32Gen key.
	 */
	List<IYCFBamId32GenObj> getOptionalChildrenDispId32Gen( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamId64GenObj array of instances referenced by the DispId64Gen key.
	 *
	 *	@return	The optional IYCFBamId64GenObj[] array of instances referenced by the DispId64Gen key.
	 */
	List<IYCFBamId64GenObj> getOptionalChildrenDispId64Gen();

	/**
	 *	Get the array of optional IYCFBamId64GenObj array of instances referenced by the DispId64Gen key.
	 *
	 *	@return	The optional IYCFBamId64GenObj[] array of instances referenced by the DispId64Gen key.
	 */
	List<IYCFBamId64GenObj> getOptionalChildrenDispId64Gen( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamServerMethodObj array of instances referenced by the ServerMethods key.
	 *
	 *	@return	The optional IYCFBamServerMethodObj[] array of instances referenced by the ServerMethods key.
	 */
	List<IYCFBamServerMethodObj> getOptionalComponentsServerMethods();

	/**
	 *	Get the array of optional IYCFBamServerMethodObj array of instances referenced by the ServerMethods key.
	 *
	 *	@return	The optional IYCFBamServerMethodObj[] array of instances referenced by the ServerMethods key.
	 */
	List<IYCFBamServerMethodObj> getOptionalComponentsServerMethods( boolean forceRead );

	/**
	 *	Get the array of optional IYCFBamTweakObj array of instances referenced by the Tweaks key.
	 *
	 *	@return	The optional IYCFBamTweakObj[] array of instances referenced by the Tweaks key.
	 */
	List<IYCFBamTweakObj> getOptionalComponentsTweaks();

	/**
	 *	Get the array of optional IYCFBamTweakObj array of instances referenced by the Tweaks key.
	 *
	 *	@return	The optional IYCFBamTweakObj[] array of instances referenced by the Tweaks key.
	 */
	List<IYCFBamTweakObj> getOptionalComponentsTweaks( boolean forceRead );

	List<IYCFBamRelationObj> getOnlyOwnerRelations();
	List<IYCFBamRelationObj> getContainerOwnerRelations();
	IYCFBamRelationObj getContainerRelation();
	IYCFBamRelationObj getInheritedContainerRelation();
	IYCFBamRelationObj getOwnerRelation();
	IYCFBamRelationObj getInheritedOwnerRelation();
	List<IYCFBamRelationObj> getOwnerLookupRelations();
	List<IYCFBamRelationObj> getOwnerContainerNamedLookupChainRelations();
	List<IYCFBamAtomObj> getChildrenAtoms();
	IYCFBamRelationObj getSuperClassRelation();
	List<IYCFBamRelationObj> getSubClassRelations();
	IYCFBamIndexObj getPrimaryKeyIndex();
	List<IYCFBamRelationObj> getFactoryOwnerRelations();
	List<IYCFBamIndexObj> getInheritedIndexes();
	List<IYCFBamIndexObj> getChildrenIndexes();
	List<IYCFBamRelationObj> getInheritedRelations();
	List<IYCFBamRelationObj> getChildrenRelations();

}

// Description: Java 25 public interface for a IntNet schema.

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

package server.markhome.ycf.v3_1.intnet.intnetpub;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.math.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.*;
import java.util.*;
import server.markhome.cf.*;
import server.markhome.cf.CFXmlUtil;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import java.util.concurrent.atomic.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;

//import server.markhome.ycf.v3_1.secure.securepub.buff.SecurePubBuffFactoryService;
//import server.markhome.ycf.v3_1.intnet.intnetpub.buff.IntNetPubBuffFactoryService;
//import server.markhome.ycf.v3_1.intnet.intnetpub.buff.IntNetPubBuffFactoryService;

public interface IIntNetPubSchema
extends ISecurePubSchema
{

	public static final String SCHEMA_NAME = "IntNet";
	public static final String DBSCHEMA_NAME = "IntNet31";
	static final AtomicReference<ApplicationContext> arApplicationContext = new AtomicReference<>(null);
	public static final SecurePubTableData TABLE_DATA[] = {new SecurePubTableData("IntNet", "License", null, false, false, "Tenant", "Public"),
		new SecurePubTableData("IntNet", "MajorVersion", null, true, false, "Tenant", "Public"),
		new SecurePubTableData("IntNet", "MimeType", null, true, false, "System", "Public"),
		new SecurePubTableData("IntNet", "MinorVersion", null, true, false, "Tenant", "Public"),
		new SecurePubTableData("IntNet", "SubProject", null, true, false, "Tenant", "Public"),
		new SecurePubTableData("IntNet", "Tld", null, true, false, "Tenant", "Public"),
		new SecurePubTableData("IntNet", "TopDomain", null, true, false, "Tenant", "Public"),
		new SecurePubTableData("IntNet", "TopProject", null, true, false, "Tenant", "Public"),
		new SecurePubTableData("IntNet", "URLProtocol", null, true, false, "System", "Public")};
	public static final AtomicReference<SecurePubTableData[]> consolidatedTableData = new AtomicReference<>(null);
	public static final SecurePubRoleInfo ROLE_INFO[] = {};
	public static final AtomicReference<SecurePubRoleInfo[]> consolidatedRoleInfo = new AtomicReference<>(null);
	public static SecurePubTableData[] getTableData() {
		return TABLE_DATA;
	}

	public static SecurePubTableData[] getConsolidatedTableData() {
		if (consolidatedTableData.get() == null) {
			ArrayList<SecurePubTableData> lst = new ArrayList<>();
			for( SecurePubTableData data: ISecurePubSchema.getTableData()) {
				lst.add(data);
			}
			for( SecurePubTableData data: TABLE_DATA) {
				lst.add(data);
			}
			SecurePubTableData arr[] = new SecurePubTableData[lst.size()];
			int idx = 0;
			for(SecurePubTableData data: lst) {
				arr[idx++] = data;
			}
			consolidatedTableData.compareAndSet(null, arr);
		}
		return(consolidatedTableData.get());
	}

	public static SecurePubRoleInfo[] getRoleInfo() {
		return ROLE_INFO;
	}

	public static SecurePubRoleInfo[] getConsolidatedRoleInfo() {
		if (consolidatedRoleInfo.get() == null) {
			ArrayList<SecurePubRoleInfo> lst = new ArrayList<>();
			for( SecurePubRoleInfo info: ISecurePubSchema.getRoleInfo()) {
				lst.add(info);
			}
			for( SecurePubRoleInfo info: ROLE_INFO) {
				lst.add(info);
			}
			// Dependency order is the natural order of role info comparison
			lst.sort(new SecurePubRoleInfoDependencyComparator());
			SecurePubRoleInfo arr[] = new SecurePubRoleInfo[lst.size()];
			int idx = 0;
			for(SecurePubRoleInfo info: lst) {
				arr[idx++] = info;
			}
			consolidatedRoleInfo.compareAndSet(null, arr);
		}
		return(consolidatedRoleInfo.get());
	}

	public default void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		arApplicationContext.compareAndSet(arApplicationContext.get(), applicationContext);
	}

	public static ApplicationContext getApplicationContext() {
		return( arApplicationContext.get() );
	}

		final static ArrayList<ISecurePubSchema.ClassMapEntry> entries = new ArrayList<>();
		final static HashMap<Integer,ISecurePubSchema.ClassMapEntry> mapBackingClassCodeToEntry = new HashMap<>();
		final static HashMap<Integer,ISecurePubSchema.ClassMapEntry> mapRuntimeClassCodeToEntry = new HashMap<>();
		final static AtomicReference<IIntNetPubSchema> backingIntNet = new AtomicReference<>();
		public static IIntNetPubSchema getBackingIntNet() {
			return( IIntNetPubSchema.backingIntNet.get() );
		}
		
		public static void setBackingPubSchema(IIntNetPubSchema backingSchema) {
			IIntNetPubSchema.backingIntNet.set(backingSchema);
		}
		
		public IIntNetPubSchema getIntNetSchema();
		public void setIntNetSchema(IIntNetPubSchema schema);

		public static int doInitClassMapEntries(int value) {
			value = ISecurePubSchema.doInitClassMapEntries(value);
			if (IIntNetPubSchema.entries.isEmpty()) {
				ISecurePubSchema.ClassMapEntry entry;
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "License", IIntNetPubLicense.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "MajorVersion", IIntNetPubMajorVersion.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "MimeType", IIntNetPubMimeType.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "MinorVersion", IIntNetPubMinorVersion.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "SubProject", IIntNetPubSubProject.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "Tld", IIntNetPubTld.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "TopDomain", IIntNetPubTopDomain.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "TopProject", IIntNetPubTopProject.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				entry = new ISecurePubSchema.ClassMapEntry(IIntNetPubSchema.SCHEMA_NAME, "URLProtocol", IIntNetPubURLProtocol.CLASS_CODE);
				IIntNetPubSchema.entries.add(entry);
				for( ISecurePubSchema.ClassMapEntry cur: IIntNetPubSchema.entries) {
					cur.setRuntimeClassCode(value++);
				}
				IIntNetPubSchema.mapBackingClassCodeToEntry.clear();
				IIntNetPubSchema.mapRuntimeClassCodeToEntry.clear();
				for( ISecurePubSchema.ClassMapEntry cur: IIntNetPubSchema.entries) {
					IIntNetPubSchema.mapBackingClassCodeToEntry.put(cur.getBackingClassCode(), cur);
					IIntNetPubSchema.mapRuntimeClassCodeToEntry.put(cur.getRuntimeClassCode(), cur);
				}
			}
			return(value);
		}
		
		public static ISecurePubSchema.ClassMapEntry getClassMapByBackingClassCode(int code) {
			ISecurePubSchema.ClassMapEntry entry;
			entry = ISecurePubSchema.mapBackingClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			entry = IIntNetPubSchema.mapBackingClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			return( null );
		}
		
		public static ISecurePubSchema.ClassMapEntry getClassMapByRuntimeClassCode(int code) {
			ISecurePubSchema.ClassMapEntry entry;
			entry = ISecurePubSchema.mapRuntimeClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			entry = IIntNetPubSchema.mapRuntimeClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			return( null );
		}
		
		public int initClassMapEntries(int value);
		public void wireRecConstructors();
		public void wireTableTableInstances();

	/**
	 *	Allocate a new schema instance.
	 *
	 *	@return	A new ISecurePubSchema instance.
	 */
	public ISecurePubSchema newSchema();

	/**
	 *	Get the next ISOCcyIdGen identifier.
	 *
	 *	@return	The next ISOCcyIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOCcyIdGen();

	/**
	 *	Get the next ISOCtryIdGen identifier.
	 *
	 *	@return	The next ISOCtryIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOCtryIdGen();

	/**
	 *	Get the next ISOLangIdGen identifier.
	 *
	 *	@return	The next ISOLangIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOLangIdGen();

	/**
	 *	Get the next ISOTZoneIdGen identifier.
	 *
	 *	@return	The next ISOTZoneIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOTZoneIdGen();

	/**
	 *	Get the next TableInfoIdGen identifier.
	 *
	 *	@return	The next TableInfoIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public int nextTableInfoIdGen();

	/**
	 *	Get the next MimeTypeIdGen identifier.
	 *
	 *	@return	The next MimeTypeIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public int nextMimeTypeIdGen();

	/**
	 *	Get the next URLProtocolIdGen identifier.
	 *
	 *	@return	The next URLProtocolIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public int nextURLProtocolIdGen();

	/**
	 *	Get the next ClusterIdGen identifier.
	 *
	 *	@return	The next ClusterIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextClusterIdGen();

	/**
	 *	Get the next SecSessionIdGen identifier.
	 *
	 *	@return	The next SecSessionIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecSessionIdGen();

	/**
	 *	Get the next SecUserIdGen identifier.
	 *
	 *	@return	The next SecUserIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecUserIdGen();

	/**
	 *	Get the next TenantIdGen identifier.
	 *
	 *	@return	The next TenantIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTenantIdGen();

	/**
	 *	Get the next SecSysGrpIdGen identifier.
	 *
	 *	@return	The next SecSysGrpIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecSysGrpIdGen();

	/**
	 *	Get the next SecClusGrpIdGen identifier.
	 *
	 *	@return	The next SecClusGrpIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecClusGrpIdGen();

	/**
	 *	Get the next SecClusRoleIdGen identifier.
	 *
	 *	@return	The next SecClusRoleIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecClusRoleIdGen();

	/**
	 *	Get the next SecTentGrpIdGen identifier.
	 *
	 *	@return	The next SecTentGrpIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecTentGrpIdGen();

	/**
	 *	Get the next SecTentRoleIdGen identifier.
	 *
	 *	@return	The next SecTentRoleIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSecTentRoleIdGen();

	/**
	 *	Get the next MajorVersionIdGen identifier.
	 *
	 *	@return	The next MajorVersionIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextMajorVersionIdGen();

	/**
	 *	Get the next MinorVersionIdGen identifier.
	 *
	 *	@return	The next MinorVersionIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextMinorVersionIdGen();

	/**
	 *	Get the next SubProjectIdGen identifier.
	 *
	 *	@return	The next SubProjectIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextSubProjectIdGen();

	/**
	 *	Get the next TldIdGen identifier.
	 *
	 *	@return	The next TldIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTldIdGen();

	/**
	 *	Get the next TopDomainIdGen identifier.
	 *
	 *	@return	The next TopDomainIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTopDomainIdGen();

	/**
	 *	Get the next TopProjectIdGen identifier.
	 *
	 *	@return	The next TopProjectIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextTopProjectIdGen();

	/**
	 *	Get the next LicenseIdGen identifier.
	 *
	 *	@return	The next LicenseIdGen identifier.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public CFDbKeyHash256 nextLicenseIdGen();

	/**
	 *	Get the factory for SecurePub data objects.
	 */
	// public ISecurePubFactory getSecureFactory();

	/**
	 *	Get the buffer factory for SecurePub data buffers.
	 */
	// public SecurePubBuffFactoryService getSecureBuffFactory();

	/**
	 *	Get the factory for IntNetPub data objects.
	 */
	// public IIntNetPubFactory getIntNetFactory();

	/**
	 *	Get the buffer factory for IntNetPub data buffers.
	 */
	// public IntNetPubBuffFactoryService getIntNetBuffFactory();

	/**
	 *	Get the License Table interface for the schema.
	 *
	 *	@return	The License Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubLicenseTable getTableLicense();

	/**
	 *	Get the MajorVersion Table interface for the schema.
	 *
	 *	@return	The MajorVersion Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMajorVersionTable getTableMajorVersion();

	/**
	 *	Get the MimeType Table interface for the schema.
	 *
	 *	@return	The MimeType Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMimeTypeTable getTableMimeType();

	/**
	 *	Get the MinorVersion Table interface for the schema.
	 *
	 *	@return	The MinorVersion Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubMinorVersionTable getTableMinorVersion();

	/**
	 *	Get the SubProject Table interface for the schema.
	 *
	 *	@return	The SubProject Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubSubProjectTable getTableSubProject();

	/**
	 *	Get the Tld Table interface for the schema.
	 *
	 *	@return	The Tld Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubTldTable getTableTld();

	/**
	 *	Get the TopDomain Table interface for the schema.
	 *
	 *	@return	The TopDomain Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubTopDomainTable getTableTopDomain();

	/**
	 *	Get the TopProject Table interface for the schema.
	 *
	 *	@return	The TopProject Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubTopProjectTable getTableTopProject();

	/**
	 *	Get the URLProtocol Table interface for the schema.
	 *
	 *	@return	The URLProtocol Table interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	public IIntNetPubURLProtocolTable getTableURLProtocol();

	/**
	 *	Get the Table Permissions interface for the schema.
	 *
	 *	@return	The Table Permissions interface for the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	//public static ISecurePubTablePerms getTablePerms();

	/**
	 *	Get the Table Permissions interface cast to this schema's implementation.
	 *
	 *	@return The Table Permissions interface for this schema.
	 */
	//public static ISecurePubTablePerms getSecurePubTablePerms();

	/**
	 *	Set the Table Permissions interface for the schema.  All fractal subclasses of
	 *	the ISecurePubTablePerms implement at least that interface plus their own
	 *	accessors.
	 *
	 *	@param	value	The Table Permissions interface to be used by the schema.
	 *
	 *	@throws CFNotSupportedException thrown by client-side implementations.
	 */
	//public static void setTablePerms( ISecurePubTablePerms value );

	public void bootstrapSchema(SecurePubTableData tableData[]);
	public void bootstrapAllTablesSecurity(CFDbKeyHash256 clusterId, CFDbKeyHash256 tenantId, SecurePubTableData tableData[]);
}

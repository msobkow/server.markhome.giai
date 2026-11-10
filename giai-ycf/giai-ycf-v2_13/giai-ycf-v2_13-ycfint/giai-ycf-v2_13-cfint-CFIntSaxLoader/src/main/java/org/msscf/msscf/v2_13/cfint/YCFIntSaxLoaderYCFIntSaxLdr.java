// Description: Java 11 XML SAX Parser for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntSaxLoader;

import java.io.File;
import java.util.Calendar;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

public class YCFIntSaxLdr
{
	protected IYCFLibMessageLog log = null;
	protected YCFIntSaxLoader saxLoader = null;
	protected String clusterName = "system";
	protected IYCFSecClusterObj clusterObj = null;
	protected String tenantName = "system";
	protected static IYCFSecTenantObj tenantObj = null;
	protected String secUserName = "system";
	protected IYCFSecSecUserObj secUserObj = null;
	protected IYCFSecSecSessionObj secSessionObj = null;
	// Constructors

	public YCFIntSaxLdr() {
		log = null;
		getSaxLoader();
	}

	public YCFIntSaxLdr( IYCFLibMessageLog messageLog ) {
		log = messageLog;
		getSaxLoader();
	}

	// Accessors

	public void setSaxLoader( YCFIntSaxLoader value ) {
		saxLoader = value;
	}

	public YCFIntSaxLoader getSaxLoader() {
		if( saxLoader == null ) {
			saxLoader = new YCFIntSaxLoader( log );
		}
		return( saxLoader );
	}

	public void setClusterName( String value ) {
		final String S_ProcName = "setClusterName";
		IYCFIntSchemaObj schema = saxLoader.getSchemaObj();
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		else if( value.equals( "default" ) ) {
			boolean transactionStarted = schema.beginTransaction();
			try {
				IYCFSecSysClusterObj sysCluster = schema.getSysClusterTableObj().readSysClusterByIdIdx( 1 );
				if( sysCluster == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"sysCluster" );
				}
				IYCFSecClusterObj useCluster = sysCluster.getRequiredContainerCluster();
				if( useCluster == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"sysCluster.containerCluster" );
				}
				clusterName = value;
				clusterObj = useCluster;
				saxLoader.getSchemaObj().setSecCluster( useCluster );
				if( transactionStarted ) {
					schema.commit();
				}
			}
			catch( RuntimeException e ) {
				if( transactionStarted ) {
					try {
						schema.rollback();
					}
					catch( Exception e2 ) {
					}
				}
				throw e;
			}
		}
		else if( value.equals( "system" ) ) {
			boolean transactionStarted = schema.beginTransaction();
			try {
				IYCFSecClusterObj useCluster = schema.getClusterTableObj().readClusterByUDomNameIdx( "system" );
				if( useCluster == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"readClusterByUDomName-system" );
				}
				clusterName = value;
				clusterObj = useCluster;
				saxLoader.getSchemaObj().setSecCluster( useCluster );
				if( transactionStarted ) {
					schema.commit();
				}
			}
			catch( RuntimeException e ) {
				if( transactionStarted ) {
					try {
						schema.rollback();
					}
					catch( Exception e2 ) {
					}
				}
				throw e;
			}
		}
		else {
			throw new YCFLibUsageException( getClass(),
				S_ProcName,
				"Expected value to by 'default' or 'system'" );
		}
	}

	public String getClusterName() {
		return( clusterName );
	}

	public IYCFSecClusterObj getClusterObj() {
		final String S_ProcName = "getClusterObj";
		if( clusterObj == null ) {
			IYCFIntSchemaObj schema = saxLoader.getSchemaObj();
			if( clusterName.equals( "default" ) ) {
				boolean transactionStarted = schema.beginTransaction();
				try {
					IYCFSecSysClusterObj sysCluster = schema.getSysClusterTableObj().readSysClusterByIdIdx( 1 );
					if( sysCluster == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"sysCluster" );
					}
					IYCFSecClusterObj useCluster = sysCluster.getRequiredContainerCluster();
					if( useCluster == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"sysCluster.containerCluster" );
					}
					clusterObj = useCluster;
					saxLoader.getSchemaObj().setSecCluster( useCluster );
					if( transactionStarted ) {
						schema.commit();
					}
				}
				catch( RuntimeException e ) {
					if( transactionStarted ) {
						try {
							schema.rollback();
						}
						catch( Exception e2 ) {
						}
					}
					throw e;
				}
			}
			else if( clusterName.equals( "system" ) ) {
				boolean transactionStarted = schema.beginTransaction();
				try {
					IYCFSecClusterObj useCluster = schema.getClusterTableObj().readClusterByUDomNameIdx( "system" );
					if( useCluster == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"readClusterByUDomName-system" );
					}
					clusterObj = useCluster;
					saxLoader.getSchemaObj().setSecCluster( useCluster );
					if( transactionStarted ) {
						schema.commit();
					}
				}
				catch( RuntimeException e ) {
					if( transactionStarted ) {
						try {
							schema.rollback();
						}
						catch( Exception e2 ) {
						}
					}
					throw e;
				}
			}
		}
		if( clusterObj == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"clusterObj" );
		}
		return( clusterObj );
	}


	public void setTenantName( String value ) {
		final String S_ProcName = "setTenantName";
		IYCFIntSchemaObj schema = saxLoader.getSchemaObj();
		if( value == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		else if( value.equals( "system" ) ) {
			boolean transactionStarted = schema.beginTransaction();
			try {
				IYCFSecTenantObj useTenant = schema.getTenantTableObj().readTenantByUNameIdx( clusterObj.getRequiredId(),
					"system" );
				if( useTenant == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"readTenantByUNameIdx-" + clusterObj.getObjName() + "-system" );
				}
				tenantName = value;
				tenantObj = useTenant;
				saxLoader.getSchemaObj().setSecTenant( useTenant );
				if( transactionStarted ) {
					schema.commit();
				}
			}
			catch( RuntimeException e ) {
				if( transactionStarted ) {
					try {
						schema.rollback();
					}
					catch( Exception e2 ) {
					}
				}
				throw e;
			}
		}
		else {
			if( clusterObj == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"clusterObj" );
			}
			if( clusterName.equals( "system" ) ) {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Cluster 'system' only supports the tenant 'system', not '" + value + "'" );
			}
			boolean transactionStarted = schema.beginTransaction();
			try {
				IYCFSecTenantObj useTenant = schema.getTenantTableObj().readTenantByUNameIdx( clusterObj.getRequiredId(),
					value );
				if( useTenant == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"readTenantByUNameIdx-" + clusterObj.getObjName() + "-" + value );
				}
				tenantName = value;
				tenantObj = useTenant;
				saxLoader.getSchemaObj().setSecTenant( useTenant );
				if( transactionStarted ) {
					schema.commit();
				}
			}
			catch( RuntimeException e ) {
				if( transactionStarted ) {
					try {
						schema.rollback();
					}
					catch( Exception e2 ) {
					}
				}
				throw e;
			}
		}
	}

	public String getTenantName() {
		return( tenantName );
	}

	public IYCFSecTenantObj getTenantObj() {
		final String S_ProcName = "getTenantObj";
		if( tenantObj == null ) {
			IYCFIntSchemaObj schema = saxLoader.getSchemaObj();
			if( tenantName == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					1,
					"value" );
			}
			else if( tenantName.equals( "system" ) ) {
				boolean transactionStarted = schema.beginTransaction();
				try {
					IYCFSecTenantObj useTenant = schema.getTenantTableObj().readTenantByUNameIdx( clusterObj.getRequiredId(),
						"system" );
					if( useTenant == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"readTenantByUNameIdx-" + clusterObj.getObjName() + "-system" );
					}
					tenantObj = useTenant;
					saxLoader.getSchemaObj().setSecTenant( useTenant );
					if( transactionStarted ) {
						schema.commit();
					}
				}
				catch( RuntimeException e ) {
					if( transactionStarted ) {
						try {
							schema.rollback();
						}
						catch( Exception e2 ) {
						}
					}
					throw e;
				}
			}
			else {
				if( clusterObj == null ) {
					throw new YCFLibNullArgumentException( getClass(),
						S_ProcName,
						0,
						"clusterObj" );
				}
				if( clusterName.equals( "system" ) ) {
					throw new YCFLibUsageException( getClass(),
						S_ProcName,
						"Cluster 'system' only supports the tenant 'system', not '" + tenantName + "'" );
				}
				boolean transactionStarted = schema.beginTransaction();
				try {
					IYCFSecTenantObj useTenant = schema.getTenantTableObj().readTenantByUNameIdx( clusterObj.getRequiredId(),
						tenantName );
					if( useTenant == null ) {
						throw new YCFLibNullArgumentException( getClass(),
							S_ProcName,
							0,
							"readTenantByUNameIdx-" + clusterObj.getObjName() + "-" + tenantName );
					}
					tenantObj = useTenant;
					saxLoader.getSchemaObj().setSecTenant( useTenant );
					if( transactionStarted ) {
						schema.commit();
					}
				}
				catch( RuntimeException e ) {
					if( transactionStarted ) {
						try {
							schema.rollback();
						}
						catch( Exception e2 ) {
						}
					}
					throw e;
				}
			}
		}
		if( tenantObj == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"tenantObj-" + tenantName );
		}
		return( tenantObj );
	}


	public void setSecUserName( String value ) {
		secUserName = value;
	}

	public String getSecUserName() {
		return( secUserName );
	}

	public IYCFSecSecUserObj getSecUserObj() {
		if( secUserObj == null ) {
			IYCFIntSchemaObj schema = saxLoader.getSchemaObj();
			boolean transactionStarted = schema.beginTransaction();
			try {
				secUserObj = schema.getSecUserTableObj().readSecUserByULoginIdx( secUserName );
				if( transactionStarted ) {
					schema.commit();
				}
			}
			catch( RuntimeException e ) {
				if( transactionStarted ) {
					try {
						schema.rollback();
					}
					catch( Exception e2 ) {
					}
				}
				throw e;
			}
		}
		if( secUserObj == null ) {
			throw new RuntimeException( "SecUser \"" + secUserName + "\" could not be found" );
		}
		return( secUserObj );
	}


	public IYCFSecSecSessionObj getSecSessionObj() {
		if( secSessionObj == null ) {
			IYCFIntSchemaObj schema = saxLoader.getSchemaObj();
			boolean transactionStarted = schema.beginTransaction();
			try {
				getClusterObj();
				getTenantObj();
				getSecUserObj();
				secSessionObj = schema.getSecSessionTableObj().newInstance();
				IYCFSecSecSessionEditObj sessionEdit = secSessionObj.beginEdit();
				sessionEdit.setRequiredContainerSecUser( secUserObj );
				sessionEdit.setRequiredStart( Calendar.getInstance() );
				sessionEdit.setOptionalFinish( null );
				secSessionObj = sessionEdit.create();
				sessionEdit = null;
				if( transactionStarted ) {
					schema.commit();
				}
			}
			catch( RuntimeException e ) {
				if( transactionStarted ) {
					try {
						schema.rollback();
					}
					catch( Exception e2 ) {
					}
				}
				throw e;
			}
		}
		return( secSessionObj );
	}

	// Apply the loader options argument to the specified loader

	protected static void applyLoaderOptions( YCFIntSaxLoader loader, String loaderOptions ) {
		final String S_ProcName = "YCFIntSaxLdr.applyLoaderOptions() ";
		while( loaderOptions.length() > 0 ) {
			String evalSegment;
			int sepIndex = loaderOptions.indexOf( File.pathSeparatorChar );
			if( sepIndex >= 0 ) {
				evalSegment = loaderOptions.substring( 0, sepIndex );
				if( loaderOptions.length() > sepIndex + 1 ) {
					loaderOptions = loaderOptions.substring( sepIndex + 1 );
				}
				else {
					loaderOptions = "";
				}
			}
			else {
				evalSegment = loaderOptions;
				loaderOptions = "";
			}
			evalLoaderSegment( loader, evalSegment );
		}
	}

	// Evaluate a loader options argument segment

	protected static void evalLoaderSegment( YCFIntSaxLoader loader, String evalSegment ) {
		final String S_ProcName = "YCFIntSaxParserCLI.evalLoaderSegment() ";
		int sepEquals = evalSegment.indexOf( '=' );
		if( sepEquals <= 0 ) {
			throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
		}
		String tableName = evalSegment.substring( 0, sepEquals );
		String tableOption = evalSegment.substring( sepEquals + 1 );
		if( tableName.equals( "Cluster" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setClusterLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClusterLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClusterLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "HostNode" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setHostNodeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setHostNodeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setHostNodeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ISOCcy" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setISOCcyLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCcyLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCcyLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ISOCtry" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setISOCtryLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ISOCtryCcy" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setISOCtryCcyLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryCcyLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryCcyLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ISOCtryLang" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setISOCtryLangLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryLangLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryLangLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ISOLang" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setISOLangLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOLangLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOLangLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ISOTZone" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setISOTZoneLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOTZoneLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOTZoneLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "License" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setLicenseLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setLicenseLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setLicenseLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "MajorVersion" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setMajorVersionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setMajorVersionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setMajorVersionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "MimeType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setMimeTypeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setMimeTypeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setMimeTypeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "MinorVersion" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setMinorVersionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setMinorVersionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setMinorVersionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecApp" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecAppLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecAppLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecAppLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecDevice" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecDeviceLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecDeviceLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecDeviceLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecForm" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecFormLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecFormLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecFormLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecGroup" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecGroupLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGroupLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGroupLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecGroupForm" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecGroupFormLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGroupFormLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGroupFormLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecGrpInc" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecGrpIncLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGrpIncLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGrpIncLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecGrpMemb" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecGrpMembLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGrpMembLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGrpMembLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecSession" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecSessionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecSessionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecSessionLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SecUser" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSecUserLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecUserLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecUserLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Service" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setServiceLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServiceLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServiceLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ServiceType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setServiceTypeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServiceTypeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServiceTypeLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SubProject" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSubProjectLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSubProjectLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSubProjectLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SysCluster" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSysClusterLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSysClusterLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSysClusterLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TSecGroup" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTSecGroupLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGroupLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGroupLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TSecGrpInc" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTSecGrpIncLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGrpIncLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGrpIncLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TSecGrpMemb" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTSecGrpMembLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGrpMembLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGrpMembLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Tenant" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTenantLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTenantLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTenantLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Tld" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTldLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTldLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTldLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TopDomain" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTopDomainLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTopDomainLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTopDomainLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TopProject" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTopProjectLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTopProjectLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTopProjectLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "URLProtocol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setURLProtocolLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setURLProtocolLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setURLProtocolLoaderBehaviour( YCFIntSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else {
			throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
		}
	}

	// Evaluate remaining arguments

	public void evaluateRemainingArgs( String[] args, int consumed ) {
		// This method gets overloaded to evaluate the database-specific
		// connection arguments, if supported by a database specialization.
	}

}

// Description: Java 11 XML SAX Parser for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecSaxLoader;

import java.io.File;
import java.util.Calendar;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

public class YCFSecSaxLdr
{
	protected IYCFLibMessageLog log = null;
	protected YCFSecSaxLoader saxLoader = null;
	protected String clusterName = "system";
	protected IYCFSecClusterObj clusterObj = null;
	protected String tenantName = "system";
	protected static IYCFSecTenantObj tenantObj = null;
	protected String secUserName = "system";
	protected IYCFSecSecUserObj secUserObj = null;
	protected IYCFSecSecSessionObj secSessionObj = null;
	// Constructors

	public YCFSecSaxLdr() {
		log = null;
		getSaxLoader();
	}

	public YCFSecSaxLdr( IYCFLibMessageLog messageLog ) {
		log = messageLog;
		getSaxLoader();
	}

	// Accessors

	public void setSaxLoader( YCFSecSaxLoader value ) {
		saxLoader = value;
	}

	public YCFSecSaxLoader getSaxLoader() {
		if( saxLoader == null ) {
			saxLoader = new YCFSecSaxLoader( log );
		}
		return( saxLoader );
	}

	public void setClusterName( String value ) {
		final String S_ProcName = "setClusterName";
		IYCFSecSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFSecSchemaObj schema = saxLoader.getSchemaObj();
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
		IYCFSecSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFSecSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFSecSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFSecSchemaObj schema = saxLoader.getSchemaObj();
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

	protected static void applyLoaderOptions( YCFSecSaxLoader loader, String loaderOptions ) {
		final String S_ProcName = "YCFSecSaxLdr.applyLoaderOptions() ";
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

	protected static void evalLoaderSegment( YCFSecSaxLoader loader, String evalSegment ) {
		final String S_ProcName = "YCFSecSaxParserCLI.evalLoaderSegment() ";
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
				loader.setClusterLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClusterLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClusterLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setHostNodeLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setHostNodeLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setHostNodeLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCcyLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCcyLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCcyLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCtryLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCtryCcyLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryCcyLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryCcyLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCtryLangLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryLangLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryLangLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOLangLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOLangLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOLangLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOTZoneLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOTZoneLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOTZoneLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecAppLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecAppLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecAppLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecDeviceLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecDeviceLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecDeviceLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecFormLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecFormLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecFormLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGroupLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGroupLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGroupLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGroupFormLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGroupFormLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGroupFormLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGrpIncLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGrpIncLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGrpIncLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGrpMembLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGrpMembLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGrpMembLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecSessionLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecSessionLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecSessionLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecUserLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecUserLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecUserLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setServiceLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServiceLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServiceLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setServiceTypeLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServiceTypeLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServiceTypeLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSysClusterLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSysClusterLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSysClusterLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTSecGroupLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGroupLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGroupLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTSecGrpIncLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGrpIncLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGrpIncLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTSecGrpMembLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGrpMembLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGrpMembLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTenantLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTenantLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTenantLoaderBehaviour( YCFSecSaxLoader.LoaderBehaviourEnum.Replace );
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

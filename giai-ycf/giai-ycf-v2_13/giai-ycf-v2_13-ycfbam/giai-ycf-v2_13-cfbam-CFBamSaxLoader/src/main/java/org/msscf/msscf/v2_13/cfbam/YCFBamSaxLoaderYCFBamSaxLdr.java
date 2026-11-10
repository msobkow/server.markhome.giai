// Description: Java 11 XML SAX Parser for YCFBam.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamSaxLoader;

import java.io.File;
import java.util.Calendar;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class YCFBamSaxLdr
{
	protected IYCFLibMessageLog log = null;
	protected YCFBamSaxLoader saxLoader = null;
	protected String clusterName = "system";
	protected IYCFSecClusterObj clusterObj = null;
	protected String tenantName = "system";
	protected static IYCFSecTenantObj tenantObj = null;
	protected String secUserName = "system";
	protected IYCFSecSecUserObj secUserObj = null;
	protected IYCFSecSecSessionObj secSessionObj = null;
	// Constructors

	public YCFBamSaxLdr() {
		log = null;
		getSaxLoader();
	}

	public YCFBamSaxLdr( IYCFLibMessageLog messageLog ) {
		log = messageLog;
		getSaxLoader();
	}

	// Accessors

	public void setSaxLoader( YCFBamSaxLoader value ) {
		saxLoader = value;
	}

	public YCFBamSaxLoader getSaxLoader() {
		if( saxLoader == null ) {
			saxLoader = new YCFBamSaxLoader( log );
		}
		return( saxLoader );
	}

	public void setClusterName( String value ) {
		final String S_ProcName = "setClusterName";
		IYCFBamSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFBamSchemaObj schema = saxLoader.getSchemaObj();
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
		IYCFBamSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFBamSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFBamSchemaObj schema = saxLoader.getSchemaObj();
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
			IYCFBamSchemaObj schema = saxLoader.getSchemaObj();
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

	protected static void applyLoaderOptions( YCFBamSaxLoader loader, String loaderOptions ) {
		final String S_ProcName = "YCFBamSaxLdr.applyLoaderOptions() ";
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

	protected static void evalLoaderSegment( YCFBamSaxLoader loader, String evalSegment ) {
		final String S_ProcName = "YCFBamSaxParserCLI.evalLoaderSegment() ";
		int sepEquals = evalSegment.indexOf( '=' );
		if( sepEquals <= 0 ) {
			throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
		}
		String tableName = evalSegment.substring( 0, sepEquals );
		String tableOption = evalSegment.substring( sepEquals + 1 );
		if( tableName.equals( "Atom" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setAtomLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setAtomLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setAtomLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "BlobCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setBlobColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setBlobColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setBlobColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "BlobDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setBlobDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setBlobDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setBlobDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "BlobType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setBlobTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setBlobTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setBlobTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "BoolCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setBoolColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setBoolColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setBoolColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "BoolDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setBoolDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setBoolDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setBoolDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "BoolType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setBoolTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setBoolTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setBoolTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Chain" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setChainLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setChainLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setChainLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ClearDep" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setClearDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClearDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClearDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ClearSubDep1" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setClearSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClearSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClearSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ClearSubDep2" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setClearSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClearSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClearSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ClearSubDep3" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setClearSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClearSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClearSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ClearTopDep" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setClearTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClearTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClearTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Cluster" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setClusterLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setClusterLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setClusterLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DateCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDateColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDateColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDateColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DateDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDateDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDateDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDateDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DateType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDateTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDateTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDateTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash128Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash128ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash128ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash128ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash128Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash128DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash128DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash128DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash128Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash128GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash128GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash128GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash128Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash128TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash128TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash128TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash160Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash160ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash160ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash160ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash160Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash160DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash160DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash160DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash160Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash160GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash160GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash160GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash160Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash160TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash160TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash160TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash224Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash224ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash224ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash224ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash224Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash224DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash224DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash224DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash224Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash224GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash224GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash224GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash224Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash224TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash224TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash224TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash256Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash256ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash256ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash256ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash256Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash256DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash256DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash256DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash256Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash256GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash256GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash256GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash256Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash256TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash256TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash256TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash384Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash384ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash384ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash384ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash384Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash384DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash384DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash384DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash384Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash384GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash384GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash384GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash384Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash384TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash384TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash384TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash512Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash512ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash512ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash512ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash512Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash512DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash512DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash512DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash512Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash512GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash512GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash512GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DbKeyHash512Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDbKeyHash512TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDbKeyHash512TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDbKeyHash512TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DelDep" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDelDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDelDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDelDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DelSubDep1" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDelSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDelSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDelSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DelSubDep2" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDelSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDelSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDelSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DelSubDep3" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDelSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDelSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDelSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DelTopDep" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDelTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDelTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDelTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DoubleCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDoubleColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDoubleColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDoubleColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DoubleDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDoubleDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDoubleDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDoubleDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "DoubleType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setDoubleTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setDoubleTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setDoubleTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "EnumDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setEnumDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setEnumDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setEnumDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "EnumTag" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setEnumTagLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setEnumTagLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setEnumTagLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "EnumType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setEnumTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setEnumTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setEnumTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "FloatCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setFloatColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setFloatColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setFloatColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "FloatDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setFloatDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setFloatDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setFloatDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "FloatType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setFloatTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setFloatTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setFloatTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setHostNodeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setHostNodeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setHostNodeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCcyLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCcyLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCcyLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCtryLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCtryCcyLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryCcyLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryCcyLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOCtryLangLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOCtryLangLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOCtryLangLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOLangLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOLangLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOLangLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setISOTZoneLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setISOTZoneLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setISOTZoneLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Id16Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setId16GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setId16GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setId16GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Id32Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setId32GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setId32GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setId32GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Id64Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setId64GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setId64GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setId64GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Index" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setIndexLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setIndexLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setIndexLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "IndexCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setIndexColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setIndexColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setIndexColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "IndexTweak" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setIndexTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setIndexTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setIndexTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int16Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt16ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt16ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt16ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int16Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt16DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt16DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt16DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int16Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt16TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt16TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt16TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int32Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt32ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt32ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt32ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int32Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt32DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt32DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt32DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int32Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt32TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt32TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt32TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int64Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt64ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt64ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt64ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int64Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt64DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt64DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt64DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Int64Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setInt64TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setInt64TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setInt64TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setLicenseLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setLicenseLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setLicenseLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setMajorVersionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setMajorVersionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setMajorVersionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setMimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setMimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setMimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setMinorVersionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setMinorVersionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setMinorVersionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NmTokenCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNmTokenColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNmTokenColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNmTokenColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NmTokenDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNmTokenDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNmTokenDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNmTokenDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NmTokenType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNmTokenTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNmTokenTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNmTokenTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NmTokensCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNmTokensColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNmTokensColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNmTokensColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NmTokensDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNmTokensDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNmTokensDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNmTokensDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NmTokensType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNmTokensTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNmTokensTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNmTokensTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NumberCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNumberColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNumberColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNumberColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NumberDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNumberDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNumberDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNumberDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "NumberType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setNumberTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setNumberTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setNumberTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Param" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setParamLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setParamLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setParamLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "PopDep" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setPopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setPopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setPopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "PopSubDep1" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setPopSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setPopSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setPopSubDep1LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "PopSubDep2" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setPopSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setPopSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setPopSubDep2LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "PopSubDep3" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setPopSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setPopSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setPopSubDep3LoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "PopTopDep" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setPopTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setPopTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setPopTopDepLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Relation" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setRelationLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setRelationLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setRelationLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "RelationCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setRelationColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setRelationColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setRelationColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "RoleDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setRoleDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setRoleDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setRoleDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SchemaDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSchemaDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSchemaDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSchemaDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SchemaRef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSchemaRefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSchemaRefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSchemaRefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SchemaRole" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSchemaRoleLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSchemaRoleLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSchemaRoleLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "SchemaTweak" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setSchemaTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSchemaTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSchemaTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Scope" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setScopeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setScopeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setScopeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecAppLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecAppLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecAppLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecDeviceLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecDeviceLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecDeviceLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecFormLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecFormLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecFormLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGroupLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGroupLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGroupLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGroupFormLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGroupFormLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGroupFormLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGrpIncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGrpIncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGrpIncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecGrpMembLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecGrpMembLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecGrpMembLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecSessionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecSessionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecSessionLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSecUserLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSecUserLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSecUserLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ServerListFunc" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setServerListFuncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServerListFuncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServerListFuncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ServerMethod" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setServerMethodLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServerMethodLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServerMethodLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ServerObjFunc" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setServerObjFuncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServerObjFuncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServerObjFuncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "ServerProc" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setServerProcLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServerProcLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServerProcLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setServiceLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServiceLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServiceLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setServiceTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setServiceTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setServiceTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "StringCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setStringColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setStringColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setStringColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "StringDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setStringDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setStringDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setStringDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "StringType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setStringTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setStringTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setStringTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSubProjectLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSubProjectLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSubProjectLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setSysClusterLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setSysClusterLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setSysClusterLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTSecGroupLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGroupLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGroupLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTSecGrpIncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGrpIncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGrpIncLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTSecGrpMembLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTSecGrpMembLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTSecGrpMembLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZDateCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZDateColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZDateColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZDateColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZDateDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZDateDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZDateDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZDateDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZDateType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZDateTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZDateTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZDateTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZTimeCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZTimeColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZTimeColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZTimeColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZTimeDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZTimeDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZTimeDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZTimeDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZTimeType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZTimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZTimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZTimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZTimestampCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZTimestampColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZTimestampColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZTimestampColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZTimestampDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZTimestampDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZTimestampDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZTimestampDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TZTimestampType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTZTimestampTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTZTimestampTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTZTimestampTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Table" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTableLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTableLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTableLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TableCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTableColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTableColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTableColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TableTweak" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTableTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTableTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTableTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTenantLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTenantLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTenantLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TextCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTextColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTextColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTextColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TextDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTextDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTextDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTextDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TextType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTextTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTextTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTextTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TimeCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTimeColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTimeColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTimeColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TimeDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTimeDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTimeDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTimeDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TimeType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTimeTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TimestampCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTimestampColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTimestampColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTimestampColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TimestampDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTimestampDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTimestampDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTimestampDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TimestampType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTimestampTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTimestampTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTimestampTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTldLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTldLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTldLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TokenCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTokenColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTokenColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTokenColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TokenDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTokenDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTokenDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTokenDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "TokenType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTokenTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTokenTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTokenTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTopDomainLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTopDomainLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTopDomainLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setTopProjectLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTopProjectLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTopProjectLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Tweak" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setTweakLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt16Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt16ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt16ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt16ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt16Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt16DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt16DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt16DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt16Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt16TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt16TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt16TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt32Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt32ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt32ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt32ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt32Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt32DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt32DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt32DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt32Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt32TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt32TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt32TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt64Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt64ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt64ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt64ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt64Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt64DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt64DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt64DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UInt64Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUInt64TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUInt64TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUInt64TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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
				loader.setURLProtocolLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setURLProtocolLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setURLProtocolLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Uuid6Col" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuid6ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuid6ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuid6ColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Uuid6Def" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuid6DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuid6DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuid6DefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Uuid6Gen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuid6GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuid6GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuid6GenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Uuid6Type" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuid6TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuid6TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuid6TypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UuidCol" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuidColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuidColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuidColLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UuidDef" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuidDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuidDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuidDefLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UuidGen" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuidGenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuidGenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuidGenLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "UuidType" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setUuidTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setUuidTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setUuidTypeLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
			}
			else {
				throw new RuntimeException( S_ProcName + "ERROR: Expected segment to comprise <TableName>={*|Insert|Update|Replace}" );
			}
		}
		else if( tableName.equals( "Value" ) ) {
			if( tableOption.equals( "*" ) ) {
				// Leave at default
			}
			else if( tableOption.equals( "Insert" ) ) {
				loader.setValueLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Insert );
			}
			else if( tableOption.equals( "Update" ) ) {
				loader.setValueLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Update );
			}
			else if( tableOption.equals( "Replace" ) ) {
				loader.setValueLoaderBehaviour( YCFBamSaxLoader.LoaderBehaviourEnum.Replace );
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

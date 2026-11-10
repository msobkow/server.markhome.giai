// Description: Java 11 YCFSec Table Permissions Interface.

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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;

public interface IYCFSecTablePerms
{
	/**
	 *	Is the session allowed to create Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Cluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateHostNode( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadHostNode( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateHostNode( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete HostNode instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteHostNode( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ISOCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateISOCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ISOCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadISOCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ISOCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateISOCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ISOCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteISOCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ISOCtry instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateISOCtry( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ISOCtry instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadISOCtry( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ISOCtry instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateISOCtry( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ISOCtry instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteISOCtry( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ISOCtryCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateISOCtryCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ISOCtryCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadISOCtryCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ISOCtryCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateISOCtryCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ISOCtryCcy instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteISOCtryCcy( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ISOCtryLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateISOCtryLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ISOCtryLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadISOCtryLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ISOCtryLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateISOCtryLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ISOCtryLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteISOCtryLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ISOLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateISOLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ISOLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadISOLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ISOLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateISOLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ISOLang instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteISOLang( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ISOTZone instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateISOTZone( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ISOTZone instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadISOTZone( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ISOTZone instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateISOTZone( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ISOTZone instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteISOTZone( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecApp( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecApp( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecApp( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecApp instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecApp( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecDevice( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecDevice( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecDevice( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecDevice instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecDevice( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGroupForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGroupForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGroupForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGroupForm instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGroupForm( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecSession( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecSession( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecSession( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecSession instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecSession( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSecUser( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSecUser( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSecUser( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SecUser instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSecUser( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Service instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateService( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Service instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadService( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Service instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateService( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Service instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteService( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create ServiceType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateServiceType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read ServiceType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadServiceType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update ServiceType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateServiceType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete ServiceType instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteServiceType( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateSysCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadSysCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateSysCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete SysCluster instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteSysCluster( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TSecGroup instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTSecGroup( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TSecGrpInc instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTSecGrpInc( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete TSecGrpMemb instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTSecGrpMemb( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to create Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowCreateTenant( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to read Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowReadTenant( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to update Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowUpdateTenant( YCFSecAuthorization Authorization );

	/**
	 *	Is the session allowed to delete Tenant instances?
	 *
	 *	@param	Authorization	The session authorization information.
	 */
	boolean allowDeleteTenant( YCFSecAuthorization Authorization );
}

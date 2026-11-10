// Description: Java 11 Instance Edit Object interface for YCFBam SecForm.

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public interface IYCFBamSecFormEditObj
	extends IYCFBamSecFormObj,
		IYCFSecSecFormEditObj,
		IYCFIntSecFormEditObj
{
	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	IYCFSecSecFormObj create();

	/*
	 *	Update the instance.
	 */
	YCFSecSecFormEditObj update();

	/**
	 *	Get the IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The IYCFSecClusterObj instance referenced by the Cluster key.
	 */
	IYCFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the IYCFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the IYCFSecClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( IYCFSecClusterObj value );

	/**
	 *	Get the IYCFSecSecAppObj instance referenced by the Application key.
	 *
	 *	@return	The IYCFSecSecAppObj instance referenced by the Application key.
	 */
	IYCFSecSecAppObj getRequiredContainerApplication();

	/**
	 *	Set the IYCFSecSecAppObj instance referenced by the Application key.
	 *
	 *	@param	value	the IYCFSecSecAppObj instance to be referenced by the Application key.
	 */
	void setRequiredContainerApplication( IYCFSecSecAppObj value );
}

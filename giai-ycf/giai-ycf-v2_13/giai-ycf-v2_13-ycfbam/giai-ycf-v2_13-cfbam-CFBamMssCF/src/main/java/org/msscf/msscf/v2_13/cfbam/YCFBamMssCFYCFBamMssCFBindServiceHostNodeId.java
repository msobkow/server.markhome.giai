
// Description: Java 11 MssYCF Binding for Service Column HostNodeId.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamMssYCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	YCFBamMssYCFBindServiceHostNodeId binds Service.HostNodeId
 *	as an instance of MssYCFGenBindObj.
 */
public class YCFBamMssYCFBindServiceHostNodeId
	extends MssYCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public YCFBamMssYCFBindServiceHostNodeId() {
		super();
	}

	public YCFBamMssYCFBindServiceHostNodeId( MssYCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"Service",
			"HostNodeId" );
	}
	public Object getValueObject( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFBamMssYCFBindServiceHostNodeId.getValueObject() ";

		if( genContext == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		IYCFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		long hostNodeId;
		if( genDef instanceof IYCFBamServiceObj ) {
			hostNodeId = ((IYCFBamServiceObj)genDef).getRequiredHostNodeId();
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"IYCFBamServiceObj" );
		}

		return( hostNodeId );
	}

	public String expandBody( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFBamMssYCFBindServiceHostNodeId.expandBody() ";

		if( genContext == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		IYCFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof IYCFBamServiceObj ) {
			long hostNodeId = ((IYCFBamServiceObj)genDef).getRequiredHostNodeId();
			ret = Long.toString( hostNodeId );
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"IYCFBamServiceObj" );
		}

		return( ret );
	}

}

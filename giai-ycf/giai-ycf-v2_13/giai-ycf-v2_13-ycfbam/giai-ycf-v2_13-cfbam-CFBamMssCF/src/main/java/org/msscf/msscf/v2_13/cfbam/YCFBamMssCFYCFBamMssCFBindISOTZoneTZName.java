
// Description: Java 11 MssYCF Binding for ISOTZone Column TZName.

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
 *	YCFBamMssYCFBindISOTZoneTZName binds ISOTZone.TZName
 *	as an instance of MssYCFGenBindObj.
 */
public class YCFBamMssYCFBindISOTZoneTZName
	extends MssYCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public YCFBamMssYCFBindISOTZoneTZName() {
		super();
	}

	public YCFBamMssYCFBindISOTZoneTZName( MssYCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOTZone",
			"TZName" );
	}
	public Object getValueObject( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFBamMssYCFBindISOTZoneTZName.getValueObject() ";

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

		String tZName;
		if( genDef instanceof IYCFBamISOTZoneObj ) {
			tZName = ((IYCFBamISOTZoneObj)genDef).getRequiredTZName();
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"IYCFBamISOTZoneObj" );
		}

		return( tZName );
	}

	public String expandBody( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFBamMssYCFBindISOTZoneTZName.expandBody() ";

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

		if( genDef instanceof IYCFBamISOTZoneObj ) {
			String tZName = ((IYCFBamISOTZoneObj)genDef).getRequiredTZName();
			ret = tZName;
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"IYCFBamISOTZoneObj" );
		}

		return( ret );
	}

}


// Description: Java 11 MssYCF Binding for ISOTZone Column Iso8601.

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
 *	YCFBamMssYCFBindISOTZoneIso8601 binds ISOTZone.Iso8601
 *	as an instance of MssYCFGenBindObj.
 */
public class YCFBamMssYCFBindISOTZoneIso8601
	extends MssYCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public YCFBamMssYCFBindISOTZoneIso8601() {
		super();
	}

	public YCFBamMssYCFBindISOTZoneIso8601( MssYCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOTZone",
			"Iso8601" );
	}
	public Object getValueObject( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFBamMssYCFBindISOTZoneIso8601.getValueObject() ";

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

		String iso8601;
		if( genDef instanceof IYCFBamISOTZoneObj ) {
			iso8601 = ((IYCFBamISOTZoneObj)genDef).getRequiredIso8601();
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"IYCFBamISOTZoneObj" );
		}

		return( iso8601 );
	}

	public String expandBody( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFBamMssYCFBindISOTZoneIso8601.expandBody() ";

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
			String iso8601 = ((IYCFBamISOTZoneObj)genDef).getRequiredIso8601();
			ret = iso8601;
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

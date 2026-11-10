
// Description: Java 11 MssYCF Binding for SecUser Has DefDev.

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

import java.sql.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

public class YCFBamMssYCFBindHasSecUserDefDev
	extends MssYCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public YCFBamMssYCFBindHasSecUserDefDev() {
		super();
	}

	public YCFBamMssYCFBindHasSecUserDefDev( MssYCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecUser",
			"HasDefDev" );
	}

	public String expandBody( MssYCFGenContext genContext ) {
		final String S_ProcName = "expandBody";

		if( genContext == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		IYCFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		IYCFBamSecDeviceObj obj;

		if( genDef instanceof IYCFBamSecUserObj ) {
			obj = (IYCFBamSecDeviceObj)((IYCFBamSecUserObj)genDef).getOptionalLookupDefDev();
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"IYCFBamSecUserObj" );
		}

		if( obj != null ) {
			return( "yes" );
		}
		else {
			return( "no" );
		}
	}
}

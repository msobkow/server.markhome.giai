
// Description: Java 11 Default Factory implementation for ISOLang.

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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

	/*
	 *	YCFBamISOLangFactory implementation for ISOLang
	 */
public class YCFBamISOLangDefaultFactory
	extends YCFSecISOLangDefaultFactory
	implements IYCFBamISOLangFactory
{
	public YCFBamISOLangDefaultFactory() {
		super();
	}

	public YCFSecISOLangPKey newPKey() {
		YCFSecISOLangPKey pkey =
			new YCFSecISOLangPKey();
		return( pkey );
	}

	public YCFSecISOLangHPKey newHPKey() {
		YCFSecISOLangHPKey hpkey =
			new YCFSecISOLangHPKey();
		return( hpkey );
	}

	public YCFSecISOLangByCode3IdxKey newCode3IdxKey() {
		YCFSecISOLangByCode3IdxKey key =
			new YCFSecISOLangByCode3IdxKey();
		return( key );
	}

	public YCFSecISOLangByCode2IdxKey newCode2IdxKey() {
		YCFSecISOLangByCode2IdxKey key =
			new YCFSecISOLangByCode2IdxKey();
		return( key );
	}

	public YCFSecISOLangBuff newBuff() {
		YCFSecISOLangBuff buff =
			new YCFSecISOLangBuff();
		return( buff );
	}

	public YCFSecISOLangHBuff newHBuff() {
		YCFSecISOLangHBuff hbuff =
			new YCFSecISOLangHBuff();
		return( hbuff );
	}
}

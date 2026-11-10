
// Description: Java 11 MssYCF Iterator for SubProject Relationship MajorVer.

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamMssYCF;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.rmi.*;
import java.text.*;
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
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

/**
 *	YCFBamMssYCFIterateSubProjectMajorVer binds SubProject.MajorVer
 *	as an instance of MssYCFGenIteratorObj.
 */
public class YCFBamMssYCFIterateSubProjectMajorVer
	extends MssYCFGenIteratorObj
{
	private static final long serialVersionUID = 1L;

	public YCFBamMssYCFIterateSubProjectMajorVer() {
		super();
	}

	public YCFBamMssYCFIterateSubProjectMajorVer( MssYCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SubProject",
			"MajorVer",
			"MajorVersion" );
	}

	public ListIterator<IYCFLibAnyObj> enumerateDetails( MssYCFGenContext genContext ) {
		final String S_ProcName = "YCFBamMssYCFIterateSubProjectMajorVer.enumerateDetails() ";

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

		List<IYCFLibAnyObj> list = new LinkedList<IYCFLibAnyObj>();

		if( genDef instanceof IYCFBamSubProjectObj ) {
			Iterator<IYCFIntMajorVersionObj> elements = ((IYCFBamSubProjectObj)genDef).getOptionalComponentsMajorVer().iterator();
			while( elements.hasNext() ) {
				list.add( elements.next() );
			}
		}
		else {
			throw new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"IYCFBamSubProjectObj" );
		}

		return( list.listIterator() );
	}}

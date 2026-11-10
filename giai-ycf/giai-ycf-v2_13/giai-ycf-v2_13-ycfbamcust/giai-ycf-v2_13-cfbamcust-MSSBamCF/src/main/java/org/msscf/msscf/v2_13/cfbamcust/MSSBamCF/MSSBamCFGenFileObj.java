/*
 *	MSS Code Factory YCFBam 2.13 CustMSSBamYCF
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
 */

package org.mssycf.mssycf.v2_13.ycfbamcust.MSSBamYCF;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfcore.MssYCF.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

public class MSSBamYCFGenFileObj extends MssYCFGenFileObj {

	public MSSBamYCFGenFileObj() {
		super();
	}

	public MSSBamYCFGenFileObj(MssYCFEngine engine) {
		super( engine );
	}

	public String evaluateProjectDirName( MssYCFGenContext genContext, IYCFLibAnyObj genDef ) 	{
		final String S_ProcName = "MSSBamYCFGenFileObj.evaluateProjectDirName() ";

		IYCFLibAnyObj project;
		IYCFLibAnyObj topproject;
		IYCFLibAnyObj subproject;
		IYCFLibAnyObj version;
		String projectDirName;
		IYCFBamSchemaDefObj manufacturingSchema = ((MSSBamYCFGenContext)genContext).getManufacturingSchema();
		IYCFLibAnyObj anyObj = null;
		if( manufacturingSchema != null ) {
			anyObj = manufacturingSchema;
		}
		else {
			anyObj = (IYCFLibAnyObj)genDef;
		}

	    project = MSSBamYCFAnyObj.getProject(anyObj);
	    if (project == null) {
			topproject = null;
			subproject = null;
	        throw new RuntimeException(S_ProcName + "Could not get Project for generating GenFile( \""
	            + getRequiredLookupToolSet().getRequiredName()
	            + "\", \""
	            + ((getOptionalLookupScopeDef() != null)
	                ? getOptionalLookupScopeDef().getRequiredName()
	                : "")
	            + "\", \""
	            + getRequiredLookupGenDef().getRequiredName()
	            + "\", \""
	            + getRequiredName()
	            + "\" )");
	    }
		else {
			if( project instanceof IYCFIntSubProjectObj ) {
				subproject = (IYCFIntSubProjectObj)project;
				topproject = (IYCFIntTopProjectObj)(subproject.getObjScope());
			}
			else if( project instanceof IYCFIntTopProjectObj ) {
				topproject = (IYCFIntTopProjectObj)project;
				subproject = null;
			}
			else {
				topproject = null;
				subproject = null;
			}
		}

		if( topproject == null ) {
	        throw new RuntimeException(S_ProcName + "Could not determine TopProject for generating GenFile( \""
	            + getRequiredLookupToolSet().getRequiredName()
	            + "\", \""
	            + ((getOptionalLookupScopeDef() != null)
	                ? getOptionalLookupScopeDef().getRequiredName()
	                : "")
	            + "\", \""
	            + getRequiredLookupGenDef().getRequiredName()
	            + "\", \""
	            + getRequiredName()
	            + "\" )");
		}

		if( subproject == null ) {
	        throw new RuntimeException(S_ProcName + "Could not determine SubProject for generating GenFile( \""
	            + getRequiredLookupToolSet().getRequiredName()
	            + "\", \""
	            + ((getOptionalLookupScopeDef() != null)
	                ? getOptionalLookupScopeDef().getRequiredName()
	                : "")
	            + "\", \""
	            + getRequiredLookupGenDef().getRequiredName()
	            + "\", \""
	            + getRequiredName()
	            + "\" )");
		}

	    version = MSSBamYCFAnyObj.getVersionLeaf(anyObj);

		IYCFIntMajorVersionObj majorVersion;
		IYCFIntMinorVersionObj minorVersion;

		if( version instanceof IYCFIntMajorVersionObj ) {
			majorVersion = (IYCFIntMajorVersionObj)version;
			minorVersion = null;
		}
		else if( version instanceof IYCFIntMinorVersionObj ) {
			minorVersion = (IYCFIntMinorVersionObj)version;
			majorVersion = (IYCFIntMajorVersionObj)(version.getObjScope());
		}
		else {
			minorVersion = null;
			majorVersion = null;
		}

		if( majorVersion == null ) {
	        throw new RuntimeException(S_ProcName + "Could not determine MajorVersion for generating GenFile( \""
	            + getRequiredLookupToolSet().getRequiredName()
	            + "\", \""
	            + ((getOptionalLookupScopeDef() != null)
	                ? getOptionalLookupScopeDef().getRequiredName()
	                : "")
	            + "\", \""
	            + getRequiredLookupGenDef().getRequiredName()
	            + "\", \""
	            + getRequiredName()
	            + "\" )");
		}

		if( minorVersion == null ) {
	        throw new RuntimeException(S_ProcName + "Could not determine MinorVersion for generating GenFile( \""
	            + getRequiredLookupToolSet().getRequiredName()
	            + "\", \""
	            + ((getOptionalLookupScopeDef() != null)
	                ? getOptionalLookupScopeDef().getRequiredName()
	                : "")
	            + "\", \""
	            + getRequiredLookupGenDef().getRequiredName()
	            + "\", \""
	            + getRequiredName()
	            + "\" )");
		}

//		projectDirName = subproject.getObjName().toLowerCase() + "_" + majorVersion.getObjName() + "_" + minorVersion.getObjName();
		projectDirName = "";//subproject.getObjName().toLowerCase();// + "_" + majorVersion.getObjName() + "_" + minorVersion.getObjName();

	    return( projectDirName );
	}
}

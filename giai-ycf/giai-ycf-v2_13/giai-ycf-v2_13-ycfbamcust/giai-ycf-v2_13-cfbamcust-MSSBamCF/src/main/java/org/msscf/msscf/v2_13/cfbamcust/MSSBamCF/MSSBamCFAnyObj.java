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

import java.util.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.IYCFBamSchema.RelationTypeEnum;

import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.IYCFBamSchema;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.IYCFIntMajorVersionObj;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.IYCFIntMinorVersionObj;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.IYCFIntSubProjectObj;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.IYCFIntTldObj;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.IYCFIntTopDomainObj;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.IYCFIntTopProjectObj;

public class MSSBamYCFAnyObj
{
	public MSSBamYCFAnyObj() {
	}

	public static String getTopProjectDomainName(IYCFLibAnyObj obj) {
		if (obj == null) {
			return("");
		}
		while (!(obj instanceof IYCFBamTopProjectObj)) {
			if (obj instanceof IYCFBamTenantObj) {
				return("");
			}
			obj = obj.getObjScope();
			if (obj == null) {
				return("");
			}
		}
		IYCFBamTopProjectObj tproj = (IYCFBamTopProjectObj)obj;
		IYCFIntTopDomainObj tdom = tproj.getRequiredContainerParentSDom();
		if (tdom == null) {
			return("");
		}
		IYCFIntTldObj tld = tdom.getRequiredContainerParentTld();
		if (tld == null) {
			return("");
		}
		String tprojName = tproj.getRequiredName();
		if (tprojName == null || tprojName.isEmpty() || tprojName.isBlank()) {
			return("");
		}
		String tdomName = tdom.getRequiredName();
		if (tdomName == null || tdomName.isEmpty() || tdomName.isBlank()) {
			return("");
		}
		String tldName = tld.getRequiredName();
		if (tldName == null || tldName.isEmpty() || tldName.isBlank()) {
			return("");
		}
		StringBuilder bldr = new StringBuilder();
		bldr.append(tldName.toLowerCase());
		bldr.append('.');
		bldr.append(tdomName.toLowerCase());
		bldr.append('.');
		bldr.append(tprojName.toLowerCase());
		return(bldr.toString());
	}

	public static String getTopProjectMfgVersion(IYCFLibAnyObj obj) {
		if (obj == null) {
			return("");
		}
		while (!(obj instanceof IYCFBamMinorVersionObj)) {
			if (obj instanceof IYCFBamTenantObj) {
				return("");
			}
			obj = obj.getObjScope();
			if (obj == null) {
				return("");
			}
		}
		IYCFBamMinorVersionObj minor = (IYCFBamMinorVersionObj)obj;
		IYCFIntMajorVersionObj major = minor.getRequiredContainerParentMajVer();
		if (major == null) {
			return("");
		}
		IYCFIntSubProjectObj sproj = major.getRequiredContainerParentSPrj();
		if (sproj == null) {
			return("");
		}
		IYCFIntTopProjectObj tproj = sproj.getRequiredContainerParentTPrj();
		if (tproj == null) {
			return("");
		}
		String minorName = minor.getRequiredName();
		if (minorName == null || minorName.isEmpty() || minorName.isBlank()) {
			return("");
		}
		String majorName = major.getRequiredName();
		if (majorName == null || majorName.isEmpty() || majorName.isBlank()) {
			return("");
		}
		String tprojName = tproj.getRequiredName();
		if (tprojName == null || tprojName.isEmpty() || tprojName.isBlank()) {
			return("");
		}
		StringBuilder bldr = new StringBuilder();
		bldr.append(tprojName.toLowerCase());
		bldr.append("-v");
		bldr.append(majorName.toLowerCase());
		bldr.append('_');
		bldr.append(minorName.toLowerCase());
		return(bldr.toString());
	}

	public static String getSchemaProjectName(IYCFLibAnyObj obj) {
		if (obj == null) {
			return("");
		}
		while (!(obj instanceof IYCFBamSchemaDefObj)) {
			if (obj instanceof IYCFBamTenantObj) {
				return("");
			}
			obj = obj.getObjScope();
			if (obj == null) {
				return("");
			}
		}
		IYCFBamSchemaDefObj schema = (IYCFBamSchemaDefObj)obj;
		IYCFIntMinorVersionObj minor = schema.getRequiredContainerMinorVersion();
		if (minor == null) {
			return("");
		}
		IYCFIntMajorVersionObj major = minor.getRequiredContainerParentMajVer();
		if (major == null) {
			return("");
		}
		IYCFIntSubProjectObj sproj = major.getRequiredContainerParentSPrj();
		if (sproj == null) {
			return("");
		}
		IYCFIntTopProjectObj tproj = sproj.getRequiredContainerParentTPrj();
		if (tproj == null) {
			return("");
		}
		String schemaName = schema.getRequiredName();
		if (schemaName == null || schemaName.isEmpty() || schemaName.isBlank()) {
			return("");
		}
		String minorName = minor.getRequiredName();
		if (minorName == null || minorName.isEmpty() || minorName.isBlank()) {
			return("");
		}
		String majorName = major.getRequiredName();
		if (majorName == null || majorName.isEmpty() || majorName.isBlank()) {
			return("");
		}
		String tprojName = tproj.getRequiredName();
		if (tprojName == null || tprojName.isEmpty() || tprojName.isBlank()) {
			return("");
		}
		StringBuilder bldr = new StringBuilder();
		bldr.append(tprojName.toLowerCase());
		bldr.append("-v");
		bldr.append(majorName.toLowerCase());
		bldr.append('_');
		bldr.append(minorName.toLowerCase());
		bldr.append('-');
		bldr.append(schemaName.toLowerCase());
		return(bldr.toString());
	}

	public static String getSchemaName(IYCFLibAnyObj obj) {
		if (obj == null) {
			return("");
		}
		while (!(obj instanceof IYCFBamSchemaDefObj)) {
			if (obj instanceof IYCFBamTenantObj) {
				return("");
			}
			obj = obj.getObjScope();
			if (obj == null) {
				return("");
			}
		}
		IYCFBamSchemaDefObj schema = (IYCFBamSchemaDefObj)obj;
		String schemaName = schema.getRequiredName();
		if (schemaName == null || schemaName.isEmpty() || schemaName.isBlank()) {
			return("");
		}
		return(schemaName);
	}

	public static boolean inPrimaryIndexKey(IYCFBamTableObj tbl, IYCFBamValueObj value) {
		IYCFBamIndexObj idx = tbl.getOptionalLookupPrimaryIndex();
		if (idx == null) {
			idx = tbl.getPrimaryKeyIndex();
		}
		for (IYCFBamIndexColObj xcol: idx.getOptionalComponentsColumns()) {
			if (xcol.getRequiredLookupColumn() == value) {
				return(true);
			}
		}
		return(false);
	}

	public static boolean isTriviallyPublic(IYCFLibAnyObj what) {
		if (what == null) {
			return(true);
		}
		boolean isCurPublic = false;
		if (what instanceof IYCFBamTableObj tbl) {
			IYCFBamTableObj curTable = tbl;
			while( curTable != null ) {
				switch(curTable.getRequiredCodeVis()) {
					case Public: isCurPublic = true; break;
					default: isCurPublic = false;
				}
				if (!isCurPublic) {
					return(false);
				}
				IYCFBamRelationObj screl = curTable.getSuperClassRelation();
				if (screl != null) {
					curTable = screl.getRequiredLookupToTable();
				}
				else {
					curTable = null;
				}
			}
			return(true);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			switch (atom.getRequiredCodeVis()) {
				case Public:
					isCurPublic = true;
					break;
				default:
					isCurPublic = false;
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj) {
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				if (isCurPublic) {
					isCurPublic = isTriviallyPublic(tbl);
				}
			}
			return(isCurPublic);
		}
		else if (what instanceof IYCFBamTableColObj col) {
			switch (col.getRequiredCodeVis()) {
				case Public:
					isCurPublic = true;
					break;
				default:
					isCurPublic = false;
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (isCurPublic) {
				isCurPublic = isTriviallyPublic(tbl);
			}
			return(isCurPublic);
		}
		else if(what instanceof IYCFBamIndexColObj col) {
			return(isTriviallyPublic(col.getRequiredLookupColumn()));
		}
		else if(what instanceof IYCFBamRelationColObj col) {
			return(isTriviallyPublic(col.getRequiredLookupFromCol()) && isTriviallyPublic(col.getRequiredLookupToCol()));
		}
		else if(what instanceof IYCFBamIndexObj idx) {
			IYCFBamTableObj tbl = idx.getRequiredContainerTable();
			if( idx == tbl.getPrimaryKeyIndex()) {
				return(isTriviallyPublic(tbl));
			}
			switch(idx.getRequiredCodeVis()) {
				case Public:
					if (!isTriviallyPublic(tbl)) {
						return(false);
					}
					else {
						for (IYCFBamIndexColObj col: idx.getOptionalComponentsColumns()) {
							if (!isTriviallyPublic(col.getRequiredLookupColumn())) {
								return(false);
							}
						}
						return(true);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			switch (reln.getRequiredCodeVis()) {
				case Public:
					if(isTriviallyPublic(reln.getRequiredContainerFromTable()) && isTriviallyPublic(reln.getRequiredLookupToTable()) && isTriviallyPublic(reln.getRequiredLookupFromIndex()) && isTriviallyPublic(reln.getRequiredLookupToIndex())) {
//						for (IYCFBamRelationColObj col: reln.getOptionalComponentsColumns()) {
//							if (!isTriviallyPublic(col)) {
//								return(false);
//							}
//						}
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamParamObj) {
			return(true);
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			switch (meth.getRequiredCodeVis()) {
				case Public:
					if (!isTriviallyPublic(meth.getRequiredContainerForTable())) {
						return(false);
					}
//					for(IYCFBamParamObj p: meth.getOptionalComponentsParams()) {
//						if(!isTriviallyPublic(p)) {
//							return(false);
//						}
//					}
					if (meth instanceof IYCFBamServerObjFuncObj of) {
						if (!isTriviallyPublic(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerListFuncObj of) {
						if (!isTriviallyPublic(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerProcObj) {
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else {
			// anything which isn't recognizable is automatically protected
			return(true);
		}
	}

	public static boolean isIntermediatelyPublic(IYCFLibAnyObj what) {
		if (what == null) {
			return(true);
		}
		boolean isCurPublic = isTriviallyPublic(what);
		if (!isCurPublic) {
			return(false);
		}
		if (what instanceof IYCFBamTableObj tbl) {
			IYCFBamIndexObj idx = tbl.getPrimaryKeyIndex();
			if (idx != null) {
				isCurPublic = isIntermediatelyPublic(idx);
				if(!isCurPublic) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupAltIndex();
			if (idx != null) {
				isCurPublic = isIntermediatelyPublic(idx);
				if(!isCurPublic) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupLookupIndex();
			if (idx != null) {
				isCurPublic = isIntermediatelyPublic(idx);
				if(!isCurPublic) {
					return(false);
				}
			}
			return(true);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			switch (atom.getRequiredCodeVis()) {
				case Public:
					isCurPublic = true;
					break;
				default:
					isCurPublic = false;
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj) {
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				if (isCurPublic) {
					isCurPublic = isTriviallyPublic(tbl);
				}
			}
			return(isCurPublic);
		}
		else if (what instanceof IYCFBamTableColObj col) {
			switch (col.getRequiredCodeVis()) {
				case Public:
					isCurPublic = true;
					break;
				default:
					isCurPublic = false;
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (isCurPublic) {
				isCurPublic = isTriviallyPublic(tbl);
			}
			return(isCurPublic);
		}
		else if(what instanceof IYCFBamIndexColObj col) {
			return(isIntermediatelyPublic(col.getRequiredLookupColumn()));
		}
		else if(what instanceof IYCFBamRelationColObj col) {
			return(isIntermediatelyPublic(col.getRequiredLookupFromCol()) && isIntermediatelyPublic(col.getRequiredLookupToCol()));
		}
		else if(what instanceof IYCFBamIndexObj idx) {
			IYCFBamTableObj tbl = idx.getRequiredContainerTable();
			if( idx == tbl.getPrimaryKeyIndex()) {
				return(isTriviallyPublic(tbl));
			}
			switch(idx.getRequiredCodeVis()) {
				case Public:
					if (!isTriviallyPublic(tbl)) {
						return(false);
					}
					else {
						for (IYCFBamIndexColObj col: idx.getOptionalComponentsColumns()) {
							if (!isIntermediatelyPublic(col.getRequiredLookupColumn())) {
								return(false);
							}
						}
						return(true);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			switch (reln.getRequiredCodeVis()) {
				case Public:
					if(isTriviallyPublic(reln.getRequiredContainerFromTable()) && isTriviallyPublic(reln.getRequiredLookupToTable()) && isPublic(reln.getRequiredLookupFromIndex()) && isPublic(reln.getRequiredLookupToIndex())) {
						for (IYCFBamRelationColObj col: reln.getOptionalComponentsColumns()) {
							if (!isIntermediatelyPublic(col)) {
								return(false);
							}
						}
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamParamObj) {
			return(true);
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			switch (meth.getRequiredCodeVis()) {
				case Public:
					if (!isIntermediatelyPublic(meth.getRequiredContainerForTable())) {
						return(false);
					}
					for(IYCFBamParamObj p: meth.getOptionalComponentsParams()) {
						if(!isIntermediatelyPublic(p)) {
							return(false);
						}
					}
					if (meth instanceof IYCFBamServerObjFuncObj of) {
						if (!isIntermediatelyPublic(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerListFuncObj of) {
						if (!isIntermediatelyPublic(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerProcObj) {
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else {
			// anything which isn't recognizable is automatically protected
			return(true);
		}
	}

	public static boolean isPublic(IYCFLibAnyObj what) {
		if (what == null) {
			return(true);
		}
		boolean isCurPublic = isIntermediatelyPublic(what);
		if (!isCurPublic) {
			return(false);
		}
		if (what instanceof IYCFBamTableObj tbl) {
			IYCFBamIndexObj idx = tbl.getPrimaryKeyIndex();
			if (idx != null) {
				isCurPublic = isPublic(idx);
				if(!isCurPublic) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupAltIndex();
			if (idx != null) {
				isCurPublic = isPublic(idx);
				if(!isCurPublic) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupLookupIndex();
			if (idx != null) {
				isCurPublic = isPublic(idx);
				if(!isCurPublic) {
					return(false);
				}
			}
			return(true);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			switch (atom.getRequiredCodeVis()) {
				case Public:
					isCurPublic = true;
					break;
				default:
					isCurPublic = false;
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj) {
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				if (isCurPublic) {
					isCurPublic = isIntermediatelyPublic(tbl);
				}
			}
			return(isCurPublic);
		}
		else if (what instanceof IYCFBamTableColObj col) {
			switch (col.getRequiredCodeVis()) {
				case Public:
					isCurPublic = true;
					break;
				default:
					isCurPublic = false;
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (isCurPublic) {
				isCurPublic = isIntermediatelyPublic(tbl);
			}
			return(isCurPublic);
		}
		else if(what instanceof IYCFBamIndexColObj col) {
			return(isPublic(col.getRequiredLookupColumn()));
		}
		else if(what instanceof IYCFBamRelationColObj col) {
			return(isPublic(col.getRequiredLookupFromCol()) && isPublic(col.getRequiredLookupToCol()));
		}
		else if(what instanceof IYCFBamIndexObj idx) {
			IYCFBamTableObj tbl = idx.getRequiredContainerTable();
			if( idx == tbl.getPrimaryKeyIndex()) {
				return(isIntermediatelyPublic(tbl));
			}
			switch(idx.getRequiredCodeVis()) {
				case Public:
					if (!isIntermediatelyPublic(tbl)) {
						return(false);
					}
					else {
						for (IYCFBamIndexColObj col: idx.getOptionalComponentsColumns()) {
							if (!isPublic(col.getRequiredLookupColumn())) {
								return(false);
							}
						}
						return(true);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			switch (reln.getRequiredCodeVis()) {
				case Public:
					if(isIntermediatelyPublic(reln.getRequiredContainerFromTable()) && isIntermediatelyPublic(reln.getRequiredLookupToTable()) && isPublic(reln.getRequiredLookupFromIndex()) && isPublic(reln.getRequiredLookupToIndex())) {
						for (IYCFBamRelationColObj col: reln.getOptionalComponentsColumns()) {
							if (!isPublic(col)) {
								return(false);
							}
						}
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamParamObj) {
			return(true);
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			switch (meth.getRequiredCodeVis()) {
				case Public:
					if (!isPublic(meth.getRequiredContainerForTable())) {
						return(false);
					}
					for(IYCFBamParamObj p: meth.getOptionalComponentsParams()) {
						if(!isPublic(p)) {
							return(false);
						}
					}
					if (meth instanceof IYCFBamServerObjFuncObj of) {
						if (!isPublic(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerListFuncObj of) {
						if (!isPublic(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerProcObj) {
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else {
			// anything which isn't recognizable is automatically protected
			return(true);
		}
	}

	public static boolean isTriviallyProtected(IYCFLibAnyObj what) {
		if (what == null) {
			return(true);
		}
		boolean isCurProtected = false;
		if (what instanceof IYCFBamTableObj tbl) {
			IYCFBamTableObj curTable = tbl;
			while( curTable != null ) {
				switch(curTable.getRequiredCodeVis()) {
					case Public:
					case Protected: isCurProtected = true; break;
					default: isCurProtected = false;
				}
				if (!isCurProtected) {
					return(false);
				}
				IYCFBamRelationObj screl = curTable.getSuperClassRelation();
				if (screl != null) {
					curTable = screl.getRequiredLookupToTable();
				}
				else {
					curTable = null;
				}
			}
			return(true);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			switch (atom.getRequiredCodeVis()) {
				case Public:
				case Protected:
					isCurProtected = true;
					break;
				default:
					isCurProtected = false;
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj) {
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				if (isCurProtected) {
					isCurProtected = isTriviallyProtected(tbl);
				}
			}
			return(isCurProtected);
		}
		else if (what instanceof IYCFBamTableColObj col) {
			switch (col.getRequiredCodeVis()) {
				case Public:
				case Protected:
					isCurProtected = true;
					break;
				default:
					isCurProtected = false;
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (isCurProtected) {
				isCurProtected = isTriviallyProtected(tbl);
			}
			return(isCurProtected);
		}
		else if(what instanceof IYCFBamIndexColObj col) {
			return(isTriviallyProtected(col.getRequiredLookupColumn()));
		}
		else if(what instanceof IYCFBamRelationColObj col) {
			return(isTriviallyProtected(col.getRequiredLookupFromCol()) && isTriviallyProtected(col.getRequiredLookupToCol()));
		}
		else if(what instanceof IYCFBamIndexObj idx) {
			IYCFBamTableObj tbl = idx.getRequiredContainerTable();
			if( idx == tbl.getPrimaryKeyIndex()) {
				return(isTriviallyProtected(tbl));
			}
			switch(idx.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if (!isTriviallyProtected(tbl)) {
						return(false);
					}
					else {
						for (IYCFBamIndexColObj col: idx.getOptionalComponentsColumns()) {
							if (!isTriviallyProtected(col.getRequiredLookupColumn())) {
								return(false);
							}
						}
						return(true);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			switch (reln.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if(isTriviallyProtected(reln.getRequiredContainerFromTable()) && isTriviallyProtected(reln.getRequiredLookupToTable()) && isTriviallyProtected(reln.getRequiredLookupFromIndex()) && isTriviallyProtected(reln.getRequiredLookupToIndex())) {
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamParamObj) {
			return(true);
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			switch (meth.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if (!isTriviallyProtected(meth.getRequiredContainerForTable())) {
						return(false);
					}
					if (meth instanceof IYCFBamServerObjFuncObj of) {
						if (!isTriviallyProtected(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerListFuncObj of) {
						if (!isTriviallyProtected(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerProcObj) {
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else {
			// anything which isn't recognizable is automatically protected
			return(true);
		}
	}

	public static boolean isIntermediatelyProtected(IYCFLibAnyObj what) {
		if (what == null) {
			return(true);
		}
		boolean isCurProtected = isTriviallyProtected(what);
		if (!isCurProtected) {
			return(false);
		}
		if (what instanceof IYCFBamTableObj tbl) {
			IYCFBamIndexObj idx = tbl.getPrimaryKeyIndex();
			if (idx != null) {
				isCurProtected = isIntermediatelyProtected(idx);
				if(!isCurProtected) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupAltIndex();
			if (idx != null) {
				isCurProtected = isIntermediatelyProtected(idx);
				if(!isCurProtected) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupLookupIndex();
			if (idx != null) {
				isCurProtected = isIntermediatelyProtected(idx);
				if(!isCurProtected) {
					return(false);
				}
			}
			return(true);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			switch (atom.getRequiredCodeVis()) {
				case Public:
				case Protected:
					isCurProtected = true;
					break;
				default:
					isCurProtected = false;
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj) {
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				if (isCurProtected) {
					isCurProtected = isTriviallyProtected(tbl);
				}
			}
			return(isCurProtected);
		}
		else if (what instanceof IYCFBamTableColObj col) {
			switch (col.getRequiredCodeVis()) {
				case Public:
				case Protected:
					isCurProtected = true;
					break;
				default:
					isCurProtected = false;
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (isCurProtected) {
				isCurProtected = isTriviallyProtected(tbl);
			}
			return(isCurProtected);
		}
		else if(what instanceof IYCFBamIndexColObj col) {
			return(isIntermediatelyProtected(col.getRequiredLookupColumn()));
		}
		else if(what instanceof IYCFBamRelationColObj col) {
			return(isIntermediatelyProtected(col.getRequiredLookupFromCol()) && isIntermediatelyProtected(col.getRequiredLookupToCol()));
		}
		else if(what instanceof IYCFBamIndexObj idx) {
			IYCFBamTableObj tbl = idx.getRequiredContainerTable();
			if( idx == tbl.getPrimaryKeyIndex()) {
				return(isTriviallyProtected(tbl));
			}
			switch(idx.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if (!isTriviallyProtected(tbl)) {
						return(false);
					}
					else {
						for (IYCFBamIndexColObj col: idx.getOptionalComponentsColumns()) {
							if (!isIntermediatelyProtected(col.getRequiredLookupColumn())) {
								return(false);
							}
						}
						return(true);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			switch (reln.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if(isTriviallyProtected(reln.getRequiredContainerFromTable()) && isTriviallyProtected(reln.getRequiredLookupToTable()) && isProtected(reln.getRequiredLookupFromIndex()) && isProtected(reln.getRequiredLookupToIndex())) {
						for (IYCFBamRelationColObj col: reln.getOptionalComponentsColumns()) {
							if (!isIntermediatelyProtected(col)) {
								return(false);
							}
						}
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamParamObj) {
			return(true);
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			switch (meth.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if (!isIntermediatelyProtected(meth.getRequiredContainerForTable())) {
						return(false);
					}
					for(IYCFBamParamObj p: meth.getOptionalComponentsParams()) {
						if(!isIntermediatelyProtected(p)) {
							return(false);
						}
					}
					if (meth instanceof IYCFBamServerObjFuncObj of) {
						if (!isIntermediatelyProtected(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerListFuncObj of) {
						if (!isIntermediatelyProtected(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerProcObj) {
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else {
			// anything which isn't recognizable is automatically protected
			return(true);
		}
	}

	public static boolean isProtected(IYCFLibAnyObj what) {
		if (what == null) {
			return(true);
		}
		boolean isCurProtected = isIntermediatelyProtected(what);
		if (!isCurProtected) {
			return(false);
		}
		if (what instanceof IYCFBamTableObj tbl) {
			IYCFBamIndexObj idx = tbl.getPrimaryKeyIndex();
			if (idx != null) {
				isCurProtected = isProtected(idx);
				if(!isCurProtected) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupAltIndex();
			if (idx != null) {
				isCurProtected = isProtected(idx);
				if(!isCurProtected) {
					return(false);
				}
			}
			idx = tbl.getOptionalLookupLookupIndex();
			if (idx != null) {
				isCurProtected = isProtected(idx);
				if(!isCurProtected) {
					return(false);
				}
			}
			return(true);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			switch (atom.getRequiredCodeVis()) {
				case Public:
				case Protected:
					isCurProtected = true;
					break;
				default:
					isCurProtected = false;
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj) {
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				if (isCurProtected) {
					isCurProtected = isIntermediatelyProtected(tbl);
				}
			}
			return(isCurProtected);
		}
		else if (what instanceof IYCFBamTableColObj col) {
			switch (col.getRequiredCodeVis()) {
				case Public:
				case Protected:
					isCurProtected = true;
					break;
				default:
					isCurProtected = false;
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (isCurProtected) {
				isCurProtected = isIntermediatelyProtected(tbl);
			}
			return(isCurProtected);
		}
		else if(what instanceof IYCFBamIndexColObj col) {
			return(isProtected(col.getRequiredLookupColumn()));
		}
		else if(what instanceof IYCFBamRelationColObj col) {
			return(isProtected(col.getRequiredLookupFromCol()) && isProtected(col.getRequiredLookupToCol()));
		}
		else if(what instanceof IYCFBamIndexObj idx) {
			IYCFBamTableObj tbl = idx.getRequiredContainerTable();
			if( idx == tbl.getPrimaryKeyIndex()) {
				return(isIntermediatelyProtected(tbl));
			}
			switch(idx.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if (!isIntermediatelyProtected(tbl)) {
						return(false);
					}
					else {
						for (IYCFBamIndexColObj col: idx.getOptionalComponentsColumns()) {
							if (!isProtected(col.getRequiredLookupColumn())) {
								return(false);
							}
						}
						return(true);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			switch (reln.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if(isIntermediatelyProtected(reln.getRequiredContainerFromTable()) && isIntermediatelyProtected(reln.getRequiredLookupToTable()) && isProtected(reln.getRequiredLookupFromIndex()) && isProtected(reln.getRequiredLookupToIndex())) {
						for (IYCFBamRelationColObj col: reln.getOptionalComponentsColumns()) {
							if (!isProtected(col)) {
								return(false);
							}
						}
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else if(what instanceof IYCFBamParamObj) {
			return(true);
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			switch (meth.getRequiredCodeVis()) {
				case Public:
				case Protected:
					if (!isProtected(meth.getRequiredContainerForTable())) {
						return(false);
					}
					for(IYCFBamParamObj p: meth.getOptionalComponentsParams()) {
						if(!isProtected(p)) {
							return(false);
						}
					}
					if (meth instanceof IYCFBamServerObjFuncObj of) {
						if (!isProtected(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerListFuncObj of) {
						if (!isProtected(of.getOptionalLookupRetTable())) {
							return(false);
						}
						else {
							return(true);
						}
					}
					else if (meth instanceof IYCFBamServerProcObj) {
						return(true);
					}
					else {
						return(false);
					}
				default:
					return(false);
			}
		}
		else {
			// anything which isn't recognizable is automatically protected
			return(true);
		}
	}

	public static boolean isSpecificallyProtected(IYCFLibAnyObj what) {
		if (what == null) {
			return(false);
		}
		boolean isCurProtected = isProtected(what);
		if (!isCurProtected) {
			return(false);
		}
		if (what instanceof IYCFBamTableObj tbl) {
			return (tbl.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Protected);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			if (atom.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Protected) {
				return(true);
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj cur) {
				return(cur.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Protected);
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				return(isSpecificallyProtected(tbl));
			}
			else {
				return(false);
			}
		}
		else if (what instanceof IYCFBamTableColObj col) {
			if (col.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Protected ) {
				return(true);
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (tbl != null) {
				return(isSpecificallyProtected(tbl));
			}
			else {
				return(false);
			}
		}
		else if (what instanceof IYCFBamIndexColObj col) {
			return(isSpecificallyProtected(col.getRequiredLookupColumn()));
		}
		else if (what instanceof IYCFBamRelationColObj col) {
			return(isSpecificallyProtected(col.getRequiredLookupFromCol()) || isSpecificallyProtected(col.getRequiredLookupToCol()));
		}
		else if (what instanceof IYCFBamIndexObj idx) {
			IYCFBamTableObj tbl = idx.getRequiredContainerTable();
			if (idx.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Protected) {
				if (!isProtected(tbl)) {
					return(false);
				}
				else {
					for (IYCFBamIndexColObj col: idx.getOptionalComponentsColumns()) {
						if (!isProtected(col.getRequiredLookupColumn())) {
							return(false);
						}
					}
					return(true);
				}
			}
			else {
				return(isSpecificallyProtected(tbl));
			}
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			if (reln.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Protected) {
				if (isProtected(reln.getRequiredContainerFromTable()) && isProtected(reln.getRequiredLookupToTable()) && isProtected(reln.getRequiredLookupFromIndex()) && isProtected(reln.getRequiredLookupToIndex())) {
					return(true);
				}
				else {
					return(false);
				}
			}
			else {
				return(isSpecificallyProtected(reln.getRequiredContainerFromTable()));
			}
		}
		else if(what instanceof IYCFBamParamObj param) {
			return(isSpecificallyProtected(param.getRequiredContainerServerMeth()));
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			if (meth.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Protected) {
				if (!isProtected(meth.getRequiredContainerForTable())) {
					return(false);
				}
				if (meth instanceof IYCFBamServerObjFuncObj of) {
					if (!isProtected(of.getOptionalLookupRetTable())) {
						return(false);
					}
					else {
						return(true);
					}
				}
				else if (meth instanceof IYCFBamServerListFuncObj of) {
					if (!isProtected(of.getOptionalLookupRetTable())) {
						return(false);
					}
					else {
						return(true);
					}
				}
				else if (meth instanceof IYCFBamServerProcObj) {
					return(true);
				}
				else {
					return(false);
				}
			}
			else {
				return(isSpecificallyProtected(meth.getRequiredContainerForTable()));
			}
		}
		else {
			// anything which isn't recognizable is not specifically private
			return(false);
		}
	}

	public static boolean isTriviallyPrivate(IYCFLibAnyObj what) {
		if (what == null) {
			return(false);
		}
		else {
			return( !isTriviallyProtected(what) && !isTriviallyPublic(what));
		}
	}

	public static boolean isIntermediatelyPrivate(IYCFLibAnyObj what) {
		if (what == null) {
			return(false);
		}
		if(!isTriviallyPrivate(what)) {
			return(false);
		}
		else {
			return( !isIntermediatelyProtected(what) && !isIntermediatelyPublic(what));
		}
	}

	public static boolean isPrivate(IYCFLibAnyObj what) {
		if (what == null) {
			return(false);
		}
		if(!isIntermediatelyPrivate(what)) {
			return(false);
		}
		else {
			return( !isProtected(what) && !isPublic(what));
		}
	}

	public static boolean isSpecificallyPrivate(IYCFLibAnyObj what) {
		if (what == null) {
			return(false);
		}
		boolean isCurPrivate = isPrivate(what);
		if (!isCurPrivate) {
			return(false);
		}
		if (what instanceof IYCFBamTableObj tbl) {
			return (tbl.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Private);
		}
		else if (what instanceof IYCFBamAtomObj atom) {
			IYCFBamTableObj tbl = null;
			if (atom.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Private) {
				return(true);
			}
			if (atom instanceof IYCFBamBlobColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBlobTypeObj) {
			}
			else if (atom instanceof IYCFBamBoolColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamBoolTypeObj) {
			}
			else if (atom instanceof IYCFBamDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDateTypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash128GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash128TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash160GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash160TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash224GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash224TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash256GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash256TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash384GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash384TypeObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDbKeyHash512GenObj) {
			}
			else if (atom instanceof IYCFBamDbKeyHash512TypeObj) {
			}
			else if (atom instanceof IYCFBamDoubleColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamDoubleTypeObj) {
			}
			else if (atom instanceof IYCFBamFloatColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamFloatTypeObj) {
			}
			else if(atom instanceof IYCFBamEnumTypeObj cur) {
				return(cur.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Private);
			}
			else if (atom instanceof IYCFBamInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId16GenObj) {
			}
			else if (atom instanceof IYCFBamInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId32GenObj) {
			}
			else if (atom instanceof IYCFBamInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamId64GenObj) {
			}
			else if (atom instanceof IYCFBamInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamNmTokensColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNmTokensTypeObj) {
			}
			else if (atom instanceof IYCFBamNumberColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamNumberTypeObj) {
			}
			else if (atom instanceof IYCFBamStringColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamStringTypeObj) {
			}
			else if (atom instanceof IYCFBamTZDateColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZDateTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTZTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTZTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTextColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTextTypeObj) {
			}
			else if (atom instanceof IYCFBamTimeColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimeTypeObj) {
			}
			else if (atom instanceof IYCFBamTimestampColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTimestampTypeObj) {
			}
			else if (atom instanceof IYCFBamTokenColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamTokenTypeObj) {
			}
			else if (atom instanceof IYCFBamUInt16ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt16TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt32ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt32TypeObj) {
			}
			else if (atom instanceof IYCFBamUInt64ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUInt64TypeObj) {
			}
			else if (atom instanceof IYCFBamUuid6ColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuid6TypeObj) {
			}
			else if (atom instanceof IYCFBamUuidColObj col) {
				tbl = col.getRequiredContainerTable();
			}
			else if (atom instanceof IYCFBamUuidTypeObj) {
			}
			else {
			}
			if (tbl != null) {
				return(isSpecificallyPrivate(tbl));
			}
			else {
				return(false);
			}
		}
		else if (what instanceof IYCFBamTableColObj col) {
			if (col.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Private ) {
				return(true);
			}
			IYCFBamTableObj tbl = col.getRequiredContainerTable();
			if (tbl != null) {
				return(isSpecificallyPrivate(tbl));
			}
			else {
				return(false);
			}
		}
		else if (what instanceof IYCFBamIndexColObj col) {
			return(isSpecificallyPrivate(col.getRequiredContainerIndex().getRequiredContainerTable()) || isSpecificallyPrivate(col.getRequiredContainerIndex()) || isSpecificallyPrivate(col.getRequiredLookupColumn()));
		}
		else if (what instanceof IYCFBamRelationColObj col) {
			return(isSpecificallyPrivate(col.getRequiredContainerRelation()) || isSpecificallyPrivate(col.getRequiredLookupFromCol().getRequiredLookupColumn()) || isSpecificallyPrivate(col.getRequiredLookupToCol().getRequiredLookupColumn()));
		}
		else if (what instanceof IYCFBamIndexObj idx) {
			return(isSpecificallyPrivate(idx.getRequiredContainerTable()) || (idx.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Private));
		}
		else if(what instanceof IYCFBamRelationObj reln) {
			return(isSpecificallyPrivate(reln.getRequiredContainerFromTable()) || isSpecificallyPrivate(reln.getRequiredLookupToTable()) || isSpecificallyPrivate(reln.getRequiredLookupFromIndex()) || isSpecificallyPrivate(reln.getRequiredLookupToIndex()) || (reln.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Private));
		}
		else if(what instanceof IYCFBamParamObj param) {
			return(isSpecificallyPrivate(param.getRequiredContainerServerMeth().getRequiredContainerForTable()) || isSpecificallyPrivate(param.getRequiredContainerServerMeth()));
		}
		else if(what instanceof IYCFBamServerMethodObj meth) {
			if (meth.getRequiredCodeVis() == IYCFBamSchema.CodeVisibilityEnum.Private) {
				return(true);
			}
			else if (isSpecificallyPrivate(meth.getRequiredContainerForTable())) {
				return (true);
			}
			if (meth instanceof IYCFBamServerObjFuncObj of) {
				if (isSpecificallyPrivate(of.getOptionalLookupRetTable())) {
					return(true);
				}
			}
			else if (meth instanceof IYCFBamServerListFuncObj of) {
				if (isSpecificallyPrivate(of.getOptionalLookupRetTable())) {
					return(true);
				}
			}
			for (IYCFBamParamObj p: meth.getOptionalComponentsParams()) {
				if (isSpecificallyPrivate(p)) {
					return( true);
				}
			}
			if (meth instanceof IYCFBamServerProcObj) {
				return(true);
			}
			else {
				return(false);
			}
		}
		else {
			// anything which isn't recognizable is not specifically private
			return(false);
		}
	}

    public static boolean inSuperiorCandidateRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorCandidateRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSuperiorCandidateRelations.getSuperiorCandidateRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }
    
    public static boolean inSuperiorRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorRelations.getSuperiorRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

	public static boolean inDataRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inDataRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateDataRelations.getDataRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
						if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							return true;
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

	public static boolean inPrimaryKeyRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inPrimaryKeyRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIteratePrimaryKeyRelations.getPrimaryKeyRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
						if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							return true;
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

	public static boolean inSuperiorPrimaryKeyRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorPrimaryKeyRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorRelations.getSuperiorRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								return true;
							}
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

	public static boolean inSuperiorCandidatePrimaryKeyRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorCandidatePrimaryKeyRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSuperiorCandidateRelations.getSuperiorCandidateRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								return true;
							}
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

	public static boolean inSuperiorNonCandidatePrimaryKeyRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorNonCandidatePrimaryKeyRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> nonCandidateRelations = MSSBamYCFGenIterateSuperiorNonCandidateRelations.getSuperiorNonCandidateRelations(tableDef);
            if (nonCandidateRelations != null) {
                for(IYCFLibAnyObj curObj : nonCandidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								return true;
							}
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

	public static boolean inSuperiorDataRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorDataRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorRelations.getSuperiorRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (!MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								return true;
							}
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

	public static boolean inSuperiorCandidateDataRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorCandidateDataRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSuperiorCandidateRelations.getSuperiorCandidateRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (!MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								return true;
							}
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

	public static boolean inSuperiorNonCandidateDataRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorNonCandidateDataRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> nonCandidateRelations = MSSBamYCFGenIterateSuperiorNonCandidateRelations.getSuperiorNonCandidateRelations(tableDef);
            if (nonCandidateRelations != null) {
                for(IYCFLibAnyObj curObj : nonCandidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (!MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								return true;
							}
						}
					}
                }
            }
            return false;
        }
        else {
            return false;
        }
	}

    public static IYCFBamRelationObj derefFirstSuperiorRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefFirstSuperiorRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSuperiorRelations.getSuperiorRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return relationDef;
                        }
                    }
                }
            }
            return null;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationObj derefFirstSuperiorCandidateRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefFirstSuperiorCandidateRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSuperiorCandidateRelations.getSuperiorCandidateRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return relationDef;
                        }
                    }
                }
            }
            return null;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSuperiorCandidateRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorCandidateRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSuperiorCandidateRelations.getSuperiorCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							if (retval != null) {
								throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
							}
							else {
								retval = relationCol;
							}
                        }
                    }
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }
    
    public static IYCFBamRelationColObj derefSuperiorRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorRelations.getSuperiorRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							if (retval != null) {
								throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
							}
							else {
								retval = relationCol;
							}
                        }
                    }
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

	public static IYCFBamRelationColObj derefSuperiorPrimaryKeyRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperioPrimaryKeyRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorRelations.getSuperiorRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
	}

	public static IYCFBamRelationColObj derefSuperiorCandidatePrimaryKeyRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorCandidatePrimaryKeyRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorCandidateRelations.getSuperiorCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
	}

	public static IYCFBamRelationColObj derefSuperiorNonCandidatePrimaryKeyRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorNonCandidatePrimaryKeyRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorNonCandidateRelations.getSuperiorNonCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if (MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
	}

	public static IYCFBamRelationColObj derefSuperiorDataRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorDataRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorRelations.getSuperiorRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( ! MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
	}

	public static IYCFBamRelationColObj derefSuperiorCandidateDataRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorCandidateDataRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorCandidateRelations.getSuperiorCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( ! MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
	}

	public static IYCFBamRelationColObj derefSuperiorNonCandidateDataRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorNonCandidateDataRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorNonCandidateRelations.getSuperiorNonCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( ! MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
	}

	public static List<IYCFBamRelationObj> getInheritedRelations(IYCFBamTableObj tableDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.getInheritedRelations";
		if( tableDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				1,
				"tableDef" );
		}
		ArrayList<IYCFBamRelationObj> retlist = new ArrayList<>();
		IYCFBamTableObj curTable = tableDef;
		while (curTable != null) {
			for (IYCFBamRelationObj cur: curTable.getChildrenRelations()) {
				if (cur.getRequiredRelationType() != RelationTypeEnum.Superclass) {
					retlist.add(cur);
				}
			}
			IYCFBamRelationObj screl = curTable.getSuperClassRelation();
			if (screl != null) {
				curTable = screl.getRequiredLookupToTable();
			}
			else {
				curTable = null;
			}
		}
		return( retlist );
	}

    public static IYCFBamRelationObj derefReverseRelation(IYCFBamRelationObj relationDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefReverseRelation";
		if( relationDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				1,
				"relationDef" );
		}
		IYCFBamTableObj fromTable = relationDef.getRequiredContainerFromTable();
		IYCFBamTableObj toTable = relationDef.getRequiredLookupToTable();
		IYCFBamIndexObj fromIndex = relationDef.getRequiredLookupFromIndex();
		List<IYCFBamRelationObj> inheritedToRelations = getInheritedRelations(toTable);
		List<IYCFBamRelationObj> toRelationsReferencingFromIndex = new ArrayList<>();
		for (IYCFBamRelationObj cur: inheritedToRelations) {
			if (cur.getRequiredLookupToIndex() == fromIndex) {
				toRelationsReferencingFromIndex.add(cur);
			}
		}
		if( toRelationsReferencingFromIndex.size() == 1) {
			return(toRelationsReferencingFromIndex.get(0));
		}
		else if( toRelationsReferencingFromIndex.isEmpty()) {
//			System.err.println("WARNING: No reverse relations matching from index for " + relationDef.getObjFullName() + " exist");
			return( null );
		}
		else {
			List<IYCFBamRelationObj> toRelationsWithAllColsMatching = new ArrayList<>();
			for(IYCFBamRelationObj cur: toRelationsReferencingFromIndex) {
				if (relationDef.getOptionalComponentsColumns().size() == cur.getOptionalComponentsColumns().size()) {
					boolean anymismatches = false;
					Iterator<IYCFBamRelationColObj> mycoliter = relationDef.getOptionalComponentsColumns().iterator();
					Iterator<IYCFBamRelationColObj> theircoliter = cur.getOptionalComponentsColumns().iterator();
					while (mycoliter.hasNext()) {
						IYCFBamRelationColObj mine = mycoliter.next();
						IYCFBamRelationColObj theirs = theircoliter.next();
						if (!mine.getRequiredLookupToCol().getRequiredName().equals(theirs.getRequiredLookupFromCol().getRequiredName())) {
							anymismatches = true;
						}
					}
					if (!anymismatches) {
						toRelationsWithAllColsMatching.add(cur);
					}
//					else {
//						System.err.println("Filtered out " + cur.getObjFullName() + " from candidates for " + relationDef.getObjFullName() + " due to mismatched names");
//					}
				}
//				else {
//					System.err.println("Filtered out " + cur.getObjFullName() + " from candidates for " + relationDef.getObjFullName() + " due to mismatched column counts");
//				}
			}
			if( toRelationsWithAllColsMatching.size() == 1) {
//				System.err.println("Matched reverse relationship " + toRelationsWithAllColsMatching.get(0).getObjFullName() + " for " + relationDef.getObjFullName());
				return(toRelationsWithAllColsMatching.get(0));
			}
			else if( toRelationsWithAllColsMatching.isEmpty()) {
//				System.err.println("WARNING: All " + toRelationsReferencingFromIndex.size() + " reverse relations matching from index for " + relationDef.getObjFullName() + "filtered out due to mismatched columns");
				return( null );
			}
			else {
//				System.err.println("WARNING: Multiple (" + toRelationsWithAllColsMatching.size() + " reverse relations matching from index for " + relationDef.getObjFullName() + " remain after filtering for matching columns");
				throw new YCFLibUnresolvedRelationException(MSSBamYCFAnyObj.class, S_ProcName, "Multiple candidate reverse relationships found for " + relationDef.getRequiredContainerFromTable().getObjName() + "." + relationDef.getRequiredName() + " in target table " + toTable.getRequiredName());
			}
		}
    }

    public static List<IYCFBamRelationObj> derefReverseRelationships(IYCFBamRelationObj relationDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefReverseRelationships";
		if( relationDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				1,
				"relationDef" );
		}
		IYCFBamTableObj fromTable = relationDef.getRequiredContainerFromTable();
		IYCFBamTableObj toTable = relationDef.getRequiredLookupToTable();
		List<IYCFBamRelationObj> inheritedToRelations = getInheritedRelations(toTable);
		List<IYCFBamRelationObj> toRelationsReferencingFromTable = new ArrayList<>();
		for (IYCFBamRelationObj cur: inheritedToRelations) {
			if (cur.getRequiredLookupToTable() == fromTable) {
				toRelationsReferencingFromTable.add(cur);
			}
		}
		IYCFBamIndexObj fromIndex = relationDef.getRequiredLookupFromIndex();
		List<IYCFBamRelationObj> toRelationsReferencingFromIndex = new ArrayList<>();
		for (IYCFBamRelationObj cur: toRelationsReferencingFromTable) {
			if( cur.getRequiredLookupToIndex() == fromIndex) {
				toRelationsReferencingFromIndex.add(cur);
			}
		}

		return(toRelationsReferencingFromIndex);
    }

    public static boolean inSubservientRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientRelations.getSubservientRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientDataRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientDataRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientDataRelations.getSubservientDataRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientPrimaryKeyRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientPrimaryKeyRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientPrimaryKeyRelations.getSubservientPrimaryKeyRelations(tableDef);
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSuperiorNonCandidateRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperiorNonCandidateRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> nonCandidateRelations = MSSBamYCFGenIterateSuperiorNonCandidateRelations.getSuperiorNonCandidateRelations(tableDef);
            if (nonCandidateRelations != null) {
                for(IYCFLibAnyObj curObj : nonCandidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientCandidateRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientCandidateRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSubservientCandidateRelations.getSubservientCandidateRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientCandidateDataRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientCandidateDataRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSubservientCandidateDataRelations.getSubservientCandidateDataRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientCandidatePrimaryKeyRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientCandidatePrimaryKeyRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> candidateRelations = MSSBamYCFGenIterateSubservientCandidatePrimaryKeyRelations.getSubservientCandidatePrimaryKeyRelations(tableDef);
            if (candidateRelations != null) {
                for(IYCFLibAnyObj curObj : candidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientNonCandidateRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientNonCandidateRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> nonCandidateRelations = MSSBamYCFGenIterateSubservientNonCandidateRelations.getSubservientNonCandidateRelations(tableDef);
            if (nonCandidateRelations != null) {
                for(IYCFLibAnyObj curObj : nonCandidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientNonCandidateDataRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientNonCandidateDataRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> nonCandidateRelations = MSSBamYCFGenIterateSubservientNonCandidateDataRelations.getSubservientNonCandidateDataRelations(tableDef);
            if (nonCandidateRelations != null) {
                for(IYCFLibAnyObj curObj : nonCandidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean inSubservientNonCandidatePrimaryKeyRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSubservientNonCandidatePrimaryKeyRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> nonCandidateRelations = MSSBamYCFGenIterateSubservientNonCandidatePrimaryKeyRelations.getSubservientNonCandidatePrimaryKeyRelations(tableDef);
            if (nonCandidateRelations != null) {
                for(IYCFLibAnyObj curObj : nonCandidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static IYCFBamRelationObj derefFirstSuperiorNonCandidateRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefFirstSuperiorNonCandidateRelation";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> nonCandidateRelations = MSSBamYCFGenIterateSuperiorNonCandidateRelations.getSuperiorNonCandidateRelations(tableDef);
            if (nonCandidateRelations != null) {
                for(IYCFLibAnyObj curObj : nonCandidateRelations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
                    for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
                        if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                            return relationDef;
                        }
                    }
                }
            }
            return null;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientRelations.getSubservientRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
						if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							if (retval != null) {
								throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
							}
							else {
								retval = relationCol;
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientDataRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientDataRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientDataRelations.getSubservientDataRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( ! MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientPrimaryKeyRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientPrimaryKeyRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientPrimaryKeyRelations.getSubservientPrimaryKeyRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSuperiorNonCandidateRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSuperiorNonCandidateRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSuperiorNonCandidateRelations.getSuperiorNonCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
						if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							if (retval != null) {
								throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
							}
							else {
								retval = relationCol;
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientCandidateRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientCandidateRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientCandidateRelations.getSubservientCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
						if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							if (retval != null) {
								throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
							}
							else {
								retval = relationCol;
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientCandidateDataRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientCandidateDataRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientCandidateDataRelations.getSubservientCandidateDataRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( ! MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientCandidatePrimaryKeyRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientCandidatePrimaryKeyRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientCandidatePrimaryKeyRelations.getSubservientCandidatePrimaryKeyRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientNonCandidateRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientNonCandidateRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientNonCandidateRelations.getSubservientNonCandidateRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
						if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
							if (retval != null) {
								throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
							}
							else {
								retval = relationCol;
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientNonCandidateDataRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientNonCandidateDataRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientNonCandidateDataRelations.getSubservientNonCandidateDataRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( ! MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static IYCFBamRelationColObj derefSubservientNonCandidatePrimaryKeyRelationCol(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.derefSubservientNonCandidatePrimaryKeyRelationCol";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return null;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            List<IYCFLibAnyObj> relations = MSSBamYCFGenIterateSubservientNonCandidatePrimaryKeyRelations.getSubservientNonCandidatePrimaryKeyRelations(tableDef);
			IYCFBamRelationColObj retval = null;
            if (relations != null) {
                for(IYCFLibAnyObj curObj : relations) {
                    IYCFBamRelationObj relationDef = (YCFBamRelationObj)curObj;
					if ( MSSBamYCFGenBindIsRelationInPrimaryIndex.isRelationInPrimaryIndex(relationDef)) {
						for(IYCFBamRelationColObj relationCol : relationDef.getOptionalComponentsColumns()) {
							if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
								if (retval != null) {
									throw new YCFLibCollisionDetectedException( MSSBamYCFAnyObj.class, S_ProcName, relationCol.getPKey());
								}
								else {
									retval = relationCol;
								}
							}
						}
					}
                }
            }
            return retval;
        }
        else {
            return null;
        }
    }

    public static boolean inSuperClassRelation(IYCFBamValueObj valueDef) {
        final String S_ProcName = "MSSYCFBamYCFAnyObj.inSuperClassRelationn";
		if( valueDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"valueDef" );
		}
        if (!isValidTableColumn(valueDef)) {
            return false;
        }
        IYCFLibAnyObj scopeDef = valueDef.getObjScope();
        if (scopeDef == null) {
            throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
            S_ProcName,
            0,
            "valueDef.scopeDef" );
        }
        else if(scopeDef instanceof IYCFBamTableObj tableDef) {
            IYCFBamRelationObj superClassRelation = tableDef.getSuperClassRelation();
            if (superClassRelation == null) {
                return false;
            }
            for(IYCFBamRelationColObj relationCol : superClassRelation.getOptionalComponentsColumns()) {
                if(relationCol.getRequiredLookupFromCol().getRequiredLookupColumn() == valueDef) {
                    return true;
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public static boolean isValidTableColumn(IYCFBamValueObj valueDef) {
        if (valueDef == null) {
            return false;
        }
        else if( valueDef instanceof IYCFBamTableColObj
            || valueDef instanceof IYCFBamBlobColObj
            || valueDef instanceof IYCFBamBoolColObj
            || valueDef instanceof IYCFBamDbKeyHash128ColObj
            || valueDef instanceof IYCFBamDbKeyHash160ColObj
            || valueDef instanceof IYCFBamDbKeyHash224ColObj
            || valueDef instanceof IYCFBamDbKeyHash256ColObj
            || valueDef instanceof IYCFBamDbKeyHash384ColObj
            || valueDef instanceof IYCFBamDbKeyHash512ColObj
            || valueDef instanceof IYCFBamDoubleColObj
            || valueDef instanceof IYCFBamFloatColObj
            || valueDef instanceof IYCFBamInt16ColObj
            || valueDef instanceof IYCFBamInt32ColObj
            || valueDef instanceof IYCFBamInt64ColObj
            || valueDef instanceof IYCFBamUInt16ColObj
            || valueDef instanceof IYCFBamUInt32ColObj
            || valueDef instanceof IYCFBamUInt64ColObj
            || valueDef instanceof IYCFBamDateColObj
            || valueDef instanceof IYCFBamTimeColObj
            || valueDef instanceof IYCFBamTimestampColObj
            || valueDef instanceof IYCFBamTZDateColObj
            || valueDef instanceof IYCFBamTZTimeColObj
            || valueDef instanceof IYCFBamTZTimestampColObj
            || valueDef instanceof IYCFBamUuidColObj
            || valueDef instanceof IYCFBamUuid6ColObj
            || valueDef instanceof IYCFBamStringColObj
            || valueDef instanceof IYCFBamNmTokenColObj
            || valueDef instanceof IYCFBamNmTokensColObj
            || valueDef instanceof IYCFBamTokenColObj
            || valueDef instanceof IYCFBamTextColObj
            || valueDef instanceof IYCFBamNumberColObj )
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static IYCFBamSchemaDefObj getDefSchema(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getDefSchema";
    	IYCFLibAnyObj curDef = anyDef;
		IYCFBamSchemaDefObj defSchema;
		if( curDef == null ) {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}
		else if( curDef instanceof IYCFBamValueObj ) {
			defSchema = ((IYCFBamValueObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamSchemaDefObj ) {
			defSchema = (IYCFBamSchemaDefObj)curDef;
		}
		else if( curDef instanceof IYCFBamChainObj ) {
			defSchema = ((IYCFBamChainObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamDelDepObj ) {
			defSchema = ((IYCFBamDelDepObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamEnumTagObj ) {
			defSchema = ((IYCFBamEnumTagObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamIndexColObj ) {
			defSchema = ((IYCFBamIndexColObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamIndexObj ) {
			defSchema = ((IYCFBamIndexObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamParamObj ) {
			defSchema = ((IYCFBamParamObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamPopDepObj ) {
			defSchema = ((IYCFBamPopDepObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamRelationColObj ) {
			defSchema = ((IYCFBamRelationColObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamRelationObj ) {
			defSchema = ((IYCFBamRelationObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamServerMethodObj ) {
			defSchema = ((IYCFBamServerMethodObj)curDef).getOptionalLookupDefSchema();
		}
		else if( curDef instanceof IYCFBamTableObj ) {
			defSchema = ((IYCFBamTableObj)curDef).getOptionalLookupDefSchema();
		}
		else {
			defSchema = null;
		}

    	IYCFBamSchemaDefObj topSchema = null;
    	IYCFBamSchemaDefObj firstSchemaEncountered = null;
    	IYCFBamSchemaDefObj lastInterruptedSchema = null;
		if( defSchema != null ) {
			firstSchemaEncountered = defSchema;
			curDef = defSchema;
		}
		else {
    		for( curDef = anyDef; curDef != null; curDef = curDef.getObjScope() ) {
    			if( curDef instanceof IYCFBamSchemaDefObj ) {
    				if( lastInterruptedSchema == null ) {
    					firstSchemaEncountered = (IYCFBamSchemaDefObj)curDef;
    				}
    				topSchema = (IYCFBamSchemaDefObj)curDef;
    				lastInterruptedSchema = topSchema;
    			}
    			else {
    				lastInterruptedSchema = null;
    			}
    		}

    		if( topSchema != null ) {
    			defSchema = firstSchemaEncountered;
				curDef = defSchema;
    		}
		}
		return( defSchema );
	}

    public static String getDefDomainName(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getDefDomainName";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
    		defSchema = getDefSchema( curDef );
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

        for ( ; curDef != null; curDef = (curDef != null ? curDef.getObjScope() : null )) {
			if (curDef instanceof IYCFBamTopDomainObj) {
				break;
			}
			else if (curDef instanceof IYCFBamSubDomainObj) {
				break;
			}
			else if (curDef instanceof IYCFBamTenantObj) {
				curDef = null;
                break;
			}
		}

        String s = null;
        if (curDef != null) {
            s = curDef.getObjName();
            curDef = curDef.getObjScope();
            while (curDef != null) {
                if (curDef instanceof IYCFBamTldObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = null;
                }
                else if (curDef instanceof IYCFBamTopDomainObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamSubDomainObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamTenantObj) {
                    curDef = null;
                }
            }
        }
		return( s );
	}

    public static IYCFLibAnyObj getDefProject(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getDefProject";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
    		defSchema = getDefSchema( curDef );
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

        for ( ; curDef != null; curDef = curDef.getObjScope() ) {
			if (curDef instanceof IYCFBamTopProjectObj) {
				return (curDef);
			}
			else if (curDef instanceof IYCFBamSubProjectObj) {
				return (curDef);
			}
			else if (curDef instanceof IYCFBamTenantObj) {
				return (null);
			}
		}

		return( null );
	}

    public static IYCFLibAnyObj getDefTopProject(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getDefTopProject";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
    		defSchema = getDefSchema( curDef );
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

        for ( ; curDef != null; curDef = curDef.getObjScope() ) {
			if (curDef instanceof IYCFBamTopProjectObj) {
				return (curDef);
			}
			else if (curDef instanceof IYCFBamTenantObj) {
				return (null);
			}
		}

		return( null );
	}

    public static IYCFLibAnyObj getDefSubProject(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getDefSubProject";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
    		defSchema = getDefSchema( curDef );
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

        for ( ; curDef != null; curDef = curDef.getObjScope() ) {
			if (curDef instanceof IYCFBamSubProjectObj) {
				return (curDef);
			}
			else if (curDef instanceof IYCFBamTenantObj) {
				return (null);
			}
		}

		return( null );
	}

    public static String getDefProjectName(IYCFLibAnyObj anyDef)
    {
    	IYCFLibAnyObj curDef = getDefProject(anyDef);
		if( curDef != null ) {
            String s = null;
            s = curDef.getObjName();
            curDef = curDef.getObjScope();
            while (curDef != null) {
                if (curDef instanceof IYCFBamTldObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = null;
                }
                else if (curDef instanceof IYCFBamTopDomainObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamSubDomainObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamTopProjectObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamSubProjectObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamTenantObj) {
                    curDef = null;
                }
                else {
                    curDef = curDef.getObjScope();
                }
            }
            return( s );
        }
        else {
            return( null );
        }
	}

    public static String getDefTopProjectName(IYCFLibAnyObj anyDef)
    {
    	IYCFLibAnyObj curDef = getDefTopProject(anyDef);
		if( curDef != null ) {
            String s = null;
            s = curDef.getObjName();
            curDef = curDef.getObjScope();
            while (curDef != null) {
                if (curDef instanceof IYCFBamTldObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = null;
                }
                else if (curDef instanceof IYCFBamTopDomainObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamSubDomainObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamTopProjectObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamTenantObj) {
                    curDef = null;
                }
                else {
                    curDef = curDef.getObjScope();
                }
            }
            return( s );
        }
        else {
            return( null );
        }
	}

    public static String getDefSubProjectName(IYCFLibAnyObj anyDef)
    {
    	IYCFLibAnyObj curDef = getDefSubProject(anyDef);
		if( curDef != null ) {
            String s = null;
            s = curDef.getObjName();
            return( s );
        }
        else {
            return( null );
        }
	}

    public static IYCFLibAnyObj getProject(IYCFLibAnyObj anyDef)
    {
    	IYCFBamSchemaDefObj topSchema = null;
    	IYCFBamSchemaDefObj firstSchemaEncountered = null;
    	IYCFBamSchemaDefObj lastInterruptedSchema = null;
    	IYCFLibAnyObj curDef;
    	for( curDef = anyDef; curDef != null; curDef = curDef.getObjScope() ) {
    		if( curDef instanceof IYCFBamSchemaDefObj ) {
    			if( lastInterruptedSchema == null ) {
    				firstSchemaEncountered = (IYCFBamSchemaDefObj)curDef;
    			}
    			topSchema = (IYCFBamSchemaDefObj)curDef;
    			lastInterruptedSchema = topSchema;
    		}
    		else {
    			lastInterruptedSchema = null;
    		}
    	}

    	if( topSchema != null ) {
    		curDef = firstSchemaEncountered;
    	}
    	else {
    		curDef = anyDef;
    	}

        for ( ; curDef != null; curDef = curDef.getObjScope() ) {
            if( curDef instanceof IYCFBamTopProjectObj ) {
                return( curDef );
            }
            else if( curDef instanceof IYCFBamSubProjectObj ) {
                return( curDef );
            }
            else if( curDef instanceof IYCFBamTenantObj ) {
                return (null);
            }
        }
        return (null);
    }

    public static IYCFBamSchemaDefObj getTopSchema(IYCFLibAnyObj anyDef)
    {
    	IYCFBamSchemaDefObj topSchema = null;
    	IYCFLibAnyObj curDef;
    	for( curDef = anyDef; curDef != null; curDef = curDef.getObjScope() ) {
    		if( curDef instanceof IYCFBamSchemaDefObj ) {
    			topSchema = (IYCFBamSchemaDefObj)curDef;
    		}
    	}
        return (topSchema);
    }

    public static IYCFBamTopDomainObj getTopDomain(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getTopDomain";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
    		defSchema = getDefSchema( curDef );
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

    	for ( ; curDef != null; curDef = curDef.getObjScope())
        {
            if (curDef instanceof IYCFBamTopDomainObj)
            {
                return ((IYCFBamTopDomainObj)curDef);
            }
            else if (curDef instanceof IYCFBamTenantObj)
            {
                return (null);
            }
        }
        return (null);
    }

    public static String getTopDomainName(IYCFLibAnyObj anyDef)
    {
    	IYCFLibAnyObj curDef = getTopDomain(anyDef);
		if( curDef != null ) {
            String s = null;
            s = curDef.getObjName();
            curDef = curDef.getObjScope();
            while (curDef != null) {
                if (curDef instanceof IYCFBamTldObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = null;
                }
                else if (curDef instanceof IYCFBamTopDomainObj) {
                    s = curDef.getObjName() + "." + s;
                    curDef = curDef.getObjScope();
                }
                else if (curDef instanceof IYCFBamTenantObj) {
                    curDef = null;
                }
                else {
                    curDef = curDef.getObjScope();
                }
            }
            return( s );
        }
        else {
            return( null );
        }
	}

    public static IYCFBamSchemaDefObj getSchema(IYCFLibAnyObj anyDef)
    {
    	for ( IYCFLibAnyObj curDef = anyDef; curDef != null; curDef = curDef.getObjScope())
        {
            if (curDef instanceof IYCFBamSchemaDefObj)
            {
                return ((IYCFBamSchemaDefObj)curDef);
            }
            else if (curDef instanceof IYCFBamTenantObj)
            {
                return (null);
            }
        }
        return (null);
    }

    public static IYCFLibAnyObj getVersionLeaf(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getVersionLeaf";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
			if( curDef instanceof IYCFBamSchemaDefObj ) {
				defSchema = (IYCFBamSchemaDefObj)curDef;
			}
			else {
				defSchema = getDefSchema( curDef );
			}
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

    	for ( ; curDef != null; curDef = curDef.getObjScope() ) {
            if (curDef instanceof IYCFBamMinorVersionObj) {
                return (curDef);
            }
            else if (curDef instanceof IYCFBamMajorVersionObj) {
                return (curDef);
            }
            else if (curDef instanceof IYCFBamTopProjectObj) {
                return (null);
            }
            else if (curDef instanceof IYCFBamSubProjectObj) {
                return (null);
            }
            else if (curDef instanceof IYCFBamTenantObj) {
                return (null);
            }
        }
        return (null);
    }

    public static String getVersionString(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getVersionString";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
			if( curDef instanceof IYCFBamSchemaDefObj ) {
				defSchema = (IYCFBamSchemaDefObj)curDef;
			}
			else {
				defSchema = getDefSchema( curDef );
			}
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

    	IYCFLibAnyObj scopeDef;
        IYCFLibAnyObj versionLeafDef = getVersionLeaf(curDef);
        List<String> invertedNodeNames = new ArrayList<String>();
        while (versionLeafDef != null) {
            invertedNodeNames.add(versionLeafDef.getObjName());
            scopeDef = versionLeafDef.getObjScope();
            if (scopeDef == null) {
                versionLeafDef = null;
            }
            else if (scopeDef instanceof IYCFBamMinorVersionObj) {
                versionLeafDef = (IYCFBamMinorVersionObj)scopeDef;
            }
            else if (scopeDef instanceof IYCFBamMajorVersionObj) {
                versionLeafDef = (IYCFBamMajorVersionObj)scopeDef;
            }
            else {
                versionLeafDef = null;
            }
        }

        String ret = "";
        for (int idx = invertedNodeNames.size() - 1; idx >= 0; idx--) {
            if (ret.length() == 0) {
                ret = invertedNodeNames.get(idx);
            }
            else {
                ret = ret + "-" + invertedNodeNames.get(idx);
            }
        }

        return( ret );
    }

    public static String getPackedVersionString(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getPackedVersionString";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
    		defSchema = getDefSchema( curDef );
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

    	IYCFLibAnyObj scopeDef;
        IYCFLibAnyObj versionLeafDef = getVersionLeaf(curDef);
        List<String> invertedNodeNames = new ArrayList<String>();
        while (versionLeafDef != null)
        {
            invertedNodeNames.add(versionLeafDef.getObjName() );
            scopeDef = versionLeafDef.getObjScope();
            if (scopeDef == null) {
                versionLeafDef = null;
            }
            else if (scopeDef instanceof IYCFBamMinorVersionObj) {
                versionLeafDef = (IYCFBamMinorVersionObj)scopeDef;
            }
            else if (scopeDef instanceof IYCFBamMajorVersionObj) {
                versionLeafDef = (IYCFBamMajorVersionObj)scopeDef;
            }
            else {
                versionLeafDef = null;
            }
        }
        String ret = "";
        for (int idx = invertedNodeNames.size() - 1; idx >= 0; idx--) {
            if (ret.length() == 0) {
                ret = invertedNodeNames.get(idx);
            }
            else {
                ret = ret + invertedNodeNames.get(idx);
            }
        }
        return( ret );
    }

    public static String getFullName(IYCFLibAnyObj anyDef)
    {
        String ret = anyDef.getObjName();
        IYCFLibAnyObj scopeDef = anyDef.getObjScope();
        while ((scopeDef != null) && ! (scopeDef instanceof IYCFBamTenantObj))
        {
            ret = scopeDef.getObjName() + "." + ret;
            scopeDef = scopeDef.getObjScope();
        }
        return (ret);
    }

    public static String getPackageName(IYCFLibAnyObj anyDef)
    {
        IYCFLibAnyObj pkg = getPackage(anyDef);
        String ret = pkg.getObjName();
        return (ret);
    }

    public static String getModelName(IYCFLibAnyObj anyDef)
    {
        String ret = anyDef.getObjName();
        IYCFLibAnyObj scopeDef = anyDef.getObjScope();
        while ((scopeDef != null) && !(scopeDef instanceof IYCFBamTenantObj))
        {
            ret = scopeDef.getObjName() + "." + ret;
            scopeDef = scopeDef.getObjScope();
        }
        return (ret);
    }

    public static IYCFLibAnyObj getDefPackage(IYCFLibAnyObj anyDef)
    {
		final String S_ProcName = "MSSBamYCFAnyObj.getDefPackage";
    	IYCFLibAnyObj curDef = anyDef;
    	IYCFBamSchemaDefObj defSchema;
		if( curDef != null ) {
    		defSchema = getDefSchema( curDef );
		}
		else {
			throw new YCFLibNullArgumentException( MSSBamYCFAnyObj.class,
				S_ProcName,
				0,
				"curDef" );
		}

   		if( defSchema != null ) {
			curDef = defSchema;
   		}

        for (; curDef != null; curDef = curDef.getObjScope()) {
            if (curDef instanceof IYCFBamTopProjectObj) {
                return (curDef);
            }
            else if (curDef instanceof IYCFBamSubProjectObj) {
                return (curDef);
            }
            else if (curDef instanceof IYCFBamTenantObj) {
                return (null);
            }
            else {
                curDef = curDef.getObjScope();
            }
        }
        return (null);
    }

    public static IYCFLibAnyObj getPackage(IYCFLibAnyObj anyDef)
    {
    	IYCFBamSchemaDefObj topSchema = null;
    	IYCFBamSchemaDefObj firstSchemaEncountered = null;
    	IYCFBamSchemaDefObj lastInterruptedSchema = null;
    	for( IYCFLibAnyObj curDef = anyDef; curDef != null; curDef = curDef.getObjScope() ) {
    		if( curDef instanceof IYCFBamSchemaDefObj ) {
    			if( lastInterruptedSchema == null ) {
    				firstSchemaEncountered = (IYCFBamSchemaDefObj)curDef;
    			}
    			topSchema = (IYCFBamSchemaDefObj)curDef;
    			lastInterruptedSchema = topSchema;
    		}
    		else {
    			lastInterruptedSchema = null;
    		}
    	}

    	IYCFLibAnyObj curDef;
    	if( topSchema != null ) {
    		curDef = firstSchemaEncountered;
    	}
    	else {
    		curDef = anyDef;
    	}

        for (; curDef != null; curDef = curDef.getObjScope()) {
            if (curDef instanceof IYCFBamTopProjectObj) {
                return (curDef);
            }
            else if (curDef instanceof IYCFBamSubProjectObj) {
                return (curDef);
            }
            else if (curDef instanceof IYCFBamTenantObj) {
                return (null);
            }
        }
        return (null);
    }

    public static IYCFLibAnyObj getDefByModelName(
        IYCFBamScopeObj modelScope,
        String modelName)
    {
        try
        {
            String thisName;
            String remainder;
            int idxDot = modelName.indexOf('.');
            if (idxDot > 0)
            {
                thisName = modelName.substring(0, idxDot);
                remainder = modelName.substring(idxDot + 1, modelName.length() - (idxDot + 1));
            }
            else
            {
                thisName = modelName;
                remainder = "";
            }

            IYCFLibAnyObj resolved = modelScope.getNamedObject( thisName );
            if (resolved == null)
            {
                throw new RuntimeException("MSSBamYCFAnyObj.getDefByModelName() Could not resolve \"" + thisName + "\" in scope \"" + getFullName(modelScope) + "\"");
            }

            if (remainder.length() > 0)
            {
                resolved = getDefByModelName((IYCFBamScopeObj)resolved, remainder);
            }

            return (resolved);
        }
        catch (NullPointerException e)
        {
            System.err.append("MSSBamYCFAnyObj.getDefByModelName() Caught NullPointerException\n");
            throw e;
        }
    }

    public static IYCFLibAnyObj getDefByGlobalName(
        IYCFBamScopeObj modelScope,
        String globalName)
    {
        final String S_ProcName = "MSSBamYCFAnyObj.getDefByGlobalName() ";

        if ((globalName == null) || (globalName.length() == 0)) {
            throw new RuntimeException(S_ProcName + "Argument globalName is null or empty");
        }

        IYCFBamScopeObj searchScope = modelScope;
        while ((searchScope != null)
            && (!(searchScope instanceof IYCFBamTenantObj)))
        {
            searchScope = (IYCFBamScopeObj)(searchScope.getObjScope());
        }
        if (searchScope == null) {
            throw new RuntimeException(S_ProcName + "Could not chain scope to a Tenant definition");
        }

        IYCFLibAnyObj searchDef = searchScope;
        IYCFLibAnyObj foundNext;
        String remainingName = globalName;
        String nextName;
        String nowRemaining;
        while ((remainingName != null) && (remainingName.length() > 0)) {
            int nextDot = remainingName.indexOf('.');
            if (nextDot > 0) {
                nextName = remainingName.substring(0, nextDot);
                nowRemaining = remainingName.substring(nextDot + 1);
            }
            else {
                nextName = remainingName;
                nowRemaining = "";
            }
        	foundNext = searchDef.getNamedObject( nextName );
            if (foundNext == null) {
            	throw new YCFLibRuntimeException( MSSBamYCFAnyObj.class,
            		S_ProcName,
            		"Could not resolve name part " + nextName + " of global name \"" + globalName + "\" in " + searchDef.getClass().getSimpleName() + " " + searchDef.getObjName() );
            }
            searchDef = foundNext;
            remainingName = nowRemaining;
        }
        return (searchDef);
    }
}

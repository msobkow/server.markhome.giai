// Description: Java 17 implJustProtementation of a TableInfo buffer

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.secure.secure.buff;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;
import server.markhome.cf.CFXmlUtil;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

public class SecureProtBuffTableInfo
	implements ISecureProtTableInfo, Comparable<Object>, Serializable
{
	protected int requiredTableInfoId;
	protected int requiredRevision;
	protected String requiredSchemaName;
	protected String requiredTableName;
	protected String optionalSuperName;
	protected int requiredBackingClassCode;
	protected int requiredRuntimeClassCode;
	protected boolean requiredHasHistory;
	protected boolean requiredIsMutable;
	protected String requiredSecScopeName;
	protected String requiredCodeVis;

	public BusModelProtBuffTableInfo() {
		requiredTableInfoId = ISecurePubTableInfo.TABLEINFOID_INIT_VALUE;
		requiredSchemaName = ISecurePubTableInfo.SCHEMANAME_INIT_VALUE;
		requiredTableName = ISecurePubTableInfo.TABLENAME_INIT_VALUE;
		optionalSuperName = null;
		requiredBackingClassCode = ISecurePubTableInfo.BACKINGCLASSCODE_INIT_VALUE;
		requiredRuntimeClassCode = ISecurePubTableInfo.RUNTIMECLASSCODE_INIT_VALUE;
		requiredHasHistory = ISecurePubTableInfo.HASHISTORY_INIT_VALUE;
		requiredIsMutable = ISecurePubTableInfo.ISMUTABLE_INIT_VALUE;
		requiredSecScopeName = ISecurePubTableInfo.SECSCOPENAME_INIT_VALUE;
		requiredCodeVis = ISecurePubTableInfo.CODEVIS_INIT_VALUE;
	}

	@Override
	public Integer getPKey() {
		return (requiredTableInfoId);
	}

	@Override
	public void setPKey(Integer requiredTableInfoId) {
		if(requiredTableInfoId != null) {
			this.requiredTableInfoId = requiredTableInfoId;
		}
	}

	@Override
	public int getRequiredTableInfoId() {
		return(requiredTableInfoId);
	}

	@Override
	public void setRequiredTableInfoId( int value ) {
		if( value < ISecurePubTableInfo.TABLEINFOID_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredTableInfoId",
				1,
				"value",
				value,
				ISecurePubTableInfo.TABLEINFOID_MIN_VALUE );
		}
		requiredTableInfoId = value;
	}

	@Override
	public int getRequiredRevision() {
		return( requiredRevision );
	}

	@Override
	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	@Override
	public int getClassCode() {
		return( ISecureProtTableInfo.CLASS_CODE );
	}

	@Override
	public ISecureProtTableInfo getOptionalParentSuperRef(String argSuperName) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalParentSuperRef", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtTableInfoTable targetTable = targetBackingSecure.getTableTableInfo();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalParentSuperRef", 0, "ISecureProtSchema.getBackingSecure().getTableTableInfo()");
		}
		return(targetTable.readDerivedByTableNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getOptionalSuperName()));
	}

	@Override
	public void setOptionalParentSuperRef(String argSuperName) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalParentSuperRef-args", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtTableInfoTable targetTable = targetBackingSecure.getTableTableInfo();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "setOptionalParentSuperRef", 0, "ISecureSchema.getBackingSecure().getTableTableInfo()");
		}
		ISecureProtTableInfo found = targetTable.readDerivedByTableNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), argSuperName);
		if (found == null || (found != null && ((found instanceof ISecureProtTableInfo) || (found instanceof ISecureProtTableInfo) || (found instanceof ISecurePubTableInfo)))) {
			super.setOptionalParentSuperRef(argSuperName);
		optionalSuperName = argSuperName;
		}
		else {
			throw new CFUnsupportedClassException(getClass(), "setOptionalParentSuperRef-args", "found", found, "ISecureProtTableInfoISecureProtTableInfoISecurePubTableInfo");
		}
	}

	@Override
	public void setOptionalParentSuperRef(ISecureProtTableInfo argObj) {

		if(argObj == null) {
			setJustProtOptionalSuperName(null);
		}
		else {
			setJustProtOptionalSuperName(argObj.getRequiredTableName());
		}
	}

	@Override
	public void setOptionalParentSuperRef(ISecurePubTableInfo argObj) {

		if(argObj == null) {
			setJustProtOptionalSuperName(null);
		}
		else {
			setJustProtOptionalSuperName(argObj.getRequiredTableName());
		}
	}

	@Override
	public List<ISecureProtTableInfo> getOptionalChildrenSubRefs(String argTableName) {
		ISecureProtSchema targetBackingSecure = ISecureProtSchema.getBackingSecure();
		if (targetBackingSecure == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenSubRefs", 0, "ISecureProtSchema.getBackingSecure()");
		}
		ISecureProtTableInfoTable targetTable = targetBackingSecure.getTableTableInfo();
		if (targetTable == null) {
			throw new CFNullArgumentException(getClass(), "getOptionalChildrenSubRefs", 0, "ISecureProtSchema.getBackingSecure().getTableTableInfo()");
		}
		ISecureProtTableInfo[] targetArr = targetTable.readDerivedBySuperNameIdx(ISecureSchema.getAuthorizationCallback().getEffectiveAuthorization(), getRequiredTableName());
		if( targetArr != null ) {
			List<ISecureProtTableInfo> results = new ArrayList<>(targetArr.length);
			for (int idx = 0; idx < targetArr.length; idx++) {
				results.add(targetArr[idx]);
			}
			return(results);
		}
		else {
			List<ISecureProtTableInfo> results = new ArrayList<>();
			return(results);
		}
	}

	@Override
	public String getRequiredSchemaName() {
		return(requiredSchemaName);
	}

	public void setRequiredSchemaName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSchemaName",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSchemaName",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredSchemaName = value;
	}

	@Override
	public String getRequiredTableName() {
		return(requiredTableName);
	}

	public void setRequiredTableName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredTableName",
				1,
				"value" );
		}
		else if( value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredTableName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredTableName = value;
	}

	@Override
	public String getOptionalSuperName() {
		return(optionalSuperName);
	}

	public void setOptionalSuperName( String value ) {
		if( value != null && value.length() > 64 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setOptionalSuperName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		optionalSuperName = value;
	}

	@Override
	public int getRequiredBackingClassCode() {
		return(requiredBackingClassCode);
	}

	@Override
	public void setRequiredBackingClassCode( int value ) {
		if( value < ISecurePubTableInfo.BACKINGCLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredBackingClassCode",
				1,
				"value",
				value,
				ISecurePubTableInfo.BACKINGCLASSCODE_MIN_VALUE );
		}
		requiredBackingClassCode = value;
	}

	@Override
	public int getRequiredRuntimeClassCode() {
		return(requiredRuntimeClassCode);
	}

	@Override
	public void setRequiredRuntimeClassCode( int value ) {
		if( value < ISecurePubTableInfo.RUNTIMECLASSCODE_MIN_VALUE ) {
			throw new CFArgumentUnderflowException( getClass(),
				"setRequiredRuntimeClassCode",
				1,
				"value",
				value,
				ISecurePubTableInfo.RUNTIMECLASSCODE_MIN_VALUE );
		}
		requiredRuntimeClassCode = value;
	}

	@Override
	public boolean getRequiredHasHistory() {
		return(requiredHasHistory);
	}

	public void setRequiredHasHistory( boolean value ) {
		requiredHasHistory = value;
	}

	@Override
	public boolean getRequiredIsMutable() {
		return(requiredIsMutable);
	}

	public void setRequiredIsMutable( boolean value ) {
		requiredIsMutable = value;
	}

	@Override
	public String getRequiredSecScopeName() {
		return(requiredSecScopeName);
	}

	public void setRequiredSecScopeName( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredSecScopeName",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredSecScopeName",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredSecScopeName = value;
	}

	@Override
	public String getRequiredCodeVis() {
		return(requiredCodeVis);
	}

	public void setRequiredCodeVis( String value ) {
		if( value == null ) {
			throw new CFNullArgumentException( getClass(),
				"setRequiredCodeVis",
				1,
				"value" );
		}
		else if( value.length() > 32 ) {
			throw new CFArgumentOverflowException( getClass(),
				"setRequiredCodeVis",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredCodeVis = value;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof ISecureProtTableInfo rhs ) {
			if( getRequiredTableInfoId() != rhs.getRequiredTableInfoId() ) {
				return( false );
			}
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			if( getRequiredHasHistory() != rhs.getRequiredHasHistory() ) {
				return( false );
			}
			if( getRequiredIsMutable() != rhs.getRequiredIsMutable() ) {
				return( false );
			}
			if( getRequiredSecScopeName() != null ) {
				if( rhs.getRequiredSecScopeName() != null ) {
					if( ! getRequiredSecScopeName().equals( rhs.getRequiredSecScopeName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecScopeName() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoH rhs ) {
			if( getRequiredTableInfoId() != rhs.getRequiredTableInfoId() ) {
				return( false );
			}
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			if( getRequiredHasHistory() != rhs.getRequiredHasHistory() ) {
				return( false );
			}
			if( getRequiredIsMutable() != rhs.getRequiredIsMutable() ) {
				return( false );
			}
			if( getRequiredSecScopeName() != null ) {
				if( rhs.getRequiredSecScopeName() != null ) {
					if( ! getRequiredSecScopeName().equals( rhs.getRequiredSecScopeName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecScopeName() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoHPKey ) {
			ISecureProtTableInfoHPKey rhs = (ISecureProtTableInfoHPKey)obj;
			if( getRequiredTableInfoId() != rhs.getRequiredTableInfoId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoByTableNameIdxKey rhs ) {
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySuperNameIdxKey rhs ) {
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaNameIdxKey rhs ) {
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaBkCodeIdxKey rhs ) {
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaRTCodeIdxKey rhs ) {
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecurePubTableInfo rhs ) {
			if( getRequiredTableInfoId() != rhs.getRequiredTableInfoId() ) {
				return( false );
			}
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			if( getRequiredHasHistory() != rhs.getRequiredHasHistory() ) {
				return( false );
			}
			if( getRequiredIsMutable() != rhs.getRequiredIsMutable() ) {
				return( false );
			}
			if( getRequiredSecScopeName() != null ) {
				if( rhs.getRequiredSecScopeName() != null ) {
					if( ! getRequiredSecScopeName().equals( rhs.getRequiredSecScopeName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecScopeName() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubTableInfoH rhs ) {
			if( getRequiredTableInfoId() != rhs.getRequiredTableInfoId() ) {
				return( false );
			}
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			if( getRequiredHasHistory() != rhs.getRequiredHasHistory() ) {
				return( false );
			}
			if( getRequiredIsMutable() != rhs.getRequiredIsMutable() ) {
				return( false );
			}
			if( getRequiredSecScopeName() != null ) {
				if( rhs.getRequiredSecScopeName() != null ) {
					if( ! getRequiredSecScopeName().equals( rhs.getRequiredSecScopeName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSecScopeName() != null ) {
					return( false );
				}
			}
			if( getRequiredCodeVis() != null ) {
				if( rhs.getRequiredCodeVis() != null ) {
					if( ! getRequiredCodeVis().equals( rhs.getRequiredCodeVis() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredCodeVis() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecurePubTableInfoHPKey rhs ) {
			if( getRequiredTableInfoId() != rhs.getRequiredTableInfoId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoByTableNameIdxKey rhs ) {
			if( getRequiredTableName() != null ) {
				if( rhs.getRequiredTableName() != null ) {
					if( ! getRequiredTableName().equals( rhs.getRequiredTableName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredTableName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySuperNameIdxKey rhs ) {
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					if( ! getOptionalSuperName().equals( rhs.getOptionalSuperName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaNameIdxKey rhs ) {
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaBkCodeIdxKey rhs ) {
			if( getRequiredSchemaName() != null ) {
				if( rhs.getRequiredSchemaName() != null ) {
					if( ! getRequiredSchemaName().equals( rhs.getRequiredSchemaName() ) ) {
						return( false );
					}
				}
				else {
					return( false );
				}
			}
			else {
				if( rhs.getRequiredSchemaName() != null ) {
					return( false );
				}
			}
			if( getRequiredBackingClassCode() != rhs.getRequiredBackingClassCode() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaRTCodeIdxKey rhs ) {
			if( getRequiredRuntimeClassCode() != rhs.getRequiredRuntimeClassCode() ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredTableInfoId();
		if( getRequiredSchemaName() != null ) {
			hashCode = hashCode + getRequiredSchemaName().hashCode();
		}
		if( getRequiredTableName() != null ) {
			hashCode = hashCode + getRequiredTableName().hashCode();
		}
		if( getOptionalSuperName() != null ) {
			hashCode = hashCode + getOptionalSuperName().hashCode();
		}
		hashCode = hashCode + getRequiredBackingClassCode();
		hashCode = hashCode + getRequiredRuntimeClassCode();
		if( getRequiredHasHistory() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredIsMutable() ) {
			hashCode = ( hashCode * 2 ) + 1;
		}
		else {
			hashCode = hashCode * 2;
		}
		if( getRequiredSecScopeName() != null ) {
			hashCode = hashCode + getRequiredSecScopeName().hashCode();
		}
		if( getRequiredCodeVis() != null ) {
			hashCode = hashCode + getRequiredCodeVis().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	@Override
	public int compareTo( Object obj ) {
		int cmp;
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof ISecureProtTableInfo rhs ) {
			cmp = 0;
			if( getRequiredTableInfoId() < rhs.getRequiredTableInfoId() ) {
				return( -1 );
			}
			else if( getRequiredTableInfoId() > rhs.getRequiredTableInfoId() ) {
				return( 1 );
			}
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}
			if( getRequiredHasHistory() ) {
				if( ! rhs.getRequiredHasHistory() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredHasHistory() ) {
					return( -1 );
				}
			}
			if( getRequiredIsMutable() ) {
				if( ! rhs.getRequiredIsMutable() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsMutable() ) {
					return( -1 );
				}
			}
			if (getRequiredSecScopeName() != null) {
				if (rhs.getRequiredSecScopeName() != null) {
					cmp = getRequiredSecScopeName().compareTo( rhs.getRequiredSecScopeName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecScopeName() != null) {
				return( -1 );
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
 		}
		else if( obj instanceof ISecureProtTableInfoHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredTableInfoId() < rhs.getRequiredTableInfoId() ) {
				return( -1 );
			}
			else if( getRequiredTableInfoId() > rhs.getRequiredTableInfoId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtTableInfoH rhs ) {
			cmp = 0;
			if( getRequiredTableInfoId() < rhs.getRequiredTableInfoId() ) {
				return( -1 );
			}
			else if( getRequiredTableInfoId() > rhs.getRequiredTableInfoId() ) {
				return( 1 );
			}
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}
			if( getRequiredHasHistory() ) {
				if( ! rhs.getRequiredHasHistory() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredHasHistory() ) {
					return( -1 );
				}
			}
			if( getRequiredIsMutable() ) {
				if( ! rhs.getRequiredIsMutable() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsMutable() ) {
					return( -1 );
				}
			}
			if (getRequiredSecScopeName() != null) {
				if (rhs.getRequiredSecScopeName() != null) {
					cmp = getRequiredSecScopeName().compareTo( rhs.getRequiredSecScopeName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecScopeName() != null) {
				return( -1 );
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecureProtTableInfoByTableNameIdxKey rhs ) {
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtTableInfoBySuperNameIdxKey rhs ) {
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaNameIdxKey rhs ) {
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaBkCodeIdxKey rhs ) {
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecureProtTableInfoBySchemaRTCodeIdxKey rhs ) {
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfo rhs ) {
			cmp = 0;
			if( getRequiredTableInfoId() < rhs.getRequiredTableInfoId() ) {
				return( -1 );
			}
			else if( getRequiredTableInfoId() > rhs.getRequiredTableInfoId() ) {
				return( 1 );
			}
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}
			if( getRequiredHasHistory() ) {
				if( ! rhs.getRequiredHasHistory() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredHasHistory() ) {
					return( -1 );
				}
			}
			if( getRequiredIsMutable() ) {
				if( ! rhs.getRequiredIsMutable() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsMutable() ) {
					return( -1 );
				}
			}
			if (getRequiredSecScopeName() != null) {
				if (rhs.getRequiredSecScopeName() != null) {
					cmp = getRequiredSecScopeName().compareTo( rhs.getRequiredSecScopeName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecScopeName() != null) {
				return( -1 );
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfoHPKey rhs ) {
			if( getRequiredRevision() < rhs.getRequiredRevision() ) {
				return( -1 );
			}
			else if( getRequiredRevision() > rhs.getRequiredRevision() ) {
				return( 1 );
			}
			if( getRequiredTableInfoId() < rhs.getRequiredTableInfoId() ) {
				return( -1 );
			}
			else if( getRequiredTableInfoId() > rhs.getRequiredTableInfoId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfoH rhs ) {
			cmp = 0;
			if( getRequiredTableInfoId() < rhs.getRequiredTableInfoId() ) {
				return( -1 );
			}
			else if( getRequiredTableInfoId() > rhs.getRequiredTableInfoId() ) {
				return( 1 );
			}
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}
			if( getRequiredHasHistory() ) {
				if( ! rhs.getRequiredHasHistory() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredHasHistory() ) {
					return( -1 );
				}
			}
			if( getRequiredIsMutable() ) {
				if( ! rhs.getRequiredIsMutable() ) {
					return( 1 );
				}
			}
			else {
				if( rhs.getRequiredIsMutable() ) {
					return( -1 );
				}
			}
			if (getRequiredSecScopeName() != null) {
				if (rhs.getRequiredSecScopeName() != null) {
					cmp = getRequiredSecScopeName().compareTo( rhs.getRequiredSecScopeName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSecScopeName() != null) {
				return( -1 );
			}
			if (getRequiredCodeVis() != null) {
				if (rhs.getRequiredCodeVis() != null) {
					cmp = getRequiredCodeVis().compareTo( rhs.getRequiredCodeVis() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredCodeVis() != null) {
				return( -1 );
			}
			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfoByTableNameIdxKey rhs ) {
			if (getRequiredTableName() != null) {
				if (rhs.getRequiredTableName() != null) {
					cmp = getRequiredTableName().compareTo( rhs.getRequiredTableName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredTableName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfoBySuperNameIdxKey rhs ) {
			if( getOptionalSuperName() != null ) {
				if( rhs.getOptionalSuperName() != null ) {
					cmp = getOptionalSuperName().compareTo( rhs.getOptionalSuperName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSuperName() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfoBySchemaNameIdxKey rhs ) {
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfoBySchemaBkCodeIdxKey rhs ) {
			if (getRequiredSchemaName() != null) {
				if (rhs.getRequiredSchemaName() != null) {
					cmp = getRequiredSchemaName().compareTo( rhs.getRequiredSchemaName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else if (rhs.getRequiredSchemaName() != null) {
				return( -1 );
			}
			if( getRequiredBackingClassCode() < rhs.getRequiredBackingClassCode() ) {
				return( -1 );
			}
			else if( getRequiredBackingClassCode() > rhs.getRequiredBackingClassCode() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof ISecurePubTableInfoBySchemaRTCodeIdxKey rhs ) {
			if( getRequiredRuntimeClassCode() < rhs.getRequiredRuntimeClassCode() ) {
				return( -1 );
			}
			else if( getRequiredRuntimeClassCode() > rhs.getRequiredRuntimeClassCode() ) {
				return( 1 );
			}			return( 0 );
		}
		else {
			throw new CFUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	@Override
	public void set( ISecureProtTableInfo src ) {
		setJustProtTableInfo( src );
	}

	@Override
	public void setTableInfo( ISecureProtTableInfo src ) {
		setJustProtRequiredTableInfoId(src.getRequiredTableInfoId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtOptionalParentSuperRef(src.getOptionalParentSuperRef());
		setJustProtRequiredSchemaName(src.getRequiredSchemaName());
		setJustProtRequiredTableName(src.getRequiredTableName());
		setJustProtOptionalSuperName(src.getOptionalSuperName());
		setJustProtRequiredBackingClassCode(src.getRequiredBackingClassCode());
		setJustProtRequiredRuntimeClassCode(src.getRequiredRuntimeClassCode());
		setJustProtRequiredHasHistory(src.getRequiredHasHistory());
		setJustProtRequiredIsMutable(src.getRequiredIsMutable());
		setJustProtRequiredSecScopeName(src.getRequiredSecScopeName());
		setJustProtRequiredCodeVis(src.getRequiredCodeVis());
	}

	@Override
	public void set( ISecureProtTableInfoH src ) {
		setJustProtTableInfo( src );
	}

	@Override
	public void setTableInfo( ISecureProtTableInfoH src ) {
		setJustProtRequiredTableInfoId(src.getRequiredTableInfoId());
		setJustProtOptionalParentSuperRef(src.getOptionalParentSuperRef());
		setJustProtRequiredSchemaName(src.getRequiredSchemaName());
		setJustProtRequiredTableName(src.getRequiredTableName());
		setJustProtOptionalSuperName(src.getOptionalSuperName());
		setJustProtRequiredBackingClassCode(src.getRequiredBackingClassCode());
		setJustProtRequiredRuntimeClassCode(src.getRequiredRuntimeClassCode());
		setJustProtRequiredHasHistory(src.getRequiredHasHistory());
		setJustProtRequiredIsMutable(src.getRequiredIsMutable());
		setJustProtRequiredSecScopeName(src.getRequiredSecScopeName());
		setJustProtRequiredCodeVis(src.getRequiredCodeVis());
	}

	@Override
	public void set( ISecurePubTableInfo src ) {
		setJustProtTableInfo( src );
	}

	@Override
	public void setTableInfo( ISecurePubTableInfo src ) {
		setJustProtRequiredTableInfoId(src.getRequiredTableInfoId());
		setJustProtRequiredRevision( src.getRequiredRevision() );
		setJustProtOptionalParentSuperRef(src.getOptionalParentSuperRef());
		setJustProtRequiredSchemaName(src.getRequiredSchemaName());
		setJustProtRequiredTableName(src.getRequiredTableName());
		setJustProtOptionalSuperName(src.getOptionalSuperName());
		setJustProtRequiredBackingClassCode(src.getRequiredBackingClassCode());
		setJustProtRequiredRuntimeClassCode(src.getRequiredRuntimeClassCode());
		setJustProtRequiredHasHistory(src.getRequiredHasHistory());
		setJustProtRequiredIsMutable(src.getRequiredIsMutable());
		setJustProtRequiredSecScopeName(src.getRequiredSecScopeName());
		setJustProtRequiredCodeVis(src.getRequiredCodeVis());
	}

	@Override
	public void set( ISecurePubTableInfoH src ) {
		setJustProtTableInfo( src );
	}

	@Override
	public void setTableInfo( ISecurePubTableInfoH src ) {
		setJustProtRequiredTableInfoId(src.getRequiredTableInfoId());
		setJustProtOptionalParentSuperRef(src.getOptionalParentSuperRef());
		setJustProtRequiredSchemaName(src.getRequiredSchemaName());
		setJustProtRequiredTableName(src.getRequiredTableName());
		setJustProtOptionalSuperName(src.getOptionalSuperName());
		setJustProtRequiredBackingClassCode(src.getRequiredBackingClassCode());
		setJustProtRequiredRuntimeClassCode(src.getRequiredRuntimeClassCode());
		setJustProtRequiredHasHistory(src.getRequiredHasHistory());
		setJustProtRequiredIsMutable(src.getRequiredIsMutable());
		setJustProtRequiredSecScopeName(src.getRequiredSecScopeName());
		setJustProtRequiredCodeVis(src.getRequiredCodeVis());
	}

	@Override
	public String getXmlAttrFragment() {
		String ret = pkey.getXmlAttrFragment()
			+ " classCode=\"" + getClassCode() + "\""
			+ " RequiredRevision=\"" + Integer.toString( getRequiredRevision() ) + "\"" + "\"" + Integer.toString( getRequiredTableInfoId() ) + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredSchemaName() ) + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredTableName() ) + "\"" + ( ( getOptionalSuperName() == null ) ? "null" : "\"" + StringEscapeUtils.escapeXml11( getOptionalSuperName() ) + "\"" ) + "\"" + Integer.toString( getRequiredBackingClassCode() ) + "\"" + "\"" + Integer.toString( getRequiredRuntimeClassCode() ) + "\"" + (( getRequiredHasHistory() ) ? "\"true\"" : "\"false\"" ) + (( getRequiredIsMutable() ) ? "\"true\"" : "\"false\"" ) + "\"" + StringEscapeUtils.escapeXml11( getRequiredSecScopeName() ) + "\"" + "\"" + StringEscapeUtils.escapeXml11( getRequiredCodeVis() ) + "\"";
		return( ret );
	}

	@Override
	public String toString() {
		String ret = "<SecureProtBuffTableInfo" + getXmlAttrFragment() + "/>";
		return( ret );
	}
}

// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
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

public class YCFBamNmTokensTypeTableObj
	implements IYCFBamNmTokensTypeTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> members;
	private Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> allNmTokensType;
	private Map< YCFBamValueByUNameIdxKey,
		IYCFBamNmTokensTypeObj > indexByUNameIdx;
	private Map< YCFBamValueByValTentIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByValTentIdx;
	private Map< YCFBamValueByScopeIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByScopeIdx;
	private Map< YCFBamValueByDefSchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByDefSchemaIdx;
	private Map< YCFBamValueByPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByPrevIdx;
	private Map< YCFBamValueByNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByNextIdx;
	private Map< YCFBamValueByContPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByContPrevIdx;
	private Map< YCFBamValueByContNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByContNextIdx;
	private Map< YCFBamValueByCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByCodeVisIdx;
	private Map< YCFBamValueByScopeCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexByScopeCodeVisIdx;
	private Map< YCFBamNmTokensTypeBySchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > > indexBySchemaIdx;
	public static String TABLE_NAME = "NmTokensType";
	public static String TABLE_DBNAME = "nmtknstyp";

	public YCFBamNmTokensTypeTableObj() {
		schema = null;
		members = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
		allNmTokensType = null;
		indexByUNameIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByContPrevIdx = null;
		indexByContNextIdx = null;
		indexByCodeVisIdx = null;
		indexByScopeCodeVisIdx = null;
		indexBySchemaIdx = null;
	}

	public YCFBamNmTokensTypeTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
		allNmTokensType = null;
		indexByUNameIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByContPrevIdx = null;
		indexByContNextIdx = null;
		indexByCodeVisIdx = null;
		indexByScopeCodeVisIdx = null;
		indexBySchemaIdx = null;
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( IYCFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allNmTokensType = null;
		indexByUNameIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByPrevIdx = null;
		indexByNextIdx = null;
		indexByContPrevIdx = null;
		indexByContNextIdx = null;
		indexByCodeVisIdx = null;
		indexByScopeCodeVisIdx = null;
		indexBySchemaIdx = null;
		List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
		IYCFBamNmTokensTypeObj cur = null;
		Iterator<IYCFBamNmTokensTypeObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamNmTokensTypeObj.
	 */
	public IYCFBamNmTokensTypeObj newInstance() {
		IYCFBamNmTokensTypeObj inst = new YCFBamNmTokensTypeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamNmTokensTypeObj.
	 */
	public IYCFBamNmTokensTypeEditObj newEditInstance( IYCFBamNmTokensTypeObj orig ) {
		IYCFBamNmTokensTypeEditObj edit = new YCFBamNmTokensTypeEditObj( orig );
		return( edit );
	}

	public IYCFBamNmTokensTypeObj realiseNmTokensType( IYCFBamNmTokensTypeObj Obj ) {
		IYCFBamNmTokensTypeObj obj = Obj;
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamNmTokensTypeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamNmTokensTypeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFBamValueByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByValTentIdx != null ) {
				YCFBamValueByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					indexByPrevIdx.remove( keyPrevIdx );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					indexByNextIdx.remove( keyNextIdx );
				}
			}

			if( indexByContPrevIdx != null ) {
				YCFBamValueByContPrevIdxKey keyContPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
				keyContPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContPrevIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyContPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
				if( mapContPrevIdx != null ) {
					indexByContPrevIdx.remove( keyContPrevIdx );
				}
			}

			if( indexByContNextIdx != null ) {
				YCFBamValueByContNextIdxKey keyContNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
				keyContNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContNextIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyContNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					indexByContNextIdx.remove( keyContNextIdx );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					indexByCodeVisIdx.remove( keyCodeVisIdx );
				}
			}

			if( indexByScopeCodeVisIdx != null ) {
				YCFBamValueByScopeCodeVisIdxKey keyScopeCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
				keyScopeCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeCodeVisIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyScopeCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					indexByScopeCodeVisIdx.remove( keyScopeCodeVisIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamNmTokensTypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryNmTokensType().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.remove( keepObj.getPKey() );
					if( mapSchemaIdx.size() <= 0 ) {
						indexBySchemaIdx.remove( keySchemaIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamNmTokensTypeObj)schema.getNmTokensDefTableObj().realiseNmTokensDef( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				YCFBamValueByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				YCFBamValueByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContPrevIdx != null ) {
				YCFBamValueByContPrevIdxKey keyContPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
				keyContPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContPrevIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyContPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
				if( mapContPrevIdx != null ) {
					mapContPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContNextIdx != null ) {
				YCFBamValueByContNextIdxKey keyContNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
				keyContNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContNextIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyContNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeCodeVisIdx != null ) {
				YCFBamValueByScopeCodeVisIdxKey keyScopeCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
				keyScopeCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeCodeVisIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyScopeCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamNmTokensTypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryNmTokensType().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allNmTokensType != null ) {
				allNmTokensType.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamNmTokensTypeObj)schema.getNmTokensDefTableObj().realiseNmTokensDef( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allNmTokensType != null ) {
				allNmTokensType.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				YCFBamValueByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				YCFBamValueByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
				if( mapNextIdx != null ) {
					mapNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContPrevIdx != null ) {
				YCFBamValueByContPrevIdxKey keyContPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
				keyContPrevIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContPrevIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyContPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
				if( mapContPrevIdx != null ) {
					mapContPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContNextIdx != null ) {
				YCFBamValueByContNextIdxKey keyContNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
				keyContNextIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyContNextIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyContNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeCodeVisIdx != null ) {
				YCFBamValueByScopeCodeVisIdxKey keyScopeCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
				keyScopeCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeCodeVisIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyScopeCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamNmTokensTypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryNmTokensType().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamNmTokensTypeObj createNmTokensType( IYCFBamNmTokensTypeObj Obj ) {
		IYCFBamNmTokensTypeObj obj = Obj;
		YCFBamNmTokensTypeBuff buff = obj.getNmTokensTypeBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().createNmTokensType(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a82f" ) ) {
			obj = (IYCFBamNmTokensTypeObj)(obj.realise());
		}
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamNmTokensTypeObj readNmTokensType( YCFBamValuePKey pkey ) {
		return( readNmTokensType( pkey, false ) );
	}

	public IYCFBamNmTokensTypeObj readNmTokensType( YCFBamValuePKey pkey, boolean forceRead ) {
		IYCFBamNmTokensTypeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamNmTokensTypeBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamNmTokensTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamNmTokensTypeObj readCachedNmTokensType( YCFBamValuePKey pkey ) {
		IYCFBamNmTokensTypeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeNmTokensType( IYCFBamNmTokensTypeObj obj )
	{
		final String S_ProcName = "YCFBamNmTokensTypeTableObj.reallyDeepDisposeNmTokensType() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamNmTokensTypeObj existing = readCachedNmTokensType( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamNmTokensTypeBySchemaIdxKey keySchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryNmTokensType().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );


		schema.getTableColTableObj().deepDisposeTableColByDataIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		schema.getIndexColTableObj().deepDisposeIndexColByColIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexBySchemaIdx != null ) {
			if( indexBySchemaIdx.containsKey( keySchemaIdx ) ) {
				indexBySchemaIdx.get( keySchemaIdx ).remove( pkey );
				if( indexBySchemaIdx.get( keySchemaIdx ).size() <= 0 ) {
					indexBySchemaIdx.remove( keySchemaIdx );
				}
			}
		}


		schema.getNmTokensDefTableObj().reallyDeepDisposeNmTokensDef( obj );
	}
	public void deepDisposeNmTokensType( YCFBamValuePKey pkey ) {
		IYCFBamNmTokensTypeObj obj = readCachedNmTokensType( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamNmTokensTypeObj lockNmTokensType( YCFBamValuePKey pkey ) {
		IYCFBamNmTokensTypeObj locked = null;
		YCFBamNmTokensTypeBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamNmTokensTypeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockNmTokensType", pkey );
		}
		return( locked );
	}

	public List<IYCFBamNmTokensTypeObj> readAllNmTokensType() {
		return( readAllNmTokensType( false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readAllNmTokensType( boolean forceRead ) {
		final String S_ProcName = "readAllNmTokensType";
		if( ( allNmTokensType == null ) || forceRead ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> map = new HashMap<YCFBamValuePKey,IYCFBamNmTokensTypeObj>();
			allNmTokensType = map;
			YCFBamNmTokensTypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().readAllDerived( schema.getAuthorization() );
			YCFBamNmTokensTypeBuff buff;
			IYCFBamNmTokensTypeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
			}
		}
		int len = allNmTokensType.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = allNmTokensType.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedAllNmTokensType() {
		final String S_ProcName = "readCachedAllNmTokensType";
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( allNmTokensType != null ) {
			int len = allNmTokensType.size();
			IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
			Iterator<IYCFBamNmTokensTypeObj> valIter = allNmTokensType.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new YCFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new YCFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamNmTokensTypeObj readNmTokensTypeByIdIdx( long TenantId,
		long Id )
	{
		return( readNmTokensTypeByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamNmTokensTypeObj readNmTokensTypeByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamNmTokensTypeObj obj = readNmTokensType( pkey, forceRead );
		return( obj );
	}

	public IYCFBamNmTokensTypeObj readNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readNmTokensTypeByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamNmTokensTypeObj readNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamNmTokensTypeObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamNmTokensTypeObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamValueBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamNmTokensTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByValTentIdx( long TenantId )
	{
		return( readNmTokensTypeByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readNmTokensTypeByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readNmTokensTypeByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readNmTokensTypeByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readNmTokensTypeByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		return( readNmTokensTypeByContPrevIdx( TenantId,
			ScopeId,
			PrevId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByContPrevIdx.containsKey( key ) ) {
			dict = indexByContPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		return( readNmTokensTypeByContNextIdx( TenantId,
			ScopeId,
			NextId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByContNextIdx.containsKey( key ) ) {
			dict = indexByContNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readNmTokensTypeByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readNmTokensTypeByScopeCodeVisIdx( TenantId,
			ScopeId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexByScopeCodeVisIdx.containsKey( key ) ) {
			dict = indexByScopeCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readNmTokensTypeBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<IYCFBamNmTokensTypeObj> readNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readNmTokensTypeBySchemaIdx";
		YCFBamNmTokensTypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryNmTokensType().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamNmTokensTypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamNmTokensTypeObj>();
			IYCFBamNmTokensTypeObj obj;
			YCFBamNmTokensTypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			YCFBamNmTokensTypeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamNmTokensTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamNmTokensTypeObj realised = (IYCFBamNmTokensTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
		Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamNmTokensTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamNmTokensTypeObj readCachedNmTokensTypeByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamNmTokensTypeObj obj = null;
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedNmTokensType( pkey );
		return( obj );
	}

	public IYCFBamNmTokensTypeObj readCachedNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamNmTokensTypeObj obj = null;
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedNmTokensTypeByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedNmTokensTypeByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedNmTokensTypeByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedNmTokensTypeByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedNmTokensTypeByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedNmTokensTypeByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByContPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByContPrevIdx.containsKey( key ) ) {
				dict = indexByContPrevIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "readCachedNmTokensTypeByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByContNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByContNextIdx.containsKey( key ) ) {
				dict = indexByContNextIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedNmTokensTypeByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedNmTokensTypeByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexByScopeCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexByScopeCodeVisIdx.containsKey( key ) ) {
				dict = indexByScopeCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamNmTokensTypeObj> readCachedNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedNmTokensTypeBySchemaIdx";
		YCFBamNmTokensTypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryNmTokensType().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<IYCFBamNmTokensTypeObj> arrayList = new ArrayList<IYCFBamNmTokensTypeObj>();
		if( indexBySchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				IYCFBamNmTokensTypeObj arr[] = new IYCFBamNmTokensTypeObj[len];
				Iterator<IYCFBamNmTokensTypeObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new YCFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new YCFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			IYCFBamNmTokensTypeObj obj;
			Iterator<IYCFBamNmTokensTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamNmTokensTypeObj> cmp = new Comparator<IYCFBamNmTokensTypeObj>() {
			public int compare( IYCFBamNmTokensTypeObj lhs, IYCFBamNmTokensTypeObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					YCFBamValuePKey lhsPKey = lhs.getPKey();
					YCFBamValuePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeNmTokensTypeByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamNmTokensTypeObj obj = readCachedNmTokensTypeByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamNmTokensTypeObj obj = readCachedNmTokensTypeByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeNmTokensTypeByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByValTentIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByScopeIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByDefSchemaIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByPrevIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByNextIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByContPrevIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByContNextIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByContNextIdx( TenantId,
				ScopeId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByCodeVisIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeByScopeCodeVisIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "deepDisposeNmTokensTypeBySchemaIdx";
		IYCFBamNmTokensTypeObj obj;
		List<IYCFBamNmTokensTypeObj> arrayList = readCachedNmTokensTypeBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<IYCFBamNmTokensTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamNmTokensTypeObj updateNmTokensType( IYCFBamNmTokensTypeObj Obj ) {
		IYCFBamNmTokensTypeObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().updateNmTokensType( schema.getAuthorization(),
			Obj.getNmTokensTypeBuff() );
		if( Obj.getClassCode().equals( "a82f" ) ) {
			obj = (IYCFBamNmTokensTypeObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteNmTokensType( IYCFBamNmTokensTypeObj Obj ) {
		IYCFBamNmTokensTypeObj obj = Obj;
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		IYCFBamValueObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensType( schema.getAuthorization(),
			obj.getNmTokensTypeBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteNmTokensTypeByIdIdx( long TenantId,
		long Id )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamNmTokensTypeObj obj = readNmTokensType( pkey );
		if( obj != null ) {
			IYCFBamNmTokensTypeEditObj editObj = (IYCFBamNmTokensTypeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamNmTokensTypeEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeNmTokensTypeByIdIdx( TenantId,
				Id );
	}

	public void deleteNmTokensTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamNmTokensTypeObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamNmTokensTypeObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeNmTokensTypeByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteNmTokensTypeByValTentIdx( long TenantId )
	{
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByValTentIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeNmTokensTypeByValTentIdx( TenantId );
	}

	public void deleteNmTokensTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByScopeIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeNmTokensTypeByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteNmTokensTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeNmTokensTypeByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteNmTokensTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPrevIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeNmTokensTypeByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteNmTokensTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNextIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeNmTokensTypeByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteNmTokensTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByContPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByContPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByContPrevIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
		}
		deepDisposeNmTokensTypeByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
	}

	public void deleteNmTokensTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByContNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByContNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByContNextIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
		}
		deepDisposeNmTokensTypeByContNextIdx( TenantId,
				ScopeId,
				NextId );
	}

	public void deleteNmTokensTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCodeVisIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeNmTokensTypeByCodeVisIdx( CodeVis );
	}

	public void deleteNmTokensTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexByScopeCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexByScopeCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByScopeCodeVisIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
		}
		deepDisposeNmTokensTypeByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
	}

	public void deleteNmTokensTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		YCFBamNmTokensTypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryNmTokensType().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamNmTokensTypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamNmTokensTypeObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamNmTokensTypeObj> dict = indexBySchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<IYCFBamNmTokensTypeObj> iter = dict.values().iterator();
			IYCFBamNmTokensTypeObj obj;
			List<IYCFBamNmTokensTypeObj> toForget = new LinkedList<IYCFBamNmTokensTypeObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().deleteNmTokensTypeBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeNmTokensTypeBySchemaIdx( TenantId,
				SchemaDefId );
	}

	/**
	 *	Move the YCFBamNmTokensTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokensTypeObj refreshed cache instance.
	 */
	public IYCFBamNmTokensTypeObj moveUpNmTokensType( IYCFBamNmTokensTypeObj Obj ) {
		IYCFBamNmTokensTypeObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpNmTokensType",
				"You cannot move an object that is being edited" );
		}
		YCFBamNmTokensTypeBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getNmTokensTypeTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamNmTokensTypeObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamValueObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamNmTokensTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamNmTokensTypeObj refreshed cache instance.
	 */
	public IYCFBamNmTokensTypeObj moveDownNmTokensType( IYCFBamNmTokensTypeObj Obj ) {
		IYCFBamNmTokensTypeObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownNmTokensType",
				"You cannot move an object that is being edited" );
		}
		YCFBamNmTokensTypeBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableNmTokensType().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getNmTokensTypeTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamNmTokensTypeObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamValueObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

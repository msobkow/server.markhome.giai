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

public class YCFBamUInt32TypeTableObj
	implements IYCFBamUInt32TypeTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> members;
	private Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> allUInt32Type;
	private Map< YCFBamValueByUNameIdxKey,
		IYCFBamUInt32TypeObj > indexByUNameIdx;
	private Map< YCFBamValueByValTentIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByValTentIdx;
	private Map< YCFBamValueByScopeIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByScopeIdx;
	private Map< YCFBamValueByDefSchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByDefSchemaIdx;
	private Map< YCFBamValueByPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByPrevIdx;
	private Map< YCFBamValueByNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByNextIdx;
	private Map< YCFBamValueByContPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByContPrevIdx;
	private Map< YCFBamValueByContNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByContNextIdx;
	private Map< YCFBamValueByCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByCodeVisIdx;
	private Map< YCFBamValueByScopeCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexByScopeCodeVisIdx;
	private Map< YCFBamUInt32TypeBySchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > > indexBySchemaIdx;
	public static String TABLE_NAME = "UInt32Type";
	public static String TABLE_DBNAME = "uint32typ";

	public YCFBamUInt32TypeTableObj() {
		schema = null;
		members = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
		allUInt32Type = null;
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

	public YCFBamUInt32TypeTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
		allUInt32Type = null;
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
		allUInt32Type = null;
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
		List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
		IYCFBamUInt32TypeObj cur = null;
		Iterator<IYCFBamUInt32TypeObj> iter = members.values().iterator();
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
	 *	YCFBamUInt32TypeObj.
	 */
	public IYCFBamUInt32TypeObj newInstance() {
		IYCFBamUInt32TypeObj inst = new YCFBamUInt32TypeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamUInt32TypeObj.
	 */
	public IYCFBamUInt32TypeEditObj newEditInstance( IYCFBamUInt32TypeObj orig ) {
		IYCFBamUInt32TypeEditObj edit = new YCFBamUInt32TypeEditObj( orig );
		return( edit );
	}

	public IYCFBamUInt32TypeObj realiseUInt32Type( IYCFBamUInt32TypeObj Obj ) {
		IYCFBamUInt32TypeObj obj = Obj;
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamUInt32TypeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamUInt32TypeObj existingObj = members.get( pkey );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					indexByPrevIdx.remove( keyPrevIdx );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					indexByContNextIdx.remove( keyContNextIdx );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					indexByScopeCodeVisIdx.remove( keyScopeCodeVisIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamUInt32TypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryUInt32Type().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
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
			keepObj = (IYCFBamUInt32TypeObj)schema.getUInt32DefTableObj().realiseUInt32Def( Obj );

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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamUInt32TypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryUInt32Type().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allUInt32Type != null ) {
				allUInt32Type.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamUInt32TypeObj)schema.getUInt32DefTableObj().realiseUInt32Def( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allUInt32Type != null ) {
				allUInt32Type.put( keepObj.getPKey(), keepObj );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamUInt32TypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryUInt32Type().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamUInt32TypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamUInt32TypeObj createUInt32Type( IYCFBamUInt32TypeObj Obj ) {
		IYCFBamUInt32TypeObj obj = Obj;
		YCFBamUInt32TypeBuff buff = obj.getUInt32TypeBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().createUInt32Type(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a867" ) ) {
			obj = (IYCFBamUInt32TypeObj)(obj.realise());
		}
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamUInt32TypeObj readUInt32Type( YCFBamValuePKey pkey ) {
		return( readUInt32Type( pkey, false ) );
	}

	public IYCFBamUInt32TypeObj readUInt32Type( YCFBamValuePKey pkey, boolean forceRead ) {
		IYCFBamUInt32TypeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamUInt32TypeBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamUInt32TypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamUInt32TypeObj readCachedUInt32Type( YCFBamValuePKey pkey ) {
		IYCFBamUInt32TypeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeUInt32Type( IYCFBamUInt32TypeObj obj )
	{
		final String S_ProcName = "YCFBamUInt32TypeTableObj.reallyDeepDisposeUInt32Type() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamUInt32TypeObj existing = readCachedUInt32Type( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamUInt32TypeBySchemaIdxKey keySchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryUInt32Type().newSchemaIdxKey();
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


		schema.getUInt32DefTableObj().reallyDeepDisposeUInt32Def( obj );
	}
	public void deepDisposeUInt32Type( YCFBamValuePKey pkey ) {
		IYCFBamUInt32TypeObj obj = readCachedUInt32Type( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamUInt32TypeObj lockUInt32Type( YCFBamValuePKey pkey ) {
		IYCFBamUInt32TypeObj locked = null;
		YCFBamUInt32TypeBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamUInt32TypeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockUInt32Type", pkey );
		}
		return( locked );
	}

	public List<IYCFBamUInt32TypeObj> readAllUInt32Type() {
		return( readAllUInt32Type( false ) );
	}

	public List<IYCFBamUInt32TypeObj> readAllUInt32Type( boolean forceRead ) {
		final String S_ProcName = "readAllUInt32Type";
		if( ( allUInt32Type == null ) || forceRead ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> map = new HashMap<YCFBamValuePKey,IYCFBamUInt32TypeObj>();
			allUInt32Type = map;
			YCFBamUInt32TypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().readAllDerived( schema.getAuthorization() );
			YCFBamUInt32TypeBuff buff;
			IYCFBamUInt32TypeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
			}
		}
		int len = allUInt32Type.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = allUInt32Type.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readCachedAllUInt32Type() {
		final String S_ProcName = "readCachedAllUInt32Type";
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( allUInt32Type != null ) {
			int len = allUInt32Type.size();
			IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
			Iterator<IYCFBamUInt32TypeObj> valIter = allUInt32Type.values().iterator();
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
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public IYCFBamUInt32TypeObj readUInt32TypeByIdIdx( long TenantId,
		long Id )
	{
		return( readUInt32TypeByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamUInt32TypeObj readUInt32TypeByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamUInt32TypeObj obj = readUInt32Type( pkey, forceRead );
		return( obj );
	}

	public IYCFBamUInt32TypeObj readUInt32TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readUInt32TypeByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamUInt32TypeObj readUInt32TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamUInt32TypeObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamUInt32TypeObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamValueBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamUInt32TypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByValTentIdx( long TenantId )
	{
		return( readUInt32TypeByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readUInt32TypeByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readUInt32TypeByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readUInt32TypeByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readUInt32TypeByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		return( readUInt32TypeByContPrevIdx( TenantId,
			ScopeId,
			PrevId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByContPrevIdx.containsKey( key ) ) {
			dict = indexByContPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		return( readUInt32TypeByContNextIdx( TenantId,
			ScopeId,
			NextId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByContNextIdx.containsKey( key ) ) {
			dict = indexByContNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readUInt32TypeByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readUInt32TypeByScopeCodeVisIdx( TenantId,
			ScopeId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexByScopeCodeVisIdx.containsKey( key ) ) {
			dict = indexByScopeCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readUInt32TypeBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<IYCFBamUInt32TypeObj> readUInt32TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32TypeBySchemaIdx";
		YCFBamUInt32TypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryUInt32Type().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamUInt32TypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32TypeObj>();
			IYCFBamUInt32TypeObj obj;
			YCFBamUInt32TypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			YCFBamUInt32TypeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32TypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32TypeObj realised = (IYCFBamUInt32TypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
		Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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
		List<IYCFBamUInt32TypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamUInt32TypeObj readCachedUInt32TypeByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamUInt32TypeObj obj = null;
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedUInt32Type( pkey );
		return( obj );
	}

	public IYCFBamUInt32TypeObj readCachedUInt32TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamUInt32TypeObj obj = null;
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedUInt32TypeByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedUInt32TypeByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedUInt32TypeByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedUInt32TypeByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedUInt32TypeByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedUInt32TypeByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByContPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByContPrevIdx.containsKey( key ) ) {
				dict = indexByContPrevIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "readCachedUInt32TypeByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByContNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByContNextIdx.containsKey( key ) ) {
				dict = indexByContNextIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedUInt32TypeByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedUInt32TypeByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexByScopeCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexByScopeCodeVisIdx.containsKey( key ) ) {
				dict = indexByScopeCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public List<IYCFBamUInt32TypeObj> readCachedUInt32TypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedUInt32TypeBySchemaIdx";
		YCFBamUInt32TypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryUInt32Type().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<IYCFBamUInt32TypeObj> arrayList = new ArrayList<IYCFBamUInt32TypeObj>();
		if( indexBySchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32TypeObj arr[] = new IYCFBamUInt32TypeObj[len];
				Iterator<IYCFBamUInt32TypeObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32TypeObj obj;
			Iterator<IYCFBamUInt32TypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32TypeObj> cmp = new Comparator<IYCFBamUInt32TypeObj>() {
			public int compare( IYCFBamUInt32TypeObj lhs, IYCFBamUInt32TypeObj rhs ) {
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

	public void deepDisposeUInt32TypeByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamUInt32TypeObj obj = readCachedUInt32TypeByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeUInt32TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamUInt32TypeObj obj = readCachedUInt32TypeByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeUInt32TypeByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByValTentIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByScopeIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByDefSchemaIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByPrevIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByNextIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByContPrevIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByContNextIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByContNextIdx( TenantId,
				ScopeId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByCodeVisIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeUInt32TypeByScopeCodeVisIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32TypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "deepDisposeUInt32TypeBySchemaIdx";
		IYCFBamUInt32TypeObj obj;
		List<IYCFBamUInt32TypeObj> arrayList = readCachedUInt32TypeBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32TypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamUInt32TypeObj updateUInt32Type( IYCFBamUInt32TypeObj Obj ) {
		IYCFBamUInt32TypeObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().updateUInt32Type( schema.getAuthorization(),
			Obj.getUInt32TypeBuff() );
		if( Obj.getClassCode().equals( "a867" ) ) {
			obj = (IYCFBamUInt32TypeObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteUInt32Type( IYCFBamUInt32TypeObj Obj ) {
		IYCFBamUInt32TypeObj obj = Obj;
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		IYCFBamValueObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32Type( schema.getAuthorization(),
			obj.getUInt32TypeBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteUInt32TypeByIdIdx( long TenantId,
		long Id )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamUInt32TypeObj obj = readUInt32Type( pkey );
		if( obj != null ) {
			IYCFBamUInt32TypeEditObj editObj = (IYCFBamUInt32TypeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamUInt32TypeEditObj)obj.beginEdit();
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
		deepDisposeUInt32TypeByIdIdx( TenantId,
				Id );
	}

	public void deleteUInt32TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamUInt32TypeObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamUInt32TypeObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeUInt32TypeByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteUInt32TypeByValTentIdx( long TenantId )
	{
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeUInt32TypeByValTentIdx( TenantId );
	}

	public void deleteUInt32TypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeUInt32TypeByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteUInt32TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeUInt32TypeByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteUInt32TypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeUInt32TypeByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteUInt32TypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeUInt32TypeByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteUInt32TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByContPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByContPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
		}
		deepDisposeUInt32TypeByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
	}

	public void deleteUInt32TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByContNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByContNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
		}
		deepDisposeUInt32TypeByContNextIdx( TenantId,
				ScopeId,
				NextId );
	}

	public void deleteUInt32TypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeUInt32TypeByCodeVisIdx( CodeVis );
	}

	public void deleteUInt32TypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexByScopeCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexByScopeCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
		}
		deepDisposeUInt32TypeByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
	}

	public void deleteUInt32TypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		YCFBamUInt32TypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryUInt32Type().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamUInt32TypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32TypeObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32TypeObj> dict = indexBySchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<IYCFBamUInt32TypeObj> iter = dict.values().iterator();
			IYCFBamUInt32TypeObj obj;
			List<IYCFBamUInt32TypeObj> toForget = new LinkedList<IYCFBamUInt32TypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().deleteUInt32TypeBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeUInt32TypeBySchemaIdx( TenantId,
				SchemaDefId );
	}

	/**
	 *	Move the YCFBamUInt32TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt32TypeObj refreshed cache instance.
	 */
	public IYCFBamUInt32TypeObj moveUpUInt32Type( IYCFBamUInt32TypeObj Obj ) {
		IYCFBamUInt32TypeObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpUInt32Type",
				"You cannot move an object that is being edited" );
		}
		YCFBamUInt32TypeBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getUInt32TypeTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamUInt32TypeObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamValueObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamUInt32TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt32TypeObj refreshed cache instance.
	 */
	public IYCFBamUInt32TypeObj moveDownUInt32Type( IYCFBamUInt32TypeObj Obj ) {
		IYCFBamUInt32TypeObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownUInt32Type",
				"You cannot move an object that is being edited" );
		}
		YCFBamUInt32TypeBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Type().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getUInt32TypeTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamUInt32TypeObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamValueObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

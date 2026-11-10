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

public class YCFBamTZTimestampTypeTableObj
	implements IYCFBamTZTimestampTypeTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> members;
	private Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> allTZTimestampType;
	private Map< YCFBamValueByUNameIdxKey,
		IYCFBamTZTimestampTypeObj > indexByUNameIdx;
	private Map< YCFBamValueByValTentIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByValTentIdx;
	private Map< YCFBamValueByScopeIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByScopeIdx;
	private Map< YCFBamValueByDefSchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByDefSchemaIdx;
	private Map< YCFBamValueByPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByPrevIdx;
	private Map< YCFBamValueByNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByNextIdx;
	private Map< YCFBamValueByContPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByContPrevIdx;
	private Map< YCFBamValueByContNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByContNextIdx;
	private Map< YCFBamValueByCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByCodeVisIdx;
	private Map< YCFBamValueByScopeCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexByScopeCodeVisIdx;
	private Map< YCFBamTZTimestampTypeBySchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > > indexBySchemaIdx;
	public static String TABLE_NAME = "TZTimestampType";
	public static String TABLE_DBNAME = "zstyp";

	public YCFBamTZTimestampTypeTableObj() {
		schema = null;
		members = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
		allTZTimestampType = null;
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

	public YCFBamTZTimestampTypeTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
		allTZTimestampType = null;
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
		allTZTimestampType = null;
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
		List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
		IYCFBamTZTimestampTypeObj cur = null;
		Iterator<IYCFBamTZTimestampTypeObj> iter = members.values().iterator();
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
	 *	YCFBamTZTimestampTypeObj.
	 */
	public IYCFBamTZTimestampTypeObj newInstance() {
		IYCFBamTZTimestampTypeObj inst = new YCFBamTZTimestampTypeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTZTimestampTypeObj.
	 */
	public IYCFBamTZTimestampTypeEditObj newEditInstance( IYCFBamTZTimestampTypeObj orig ) {
		IYCFBamTZTimestampTypeEditObj edit = new YCFBamTZTimestampTypeEditObj( orig );
		return( edit );
	}

	public IYCFBamTZTimestampTypeObj realiseTZTimestampType( IYCFBamTZTimestampTypeObj Obj ) {
		IYCFBamTZTimestampTypeObj obj = Obj;
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamTZTimestampTypeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamTZTimestampTypeObj existingObj = members.get( pkey );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					indexByPrevIdx.remove( keyPrevIdx );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					indexByContNextIdx.remove( keyContNextIdx );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					indexByScopeCodeVisIdx.remove( keyScopeCodeVisIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamTZTimestampTypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTZTimestampType().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
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
			keepObj = (IYCFBamTZTimestampTypeObj)schema.getTZTimestampDefTableObj().realiseTZTimestampDef( Obj );

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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamTZTimestampTypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTZTimestampType().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allTZTimestampType != null ) {
				allTZTimestampType.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamTZTimestampTypeObj)schema.getTZTimestampDefTableObj().realiseTZTimestampDef( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTZTimestampType != null ) {
				allTZTimestampType.put( keepObj.getPKey(), keepObj );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamTZTimestampTypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTZTimestampType().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamTZTimestampTypeObj createTZTimestampType( IYCFBamTZTimestampTypeObj Obj ) {
		IYCFBamTZTimestampTypeObj obj = Obj;
		YCFBamTZTimestampTypeBuff buff = obj.getTZTimestampTypeBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().createTZTimestampType(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a85a" ) ) {
			obj = (IYCFBamTZTimestampTypeObj)(obj.realise());
		}
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamTZTimestampTypeObj readTZTimestampType( YCFBamValuePKey pkey ) {
		return( readTZTimestampType( pkey, false ) );
	}

	public IYCFBamTZTimestampTypeObj readTZTimestampType( YCFBamValuePKey pkey, boolean forceRead ) {
		IYCFBamTZTimestampTypeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamTZTimestampTypeBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamTZTimestampTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamTZTimestampTypeObj readCachedTZTimestampType( YCFBamValuePKey pkey ) {
		IYCFBamTZTimestampTypeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTZTimestampType( IYCFBamTZTimestampTypeObj obj )
	{
		final String S_ProcName = "YCFBamTZTimestampTypeTableObj.reallyDeepDisposeTZTimestampType() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamTZTimestampTypeObj existing = readCachedTZTimestampType( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamTZTimestampTypeBySchemaIdxKey keySchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTZTimestampType().newSchemaIdxKey();
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


		schema.getTZTimestampDefTableObj().reallyDeepDisposeTZTimestampDef( obj );
	}
	public void deepDisposeTZTimestampType( YCFBamValuePKey pkey ) {
		IYCFBamTZTimestampTypeObj obj = readCachedTZTimestampType( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamTZTimestampTypeObj lockTZTimestampType( YCFBamValuePKey pkey ) {
		IYCFBamTZTimestampTypeObj locked = null;
		YCFBamTZTimestampTypeBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamTZTimestampTypeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTZTimestampType", pkey );
		}
		return( locked );
	}

	public List<IYCFBamTZTimestampTypeObj> readAllTZTimestampType() {
		return( readAllTZTimestampType( false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readAllTZTimestampType( boolean forceRead ) {
		final String S_ProcName = "readAllTZTimestampType";
		if( ( allTZTimestampType == null ) || forceRead ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> map = new HashMap<YCFBamValuePKey,IYCFBamTZTimestampTypeObj>();
			allTZTimestampType = map;
			YCFBamTZTimestampTypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().readAllDerived( schema.getAuthorization() );
			YCFBamTZTimestampTypeBuff buff;
			IYCFBamTZTimestampTypeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
			}
		}
		int len = allTZTimestampType.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = allTZTimestampType.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readCachedAllTZTimestampType() {
		final String S_ProcName = "readCachedAllTZTimestampType";
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( allTZTimestampType != null ) {
			int len = allTZTimestampType.size();
			IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
			Iterator<IYCFBamTZTimestampTypeObj> valIter = allTZTimestampType.values().iterator();
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
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public IYCFBamTZTimestampTypeObj readTZTimestampTypeByIdIdx( long TenantId,
		long Id )
	{
		return( readTZTimestampTypeByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamTZTimestampTypeObj readTZTimestampTypeByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTZTimestampTypeObj obj = readTZTimestampType( pkey, forceRead );
		return( obj );
	}

	public IYCFBamTZTimestampTypeObj readTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readTZTimestampTypeByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamTZTimestampTypeObj readTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamTZTimestampTypeObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamTZTimestampTypeObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamValueBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamTZTimestampTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByValTentIdx( long TenantId )
	{
		return( readTZTimestampTypeByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readTZTimestampTypeByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readTZTimestampTypeByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readTZTimestampTypeByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readTZTimestampTypeByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		return( readTZTimestampTypeByContPrevIdx( TenantId,
			ScopeId,
			PrevId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByContPrevIdx.containsKey( key ) ) {
			dict = indexByContPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		return( readTZTimestampTypeByContNextIdx( TenantId,
			ScopeId,
			NextId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByContNextIdx.containsKey( key ) ) {
			dict = indexByContNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readTZTimestampTypeByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readTZTimestampTypeByScopeCodeVisIdx( TenantId,
			ScopeId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexByScopeCodeVisIdx.containsKey( key ) ) {
			dict = indexByScopeCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readTZTimestampTypeBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<IYCFBamTZTimestampTypeObj> readTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readTZTimestampTypeBySchemaIdx";
		YCFBamTZTimestampTypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTZTimestampType().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamTZTimestampTypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamTZTimestampTypeObj>();
			IYCFBamTZTimestampTypeObj obj;
			YCFBamTZTimestampTypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			YCFBamTZTimestampTypeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTZTimestampTypeObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamTZTimestampTypeObj realised = (IYCFBamTZTimestampTypeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
		Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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
		List<IYCFBamTZTimestampTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamTZTimestampTypeObj readCachedTZTimestampTypeByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTZTimestampTypeObj obj = null;
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTZTimestampType( pkey );
		return( obj );
	}

	public IYCFBamTZTimestampTypeObj readCachedTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamTZTimestampTypeObj obj = null;
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByContPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByContPrevIdx.containsKey( key ) ) {
				dict = indexByContPrevIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByContNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByContNextIdx.containsKey( key ) ) {
				dict = indexByContNextIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedTZTimestampTypeByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexByScopeCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexByScopeCodeVisIdx.containsKey( key ) ) {
				dict = indexByScopeCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public List<IYCFBamTZTimestampTypeObj> readCachedTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedTZTimestampTypeBySchemaIdx";
		YCFBamTZTimestampTypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTZTimestampType().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<IYCFBamTZTimestampTypeObj> arrayList = new ArrayList<IYCFBamTZTimestampTypeObj>();
		if( indexBySchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				IYCFBamTZTimestampTypeObj arr[] = new IYCFBamTZTimestampTypeObj[len];
				Iterator<IYCFBamTZTimestampTypeObj> valIter = dict.values().iterator();
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
			IYCFBamTZTimestampTypeObj obj;
			Iterator<IYCFBamTZTimestampTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTZTimestampTypeObj> cmp = new Comparator<IYCFBamTZTimestampTypeObj>() {
			public int compare( IYCFBamTZTimestampTypeObj lhs, IYCFBamTZTimestampTypeObj rhs ) {
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

	public void deepDisposeTZTimestampTypeByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTZTimestampTypeObj obj = readCachedTZTimestampTypeByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamTZTimestampTypeObj obj = readCachedTZTimestampTypeByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTZTimestampTypeByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByValTentIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByScopeIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByDefSchemaIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByPrevIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByNextIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByContPrevIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByContNextIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByContNextIdx( TenantId,
				ScopeId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByCodeVisIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeByScopeCodeVisIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "deepDisposeTZTimestampTypeBySchemaIdx";
		IYCFBamTZTimestampTypeObj obj;
		List<IYCFBamTZTimestampTypeObj> arrayList = readCachedTZTimestampTypeBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<IYCFBamTZTimestampTypeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamTZTimestampTypeObj updateTZTimestampType( IYCFBamTZTimestampTypeObj Obj ) {
		IYCFBamTZTimestampTypeObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().updateTZTimestampType( schema.getAuthorization(),
			Obj.getTZTimestampTypeBuff() );
		if( Obj.getClassCode().equals( "a85a" ) ) {
			obj = (IYCFBamTZTimestampTypeObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteTZTimestampType( IYCFBamTZTimestampTypeObj Obj ) {
		IYCFBamTZTimestampTypeObj obj = Obj;
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		IYCFBamValueObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampType( schema.getAuthorization(),
			obj.getTZTimestampTypeBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteTZTimestampTypeByIdIdx( long TenantId,
		long Id )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTZTimestampTypeObj obj = readTZTimestampType( pkey );
		if( obj != null ) {
			IYCFBamTZTimestampTypeEditObj editObj = (IYCFBamTZTimestampTypeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamTZTimestampTypeEditObj)obj.beginEdit();
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
		deepDisposeTZTimestampTypeByIdIdx( TenantId,
				Id );
	}

	public void deleteTZTimestampTypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamTZTimestampTypeObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamTZTimestampTypeObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeTZTimestampTypeByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteTZTimestampTypeByValTentIdx( long TenantId )
	{
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTZTimestampTypeByValTentIdx( TenantId );
	}

	public void deleteTZTimestampTypeByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeTZTimestampTypeByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteTZTimestampTypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeTZTimestampTypeByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteTZTimestampTypeByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeTZTimestampTypeByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteTZTimestampTypeByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeTZTimestampTypeByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteTZTimestampTypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByContPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByContPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
		}
		deepDisposeTZTimestampTypeByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
	}

	public void deleteTZTimestampTypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByContNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByContNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
		}
		deepDisposeTZTimestampTypeByContNextIdx( TenantId,
				ScopeId,
				NextId );
	}

	public void deleteTZTimestampTypeByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeTZTimestampTypeByCodeVisIdx( CodeVis );
	}

	public void deleteTZTimestampTypeByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexByScopeCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexByScopeCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
		}
		deepDisposeTZTimestampTypeByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
	}

	public void deleteTZTimestampTypeBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		YCFBamTZTimestampTypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTZTimestampType().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamTZTimestampTypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamTZTimestampTypeObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamTZTimestampTypeObj> dict = indexBySchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<IYCFBamTZTimestampTypeObj> iter = dict.values().iterator();
			IYCFBamTZTimestampTypeObj obj;
			List<IYCFBamTZTimestampTypeObj> toForget = new LinkedList<IYCFBamTZTimestampTypeObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().deleteTZTimestampTypeBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeTZTimestampTypeBySchemaIdx( TenantId,
				SchemaDefId );
	}

	/**
	 *	Move the YCFBamTZTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimestampTypeObj refreshed cache instance.
	 */
	public IYCFBamTZTimestampTypeObj moveUpTZTimestampType( IYCFBamTZTimestampTypeObj Obj ) {
		IYCFBamTZTimestampTypeObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpTZTimestampType",
				"You cannot move an object that is being edited" );
		}
		YCFBamTZTimestampTypeBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getTZTimestampTypeTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamTZTimestampTypeObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamValueObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamTZTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamTZTimestampTypeObj refreshed cache instance.
	 */
	public IYCFBamTZTimestampTypeObj moveDownTZTimestampType( IYCFBamTZTimestampTypeObj Obj ) {
		IYCFBamTZTimestampTypeObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownTZTimestampType",
				"You cannot move an object that is being edited" );
		}
		YCFBamTZTimestampTypeBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTZTimestampType().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getTZTimestampTypeTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamTZTimestampTypeObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamValueObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

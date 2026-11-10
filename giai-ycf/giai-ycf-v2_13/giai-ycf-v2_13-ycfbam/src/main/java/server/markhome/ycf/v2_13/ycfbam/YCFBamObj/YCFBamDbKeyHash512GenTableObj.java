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

public class YCFBamDbKeyHash512GenTableObj
	implements IYCFBamDbKeyHash512GenTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> members;
	private Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> allDbKeyHash512Gen;
	private Map< YCFBamValueByUNameIdxKey,
		IYCFBamDbKeyHash512GenObj > indexByUNameIdx;
	private Map< YCFBamValueByValTentIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByValTentIdx;
	private Map< YCFBamValueByScopeIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByScopeIdx;
	private Map< YCFBamValueByDefSchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByDefSchemaIdx;
	private Map< YCFBamValueByPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByPrevIdx;
	private Map< YCFBamValueByNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByNextIdx;
	private Map< YCFBamValueByContPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByContPrevIdx;
	private Map< YCFBamValueByContNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByContNextIdx;
	private Map< YCFBamValueByCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByCodeVisIdx;
	private Map< YCFBamValueByScopeCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByScopeCodeVisIdx;
	private Map< YCFBamDbKeyHash512TypeBySchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexBySchemaIdx;
	private Map< YCFBamDbKeyHash512GenByDispIdxKey,
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > > indexByDispIdx;
	public static String TABLE_NAME = "DbKeyHash512Gen";
	public static String TABLE_DBNAME = "idgdbk512";

	public YCFBamDbKeyHash512GenTableObj() {
		schema = null;
		members = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
		allDbKeyHash512Gen = null;
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
		indexByDispIdx = null;
	}

	public YCFBamDbKeyHash512GenTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
		allDbKeyHash512Gen = null;
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
		indexByDispIdx = null;
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
		allDbKeyHash512Gen = null;
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
		indexByDispIdx = null;
		List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
		IYCFBamDbKeyHash512GenObj cur = null;
		Iterator<IYCFBamDbKeyHash512GenObj> iter = members.values().iterator();
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
	 *	YCFBamDbKeyHash512GenObj.
	 */
	public IYCFBamDbKeyHash512GenObj newInstance() {
		IYCFBamDbKeyHash512GenObj inst = new YCFBamDbKeyHash512GenObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamDbKeyHash512GenObj.
	 */
	public IYCFBamDbKeyHash512GenEditObj newEditInstance( IYCFBamDbKeyHash512GenObj orig ) {
		IYCFBamDbKeyHash512GenEditObj edit = new YCFBamDbKeyHash512GenEditObj( orig );
		return( edit );
	}

	public IYCFBamDbKeyHash512GenObj realiseDbKeyHash512Gen( IYCFBamDbKeyHash512GenObj Obj ) {
		IYCFBamDbKeyHash512GenObj obj = Obj;
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamDbKeyHash512GenObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamDbKeyHash512GenObj existingObj = members.get( pkey );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					indexByPrevIdx.remove( keyPrevIdx );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					indexByContNextIdx.remove( keyContNextIdx );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					indexByScopeCodeVisIdx.remove( keyScopeCodeVisIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamDbKeyHash512TypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Type().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					indexBySchemaIdx.remove( keySchemaIdx );
				}
			}

			if( indexByDispIdx != null ) {
				YCFBamDbKeyHash512GenByDispIdxKey keyDispIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Gen().newDispIdxKey();
				keyDispIdx.setOptionalDispenserTenantId( keepObj.getOptionalDispenserTenantId() );
				keyDispIdx.setOptionalDispenserId( keepObj.getOptionalDispenserId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapDispIdx = indexByDispIdx.get( keyDispIdx );
				if( mapDispIdx != null ) {
					mapDispIdx.remove( keepObj.getPKey() );
					if( mapDispIdx.size() <= 0 ) {
						indexByDispIdx.remove( keyDispIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamDbKeyHash512GenObj)schema.getDbKeyHash512TypeTableObj().realiseDbKeyHash512Type( Obj );

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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamDbKeyHash512TypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Type().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDispIdx != null ) {
				YCFBamDbKeyHash512GenByDispIdxKey keyDispIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Gen().newDispIdxKey();
				keyDispIdx.setOptionalDispenserTenantId( keepObj.getOptionalDispenserTenantId() );
				keyDispIdx.setOptionalDispenserId( keepObj.getOptionalDispenserId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapDispIdx = indexByDispIdx.get( keyDispIdx );
				if( mapDispIdx != null ) {
					mapDispIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allDbKeyHash512Gen != null ) {
				allDbKeyHash512Gen.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamDbKeyHash512GenObj)schema.getDbKeyHash512TypeTableObj().realiseDbKeyHash512Type( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDbKeyHash512Gen != null ) {
				allDbKeyHash512Gen.put( keepObj.getPKey(), keepObj );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamDbKeyHash512TypeBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Type().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDispIdx != null ) {
				YCFBamDbKeyHash512GenByDispIdxKey keyDispIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Gen().newDispIdxKey();
				keyDispIdx.setOptionalDispenserTenantId( keepObj.getOptionalDispenserTenantId() );
				keyDispIdx.setOptionalDispenserId( keepObj.getOptionalDispenserId() );
				Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > mapDispIdx = indexByDispIdx.get( keyDispIdx );
				if( mapDispIdx != null ) {
					mapDispIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamDbKeyHash512GenObj createDbKeyHash512Gen( IYCFBamDbKeyHash512GenObj Obj ) {
		IYCFBamDbKeyHash512GenObj obj = Obj;
		YCFBamDbKeyHash512GenBuff buff = obj.getDbKeyHash512GenBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().createDbKeyHash512Gen(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a852" ) ) {
			obj = (IYCFBamDbKeyHash512GenObj)(obj.realise());
		}
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamDbKeyHash512GenObj readDbKeyHash512Gen( YCFBamValuePKey pkey ) {
		return( readDbKeyHash512Gen( pkey, false ) );
	}

	public IYCFBamDbKeyHash512GenObj readDbKeyHash512Gen( YCFBamValuePKey pkey, boolean forceRead ) {
		IYCFBamDbKeyHash512GenObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamDbKeyHash512GenBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamDbKeyHash512GenObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDbKeyHash512GenObj readCachedDbKeyHash512Gen( YCFBamValuePKey pkey ) {
		IYCFBamDbKeyHash512GenObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDbKeyHash512Gen( IYCFBamDbKeyHash512GenObj obj )
	{
		final String S_ProcName = "YCFBamDbKeyHash512GenTableObj.reallyDeepDisposeDbKeyHash512Gen() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamDbKeyHash512GenObj existing = readCachedDbKeyHash512Gen( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamDbKeyHash512GenByDispIdxKey keyDispIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Gen().newDispIdxKey();
		keyDispIdx.setOptionalDispenserTenantId( existing.getOptionalDispenserTenantId() );
		keyDispIdx.setOptionalDispenserId( existing.getOptionalDispenserId() );


		schema.getTableColTableObj().deepDisposeTableColByDataIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		schema.getIndexColTableObj().deepDisposeIndexColByColIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByDispIdx != null ) {
			if( indexByDispIdx.containsKey( keyDispIdx ) ) {
				indexByDispIdx.get( keyDispIdx ).remove( pkey );
				if( indexByDispIdx.get( keyDispIdx ).size() <= 0 ) {
					indexByDispIdx.remove( keyDispIdx );
				}
			}
		}


		schema.getDbKeyHash512TypeTableObj().reallyDeepDisposeDbKeyHash512Type( obj );
	}
	public void deepDisposeDbKeyHash512Gen( YCFBamValuePKey pkey ) {
		IYCFBamDbKeyHash512GenObj obj = readCachedDbKeyHash512Gen( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDbKeyHash512GenObj lockDbKeyHash512Gen( YCFBamValuePKey pkey ) {
		IYCFBamDbKeyHash512GenObj locked = null;
		YCFBamDbKeyHash512GenBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamDbKeyHash512GenObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockDbKeyHash512Gen", pkey );
		}
		return( locked );
	}

	public List<IYCFBamDbKeyHash512GenObj> readAllDbKeyHash512Gen() {
		return( readAllDbKeyHash512Gen( false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readAllDbKeyHash512Gen( boolean forceRead ) {
		final String S_ProcName = "readAllDbKeyHash512Gen";
		if( ( allDbKeyHash512Gen == null ) || forceRead ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> map = new HashMap<YCFBamValuePKey,IYCFBamDbKeyHash512GenObj>();
			allDbKeyHash512Gen = map;
			YCFBamDbKeyHash512GenBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().readAllDerived( schema.getAuthorization() );
			YCFBamDbKeyHash512GenBuff buff;
			IYCFBamDbKeyHash512GenObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
			}
		}
		int len = allDbKeyHash512Gen.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = allDbKeyHash512Gen.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readCachedAllDbKeyHash512Gen() {
		final String S_ProcName = "readCachedAllDbKeyHash512Gen";
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( allDbKeyHash512Gen != null ) {
			int len = allDbKeyHash512Gen.size();
			IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = allDbKeyHash512Gen.values().iterator();
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
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public IYCFBamDbKeyHash512GenObj readDbKeyHash512GenByIdIdx( long TenantId,
		long Id )
	{
		return( readDbKeyHash512GenByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamDbKeyHash512GenObj readDbKeyHash512GenByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDbKeyHash512GenObj obj = readDbKeyHash512Gen( pkey, forceRead );
		return( obj );
	}

	public IYCFBamDbKeyHash512GenObj readDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readDbKeyHash512GenByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamDbKeyHash512GenObj readDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamDbKeyHash512GenObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamDbKeyHash512GenObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamValueBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamDbKeyHash512GenObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByValTentIdx( long TenantId )
	{
		return( readDbKeyHash512GenByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readDbKeyHash512GenByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDbKeyHash512GenByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readDbKeyHash512GenByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readDbKeyHash512GenByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		return( readDbKeyHash512GenByContPrevIdx( TenantId,
			ScopeId,
			PrevId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByContPrevIdx.containsKey( key ) ) {
			dict = indexByContPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		return( readDbKeyHash512GenByContNextIdx( TenantId,
			ScopeId,
			NextId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByContNextIdx.containsKey( key ) ) {
			dict = indexByContNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readDbKeyHash512GenByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readDbKeyHash512GenByScopeCodeVisIdx( TenantId,
			ScopeId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByScopeCodeVisIdx.containsKey( key ) ) {
			dict = indexByScopeCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readDbKeyHash512GenBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenBySchemaIdx";
		YCFBamDbKeyHash512TypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Type().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamDbKeyHash512TypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamDbKeyHash512TypeObj obj;
			YCFBamDbKeyHash512TypeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Type().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			YCFBamDbKeyHash512TypeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId )
	{
		return( readDbKeyHash512GenByDispIdx( DispenserTenantId,
			DispenserId,
			false ) );
	}

	public List<IYCFBamDbKeyHash512GenObj> readDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId,
		boolean forceRead )
	{
		final String S_ProcName = "readDbKeyHash512GenByDispIdx";
		YCFBamDbKeyHash512GenByDispIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Gen().newDispIdxKey();
		key.setOptionalDispenserTenantId( DispenserTenantId );
		key.setOptionalDispenserId( DispenserId );
		Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
		if( indexByDispIdx == null ) {
			indexByDispIdx = new HashMap< YCFBamDbKeyHash512GenByDispIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( ( ! forceRead ) && indexByDispIdx.containsKey( key ) ) {
			dict = indexByDispIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj>();
			IYCFBamDbKeyHash512GenObj obj;
			YCFBamDbKeyHash512GenBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().readDerivedByDispIdx( schema.getAuthorization(),
				DispenserTenantId,
				DispenserId );
			YCFBamDbKeyHash512GenBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDbKeyHash512GenObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamDbKeyHash512GenObj realised = (IYCFBamDbKeyHash512GenObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDispIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
		Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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
		List<IYCFBamDbKeyHash512GenObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamDbKeyHash512GenObj readCachedDbKeyHash512GenByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDbKeyHash512GenObj obj = null;
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDbKeyHash512Gen( pkey );
		return( obj );
	}

	public IYCFBamDbKeyHash512GenObj readCachedDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamDbKeyHash512GenObj obj = null;
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByContPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByContPrevIdx.containsKey( key ) ) {
				dict = indexByContPrevIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByContNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByContNextIdx.containsKey( key ) ) {
				dict = indexByContNextIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByScopeCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByScopeCodeVisIdx.containsKey( key ) ) {
				dict = indexByScopeCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenBySchemaIdx";
		YCFBamDbKeyHash512TypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Type().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexBySchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public List<IYCFBamDbKeyHash512GenObj> readCachedDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId )
	{
		final String S_ProcName = "readCachedDbKeyHash512GenByDispIdx";
		YCFBamDbKeyHash512GenByDispIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Gen().newDispIdxKey();
		key.setOptionalDispenserTenantId( DispenserTenantId );
		key.setOptionalDispenserId( DispenserId );
		ArrayList<IYCFBamDbKeyHash512GenObj> arrayList = new ArrayList<IYCFBamDbKeyHash512GenObj>();
		if( indexByDispIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict;
			if( indexByDispIdx.containsKey( key ) ) {
				dict = indexByDispIdx.get( key );
				int len = dict.size();
				IYCFBamDbKeyHash512GenObj arr[] = new IYCFBamDbKeyHash512GenObj[len];
				Iterator<IYCFBamDbKeyHash512GenObj> valIter = dict.values().iterator();
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
			IYCFBamDbKeyHash512GenObj obj;
			Iterator<IYCFBamDbKeyHash512GenObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDbKeyHash512GenObj> cmp = new Comparator<IYCFBamDbKeyHash512GenObj>() {
			public int compare( IYCFBamDbKeyHash512GenObj lhs, IYCFBamDbKeyHash512GenObj rhs ) {
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

	public void deepDisposeDbKeyHash512GenByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDbKeyHash512GenObj obj = readCachedDbKeyHash512GenByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamDbKeyHash512GenObj obj = readCachedDbKeyHash512GenByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDbKeyHash512GenByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByValTentIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByScopeIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByDefSchemaIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByPrevIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByNextIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByContPrevIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByContNextIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByContNextIdx( TenantId,
				ScopeId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByCodeVisIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByScopeCodeVisIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenBySchemaIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId )
	{
		final String S_ProcName = "deepDisposeDbKeyHash512GenByDispIdx";
		IYCFBamDbKeyHash512GenObj obj;
		List<IYCFBamDbKeyHash512GenObj> arrayList = readCachedDbKeyHash512GenByDispIdx( DispenserTenantId,
				DispenserId );
		if( arrayList != null )  {
			Iterator<IYCFBamDbKeyHash512GenObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamDbKeyHash512GenObj updateDbKeyHash512Gen( IYCFBamDbKeyHash512GenObj Obj ) {
		IYCFBamDbKeyHash512GenObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().updateDbKeyHash512Gen( schema.getAuthorization(),
			Obj.getDbKeyHash512GenBuff() );
		if( Obj.getClassCode().equals( "a852" ) ) {
			obj = (IYCFBamDbKeyHash512GenObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDbKeyHash512Gen( IYCFBamDbKeyHash512GenObj Obj ) {
		IYCFBamDbKeyHash512GenObj obj = Obj;
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		IYCFBamValueObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( schema.getAuthorization(),
			obj.getDbKeyHash512GenBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteDbKeyHash512GenByIdIdx( long TenantId,
		long Id )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDbKeyHash512GenObj obj = readDbKeyHash512Gen( pkey );
		if( obj != null ) {
			IYCFBamDbKeyHash512GenEditObj editObj = (IYCFBamDbKeyHash512GenEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamDbKeyHash512GenEditObj)obj.beginEdit();
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
		deepDisposeDbKeyHash512GenByIdIdx( TenantId,
				Id );
	}

	public void deleteDbKeyHash512GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamDbKeyHash512GenObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamDbKeyHash512GenObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeDbKeyHash512GenByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteDbKeyHash512GenByValTentIdx( long TenantId )
	{
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDbKeyHash512GenByValTentIdx( TenantId );
	}

	public void deleteDbKeyHash512GenByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeDbKeyHash512GenByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteDbKeyHash512GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDbKeyHash512GenByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDbKeyHash512GenByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeDbKeyHash512GenByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteDbKeyHash512GenByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeDbKeyHash512GenByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteDbKeyHash512GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByContPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByContPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
		}
		deepDisposeDbKeyHash512GenByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
	}

	public void deleteDbKeyHash512GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByContNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByContNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
		}
		deepDisposeDbKeyHash512GenByContNextIdx( TenantId,
				ScopeId,
				NextId );
	}

	public void deleteDbKeyHash512GenByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeDbKeyHash512GenByCodeVisIdx( CodeVis );
	}

	public void deleteDbKeyHash512GenByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByScopeCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByScopeCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
		}
		deepDisposeDbKeyHash512GenByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
	}

	public void deleteDbKeyHash512GenBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		YCFBamDbKeyHash512TypeBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Type().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamDbKeyHash512TypeBySchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexBySchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeDbKeyHash512GenBySchemaIdx( TenantId,
				SchemaDefId );
	}

	public void deleteDbKeyHash512GenByDispIdx( Long DispenserTenantId,
		Long DispenserId )
	{
		YCFBamDbKeyHash512GenByDispIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDbKeyHash512Gen().newDispIdxKey();
		key.setOptionalDispenserTenantId( DispenserTenantId );
		key.setOptionalDispenserId( DispenserId );
		if( indexByDispIdx == null ) {
			indexByDispIdx = new HashMap< YCFBamDbKeyHash512GenByDispIdxKey,
				Map< YCFBamValuePKey, IYCFBamDbKeyHash512GenObj > >();
		}
		if( indexByDispIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamDbKeyHash512GenObj> dict = indexByDispIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByDispIdx( schema.getAuthorization(),
				DispenserTenantId,
				DispenserId );
			Iterator<IYCFBamDbKeyHash512GenObj> iter = dict.values().iterator();
			IYCFBamDbKeyHash512GenObj obj;
			List<IYCFBamDbKeyHash512GenObj> toForget = new LinkedList<IYCFBamDbKeyHash512GenObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDispIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().deleteDbKeyHash512GenByDispIdx( schema.getAuthorization(),
				DispenserTenantId,
				DispenserId );
		}
		deepDisposeDbKeyHash512GenByDispIdx( DispenserTenantId,
				DispenserId );
	}

	/**
	 *	Move the YCFBamDbKeyHash512GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash512GenObj refreshed cache instance.
	 */
	public IYCFBamDbKeyHash512GenObj moveUpDbKeyHash512Gen( IYCFBamDbKeyHash512GenObj Obj ) {
		IYCFBamDbKeyHash512GenObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpDbKeyHash512Gen",
				"You cannot move an object that is being edited" );
		}
		YCFBamDbKeyHash512GenBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getDbKeyHash512GenTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamDbKeyHash512GenObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamValueObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamDbKeyHash512GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamDbKeyHash512GenObj refreshed cache instance.
	 */
	public IYCFBamDbKeyHash512GenObj moveDownDbKeyHash512Gen( IYCFBamDbKeyHash512GenObj Obj ) {
		IYCFBamDbKeyHash512GenObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownDbKeyHash512Gen",
				"You cannot move an object that is being edited" );
		}
		YCFBamDbKeyHash512GenBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDbKeyHash512Gen().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getDbKeyHash512GenTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamDbKeyHash512GenObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamValueObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

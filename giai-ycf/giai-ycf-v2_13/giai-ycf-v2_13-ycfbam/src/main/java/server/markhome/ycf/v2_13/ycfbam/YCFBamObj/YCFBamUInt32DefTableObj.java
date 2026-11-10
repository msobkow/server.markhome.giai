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

public class YCFBamUInt32DefTableObj
	implements IYCFBamUInt32DefTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamValuePKey, IYCFBamUInt32DefObj> members;
	private Map<YCFBamValuePKey, IYCFBamUInt32DefObj> allUInt32Def;
	private Map< YCFBamValueByUNameIdxKey,
		IYCFBamUInt32DefObj > indexByUNameIdx;
	private Map< YCFBamValueByValTentIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByValTentIdx;
	private Map< YCFBamValueByScopeIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByScopeIdx;
	private Map< YCFBamValueByDefSchemaIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByDefSchemaIdx;
	private Map< YCFBamValueByPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByPrevIdx;
	private Map< YCFBamValueByNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByNextIdx;
	private Map< YCFBamValueByContPrevIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByContPrevIdx;
	private Map< YCFBamValueByContNextIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByContNextIdx;
	private Map< YCFBamValueByCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByCodeVisIdx;
	private Map< YCFBamValueByScopeCodeVisIdxKey,
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj > > indexByScopeCodeVisIdx;
	public static String TABLE_NAME = "UInt32Def";
	public static String TABLE_DBNAME = "u32def";

	public YCFBamUInt32DefTableObj() {
		schema = null;
		members = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
		allUInt32Def = null;
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
	}

	public YCFBamUInt32DefTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
		allUInt32Def = null;
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
		allUInt32Def = null;
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
		List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
		IYCFBamUInt32DefObj cur = null;
		Iterator<IYCFBamUInt32DefObj> iter = members.values().iterator();
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
	 *	YCFBamUInt32DefObj.
	 */
	public IYCFBamUInt32DefObj newInstance() {
		IYCFBamUInt32DefObj inst = new YCFBamUInt32DefObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamUInt32DefObj.
	 */
	public IYCFBamUInt32DefEditObj newEditInstance( IYCFBamUInt32DefObj orig ) {
		IYCFBamUInt32DefEditObj edit = new YCFBamUInt32DefEditObj( orig );
		return( edit );
	}

	public IYCFBamUInt32DefObj realiseUInt32Def( IYCFBamUInt32DefObj Obj ) {
		IYCFBamUInt32DefObj obj = Obj;
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamUInt32DefObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamUInt32DefObj existingObj = members.get( pkey );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					indexByPrevIdx.remove( keyPrevIdx );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					indexByContNextIdx.remove( keyContNextIdx );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					indexByScopeCodeVisIdx.remove( keyScopeCodeVisIdx );
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamUInt32DefObj)schema.getAtomTableObj().realiseAtom( Obj );

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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allUInt32Def != null ) {
				allUInt32Def.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamUInt32DefObj)schema.getAtomTableObj().realiseAtom( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allUInt32Def != null ) {
				allUInt32Def.put( keepObj.getPKey(), keepObj );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamValueByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPrevIdx != null ) {
				YCFBamValueByPrevIdxKey keyPrevIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
				keyPrevIdx.setOptionalPrevTenantId( keepObj.getOptionalPrevTenantId() );
				keyPrevIdx.setOptionalPrevId( keepObj.getOptionalPrevId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapPrevIdx = indexByPrevIdx.get( keyPrevIdx );
				if( mapPrevIdx != null ) {
					mapPrevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextIdx != null ) {
				YCFBamValueByNextIdxKey keyNextIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
				keyNextIdx.setOptionalNextTenantId( keepObj.getOptionalNextTenantId() );
				keyNextIdx.setOptionalNextId( keepObj.getOptionalNextId() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapNextIdx = indexByNextIdx.get( keyNextIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapContPrevIdx = indexByContPrevIdx.get( keyContPrevIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapContNextIdx = indexByContNextIdx.get( keyContNextIdx );
				if( mapContNextIdx != null ) {
					mapContNextIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamValueByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
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
				Map<YCFBamValuePKey, IYCFBamUInt32DefObj > mapScopeCodeVisIdx = indexByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
				if( mapScopeCodeVisIdx != null ) {
					mapScopeCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamUInt32DefObj createUInt32Def( IYCFBamUInt32DefObj Obj ) {
		IYCFBamUInt32DefObj obj = Obj;
		YCFBamUInt32DefBuff buff = obj.getUInt32DefBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().createUInt32Def(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a866" ) ) {
			obj = (IYCFBamUInt32DefObj)(obj.realise());
		}
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		if( prev != null ) {
			prev.read( true );
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamUInt32DefObj readUInt32Def( YCFBamValuePKey pkey ) {
		return( readUInt32Def( pkey, false ) );
	}

	public IYCFBamUInt32DefObj readUInt32Def( YCFBamValuePKey pkey, boolean forceRead ) {
		IYCFBamUInt32DefObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamUInt32DefBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamUInt32DefObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamUInt32DefObj readCachedUInt32Def( YCFBamValuePKey pkey ) {
		IYCFBamUInt32DefObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeUInt32Def( IYCFBamUInt32DefObj obj )
	{
		final String S_ProcName = "YCFBamUInt32DefTableObj.reallyDeepDisposeUInt32Def() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamValuePKey pkey = obj.getPKey();
		IYCFBamUInt32DefObj existing = readCachedUInt32Def( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );

		schema.getTableColTableObj().deepDisposeTableColByDataIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		schema.getIndexColTableObj().deepDisposeIndexColByColIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );


		schema.getAtomTableObj().reallyDeepDisposeAtom( obj );
	}
	public void deepDisposeUInt32Def( YCFBamValuePKey pkey ) {
		IYCFBamUInt32DefObj obj = readCachedUInt32Def( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamUInt32DefObj lockUInt32Def( YCFBamValuePKey pkey ) {
		IYCFBamUInt32DefObj locked = null;
		YCFBamUInt32DefBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamUInt32DefObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockUInt32Def", pkey );
		}
		return( locked );
	}

	public List<IYCFBamUInt32DefObj> readAllUInt32Def() {
		return( readAllUInt32Def( false ) );
	}

	public List<IYCFBamUInt32DefObj> readAllUInt32Def( boolean forceRead ) {
		final String S_ProcName = "readAllUInt32Def";
		if( ( allUInt32Def == null ) || forceRead ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> map = new HashMap<YCFBamValuePKey,IYCFBamUInt32DefObj>();
			allUInt32Def = map;
			YCFBamUInt32DefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().readAllDerived( schema.getAuthorization() );
			YCFBamUInt32DefBuff buff;
			IYCFBamUInt32DefObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
			}
		}
		int len = allUInt32Def.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = allUInt32Def.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readCachedAllUInt32Def() {
		final String S_ProcName = "readCachedAllUInt32Def";
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( allUInt32Def != null ) {
			int len = allUInt32Def.size();
			IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
			Iterator<IYCFBamUInt32DefObj> valIter = allUInt32Def.values().iterator();
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
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public IYCFBamUInt32DefObj readUInt32DefByIdIdx( long TenantId,
		long Id )
	{
		return( readUInt32DefByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamUInt32DefObj readUInt32DefByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamUInt32DefObj obj = readUInt32Def( pkey, forceRead );
		return( obj );
	}

	public IYCFBamUInt32DefObj readUInt32DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readUInt32DefByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamUInt32DefObj readUInt32DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamUInt32DefObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamUInt32DefObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamValueBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamUInt32DefObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByValTentIdx( long TenantId )
	{
		return( readUInt32DefByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readUInt32DefByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readUInt32DefByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		return( readUInt32DefByPrevIdx( PrevTenantId,
			PrevId,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByPrevIdx.containsKey( key ) ) {
			dict = indexByPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		return( readUInt32DefByNextIdx( NextTenantId,
			NextId,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByNextIdx.containsKey( key ) ) {
			dict = indexByNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		return( readUInt32DefByContPrevIdx( TenantId,
			ScopeId,
			PrevId,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByContPrevIdx.containsKey( key ) ) {
			dict = indexByContPrevIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContPrevIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		return( readUInt32DefByContNextIdx( TenantId,
			ScopeId,
			NextId,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByContNextIdx.containsKey( key ) ) {
			dict = indexByContNextIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContNextIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readUInt32DefByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readUInt32DefByScopeCodeVisIdx( TenantId,
			ScopeId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamUInt32DefObj> readUInt32DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readUInt32DefByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( ( ! forceRead ) && indexByScopeCodeVisIdx.containsKey( key ) ) {
			dict = indexByScopeCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamValuePKey, IYCFBamUInt32DefObj>();
			IYCFBamValueObj obj;
			YCFBamValueBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableValue().readDerivedByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			YCFBamValueBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamUInt32DefObj)schema.getValueTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
				obj.setBuff( buff );
				IYCFBamUInt32DefObj realised = (IYCFBamUInt32DefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
		Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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
		List<IYCFBamUInt32DefObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamUInt32DefObj readCachedUInt32DefByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamUInt32DefObj obj = null;
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedUInt32Def( pkey );
		return( obj );
	}

	public IYCFBamUInt32DefObj readCachedUInt32DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamUInt32DefObj obj = null;
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedUInt32DefByValTentIdx";
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedUInt32DefByScopeIdx";
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedUInt32DefByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedUInt32DefByPrevIdx";
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByPrevIdx.containsKey( key ) ) {
				dict = indexByPrevIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "readCachedUInt32DefByNextIdx";
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByNextIdx.containsKey( key ) ) {
				dict = indexByNextIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "readCachedUInt32DefByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByContPrevIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByContPrevIdx.containsKey( key ) ) {
				dict = indexByContPrevIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "readCachedUInt32DefByContNextIdx";
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByContNextIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByContNextIdx.containsKey( key ) ) {
				dict = indexByContNextIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedUInt32DefByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public List<IYCFBamUInt32DefObj> readCachedUInt32DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedUInt32DefByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamUInt32DefObj> arrayList = new ArrayList<IYCFBamUInt32DefObj>();
		if( indexByScopeCodeVisIdx != null ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict;
			if( indexByScopeCodeVisIdx.containsKey( key ) ) {
				dict = indexByScopeCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamUInt32DefObj arr[] = new IYCFBamUInt32DefObj[len];
				Iterator<IYCFBamUInt32DefObj> valIter = dict.values().iterator();
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
			IYCFBamUInt32DefObj obj;
			Iterator<IYCFBamUInt32DefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamUInt32DefObj> cmp = new Comparator<IYCFBamUInt32DefObj>() {
			public int compare( IYCFBamUInt32DefObj lhs, IYCFBamUInt32DefObj rhs ) {
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

	public void deepDisposeUInt32DefByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamUInt32DefObj obj = readCachedUInt32DefByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeUInt32DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamUInt32DefObj obj = readCachedUInt32DefByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeUInt32DefByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeUInt32DefByValTentIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeUInt32DefByScopeIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeUInt32DefByDefSchemaIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeUInt32DefByPrevIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByPrevIdx( PrevTenantId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeUInt32DefByNextIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByNextIdx( NextTenantId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "deepDisposeUInt32DefByContPrevIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "deepDisposeUInt32DefByContNextIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByContNextIdx( TenantId,
				ScopeId,
				NextId );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeUInt32DefByCodeVisIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeUInt32DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeUInt32DefByScopeCodeVisIdx";
		IYCFBamUInt32DefObj obj;
		List<IYCFBamUInt32DefObj> arrayList = readCachedUInt32DefByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamUInt32DefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamUInt32DefObj updateUInt32Def( IYCFBamUInt32DefObj Obj ) {
		IYCFBamUInt32DefObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().updateUInt32Def( schema.getAuthorization(),
			Obj.getUInt32DefBuff() );
		if( Obj.getClassCode().equals( "a866" ) ) {
			obj = (IYCFBamUInt32DefObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteUInt32Def( IYCFBamUInt32DefObj Obj ) {
		IYCFBamUInt32DefObj obj = Obj;
		IYCFBamValueObj prev = obj.getOptionalLookupPrev();
		IYCFBamValueObj next = obj.getOptionalLookupNext();
		((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32Def( schema.getAuthorization(),
			obj.getUInt32DefBuff() );
		Obj.forget();
		if( prev != null ) {
			prev.read( true );
		}
		if( next != null ) {
			next.read( true );
		}
	}

	public void deleteUInt32DefByIdIdx( long TenantId,
		long Id )
	{
		YCFBamValuePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamUInt32DefObj obj = readUInt32Def( pkey );
		if( obj != null ) {
			IYCFBamUInt32DefEditObj editObj = (IYCFBamUInt32DefEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamUInt32DefEditObj)obj.beginEdit();
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
		deepDisposeUInt32DefByIdIdx( TenantId,
				Id );
	}

	public void deleteUInt32DefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamValueByUNameIdxKey,
				IYCFBamUInt32DefObj >();
		}
		YCFBamValueByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamUInt32DefObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeUInt32DefByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteUInt32DefByValTentIdx( long TenantId )
	{
		YCFBamValueByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeUInt32DefByValTentIdx( TenantId );
	}

	public void deleteUInt32DefByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamValueByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeUInt32DefByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteUInt32DefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamValueByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeUInt32DefByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteUInt32DefByPrevIdx( Long PrevTenantId,
		Long PrevId )
	{
		YCFBamValueByPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );
		if( indexByPrevIdx == null ) {
			indexByPrevIdx = new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByPrevIdx( schema.getAuthorization(),
				PrevTenantId,
				PrevId );
		}
		deepDisposeUInt32DefByPrevIdx( PrevTenantId,
				PrevId );
	}

	public void deleteUInt32DefByNextIdx( Long NextTenantId,
		Long NextId )
	{
		YCFBamValueByNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );
		if( indexByNextIdx == null ) {
			indexByNextIdx = new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByNextIdx( schema.getAuthorization(),
				NextTenantId,
				NextId );
		}
		deepDisposeUInt32DefByNextIdx( NextTenantId,
				NextId );
	}

	public void deleteUInt32DefByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId )
	{
		YCFBamValueByContPrevIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );
		if( indexByContPrevIdx == null ) {
			indexByContPrevIdx = new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByContPrevIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByContPrevIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByContPrevIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				PrevId );
		}
		deepDisposeUInt32DefByContPrevIdx( TenantId,
				ScopeId,
				PrevId );
	}

	public void deleteUInt32DefByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId )
	{
		YCFBamValueByContNextIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );
		if( indexByContNextIdx == null ) {
			indexByContNextIdx = new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByContNextIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByContNextIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByContNextIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				NextId );
		}
		deepDisposeUInt32DefByContNextIdx( TenantId,
				ScopeId,
				NextId );
	}

	public void deleteUInt32DefByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeUInt32DefByCodeVisIdx( CodeVis );
	}

	public void deleteUInt32DefByScopeCodeVisIdx( long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamValueByScopeCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByScopeCodeVisIdx == null ) {
			indexByScopeCodeVisIdx = new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey, IYCFBamUInt32DefObj > >();
		}
		if( indexByScopeCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamValuePKey, IYCFBamUInt32DefObj> dict = indexByScopeCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
			Iterator<IYCFBamUInt32DefObj> iter = dict.values().iterator();
			IYCFBamUInt32DefObj obj;
			List<IYCFBamUInt32DefObj> toForget = new LinkedList<IYCFBamUInt32DefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().deleteUInt32DefByScopeCodeVisIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				CodeVis );
		}
		deepDisposeUInt32DefByScopeCodeVisIdx( TenantId,
				ScopeId,
				CodeVis );
	}

	/**
	 *	Move the YCFBamUInt32DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt32DefObj refreshed cache instance.
	 */
	public IYCFBamUInt32DefObj moveUpUInt32Def( IYCFBamUInt32DefObj Obj ) {
		IYCFBamUInt32DefObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveUpUInt32Def",
				"You cannot move an object that is being edited" );
		}
		YCFBamUInt32DefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().moveBuffUp( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getUInt32DefTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamUInt32DefObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
			if( next != null ) {
				IYCFBamValueObj gnext = next.getOptionalLookupNext( true );
			}
		}
		return( obj );
	}

	/**
	 *	Move the YCFBamUInt32DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	YCFBamUInt32DefObj refreshed cache instance.
	 */
	public IYCFBamUInt32DefObj moveDownUInt32Def( IYCFBamUInt32DefObj Obj ) {
		IYCFBamUInt32DefObj obj = null;
		if( null != Obj.getEdit() ) {
			throw new YCFLibUsageException( getClass(),
				"moveDownUInt32Def",
				"You cannot move an object that is being edited" );
		}
		YCFBamUInt32DefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableUInt32Def().moveBuffDown( schema.getAuthorization(),
			Obj.getRequiredTenantId(),
			Obj.getRequiredId(),
			Obj.getBuff().getRequiredRevision() );
		if( buff != null ) {
			obj = schema.getUInt32DefTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryValue().newPKey() );
			obj.setBuff( buff );
			obj = (IYCFBamUInt32DefObj)obj.realise();
			IYCFBamValueObj prev = obj.getOptionalLookupPrev( true );
			if( prev != null ) {
				IYCFBamValueObj gprev = prev.getOptionalLookupPrev( true );
			}
			IYCFBamValueObj next = obj.getOptionalLookupNext( true );
		}
		return( obj );
	}
}

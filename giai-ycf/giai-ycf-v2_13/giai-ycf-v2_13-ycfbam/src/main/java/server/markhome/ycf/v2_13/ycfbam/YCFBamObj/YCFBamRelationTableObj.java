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

public class YCFBamRelationTableObj
	implements IYCFBamRelationTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamRelationObj> members;
	private Map<YCFBamScopePKey, IYCFBamRelationObj> allRelation;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByTenantIdx;
	private Map< YCFBamRelationByUNameIdxKey,
		IYCFBamRelationObj > indexByUNameIdx;
	private Map< YCFBamRelationByRelnTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByRelnTenantIdx;
	private Map< YCFBamRelationByRelTableIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByRelTableIdx;
	private Map< YCFBamRelationByCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByCodeVisIdx;
	private Map< YCFBamRelationByTableCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByTableCodeVisIdx;
	private Map< YCFBamRelationByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByDefSchemaIdx;
	private Map< YCFBamRelationByFromKeyIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByFromKeyIdx;
	private Map< YCFBamRelationByToTblIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByToTblIdx;
	private Map< YCFBamRelationByToKeyIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByToKeyIdx;
	private Map< YCFBamRelationByNarrowedIdxKey,
		Map<YCFBamScopePKey, IYCFBamRelationObj > > indexByNarrowedIdx;
	public static String TABLE_NAME = "Relation";
	public static String TABLE_DBNAME = "reldef";

	public YCFBamRelationTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
		allRelation = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByRelnTenantIdx = null;
		indexByRelTableIdx = null;
		indexByCodeVisIdx = null;
		indexByTableCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByFromKeyIdx = null;
		indexByToTblIdx = null;
		indexByToKeyIdx = null;
		indexByNarrowedIdx = null;
	}

	public YCFBamRelationTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
		allRelation = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByRelnTenantIdx = null;
		indexByRelTableIdx = null;
		indexByCodeVisIdx = null;
		indexByTableCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByFromKeyIdx = null;
		indexByToTblIdx = null;
		indexByToKeyIdx = null;
		indexByNarrowedIdx = null;
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
		allRelation = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByRelnTenantIdx = null;
		indexByRelTableIdx = null;
		indexByCodeVisIdx = null;
		indexByTableCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByFromKeyIdx = null;
		indexByToTblIdx = null;
		indexByToKeyIdx = null;
		indexByNarrowedIdx = null;
		List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
		IYCFBamRelationObj cur = null;
		Iterator<IYCFBamRelationObj> iter = members.values().iterator();
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
	 *	YCFBamRelationObj.
	 */
	public IYCFBamRelationObj newInstance() {
		IYCFBamRelationObj inst = new YCFBamRelationObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamRelationObj.
	 */
	public IYCFBamRelationEditObj newEditInstance( IYCFBamRelationObj orig ) {
		IYCFBamRelationEditObj edit = new YCFBamRelationEditObj( orig );
		return( edit );
	}

	public IYCFBamRelationObj realiseRelation( IYCFBamRelationObj Obj ) {
		IYCFBamRelationObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamRelationObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamRelationObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamRelationByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByRelnTenantIdx != null ) {
				YCFBamRelationByRelnTenantIdxKey keyRelnTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
				keyRelnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapRelnTenantIdx = indexByRelnTenantIdx.get( keyRelnTenantIdx );
				if( mapRelnTenantIdx != null ) {
					mapRelnTenantIdx.remove( keepObj.getPKey() );
					if( mapRelnTenantIdx.size() <= 0 ) {
						indexByRelnTenantIdx.remove( keyRelnTenantIdx );
					}
				}
			}

			if( indexByRelTableIdx != null ) {
				YCFBamRelationByRelTableIdxKey keyRelTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
				keyRelTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapRelTableIdx = indexByRelTableIdx.get( keyRelTableIdx );
				if( mapRelTableIdx != null ) {
					mapRelTableIdx.remove( keepObj.getPKey() );
					if( mapRelTableIdx.size() <= 0 ) {
						indexByRelTableIdx.remove( keyRelTableIdx );
					}
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamRelationByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.remove( keepObj.getPKey() );
					if( mapCodeVisIdx.size() <= 0 ) {
						indexByCodeVisIdx.remove( keyCodeVisIdx );
					}
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				YCFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.remove( keepObj.getPKey() );
					if( mapTableCodeVisIdx.size() <= 0 ) {
						indexByTableCodeVisIdx.remove( keyTableCodeVisIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRelationByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByFromKeyIdx != null ) {
				YCFBamRelationByFromKeyIdxKey keyFromKeyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
				keyFromKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromKeyIdx.setRequiredFromIndexId( keepObj.getRequiredFromIndexId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapFromKeyIdx = indexByFromKeyIdx.get( keyFromKeyIdx );
				if( mapFromKeyIdx != null ) {
					mapFromKeyIdx.remove( keepObj.getPKey() );
					if( mapFromKeyIdx.size() <= 0 ) {
						indexByFromKeyIdx.remove( keyFromKeyIdx );
					}
				}
			}

			if( indexByToTblIdx != null ) {
				YCFBamRelationByToTblIdxKey keyToTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
				keyToTblIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToTblIdx.setRequiredToTableId( keepObj.getRequiredToTableId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapToTblIdx = indexByToTblIdx.get( keyToTblIdx );
				if( mapToTblIdx != null ) {
					mapToTblIdx.remove( keepObj.getPKey() );
					if( mapToTblIdx.size() <= 0 ) {
						indexByToTblIdx.remove( keyToTblIdx );
					}
				}
			}

			if( indexByToKeyIdx != null ) {
				YCFBamRelationByToKeyIdxKey keyToKeyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
				keyToKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToKeyIdx.setRequiredToIndexId( keepObj.getRequiredToIndexId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapToKeyIdx = indexByToKeyIdx.get( keyToKeyIdx );
				if( mapToKeyIdx != null ) {
					mapToKeyIdx.remove( keepObj.getPKey() );
					if( mapToKeyIdx.size() <= 0 ) {
						indexByToKeyIdx.remove( keyToKeyIdx );
					}
				}
			}

			if( indexByNarrowedIdx != null ) {
				YCFBamRelationByNarrowedIdxKey keyNarrowedIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
				keyNarrowedIdx.setOptionalNarrowedTenantId( keepObj.getOptionalNarrowedTenantId() );
				keyNarrowedIdx.setOptionalNarrowedId( keepObj.getOptionalNarrowedId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapNarrowedIdx = indexByNarrowedIdx.get( keyNarrowedIdx );
				if( mapNarrowedIdx != null ) {
					mapNarrowedIdx.remove( keepObj.getPKey() );
					if( mapNarrowedIdx.size() <= 0 ) {
						indexByNarrowedIdx.remove( keyNarrowedIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamRelationObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamRelationByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRelnTenantIdx != null ) {
				YCFBamRelationByRelnTenantIdxKey keyRelnTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
				keyRelnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapRelnTenantIdx = indexByRelnTenantIdx.get( keyRelnTenantIdx );
				if( mapRelnTenantIdx != null ) {
					mapRelnTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelTableIdx != null ) {
				YCFBamRelationByRelTableIdxKey keyRelTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
				keyRelTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapRelTableIdx = indexByRelTableIdx.get( keyRelTableIdx );
				if( mapRelTableIdx != null ) {
					mapRelTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamRelationByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				YCFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRelationByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFromKeyIdx != null ) {
				YCFBamRelationByFromKeyIdxKey keyFromKeyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
				keyFromKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromKeyIdx.setRequiredFromIndexId( keepObj.getRequiredFromIndexId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapFromKeyIdx = indexByFromKeyIdx.get( keyFromKeyIdx );
				if( mapFromKeyIdx != null ) {
					mapFromKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToTblIdx != null ) {
				YCFBamRelationByToTblIdxKey keyToTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
				keyToTblIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToTblIdx.setRequiredToTableId( keepObj.getRequiredToTableId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapToTblIdx = indexByToTblIdx.get( keyToTblIdx );
				if( mapToTblIdx != null ) {
					mapToTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToKeyIdx != null ) {
				YCFBamRelationByToKeyIdxKey keyToKeyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
				keyToKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToKeyIdx.setRequiredToIndexId( keepObj.getRequiredToIndexId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapToKeyIdx = indexByToKeyIdx.get( keyToKeyIdx );
				if( mapToKeyIdx != null ) {
					mapToKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNarrowedIdx != null ) {
				YCFBamRelationByNarrowedIdxKey keyNarrowedIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
				keyNarrowedIdx.setOptionalNarrowedTenantId( keepObj.getOptionalNarrowedTenantId() );
				keyNarrowedIdx.setOptionalNarrowedId( keepObj.getOptionalNarrowedId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapNarrowedIdx = indexByNarrowedIdx.get( keyNarrowedIdx );
				if( mapNarrowedIdx != null ) {
					mapNarrowedIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allRelation != null ) {
				allRelation.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamRelationObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allRelation != null ) {
				allRelation.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamRelationByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRelnTenantIdx != null ) {
				YCFBamRelationByRelnTenantIdxKey keyRelnTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
				keyRelnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapRelnTenantIdx = indexByRelnTenantIdx.get( keyRelnTenantIdx );
				if( mapRelnTenantIdx != null ) {
					mapRelnTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelTableIdx != null ) {
				YCFBamRelationByRelTableIdxKey keyRelTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
				keyRelTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapRelTableIdx = indexByRelTableIdx.get( keyRelTableIdx );
				if( mapRelTableIdx != null ) {
					mapRelTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamRelationByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				YCFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRelationByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFromKeyIdx != null ) {
				YCFBamRelationByFromKeyIdxKey keyFromKeyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
				keyFromKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromKeyIdx.setRequiredFromIndexId( keepObj.getRequiredFromIndexId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapFromKeyIdx = indexByFromKeyIdx.get( keyFromKeyIdx );
				if( mapFromKeyIdx != null ) {
					mapFromKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToTblIdx != null ) {
				YCFBamRelationByToTblIdxKey keyToTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
				keyToTblIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToTblIdx.setRequiredToTableId( keepObj.getRequiredToTableId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapToTblIdx = indexByToTblIdx.get( keyToTblIdx );
				if( mapToTblIdx != null ) {
					mapToTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToKeyIdx != null ) {
				YCFBamRelationByToKeyIdxKey keyToKeyIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
				keyToKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToKeyIdx.setRequiredToIndexId( keepObj.getRequiredToIndexId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapToKeyIdx = indexByToKeyIdx.get( keyToKeyIdx );
				if( mapToKeyIdx != null ) {
					mapToKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNarrowedIdx != null ) {
				YCFBamRelationByNarrowedIdxKey keyNarrowedIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
				keyNarrowedIdx.setOptionalNarrowedTenantId( keepObj.getOptionalNarrowedTenantId() );
				keyNarrowedIdx.setOptionalNarrowedId( keepObj.getOptionalNarrowedId() );
				Map<YCFBamScopePKey, IYCFBamRelationObj > mapNarrowedIdx = indexByNarrowedIdx.get( keyNarrowedIdx );
				if( mapNarrowedIdx != null ) {
					mapNarrowedIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamRelationObj createRelation( IYCFBamRelationObj Obj ) {
		IYCFBamRelationObj obj = Obj;
		YCFBamRelationBuff buff = obj.getRelationBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableRelation().createRelation(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a838" ) ) {
			obj = (IYCFBamRelationObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamRelationObj readRelation( YCFBamScopePKey pkey ) {
		return( readRelation( pkey, false ) );
	}

	public IYCFBamRelationObj readRelation( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamRelationObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamRelationBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamRelationObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamRelationObj readCachedRelation( YCFBamScopePKey pkey ) {
		IYCFBamRelationObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRelation( IYCFBamRelationObj obj )
	{
		final String S_ProcName = "YCFBamRelationTableObj.reallyDeepDisposeRelation() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamRelationObj existing = readCachedRelation( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamRelationByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRelationByRelnTenantIdxKey keyRelnTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		keyRelnTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRelationByRelTableIdxKey keyRelTableIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		keyRelTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamRelationByCodeVisIdxKey keyCodeVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		keyTableCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTableCodeVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyTableCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamRelationByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamRelationByFromKeyIdxKey keyFromKeyIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		keyFromKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyFromKeyIdx.setRequiredFromIndexId( existing.getRequiredFromIndexId() );

		YCFBamRelationByToTblIdxKey keyToTblIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		keyToTblIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToTblIdx.setRequiredToTableId( existing.getRequiredToTableId() );

		YCFBamRelationByToKeyIdxKey keyToKeyIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		keyToKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToKeyIdx.setRequiredToIndexId( existing.getRequiredToIndexId() );

		YCFBamRelationByNarrowedIdxKey keyNarrowedIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
		keyNarrowedIdx.setOptionalNarrowedTenantId( existing.getOptionalNarrowedTenantId() );
		keyNarrowedIdx.setOptionalNarrowedId( existing.getOptionalNarrowedId() );


					schema.getPopTopDepTableObj().deepDisposePopTopDepByContRelIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getRelationColTableObj().deepDisposeRelationColByRelationIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByRelnTenantIdx != null ) {
			if( indexByRelnTenantIdx.containsKey( keyRelnTenantIdx ) ) {
				indexByRelnTenantIdx.get( keyRelnTenantIdx ).remove( pkey );
				if( indexByRelnTenantIdx.get( keyRelnTenantIdx ).size() <= 0 ) {
					indexByRelnTenantIdx.remove( keyRelnTenantIdx );
				}
			}
		}

		if( indexByRelTableIdx != null ) {
			if( indexByRelTableIdx.containsKey( keyRelTableIdx ) ) {
				indexByRelTableIdx.get( keyRelTableIdx ).remove( pkey );
				if( indexByRelTableIdx.get( keyRelTableIdx ).size() <= 0 ) {
					indexByRelTableIdx.remove( keyRelTableIdx );
				}
			}
		}

		if( indexByCodeVisIdx != null ) {
			if( indexByCodeVisIdx.containsKey( keyCodeVisIdx ) ) {
				indexByCodeVisIdx.get( keyCodeVisIdx ).remove( pkey );
				if( indexByCodeVisIdx.get( keyCodeVisIdx ).size() <= 0 ) {
					indexByCodeVisIdx.remove( keyCodeVisIdx );
				}
			}
		}

		if( indexByTableCodeVisIdx != null ) {
			if( indexByTableCodeVisIdx.containsKey( keyTableCodeVisIdx ) ) {
				indexByTableCodeVisIdx.get( keyTableCodeVisIdx ).remove( pkey );
				if( indexByTableCodeVisIdx.get( keyTableCodeVisIdx ).size() <= 0 ) {
					indexByTableCodeVisIdx.remove( keyTableCodeVisIdx );
				}
			}
		}

		if( indexByDefSchemaIdx != null ) {
			if( indexByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
				indexByDefSchemaIdx.get( keyDefSchemaIdx ).remove( pkey );
				if( indexByDefSchemaIdx.get( keyDefSchemaIdx ).size() <= 0 ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}
		}

		if( indexByFromKeyIdx != null ) {
			if( indexByFromKeyIdx.containsKey( keyFromKeyIdx ) ) {
				indexByFromKeyIdx.get( keyFromKeyIdx ).remove( pkey );
				if( indexByFromKeyIdx.get( keyFromKeyIdx ).size() <= 0 ) {
					indexByFromKeyIdx.remove( keyFromKeyIdx );
				}
			}
		}

		if( indexByToTblIdx != null ) {
			if( indexByToTblIdx.containsKey( keyToTblIdx ) ) {
				indexByToTblIdx.get( keyToTblIdx ).remove( pkey );
				if( indexByToTblIdx.get( keyToTblIdx ).size() <= 0 ) {
					indexByToTblIdx.remove( keyToTblIdx );
				}
			}
		}

		if( indexByToKeyIdx != null ) {
			if( indexByToKeyIdx.containsKey( keyToKeyIdx ) ) {
				indexByToKeyIdx.get( keyToKeyIdx ).remove( pkey );
				if( indexByToKeyIdx.get( keyToKeyIdx ).size() <= 0 ) {
					indexByToKeyIdx.remove( keyToKeyIdx );
				}
			}
		}

		if( indexByNarrowedIdx != null ) {
			if( indexByNarrowedIdx.containsKey( keyNarrowedIdx ) ) {
				indexByNarrowedIdx.get( keyNarrowedIdx ).remove( pkey );
				if( indexByNarrowedIdx.get( keyNarrowedIdx ).size() <= 0 ) {
					indexByNarrowedIdx.remove( keyNarrowedIdx );
				}
			}
		}


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeRelation( YCFBamScopePKey pkey ) {
		IYCFBamRelationObj obj = readCachedRelation( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamRelationObj lockRelation( YCFBamScopePKey pkey ) {
		IYCFBamRelationObj locked = null;
		YCFBamRelationBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamRelationObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockRelation", pkey );
		}
		return( locked );
	}

	public List<IYCFBamRelationObj> readAllRelation() {
		return( readAllRelation( false ) );
	}

	public List<IYCFBamRelationObj> readAllRelation( boolean forceRead ) {
		final String S_ProcName = "readAllRelation";
		if( ( allRelation == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> map = new HashMap<YCFBamScopePKey,IYCFBamRelationObj>();
			allRelation = map;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readAllDerived( schema.getAuthorization() );
			YCFBamRelationBuff buff;
			IYCFBamRelationObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
			}
		}
		int len = allRelation.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = allRelation.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readCachedAllRelation() {
		final String S_ProcName = "readCachedAllRelation";
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( allRelation != null ) {
			int len = allRelation.size();
			IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
			Iterator<IYCFBamRelationObj> valIter = allRelation.values().iterator();
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
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id )
	{
		return( readRelationByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamRelationObj obj = readRelation( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamRelationObj> readRelationByTenantIdx( long TenantId )
	{
		return( readRelationByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamRelationObj readRelationByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readRelationByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamRelationObj readRelationByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamRelationByUNameIdxKey,
				IYCFBamRelationObj >();
		}
		YCFBamRelationByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamRelationObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamRelationBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamRelationObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamRelationObj> readRelationByRelnTenantIdx( long TenantId )
	{
		return( readRelationByRelnTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByRelnTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByRelnTenantIdx";
		YCFBamRelationByRelnTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByRelnTenantIdx == null ) {
			indexByRelnTenantIdx = new HashMap< YCFBamRelationByRelnTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByRelnTenantIdx.containsKey( key ) ) {
			dict = indexByRelnTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByRelnTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelnTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId )
	{
		return( readRelationByRelTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByRelTableIdx";
		YCFBamRelationByRelTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByRelTableIdx == null ) {
			indexByRelTableIdx = new HashMap< YCFBamRelationByRelTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByRelTableIdx.containsKey( key ) ) {
			dict = indexByRelTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByRelTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readRelationByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByCodeVisIdx";
		YCFBamRelationByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamRelationByCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readRelationByTableCodeVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByTableCodeVisIdx";
		YCFBamRelationByTableCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByTableCodeVisIdx == null ) {
			indexByTableCodeVisIdx = new HashMap< YCFBamRelationByTableCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByTableCodeVisIdx.containsKey( key ) ) {
			dict = indexByTableCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTableCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readRelationByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByDefSchemaIdx";
		YCFBamRelationByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRelationByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId )
	{
		return( readRelationByFromKeyIdx( TenantId,
			FromIndexId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByFromKeyIdx";
		YCFBamRelationByFromKeyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromIndexId( FromIndexId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByFromKeyIdx == null ) {
			indexByFromKeyIdx = new HashMap< YCFBamRelationByFromKeyIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByFromKeyIdx.containsKey( key ) ) {
			dict = indexByFromKeyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByFromKeyIdx( schema.getAuthorization(),
				TenantId,
				FromIndexId );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFromKeyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId )
	{
		return( readRelationByToTblIdx( TenantId,
			ToTableId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByToTblIdx";
		YCFBamRelationByToTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToTableId( ToTableId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByToTblIdx == null ) {
			indexByToTblIdx = new HashMap< YCFBamRelationByToTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByToTblIdx.containsKey( key ) ) {
			dict = indexByToTblIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByToTblIdx( schema.getAuthorization(),
				TenantId,
				ToTableId );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToTblIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId )
	{
		return( readRelationByToKeyIdx( TenantId,
			ToIndexId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByToKeyIdx";
		YCFBamRelationByToKeyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToIndexId( ToIndexId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByToKeyIdx == null ) {
			indexByToKeyIdx = new HashMap< YCFBamRelationByToKeyIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByToKeyIdx.containsKey( key ) ) {
			dict = indexByToKeyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByToKeyIdx( schema.getAuthorization(),
				TenantId,
				ToIndexId );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToKeyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId )
	{
		return( readRelationByNarrowedIdx( NarrowedTenantId,
			NarrowedId,
			false ) );
	}

	public List<IYCFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByNarrowedIdx";
		YCFBamRelationByNarrowedIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( NarrowedTenantId );
		key.setOptionalNarrowedId( NarrowedId );
		Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
		if( indexByNarrowedIdx == null ) {
			indexByNarrowedIdx = new HashMap< YCFBamRelationByNarrowedIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByNarrowedIdx.containsKey( key ) ) {
			dict = indexByNarrowedIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamRelationObj>();
			IYCFBamRelationObj obj;
			YCFBamRelationBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByNarrowedIdx( schema.getAuthorization(),
				NarrowedTenantId,
				NarrowedId );
			YCFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamRelationObj realised = (IYCFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNarrowedIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
		Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamRelationObj readCachedRelationByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamRelationObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedRelation( pkey );
		return( obj );
	}

	public List<IYCFBamRelationObj> readCachedRelationByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRelationByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamRelationObj readCachedRelationByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamRelationObj obj = null;
		YCFBamRelationByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
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

	public List<IYCFBamRelationObj> readCachedRelationByRelnTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRelationByRelnTenantIdx";
		YCFBamRelationByRelnTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByRelnTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByRelnTenantIdx.containsKey( key ) ) {
				dict = indexByRelnTenantIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByRelTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedRelationByRelTableIdx";
		YCFBamRelationByRelTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByRelTableIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByRelTableIdx.containsKey( key ) ) {
				dict = indexByRelTableIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedRelationByCodeVisIdx";
		YCFBamRelationByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedRelationByTableCodeVisIdx";
		YCFBamRelationByTableCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByTableCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByTableCodeVisIdx.containsKey( key ) ) {
				dict = indexByTableCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedRelationByDefSchemaIdx";
		YCFBamRelationByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByFromKeyIdx( long TenantId,
		long FromIndexId )
	{
		final String S_ProcName = "readCachedRelationByFromKeyIdx";
		YCFBamRelationByFromKeyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromIndexId( FromIndexId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByFromKeyIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByFromKeyIdx.containsKey( key ) ) {
				dict = indexByFromKeyIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByToTblIdx( long TenantId,
		long ToTableId )
	{
		final String S_ProcName = "readCachedRelationByToTblIdx";
		YCFBamRelationByToTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToTableId( ToTableId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByToTblIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByToTblIdx.containsKey( key ) ) {
				dict = indexByToTblIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByToKeyIdx( long TenantId,
		long ToIndexId )
	{
		final String S_ProcName = "readCachedRelationByToKeyIdx";
		YCFBamRelationByToKeyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToIndexId( ToIndexId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByToKeyIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByToKeyIdx.containsKey( key ) ) {
				dict = indexByToKeyIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRelationObj> readCachedRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId )
	{
		final String S_ProcName = "readCachedRelationByNarrowedIdx";
		YCFBamRelationByNarrowedIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( NarrowedTenantId );
		key.setOptionalNarrowedId( NarrowedId );
		ArrayList<IYCFBamRelationObj> arrayList = new ArrayList<IYCFBamRelationObj>();
		if( indexByNarrowedIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict;
			if( indexByNarrowedIdx.containsKey( key ) ) {
				dict = indexByNarrowedIdx.get( key );
				int len = dict.size();
				IYCFBamRelationObj arr[] = new IYCFBamRelationObj[len];
				Iterator<IYCFBamRelationObj> valIter = dict.values().iterator();
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
			IYCFBamRelationObj obj;
			Iterator<IYCFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRelationObj> cmp = new Comparator<IYCFBamRelationObj>() {
			public int compare( IYCFBamRelationObj lhs, IYCFBamRelationObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeRelationByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamRelationObj obj = readCachedRelationByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRelationByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRelationByTenantIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamRelationObj obj = readCachedRelationByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRelationByRelnTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRelationByRelnTenantIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByRelnTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByRelTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeRelationByRelTableIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByRelTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeRelationByCodeVisIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeRelationByTableCodeVisIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByTableCodeVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeRelationByDefSchemaIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByFromKeyIdx( long TenantId,
		long FromIndexId )
	{
		final String S_ProcName = "deepDisposeRelationByFromKeyIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByFromKeyIdx( TenantId,
				FromIndexId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByToTblIdx( long TenantId,
		long ToTableId )
	{
		final String S_ProcName = "deepDisposeRelationByToTblIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByToTblIdx( TenantId,
				ToTableId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByToKeyIdx( long TenantId,
		long ToIndexId )
	{
		final String S_ProcName = "deepDisposeRelationByToKeyIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByToKeyIdx( TenantId,
				ToIndexId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId )
	{
		final String S_ProcName = "deepDisposeRelationByNarrowedIdx";
		IYCFBamRelationObj obj;
		List<IYCFBamRelationObj> arrayList = readCachedRelationByNarrowedIdx( NarrowedTenantId,
				NarrowedId );
		if( arrayList != null )  {
			Iterator<IYCFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamRelationObj updateRelation( IYCFBamRelationObj Obj ) {
		IYCFBamRelationObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableRelation().updateRelation( schema.getAuthorization(),
			Obj.getRelationBuff() );
		if( Obj.getClassCode().equals( "a838" ) ) {
			obj = (IYCFBamRelationObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteRelation( IYCFBamRelationObj Obj ) {
		IYCFBamRelationObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelation( schema.getAuthorization(),
			obj.getRelationBuff() );
		Obj.forget();
	}

	public void deleteRelationByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamRelationObj obj = readRelation( pkey );
		if( obj != null ) {
			IYCFBamRelationEditObj editObj = (IYCFBamRelationEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamRelationEditObj)obj.beginEdit();
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
		deepDisposeRelationByIdIdx( TenantId,
				Id );
	}

	public void deleteRelationByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRelationByTenantIdx( TenantId );
	}

	public void deleteRelationByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamRelationByUNameIdxKey,
				IYCFBamRelationObj >();
		}
		YCFBamRelationByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamRelationObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeRelationByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteRelationByRelnTenantIdx( long TenantId )
	{
		YCFBamRelationByRelnTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByRelnTenantIdx == null ) {
			indexByRelnTenantIdx = new HashMap< YCFBamRelationByRelnTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByRelnTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByRelnTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelnTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelnTenantIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelnTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRelationByRelnTenantIdx( TenantId );
	}

	public void deleteRelationByRelTableIdx( long TenantId,
		long TableId )
	{
		YCFBamRelationByRelTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByRelTableIdx == null ) {
			indexByRelTableIdx = new HashMap< YCFBamRelationByRelTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByRelTableIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByRelTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelTableIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeRelationByRelTableIdx( TenantId,
				TableId );
	}

	public void deleteRelationByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamRelationByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamRelationByCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeRelationByCodeVisIdx( CodeVis );
	}

	public void deleteRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamRelationByTableCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByTableCodeVisIdx == null ) {
			indexByTableCodeVisIdx = new HashMap< YCFBamRelationByTableCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByTableCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByTableCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTableCodeVisIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeRelationByTableCodeVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamRelationByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRelationByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeRelationByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteRelationByFromKeyIdx( long TenantId,
		long FromIndexId )
	{
		YCFBamRelationByFromKeyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromIndexId( FromIndexId );
		if( indexByFromKeyIdx == null ) {
			indexByFromKeyIdx = new HashMap< YCFBamRelationByFromKeyIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByFromKeyIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByFromKeyIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByFromKeyIdx( schema.getAuthorization(),
				TenantId,
				FromIndexId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFromKeyIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByFromKeyIdx( schema.getAuthorization(),
				TenantId,
				FromIndexId );
		}
		deepDisposeRelationByFromKeyIdx( TenantId,
				FromIndexId );
	}

	public void deleteRelationByToTblIdx( long TenantId,
		long ToTableId )
	{
		YCFBamRelationByToTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToTableId( ToTableId );
		if( indexByToTblIdx == null ) {
			indexByToTblIdx = new HashMap< YCFBamRelationByToTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByToTblIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByToTblIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToTblIdx( schema.getAuthorization(),
				TenantId,
				ToTableId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByToTblIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToTblIdx( schema.getAuthorization(),
				TenantId,
				ToTableId );
		}
		deepDisposeRelationByToTblIdx( TenantId,
				ToTableId );
	}

	public void deleteRelationByToKeyIdx( long TenantId,
		long ToIndexId )
	{
		YCFBamRelationByToKeyIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToIndexId( ToIndexId );
		if( indexByToKeyIdx == null ) {
			indexByToKeyIdx = new HashMap< YCFBamRelationByToKeyIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByToKeyIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByToKeyIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToKeyIdx( schema.getAuthorization(),
				TenantId,
				ToIndexId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByToKeyIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToKeyIdx( schema.getAuthorization(),
				TenantId,
				ToIndexId );
		}
		deepDisposeRelationByToKeyIdx( TenantId,
				ToIndexId );
	}

	public void deleteRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId )
	{
		YCFBamRelationByNarrowedIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( NarrowedTenantId );
		key.setOptionalNarrowedId( NarrowedId );
		if( indexByNarrowedIdx == null ) {
			indexByNarrowedIdx = new HashMap< YCFBamRelationByNarrowedIdxKey,
				Map< YCFBamScopePKey, IYCFBamRelationObj > >();
		}
		if( indexByNarrowedIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamRelationObj> dict = indexByNarrowedIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByNarrowedIdx( schema.getAuthorization(),
				NarrowedTenantId,
				NarrowedId );
			Iterator<IYCFBamRelationObj> iter = dict.values().iterator();
			IYCFBamRelationObj obj;
			List<IYCFBamRelationObj> toForget = new LinkedList<IYCFBamRelationObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNarrowedIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByNarrowedIdx( schema.getAuthorization(),
				NarrowedTenantId,
				NarrowedId );
		}
		deepDisposeRelationByNarrowedIdx( NarrowedTenantId,
				NarrowedId );
	}
}

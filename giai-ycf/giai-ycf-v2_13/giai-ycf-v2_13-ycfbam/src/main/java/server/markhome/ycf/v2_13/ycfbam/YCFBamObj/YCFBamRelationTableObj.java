// Description: Java 11 Table Object implementation for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamRelationTableObj
	implements ICFBamRelationTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamRelationObj> members;
	private Map<CFBamScopePKey, ICFBamRelationObj> allRelation;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByTenantIdx;
	private Map< CFBamRelationByUNameIdxKey,
		ICFBamRelationObj > indexByUNameIdx;
	private Map< CFBamRelationByRelnTenantIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByRelnTenantIdx;
	private Map< CFBamRelationByRelTableIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByRelTableIdx;
	private Map< CFBamRelationByCodeVisIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByCodeVisIdx;
	private Map< CFBamRelationByTableCodeVisIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByTableCodeVisIdx;
	private Map< CFBamRelationByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByDefSchemaIdx;
	private Map< CFBamRelationByFromKeyIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByFromKeyIdx;
	private Map< CFBamRelationByToTblIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByToTblIdx;
	private Map< CFBamRelationByToKeyIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByToKeyIdx;
	private Map< CFBamRelationByNarrowedIdxKey,
		Map<CFBamScopePKey, ICFBamRelationObj > > indexByNarrowedIdx;
	public static String TABLE_NAME = "Relation";
	public static String TABLE_DBNAME = "reldef";

	public CFBamRelationTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
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

	public CFBamRelationTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
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

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
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
		List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
		ICFBamRelationObj cur = null;
		Iterator<ICFBamRelationObj> iter = members.values().iterator();
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
	 *	CFBamRelationObj.
	 */
	public ICFBamRelationObj newInstance() {
		ICFBamRelationObj inst = new CFBamRelationObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamRelationObj.
	 */
	public ICFBamRelationEditObj newEditInstance( ICFBamRelationObj orig ) {
		ICFBamRelationEditObj edit = new CFBamRelationEditObj( orig );
		return( edit );
	}

	public ICFBamRelationObj realiseRelation( ICFBamRelationObj Obj ) {
		ICFBamRelationObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamRelationObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamRelationObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamRelationByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByRelnTenantIdx != null ) {
				CFBamRelationByRelnTenantIdxKey keyRelnTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
				keyRelnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapRelnTenantIdx = indexByRelnTenantIdx.get( keyRelnTenantIdx );
				if( mapRelnTenantIdx != null ) {
					mapRelnTenantIdx.remove( keepObj.getPKey() );
					if( mapRelnTenantIdx.size() <= 0 ) {
						indexByRelnTenantIdx.remove( keyRelnTenantIdx );
					}
				}
			}

			if( indexByRelTableIdx != null ) {
				CFBamRelationByRelTableIdxKey keyRelTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
				keyRelTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapRelTableIdx = indexByRelTableIdx.get( keyRelTableIdx );
				if( mapRelTableIdx != null ) {
					mapRelTableIdx.remove( keepObj.getPKey() );
					if( mapRelTableIdx.size() <= 0 ) {
						indexByRelTableIdx.remove( keyRelTableIdx );
					}
				}
			}

			if( indexByCodeVisIdx != null ) {
				CFBamRelationByCodeVisIdxKey keyCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.remove( keepObj.getPKey() );
					if( mapCodeVisIdx.size() <= 0 ) {
						indexByCodeVisIdx.remove( keyCodeVisIdx );
					}
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				CFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.remove( keepObj.getPKey() );
					if( mapTableCodeVisIdx.size() <= 0 ) {
						indexByTableCodeVisIdx.remove( keyTableCodeVisIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRelationByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByFromKeyIdx != null ) {
				CFBamRelationByFromKeyIdxKey keyFromKeyIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
				keyFromKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromKeyIdx.setRequiredFromIndexId( keepObj.getRequiredFromIndexId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapFromKeyIdx = indexByFromKeyIdx.get( keyFromKeyIdx );
				if( mapFromKeyIdx != null ) {
					mapFromKeyIdx.remove( keepObj.getPKey() );
					if( mapFromKeyIdx.size() <= 0 ) {
						indexByFromKeyIdx.remove( keyFromKeyIdx );
					}
				}
			}

			if( indexByToTblIdx != null ) {
				CFBamRelationByToTblIdxKey keyToTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
				keyToTblIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToTblIdx.setRequiredToTableId( keepObj.getRequiredToTableId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapToTblIdx = indexByToTblIdx.get( keyToTblIdx );
				if( mapToTblIdx != null ) {
					mapToTblIdx.remove( keepObj.getPKey() );
					if( mapToTblIdx.size() <= 0 ) {
						indexByToTblIdx.remove( keyToTblIdx );
					}
				}
			}

			if( indexByToKeyIdx != null ) {
				CFBamRelationByToKeyIdxKey keyToKeyIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
				keyToKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToKeyIdx.setRequiredToIndexId( keepObj.getRequiredToIndexId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapToKeyIdx = indexByToKeyIdx.get( keyToKeyIdx );
				if( mapToKeyIdx != null ) {
					mapToKeyIdx.remove( keepObj.getPKey() );
					if( mapToKeyIdx.size() <= 0 ) {
						indexByToKeyIdx.remove( keyToKeyIdx );
					}
				}
			}

			if( indexByNarrowedIdx != null ) {
				CFBamRelationByNarrowedIdxKey keyNarrowedIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
				keyNarrowedIdx.setOptionalNarrowedTenantId( keepObj.getOptionalNarrowedTenantId() );
				keyNarrowedIdx.setOptionalNarrowedId( keepObj.getOptionalNarrowedId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapNarrowedIdx = indexByNarrowedIdx.get( keyNarrowedIdx );
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
			keepObj = (ICFBamRelationObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamRelationByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRelnTenantIdx != null ) {
				CFBamRelationByRelnTenantIdxKey keyRelnTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
				keyRelnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapRelnTenantIdx = indexByRelnTenantIdx.get( keyRelnTenantIdx );
				if( mapRelnTenantIdx != null ) {
					mapRelnTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelTableIdx != null ) {
				CFBamRelationByRelTableIdxKey keyRelTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
				keyRelTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapRelTableIdx = indexByRelTableIdx.get( keyRelTableIdx );
				if( mapRelTableIdx != null ) {
					mapRelTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				CFBamRelationByCodeVisIdxKey keyCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				CFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRelationByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFromKeyIdx != null ) {
				CFBamRelationByFromKeyIdxKey keyFromKeyIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
				keyFromKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromKeyIdx.setRequiredFromIndexId( keepObj.getRequiredFromIndexId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapFromKeyIdx = indexByFromKeyIdx.get( keyFromKeyIdx );
				if( mapFromKeyIdx != null ) {
					mapFromKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToTblIdx != null ) {
				CFBamRelationByToTblIdxKey keyToTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
				keyToTblIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToTblIdx.setRequiredToTableId( keepObj.getRequiredToTableId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapToTblIdx = indexByToTblIdx.get( keyToTblIdx );
				if( mapToTblIdx != null ) {
					mapToTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToKeyIdx != null ) {
				CFBamRelationByToKeyIdxKey keyToKeyIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
				keyToKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToKeyIdx.setRequiredToIndexId( keepObj.getRequiredToIndexId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapToKeyIdx = indexByToKeyIdx.get( keyToKeyIdx );
				if( mapToKeyIdx != null ) {
					mapToKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNarrowedIdx != null ) {
				CFBamRelationByNarrowedIdxKey keyNarrowedIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
				keyNarrowedIdx.setOptionalNarrowedTenantId( keepObj.getOptionalNarrowedTenantId() );
				keyNarrowedIdx.setOptionalNarrowedId( keepObj.getOptionalNarrowedId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapNarrowedIdx = indexByNarrowedIdx.get( keyNarrowedIdx );
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
			keepObj = (ICFBamRelationObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allRelation != null ) {
				allRelation.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamRelationByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByRelnTenantIdx != null ) {
				CFBamRelationByRelnTenantIdxKey keyRelnTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
				keyRelnTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapRelnTenantIdx = indexByRelnTenantIdx.get( keyRelnTenantIdx );
				if( mapRelnTenantIdx != null ) {
					mapRelnTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelTableIdx != null ) {
				CFBamRelationByRelTableIdxKey keyRelTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
				keyRelTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyRelTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapRelTableIdx = indexByRelTableIdx.get( keyRelTableIdx );
				if( mapRelTableIdx != null ) {
					mapRelTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				CFBamRelationByCodeVisIdxKey keyCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				CFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRelationByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFromKeyIdx != null ) {
				CFBamRelationByFromKeyIdxKey keyFromKeyIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
				keyFromKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyFromKeyIdx.setRequiredFromIndexId( keepObj.getRequiredFromIndexId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapFromKeyIdx = indexByFromKeyIdx.get( keyFromKeyIdx );
				if( mapFromKeyIdx != null ) {
					mapFromKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToTblIdx != null ) {
				CFBamRelationByToTblIdxKey keyToTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
				keyToTblIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToTblIdx.setRequiredToTableId( keepObj.getRequiredToTableId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapToTblIdx = indexByToTblIdx.get( keyToTblIdx );
				if( mapToTblIdx != null ) {
					mapToTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByToKeyIdx != null ) {
				CFBamRelationByToKeyIdxKey keyToKeyIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
				keyToKeyIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyToKeyIdx.setRequiredToIndexId( keepObj.getRequiredToIndexId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapToKeyIdx = indexByToKeyIdx.get( keyToKeyIdx );
				if( mapToKeyIdx != null ) {
					mapToKeyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNarrowedIdx != null ) {
				CFBamRelationByNarrowedIdxKey keyNarrowedIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
				keyNarrowedIdx.setOptionalNarrowedTenantId( keepObj.getOptionalNarrowedTenantId() );
				keyNarrowedIdx.setOptionalNarrowedId( keepObj.getOptionalNarrowedId() );
				Map<CFBamScopePKey, ICFBamRelationObj > mapNarrowedIdx = indexByNarrowedIdx.get( keyNarrowedIdx );
				if( mapNarrowedIdx != null ) {
					mapNarrowedIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamRelationObj createRelation( ICFBamRelationObj Obj ) {
		ICFBamRelationObj obj = Obj;
		CFBamRelationBuff buff = obj.getRelationBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableRelation().createRelation(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a838" ) ) {
			obj = (ICFBamRelationObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamRelationObj readRelation( CFBamScopePKey pkey ) {
		return( readRelation( pkey, false ) );
	}

	public ICFBamRelationObj readRelation( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamRelationObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamRelationBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamRelationObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamRelationObj readCachedRelation( CFBamScopePKey pkey ) {
		ICFBamRelationObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRelation( ICFBamRelationObj obj )
	{
		final String S_ProcName = "CFBamRelationTableObj.reallyDeepDisposeRelation() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamRelationObj existing = readCachedRelation( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamRelationByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamRelationByRelnTenantIdxKey keyRelnTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		keyRelnTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFBamRelationByRelTableIdxKey keyRelTableIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		keyRelTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		CFBamRelationByCodeVisIdxKey keyCodeVisIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		CFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		keyTableCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTableCodeVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyTableCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		CFBamRelationByDefSchemaIdxKey keyDefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		CFBamRelationByFromKeyIdxKey keyFromKeyIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		keyFromKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyFromKeyIdx.setRequiredFromIndexId( existing.getRequiredFromIndexId() );

		CFBamRelationByToTblIdxKey keyToTblIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		keyToTblIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToTblIdx.setRequiredToTableId( existing.getRequiredToTableId() );

		CFBamRelationByToKeyIdxKey keyToKeyIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		keyToKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToKeyIdx.setRequiredToIndexId( existing.getRequiredToIndexId() );

		CFBamRelationByNarrowedIdxKey keyNarrowedIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
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
	public void deepDisposeRelation( CFBamScopePKey pkey ) {
		ICFBamRelationObj obj = readCachedRelation( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamRelationObj lockRelation( CFBamScopePKey pkey ) {
		ICFBamRelationObj locked = null;
		CFBamRelationBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamRelationObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockRelation", pkey );
		}
		return( locked );
	}

	public List<ICFBamRelationObj> readAllRelation() {
		return( readAllRelation( false ) );
	}

	public List<ICFBamRelationObj> readAllRelation( boolean forceRead ) {
		final String S_ProcName = "readAllRelation";
		if( ( allRelation == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamRelationObj> map = new HashMap<CFBamScopePKey,ICFBamRelationObj>();
			allRelation = map;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readAllDerived( schema.getAuthorization() );
			CFBamRelationBuff buff;
			ICFBamRelationObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
			}
		}
		int len = allRelation.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = allRelation.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readCachedAllRelation() {
		final String S_ProcName = "readCachedAllRelation";
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( allRelation != null ) {
			int len = allRelation.size();
			ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
			Iterator<ICFBamRelationObj> valIter = allRelation.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
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
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id )
	{
		return( readRelationByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamRelationObj readRelationByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamRelationObj obj = readRelation( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamRelationObj> readRelationByTenantIdx( long TenantId )
	{
		return( readRelationByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamRelationObj readRelationByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readRelationByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public ICFBamRelationObj readRelationByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamRelationByUNameIdxKey,
				ICFBamRelationObj >();
		}
		CFBamRelationByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamRelationObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamRelationBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamRelationObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamRelationObj> readRelationByRelnTenantIdx( long TenantId )
	{
		return( readRelationByRelnTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByRelnTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByRelnTenantIdx";
		CFBamRelationByRelnTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByRelnTenantIdx == null ) {
			indexByRelnTenantIdx = new HashMap< CFBamRelationByRelnTenantIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByRelnTenantIdx.containsKey( key ) ) {
			dict = indexByRelnTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByRelnTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelnTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId )
	{
		return( readRelationByRelTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByRelTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByRelTableIdx";
		CFBamRelationByRelTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByRelTableIdx == null ) {
			indexByRelTableIdx = new HashMap< CFBamRelationByRelTableIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByRelTableIdx.containsKey( key ) ) {
			dict = indexByRelTableIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByRelTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelTableIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readRelationByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByCodeVisIdx";
		CFBamRelationByCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< CFBamRelationByCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readRelationByTableCodeVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByTableCodeVisIdx";
		CFBamRelationByTableCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByTableCodeVisIdx == null ) {
			indexByTableCodeVisIdx = new HashMap< CFBamRelationByTableCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByTableCodeVisIdx.containsKey( key ) ) {
			dict = indexByTableCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTableCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readRelationByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByDefSchemaIdx";
		CFBamRelationByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamRelationByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId )
	{
		return( readRelationByFromKeyIdx( TenantId,
			FromIndexId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByFromKeyIdx( long TenantId,
		long FromIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByFromKeyIdx";
		CFBamRelationByFromKeyIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromIndexId( FromIndexId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByFromKeyIdx == null ) {
			indexByFromKeyIdx = new HashMap< CFBamRelationByFromKeyIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByFromKeyIdx.containsKey( key ) ) {
			dict = indexByFromKeyIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByFromKeyIdx( schema.getAuthorization(),
				TenantId,
				FromIndexId );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFromKeyIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId )
	{
		return( readRelationByToTblIdx( TenantId,
			ToTableId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByToTblIdx( long TenantId,
		long ToTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByToTblIdx";
		CFBamRelationByToTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToTableId( ToTableId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByToTblIdx == null ) {
			indexByToTblIdx = new HashMap< CFBamRelationByToTblIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByToTblIdx.containsKey( key ) ) {
			dict = indexByToTblIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByToTblIdx( schema.getAuthorization(),
				TenantId,
				ToTableId );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToTblIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId )
	{
		return( readRelationByToKeyIdx( TenantId,
			ToIndexId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByToKeyIdx( long TenantId,
		long ToIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByToKeyIdx";
		CFBamRelationByToKeyIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToIndexId( ToIndexId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByToKeyIdx == null ) {
			indexByToKeyIdx = new HashMap< CFBamRelationByToKeyIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByToKeyIdx.containsKey( key ) ) {
			dict = indexByToKeyIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByToKeyIdx( schema.getAuthorization(),
				TenantId,
				ToIndexId );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByToKeyIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId )
	{
		return( readRelationByNarrowedIdx( NarrowedTenantId,
			NarrowedId,
			false ) );
	}

	public List<ICFBamRelationObj> readRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId,
		boolean forceRead )
	{
		final String S_ProcName = "readRelationByNarrowedIdx";
		CFBamRelationByNarrowedIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( NarrowedTenantId );
		key.setOptionalNarrowedId( NarrowedId );
		Map<CFBamScopePKey, ICFBamRelationObj> dict;
		if( indexByNarrowedIdx == null ) {
			indexByNarrowedIdx = new HashMap< CFBamRelationByNarrowedIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( ( ! forceRead ) && indexByNarrowedIdx.containsKey( key ) ) {
			dict = indexByNarrowedIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamRelationObj>();
			ICFBamRelationObj obj;
			CFBamRelationBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRelation().readDerivedByNarrowedIdx( schema.getAuthorization(),
				NarrowedTenantId,
				NarrowedId );
			CFBamRelationBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRelationObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamRelationObj realised = (ICFBamRelationObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNarrowedIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
		Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRelationObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamRelationObj readCachedRelationByIdIdx( long TenantId,
		long Id )
	{
		ICFBamRelationObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedRelation( pkey );
		return( obj );
	}

	public List<ICFBamRelationObj> readCachedRelationByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRelationByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamRelationObj readCachedRelationByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamRelationObj obj = null;
		CFBamRelationByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamRelationObj> valIter = members.values().iterator();
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
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
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

	public List<ICFBamRelationObj> readCachedRelationByRelnTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRelationByRelnTenantIdx";
		CFBamRelationByRelnTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByRelnTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByRelnTenantIdx.containsKey( key ) ) {
				dict = indexByRelnTenantIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByRelTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedRelationByRelTableIdx";
		CFBamRelationByRelTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByRelTableIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByRelTableIdx.containsKey( key ) ) {
				dict = indexByRelTableIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedRelationByCodeVisIdx";
		CFBamRelationByCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByCodeVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedRelationByTableCodeVisIdx";
		CFBamRelationByTableCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByTableCodeVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByTableCodeVisIdx.containsKey( key ) ) {
				dict = indexByTableCodeVisIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedRelationByDefSchemaIdx";
		CFBamRelationByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByFromKeyIdx( long TenantId,
		long FromIndexId )
	{
		final String S_ProcName = "readCachedRelationByFromKeyIdx";
		CFBamRelationByFromKeyIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromIndexId( FromIndexId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByFromKeyIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByFromKeyIdx.containsKey( key ) ) {
				dict = indexByFromKeyIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByToTblIdx( long TenantId,
		long ToTableId )
	{
		final String S_ProcName = "readCachedRelationByToTblIdx";
		CFBamRelationByToTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToTableId( ToTableId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByToTblIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByToTblIdx.containsKey( key ) ) {
				dict = indexByToTblIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByToKeyIdx( long TenantId,
		long ToIndexId )
	{
		final String S_ProcName = "readCachedRelationByToKeyIdx";
		CFBamRelationByToKeyIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToIndexId( ToIndexId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByToKeyIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByToKeyIdx.containsKey( key ) ) {
				dict = indexByToKeyIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRelationObj> readCachedRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId )
	{
		final String S_ProcName = "readCachedRelationByNarrowedIdx";
		CFBamRelationByNarrowedIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( NarrowedTenantId );
		key.setOptionalNarrowedId( NarrowedId );
		ArrayList<ICFBamRelationObj> arrayList = new ArrayList<ICFBamRelationObj>();
		if( indexByNarrowedIdx != null ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict;
			if( indexByNarrowedIdx.containsKey( key ) ) {
				dict = indexByNarrowedIdx.get( key );
				int len = dict.size();
				ICFBamRelationObj arr[] = new ICFBamRelationObj[len];
				Iterator<ICFBamRelationObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamRelationObj obj;
			Iterator<ICFBamRelationObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRelationObj> cmp = new Comparator<ICFBamRelationObj>() {
			public int compare( ICFBamRelationObj lhs, ICFBamRelationObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
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
		ICFBamRelationObj obj = readCachedRelationByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRelationByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRelationByTenantIdx";
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamRelationObj obj = readCachedRelationByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRelationByRelnTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRelationByRelnTenantIdx";
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByRelnTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByRelTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeRelationByCodeVisIdx";
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeRelationByTableCodeVisIdx";
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByTableCodeVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByFromKeyIdx( TenantId,
				FromIndexId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByToTblIdx( TenantId,
				ToTableId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByToKeyIdx( TenantId,
				ToIndexId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
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
		ICFBamRelationObj obj;
		List<ICFBamRelationObj> arrayList = readCachedRelationByNarrowedIdx( NarrowedTenantId,
				NarrowedId );
		if( arrayList != null )  {
			Iterator<ICFBamRelationObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamRelationObj updateRelation( ICFBamRelationObj Obj ) {
		ICFBamRelationObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableRelation().updateRelation( schema.getAuthorization(),
			Obj.getRelationBuff() );
		if( Obj.getClassCode().equals( "a838" ) ) {
			obj = (ICFBamRelationObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteRelation( ICFBamRelationObj Obj ) {
		ICFBamRelationObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelation( schema.getAuthorization(),
			obj.getRelationBuff() );
		Obj.forget();
	}

	public void deleteRelationByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamRelationObj obj = readRelation( pkey );
		if( obj != null ) {
			ICFBamRelationEditObj editObj = (ICFBamRelationEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamRelationEditObj)obj.beginEdit();
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
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRelationByTenantIdx( TenantId );
	}

	public void deleteRelationByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamRelationByUNameIdxKey,
				ICFBamRelationObj >();
		}
		CFBamRelationByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamRelationObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByUNameIdx( schema.getAuthorization(),
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
		CFBamRelationByRelnTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByRelnTenantIdx == null ) {
			indexByRelnTenantIdx = new HashMap< CFBamRelationByRelnTenantIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByRelnTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByRelnTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelnTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelnTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRelationByRelnTenantIdx( TenantId );
	}

	public void deleteRelationByRelTableIdx( long TenantId,
		long TableId )
	{
		CFBamRelationByRelTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByRelTableIdx == null ) {
			indexByRelTableIdx = new HashMap< CFBamRelationByRelTableIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByRelTableIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByRelTableIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByRelTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeRelationByRelTableIdx( TenantId,
				TableId );
	}

	public void deleteRelationByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamRelationByCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< CFBamRelationByCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByCodeVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeRelationByCodeVisIdx( CodeVis );
	}

	public void deleteRelationByTableCodeVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamRelationByTableCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByTableCodeVisIdx == null ) {
			indexByTableCodeVisIdx = new HashMap< CFBamRelationByTableCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByTableCodeVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByTableCodeVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByTableCodeVisIdx( schema.getAuthorization(),
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
		CFBamRelationByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamRelationByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeRelationByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteRelationByFromKeyIdx( long TenantId,
		long FromIndexId )
	{
		CFBamRelationByFromKeyIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromIndexId( FromIndexId );
		if( indexByFromKeyIdx == null ) {
			indexByFromKeyIdx = new HashMap< CFBamRelationByFromKeyIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByFromKeyIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByFromKeyIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByFromKeyIdx( schema.getAuthorization(),
				TenantId,
				FromIndexId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByFromKeyIdx( schema.getAuthorization(),
				TenantId,
				FromIndexId );
		}
		deepDisposeRelationByFromKeyIdx( TenantId,
				FromIndexId );
	}

	public void deleteRelationByToTblIdx( long TenantId,
		long ToTableId )
	{
		CFBamRelationByToTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToTableId( ToTableId );
		if( indexByToTblIdx == null ) {
			indexByToTblIdx = new HashMap< CFBamRelationByToTblIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByToTblIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByToTblIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToTblIdx( schema.getAuthorization(),
				TenantId,
				ToTableId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToTblIdx( schema.getAuthorization(),
				TenantId,
				ToTableId );
		}
		deepDisposeRelationByToTblIdx( TenantId,
				ToTableId );
	}

	public void deleteRelationByToKeyIdx( long TenantId,
		long ToIndexId )
	{
		CFBamRelationByToKeyIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToIndexId( ToIndexId );
		if( indexByToKeyIdx == null ) {
			indexByToKeyIdx = new HashMap< CFBamRelationByToKeyIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByToKeyIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByToKeyIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToKeyIdx( schema.getAuthorization(),
				TenantId,
				ToIndexId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByToKeyIdx( schema.getAuthorization(),
				TenantId,
				ToIndexId );
		}
		deepDisposeRelationByToKeyIdx( TenantId,
				ToIndexId );
	}

	public void deleteRelationByNarrowedIdx( Long NarrowedTenantId,
		Long NarrowedId )
	{
		CFBamRelationByNarrowedIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( NarrowedTenantId );
		key.setOptionalNarrowedId( NarrowedId );
		if( indexByNarrowedIdx == null ) {
			indexByNarrowedIdx = new HashMap< CFBamRelationByNarrowedIdxKey,
				Map< CFBamScopePKey, ICFBamRelationObj > >();
		}
		if( indexByNarrowedIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamRelationObj> dict = indexByNarrowedIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByNarrowedIdx( schema.getAuthorization(),
				NarrowedTenantId,
				NarrowedId );
			Iterator<ICFBamRelationObj> iter = dict.values().iterator();
			ICFBamRelationObj obj;
			List<ICFBamRelationObj> toForget = new LinkedList<ICFBamRelationObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRelation().deleteRelationByNarrowedIdx( schema.getAuthorization(),
				NarrowedTenantId,
				NarrowedId );
		}
		deepDisposeRelationByNarrowedIdx( NarrowedTenantId,
				NarrowedId );
	}
}
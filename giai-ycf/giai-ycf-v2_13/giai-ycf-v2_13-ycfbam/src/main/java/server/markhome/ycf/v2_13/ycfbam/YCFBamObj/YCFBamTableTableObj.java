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

public class CFBamTableTableObj
	implements ICFBamTableTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamTableObj> members;
	private Map<CFBamScopePKey, ICFBamTableObj> allTable;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexByTenantIdx;
	private Map< CFBamTableBySchemaDefIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexBySchemaDefIdx;
	private Map< CFBamTableByCodeVisIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexByCodeVisIdx;
	private Map< CFBamTableBySchemaCodeVisIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexBySchemaCodeVisIdx;
	private Map< CFBamTableByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexByDefSchemaIdx;
	private Map< CFBamTableByUNameIdxKey,
		ICFBamTableObj > indexByUNameIdx;
	private Map< CFBamTableBySchemaCdIdxKey,
		ICFBamTableObj > indexBySchemaCdIdx;
	private Map< CFBamTableByPrimaryIndexIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexByPrimaryIndexIdx;
	private Map< CFBamTableByLookupIndexIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexByLookupIndexIdx;
	private Map< CFBamTableByAltIndexIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexByAltIndexIdx;
	private Map< CFBamTableByQualTableIdxKey,
		Map<CFBamScopePKey, ICFBamTableObj > > indexByQualTableIdx;
	public static String TABLE_NAME = "Table";
	public static String TABLE_DBNAME = "tbldef";

	public CFBamTableTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamTableObj>();
		allTable = null;
		indexByTenantIdx = null;
		indexBySchemaDefIdx = null;
		indexByCodeVisIdx = null;
		indexBySchemaCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexBySchemaCdIdx = null;
		indexByPrimaryIndexIdx = null;
		indexByLookupIndexIdx = null;
		indexByAltIndexIdx = null;
		indexByQualTableIdx = null;
	}

	public CFBamTableTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamTableObj>();
		allTable = null;
		indexByTenantIdx = null;
		indexBySchemaDefIdx = null;
		indexByCodeVisIdx = null;
		indexBySchemaCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexBySchemaCdIdx = null;
		indexByPrimaryIndexIdx = null;
		indexByLookupIndexIdx = null;
		indexByAltIndexIdx = null;
		indexByQualTableIdx = null;
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
		allTable = null;
		indexByTenantIdx = null;
		indexBySchemaDefIdx = null;
		indexByCodeVisIdx = null;
		indexBySchemaCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexBySchemaCdIdx = null;
		indexByPrimaryIndexIdx = null;
		indexByLookupIndexIdx = null;
		indexByAltIndexIdx = null;
		indexByQualTableIdx = null;
		List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
		ICFBamTableObj cur = null;
		Iterator<ICFBamTableObj> iter = members.values().iterator();
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
	 *	CFBamTableObj.
	 */
	public ICFBamTableObj newInstance() {
		ICFBamTableObj inst = new CFBamTableObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamTableObj.
	 */
	public ICFBamTableEditObj newEditInstance( ICFBamTableObj orig ) {
		ICFBamTableEditObj edit = new CFBamTableEditObj( orig );
		return( edit );
	}

	public ICFBamTableObj realiseTable( ICFBamTableObj Obj ) {
		ICFBamTableObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamTableObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamTableObj existingObj = members.get( pkey );
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
				Map<CFBamScopePKey, ICFBamTableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexBySchemaDefIdx != null ) {
				CFBamTableBySchemaDefIdxKey keySchemaDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
				keySchemaDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaDefIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapSchemaDefIdx = indexBySchemaDefIdx.get( keySchemaDefIdx );
				if( mapSchemaDefIdx != null ) {
					mapSchemaDefIdx.remove( keepObj.getPKey() );
					if( mapSchemaDefIdx.size() <= 0 ) {
						indexBySchemaDefIdx.remove( keySchemaDefIdx );
					}
				}
			}

			if( indexByCodeVisIdx != null ) {
				CFBamTableByCodeVisIdxKey keyCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamTableObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.remove( keepObj.getPKey() );
					if( mapCodeVisIdx.size() <= 0 ) {
						indexByCodeVisIdx.remove( keyCodeVisIdx );
					}
				}
			}

			if( indexBySchemaCodeVisIdx != null ) {
				CFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
				keySchemaCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCodeVisIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamTableObj > mapSchemaCodeVisIdx = indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
				if( mapSchemaCodeVisIdx != null ) {
					mapSchemaCodeVisIdx.remove( keepObj.getPKey() );
					if( mapSchemaCodeVisIdx.size() <= 0 ) {
						indexBySchemaCodeVisIdx.remove( keySchemaCodeVisIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTableByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamTableByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexBySchemaCdIdx != null ) {
				CFBamTableBySchemaCdIdxKey keySchemaCdIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
				keySchemaCdIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCdIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCdIdx.setRequiredTableClassCode( keepObj.getRequiredTableClassCode() );
				indexBySchemaCdIdx.remove( keySchemaCdIdx );
			}

			if( indexByPrimaryIndexIdx != null ) {
				CFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
				keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( keepObj.getOptionalPrimaryIndexTenantId() );
				keyPrimaryIndexIdx.setOptionalPrimaryIndexId( keepObj.getOptionalPrimaryIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapPrimaryIndexIdx = indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
				if( mapPrimaryIndexIdx != null ) {
					mapPrimaryIndexIdx.remove( keepObj.getPKey() );
					if( mapPrimaryIndexIdx.size() <= 0 ) {
						indexByPrimaryIndexIdx.remove( keyPrimaryIndexIdx );
					}
				}
			}

			if( indexByLookupIndexIdx != null ) {
				CFBamTableByLookupIndexIdxKey keyLookupIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
				keyLookupIndexIdx.setOptionalLookupIndexTenantId( keepObj.getOptionalLookupIndexTenantId() );
				keyLookupIndexIdx.setOptionalLookupIndexId( keepObj.getOptionalLookupIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapLookupIndexIdx = indexByLookupIndexIdx.get( keyLookupIndexIdx );
				if( mapLookupIndexIdx != null ) {
					mapLookupIndexIdx.remove( keepObj.getPKey() );
					if( mapLookupIndexIdx.size() <= 0 ) {
						indexByLookupIndexIdx.remove( keyLookupIndexIdx );
					}
				}
			}

			if( indexByAltIndexIdx != null ) {
				CFBamTableByAltIndexIdxKey keyAltIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
				keyAltIndexIdx.setOptionalAltIndexTenantId( keepObj.getOptionalAltIndexTenantId() );
				keyAltIndexIdx.setOptionalAltIndexId( keepObj.getOptionalAltIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapAltIndexIdx = indexByAltIndexIdx.get( keyAltIndexIdx );
				if( mapAltIndexIdx != null ) {
					mapAltIndexIdx.remove( keepObj.getPKey() );
					if( mapAltIndexIdx.size() <= 0 ) {
						indexByAltIndexIdx.remove( keyAltIndexIdx );
					}
				}
			}

			if( indexByQualTableIdx != null ) {
				CFBamTableByQualTableIdxKey keyQualTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
				keyQualTableIdx.setOptionalQualifyingTenantId( keepObj.getOptionalQualifyingTenantId() );
				keyQualTableIdx.setOptionalQualifyingTableId( keepObj.getOptionalQualifyingTableId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapQualTableIdx = indexByQualTableIdx.get( keyQualTableIdx );
				if( mapQualTableIdx != null ) {
					mapQualTableIdx.remove( keepObj.getPKey() );
					if( mapQualTableIdx.size() <= 0 ) {
						indexByQualTableIdx.remove( keyQualTableIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamTableObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaDefIdx != null ) {
				CFBamTableBySchemaDefIdxKey keySchemaDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
				keySchemaDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaDefIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapSchemaDefIdx = indexBySchemaDefIdx.get( keySchemaDefIdx );
				if( mapSchemaDefIdx != null ) {
					mapSchemaDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				CFBamTableByCodeVisIdxKey keyCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamTableObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaCodeVisIdx != null ) {
				CFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
				keySchemaCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCodeVisIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamTableObj > mapSchemaCodeVisIdx = indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
				if( mapSchemaCodeVisIdx != null ) {
					mapSchemaCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTableByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamTableByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexBySchemaCdIdx != null ) {
				CFBamTableBySchemaCdIdxKey keySchemaCdIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
				keySchemaCdIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCdIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCdIdx.setRequiredTableClassCode( keepObj.getRequiredTableClassCode() );
				indexBySchemaCdIdx.put( keySchemaCdIdx, keepObj );
			}

			if( indexByPrimaryIndexIdx != null ) {
				CFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
				keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( keepObj.getOptionalPrimaryIndexTenantId() );
				keyPrimaryIndexIdx.setOptionalPrimaryIndexId( keepObj.getOptionalPrimaryIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapPrimaryIndexIdx = indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
				if( mapPrimaryIndexIdx != null ) {
					mapPrimaryIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLookupIndexIdx != null ) {
				CFBamTableByLookupIndexIdxKey keyLookupIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
				keyLookupIndexIdx.setOptionalLookupIndexTenantId( keepObj.getOptionalLookupIndexTenantId() );
				keyLookupIndexIdx.setOptionalLookupIndexId( keepObj.getOptionalLookupIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapLookupIndexIdx = indexByLookupIndexIdx.get( keyLookupIndexIdx );
				if( mapLookupIndexIdx != null ) {
					mapLookupIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIndexIdx != null ) {
				CFBamTableByAltIndexIdxKey keyAltIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
				keyAltIndexIdx.setOptionalAltIndexTenantId( keepObj.getOptionalAltIndexTenantId() );
				keyAltIndexIdx.setOptionalAltIndexId( keepObj.getOptionalAltIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapAltIndexIdx = indexByAltIndexIdx.get( keyAltIndexIdx );
				if( mapAltIndexIdx != null ) {
					mapAltIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByQualTableIdx != null ) {
				CFBamTableByQualTableIdxKey keyQualTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
				keyQualTableIdx.setOptionalQualifyingTenantId( keepObj.getOptionalQualifyingTenantId() );
				keyQualTableIdx.setOptionalQualifyingTableId( keepObj.getOptionalQualifyingTableId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapQualTableIdx = indexByQualTableIdx.get( keyQualTableIdx );
				if( mapQualTableIdx != null ) {
					mapQualTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allTable != null ) {
				allTable.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFBamTableObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTable != null ) {
				allTable.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaDefIdx != null ) {
				CFBamTableBySchemaDefIdxKey keySchemaDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
				keySchemaDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaDefIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapSchemaDefIdx = indexBySchemaDefIdx.get( keySchemaDefIdx );
				if( mapSchemaDefIdx != null ) {
					mapSchemaDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				CFBamTableByCodeVisIdxKey keyCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamTableObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaCodeVisIdx != null ) {
				CFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
				keySchemaCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCodeVisIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamTableObj > mapSchemaCodeVisIdx = indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
				if( mapSchemaCodeVisIdx != null ) {
					mapSchemaCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTableByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamTableByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexBySchemaCdIdx != null ) {
				CFBamTableBySchemaCdIdxKey keySchemaCdIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
				keySchemaCdIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCdIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCdIdx.setRequiredTableClassCode( keepObj.getRequiredTableClassCode() );
				indexBySchemaCdIdx.put( keySchemaCdIdx, keepObj );
			}

			if( indexByPrimaryIndexIdx != null ) {
				CFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
				keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( keepObj.getOptionalPrimaryIndexTenantId() );
				keyPrimaryIndexIdx.setOptionalPrimaryIndexId( keepObj.getOptionalPrimaryIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapPrimaryIndexIdx = indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
				if( mapPrimaryIndexIdx != null ) {
					mapPrimaryIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLookupIndexIdx != null ) {
				CFBamTableByLookupIndexIdxKey keyLookupIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
				keyLookupIndexIdx.setOptionalLookupIndexTenantId( keepObj.getOptionalLookupIndexTenantId() );
				keyLookupIndexIdx.setOptionalLookupIndexId( keepObj.getOptionalLookupIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapLookupIndexIdx = indexByLookupIndexIdx.get( keyLookupIndexIdx );
				if( mapLookupIndexIdx != null ) {
					mapLookupIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIndexIdx != null ) {
				CFBamTableByAltIndexIdxKey keyAltIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
				keyAltIndexIdx.setOptionalAltIndexTenantId( keepObj.getOptionalAltIndexTenantId() );
				keyAltIndexIdx.setOptionalAltIndexId( keepObj.getOptionalAltIndexId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapAltIndexIdx = indexByAltIndexIdx.get( keyAltIndexIdx );
				if( mapAltIndexIdx != null ) {
					mapAltIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByQualTableIdx != null ) {
				CFBamTableByQualTableIdxKey keyQualTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
				keyQualTableIdx.setOptionalQualifyingTenantId( keepObj.getOptionalQualifyingTenantId() );
				keyQualTableIdx.setOptionalQualifyingTableId( keepObj.getOptionalQualifyingTableId() );
				Map<CFBamScopePKey, ICFBamTableObj > mapQualTableIdx = indexByQualTableIdx.get( keyQualTableIdx );
				if( mapQualTableIdx != null ) {
					mapQualTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamTableObj createTable( ICFBamTableObj Obj ) {
		ICFBamTableObj obj = Obj;
		CFBamTableBuff buff = obj.getTableBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableTable().createTable(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a807" ) ) {
			obj = (ICFBamTableObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamTableObj readTable( CFBamScopePKey pkey ) {
		return( readTable( pkey, false ) );
	}

	public ICFBamTableObj readTable( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamTableObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamTableBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamTableObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamTableObj readCachedTable( CFBamScopePKey pkey ) {
		ICFBamTableObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTable( ICFBamTableObj obj )
	{
		final String S_ProcName = "CFBamTableTableObj.reallyDeepDisposeTable() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamTableObj existing = readCachedTable( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamTableBySchemaDefIdxKey keySchemaDefIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		keySchemaDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaDefIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		CFBamTableByCodeVisIdxKey keyCodeVisIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		CFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		keySchemaCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaCodeVisIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchemaCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		CFBamTableByDefSchemaIdxKey keyDefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		CFBamTableByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamTableBySchemaCdIdxKey keySchemaCdIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		keySchemaCdIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaCdIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchemaCdIdx.setRequiredTableClassCode( existing.getRequiredTableClassCode() );

		CFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( existing.getOptionalPrimaryIndexTenantId() );
		keyPrimaryIndexIdx.setOptionalPrimaryIndexId( existing.getOptionalPrimaryIndexId() );

		CFBamTableByLookupIndexIdxKey keyLookupIndexIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		keyLookupIndexIdx.setOptionalLookupIndexTenantId( existing.getOptionalLookupIndexTenantId() );
		keyLookupIndexIdx.setOptionalLookupIndexId( existing.getOptionalLookupIndexId() );

		CFBamTableByAltIndexIdxKey keyAltIndexIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		keyAltIndexIdx.setOptionalAltIndexTenantId( existing.getOptionalAltIndexTenantId() );
		keyAltIndexIdx.setOptionalAltIndexId( existing.getOptionalAltIndexId() );

		CFBamTableByQualTableIdxKey keyQualTableIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
		keyQualTableIdx.setOptionalQualifyingTenantId( existing.getOptionalQualifyingTenantId() );
		keyQualTableIdx.setOptionalQualifyingTableId( existing.getOptionalQualifyingTableId() );


					schema.getServerMethodTableObj().deepDisposeServerMethodByMethTableIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getDelTopDepTableObj().deepDisposeDelTopDepByDelTopDepTblIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getClearTopDepTableObj().deepDisposeClearTopDepByClrTopDepTblIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getChainTableObj().deepDisposeChainByChainTableIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		ICFBamRelationObj objDelTableRelationPopDep;
		List<ICFBamRelationObj> arrDelTableRelationPopDep = schema.getRelationTableObj().readCachedRelationByRelTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamRelationObj> iterDelTableRelationPopDep = arrDelTableRelationPopDep.iterator();
		while( iterDelTableRelationPopDep.hasNext() ) {
			objDelTableRelationPopDep = iterDelTableRelationPopDep.next();
			if( objDelTableRelationPopDep != null ) {
						schema.getPopTopDepTableObj().deepDisposePopTopDepByContRelIdx( objDelTableRelationPopDep.getRequiredTenantId(),
							objDelTableRelationPopDep.getRequiredId() );
			}
		}
		ICFBamRelationObj objDelTableRelationCol;
		List<ICFBamRelationObj> arrDelTableRelationCol = schema.getRelationTableObj().readCachedRelationByRelTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamRelationObj> iterDelTableRelationCol = arrDelTableRelationCol.iterator();
		while( iterDelTableRelationCol.hasNext() ) {
			objDelTableRelationCol = iterDelTableRelationCol.next();
			if( objDelTableRelationCol != null ) {
						schema.getRelationColTableObj().deepDisposeRelationColByRelationIdx( objDelTableRelationCol.getRequiredTenantId(),
							objDelTableRelationCol.getRequiredId() );
			}
		}
					schema.getRelationTableObj().deepDisposeRelationByRelTableIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		ICFBamIndexObj objDelTableIndexRefRelFmCol;
		List<ICFBamIndexObj> arrDelTableIndexRefRelFmCol = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamIndexObj> iterDelTableIndexRefRelFmCol = arrDelTableIndexRefRelFmCol.iterator();
		while( iterDelTableIndexRefRelFmCol.hasNext() ) {
			objDelTableIndexRefRelFmCol = iterDelTableIndexRefRelFmCol.next();
			if( objDelTableIndexRefRelFmCol != null ) {
			ICFBamIndexColObj objColumns;
			List<ICFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objDelTableIndexRefRelFmCol.getRequiredTenantId(),
							objDelTableIndexRefRelFmCol.getRequiredId() );
			Iterator<ICFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByFromColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
		}
		ICFBamIndexObj objDelTableIndexRefRelToCol;
		List<ICFBamIndexObj> arrDelTableIndexRefRelToCol = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamIndexObj> iterDelTableIndexRefRelToCol = arrDelTableIndexRefRelToCol.iterator();
		while( iterDelTableIndexRefRelToCol.hasNext() ) {
			objDelTableIndexRefRelToCol = iterDelTableIndexRefRelToCol.next();
			if( objDelTableIndexRefRelToCol != null ) {
			ICFBamIndexColObj objColumns;
			List<ICFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objDelTableIndexRefRelToCol.getRequiredTenantId(),
							objDelTableIndexRefRelToCol.getRequiredId() );
			Iterator<ICFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByToColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
		}
		ICFBamIndexObj objDelTableIndexCol;
		List<ICFBamIndexObj> arrDelTableIndexCol = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamIndexObj> iterDelTableIndexCol = arrDelTableIndexCol.iterator();
		while( iterDelTableIndexCol.hasNext() ) {
			objDelTableIndexCol = iterDelTableIndexCol.next();
			if( objDelTableIndexCol != null ) {
						schema.getIndexColTableObj().deepDisposeIndexColByIndexIdx( objDelTableIndexCol.getRequiredTenantId(),
							objDelTableIndexCol.getRequiredId() );
			}
		}
					schema.getIndexTableObj().deepDisposeIndexByIdxTableIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		ICFBamValueObj objDelTableRefIndexColumns;
		List<ICFBamValueObj> arrDelTableRefIndexColumns = schema.getValueTableObj().readCachedValueByScopeIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<ICFBamValueObj> iterDelTableRefIndexColumns = arrDelTableRefIndexColumns.iterator();
		while( iterDelTableRefIndexColumns.hasNext() ) {
			objDelTableRefIndexColumns = iterDelTableRefIndexColumns.next();
			if( objDelTableRefIndexColumns != null ) {
						schema.getIndexColTableObj().deepDisposeIndexColByColIdx( objDelTableRefIndexColumns.getRequiredTenantId(),
							objDelTableRefIndexColumns.getRequiredId() );
			}
		}
					schema.getValueTableObj().deepDisposeValueByScopeIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getId64GenTableObj().deepDisposeId64GenByDispIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getId32GenTableObj().deepDisposeId32GenByDispIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getId16GenTableObj().deepDisposeId16GenByDispIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexBySchemaDefIdx != null ) {
			if( indexBySchemaDefIdx.containsKey( keySchemaDefIdx ) ) {
				indexBySchemaDefIdx.get( keySchemaDefIdx ).remove( pkey );
				if( indexBySchemaDefIdx.get( keySchemaDefIdx ).size() <= 0 ) {
					indexBySchemaDefIdx.remove( keySchemaDefIdx );
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

		if( indexBySchemaCodeVisIdx != null ) {
			if( indexBySchemaCodeVisIdx.containsKey( keySchemaCodeVisIdx ) ) {
				indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx ).remove( pkey );
				if( indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx ).size() <= 0 ) {
					indexBySchemaCodeVisIdx.remove( keySchemaCodeVisIdx );
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

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexBySchemaCdIdx != null ) {
			indexBySchemaCdIdx.remove( keySchemaCdIdx );
		}

		if( indexByPrimaryIndexIdx != null ) {
			if( indexByPrimaryIndexIdx.containsKey( keyPrimaryIndexIdx ) ) {
				indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx ).remove( pkey );
				if( indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx ).size() <= 0 ) {
					indexByPrimaryIndexIdx.remove( keyPrimaryIndexIdx );
				}
			}
		}

		if( indexByLookupIndexIdx != null ) {
			if( indexByLookupIndexIdx.containsKey( keyLookupIndexIdx ) ) {
				indexByLookupIndexIdx.get( keyLookupIndexIdx ).remove( pkey );
				if( indexByLookupIndexIdx.get( keyLookupIndexIdx ).size() <= 0 ) {
					indexByLookupIndexIdx.remove( keyLookupIndexIdx );
				}
			}
		}

		if( indexByAltIndexIdx != null ) {
			if( indexByAltIndexIdx.containsKey( keyAltIndexIdx ) ) {
				indexByAltIndexIdx.get( keyAltIndexIdx ).remove( pkey );
				if( indexByAltIndexIdx.get( keyAltIndexIdx ).size() <= 0 ) {
					indexByAltIndexIdx.remove( keyAltIndexIdx );
				}
			}
		}

		if( indexByQualTableIdx != null ) {
			if( indexByQualTableIdx.containsKey( keyQualTableIdx ) ) {
				indexByQualTableIdx.get( keyQualTableIdx ).remove( pkey );
				if( indexByQualTableIdx.get( keyQualTableIdx ).size() <= 0 ) {
					indexByQualTableIdx.remove( keyQualTableIdx );
				}
			}
		}


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeTable( CFBamScopePKey pkey ) {
		ICFBamTableObj obj = readCachedTable( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamTableObj lockTable( CFBamScopePKey pkey ) {
		ICFBamTableObj locked = null;
		CFBamTableBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableTable().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamTableObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockTable", pkey );
		}
		return( locked );
	}

	public List<ICFBamTableObj> readAllTable() {
		return( readAllTable( false ) );
	}

	public List<ICFBamTableObj> readAllTable( boolean forceRead ) {
		final String S_ProcName = "readAllTable";
		if( ( allTable == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamTableObj> map = new HashMap<CFBamScopePKey,ICFBamTableObj>();
			allTable = map;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readAllDerived( schema.getAuthorization() );
			CFBamTableBuff buff;
			ICFBamTableObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
			}
		}
		int len = allTable.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = allTable.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readCachedAllTable() {
		final String S_ProcName = "readCachedAllTable";
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( allTable != null ) {
			int len = allTable.size();
			ICFBamTableObj arr[] = new ICFBamTableObj[len];
			Iterator<ICFBamTableObj> valIter = allTable.values().iterator();
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
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public ICFBamTableObj readTableByIdIdx( long TenantId,
		long Id )
	{
		return( readTableByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamTableObj readTableByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamTableObj obj = readTable( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamTableObj> readTableByTenantIdx( long TenantId )
	{
		return( readTableByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamTableObj> readTableByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId )
	{
		return( readTableBySchemaDefIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<ICFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableBySchemaDefIdx";
		CFBamTableBySchemaDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexBySchemaDefIdx == null ) {
			indexBySchemaDefIdx = new HashMap< CFBamTableBySchemaDefIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaDefIdx.containsKey( key ) ) {
			dict = indexBySchemaDefIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedBySchemaDefIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaDefIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readTableByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<ICFBamTableObj> readTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByCodeVisIdx";
		CFBamTableByCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< CFBamTableByCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readTableBySchemaCodeVisIdx( TenantId,
			SchemaDefId,
			CodeVis,
			false ) );
	}

	public List<ICFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readTableBySchemaCodeVisIdx";
		CFBamTableBySchemaCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexBySchemaCodeVisIdx == null ) {
			indexBySchemaCodeVisIdx = new HashMap< CFBamTableBySchemaCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaCodeVisIdx.containsKey( key ) ) {
			dict = indexBySchemaCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedBySchemaCodeVisIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				CodeVis );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readTableByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByDefSchemaIdx";
		CFBamTableByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamTableByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamTableObj readTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name )
	{
		return( readTableByUNameIdx( TenantId,
			SchemaDefId,
			Name,
			false ) );
	}

	public ICFBamTableObj readTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamTableByUNameIdxKey,
				ICFBamTableObj >();
		}
		CFBamTableByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredName( Name );
		ICFBamTableObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamTableBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				Name );
			if( buff != null ) {
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamTableObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamTableObj readTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		return( readTableBySchemaCdIdx( TenantId,
			SchemaDefId,
			TableClassCode,
			false ) );
	}

	public ICFBamTableObj readTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode, boolean forceRead )
	{
		if( indexBySchemaCdIdx == null ) {
			indexBySchemaCdIdx = new HashMap< CFBamTableBySchemaCdIdxKey,
				ICFBamTableObj >();
		}
		CFBamTableBySchemaCdIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredTableClassCode( TableClassCode );
		ICFBamTableObj obj = null;
		if( ( ! forceRead ) && indexBySchemaCdIdx.containsKey( key ) ) {
			obj = indexBySchemaCdIdx.get( key );
		}
		else {
			CFBamTableBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedBySchemaCdIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				TableClassCode );
			if( buff != null ) {
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamTableObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		return( readTableByPrimaryIndexIdx( PrimaryIndexTenantId,
			PrimaryIndexId,
			false ) );
	}

	public List<ICFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByPrimaryIndexIdx";
		CFBamTableByPrimaryIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( PrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( PrimaryIndexId );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexByPrimaryIndexIdx == null ) {
			indexByPrimaryIndexIdx = new HashMap< CFBamTableByPrimaryIndexIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByPrimaryIndexIdx.containsKey( key ) ) {
			dict = indexByPrimaryIndexIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByPrimaryIndexIdx( schema.getAuthorization(),
				PrimaryIndexTenantId,
				PrimaryIndexId );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrimaryIndexIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		return( readTableByLookupIndexIdx( LookupIndexTenantId,
			LookupIndexId,
			false ) );
	}

	public List<ICFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByLookupIndexIdx";
		CFBamTableByLookupIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( LookupIndexTenantId );
		key.setOptionalLookupIndexId( LookupIndexId );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexByLookupIndexIdx == null ) {
			indexByLookupIndexIdx = new HashMap< CFBamTableByLookupIndexIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByLookupIndexIdx.containsKey( key ) ) {
			dict = indexByLookupIndexIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByLookupIndexIdx( schema.getAuthorization(),
				LookupIndexTenantId,
				LookupIndexId );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLookupIndexIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId )
	{
		return( readTableByAltIndexIdx( AltIndexTenantId,
			AltIndexId,
			false ) );
	}

	public List<ICFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByAltIndexIdx";
		CFBamTableByAltIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( AltIndexTenantId );
		key.setOptionalAltIndexId( AltIndexId );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexByAltIndexIdx == null ) {
			indexByAltIndexIdx = new HashMap< CFBamTableByAltIndexIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByAltIndexIdx.containsKey( key ) ) {
			dict = indexByAltIndexIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByAltIndexIdx( schema.getAuthorization(),
				AltIndexTenantId,
				AltIndexId );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByAltIndexIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		return( readTableByQualTableIdx( QualifyingTenantId,
			QualifyingTableId,
			false ) );
	}

	public List<ICFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByQualTableIdx";
		CFBamTableByQualTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( QualifyingTenantId );
		key.setOptionalQualifyingTableId( QualifyingTableId );
		Map<CFBamScopePKey, ICFBamTableObj> dict;
		if( indexByQualTableIdx == null ) {
			indexByQualTableIdx = new HashMap< CFBamTableByQualTableIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByQualTableIdx.containsKey( key ) ) {
			dict = indexByQualTableIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamTableObj>();
			ICFBamTableObj obj;
			CFBamTableBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByQualTableIdx( schema.getAuthorization(),
				QualifyingTenantId,
				QualifyingTableId );
			CFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamTableObj realised = (ICFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByQualTableIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamTableObj arr[] = new ICFBamTableObj[len];
		Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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
		List<ICFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamTableObj readCachedTableByIdIdx( long TenantId,
		long Id )
	{
		ICFBamTableObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTable( pkey );
		return( obj );
	}

	public List<ICFBamTableObj> readCachedTableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTableByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public List<ICFBamTableObj> readCachedTableBySchemaDefIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedTableBySchemaDefIdx";
		CFBamTableBySchemaDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexBySchemaDefIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexBySchemaDefIdx.containsKey( key ) ) {
				dict = indexBySchemaDefIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public List<ICFBamTableObj> readCachedTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedTableByCodeVisIdx";
		CFBamTableByCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexByCodeVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public List<ICFBamTableObj> readCachedTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedTableBySchemaCodeVisIdx";
		CFBamTableBySchemaCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexBySchemaCodeVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexBySchemaCodeVisIdx.containsKey( key ) ) {
				dict = indexBySchemaCodeVisIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public List<ICFBamTableObj> readCachedTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedTableByDefSchemaIdx";
		CFBamTableByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public ICFBamTableObj readCachedTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name )
	{
		ICFBamTableObj obj = null;
		CFBamTableByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamTableObj> valIter = members.values().iterator();
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
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
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

	public ICFBamTableObj readCachedTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		ICFBamTableObj obj = null;
		CFBamTableBySchemaCdIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredTableClassCode( TableClassCode );
		if( indexBySchemaCdIdx != null ) {
			if( indexBySchemaCdIdx.containsKey( key ) ) {
				obj = indexBySchemaCdIdx.get( key );
			}
			else {
				Iterator<ICFBamTableObj> valIter = members.values().iterator();
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
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
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

	public List<ICFBamTableObj> readCachedTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		final String S_ProcName = "readCachedTableByPrimaryIndexIdx";
		CFBamTableByPrimaryIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( PrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( PrimaryIndexId );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexByPrimaryIndexIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexByPrimaryIndexIdx.containsKey( key ) ) {
				dict = indexByPrimaryIndexIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public List<ICFBamTableObj> readCachedTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		final String S_ProcName = "readCachedTableByLookupIndexIdx";
		CFBamTableByLookupIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( LookupIndexTenantId );
		key.setOptionalLookupIndexId( LookupIndexId );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexByLookupIndexIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexByLookupIndexIdx.containsKey( key ) ) {
				dict = indexByLookupIndexIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public List<ICFBamTableObj> readCachedTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId )
	{
		final String S_ProcName = "readCachedTableByAltIndexIdx";
		CFBamTableByAltIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( AltIndexTenantId );
		key.setOptionalAltIndexId( AltIndexId );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexByAltIndexIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexByAltIndexIdx.containsKey( key ) ) {
				dict = indexByAltIndexIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public List<ICFBamTableObj> readCachedTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		final String S_ProcName = "readCachedTableByQualTableIdx";
		CFBamTableByQualTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( QualifyingTenantId );
		key.setOptionalQualifyingTableId( QualifyingTableId );
		ArrayList<ICFBamTableObj> arrayList = new ArrayList<ICFBamTableObj>();
		if( indexByQualTableIdx != null ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict;
			if( indexByQualTableIdx.containsKey( key ) ) {
				dict = indexByQualTableIdx.get( key );
				int len = dict.size();
				ICFBamTableObj arr[] = new ICFBamTableObj[len];
				Iterator<ICFBamTableObj> valIter = dict.values().iterator();
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
			ICFBamTableObj obj;
			Iterator<ICFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamTableObj> cmp = new Comparator<ICFBamTableObj>() {
			public int compare( ICFBamTableObj lhs, ICFBamTableObj rhs ) {
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

	public void deepDisposeTableByIdIdx( long TenantId,
		long Id )
	{
		ICFBamTableObj obj = readCachedTableByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTableByTenantIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableBySchemaDefIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "deepDisposeTableBySchemaDefIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableBySchemaDefIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeTableByCodeVisIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeTableBySchemaCodeVisIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableBySchemaCodeVisIdx( TenantId,
				SchemaDefId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeTableByDefSchemaIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name )
	{
		ICFBamTableObj obj = readCachedTableByUNameIdx( TenantId,
				SchemaDefId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		ICFBamTableObj obj = readCachedTableBySchemaCdIdx( TenantId,
				SchemaDefId,
				TableClassCode );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		final String S_ProcName = "deepDisposeTableByPrimaryIndexIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableByPrimaryIndexIdx( PrimaryIndexTenantId,
				PrimaryIndexId );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		final String S_ProcName = "deepDisposeTableByLookupIndexIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableByLookupIndexIdx( LookupIndexTenantId,
				LookupIndexId );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId )
	{
		final String S_ProcName = "deepDisposeTableByAltIndexIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableByAltIndexIdx( AltIndexTenantId,
				AltIndexId );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		final String S_ProcName = "deepDisposeTableByQualTableIdx";
		ICFBamTableObj obj;
		List<ICFBamTableObj> arrayList = readCachedTableByQualTableIdx( QualifyingTenantId,
				QualifyingTableId );
		if( arrayList != null )  {
			Iterator<ICFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamTableObj updateTable( ICFBamTableObj Obj ) {
		ICFBamTableObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableTable().updateTable( schema.getAuthorization(),
			Obj.getTableBuff() );
		if( Obj.getClassCode().equals( "a807" ) ) {
			obj = (ICFBamTableObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteTable( ICFBamTableObj Obj ) {
		ICFBamTableObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTable( schema.getAuthorization(),
			obj.getTableBuff() );
		Obj.forget();
	}

	public void deleteTableByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamTableObj obj = readTable( pkey );
		if( obj != null ) {
			ICFBamTableEditObj editObj = (ICFBamTableEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamTableEditObj)obj.beginEdit();
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
		deepDisposeTableByIdIdx( TenantId,
				Id );
	}

	public void deleteTableByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTableByTenantIdx( TenantId );
	}

	public void deleteTableBySchemaDefIdx( long TenantId,
		long SchemaDefId )
	{
		CFBamTableBySchemaDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaDefIdx == null ) {
			indexBySchemaDefIdx = new HashMap< CFBamTableBySchemaDefIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexBySchemaDefIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexBySchemaDefIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaDefIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySchemaDefIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaDefIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeTableBySchemaDefIdx( TenantId,
				SchemaDefId );
	}

	public void deleteTableByCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamTableByCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< CFBamTableByCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexByCodeVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeTableByCodeVisIdx( CodeVis );
	}

	public void deleteTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamTableBySchemaCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredCodeVis( CodeVis );
		if( indexBySchemaCodeVisIdx == null ) {
			indexBySchemaCodeVisIdx = new HashMap< CFBamTableBySchemaCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexBySchemaCodeVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexBySchemaCodeVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCodeVisIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				CodeVis );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySchemaCodeVisIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCodeVisIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				CodeVis );
		}
		deepDisposeTableBySchemaCodeVisIdx( TenantId,
				SchemaDefId,
				CodeVis );
	}

	public void deleteTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamTableByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamTableByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeTableByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamTableByUNameIdxKey,
				ICFBamTableObj >();
		}
		CFBamTableByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredName( Name );
		ICFBamTableObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				Name );
		}
		deepDisposeTableByUNameIdx( TenantId,
				SchemaDefId,
				Name );
	}

	public void deleteTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		if( indexBySchemaCdIdx == null ) {
			indexBySchemaCdIdx = new HashMap< CFBamTableBySchemaCdIdxKey,
				ICFBamTableObj >();
		}
		CFBamTableBySchemaCdIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredTableClassCode( TableClassCode );
		ICFBamTableObj obj = null;
		if( indexBySchemaCdIdx.containsKey( key ) ) {
			obj = indexBySchemaCdIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCdIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				TableClassCode );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCdIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				TableClassCode );
		}
		deepDisposeTableBySchemaCdIdx( TenantId,
				SchemaDefId,
				TableClassCode );
	}

	public void deleteTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		CFBamTableByPrimaryIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( PrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( PrimaryIndexId );
		if( indexByPrimaryIndexIdx == null ) {
			indexByPrimaryIndexIdx = new HashMap< CFBamTableByPrimaryIndexIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexByPrimaryIndexIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexByPrimaryIndexIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByPrimaryIndexIdx( schema.getAuthorization(),
				PrimaryIndexTenantId,
				PrimaryIndexId );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPrimaryIndexIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByPrimaryIndexIdx( schema.getAuthorization(),
				PrimaryIndexTenantId,
				PrimaryIndexId );
		}
		deepDisposeTableByPrimaryIndexIdx( PrimaryIndexTenantId,
				PrimaryIndexId );
	}

	public void deleteTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		CFBamTableByLookupIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( LookupIndexTenantId );
		key.setOptionalLookupIndexId( LookupIndexId );
		if( indexByLookupIndexIdx == null ) {
			indexByLookupIndexIdx = new HashMap< CFBamTableByLookupIndexIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexByLookupIndexIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexByLookupIndexIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByLookupIndexIdx( schema.getAuthorization(),
				LookupIndexTenantId,
				LookupIndexId );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLookupIndexIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByLookupIndexIdx( schema.getAuthorization(),
				LookupIndexTenantId,
				LookupIndexId );
		}
		deepDisposeTableByLookupIndexIdx( LookupIndexTenantId,
				LookupIndexId );
	}

	public void deleteTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId )
	{
		CFBamTableByAltIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( AltIndexTenantId );
		key.setOptionalAltIndexId( AltIndexId );
		if( indexByAltIndexIdx == null ) {
			indexByAltIndexIdx = new HashMap< CFBamTableByAltIndexIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexByAltIndexIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexByAltIndexIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByAltIndexIdx( schema.getAuthorization(),
				AltIndexTenantId,
				AltIndexId );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByAltIndexIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByAltIndexIdx( schema.getAuthorization(),
				AltIndexTenantId,
				AltIndexId );
		}
		deepDisposeTableByAltIndexIdx( AltIndexTenantId,
				AltIndexId );
	}

	public void deleteTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		CFBamTableByQualTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( QualifyingTenantId );
		key.setOptionalQualifyingTableId( QualifyingTableId );
		if( indexByQualTableIdx == null ) {
			indexByQualTableIdx = new HashMap< CFBamTableByQualTableIdxKey,
				Map< CFBamScopePKey, ICFBamTableObj > >();
		}
		if( indexByQualTableIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamTableObj> dict = indexByQualTableIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByQualTableIdx( schema.getAuthorization(),
				QualifyingTenantId,
				QualifyingTableId );
			Iterator<ICFBamTableObj> iter = dict.values().iterator();
			ICFBamTableObj obj;
			List<ICFBamTableObj> toForget = new LinkedList<ICFBamTableObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByQualTableIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByQualTableIdx( schema.getAuthorization(),
				QualifyingTenantId,
				QualifyingTableId );
		}
		deepDisposeTableByQualTableIdx( QualifyingTenantId,
				QualifyingTableId );
	}
}
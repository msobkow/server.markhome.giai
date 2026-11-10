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

public class YCFBamTableTableObj
	implements IYCFBamTableTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamTableObj> members;
	private Map<YCFBamScopePKey, IYCFBamTableObj> allTable;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexByTenantIdx;
	private Map< YCFBamTableBySchemaDefIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexBySchemaDefIdx;
	private Map< YCFBamTableByCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexByCodeVisIdx;
	private Map< YCFBamTableBySchemaCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexBySchemaCodeVisIdx;
	private Map< YCFBamTableByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexByDefSchemaIdx;
	private Map< YCFBamTableByUNameIdxKey,
		IYCFBamTableObj > indexByUNameIdx;
	private Map< YCFBamTableBySchemaCdIdxKey,
		IYCFBamTableObj > indexBySchemaCdIdx;
	private Map< YCFBamTableByPrimaryIndexIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexByPrimaryIndexIdx;
	private Map< YCFBamTableByLookupIndexIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexByLookupIndexIdx;
	private Map< YCFBamTableByAltIndexIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexByAltIndexIdx;
	private Map< YCFBamTableByQualTableIdxKey,
		Map<YCFBamScopePKey, IYCFBamTableObj > > indexByQualTableIdx;
	public static String TABLE_NAME = "Table";
	public static String TABLE_DBNAME = "tbldef";

	public YCFBamTableTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
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

	public YCFBamTableTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
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
		List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
		IYCFBamTableObj cur = null;
		Iterator<IYCFBamTableObj> iter = members.values().iterator();
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
	 *	YCFBamTableObj.
	 */
	public IYCFBamTableObj newInstance() {
		IYCFBamTableObj inst = new YCFBamTableObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTableObj.
	 */
	public IYCFBamTableEditObj newEditInstance( IYCFBamTableObj orig ) {
		IYCFBamTableEditObj edit = new YCFBamTableEditObj( orig );
		return( edit );
	}

	public IYCFBamTableObj realiseTable( IYCFBamTableObj Obj ) {
		IYCFBamTableObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamTableObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamTableObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamTableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexBySchemaDefIdx != null ) {
				YCFBamTableBySchemaDefIdxKey keySchemaDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
				keySchemaDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaDefIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapSchemaDefIdx = indexBySchemaDefIdx.get( keySchemaDefIdx );
				if( mapSchemaDefIdx != null ) {
					mapSchemaDefIdx.remove( keepObj.getPKey() );
					if( mapSchemaDefIdx.size() <= 0 ) {
						indexBySchemaDefIdx.remove( keySchemaDefIdx );
					}
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamTableByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.remove( keepObj.getPKey() );
					if( mapCodeVisIdx.size() <= 0 ) {
						indexByCodeVisIdx.remove( keyCodeVisIdx );
					}
				}
			}

			if( indexBySchemaCodeVisIdx != null ) {
				YCFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
				keySchemaCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCodeVisIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapSchemaCodeVisIdx = indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
				if( mapSchemaCodeVisIdx != null ) {
					mapSchemaCodeVisIdx.remove( keepObj.getPKey() );
					if( mapSchemaCodeVisIdx.size() <= 0 ) {
						indexBySchemaCodeVisIdx.remove( keySchemaCodeVisIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTableByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamTableByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexBySchemaCdIdx != null ) {
				YCFBamTableBySchemaCdIdxKey keySchemaCdIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
				keySchemaCdIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCdIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCdIdx.setRequiredTableClassCode( keepObj.getRequiredTableClassCode() );
				indexBySchemaCdIdx.remove( keySchemaCdIdx );
			}

			if( indexByPrimaryIndexIdx != null ) {
				YCFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
				keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( keepObj.getOptionalPrimaryIndexTenantId() );
				keyPrimaryIndexIdx.setOptionalPrimaryIndexId( keepObj.getOptionalPrimaryIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapPrimaryIndexIdx = indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
				if( mapPrimaryIndexIdx != null ) {
					mapPrimaryIndexIdx.remove( keepObj.getPKey() );
					if( mapPrimaryIndexIdx.size() <= 0 ) {
						indexByPrimaryIndexIdx.remove( keyPrimaryIndexIdx );
					}
				}
			}

			if( indexByLookupIndexIdx != null ) {
				YCFBamTableByLookupIndexIdxKey keyLookupIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
				keyLookupIndexIdx.setOptionalLookupIndexTenantId( keepObj.getOptionalLookupIndexTenantId() );
				keyLookupIndexIdx.setOptionalLookupIndexId( keepObj.getOptionalLookupIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapLookupIndexIdx = indexByLookupIndexIdx.get( keyLookupIndexIdx );
				if( mapLookupIndexIdx != null ) {
					mapLookupIndexIdx.remove( keepObj.getPKey() );
					if( mapLookupIndexIdx.size() <= 0 ) {
						indexByLookupIndexIdx.remove( keyLookupIndexIdx );
					}
				}
			}

			if( indexByAltIndexIdx != null ) {
				YCFBamTableByAltIndexIdxKey keyAltIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
				keyAltIndexIdx.setOptionalAltIndexTenantId( keepObj.getOptionalAltIndexTenantId() );
				keyAltIndexIdx.setOptionalAltIndexId( keepObj.getOptionalAltIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapAltIndexIdx = indexByAltIndexIdx.get( keyAltIndexIdx );
				if( mapAltIndexIdx != null ) {
					mapAltIndexIdx.remove( keepObj.getPKey() );
					if( mapAltIndexIdx.size() <= 0 ) {
						indexByAltIndexIdx.remove( keyAltIndexIdx );
					}
				}
			}

			if( indexByQualTableIdx != null ) {
				YCFBamTableByQualTableIdxKey keyQualTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
				keyQualTableIdx.setOptionalQualifyingTenantId( keepObj.getOptionalQualifyingTenantId() );
				keyQualTableIdx.setOptionalQualifyingTableId( keepObj.getOptionalQualifyingTableId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapQualTableIdx = indexByQualTableIdx.get( keyQualTableIdx );
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
			keepObj = (IYCFBamTableObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaDefIdx != null ) {
				YCFBamTableBySchemaDefIdxKey keySchemaDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
				keySchemaDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaDefIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapSchemaDefIdx = indexBySchemaDefIdx.get( keySchemaDefIdx );
				if( mapSchemaDefIdx != null ) {
					mapSchemaDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamTableByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaCodeVisIdx != null ) {
				YCFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
				keySchemaCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCodeVisIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapSchemaCodeVisIdx = indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
				if( mapSchemaCodeVisIdx != null ) {
					mapSchemaCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTableByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamTableByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexBySchemaCdIdx != null ) {
				YCFBamTableBySchemaCdIdxKey keySchemaCdIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
				keySchemaCdIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCdIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCdIdx.setRequiredTableClassCode( keepObj.getRequiredTableClassCode() );
				indexBySchemaCdIdx.put( keySchemaCdIdx, keepObj );
			}

			if( indexByPrimaryIndexIdx != null ) {
				YCFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
				keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( keepObj.getOptionalPrimaryIndexTenantId() );
				keyPrimaryIndexIdx.setOptionalPrimaryIndexId( keepObj.getOptionalPrimaryIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapPrimaryIndexIdx = indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
				if( mapPrimaryIndexIdx != null ) {
					mapPrimaryIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLookupIndexIdx != null ) {
				YCFBamTableByLookupIndexIdxKey keyLookupIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
				keyLookupIndexIdx.setOptionalLookupIndexTenantId( keepObj.getOptionalLookupIndexTenantId() );
				keyLookupIndexIdx.setOptionalLookupIndexId( keepObj.getOptionalLookupIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapLookupIndexIdx = indexByLookupIndexIdx.get( keyLookupIndexIdx );
				if( mapLookupIndexIdx != null ) {
					mapLookupIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIndexIdx != null ) {
				YCFBamTableByAltIndexIdxKey keyAltIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
				keyAltIndexIdx.setOptionalAltIndexTenantId( keepObj.getOptionalAltIndexTenantId() );
				keyAltIndexIdx.setOptionalAltIndexId( keepObj.getOptionalAltIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapAltIndexIdx = indexByAltIndexIdx.get( keyAltIndexIdx );
				if( mapAltIndexIdx != null ) {
					mapAltIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByQualTableIdx != null ) {
				YCFBamTableByQualTableIdxKey keyQualTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
				keyQualTableIdx.setOptionalQualifyingTenantId( keepObj.getOptionalQualifyingTenantId() );
				keyQualTableIdx.setOptionalQualifyingTableId( keepObj.getOptionalQualifyingTableId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapQualTableIdx = indexByQualTableIdx.get( keyQualTableIdx );
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
			keepObj = (IYCFBamTableObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTable != null ) {
				allTable.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaDefIdx != null ) {
				YCFBamTableBySchemaDefIdxKey keySchemaDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
				keySchemaDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaDefIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapSchemaDefIdx = indexBySchemaDefIdx.get( keySchemaDefIdx );
				if( mapSchemaDefIdx != null ) {
					mapSchemaDefIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamTableByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaCodeVisIdx != null ) {
				YCFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
				keySchemaCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCodeVisIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapSchemaCodeVisIdx = indexBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
				if( mapSchemaCodeVisIdx != null ) {
					mapSchemaCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTableByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamTableByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexBySchemaCdIdx != null ) {
				YCFBamTableBySchemaCdIdxKey keySchemaCdIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
				keySchemaCdIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaCdIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				keySchemaCdIdx.setRequiredTableClassCode( keepObj.getRequiredTableClassCode() );
				indexBySchemaCdIdx.put( keySchemaCdIdx, keepObj );
			}

			if( indexByPrimaryIndexIdx != null ) {
				YCFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
				keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( keepObj.getOptionalPrimaryIndexTenantId() );
				keyPrimaryIndexIdx.setOptionalPrimaryIndexId( keepObj.getOptionalPrimaryIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapPrimaryIndexIdx = indexByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
				if( mapPrimaryIndexIdx != null ) {
					mapPrimaryIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLookupIndexIdx != null ) {
				YCFBamTableByLookupIndexIdxKey keyLookupIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
				keyLookupIndexIdx.setOptionalLookupIndexTenantId( keepObj.getOptionalLookupIndexTenantId() );
				keyLookupIndexIdx.setOptionalLookupIndexId( keepObj.getOptionalLookupIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapLookupIndexIdx = indexByLookupIndexIdx.get( keyLookupIndexIdx );
				if( mapLookupIndexIdx != null ) {
					mapLookupIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIndexIdx != null ) {
				YCFBamTableByAltIndexIdxKey keyAltIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
				keyAltIndexIdx.setOptionalAltIndexTenantId( keepObj.getOptionalAltIndexTenantId() );
				keyAltIndexIdx.setOptionalAltIndexId( keepObj.getOptionalAltIndexId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapAltIndexIdx = indexByAltIndexIdx.get( keyAltIndexIdx );
				if( mapAltIndexIdx != null ) {
					mapAltIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByQualTableIdx != null ) {
				YCFBamTableByQualTableIdxKey keyQualTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
				keyQualTableIdx.setOptionalQualifyingTenantId( keepObj.getOptionalQualifyingTenantId() );
				keyQualTableIdx.setOptionalQualifyingTableId( keepObj.getOptionalQualifyingTableId() );
				Map<YCFBamScopePKey, IYCFBamTableObj > mapQualTableIdx = indexByQualTableIdx.get( keyQualTableIdx );
				if( mapQualTableIdx != null ) {
					mapQualTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamTableObj createTable( IYCFBamTableObj Obj ) {
		IYCFBamTableObj obj = Obj;
		YCFBamTableBuff buff = obj.getTableBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTable().createTable(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a807" ) ) {
			obj = (IYCFBamTableObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamTableObj readTable( YCFBamScopePKey pkey ) {
		return( readTable( pkey, false ) );
	}

	public IYCFBamTableObj readTable( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamTableObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamTableBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamTableObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamTableObj readCachedTable( YCFBamScopePKey pkey ) {
		IYCFBamTableObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTable( IYCFBamTableObj obj )
	{
		final String S_ProcName = "YCFBamTableTableObj.reallyDeepDisposeTable() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamTableObj existing = readCachedTable( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamTableBySchemaDefIdxKey keySchemaDefIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		keySchemaDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaDefIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		YCFBamTableByCodeVisIdxKey keyCodeVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		keySchemaCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaCodeVisIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchemaCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamTableByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamTableByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTableBySchemaCdIdxKey keySchemaCdIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		keySchemaCdIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaCdIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchemaCdIdx.setRequiredTableClassCode( existing.getRequiredTableClassCode() );

		YCFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( existing.getOptionalPrimaryIndexTenantId() );
		keyPrimaryIndexIdx.setOptionalPrimaryIndexId( existing.getOptionalPrimaryIndexId() );

		YCFBamTableByLookupIndexIdxKey keyLookupIndexIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		keyLookupIndexIdx.setOptionalLookupIndexTenantId( existing.getOptionalLookupIndexTenantId() );
		keyLookupIndexIdx.setOptionalLookupIndexId( existing.getOptionalLookupIndexId() );

		YCFBamTableByAltIndexIdxKey keyAltIndexIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		keyAltIndexIdx.setOptionalAltIndexTenantId( existing.getOptionalAltIndexTenantId() );
		keyAltIndexIdx.setOptionalAltIndexId( existing.getOptionalAltIndexId() );

		YCFBamTableByQualTableIdxKey keyQualTableIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
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
		IYCFBamRelationObj objDelTableRelationPopDep;
		List<IYCFBamRelationObj> arrDelTableRelationPopDep = schema.getRelationTableObj().readCachedRelationByRelTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamRelationObj> iterDelTableRelationPopDep = arrDelTableRelationPopDep.iterator();
		while( iterDelTableRelationPopDep.hasNext() ) {
			objDelTableRelationPopDep = iterDelTableRelationPopDep.next();
			if( objDelTableRelationPopDep != null ) {
						schema.getPopTopDepTableObj().deepDisposePopTopDepByContRelIdx( objDelTableRelationPopDep.getRequiredTenantId(),
							objDelTableRelationPopDep.getRequiredId() );
			}
		}
		IYCFBamRelationObj objDelTableRelationCol;
		List<IYCFBamRelationObj> arrDelTableRelationCol = schema.getRelationTableObj().readCachedRelationByRelTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamRelationObj> iterDelTableRelationCol = arrDelTableRelationCol.iterator();
		while( iterDelTableRelationCol.hasNext() ) {
			objDelTableRelationCol = iterDelTableRelationCol.next();
			if( objDelTableRelationCol != null ) {
						schema.getRelationColTableObj().deepDisposeRelationColByRelationIdx( objDelTableRelationCol.getRequiredTenantId(),
							objDelTableRelationCol.getRequiredId() );
			}
		}
					schema.getRelationTableObj().deepDisposeRelationByRelTableIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		IYCFBamIndexObj objDelTableIndexRefRelFmCol;
		List<IYCFBamIndexObj> arrDelTableIndexRefRelFmCol = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamIndexObj> iterDelTableIndexRefRelFmCol = arrDelTableIndexRefRelFmCol.iterator();
		while( iterDelTableIndexRefRelFmCol.hasNext() ) {
			objDelTableIndexRefRelFmCol = iterDelTableIndexRefRelFmCol.next();
			if( objDelTableIndexRefRelFmCol != null ) {
			IYCFBamIndexColObj objColumns;
			List<IYCFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objDelTableIndexRefRelFmCol.getRequiredTenantId(),
							objDelTableIndexRefRelFmCol.getRequiredId() );
			Iterator<IYCFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByFromColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
		}
		IYCFBamIndexObj objDelTableIndexRefRelToCol;
		List<IYCFBamIndexObj> arrDelTableIndexRefRelToCol = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamIndexObj> iterDelTableIndexRefRelToCol = arrDelTableIndexRefRelToCol.iterator();
		while( iterDelTableIndexRefRelToCol.hasNext() ) {
			objDelTableIndexRefRelToCol = iterDelTableIndexRefRelToCol.next();
			if( objDelTableIndexRefRelToCol != null ) {
			IYCFBamIndexColObj objColumns;
			List<IYCFBamIndexColObj> arrColumns = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( objDelTableIndexRefRelToCol.getRequiredTenantId(),
							objDelTableIndexRefRelToCol.getRequiredId() );
			Iterator<IYCFBamIndexColObj> iterColumns = arrColumns.iterator();
			while( iterColumns.hasNext() ) {
				objColumns = iterColumns.next();
					schema.getRelationColTableObj().deepDisposeRelationColByToColIdx( objColumns.getRequiredTenantId(),
							objColumns.getRequiredId() );
			}
			}
		}
		IYCFBamIndexObj objDelTableIndexCol;
		List<IYCFBamIndexObj> arrDelTableIndexCol = schema.getIndexTableObj().readCachedIndexByIdxTableIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamIndexObj> iterDelTableIndexCol = arrDelTableIndexCol.iterator();
		while( iterDelTableIndexCol.hasNext() ) {
			objDelTableIndexCol = iterDelTableIndexCol.next();
			if( objDelTableIndexCol != null ) {
						schema.getIndexColTableObj().deepDisposeIndexColByIndexIdx( objDelTableIndexCol.getRequiredTenantId(),
							objDelTableIndexCol.getRequiredId() );
			}
		}
					schema.getIndexTableObj().deepDisposeIndexByIdxTableIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );
		IYCFBamValueObj objDelTableRefIndexColumns;
		List<IYCFBamValueObj> arrDelTableRefIndexColumns = schema.getValueTableObj().readCachedValueByScopeIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamValueObj> iterDelTableRefIndexColumns = arrDelTableRefIndexColumns.iterator();
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
	public void deepDisposeTable( YCFBamScopePKey pkey ) {
		IYCFBamTableObj obj = readCachedTable( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamTableObj lockTable( YCFBamScopePKey pkey ) {
		IYCFBamTableObj locked = null;
		YCFBamTableBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamTableObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTable", pkey );
		}
		return( locked );
	}

	public List<IYCFBamTableObj> readAllTable() {
		return( readAllTable( false ) );
	}

	public List<IYCFBamTableObj> readAllTable( boolean forceRead ) {
		final String S_ProcName = "readAllTable";
		if( ( allTable == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> map = new HashMap<YCFBamScopePKey,IYCFBamTableObj>();
			allTable = map;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readAllDerived( schema.getAuthorization() );
			YCFBamTableBuff buff;
			IYCFBamTableObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
			}
		}
		int len = allTable.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = allTable.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readCachedAllTable() {
		final String S_ProcName = "readCachedAllTable";
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( allTable != null ) {
			int len = allTable.size();
			IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
			Iterator<IYCFBamTableObj> valIter = allTable.values().iterator();
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
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public IYCFBamTableObj readTableByIdIdx( long TenantId,
		long Id )
	{
		return( readTableByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamTableObj readTableByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTableObj obj = readTable( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamTableObj> readTableByTenantIdx( long TenantId )
	{
		return( readTableByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamTableObj> readTableByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId )
	{
		return( readTableBySchemaDefIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<IYCFBamTableObj> readTableBySchemaDefIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableBySchemaDefIdx";
		YCFBamTableBySchemaDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexBySchemaDefIdx == null ) {
			indexBySchemaDefIdx = new HashMap< YCFBamTableBySchemaDefIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaDefIdx.containsKey( key ) ) {
			dict = indexBySchemaDefIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedBySchemaDefIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaDefIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readTableByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamTableObj> readTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByCodeVisIdx";
		YCFBamTableByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamTableByCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readTableBySchemaCodeVisIdx( TenantId,
			SchemaDefId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamTableObj> readTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readTableBySchemaCodeVisIdx";
		YCFBamTableBySchemaCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexBySchemaCodeVisIdx == null ) {
			indexBySchemaCodeVisIdx = new HashMap< YCFBamTableBySchemaCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaCodeVisIdx.containsKey( key ) ) {
			dict = indexBySchemaCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedBySchemaCodeVisIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				CodeVis );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readTableByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamTableObj> readTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByDefSchemaIdx";
		YCFBamTableByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTableByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamTableObj readTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name )
	{
		return( readTableByUNameIdx( TenantId,
			SchemaDefId,
			Name,
			false ) );
	}

	public IYCFBamTableObj readTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTableByUNameIdxKey,
				IYCFBamTableObj >();
		}
		YCFBamTableByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredName( Name );
		IYCFBamTableObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamTableBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamTableObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamTableObj readTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		return( readTableBySchemaCdIdx( TenantId,
			SchemaDefId,
			TableClassCode,
			false ) );
	}

	public IYCFBamTableObj readTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode, boolean forceRead )
	{
		if( indexBySchemaCdIdx == null ) {
			indexBySchemaCdIdx = new HashMap< YCFBamTableBySchemaCdIdxKey,
				IYCFBamTableObj >();
		}
		YCFBamTableBySchemaCdIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredTableClassCode( TableClassCode );
		IYCFBamTableObj obj = null;
		if( ( ! forceRead ) && indexBySchemaCdIdx.containsKey( key ) ) {
			obj = indexBySchemaCdIdx.get( key );
		}
		else {
			YCFBamTableBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedBySchemaCdIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				TableClassCode );
			if( buff != null ) {
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamTableObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		return( readTableByPrimaryIndexIdx( PrimaryIndexTenantId,
			PrimaryIndexId,
			false ) );
	}

	public List<IYCFBamTableObj> readTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByPrimaryIndexIdx";
		YCFBamTableByPrimaryIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( PrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( PrimaryIndexId );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexByPrimaryIndexIdx == null ) {
			indexByPrimaryIndexIdx = new HashMap< YCFBamTableByPrimaryIndexIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByPrimaryIndexIdx.containsKey( key ) ) {
			dict = indexByPrimaryIndexIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByPrimaryIndexIdx( schema.getAuthorization(),
				PrimaryIndexTenantId,
				PrimaryIndexId );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrimaryIndexIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		return( readTableByLookupIndexIdx( LookupIndexTenantId,
			LookupIndexId,
			false ) );
	}

	public List<IYCFBamTableObj> readTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByLookupIndexIdx";
		YCFBamTableByLookupIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( LookupIndexTenantId );
		key.setOptionalLookupIndexId( LookupIndexId );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexByLookupIndexIdx == null ) {
			indexByLookupIndexIdx = new HashMap< YCFBamTableByLookupIndexIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByLookupIndexIdx.containsKey( key ) ) {
			dict = indexByLookupIndexIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByLookupIndexIdx( schema.getAuthorization(),
				LookupIndexTenantId,
				LookupIndexId );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLookupIndexIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId )
	{
		return( readTableByAltIndexIdx( AltIndexTenantId,
			AltIndexId,
			false ) );
	}

	public List<IYCFBamTableObj> readTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByAltIndexIdx";
		YCFBamTableByAltIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( AltIndexTenantId );
		key.setOptionalAltIndexId( AltIndexId );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexByAltIndexIdx == null ) {
			indexByAltIndexIdx = new HashMap< YCFBamTableByAltIndexIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByAltIndexIdx.containsKey( key ) ) {
			dict = indexByAltIndexIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByAltIndexIdx( schema.getAuthorization(),
				AltIndexTenantId,
				AltIndexId );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByAltIndexIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		return( readTableByQualTableIdx( QualifyingTenantId,
			QualifyingTableId,
			false ) );
	}

	public List<IYCFBamTableObj> readTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableByQualTableIdx";
		YCFBamTableByQualTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( QualifyingTenantId );
		key.setOptionalQualifyingTableId( QualifyingTableId );
		Map<YCFBamScopePKey, IYCFBamTableObj> dict;
		if( indexByQualTableIdx == null ) {
			indexByQualTableIdx = new HashMap< YCFBamTableByQualTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( ( ! forceRead ) && indexByQualTableIdx.containsKey( key ) ) {
			dict = indexByQualTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamTableObj>();
			IYCFBamTableObj obj;
			YCFBamTableBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTable().readDerivedByQualTableIdx( schema.getAuthorization(),
				QualifyingTenantId,
				QualifyingTableId );
			YCFBamTableBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableObj realised = (IYCFBamTableObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByQualTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
		Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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
		List<IYCFBamTableObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamTableObj readCachedTableByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTableObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTable( pkey );
		return( obj );
	}

	public List<IYCFBamTableObj> readCachedTableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTableByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public List<IYCFBamTableObj> readCachedTableBySchemaDefIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedTableBySchemaDefIdx";
		YCFBamTableBySchemaDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexBySchemaDefIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexBySchemaDefIdx.containsKey( key ) ) {
				dict = indexBySchemaDefIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public List<IYCFBamTableObj> readCachedTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedTableByCodeVisIdx";
		YCFBamTableByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public List<IYCFBamTableObj> readCachedTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedTableBySchemaCodeVisIdx";
		YCFBamTableBySchemaCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexBySchemaCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexBySchemaCodeVisIdx.containsKey( key ) ) {
				dict = indexBySchemaCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public List<IYCFBamTableObj> readCachedTableByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedTableByDefSchemaIdx";
		YCFBamTableByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public IYCFBamTableObj readCachedTableByUNameIdx( long TenantId,
		long SchemaDefId,
		String Name )
	{
		IYCFBamTableObj obj = null;
		YCFBamTableByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamTableObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
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

	public IYCFBamTableObj readCachedTableBySchemaCdIdx( long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		IYCFBamTableObj obj = null;
		YCFBamTableBySchemaCdIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredTableClassCode( TableClassCode );
		if( indexBySchemaCdIdx != null ) {
			if( indexBySchemaCdIdx.containsKey( key ) ) {
				obj = indexBySchemaCdIdx.get( key );
			}
			else {
				Iterator<IYCFBamTableObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
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

	public List<IYCFBamTableObj> readCachedTableByPrimaryIndexIdx( Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		final String S_ProcName = "readCachedTableByPrimaryIndexIdx";
		YCFBamTableByPrimaryIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( PrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( PrimaryIndexId );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexByPrimaryIndexIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexByPrimaryIndexIdx.containsKey( key ) ) {
				dict = indexByPrimaryIndexIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public List<IYCFBamTableObj> readCachedTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		final String S_ProcName = "readCachedTableByLookupIndexIdx";
		YCFBamTableByLookupIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( LookupIndexTenantId );
		key.setOptionalLookupIndexId( LookupIndexId );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexByLookupIndexIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexByLookupIndexIdx.containsKey( key ) ) {
				dict = indexByLookupIndexIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public List<IYCFBamTableObj> readCachedTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId )
	{
		final String S_ProcName = "readCachedTableByAltIndexIdx";
		YCFBamTableByAltIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( AltIndexTenantId );
		key.setOptionalAltIndexId( AltIndexId );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexByAltIndexIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexByAltIndexIdx.containsKey( key ) ) {
				dict = indexByAltIndexIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public List<IYCFBamTableObj> readCachedTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		final String S_ProcName = "readCachedTableByQualTableIdx";
		YCFBamTableByQualTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( QualifyingTenantId );
		key.setOptionalQualifyingTableId( QualifyingTableId );
		ArrayList<IYCFBamTableObj> arrayList = new ArrayList<IYCFBamTableObj>();
		if( indexByQualTableIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict;
			if( indexByQualTableIdx.containsKey( key ) ) {
				dict = indexByQualTableIdx.get( key );
				int len = dict.size();
				IYCFBamTableObj arr[] = new IYCFBamTableObj[len];
				Iterator<IYCFBamTableObj> valIter = dict.values().iterator();
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
			IYCFBamTableObj obj;
			Iterator<IYCFBamTableObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableObj> cmp = new Comparator<IYCFBamTableObj>() {
			public int compare( IYCFBamTableObj lhs, IYCFBamTableObj rhs ) {
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

	public void deepDisposeTableByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTableObj obj = readCachedTableByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTableByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTableByTenantIdx";
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
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
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableBySchemaDefIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeTableByCodeVisIdx";
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
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
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeTableBySchemaCodeVisIdx";
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableBySchemaCodeVisIdx( TenantId,
				SchemaDefId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
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
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
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
		IYCFBamTableObj obj = readCachedTableByUNameIdx( TenantId,
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
		IYCFBamTableObj obj = readCachedTableBySchemaCdIdx( TenantId,
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
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableByPrimaryIndexIdx( PrimaryIndexTenantId,
				PrimaryIndexId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
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
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableByLookupIndexIdx( LookupIndexTenantId,
				LookupIndexId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
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
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableByAltIndexIdx( AltIndexTenantId,
				AltIndexId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
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
		IYCFBamTableObj obj;
		List<IYCFBamTableObj> arrayList = readCachedTableByQualTableIdx( QualifyingTenantId,
				QualifyingTableId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamTableObj updateTable( IYCFBamTableObj Obj ) {
		IYCFBamTableObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTable().updateTable( schema.getAuthorization(),
			Obj.getTableBuff() );
		if( Obj.getClassCode().equals( "a807" ) ) {
			obj = (IYCFBamTableObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteTable( IYCFBamTableObj Obj ) {
		IYCFBamTableObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTable( schema.getAuthorization(),
			obj.getTableBuff() );
		Obj.forget();
	}

	public void deleteTableByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTableObj obj = readTable( pkey );
		if( obj != null ) {
			IYCFBamTableEditObj editObj = (IYCFBamTableEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamTableEditObj)obj.beginEdit();
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
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTableByTenantIdx( TenantId );
	}

	public void deleteTableBySchemaDefIdx( long TenantId,
		long SchemaDefId )
	{
		YCFBamTableBySchemaDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaDefIdx == null ) {
			indexBySchemaDefIdx = new HashMap< YCFBamTableBySchemaDefIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexBySchemaDefIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexBySchemaDefIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaDefIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaDefIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeTableBySchemaDefIdx( TenantId,
				SchemaDefId );
	}

	public void deleteTableByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamTableByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamTableByCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeTableByCodeVisIdx( CodeVis );
	}

	public void deleteTableBySchemaCodeVisIdx( long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamTableBySchemaCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredCodeVis( CodeVis );
		if( indexBySchemaCodeVisIdx == null ) {
			indexBySchemaCodeVisIdx = new HashMap< YCFBamTableBySchemaCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexBySchemaCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexBySchemaCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCodeVisIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				CodeVis );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCodeVisIdx( schema.getAuthorization(),
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
		YCFBamTableByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTableByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByDefSchemaIdx( schema.getAuthorization(),
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
			indexByUNameIdx = new HashMap< YCFBamTableByUNameIdxKey,
				IYCFBamTableObj >();
		}
		YCFBamTableByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredName( Name );
		IYCFBamTableObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByUNameIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByUNameIdx( schema.getAuthorization(),
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
			indexBySchemaCdIdx = new HashMap< YCFBamTableBySchemaCdIdxKey,
				IYCFBamTableObj >();
		}
		YCFBamTableBySchemaCdIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredTableClassCode( TableClassCode );
		IYCFBamTableObj obj = null;
		if( indexBySchemaCdIdx.containsKey( key ) ) {
			obj = indexBySchemaCdIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCdIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId,
				TableClassCode );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableBySchemaCdIdx( schema.getAuthorization(),
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
		YCFBamTableByPrimaryIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( PrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( PrimaryIndexId );
		if( indexByPrimaryIndexIdx == null ) {
			indexByPrimaryIndexIdx = new HashMap< YCFBamTableByPrimaryIndexIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexByPrimaryIndexIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexByPrimaryIndexIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByPrimaryIndexIdx( schema.getAuthorization(),
				PrimaryIndexTenantId,
				PrimaryIndexId );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByPrimaryIndexIdx( schema.getAuthorization(),
				PrimaryIndexTenantId,
				PrimaryIndexId );
		}
		deepDisposeTableByPrimaryIndexIdx( PrimaryIndexTenantId,
				PrimaryIndexId );
	}

	public void deleteTableByLookupIndexIdx( Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		YCFBamTableByLookupIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( LookupIndexTenantId );
		key.setOptionalLookupIndexId( LookupIndexId );
		if( indexByLookupIndexIdx == null ) {
			indexByLookupIndexIdx = new HashMap< YCFBamTableByLookupIndexIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexByLookupIndexIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexByLookupIndexIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByLookupIndexIdx( schema.getAuthorization(),
				LookupIndexTenantId,
				LookupIndexId );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByLookupIndexIdx( schema.getAuthorization(),
				LookupIndexTenantId,
				LookupIndexId );
		}
		deepDisposeTableByLookupIndexIdx( LookupIndexTenantId,
				LookupIndexId );
	}

	public void deleteTableByAltIndexIdx( Long AltIndexTenantId,
		Long AltIndexId )
	{
		YCFBamTableByAltIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( AltIndexTenantId );
		key.setOptionalAltIndexId( AltIndexId );
		if( indexByAltIndexIdx == null ) {
			indexByAltIndexIdx = new HashMap< YCFBamTableByAltIndexIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexByAltIndexIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexByAltIndexIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByAltIndexIdx( schema.getAuthorization(),
				AltIndexTenantId,
				AltIndexId );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByAltIndexIdx( schema.getAuthorization(),
				AltIndexTenantId,
				AltIndexId );
		}
		deepDisposeTableByAltIndexIdx( AltIndexTenantId,
				AltIndexId );
	}

	public void deleteTableByQualTableIdx( Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		YCFBamTableByQualTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( QualifyingTenantId );
		key.setOptionalQualifyingTableId( QualifyingTableId );
		if( indexByQualTableIdx == null ) {
			indexByQualTableIdx = new HashMap< YCFBamTableByQualTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamTableObj > >();
		}
		if( indexByQualTableIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamTableObj> dict = indexByQualTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByQualTableIdx( schema.getAuthorization(),
				QualifyingTenantId,
				QualifyingTableId );
			Iterator<IYCFBamTableObj> iter = dict.values().iterator();
			IYCFBamTableObj obj;
			List<IYCFBamTableObj> toForget = new LinkedList<IYCFBamTableObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTable().deleteTableByQualTableIdx( schema.getAuthorization(),
				QualifyingTenantId,
				QualifyingTableId );
		}
		deepDisposeTableByQualTableIdx( QualifyingTenantId,
				QualifyingTableId );
	}
}

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

public class YCFBamIndexTableObj
	implements IYCFBamIndexTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamIndexObj> members;
	private Map<YCFBamScopePKey, IYCFBamIndexObj> allIndex;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamIndexObj > > indexByTenantIdx;
	private Map< YCFBamIndexByUNameIdxKey,
		IYCFBamIndexObj > indexByUNameIdx;
	private Map< YCFBamIndexByIndexTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamIndexObj > > indexByIndexTenantIdx;
	private Map< YCFBamIndexByIdxTableIdxKey,
		Map<YCFBamScopePKey, IYCFBamIndexObj > > indexByIdxTableIdx;
	private Map< YCFBamIndexByCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamIndexObj > > indexByCodeVisIdx;
	private Map< YCFBamIndexByTableCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamIndexObj > > indexByTableCodeVisIdx;
	private Map< YCFBamIndexByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamIndexObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "Index";
	public static String TABLE_DBNAME = "idxdef";

	public YCFBamIndexTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
		allIndex = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByIndexTenantIdx = null;
		indexByIdxTableIdx = null;
		indexByCodeVisIdx = null;
		indexByTableCodeVisIdx = null;
		indexByDefSchemaIdx = null;
	}

	public YCFBamIndexTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
		allIndex = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByIndexTenantIdx = null;
		indexByIdxTableIdx = null;
		indexByCodeVisIdx = null;
		indexByTableCodeVisIdx = null;
		indexByDefSchemaIdx = null;
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
		allIndex = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByIndexTenantIdx = null;
		indexByIdxTableIdx = null;
		indexByCodeVisIdx = null;
		indexByTableCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		List<IYCFBamIndexObj> toForget = new LinkedList<IYCFBamIndexObj>();
		IYCFBamIndexObj cur = null;
		Iterator<IYCFBamIndexObj> iter = members.values().iterator();
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
	 *	YCFBamIndexObj.
	 */
	public IYCFBamIndexObj newInstance() {
		IYCFBamIndexObj inst = new YCFBamIndexObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamIndexObj.
	 */
	public IYCFBamIndexEditObj newEditInstance( IYCFBamIndexObj orig ) {
		IYCFBamIndexEditObj edit = new YCFBamIndexEditObj( orig );
		return( edit );
	}

	public IYCFBamIndexObj realiseIndex( IYCFBamIndexObj Obj ) {
		IYCFBamIndexObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamIndexObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamIndexObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamIndexByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByIndexTenantIdx != null ) {
				YCFBamIndexByIndexTenantIdxKey keyIndexTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
				keyIndexTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapIndexTenantIdx = indexByIndexTenantIdx.get( keyIndexTenantIdx );
				if( mapIndexTenantIdx != null ) {
					mapIndexTenantIdx.remove( keepObj.getPKey() );
					if( mapIndexTenantIdx.size() <= 0 ) {
						indexByIndexTenantIdx.remove( keyIndexTenantIdx );
					}
				}
			}

			if( indexByIdxTableIdx != null ) {
				YCFBamIndexByIdxTableIdxKey keyIdxTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
				keyIdxTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapIdxTableIdx = indexByIdxTableIdx.get( keyIdxTableIdx );
				if( mapIdxTableIdx != null ) {
					mapIdxTableIdx.remove( keepObj.getPKey() );
					if( mapIdxTableIdx.size() <= 0 ) {
						indexByIdxTableIdx.remove( keyIdxTableIdx );
					}
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamIndexByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.remove( keepObj.getPKey() );
					if( mapCodeVisIdx.size() <= 0 ) {
						indexByCodeVisIdx.remove( keyCodeVisIdx );
					}
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				YCFBamIndexByTableCodeVisIdxKey keyTableCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.remove( keepObj.getPKey() );
					if( mapTableCodeVisIdx.size() <= 0 ) {
						indexByTableCodeVisIdx.remove( keyTableCodeVisIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamIndexByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamIndexObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamIndexByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIndexTenantIdx != null ) {
				YCFBamIndexByIndexTenantIdxKey keyIndexTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
				keyIndexTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapIndexTenantIdx = indexByIndexTenantIdx.get( keyIndexTenantIdx );
				if( mapIndexTenantIdx != null ) {
					mapIndexTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxTableIdx != null ) {
				YCFBamIndexByIdxTableIdxKey keyIdxTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
				keyIdxTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapIdxTableIdx = indexByIdxTableIdx.get( keyIdxTableIdx );
				if( mapIdxTableIdx != null ) {
					mapIdxTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamIndexByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				YCFBamIndexByTableCodeVisIdxKey keyTableCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamIndexByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allIndex != null ) {
				allIndex.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamIndexObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allIndex != null ) {
				allIndex.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamIndexByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByIndexTenantIdx != null ) {
				YCFBamIndexByIndexTenantIdxKey keyIndexTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
				keyIndexTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapIndexTenantIdx = indexByIndexTenantIdx.get( keyIndexTenantIdx );
				if( mapIndexTenantIdx != null ) {
					mapIndexTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIdxTableIdx != null ) {
				YCFBamIndexByIdxTableIdxKey keyIdxTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
				keyIdxTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIdxTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapIdxTableIdx = indexByIdxTableIdx.get( keyIdxTableIdx );
				if( mapIdxTableIdx != null ) {
					mapIdxTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCodeVisIdx != null ) {
				YCFBamIndexByCodeVisIdxKey keyCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newCodeVisIdxKey();
				keyCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapCodeVisIdx = indexByCodeVisIdx.get( keyCodeVisIdx );
				if( mapCodeVisIdx != null ) {
					mapCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableCodeVisIdx != null ) {
				YCFBamIndexByTableCodeVisIdxKey keyTableCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newTableCodeVisIdxKey();
				keyTableCodeVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableCodeVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyTableCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapTableCodeVisIdx = indexByTableCodeVisIdx.get( keyTableCodeVisIdx );
				if( mapTableCodeVisIdx != null ) {
					mapTableCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamIndexByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamIndexObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamIndexObj createIndex( IYCFBamIndexObj Obj ) {
		IYCFBamIndexObj obj = Obj;
		YCFBamIndexBuff buff = obj.getIndexBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableIndex().createIndex(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a824" ) ) {
			obj = (IYCFBamIndexObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamIndexObj readIndex( YCFBamScopePKey pkey ) {
		return( readIndex( pkey, false ) );
	}

	public IYCFBamIndexObj readIndex( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamIndexObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamIndexBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamIndexObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamIndexObj readCachedIndex( YCFBamScopePKey pkey ) {
		IYCFBamIndexObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeIndex( IYCFBamIndexObj obj )
	{
		final String S_ProcName = "YCFBamIndexTableObj.reallyDeepDisposeIndex() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamIndexObj existing = readCachedIndex( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamIndexByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamIndexByIndexTenantIdxKey keyIndexTenantIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		keyIndexTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamIndexByIdxTableIdxKey keyIdxTableIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		keyIdxTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamIndexByCodeVisIdxKey keyCodeVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamIndexByTableCodeVisIdxKey keyTableCodeVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newTableCodeVisIdxKey();
		keyTableCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTableCodeVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyTableCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamIndexByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );


		IYCFBamIndexColObj objDelIndexRefRelFromCols;
		List<IYCFBamIndexColObj> arrDelIndexRefRelFromCols = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamIndexColObj> iterDelIndexRefRelFromCols = arrDelIndexRefRelFromCols.iterator();
		while( iterDelIndexRefRelFromCols.hasNext() ) {
			objDelIndexRefRelFromCols = iterDelIndexRefRelFromCols.next();
			if( objDelIndexRefRelFromCols != null ) {
						schema.getRelationColTableObj().deepDisposeRelationColByFromColIdx( objDelIndexRefRelFromCols.getRequiredTenantId(),
							objDelIndexRefRelFromCols.getRequiredId() );
			}
		}
		IYCFBamIndexColObj objDelIndexRefRelToCols;
		List<IYCFBamIndexColObj> arrDelIndexRefRelToCols = schema.getIndexColTableObj().readCachedIndexColByIndexIdx( existing.getRequiredTenantId(),
			existing.getRequiredId() );
		Iterator<IYCFBamIndexColObj> iterDelIndexRefRelToCols = arrDelIndexRefRelToCols.iterator();
		while( iterDelIndexRefRelToCols.hasNext() ) {
			objDelIndexRefRelToCols = iterDelIndexRefRelToCols.next();
			if( objDelIndexRefRelToCols != null ) {
						schema.getRelationColTableObj().deepDisposeRelationColByToColIdx( objDelIndexRefRelToCols.getRequiredTenantId(),
							objDelIndexRefRelToCols.getRequiredId() );
			}
		}
					schema.getIndexColTableObj().deepDisposeIndexColByIndexIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByIndexTenantIdx != null ) {
			if( indexByIndexTenantIdx.containsKey( keyIndexTenantIdx ) ) {
				indexByIndexTenantIdx.get( keyIndexTenantIdx ).remove( pkey );
				if( indexByIndexTenantIdx.get( keyIndexTenantIdx ).size() <= 0 ) {
					indexByIndexTenantIdx.remove( keyIndexTenantIdx );
				}
			}
		}

		if( indexByIdxTableIdx != null ) {
			if( indexByIdxTableIdx.containsKey( keyIdxTableIdx ) ) {
				indexByIdxTableIdx.get( keyIdxTableIdx ).remove( pkey );
				if( indexByIdxTableIdx.get( keyIdxTableIdx ).size() <= 0 ) {
					indexByIdxTableIdx.remove( keyIdxTableIdx );
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


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeIndex( YCFBamScopePKey pkey ) {
		IYCFBamIndexObj obj = readCachedIndex( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamIndexObj lockIndex( YCFBamScopePKey pkey ) {
		IYCFBamIndexObj locked = null;
		YCFBamIndexBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamIndexObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockIndex", pkey );
		}
		return( locked );
	}

	public List<IYCFBamIndexObj> readAllIndex() {
		return( readAllIndex( false ) );
	}

	public List<IYCFBamIndexObj> readAllIndex( boolean forceRead ) {
		final String S_ProcName = "readAllIndex";
		if( ( allIndex == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> map = new HashMap<YCFBamScopePKey,IYCFBamIndexObj>();
			allIndex = map;
			YCFBamIndexBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readAllDerived( schema.getAuthorization() );
			YCFBamIndexBuff buff;
			IYCFBamIndexObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexObj realised = (IYCFBamIndexObj)obj.realise();
			}
		}
		int len = allIndex.size();
		IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
		Iterator<IYCFBamIndexObj> valIter = allIndex.values().iterator();
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
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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
		List<IYCFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexObj> readCachedAllIndex() {
		final String S_ProcName = "readCachedAllIndex";
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>();
		if( allIndex != null ) {
			int len = allIndex.size();
			IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
			Iterator<IYCFBamIndexObj> valIter = allIndex.values().iterator();
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
		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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

	public IYCFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id )
	{
		return( readIndexByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamIndexObj readIndexByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamIndexObj obj = readIndex( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamIndexObj> readIndexByTenantIdx( long TenantId )
	{
		return( readIndexByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamIndexObj> readIndexByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexObj realised = (IYCFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
		Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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
		List<IYCFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamIndexObj readIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readIndexByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamIndexObj readIndexByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamIndexByUNameIdxKey,
				IYCFBamIndexObj >();
		}
		YCFBamIndexByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamIndexObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamIndexBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamIndexObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamIndexObj> readIndexByIndexTenantIdx( long TenantId )
	{
		return( readIndexByIndexTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamIndexObj> readIndexByIndexTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByIndexTenantIdx";
		YCFBamIndexByIndexTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
		if( indexByIndexTenantIdx == null ) {
			indexByIndexTenantIdx = new HashMap< YCFBamIndexByIndexTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByIndexTenantIdx.containsKey( key ) ) {
			dict = indexByIndexTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
			IYCFBamIndexObj obj;
			YCFBamIndexBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByIndexTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexObj realised = (IYCFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIndexTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
		Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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
		List<IYCFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		return( readIndexByIdxTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamIndexObj> readIndexByIdxTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByIdxTableIdx";
		YCFBamIndexByIdxTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
		if( indexByIdxTableIdx == null ) {
			indexByIdxTableIdx = new HashMap< YCFBamIndexByIdxTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByIdxTableIdx.containsKey( key ) ) {
			dict = indexByIdxTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
			IYCFBamIndexObj obj;
			YCFBamIndexBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByIdxTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexObj realised = (IYCFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIdxTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
		Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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
		List<IYCFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexObj> readIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readIndexByCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamIndexObj> readIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByCodeVisIdx";
		YCFBamIndexByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamIndexByCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByCodeVisIdx.containsKey( key ) ) {
			dict = indexByCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
			IYCFBamIndexObj obj;
			YCFBamIndexBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexObj realised = (IYCFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
		Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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
		List<IYCFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexObj> readIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readIndexByTableCodeVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamIndexObj> readIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByTableCodeVisIdx";
		YCFBamIndexByTableCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
		if( indexByTableCodeVisIdx == null ) {
			indexByTableCodeVisIdx = new HashMap< YCFBamIndexByTableCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByTableCodeVisIdx.containsKey( key ) ) {
			dict = indexByTableCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
			IYCFBamIndexObj obj;
			YCFBamIndexBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			YCFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexObj realised = (IYCFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTableCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
		Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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
		List<IYCFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readIndexByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamIndexObj> readIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexByDefSchemaIdx";
		YCFBamIndexByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamIndexByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamIndexObj>();
			IYCFBamIndexObj obj;
			YCFBamIndexBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndex().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamIndexBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexObj realised = (IYCFBamIndexObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
		Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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
		List<IYCFBamIndexObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamIndexObj readCachedIndexByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamIndexObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedIndex( pkey );
		return( obj );
	}

	public List<IYCFBamIndexObj> readCachedIndexByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
				Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
			IYCFBamIndexObj obj;
			Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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

	public IYCFBamIndexObj readCachedIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamIndexObj obj = null;
		YCFBamIndexByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
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

	public List<IYCFBamIndexObj> readCachedIndexByIndexTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexByIndexTenantIdx";
		YCFBamIndexByIndexTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>();
		if( indexByIndexTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
			if( indexByIndexTenantIdx.containsKey( key ) ) {
				dict = indexByIndexTenantIdx.get( key );
				int len = dict.size();
				IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
				Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
			IYCFBamIndexObj obj;
			Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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

	public List<IYCFBamIndexObj> readCachedIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedIndexByIdxTableIdx";
		YCFBamIndexByIdxTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>();
		if( indexByIdxTableIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
			if( indexByIdxTableIdx.containsKey( key ) ) {
				dict = indexByIdxTableIdx.get( key );
				int len = dict.size();
				IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
				Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
			IYCFBamIndexObj obj;
			Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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

	public List<IYCFBamIndexObj> readCachedIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedIndexByCodeVisIdx";
		YCFBamIndexByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>();
		if( indexByCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
			if( indexByCodeVisIdx.containsKey( key ) ) {
				dict = indexByCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
				Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
			IYCFBamIndexObj obj;
			Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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

	public List<IYCFBamIndexObj> readCachedIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedIndexByTableCodeVisIdx";
		YCFBamIndexByTableCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>();
		if( indexByTableCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
			if( indexByTableCodeVisIdx.containsKey( key ) ) {
				dict = indexByTableCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
				Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
			IYCFBamIndexObj obj;
			Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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

	public List<IYCFBamIndexObj> readCachedIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedIndexByDefSchemaIdx";
		YCFBamIndexByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamIndexObj> arrayList = new ArrayList<IYCFBamIndexObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamIndexObj arr[] = new IYCFBamIndexObj[len];
				Iterator<IYCFBamIndexObj> valIter = dict.values().iterator();
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
			IYCFBamIndexObj obj;
			Iterator<IYCFBamIndexObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexObj> cmp = new Comparator<IYCFBamIndexObj>() {
			public int compare( IYCFBamIndexObj lhs, IYCFBamIndexObj rhs ) {
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

	public void deepDisposeIndexByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamIndexObj obj = readCachedIndexByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeIndexByTenantIdx";
		IYCFBamIndexObj obj;
		List<IYCFBamIndexObj> arrayList = readCachedIndexByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamIndexObj obj = readCachedIndexByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexByIndexTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeIndexByIndexTenantIdx";
		IYCFBamIndexObj obj;
		List<IYCFBamIndexObj> arrayList = readCachedIndexByIndexTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeIndexByIdxTableIdx";
		IYCFBamIndexObj obj;
		List<IYCFBamIndexObj> arrayList = readCachedIndexByIdxTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeIndexByCodeVisIdx";
		IYCFBamIndexObj obj;
		List<IYCFBamIndexObj> arrayList = readCachedIndexByCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeIndexByTableCodeVisIdx";
		IYCFBamIndexObj obj;
		List<IYCFBamIndexObj> arrayList = readCachedIndexByTableCodeVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeIndexByDefSchemaIdx";
		IYCFBamIndexObj obj;
		List<IYCFBamIndexObj> arrayList = readCachedIndexByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamIndexObj updateIndex( IYCFBamIndexObj Obj ) {
		IYCFBamIndexObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableIndex().updateIndex( schema.getAuthorization(),
			Obj.getIndexBuff() );
		if( Obj.getClassCode().equals( "a824" ) ) {
			obj = (IYCFBamIndexObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteIndex( IYCFBamIndexObj Obj ) {
		IYCFBamIndexObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndex( schema.getAuthorization(),
			obj.getIndexBuff() );
		Obj.forget();
	}

	public void deleteIndexByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamIndexObj obj = readIndex( pkey );
		if( obj != null ) {
			IYCFBamIndexEditObj editObj = (IYCFBamIndexEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamIndexEditObj)obj.beginEdit();
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
		deepDisposeIndexByIdIdx( TenantId,
				Id );
	}

	public void deleteIndexByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamIndexObj> iter = dict.values().iterator();
			IYCFBamIndexObj obj;
			List<IYCFBamIndexObj> toForget = new LinkedList<IYCFBamIndexObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexByTenantIdx( TenantId );
	}

	public void deleteIndexByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamIndexByUNameIdxKey,
				IYCFBamIndexObj >();
		}
		YCFBamIndexByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamIndexObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeIndexByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteIndexByIndexTenantIdx( long TenantId )
	{
		YCFBamIndexByIndexTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByIndexTenantIdx == null ) {
			indexByIndexTenantIdx = new HashMap< YCFBamIndexByIndexTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( indexByIndexTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict = indexByIndexTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIndexTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamIndexObj> iter = dict.values().iterator();
			IYCFBamIndexObj obj;
			List<IYCFBamIndexObj> toForget = new LinkedList<IYCFBamIndexObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIndexTenantIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIndexTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexByIndexTenantIdx( TenantId );
	}

	public void deleteIndexByIdxTableIdx( long TenantId,
		long TableId )
	{
		YCFBamIndexByIdxTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByIdxTableIdx == null ) {
			indexByIdxTableIdx = new HashMap< YCFBamIndexByIdxTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( indexByIdxTableIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict = indexByIdxTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIdxTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamIndexObj> iter = dict.values().iterator();
			IYCFBamIndexObj obj;
			List<IYCFBamIndexObj> toForget = new LinkedList<IYCFBamIndexObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIdxTableIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByIdxTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeIndexByIdxTableIdx( TenantId,
				TableId );
	}

	public void deleteIndexByCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamIndexByCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByCodeVisIdx == null ) {
			indexByCodeVisIdx = new HashMap< YCFBamIndexByCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( indexByCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict = indexByCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamIndexObj> iter = dict.values().iterator();
			IYCFBamIndexObj obj;
			List<IYCFBamIndexObj> toForget = new LinkedList<IYCFBamIndexObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeIndexByCodeVisIdx( CodeVis );
	}

	public void deleteIndexByTableCodeVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamIndexByTableCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByTableCodeVisIdx == null ) {
			indexByTableCodeVisIdx = new HashMap< YCFBamIndexByTableCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( indexByTableCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict = indexByTableCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<IYCFBamIndexObj> iter = dict.values().iterator();
			IYCFBamIndexObj obj;
			List<IYCFBamIndexObj> toForget = new LinkedList<IYCFBamIndexObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByTableCodeVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeIndexByTableCodeVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteIndexByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamIndexByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamIndexByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamIndexObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamIndexObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamIndexObj> iter = dict.values().iterator();
			IYCFBamIndexObj obj;
			List<IYCFBamIndexObj> toForget = new LinkedList<IYCFBamIndexObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableIndex().deleteIndexByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeIndexByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}

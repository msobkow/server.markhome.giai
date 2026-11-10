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

public class YCFBamServerListFuncTableObj
	implements IYCFBamServerListFuncTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamServerListFuncObj> members;
	private Map<YCFBamScopePKey, IYCFBamServerListFuncObj> allServerListFunc;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj > > indexByTenantIdx;
	private Map< YCFBamServerMethodByUNameIdxKey,
		IYCFBamServerListFuncObj > indexByUNameIdx;
	private Map< YCFBamServerMethodByMethTableIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj > > indexByMethTableIdx;
	private Map< YCFBamServerMethodByMethTableVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj > > indexByMethTableVisIdx;
	private Map< YCFBamServerMethodByMethCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj > > indexByMethCodeVisIdx;
	private Map< YCFBamServerMethodByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj > > indexByDefSchemaIdx;
	private Map< YCFBamServerListFuncByRetTblIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj > > indexByRetTblIdx;
	public static String TABLE_NAME = "ServerListFunc";
	public static String TABLE_DBNAME = "srvlfunc";

	public YCFBamServerListFuncTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
		allServerListFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
	}

	public YCFBamServerListFuncTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
		allServerListFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
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
		allServerListFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
		List<IYCFBamServerListFuncObj> toForget = new LinkedList<IYCFBamServerListFuncObj>();
		IYCFBamServerListFuncObj cur = null;
		Iterator<IYCFBamServerListFuncObj> iter = members.values().iterator();
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
	 *	YCFBamServerListFuncObj.
	 */
	public IYCFBamServerListFuncObj newInstance() {
		IYCFBamServerListFuncObj inst = new YCFBamServerListFuncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamServerListFuncObj.
	 */
	public IYCFBamServerListFuncEditObj newEditInstance( IYCFBamServerListFuncObj orig ) {
		IYCFBamServerListFuncEditObj edit = new YCFBamServerListFuncEditObj( orig );
		return( edit );
	}

	public IYCFBamServerListFuncObj realiseServerListFunc( IYCFBamServerListFuncObj Obj ) {
		IYCFBamServerListFuncObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerListFuncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamServerListFuncObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamServerMethodByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByMethTableIdx != null ) {
				YCFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					indexByMethTableIdx.remove( keyMethTableIdx );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					indexByMethTableVisIdx.remove( keyMethTableVisIdx );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByRetTblIdx != null ) {
				YCFBamServerListFuncByRetTblIdxKey keyRetTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
				if( mapRetTblIdx != null ) {
					mapRetTblIdx.remove( keepObj.getPKey() );
					if( mapRetTblIdx.size() <= 0 ) {
						indexByRetTblIdx.remove( keyRetTblIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamServerListFuncObj)schema.getServerMethodTableObj().realiseServerMethod( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamServerMethodByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				YCFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				YCFBamServerListFuncByRetTblIdxKey keyRetTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
				if( mapRetTblIdx != null ) {
					mapRetTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allServerListFunc != null ) {
				allServerListFunc.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamServerListFuncObj)schema.getServerMethodTableObj().realiseServerMethod( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServerListFunc != null ) {
				allServerListFunc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamServerMethodByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				YCFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				YCFBamServerListFuncByRetTblIdxKey keyRetTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<YCFBamScopePKey, IYCFBamServerListFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
				if( mapRetTblIdx != null ) {
					mapRetTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamServerListFuncObj createServerListFunc( IYCFBamServerListFuncObj Obj ) {
		IYCFBamServerListFuncObj obj = Obj;
		YCFBamServerListFuncBuff buff = obj.getServerListFuncBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().createServerListFunc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a83a" ) ) {
			obj = (IYCFBamServerListFuncObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamServerListFuncObj readServerListFunc( YCFBamScopePKey pkey ) {
		return( readServerListFunc( pkey, false ) );
	}

	public IYCFBamServerListFuncObj readServerListFunc( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamServerListFuncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamServerListFuncBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamServerListFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamServerListFuncObj readCachedServerListFunc( YCFBamScopePKey pkey ) {
		IYCFBamServerListFuncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServerListFunc( IYCFBamServerListFuncObj obj )
	{
		final String S_ProcName = "YCFBamServerListFuncTableObj.reallyDeepDisposeServerListFunc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerListFuncObj existing = readCachedServerListFunc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamServerListFuncByRetTblIdxKey keyRetTblIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
		keyRetTblIdx.setOptionalRetTenantId( existing.getOptionalRetTenantId() );
		keyRetTblIdx.setOptionalRetTableId( existing.getOptionalRetTableId() );


		schema.getParamTableObj().deepDisposeParamByServerMethodIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByRetTblIdx != null ) {
			if( indexByRetTblIdx.containsKey( keyRetTblIdx ) ) {
				indexByRetTblIdx.get( keyRetTblIdx ).remove( pkey );
				if( indexByRetTblIdx.get( keyRetTblIdx ).size() <= 0 ) {
					indexByRetTblIdx.remove( keyRetTblIdx );
				}
			}
		}


		schema.getServerMethodTableObj().reallyDeepDisposeServerMethod( obj );
	}
	public void deepDisposeServerListFunc( YCFBamScopePKey pkey ) {
		IYCFBamServerListFuncObj obj = readCachedServerListFunc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamServerListFuncObj lockServerListFunc( YCFBamScopePKey pkey ) {
		IYCFBamServerListFuncObj locked = null;
		YCFBamServerListFuncBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamServerListFuncObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockServerListFunc", pkey );
		}
		return( locked );
	}

	public List<IYCFBamServerListFuncObj> readAllServerListFunc() {
		return( readAllServerListFunc( false ) );
	}

	public List<IYCFBamServerListFuncObj> readAllServerListFunc( boolean forceRead ) {
		final String S_ProcName = "readAllServerListFunc";
		if( ( allServerListFunc == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> map = new HashMap<YCFBamScopePKey,IYCFBamServerListFuncObj>();
			allServerListFunc = map;
			YCFBamServerListFuncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().readAllDerived( schema.getAuthorization() );
			YCFBamServerListFuncBuff buff;
			IYCFBamServerListFuncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerListFuncObj realised = (IYCFBamServerListFuncObj)obj.realise();
			}
		}
		int len = allServerListFunc.size();
		IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
		Iterator<IYCFBamServerListFuncObj> valIter = allServerListFunc.values().iterator();
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
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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
		List<IYCFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerListFuncObj> readCachedAllServerListFunc() {
		final String S_ProcName = "readCachedAllServerListFunc";
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>();
		if( allServerListFunc != null ) {
			int len = allServerListFunc.size();
			IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
			Iterator<IYCFBamServerListFuncObj> valIter = allServerListFunc.values().iterator();
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
		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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

	public IYCFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		return( readServerListFuncByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerListFuncObj obj = readServerListFunc( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId )
	{
		return( readServerListFuncByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerListFuncObj realised = (IYCFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
		Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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
		List<IYCFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readServerListFuncByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerListFuncObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerListFuncObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamServerMethodBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamServerListFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		return( readServerListFuncByMethTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableIdx.containsKey( key ) ) {
			dict = indexByMethTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerListFuncObj realised = (IYCFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
		Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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
		List<IYCFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerListFuncByMethTableVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableVisIdx.containsKey( key ) ) {
			dict = indexByMethTableVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerListFuncObj realised = (IYCFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
		Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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
		List<IYCFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerListFuncByMethCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethCodeVisIdx.containsKey( key ) ) {
			dict = indexByMethCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerListFuncObj realised = (IYCFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
		Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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
		List<IYCFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readServerListFuncByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerListFuncObj realised = (IYCFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
		Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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
		List<IYCFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		return( readServerListFuncByRetTblIdx( RetTenantId,
			RetTableId,
			false ) );
	}

	public List<IYCFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByRetTblIdx";
		YCFBamServerListFuncByRetTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< YCFBamServerListFuncByRetTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByRetTblIdx.containsKey( key ) ) {
			dict = indexByRetTblIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerListFuncObj>();
			IYCFBamServerListFuncObj obj;
			YCFBamServerListFuncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().readDerivedByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			YCFBamServerListFuncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerListFuncObj realised = (IYCFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRetTblIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
		Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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
		List<IYCFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerListFuncObj readCachedServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamServerListFuncObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedServerListFunc( pkey );
		return( obj );
	}

	public List<IYCFBamServerListFuncObj> readCachedServerListFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedServerListFuncByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
				Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerListFuncObj obj;
			Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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

	public IYCFBamServerListFuncObj readCachedServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamServerListFuncObj obj = null;
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
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

	public List<IYCFBamServerListFuncObj> readCachedServerListFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedServerListFuncByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>();
		if( indexByMethTableIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
			if( indexByMethTableIdx.containsKey( key ) ) {
				dict = indexByMethTableIdx.get( key );
				int len = dict.size();
				IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
				Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerListFuncObj obj;
			Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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

	public List<IYCFBamServerListFuncObj> readCachedServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerListFuncByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>();
		if( indexByMethTableVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
			if( indexByMethTableVisIdx.containsKey( key ) ) {
				dict = indexByMethTableVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
				Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerListFuncObj obj;
			Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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

	public List<IYCFBamServerListFuncObj> readCachedServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerListFuncByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>();
		if( indexByMethCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
			if( indexByMethCodeVisIdx.containsKey( key ) ) {
				dict = indexByMethCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
				Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerListFuncObj obj;
			Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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

	public List<IYCFBamServerListFuncObj> readCachedServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedServerListFuncByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
				Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerListFuncObj obj;
			Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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

	public List<IYCFBamServerListFuncObj> readCachedServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "readCachedServerListFuncByRetTblIdx";
		YCFBamServerListFuncByRetTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		ArrayList<IYCFBamServerListFuncObj> arrayList = new ArrayList<IYCFBamServerListFuncObj>();
		if( indexByRetTblIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict;
			if( indexByRetTblIdx.containsKey( key ) ) {
				dict = indexByRetTblIdx.get( key );
				int len = dict.size();
				IYCFBamServerListFuncObj arr[] = new IYCFBamServerListFuncObj[len];
				Iterator<IYCFBamServerListFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerListFuncObj obj;
			Iterator<IYCFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerListFuncObj> cmp = new Comparator<IYCFBamServerListFuncObj>() {
			public int compare( IYCFBamServerListFuncObj lhs, IYCFBamServerListFuncObj rhs ) {
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

	public void deepDisposeServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamServerListFuncObj obj = readCachedServerListFuncByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerListFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeServerListFuncByTenantIdx";
		IYCFBamServerListFuncObj obj;
		List<IYCFBamServerListFuncObj> arrayList = readCachedServerListFuncByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamServerListFuncObj obj = readCachedServerListFuncByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerListFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeServerListFuncByMethTableIdx";
		IYCFBamServerListFuncObj obj;
		List<IYCFBamServerListFuncObj> arrayList = readCachedServerListFuncByMethTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerListFuncByMethTableVisIdx";
		IYCFBamServerListFuncObj obj;
		List<IYCFBamServerListFuncObj> arrayList = readCachedServerListFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerListFuncByMethCodeVisIdx";
		IYCFBamServerListFuncObj obj;
		List<IYCFBamServerListFuncObj> arrayList = readCachedServerListFuncByMethCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeServerListFuncByDefSchemaIdx";
		IYCFBamServerListFuncObj obj;
		List<IYCFBamServerListFuncObj> arrayList = readCachedServerListFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "deepDisposeServerListFuncByRetTblIdx";
		IYCFBamServerListFuncObj obj;
		List<IYCFBamServerListFuncObj> arrayList = readCachedServerListFuncByRetTblIdx( RetTenantId,
				RetTableId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamServerListFuncObj updateServerListFunc( IYCFBamServerListFuncObj Obj ) {
		IYCFBamServerListFuncObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().updateServerListFunc( schema.getAuthorization(),
			Obj.getServerListFuncBuff() );
		if( Obj.getClassCode().equals( "a83a" ) ) {
			obj = (IYCFBamServerListFuncObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteServerListFunc( IYCFBamServerListFuncObj Obj ) {
		IYCFBamServerListFuncObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFunc( schema.getAuthorization(),
			obj.getServerListFuncBuff() );
		Obj.forget();
	}

	public void deleteServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerListFuncObj obj = readServerListFunc( pkey );
		if( obj != null ) {
			IYCFBamServerListFuncEditObj editObj = (IYCFBamServerListFuncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamServerListFuncEditObj)obj.beginEdit();
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
		deepDisposeServerListFuncByIdIdx( TenantId,
				Id );
	}

	public void deleteServerListFuncByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamServerListFuncObj> iter = dict.values().iterator();
			IYCFBamServerListFuncObj obj;
			List<IYCFBamServerListFuncObj> toForget = new LinkedList<IYCFBamServerListFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeServerListFuncByTenantIdx( TenantId );
	}

	public void deleteServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerListFuncObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerListFuncObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeServerListFuncByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteServerListFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( indexByMethTableIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict = indexByMethTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamServerListFuncObj> iter = dict.values().iterator();
			IYCFBamServerListFuncObj obj;
			List<IYCFBamServerListFuncObj> toForget = new LinkedList<IYCFBamServerListFuncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMethTableIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeServerListFuncByMethTableIdx( TenantId,
				TableId );
	}

	public void deleteServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( indexByMethTableVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict = indexByMethTableVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<IYCFBamServerListFuncObj> iter = dict.values().iterator();
			IYCFBamServerListFuncObj obj;
			List<IYCFBamServerListFuncObj> toForget = new LinkedList<IYCFBamServerListFuncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMethTableVisIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeServerListFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteServerListFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( indexByMethCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict = indexByMethCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamServerListFuncObj> iter = dict.values().iterator();
			IYCFBamServerListFuncObj obj;
			List<IYCFBamServerListFuncObj> toForget = new LinkedList<IYCFBamServerListFuncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMethCodeVisIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeServerListFuncByMethCodeVisIdx( CodeVis );
	}

	public void deleteServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamServerListFuncObj> iter = dict.values().iterator();
			IYCFBamServerListFuncObj obj;
			List<IYCFBamServerListFuncObj> toForget = new LinkedList<IYCFBamServerListFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeServerListFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		YCFBamServerListFuncByRetTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< YCFBamServerListFuncByRetTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerListFuncObj > >();
		}
		if( indexByRetTblIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerListFuncObj> dict = indexByRetTblIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			Iterator<IYCFBamServerListFuncObj> iter = dict.values().iterator();
			IYCFBamServerListFuncObj obj;
			List<IYCFBamServerListFuncObj> toForget = new LinkedList<IYCFBamServerListFuncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRetTblIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
		}
		deepDisposeServerListFuncByRetTblIdx( RetTenantId,
				RetTableId );
	}
}

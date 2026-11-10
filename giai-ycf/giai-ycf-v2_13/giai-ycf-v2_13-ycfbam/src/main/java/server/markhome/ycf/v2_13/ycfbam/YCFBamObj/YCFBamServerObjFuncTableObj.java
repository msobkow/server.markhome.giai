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

public class YCFBamServerObjFuncTableObj
	implements IYCFBamServerObjFuncTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> members;
	private Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> allServerObjFunc;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > > indexByTenantIdx;
	private Map< YCFBamServerMethodByUNameIdxKey,
		IYCFBamServerObjFuncObj > indexByUNameIdx;
	private Map< YCFBamServerMethodByMethTableIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > > indexByMethTableIdx;
	private Map< YCFBamServerMethodByMethTableVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > > indexByMethTableVisIdx;
	private Map< YCFBamServerMethodByMethCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > > indexByMethCodeVisIdx;
	private Map< YCFBamServerMethodByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > > indexByDefSchemaIdx;
	private Map< YCFBamServerObjFuncByRetTblIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > > indexByRetTblIdx;
	public static String TABLE_NAME = "ServerObjFunc";
	public static String TABLE_DBNAME = "srvofunc";

	public YCFBamServerObjFuncTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
		allServerObjFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
	}

	public YCFBamServerObjFuncTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
		allServerObjFunc = null;
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
		allServerObjFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
		List<IYCFBamServerObjFuncObj> toForget = new LinkedList<IYCFBamServerObjFuncObj>();
		IYCFBamServerObjFuncObj cur = null;
		Iterator<IYCFBamServerObjFuncObj> iter = members.values().iterator();
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
	 *	YCFBamServerObjFuncObj.
	 */
	public IYCFBamServerObjFuncObj newInstance() {
		IYCFBamServerObjFuncObj inst = new YCFBamServerObjFuncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamServerObjFuncObj.
	 */
	public IYCFBamServerObjFuncEditObj newEditInstance( IYCFBamServerObjFuncObj orig ) {
		IYCFBamServerObjFuncEditObj edit = new YCFBamServerObjFuncEditObj( orig );
		return( edit );
	}

	public IYCFBamServerObjFuncObj realiseServerObjFunc( IYCFBamServerObjFuncObj Obj ) {
		IYCFBamServerObjFuncObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerObjFuncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamServerObjFuncObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					indexByMethTableVisIdx.remove( keyMethTableVisIdx );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByRetTblIdx != null ) {
				YCFBamServerObjFuncByRetTblIdxKey keyRetTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
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
			keepObj = (IYCFBamServerObjFuncObj)schema.getServerMethodTableObj().realiseServerMethod( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				YCFBamServerObjFuncByRetTblIdxKey keyRetTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
				if( mapRetTblIdx != null ) {
					mapRetTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allServerObjFunc != null ) {
				allServerObjFunc.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamServerObjFuncObj)schema.getServerMethodTableObj().realiseServerMethod( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServerObjFunc != null ) {
				allServerObjFunc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				YCFBamServerObjFuncByRetTblIdxKey keyRetTblIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<YCFBamScopePKey, IYCFBamServerObjFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
				if( mapRetTblIdx != null ) {
					mapRetTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamServerObjFuncObj createServerObjFunc( IYCFBamServerObjFuncObj Obj ) {
		IYCFBamServerObjFuncObj obj = Obj;
		YCFBamServerObjFuncBuff buff = obj.getServerObjFuncBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().createServerObjFunc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a805" ) ) {
			obj = (IYCFBamServerObjFuncObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamServerObjFuncObj readServerObjFunc( YCFBamScopePKey pkey ) {
		return( readServerObjFunc( pkey, false ) );
	}

	public IYCFBamServerObjFuncObj readServerObjFunc( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamServerObjFuncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamServerObjFuncBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamServerObjFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamServerObjFuncObj readCachedServerObjFunc( YCFBamScopePKey pkey ) {
		IYCFBamServerObjFuncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServerObjFunc( IYCFBamServerObjFuncObj obj )
	{
		final String S_ProcName = "YCFBamServerObjFuncTableObj.reallyDeepDisposeServerObjFunc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerObjFuncObj existing = readCachedServerObjFunc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamServerObjFuncByRetTblIdxKey keyRetTblIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
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
	public void deepDisposeServerObjFunc( YCFBamScopePKey pkey ) {
		IYCFBamServerObjFuncObj obj = readCachedServerObjFunc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamServerObjFuncObj lockServerObjFunc( YCFBamScopePKey pkey ) {
		IYCFBamServerObjFuncObj locked = null;
		YCFBamServerObjFuncBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamServerObjFuncObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockServerObjFunc", pkey );
		}
		return( locked );
	}

	public List<IYCFBamServerObjFuncObj> readAllServerObjFunc() {
		return( readAllServerObjFunc( false ) );
	}

	public List<IYCFBamServerObjFuncObj> readAllServerObjFunc( boolean forceRead ) {
		final String S_ProcName = "readAllServerObjFunc";
		if( ( allServerObjFunc == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> map = new HashMap<YCFBamScopePKey,IYCFBamServerObjFuncObj>();
			allServerObjFunc = map;
			YCFBamServerObjFuncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().readAllDerived( schema.getAuthorization() );
			YCFBamServerObjFuncBuff buff;
			IYCFBamServerObjFuncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerObjFuncObj realised = (IYCFBamServerObjFuncObj)obj.realise();
			}
		}
		int len = allServerObjFunc.size();
		IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
		Iterator<IYCFBamServerObjFuncObj> valIter = allServerObjFunc.values().iterator();
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
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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
		List<IYCFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerObjFuncObj> readCachedAllServerObjFunc() {
		final String S_ProcName = "readCachedAllServerObjFunc";
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>();
		if( allServerObjFunc != null ) {
			int len = allServerObjFunc.size();
			IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
			Iterator<IYCFBamServerObjFuncObj> valIter = allServerObjFunc.values().iterator();
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
		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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

	public IYCFBamServerObjFuncObj readServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		return( readServerObjFuncByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamServerObjFuncObj readServerObjFuncByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerObjFuncObj obj = readServerObjFunc( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByTenantIdx( long TenantId )
	{
		return( readServerObjFuncByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerObjFuncObj realised = (IYCFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
		Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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
		List<IYCFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerObjFuncObj readServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readServerObjFuncByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamServerObjFuncObj readServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerObjFuncObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerObjFuncObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamServerMethodBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamServerObjFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		return( readServerObjFuncByMethTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableIdx.containsKey( key ) ) {
			dict = indexByMethTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerObjFuncObj realised = (IYCFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
		Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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
		List<IYCFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerObjFuncByMethTableVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableVisIdx.containsKey( key ) ) {
			dict = indexByMethTableVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerObjFuncObj realised = (IYCFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
		Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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
		List<IYCFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerObjFuncByMethCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethCodeVisIdx.containsKey( key ) ) {
			dict = indexByMethCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerObjFuncObj realised = (IYCFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
		Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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
		List<IYCFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readServerObjFuncByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerObjFuncObj realised = (IYCFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
		Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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
		List<IYCFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		return( readServerObjFuncByRetTblIdx( RetTenantId,
			RetTableId,
			false ) );
	}

	public List<IYCFBamServerObjFuncObj> readServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByRetTblIdx";
		YCFBamServerObjFuncByRetTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< YCFBamServerObjFuncByRetTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByRetTblIdx.containsKey( key ) ) {
			dict = indexByRetTblIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerObjFuncObj>();
			IYCFBamServerObjFuncObj obj;
			YCFBamServerObjFuncBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().readDerivedByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			YCFBamServerObjFuncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerObjFuncObj realised = (IYCFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRetTblIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
		Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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
		List<IYCFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerObjFuncObj readCachedServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamServerObjFuncObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedServerObjFunc( pkey );
		return( obj );
	}

	public List<IYCFBamServerObjFuncObj> readCachedServerObjFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedServerObjFuncByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
				Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerObjFuncObj obj;
			Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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

	public IYCFBamServerObjFuncObj readCachedServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamServerObjFuncObj obj = null;
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
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

	public List<IYCFBamServerObjFuncObj> readCachedServerObjFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedServerObjFuncByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>();
		if( indexByMethTableIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
			if( indexByMethTableIdx.containsKey( key ) ) {
				dict = indexByMethTableIdx.get( key );
				int len = dict.size();
				IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
				Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerObjFuncObj obj;
			Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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

	public List<IYCFBamServerObjFuncObj> readCachedServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerObjFuncByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>();
		if( indexByMethTableVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
			if( indexByMethTableVisIdx.containsKey( key ) ) {
				dict = indexByMethTableVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
				Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerObjFuncObj obj;
			Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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

	public List<IYCFBamServerObjFuncObj> readCachedServerObjFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerObjFuncByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>();
		if( indexByMethCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
			if( indexByMethCodeVisIdx.containsKey( key ) ) {
				dict = indexByMethCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
				Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerObjFuncObj obj;
			Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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

	public List<IYCFBamServerObjFuncObj> readCachedServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedServerObjFuncByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
				Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerObjFuncObj obj;
			Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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

	public List<IYCFBamServerObjFuncObj> readCachedServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "readCachedServerObjFuncByRetTblIdx";
		YCFBamServerObjFuncByRetTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		ArrayList<IYCFBamServerObjFuncObj> arrayList = new ArrayList<IYCFBamServerObjFuncObj>();
		if( indexByRetTblIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict;
			if( indexByRetTblIdx.containsKey( key ) ) {
				dict = indexByRetTblIdx.get( key );
				int len = dict.size();
				IYCFBamServerObjFuncObj arr[] = new IYCFBamServerObjFuncObj[len];
				Iterator<IYCFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			IYCFBamServerObjFuncObj obj;
			Iterator<IYCFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerObjFuncObj> cmp = new Comparator<IYCFBamServerObjFuncObj>() {
			public int compare( IYCFBamServerObjFuncObj lhs, IYCFBamServerObjFuncObj rhs ) {
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

	public void deepDisposeServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamServerObjFuncObj obj = readCachedServerObjFuncByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerObjFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByTenantIdx";
		IYCFBamServerObjFuncObj obj;
		List<IYCFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamServerObjFuncObj obj = readCachedServerObjFuncByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerObjFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByMethTableIdx";
		IYCFBamServerObjFuncObj obj;
		List<IYCFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByMethTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByMethTableVisIdx";
		IYCFBamServerObjFuncObj obj;
		List<IYCFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerObjFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByMethCodeVisIdx";
		IYCFBamServerObjFuncObj obj;
		List<IYCFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByMethCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByDefSchemaIdx";
		IYCFBamServerObjFuncObj obj;
		List<IYCFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByRetTblIdx";
		IYCFBamServerObjFuncObj obj;
		List<IYCFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByRetTblIdx( RetTenantId,
				RetTableId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamServerObjFuncObj updateServerObjFunc( IYCFBamServerObjFuncObj Obj ) {
		IYCFBamServerObjFuncObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().updateServerObjFunc( schema.getAuthorization(),
			Obj.getServerObjFuncBuff() );
		if( Obj.getClassCode().equals( "a805" ) ) {
			obj = (IYCFBamServerObjFuncObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteServerObjFunc( IYCFBamServerObjFuncObj Obj ) {
		IYCFBamServerObjFuncObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFunc( schema.getAuthorization(),
			obj.getServerObjFuncBuff() );
		Obj.forget();
	}

	public void deleteServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerObjFuncObj obj = readServerObjFunc( pkey );
		if( obj != null ) {
			IYCFBamServerObjFuncEditObj editObj = (IYCFBamServerObjFuncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamServerObjFuncEditObj)obj.beginEdit();
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
		deepDisposeServerObjFuncByIdIdx( TenantId,
				Id );
	}

	public void deleteServerObjFuncByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamServerObjFuncObj> iter = dict.values().iterator();
			IYCFBamServerObjFuncObj obj;
			List<IYCFBamServerObjFuncObj> toForget = new LinkedList<IYCFBamServerObjFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeServerObjFuncByTenantIdx( TenantId );
	}

	public void deleteServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerObjFuncObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerObjFuncObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeServerObjFuncByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteServerObjFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( indexByMethTableIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict = indexByMethTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamServerObjFuncObj> iter = dict.values().iterator();
			IYCFBamServerObjFuncObj obj;
			List<IYCFBamServerObjFuncObj> toForget = new LinkedList<IYCFBamServerObjFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeServerObjFuncByMethTableIdx( TenantId,
				TableId );
	}

	public void deleteServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( indexByMethTableVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict = indexByMethTableVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<IYCFBamServerObjFuncObj> iter = dict.values().iterator();
			IYCFBamServerObjFuncObj obj;
			List<IYCFBamServerObjFuncObj> toForget = new LinkedList<IYCFBamServerObjFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeServerObjFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteServerObjFuncByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( indexByMethCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict = indexByMethCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamServerObjFuncObj> iter = dict.values().iterator();
			IYCFBamServerObjFuncObj obj;
			List<IYCFBamServerObjFuncObj> toForget = new LinkedList<IYCFBamServerObjFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeServerObjFuncByMethCodeVisIdx( CodeVis );
	}

	public void deleteServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamServerObjFuncObj> iter = dict.values().iterator();
			IYCFBamServerObjFuncObj obj;
			List<IYCFBamServerObjFuncObj> toForget = new LinkedList<IYCFBamServerObjFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeServerObjFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		YCFBamServerObjFuncByRetTblIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< YCFBamServerObjFuncByRetTblIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerObjFuncObj > >();
		}
		if( indexByRetTblIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerObjFuncObj> dict = indexByRetTblIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			Iterator<IYCFBamServerObjFuncObj> iter = dict.values().iterator();
			IYCFBamServerObjFuncObj obj;
			List<IYCFBamServerObjFuncObj> toForget = new LinkedList<IYCFBamServerObjFuncObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
		}
		deepDisposeServerObjFuncByRetTblIdx( RetTenantId,
				RetTableId );
	}
}

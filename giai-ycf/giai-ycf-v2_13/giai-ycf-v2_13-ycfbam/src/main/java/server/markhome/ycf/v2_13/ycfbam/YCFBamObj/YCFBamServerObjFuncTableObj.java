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

public class CFBamServerObjFuncTableObj
	implements ICFBamServerObjFuncTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamServerObjFuncObj> members;
	private Map<CFBamScopePKey, ICFBamServerObjFuncObj> allServerObjFunc;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamServerObjFuncObj > > indexByTenantIdx;
	private Map< CFBamServerMethodByUNameIdxKey,
		ICFBamServerObjFuncObj > indexByUNameIdx;
	private Map< CFBamServerMethodByMethTableIdxKey,
		Map<CFBamScopePKey, ICFBamServerObjFuncObj > > indexByMethTableIdx;
	private Map< CFBamServerMethodByMethTableVisIdxKey,
		Map<CFBamScopePKey, ICFBamServerObjFuncObj > > indexByMethTableVisIdx;
	private Map< CFBamServerMethodByMethCodeVisIdxKey,
		Map<CFBamScopePKey, ICFBamServerObjFuncObj > > indexByMethCodeVisIdx;
	private Map< CFBamServerMethodByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamServerObjFuncObj > > indexByDefSchemaIdx;
	private Map< CFBamServerObjFuncByRetTblIdxKey,
		Map<CFBamScopePKey, ICFBamServerObjFuncObj > > indexByRetTblIdx;
	public static String TABLE_NAME = "ServerObjFunc";
	public static String TABLE_DBNAME = "srvofunc";

	public CFBamServerObjFuncTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
		allServerObjFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
	}

	public CFBamServerObjFuncTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
		allServerObjFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
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
		allServerObjFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
		List<ICFBamServerObjFuncObj> toForget = new LinkedList<ICFBamServerObjFuncObj>();
		ICFBamServerObjFuncObj cur = null;
		Iterator<ICFBamServerObjFuncObj> iter = members.values().iterator();
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
	 *	CFBamServerObjFuncObj.
	 */
	public ICFBamServerObjFuncObj newInstance() {
		ICFBamServerObjFuncObj inst = new CFBamServerObjFuncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamServerObjFuncObj.
	 */
	public ICFBamServerObjFuncEditObj newEditInstance( ICFBamServerObjFuncObj orig ) {
		ICFBamServerObjFuncEditObj edit = new CFBamServerObjFuncEditObj( orig );
		return( edit );
	}

	public ICFBamServerObjFuncObj realiseServerObjFunc( ICFBamServerObjFuncObj Obj ) {
		ICFBamServerObjFuncObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamServerObjFuncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamServerObjFuncObj existingObj = members.get( pkey );
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
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamServerMethodByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByMethTableIdx != null ) {
				CFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					indexByMethTableIdx.remove( keyMethTableIdx );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				CFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					indexByMethTableVisIdx.remove( keyMethTableVisIdx );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByRetTblIdx != null ) {
				CFBamServerObjFuncByRetTblIdxKey keyRetTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
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
			keepObj = (ICFBamServerObjFuncObj)schema.getServerMethodTableObj().realiseServerMethod( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamServerMethodByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				CFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				CFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				CFBamServerObjFuncByRetTblIdxKey keyRetTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
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
			keepObj = (ICFBamServerObjFuncObj)schema.getServerMethodTableObj().realiseServerMethod( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServerObjFunc != null ) {
				allServerObjFunc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamServerMethodByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				CFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				CFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				CFBamServerObjFuncByRetTblIdxKey keyRetTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<CFBamScopePKey, ICFBamServerObjFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
				if( mapRetTblIdx != null ) {
					mapRetTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamServerObjFuncObj createServerObjFunc( ICFBamServerObjFuncObj Obj ) {
		ICFBamServerObjFuncObj obj = Obj;
		CFBamServerObjFuncBuff buff = obj.getServerObjFuncBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().createServerObjFunc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a805" ) ) {
			obj = (ICFBamServerObjFuncObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamServerObjFuncObj readServerObjFunc( CFBamScopePKey pkey ) {
		return( readServerObjFunc( pkey, false ) );
	}

	public ICFBamServerObjFuncObj readServerObjFunc( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamServerObjFuncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamServerObjFuncBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamServerObjFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamServerObjFuncObj readCachedServerObjFunc( CFBamScopePKey pkey ) {
		ICFBamServerObjFuncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServerObjFunc( ICFBamServerObjFuncObj obj )
	{
		final String S_ProcName = "CFBamServerObjFuncTableObj.reallyDeepDisposeServerObjFunc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamServerObjFuncObj existing = readCachedServerObjFunc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamServerObjFuncByRetTblIdxKey keyRetTblIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
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
	public void deepDisposeServerObjFunc( CFBamScopePKey pkey ) {
		ICFBamServerObjFuncObj obj = readCachedServerObjFunc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamServerObjFuncObj lockServerObjFunc( CFBamScopePKey pkey ) {
		ICFBamServerObjFuncObj locked = null;
		CFBamServerObjFuncBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamServerObjFuncObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockServerObjFunc", pkey );
		}
		return( locked );
	}

	public List<ICFBamServerObjFuncObj> readAllServerObjFunc() {
		return( readAllServerObjFunc( false ) );
	}

	public List<ICFBamServerObjFuncObj> readAllServerObjFunc( boolean forceRead ) {
		final String S_ProcName = "readAllServerObjFunc";
		if( ( allServerObjFunc == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> map = new HashMap<CFBamScopePKey,ICFBamServerObjFuncObj>();
			allServerObjFunc = map;
			CFBamServerObjFuncBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().readAllDerived( schema.getAuthorization() );
			CFBamServerObjFuncBuff buff;
			ICFBamServerObjFuncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerObjFuncObj realised = (ICFBamServerObjFuncObj)obj.realise();
			}
		}
		int len = allServerObjFunc.size();
		ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
		Iterator<ICFBamServerObjFuncObj> valIter = allServerObjFunc.values().iterator();
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
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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
		List<ICFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerObjFuncObj> readCachedAllServerObjFunc() {
		final String S_ProcName = "readCachedAllServerObjFunc";
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>();
		if( allServerObjFunc != null ) {
			int len = allServerObjFunc.size();
			ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
			Iterator<ICFBamServerObjFuncObj> valIter = allServerObjFunc.values().iterator();
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
		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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

	public ICFBamServerObjFuncObj readServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		return( readServerObjFuncByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamServerObjFuncObj readServerObjFuncByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamServerObjFuncObj obj = readServerObjFunc( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByTenantIdx( long TenantId )
	{
		return( readServerObjFuncByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerObjFuncObj realised = (ICFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
		Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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
		List<ICFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamServerObjFuncObj readServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readServerObjFuncByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public ICFBamServerObjFuncObj readServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamServerMethodByUNameIdxKey,
				ICFBamServerObjFuncObj >();
		}
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamServerObjFuncObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamServerMethodBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamServerObjFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		return( readServerObjFuncByMethTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByMethTableIdx";
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< CFBamServerMethodByMethTableIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableIdx.containsKey( key ) ) {
			dict = indexByMethTableIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerObjFuncObj realised = (ICFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
		Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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
		List<ICFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerObjFuncByMethTableVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByMethTableVisIdx";
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< CFBamServerMethodByMethTableVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableVisIdx.containsKey( key ) ) {
			dict = indexByMethTableVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerObjFuncObj realised = (ICFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
		Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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
		List<ICFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerObjFuncByMethCodeVisIdx( CodeVis,
			false ) );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByMethCodeVisIdx";
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< CFBamServerMethodByMethCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethCodeVisIdx.containsKey( key ) ) {
			dict = indexByMethCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerObjFuncObj realised = (ICFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
		Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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
		List<ICFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readServerObjFuncByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByDefSchemaIdx";
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamServerMethodByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerObjFuncObj realised = (ICFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
		Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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
		List<ICFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		return( readServerObjFuncByRetTblIdx( RetTenantId,
			RetTableId,
			false ) );
	}

	public List<ICFBamServerObjFuncObj> readServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerObjFuncByRetTblIdx";
		CFBamServerObjFuncByRetTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< CFBamServerObjFuncByRetTblIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( ( ! forceRead ) && indexByRetTblIdx.containsKey( key ) ) {
			dict = indexByRetTblIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerObjFuncObj>();
			ICFBamServerObjFuncObj obj;
			CFBamServerObjFuncBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().readDerivedByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			CFBamServerObjFuncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerObjFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerObjFuncObj realised = (ICFBamServerObjFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRetTblIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
		Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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
		List<ICFBamServerObjFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamServerObjFuncObj readCachedServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		ICFBamServerObjFuncObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedServerObjFunc( pkey );
		return( obj );
	}

	public List<ICFBamServerObjFuncObj> readCachedServerObjFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedServerObjFuncByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
				Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerObjFuncObj obj;
			Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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

	public ICFBamServerObjFuncObj readCachedServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamServerObjFuncObj obj = null;
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
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
			Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
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

	public List<ICFBamServerObjFuncObj> readCachedServerObjFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedServerObjFuncByMethTableIdx";
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>();
		if( indexByMethTableIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
			if( indexByMethTableIdx.containsKey( key ) ) {
				dict = indexByMethTableIdx.get( key );
				int len = dict.size();
				ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
				Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerObjFuncObj obj;
			Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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

	public List<ICFBamServerObjFuncObj> readCachedServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerObjFuncByMethTableVisIdx";
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>();
		if( indexByMethTableVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
			if( indexByMethTableVisIdx.containsKey( key ) ) {
				dict = indexByMethTableVisIdx.get( key );
				int len = dict.size();
				ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
				Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerObjFuncObj obj;
			Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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

	public List<ICFBamServerObjFuncObj> readCachedServerObjFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerObjFuncByMethCodeVisIdx";
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>();
		if( indexByMethCodeVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
			if( indexByMethCodeVisIdx.containsKey( key ) ) {
				dict = indexByMethCodeVisIdx.get( key );
				int len = dict.size();
				ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
				Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerObjFuncObj obj;
			Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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

	public List<ICFBamServerObjFuncObj> readCachedServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedServerObjFuncByDefSchemaIdx";
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
				Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerObjFuncObj obj;
			Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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

	public List<ICFBamServerObjFuncObj> readCachedServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "readCachedServerObjFuncByRetTblIdx";
		CFBamServerObjFuncByRetTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		ArrayList<ICFBamServerObjFuncObj> arrayList = new ArrayList<ICFBamServerObjFuncObj>();
		if( indexByRetTblIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict;
			if( indexByRetTblIdx.containsKey( key ) ) {
				dict = indexByRetTblIdx.get( key );
				int len = dict.size();
				ICFBamServerObjFuncObj arr[] = new ICFBamServerObjFuncObj[len];
				Iterator<ICFBamServerObjFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerObjFuncObj obj;
			Iterator<ICFBamServerObjFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerObjFuncObj> cmp = new Comparator<ICFBamServerObjFuncObj>() {
			public int compare( ICFBamServerObjFuncObj lhs, ICFBamServerObjFuncObj rhs ) {
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

	public void deepDisposeServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		ICFBamServerObjFuncObj obj = readCachedServerObjFuncByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerObjFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByTenantIdx";
		ICFBamServerObjFuncObj obj;
		List<ICFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamServerObjFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamServerObjFuncObj obj = readCachedServerObjFuncByUNameIdx( TenantId,
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
		ICFBamServerObjFuncObj obj;
		List<ICFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByMethTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<ICFBamServerObjFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByMethTableVisIdx";
		ICFBamServerObjFuncObj obj;
		List<ICFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerObjFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerObjFuncByMethCodeVisIdx";
		ICFBamServerObjFuncObj obj;
		List<ICFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByMethCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamServerObjFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamServerObjFuncObj obj;
		List<ICFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamServerObjFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamServerObjFuncObj obj;
		List<ICFBamServerObjFuncObj> arrayList = readCachedServerObjFuncByRetTblIdx( RetTenantId,
				RetTableId );
		if( arrayList != null )  {
			Iterator<ICFBamServerObjFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamServerObjFuncObj updateServerObjFunc( ICFBamServerObjFuncObj Obj ) {
		ICFBamServerObjFuncObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().updateServerObjFunc( schema.getAuthorization(),
			Obj.getServerObjFuncBuff() );
		if( Obj.getClassCode().equals( "a805" ) ) {
			obj = (ICFBamServerObjFuncObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteServerObjFunc( ICFBamServerObjFuncObj Obj ) {
		ICFBamServerObjFuncObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFunc( schema.getAuthorization(),
			obj.getServerObjFuncBuff() );
		Obj.forget();
	}

	public void deleteServerObjFuncByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamServerObjFuncObj obj = readServerObjFunc( pkey );
		if( obj != null ) {
			ICFBamServerObjFuncEditObj editObj = (ICFBamServerObjFuncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamServerObjFuncEditObj)obj.beginEdit();
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
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamServerObjFuncObj> iter = dict.values().iterator();
			ICFBamServerObjFuncObj obj;
			List<ICFBamServerObjFuncObj> toForget = new LinkedList<ICFBamServerObjFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeServerObjFuncByTenantIdx( TenantId );
	}

	public void deleteServerObjFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamServerMethodByUNameIdxKey,
				ICFBamServerObjFuncObj >();
		}
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamServerObjFuncObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByUNameIdx( schema.getAuthorization(),
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
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< CFBamServerMethodByMethTableIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( indexByMethTableIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict = indexByMethTableIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<ICFBamServerObjFuncObj> iter = dict.values().iterator();
			ICFBamServerObjFuncObj obj;
			List<ICFBamServerObjFuncObj> toForget = new LinkedList<ICFBamServerObjFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeServerObjFuncByMethTableIdx( TenantId,
				TableId );
	}

	public void deleteServerObjFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< CFBamServerMethodByMethTableVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( indexByMethTableVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict = indexByMethTableVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<ICFBamServerObjFuncObj> iter = dict.values().iterator();
			ICFBamServerObjFuncObj obj;
			List<ICFBamServerObjFuncObj> toForget = new LinkedList<ICFBamServerObjFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeServerObjFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteServerObjFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< CFBamServerMethodByMethCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( indexByMethCodeVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict = indexByMethCodeVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<ICFBamServerObjFuncObj> iter = dict.values().iterator();
			ICFBamServerObjFuncObj obj;
			List<ICFBamServerObjFuncObj> toForget = new LinkedList<ICFBamServerObjFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeServerObjFuncByMethCodeVisIdx( CodeVis );
	}

	public void deleteServerObjFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamServerMethodByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamServerObjFuncObj> iter = dict.values().iterator();
			ICFBamServerObjFuncObj obj;
			List<ICFBamServerObjFuncObj> toForget = new LinkedList<ICFBamServerObjFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeServerObjFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteServerObjFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		CFBamServerObjFuncByRetTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerObjFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< CFBamServerObjFuncByRetTblIdxKey,
				Map< CFBamScopePKey, ICFBamServerObjFuncObj > >();
		}
		if( indexByRetTblIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerObjFuncObj> dict = indexByRetTblIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			Iterator<ICFBamServerObjFuncObj> iter = dict.values().iterator();
			ICFBamServerObjFuncObj obj;
			List<ICFBamServerObjFuncObj> toForget = new LinkedList<ICFBamServerObjFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerObjFunc().deleteServerObjFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
		}
		deepDisposeServerObjFuncByRetTblIdx( RetTenantId,
				RetTableId );
	}
}
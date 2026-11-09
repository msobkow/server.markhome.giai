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

public class CFBamServerListFuncTableObj
	implements ICFBamServerListFuncTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamServerListFuncObj> members;
	private Map<CFBamScopePKey, ICFBamServerListFuncObj> allServerListFunc;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamServerListFuncObj > > indexByTenantIdx;
	private Map< CFBamServerMethodByUNameIdxKey,
		ICFBamServerListFuncObj > indexByUNameIdx;
	private Map< CFBamServerMethodByMethTableIdxKey,
		Map<CFBamScopePKey, ICFBamServerListFuncObj > > indexByMethTableIdx;
	private Map< CFBamServerMethodByMethTableVisIdxKey,
		Map<CFBamScopePKey, ICFBamServerListFuncObj > > indexByMethTableVisIdx;
	private Map< CFBamServerMethodByMethCodeVisIdxKey,
		Map<CFBamScopePKey, ICFBamServerListFuncObj > > indexByMethCodeVisIdx;
	private Map< CFBamServerMethodByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamServerListFuncObj > > indexByDefSchemaIdx;
	private Map< CFBamServerListFuncByRetTblIdxKey,
		Map<CFBamScopePKey, ICFBamServerListFuncObj > > indexByRetTblIdx;
	public static String TABLE_NAME = "ServerListFunc";
	public static String TABLE_DBNAME = "srvlfunc";

	public CFBamServerListFuncTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
		allServerListFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
	}

	public CFBamServerListFuncTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
		allServerListFunc = null;
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
		allServerListFunc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		indexByRetTblIdx = null;
		List<ICFBamServerListFuncObj> toForget = new LinkedList<ICFBamServerListFuncObj>();
		ICFBamServerListFuncObj cur = null;
		Iterator<ICFBamServerListFuncObj> iter = members.values().iterator();
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
	 *	CFBamServerListFuncObj.
	 */
	public ICFBamServerListFuncObj newInstance() {
		ICFBamServerListFuncObj inst = new CFBamServerListFuncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamServerListFuncObj.
	 */
	public ICFBamServerListFuncEditObj newEditInstance( ICFBamServerListFuncObj orig ) {
		ICFBamServerListFuncEditObj edit = new CFBamServerListFuncEditObj( orig );
		return( edit );
	}

	public ICFBamServerListFuncObj realiseServerListFunc( ICFBamServerListFuncObj Obj ) {
		ICFBamServerListFuncObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamServerListFuncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamServerListFuncObj existingObj = members.get( pkey );
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
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					indexByMethTableVisIdx.remove( keyMethTableVisIdx );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByRetTblIdx != null ) {
				CFBamServerListFuncByRetTblIdxKey keyRetTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
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
			keepObj = (ICFBamServerListFuncObj)schema.getServerMethodTableObj().realiseServerMethod( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				CFBamServerListFuncByRetTblIdxKey keyRetTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
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
			keepObj = (ICFBamServerListFuncObj)schema.getServerMethodTableObj().realiseServerMethod( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServerListFunc != null ) {
				allServerListFunc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRetTblIdx != null ) {
				CFBamServerListFuncByRetTblIdxKey keyRetTblIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
				keyRetTblIdx.setOptionalRetTenantId( keepObj.getOptionalRetTenantId() );
				keyRetTblIdx.setOptionalRetTableId( keepObj.getOptionalRetTableId() );
				Map<CFBamScopePKey, ICFBamServerListFuncObj > mapRetTblIdx = indexByRetTblIdx.get( keyRetTblIdx );
				if( mapRetTblIdx != null ) {
					mapRetTblIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamServerListFuncObj createServerListFunc( ICFBamServerListFuncObj Obj ) {
		ICFBamServerListFuncObj obj = Obj;
		CFBamServerListFuncBuff buff = obj.getServerListFuncBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().createServerListFunc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a83a" ) ) {
			obj = (ICFBamServerListFuncObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamServerListFuncObj readServerListFunc( CFBamScopePKey pkey ) {
		return( readServerListFunc( pkey, false ) );
	}

	public ICFBamServerListFuncObj readServerListFunc( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamServerListFuncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamServerListFuncBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamServerListFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamServerListFuncObj readCachedServerListFunc( CFBamScopePKey pkey ) {
		ICFBamServerListFuncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServerListFunc( ICFBamServerListFuncObj obj )
	{
		final String S_ProcName = "CFBamServerListFuncTableObj.reallyDeepDisposeServerListFunc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamServerListFuncObj existing = readCachedServerListFunc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamServerListFuncByRetTblIdxKey keyRetTblIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
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
	public void deepDisposeServerListFunc( CFBamScopePKey pkey ) {
		ICFBamServerListFuncObj obj = readCachedServerListFunc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamServerListFuncObj lockServerListFunc( CFBamScopePKey pkey ) {
		ICFBamServerListFuncObj locked = null;
		CFBamServerListFuncBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamServerListFuncObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockServerListFunc", pkey );
		}
		return( locked );
	}

	public List<ICFBamServerListFuncObj> readAllServerListFunc() {
		return( readAllServerListFunc( false ) );
	}

	public List<ICFBamServerListFuncObj> readAllServerListFunc( boolean forceRead ) {
		final String S_ProcName = "readAllServerListFunc";
		if( ( allServerListFunc == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> map = new HashMap<CFBamScopePKey,ICFBamServerListFuncObj>();
			allServerListFunc = map;
			CFBamServerListFuncBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().readAllDerived( schema.getAuthorization() );
			CFBamServerListFuncBuff buff;
			ICFBamServerListFuncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerListFuncObj realised = (ICFBamServerListFuncObj)obj.realise();
			}
		}
		int len = allServerListFunc.size();
		ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
		Iterator<ICFBamServerListFuncObj> valIter = allServerListFunc.values().iterator();
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
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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
		List<ICFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerListFuncObj> readCachedAllServerListFunc() {
		final String S_ProcName = "readCachedAllServerListFunc";
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>();
		if( allServerListFunc != null ) {
			int len = allServerListFunc.size();
			ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
			Iterator<ICFBamServerListFuncObj> valIter = allServerListFunc.values().iterator();
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
		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	public ICFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		return( readServerListFuncByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamServerListFuncObj readServerListFuncByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamServerListFuncObj obj = readServerListFunc( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId )
	{
		return( readServerListFuncByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerListFuncObj realised = (ICFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
		Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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
		List<ICFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readServerListFuncByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public ICFBamServerListFuncObj readServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamServerMethodByUNameIdxKey,
				ICFBamServerListFuncObj >();
		}
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamServerListFuncObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamServerMethodBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamServerListFuncObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		return( readServerListFuncByMethTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByMethTableIdx";
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< CFBamServerMethodByMethTableIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableIdx.containsKey( key ) ) {
			dict = indexByMethTableIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerListFuncObj realised = (ICFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
		Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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
		List<ICFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerListFuncByMethTableVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByMethTableVisIdx";
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< CFBamServerMethodByMethTableVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableVisIdx.containsKey( key ) ) {
			dict = indexByMethTableVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerListFuncObj realised = (ICFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
		Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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
		List<ICFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerListFuncByMethCodeVisIdx( CodeVis,
			false ) );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByMethCodeVisIdx";
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< CFBamServerMethodByMethCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByMethCodeVisIdx.containsKey( key ) ) {
			dict = indexByMethCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerListFuncObj realised = (ICFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
		Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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
		List<ICFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readServerListFuncByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByDefSchemaIdx";
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamServerMethodByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerListFuncObj realised = (ICFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
		Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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
		List<ICFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		return( readServerListFuncByRetTblIdx( RetTenantId,
			RetTableId,
			false ) );
	}

	public List<ICFBamServerListFuncObj> readServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerListFuncByRetTblIdx";
		CFBamServerListFuncByRetTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< CFBamServerListFuncByRetTblIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( ( ! forceRead ) && indexByRetTblIdx.containsKey( key ) ) {
			dict = indexByRetTblIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerListFuncObj>();
			ICFBamServerListFuncObj obj;
			CFBamServerListFuncBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().readDerivedByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			CFBamServerListFuncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerListFuncObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerListFuncObj realised = (ICFBamServerListFuncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRetTblIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
		Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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
		List<ICFBamServerListFuncObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamServerListFuncObj readCachedServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		ICFBamServerListFuncObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedServerListFunc( pkey );
		return( obj );
	}

	public List<ICFBamServerListFuncObj> readCachedServerListFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedServerListFuncByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
				Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerListFuncObj obj;
			Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	public ICFBamServerListFuncObj readCachedServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamServerListFuncObj obj = null;
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
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
			Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
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

	public List<ICFBamServerListFuncObj> readCachedServerListFuncByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedServerListFuncByMethTableIdx";
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>();
		if( indexByMethTableIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
			if( indexByMethTableIdx.containsKey( key ) ) {
				dict = indexByMethTableIdx.get( key );
				int len = dict.size();
				ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
				Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerListFuncObj obj;
			Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	public List<ICFBamServerListFuncObj> readCachedServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerListFuncByMethTableVisIdx";
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>();
		if( indexByMethTableVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
			if( indexByMethTableVisIdx.containsKey( key ) ) {
				dict = indexByMethTableVisIdx.get( key );
				int len = dict.size();
				ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
				Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerListFuncObj obj;
			Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	public List<ICFBamServerListFuncObj> readCachedServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerListFuncByMethCodeVisIdx";
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>();
		if( indexByMethCodeVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
			if( indexByMethCodeVisIdx.containsKey( key ) ) {
				dict = indexByMethCodeVisIdx.get( key );
				int len = dict.size();
				ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
				Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerListFuncObj obj;
			Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	public List<ICFBamServerListFuncObj> readCachedServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedServerListFuncByDefSchemaIdx";
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
				Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerListFuncObj obj;
			Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	public List<ICFBamServerListFuncObj> readCachedServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		final String S_ProcName = "readCachedServerListFuncByRetTblIdx";
		CFBamServerListFuncByRetTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		ArrayList<ICFBamServerListFuncObj> arrayList = new ArrayList<ICFBamServerListFuncObj>();
		if( indexByRetTblIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict;
			if( indexByRetTblIdx.containsKey( key ) ) {
				dict = indexByRetTblIdx.get( key );
				int len = dict.size();
				ICFBamServerListFuncObj arr[] = new ICFBamServerListFuncObj[len];
				Iterator<ICFBamServerListFuncObj> valIter = dict.values().iterator();
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
			ICFBamServerListFuncObj obj;
			Iterator<ICFBamServerListFuncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerListFuncObj> cmp = new Comparator<ICFBamServerListFuncObj>() {
			public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	public void deepDisposeServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		ICFBamServerListFuncObj obj = readCachedServerListFuncByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerListFuncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeServerListFuncByTenantIdx";
		ICFBamServerListFuncObj obj;
		List<ICFBamServerListFuncObj> arrayList = readCachedServerListFuncByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamServerListFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamServerListFuncObj obj = readCachedServerListFuncByUNameIdx( TenantId,
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
		ICFBamServerListFuncObj obj;
		List<ICFBamServerListFuncObj> arrayList = readCachedServerListFuncByMethTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<ICFBamServerListFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerListFuncByMethTableVisIdx";
		ICFBamServerListFuncObj obj;
		List<ICFBamServerListFuncObj> arrayList = readCachedServerListFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerListFuncByMethCodeVisIdx";
		ICFBamServerListFuncObj obj;
		List<ICFBamServerListFuncObj> arrayList = readCachedServerListFuncByMethCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamServerListFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamServerListFuncObj obj;
		List<ICFBamServerListFuncObj> arrayList = readCachedServerListFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamServerListFuncObj> arrayIter = arrayList.iterator();
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
		ICFBamServerListFuncObj obj;
		List<ICFBamServerListFuncObj> arrayList = readCachedServerListFuncByRetTblIdx( RetTenantId,
				RetTableId );
		if( arrayList != null )  {
			Iterator<ICFBamServerListFuncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamServerListFuncObj updateServerListFunc( ICFBamServerListFuncObj Obj ) {
		ICFBamServerListFuncObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().updateServerListFunc( schema.getAuthorization(),
			Obj.getServerListFuncBuff() );
		if( Obj.getClassCode().equals( "a83a" ) ) {
			obj = (ICFBamServerListFuncObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteServerListFunc( ICFBamServerListFuncObj Obj ) {
		ICFBamServerListFuncObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFunc( schema.getAuthorization(),
			obj.getServerListFuncBuff() );
		Obj.forget();
	}

	public void deleteServerListFuncByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamServerListFuncObj obj = readServerListFunc( pkey );
		if( obj != null ) {
			ICFBamServerListFuncEditObj editObj = (ICFBamServerListFuncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamServerListFuncEditObj)obj.beginEdit();
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
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamServerListFuncObj> iter = dict.values().iterator();
			ICFBamServerListFuncObj obj;
			List<ICFBamServerListFuncObj> toForget = new LinkedList<ICFBamServerListFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeServerListFuncByTenantIdx( TenantId );
	}

	public void deleteServerListFuncByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamServerMethodByUNameIdxKey,
				ICFBamServerListFuncObj >();
		}
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamServerListFuncObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByUNameIdx( schema.getAuthorization(),
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
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< CFBamServerMethodByMethTableIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( indexByMethTableIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict = indexByMethTableIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<ICFBamServerListFuncObj> iter = dict.values().iterator();
			ICFBamServerListFuncObj obj;
			List<ICFBamServerListFuncObj> toForget = new LinkedList<ICFBamServerListFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeServerListFuncByMethTableIdx( TenantId,
				TableId );
	}

	public void deleteServerListFuncByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< CFBamServerMethodByMethTableVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( indexByMethTableVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict = indexByMethTableVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<ICFBamServerListFuncObj> iter = dict.values().iterator();
			ICFBamServerListFuncObj obj;
			List<ICFBamServerListFuncObj> toForget = new LinkedList<ICFBamServerListFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeServerListFuncByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteServerListFuncByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< CFBamServerMethodByMethCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( indexByMethCodeVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict = indexByMethCodeVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<ICFBamServerListFuncObj> iter = dict.values().iterator();
			ICFBamServerListFuncObj obj;
			List<ICFBamServerListFuncObj> toForget = new LinkedList<ICFBamServerListFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeServerListFuncByMethCodeVisIdx( CodeVis );
	}

	public void deleteServerListFuncByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamServerMethodByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamServerListFuncObj> iter = dict.values().iterator();
			ICFBamServerListFuncObj obj;
			List<ICFBamServerListFuncObj> toForget = new LinkedList<ICFBamServerListFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeServerListFuncByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteServerListFuncByRetTblIdx( Long RetTenantId,
		Long RetTableId )
	{
		CFBamServerListFuncByRetTblIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerListFunc().newRetTblIdxKey();
		key.setOptionalRetTenantId( RetTenantId );
		key.setOptionalRetTableId( RetTableId );
		if( indexByRetTblIdx == null ) {
			indexByRetTblIdx = new HashMap< CFBamServerListFuncByRetTblIdxKey,
				Map< CFBamScopePKey, ICFBamServerListFuncObj > >();
		}
		if( indexByRetTblIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerListFuncObj> dict = indexByRetTblIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
			Iterator<ICFBamServerListFuncObj> iter = dict.values().iterator();
			ICFBamServerListFuncObj obj;
			List<ICFBamServerListFuncObj> toForget = new LinkedList<ICFBamServerListFuncObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerListFunc().deleteServerListFuncByRetTblIdx( schema.getAuthorization(),
				RetTenantId,
				RetTableId );
		}
		deepDisposeServerListFuncByRetTblIdx( RetTenantId,
				RetTableId );
	}
}
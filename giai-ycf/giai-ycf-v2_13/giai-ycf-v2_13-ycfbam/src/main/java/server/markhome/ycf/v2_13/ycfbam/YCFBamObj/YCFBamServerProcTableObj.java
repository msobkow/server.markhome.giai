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

public class YCFBamServerProcTableObj
	implements IYCFBamServerProcTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamServerProcObj> members;
	private Map<YCFBamScopePKey, IYCFBamServerProcObj> allServerProc;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerProcObj > > indexByTenantIdx;
	private Map< YCFBamServerMethodByUNameIdxKey,
		IYCFBamServerProcObj > indexByUNameIdx;
	private Map< YCFBamServerMethodByMethTableIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerProcObj > > indexByMethTableIdx;
	private Map< YCFBamServerMethodByMethTableVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerProcObj > > indexByMethTableVisIdx;
	private Map< YCFBamServerMethodByMethCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerProcObj > > indexByMethCodeVisIdx;
	private Map< YCFBamServerMethodByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerProcObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "ServerProc";
	public static String TABLE_DBNAME = "srvprc";

	public YCFBamServerProcTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerProcObj>();
		allServerProc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
	}

	public YCFBamServerProcTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerProcObj>();
		allServerProc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
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
		allServerProc = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		List<IYCFBamServerProcObj> toForget = new LinkedList<IYCFBamServerProcObj>();
		IYCFBamServerProcObj cur = null;
		Iterator<IYCFBamServerProcObj> iter = members.values().iterator();
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
	 *	YCFBamServerProcObj.
	 */
	public IYCFBamServerProcObj newInstance() {
		IYCFBamServerProcObj inst = new YCFBamServerProcObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamServerProcObj.
	 */
	public IYCFBamServerProcEditObj newEditInstance( IYCFBamServerProcObj orig ) {
		IYCFBamServerProcEditObj edit = new YCFBamServerProcEditObj( orig );
		return( edit );
	}

	public IYCFBamServerProcObj realiseServerProc( IYCFBamServerProcObj Obj ) {
		IYCFBamServerProcObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerProcObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamServerProcObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					indexByMethTableVisIdx.remove( keyMethTableVisIdx );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamServerProcObj)schema.getServerMethodTableObj().realiseServerMethod( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allServerProc != null ) {
				allServerProc.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamServerProcObj)schema.getServerMethodTableObj().realiseServerMethod( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServerProc != null ) {
				allServerProc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
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
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerProcObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamServerProcObj createServerProc( IYCFBamServerProcObj Obj ) {
		IYCFBamServerProcObj obj = Obj;
		YCFBamServerProcBuff buff = obj.getServerProcBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().createServerProc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a806" ) ) {
			obj = (IYCFBamServerProcObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamServerProcObj readServerProc( YCFBamScopePKey pkey ) {
		return( readServerProc( pkey, false ) );
	}

	public IYCFBamServerProcObj readServerProc( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamServerProcObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamServerProcBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamServerProcObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamServerProcObj readCachedServerProc( YCFBamScopePKey pkey ) {
		IYCFBamServerProcObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServerProc( IYCFBamServerProcObj obj )
	{
		final String S_ProcName = "YCFBamServerProcTableObj.reallyDeepDisposeServerProc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerProcObj existing = readCachedServerProc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );

					schema.getParamTableObj().deepDisposeParamByServerMethodIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );


		schema.getServerMethodTableObj().reallyDeepDisposeServerMethod( obj );
	}
	public void deepDisposeServerProc( YCFBamScopePKey pkey ) {
		IYCFBamServerProcObj obj = readCachedServerProc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamServerProcObj lockServerProc( YCFBamScopePKey pkey ) {
		IYCFBamServerProcObj locked = null;
		YCFBamServerProcBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamServerProcObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockServerProc", pkey );
		}
		return( locked );
	}

	public List<IYCFBamServerProcObj> readAllServerProc() {
		return( readAllServerProc( false ) );
	}

	public List<IYCFBamServerProcObj> readAllServerProc( boolean forceRead ) {
		final String S_ProcName = "readAllServerProc";
		if( ( allServerProc == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> map = new HashMap<YCFBamScopePKey,IYCFBamServerProcObj>();
			allServerProc = map;
			YCFBamServerProcBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().readAllDerived( schema.getAuthorization() );
			YCFBamServerProcBuff buff;
			IYCFBamServerProcObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerProcObj realised = (IYCFBamServerProcObj)obj.realise();
			}
		}
		int len = allServerProc.size();
		IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
		Iterator<IYCFBamServerProcObj> valIter = allServerProc.values().iterator();
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
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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
		List<IYCFBamServerProcObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerProcObj> readCachedAllServerProc() {
		final String S_ProcName = "readCachedAllServerProc";
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>();
		if( allServerProc != null ) {
			int len = allServerProc.size();
			IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
			Iterator<IYCFBamServerProcObj> valIter = allServerProc.values().iterator();
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
		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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

	public IYCFBamServerProcObj readServerProcByIdIdx( long TenantId,
		long Id )
	{
		return( readServerProcByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamServerProcObj readServerProcByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerProcObj obj = readServerProc( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamServerProcObj> readServerProcByTenantIdx( long TenantId )
	{
		return( readServerProcByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamServerProcObj> readServerProcByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerProcByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerProcObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerProcObj realised = (IYCFBamServerProcObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
		Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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
		List<IYCFBamServerProcObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerProcObj readServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readServerProcByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamServerProcObj readServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerProcObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerProcObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamServerMethodBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamServerProcObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamServerProcObj> readServerProcByMethTableIdx( long TenantId,
		long TableId )
	{
		return( readServerProcByMethTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamServerProcObj> readServerProcByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerProcByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableIdx.containsKey( key ) ) {
			dict = indexByMethTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerProcObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerProcObj realised = (IYCFBamServerProcObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
		Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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
		List<IYCFBamServerProcObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerProcObj> readServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerProcByMethTableVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamServerProcObj> readServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerProcByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableVisIdx.containsKey( key ) ) {
			dict = indexByMethTableVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerProcObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerProcObj realised = (IYCFBamServerProcObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
		Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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
		List<IYCFBamServerProcObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerProcObj> readServerProcByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerProcByMethCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamServerProcObj> readServerProcByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerProcByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( ( ! forceRead ) && indexByMethCodeVisIdx.containsKey( key ) ) {
			dict = indexByMethCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerProcObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerProcObj realised = (IYCFBamServerProcObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
		Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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
		List<IYCFBamServerProcObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerProcObj> readServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readServerProcByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamServerProcObj> readServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerProcByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerProcObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerProcObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerProcObj realised = (IYCFBamServerProcObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
		Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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
		List<IYCFBamServerProcObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerProcObj readCachedServerProcByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamServerProcObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedServerProc( pkey );
		return( obj );
	}

	public List<IYCFBamServerProcObj> readCachedServerProcByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedServerProcByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
				Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
			IYCFBamServerProcObj obj;
			Iterator<IYCFBamServerProcObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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

	public IYCFBamServerProcObj readCachedServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamServerProcObj obj = null;
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamServerProcObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamServerProcObj> valIter = members.values().iterator();
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

	public List<IYCFBamServerProcObj> readCachedServerProcByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedServerProcByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>();
		if( indexByMethTableIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
			if( indexByMethTableIdx.containsKey( key ) ) {
				dict = indexByMethTableIdx.get( key );
				int len = dict.size();
				IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
				Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
			IYCFBamServerProcObj obj;
			Iterator<IYCFBamServerProcObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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

	public List<IYCFBamServerProcObj> readCachedServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerProcByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>();
		if( indexByMethTableVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
			if( indexByMethTableVisIdx.containsKey( key ) ) {
				dict = indexByMethTableVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
				Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
			IYCFBamServerProcObj obj;
			Iterator<IYCFBamServerProcObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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

	public List<IYCFBamServerProcObj> readCachedServerProcByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerProcByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>();
		if( indexByMethCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
			if( indexByMethCodeVisIdx.containsKey( key ) ) {
				dict = indexByMethCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
				Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
			IYCFBamServerProcObj obj;
			Iterator<IYCFBamServerProcObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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

	public List<IYCFBamServerProcObj> readCachedServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedServerProcByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamServerProcObj> arrayList = new ArrayList<IYCFBamServerProcObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamServerProcObj arr[] = new IYCFBamServerProcObj[len];
				Iterator<IYCFBamServerProcObj> valIter = dict.values().iterator();
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
			IYCFBamServerProcObj obj;
			Iterator<IYCFBamServerProcObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerProcObj> cmp = new Comparator<IYCFBamServerProcObj>() {
			public int compare( IYCFBamServerProcObj lhs, IYCFBamServerProcObj rhs ) {
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

	public void deepDisposeServerProcByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamServerProcObj obj = readCachedServerProcByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerProcByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeServerProcByTenantIdx";
		IYCFBamServerProcObj obj;
		List<IYCFBamServerProcObj> arrayList = readCachedServerProcByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerProcObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamServerProcObj obj = readCachedServerProcByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerProcByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeServerProcByMethTableIdx";
		IYCFBamServerProcObj obj;
		List<IYCFBamServerProcObj> arrayList = readCachedServerProcByMethTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerProcObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerProcByMethTableVisIdx";
		IYCFBamServerProcObj obj;
		List<IYCFBamServerProcObj> arrayList = readCachedServerProcByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerProcObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerProcByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerProcByMethCodeVisIdx";
		IYCFBamServerProcObj obj;
		List<IYCFBamServerProcObj> arrayList = readCachedServerProcByMethCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerProcObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeServerProcByDefSchemaIdx";
		IYCFBamServerProcObj obj;
		List<IYCFBamServerProcObj> arrayList = readCachedServerProcByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerProcObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamServerProcObj updateServerProc( IYCFBamServerProcObj Obj ) {
		IYCFBamServerProcObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().updateServerProc( schema.getAuthorization(),
			Obj.getServerProcBuff() );
		if( Obj.getClassCode().equals( "a806" ) ) {
			obj = (IYCFBamServerProcObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteServerProc( IYCFBamServerProcObj Obj ) {
		IYCFBamServerProcObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProc( schema.getAuthorization(),
			obj.getServerProcBuff() );
		Obj.forget();
	}

	public void deleteServerProcByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerProcObj obj = readServerProc( pkey );
		if( obj != null ) {
			IYCFBamServerProcEditObj editObj = (IYCFBamServerProcEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamServerProcEditObj)obj.beginEdit();
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
		deepDisposeServerProcByIdIdx( TenantId,
				Id );
	}

	public void deleteServerProcByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamServerProcObj> iter = dict.values().iterator();
			IYCFBamServerProcObj obj;
			List<IYCFBamServerProcObj> toForget = new LinkedList<IYCFBamServerProcObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeServerProcByTenantIdx( TenantId );
	}

	public void deleteServerProcByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerProcObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerProcObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeServerProcByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteServerProcByMethTableIdx( long TenantId,
		long TableId )
	{
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( indexByMethTableIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict = indexByMethTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamServerProcObj> iter = dict.values().iterator();
			IYCFBamServerProcObj obj;
			List<IYCFBamServerProcObj> toForget = new LinkedList<IYCFBamServerProcObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeServerProcByMethTableIdx( TenantId,
				TableId );
	}

	public void deleteServerProcByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( indexByMethTableVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict = indexByMethTableVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<IYCFBamServerProcObj> iter = dict.values().iterator();
			IYCFBamServerProcObj obj;
			List<IYCFBamServerProcObj> toForget = new LinkedList<IYCFBamServerProcObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeServerProcByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteServerProcByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( indexByMethCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict = indexByMethCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamServerProcObj> iter = dict.values().iterator();
			IYCFBamServerProcObj obj;
			List<IYCFBamServerProcObj> toForget = new LinkedList<IYCFBamServerProcObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeServerProcByMethCodeVisIdx( CodeVis );
	}

	public void deleteServerProcByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerProcObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerProcObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamServerProcObj> iter = dict.values().iterator();
			IYCFBamServerProcObj obj;
			List<IYCFBamServerProcObj> toForget = new LinkedList<IYCFBamServerProcObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerProc().deleteServerProcByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeServerProcByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}

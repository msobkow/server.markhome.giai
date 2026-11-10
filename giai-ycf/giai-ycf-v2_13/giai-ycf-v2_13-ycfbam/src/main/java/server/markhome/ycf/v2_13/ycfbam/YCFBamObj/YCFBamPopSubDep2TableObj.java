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

public class YCFBamPopSubDep2TableObj
	implements IYCFBamPopSubDep2TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> members;
	private Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> allPopSubDep2;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > > indexByTenantIdx;
	private Map< YCFBamPopDepByRelationIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > > indexByRelationIdx;
	private Map< YCFBamPopDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > > indexByDefSchemaIdx;
	private Map< YCFBamPopSubDep2ByPopSubDep1IdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > > indexByPopSubDep1Idx;
	private Map< YCFBamPopSubDep2ByUNameIdxKey,
		IYCFBamPopSubDep2Obj > indexByUNameIdx;
	public static String TABLE_NAME = "PopSubDep2";
	public static String TABLE_DBNAME = "popsubdep2";

	public YCFBamPopSubDep2TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep2Obj>();
		allPopSubDep2 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep1Idx = null;
		indexByUNameIdx = null;
	}

	public YCFBamPopSubDep2TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep2Obj>();
		allPopSubDep2 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep1Idx = null;
		indexByUNameIdx = null;
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
		allPopSubDep2 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep1Idx = null;
		indexByUNameIdx = null;
		List<IYCFBamPopSubDep2Obj> toForget = new LinkedList<IYCFBamPopSubDep2Obj>();
		IYCFBamPopSubDep2Obj cur = null;
		Iterator<IYCFBamPopSubDep2Obj> iter = members.values().iterator();
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
	 *	YCFBamPopSubDep2Obj.
	 */
	public IYCFBamPopSubDep2Obj newInstance() {
		IYCFBamPopSubDep2Obj inst = new YCFBamPopSubDep2Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamPopSubDep2Obj.
	 */
	public IYCFBamPopSubDep2EditObj newEditInstance( IYCFBamPopSubDep2Obj orig ) {
		IYCFBamPopSubDep2EditObj edit = new YCFBamPopSubDep2EditObj( orig );
		return( edit );
	}

	public IYCFBamPopSubDep2Obj realisePopSubDep2( IYCFBamPopSubDep2Obj Obj ) {
		IYCFBamPopSubDep2Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopSubDep2Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamPopSubDep2Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					indexByRelationIdx.remove( keyRelationIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPopSubDep1Idx != null ) {
				YCFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
				keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyPopSubDep1Idx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapPopSubDep1Idx = indexByPopSubDep1Idx.get( keyPopSubDep1Idx );
				if( mapPopSubDep1Idx != null ) {
					mapPopSubDep1Idx.remove( keepObj.getPKey() );
					if( mapPopSubDep1Idx.size() <= 0 ) {
						indexByPopSubDep1Idx.remove( keyPopSubDep1Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyUNameIdx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamPopSubDep2Obj)schema.getPopDepTableObj().realisePopDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep1Idx != null ) {
				YCFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
				keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyPopSubDep1Idx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapPopSubDep1Idx = indexByPopSubDep1Idx.get( keyPopSubDep1Idx );
				if( mapPopSubDep1Idx != null ) {
					mapPopSubDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyUNameIdx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allPopSubDep2 != null ) {
				allPopSubDep2.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamPopSubDep2Obj)schema.getPopDepTableObj().realisePopDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allPopSubDep2 != null ) {
				allPopSubDep2.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep1Idx != null ) {
				YCFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
				keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyPopSubDep1Idx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj > mapPopSubDep1Idx = indexByPopSubDep1Idx.get( keyPopSubDep1Idx );
				if( mapPopSubDep1Idx != null ) {
					mapPopSubDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep1TenantId( keepObj.getRequiredPopSubDep1TenantId() );
				keyUNameIdx.setRequiredPopSubDep1Id( keepObj.getRequiredPopSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamPopSubDep2Obj createPopSubDep2( IYCFBamPopSubDep2Obj Obj ) {
		IYCFBamPopSubDep2Obj obj = Obj;
		YCFBamPopSubDep2Buff buff = obj.getPopSubDep2Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().createPopSubDep2(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a835" ) ) {
			obj = (IYCFBamPopSubDep2Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamPopSubDep2Obj readPopSubDep2( YCFBamScopePKey pkey ) {
		return( readPopSubDep2( pkey, false ) );
	}

	public IYCFBamPopSubDep2Obj readPopSubDep2( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamPopSubDep2Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamPopSubDep2Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamPopSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopSubDep2Obj readCachedPopSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep2Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposePopSubDep2( IYCFBamPopSubDep2Obj obj )
	{
		final String S_ProcName = "YCFBamPopSubDep2TableObj.reallyDeepDisposePopSubDep2() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopSubDep2Obj existing = readCachedPopSubDep2( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		keyPopSubDep1Idx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );

		YCFBamPopSubDep2ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		keyUNameIdx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getPopSubDep3TableObj().deepDisposePopSubDep3ByPopSubDep2Idx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByPopSubDep1Idx != null ) {
			if( indexByPopSubDep1Idx.containsKey( keyPopSubDep1Idx ) ) {
				indexByPopSubDep1Idx.get( keyPopSubDep1Idx ).remove( pkey );
				if( indexByPopSubDep1Idx.get( keyPopSubDep1Idx ).size() <= 0 ) {
					indexByPopSubDep1Idx.remove( keyPopSubDep1Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getPopDepTableObj().reallyDeepDisposePopDep( obj );
	}
	public void deepDisposePopSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep2Obj obj = readCachedPopSubDep2( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopSubDep2Obj lockPopSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep2Obj locked = null;
		YCFBamPopSubDep2Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamPopSubDep2Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockPopSubDep2", pkey );
		}
		return( locked );
	}

	public List<IYCFBamPopSubDep2Obj> readAllPopSubDep2() {
		return( readAllPopSubDep2( false ) );
	}

	public List<IYCFBamPopSubDep2Obj> readAllPopSubDep2( boolean forceRead ) {
		final String S_ProcName = "readAllPopSubDep2";
		if( ( allPopSubDep2 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> map = new HashMap<YCFBamScopePKey,IYCFBamPopSubDep2Obj>();
			allPopSubDep2 = map;
			YCFBamPopSubDep2Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readAllDerived( schema.getAuthorization() );
			YCFBamPopSubDep2Buff buff;
			IYCFBamPopSubDep2Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep2Obj realised = (IYCFBamPopSubDep2Obj)obj.realise();
			}
		}
		int len = allPopSubDep2.size();
		IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
		Iterator<IYCFBamPopSubDep2Obj> valIter = allPopSubDep2.values().iterator();
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
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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
		List<IYCFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep2Obj> readCachedAllPopSubDep2() {
		final String S_ProcName = "readCachedAllPopSubDep2";
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>();
		if( allPopSubDep2 != null ) {
			int len = allPopSubDep2.size();
			IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
			Iterator<IYCFBamPopSubDep2Obj> valIter = allPopSubDep2.values().iterator();
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
		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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

	public IYCFBamPopSubDep2Obj readPopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		return( readPopSubDep2ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamPopSubDep2Obj readPopSubDep2ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopSubDep2Obj obj = readPopSubDep2( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByTenantIdx( long TenantId )
	{
		return( readPopSubDep2ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep2Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep2Obj realised = (IYCFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
		Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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
		List<IYCFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		return( readPopSubDep2ByRelationIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByRelationIdx.containsKey( key ) ) {
			dict = indexByRelationIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep2Obj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep2Obj realised = (IYCFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelationIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
		Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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
		List<IYCFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readPopSubDep2ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep2Obj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep2Obj realised = (IYCFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
		Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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
		List<IYCFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		return( readPopSubDep2ByPopSubDep1Idx( PopSubDep1TenantId,
			PopSubDep1Id,
			false ) );
	}

	public List<IYCFBamPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep2ByPopSubDep1Idx";
		YCFBamPopSubDep2ByPopSubDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
		if( indexByPopSubDep1Idx == null ) {
			indexByPopSubDep1Idx = new HashMap< YCFBamPopSubDep2ByPopSubDep1IdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByPopSubDep1Idx.containsKey( key ) ) {
			dict = indexByPopSubDep1Idx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep2Obj>();
			IYCFBamPopSubDep2Obj obj;
			YCFBamPopSubDep2Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readDerivedByPopSubDep1Idx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id );
			YCFBamPopSubDep2Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep2Obj realised = (IYCFBamPopSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPopSubDep1Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
		Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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
		List<IYCFBamPopSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamPopSubDep2Obj readPopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		return( readPopSubDep2ByUNameIdx( PopSubDep1TenantId,
			PopSubDep1Id,
			Name,
			false ) );
	}

	public IYCFBamPopSubDep2Obj readPopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopSubDep2ByUNameIdxKey,
				IYCFBamPopSubDep2Obj >();
		}
		YCFBamPopSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		key.setRequiredName( Name );
		IYCFBamPopSubDep2Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamPopSubDep2Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().readDerivedByUNameIdx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
			if( buff != null ) {
				obj = (IYCFBamPopSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamPopSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopSubDep2Obj readCachedPopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopSubDep2Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedPopSubDep2( pkey );
		return( obj );
	}

	public List<IYCFBamPopSubDep2Obj> readCachedPopSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedPopSubDep2ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
				Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep2Obj obj;
			Iterator<IYCFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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

	public List<IYCFBamPopSubDep2Obj> readCachedPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedPopSubDep2ByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>();
		if( indexByRelationIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
			if( indexByRelationIdx.containsKey( key ) ) {
				dict = indexByRelationIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
				Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep2Obj obj;
			Iterator<IYCFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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

	public List<IYCFBamPopSubDep2Obj> readCachedPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedPopSubDep2ByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
				Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep2Obj obj;
			Iterator<IYCFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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

	public List<IYCFBamPopSubDep2Obj> readCachedPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		final String S_ProcName = "readCachedPopSubDep2ByPopSubDep1Idx";
		YCFBamPopSubDep2ByPopSubDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		ArrayList<IYCFBamPopSubDep2Obj> arrayList = new ArrayList<IYCFBamPopSubDep2Obj>();
		if( indexByPopSubDep1Idx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict;
			if( indexByPopSubDep1Idx.containsKey( key ) ) {
				dict = indexByPopSubDep1Idx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep2Obj arr[] = new IYCFBamPopSubDep2Obj[len];
				Iterator<IYCFBamPopSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep2Obj obj;
			Iterator<IYCFBamPopSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep2Obj> cmp = new Comparator<IYCFBamPopSubDep2Obj>() {
			public int compare( IYCFBamPopSubDep2Obj lhs, IYCFBamPopSubDep2Obj rhs ) {
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

	public IYCFBamPopSubDep2Obj readCachedPopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		IYCFBamPopSubDep2Obj obj = null;
		YCFBamPopSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamPopSubDep2Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamPopSubDep2Obj> valIter = members.values().iterator();
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

	public void deepDisposePopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopSubDep2Obj obj = readCachedPopSubDep2ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposePopSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByTenantIdx";
		IYCFBamPopSubDep2Obj obj;
		List<IYCFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByRelationIdx";
		IYCFBamPopSubDep2Obj obj;
		List<IYCFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByRelationIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByDefSchemaIdx";
		IYCFBamPopSubDep2Obj obj;
		List<IYCFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		final String S_ProcName = "deepDisposePopSubDep2ByPopSubDep1Idx";
		IYCFBamPopSubDep2Obj obj;
		List<IYCFBamPopSubDep2Obj> arrayList = readCachedPopSubDep2ByPopSubDep1Idx( PopSubDep1TenantId,
				PopSubDep1Id );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		IYCFBamPopSubDep2Obj obj = readCachedPopSubDep2ByUNameIdx( PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopSubDep2Obj updatePopSubDep2( IYCFBamPopSubDep2Obj Obj ) {
		IYCFBamPopSubDep2Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().updatePopSubDep2( schema.getAuthorization(),
			Obj.getPopSubDep2Buff() );
		if( Obj.getClassCode().equals( "a835" ) ) {
			obj = (IYCFBamPopSubDep2Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deletePopSubDep2( IYCFBamPopSubDep2Obj Obj ) {
		IYCFBamPopSubDep2Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2( schema.getAuthorization(),
			obj.getPopSubDep2Buff() );
		Obj.forget();
	}

	public void deletePopSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopSubDep2Obj obj = readPopSubDep2( pkey );
		if( obj != null ) {
			IYCFBamPopSubDep2EditObj editObj = (IYCFBamPopSubDep2EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamPopSubDep2EditObj)obj.beginEdit();
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
		deepDisposePopSubDep2ByIdIdx( TenantId,
				Id );
	}

	public void deletePopSubDep2ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamPopSubDep2Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep2Obj obj;
			List<IYCFBamPopSubDep2Obj> toForget = new LinkedList<IYCFBamPopSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposePopSubDep2ByTenantIdx( TenantId );
	}

	public void deletePopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( indexByRelationIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict = indexByRelationIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamPopSubDep2Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep2Obj obj;
			List<IYCFBamPopSubDep2Obj> toForget = new LinkedList<IYCFBamPopSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelationIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposePopSubDep2ByRelationIdx( RelationTenantId,
				RelationId );
	}

	public void deletePopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamPopSubDep2Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep2Obj obj;
			List<IYCFBamPopSubDep2Obj> toForget = new LinkedList<IYCFBamPopSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposePopSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deletePopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		YCFBamPopSubDep2ByPopSubDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		if( indexByPopSubDep1Idx == null ) {
			indexByPopSubDep1Idx = new HashMap< YCFBamPopSubDep2ByPopSubDep1IdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep2Obj > >();
		}
		if( indexByPopSubDep1Idx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep2Obj> dict = indexByPopSubDep1Idx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByPopSubDep1Idx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id );
			Iterator<IYCFBamPopSubDep2Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep2Obj obj;
			List<IYCFBamPopSubDep2Obj> toForget = new LinkedList<IYCFBamPopSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPopSubDep1Idx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByPopSubDep1Idx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id );
		}
		deepDisposePopSubDep2ByPopSubDep1Idx( PopSubDep1TenantId,
				PopSubDep1Id );
	}

	public void deletePopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopSubDep2ByUNameIdxKey,
				IYCFBamPopSubDep2Obj >();
		}
		YCFBamPopSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		key.setRequiredName( Name );
		IYCFBamPopSubDep2Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByUNameIdx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep2().deletePopSubDep2ByUNameIdx( schema.getAuthorization(),
				PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
		}
		deepDisposePopSubDep2ByUNameIdx( PopSubDep1TenantId,
				PopSubDep1Id,
				Name );
	}
}

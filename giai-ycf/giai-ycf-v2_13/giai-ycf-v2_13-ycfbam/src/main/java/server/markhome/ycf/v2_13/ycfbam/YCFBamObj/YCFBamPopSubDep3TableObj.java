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

public class YCFBamPopSubDep3TableObj
	implements IYCFBamPopSubDep3TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> members;
	private Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> allPopSubDep3;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > > indexByTenantIdx;
	private Map< YCFBamPopDepByRelationIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > > indexByRelationIdx;
	private Map< YCFBamPopDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > > indexByDefSchemaIdx;
	private Map< YCFBamPopSubDep3ByPopSubDep2IdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > > indexByPopSubDep2Idx;
	private Map< YCFBamPopSubDep3ByUNameIdxKey,
		IYCFBamPopSubDep3Obj > indexByUNameIdx;
	public static String TABLE_NAME = "PopSubDep3";
	public static String TABLE_DBNAME = "popsubdep3";

	public YCFBamPopSubDep3TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep3Obj>();
		allPopSubDep3 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep2Idx = null;
		indexByUNameIdx = null;
	}

	public YCFBamPopSubDep3TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep3Obj>();
		allPopSubDep3 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep2Idx = null;
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
		allPopSubDep3 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep2Idx = null;
		indexByUNameIdx = null;
		List<IYCFBamPopSubDep3Obj> toForget = new LinkedList<IYCFBamPopSubDep3Obj>();
		IYCFBamPopSubDep3Obj cur = null;
		Iterator<IYCFBamPopSubDep3Obj> iter = members.values().iterator();
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
	 *	YCFBamPopSubDep3Obj.
	 */
	public IYCFBamPopSubDep3Obj newInstance() {
		IYCFBamPopSubDep3Obj inst = new YCFBamPopSubDep3Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamPopSubDep3Obj.
	 */
	public IYCFBamPopSubDep3EditObj newEditInstance( IYCFBamPopSubDep3Obj orig ) {
		IYCFBamPopSubDep3EditObj edit = new YCFBamPopSubDep3EditObj( orig );
		return( edit );
	}

	public IYCFBamPopSubDep3Obj realisePopSubDep3( IYCFBamPopSubDep3Obj Obj ) {
		IYCFBamPopSubDep3Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopSubDep3Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamPopSubDep3Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					indexByRelationIdx.remove( keyRelationIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPopSubDep2Idx != null ) {
				YCFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
				keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyPopSubDep2Idx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapPopSubDep2Idx = indexByPopSubDep2Idx.get( keyPopSubDep2Idx );
				if( mapPopSubDep2Idx != null ) {
					mapPopSubDep2Idx.remove( keepObj.getPKey() );
					if( mapPopSubDep2Idx.size() <= 0 ) {
						indexByPopSubDep2Idx.remove( keyPopSubDep2Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyUNameIdx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamPopSubDep3Obj)schema.getPopDepTableObj().realisePopDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep2Idx != null ) {
				YCFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
				keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyPopSubDep2Idx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapPopSubDep2Idx = indexByPopSubDep2Idx.get( keyPopSubDep2Idx );
				if( mapPopSubDep2Idx != null ) {
					mapPopSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyUNameIdx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allPopSubDep3 != null ) {
				allPopSubDep3.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamPopSubDep3Obj)schema.getPopDepTableObj().realisePopDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allPopSubDep3 != null ) {
				allPopSubDep3.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep2Idx != null ) {
				YCFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
				keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyPopSubDep2Idx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj > mapPopSubDep2Idx = indexByPopSubDep2Idx.get( keyPopSubDep2Idx );
				if( mapPopSubDep2Idx != null ) {
					mapPopSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyUNameIdx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamPopSubDep3Obj createPopSubDep3( IYCFBamPopSubDep3Obj Obj ) {
		IYCFBamPopSubDep3Obj obj = Obj;
		YCFBamPopSubDep3Buff buff = obj.getPopSubDep3Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().createPopSubDep3(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a836" ) ) {
			obj = (IYCFBamPopSubDep3Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamPopSubDep3Obj readPopSubDep3( YCFBamScopePKey pkey ) {
		return( readPopSubDep3( pkey, false ) );
	}

	public IYCFBamPopSubDep3Obj readPopSubDep3( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamPopSubDep3Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamPopSubDep3Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamPopSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopSubDep3Obj readCachedPopSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep3Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposePopSubDep3( IYCFBamPopSubDep3Obj obj )
	{
		final String S_ProcName = "YCFBamPopSubDep3TableObj.reallyDeepDisposePopSubDep3() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopSubDep3Obj existing = readCachedPopSubDep3( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		keyPopSubDep2Idx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );

		YCFBamPopSubDep3ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		keyUNameIdx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByPopSubDep2Idx != null ) {
			if( indexByPopSubDep2Idx.containsKey( keyPopSubDep2Idx ) ) {
				indexByPopSubDep2Idx.get( keyPopSubDep2Idx ).remove( pkey );
				if( indexByPopSubDep2Idx.get( keyPopSubDep2Idx ).size() <= 0 ) {
					indexByPopSubDep2Idx.remove( keyPopSubDep2Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getPopDepTableObj().reallyDeepDisposePopDep( obj );
	}
	public void deepDisposePopSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep3Obj obj = readCachedPopSubDep3( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopSubDep3Obj lockPopSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep3Obj locked = null;
		YCFBamPopSubDep3Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamPopSubDep3Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockPopSubDep3", pkey );
		}
		return( locked );
	}

	public List<IYCFBamPopSubDep3Obj> readAllPopSubDep3() {
		return( readAllPopSubDep3( false ) );
	}

	public List<IYCFBamPopSubDep3Obj> readAllPopSubDep3( boolean forceRead ) {
		final String S_ProcName = "readAllPopSubDep3";
		if( ( allPopSubDep3 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> map = new HashMap<YCFBamScopePKey,IYCFBamPopSubDep3Obj>();
			allPopSubDep3 = map;
			YCFBamPopSubDep3Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readAllDerived( schema.getAuthorization() );
			YCFBamPopSubDep3Buff buff;
			IYCFBamPopSubDep3Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep3Obj realised = (IYCFBamPopSubDep3Obj)obj.realise();
			}
		}
		int len = allPopSubDep3.size();
		IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
		Iterator<IYCFBamPopSubDep3Obj> valIter = allPopSubDep3.values().iterator();
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
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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
		List<IYCFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep3Obj> readCachedAllPopSubDep3() {
		final String S_ProcName = "readCachedAllPopSubDep3";
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>();
		if( allPopSubDep3 != null ) {
			int len = allPopSubDep3.size();
			IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
			Iterator<IYCFBamPopSubDep3Obj> valIter = allPopSubDep3.values().iterator();
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
		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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

	public IYCFBamPopSubDep3Obj readPopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		return( readPopSubDep3ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamPopSubDep3Obj readPopSubDep3ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopSubDep3Obj obj = readPopSubDep3( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByTenantIdx( long TenantId )
	{
		return( readPopSubDep3ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep3Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep3Obj realised = (IYCFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
		Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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
		List<IYCFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		return( readPopSubDep3ByRelationIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByRelationIdx.containsKey( key ) ) {
			dict = indexByRelationIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep3Obj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep3Obj realised = (IYCFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelationIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
		Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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
		List<IYCFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readPopSubDep3ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep3Obj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep3Obj realised = (IYCFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
		Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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
		List<IYCFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		return( readPopSubDep3ByPopSubDep2Idx( PopSubDep2TenantId,
			PopSubDep2Id,
			false ) );
	}

	public List<IYCFBamPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByPopSubDep2Idx";
		YCFBamPopSubDep3ByPopSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
		if( indexByPopSubDep2Idx == null ) {
			indexByPopSubDep2Idx = new HashMap< YCFBamPopSubDep3ByPopSubDep2IdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByPopSubDep2Idx.containsKey( key ) ) {
			dict = indexByPopSubDep2Idx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep3Obj>();
			IYCFBamPopSubDep3Obj obj;
			YCFBamPopSubDep3Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readDerivedByPopSubDep2Idx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id );
			YCFBamPopSubDep3Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep3Obj realised = (IYCFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPopSubDep2Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
		Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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
		List<IYCFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamPopSubDep3Obj readPopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		return( readPopSubDep3ByUNameIdx( PopSubDep2TenantId,
			PopSubDep2Id,
			Name,
			false ) );
	}

	public IYCFBamPopSubDep3Obj readPopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopSubDep3ByUNameIdxKey,
				IYCFBamPopSubDep3Obj >();
		}
		YCFBamPopSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		key.setRequiredName( Name );
		IYCFBamPopSubDep3Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamPopSubDep3Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readDerivedByUNameIdx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
			if( buff != null ) {
				obj = (IYCFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamPopSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopSubDep3Obj readCachedPopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopSubDep3Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedPopSubDep3( pkey );
		return( obj );
	}

	public List<IYCFBamPopSubDep3Obj> readCachedPopSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedPopSubDep3ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
				Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep3Obj obj;
			Iterator<IYCFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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

	public List<IYCFBamPopSubDep3Obj> readCachedPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedPopSubDep3ByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>();
		if( indexByRelationIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
			if( indexByRelationIdx.containsKey( key ) ) {
				dict = indexByRelationIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
				Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep3Obj obj;
			Iterator<IYCFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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

	public List<IYCFBamPopSubDep3Obj> readCachedPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedPopSubDep3ByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
				Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep3Obj obj;
			Iterator<IYCFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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

	public List<IYCFBamPopSubDep3Obj> readCachedPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		final String S_ProcName = "readCachedPopSubDep3ByPopSubDep2Idx";
		YCFBamPopSubDep3ByPopSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		ArrayList<IYCFBamPopSubDep3Obj> arrayList = new ArrayList<IYCFBamPopSubDep3Obj>();
		if( indexByPopSubDep2Idx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict;
			if( indexByPopSubDep2Idx.containsKey( key ) ) {
				dict = indexByPopSubDep2Idx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep3Obj arr[] = new IYCFBamPopSubDep3Obj[len];
				Iterator<IYCFBamPopSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep3Obj obj;
			Iterator<IYCFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep3Obj> cmp = new Comparator<IYCFBamPopSubDep3Obj>() {
			public int compare( IYCFBamPopSubDep3Obj lhs, IYCFBamPopSubDep3Obj rhs ) {
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

	public IYCFBamPopSubDep3Obj readCachedPopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		IYCFBamPopSubDep3Obj obj = null;
		YCFBamPopSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamPopSubDep3Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamPopSubDep3Obj> valIter = members.values().iterator();
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

	public void deepDisposePopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopSubDep3Obj obj = readCachedPopSubDep3ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposePopSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByTenantIdx";
		IYCFBamPopSubDep3Obj obj;
		List<IYCFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByRelationIdx";
		IYCFBamPopSubDep3Obj obj;
		List<IYCFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByRelationIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByDefSchemaIdx";
		IYCFBamPopSubDep3Obj obj;
		List<IYCFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByPopSubDep2Idx";
		IYCFBamPopSubDep3Obj obj;
		List<IYCFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByPopSubDep2Idx( PopSubDep2TenantId,
				PopSubDep2Id );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		IYCFBamPopSubDep3Obj obj = readCachedPopSubDep3ByUNameIdx( PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopSubDep3Obj updatePopSubDep3( IYCFBamPopSubDep3Obj Obj ) {
		IYCFBamPopSubDep3Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().updatePopSubDep3( schema.getAuthorization(),
			Obj.getPopSubDep3Buff() );
		if( Obj.getClassCode().equals( "a836" ) ) {
			obj = (IYCFBamPopSubDep3Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deletePopSubDep3( IYCFBamPopSubDep3Obj Obj ) {
		IYCFBamPopSubDep3Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3( schema.getAuthorization(),
			obj.getPopSubDep3Buff() );
		Obj.forget();
	}

	public void deletePopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopSubDep3Obj obj = readPopSubDep3( pkey );
		if( obj != null ) {
			IYCFBamPopSubDep3EditObj editObj = (IYCFBamPopSubDep3EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamPopSubDep3EditObj)obj.beginEdit();
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
		deepDisposePopSubDep3ByIdIdx( TenantId,
				Id );
	}

	public void deletePopSubDep3ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamPopSubDep3Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep3Obj obj;
			List<IYCFBamPopSubDep3Obj> toForget = new LinkedList<IYCFBamPopSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposePopSubDep3ByTenantIdx( TenantId );
	}

	public void deletePopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( indexByRelationIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict = indexByRelationIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamPopSubDep3Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep3Obj obj;
			List<IYCFBamPopSubDep3Obj> toForget = new LinkedList<IYCFBamPopSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposePopSubDep3ByRelationIdx( RelationTenantId,
				RelationId );
	}

	public void deletePopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamPopSubDep3Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep3Obj obj;
			List<IYCFBamPopSubDep3Obj> toForget = new LinkedList<IYCFBamPopSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposePopSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deletePopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		YCFBamPopSubDep3ByPopSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		if( indexByPopSubDep2Idx == null ) {
			indexByPopSubDep2Idx = new HashMap< YCFBamPopSubDep3ByPopSubDep2IdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep3Obj > >();
		}
		if( indexByPopSubDep2Idx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep3Obj> dict = indexByPopSubDep2Idx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByPopSubDep2Idx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id );
			Iterator<IYCFBamPopSubDep3Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep3Obj obj;
			List<IYCFBamPopSubDep3Obj> toForget = new LinkedList<IYCFBamPopSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPopSubDep2Idx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByPopSubDep2Idx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id );
		}
		deepDisposePopSubDep3ByPopSubDep2Idx( PopSubDep2TenantId,
				PopSubDep2Id );
	}

	public void deletePopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopSubDep3ByUNameIdxKey,
				IYCFBamPopSubDep3Obj >();
		}
		YCFBamPopSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		key.setRequiredName( Name );
		IYCFBamPopSubDep3Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByUNameIdx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByUNameIdx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
		}
		deepDisposePopSubDep3ByUNameIdx( PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
	}
}

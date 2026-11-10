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

public class YCFBamClearSubDep3TableObj
	implements IYCFBamClearSubDep3TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> members;
	private Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> allClearSubDep3;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > > indexByTenantIdx;
	private Map< YCFBamClearDepByClearDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > > indexByClearDepIdx;
	private Map< YCFBamClearDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > > indexByDefSchemaIdx;
	private Map< YCFBamClearSubDep3ByClearSubDep2IdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > > indexByClearSubDep2Idx;
	private Map< YCFBamClearSubDep3ByUNameIdxKey,
		IYCFBamClearSubDep3Obj > indexByUNameIdx;
	public static String TABLE_NAME = "ClearSubDep3";
	public static String TABLE_DBNAME = "clrsubdep3";

	public YCFBamClearSubDep3TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep3Obj>();
		allClearSubDep3 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearSubDep2Idx = null;
		indexByUNameIdx = null;
	}

	public YCFBamClearSubDep3TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep3Obj>();
		allClearSubDep3 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearSubDep2Idx = null;
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
		allClearSubDep3 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearSubDep2Idx = null;
		indexByUNameIdx = null;
		List<IYCFBamClearSubDep3Obj> toForget = new LinkedList<IYCFBamClearSubDep3Obj>();
		IYCFBamClearSubDep3Obj cur = null;
		Iterator<IYCFBamClearSubDep3Obj> iter = members.values().iterator();
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
	 *	YCFBamClearSubDep3Obj.
	 */
	public IYCFBamClearSubDep3Obj newInstance() {
		IYCFBamClearSubDep3Obj inst = new YCFBamClearSubDep3Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamClearSubDep3Obj.
	 */
	public IYCFBamClearSubDep3EditObj newEditInstance( IYCFBamClearSubDep3Obj orig ) {
		IYCFBamClearSubDep3EditObj edit = new YCFBamClearSubDep3EditObj( orig );
		return( edit );
	}

	public IYCFBamClearSubDep3Obj realiseClearSubDep3( IYCFBamClearSubDep3Obj Obj ) {
		IYCFBamClearSubDep3Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearSubDep3Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamClearSubDep3Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					indexByClearDepIdx.remove( keyClearDepIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByClearSubDep2Idx != null ) {
				YCFBamClearSubDep3ByClearSubDep2IdxKey keyClearSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newClearSubDep2IdxKey();
				keyClearSubDep2Idx.setRequiredClearSubDep2TenantId( keepObj.getRequiredClearSubDep2TenantId() );
				keyClearSubDep2Idx.setRequiredClearSubDep2Id( keepObj.getRequiredClearSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapClearSubDep2Idx = indexByClearSubDep2Idx.get( keyClearSubDep2Idx );
				if( mapClearSubDep2Idx != null ) {
					mapClearSubDep2Idx.remove( keepObj.getPKey() );
					if( mapClearSubDep2Idx.size() <= 0 ) {
						indexByClearSubDep2Idx.remove( keyClearSubDep2Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredClearSubDep2TenantId( keepObj.getRequiredClearSubDep2TenantId() );
				keyUNameIdx.setRequiredClearSubDep2Id( keepObj.getRequiredClearSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamClearSubDep3Obj)schema.getClearDepTableObj().realiseClearDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearSubDep2Idx != null ) {
				YCFBamClearSubDep3ByClearSubDep2IdxKey keyClearSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newClearSubDep2IdxKey();
				keyClearSubDep2Idx.setRequiredClearSubDep2TenantId( keepObj.getRequiredClearSubDep2TenantId() );
				keyClearSubDep2Idx.setRequiredClearSubDep2Id( keepObj.getRequiredClearSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapClearSubDep2Idx = indexByClearSubDep2Idx.get( keyClearSubDep2Idx );
				if( mapClearSubDep2Idx != null ) {
					mapClearSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredClearSubDep2TenantId( keepObj.getRequiredClearSubDep2TenantId() );
				keyUNameIdx.setRequiredClearSubDep2Id( keepObj.getRequiredClearSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allClearSubDep3 != null ) {
				allClearSubDep3.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamClearSubDep3Obj)schema.getClearDepTableObj().realiseClearDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allClearSubDep3 != null ) {
				allClearSubDep3.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearSubDep2Idx != null ) {
				YCFBamClearSubDep3ByClearSubDep2IdxKey keyClearSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newClearSubDep2IdxKey();
				keyClearSubDep2Idx.setRequiredClearSubDep2TenantId( keepObj.getRequiredClearSubDep2TenantId() );
				keyClearSubDep2Idx.setRequiredClearSubDep2Id( keepObj.getRequiredClearSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj > mapClearSubDep2Idx = indexByClearSubDep2Idx.get( keyClearSubDep2Idx );
				if( mapClearSubDep2Idx != null ) {
					mapClearSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredClearSubDep2TenantId( keepObj.getRequiredClearSubDep2TenantId() );
				keyUNameIdx.setRequiredClearSubDep2Id( keepObj.getRequiredClearSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamClearSubDep3Obj createClearSubDep3( IYCFBamClearSubDep3Obj Obj ) {
		IYCFBamClearSubDep3Obj obj = Obj;
		YCFBamClearSubDep3Buff buff = obj.getClearSubDep3Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().createClearSubDep3(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a816" ) ) {
			obj = (IYCFBamClearSubDep3Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamClearSubDep3Obj readClearSubDep3( YCFBamScopePKey pkey ) {
		return( readClearSubDep3( pkey, false ) );
	}

	public IYCFBamClearSubDep3Obj readClearSubDep3( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamClearSubDep3Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamClearSubDep3Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamClearSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearSubDep3Obj readCachedClearSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep3Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeClearSubDep3( IYCFBamClearSubDep3Obj obj )
	{
		final String S_ProcName = "YCFBamClearSubDep3TableObj.reallyDeepDisposeClearSubDep3() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearSubDep3Obj existing = readCachedClearSubDep3( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamClearSubDep3ByClearSubDep2IdxKey keyClearSubDep2Idx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newClearSubDep2IdxKey();
		keyClearSubDep2Idx.setRequiredClearSubDep2TenantId( existing.getRequiredClearSubDep2TenantId() );
		keyClearSubDep2Idx.setRequiredClearSubDep2Id( existing.getRequiredClearSubDep2Id() );

		YCFBamClearSubDep3ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredClearSubDep2TenantId( existing.getRequiredClearSubDep2TenantId() );
		keyUNameIdx.setRequiredClearSubDep2Id( existing.getRequiredClearSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByClearSubDep2Idx != null ) {
			if( indexByClearSubDep2Idx.containsKey( keyClearSubDep2Idx ) ) {
				indexByClearSubDep2Idx.get( keyClearSubDep2Idx ).remove( pkey );
				if( indexByClearSubDep2Idx.get( keyClearSubDep2Idx ).size() <= 0 ) {
					indexByClearSubDep2Idx.remove( keyClearSubDep2Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getClearDepTableObj().reallyDeepDisposeClearDep( obj );
	}
	public void deepDisposeClearSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep3Obj obj = readCachedClearSubDep3( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearSubDep3Obj lockClearSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep3Obj locked = null;
		YCFBamClearSubDep3Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamClearSubDep3Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockClearSubDep3", pkey );
		}
		return( locked );
	}

	public List<IYCFBamClearSubDep3Obj> readAllClearSubDep3() {
		return( readAllClearSubDep3( false ) );
	}

	public List<IYCFBamClearSubDep3Obj> readAllClearSubDep3( boolean forceRead ) {
		final String S_ProcName = "readAllClearSubDep3";
		if( ( allClearSubDep3 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> map = new HashMap<YCFBamScopePKey,IYCFBamClearSubDep3Obj>();
			allClearSubDep3 = map;
			YCFBamClearSubDep3Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().readAllDerived( schema.getAuthorization() );
			YCFBamClearSubDep3Buff buff;
			IYCFBamClearSubDep3Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep3Obj realised = (IYCFBamClearSubDep3Obj)obj.realise();
			}
		}
		int len = allClearSubDep3.size();
		IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
		Iterator<IYCFBamClearSubDep3Obj> valIter = allClearSubDep3.values().iterator();
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
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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
		List<IYCFBamClearSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep3Obj> readCachedAllClearSubDep3() {
		final String S_ProcName = "readCachedAllClearSubDep3";
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>();
		if( allClearSubDep3 != null ) {
			int len = allClearSubDep3.size();
			IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
			Iterator<IYCFBamClearSubDep3Obj> valIter = allClearSubDep3.values().iterator();
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
		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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

	public IYCFBamClearSubDep3Obj readClearSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		return( readClearSubDep3ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamClearSubDep3Obj readClearSubDep3ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearSubDep3Obj obj = readClearSubDep3( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByTenantIdx( long TenantId )
	{
		return( readClearSubDep3ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep3ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep3Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep3Obj realised = (IYCFBamClearSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
		Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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
		List<IYCFBamClearSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId )
	{
		return( readClearSubDep3ByClearDepIdx( TenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep3ByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByClearDepIdx.containsKey( key ) ) {
			dict = indexByClearDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep3Obj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep3Obj realised = (IYCFBamClearSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
		Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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
		List<IYCFBamClearSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readClearSubDep3ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep3ByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep3Obj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep3Obj realised = (IYCFBamClearSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
		Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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
		List<IYCFBamClearSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id )
	{
		return( readClearSubDep3ByClearSubDep2Idx( ClearSubDep2TenantId,
			ClearSubDep2Id,
			false ) );
	}

	public List<IYCFBamClearSubDep3Obj> readClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep3ByClearSubDep2Idx";
		YCFBamClearSubDep3ByClearSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newClearSubDep2IdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );
		Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
		if( indexByClearSubDep2Idx == null ) {
			indexByClearSubDep2Idx = new HashMap< YCFBamClearSubDep3ByClearSubDep2IdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByClearSubDep2Idx.containsKey( key ) ) {
			dict = indexByClearSubDep2Idx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep3Obj>();
			IYCFBamClearSubDep3Obj obj;
			YCFBamClearSubDep3Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().readDerivedByClearSubDep2Idx( schema.getAuthorization(),
				ClearSubDep2TenantId,
				ClearSubDep2Id );
			YCFBamClearSubDep3Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep3Obj realised = (IYCFBamClearSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearSubDep2Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
		Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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
		List<IYCFBamClearSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamClearSubDep3Obj readClearSubDep3ByUNameIdx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name )
	{
		return( readClearSubDep3ByUNameIdx( ClearSubDep2TenantId,
			ClearSubDep2Id,
			Name,
			false ) );
	}

	public IYCFBamClearSubDep3Obj readClearSubDep3ByUNameIdx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearSubDep3ByUNameIdxKey,
				IYCFBamClearSubDep3Obj >();
		}
		YCFBamClearSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newUNameIdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );
		key.setRequiredName( Name );
		IYCFBamClearSubDep3Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamClearSubDep3Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().readDerivedByUNameIdx( schema.getAuthorization(),
				ClearSubDep2TenantId,
				ClearSubDep2Id,
				Name );
			if( buff != null ) {
				obj = (IYCFBamClearSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamClearSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearSubDep3Obj readCachedClearSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearSubDep3Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedClearSubDep3( pkey );
		return( obj );
	}

	public List<IYCFBamClearSubDep3Obj> readCachedClearSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedClearSubDep3ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
				Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep3Obj obj;
			Iterator<IYCFBamClearSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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

	public List<IYCFBamClearSubDep3Obj> readCachedClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedClearSubDep3ByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>();
		if( indexByClearDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
			if( indexByClearDepIdx.containsKey( key ) ) {
				dict = indexByClearDepIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
				Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep3Obj obj;
			Iterator<IYCFBamClearSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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

	public List<IYCFBamClearSubDep3Obj> readCachedClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedClearSubDep3ByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
				Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep3Obj obj;
			Iterator<IYCFBamClearSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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

	public List<IYCFBamClearSubDep3Obj> readCachedClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id )
	{
		final String S_ProcName = "readCachedClearSubDep3ByClearSubDep2Idx";
		YCFBamClearSubDep3ByClearSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newClearSubDep2IdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );
		ArrayList<IYCFBamClearSubDep3Obj> arrayList = new ArrayList<IYCFBamClearSubDep3Obj>();
		if( indexByClearSubDep2Idx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict;
			if( indexByClearSubDep2Idx.containsKey( key ) ) {
				dict = indexByClearSubDep2Idx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep3Obj arr[] = new IYCFBamClearSubDep3Obj[len];
				Iterator<IYCFBamClearSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep3Obj obj;
			Iterator<IYCFBamClearSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep3Obj> cmp = new Comparator<IYCFBamClearSubDep3Obj>() {
			public int compare( IYCFBamClearSubDep3Obj lhs, IYCFBamClearSubDep3Obj rhs ) {
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

	public IYCFBamClearSubDep3Obj readCachedClearSubDep3ByUNameIdx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name )
	{
		IYCFBamClearSubDep3Obj obj = null;
		YCFBamClearSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newUNameIdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamClearSubDep3Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamClearSubDep3Obj> valIter = members.values().iterator();
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

	public void deepDisposeClearSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearSubDep3Obj obj = readCachedClearSubDep3ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClearSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeClearSubDep3ByTenantIdx";
		IYCFBamClearSubDep3Obj obj;
		List<IYCFBamClearSubDep3Obj> arrayList = readCachedClearSubDep3ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeClearSubDep3ByClearDepIdx";
		IYCFBamClearSubDep3Obj obj;
		List<IYCFBamClearSubDep3Obj> arrayList = readCachedClearSubDep3ByClearDepIdx( TenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeClearSubDep3ByDefSchemaIdx";
		IYCFBamClearSubDep3Obj obj;
		List<IYCFBamClearSubDep3Obj> arrayList = readCachedClearSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id )
	{
		final String S_ProcName = "deepDisposeClearSubDep3ByClearSubDep2Idx";
		IYCFBamClearSubDep3Obj obj;
		List<IYCFBamClearSubDep3Obj> arrayList = readCachedClearSubDep3ByClearSubDep2Idx( ClearSubDep2TenantId,
				ClearSubDep2Id );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep3ByUNameIdx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name )
	{
		IYCFBamClearSubDep3Obj obj = readCachedClearSubDep3ByUNameIdx( ClearSubDep2TenantId,
				ClearSubDep2Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearSubDep3Obj updateClearSubDep3( IYCFBamClearSubDep3Obj Obj ) {
		IYCFBamClearSubDep3Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().updateClearSubDep3( schema.getAuthorization(),
			Obj.getClearSubDep3Buff() );
		if( Obj.getClassCode().equals( "a816" ) ) {
			obj = (IYCFBamClearSubDep3Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteClearSubDep3( IYCFBamClearSubDep3Obj Obj ) {
		IYCFBamClearSubDep3Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3( schema.getAuthorization(),
			obj.getClearSubDep3Buff() );
		Obj.forget();
	}

	public void deleteClearSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearSubDep3Obj obj = readClearSubDep3( pkey );
		if( obj != null ) {
			IYCFBamClearSubDep3EditObj editObj = (IYCFBamClearSubDep3EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamClearSubDep3EditObj)obj.beginEdit();
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
		deepDisposeClearSubDep3ByIdIdx( TenantId,
				Id );
	}

	public void deleteClearSubDep3ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamClearSubDep3Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep3Obj obj;
			List<IYCFBamClearSubDep3Obj> toForget = new LinkedList<IYCFBamClearSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeClearSubDep3ByTenantIdx( TenantId );
	}

	public void deleteClearSubDep3ByClearDepIdx( long TenantId,
		long RelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( indexByClearDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict = indexByClearDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			Iterator<IYCFBamClearSubDep3Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep3Obj obj;
			List<IYCFBamClearSubDep3Obj> toForget = new LinkedList<IYCFBamClearSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClearDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
		}
		deepDisposeClearSubDep3ByClearDepIdx( TenantId,
				RelationId );
	}

	public void deleteClearSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamClearSubDep3Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep3Obj obj;
			List<IYCFBamClearSubDep3Obj> toForget = new LinkedList<IYCFBamClearSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeClearSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteClearSubDep3ByClearSubDep2Idx( long ClearSubDep2TenantId,
		long ClearSubDep2Id )
	{
		YCFBamClearSubDep3ByClearSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newClearSubDep2IdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );
		if( indexByClearSubDep2Idx == null ) {
			indexByClearSubDep2Idx = new HashMap< YCFBamClearSubDep3ByClearSubDep2IdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep3Obj > >();
		}
		if( indexByClearSubDep2Idx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep3Obj> dict = indexByClearSubDep2Idx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByClearSubDep2Idx( schema.getAuthorization(),
				ClearSubDep2TenantId,
				ClearSubDep2Id );
			Iterator<IYCFBamClearSubDep3Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep3Obj obj;
			List<IYCFBamClearSubDep3Obj> toForget = new LinkedList<IYCFBamClearSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClearSubDep2Idx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByClearSubDep2Idx( schema.getAuthorization(),
				ClearSubDep2TenantId,
				ClearSubDep2Id );
		}
		deepDisposeClearSubDep3ByClearSubDep2Idx( ClearSubDep2TenantId,
				ClearSubDep2Id );
	}

	public void deleteClearSubDep3ByUNameIdx( long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearSubDep3ByUNameIdxKey,
				IYCFBamClearSubDep3Obj >();
		}
		YCFBamClearSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep3().newUNameIdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );
		key.setRequiredName( Name );
		IYCFBamClearSubDep3Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByUNameIdx( schema.getAuthorization(),
				ClearSubDep2TenantId,
				ClearSubDep2Id,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep3().deleteClearSubDep3ByUNameIdx( schema.getAuthorization(),
				ClearSubDep2TenantId,
				ClearSubDep2Id,
				Name );
		}
		deepDisposeClearSubDep3ByUNameIdx( ClearSubDep2TenantId,
				ClearSubDep2Id,
				Name );
	}
}

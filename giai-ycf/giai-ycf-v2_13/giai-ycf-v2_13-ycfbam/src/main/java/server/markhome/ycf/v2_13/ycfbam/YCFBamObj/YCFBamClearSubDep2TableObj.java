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

public class YCFBamClearSubDep2TableObj
	implements IYCFBamClearSubDep2TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> members;
	private Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> allClearSubDep2;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > > indexByTenantIdx;
	private Map< YCFBamClearDepByClearDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > > indexByClearDepIdx;
	private Map< YCFBamClearDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > > indexByDefSchemaIdx;
	private Map< YCFBamClearSubDep2ByClearSubDep1IdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > > indexByClearSubDep1Idx;
	private Map< YCFBamClearSubDep2ByUNameIdxKey,
		IYCFBamClearSubDep2Obj > indexByUNameIdx;
	public static String TABLE_NAME = "ClearSubDep2";
	public static String TABLE_DBNAME = "clrsubdep2";

	public YCFBamClearSubDep2TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep2Obj>();
		allClearSubDep2 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearSubDep1Idx = null;
		indexByUNameIdx = null;
	}

	public YCFBamClearSubDep2TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep2Obj>();
		allClearSubDep2 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearSubDep1Idx = null;
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
		allClearSubDep2 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearSubDep1Idx = null;
		indexByUNameIdx = null;
		List<IYCFBamClearSubDep2Obj> toForget = new LinkedList<IYCFBamClearSubDep2Obj>();
		IYCFBamClearSubDep2Obj cur = null;
		Iterator<IYCFBamClearSubDep2Obj> iter = members.values().iterator();
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
	 *	YCFBamClearSubDep2Obj.
	 */
	public IYCFBamClearSubDep2Obj newInstance() {
		IYCFBamClearSubDep2Obj inst = new YCFBamClearSubDep2Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamClearSubDep2Obj.
	 */
	public IYCFBamClearSubDep2EditObj newEditInstance( IYCFBamClearSubDep2Obj orig ) {
		IYCFBamClearSubDep2EditObj edit = new YCFBamClearSubDep2EditObj( orig );
		return( edit );
	}

	public IYCFBamClearSubDep2Obj realiseClearSubDep2( IYCFBamClearSubDep2Obj Obj ) {
		IYCFBamClearSubDep2Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearSubDep2Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamClearSubDep2Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					indexByClearDepIdx.remove( keyClearDepIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByClearSubDep1Idx != null ) {
				YCFBamClearSubDep2ByClearSubDep1IdxKey keyClearSubDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newClearSubDep1IdxKey();
				keyClearSubDep1Idx.setRequiredClearSubDep1TenantId( keepObj.getRequiredClearSubDep1TenantId() );
				keyClearSubDep1Idx.setRequiredClearSubDep1Id( keepObj.getRequiredClearSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapClearSubDep1Idx = indexByClearSubDep1Idx.get( keyClearSubDep1Idx );
				if( mapClearSubDep1Idx != null ) {
					mapClearSubDep1Idx.remove( keepObj.getPKey() );
					if( mapClearSubDep1Idx.size() <= 0 ) {
						indexByClearSubDep1Idx.remove( keyClearSubDep1Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredClearSubDep1TenantId( keepObj.getRequiredClearSubDep1TenantId() );
				keyUNameIdx.setRequiredClearSubDep1Id( keepObj.getRequiredClearSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamClearSubDep2Obj)schema.getClearDepTableObj().realiseClearDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearSubDep1Idx != null ) {
				YCFBamClearSubDep2ByClearSubDep1IdxKey keyClearSubDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newClearSubDep1IdxKey();
				keyClearSubDep1Idx.setRequiredClearSubDep1TenantId( keepObj.getRequiredClearSubDep1TenantId() );
				keyClearSubDep1Idx.setRequiredClearSubDep1Id( keepObj.getRequiredClearSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapClearSubDep1Idx = indexByClearSubDep1Idx.get( keyClearSubDep1Idx );
				if( mapClearSubDep1Idx != null ) {
					mapClearSubDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredClearSubDep1TenantId( keepObj.getRequiredClearSubDep1TenantId() );
				keyUNameIdx.setRequiredClearSubDep1Id( keepObj.getRequiredClearSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allClearSubDep2 != null ) {
				allClearSubDep2.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamClearSubDep2Obj)schema.getClearDepTableObj().realiseClearDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allClearSubDep2 != null ) {
				allClearSubDep2.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearSubDep1Idx != null ) {
				YCFBamClearSubDep2ByClearSubDep1IdxKey keyClearSubDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newClearSubDep1IdxKey();
				keyClearSubDep1Idx.setRequiredClearSubDep1TenantId( keepObj.getRequiredClearSubDep1TenantId() );
				keyClearSubDep1Idx.setRequiredClearSubDep1Id( keepObj.getRequiredClearSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj > mapClearSubDep1Idx = indexByClearSubDep1Idx.get( keyClearSubDep1Idx );
				if( mapClearSubDep1Idx != null ) {
					mapClearSubDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredClearSubDep1TenantId( keepObj.getRequiredClearSubDep1TenantId() );
				keyUNameIdx.setRequiredClearSubDep1Id( keepObj.getRequiredClearSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamClearSubDep2Obj createClearSubDep2( IYCFBamClearSubDep2Obj Obj ) {
		IYCFBamClearSubDep2Obj obj = Obj;
		YCFBamClearSubDep2Buff buff = obj.getClearSubDep2Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().createClearSubDep2(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a815" ) ) {
			obj = (IYCFBamClearSubDep2Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamClearSubDep2Obj readClearSubDep2( YCFBamScopePKey pkey ) {
		return( readClearSubDep2( pkey, false ) );
	}

	public IYCFBamClearSubDep2Obj readClearSubDep2( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamClearSubDep2Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamClearSubDep2Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamClearSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearSubDep2Obj readCachedClearSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep2Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeClearSubDep2( IYCFBamClearSubDep2Obj obj )
	{
		final String S_ProcName = "YCFBamClearSubDep2TableObj.reallyDeepDisposeClearSubDep2() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearSubDep2Obj existing = readCachedClearSubDep2( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamClearSubDep2ByClearSubDep1IdxKey keyClearSubDep1Idx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newClearSubDep1IdxKey();
		keyClearSubDep1Idx.setRequiredClearSubDep1TenantId( existing.getRequiredClearSubDep1TenantId() );
		keyClearSubDep1Idx.setRequiredClearSubDep1Id( existing.getRequiredClearSubDep1Id() );

		YCFBamClearSubDep2ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredClearSubDep1TenantId( existing.getRequiredClearSubDep1TenantId() );
		keyUNameIdx.setRequiredClearSubDep1Id( existing.getRequiredClearSubDep1Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getClearSubDep3TableObj().deepDisposeClearSubDep3ByClearSubDep2Idx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByClearSubDep1Idx != null ) {
			if( indexByClearSubDep1Idx.containsKey( keyClearSubDep1Idx ) ) {
				indexByClearSubDep1Idx.get( keyClearSubDep1Idx ).remove( pkey );
				if( indexByClearSubDep1Idx.get( keyClearSubDep1Idx ).size() <= 0 ) {
					indexByClearSubDep1Idx.remove( keyClearSubDep1Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getClearDepTableObj().reallyDeepDisposeClearDep( obj );
	}
	public void deepDisposeClearSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep2Obj obj = readCachedClearSubDep2( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearSubDep2Obj lockClearSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep2Obj locked = null;
		YCFBamClearSubDep2Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamClearSubDep2Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockClearSubDep2", pkey );
		}
		return( locked );
	}

	public List<IYCFBamClearSubDep2Obj> readAllClearSubDep2() {
		return( readAllClearSubDep2( false ) );
	}

	public List<IYCFBamClearSubDep2Obj> readAllClearSubDep2( boolean forceRead ) {
		final String S_ProcName = "readAllClearSubDep2";
		if( ( allClearSubDep2 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> map = new HashMap<YCFBamScopePKey,IYCFBamClearSubDep2Obj>();
			allClearSubDep2 = map;
			YCFBamClearSubDep2Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().readAllDerived( schema.getAuthorization() );
			YCFBamClearSubDep2Buff buff;
			IYCFBamClearSubDep2Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep2Obj realised = (IYCFBamClearSubDep2Obj)obj.realise();
			}
		}
		int len = allClearSubDep2.size();
		IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
		Iterator<IYCFBamClearSubDep2Obj> valIter = allClearSubDep2.values().iterator();
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
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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
		List<IYCFBamClearSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep2Obj> readCachedAllClearSubDep2() {
		final String S_ProcName = "readCachedAllClearSubDep2";
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>();
		if( allClearSubDep2 != null ) {
			int len = allClearSubDep2.size();
			IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
			Iterator<IYCFBamClearSubDep2Obj> valIter = allClearSubDep2.values().iterator();
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
		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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

	public IYCFBamClearSubDep2Obj readClearSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		return( readClearSubDep2ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamClearSubDep2Obj readClearSubDep2ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearSubDep2Obj obj = readClearSubDep2( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByTenantIdx( long TenantId )
	{
		return( readClearSubDep2ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep2ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep2Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep2Obj realised = (IYCFBamClearSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
		Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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
		List<IYCFBamClearSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId )
	{
		return( readClearSubDep2ByClearDepIdx( TenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep2ByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByClearDepIdx.containsKey( key ) ) {
			dict = indexByClearDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep2Obj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep2Obj realised = (IYCFBamClearSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
		Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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
		List<IYCFBamClearSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readClearSubDep2ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep2ByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep2Obj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep2Obj realised = (IYCFBamClearSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
		Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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
		List<IYCFBamClearSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id )
	{
		return( readClearSubDep2ByClearSubDep1Idx( ClearSubDep1TenantId,
			ClearSubDep1Id,
			false ) );
	}

	public List<IYCFBamClearSubDep2Obj> readClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep2ByClearSubDep1Idx";
		YCFBamClearSubDep2ByClearSubDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newClearSubDep1IdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );
		Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
		if( indexByClearSubDep1Idx == null ) {
			indexByClearSubDep1Idx = new HashMap< YCFBamClearSubDep2ByClearSubDep1IdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByClearSubDep1Idx.containsKey( key ) ) {
			dict = indexByClearSubDep1Idx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep2Obj>();
			IYCFBamClearSubDep2Obj obj;
			YCFBamClearSubDep2Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().readDerivedByClearSubDep1Idx( schema.getAuthorization(),
				ClearSubDep1TenantId,
				ClearSubDep1Id );
			YCFBamClearSubDep2Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep2Obj realised = (IYCFBamClearSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearSubDep1Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
		Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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
		List<IYCFBamClearSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamClearSubDep2Obj readClearSubDep2ByUNameIdx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name )
	{
		return( readClearSubDep2ByUNameIdx( ClearSubDep1TenantId,
			ClearSubDep1Id,
			Name,
			false ) );
	}

	public IYCFBamClearSubDep2Obj readClearSubDep2ByUNameIdx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearSubDep2ByUNameIdxKey,
				IYCFBamClearSubDep2Obj >();
		}
		YCFBamClearSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newUNameIdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );
		key.setRequiredName( Name );
		IYCFBamClearSubDep2Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamClearSubDep2Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().readDerivedByUNameIdx( schema.getAuthorization(),
				ClearSubDep1TenantId,
				ClearSubDep1Id,
				Name );
			if( buff != null ) {
				obj = (IYCFBamClearSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamClearSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearSubDep2Obj readCachedClearSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearSubDep2Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedClearSubDep2( pkey );
		return( obj );
	}

	public List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedClearSubDep2ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
				Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep2Obj obj;
			Iterator<IYCFBamClearSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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

	public List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedClearSubDep2ByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>();
		if( indexByClearDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
			if( indexByClearDepIdx.containsKey( key ) ) {
				dict = indexByClearDepIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
				Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep2Obj obj;
			Iterator<IYCFBamClearSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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

	public List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedClearSubDep2ByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
				Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep2Obj obj;
			Iterator<IYCFBamClearSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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

	public List<IYCFBamClearSubDep2Obj> readCachedClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id )
	{
		final String S_ProcName = "readCachedClearSubDep2ByClearSubDep1Idx";
		YCFBamClearSubDep2ByClearSubDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newClearSubDep1IdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );
		ArrayList<IYCFBamClearSubDep2Obj> arrayList = new ArrayList<IYCFBamClearSubDep2Obj>();
		if( indexByClearSubDep1Idx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict;
			if( indexByClearSubDep1Idx.containsKey( key ) ) {
				dict = indexByClearSubDep1Idx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep2Obj arr[] = new IYCFBamClearSubDep2Obj[len];
				Iterator<IYCFBamClearSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep2Obj obj;
			Iterator<IYCFBamClearSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep2Obj> cmp = new Comparator<IYCFBamClearSubDep2Obj>() {
			public int compare( IYCFBamClearSubDep2Obj lhs, IYCFBamClearSubDep2Obj rhs ) {
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

	public IYCFBamClearSubDep2Obj readCachedClearSubDep2ByUNameIdx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name )
	{
		IYCFBamClearSubDep2Obj obj = null;
		YCFBamClearSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newUNameIdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamClearSubDep2Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamClearSubDep2Obj> valIter = members.values().iterator();
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

	public void deepDisposeClearSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearSubDep2Obj obj = readCachedClearSubDep2ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClearSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeClearSubDep2ByTenantIdx";
		IYCFBamClearSubDep2Obj obj;
		List<IYCFBamClearSubDep2Obj> arrayList = readCachedClearSubDep2ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeClearSubDep2ByClearDepIdx";
		IYCFBamClearSubDep2Obj obj;
		List<IYCFBamClearSubDep2Obj> arrayList = readCachedClearSubDep2ByClearDepIdx( TenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeClearSubDep2ByDefSchemaIdx";
		IYCFBamClearSubDep2Obj obj;
		List<IYCFBamClearSubDep2Obj> arrayList = readCachedClearSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id )
	{
		final String S_ProcName = "deepDisposeClearSubDep2ByClearSubDep1Idx";
		IYCFBamClearSubDep2Obj obj;
		List<IYCFBamClearSubDep2Obj> arrayList = readCachedClearSubDep2ByClearSubDep1Idx( ClearSubDep1TenantId,
				ClearSubDep1Id );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep2ByUNameIdx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name )
	{
		IYCFBamClearSubDep2Obj obj = readCachedClearSubDep2ByUNameIdx( ClearSubDep1TenantId,
				ClearSubDep1Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearSubDep2Obj updateClearSubDep2( IYCFBamClearSubDep2Obj Obj ) {
		IYCFBamClearSubDep2Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().updateClearSubDep2( schema.getAuthorization(),
			Obj.getClearSubDep2Buff() );
		if( Obj.getClassCode().equals( "a815" ) ) {
			obj = (IYCFBamClearSubDep2Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteClearSubDep2( IYCFBamClearSubDep2Obj Obj ) {
		IYCFBamClearSubDep2Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2( schema.getAuthorization(),
			obj.getClearSubDep2Buff() );
		Obj.forget();
	}

	public void deleteClearSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearSubDep2Obj obj = readClearSubDep2( pkey );
		if( obj != null ) {
			IYCFBamClearSubDep2EditObj editObj = (IYCFBamClearSubDep2EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamClearSubDep2EditObj)obj.beginEdit();
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
		deepDisposeClearSubDep2ByIdIdx( TenantId,
				Id );
	}

	public void deleteClearSubDep2ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamClearSubDep2Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep2Obj obj;
			List<IYCFBamClearSubDep2Obj> toForget = new LinkedList<IYCFBamClearSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeClearSubDep2ByTenantIdx( TenantId );
	}

	public void deleteClearSubDep2ByClearDepIdx( long TenantId,
		long RelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( indexByClearDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict = indexByClearDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			Iterator<IYCFBamClearSubDep2Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep2Obj obj;
			List<IYCFBamClearSubDep2Obj> toForget = new LinkedList<IYCFBamClearSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
		}
		deepDisposeClearSubDep2ByClearDepIdx( TenantId,
				RelationId );
	}

	public void deleteClearSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamClearSubDep2Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep2Obj obj;
			List<IYCFBamClearSubDep2Obj> toForget = new LinkedList<IYCFBamClearSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeClearSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteClearSubDep2ByClearSubDep1Idx( long ClearSubDep1TenantId,
		long ClearSubDep1Id )
	{
		YCFBamClearSubDep2ByClearSubDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newClearSubDep1IdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );
		if( indexByClearSubDep1Idx == null ) {
			indexByClearSubDep1Idx = new HashMap< YCFBamClearSubDep2ByClearSubDep1IdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep2Obj > >();
		}
		if( indexByClearSubDep1Idx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep2Obj> dict = indexByClearSubDep1Idx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByClearSubDep1Idx( schema.getAuthorization(),
				ClearSubDep1TenantId,
				ClearSubDep1Id );
			Iterator<IYCFBamClearSubDep2Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep2Obj obj;
			List<IYCFBamClearSubDep2Obj> toForget = new LinkedList<IYCFBamClearSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClearSubDep1Idx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByClearSubDep1Idx( schema.getAuthorization(),
				ClearSubDep1TenantId,
				ClearSubDep1Id );
		}
		deepDisposeClearSubDep2ByClearSubDep1Idx( ClearSubDep1TenantId,
				ClearSubDep1Id );
	}

	public void deleteClearSubDep2ByUNameIdx( long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearSubDep2ByUNameIdxKey,
				IYCFBamClearSubDep2Obj >();
		}
		YCFBamClearSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep2().newUNameIdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );
		key.setRequiredName( Name );
		IYCFBamClearSubDep2Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByUNameIdx( schema.getAuthorization(),
				ClearSubDep1TenantId,
				ClearSubDep1Id,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep2().deleteClearSubDep2ByUNameIdx( schema.getAuthorization(),
				ClearSubDep1TenantId,
				ClearSubDep1Id,
				Name );
		}
		deepDisposeClearSubDep2ByUNameIdx( ClearSubDep1TenantId,
				ClearSubDep1Id,
				Name );
	}
}

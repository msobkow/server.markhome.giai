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

public class YCFBamClearSubDep1TableObj
	implements IYCFBamClearSubDep1TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> members;
	private Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> allClearSubDep1;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > > indexByTenantIdx;
	private Map< YCFBamClearDepByClearDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > > indexByClearDepIdx;
	private Map< YCFBamClearDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > > indexByDefSchemaIdx;
	private Map< YCFBamClearSubDep1ByClearTopDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > > indexByClearTopDepIdx;
	private Map< YCFBamClearSubDep1ByUNameIdxKey,
		IYCFBamClearSubDep1Obj > indexByUNameIdx;
	public static String TABLE_NAME = "ClearSubDep1";
	public static String TABLE_DBNAME = "clrsubdep1";

	public YCFBamClearSubDep1TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep1Obj>();
		allClearSubDep1 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearTopDepIdx = null;
		indexByUNameIdx = null;
	}

	public YCFBamClearSubDep1TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep1Obj>();
		allClearSubDep1 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearTopDepIdx = null;
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
		allClearSubDep1 = null;
		indexByTenantIdx = null;
		indexByClearDepIdx = null;
		indexByDefSchemaIdx = null;
		indexByClearTopDepIdx = null;
		indexByUNameIdx = null;
		List<IYCFBamClearSubDep1Obj> toForget = new LinkedList<IYCFBamClearSubDep1Obj>();
		IYCFBamClearSubDep1Obj cur = null;
		Iterator<IYCFBamClearSubDep1Obj> iter = members.values().iterator();
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
	 *	YCFBamClearSubDep1Obj.
	 */
	public IYCFBamClearSubDep1Obj newInstance() {
		IYCFBamClearSubDep1Obj inst = new YCFBamClearSubDep1Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamClearSubDep1Obj.
	 */
	public IYCFBamClearSubDep1EditObj newEditInstance( IYCFBamClearSubDep1Obj orig ) {
		IYCFBamClearSubDep1EditObj edit = new YCFBamClearSubDep1EditObj( orig );
		return( edit );
	}

	public IYCFBamClearSubDep1Obj realiseClearSubDep1( IYCFBamClearSubDep1Obj Obj ) {
		IYCFBamClearSubDep1Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearSubDep1Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamClearSubDep1Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					indexByClearDepIdx.remove( keyClearDepIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByClearTopDepIdx != null ) {
				YCFBamClearSubDep1ByClearTopDepIdxKey keyClearTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newClearTopDepIdxKey();
				keyClearTopDepIdx.setRequiredClearTopDepTenantId( keepObj.getRequiredClearTopDepTenantId() );
				keyClearTopDepIdx.setRequiredClearTopDepId( keepObj.getRequiredClearTopDepId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapClearTopDepIdx = indexByClearTopDepIdx.get( keyClearTopDepIdx );
				if( mapClearTopDepIdx != null ) {
					mapClearTopDepIdx.remove( keepObj.getPKey() );
					if( mapClearTopDepIdx.size() <= 0 ) {
						indexByClearTopDepIdx.remove( keyClearTopDepIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredClearTopDepTenantId( keepObj.getRequiredClearTopDepTenantId() );
				keyUNameIdx.setRequiredClearTopDepId( keepObj.getRequiredClearTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamClearSubDep1Obj)schema.getClearDepTableObj().realiseClearDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearTopDepIdx != null ) {
				YCFBamClearSubDep1ByClearTopDepIdxKey keyClearTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newClearTopDepIdxKey();
				keyClearTopDepIdx.setRequiredClearTopDepTenantId( keepObj.getRequiredClearTopDepTenantId() );
				keyClearTopDepIdx.setRequiredClearTopDepId( keepObj.getRequiredClearTopDepId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapClearTopDepIdx = indexByClearTopDepIdx.get( keyClearTopDepIdx );
				if( mapClearTopDepIdx != null ) {
					mapClearTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredClearTopDepTenantId( keepObj.getRequiredClearTopDepTenantId() );
				keyUNameIdx.setRequiredClearTopDepId( keepObj.getRequiredClearTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allClearSubDep1 != null ) {
				allClearSubDep1.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamClearSubDep1Obj)schema.getClearDepTableObj().realiseClearDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allClearSubDep1 != null ) {
				allClearSubDep1.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearDepIdx != null ) {
				YCFBamClearDepByClearDepIdxKey keyClearDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
				keyClearDepIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyClearDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapClearDepIdx = indexByClearDepIdx.get( keyClearDepIdx );
				if( mapClearDepIdx != null ) {
					mapClearDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClearTopDepIdx != null ) {
				YCFBamClearSubDep1ByClearTopDepIdxKey keyClearTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newClearTopDepIdxKey();
				keyClearTopDepIdx.setRequiredClearTopDepTenantId( keepObj.getRequiredClearTopDepTenantId() );
				keyClearTopDepIdx.setRequiredClearTopDepId( keepObj.getRequiredClearTopDepId() );
				Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj > mapClearTopDepIdx = indexByClearTopDepIdx.get( keyClearTopDepIdx );
				if( mapClearTopDepIdx != null ) {
					mapClearTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamClearSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredClearTopDepTenantId( keepObj.getRequiredClearTopDepTenantId() );
				keyUNameIdx.setRequiredClearTopDepId( keepObj.getRequiredClearTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamClearSubDep1Obj createClearSubDep1( IYCFBamClearSubDep1Obj Obj ) {
		IYCFBamClearSubDep1Obj obj = Obj;
		YCFBamClearSubDep1Buff buff = obj.getClearSubDep1Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().createClearSubDep1(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a814" ) ) {
			obj = (IYCFBamClearSubDep1Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamClearSubDep1Obj readClearSubDep1( YCFBamScopePKey pkey ) {
		return( readClearSubDep1( pkey, false ) );
	}

	public IYCFBamClearSubDep1Obj readClearSubDep1( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamClearSubDep1Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamClearSubDep1Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamClearSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearSubDep1Obj readCachedClearSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep1Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeClearSubDep1( IYCFBamClearSubDep1Obj obj )
	{
		final String S_ProcName = "YCFBamClearSubDep1TableObj.reallyDeepDisposeClearSubDep1() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamClearSubDep1Obj existing = readCachedClearSubDep1( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamClearSubDep1ByClearTopDepIdxKey keyClearTopDepIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newClearTopDepIdxKey();
		keyClearTopDepIdx.setRequiredClearTopDepTenantId( existing.getRequiredClearTopDepTenantId() );
		keyClearTopDepIdx.setRequiredClearTopDepId( existing.getRequiredClearTopDepId() );

		YCFBamClearSubDep1ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredClearTopDepTenantId( existing.getRequiredClearTopDepTenantId() );
		keyUNameIdx.setRequiredClearTopDepId( existing.getRequiredClearTopDepId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getClearSubDep2TableObj().deepDisposeClearSubDep2ByClearSubDep1Idx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByClearTopDepIdx != null ) {
			if( indexByClearTopDepIdx.containsKey( keyClearTopDepIdx ) ) {
				indexByClearTopDepIdx.get( keyClearTopDepIdx ).remove( pkey );
				if( indexByClearTopDepIdx.get( keyClearTopDepIdx ).size() <= 0 ) {
					indexByClearTopDepIdx.remove( keyClearTopDepIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getClearDepTableObj().reallyDeepDisposeClearDep( obj );
	}
	public void deepDisposeClearSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep1Obj obj = readCachedClearSubDep1( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearSubDep1Obj lockClearSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamClearSubDep1Obj locked = null;
		YCFBamClearSubDep1Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamClearSubDep1Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockClearSubDep1", pkey );
		}
		return( locked );
	}

	public List<IYCFBamClearSubDep1Obj> readAllClearSubDep1() {
		return( readAllClearSubDep1( false ) );
	}

	public List<IYCFBamClearSubDep1Obj> readAllClearSubDep1( boolean forceRead ) {
		final String S_ProcName = "readAllClearSubDep1";
		if( ( allClearSubDep1 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> map = new HashMap<YCFBamScopePKey,IYCFBamClearSubDep1Obj>();
			allClearSubDep1 = map;
			YCFBamClearSubDep1Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().readAllDerived( schema.getAuthorization() );
			YCFBamClearSubDep1Buff buff;
			IYCFBamClearSubDep1Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep1Obj realised = (IYCFBamClearSubDep1Obj)obj.realise();
			}
		}
		int len = allClearSubDep1.size();
		IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
		Iterator<IYCFBamClearSubDep1Obj> valIter = allClearSubDep1.values().iterator();
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
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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
		List<IYCFBamClearSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep1Obj> readCachedAllClearSubDep1() {
		final String S_ProcName = "readCachedAllClearSubDep1";
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>();
		if( allClearSubDep1 != null ) {
			int len = allClearSubDep1.size();
			IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
			Iterator<IYCFBamClearSubDep1Obj> valIter = allClearSubDep1.values().iterator();
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
		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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

	public IYCFBamClearSubDep1Obj readClearSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		return( readClearSubDep1ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamClearSubDep1Obj readClearSubDep1ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearSubDep1Obj obj = readClearSubDep1( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByTenantIdx( long TenantId )
	{
		return( readClearSubDep1ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep1ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep1Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep1Obj realised = (IYCFBamClearSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
		Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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
		List<IYCFBamClearSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId )
	{
		return( readClearSubDep1ByClearDepIdx( TenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep1ByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByClearDepIdx.containsKey( key ) ) {
			dict = indexByClearDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep1Obj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep1Obj realised = (IYCFBamClearSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
		Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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
		List<IYCFBamClearSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readClearSubDep1ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep1ByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep1Obj>();
			IYCFBamClearDepObj obj;
			YCFBamClearDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamClearDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep1Obj realised = (IYCFBamClearSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
		Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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
		List<IYCFBamClearSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId )
	{
		return( readClearSubDep1ByClearTopDepIdx( ClearTopDepTenantId,
			ClearTopDepId,
			false ) );
	}

	public List<IYCFBamClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		boolean forceRead )
	{
		final String S_ProcName = "readClearSubDep1ByClearTopDepIdx";
		YCFBamClearSubDep1ByClearTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newClearTopDepIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );
		Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
		if( indexByClearTopDepIdx == null ) {
			indexByClearTopDepIdx = new HashMap< YCFBamClearSubDep1ByClearTopDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByClearTopDepIdx.containsKey( key ) ) {
			dict = indexByClearTopDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamClearSubDep1Obj>();
			IYCFBamClearSubDep1Obj obj;
			YCFBamClearSubDep1Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().readDerivedByClearTopDepIdx( schema.getAuthorization(),
				ClearTopDepTenantId,
				ClearTopDepId );
			YCFBamClearSubDep1Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamClearSubDep1Obj realised = (IYCFBamClearSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClearTopDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
		Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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
		List<IYCFBamClearSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamClearSubDep1Obj readClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name )
	{
		return( readClearSubDep1ByUNameIdx( ClearTopDepTenantId,
			ClearTopDepId,
			Name,
			false ) );
	}

	public IYCFBamClearSubDep1Obj readClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearSubDep1ByUNameIdxKey,
				IYCFBamClearSubDep1Obj >();
		}
		YCFBamClearSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newUNameIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );
		key.setRequiredName( Name );
		IYCFBamClearSubDep1Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamClearSubDep1Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().readDerivedByUNameIdx( schema.getAuthorization(),
				ClearTopDepTenantId,
				ClearTopDepId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamClearSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamClearSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamClearSubDep1Obj readCachedClearSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearSubDep1Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedClearSubDep1( pkey );
		return( obj );
	}

	public List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedClearSubDep1ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
				Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep1Obj obj;
			Iterator<IYCFBamClearSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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

	public List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedClearSubDep1ByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>();
		if( indexByClearDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
			if( indexByClearDepIdx.containsKey( key ) ) {
				dict = indexByClearDepIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
				Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep1Obj obj;
			Iterator<IYCFBamClearSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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

	public List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedClearSubDep1ByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
				Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep1Obj obj;
			Iterator<IYCFBamClearSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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

	public List<IYCFBamClearSubDep1Obj> readCachedClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId )
	{
		final String S_ProcName = "readCachedClearSubDep1ByClearTopDepIdx";
		YCFBamClearSubDep1ByClearTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newClearTopDepIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );
		ArrayList<IYCFBamClearSubDep1Obj> arrayList = new ArrayList<IYCFBamClearSubDep1Obj>();
		if( indexByClearTopDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict;
			if( indexByClearTopDepIdx.containsKey( key ) ) {
				dict = indexByClearTopDepIdx.get( key );
				int len = dict.size();
				IYCFBamClearSubDep1Obj arr[] = new IYCFBamClearSubDep1Obj[len];
				Iterator<IYCFBamClearSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamClearSubDep1Obj obj;
			Iterator<IYCFBamClearSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamClearSubDep1Obj> cmp = new Comparator<IYCFBamClearSubDep1Obj>() {
			public int compare( IYCFBamClearSubDep1Obj lhs, IYCFBamClearSubDep1Obj rhs ) {
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

	public IYCFBamClearSubDep1Obj readCachedClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name )
	{
		IYCFBamClearSubDep1Obj obj = null;
		YCFBamClearSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newUNameIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamClearSubDep1Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamClearSubDep1Obj> valIter = members.values().iterator();
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

	public void deepDisposeClearSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamClearSubDep1Obj obj = readCachedClearSubDep1ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeClearSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeClearSubDep1ByTenantIdx";
		IYCFBamClearSubDep1Obj obj;
		List<IYCFBamClearSubDep1Obj> arrayList = readCachedClearSubDep1ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeClearSubDep1ByClearDepIdx";
		IYCFBamClearSubDep1Obj obj;
		List<IYCFBamClearSubDep1Obj> arrayList = readCachedClearSubDep1ByClearDepIdx( TenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeClearSubDep1ByDefSchemaIdx";
		IYCFBamClearSubDep1Obj obj;
		List<IYCFBamClearSubDep1Obj> arrayList = readCachedClearSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId )
	{
		final String S_ProcName = "deepDisposeClearSubDep1ByClearTopDepIdx";
		IYCFBamClearSubDep1Obj obj;
		List<IYCFBamClearSubDep1Obj> arrayList = readCachedClearSubDep1ByClearTopDepIdx( ClearTopDepTenantId,
				ClearTopDepId );
		if( arrayList != null )  {
			Iterator<IYCFBamClearSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name )
	{
		IYCFBamClearSubDep1Obj obj = readCachedClearSubDep1ByUNameIdx( ClearTopDepTenantId,
				ClearTopDepId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamClearSubDep1Obj updateClearSubDep1( IYCFBamClearSubDep1Obj Obj ) {
		IYCFBamClearSubDep1Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().updateClearSubDep1( schema.getAuthorization(),
			Obj.getClearSubDep1Buff() );
		if( Obj.getClassCode().equals( "a814" ) ) {
			obj = (IYCFBamClearSubDep1Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteClearSubDep1( IYCFBamClearSubDep1Obj Obj ) {
		IYCFBamClearSubDep1Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1( schema.getAuthorization(),
			obj.getClearSubDep1Buff() );
		Obj.forget();
	}

	public void deleteClearSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamClearSubDep1Obj obj = readClearSubDep1( pkey );
		if( obj != null ) {
			IYCFBamClearSubDep1EditObj editObj = (IYCFBamClearSubDep1EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamClearSubDep1EditObj)obj.beginEdit();
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
		deepDisposeClearSubDep1ByIdIdx( TenantId,
				Id );
	}

	public void deleteClearSubDep1ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamClearSubDep1Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep1Obj obj;
			List<IYCFBamClearSubDep1Obj> toForget = new LinkedList<IYCFBamClearSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeClearSubDep1ByTenantIdx( TenantId );
	}

	public void deleteClearSubDep1ByClearDepIdx( long TenantId,
		long RelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByClearDepIdx == null ) {
			indexByClearDepIdx = new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( indexByClearDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict = indexByClearDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
			Iterator<IYCFBamClearSubDep1Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep1Obj obj;
			List<IYCFBamClearSubDep1Obj> toForget = new LinkedList<IYCFBamClearSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByClearDepIdx( schema.getAuthorization(),
				TenantId,
				RelationId );
		}
		deepDisposeClearSubDep1ByClearDepIdx( TenantId,
				RelationId );
	}

	public void deleteClearSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamClearSubDep1Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep1Obj obj;
			List<IYCFBamClearSubDep1Obj> toForget = new LinkedList<IYCFBamClearSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeClearSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteClearSubDep1ByClearTopDepIdx( long ClearTopDepTenantId,
		long ClearTopDepId )
	{
		YCFBamClearSubDep1ByClearTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newClearTopDepIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );
		if( indexByClearTopDepIdx == null ) {
			indexByClearTopDepIdx = new HashMap< YCFBamClearSubDep1ByClearTopDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamClearSubDep1Obj > >();
		}
		if( indexByClearTopDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamClearSubDep1Obj> dict = indexByClearTopDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByClearTopDepIdx( schema.getAuthorization(),
				ClearTopDepTenantId,
				ClearTopDepId );
			Iterator<IYCFBamClearSubDep1Obj> iter = dict.values().iterator();
			IYCFBamClearSubDep1Obj obj;
			List<IYCFBamClearSubDep1Obj> toForget = new LinkedList<IYCFBamClearSubDep1Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClearTopDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByClearTopDepIdx( schema.getAuthorization(),
				ClearTopDepTenantId,
				ClearTopDepId );
		}
		deepDisposeClearSubDep1ByClearTopDepIdx( ClearTopDepTenantId,
				ClearTopDepId );
	}

	public void deleteClearSubDep1ByUNameIdx( long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamClearSubDep1ByUNameIdxKey,
				IYCFBamClearSubDep1Obj >();
		}
		YCFBamClearSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryClearSubDep1().newUNameIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );
		key.setRequiredName( Name );
		IYCFBamClearSubDep1Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByUNameIdx( schema.getAuthorization(),
				ClearTopDepTenantId,
				ClearTopDepId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableClearSubDep1().deleteClearSubDep1ByUNameIdx( schema.getAuthorization(),
				ClearTopDepTenantId,
				ClearTopDepId,
				Name );
		}
		deepDisposeClearSubDep1ByUNameIdx( ClearTopDepTenantId,
				ClearTopDepId,
				Name );
	}
}

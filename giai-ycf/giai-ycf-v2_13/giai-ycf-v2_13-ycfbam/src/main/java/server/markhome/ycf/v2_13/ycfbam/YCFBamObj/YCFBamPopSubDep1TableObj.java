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

public class YCFBamPopSubDep1TableObj
	implements IYCFBamPopSubDep1TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> members;
	private Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> allPopSubDep1;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > > indexByTenantIdx;
	private Map< YCFBamPopDepByRelationIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > > indexByRelationIdx;
	private Map< YCFBamPopDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > > indexByDefSchemaIdx;
	private Map< YCFBamPopSubDep1ByPopTopDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > > indexByPopTopDepIdx;
	private Map< YCFBamPopSubDep1ByUNameIdxKey,
		IYCFBamPopSubDep1Obj > indexByUNameIdx;
	public static String TABLE_NAME = "PopSubDep1";
	public static String TABLE_DBNAME = "popsubdep1";

	public YCFBamPopSubDep1TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep1Obj>();
		allPopSubDep1 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopTopDepIdx = null;
		indexByUNameIdx = null;
	}

	public YCFBamPopSubDep1TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep1Obj>();
		allPopSubDep1 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopTopDepIdx = null;
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
		allPopSubDep1 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopTopDepIdx = null;
		indexByUNameIdx = null;
		List<IYCFBamPopSubDep1Obj> toForget = new LinkedList<IYCFBamPopSubDep1Obj>();
		IYCFBamPopSubDep1Obj cur = null;
		Iterator<IYCFBamPopSubDep1Obj> iter = members.values().iterator();
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
	 *	YCFBamPopSubDep1Obj.
	 */
	public IYCFBamPopSubDep1Obj newInstance() {
		IYCFBamPopSubDep1Obj inst = new YCFBamPopSubDep1Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamPopSubDep1Obj.
	 */
	public IYCFBamPopSubDep1EditObj newEditInstance( IYCFBamPopSubDep1Obj orig ) {
		IYCFBamPopSubDep1EditObj edit = new YCFBamPopSubDep1EditObj( orig );
		return( edit );
	}

	public IYCFBamPopSubDep1Obj realisePopSubDep1( IYCFBamPopSubDep1Obj Obj ) {
		IYCFBamPopSubDep1Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopSubDep1Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamPopSubDep1Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					indexByRelationIdx.remove( keyRelationIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPopTopDepIdx != null ) {
				YCFBamPopSubDep1ByPopTopDepIdxKey keyPopTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newPopTopDepIdxKey();
				keyPopTopDepIdx.setRequiredPopTopDepTenantId( keepObj.getRequiredPopTopDepTenantId() );
				keyPopTopDepIdx.setRequiredPopTopDepId( keepObj.getRequiredPopTopDepId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapPopTopDepIdx = indexByPopTopDepIdx.get( keyPopTopDepIdx );
				if( mapPopTopDepIdx != null ) {
					mapPopTopDepIdx.remove( keepObj.getPKey() );
					if( mapPopTopDepIdx.size() <= 0 ) {
						indexByPopTopDepIdx.remove( keyPopTopDepIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredPopTopDepTenantId( keepObj.getRequiredPopTopDepTenantId() );
				keyUNameIdx.setRequiredPopTopDepId( keepObj.getRequiredPopTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamPopSubDep1Obj)schema.getPopDepTableObj().realisePopDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopTopDepIdx != null ) {
				YCFBamPopSubDep1ByPopTopDepIdxKey keyPopTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newPopTopDepIdxKey();
				keyPopTopDepIdx.setRequiredPopTopDepTenantId( keepObj.getRequiredPopTopDepTenantId() );
				keyPopTopDepIdx.setRequiredPopTopDepId( keepObj.getRequiredPopTopDepId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapPopTopDepIdx = indexByPopTopDepIdx.get( keyPopTopDepIdx );
				if( mapPopTopDepIdx != null ) {
					mapPopTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredPopTopDepTenantId( keepObj.getRequiredPopTopDepTenantId() );
				keyUNameIdx.setRequiredPopTopDepId( keepObj.getRequiredPopTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allPopSubDep1 != null ) {
				allPopSubDep1.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamPopSubDep1Obj)schema.getPopDepTableObj().realisePopDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allPopSubDep1 != null ) {
				allPopSubDep1.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopTopDepIdx != null ) {
				YCFBamPopSubDep1ByPopTopDepIdxKey keyPopTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newPopTopDepIdxKey();
				keyPopTopDepIdx.setRequiredPopTopDepTenantId( keepObj.getRequiredPopTopDepTenantId() );
				keyPopTopDepIdx.setRequiredPopTopDepId( keepObj.getRequiredPopTopDepId() );
				Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj > mapPopTopDepIdx = indexByPopTopDepIdx.get( keyPopTopDepIdx );
				if( mapPopTopDepIdx != null ) {
					mapPopTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredPopTopDepTenantId( keepObj.getRequiredPopTopDepTenantId() );
				keyUNameIdx.setRequiredPopTopDepId( keepObj.getRequiredPopTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamPopSubDep1Obj createPopSubDep1( IYCFBamPopSubDep1Obj Obj ) {
		IYCFBamPopSubDep1Obj obj = Obj;
		YCFBamPopSubDep1Buff buff = obj.getPopSubDep1Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().createPopSubDep1(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a834" ) ) {
			obj = (IYCFBamPopSubDep1Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamPopSubDep1Obj readPopSubDep1( YCFBamScopePKey pkey ) {
		return( readPopSubDep1( pkey, false ) );
	}

	public IYCFBamPopSubDep1Obj readPopSubDep1( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamPopSubDep1Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamPopSubDep1Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamPopSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopSubDep1Obj readCachedPopSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep1Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposePopSubDep1( IYCFBamPopSubDep1Obj obj )
	{
		final String S_ProcName = "YCFBamPopSubDep1TableObj.reallyDeepDisposePopSubDep1() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopSubDep1Obj existing = readCachedPopSubDep1( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamPopSubDep1ByPopTopDepIdxKey keyPopTopDepIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newPopTopDepIdxKey();
		keyPopTopDepIdx.setRequiredPopTopDepTenantId( existing.getRequiredPopTopDepTenantId() );
		keyPopTopDepIdx.setRequiredPopTopDepId( existing.getRequiredPopTopDepId() );

		YCFBamPopSubDep1ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredPopTopDepTenantId( existing.getRequiredPopTopDepTenantId() );
		keyUNameIdx.setRequiredPopTopDepId( existing.getRequiredPopTopDepId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getPopSubDep2TableObj().deepDisposePopSubDep2ByPopSubDep1Idx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByPopTopDepIdx != null ) {
			if( indexByPopTopDepIdx.containsKey( keyPopTopDepIdx ) ) {
				indexByPopTopDepIdx.get( keyPopTopDepIdx ).remove( pkey );
				if( indexByPopTopDepIdx.get( keyPopTopDepIdx ).size() <= 0 ) {
					indexByPopTopDepIdx.remove( keyPopTopDepIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getPopDepTableObj().reallyDeepDisposePopDep( obj );
	}
	public void deepDisposePopSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep1Obj obj = readCachedPopSubDep1( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopSubDep1Obj lockPopSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamPopSubDep1Obj locked = null;
		YCFBamPopSubDep1Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamPopSubDep1Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockPopSubDep1", pkey );
		}
		return( locked );
	}

	public List<IYCFBamPopSubDep1Obj> readAllPopSubDep1() {
		return( readAllPopSubDep1( false ) );
	}

	public List<IYCFBamPopSubDep1Obj> readAllPopSubDep1( boolean forceRead ) {
		final String S_ProcName = "readAllPopSubDep1";
		if( ( allPopSubDep1 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> map = new HashMap<YCFBamScopePKey,IYCFBamPopSubDep1Obj>();
			allPopSubDep1 = map;
			YCFBamPopSubDep1Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().readAllDerived( schema.getAuthorization() );
			YCFBamPopSubDep1Buff buff;
			IYCFBamPopSubDep1Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep1Obj realised = (IYCFBamPopSubDep1Obj)obj.realise();
			}
		}
		int len = allPopSubDep1.size();
		IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
		Iterator<IYCFBamPopSubDep1Obj> valIter = allPopSubDep1.values().iterator();
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
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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
		List<IYCFBamPopSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep1Obj> readCachedAllPopSubDep1() {
		final String S_ProcName = "readCachedAllPopSubDep1";
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>();
		if( allPopSubDep1 != null ) {
			int len = allPopSubDep1.size();
			IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
			Iterator<IYCFBamPopSubDep1Obj> valIter = allPopSubDep1.values().iterator();
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
		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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

	public IYCFBamPopSubDep1Obj readPopSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		return( readPopSubDep1ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamPopSubDep1Obj readPopSubDep1ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopSubDep1Obj obj = readPopSubDep1( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByTenantIdx( long TenantId )
	{
		return( readPopSubDep1ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep1ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep1Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep1Obj realised = (IYCFBamPopSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
		Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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
		List<IYCFBamPopSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		return( readPopSubDep1ByRelationIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep1ByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByRelationIdx.containsKey( key ) ) {
			dict = indexByRelationIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep1Obj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep1Obj realised = (IYCFBamPopSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelationIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
		Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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
		List<IYCFBamPopSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readPopSubDep1ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep1ByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep1Obj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep1Obj realised = (IYCFBamPopSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
		Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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
		List<IYCFBamPopSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId )
	{
		return( readPopSubDep1ByPopTopDepIdx( PopTopDepTenantId,
			PopTopDepId,
			false ) );
	}

	public List<IYCFBamPopSubDep1Obj> readPopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep1ByPopTopDepIdx";
		YCFBamPopSubDep1ByPopTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newPopTopDepIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );
		Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
		if( indexByPopTopDepIdx == null ) {
			indexByPopTopDepIdx = new HashMap< YCFBamPopSubDep1ByPopTopDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByPopTopDepIdx.containsKey( key ) ) {
			dict = indexByPopTopDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopSubDep1Obj>();
			IYCFBamPopSubDep1Obj obj;
			YCFBamPopSubDep1Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().readDerivedByPopTopDepIdx( schema.getAuthorization(),
				PopTopDepTenantId,
				PopTopDepId );
			YCFBamPopSubDep1Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopSubDep1Obj realised = (IYCFBamPopSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPopTopDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
		Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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
		List<IYCFBamPopSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamPopSubDep1Obj readPopSubDep1ByUNameIdx( long PopTopDepTenantId,
		long PopTopDepId,
		String Name )
	{
		return( readPopSubDep1ByUNameIdx( PopTopDepTenantId,
			PopTopDepId,
			Name,
			false ) );
	}

	public IYCFBamPopSubDep1Obj readPopSubDep1ByUNameIdx( long PopTopDepTenantId,
		long PopTopDepId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopSubDep1ByUNameIdxKey,
				IYCFBamPopSubDep1Obj >();
		}
		YCFBamPopSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newUNameIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );
		key.setRequiredName( Name );
		IYCFBamPopSubDep1Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamPopSubDep1Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().readDerivedByUNameIdx( schema.getAuthorization(),
				PopTopDepTenantId,
				PopTopDepId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamPopSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamPopSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopSubDep1Obj readCachedPopSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopSubDep1Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedPopSubDep1( pkey );
		return( obj );
	}

	public List<IYCFBamPopSubDep1Obj> readCachedPopSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedPopSubDep1ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
				Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep1Obj obj;
			Iterator<IYCFBamPopSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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

	public List<IYCFBamPopSubDep1Obj> readCachedPopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedPopSubDep1ByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>();
		if( indexByRelationIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
			if( indexByRelationIdx.containsKey( key ) ) {
				dict = indexByRelationIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
				Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep1Obj obj;
			Iterator<IYCFBamPopSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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

	public List<IYCFBamPopSubDep1Obj> readCachedPopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedPopSubDep1ByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
				Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep1Obj obj;
			Iterator<IYCFBamPopSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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

	public List<IYCFBamPopSubDep1Obj> readCachedPopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId )
	{
		final String S_ProcName = "readCachedPopSubDep1ByPopTopDepIdx";
		YCFBamPopSubDep1ByPopTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newPopTopDepIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );
		ArrayList<IYCFBamPopSubDep1Obj> arrayList = new ArrayList<IYCFBamPopSubDep1Obj>();
		if( indexByPopTopDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict;
			if( indexByPopTopDepIdx.containsKey( key ) ) {
				dict = indexByPopTopDepIdx.get( key );
				int len = dict.size();
				IYCFBamPopSubDep1Obj arr[] = new IYCFBamPopSubDep1Obj[len];
				Iterator<IYCFBamPopSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamPopSubDep1Obj obj;
			Iterator<IYCFBamPopSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopSubDep1Obj> cmp = new Comparator<IYCFBamPopSubDep1Obj>() {
			public int compare( IYCFBamPopSubDep1Obj lhs, IYCFBamPopSubDep1Obj rhs ) {
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

	public IYCFBamPopSubDep1Obj readCachedPopSubDep1ByUNameIdx( long PopTopDepTenantId,
		long PopTopDepId,
		String Name )
	{
		IYCFBamPopSubDep1Obj obj = null;
		YCFBamPopSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newUNameIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamPopSubDep1Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamPopSubDep1Obj> valIter = members.values().iterator();
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

	public void deepDisposePopSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopSubDep1Obj obj = readCachedPopSubDep1ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposePopSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposePopSubDep1ByTenantIdx";
		IYCFBamPopSubDep1Obj obj;
		List<IYCFBamPopSubDep1Obj> arrayList = readCachedPopSubDep1ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposePopSubDep1ByRelationIdx";
		IYCFBamPopSubDep1Obj obj;
		List<IYCFBamPopSubDep1Obj> arrayList = readCachedPopSubDep1ByRelationIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposePopSubDep1ByDefSchemaIdx";
		IYCFBamPopSubDep1Obj obj;
		List<IYCFBamPopSubDep1Obj> arrayList = readCachedPopSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId )
	{
		final String S_ProcName = "deepDisposePopSubDep1ByPopTopDepIdx";
		IYCFBamPopSubDep1Obj obj;
		List<IYCFBamPopSubDep1Obj> arrayList = readCachedPopSubDep1ByPopTopDepIdx( PopTopDepTenantId,
				PopTopDepId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep1ByUNameIdx( long PopTopDepTenantId,
		long PopTopDepId,
		String Name )
	{
		IYCFBamPopSubDep1Obj obj = readCachedPopSubDep1ByUNameIdx( PopTopDepTenantId,
				PopTopDepId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopSubDep1Obj updatePopSubDep1( IYCFBamPopSubDep1Obj Obj ) {
		IYCFBamPopSubDep1Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().updatePopSubDep1( schema.getAuthorization(),
			Obj.getPopSubDep1Buff() );
		if( Obj.getClassCode().equals( "a834" ) ) {
			obj = (IYCFBamPopSubDep1Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deletePopSubDep1( IYCFBamPopSubDep1Obj Obj ) {
		IYCFBamPopSubDep1Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1( schema.getAuthorization(),
			obj.getPopSubDep1Buff() );
		Obj.forget();
	}

	public void deletePopSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopSubDep1Obj obj = readPopSubDep1( pkey );
		if( obj != null ) {
			IYCFBamPopSubDep1EditObj editObj = (IYCFBamPopSubDep1EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamPopSubDep1EditObj)obj.beginEdit();
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
		deepDisposePopSubDep1ByIdIdx( TenantId,
				Id );
	}

	public void deletePopSubDep1ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamPopSubDep1Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep1Obj obj;
			List<IYCFBamPopSubDep1Obj> toForget = new LinkedList<IYCFBamPopSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposePopSubDep1ByTenantIdx( TenantId );
	}

	public void deletePopSubDep1ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( indexByRelationIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict = indexByRelationIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamPopSubDep1Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep1Obj obj;
			List<IYCFBamPopSubDep1Obj> toForget = new LinkedList<IYCFBamPopSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposePopSubDep1ByRelationIdx( RelationTenantId,
				RelationId );
	}

	public void deletePopSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamPopSubDep1Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep1Obj obj;
			List<IYCFBamPopSubDep1Obj> toForget = new LinkedList<IYCFBamPopSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposePopSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deletePopSubDep1ByPopTopDepIdx( long PopTopDepTenantId,
		long PopTopDepId )
	{
		YCFBamPopSubDep1ByPopTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newPopTopDepIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );
		if( indexByPopTopDepIdx == null ) {
			indexByPopTopDepIdx = new HashMap< YCFBamPopSubDep1ByPopTopDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopSubDep1Obj > >();
		}
		if( indexByPopTopDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopSubDep1Obj> dict = indexByPopTopDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByPopTopDepIdx( schema.getAuthorization(),
				PopTopDepTenantId,
				PopTopDepId );
			Iterator<IYCFBamPopSubDep1Obj> iter = dict.values().iterator();
			IYCFBamPopSubDep1Obj obj;
			List<IYCFBamPopSubDep1Obj> toForget = new LinkedList<IYCFBamPopSubDep1Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPopTopDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByPopTopDepIdx( schema.getAuthorization(),
				PopTopDepTenantId,
				PopTopDepId );
		}
		deepDisposePopSubDep1ByPopTopDepIdx( PopTopDepTenantId,
				PopTopDepId );
	}

	public void deletePopSubDep1ByUNameIdx( long PopTopDepTenantId,
		long PopTopDepId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopSubDep1ByUNameIdxKey,
				IYCFBamPopSubDep1Obj >();
		}
		YCFBamPopSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopSubDep1().newUNameIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );
		key.setRequiredName( Name );
		IYCFBamPopSubDep1Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByUNameIdx( schema.getAuthorization(),
				PopTopDepTenantId,
				PopTopDepId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopSubDep1().deletePopSubDep1ByUNameIdx( schema.getAuthorization(),
				PopTopDepTenantId,
				PopTopDepId,
				Name );
		}
		deepDisposePopSubDep1ByUNameIdx( PopTopDepTenantId,
				PopTopDepId,
				Name );
	}
}

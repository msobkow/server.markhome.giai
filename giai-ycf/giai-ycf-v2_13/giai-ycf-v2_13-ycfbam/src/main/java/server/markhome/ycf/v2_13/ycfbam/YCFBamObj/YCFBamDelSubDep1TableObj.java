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

public class YCFBamDelSubDep1TableObj
	implements IYCFBamDelSubDep1TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> members;
	private Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> allDelSubDep1;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > > indexByTenantIdx;
	private Map< YCFBamDelDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > > indexByDefSchemaIdx;
	private Map< YCFBamDelDepByDelDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > > indexByDelDepIdx;
	private Map< YCFBamDelSubDep1ByDelTopDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > > indexByDelTopDepIdx;
	private Map< YCFBamDelSubDep1ByUNameIdxKey,
		IYCFBamDelSubDep1Obj > indexByUNameIdx;
	public static String TABLE_NAME = "DelSubDep1";
	public static String TABLE_DBNAME = "delsubdep1";

	public YCFBamDelSubDep1TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep1Obj>();
		allDelSubDep1 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepIdx = null;
		indexByUNameIdx = null;
	}

	public YCFBamDelSubDep1TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep1Obj>();
		allDelSubDep1 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepIdx = null;
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
		allDelSubDep1 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepIdx = null;
		indexByUNameIdx = null;
		List<IYCFBamDelSubDep1Obj> toForget = new LinkedList<IYCFBamDelSubDep1Obj>();
		IYCFBamDelSubDep1Obj cur = null;
		Iterator<IYCFBamDelSubDep1Obj> iter = members.values().iterator();
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
	 *	YCFBamDelSubDep1Obj.
	 */
	public IYCFBamDelSubDep1Obj newInstance() {
		IYCFBamDelSubDep1Obj inst = new YCFBamDelSubDep1Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamDelSubDep1Obj.
	 */
	public IYCFBamDelSubDep1EditObj newEditInstance( IYCFBamDelSubDep1Obj orig ) {
		IYCFBamDelSubDep1EditObj edit = new YCFBamDelSubDep1EditObj( orig );
		return( edit );
	}

	public IYCFBamDelSubDep1Obj realiseDelSubDep1( IYCFBamDelSubDep1Obj Obj ) {
		IYCFBamDelSubDep1Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelSubDep1Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamDelSubDep1Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByDelTopDepIdx != null ) {
				YCFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
				keyDelTopDepIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyDelTopDepIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDelTopDepIdx = indexByDelTopDepIdx.get( keyDelTopDepIdx );
				if( mapDelTopDepIdx != null ) {
					mapDelTopDepIdx.remove( keepObj.getPKey() );
					if( mapDelTopDepIdx.size() <= 0 ) {
						indexByDelTopDepIdx.remove( keyDelTopDepIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyUNameIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamDelSubDep1Obj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepIdx != null ) {
				YCFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
				keyDelTopDepIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyDelTopDepIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDelTopDepIdx = indexByDelTopDepIdx.get( keyDelTopDepIdx );
				if( mapDelTopDepIdx != null ) {
					mapDelTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyUNameIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allDelSubDep1 != null ) {
				allDelSubDep1.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamDelSubDep1Obj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelSubDep1 != null ) {
				allDelSubDep1.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepIdx != null ) {
				YCFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
				keyDelTopDepIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyDelTopDepIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj > mapDelTopDepIdx = indexByDelTopDepIdx.get( keyDelTopDepIdx );
				if( mapDelTopDepIdx != null ) {
					mapDelTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep1ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyUNameIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamDelSubDep1Obj createDelSubDep1( IYCFBamDelSubDep1Obj Obj ) {
		IYCFBamDelSubDep1Obj obj = Obj;
		YCFBamDelSubDep1Buff buff = obj.getDelSubDep1Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().createDelSubDep1(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81b" ) ) {
			obj = (IYCFBamDelSubDep1Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamDelSubDep1Obj readDelSubDep1( YCFBamScopePKey pkey ) {
		return( readDelSubDep1( pkey, false ) );
	}

	public IYCFBamDelSubDep1Obj readDelSubDep1( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamDelSubDep1Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamDelSubDep1Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamDelSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDelSubDep1Obj readCachedDelSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep1Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelSubDep1( IYCFBamDelSubDep1Obj obj )
	{
		final String S_ProcName = "YCFBamDelSubDep1TableObj.reallyDeepDisposeDelSubDep1() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelSubDep1Obj existing = readCachedDelSubDep1( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		keyDelTopDepIdx.setRequiredDelTopDepTenantId( existing.getRequiredDelTopDepTenantId() );
		keyDelTopDepIdx.setRequiredDelTopDepId( existing.getRequiredDelTopDepId() );

		YCFBamDelSubDep1ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredDelTopDepTenantId( existing.getRequiredDelTopDepTenantId() );
		keyUNameIdx.setRequiredDelTopDepId( existing.getRequiredDelTopDepId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getDelSubDep2TableObj().deepDisposeDelSubDep2ByContDelDep1Idx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByDelTopDepIdx != null ) {
			if( indexByDelTopDepIdx.containsKey( keyDelTopDepIdx ) ) {
				indexByDelTopDepIdx.get( keyDelTopDepIdx ).remove( pkey );
				if( indexByDelTopDepIdx.get( keyDelTopDepIdx ).size() <= 0 ) {
					indexByDelTopDepIdx.remove( keyDelTopDepIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getDelDepTableObj().reallyDeepDisposeDelDep( obj );
	}
	public void deepDisposeDelSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep1Obj obj = readCachedDelSubDep1( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDelSubDep1Obj lockDelSubDep1( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep1Obj locked = null;
		YCFBamDelSubDep1Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamDelSubDep1Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockDelSubDep1", pkey );
		}
		return( locked );
	}

	public List<IYCFBamDelSubDep1Obj> readAllDelSubDep1() {
		return( readAllDelSubDep1( false ) );
	}

	public List<IYCFBamDelSubDep1Obj> readAllDelSubDep1( boolean forceRead ) {
		final String S_ProcName = "readAllDelSubDep1";
		if( ( allDelSubDep1 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> map = new HashMap<YCFBamScopePKey,IYCFBamDelSubDep1Obj>();
			allDelSubDep1 = map;
			YCFBamDelSubDep1Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readAllDerived( schema.getAuthorization() );
			YCFBamDelSubDep1Buff buff;
			IYCFBamDelSubDep1Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep1Obj realised = (IYCFBamDelSubDep1Obj)obj.realise();
			}
		}
		int len = allDelSubDep1.size();
		IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
		Iterator<IYCFBamDelSubDep1Obj> valIter = allDelSubDep1.values().iterator();
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
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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
		List<IYCFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep1Obj> readCachedAllDelSubDep1() {
		final String S_ProcName = "readCachedAllDelSubDep1";
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>();
		if( allDelSubDep1 != null ) {
			int len = allDelSubDep1.size();
			IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
			Iterator<IYCFBamDelSubDep1Obj> valIter = allDelSubDep1.values().iterator();
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
		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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

	public IYCFBamDelSubDep1Obj readDelSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		return( readDelSubDep1ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamDelSubDep1Obj readDelSubDep1ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelSubDep1Obj obj = readDelSubDep1( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByTenantIdx( long TenantId )
	{
		return( readDelSubDep1ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep1Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep1Obj realised = (IYCFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
		Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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
		List<IYCFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelSubDep1ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep1Obj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep1Obj realised = (IYCFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
		Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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
		List<IYCFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelSubDep1ByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep1Obj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep1Obj realised = (IYCFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
		Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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
		List<IYCFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId )
	{
		return( readDelSubDep1ByDelTopDepIdx( DelTopDepTenantId,
			DelTopDepId,
			false ) );
	}

	public List<IYCFBamDelSubDep1Obj> readDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByDelTopDepIdx";
		YCFBamDelSubDep1ByDelTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
		if( indexByDelTopDepIdx == null ) {
			indexByDelTopDepIdx = new HashMap< YCFBamDelSubDep1ByDelTopDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDelTopDepIdx.containsKey( key ) ) {
			dict = indexByDelTopDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep1Obj>();
			IYCFBamDelSubDep1Obj obj;
			YCFBamDelSubDep1Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readDerivedByDelTopDepIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId );
			YCFBamDelSubDep1Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep1Obj realised = (IYCFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelTopDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
		Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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
		List<IYCFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamDelSubDep1Obj readDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		return( readDelSubDep1ByUNameIdx( DelTopDepTenantId,
			DelTopDepId,
			Name,
			false ) );
	}

	public IYCFBamDelSubDep1Obj readDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelSubDep1ByUNameIdxKey,
				IYCFBamDelSubDep1Obj >();
		}
		YCFBamDelSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		key.setRequiredName( Name );
		IYCFBamDelSubDep1Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamDelSubDep1Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readDerivedByUNameIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamDelSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDelSubDep1Obj readCachedDelSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelSubDep1Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelSubDep1( pkey );
		return( obj );
	}

	public List<IYCFBamDelSubDep1Obj> readCachedDelSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
				Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep1Obj obj;
			Iterator<IYCFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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

	public List<IYCFBamDelSubDep1Obj> readCachedDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
				Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep1Obj obj;
			Iterator<IYCFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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

	public List<IYCFBamDelSubDep1Obj> readCachedDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>();
		if( indexByDelDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
				Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep1Obj obj;
			Iterator<IYCFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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

	public List<IYCFBamDelSubDep1Obj> readCachedDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByDelTopDepIdx";
		YCFBamDelSubDep1ByDelTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		ArrayList<IYCFBamDelSubDep1Obj> arrayList = new ArrayList<IYCFBamDelSubDep1Obj>();
		if( indexByDelTopDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict;
			if( indexByDelTopDepIdx.containsKey( key ) ) {
				dict = indexByDelTopDepIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep1Obj arr[] = new IYCFBamDelSubDep1Obj[len];
				Iterator<IYCFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep1Obj obj;
			Iterator<IYCFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep1Obj> cmp = new Comparator<IYCFBamDelSubDep1Obj>() {
			public int compare( IYCFBamDelSubDep1Obj lhs, IYCFBamDelSubDep1Obj rhs ) {
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

	public IYCFBamDelSubDep1Obj readCachedDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		IYCFBamDelSubDep1Obj obj = null;
		YCFBamDelSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamDelSubDep1Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamDelSubDep1Obj> valIter = members.values().iterator();
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

	public void deepDisposeDelSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelSubDep1Obj obj = readCachedDelSubDep1ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelSubDep1ByTenantIdx";
		IYCFBamDelSubDep1Obj obj;
		List<IYCFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeDelSubDep1ByDefSchemaIdx";
		IYCFBamDelSubDep1Obj obj;
		List<IYCFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeDelSubDep1ByDelDepIdx";
		IYCFBamDelSubDep1Obj obj;
		List<IYCFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId )
	{
		final String S_ProcName = "deepDisposeDelSubDep1ByDelTopDepIdx";
		IYCFBamDelSubDep1Obj obj;
		List<IYCFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByDelTopDepIdx( DelTopDepTenantId,
				DelTopDepId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		IYCFBamDelSubDep1Obj obj = readCachedDelSubDep1ByUNameIdx( DelTopDepTenantId,
				DelTopDepId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDelSubDep1Obj updateDelSubDep1( IYCFBamDelSubDep1Obj Obj ) {
		IYCFBamDelSubDep1Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().updateDelSubDep1( schema.getAuthorization(),
			Obj.getDelSubDep1Buff() );
		if( Obj.getClassCode().equals( "a81b" ) ) {
			obj = (IYCFBamDelSubDep1Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelSubDep1( IYCFBamDelSubDep1Obj Obj ) {
		IYCFBamDelSubDep1Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1( schema.getAuthorization(),
			obj.getDelSubDep1Buff() );
		Obj.forget();
	}

	public void deleteDelSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelSubDep1Obj obj = readDelSubDep1( pkey );
		if( obj != null ) {
			IYCFBamDelSubDep1EditObj editObj = (IYCFBamDelSubDep1EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamDelSubDep1EditObj)obj.beginEdit();
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
		deepDisposeDelSubDep1ByIdIdx( TenantId,
				Id );
	}

	public void deleteDelSubDep1ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamDelSubDep1Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep1Obj obj;
			List<IYCFBamDelSubDep1Obj> toForget = new LinkedList<IYCFBamDelSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelSubDep1ByTenantIdx( TenantId );
	}

	public void deleteDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamDelSubDep1Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep1Obj obj;
			List<IYCFBamDelSubDep1Obj> toForget = new LinkedList<IYCFBamDelSubDep1Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict = indexByDelDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamDelSubDep1Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep1Obj obj;
			List<IYCFBamDelSubDep1Obj> toForget = new LinkedList<IYCFBamDelSubDep1Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelSubDep1ByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId )
	{
		YCFBamDelSubDep1ByDelTopDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		if( indexByDelTopDepIdx == null ) {
			indexByDelTopDepIdx = new HashMap< YCFBamDelSubDep1ByDelTopDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep1Obj > >();
		}
		if( indexByDelTopDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep1Obj> dict = indexByDelTopDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelTopDepIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId );
			Iterator<IYCFBamDelSubDep1Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep1Obj obj;
			List<IYCFBamDelSubDep1Obj> toForget = new LinkedList<IYCFBamDelSubDep1Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelTopDepIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelTopDepIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId );
		}
		deepDisposeDelSubDep1ByDelTopDepIdx( DelTopDepTenantId,
				DelTopDepId );
	}

	public void deleteDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelSubDep1ByUNameIdxKey,
				IYCFBamDelSubDep1Obj >();
		}
		YCFBamDelSubDep1ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		key.setRequiredName( Name );
		IYCFBamDelSubDep1Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByUNameIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByUNameIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId,
				Name );
		}
		deepDisposeDelSubDep1ByUNameIdx( DelTopDepTenantId,
				DelTopDepId,
				Name );
	}
}

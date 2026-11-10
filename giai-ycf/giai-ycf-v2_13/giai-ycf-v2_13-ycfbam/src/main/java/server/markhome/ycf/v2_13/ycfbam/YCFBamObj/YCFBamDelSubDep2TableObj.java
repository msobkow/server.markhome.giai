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

public class YCFBamDelSubDep2TableObj
	implements IYCFBamDelSubDep2TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> members;
	private Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> allDelSubDep2;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > > indexByTenantIdx;
	private Map< YCFBamDelDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > > indexByDefSchemaIdx;
	private Map< YCFBamDelDepByDelDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > > indexByDelDepIdx;
	private Map< YCFBamDelSubDep2ByContDelDep1IdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > > indexByContDelDep1Idx;
	private Map< YCFBamDelSubDep2ByUNameIdxKey,
		IYCFBamDelSubDep2Obj > indexByUNameIdx;
	public static String TABLE_NAME = "DelSubDep2";
	public static String TABLE_DBNAME = "delsubdep2";

	public YCFBamDelSubDep2TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep2Obj>();
		allDelSubDep2 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByContDelDep1Idx = null;
		indexByUNameIdx = null;
	}

	public YCFBamDelSubDep2TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep2Obj>();
		allDelSubDep2 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByContDelDep1Idx = null;
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
		allDelSubDep2 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByContDelDep1Idx = null;
		indexByUNameIdx = null;
		List<IYCFBamDelSubDep2Obj> toForget = new LinkedList<IYCFBamDelSubDep2Obj>();
		IYCFBamDelSubDep2Obj cur = null;
		Iterator<IYCFBamDelSubDep2Obj> iter = members.values().iterator();
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
	 *	YCFBamDelSubDep2Obj.
	 */
	public IYCFBamDelSubDep2Obj newInstance() {
		IYCFBamDelSubDep2Obj inst = new YCFBamDelSubDep2Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamDelSubDep2Obj.
	 */
	public IYCFBamDelSubDep2EditObj newEditInstance( IYCFBamDelSubDep2Obj orig ) {
		IYCFBamDelSubDep2EditObj edit = new YCFBamDelSubDep2EditObj( orig );
		return( edit );
	}

	public IYCFBamDelSubDep2Obj realiseDelSubDep2( IYCFBamDelSubDep2Obj Obj ) {
		IYCFBamDelSubDep2Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelSubDep2Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamDelSubDep2Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByContDelDep1Idx != null ) {
				YCFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
				keyContDelDep1Idx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyContDelDep1Idx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapContDelDep1Idx = indexByContDelDep1Idx.get( keyContDelDep1Idx );
				if( mapContDelDep1Idx != null ) {
					mapContDelDep1Idx.remove( keepObj.getPKey() );
					if( mapContDelDep1Idx.size() <= 0 ) {
						indexByContDelDep1Idx.remove( keyContDelDep1Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyUNameIdx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamDelSubDep2Obj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContDelDep1Idx != null ) {
				YCFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
				keyContDelDep1Idx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyContDelDep1Idx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapContDelDep1Idx = indexByContDelDep1Idx.get( keyContDelDep1Idx );
				if( mapContDelDep1Idx != null ) {
					mapContDelDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyUNameIdx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allDelSubDep2 != null ) {
				allDelSubDep2.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamDelSubDep2Obj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelSubDep2 != null ) {
				allDelSubDep2.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContDelDep1Idx != null ) {
				YCFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
				keyContDelDep1Idx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyContDelDep1Idx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj > mapContDelDep1Idx = indexByContDelDep1Idx.get( keyContDelDep1Idx );
				if( mapContDelDep1Idx != null ) {
					mapContDelDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep2ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyUNameIdx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamDelSubDep2Obj createDelSubDep2( IYCFBamDelSubDep2Obj Obj ) {
		IYCFBamDelSubDep2Obj obj = Obj;
		YCFBamDelSubDep2Buff buff = obj.getDelSubDep2Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().createDelSubDep2(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81c" ) ) {
			obj = (IYCFBamDelSubDep2Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamDelSubDep2Obj readDelSubDep2( YCFBamScopePKey pkey ) {
		return( readDelSubDep2( pkey, false ) );
	}

	public IYCFBamDelSubDep2Obj readDelSubDep2( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamDelSubDep2Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamDelSubDep2Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamDelSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDelSubDep2Obj readCachedDelSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep2Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelSubDep2( IYCFBamDelSubDep2Obj obj )
	{
		final String S_ProcName = "YCFBamDelSubDep2TableObj.reallyDeepDisposeDelSubDep2() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelSubDep2Obj existing = readCachedDelSubDep2( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		keyContDelDep1Idx.setRequiredDelSubDep1TenantId( existing.getRequiredDelSubDep1TenantId() );
		keyContDelDep1Idx.setRequiredDelSubDep1Id( existing.getRequiredDelSubDep1Id() );

		YCFBamDelSubDep2ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredDelSubDep1TenantId( existing.getRequiredDelSubDep1TenantId() );
		keyUNameIdx.setRequiredDelSubDep1Id( existing.getRequiredDelSubDep1Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getDelSubDep3TableObj().deepDisposeDelSubDep3ByDelSubDep2Idx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByContDelDep1Idx != null ) {
			if( indexByContDelDep1Idx.containsKey( keyContDelDep1Idx ) ) {
				indexByContDelDep1Idx.get( keyContDelDep1Idx ).remove( pkey );
				if( indexByContDelDep1Idx.get( keyContDelDep1Idx ).size() <= 0 ) {
					indexByContDelDep1Idx.remove( keyContDelDep1Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getDelDepTableObj().reallyDeepDisposeDelDep( obj );
	}
	public void deepDisposeDelSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep2Obj obj = readCachedDelSubDep2( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDelSubDep2Obj lockDelSubDep2( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep2Obj locked = null;
		YCFBamDelSubDep2Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamDelSubDep2Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockDelSubDep2", pkey );
		}
		return( locked );
	}

	public List<IYCFBamDelSubDep2Obj> readAllDelSubDep2() {
		return( readAllDelSubDep2( false ) );
	}

	public List<IYCFBamDelSubDep2Obj> readAllDelSubDep2( boolean forceRead ) {
		final String S_ProcName = "readAllDelSubDep2";
		if( ( allDelSubDep2 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> map = new HashMap<YCFBamScopePKey,IYCFBamDelSubDep2Obj>();
			allDelSubDep2 = map;
			YCFBamDelSubDep2Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readAllDerived( schema.getAuthorization() );
			YCFBamDelSubDep2Buff buff;
			IYCFBamDelSubDep2Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep2Obj realised = (IYCFBamDelSubDep2Obj)obj.realise();
			}
		}
		int len = allDelSubDep2.size();
		IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
		Iterator<IYCFBamDelSubDep2Obj> valIter = allDelSubDep2.values().iterator();
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
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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
		List<IYCFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep2Obj> readCachedAllDelSubDep2() {
		final String S_ProcName = "readCachedAllDelSubDep2";
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>();
		if( allDelSubDep2 != null ) {
			int len = allDelSubDep2.size();
			IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
			Iterator<IYCFBamDelSubDep2Obj> valIter = allDelSubDep2.values().iterator();
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
		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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

	public IYCFBamDelSubDep2Obj readDelSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		return( readDelSubDep2ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamDelSubDep2Obj readDelSubDep2ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelSubDep2Obj obj = readDelSubDep2( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByTenantIdx( long TenantId )
	{
		return( readDelSubDep2ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep2Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep2Obj realised = (IYCFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
		Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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
		List<IYCFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelSubDep2ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep2Obj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep2Obj realised = (IYCFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
		Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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
		List<IYCFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelSubDep2ByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep2Obj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep2Obj realised = (IYCFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
		Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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
		List<IYCFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		return( readDelSubDep2ByContDelDep1Idx( DelSubDep1TenantId,
			DelSubDep1Id,
			false ) );
	}

	public List<IYCFBamDelSubDep2Obj> readDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByContDelDep1Idx";
		YCFBamDelSubDep2ByContDelDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
		if( indexByContDelDep1Idx == null ) {
			indexByContDelDep1Idx = new HashMap< YCFBamDelSubDep2ByContDelDep1IdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByContDelDep1Idx.containsKey( key ) ) {
			dict = indexByContDelDep1Idx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep2Obj>();
			IYCFBamDelSubDep2Obj obj;
			YCFBamDelSubDep2Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readDerivedByContDelDep1Idx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id );
			YCFBamDelSubDep2Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep2Obj realised = (IYCFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContDelDep1Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
		Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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
		List<IYCFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamDelSubDep2Obj readDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		return( readDelSubDep2ByUNameIdx( DelSubDep1TenantId,
			DelSubDep1Id,
			Name,
			false ) );
	}

	public IYCFBamDelSubDep2Obj readDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelSubDep2ByUNameIdxKey,
				IYCFBamDelSubDep2Obj >();
		}
		YCFBamDelSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		key.setRequiredName( Name );
		IYCFBamDelSubDep2Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamDelSubDep2Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readDerivedByUNameIdx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
			if( buff != null ) {
				obj = (IYCFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamDelSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDelSubDep2Obj readCachedDelSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelSubDep2Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelSubDep2( pkey );
		return( obj );
	}

	public List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelSubDep2ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
				Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep2Obj obj;
			Iterator<IYCFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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

	public List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelSubDep2ByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
				Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep2Obj obj;
			Iterator<IYCFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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

	public List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelSubDep2ByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>();
		if( indexByDelDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
				Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep2Obj obj;
			Iterator<IYCFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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

	public List<IYCFBamDelSubDep2Obj> readCachedDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		final String S_ProcName = "readCachedDelSubDep2ByContDelDep1Idx";
		YCFBamDelSubDep2ByContDelDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		ArrayList<IYCFBamDelSubDep2Obj> arrayList = new ArrayList<IYCFBamDelSubDep2Obj>();
		if( indexByContDelDep1Idx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict;
			if( indexByContDelDep1Idx.containsKey( key ) ) {
				dict = indexByContDelDep1Idx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep2Obj arr[] = new IYCFBamDelSubDep2Obj[len];
				Iterator<IYCFBamDelSubDep2Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep2Obj obj;
			Iterator<IYCFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep2Obj> cmp = new Comparator<IYCFBamDelSubDep2Obj>() {
			public int compare( IYCFBamDelSubDep2Obj lhs, IYCFBamDelSubDep2Obj rhs ) {
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

	public IYCFBamDelSubDep2Obj readCachedDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		IYCFBamDelSubDep2Obj obj = null;
		YCFBamDelSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamDelSubDep2Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamDelSubDep2Obj> valIter = members.values().iterator();
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

	public void deepDisposeDelSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelSubDep2Obj obj = readCachedDelSubDep2ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelSubDep2ByTenantIdx";
		IYCFBamDelSubDep2Obj obj;
		List<IYCFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeDelSubDep2ByDefSchemaIdx";
		IYCFBamDelSubDep2Obj obj;
		List<IYCFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeDelSubDep2ByDelDepIdx";
		IYCFBamDelSubDep2Obj obj;
		List<IYCFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		final String S_ProcName = "deepDisposeDelSubDep2ByContDelDep1Idx";
		IYCFBamDelSubDep2Obj obj;
		List<IYCFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByContDelDep1Idx( DelSubDep1TenantId,
				DelSubDep1Id );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		IYCFBamDelSubDep2Obj obj = readCachedDelSubDep2ByUNameIdx( DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDelSubDep2Obj updateDelSubDep2( IYCFBamDelSubDep2Obj Obj ) {
		IYCFBamDelSubDep2Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().updateDelSubDep2( schema.getAuthorization(),
			Obj.getDelSubDep2Buff() );
		if( Obj.getClassCode().equals( "a81c" ) ) {
			obj = (IYCFBamDelSubDep2Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelSubDep2( IYCFBamDelSubDep2Obj Obj ) {
		IYCFBamDelSubDep2Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2( schema.getAuthorization(),
			obj.getDelSubDep2Buff() );
		Obj.forget();
	}

	public void deleteDelSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelSubDep2Obj obj = readDelSubDep2( pkey );
		if( obj != null ) {
			IYCFBamDelSubDep2EditObj editObj = (IYCFBamDelSubDep2EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamDelSubDep2EditObj)obj.beginEdit();
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
		deepDisposeDelSubDep2ByIdIdx( TenantId,
				Id );
	}

	public void deleteDelSubDep2ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamDelSubDep2Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep2Obj obj;
			List<IYCFBamDelSubDep2Obj> toForget = new LinkedList<IYCFBamDelSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelSubDep2ByTenantIdx( TenantId );
	}

	public void deleteDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamDelSubDep2Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep2Obj obj;
			List<IYCFBamDelSubDep2Obj> toForget = new LinkedList<IYCFBamDelSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict = indexByDelDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamDelSubDep2Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep2Obj obj;
			List<IYCFBamDelSubDep2Obj> toForget = new LinkedList<IYCFBamDelSubDep2Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelSubDep2ByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		YCFBamDelSubDep2ByContDelDep1IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		if( indexByContDelDep1Idx == null ) {
			indexByContDelDep1Idx = new HashMap< YCFBamDelSubDep2ByContDelDep1IdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep2Obj > >();
		}
		if( indexByContDelDep1Idx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep2Obj> dict = indexByContDelDep1Idx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByContDelDep1Idx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id );
			Iterator<IYCFBamDelSubDep2Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep2Obj obj;
			List<IYCFBamDelSubDep2Obj> toForget = new LinkedList<IYCFBamDelSubDep2Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByContDelDep1Idx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByContDelDep1Idx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id );
		}
		deepDisposeDelSubDep2ByContDelDep1Idx( DelSubDep1TenantId,
				DelSubDep1Id );
	}

	public void deleteDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelSubDep2ByUNameIdxKey,
				IYCFBamDelSubDep2Obj >();
		}
		YCFBamDelSubDep2ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		key.setRequiredName( Name );
		IYCFBamDelSubDep2Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByUNameIdx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByUNameIdx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
		}
		deepDisposeDelSubDep2ByUNameIdx( DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
	}
}

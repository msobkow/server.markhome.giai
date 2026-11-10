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

public class YCFBamDelSubDep3TableObj
	implements IYCFBamDelSubDep3TableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> members;
	private Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> allDelSubDep3;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > > indexByTenantIdx;
	private Map< YCFBamDelDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > > indexByDefSchemaIdx;
	private Map< YCFBamDelDepByDelDepIdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > > indexByDelDepIdx;
	private Map< YCFBamDelSubDep3ByDelSubDep2IdxKey,
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > > indexByDelSubDep2Idx;
	private Map< YCFBamDelSubDep3ByUNameIdxKey,
		IYCFBamDelSubDep3Obj > indexByUNameIdx;
	public static String TABLE_NAME = "DelSubDep3";
	public static String TABLE_DBNAME = "delsubdep3";

	public YCFBamDelSubDep3TableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep3Obj>();
		allDelSubDep3 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelSubDep2Idx = null;
		indexByUNameIdx = null;
	}

	public YCFBamDelSubDep3TableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep3Obj>();
		allDelSubDep3 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelSubDep2Idx = null;
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
		allDelSubDep3 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelSubDep2Idx = null;
		indexByUNameIdx = null;
		List<IYCFBamDelSubDep3Obj> toForget = new LinkedList<IYCFBamDelSubDep3Obj>();
		IYCFBamDelSubDep3Obj cur = null;
		Iterator<IYCFBamDelSubDep3Obj> iter = members.values().iterator();
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
	 *	YCFBamDelSubDep3Obj.
	 */
	public IYCFBamDelSubDep3Obj newInstance() {
		IYCFBamDelSubDep3Obj inst = new YCFBamDelSubDep3Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamDelSubDep3Obj.
	 */
	public IYCFBamDelSubDep3EditObj newEditInstance( IYCFBamDelSubDep3Obj orig ) {
		IYCFBamDelSubDep3EditObj edit = new YCFBamDelSubDep3EditObj( orig );
		return( edit );
	}

	public IYCFBamDelSubDep3Obj realiseDelSubDep3( IYCFBamDelSubDep3Obj Obj ) {
		IYCFBamDelSubDep3Obj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelSubDep3Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamDelSubDep3Obj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByDelSubDep2Idx != null ) {
				YCFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
				keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyDelSubDep2Idx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDelSubDep2Idx = indexByDelSubDep2Idx.get( keyDelSubDep2Idx );
				if( mapDelSubDep2Idx != null ) {
					mapDelSubDep2Idx.remove( keepObj.getPKey() );
					if( mapDelSubDep2Idx.size() <= 0 ) {
						indexByDelSubDep2Idx.remove( keyDelSubDep2Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyUNameIdx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamDelSubDep3Obj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelSubDep2Idx != null ) {
				YCFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
				keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyDelSubDep2Idx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDelSubDep2Idx = indexByDelSubDep2Idx.get( keyDelSubDep2Idx );
				if( mapDelSubDep2Idx != null ) {
					mapDelSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyUNameIdx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allDelSubDep3 != null ) {
				allDelSubDep3.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamDelSubDep3Obj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelSubDep3 != null ) {
				allDelSubDep3.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				YCFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelSubDep2Idx != null ) {
				YCFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
				keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyDelSubDep2Idx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj > mapDelSubDep2Idx = indexByDelSubDep2Idx.get( keyDelSubDep2Idx );
				if( mapDelSubDep2Idx != null ) {
					mapDelSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamDelSubDep3ByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyUNameIdx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamDelSubDep3Obj createDelSubDep3( IYCFBamDelSubDep3Obj Obj ) {
		IYCFBamDelSubDep3Obj obj = Obj;
		YCFBamDelSubDep3Buff buff = obj.getDelSubDep3Buff();
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().createDelSubDep3(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81d" ) ) {
			obj = (IYCFBamDelSubDep3Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamDelSubDep3Obj readDelSubDep3( YCFBamScopePKey pkey ) {
		return( readDelSubDep3( pkey, false ) );
	}

	public IYCFBamDelSubDep3Obj readDelSubDep3( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamDelSubDep3Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamDelSubDep3Buff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamDelSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDelSubDep3Obj readCachedDelSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep3Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelSubDep3( IYCFBamDelSubDep3Obj obj )
	{
		final String S_ProcName = "YCFBamDelSubDep3TableObj.reallyDeepDisposeDelSubDep3() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamDelSubDep3Obj existing = readCachedDelSubDep3( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		keyDelSubDep2Idx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );

		YCFBamDelSubDep3ByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		keyUNameIdx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByDelSubDep2Idx != null ) {
			if( indexByDelSubDep2Idx.containsKey( keyDelSubDep2Idx ) ) {
				indexByDelSubDep2Idx.get( keyDelSubDep2Idx ).remove( pkey );
				if( indexByDelSubDep2Idx.get( keyDelSubDep2Idx ).size() <= 0 ) {
					indexByDelSubDep2Idx.remove( keyDelSubDep2Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getDelDepTableObj().reallyDeepDisposeDelDep( obj );
	}
	public void deepDisposeDelSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep3Obj obj = readCachedDelSubDep3( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDelSubDep3Obj lockDelSubDep3( YCFBamScopePKey pkey ) {
		IYCFBamDelSubDep3Obj locked = null;
		YCFBamDelSubDep3Buff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamDelSubDep3Obj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockDelSubDep3", pkey );
		}
		return( locked );
	}

	public List<IYCFBamDelSubDep3Obj> readAllDelSubDep3() {
		return( readAllDelSubDep3( false ) );
	}

	public List<IYCFBamDelSubDep3Obj> readAllDelSubDep3( boolean forceRead ) {
		final String S_ProcName = "readAllDelSubDep3";
		if( ( allDelSubDep3 == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> map = new HashMap<YCFBamScopePKey,IYCFBamDelSubDep3Obj>();
			allDelSubDep3 = map;
			YCFBamDelSubDep3Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readAllDerived( schema.getAuthorization() );
			YCFBamDelSubDep3Buff buff;
			IYCFBamDelSubDep3Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep3Obj realised = (IYCFBamDelSubDep3Obj)obj.realise();
			}
		}
		int len = allDelSubDep3.size();
		IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
		Iterator<IYCFBamDelSubDep3Obj> valIter = allDelSubDep3.values().iterator();
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
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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
		List<IYCFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep3Obj> readCachedAllDelSubDep3() {
		final String S_ProcName = "readCachedAllDelSubDep3";
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>();
		if( allDelSubDep3 != null ) {
			int len = allDelSubDep3.size();
			IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
			Iterator<IYCFBamDelSubDep3Obj> valIter = allDelSubDep3.values().iterator();
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
		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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

	public IYCFBamDelSubDep3Obj readDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		return( readDelSubDep3ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamDelSubDep3Obj readDelSubDep3ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelSubDep3Obj obj = readDelSubDep3( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByTenantIdx( long TenantId )
	{
		return( readDelSubDep3ByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep3Obj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep3Obj realised = (IYCFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
		Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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
		List<IYCFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelSubDep3ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep3Obj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep3Obj realised = (IYCFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
		Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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
		List<IYCFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelSubDep3ByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep3Obj>();
			IYCFBamDelDepObj obj;
			YCFBamDelDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep3Obj realised = (IYCFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
		Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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
		List<IYCFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		return( readDelSubDep3ByDelSubDep2Idx( DelSubDep2TenantId,
			DelSubDep2Id,
			false ) );
	}

	public List<IYCFBamDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByDelSubDep2Idx";
		YCFBamDelSubDep3ByDelSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
		if( indexByDelSubDep2Idx == null ) {
			indexByDelSubDep2Idx = new HashMap< YCFBamDelSubDep3ByDelSubDep2IdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDelSubDep2Idx.containsKey( key ) ) {
			dict = indexByDelSubDep2Idx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamDelSubDep3Obj>();
			IYCFBamDelSubDep3Obj obj;
			YCFBamDelSubDep3Buff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readDerivedByDelSubDep2Idx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id );
			YCFBamDelSubDep3Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamDelSubDep3Obj realised = (IYCFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelSubDep2Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
		Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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
		List<IYCFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamDelSubDep3Obj readDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		return( readDelSubDep3ByUNameIdx( DelSubDep2TenantId,
			DelSubDep2Id,
			Name,
			false ) );
	}

	public IYCFBamDelSubDep3Obj readDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelSubDep3ByUNameIdxKey,
				IYCFBamDelSubDep3Obj >();
		}
		YCFBamDelSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		key.setRequiredName( Name );
		IYCFBamDelSubDep3Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamDelSubDep3Buff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readDerivedByUNameIdx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
			if( buff != null ) {
				obj = (IYCFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamDelSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamDelSubDep3Obj readCachedDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelSubDep3Obj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelSubDep3( pkey );
		return( obj );
	}

	public List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelSubDep3ByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
				Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep3Obj obj;
			Iterator<IYCFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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

	public List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelSubDep3ByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
				Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep3Obj obj;
			Iterator<IYCFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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

	public List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelSubDep3ByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>();
		if( indexByDelDepIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
				Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep3Obj obj;
			Iterator<IYCFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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

	public List<IYCFBamDelSubDep3Obj> readCachedDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		final String S_ProcName = "readCachedDelSubDep3ByDelSubDep2Idx";
		YCFBamDelSubDep3ByDelSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		ArrayList<IYCFBamDelSubDep3Obj> arrayList = new ArrayList<IYCFBamDelSubDep3Obj>();
		if( indexByDelSubDep2Idx != null ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict;
			if( indexByDelSubDep2Idx.containsKey( key ) ) {
				dict = indexByDelSubDep2Idx.get( key );
				int len = dict.size();
				IYCFBamDelSubDep3Obj arr[] = new IYCFBamDelSubDep3Obj[len];
				Iterator<IYCFBamDelSubDep3Obj> valIter = dict.values().iterator();
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
			IYCFBamDelSubDep3Obj obj;
			Iterator<IYCFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamDelSubDep3Obj> cmp = new Comparator<IYCFBamDelSubDep3Obj>() {
			public int compare( IYCFBamDelSubDep3Obj lhs, IYCFBamDelSubDep3Obj rhs ) {
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

	public IYCFBamDelSubDep3Obj readCachedDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		IYCFBamDelSubDep3Obj obj = null;
		YCFBamDelSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamDelSubDep3Obj> valIter = members.values().iterator();
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
			Iterator<IYCFBamDelSubDep3Obj> valIter = members.values().iterator();
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

	public void deepDisposeDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamDelSubDep3Obj obj = readCachedDelSubDep3ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByTenantIdx";
		IYCFBamDelSubDep3Obj obj;
		List<IYCFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByDefSchemaIdx";
		IYCFBamDelSubDep3Obj obj;
		List<IYCFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByDelDepIdx";
		IYCFBamDelSubDep3Obj obj;
		List<IYCFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByDelSubDep2Idx";
		IYCFBamDelSubDep3Obj obj;
		List<IYCFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByDelSubDep2Idx( DelSubDep2TenantId,
				DelSubDep2Id );
		if( arrayList != null )  {
			Iterator<IYCFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		IYCFBamDelSubDep3Obj obj = readCachedDelSubDep3ByUNameIdx( DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamDelSubDep3Obj updateDelSubDep3( IYCFBamDelSubDep3Obj Obj ) {
		IYCFBamDelSubDep3Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().updateDelSubDep3( schema.getAuthorization(),
			Obj.getDelSubDep3Buff() );
		if( Obj.getClassCode().equals( "a81d" ) ) {
			obj = (IYCFBamDelSubDep3Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelSubDep3( IYCFBamDelSubDep3Obj Obj ) {
		IYCFBamDelSubDep3Obj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3( schema.getAuthorization(),
			obj.getDelSubDep3Buff() );
		Obj.forget();
	}

	public void deleteDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamDelSubDep3Obj obj = readDelSubDep3( pkey );
		if( obj != null ) {
			IYCFBamDelSubDep3EditObj editObj = (IYCFBamDelSubDep3EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamDelSubDep3EditObj)obj.beginEdit();
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
		deepDisposeDelSubDep3ByIdIdx( TenantId,
				Id );
	}

	public void deleteDelSubDep3ByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamDelSubDep3Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep3Obj obj;
			List<IYCFBamDelSubDep3Obj> toForget = new LinkedList<IYCFBamDelSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelSubDep3ByTenantIdx( TenantId );
	}

	public void deleteDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamDelSubDep3Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep3Obj obj;
			List<IYCFBamDelSubDep3Obj> toForget = new LinkedList<IYCFBamDelSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict = indexByDelDepIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamDelSubDep3Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep3Obj obj;
			List<IYCFBamDelSubDep3Obj> toForget = new LinkedList<IYCFBamDelSubDep3Obj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelSubDep3ByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		YCFBamDelSubDep3ByDelSubDep2IdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		if( indexByDelSubDep2Idx == null ) {
			indexByDelSubDep2Idx = new HashMap< YCFBamDelSubDep3ByDelSubDep2IdxKey,
				Map< YCFBamScopePKey, IYCFBamDelSubDep3Obj > >();
		}
		if( indexByDelSubDep2Idx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamDelSubDep3Obj> dict = indexByDelSubDep2Idx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelSubDep2Idx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id );
			Iterator<IYCFBamDelSubDep3Obj> iter = dict.values().iterator();
			IYCFBamDelSubDep3Obj obj;
			List<IYCFBamDelSubDep3Obj> toForget = new LinkedList<IYCFBamDelSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelSubDep2Idx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelSubDep2Idx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id );
		}
		deepDisposeDelSubDep3ByDelSubDep2Idx( DelSubDep2TenantId,
				DelSubDep2Id );
	}

	public void deleteDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamDelSubDep3ByUNameIdxKey,
				IYCFBamDelSubDep3Obj >();
		}
		YCFBamDelSubDep3ByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		key.setRequiredName( Name );
		IYCFBamDelSubDep3Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByUNameIdx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByUNameIdx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
		}
		deepDisposeDelSubDep3ByUNameIdx( DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
	}
}

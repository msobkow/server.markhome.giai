// Description: Java 11 Table Object implementation for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamDelSubDep2TableObj
	implements ICFBamDelSubDep2TableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamDelSubDep2Obj> members;
	private Map<CFBamScopePKey, ICFBamDelSubDep2Obj> allDelSubDep2;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj > > indexByTenantIdx;
	private Map< CFBamDelDepByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj > > indexByDefSchemaIdx;
	private Map< CFBamDelDepByDelDepIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj > > indexByDelDepIdx;
	private Map< CFBamDelSubDep2ByContDelDep1IdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj > > indexByContDelDep1Idx;
	private Map< CFBamDelSubDep2ByUNameIdxKey,
		ICFBamDelSubDep2Obj > indexByUNameIdx;
	public static String TABLE_NAME = "DelSubDep2";
	public static String TABLE_DBNAME = "delsubdep2";

	public CFBamDelSubDep2TableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamDelSubDep2Obj>();
		allDelSubDep2 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByContDelDep1Idx = null;
		indexByUNameIdx = null;
	}

	public CFBamDelSubDep2TableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamDelSubDep2Obj>();
		allDelSubDep2 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByContDelDep1Idx = null;
		indexByUNameIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allDelSubDep2 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByContDelDep1Idx = null;
		indexByUNameIdx = null;
		List<ICFBamDelSubDep2Obj> toForget = new LinkedList<ICFBamDelSubDep2Obj>();
		ICFBamDelSubDep2Obj cur = null;
		Iterator<ICFBamDelSubDep2Obj> iter = members.values().iterator();
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
	 *	CFBamDelSubDep2Obj.
	 */
	public ICFBamDelSubDep2Obj newInstance() {
		ICFBamDelSubDep2Obj inst = new CFBamDelSubDep2Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamDelSubDep2Obj.
	 */
	public ICFBamDelSubDep2EditObj newEditInstance( ICFBamDelSubDep2Obj orig ) {
		ICFBamDelSubDep2EditObj edit = new CFBamDelSubDep2EditObj( orig );
		return( edit );
	}

	public ICFBamDelSubDep2Obj realiseDelSubDep2( ICFBamDelSubDep2Obj Obj ) {
		ICFBamDelSubDep2Obj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelSubDep2Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamDelSubDep2Obj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByContDelDep1Idx != null ) {
				CFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
				keyContDelDep1Idx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyContDelDep1Idx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapContDelDep1Idx = indexByContDelDep1Idx.get( keyContDelDep1Idx );
				if( mapContDelDep1Idx != null ) {
					mapContDelDep1Idx.remove( keepObj.getPKey() );
					if( mapContDelDep1Idx.size() <= 0 ) {
						indexByContDelDep1Idx.remove( keyContDelDep1Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep2ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyUNameIdx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamDelSubDep2Obj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContDelDep1Idx != null ) {
				CFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
				keyContDelDep1Idx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyContDelDep1Idx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapContDelDep1Idx = indexByContDelDep1Idx.get( keyContDelDep1Idx );
				if( mapContDelDep1Idx != null ) {
					mapContDelDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep2ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
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
			keepObj = (ICFBamDelSubDep2Obj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelSubDep2 != null ) {
				allDelSubDep2.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContDelDep1Idx != null ) {
				CFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
				keyContDelDep1Idx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyContDelDep1Idx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				Map<CFBamScopePKey, ICFBamDelSubDep2Obj > mapContDelDep1Idx = indexByContDelDep1Idx.get( keyContDelDep1Idx );
				if( mapContDelDep1Idx != null ) {
					mapContDelDep1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep2ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep1TenantId( keepObj.getRequiredDelSubDep1TenantId() );
				keyUNameIdx.setRequiredDelSubDep1Id( keepObj.getRequiredDelSubDep1Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFBamDelSubDep2Obj createDelSubDep2( ICFBamDelSubDep2Obj Obj ) {
		ICFBamDelSubDep2Obj obj = Obj;
		CFBamDelSubDep2Buff buff = obj.getDelSubDep2Buff();
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().createDelSubDep2(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81c" ) ) {
			obj = (ICFBamDelSubDep2Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamDelSubDep2Obj readDelSubDep2( CFBamScopePKey pkey ) {
		return( readDelSubDep2( pkey, false ) );
	}

	public ICFBamDelSubDep2Obj readDelSubDep2( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamDelSubDep2Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamDelSubDep2Buff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamDelSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamDelSubDep2Obj readCachedDelSubDep2( CFBamScopePKey pkey ) {
		ICFBamDelSubDep2Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelSubDep2( ICFBamDelSubDep2Obj obj )
	{
		final String S_ProcName = "CFBamDelSubDep2TableObj.reallyDeepDisposeDelSubDep2() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelSubDep2Obj existing = readCachedDelSubDep2( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		keyContDelDep1Idx.setRequiredDelSubDep1TenantId( existing.getRequiredDelSubDep1TenantId() );
		keyContDelDep1Idx.setRequiredDelSubDep1Id( existing.getRequiredDelSubDep1Id() );

		CFBamDelSubDep2ByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
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
	public void deepDisposeDelSubDep2( CFBamScopePKey pkey ) {
		ICFBamDelSubDep2Obj obj = readCachedDelSubDep2( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamDelSubDep2Obj lockDelSubDep2( CFBamScopePKey pkey ) {
		ICFBamDelSubDep2Obj locked = null;
		CFBamDelSubDep2Buff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamDelSubDep2Obj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockDelSubDep2", pkey );
		}
		return( locked );
	}

	public List<ICFBamDelSubDep2Obj> readAllDelSubDep2() {
		return( readAllDelSubDep2( false ) );
	}

	public List<ICFBamDelSubDep2Obj> readAllDelSubDep2( boolean forceRead ) {
		final String S_ProcName = "readAllDelSubDep2";
		if( ( allDelSubDep2 == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> map = new HashMap<CFBamScopePKey,ICFBamDelSubDep2Obj>();
			allDelSubDep2 = map;
			CFBamDelSubDep2Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readAllDerived( schema.getAuthorization() );
			CFBamDelSubDep2Buff buff;
			ICFBamDelSubDep2Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep2Obj realised = (ICFBamDelSubDep2Obj)obj.realise();
			}
		}
		int len = allDelSubDep2.size();
		ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
		Iterator<ICFBamDelSubDep2Obj> valIter = allDelSubDep2.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep2Obj> readCachedAllDelSubDep2() {
		final String S_ProcName = "readCachedAllDelSubDep2";
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>();
		if( allDelSubDep2 != null ) {
			int len = allDelSubDep2.size();
			ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
			Iterator<ICFBamDelSubDep2Obj> valIter = allDelSubDep2.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
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
		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamDelSubDep2Obj readDelSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		return( readDelSubDep2ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamDelSubDep2Obj readDelSubDep2ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelSubDep2Obj obj = readDelSubDep2( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByTenantIdx( long TenantId )
	{
		return( readDelSubDep2ByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep2Obj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep2Obj realised = (ICFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
		Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelSubDep2ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep2Obj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep2Obj realised = (ICFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
		Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelSubDep2ByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep2Obj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep2Obj realised = (ICFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
		Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		return( readDelSubDep2ByContDelDep1Idx( DelSubDep1TenantId,
			DelSubDep1Id,
			false ) );
	}

	public List<ICFBamDelSubDep2Obj> readDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep2ByContDelDep1Idx";
		CFBamDelSubDep2ByContDelDep1IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
		if( indexByContDelDep1Idx == null ) {
			indexByContDelDep1Idx = new HashMap< CFBamDelSubDep2ByContDelDep1IdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( ( ! forceRead ) && indexByContDelDep1Idx.containsKey( key ) ) {
			dict = indexByContDelDep1Idx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep2Obj>();
			ICFBamDelSubDep2Obj obj;
			CFBamDelSubDep2Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readDerivedByContDelDep1Idx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id );
			CFBamDelSubDep2Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep2Obj realised = (ICFBamDelSubDep2Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContDelDep1Idx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
		Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep2Obj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamDelSubDep2Obj readDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		return( readDelSubDep2ByUNameIdx( DelSubDep1TenantId,
			DelSubDep1Id,
			Name,
			false ) );
	}

	public ICFBamDelSubDep2Obj readDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamDelSubDep2ByUNameIdxKey,
				ICFBamDelSubDep2Obj >();
		}
		CFBamDelSubDep2ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		key.setRequiredName( Name );
		ICFBamDelSubDep2Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamDelSubDep2Buff buff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().readDerivedByUNameIdx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
			if( buff != null ) {
				obj = (ICFBamDelSubDep2Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamDelSubDep2Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamDelSubDep2Obj readCachedDelSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamDelSubDep2Obj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelSubDep2( pkey );
		return( obj );
	}

	public List<ICFBamDelSubDep2Obj> readCachedDelSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelSubDep2ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
				Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamDelSubDep2Obj obj;
			Iterator<ICFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelSubDep2Obj> readCachedDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelSubDep2ByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
				Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamDelSubDep2Obj obj;
			Iterator<ICFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelSubDep2Obj> readCachedDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelSubDep2ByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>();
		if( indexByDelDepIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
				Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamDelSubDep2Obj obj;
			Iterator<ICFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelSubDep2Obj> readCachedDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		final String S_ProcName = "readCachedDelSubDep2ByContDelDep1Idx";
		CFBamDelSubDep2ByContDelDep1IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		ArrayList<ICFBamDelSubDep2Obj> arrayList = new ArrayList<ICFBamDelSubDep2Obj>();
		if( indexByContDelDep1Idx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict;
			if( indexByContDelDep1Idx.containsKey( key ) ) {
				dict = indexByContDelDep1Idx.get( key );
				int len = dict.size();
				ICFBamDelSubDep2Obj arr[] = new ICFBamDelSubDep2Obj[len];
				Iterator<ICFBamDelSubDep2Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFBamDelSubDep2Obj obj;
			Iterator<ICFBamDelSubDep2Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep2Obj> cmp = new Comparator<ICFBamDelSubDep2Obj>() {
			public int compare( ICFBamDelSubDep2Obj lhs, ICFBamDelSubDep2Obj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamDelSubDep2Obj readCachedDelSubDep2ByUNameIdx( long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		ICFBamDelSubDep2Obj obj = null;
		CFBamDelSubDep2ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamDelSubDep2Obj> valIter = members.values().iterator();
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
			Iterator<ICFBamDelSubDep2Obj> valIter = members.values().iterator();
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
		ICFBamDelSubDep2Obj obj = readCachedDelSubDep2ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelSubDep2ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelSubDep2ByTenantIdx";
		ICFBamDelSubDep2Obj obj;
		List<ICFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep2Obj obj;
		List<ICFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep2Obj obj;
		List<ICFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep2Obj obj;
		List<ICFBamDelSubDep2Obj> arrayList = readCachedDelSubDep2ByContDelDep1Idx( DelSubDep1TenantId,
				DelSubDep1Id );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep2Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep2Obj obj = readCachedDelSubDep2ByUNameIdx( DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamDelSubDep2Obj updateDelSubDep2( ICFBamDelSubDep2Obj Obj ) {
		ICFBamDelSubDep2Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().updateDelSubDep2( schema.getAuthorization(),
			Obj.getDelSubDep2Buff() );
		if( Obj.getClassCode().equals( "a81c" ) ) {
			obj = (ICFBamDelSubDep2Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelSubDep2( ICFBamDelSubDep2Obj Obj ) {
		ICFBamDelSubDep2Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2( schema.getAuthorization(),
			obj.getDelSubDep2Buff() );
		Obj.forget();
	}

	public void deleteDelSubDep2ByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelSubDep2Obj obj = readDelSubDep2( pkey );
		if( obj != null ) {
			ICFBamDelSubDep2EditObj editObj = (ICFBamDelSubDep2EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamDelSubDep2EditObj)obj.beginEdit();
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
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamDelSubDep2Obj> iter = dict.values().iterator();
			ICFBamDelSubDep2Obj obj;
			List<ICFBamDelSubDep2Obj> toForget = new LinkedList<ICFBamDelSubDep2Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelSubDep2ByTenantIdx( TenantId );
	}

	public void deleteDelSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamDelSubDep2Obj> iter = dict.values().iterator();
			ICFBamDelSubDep2Obj obj;
			List<ICFBamDelSubDep2Obj> toForget = new LinkedList<ICFBamDelSubDep2Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelSubDep2ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelSubDep2ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict = indexByDelDepIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<ICFBamDelSubDep2Obj> iter = dict.values().iterator();
			ICFBamDelSubDep2Obj obj;
			List<ICFBamDelSubDep2Obj> toForget = new LinkedList<ICFBamDelSubDep2Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelSubDep2ByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelSubDep2ByContDelDep1Idx( long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		CFBamDelSubDep2ByContDelDep1IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		if( indexByContDelDep1Idx == null ) {
			indexByContDelDep1Idx = new HashMap< CFBamDelSubDep2ByContDelDep1IdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep2Obj > >();
		}
		if( indexByContDelDep1Idx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep2Obj> dict = indexByContDelDep1Idx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByContDelDep1Idx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id );
			Iterator<ICFBamDelSubDep2Obj> iter = dict.values().iterator();
			ICFBamDelSubDep2Obj obj;
			List<ICFBamDelSubDep2Obj> toForget = new LinkedList<ICFBamDelSubDep2Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByContDelDep1Idx( schema.getAuthorization(),
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
			indexByUNameIdx = new HashMap< CFBamDelSubDep2ByUNameIdxKey,
				ICFBamDelSubDep2Obj >();
		}
		CFBamDelSubDep2ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		key.setRequiredName( Name );
		ICFBamDelSubDep2Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByUNameIdx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep2().deleteDelSubDep2ByUNameIdx( schema.getAuthorization(),
				DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
		}
		deepDisposeDelSubDep2ByUNameIdx( DelSubDep1TenantId,
				DelSubDep1Id,
				Name );
	}
}
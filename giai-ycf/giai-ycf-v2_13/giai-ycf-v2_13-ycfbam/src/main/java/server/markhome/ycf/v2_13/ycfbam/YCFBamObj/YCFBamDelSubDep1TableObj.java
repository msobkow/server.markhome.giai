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

public class CFBamDelSubDep1TableObj
	implements ICFBamDelSubDep1TableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamDelSubDep1Obj> members;
	private Map<CFBamScopePKey, ICFBamDelSubDep1Obj> allDelSubDep1;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj > > indexByTenantIdx;
	private Map< CFBamDelDepByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj > > indexByDefSchemaIdx;
	private Map< CFBamDelDepByDelDepIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj > > indexByDelDepIdx;
	private Map< CFBamDelSubDep1ByDelTopDepIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj > > indexByDelTopDepIdx;
	private Map< CFBamDelSubDep1ByUNameIdxKey,
		ICFBamDelSubDep1Obj > indexByUNameIdx;
	public static String TABLE_NAME = "DelSubDep1";
	public static String TABLE_DBNAME = "delsubdep1";

	public CFBamDelSubDep1TableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamDelSubDep1Obj>();
		allDelSubDep1 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepIdx = null;
		indexByUNameIdx = null;
	}

	public CFBamDelSubDep1TableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamDelSubDep1Obj>();
		allDelSubDep1 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepIdx = null;
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
		allDelSubDep1 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelTopDepIdx = null;
		indexByUNameIdx = null;
		List<ICFBamDelSubDep1Obj> toForget = new LinkedList<ICFBamDelSubDep1Obj>();
		ICFBamDelSubDep1Obj cur = null;
		Iterator<ICFBamDelSubDep1Obj> iter = members.values().iterator();
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
	 *	CFBamDelSubDep1Obj.
	 */
	public ICFBamDelSubDep1Obj newInstance() {
		ICFBamDelSubDep1Obj inst = new CFBamDelSubDep1Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamDelSubDep1Obj.
	 */
	public ICFBamDelSubDep1EditObj newEditInstance( ICFBamDelSubDep1Obj orig ) {
		ICFBamDelSubDep1EditObj edit = new CFBamDelSubDep1EditObj( orig );
		return( edit );
	}

	public ICFBamDelSubDep1Obj realiseDelSubDep1( ICFBamDelSubDep1Obj Obj ) {
		ICFBamDelSubDep1Obj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelSubDep1Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamDelSubDep1Obj existingObj = members.get( pkey );
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
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByDelTopDepIdx != null ) {
				CFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
				keyDelTopDepIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyDelTopDepIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDelTopDepIdx = indexByDelTopDepIdx.get( keyDelTopDepIdx );
				if( mapDelTopDepIdx != null ) {
					mapDelTopDepIdx.remove( keepObj.getPKey() );
					if( mapDelTopDepIdx.size() <= 0 ) {
						indexByDelTopDepIdx.remove( keyDelTopDepIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep1ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyUNameIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamDelSubDep1Obj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepIdx != null ) {
				CFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
				keyDelTopDepIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyDelTopDepIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDelTopDepIdx = indexByDelTopDepIdx.get( keyDelTopDepIdx );
				if( mapDelTopDepIdx != null ) {
					mapDelTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep1ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
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
			keepObj = (ICFBamDelSubDep1Obj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelSubDep1 != null ) {
				allDelSubDep1.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelTopDepIdx != null ) {
				CFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
				keyDelTopDepIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyDelTopDepIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				Map<CFBamScopePKey, ICFBamDelSubDep1Obj > mapDelTopDepIdx = indexByDelTopDepIdx.get( keyDelTopDepIdx );
				if( mapDelTopDepIdx != null ) {
					mapDelTopDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep1ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
				keyUNameIdx.setRequiredDelTopDepTenantId( keepObj.getRequiredDelTopDepTenantId() );
				keyUNameIdx.setRequiredDelTopDepId( keepObj.getRequiredDelTopDepId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFBamDelSubDep1Obj createDelSubDep1( ICFBamDelSubDep1Obj Obj ) {
		ICFBamDelSubDep1Obj obj = Obj;
		CFBamDelSubDep1Buff buff = obj.getDelSubDep1Buff();
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().createDelSubDep1(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81b" ) ) {
			obj = (ICFBamDelSubDep1Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamDelSubDep1Obj readDelSubDep1( CFBamScopePKey pkey ) {
		return( readDelSubDep1( pkey, false ) );
	}

	public ICFBamDelSubDep1Obj readDelSubDep1( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamDelSubDep1Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamDelSubDep1Buff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamDelSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamDelSubDep1Obj readCachedDelSubDep1( CFBamScopePKey pkey ) {
		ICFBamDelSubDep1Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelSubDep1( ICFBamDelSubDep1Obj obj )
	{
		final String S_ProcName = "CFBamDelSubDep1TableObj.reallyDeepDisposeDelSubDep1() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelSubDep1Obj existing = readCachedDelSubDep1( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		keyDelTopDepIdx.setRequiredDelTopDepTenantId( existing.getRequiredDelTopDepTenantId() );
		keyDelTopDepIdx.setRequiredDelTopDepId( existing.getRequiredDelTopDepId() );

		CFBamDelSubDep1ByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
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
	public void deepDisposeDelSubDep1( CFBamScopePKey pkey ) {
		ICFBamDelSubDep1Obj obj = readCachedDelSubDep1( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamDelSubDep1Obj lockDelSubDep1( CFBamScopePKey pkey ) {
		ICFBamDelSubDep1Obj locked = null;
		CFBamDelSubDep1Buff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamDelSubDep1Obj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockDelSubDep1", pkey );
		}
		return( locked );
	}

	public List<ICFBamDelSubDep1Obj> readAllDelSubDep1() {
		return( readAllDelSubDep1( false ) );
	}

	public List<ICFBamDelSubDep1Obj> readAllDelSubDep1( boolean forceRead ) {
		final String S_ProcName = "readAllDelSubDep1";
		if( ( allDelSubDep1 == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> map = new HashMap<CFBamScopePKey,ICFBamDelSubDep1Obj>();
			allDelSubDep1 = map;
			CFBamDelSubDep1Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readAllDerived( schema.getAuthorization() );
			CFBamDelSubDep1Buff buff;
			ICFBamDelSubDep1Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep1Obj realised = (ICFBamDelSubDep1Obj)obj.realise();
			}
		}
		int len = allDelSubDep1.size();
		ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
		Iterator<ICFBamDelSubDep1Obj> valIter = allDelSubDep1.values().iterator();
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
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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
		List<ICFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep1Obj> readCachedAllDelSubDep1() {
		final String S_ProcName = "readCachedAllDelSubDep1";
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>();
		if( allDelSubDep1 != null ) {
			int len = allDelSubDep1.size();
			ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
			Iterator<ICFBamDelSubDep1Obj> valIter = allDelSubDep1.values().iterator();
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
		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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

	public ICFBamDelSubDep1Obj readDelSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		return( readDelSubDep1ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamDelSubDep1Obj readDelSubDep1ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelSubDep1Obj obj = readDelSubDep1( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByTenantIdx( long TenantId )
	{
		return( readDelSubDep1ByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep1Obj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep1Obj realised = (ICFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
		Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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
		List<ICFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelSubDep1ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep1Obj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep1Obj realised = (ICFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
		Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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
		List<ICFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelSubDep1ByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep1Obj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep1Obj realised = (ICFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
		Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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
		List<ICFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId )
	{
		return( readDelSubDep1ByDelTopDepIdx( DelTopDepTenantId,
			DelTopDepId,
			false ) );
	}

	public List<ICFBamDelSubDep1Obj> readDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep1ByDelTopDepIdx";
		CFBamDelSubDep1ByDelTopDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
		if( indexByDelTopDepIdx == null ) {
			indexByDelTopDepIdx = new HashMap< CFBamDelSubDep1ByDelTopDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( ( ! forceRead ) && indexByDelTopDepIdx.containsKey( key ) ) {
			dict = indexByDelTopDepIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep1Obj>();
			ICFBamDelSubDep1Obj obj;
			CFBamDelSubDep1Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readDerivedByDelTopDepIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId );
			CFBamDelSubDep1Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep1Obj realised = (ICFBamDelSubDep1Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelTopDepIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
		Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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
		List<ICFBamDelSubDep1Obj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamDelSubDep1Obj readDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		return( readDelSubDep1ByUNameIdx( DelTopDepTenantId,
			DelTopDepId,
			Name,
			false ) );
	}

	public ICFBamDelSubDep1Obj readDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamDelSubDep1ByUNameIdxKey,
				ICFBamDelSubDep1Obj >();
		}
		CFBamDelSubDep1ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		key.setRequiredName( Name );
		ICFBamDelSubDep1Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamDelSubDep1Buff buff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().readDerivedByUNameIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId,
				Name );
			if( buff != null ) {
				obj = (ICFBamDelSubDep1Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamDelSubDep1Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamDelSubDep1Obj readCachedDelSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamDelSubDep1Obj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelSubDep1( pkey );
		return( obj );
	}

	public List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
				Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			ICFBamDelSubDep1Obj obj;
			Iterator<ICFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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

	public List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
				Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			ICFBamDelSubDep1Obj obj;
			Iterator<ICFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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

	public List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>();
		if( indexByDelDepIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
				Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			ICFBamDelSubDep1Obj obj;
			Iterator<ICFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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

	public List<ICFBamDelSubDep1Obj> readCachedDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId )
	{
		final String S_ProcName = "readCachedDelSubDep1ByDelTopDepIdx";
		CFBamDelSubDep1ByDelTopDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		ArrayList<ICFBamDelSubDep1Obj> arrayList = new ArrayList<ICFBamDelSubDep1Obj>();
		if( indexByDelTopDepIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict;
			if( indexByDelTopDepIdx.containsKey( key ) ) {
				dict = indexByDelTopDepIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep1Obj arr[] = new ICFBamDelSubDep1Obj[len];
				Iterator<ICFBamDelSubDep1Obj> valIter = dict.values().iterator();
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
			ICFBamDelSubDep1Obj obj;
			Iterator<ICFBamDelSubDep1Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep1Obj> cmp = new Comparator<ICFBamDelSubDep1Obj>() {
			public int compare( ICFBamDelSubDep1Obj lhs, ICFBamDelSubDep1Obj rhs ) {
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

	public ICFBamDelSubDep1Obj readCachedDelSubDep1ByUNameIdx( long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		ICFBamDelSubDep1Obj obj = null;
		CFBamDelSubDep1ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamDelSubDep1Obj> valIter = members.values().iterator();
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
			Iterator<ICFBamDelSubDep1Obj> valIter = members.values().iterator();
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
		ICFBamDelSubDep1Obj obj = readCachedDelSubDep1ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelSubDep1ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelSubDep1ByTenantIdx";
		ICFBamDelSubDep1Obj obj;
		List<ICFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep1Obj obj;
		List<ICFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep1Obj obj;
		List<ICFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep1Obj obj;
		List<ICFBamDelSubDep1Obj> arrayList = readCachedDelSubDep1ByDelTopDepIdx( DelTopDepTenantId,
				DelTopDepId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep1Obj> arrayIter = arrayList.iterator();
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
		ICFBamDelSubDep1Obj obj = readCachedDelSubDep1ByUNameIdx( DelTopDepTenantId,
				DelTopDepId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamDelSubDep1Obj updateDelSubDep1( ICFBamDelSubDep1Obj Obj ) {
		ICFBamDelSubDep1Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().updateDelSubDep1( schema.getAuthorization(),
			Obj.getDelSubDep1Buff() );
		if( Obj.getClassCode().equals( "a81b" ) ) {
			obj = (ICFBamDelSubDep1Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelSubDep1( ICFBamDelSubDep1Obj Obj ) {
		ICFBamDelSubDep1Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1( schema.getAuthorization(),
			obj.getDelSubDep1Buff() );
		Obj.forget();
	}

	public void deleteDelSubDep1ByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelSubDep1Obj obj = readDelSubDep1( pkey );
		if( obj != null ) {
			ICFBamDelSubDep1EditObj editObj = (ICFBamDelSubDep1EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamDelSubDep1EditObj)obj.beginEdit();
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
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamDelSubDep1Obj> iter = dict.values().iterator();
			ICFBamDelSubDep1Obj obj;
			List<ICFBamDelSubDep1Obj> toForget = new LinkedList<ICFBamDelSubDep1Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelSubDep1ByTenantIdx( TenantId );
	}

	public void deleteDelSubDep1ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamDelSubDep1Obj> iter = dict.values().iterator();
			ICFBamDelSubDep1Obj obj;
			List<ICFBamDelSubDep1Obj> toForget = new LinkedList<ICFBamDelSubDep1Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelSubDep1ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelSubDep1ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict = indexByDelDepIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<ICFBamDelSubDep1Obj> iter = dict.values().iterator();
			ICFBamDelSubDep1Obj obj;
			List<ICFBamDelSubDep1Obj> toForget = new LinkedList<ICFBamDelSubDep1Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelSubDep1ByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelSubDep1ByDelTopDepIdx( long DelTopDepTenantId,
		long DelTopDepId )
	{
		CFBamDelSubDep1ByDelTopDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		if( indexByDelTopDepIdx == null ) {
			indexByDelTopDepIdx = new HashMap< CFBamDelSubDep1ByDelTopDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep1Obj > >();
		}
		if( indexByDelTopDepIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep1Obj> dict = indexByDelTopDepIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelTopDepIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId );
			Iterator<ICFBamDelSubDep1Obj> iter = dict.values().iterator();
			ICFBamDelSubDep1Obj obj;
			List<ICFBamDelSubDep1Obj> toForget = new LinkedList<ICFBamDelSubDep1Obj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByDelTopDepIdx( schema.getAuthorization(),
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
			indexByUNameIdx = new HashMap< CFBamDelSubDep1ByUNameIdxKey,
				ICFBamDelSubDep1Obj >();
		}
		CFBamDelSubDep1ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		key.setRequiredName( Name );
		ICFBamDelSubDep1Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByUNameIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep1().deleteDelSubDep1ByUNameIdx( schema.getAuthorization(),
				DelTopDepTenantId,
				DelTopDepId,
				Name );
		}
		deepDisposeDelSubDep1ByUNameIdx( DelTopDepTenantId,
				DelTopDepId,
				Name );
	}
}
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

public class YCFBamPopTopDepTableObj
	implements IYCFBamPopTopDepTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamPopTopDepObj> members;
	private Map<YCFBamScopePKey, IYCFBamPopTopDepObj> allPopTopDep;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj > > indexByTenantIdx;
	private Map< YCFBamPopDepByRelationIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj > > indexByRelationIdx;
	private Map< YCFBamPopDepByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj > > indexByDefSchemaIdx;
	private Map< YCFBamPopTopDepByContRelIdxKey,
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj > > indexByContRelIdx;
	private Map< YCFBamPopTopDepByUNameIdxKey,
		IYCFBamPopTopDepObj > indexByUNameIdx;
	public static String TABLE_NAME = "PopTopDep";
	public static String TABLE_DBNAME = "pop_topdep";

	public YCFBamPopTopDepTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopTopDepObj>();
		allPopTopDep = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByContRelIdx = null;
		indexByUNameIdx = null;
	}

	public YCFBamPopTopDepTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamPopTopDepObj>();
		allPopTopDep = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByContRelIdx = null;
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
		allPopTopDep = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByContRelIdx = null;
		indexByUNameIdx = null;
		List<IYCFBamPopTopDepObj> toForget = new LinkedList<IYCFBamPopTopDepObj>();
		IYCFBamPopTopDepObj cur = null;
		Iterator<IYCFBamPopTopDepObj> iter = members.values().iterator();
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
	 *	YCFBamPopTopDepObj.
	 */
	public IYCFBamPopTopDepObj newInstance() {
		IYCFBamPopTopDepObj inst = new YCFBamPopTopDepObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamPopTopDepObj.
	 */
	public IYCFBamPopTopDepEditObj newEditInstance( IYCFBamPopTopDepObj orig ) {
		IYCFBamPopTopDepEditObj edit = new YCFBamPopTopDepEditObj( orig );
		return( edit );
	}

	public IYCFBamPopTopDepObj realisePopTopDep( IYCFBamPopTopDepObj Obj ) {
		IYCFBamPopTopDepObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopTopDepObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamPopTopDepObj existingObj = members.get( pkey );
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
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					indexByRelationIdx.remove( keyRelationIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByContRelIdx != null ) {
				YCFBamPopTopDepByContRelIdxKey keyContRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newContRelIdxKey();
				keyContRelIdx.setRequiredContRelationTenantId( keepObj.getRequiredContRelationTenantId() );
				keyContRelIdx.setRequiredContRelationId( keepObj.getRequiredContRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapContRelIdx = indexByContRelIdx.get( keyContRelIdx );
				if( mapContRelIdx != null ) {
					mapContRelIdx.remove( keepObj.getPKey() );
					if( mapContRelIdx.size() <= 0 ) {
						indexByContRelIdx.remove( keyContRelIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredContRelationTenantId( keepObj.getRequiredContRelationTenantId() );
				keyUNameIdx.setRequiredContRelationId( keepObj.getRequiredContRelationId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamPopTopDepObj)schema.getPopDepTableObj().realisePopDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContRelIdx != null ) {
				YCFBamPopTopDepByContRelIdxKey keyContRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newContRelIdxKey();
				keyContRelIdx.setRequiredContRelationTenantId( keepObj.getRequiredContRelationTenantId() );
				keyContRelIdx.setRequiredContRelationId( keepObj.getRequiredContRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapContRelIdx = indexByContRelIdx.get( keyContRelIdx );
				if( mapContRelIdx != null ) {
					mapContRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredContRelationTenantId( keepObj.getRequiredContRelationTenantId() );
				keyUNameIdx.setRequiredContRelationId( keepObj.getRequiredContRelationId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allPopTopDep != null ) {
				allPopTopDep.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamPopTopDepObj)schema.getPopDepTableObj().realisePopDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allPopTopDep != null ) {
				allPopTopDep.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				YCFBamPopDepByRelationIdxKey keyRelationIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByContRelIdx != null ) {
				YCFBamPopTopDepByContRelIdxKey keyContRelIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newContRelIdxKey();
				keyContRelIdx.setRequiredContRelationTenantId( keepObj.getRequiredContRelationTenantId() );
				keyContRelIdx.setRequiredContRelationId( keepObj.getRequiredContRelationId() );
				Map<YCFBamScopePKey, IYCFBamPopTopDepObj > mapContRelIdx = indexByContRelIdx.get( keyContRelIdx );
				if( mapContRelIdx != null ) {
					mapContRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamPopTopDepByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newUNameIdxKey();
				keyUNameIdx.setRequiredContRelationTenantId( keepObj.getRequiredContRelationTenantId() );
				keyUNameIdx.setRequiredContRelationId( keepObj.getRequiredContRelationId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFBamPopTopDepObj createPopTopDep( IYCFBamPopTopDepObj Obj ) {
		IYCFBamPopTopDepObj obj = Obj;
		YCFBamPopTopDepBuff buff = obj.getPopTopDepBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().createPopTopDep(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a837" ) ) {
			obj = (IYCFBamPopTopDepObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamPopTopDepObj readPopTopDep( YCFBamScopePKey pkey ) {
		return( readPopTopDep( pkey, false ) );
	}

	public IYCFBamPopTopDepObj readPopTopDep( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamPopTopDepObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamPopTopDepBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamPopTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopTopDepObj readCachedPopTopDep( YCFBamScopePKey pkey ) {
		IYCFBamPopTopDepObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposePopTopDep( IYCFBamPopTopDepObj obj )
	{
		final String S_ProcName = "YCFBamPopTopDepTableObj.reallyDeepDisposePopTopDep() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamPopTopDepObj existing = readCachedPopTopDep( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamPopTopDepByContRelIdxKey keyContRelIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newContRelIdxKey();
		keyContRelIdx.setRequiredContRelationTenantId( existing.getRequiredContRelationTenantId() );
		keyContRelIdx.setRequiredContRelationId( existing.getRequiredContRelationId() );

		YCFBamPopTopDepByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredContRelationTenantId( existing.getRequiredContRelationTenantId() );
		keyUNameIdx.setRequiredContRelationId( existing.getRequiredContRelationId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


		schema.getPopSubDep1TableObj().deepDisposePopSubDep1ByPopTopDepIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByContRelIdx != null ) {
			if( indexByContRelIdx.containsKey( keyContRelIdx ) ) {
				indexByContRelIdx.get( keyContRelIdx ).remove( pkey );
				if( indexByContRelIdx.get( keyContRelIdx ).size() <= 0 ) {
					indexByContRelIdx.remove( keyContRelIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getPopDepTableObj().reallyDeepDisposePopDep( obj );
	}
	public void deepDisposePopTopDep( YCFBamScopePKey pkey ) {
		IYCFBamPopTopDepObj obj = readCachedPopTopDep( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopTopDepObj lockPopTopDep( YCFBamScopePKey pkey ) {
		IYCFBamPopTopDepObj locked = null;
		YCFBamPopTopDepBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamPopTopDepObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockPopTopDep", pkey );
		}
		return( locked );
	}

	public List<IYCFBamPopTopDepObj> readAllPopTopDep() {
		return( readAllPopTopDep( false ) );
	}

	public List<IYCFBamPopTopDepObj> readAllPopTopDep( boolean forceRead ) {
		final String S_ProcName = "readAllPopTopDep";
		if( ( allPopTopDep == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> map = new HashMap<YCFBamScopePKey,IYCFBamPopTopDepObj>();
			allPopTopDep = map;
			YCFBamPopTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().readAllDerived( schema.getAuthorization() );
			YCFBamPopTopDepBuff buff;
			IYCFBamPopTopDepObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopTopDepObj realised = (IYCFBamPopTopDepObj)obj.realise();
			}
		}
		int len = allPopTopDep.size();
		IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
		Iterator<IYCFBamPopTopDepObj> valIter = allPopTopDep.values().iterator();
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
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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
		List<IYCFBamPopTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopTopDepObj> readCachedAllPopTopDep() {
		final String S_ProcName = "readCachedAllPopTopDep";
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>();
		if( allPopTopDep != null ) {
			int len = allPopTopDep.size();
			IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
			Iterator<IYCFBamPopTopDepObj> valIter = allPopTopDep.values().iterator();
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
		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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

	public IYCFBamPopTopDepObj readPopTopDepByIdIdx( long TenantId,
		long Id )
	{
		return( readPopTopDepByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamPopTopDepObj readPopTopDepByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopTopDepObj obj = readPopTopDep( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByTenantIdx( long TenantId )
	{
		return( readPopTopDepByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopTopDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopTopDepObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopTopDepObj realised = (IYCFBamPopTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
		Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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
		List<IYCFBamPopTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		return( readPopTopDepByRelationIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopTopDepByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByRelationIdx.containsKey( key ) ) {
			dict = indexByRelationIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopTopDepObj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopTopDepObj realised = (IYCFBamPopTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelationIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
		Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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
		List<IYCFBamPopTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readPopTopDepByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopTopDepByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopTopDepObj>();
			IYCFBamPopDepObj obj;
			YCFBamPopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopTopDepObj realised = (IYCFBamPopTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
		Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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
		List<IYCFBamPopTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId )
	{
		return( readPopTopDepByContRelIdx( ContRelationTenantId,
			ContRelationId,
			false ) );
	}

	public List<IYCFBamPopTopDepObj> readPopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopTopDepByContRelIdx";
		YCFBamPopTopDepByContRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newContRelIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );
		Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
		if( indexByContRelIdx == null ) {
			indexByContRelIdx = new HashMap< YCFBamPopTopDepByContRelIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( ( ! forceRead ) && indexByContRelIdx.containsKey( key ) ) {
			dict = indexByContRelIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamPopTopDepObj>();
			IYCFBamPopTopDepObj obj;
			YCFBamPopTopDepBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().readDerivedByContRelIdx( schema.getAuthorization(),
				ContRelationTenantId,
				ContRelationId );
			YCFBamPopTopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamPopTopDepObj realised = (IYCFBamPopTopDepObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByContRelIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
		Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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
		List<IYCFBamPopTopDepObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamPopTopDepObj readPopTopDepByUNameIdx( long ContRelationTenantId,
		long ContRelationId,
		String Name )
	{
		return( readPopTopDepByUNameIdx( ContRelationTenantId,
			ContRelationId,
			Name,
			false ) );
	}

	public IYCFBamPopTopDepObj readPopTopDepByUNameIdx( long ContRelationTenantId,
		long ContRelationId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopTopDepByUNameIdxKey,
				IYCFBamPopTopDepObj >();
		}
		YCFBamPopTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newUNameIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );
		key.setRequiredName( Name );
		IYCFBamPopTopDepObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamPopTopDepBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().readDerivedByUNameIdx( schema.getAuthorization(),
				ContRelationTenantId,
				ContRelationId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamPopTopDepObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamPopTopDepObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamPopTopDepObj readCachedPopTopDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopTopDepObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedPopTopDep( pkey );
		return( obj );
	}

	public List<IYCFBamPopTopDepObj> readCachedPopTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedPopTopDepByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
				Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamPopTopDepObj obj;
			Iterator<IYCFBamPopTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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

	public List<IYCFBamPopTopDepObj> readCachedPopTopDepByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedPopTopDepByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>();
		if( indexByRelationIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
			if( indexByRelationIdx.containsKey( key ) ) {
				dict = indexByRelationIdx.get( key );
				int len = dict.size();
				IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
				Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamPopTopDepObj obj;
			Iterator<IYCFBamPopTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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

	public List<IYCFBamPopTopDepObj> readCachedPopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedPopTopDepByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
				Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamPopTopDepObj obj;
			Iterator<IYCFBamPopTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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

	public List<IYCFBamPopTopDepObj> readCachedPopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId )
	{
		final String S_ProcName = "readCachedPopTopDepByContRelIdx";
		YCFBamPopTopDepByContRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newContRelIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );
		ArrayList<IYCFBamPopTopDepObj> arrayList = new ArrayList<IYCFBamPopTopDepObj>();
		if( indexByContRelIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict;
			if( indexByContRelIdx.containsKey( key ) ) {
				dict = indexByContRelIdx.get( key );
				int len = dict.size();
				IYCFBamPopTopDepObj arr[] = new IYCFBamPopTopDepObj[len];
				Iterator<IYCFBamPopTopDepObj> valIter = dict.values().iterator();
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
			IYCFBamPopTopDepObj obj;
			Iterator<IYCFBamPopTopDepObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamPopTopDepObj> cmp = new Comparator<IYCFBamPopTopDepObj>() {
			public int compare( IYCFBamPopTopDepObj lhs, IYCFBamPopTopDepObj rhs ) {
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

	public IYCFBamPopTopDepObj readCachedPopTopDepByUNameIdx( long ContRelationTenantId,
		long ContRelationId,
		String Name )
	{
		IYCFBamPopTopDepObj obj = null;
		YCFBamPopTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newUNameIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamPopTopDepObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamPopTopDepObj> valIter = members.values().iterator();
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

	public void deepDisposePopTopDepByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamPopTopDepObj obj = readCachedPopTopDepByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposePopTopDepByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposePopTopDepByTenantIdx";
		IYCFBamPopTopDepObj obj;
		List<IYCFBamPopTopDepObj> arrayList = readCachedPopTopDepByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopTopDepByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposePopTopDepByRelationIdx";
		IYCFBamPopTopDepObj obj;
		List<IYCFBamPopTopDepObj> arrayList = readCachedPopTopDepByRelationIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposePopTopDepByDefSchemaIdx";
		IYCFBamPopTopDepObj obj;
		List<IYCFBamPopTopDepObj> arrayList = readCachedPopTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId )
	{
		final String S_ProcName = "deepDisposePopTopDepByContRelIdx";
		IYCFBamPopTopDepObj obj;
		List<IYCFBamPopTopDepObj> arrayList = readCachedPopTopDepByContRelIdx( ContRelationTenantId,
				ContRelationId );
		if( arrayList != null )  {
			Iterator<IYCFBamPopTopDepObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopTopDepByUNameIdx( long ContRelationTenantId,
		long ContRelationId,
		String Name )
	{
		IYCFBamPopTopDepObj obj = readCachedPopTopDepByUNameIdx( ContRelationTenantId,
				ContRelationId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamPopTopDepObj updatePopTopDep( IYCFBamPopTopDepObj Obj ) {
		IYCFBamPopTopDepObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().updatePopTopDep( schema.getAuthorization(),
			Obj.getPopTopDepBuff() );
		if( Obj.getClassCode().equals( "a837" ) ) {
			obj = (IYCFBamPopTopDepObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deletePopTopDep( IYCFBamPopTopDepObj Obj ) {
		IYCFBamPopTopDepObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDep( schema.getAuthorization(),
			obj.getPopTopDepBuff() );
		Obj.forget();
	}

	public void deletePopTopDepByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamPopTopDepObj obj = readPopTopDep( pkey );
		if( obj != null ) {
			IYCFBamPopTopDepEditObj editObj = (IYCFBamPopTopDepEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamPopTopDepEditObj)obj.beginEdit();
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
		deepDisposePopTopDepByIdIdx( TenantId,
				Id );
	}

	public void deletePopTopDepByTenantIdx( long TenantId )
	{
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamPopTopDepObj> iter = dict.values().iterator();
			IYCFBamPopTopDepObj obj;
			List<IYCFBamPopTopDepObj> toForget = new LinkedList<IYCFBamPopTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposePopTopDepByTenantIdx( TenantId );
	}

	public void deletePopTopDepByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		YCFBamPopDepByRelationIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( indexByRelationIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict = indexByRelationIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<IYCFBamPopTopDepObj> iter = dict.values().iterator();
			IYCFBamPopTopDepObj obj;
			List<IYCFBamPopTopDepObj> toForget = new LinkedList<IYCFBamPopTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposePopTopDepByRelationIdx( RelationTenantId,
				RelationId );
	}

	public void deletePopTopDepByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamPopTopDepObj> iter = dict.values().iterator();
			IYCFBamPopTopDepObj obj;
			List<IYCFBamPopTopDepObj> toForget = new LinkedList<IYCFBamPopTopDepObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposePopTopDepByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deletePopTopDepByContRelIdx( long ContRelationTenantId,
		long ContRelationId )
	{
		YCFBamPopTopDepByContRelIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newContRelIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );
		if( indexByContRelIdx == null ) {
			indexByContRelIdx = new HashMap< YCFBamPopTopDepByContRelIdxKey,
				Map< YCFBamScopePKey, IYCFBamPopTopDepObj > >();
		}
		if( indexByContRelIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamPopTopDepObj> dict = indexByContRelIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByContRelIdx( schema.getAuthorization(),
				ContRelationTenantId,
				ContRelationId );
			Iterator<IYCFBamPopTopDepObj> iter = dict.values().iterator();
			IYCFBamPopTopDepObj obj;
			List<IYCFBamPopTopDepObj> toForget = new LinkedList<IYCFBamPopTopDepObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByContRelIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByContRelIdx( schema.getAuthorization(),
				ContRelationTenantId,
				ContRelationId );
		}
		deepDisposePopTopDepByContRelIdx( ContRelationTenantId,
				ContRelationId );
	}

	public void deletePopTopDepByUNameIdx( long ContRelationTenantId,
		long ContRelationId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamPopTopDepByUNameIdxKey,
				IYCFBamPopTopDepObj >();
		}
		YCFBamPopTopDepByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryPopTopDep().newUNameIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );
		key.setRequiredName( Name );
		IYCFBamPopTopDepObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByUNameIdx( schema.getAuthorization(),
				ContRelationTenantId,
				ContRelationId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTablePopTopDep().deletePopTopDepByUNameIdx( schema.getAuthorization(),
				ContRelationTenantId,
				ContRelationId,
				Name );
		}
		deepDisposePopTopDepByUNameIdx( ContRelationTenantId,
				ContRelationId,
				Name );
	}
}

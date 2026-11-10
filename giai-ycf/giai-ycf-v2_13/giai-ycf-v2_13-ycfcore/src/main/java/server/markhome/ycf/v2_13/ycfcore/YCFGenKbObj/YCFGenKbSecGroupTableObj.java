// Description: Java 11 Table Object implementation for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public class YCFGenKbSecGroupTableObj
	implements IYCFGenKbSecGroupTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> members;
	private Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> allSecGroup;
	private Map< YCFGenKbSecGroupByClusterIdxKey,
		Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > > indexByClusterIdx;
	private Map< YCFGenKbSecGroupByClusterVisIdxKey,
		Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > > indexByClusterVisIdx;
	private Map< YCFGenKbSecGroupByUNameIdxKey,
		IYCFGenKbSecGroupObj > indexByUNameIdx;
	public static String TABLE_NAME = "SecGroup";
	public static String TABLE_DBNAME = "secgrp";

	public YCFGenKbSecGroupTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj>();
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
	}

	public YCFGenKbSecGroupTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj>();
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = (IYCFGenKbSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( null );
	}


	public void minimizeMemory() {
		allSecGroup = null;
		indexByClusterIdx = null;
		indexByClusterVisIdx = null;
		indexByUNameIdx = null;
		List<IYCFGenKbSecGroupObj> toForget = new LinkedList<IYCFGenKbSecGroupObj>();
		IYCFGenKbSecGroupObj cur = null;
		Iterator<IYCFGenKbSecGroupObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecGroupObj.
	 */
	public IYCFGenKbSecGroupObj newInstance() {
		IYCFGenKbSecGroupObj inst = new YCFGenKbSecGroupObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecGroupObj.
	 */
	public IYCFGenKbSecGroupEditObj newEditInstance( IYCFGenKbSecGroupObj orig ) {
		IYCFGenKbSecGroupEditObj edit = new YCFGenKbSecGroupEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecGroupObj realiseSecGroup( IYCFGenKbSecGroupObj Obj ) {
		IYCFGenKbSecGroupObj obj = Obj;
		YCFGenKbSecGroupPKey pkey = obj.getPKey();
		IYCFGenKbSecGroupObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecGroupObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGroupByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByClusterVisIdx != null ) {
				YCFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.remove( keepObj.getPKey() );
					if( mapClusterVisIdx.size() <= 0 ) {
						indexByClusterVisIdx.remove( keyClusterVisIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGroupByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClusterVisIdx != null ) {
				YCFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allSecGroup != null ) {
				allSecGroup.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecGroup != null ) {
				allSecGroup.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGroupByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByClusterVisIdx != null ) {
				YCFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
				keyClusterVisIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyClusterVisIdx.setRequiredIsVisible( keepObj.getRequiredIsVisible() );
				Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > mapClusterVisIdx = indexByClusterVisIdx.get( keyClusterVisIdx );
				if( mapClusterVisIdx != null ) {
					mapClusterVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFGenKbSecGroupByUNameIdxKey keyUNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecGroupObj createSecGroup( IYCFGenKbSecGroupObj Obj ) {
		IYCFGenKbSecGroupObj obj = Obj;
		YCFGenKbSecGroupBuff buff = obj.getSecGroupBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().createSecGroup(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecGroupObj readSecGroup( YCFGenKbSecGroupPKey pkey ) {
		return( readSecGroup( pkey, false ) );
	}

	public IYCFGenKbSecGroupObj readSecGroup( YCFGenKbSecGroupPKey pkey, boolean forceRead ) {
		IYCFGenKbSecGroupObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecGroupBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGroupId() );
			if( readBuff != null ) {
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGroupObj readCachedSecGroup( YCFGenKbSecGroupPKey pkey ) {
		IYCFGenKbSecGroupObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGroup( IYCFGenKbSecGroupObj obj )
	{
		final String S_ProcName = "YCFGenKbSecGroupTableObj.reallyDeepDisposeSecGroup() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecGroupPKey pkey = obj.getPKey();
		IYCFGenKbSecGroupObj existing = readCachedSecGroup( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecGroupByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		keyClusterVisIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyClusterVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFGenKbSecGroupByUNameIdxKey keyUNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getSecGroupFormTableObj().deepDisposeSecGroupFormByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByIncludeIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpMembTableObj().deepDisposeSecGrpMembByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getSecGrpIncTableObj().deepDisposeSecGrpIncByGroupIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );

		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByClusterVisIdx != null ) {
			if( indexByClusterVisIdx.containsKey( keyClusterVisIdx ) ) {
				indexByClusterVisIdx.get( keyClusterVisIdx ).remove( pkey );
				if( indexByClusterVisIdx.get( keyClusterVisIdx ).size() <= 0 ) {
					indexByClusterVisIdx.remove( keyClusterVisIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	public void deepDisposeSecGroup( YCFGenKbSecGroupPKey pkey ) {
		IYCFGenKbSecGroupObj obj = readCachedSecGroup( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecGroupObj lockSecGroup( YCFGenKbSecGroupPKey pkey ) {
		IYCFGenKbSecGroupObj locked = null;
		YCFGenKbSecGroupBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGroupTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecGroupObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGroup", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecGroupObj> readAllSecGroup() {
		return( readAllSecGroup( false ) );
	}

	public List<IYCFGenKbSecGroupObj> readAllSecGroup( boolean forceRead ) {
		final String S_ProcName = "readAllSecGroup";
		if( ( allSecGroup == null ) || forceRead ) {
			Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> map = new HashMap<YCFGenKbSecGroupPKey,IYCFGenKbSecGroupObj>();
			allSecGroup = map;
			YCFGenKbSecGroupBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecGroupBuff buff;
			IYCFGenKbSecGroupObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupObj realised = (IYCFGenKbSecGroupObj)obj.realise();
			}
		}
		int len = allSecGroup.size();
		IYCFGenKbSecGroupObj arr[] = new IYCFGenKbSecGroupObj[len];
		Iterator<IYCFGenKbSecGroupObj> valIter = allSecGroup.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupObj> arrayList = new ArrayList<IYCFGenKbSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupObj> cmp = new Comparator<IYCFGenKbSecGroupObj>() {
			public int compare( IYCFGenKbSecGroupObj lhs, IYCFGenKbSecGroupObj rhs ) {
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
					YCFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGroupObj> readCachedAllSecGroup() {
		final String S_ProcName = "readCachedAllSecGroup";
		ArrayList<IYCFGenKbSecGroupObj> arrayList = new ArrayList<IYCFGenKbSecGroupObj>();
		if( allSecGroup != null ) {
			int len = allSecGroup.size();
			IYCFGenKbSecGroupObj arr[] = new IYCFGenKbSecGroupObj[len];
			Iterator<IYCFGenKbSecGroupObj> valIter = allSecGroup.values().iterator();
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
		Comparator<IYCFGenKbSecGroupObj> cmp = new Comparator<IYCFGenKbSecGroupObj>() {
			public int compare( IYCFGenKbSecGroupObj lhs, IYCFGenKbSecGroupObj rhs ) {
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
					YCFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGroupByIdIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public IYCFGenKbSecGroupObj readSecGroupByIdIdx( long ClusterId,
		int SecGroupId, boolean forceRead )
	{
		YCFGenKbSecGroupPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		IYCFGenKbSecGroupObj obj = readSecGroup( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSecGroupObj> readSecGroupByClusterIdx( long ClusterId )
	{
		return( readSecGroupByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbSecGroupObj> readSecGroupByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupByClusterIdx";
		YCFGenKbSecGroupByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGroupByClusterIdxKey,
				Map< YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj>();
			IYCFGenKbSecGroupObj obj;
			YCFGenKbSecGroupBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupObj realised = (IYCFGenKbSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGroupObj arr[] = new IYCFGenKbSecGroupObj[len];
		Iterator<IYCFGenKbSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupObj> arrayList = new ArrayList<IYCFGenKbSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupObj> cmp = new Comparator<IYCFGenKbSecGroupObj>() {
			public int compare( IYCFGenKbSecGroupObj lhs, IYCFGenKbSecGroupObj rhs ) {
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
					YCFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		return( readSecGroupByClusterVisIdx( ClusterId,
			IsVisible,
			false ) );
	}

	public List<IYCFGenKbSecGroupObj> readSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupByClusterVisIdx";
		YCFGenKbSecGroupByClusterVisIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> dict;
		if( indexByClusterVisIdx == null ) {
			indexByClusterVisIdx = new HashMap< YCFGenKbSecGroupByClusterVisIdxKey,
				Map< YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > >();
		}
		if( ( ! forceRead ) && indexByClusterVisIdx.containsKey( key ) ) {
			dict = indexByClusterVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj>();
			IYCFGenKbSecGroupObj obj;
			YCFGenKbSecGroupBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
			YCFGenKbSecGroupBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupObj realised = (IYCFGenKbSecGroupObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGroupObj arr[] = new IYCFGenKbSecGroupObj[len];
		Iterator<IYCFGenKbSecGroupObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupObj> arrayList = new ArrayList<IYCFGenKbSecGroupObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupObj> cmp = new Comparator<IYCFGenKbSecGroupObj>() {
			public int compare( IYCFGenKbSecGroupObj lhs, IYCFGenKbSecGroupObj rhs ) {
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
					YCFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecGroupObj readSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		return( readSecGroupByUNameIdx( ClusterId,
			Name,
			false ) );
	}

	public IYCFGenKbSecGroupObj readSecGroupByUNameIdx( long ClusterId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFGenKbSecGroupByUNameIdxKey,
				IYCFGenKbSecGroupObj >();
		}
		YCFGenKbSecGroupByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		IYCFGenKbSecGroupObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFGenKbSecGroupBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().readDerivedByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
			if( buff != null ) {
				obj = schema.getSecGroupTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecGroupObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGroupObj readCachedSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		IYCFGenKbSecGroupObj obj = null;
		YCFGenKbSecGroupPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		obj = readCachedSecGroup( pkey );
		return( obj );
	}

	public List<IYCFGenKbSecGroupObj> readCachedSecGroupByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGroupByClusterIdx";
		YCFGenKbSecGroupByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbSecGroupObj> arrayList = new ArrayList<IYCFGenKbSecGroupObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGroupObj arr[] = new IYCFGenKbSecGroupObj[len];
				Iterator<IYCFGenKbSecGroupObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGroupObj obj;
			Iterator<IYCFGenKbSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGroupObj> cmp = new Comparator<IYCFGenKbSecGroupObj>() {
			public int compare( IYCFGenKbSecGroupObj lhs, IYCFGenKbSecGroupObj rhs ) {
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
					YCFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGroupObj> readCachedSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "readCachedSecGroupByClusterVisIdx";
		YCFGenKbSecGroupByClusterVisIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		ArrayList<IYCFGenKbSecGroupObj> arrayList = new ArrayList<IYCFGenKbSecGroupObj>();
		if( indexByClusterVisIdx != null ) {
			Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> dict;
			if( indexByClusterVisIdx.containsKey( key ) ) {
				dict = indexByClusterVisIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGroupObj arr[] = new IYCFGenKbSecGroupObj[len];
				Iterator<IYCFGenKbSecGroupObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGroupObj obj;
			Iterator<IYCFGenKbSecGroupObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGroupObj> cmp = new Comparator<IYCFGenKbSecGroupObj>() {
			public int compare( IYCFGenKbSecGroupObj lhs, IYCFGenKbSecGroupObj rhs ) {
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
					YCFGenKbSecGroupPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecGroupObj readCachedSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		IYCFGenKbSecGroupObj obj = null;
		YCFGenKbSecGroupByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecGroupObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecGroupObj> valIter = members.values().iterator();
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

	public void deepDisposeSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		IYCFGenKbSecGroupObj obj = readCachedSecGroupByIdIdx( ClusterId,
				SecGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGroupByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGroupByClusterIdx";
		IYCFGenKbSecGroupObj obj;
		List<IYCFGenKbSecGroupObj> arrayList = readCachedSecGroupByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "deepDisposeSecGroupByClusterVisIdx";
		IYCFGenKbSecGroupObj obj;
		List<IYCFGenKbSecGroupObj> arrayList = readCachedSecGroupByClusterVisIdx( ClusterId,
				IsVisible );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGroupObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		IYCFGenKbSecGroupObj obj = readCachedSecGroupByUNameIdx( ClusterId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecGroupObj updateSecGroup( IYCFGenKbSecGroupObj Obj ) {
		IYCFGenKbSecGroupObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().updateSecGroup( schema.getAuthorization(),
			Obj.getSecGroupBuff() );
		obj = (IYCFGenKbSecGroupObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGroup( IYCFGenKbSecGroupObj Obj ) {
		IYCFGenKbSecGroupObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroup( schema.getAuthorization(),
			obj.getSecGroupBuff() );
		Obj.forget();
	}

	public void deleteSecGroupByIdIdx( long ClusterId,
		int SecGroupId )
	{
		YCFGenKbSecGroupPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupId( SecGroupId );
		IYCFGenKbSecGroupObj obj = readSecGroup( pkey );
		if( obj != null ) {
			IYCFGenKbSecGroupEditObj editObj = (IYCFGenKbSecGroupEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecGroupEditObj)obj.beginEdit();
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
		deepDisposeSecGroupByIdIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGroupByClusterIdx( long ClusterId )
	{
		YCFGenKbSecGroupByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGroupByClusterIdxKey,
				Map< YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbSecGroupObj> iter = dict.values().iterator();
			IYCFGenKbSecGroupObj obj;
			List<IYCFGenKbSecGroupObj> toForget = new LinkedList<IYCFGenKbSecGroupObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGroupByClusterIdx( ClusterId );
	}

	public void deleteSecGroupByClusterVisIdx( long ClusterId,
		boolean IsVisible )
	{
		YCFGenKbSecGroupByClusterVisIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );
		if( indexByClusterVisIdx == null ) {
			indexByClusterVisIdx = new HashMap< YCFGenKbSecGroupByClusterVisIdxKey,
				Map< YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj > >();
		}
		if( indexByClusterVisIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGroupPKey, IYCFGenKbSecGroupObj> dict = indexByClusterVisIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
			Iterator<IYCFGenKbSecGroupObj> iter = dict.values().iterator();
			IYCFGenKbSecGroupObj obj;
			List<IYCFGenKbSecGroupObj> toForget = new LinkedList<IYCFGenKbSecGroupObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterVisIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByClusterVisIdx( schema.getAuthorization(),
				ClusterId,
				IsVisible );
		}
		deepDisposeSecGroupByClusterVisIdx( ClusterId,
				IsVisible );
	}

	public void deleteSecGroupByUNameIdx( long ClusterId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFGenKbSecGroupByUNameIdxKey,
				IYCFGenKbSecGroupObj >();
		}
		YCFGenKbSecGroupByUNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		IYCFGenKbSecGroupObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroup().deleteSecGroupByUNameIdx( schema.getAuthorization(),
				ClusterId,
				Name );
		}
		deepDisposeSecGroupByUNameIdx( ClusterId,
				Name );
	}
}

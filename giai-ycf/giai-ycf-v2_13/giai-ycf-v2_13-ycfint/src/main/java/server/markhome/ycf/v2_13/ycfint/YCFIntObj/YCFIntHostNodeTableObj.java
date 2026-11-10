// Description: Java 11 Table Object implementation for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntHostNodeTableObj
	implements IYCFIntHostNodeTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFSecHostNodePKey, IYCFSecHostNodeObj> members;
	private Map<YCFSecHostNodePKey, IYCFSecHostNodeObj> allHostNode;
	private Map< YCFSecHostNodeByClusterIdxKey,
		Map<YCFSecHostNodePKey, IYCFSecHostNodeObj > > indexByClusterIdx;
	private Map< YCFSecHostNodeByUDescrIdxKey,
		IYCFSecHostNodeObj > indexByUDescrIdx;
	private Map< YCFSecHostNodeByHostNameIdxKey,
		IYCFSecHostNodeObj > indexByHostNameIdx;
	public static String TABLE_NAME = "HostNode";
	public static String TABLE_DBNAME = "hostnode";

	public YCFIntHostNodeTableObj() {
		schema = null;
		members = new HashMap<YCFSecHostNodePKey, IYCFSecHostNodeObj>();
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
	}

	public YCFIntHostNodeTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFSecHostNodePKey, IYCFSecHostNodeObj>();
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFIntSchemaObj)value;
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
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
		List<IYCFSecHostNodeObj> toForget = new LinkedList<IYCFSecHostNodeObj>();
		IYCFSecHostNodeObj cur = null;
		Iterator<IYCFSecHostNodeObj> iter = members.values().iterator();
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
	 *	YCFIntHostNodeObj.
	 */
	public IYCFSecHostNodeObj newInstance() {
		IYCFSecHostNodeObj inst = new YCFIntHostNodeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntHostNodeObj.
	 */
	public IYCFSecHostNodeEditObj newEditInstance( IYCFSecHostNodeObj orig ) {
		IYCFSecHostNodeEditObj edit = new YCFIntHostNodeEditObj( orig );
		return( edit );
	}

	public IYCFSecHostNodeObj realiseHostNode( IYCFSecHostNodeObj Obj ) {
		IYCFSecHostNodeObj obj = Obj;
		YCFSecHostNodePKey pkey = obj.getPKey();
		IYCFSecHostNodeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecHostNodeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecHostNodeByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecHostNodePKey, IYCFSecHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUDescrIdx != null ) {
				YCFSecHostNodeByUDescrIdxKey keyUDescrIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.remove( keyUDescrIdx );
			}

			if( indexByHostNameIdx != null ) {
				YCFSecHostNodeByHostNameIdxKey keyHostNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
				keyHostNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostNameIdx.setRequiredHostName( keepObj.getRequiredHostName() );
				indexByHostNameIdx.remove( keyHostNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecHostNodeByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecHostNodePKey, IYCFSecHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUDescrIdx != null ) {
				YCFSecHostNodeByUDescrIdxKey keyUDescrIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( indexByHostNameIdx != null ) {
				YCFSecHostNodeByHostNameIdxKey keyHostNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
				keyHostNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostNameIdx.setRequiredHostName( keepObj.getRequiredHostName() );
				indexByHostNameIdx.put( keyHostNameIdx, keepObj );
			}

			if( allHostNode != null ) {
				allHostNode.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allHostNode != null ) {
				allHostNode.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecHostNodeByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecHostNodePKey, IYCFSecHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUDescrIdx != null ) {
				YCFSecHostNodeByUDescrIdxKey keyUDescrIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( indexByHostNameIdx != null ) {
				YCFSecHostNodeByHostNameIdxKey keyHostNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
				keyHostNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostNameIdx.setRequiredHostName( keepObj.getRequiredHostName() );
				indexByHostNameIdx.put( keyHostNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecHostNodeObj createHostNode( IYCFSecHostNodeObj Obj ) {
		IYCFSecHostNodeObj obj = Obj;
		YCFSecHostNodeBuff buff = obj.getHostNodeBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().createHostNode(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecHostNodeObj readHostNode( YCFSecHostNodePKey pkey ) {
		return( readHostNode( pkey, false ) );
	}

	public IYCFSecHostNodeObj readHostNode( YCFSecHostNodePKey pkey, boolean forceRead ) {
		IYCFSecHostNodeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecHostNodeBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredHostNodeId() );
			if( readBuff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecHostNodeObj readCachedHostNode( YCFSecHostNodePKey pkey ) {
		IYCFSecHostNodeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeHostNode( IYCFSecHostNodeObj obj )
	{
		final String S_ProcName = "YCFIntHostNodeTableObj.reallyDeepDisposeHostNode() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecHostNodePKey pkey = obj.getPKey();
		IYCFSecHostNodeObj existing = readCachedHostNode( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecHostNodeByClusterIdxKey keyClusterIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecHostNodeByUDescrIdxKey keyUDescrIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		keyUDescrIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFSecHostNodeByHostNameIdxKey keyHostNameIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		keyHostNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyHostNameIdx.setRequiredHostName( existing.getRequiredHostName() );


					schema.getServiceTableObj().deepDisposeServiceByHostIdx( existing.getRequiredClusterId(),
						existing.getRequiredHostNodeId() );

		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByUDescrIdx != null ) {
			indexByUDescrIdx.remove( keyUDescrIdx );
		}

		if( indexByHostNameIdx != null ) {
			indexByHostNameIdx.remove( keyHostNameIdx );
		}


	}
	public void deepDisposeHostNode( YCFSecHostNodePKey pkey ) {
		IYCFSecHostNodeObj obj = readCachedHostNode( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecHostNodeObj lockHostNode( YCFSecHostNodePKey pkey ) {
		IYCFSecHostNodeObj locked = null;
		YCFSecHostNodeBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getHostNodeTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecHostNodeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockHostNode", pkey );
		}
		return( locked );
	}

	public List<IYCFSecHostNodeObj> readAllHostNode() {
		return( readAllHostNode( false ) );
	}

	public List<IYCFSecHostNodeObj> readAllHostNode( boolean forceRead ) {
		final String S_ProcName = "readAllHostNode";
		if( ( allHostNode == null ) || forceRead ) {
			Map<YCFSecHostNodePKey, IYCFSecHostNodeObj> map = new HashMap<YCFSecHostNodePKey,IYCFSecHostNodeObj>();
			allHostNode = map;
			YCFSecHostNodeBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().readAllDerived( schema.getAuthorization() );
			YCFSecHostNodeBuff buff;
			IYCFSecHostNodeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				IYCFSecHostNodeObj realised = (IYCFSecHostNodeObj)obj.realise();
			}
		}
		int len = allHostNode.size();
		IYCFSecHostNodeObj arr[] = new IYCFSecHostNodeObj[len];
		Iterator<IYCFSecHostNodeObj> valIter = allHostNode.values().iterator();
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
		ArrayList<IYCFSecHostNodeObj> arrayList = new ArrayList<IYCFSecHostNodeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecHostNodeObj> cmp = new Comparator<IYCFSecHostNodeObj>() {
			public int compare( IYCFSecHostNodeObj lhs, IYCFSecHostNodeObj rhs ) {
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
					YCFSecHostNodePKey lhsPKey = lhs.getPKey();
					YCFSecHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecHostNodeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecHostNodeObj> readCachedAllHostNode() {
		final String S_ProcName = "readCachedAllHostNode";
		ArrayList<IYCFSecHostNodeObj> arrayList = new ArrayList<IYCFSecHostNodeObj>();
		if( allHostNode != null ) {
			int len = allHostNode.size();
			IYCFSecHostNodeObj arr[] = new IYCFSecHostNodeObj[len];
			Iterator<IYCFSecHostNodeObj> valIter = allHostNode.values().iterator();
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
		Comparator<IYCFSecHostNodeObj> cmp = new Comparator<IYCFSecHostNodeObj>() {
			public int compare( IYCFSecHostNodeObj lhs, IYCFSecHostNodeObj rhs ) {
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
					YCFSecHostNodePKey lhsPKey = lhs.getPKey();
					YCFSecHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the HostNode-derived instances in the database.
	 *
	 *	@return	List of IYCFSecHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecHostNodeObj> pageAllHostNode(Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageAllHostNode";
		Map<YCFSecHostNodePKey, IYCFSecHostNodeObj> map = new HashMap<YCFSecHostNodePKey,IYCFSecHostNodeObj>();
		YCFSecHostNodeBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorHostNodeId );
		YCFSecHostNodeBuff buff;
		IYCFSecHostNodeObj obj;
		IYCFSecHostNodeObj realised;
		ArrayList<IYCFSecHostNodeObj> arrayList = new ArrayList<IYCFSecHostNodeObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecHostNodeObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		return( readHostNodeByIdIdx( ClusterId,
			HostNodeId,
			false ) );
	}

	public IYCFSecHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId, boolean forceRead )
	{
		YCFSecHostNodePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		IYCFSecHostNodeObj obj = readHostNode( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecHostNodeObj> readHostNodeByClusterIdx( long ClusterId )
	{
		return( readHostNodeByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecHostNodeObj> readHostNodeByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readHostNodeByClusterIdx";
		YCFSecHostNodeByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecHostNodePKey, IYCFSecHostNodeObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecHostNodeByClusterIdxKey,
				Map< YCFSecHostNodePKey, IYCFSecHostNodeObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecHostNodePKey, IYCFSecHostNodeObj>();
			IYCFSecHostNodeObj obj;
			YCFSecHostNodeBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecHostNodeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				IYCFSecHostNodeObj realised = (IYCFSecHostNodeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecHostNodeObj arr[] = new IYCFSecHostNodeObj[len];
		Iterator<IYCFSecHostNodeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecHostNodeObj> arrayList = new ArrayList<IYCFSecHostNodeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecHostNodeObj> cmp = new Comparator<IYCFSecHostNodeObj>() {
			public int compare( IYCFSecHostNodeObj lhs, IYCFSecHostNodeObj rhs ) {
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
					YCFSecHostNodePKey lhsPKey = lhs.getPKey();
					YCFSecHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecHostNodeObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecHostNodeObj readHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		return( readHostNodeByUDescrIdx( ClusterId,
			Description,
			false ) );
	}

	public IYCFSecHostNodeObj readHostNodeByUDescrIdx( long ClusterId,
		String Description, boolean forceRead )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFSecHostNodeByUDescrIdxKey,
				IYCFSecHostNodeObj >();
		}
		YCFSecHostNodeByUDescrIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		IYCFSecHostNodeObj obj = null;
		if( ( ! forceRead ) && indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
		}
		else {
			YCFSecHostNodeBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().readDerivedByUDescrIdx( schema.getAuthorization(),
				ClusterId,
				Description );
			if( buff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecHostNodeObj readHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		return( readHostNodeByHostNameIdx( ClusterId,
			HostName,
			false ) );
	}

	public IYCFSecHostNodeObj readHostNodeByHostNameIdx( long ClusterId,
		String HostName, boolean forceRead )
	{
		if( indexByHostNameIdx == null ) {
			indexByHostNameIdx = new HashMap< YCFSecHostNodeByHostNameIdxKey,
				IYCFSecHostNodeObj >();
		}
		YCFSecHostNodeByHostNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		IYCFSecHostNodeObj obj = null;
		if( ( ! forceRead ) && indexByHostNameIdx.containsKey( key ) ) {
			obj = indexByHostNameIdx.get( key );
		}
		else {
			YCFSecHostNodeBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().readDerivedByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
			if( buff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecHostNodeObj readCachedHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		IYCFSecHostNodeObj obj = null;
		YCFSecHostNodePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		obj = readCachedHostNode( pkey );
		return( obj );
	}

	public List<IYCFSecHostNodeObj> readCachedHostNodeByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedHostNodeByClusterIdx";
		YCFSecHostNodeByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecHostNodeObj> arrayList = new ArrayList<IYCFSecHostNodeObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecHostNodePKey, IYCFSecHostNodeObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecHostNodeObj arr[] = new IYCFSecHostNodeObj[len];
				Iterator<IYCFSecHostNodeObj> valIter = dict.values().iterator();
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
			IYCFSecHostNodeObj obj;
			Iterator<IYCFSecHostNodeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecHostNodeObj> cmp = new Comparator<IYCFSecHostNodeObj>() {
			public int compare( IYCFSecHostNodeObj lhs, IYCFSecHostNodeObj rhs ) {
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
					YCFSecHostNodePKey lhsPKey = lhs.getPKey();
					YCFSecHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecHostNodeObj readCachedHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		IYCFSecHostNodeObj obj = null;
		YCFSecHostNodeByUDescrIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		if( indexByUDescrIdx != null ) {
			if( indexByUDescrIdx.containsKey( key ) ) {
				obj = indexByUDescrIdx.get( key );
			}
			else {
				Iterator<IYCFSecHostNodeObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecHostNodeObj> valIter = members.values().iterator();
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

	public IYCFSecHostNodeObj readCachedHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		IYCFSecHostNodeObj obj = null;
		YCFSecHostNodeByHostNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		if( indexByHostNameIdx != null ) {
			if( indexByHostNameIdx.containsKey( key ) ) {
				obj = indexByHostNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecHostNodeObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecHostNodeObj> valIter = members.values().iterator();
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

	public void deepDisposeHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		IYCFSecHostNodeObj obj = readCachedHostNodeByIdIdx( ClusterId,
				HostNodeId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeHostNodeByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeHostNodeByClusterIdx";
		IYCFSecHostNodeObj obj;
		List<IYCFSecHostNodeObj> arrayList = readCachedHostNodeByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecHostNodeObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		IYCFSecHostNodeObj obj = readCachedHostNodeByUDescrIdx( ClusterId,
				Description );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		IYCFSecHostNodeObj obj = readCachedHostNodeByHostNameIdx( ClusterId,
				HostName );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of HostNode-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	A List of HostNode-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecHostNodeObj> pageHostNodeByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageHostNodeByClusterIdx";
		YCFSecHostNodeByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecHostNodeObj> retList = new LinkedList<IYCFSecHostNodeObj>();
		IYCFSecHostNodeObj obj;
		YCFSecHostNodeBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorHostNodeId );
		YCFSecHostNodeBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getHostNodeTableObj().newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			obj.setBuff( buff );
			IYCFSecHostNodeObj realised = (IYCFSecHostNodeObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecHostNodeObj updateHostNode( IYCFSecHostNodeObj Obj ) {
		IYCFSecHostNodeObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().updateHostNode( schema.getAuthorization(),
			Obj.getHostNodeBuff() );
		obj = (IYCFSecHostNodeObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteHostNode( IYCFSecHostNodeObj Obj ) {
		IYCFSecHostNodeObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().deleteHostNode( schema.getAuthorization(),
			obj.getHostNodeBuff() );
		Obj.forget();
	}

	public void deleteHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		YCFSecHostNodePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		IYCFSecHostNodeObj obj = readHostNode( pkey );
		if( obj != null ) {
			IYCFSecHostNodeEditObj editObj = (IYCFSecHostNodeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecHostNodeEditObj)obj.beginEdit();
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
		deepDisposeHostNodeByIdIdx( ClusterId,
				HostNodeId );
	}

	public void deleteHostNodeByClusterIdx( long ClusterId )
	{
		YCFSecHostNodeByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecHostNodeByClusterIdxKey,
				Map< YCFSecHostNodePKey, IYCFSecHostNodeObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecHostNodePKey, IYCFSecHostNodeObj> dict = indexByClusterIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecHostNodeObj> iter = dict.values().iterator();
			IYCFSecHostNodeObj obj;
			List<IYCFSecHostNodeObj> toForget = new LinkedList<IYCFSecHostNodeObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeHostNodeByClusterIdx( ClusterId );
	}

	public void deleteHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFSecHostNodeByUDescrIdxKey,
				IYCFSecHostNodeObj >();
		}
		YCFSecHostNodeByUDescrIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		IYCFSecHostNodeObj obj = null;
		if( indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByUDescrIdx( schema.getAuthorization(),
				ClusterId,
				Description );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByUDescrIdx( schema.getAuthorization(),
				ClusterId,
				Description );
		}
		deepDisposeHostNodeByUDescrIdx( ClusterId,
				Description );
	}

	public void deleteHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		if( indexByHostNameIdx == null ) {
			indexByHostNameIdx = new HashMap< YCFSecHostNodeByHostNameIdxKey,
				IYCFSecHostNodeObj >();
		}
		YCFSecHostNodeByHostNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		IYCFSecHostNodeObj obj = null;
		if( indexByHostNameIdx.containsKey( key ) ) {
			obj = indexByHostNameIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
		}
		deepDisposeHostNodeByHostNameIdx( ClusterId,
				HostName );
	}
}

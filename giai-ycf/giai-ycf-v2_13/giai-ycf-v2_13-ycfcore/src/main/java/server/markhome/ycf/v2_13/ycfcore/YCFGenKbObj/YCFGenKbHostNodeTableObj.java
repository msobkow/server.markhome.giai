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

public class YCFGenKbHostNodeTableObj
	implements IYCFGenKbHostNodeTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj> members;
	private Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj> allHostNode;
	private Map< YCFGenKbHostNodeByClusterIdxKey,
		Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj > > indexByClusterIdx;
	private Map< YCFGenKbHostNodeByUDescrIdxKey,
		IYCFGenKbHostNodeObj > indexByUDescrIdx;
	private Map< YCFGenKbHostNodeByHostNameIdxKey,
		IYCFGenKbHostNodeObj > indexByHostNameIdx;
	public static String TABLE_NAME = "HostNode";
	public static String TABLE_DBNAME = "hostnode";

	public YCFGenKbHostNodeTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj>();
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
	}

	public YCFGenKbHostNodeTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj>();
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
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
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
		List<IYCFGenKbHostNodeObj> toForget = new LinkedList<IYCFGenKbHostNodeObj>();
		IYCFGenKbHostNodeObj cur = null;
		Iterator<IYCFGenKbHostNodeObj> iter = members.values().iterator();
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
	 *	YCFGenKbHostNodeObj.
	 */
	public IYCFGenKbHostNodeObj newInstance() {
		IYCFGenKbHostNodeObj inst = new YCFGenKbHostNodeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbHostNodeObj.
	 */
	public IYCFGenKbHostNodeEditObj newEditInstance( IYCFGenKbHostNodeObj orig ) {
		IYCFGenKbHostNodeEditObj edit = new YCFGenKbHostNodeEditObj( orig );
		return( edit );
	}

	public IYCFGenKbHostNodeObj realiseHostNode( IYCFGenKbHostNodeObj Obj ) {
		IYCFGenKbHostNodeObj obj = Obj;
		YCFGenKbHostNodePKey pkey = obj.getPKey();
		IYCFGenKbHostNodeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbHostNodeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbHostNodeByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUDescrIdx != null ) {
				YCFGenKbHostNodeByUDescrIdxKey keyUDescrIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.remove( keyUDescrIdx );
			}

			if( indexByHostNameIdx != null ) {
				YCFGenKbHostNodeByHostNameIdxKey keyHostNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
				keyHostNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostNameIdx.setRequiredHostName( keepObj.getRequiredHostName() );
				indexByHostNameIdx.remove( keyHostNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbHostNodeByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUDescrIdx != null ) {
				YCFGenKbHostNodeByUDescrIdxKey keyUDescrIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( indexByHostNameIdx != null ) {
				YCFGenKbHostNodeByHostNameIdxKey keyHostNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
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
				YCFGenKbHostNodeByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUDescrIdx != null ) {
				YCFGenKbHostNodeByUDescrIdxKey keyUDescrIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( indexByHostNameIdx != null ) {
				YCFGenKbHostNodeByHostNameIdxKey keyHostNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
				keyHostNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostNameIdx.setRequiredHostName( keepObj.getRequiredHostName() );
				indexByHostNameIdx.put( keyHostNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbHostNodeObj createHostNode( IYCFGenKbHostNodeObj Obj ) {
		IYCFGenKbHostNodeObj obj = Obj;
		YCFGenKbHostNodeBuff buff = obj.getHostNodeBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().createHostNode(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbHostNodeObj readHostNode( YCFGenKbHostNodePKey pkey ) {
		return( readHostNode( pkey, false ) );
	}

	public IYCFGenKbHostNodeObj readHostNode( YCFGenKbHostNodePKey pkey, boolean forceRead ) {
		IYCFGenKbHostNodeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbHostNodeBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredHostNodeId() );
			if( readBuff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbHostNodeObj readCachedHostNode( YCFGenKbHostNodePKey pkey ) {
		IYCFGenKbHostNodeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeHostNode( IYCFGenKbHostNodeObj obj )
	{
		final String S_ProcName = "YCFGenKbHostNodeTableObj.reallyDeepDisposeHostNode() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbHostNodePKey pkey = obj.getPKey();
		IYCFGenKbHostNodeObj existing = readCachedHostNode( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbHostNodeByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbHostNodeByUDescrIdxKey keyUDescrIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		keyUDescrIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFGenKbHostNodeByHostNameIdxKey keyHostNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		keyHostNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyHostNameIdx.setRequiredHostName( existing.getRequiredHostName() );



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
	public void deepDisposeHostNode( YCFGenKbHostNodePKey pkey ) {
		IYCFGenKbHostNodeObj obj = readCachedHostNode( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbHostNodeObj lockHostNode( YCFGenKbHostNodePKey pkey ) {
		IYCFGenKbHostNodeObj locked = null;
		YCFGenKbHostNodeBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getHostNodeTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbHostNodeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockHostNode", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbHostNodeObj> readAllHostNode() {
		return( readAllHostNode( false ) );
	}

	public List<IYCFGenKbHostNodeObj> readAllHostNode( boolean forceRead ) {
		final String S_ProcName = "readAllHostNode";
		if( ( allHostNode == null ) || forceRead ) {
			Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj> map = new HashMap<YCFGenKbHostNodePKey,IYCFGenKbHostNodeObj>();
			allHostNode = map;
			YCFGenKbHostNodeBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().readAllDerived( schema.getAuthorization() );
			YCFGenKbHostNodeBuff buff;
			IYCFGenKbHostNodeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbHostNodeObj realised = (IYCFGenKbHostNodeObj)obj.realise();
			}
		}
		int len = allHostNode.size();
		IYCFGenKbHostNodeObj arr[] = new IYCFGenKbHostNodeObj[len];
		Iterator<IYCFGenKbHostNodeObj> valIter = allHostNode.values().iterator();
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
		ArrayList<IYCFGenKbHostNodeObj> arrayList = new ArrayList<IYCFGenKbHostNodeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbHostNodeObj> cmp = new Comparator<IYCFGenKbHostNodeObj>() {
			public int compare( IYCFGenKbHostNodeObj lhs, IYCFGenKbHostNodeObj rhs ) {
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
					YCFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					YCFGenKbHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbHostNodeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbHostNodeObj> readCachedAllHostNode() {
		final String S_ProcName = "readCachedAllHostNode";
		ArrayList<IYCFGenKbHostNodeObj> arrayList = new ArrayList<IYCFGenKbHostNodeObj>();
		if( allHostNode != null ) {
			int len = allHostNode.size();
			IYCFGenKbHostNodeObj arr[] = new IYCFGenKbHostNodeObj[len];
			Iterator<IYCFGenKbHostNodeObj> valIter = allHostNode.values().iterator();
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
		Comparator<IYCFGenKbHostNodeObj> cmp = new Comparator<IYCFGenKbHostNodeObj>() {
			public int compare( IYCFGenKbHostNodeObj lhs, IYCFGenKbHostNodeObj rhs ) {
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
					YCFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					YCFGenKbHostNodePKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbHostNodeObj> pageAllHostNode(Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageAllHostNode";
		Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj> map = new HashMap<YCFGenKbHostNodePKey,IYCFGenKbHostNodeObj>();
		YCFGenKbHostNodeBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorHostNodeId );
		YCFGenKbHostNodeBuff buff;
		IYCFGenKbHostNodeObj obj;
		IYCFGenKbHostNodeObj realised;
		ArrayList<IYCFGenKbHostNodeObj> arrayList = new ArrayList<IYCFGenKbHostNodeObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbHostNodeObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		return( readHostNodeByIdIdx( ClusterId,
			HostNodeId,
			false ) );
	}

	public IYCFGenKbHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId, boolean forceRead )
	{
		YCFGenKbHostNodePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		IYCFGenKbHostNodeObj obj = readHostNode( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbHostNodeObj> readHostNodeByClusterIdx( long ClusterId )
	{
		return( readHostNodeByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbHostNodeObj> readHostNodeByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readHostNodeByClusterIdx";
		YCFGenKbHostNodeByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbHostNodeByClusterIdxKey,
				Map< YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj>();
			IYCFGenKbHostNodeObj obj;
			YCFGenKbHostNodeBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbHostNodeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbHostNodeObj realised = (IYCFGenKbHostNodeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbHostNodeObj arr[] = new IYCFGenKbHostNodeObj[len];
		Iterator<IYCFGenKbHostNodeObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbHostNodeObj> arrayList = new ArrayList<IYCFGenKbHostNodeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbHostNodeObj> cmp = new Comparator<IYCFGenKbHostNodeObj>() {
			public int compare( IYCFGenKbHostNodeObj lhs, IYCFGenKbHostNodeObj rhs ) {
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
					YCFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					YCFGenKbHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbHostNodeObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbHostNodeObj readHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		return( readHostNodeByUDescrIdx( ClusterId,
			Description,
			false ) );
	}

	public IYCFGenKbHostNodeObj readHostNodeByUDescrIdx( long ClusterId,
		String Description, boolean forceRead )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFGenKbHostNodeByUDescrIdxKey,
				IYCFGenKbHostNodeObj >();
		}
		YCFGenKbHostNodeByUDescrIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		IYCFGenKbHostNodeObj obj = null;
		if( ( ! forceRead ) && indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
		}
		else {
			YCFGenKbHostNodeBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByUDescrIdx( schema.getAuthorization(),
				ClusterId,
				Description );
			if( buff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbHostNodeObj readHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		return( readHostNodeByHostNameIdx( ClusterId,
			HostName,
			false ) );
	}

	public IYCFGenKbHostNodeObj readHostNodeByHostNameIdx( long ClusterId,
		String HostName, boolean forceRead )
	{
		if( indexByHostNameIdx == null ) {
			indexByHostNameIdx = new HashMap< YCFGenKbHostNodeByHostNameIdxKey,
				IYCFGenKbHostNodeObj >();
		}
		YCFGenKbHostNodeByHostNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		IYCFGenKbHostNodeObj obj = null;
		if( ( ! forceRead ) && indexByHostNameIdx.containsKey( key ) ) {
			obj = indexByHostNameIdx.get( key );
		}
		else {
			YCFGenKbHostNodeBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
			if( buff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbHostNodeObj readCachedHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		IYCFGenKbHostNodeObj obj = null;
		YCFGenKbHostNodePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		obj = readCachedHostNode( pkey );
		return( obj );
	}

	public List<IYCFGenKbHostNodeObj> readCachedHostNodeByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedHostNodeByClusterIdx";
		YCFGenKbHostNodeByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbHostNodeObj> arrayList = new ArrayList<IYCFGenKbHostNodeObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbHostNodeObj arr[] = new IYCFGenKbHostNodeObj[len];
				Iterator<IYCFGenKbHostNodeObj> valIter = dict.values().iterator();
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
			IYCFGenKbHostNodeObj obj;
			Iterator<IYCFGenKbHostNodeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbHostNodeObj> cmp = new Comparator<IYCFGenKbHostNodeObj>() {
			public int compare( IYCFGenKbHostNodeObj lhs, IYCFGenKbHostNodeObj rhs ) {
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
					YCFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					YCFGenKbHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbHostNodeObj readCachedHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		IYCFGenKbHostNodeObj obj = null;
		YCFGenKbHostNodeByUDescrIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		if( indexByUDescrIdx != null ) {
			if( indexByUDescrIdx.containsKey( key ) ) {
				obj = indexByUDescrIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbHostNodeObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbHostNodeObj> valIter = members.values().iterator();
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

	public IYCFGenKbHostNodeObj readCachedHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		IYCFGenKbHostNodeObj obj = null;
		YCFGenKbHostNodeByHostNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		if( indexByHostNameIdx != null ) {
			if( indexByHostNameIdx.containsKey( key ) ) {
				obj = indexByHostNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbHostNodeObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbHostNodeObj> valIter = members.values().iterator();
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
		IYCFGenKbHostNodeObj obj = readCachedHostNodeByIdIdx( ClusterId,
				HostNodeId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeHostNodeByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeHostNodeByClusterIdx";
		IYCFGenKbHostNodeObj obj;
		List<IYCFGenKbHostNodeObj> arrayList = readCachedHostNodeByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbHostNodeObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbHostNodeObj obj = readCachedHostNodeByUDescrIdx( ClusterId,
				Description );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		IYCFGenKbHostNodeObj obj = readCachedHostNodeByHostNameIdx( ClusterId,
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
	public List<IYCFGenKbHostNodeObj> pageHostNodeByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageHostNodeByClusterIdx";
		YCFGenKbHostNodeByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFGenKbHostNodeObj> retList = new LinkedList<IYCFGenKbHostNodeObj>();
		IYCFGenKbHostNodeObj obj;
		YCFGenKbHostNodeBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorHostNodeId );
		YCFGenKbHostNodeBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getHostNodeTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbHostNodeObj realised = (IYCFGenKbHostNodeObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbHostNodeObj updateHostNode( IYCFGenKbHostNodeObj Obj ) {
		IYCFGenKbHostNodeObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().updateHostNode( schema.getAuthorization(),
			Obj.getHostNodeBuff() );
		obj = (IYCFGenKbHostNodeObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteHostNode( IYCFGenKbHostNodeObj Obj ) {
		IYCFGenKbHostNodeObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNode( schema.getAuthorization(),
			obj.getHostNodeBuff() );
		Obj.forget();
	}

	public void deleteHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		YCFGenKbHostNodePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		IYCFGenKbHostNodeObj obj = readHostNode( pkey );
		if( obj != null ) {
			IYCFGenKbHostNodeEditObj editObj = (IYCFGenKbHostNodeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbHostNodeEditObj)obj.beginEdit();
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
		YCFGenKbHostNodeByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbHostNodeByClusterIdxKey,
				Map< YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbHostNodePKey, IYCFGenKbHostNodeObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbHostNodeObj> iter = dict.values().iterator();
			IYCFGenKbHostNodeObj obj;
			List<IYCFGenKbHostNodeObj> toForget = new LinkedList<IYCFGenKbHostNodeObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeHostNodeByClusterIdx( ClusterId );
	}

	public void deleteHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFGenKbHostNodeByUDescrIdxKey,
				IYCFGenKbHostNodeObj >();
		}
		YCFGenKbHostNodeByUDescrIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		IYCFGenKbHostNodeObj obj = null;
		if( indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByUDescrIdx( schema.getAuthorization(),
				ClusterId,
				Description );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByUDescrIdx( schema.getAuthorization(),
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
			indexByHostNameIdx = new HashMap< YCFGenKbHostNodeByHostNameIdxKey,
				IYCFGenKbHostNodeObj >();
		}
		YCFGenKbHostNodeByHostNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		IYCFGenKbHostNodeObj obj = null;
		if( indexByHostNameIdx.containsKey( key ) ) {
			obj = indexByHostNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
		}
		deepDisposeHostNodeByHostNameIdx( ClusterId,
				HostName );
	}
}

// Description: Java 11 Table Object implementation for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public class CFGenKbHostNodeTableObj
	implements ICFGenKbHostNodeTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj> members;
	private Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj> allHostNode;
	private Map< CFGenKbHostNodeByClusterIdxKey,
		Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj > > indexByClusterIdx;
	private Map< CFGenKbHostNodeByUDescrIdxKey,
		ICFGenKbHostNodeObj > indexByUDescrIdx;
	private Map< CFGenKbHostNodeByHostNameIdxKey,
		ICFGenKbHostNodeObj > indexByHostNameIdx;
	public static String TABLE_NAME = "HostNode";
	public static String TABLE_DBNAME = "hostnode";

	public CFGenKbHostNodeTableObj() {
		schema = null;
		members = new HashMap<CFGenKbHostNodePKey, ICFGenKbHostNodeObj>();
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
	}

	public CFGenKbHostNodeTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbHostNodePKey, ICFGenKbHostNodeObj>();
		allHostNode = null;
		indexByClusterIdx = null;
		indexByUDescrIdx = null;
		indexByHostNameIdx = null;
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = (ICFGenKbSchemaObj)value;
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
		List<ICFGenKbHostNodeObj> toForget = new LinkedList<ICFGenKbHostNodeObj>();
		ICFGenKbHostNodeObj cur = null;
		Iterator<ICFGenKbHostNodeObj> iter = members.values().iterator();
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
	 *	CFGenKbHostNodeObj.
	 */
	public ICFGenKbHostNodeObj newInstance() {
		ICFGenKbHostNodeObj inst = new CFGenKbHostNodeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbHostNodeObj.
	 */
	public ICFGenKbHostNodeEditObj newEditInstance( ICFGenKbHostNodeObj orig ) {
		ICFGenKbHostNodeEditObj edit = new CFGenKbHostNodeEditObj( orig );
		return( edit );
	}

	public ICFGenKbHostNodeObj realiseHostNode( ICFGenKbHostNodeObj Obj ) {
		ICFGenKbHostNodeObj obj = Obj;
		CFGenKbHostNodePKey pkey = obj.getPKey();
		ICFGenKbHostNodeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbHostNodeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				CFGenKbHostNodeByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUDescrIdx != null ) {
				CFGenKbHostNodeByUDescrIdxKey keyUDescrIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.remove( keyUDescrIdx );
			}

			if( indexByHostNameIdx != null ) {
				CFGenKbHostNodeByHostNameIdxKey keyHostNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
				keyHostNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostNameIdx.setRequiredHostName( keepObj.getRequiredHostName() );
				indexByHostNameIdx.remove( keyHostNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				CFGenKbHostNodeByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUDescrIdx != null ) {
				CFGenKbHostNodeByUDescrIdxKey keyUDescrIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( indexByHostNameIdx != null ) {
				CFGenKbHostNodeByHostNameIdxKey keyHostNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
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
				CFGenKbHostNodeByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUDescrIdx != null ) {
				CFGenKbHostNodeByUDescrIdxKey keyUDescrIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
				keyUDescrIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( indexByHostNameIdx != null ) {
				CFGenKbHostNodeByHostNameIdxKey keyHostNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
				keyHostNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostNameIdx.setRequiredHostName( keepObj.getRequiredHostName() );
				indexByHostNameIdx.put( keyHostNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbHostNodeObj createHostNode( ICFGenKbHostNodeObj Obj ) {
		ICFGenKbHostNodeObj obj = Obj;
		CFGenKbHostNodeBuff buff = obj.getHostNodeBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().createHostNode(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbHostNodeObj readHostNode( CFGenKbHostNodePKey pkey ) {
		return( readHostNode( pkey, false ) );
	}

	public ICFGenKbHostNodeObj readHostNode( CFGenKbHostNodePKey pkey, boolean forceRead ) {
		ICFGenKbHostNodeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbHostNodeBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredHostNodeId() );
			if( readBuff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbHostNodeObj readCachedHostNode( CFGenKbHostNodePKey pkey ) {
		ICFGenKbHostNodeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeHostNode( ICFGenKbHostNodeObj obj )
	{
		final String S_ProcName = "CFGenKbHostNodeTableObj.reallyDeepDisposeHostNode() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbHostNodePKey pkey = obj.getPKey();
		ICFGenKbHostNodeObj existing = readCachedHostNode( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbHostNodeByClusterIdxKey keyClusterIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		CFGenKbHostNodeByUDescrIdxKey keyUDescrIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		keyUDescrIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		CFGenKbHostNodeByHostNameIdxKey keyHostNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
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
	public void deepDisposeHostNode( CFGenKbHostNodePKey pkey ) {
		ICFGenKbHostNodeObj obj = readCachedHostNode( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbHostNodeObj lockHostNode( CFGenKbHostNodePKey pkey ) {
		ICFGenKbHostNodeObj locked = null;
		CFGenKbHostNodeBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getHostNodeTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbHostNodeObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockHostNode", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbHostNodeObj> readAllHostNode() {
		return( readAllHostNode( false ) );
	}

	public List<ICFGenKbHostNodeObj> readAllHostNode( boolean forceRead ) {
		final String S_ProcName = "readAllHostNode";
		if( ( allHostNode == null ) || forceRead ) {
			Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj> map = new HashMap<CFGenKbHostNodePKey,ICFGenKbHostNodeObj>();
			allHostNode = map;
			CFGenKbHostNodeBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().readAllDerived( schema.getAuthorization() );
			CFGenKbHostNodeBuff buff;
			ICFGenKbHostNodeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				ICFGenKbHostNodeObj realised = (ICFGenKbHostNodeObj)obj.realise();
			}
		}
		int len = allHostNode.size();
		ICFGenKbHostNodeObj arr[] = new ICFGenKbHostNodeObj[len];
		Iterator<ICFGenKbHostNodeObj> valIter = allHostNode.values().iterator();
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
		ArrayList<ICFGenKbHostNodeObj> arrayList = new ArrayList<ICFGenKbHostNodeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbHostNodeObj> cmp = new Comparator<ICFGenKbHostNodeObj>() {
			public int compare( ICFGenKbHostNodeObj lhs, ICFGenKbHostNodeObj rhs ) {
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
					CFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					CFGenKbHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbHostNodeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbHostNodeObj> readCachedAllHostNode() {
		final String S_ProcName = "readCachedAllHostNode";
		ArrayList<ICFGenKbHostNodeObj> arrayList = new ArrayList<ICFGenKbHostNodeObj>();
		if( allHostNode != null ) {
			int len = allHostNode.size();
			ICFGenKbHostNodeObj arr[] = new ICFGenKbHostNodeObj[len];
			Iterator<ICFGenKbHostNodeObj> valIter = allHostNode.values().iterator();
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
		Comparator<ICFGenKbHostNodeObj> cmp = new Comparator<ICFGenKbHostNodeObj>() {
			public int compare( ICFGenKbHostNodeObj lhs, ICFGenKbHostNodeObj rhs ) {
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
					CFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					CFGenKbHostNodePKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of ICFGenKbHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<ICFGenKbHostNodeObj> pageAllHostNode(Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageAllHostNode";
		Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj> map = new HashMap<CFGenKbHostNodePKey,ICFGenKbHostNodeObj>();
		CFGenKbHostNodeBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorHostNodeId );
		CFGenKbHostNodeBuff buff;
		ICFGenKbHostNodeObj obj;
		ICFGenKbHostNodeObj realised;
		ArrayList<ICFGenKbHostNodeObj> arrayList = new ArrayList<ICFGenKbHostNodeObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			obj.setBuff( buff );
			realised = (ICFGenKbHostNodeObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public ICFGenKbHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		return( readHostNodeByIdIdx( ClusterId,
			HostNodeId,
			false ) );
	}

	public ICFGenKbHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId, boolean forceRead )
	{
		CFGenKbHostNodePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		ICFGenKbHostNodeObj obj = readHostNode( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbHostNodeObj> readHostNodeByClusterIdx( long ClusterId )
	{
		return( readHostNodeByClusterIdx( ClusterId,
			false ) );
	}

	public List<ICFGenKbHostNodeObj> readHostNodeByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readHostNodeByClusterIdx";
		CFGenKbHostNodeByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbHostNodeByClusterIdxKey,
				Map< CFGenKbHostNodePKey, ICFGenKbHostNodeObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbHostNodePKey, ICFGenKbHostNodeObj>();
			ICFGenKbHostNodeObj obj;
			CFGenKbHostNodeBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			CFGenKbHostNodeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				ICFGenKbHostNodeObj realised = (ICFGenKbHostNodeObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbHostNodeObj arr[] = new ICFGenKbHostNodeObj[len];
		Iterator<ICFGenKbHostNodeObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbHostNodeObj> arrayList = new ArrayList<ICFGenKbHostNodeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbHostNodeObj> cmp = new Comparator<ICFGenKbHostNodeObj>() {
			public int compare( ICFGenKbHostNodeObj lhs, ICFGenKbHostNodeObj rhs ) {
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
					CFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					CFGenKbHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbHostNodeObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbHostNodeObj readHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		return( readHostNodeByUDescrIdx( ClusterId,
			Description,
			false ) );
	}

	public ICFGenKbHostNodeObj readHostNodeByUDescrIdx( long ClusterId,
		String Description, boolean forceRead )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< CFGenKbHostNodeByUDescrIdxKey,
				ICFGenKbHostNodeObj >();
		}
		CFGenKbHostNodeByUDescrIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		ICFGenKbHostNodeObj obj = null;
		if( ( ! forceRead ) && indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
		}
		else {
			CFGenKbHostNodeBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByUDescrIdx( schema.getAuthorization(),
				ClusterId,
				Description );
			if( buff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbHostNodeObj readHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		return( readHostNodeByHostNameIdx( ClusterId,
			HostName,
			false ) );
	}

	public ICFGenKbHostNodeObj readHostNodeByHostNameIdx( long ClusterId,
		String HostName, boolean forceRead )
	{
		if( indexByHostNameIdx == null ) {
			indexByHostNameIdx = new HashMap< CFGenKbHostNodeByHostNameIdxKey,
				ICFGenKbHostNodeObj >();
		}
		CFGenKbHostNodeByHostNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		ICFGenKbHostNodeObj obj = null;
		if( ( ! forceRead ) && indexByHostNameIdx.containsKey( key ) ) {
			obj = indexByHostNameIdx.get( key );
		}
		else {
			CFGenKbHostNodeBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().readDerivedByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
			if( buff != null ) {
				obj = schema.getHostNodeTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbHostNodeObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbHostNodeObj readCachedHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		ICFGenKbHostNodeObj obj = null;
		CFGenKbHostNodePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		obj = readCachedHostNode( pkey );
		return( obj );
	}

	public List<ICFGenKbHostNodeObj> readCachedHostNodeByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedHostNodeByClusterIdx";
		CFGenKbHostNodeByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<ICFGenKbHostNodeObj> arrayList = new ArrayList<ICFGenKbHostNodeObj>();
		if( indexByClusterIdx != null ) {
			Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				ICFGenKbHostNodeObj arr[] = new ICFGenKbHostNodeObj[len];
				Iterator<ICFGenKbHostNodeObj> valIter = dict.values().iterator();
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
			ICFGenKbHostNodeObj obj;
			Iterator<ICFGenKbHostNodeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbHostNodeObj> cmp = new Comparator<ICFGenKbHostNodeObj>() {
			public int compare( ICFGenKbHostNodeObj lhs, ICFGenKbHostNodeObj rhs ) {
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
					CFGenKbHostNodePKey lhsPKey = lhs.getPKey();
					CFGenKbHostNodePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbHostNodeObj readCachedHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		ICFGenKbHostNodeObj obj = null;
		CFGenKbHostNodeByUDescrIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		if( indexByUDescrIdx != null ) {
			if( indexByUDescrIdx.containsKey( key ) ) {
				obj = indexByUDescrIdx.get( key );
			}
			else {
				Iterator<ICFGenKbHostNodeObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbHostNodeObj> valIter = members.values().iterator();
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

	public ICFGenKbHostNodeObj readCachedHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		ICFGenKbHostNodeObj obj = null;
		CFGenKbHostNodeByHostNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		if( indexByHostNameIdx != null ) {
			if( indexByHostNameIdx.containsKey( key ) ) {
				obj = indexByHostNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbHostNodeObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbHostNodeObj> valIter = members.values().iterator();
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
		ICFGenKbHostNodeObj obj = readCachedHostNodeByIdIdx( ClusterId,
				HostNodeId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeHostNodeByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeHostNodeByClusterIdx";
		ICFGenKbHostNodeObj obj;
		List<ICFGenKbHostNodeObj> arrayList = readCachedHostNodeByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<ICFGenKbHostNodeObj> arrayIter = arrayList.iterator();
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
		ICFGenKbHostNodeObj obj = readCachedHostNodeByUDescrIdx( ClusterId,
				Description );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeHostNodeByHostNameIdx( long ClusterId,
		String HostName )
	{
		ICFGenKbHostNodeObj obj = readCachedHostNodeByHostNameIdx( ClusterId,
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
	public List<ICFGenKbHostNodeObj> pageHostNodeByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageHostNodeByClusterIdx";
		CFGenKbHostNodeByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<ICFGenKbHostNodeObj> retList = new LinkedList<ICFGenKbHostNodeObj>();
		ICFGenKbHostNodeObj obj;
		CFGenKbHostNodeBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorHostNodeId );
		CFGenKbHostNodeBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getHostNodeTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey() );
			obj.setBuff( buff );
			ICFGenKbHostNodeObj realised = (ICFGenKbHostNodeObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public ICFGenKbHostNodeObj updateHostNode( ICFGenKbHostNodeObj Obj ) {
		ICFGenKbHostNodeObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().updateHostNode( schema.getAuthorization(),
			Obj.getHostNodeBuff() );
		obj = (ICFGenKbHostNodeObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteHostNode( ICFGenKbHostNodeObj Obj ) {
		ICFGenKbHostNodeObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNode( schema.getAuthorization(),
			obj.getHostNodeBuff() );
		Obj.forget();
	}

	public void deleteHostNodeByIdIdx( long ClusterId,
		long HostNodeId )
	{
		CFGenKbHostNodePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredHostNodeId( HostNodeId );
		ICFGenKbHostNodeObj obj = readHostNode( pkey );
		if( obj != null ) {
			ICFGenKbHostNodeEditObj editObj = (ICFGenKbHostNodeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbHostNodeEditObj)obj.beginEdit();
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
		CFGenKbHostNodeByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbHostNodeByClusterIdxKey,
				Map< CFGenKbHostNodePKey, ICFGenKbHostNodeObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<CFGenKbHostNodePKey, ICFGenKbHostNodeObj> dict = indexByClusterIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<ICFGenKbHostNodeObj> iter = dict.values().iterator();
			ICFGenKbHostNodeObj obj;
			List<ICFGenKbHostNodeObj> toForget = new LinkedList<ICFGenKbHostNodeObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeHostNodeByClusterIdx( ClusterId );
	}

	public void deleteHostNodeByUDescrIdx( long ClusterId,
		String Description )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< CFGenKbHostNodeByUDescrIdxKey,
				ICFGenKbHostNodeObj >();
		}
		CFGenKbHostNodeByUDescrIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );
		ICFGenKbHostNodeObj obj = null;
		if( indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByUDescrIdx( schema.getAuthorization(),
				ClusterId,
				Description );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByUDescrIdx( schema.getAuthorization(),
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
			indexByHostNameIdx = new HashMap< CFGenKbHostNodeByHostNameIdxKey,
				ICFGenKbHostNodeObj >();
		}
		CFGenKbHostNodeByHostNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );
		ICFGenKbHostNodeObj obj = null;
		if( indexByHostNameIdx.containsKey( key ) ) {
			obj = indexByHostNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableHostNode().deleteHostNodeByHostNameIdx( schema.getAuthorization(),
				ClusterId,
				HostName );
		}
		deepDisposeHostNodeByHostNameIdx( ClusterId,
				HostName );
	}
}
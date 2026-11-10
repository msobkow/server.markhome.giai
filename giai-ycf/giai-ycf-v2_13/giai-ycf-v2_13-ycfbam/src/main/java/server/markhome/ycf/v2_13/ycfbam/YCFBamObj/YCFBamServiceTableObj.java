// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
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

public class YCFBamServiceTableObj
	implements IYCFBamServiceTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecServicePKey, IYCFSecServiceObj> members;
	private Map<YCFSecServicePKey, IYCFSecServiceObj> allService;
	private Map< YCFSecServiceByClusterIdxKey,
		Map<YCFSecServicePKey, IYCFSecServiceObj > > indexByClusterIdx;
	private Map< YCFSecServiceByHostIdxKey,
		Map<YCFSecServicePKey, IYCFSecServiceObj > > indexByHostIdx;
	private Map< YCFSecServiceByTypeIdxKey,
		Map<YCFSecServicePKey, IYCFSecServiceObj > > indexByTypeIdx;
	private Map< YCFSecServiceByUTypeIdxKey,
		IYCFSecServiceObj > indexByUTypeIdx;
	private Map< YCFSecServiceByUHostPortIdxKey,
		IYCFSecServiceObj > indexByUHostPortIdx;
	public static String TABLE_NAME = "Service";
	public static String TABLE_DBNAME = "hostsvc";

	public YCFBamServiceTableObj() {
		schema = null;
		members = new HashMap<YCFSecServicePKey, IYCFSecServiceObj>();
		allService = null;
		indexByClusterIdx = null;
		indexByHostIdx = null;
		indexByTypeIdx = null;
		indexByUTypeIdx = null;
		indexByUHostPortIdx = null;
	}

	public YCFBamServiceTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecServicePKey, IYCFSecServiceObj>();
		allService = null;
		indexByClusterIdx = null;
		indexByHostIdx = null;
		indexByTypeIdx = null;
		indexByUTypeIdx = null;
		indexByUHostPortIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
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
		allService = null;
		indexByClusterIdx = null;
		indexByHostIdx = null;
		indexByTypeIdx = null;
		indexByUTypeIdx = null;
		indexByUHostPortIdx = null;
		List<IYCFSecServiceObj> toForget = new LinkedList<IYCFSecServiceObj>();
		IYCFSecServiceObj cur = null;
		Iterator<IYCFSecServiceObj> iter = members.values().iterator();
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
	 *	YCFBamServiceObj.
	 */
	public IYCFSecServiceObj newInstance() {
		IYCFSecServiceObj inst = new YCFBamServiceObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamServiceObj.
	 */
	public IYCFSecServiceEditObj newEditInstance( IYCFSecServiceObj orig ) {
		IYCFSecServiceEditObj edit = new YCFBamServiceEditObj( orig );
		return( edit );
	}

	public IYCFSecServiceObj realiseService( IYCFSecServiceObj Obj ) {
		IYCFSecServiceObj obj = Obj;
		YCFSecServicePKey pkey = obj.getPKey();
		IYCFSecServiceObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecServiceObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecServiceByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByHostIdx != null ) {
				YCFSecServiceByHostIdxKey keyHostIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
				keyHostIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapHostIdx = indexByHostIdx.get( keyHostIdx );
				if( mapHostIdx != null ) {
					mapHostIdx.remove( keepObj.getPKey() );
					if( mapHostIdx.size() <= 0 ) {
						indexByHostIdx.remove( keyHostIdx );
					}
				}
			}

			if( indexByTypeIdx != null ) {
				YCFSecServiceByTypeIdxKey keyTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
				keyTypeIdx.setRequiredServiceTypeId( keepObj.getRequiredServiceTypeId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapTypeIdx = indexByTypeIdx.get( keyTypeIdx );
				if( mapTypeIdx != null ) {
					mapTypeIdx.remove( keepObj.getPKey() );
					if( mapTypeIdx.size() <= 0 ) {
						indexByTypeIdx.remove( keyTypeIdx );
					}
				}
			}

			if( indexByUTypeIdx != null ) {
				YCFSecServiceByUTypeIdxKey keyUTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUTypeIdxKey();
				keyUTypeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUTypeIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				keyUTypeIdx.setRequiredServiceTypeId( keepObj.getRequiredServiceTypeId() );
				indexByUTypeIdx.remove( keyUTypeIdx );
			}

			if( indexByUHostPortIdx != null ) {
				YCFSecServiceByUHostPortIdxKey keyUHostPortIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUHostPortIdxKey();
				keyUHostPortIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUHostPortIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				keyUHostPortIdx.setRequiredHostPort( keepObj.getRequiredHostPort() );
				indexByUHostPortIdx.remove( keyUHostPortIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecServiceByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByHostIdx != null ) {
				YCFSecServiceByHostIdxKey keyHostIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
				keyHostIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapHostIdx = indexByHostIdx.get( keyHostIdx );
				if( mapHostIdx != null ) {
					mapHostIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTypeIdx != null ) {
				YCFSecServiceByTypeIdxKey keyTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
				keyTypeIdx.setRequiredServiceTypeId( keepObj.getRequiredServiceTypeId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapTypeIdx = indexByTypeIdx.get( keyTypeIdx );
				if( mapTypeIdx != null ) {
					mapTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUTypeIdx != null ) {
				YCFSecServiceByUTypeIdxKey keyUTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUTypeIdxKey();
				keyUTypeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUTypeIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				keyUTypeIdx.setRequiredServiceTypeId( keepObj.getRequiredServiceTypeId() );
				indexByUTypeIdx.put( keyUTypeIdx, keepObj );
			}

			if( indexByUHostPortIdx != null ) {
				YCFSecServiceByUHostPortIdxKey keyUHostPortIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUHostPortIdxKey();
				keyUHostPortIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUHostPortIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				keyUHostPortIdx.setRequiredHostPort( keepObj.getRequiredHostPort() );
				indexByUHostPortIdx.put( keyUHostPortIdx, keepObj );
			}

			if( allService != null ) {
				allService.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allService != null ) {
				allService.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecServiceByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByHostIdx != null ) {
				YCFSecServiceByHostIdxKey keyHostIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
				keyHostIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyHostIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapHostIdx = indexByHostIdx.get( keyHostIdx );
				if( mapHostIdx != null ) {
					mapHostIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTypeIdx != null ) {
				YCFSecServiceByTypeIdxKey keyTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
				keyTypeIdx.setRequiredServiceTypeId( keepObj.getRequiredServiceTypeId() );
				Map<YCFSecServicePKey, IYCFSecServiceObj > mapTypeIdx = indexByTypeIdx.get( keyTypeIdx );
				if( mapTypeIdx != null ) {
					mapTypeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUTypeIdx != null ) {
				YCFSecServiceByUTypeIdxKey keyUTypeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUTypeIdxKey();
				keyUTypeIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUTypeIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				keyUTypeIdx.setRequiredServiceTypeId( keepObj.getRequiredServiceTypeId() );
				indexByUTypeIdx.put( keyUTypeIdx, keepObj );
			}

			if( indexByUHostPortIdx != null ) {
				YCFSecServiceByUHostPortIdxKey keyUHostPortIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUHostPortIdxKey();
				keyUHostPortIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUHostPortIdx.setRequiredHostNodeId( keepObj.getRequiredHostNodeId() );
				keyUHostPortIdx.setRequiredHostPort( keepObj.getRequiredHostPort() );
				indexByUHostPortIdx.put( keyUHostPortIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecServiceObj createService( IYCFSecServiceObj Obj ) {
		IYCFSecServiceObj obj = Obj;
		YCFSecServiceBuff buff = obj.getServiceBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableService().createService(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecServiceObj readService( YCFSecServicePKey pkey ) {
		return( readService( pkey, false ) );
	}

	public IYCFSecServiceObj readService( YCFSecServicePKey pkey, boolean forceRead ) {
		IYCFSecServiceObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecServiceBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableService().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredServiceId() );
			if( readBuff != null ) {
				obj = schema.getServiceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecServiceObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecServiceObj readCachedService( YCFSecServicePKey pkey ) {
		IYCFSecServiceObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeService( IYCFSecServiceObj obj )
	{
		final String S_ProcName = "YCFBamServiceTableObj.reallyDeepDisposeService() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecServicePKey pkey = obj.getPKey();
		IYCFSecServiceObj existing = readCachedService( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecServiceByClusterIdxKey keyClusterIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecServiceByHostIdxKey keyHostIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
		keyHostIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyHostIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );

		YCFSecServiceByTypeIdxKey keyTypeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
		keyTypeIdx.setRequiredServiceTypeId( existing.getRequiredServiceTypeId() );

		YCFSecServiceByUTypeIdxKey keyUTypeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUTypeIdxKey();
		keyUTypeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUTypeIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );
		keyUTypeIdx.setRequiredServiceTypeId( existing.getRequiredServiceTypeId() );

		YCFSecServiceByUHostPortIdxKey keyUHostPortIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUHostPortIdxKey();
		keyUHostPortIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUHostPortIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );
		keyUHostPortIdx.setRequiredHostPort( existing.getRequiredHostPort() );



		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByHostIdx != null ) {
			if( indexByHostIdx.containsKey( keyHostIdx ) ) {
				indexByHostIdx.get( keyHostIdx ).remove( pkey );
				if( indexByHostIdx.get( keyHostIdx ).size() <= 0 ) {
					indexByHostIdx.remove( keyHostIdx );
				}
			}
		}

		if( indexByTypeIdx != null ) {
			if( indexByTypeIdx.containsKey( keyTypeIdx ) ) {
				indexByTypeIdx.get( keyTypeIdx ).remove( pkey );
				if( indexByTypeIdx.get( keyTypeIdx ).size() <= 0 ) {
					indexByTypeIdx.remove( keyTypeIdx );
				}
			}
		}

		if( indexByUTypeIdx != null ) {
			indexByUTypeIdx.remove( keyUTypeIdx );
		}

		if( indexByUHostPortIdx != null ) {
			indexByUHostPortIdx.remove( keyUHostPortIdx );
		}


	}
	public void deepDisposeService( YCFSecServicePKey pkey ) {
		IYCFSecServiceObj obj = readCachedService( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecServiceObj lockService( YCFSecServicePKey pkey ) {
		IYCFSecServiceObj locked = null;
		YCFSecServiceBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableService().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getServiceTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecServiceObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockService", pkey );
		}
		return( locked );
	}

	public List<IYCFSecServiceObj> readAllService() {
		return( readAllService( false ) );
	}

	public List<IYCFSecServiceObj> readAllService( boolean forceRead ) {
		final String S_ProcName = "readAllService";
		if( ( allService == null ) || forceRead ) {
			Map<YCFSecServicePKey, IYCFSecServiceObj> map = new HashMap<YCFSecServicePKey,IYCFSecServiceObj>();
			allService = map;
			YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().readAllDerived( schema.getAuthorization() );
			YCFSecServiceBuff buff;
			IYCFSecServiceObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
				obj.setBuff( buff );
				IYCFSecServiceObj realised = (IYCFSecServiceObj)obj.realise();
			}
		}
		int len = allService.size();
		IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
		Iterator<IYCFSecServiceObj> valIter = allService.values().iterator();
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
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecServiceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecServiceObj> readCachedAllService() {
		final String S_ProcName = "readCachedAllService";
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>();
		if( allService != null ) {
			int len = allService.size();
			IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
			Iterator<IYCFSecServiceObj> valIter = allService.values().iterator();
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
		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the Service-derived instances in the database.
	 *
	 *	@return	List of IYCFSecServiceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecServiceObj> pageAllService(Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageAllService";
		Map<YCFSecServicePKey, IYCFSecServiceObj> map = new HashMap<YCFSecServicePKey,IYCFSecServiceObj>();
		YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorServiceId );
		YCFSecServiceBuff buff;
		IYCFSecServiceObj obj;
		IYCFSecServiceObj realised;
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecServiceObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecServiceObj readServiceByIdIdx( long ClusterId,
		long ServiceId )
	{
		return( readServiceByIdIdx( ClusterId,
			ServiceId,
			false ) );
	}

	public IYCFSecServiceObj readServiceByIdIdx( long ClusterId,
		long ServiceId, boolean forceRead )
	{
		YCFSecServicePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredServiceId( ServiceId );
		IYCFSecServiceObj obj = readService( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecServiceObj> readServiceByClusterIdx( long ClusterId )
	{
		return( readServiceByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecServiceObj> readServiceByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readServiceByClusterIdx";
		YCFSecServiceByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecServicePKey, IYCFSecServiceObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecServiceByClusterIdxKey,
				Map< YCFSecServicePKey, IYCFSecServiceObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecServicePKey, IYCFSecServiceObj>();
			IYCFSecServiceObj obj;
			YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecServiceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getServiceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
				obj.setBuff( buff );
				IYCFSecServiceObj realised = (IYCFSecServiceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
		Iterator<IYCFSecServiceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecServiceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecServiceObj> readServiceByHostIdx( long ClusterId,
		long HostNodeId )
	{
		return( readServiceByHostIdx( ClusterId,
			HostNodeId,
			false ) );
	}

	public List<IYCFSecServiceObj> readServiceByHostIdx( long ClusterId,
		long HostNodeId,
		boolean forceRead )
	{
		final String S_ProcName = "readServiceByHostIdx";
		YCFSecServiceByHostIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		Map<YCFSecServicePKey, IYCFSecServiceObj> dict;
		if( indexByHostIdx == null ) {
			indexByHostIdx = new HashMap< YCFSecServiceByHostIdxKey,
				Map< YCFSecServicePKey, IYCFSecServiceObj > >();
		}
		if( ( ! forceRead ) && indexByHostIdx.containsKey( key ) ) {
			dict = indexByHostIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecServicePKey, IYCFSecServiceObj>();
			IYCFSecServiceObj obj;
			YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().readDerivedByHostIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId );
			YCFSecServiceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getServiceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
				obj.setBuff( buff );
				IYCFSecServiceObj realised = (IYCFSecServiceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByHostIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
		Iterator<IYCFSecServiceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecServiceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecServiceObj> readServiceByTypeIdx( int ServiceTypeId )
	{
		return( readServiceByTypeIdx( ServiceTypeId,
			false ) );
	}

	public List<IYCFSecServiceObj> readServiceByTypeIdx( int ServiceTypeId,
		boolean forceRead )
	{
		final String S_ProcName = "readServiceByTypeIdx";
		YCFSecServiceByTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
		key.setRequiredServiceTypeId( ServiceTypeId );
		Map<YCFSecServicePKey, IYCFSecServiceObj> dict;
		if( indexByTypeIdx == null ) {
			indexByTypeIdx = new HashMap< YCFSecServiceByTypeIdxKey,
				Map< YCFSecServicePKey, IYCFSecServiceObj > >();
		}
		if( ( ! forceRead ) && indexByTypeIdx.containsKey( key ) ) {
			dict = indexByTypeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecServicePKey, IYCFSecServiceObj>();
			IYCFSecServiceObj obj;
			YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().readDerivedByTypeIdx( schema.getAuthorization(),
				ServiceTypeId );
			YCFSecServiceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getServiceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
				obj.setBuff( buff );
				IYCFSecServiceObj realised = (IYCFSecServiceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTypeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
		Iterator<IYCFSecServiceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecServiceObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecServiceObj readServiceByUTypeIdx( long ClusterId,
		long HostNodeId,
		int ServiceTypeId )
	{
		return( readServiceByUTypeIdx( ClusterId,
			HostNodeId,
			ServiceTypeId,
			false ) );
	}

	public IYCFSecServiceObj readServiceByUTypeIdx( long ClusterId,
		long HostNodeId,
		int ServiceTypeId, boolean forceRead )
	{
		if( indexByUTypeIdx == null ) {
			indexByUTypeIdx = new HashMap< YCFSecServiceByUTypeIdxKey,
				IYCFSecServiceObj >();
		}
		YCFSecServiceByUTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUTypeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredServiceTypeId( ServiceTypeId );
		IYCFSecServiceObj obj = null;
		if( ( ! forceRead ) && indexByUTypeIdx.containsKey( key ) ) {
			obj = indexByUTypeIdx.get( key );
		}
		else {
			YCFSecServiceBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableService().readDerivedByUTypeIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId,
				ServiceTypeId );
			if( buff != null ) {
				obj = schema.getServiceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecServiceObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecServiceObj readServiceByUHostPortIdx( long ClusterId,
		long HostNodeId,
		short HostPort )
	{
		return( readServiceByUHostPortIdx( ClusterId,
			HostNodeId,
			HostPort,
			false ) );
	}

	public IYCFSecServiceObj readServiceByUHostPortIdx( long ClusterId,
		long HostNodeId,
		short HostPort, boolean forceRead )
	{
		if( indexByUHostPortIdx == null ) {
			indexByUHostPortIdx = new HashMap< YCFSecServiceByUHostPortIdxKey,
				IYCFSecServiceObj >();
		}
		YCFSecServiceByUHostPortIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUHostPortIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredHostPort( HostPort );
		IYCFSecServiceObj obj = null;
		if( ( ! forceRead ) && indexByUHostPortIdx.containsKey( key ) ) {
			obj = indexByUHostPortIdx.get( key );
		}
		else {
			YCFSecServiceBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableService().readDerivedByUHostPortIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId,
				HostPort );
			if( buff != null ) {
				obj = schema.getServiceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecServiceObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecServiceObj readCachedServiceByIdIdx( long ClusterId,
		long ServiceId )
	{
		IYCFSecServiceObj obj = null;
		YCFSecServicePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredServiceId( ServiceId );
		obj = readCachedService( pkey );
		return( obj );
	}

	public List<IYCFSecServiceObj> readCachedServiceByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedServiceByClusterIdx";
		YCFSecServiceByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecServicePKey, IYCFSecServiceObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
				Iterator<IYCFSecServiceObj> valIter = dict.values().iterator();
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
			IYCFSecServiceObj obj;
			Iterator<IYCFSecServiceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecServiceObj> readCachedServiceByHostIdx( long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "readCachedServiceByHostIdx";
		YCFSecServiceByHostIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>();
		if( indexByHostIdx != null ) {
			Map<YCFSecServicePKey, IYCFSecServiceObj> dict;
			if( indexByHostIdx.containsKey( key ) ) {
				dict = indexByHostIdx.get( key );
				int len = dict.size();
				IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
				Iterator<IYCFSecServiceObj> valIter = dict.values().iterator();
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
			IYCFSecServiceObj obj;
			Iterator<IYCFSecServiceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecServiceObj> readCachedServiceByTypeIdx( int ServiceTypeId )
	{
		final String S_ProcName = "readCachedServiceByTypeIdx";
		YCFSecServiceByTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
		key.setRequiredServiceTypeId( ServiceTypeId );
		ArrayList<IYCFSecServiceObj> arrayList = new ArrayList<IYCFSecServiceObj>();
		if( indexByTypeIdx != null ) {
			Map<YCFSecServicePKey, IYCFSecServiceObj> dict;
			if( indexByTypeIdx.containsKey( key ) ) {
				dict = indexByTypeIdx.get( key );
				int len = dict.size();
				IYCFSecServiceObj arr[] = new IYCFSecServiceObj[len];
				Iterator<IYCFSecServiceObj> valIter = dict.values().iterator();
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
			IYCFSecServiceObj obj;
			Iterator<IYCFSecServiceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecServiceObj> cmp = new Comparator<IYCFSecServiceObj>() {
			public int compare( IYCFSecServiceObj lhs, IYCFSecServiceObj rhs ) {
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
					YCFSecServicePKey lhsPKey = lhs.getPKey();
					YCFSecServicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecServiceObj readCachedServiceByUTypeIdx( long ClusterId,
		long HostNodeId,
		int ServiceTypeId )
	{
		IYCFSecServiceObj obj = null;
		YCFSecServiceByUTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUTypeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredServiceTypeId( ServiceTypeId );
		if( indexByUTypeIdx != null ) {
			if( indexByUTypeIdx.containsKey( key ) ) {
				obj = indexByUTypeIdx.get( key );
			}
			else {
				Iterator<IYCFSecServiceObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecServiceObj> valIter = members.values().iterator();
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

	public IYCFSecServiceObj readCachedServiceByUHostPortIdx( long ClusterId,
		long HostNodeId,
		short HostPort )
	{
		IYCFSecServiceObj obj = null;
		YCFSecServiceByUHostPortIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUHostPortIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredHostPort( HostPort );
		if( indexByUHostPortIdx != null ) {
			if( indexByUHostPortIdx.containsKey( key ) ) {
				obj = indexByUHostPortIdx.get( key );
			}
			else {
				Iterator<IYCFSecServiceObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecServiceObj> valIter = members.values().iterator();
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

	public void deepDisposeServiceByIdIdx( long ClusterId,
		long ServiceId )
	{
		IYCFSecServiceObj obj = readCachedServiceByIdIdx( ClusterId,
				ServiceId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServiceByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeServiceByClusterIdx";
		IYCFSecServiceObj obj;
		List<IYCFSecServiceObj> arrayList = readCachedServiceByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecServiceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServiceByHostIdx( long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "deepDisposeServiceByHostIdx";
		IYCFSecServiceObj obj;
		List<IYCFSecServiceObj> arrayList = readCachedServiceByHostIdx( ClusterId,
				HostNodeId );
		if( arrayList != null )  {
			Iterator<IYCFSecServiceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServiceByTypeIdx( int ServiceTypeId )
	{
		final String S_ProcName = "deepDisposeServiceByTypeIdx";
		IYCFSecServiceObj obj;
		List<IYCFSecServiceObj> arrayList = readCachedServiceByTypeIdx( ServiceTypeId );
		if( arrayList != null )  {
			Iterator<IYCFSecServiceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServiceByUTypeIdx( long ClusterId,
		long HostNodeId,
		int ServiceTypeId )
	{
		IYCFSecServiceObj obj = readCachedServiceByUTypeIdx( ClusterId,
				HostNodeId,
				ServiceTypeId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServiceByUHostPortIdx( long ClusterId,
		long HostNodeId,
		short HostPort )
	{
		IYCFSecServiceObj obj = readCachedServiceByUHostPortIdx( ClusterId,
				HostNodeId,
				HostPort );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of Service-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	A List of Service-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecServiceObj> pageServiceByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageServiceByClusterIdx";
		YCFSecServiceByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecServiceObj> retList = new LinkedList<IYCFSecServiceObj>();
		IYCFSecServiceObj obj;
		YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorServiceId );
		YCFSecServiceBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getServiceTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
			obj.setBuff( buff );
			IYCFSecServiceObj realised = (IYCFSecServiceObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of Service-derived instances sorted by their primary keys,
	 *	as identified by the duplicate HostIdx key attributes.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	A List of Service-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecServiceObj> pageServiceByHostIdx( long ClusterId,
		long HostNodeId,
		Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageServiceByHostIdx";
		YCFSecServiceByHostIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		List<IYCFSecServiceObj> retList = new LinkedList<IYCFSecServiceObj>();
		IYCFSecServiceObj obj;
		YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().pageBuffByHostIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId,
			priorClusterId,
			priorServiceId );
		YCFSecServiceBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getServiceTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
			obj.setBuff( buff );
			IYCFSecServiceObj realised = (IYCFSecServiceObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of Service-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TypeIdx key attributes.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return	A List of Service-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecServiceObj> pageServiceByTypeIdx( int ServiceTypeId,
		Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageServiceByTypeIdx";
		YCFSecServiceByTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
		key.setRequiredServiceTypeId( ServiceTypeId );
		List<IYCFSecServiceObj> retList = new LinkedList<IYCFSecServiceObj>();
		IYCFSecServiceObj obj;
		YCFSecServiceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableService().pageBuffByTypeIdx( schema.getAuthorization(),
				ServiceTypeId,
			priorClusterId,
			priorServiceId );
		YCFSecServiceBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getServiceTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey() );
			obj.setBuff( buff );
			IYCFSecServiceObj realised = (IYCFSecServiceObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecServiceObj updateService( IYCFSecServiceObj Obj ) {
		IYCFSecServiceObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableService().updateService( schema.getAuthorization(),
			Obj.getServiceBuff() );
		obj = (IYCFSecServiceObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteService( IYCFSecServiceObj Obj ) {
		IYCFSecServiceObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteService( schema.getAuthorization(),
			obj.getServiceBuff() );
		Obj.forget();
	}

	public void deleteServiceByIdIdx( long ClusterId,
		long ServiceId )
	{
		YCFSecServicePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredServiceId( ServiceId );
		IYCFSecServiceObj obj = readService( pkey );
		if( obj != null ) {
			IYCFSecServiceEditObj editObj = (IYCFSecServiceEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecServiceEditObj)obj.beginEdit();
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
		deepDisposeServiceByIdIdx( ClusterId,
				ServiceId );
	}

	public void deleteServiceByClusterIdx( long ClusterId )
	{
		YCFSecServiceByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecServiceByClusterIdxKey,
				Map< YCFSecServicePKey, IYCFSecServiceObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecServicePKey, IYCFSecServiceObj> dict = indexByClusterIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecServiceObj> iter = dict.values().iterator();
			IYCFSecServiceObj obj;
			List<IYCFSecServiceObj> toForget = new LinkedList<IYCFSecServiceObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeServiceByClusterIdx( ClusterId );
	}

	public void deleteServiceByHostIdx( long ClusterId,
		long HostNodeId )
	{
		YCFSecServiceByHostIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newHostIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		if( indexByHostIdx == null ) {
			indexByHostIdx = new HashMap< YCFSecServiceByHostIdxKey,
				Map< YCFSecServicePKey, IYCFSecServiceObj > >();
		}
		if( indexByHostIdx.containsKey( key ) ) {
			Map<YCFSecServicePKey, IYCFSecServiceObj> dict = indexByHostIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByHostIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId );
			Iterator<IYCFSecServiceObj> iter = dict.values().iterator();
			IYCFSecServiceObj obj;
			List<IYCFSecServiceObj> toForget = new LinkedList<IYCFSecServiceObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByHostIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByHostIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId );
		}
		deepDisposeServiceByHostIdx( ClusterId,
				HostNodeId );
	}

	public void deleteServiceByTypeIdx( int ServiceTypeId )
	{
		YCFSecServiceByTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newTypeIdxKey();
		key.setRequiredServiceTypeId( ServiceTypeId );
		if( indexByTypeIdx == null ) {
			indexByTypeIdx = new HashMap< YCFSecServiceByTypeIdxKey,
				Map< YCFSecServicePKey, IYCFSecServiceObj > >();
		}
		if( indexByTypeIdx.containsKey( key ) ) {
			Map<YCFSecServicePKey, IYCFSecServiceObj> dict = indexByTypeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByTypeIdx( schema.getAuthorization(),
				ServiceTypeId );
			Iterator<IYCFSecServiceObj> iter = dict.values().iterator();
			IYCFSecServiceObj obj;
			List<IYCFSecServiceObj> toForget = new LinkedList<IYCFSecServiceObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTypeIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByTypeIdx( schema.getAuthorization(),
				ServiceTypeId );
		}
		deepDisposeServiceByTypeIdx( ServiceTypeId );
	}

	public void deleteServiceByUTypeIdx( long ClusterId,
		long HostNodeId,
		int ServiceTypeId )
	{
		if( indexByUTypeIdx == null ) {
			indexByUTypeIdx = new HashMap< YCFSecServiceByUTypeIdxKey,
				IYCFSecServiceObj >();
		}
		YCFSecServiceByUTypeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUTypeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredServiceTypeId( ServiceTypeId );
		IYCFSecServiceObj obj = null;
		if( indexByUTypeIdx.containsKey( key ) ) {
			obj = indexByUTypeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByUTypeIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId,
				ServiceTypeId );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByUTypeIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId,
				ServiceTypeId );
		}
		deepDisposeServiceByUTypeIdx( ClusterId,
				HostNodeId,
				ServiceTypeId );
	}

	public void deleteServiceByUHostPortIdx( long ClusterId,
		long HostNodeId,
		short HostPort )
	{
		if( indexByUHostPortIdx == null ) {
			indexByUHostPortIdx = new HashMap< YCFSecServiceByUHostPortIdxKey,
				IYCFSecServiceObj >();
		}
		YCFSecServiceByUHostPortIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryService().newUHostPortIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredHostPort( HostPort );
		IYCFSecServiceObj obj = null;
		if( indexByUHostPortIdx.containsKey( key ) ) {
			obj = indexByUHostPortIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByUHostPortIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId,
				HostPort );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableService().deleteServiceByUHostPortIdx( schema.getAuthorization(),
				ClusterId,
				HostNodeId,
				HostPort );
		}
		deepDisposeServiceByUHostPortIdx( ClusterId,
				HostNodeId,
				HostPort );
	}
}

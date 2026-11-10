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

public class YCFBamSecFormTableObj
	implements IYCFBamSecFormTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecSecFormPKey, IYCFSecSecFormObj> members;
	private Map<YCFSecSecFormPKey, IYCFSecSecFormObj> allSecForm;
	private Map< YCFSecSecFormByClusterIdxKey,
		Map<YCFSecSecFormPKey, IYCFSecSecFormObj > > indexByClusterIdx;
	private Map< YCFSecSecFormBySecAppIdxKey,
		Map<YCFSecSecFormPKey, IYCFSecSecFormObj > > indexBySecAppIdx;
	private Map< YCFSecSecFormByUJEEServletIdxKey,
		IYCFSecSecFormObj > indexByUJEEServletIdx;
	public static String TABLE_NAME = "SecForm";
	public static String TABLE_DBNAME = "seycform";

	public YCFBamSecFormTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecFormPKey, IYCFSecSecFormObj>();
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
	}

	public YCFBamSecFormTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecSecFormPKey, IYCFSecSecFormObj>();
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
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
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
		List<IYCFSecSecFormObj> toForget = new LinkedList<IYCFSecSecFormObj>();
		IYCFSecSecFormObj cur = null;
		Iterator<IYCFSecSecFormObj> iter = members.values().iterator();
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
	 *	YCFBamSecFormObj.
	 */
	public IYCFSecSecFormObj newInstance() {
		IYCFSecSecFormObj inst = new YCFBamSecFormObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSecFormObj.
	 */
	public IYCFSecSecFormEditObj newEditInstance( IYCFSecSecFormObj orig ) {
		IYCFSecSecFormEditObj edit = new YCFBamSecFormEditObj( orig );
		return( edit );
	}

	public IYCFSecSecFormObj realiseSecForm( IYCFSecSecFormObj Obj ) {
		IYCFSecSecFormObj obj = Obj;
		YCFSecSecFormPKey pkey = obj.getPKey();
		IYCFSecSecFormObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecFormObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecSecFormByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecFormPKey, IYCFSecSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexBySecAppIdx != null ) {
				YCFSecSecFormBySecAppIdxKey keySecAppIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFSecSecFormPKey, IYCFSecSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.remove( keepObj.getPKey() );
					if( mapSecAppIdx.size() <= 0 ) {
						indexBySecAppIdx.remove( keySecAppIdx );
					}
				}
			}

			if( indexByUJEEServletIdx != null ) {
				YCFSecSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.remove( keyUJEEServletIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecSecFormByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecFormPKey, IYCFSecSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecAppIdx != null ) {
				YCFSecSecFormBySecAppIdxKey keySecAppIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFSecSecFormPKey, IYCFSecSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEServletIdx != null ) {
				YCFSecSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.put( keyUJEEServletIdx, keepObj );
			}

			if( allSecForm != null ) {
				allSecForm.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecForm != null ) {
				allSecForm.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecSecFormByClusterIdxKey keyClusterIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecFormPKey, IYCFSecSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecAppIdx != null ) {
				YCFSecSecFormBySecAppIdxKey keySecAppIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFSecSecFormPKey, IYCFSecSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEServletIdx != null ) {
				YCFSecSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.put( keyUJEEServletIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecSecFormObj createSecForm( IYCFSecSecFormObj Obj ) {
		IYCFSecSecFormObj obj = Obj;
		YCFSecSecFormBuff buff = obj.getSecFormBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().createSecForm(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecFormObj readSecForm( YCFSecSecFormPKey pkey ) {
		return( readSecForm( pkey, false ) );
	}

	public IYCFSecSecFormObj readSecForm( YCFSecSecFormPKey pkey, boolean forceRead ) {
		IYCFSecSecFormObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecFormBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecFormId() );
			if( readBuff != null ) {
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecFormObj readCachedSecForm( YCFSecSecFormPKey pkey ) {
		IYCFSecSecFormObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecForm( IYCFSecSecFormObj obj )
	{
		final String S_ProcName = "YCFBamSecFormTableObj.reallyDeepDisposeSecForm() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecFormPKey pkey = obj.getPKey();
		IYCFSecSecFormObj existing = readCachedSecForm( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecFormByClusterIdxKey keyClusterIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecFormBySecAppIdxKey keySecAppIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		keySecAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keySecAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFSecSecFormByUJEEServletIdxKey keyUJEEServletIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		keyUJEEServletIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUJEEServletIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );
		keyUJEEServletIdx.setRequiredJEEServletMapName( existing.getRequiredJEEServletMapName() );



		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexBySecAppIdx != null ) {
			if( indexBySecAppIdx.containsKey( keySecAppIdx ) ) {
				indexBySecAppIdx.get( keySecAppIdx ).remove( pkey );
				if( indexBySecAppIdx.get( keySecAppIdx ).size() <= 0 ) {
					indexBySecAppIdx.remove( keySecAppIdx );
				}
			}
		}

		if( indexByUJEEServletIdx != null ) {
			indexByUJEEServletIdx.remove( keyUJEEServletIdx );
		}


	}
	public void deepDisposeSecForm( YCFSecSecFormPKey pkey ) {
		IYCFSecSecFormObj obj = readCachedSecForm( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecFormObj lockSecForm( YCFSecSecFormPKey pkey ) {
		IYCFSecSecFormObj locked = null;
		YCFSecSecFormBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecFormTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecFormObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecForm", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecFormObj> readAllSecForm() {
		return( readAllSecForm( false ) );
	}

	public List<IYCFSecSecFormObj> readAllSecForm( boolean forceRead ) {
		final String S_ProcName = "readAllSecForm";
		if( ( allSecForm == null ) || forceRead ) {
			Map<YCFSecSecFormPKey, IYCFSecSecFormObj> map = new HashMap<YCFSecSecFormPKey,IYCFSecSecFormObj>();
			allSecForm = map;
			YCFSecSecFormBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().readAllDerived( schema.getAuthorization() );
			YCFSecSecFormBuff buff;
			IYCFSecSecFormObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecFormObj realised = (IYCFSecSecFormObj)obj.realise();
			}
		}
		int len = allSecForm.size();
		IYCFSecSecFormObj arr[] = new IYCFSecSecFormObj[len];
		Iterator<IYCFSecSecFormObj> valIter = allSecForm.values().iterator();
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
		ArrayList<IYCFSecSecFormObj> arrayList = new ArrayList<IYCFSecSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecFormObj> cmp = new Comparator<IYCFSecSecFormObj>() {
			public int compare( IYCFSecSecFormObj lhs, IYCFSecSecFormObj rhs ) {
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
					YCFSecSecFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecFormObj> readCachedAllSecForm() {
		final String S_ProcName = "readCachedAllSecForm";
		ArrayList<IYCFSecSecFormObj> arrayList = new ArrayList<IYCFSecSecFormObj>();
		if( allSecForm != null ) {
			int len = allSecForm.size();
			IYCFSecSecFormObj arr[] = new IYCFSecSecFormObj[len];
			Iterator<IYCFSecSecFormObj> valIter = allSecForm.values().iterator();
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
		Comparator<IYCFSecSecFormObj> cmp = new Comparator<IYCFSecSecFormObj>() {
			public int compare( IYCFSecSecFormObj lhs, IYCFSecSecFormObj rhs ) {
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
					YCFSecSecFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecFormObj> pageAllSecForm(Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageAllSecForm";
		Map<YCFSecSecFormPKey, IYCFSecSecFormObj> map = new HashMap<YCFSecSecFormPKey,IYCFSecSecFormObj>();
		YCFSecSecFormBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecFormId );
		YCFSecSecFormBuff buff;
		IYCFSecSecFormObj obj;
		IYCFSecSecFormObj realised;
		ArrayList<IYCFSecSecFormObj> arrayList = new ArrayList<IYCFSecSecFormObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecFormObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		return( readSecFormByIdIdx( ClusterId,
			SecFormId,
			false ) );
	}

	public IYCFSecSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId, boolean forceRead )
	{
		YCFSecSecFormPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		IYCFSecSecFormObj obj = readSecForm( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSecFormObj> readSecFormByClusterIdx( long ClusterId )
	{
		return( readSecFormByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecSecFormObj> readSecFormByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecFormByClusterIdx";
		YCFSecSecFormByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecSecFormPKey, IYCFSecSecFormObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecFormByClusterIdxKey,
				Map< YCFSecSecFormPKey, IYCFSecSecFormObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecFormPKey, IYCFSecSecFormObj>();
			IYCFSecSecFormObj obj;
			YCFSecSecFormBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecSecFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecFormObj realised = (IYCFSecSecFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecFormObj arr[] = new IYCFSecSecFormObj[len];
		Iterator<IYCFSecSecFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecFormObj> arrayList = new ArrayList<IYCFSecSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecFormObj> cmp = new Comparator<IYCFSecSecFormObj>() {
			public int compare( IYCFSecSecFormObj lhs, IYCFSecSecFormObj rhs ) {
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
					YCFSecSecFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		return( readSecFormBySecAppIdx( ClusterId,
			SecAppId,
			false ) );
	}

	public List<IYCFSecSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecFormBySecAppIdx";
		YCFSecSecFormBySecAppIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		Map<YCFSecSecFormPKey, IYCFSecSecFormObj> dict;
		if( indexBySecAppIdx == null ) {
			indexBySecAppIdx = new HashMap< YCFSecSecFormBySecAppIdxKey,
				Map< YCFSecSecFormPKey, IYCFSecSecFormObj > >();
		}
		if( ( ! forceRead ) && indexBySecAppIdx.containsKey( key ) ) {
			dict = indexBySecAppIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecFormPKey, IYCFSecSecFormObj>();
			IYCFSecSecFormObj obj;
			YCFSecSecFormBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().readDerivedBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			YCFSecSecFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecFormObj realised = (IYCFSecSecFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecAppIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecFormObj arr[] = new IYCFSecSecFormObj[len];
		Iterator<IYCFSecSecFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecFormObj> arrayList = new ArrayList<IYCFSecSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecFormObj> cmp = new Comparator<IYCFSecSecFormObj>() {
			public int compare( IYCFSecSecFormObj lhs, IYCFSecSecFormObj rhs ) {
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
					YCFSecSecFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecFormObj readSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		return( readSecFormByUJEEServletIdx( ClusterId,
			SecAppId,
			JEEServletMapName,
			false ) );
	}

	public IYCFSecSecFormObj readSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName, boolean forceRead )
	{
		if( indexByUJEEServletIdx == null ) {
			indexByUJEEServletIdx = new HashMap< YCFSecSecFormByUJEEServletIdxKey,
				IYCFSecSecFormObj >();
		}
		YCFSecSecFormByUJEEServletIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		IYCFSecSecFormObj obj = null;
		if( ( ! forceRead ) && indexByUJEEServletIdx.containsKey( key ) ) {
			obj = indexByUJEEServletIdx.get( key );
		}
		else {
			YCFSecSecFormBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().readDerivedByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
			if( buff != null ) {
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecFormObj readCachedSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		IYCFSecSecFormObj obj = null;
		YCFSecSecFormPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		obj = readCachedSecForm( pkey );
		return( obj );
	}

	public List<IYCFSecSecFormObj> readCachedSecFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecFormByClusterIdx";
		YCFSecSecFormByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecSecFormObj> arrayList = new ArrayList<IYCFSecSecFormObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecSecFormPKey, IYCFSecSecFormObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecSecFormObj arr[] = new IYCFSecSecFormObj[len];
				Iterator<IYCFSecSecFormObj> valIter = dict.values().iterator();
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
			IYCFSecSecFormObj obj;
			Iterator<IYCFSecSecFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecFormObj> cmp = new Comparator<IYCFSecSecFormObj>() {
			public int compare( IYCFSecSecFormObj lhs, IYCFSecSecFormObj rhs ) {
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
					YCFSecSecFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecFormObj> readCachedSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "readCachedSecFormBySecAppIdx";
		YCFSecSecFormBySecAppIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		ArrayList<IYCFSecSecFormObj> arrayList = new ArrayList<IYCFSecSecFormObj>();
		if( indexBySecAppIdx != null ) {
			Map<YCFSecSecFormPKey, IYCFSecSecFormObj> dict;
			if( indexBySecAppIdx.containsKey( key ) ) {
				dict = indexBySecAppIdx.get( key );
				int len = dict.size();
				IYCFSecSecFormObj arr[] = new IYCFSecSecFormObj[len];
				Iterator<IYCFSecSecFormObj> valIter = dict.values().iterator();
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
			IYCFSecSecFormObj obj;
			Iterator<IYCFSecSecFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecFormObj> cmp = new Comparator<IYCFSecSecFormObj>() {
			public int compare( IYCFSecSecFormObj lhs, IYCFSecSecFormObj rhs ) {
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
					YCFSecSecFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecFormObj readCachedSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		IYCFSecSecFormObj obj = null;
		YCFSecSecFormByUJEEServletIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		if( indexByUJEEServletIdx != null ) {
			if( indexByUJEEServletIdx.containsKey( key ) ) {
				obj = indexByUJEEServletIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecFormObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecFormObj> valIter = members.values().iterator();
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

	public void deepDisposeSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		IYCFSecSecFormObj obj = readCachedSecFormByIdIdx( ClusterId,
				SecFormId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecFormByClusterIdx";
		IYCFSecSecFormObj obj;
		List<IYCFSecSecFormObj> arrayList = readCachedSecFormByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "deepDisposeSecFormBySecAppIdx";
		IYCFSecSecFormObj obj;
		List<IYCFSecSecFormObj> arrayList = readCachedSecFormBySecAppIdx( ClusterId,
				SecAppId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		IYCFSecSecFormObj obj = readCachedSecFormByUJEEServletIdx( ClusterId,
				SecAppId,
				JEEServletMapName );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecFormObj> pageSecFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageSecFormByClusterIdx";
		YCFSecSecFormByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecSecFormObj> retList = new LinkedList<IYCFSecSecFormObj>();
		IYCFSecSecFormObj obj;
		YCFSecSecFormBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecFormId );
		YCFSecSecFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecFormObj realised = (IYCFSecSecFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecAppIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecFormObj> pageSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageSecFormBySecAppIdx";
		YCFSecSecFormBySecAppIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		List<IYCFSecSecFormObj> retList = new LinkedList<IYCFSecSecFormObj>();
		IYCFSecSecFormObj obj;
		YCFSecSecFormBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().pageBuffBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
			priorClusterId,
			priorSecFormId );
		YCFSecSecFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecFormObj realised = (IYCFSecSecFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecFormObj updateSecForm( IYCFSecSecFormObj Obj ) {
		IYCFSecSecFormObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().updateSecForm( schema.getAuthorization(),
			Obj.getSecFormBuff() );
		obj = (IYCFSecSecFormObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecForm( IYCFSecSecFormObj Obj ) {
		IYCFSecSecFormObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().deleteSecForm( schema.getAuthorization(),
			obj.getSecFormBuff() );
		Obj.forget();
	}

	public void deleteSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		YCFSecSecFormPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		IYCFSecSecFormObj obj = readSecForm( pkey );
		if( obj != null ) {
			IYCFSecSecFormEditObj editObj = (IYCFSecSecFormEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecFormEditObj)obj.beginEdit();
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
		deepDisposeSecFormByIdIdx( ClusterId,
				SecFormId );
	}

	public void deleteSecFormByClusterIdx( long ClusterId )
	{
		YCFSecSecFormByClusterIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecFormByClusterIdxKey,
				Map< YCFSecSecFormPKey, IYCFSecSecFormObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecSecFormPKey, IYCFSecSecFormObj> dict = indexByClusterIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecSecFormObj> iter = dict.values().iterator();
			IYCFSecSecFormObj obj;
			List<IYCFSecSecFormObj> toForget = new LinkedList<IYCFSecSecFormObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecFormByClusterIdx( ClusterId );
	}

	public void deleteSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		YCFSecSecFormBySecAppIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		if( indexBySecAppIdx == null ) {
			indexBySecAppIdx = new HashMap< YCFSecSecFormBySecAppIdxKey,
				Map< YCFSecSecFormPKey, IYCFSecSecFormObj > >();
		}
		if( indexBySecAppIdx.containsKey( key ) ) {
			Map<YCFSecSecFormPKey, IYCFSecSecFormObj> dict = indexBySecAppIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			Iterator<IYCFSecSecFormObj> iter = dict.values().iterator();
			IYCFSecSecFormObj obj;
			List<IYCFSecSecFormObj> toForget = new LinkedList<IYCFSecSecFormObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecAppIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
		}
		deepDisposeSecFormBySecAppIdx( ClusterId,
				SecAppId );
	}

	public void deleteSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		if( indexByUJEEServletIdx == null ) {
			indexByUJEEServletIdx = new HashMap< YCFSecSecFormByUJEEServletIdxKey,
				IYCFSecSecFormObj >();
		}
		YCFSecSecFormByUJEEServletIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		IYCFSecSecFormObj obj = null;
		if( indexByUJEEServletIdx.containsKey( key ) ) {
			obj = indexByUJEEServletIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
		}
		deepDisposeSecFormByUJEEServletIdx( ClusterId,
				SecAppId,
				JEEServletMapName );
	}
}

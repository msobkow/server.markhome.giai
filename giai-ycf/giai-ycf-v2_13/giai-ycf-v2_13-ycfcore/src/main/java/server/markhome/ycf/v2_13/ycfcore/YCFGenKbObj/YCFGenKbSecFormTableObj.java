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

public class YCFGenKbSecFormTableObj
	implements IYCFGenKbSecFormTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> members;
	private Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> allSecForm;
	private Map< YCFGenKbSecFormByClusterIdxKey,
		Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > > indexByClusterIdx;
	private Map< YCFGenKbSecFormBySecAppIdxKey,
		Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > > indexBySecAppIdx;
	private Map< YCFGenKbSecFormByUJEEServletIdxKey,
		IYCFGenKbSecFormObj > indexByUJEEServletIdx;
	public static String TABLE_NAME = "SecForm";
	public static String TABLE_DBNAME = "seycform";

	public YCFGenKbSecFormTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj>();
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
	}

	public YCFGenKbSecFormTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj>();
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
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
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
		List<IYCFGenKbSecFormObj> toForget = new LinkedList<IYCFGenKbSecFormObj>();
		IYCFGenKbSecFormObj cur = null;
		Iterator<IYCFGenKbSecFormObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecFormObj.
	 */
	public IYCFGenKbSecFormObj newInstance() {
		IYCFGenKbSecFormObj inst = new YCFGenKbSecFormObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecFormObj.
	 */
	public IYCFGenKbSecFormEditObj newEditInstance( IYCFGenKbSecFormObj orig ) {
		IYCFGenKbSecFormEditObj edit = new YCFGenKbSecFormEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecFormObj realiseSecForm( IYCFGenKbSecFormObj Obj ) {
		IYCFGenKbSecFormObj obj = Obj;
		YCFGenKbSecFormPKey pkey = obj.getPKey();
		IYCFGenKbSecFormObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecFormObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbSecFormByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexBySecAppIdx != null ) {
				YCFGenKbSecFormBySecAppIdxKey keySecAppIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.remove( keepObj.getPKey() );
					if( mapSecAppIdx.size() <= 0 ) {
						indexBySecAppIdx.remove( keySecAppIdx );
					}
				}
			}

			if( indexByUJEEServletIdx != null ) {
				YCFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.remove( keyUJEEServletIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbSecFormByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecAppIdx != null ) {
				YCFGenKbSecFormBySecAppIdxKey keySecAppIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEServletIdx != null ) {
				YCFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
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
				YCFGenKbSecFormByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecAppIdx != null ) {
				YCFGenKbSecFormBySecAppIdxKey keySecAppIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEServletIdx != null ) {
				YCFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.put( keyUJEEServletIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecFormObj createSecForm( IYCFGenKbSecFormObj Obj ) {
		IYCFGenKbSecFormObj obj = Obj;
		YCFGenKbSecFormBuff buff = obj.getSecFormBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().createSecForm(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecFormObj readSecForm( YCFGenKbSecFormPKey pkey ) {
		return( readSecForm( pkey, false ) );
	}

	public IYCFGenKbSecFormObj readSecForm( YCFGenKbSecFormPKey pkey, boolean forceRead ) {
		IYCFGenKbSecFormObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecFormBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecFormId() );
			if( readBuff != null ) {
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecFormObj readCachedSecForm( YCFGenKbSecFormPKey pkey ) {
		IYCFGenKbSecFormObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecForm( IYCFGenKbSecFormObj obj )
	{
		final String S_ProcName = "YCFGenKbSecFormTableObj.reallyDeepDisposeSecForm() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecFormPKey pkey = obj.getPKey();
		IYCFGenKbSecFormObj existing = readCachedSecForm( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecFormByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecFormBySecAppIdxKey keySecAppIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		keySecAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keySecAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
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
	public void deepDisposeSecForm( YCFGenKbSecFormPKey pkey ) {
		IYCFGenKbSecFormObj obj = readCachedSecForm( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecFormObj lockSecForm( YCFGenKbSecFormPKey pkey ) {
		IYCFGenKbSecFormObj locked = null;
		YCFGenKbSecFormBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecFormTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecFormObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecForm", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecFormObj> readAllSecForm() {
		return( readAllSecForm( false ) );
	}

	public List<IYCFGenKbSecFormObj> readAllSecForm( boolean forceRead ) {
		final String S_ProcName = "readAllSecForm";
		if( ( allSecForm == null ) || forceRead ) {
			Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> map = new HashMap<YCFGenKbSecFormPKey,IYCFGenKbSecFormObj>();
			allSecForm = map;
			YCFGenKbSecFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecFormBuff buff;
			IYCFGenKbSecFormObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecFormObj realised = (IYCFGenKbSecFormObj)obj.realise();
			}
		}
		int len = allSecForm.size();
		IYCFGenKbSecFormObj arr[] = new IYCFGenKbSecFormObj[len];
		Iterator<IYCFGenKbSecFormObj> valIter = allSecForm.values().iterator();
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
		ArrayList<IYCFGenKbSecFormObj> arrayList = new ArrayList<IYCFGenKbSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecFormObj> cmp = new Comparator<IYCFGenKbSecFormObj>() {
			public int compare( IYCFGenKbSecFormObj lhs, IYCFGenKbSecFormObj rhs ) {
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
					YCFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecFormObj> readCachedAllSecForm() {
		final String S_ProcName = "readCachedAllSecForm";
		ArrayList<IYCFGenKbSecFormObj> arrayList = new ArrayList<IYCFGenKbSecFormObj>();
		if( allSecForm != null ) {
			int len = allSecForm.size();
			IYCFGenKbSecFormObj arr[] = new IYCFGenKbSecFormObj[len];
			Iterator<IYCFGenKbSecFormObj> valIter = allSecForm.values().iterator();
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
		Comparator<IYCFGenKbSecFormObj> cmp = new Comparator<IYCFGenKbSecFormObj>() {
			public int compare( IYCFGenKbSecFormObj lhs, IYCFGenKbSecFormObj rhs ) {
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
					YCFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecFormPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecFormObj> pageAllSecForm(Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageAllSecForm";
		Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> map = new HashMap<YCFGenKbSecFormPKey,IYCFGenKbSecFormObj>();
		YCFGenKbSecFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecFormId );
		YCFGenKbSecFormBuff buff;
		IYCFGenKbSecFormObj obj;
		IYCFGenKbSecFormObj realised;
		ArrayList<IYCFGenKbSecFormObj> arrayList = new ArrayList<IYCFGenKbSecFormObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecFormObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		return( readSecFormByIdIdx( ClusterId,
			SecFormId,
			false ) );
	}

	public IYCFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId, boolean forceRead )
	{
		YCFGenKbSecFormPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		IYCFGenKbSecFormObj obj = readSecForm( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId )
	{
		return( readSecFormByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecFormByClusterIdx";
		YCFGenKbSecFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecFormByClusterIdxKey,
				Map< YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj>();
			IYCFGenKbSecFormObj obj;
			YCFGenKbSecFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbSecFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecFormObj realised = (IYCFGenKbSecFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecFormObj arr[] = new IYCFGenKbSecFormObj[len];
		Iterator<IYCFGenKbSecFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecFormObj> arrayList = new ArrayList<IYCFGenKbSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecFormObj> cmp = new Comparator<IYCFGenKbSecFormObj>() {
			public int compare( IYCFGenKbSecFormObj lhs, IYCFGenKbSecFormObj rhs ) {
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
					YCFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		return( readSecFormBySecAppIdx( ClusterId,
			SecAppId,
			false ) );
	}

	public List<IYCFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecFormBySecAppIdx";
		YCFGenKbSecFormBySecAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> dict;
		if( indexBySecAppIdx == null ) {
			indexBySecAppIdx = new HashMap< YCFGenKbSecFormBySecAppIdxKey,
				Map< YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > >();
		}
		if( ( ! forceRead ) && indexBySecAppIdx.containsKey( key ) ) {
			dict = indexBySecAppIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj>();
			IYCFGenKbSecFormObj obj;
			YCFGenKbSecFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			YCFGenKbSecFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecFormObj realised = (IYCFGenKbSecFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecAppIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecFormObj arr[] = new IYCFGenKbSecFormObj[len];
		Iterator<IYCFGenKbSecFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecFormObj> arrayList = new ArrayList<IYCFGenKbSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecFormObj> cmp = new Comparator<IYCFGenKbSecFormObj>() {
			public int compare( IYCFGenKbSecFormObj lhs, IYCFGenKbSecFormObj rhs ) {
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
					YCFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecFormObj readSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		return( readSecFormByUJEEServletIdx( ClusterId,
			SecAppId,
			JEEServletMapName,
			false ) );
	}

	public IYCFGenKbSecFormObj readSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName, boolean forceRead )
	{
		if( indexByUJEEServletIdx == null ) {
			indexByUJEEServletIdx = new HashMap< YCFGenKbSecFormByUJEEServletIdxKey,
				IYCFGenKbSecFormObj >();
		}
		YCFGenKbSecFormByUJEEServletIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		IYCFGenKbSecFormObj obj = null;
		if( ( ! forceRead ) && indexByUJEEServletIdx.containsKey( key ) ) {
			obj = indexByUJEEServletIdx.get( key );
		}
		else {
			YCFGenKbSecFormBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
			if( buff != null ) {
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecFormObj readCachedSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		IYCFGenKbSecFormObj obj = null;
		YCFGenKbSecFormPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		obj = readCachedSecForm( pkey );
		return( obj );
	}

	public List<IYCFGenKbSecFormObj> readCachedSecFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecFormByClusterIdx";
		YCFGenKbSecFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbSecFormObj> arrayList = new ArrayList<IYCFGenKbSecFormObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecFormObj arr[] = new IYCFGenKbSecFormObj[len];
				Iterator<IYCFGenKbSecFormObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecFormObj obj;
			Iterator<IYCFGenKbSecFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecFormObj> cmp = new Comparator<IYCFGenKbSecFormObj>() {
			public int compare( IYCFGenKbSecFormObj lhs, IYCFGenKbSecFormObj rhs ) {
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
					YCFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecFormObj> readCachedSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "readCachedSecFormBySecAppIdx";
		YCFGenKbSecFormBySecAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		ArrayList<IYCFGenKbSecFormObj> arrayList = new ArrayList<IYCFGenKbSecFormObj>();
		if( indexBySecAppIdx != null ) {
			Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> dict;
			if( indexBySecAppIdx.containsKey( key ) ) {
				dict = indexBySecAppIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecFormObj arr[] = new IYCFGenKbSecFormObj[len];
				Iterator<IYCFGenKbSecFormObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecFormObj obj;
			Iterator<IYCFGenKbSecFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecFormObj> cmp = new Comparator<IYCFGenKbSecFormObj>() {
			public int compare( IYCFGenKbSecFormObj lhs, IYCFGenKbSecFormObj rhs ) {
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
					YCFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecFormObj readCachedSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		IYCFGenKbSecFormObj obj = null;
		YCFGenKbSecFormByUJEEServletIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		if( indexByUJEEServletIdx != null ) {
			if( indexByUJEEServletIdx.containsKey( key ) ) {
				obj = indexByUJEEServletIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecFormObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecFormObj> valIter = members.values().iterator();
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
		IYCFGenKbSecFormObj obj = readCachedSecFormByIdIdx( ClusterId,
				SecFormId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecFormByClusterIdx";
		IYCFGenKbSecFormObj obj;
		List<IYCFGenKbSecFormObj> arrayList = readCachedSecFormByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecFormObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecFormObj obj;
		List<IYCFGenKbSecFormObj> arrayList = readCachedSecFormBySecAppIdx( ClusterId,
				SecAppId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecFormObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecFormObj obj = readCachedSecFormByUJEEServletIdx( ClusterId,
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
	public List<IYCFGenKbSecFormObj> pageSecFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageSecFormByClusterIdx";
		YCFGenKbSecFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFGenKbSecFormObj> retList = new LinkedList<IYCFGenKbSecFormObj>();
		IYCFGenKbSecFormObj obj;
		YCFGenKbSecFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecFormId );
		YCFGenKbSecFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecFormObj realised = (IYCFGenKbSecFormObj)obj.realise();
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
	public List<IYCFGenKbSecFormObj> pageSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageSecFormBySecAppIdx";
		YCFGenKbSecFormBySecAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		List<IYCFGenKbSecFormObj> retList = new LinkedList<IYCFGenKbSecFormObj>();
		IYCFGenKbSecFormObj obj;
		YCFGenKbSecFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().pageBuffBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
			priorClusterId,
			priorSecFormId );
		YCFGenKbSecFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecFormObj realised = (IYCFGenKbSecFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecFormObj updateSecForm( IYCFGenKbSecFormObj Obj ) {
		IYCFGenKbSecFormObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().updateSecForm( schema.getAuthorization(),
			Obj.getSecFormBuff() );
		obj = (IYCFGenKbSecFormObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecForm( IYCFGenKbSecFormObj Obj ) {
		IYCFGenKbSecFormObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecForm( schema.getAuthorization(),
			obj.getSecFormBuff() );
		Obj.forget();
	}

	public void deleteSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		YCFGenKbSecFormPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		IYCFGenKbSecFormObj obj = readSecForm( pkey );
		if( obj != null ) {
			IYCFGenKbSecFormEditObj editObj = (IYCFGenKbSecFormEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecFormEditObj)obj.beginEdit();
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
		YCFGenKbSecFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecFormByClusterIdxKey,
				Map< YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbSecFormObj> iter = dict.values().iterator();
			IYCFGenKbSecFormObj obj;
			List<IYCFGenKbSecFormObj> toForget = new LinkedList<IYCFGenKbSecFormObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecFormByClusterIdx( ClusterId );
	}

	public void deleteSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		YCFGenKbSecFormBySecAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		if( indexBySecAppIdx == null ) {
			indexBySecAppIdx = new HashMap< YCFGenKbSecFormBySecAppIdxKey,
				Map< YCFGenKbSecFormPKey, IYCFGenKbSecFormObj > >();
		}
		if( indexBySecAppIdx.containsKey( key ) ) {
			Map<YCFGenKbSecFormPKey, IYCFGenKbSecFormObj> dict = indexBySecAppIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			Iterator<IYCFGenKbSecFormObj> iter = dict.values().iterator();
			IYCFGenKbSecFormObj obj;
			List<IYCFGenKbSecFormObj> toForget = new LinkedList<IYCFGenKbSecFormObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormBySecAppIdx( schema.getAuthorization(),
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
			indexByUJEEServletIdx = new HashMap< YCFGenKbSecFormByUJEEServletIdxKey,
				IYCFGenKbSecFormObj >();
		}
		YCFGenKbSecFormByUJEEServletIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		IYCFGenKbSecFormObj obj = null;
		if( indexByUJEEServletIdx.containsKey( key ) ) {
			obj = indexByUJEEServletIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
		}
		deepDisposeSecFormByUJEEServletIdx( ClusterId,
				SecAppId,
				JEEServletMapName );
	}
}

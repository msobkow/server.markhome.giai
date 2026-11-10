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

public class YCFGenKbDefClassTableObj
	implements IYCFGenKbDefClassTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj> members;
	private Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj> allDefClass;
	private Map< YCFGenKbDefClassByNameIdxKey,
		IYCFGenKbDefClassObj > indexByNameIdx;
	private Map< YCFGenKbDefClassByBaseIdxKey,
		Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj > > indexByBaseIdx;
	public static String TABLE_NAME = "DefClass";
	public static String TABLE_DBNAME = "kbdefclass";

	public YCFGenKbDefClassTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj>();
		allDefClass = null;
		indexByNameIdx = null;
		indexByBaseIdx = null;
	}

	public YCFGenKbDefClassTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj>();
		allDefClass = null;
		indexByNameIdx = null;
		indexByBaseIdx = null;
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
		allDefClass = null;
		indexByNameIdx = null;
		indexByBaseIdx = null;
		List<IYCFGenKbDefClassObj> toForget = new LinkedList<IYCFGenKbDefClassObj>();
		IYCFGenKbDefClassObj cur = null;
		Iterator<IYCFGenKbDefClassObj> iter = members.values().iterator();
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
	 *	YCFGenKbDefClassObj.
	 */
	public IYCFGenKbDefClassObj newInstance() {
		IYCFGenKbDefClassObj inst = new YCFGenKbDefClassObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbDefClassObj.
	 */
	public IYCFGenKbDefClassEditObj newEditInstance( IYCFGenKbDefClassObj orig ) {
		IYCFGenKbDefClassEditObj edit = new YCFGenKbDefClassEditObj( orig );
		return( edit );
	}

	public IYCFGenKbDefClassObj realiseDefClass( IYCFGenKbDefClassObj Obj ) {
		IYCFGenKbDefClassObj obj = Obj;
		YCFGenKbDefClassPKey pkey = obj.getPKey();
		IYCFGenKbDefClassObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbDefClassObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				YCFGenKbDefClassByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByBaseIdx != null ) {
				YCFGenKbDefClassByBaseIdxKey keyBaseIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
				keyBaseIdx.setOptionalBaseId( keepObj.getOptionalBaseId() );
				Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj > mapBaseIdx = indexByBaseIdx.get( keyBaseIdx );
				if( mapBaseIdx != null ) {
					mapBaseIdx.remove( keepObj.getPKey() );
					if( mapBaseIdx.size() <= 0 ) {
						indexByBaseIdx.remove( keyBaseIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				YCFGenKbDefClassByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByBaseIdx != null ) {
				YCFGenKbDefClassByBaseIdxKey keyBaseIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
				keyBaseIdx.setOptionalBaseId( keepObj.getOptionalBaseId() );
				Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj > mapBaseIdx = indexByBaseIdx.get( keyBaseIdx );
				if( mapBaseIdx != null ) {
					mapBaseIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allDefClass != null ) {
				allDefClass.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDefClass != null ) {
				allDefClass.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFGenKbDefClassByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByBaseIdx != null ) {
				YCFGenKbDefClassByBaseIdxKey keyBaseIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
				keyBaseIdx.setOptionalBaseId( keepObj.getOptionalBaseId() );
				Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj > mapBaseIdx = indexByBaseIdx.get( keyBaseIdx );
				if( mapBaseIdx != null ) {
					mapBaseIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbDefClassObj createDefClass( IYCFGenKbDefClassObj Obj ) {
		IYCFGenKbDefClassObj obj = Obj;
		YCFGenKbDefClassBuff buff = obj.getDefClassBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().createDefClass(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbDefClassObj readDefClass( YCFGenKbDefClassPKey pkey ) {
		return( readDefClass( pkey, false ) );
	}

	public IYCFGenKbDefClassObj readDefClass( YCFGenKbDefClassPKey pkey, boolean forceRead ) {
		IYCFGenKbDefClassObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbDefClassBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getDefClassTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbDefClassObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbDefClassObj readCachedDefClass( YCFGenKbDefClassPKey pkey ) {
		IYCFGenKbDefClassObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDefClass( IYCFGenKbDefClassObj obj )
	{
		final String S_ProcName = "YCFGenKbDefClassTableObj.reallyDeepDisposeDefClass() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbDefClassPKey pkey = obj.getPKey();
		IYCFGenKbDefClassObj existing = readCachedDefClass( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbDefClassByNameIdxKey keyNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbDefClassByBaseIdxKey keyBaseIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
		keyBaseIdx.setOptionalBaseId( existing.getOptionalBaseId() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}

		if( indexByBaseIdx != null ) {
			if( indexByBaseIdx.containsKey( keyBaseIdx ) ) {
				indexByBaseIdx.get( keyBaseIdx ).remove( pkey );
				if( indexByBaseIdx.get( keyBaseIdx ).size() <= 0 ) {
					indexByBaseIdx.remove( keyBaseIdx );
				}
			}
		}


	}
	public void deepDisposeDefClass( YCFGenKbDefClassPKey pkey ) {
		IYCFGenKbDefClassObj obj = readCachedDefClass( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbDefClassObj lockDefClass( YCFGenKbDefClassPKey pkey ) {
		IYCFGenKbDefClassObj locked = null;
		YCFGenKbDefClassBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getDefClassTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbDefClassObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockDefClass", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbDefClassObj> readAllDefClass() {
		return( readAllDefClass( false ) );
	}

	public List<IYCFGenKbDefClassObj> readAllDefClass( boolean forceRead ) {
		final String S_ProcName = "readAllDefClass";
		if( ( allDefClass == null ) || forceRead ) {
			Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj> map = new HashMap<YCFGenKbDefClassPKey,IYCFGenKbDefClassObj>();
			allDefClass = map;
			YCFGenKbDefClassBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().readAllDerived( schema.getAuthorization() );
			YCFGenKbDefClassBuff buff;
			IYCFGenKbDefClassObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbDefClassObj realised = (IYCFGenKbDefClassObj)obj.realise();
			}
		}
		int len = allDefClass.size();
		IYCFGenKbDefClassObj arr[] = new IYCFGenKbDefClassObj[len];
		Iterator<IYCFGenKbDefClassObj> valIter = allDefClass.values().iterator();
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
		ArrayList<IYCFGenKbDefClassObj> arrayList = new ArrayList<IYCFGenKbDefClassObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbDefClassObj> cmp = new Comparator<IYCFGenKbDefClassObj>() {
			public int compare( IYCFGenKbDefClassObj lhs, IYCFGenKbDefClassObj rhs ) {
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
					YCFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					YCFGenKbDefClassPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbDefClassObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbDefClassObj> readCachedAllDefClass() {
		final String S_ProcName = "readCachedAllDefClass";
		ArrayList<IYCFGenKbDefClassObj> arrayList = new ArrayList<IYCFGenKbDefClassObj>();
		if( allDefClass != null ) {
			int len = allDefClass.size();
			IYCFGenKbDefClassObj arr[] = new IYCFGenKbDefClassObj[len];
			Iterator<IYCFGenKbDefClassObj> valIter = allDefClass.values().iterator();
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
		Comparator<IYCFGenKbDefClassObj> cmp = new Comparator<IYCFGenKbDefClassObj>() {
			public int compare( IYCFGenKbDefClassObj lhs, IYCFGenKbDefClassObj rhs ) {
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
					YCFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					YCFGenKbDefClassPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbDefClassObj readDefClassByIdIdx( short Id )
	{
		return( readDefClassByIdIdx( Id,
			false ) );
	}

	public IYCFGenKbDefClassObj readDefClassByIdIdx( short Id, boolean forceRead )
	{
		YCFGenKbDefClassPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbDefClassObj obj = readDefClass( pkey, forceRead );
		return( obj );
	}

	public IYCFGenKbDefClassObj readDefClassByNameIdx( String Name )
	{
		return( readDefClassByNameIdx( Name,
			false ) );
	}

	public IYCFGenKbDefClassObj readDefClassByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbDefClassByNameIdxKey,
				IYCFGenKbDefClassObj >();
		}
		YCFGenKbDefClassByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbDefClassObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFGenKbDefClassBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getDefClassTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbDefClassObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId )
	{
		return( readDefClassByBaseIdx( BaseId,
			false ) );
	}

	public List<IYCFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId,
		boolean forceRead )
	{
		final String S_ProcName = "readDefClassByBaseIdx";
		YCFGenKbDefClassByBaseIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( BaseId );
		Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj> dict;
		if( indexByBaseIdx == null ) {
			indexByBaseIdx = new HashMap< YCFGenKbDefClassByBaseIdxKey,
				Map< YCFGenKbDefClassPKey, IYCFGenKbDefClassObj > >();
		}
		if( ( ! forceRead ) && indexByBaseIdx.containsKey( key ) ) {
			dict = indexByBaseIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj>();
			IYCFGenKbDefClassObj obj;
			YCFGenKbDefClassBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().readDerivedByBaseIdx( schema.getAuthorization(),
				BaseId );
			YCFGenKbDefClassBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getDefClassTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbDefClassObj realised = (IYCFGenKbDefClassObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBaseIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbDefClassObj arr[] = new IYCFGenKbDefClassObj[len];
		Iterator<IYCFGenKbDefClassObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbDefClassObj> arrayList = new ArrayList<IYCFGenKbDefClassObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbDefClassObj> cmp = new Comparator<IYCFGenKbDefClassObj>() {
			public int compare( IYCFGenKbDefClassObj lhs, IYCFGenKbDefClassObj rhs ) {
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
					YCFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					YCFGenKbDefClassPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbDefClassObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbDefClassObj readCachedDefClassByIdIdx( short Id )
	{
		IYCFGenKbDefClassObj obj = null;
		YCFGenKbDefClassPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedDefClass( pkey );
		return( obj );
	}

	public IYCFGenKbDefClassObj readCachedDefClassByNameIdx( String Name )
	{
		IYCFGenKbDefClassObj obj = null;
		YCFGenKbDefClassByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbDefClassObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbDefClassObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbDefClassObj> readCachedDefClassByBaseIdx( Short BaseId )
	{
		final String S_ProcName = "readCachedDefClassByBaseIdx";
		YCFGenKbDefClassByBaseIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( BaseId );
		ArrayList<IYCFGenKbDefClassObj> arrayList = new ArrayList<IYCFGenKbDefClassObj>();
		if( indexByBaseIdx != null ) {
			Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj> dict;
			if( indexByBaseIdx.containsKey( key ) ) {
				dict = indexByBaseIdx.get( key );
				int len = dict.size();
				IYCFGenKbDefClassObj arr[] = new IYCFGenKbDefClassObj[len];
				Iterator<IYCFGenKbDefClassObj> valIter = dict.values().iterator();
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
			IYCFGenKbDefClassObj obj;
			Iterator<IYCFGenKbDefClassObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbDefClassObj> cmp = new Comparator<IYCFGenKbDefClassObj>() {
			public int compare( IYCFGenKbDefClassObj lhs, IYCFGenKbDefClassObj rhs ) {
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
					YCFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					YCFGenKbDefClassPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeDefClassByIdIdx( short Id )
	{
		IYCFGenKbDefClassObj obj = readCachedDefClassByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDefClassByNameIdx( String Name )
	{
		IYCFGenKbDefClassObj obj = readCachedDefClassByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDefClassByBaseIdx( Short BaseId )
	{
		final String S_ProcName = "deepDisposeDefClassByBaseIdx";
		IYCFGenKbDefClassObj obj;
		List<IYCFGenKbDefClassObj> arrayList = readCachedDefClassByBaseIdx( BaseId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbDefClassObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbDefClassObj updateDefClass( IYCFGenKbDefClassObj Obj ) {
		IYCFGenKbDefClassObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().updateDefClass( schema.getAuthorization(),
			Obj.getDefClassBuff() );
		obj = (IYCFGenKbDefClassObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteDefClass( IYCFGenKbDefClassObj Obj ) {
		IYCFGenKbDefClassObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClass( schema.getAuthorization(),
			obj.getDefClassBuff() );
		Obj.forget();
	}

	public void deleteDefClassByIdIdx( short Id )
	{
		YCFGenKbDefClassPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbDefClassObj obj = readDefClass( pkey );
		if( obj != null ) {
			IYCFGenKbDefClassEditObj editObj = (IYCFGenKbDefClassEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbDefClassEditObj)obj.beginEdit();
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
		deepDisposeDefClassByIdIdx( Id );
	}

	public void deleteDefClassByNameIdx( String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbDefClassByNameIdxKey,
				IYCFGenKbDefClassObj >();
		}
		YCFGenKbDefClassByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbDefClassObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeDefClassByNameIdx( Name );
	}

	public void deleteDefClassByBaseIdx( Short BaseId )
	{
		YCFGenKbDefClassByBaseIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( BaseId );
		if( indexByBaseIdx == null ) {
			indexByBaseIdx = new HashMap< YCFGenKbDefClassByBaseIdxKey,
				Map< YCFGenKbDefClassPKey, IYCFGenKbDefClassObj > >();
		}
		if( indexByBaseIdx.containsKey( key ) ) {
			Map<YCFGenKbDefClassPKey, IYCFGenKbDefClassObj> dict = indexByBaseIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByBaseIdx( schema.getAuthorization(),
				BaseId );
			Iterator<IYCFGenKbDefClassObj> iter = dict.values().iterator();
			IYCFGenKbDefClassObj obj;
			List<IYCFGenKbDefClassObj> toForget = new LinkedList<IYCFGenKbDefClassObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByBaseIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByBaseIdx( schema.getAuthorization(),
				BaseId );
		}
		deepDisposeDefClassByBaseIdx( BaseId );
	}
}

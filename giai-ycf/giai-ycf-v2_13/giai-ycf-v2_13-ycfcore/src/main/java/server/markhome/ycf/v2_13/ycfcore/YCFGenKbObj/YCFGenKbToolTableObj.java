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

public class YCFGenKbToolTableObj
	implements IYCFGenKbToolTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbToolPKey, IYCFGenKbToolObj> members;
	private Map<YCFGenKbToolPKey, IYCFGenKbToolObj> allTool;
	private Map< YCFGenKbToolByNameIdxKey,
		IYCFGenKbToolObj > indexByNameIdx;
	private Map< YCFGenKbToolByReplacesIdxKey,
		Map<YCFGenKbToolPKey, IYCFGenKbToolObj > > indexByReplacesIdx;
	public static String TABLE_NAME = "Tool";
	public static String TABLE_DBNAME = "kbtool";

	public YCFGenKbToolTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbToolPKey, IYCFGenKbToolObj>();
		allTool = null;
		indexByNameIdx = null;
		indexByReplacesIdx = null;
	}

	public YCFGenKbToolTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbToolPKey, IYCFGenKbToolObj>();
		allTool = null;
		indexByNameIdx = null;
		indexByReplacesIdx = null;
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
		allTool = null;
		indexByNameIdx = null;
		indexByReplacesIdx = null;
		List<IYCFGenKbToolObj> toForget = new LinkedList<IYCFGenKbToolObj>();
		IYCFGenKbToolObj cur = null;
		Iterator<IYCFGenKbToolObj> iter = members.values().iterator();
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
	 *	YCFGenKbToolObj.
	 */
	public IYCFGenKbToolObj newInstance() {
		IYCFGenKbToolObj inst = new YCFGenKbToolObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbToolObj.
	 */
	public IYCFGenKbToolEditObj newEditInstance( IYCFGenKbToolObj orig ) {
		IYCFGenKbToolEditObj edit = new YCFGenKbToolEditObj( orig );
		return( edit );
	}

	public IYCFGenKbToolObj realiseTool( IYCFGenKbToolObj Obj ) {
		IYCFGenKbToolObj obj = Obj;
		YCFGenKbToolPKey pkey = obj.getPKey();
		IYCFGenKbToolObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbToolObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				YCFGenKbToolByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByReplacesIdx != null ) {
				YCFGenKbToolByReplacesIdxKey keyReplacesIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
				keyReplacesIdx.setOptionalReplacesId( keepObj.getOptionalReplacesId() );
				Map<YCFGenKbToolPKey, IYCFGenKbToolObj > mapReplacesIdx = indexByReplacesIdx.get( keyReplacesIdx );
				if( mapReplacesIdx != null ) {
					mapReplacesIdx.remove( keepObj.getPKey() );
					if( mapReplacesIdx.size() <= 0 ) {
						indexByReplacesIdx.remove( keyReplacesIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				YCFGenKbToolByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByReplacesIdx != null ) {
				YCFGenKbToolByReplacesIdxKey keyReplacesIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
				keyReplacesIdx.setOptionalReplacesId( keepObj.getOptionalReplacesId() );
				Map<YCFGenKbToolPKey, IYCFGenKbToolObj > mapReplacesIdx = indexByReplacesIdx.get( keyReplacesIdx );
				if( mapReplacesIdx != null ) {
					mapReplacesIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allTool != null ) {
				allTool.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTool != null ) {
				allTool.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFGenKbToolByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByReplacesIdx != null ) {
				YCFGenKbToolByReplacesIdxKey keyReplacesIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
				keyReplacesIdx.setOptionalReplacesId( keepObj.getOptionalReplacesId() );
				Map<YCFGenKbToolPKey, IYCFGenKbToolObj > mapReplacesIdx = indexByReplacesIdx.get( keyReplacesIdx );
				if( mapReplacesIdx != null ) {
					mapReplacesIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbToolObj createTool( IYCFGenKbToolObj Obj ) {
		IYCFGenKbToolObj obj = Obj;
		YCFGenKbToolBuff buff = obj.getToolBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().createTool(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbToolObj readTool( YCFGenKbToolPKey pkey ) {
		return( readTool( pkey, false ) );
	}

	public IYCFGenKbToolObj readTool( YCFGenKbToolPKey pkey, boolean forceRead ) {
		IYCFGenKbToolObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbToolBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getToolTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbToolObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbToolObj readCachedTool( YCFGenKbToolPKey pkey ) {
		IYCFGenKbToolObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTool( IYCFGenKbToolObj obj )
	{
		final String S_ProcName = "YCFGenKbToolTableObj.reallyDeepDisposeTool() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbToolPKey pkey = obj.getPKey();
		IYCFGenKbToolObj existing = readCachedTool( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbToolByNameIdxKey keyNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbToolByReplacesIdxKey keyReplacesIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		keyReplacesIdx.setOptionalReplacesId( existing.getOptionalReplacesId() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}

		if( indexByReplacesIdx != null ) {
			if( indexByReplacesIdx.containsKey( keyReplacesIdx ) ) {
				indexByReplacesIdx.get( keyReplacesIdx ).remove( pkey );
				if( indexByReplacesIdx.get( keyReplacesIdx ).size() <= 0 ) {
					indexByReplacesIdx.remove( keyReplacesIdx );
				}
			}
		}


	}
	public void deepDisposeTool( YCFGenKbToolPKey pkey ) {
		IYCFGenKbToolObj obj = readCachedTool( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbToolObj lockTool( YCFGenKbToolPKey pkey ) {
		IYCFGenKbToolObj locked = null;
		YCFGenKbToolBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getToolTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbToolObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTool", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbToolObj> readAllTool() {
		return( readAllTool( false ) );
	}

	public List<IYCFGenKbToolObj> readAllTool( boolean forceRead ) {
		final String S_ProcName = "readAllTool";
		if( ( allTool == null ) || forceRead ) {
			Map<YCFGenKbToolPKey, IYCFGenKbToolObj> map = new HashMap<YCFGenKbToolPKey,IYCFGenKbToolObj>();
			allTool = map;
			YCFGenKbToolBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().readAllDerived( schema.getAuthorization() );
			YCFGenKbToolBuff buff;
			IYCFGenKbToolObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolObj realised = (IYCFGenKbToolObj)obj.realise();
			}
		}
		int len = allTool.size();
		IYCFGenKbToolObj arr[] = new IYCFGenKbToolObj[len];
		Iterator<IYCFGenKbToolObj> valIter = allTool.values().iterator();
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
		ArrayList<IYCFGenKbToolObj> arrayList = new ArrayList<IYCFGenKbToolObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolObj> cmp = new Comparator<IYCFGenKbToolObj>() {
			public int compare( IYCFGenKbToolObj lhs, IYCFGenKbToolObj rhs ) {
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
					YCFGenKbToolPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbToolObj> readCachedAllTool() {
		final String S_ProcName = "readCachedAllTool";
		ArrayList<IYCFGenKbToolObj> arrayList = new ArrayList<IYCFGenKbToolObj>();
		if( allTool != null ) {
			int len = allTool.size();
			IYCFGenKbToolObj arr[] = new IYCFGenKbToolObj[len];
			Iterator<IYCFGenKbToolObj> valIter = allTool.values().iterator();
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
		Comparator<IYCFGenKbToolObj> cmp = new Comparator<IYCFGenKbToolObj>() {
			public int compare( IYCFGenKbToolObj lhs, IYCFGenKbToolObj rhs ) {
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
					YCFGenKbToolPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbToolObj readToolByIdIdx( short Id )
	{
		return( readToolByIdIdx( Id,
			false ) );
	}

	public IYCFGenKbToolObj readToolByIdIdx( short Id, boolean forceRead )
	{
		YCFGenKbToolPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbToolObj obj = readTool( pkey, forceRead );
		return( obj );
	}

	public IYCFGenKbToolObj readToolByNameIdx( String Name )
	{
		return( readToolByNameIdx( Name,
			false ) );
	}

	public IYCFGenKbToolObj readToolByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbToolByNameIdxKey,
				IYCFGenKbToolObj >();
		}
		YCFGenKbToolByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbToolObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFGenKbToolBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getToolTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbToolObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId )
	{
		return( readToolByReplacesIdx( ReplacesId,
			false ) );
	}

	public List<IYCFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId,
		boolean forceRead )
	{
		final String S_ProcName = "readToolByReplacesIdx";
		YCFGenKbToolByReplacesIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( ReplacesId );
		Map<YCFGenKbToolPKey, IYCFGenKbToolObj> dict;
		if( indexByReplacesIdx == null ) {
			indexByReplacesIdx = new HashMap< YCFGenKbToolByReplacesIdxKey,
				Map< YCFGenKbToolPKey, IYCFGenKbToolObj > >();
		}
		if( ( ! forceRead ) && indexByReplacesIdx.containsKey( key ) ) {
			dict = indexByReplacesIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbToolPKey, IYCFGenKbToolObj>();
			IYCFGenKbToolObj obj;
			YCFGenKbToolBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().readDerivedByReplacesIdx( schema.getAuthorization(),
				ReplacesId );
			YCFGenKbToolBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbToolObj realised = (IYCFGenKbToolObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByReplacesIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbToolObj arr[] = new IYCFGenKbToolObj[len];
		Iterator<IYCFGenKbToolObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbToolObj> arrayList = new ArrayList<IYCFGenKbToolObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbToolObj> cmp = new Comparator<IYCFGenKbToolObj>() {
			public int compare( IYCFGenKbToolObj lhs, IYCFGenKbToolObj rhs ) {
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
					YCFGenKbToolPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbToolObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbToolObj readCachedToolByIdIdx( short Id )
	{
		IYCFGenKbToolObj obj = null;
		YCFGenKbToolPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedTool( pkey );
		return( obj );
	}

	public IYCFGenKbToolObj readCachedToolByNameIdx( String Name )
	{
		IYCFGenKbToolObj obj = null;
		YCFGenKbToolByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbToolObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbToolObj> valIter = members.values().iterator();
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

	public List<IYCFGenKbToolObj> readCachedToolByReplacesIdx( Short ReplacesId )
	{
		final String S_ProcName = "readCachedToolByReplacesIdx";
		YCFGenKbToolByReplacesIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( ReplacesId );
		ArrayList<IYCFGenKbToolObj> arrayList = new ArrayList<IYCFGenKbToolObj>();
		if( indexByReplacesIdx != null ) {
			Map<YCFGenKbToolPKey, IYCFGenKbToolObj> dict;
			if( indexByReplacesIdx.containsKey( key ) ) {
				dict = indexByReplacesIdx.get( key );
				int len = dict.size();
				IYCFGenKbToolObj arr[] = new IYCFGenKbToolObj[len];
				Iterator<IYCFGenKbToolObj> valIter = dict.values().iterator();
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
			IYCFGenKbToolObj obj;
			Iterator<IYCFGenKbToolObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbToolObj> cmp = new Comparator<IYCFGenKbToolObj>() {
			public int compare( IYCFGenKbToolObj lhs, IYCFGenKbToolObj rhs ) {
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
					YCFGenKbToolPKey lhsPKey = lhs.getPKey();
					YCFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeToolByIdIdx( short Id )
	{
		IYCFGenKbToolObj obj = readCachedToolByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolByNameIdx( String Name )
	{
		IYCFGenKbToolObj obj = readCachedToolByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolByReplacesIdx( Short ReplacesId )
	{
		final String S_ProcName = "deepDisposeToolByReplacesIdx";
		IYCFGenKbToolObj obj;
		List<IYCFGenKbToolObj> arrayList = readCachedToolByReplacesIdx( ReplacesId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbToolObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbToolObj updateTool( IYCFGenKbToolObj Obj ) {
		IYCFGenKbToolObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().updateTool( schema.getAuthorization(),
			Obj.getToolBuff() );
		obj = (IYCFGenKbToolObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTool( IYCFGenKbToolObj Obj ) {
		IYCFGenKbToolObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().deleteTool( schema.getAuthorization(),
			obj.getToolBuff() );
		Obj.forget();
	}

	public void deleteToolByIdIdx( short Id )
	{
		YCFGenKbToolPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbToolObj obj = readTool( pkey );
		if( obj != null ) {
			IYCFGenKbToolEditObj editObj = (IYCFGenKbToolEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbToolEditObj)obj.beginEdit();
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
		deepDisposeToolByIdIdx( Id );
	}

	public void deleteToolByNameIdx( String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbToolByNameIdxKey,
				IYCFGenKbToolObj >();
		}
		YCFGenKbToolByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbToolObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeToolByNameIdx( Name );
	}

	public void deleteToolByReplacesIdx( Short ReplacesId )
	{
		YCFGenKbToolByReplacesIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( ReplacesId );
		if( indexByReplacesIdx == null ) {
			indexByReplacesIdx = new HashMap< YCFGenKbToolByReplacesIdxKey,
				Map< YCFGenKbToolPKey, IYCFGenKbToolObj > >();
		}
		if( indexByReplacesIdx.containsKey( key ) ) {
			Map<YCFGenKbToolPKey, IYCFGenKbToolObj> dict = indexByReplacesIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByReplacesIdx( schema.getAuthorization(),
				ReplacesId );
			Iterator<IYCFGenKbToolObj> iter = dict.values().iterator();
			IYCFGenKbToolObj obj;
			List<IYCFGenKbToolObj> toForget = new LinkedList<IYCFGenKbToolObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByReplacesIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByReplacesIdx( schema.getAuthorization(),
				ReplacesId );
		}
		deepDisposeToolByReplacesIdx( ReplacesId );
	}
}

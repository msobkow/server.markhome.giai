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

public class CFGenKbDefClassTableObj
	implements ICFGenKbDefClassTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj> members;
	private Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj> allDefClass;
	private Map< CFGenKbDefClassByNameIdxKey,
		ICFGenKbDefClassObj > indexByNameIdx;
	private Map< CFGenKbDefClassByBaseIdxKey,
		Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj > > indexByBaseIdx;
	public static String TABLE_NAME = "DefClass";
	public static String TABLE_DBNAME = "kbdefclass";

	public CFGenKbDefClassTableObj() {
		schema = null;
		members = new HashMap<CFGenKbDefClassPKey, ICFGenKbDefClassObj>();
		allDefClass = null;
		indexByNameIdx = null;
		indexByBaseIdx = null;
	}

	public CFGenKbDefClassTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbDefClassPKey, ICFGenKbDefClassObj>();
		allDefClass = null;
		indexByNameIdx = null;
		indexByBaseIdx = null;
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
		allDefClass = null;
		indexByNameIdx = null;
		indexByBaseIdx = null;
		List<ICFGenKbDefClassObj> toForget = new LinkedList<ICFGenKbDefClassObj>();
		ICFGenKbDefClassObj cur = null;
		Iterator<ICFGenKbDefClassObj> iter = members.values().iterator();
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
	 *	CFGenKbDefClassObj.
	 */
	public ICFGenKbDefClassObj newInstance() {
		ICFGenKbDefClassObj inst = new CFGenKbDefClassObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbDefClassObj.
	 */
	public ICFGenKbDefClassEditObj newEditInstance( ICFGenKbDefClassObj orig ) {
		ICFGenKbDefClassEditObj edit = new CFGenKbDefClassEditObj( orig );
		return( edit );
	}

	public ICFGenKbDefClassObj realiseDefClass( ICFGenKbDefClassObj Obj ) {
		ICFGenKbDefClassObj obj = Obj;
		CFGenKbDefClassPKey pkey = obj.getPKey();
		ICFGenKbDefClassObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbDefClassObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				CFGenKbDefClassByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByBaseIdx != null ) {
				CFGenKbDefClassByBaseIdxKey keyBaseIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
				keyBaseIdx.setOptionalBaseId( keepObj.getOptionalBaseId() );
				Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj > mapBaseIdx = indexByBaseIdx.get( keyBaseIdx );
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
				CFGenKbDefClassByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByBaseIdx != null ) {
				CFGenKbDefClassByBaseIdxKey keyBaseIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
				keyBaseIdx.setOptionalBaseId( keepObj.getOptionalBaseId() );
				Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj > mapBaseIdx = indexByBaseIdx.get( keyBaseIdx );
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
				CFGenKbDefClassByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByBaseIdx != null ) {
				CFGenKbDefClassByBaseIdxKey keyBaseIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
				keyBaseIdx.setOptionalBaseId( keepObj.getOptionalBaseId() );
				Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj > mapBaseIdx = indexByBaseIdx.get( keyBaseIdx );
				if( mapBaseIdx != null ) {
					mapBaseIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbDefClassObj createDefClass( ICFGenKbDefClassObj Obj ) {
		ICFGenKbDefClassObj obj = Obj;
		CFGenKbDefClassBuff buff = obj.getDefClassBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().createDefClass(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbDefClassObj readDefClass( CFGenKbDefClassPKey pkey ) {
		return( readDefClass( pkey, false ) );
	}

	public ICFGenKbDefClassObj readDefClass( CFGenKbDefClassPKey pkey, boolean forceRead ) {
		ICFGenKbDefClassObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbDefClassBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getDefClassTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbDefClassObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbDefClassObj readCachedDefClass( CFGenKbDefClassPKey pkey ) {
		ICFGenKbDefClassObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDefClass( ICFGenKbDefClassObj obj )
	{
		final String S_ProcName = "CFGenKbDefClassTableObj.reallyDeepDisposeDefClass() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbDefClassPKey pkey = obj.getPKey();
		ICFGenKbDefClassObj existing = readCachedDefClass( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbDefClassByNameIdxKey keyNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		CFGenKbDefClassByBaseIdxKey keyBaseIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
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
	public void deepDisposeDefClass( CFGenKbDefClassPKey pkey ) {
		ICFGenKbDefClassObj obj = readCachedDefClass( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbDefClassObj lockDefClass( CFGenKbDefClassPKey pkey ) {
		ICFGenKbDefClassObj locked = null;
		CFGenKbDefClassBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getDefClassTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbDefClassObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockDefClass", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbDefClassObj> readAllDefClass() {
		return( readAllDefClass( false ) );
	}

	public List<ICFGenKbDefClassObj> readAllDefClass( boolean forceRead ) {
		final String S_ProcName = "readAllDefClass";
		if( ( allDefClass == null ) || forceRead ) {
			Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj> map = new HashMap<CFGenKbDefClassPKey,ICFGenKbDefClassObj>();
			allDefClass = map;
			CFGenKbDefClassBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().readAllDerived( schema.getAuthorization() );
			CFGenKbDefClassBuff buff;
			ICFGenKbDefClassObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( buff );
				ICFGenKbDefClassObj realised = (ICFGenKbDefClassObj)obj.realise();
			}
		}
		int len = allDefClass.size();
		ICFGenKbDefClassObj arr[] = new ICFGenKbDefClassObj[len];
		Iterator<ICFGenKbDefClassObj> valIter = allDefClass.values().iterator();
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
		ArrayList<ICFGenKbDefClassObj> arrayList = new ArrayList<ICFGenKbDefClassObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbDefClassObj> cmp = new Comparator<ICFGenKbDefClassObj>() {
			public int compare( ICFGenKbDefClassObj lhs, ICFGenKbDefClassObj rhs ) {
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
					CFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					CFGenKbDefClassPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbDefClassObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbDefClassObj> readCachedAllDefClass() {
		final String S_ProcName = "readCachedAllDefClass";
		ArrayList<ICFGenKbDefClassObj> arrayList = new ArrayList<ICFGenKbDefClassObj>();
		if( allDefClass != null ) {
			int len = allDefClass.size();
			ICFGenKbDefClassObj arr[] = new ICFGenKbDefClassObj[len];
			Iterator<ICFGenKbDefClassObj> valIter = allDefClass.values().iterator();
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
		Comparator<ICFGenKbDefClassObj> cmp = new Comparator<ICFGenKbDefClassObj>() {
			public int compare( ICFGenKbDefClassObj lhs, ICFGenKbDefClassObj rhs ) {
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
					CFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					CFGenKbDefClassPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbDefClassObj readDefClassByIdIdx( short Id )
	{
		return( readDefClassByIdIdx( Id,
			false ) );
	}

	public ICFGenKbDefClassObj readDefClassByIdIdx( short Id, boolean forceRead )
	{
		CFGenKbDefClassPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey();
		pkey.setRequiredId( Id );
		ICFGenKbDefClassObj obj = readDefClass( pkey, forceRead );
		return( obj );
	}

	public ICFGenKbDefClassObj readDefClassByNameIdx( String Name )
	{
		return( readDefClassByNameIdx( Name,
			false ) );
	}

	public ICFGenKbDefClassObj readDefClassByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbDefClassByNameIdxKey,
				ICFGenKbDefClassObj >();
		}
		CFGenKbDefClassByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( Name );
		ICFGenKbDefClassObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			CFGenKbDefClassBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getDefClassTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbDefClassObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId )
	{
		return( readDefClassByBaseIdx( BaseId,
			false ) );
	}

	public List<ICFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId,
		boolean forceRead )
	{
		final String S_ProcName = "readDefClassByBaseIdx";
		CFGenKbDefClassByBaseIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( BaseId );
		Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj> dict;
		if( indexByBaseIdx == null ) {
			indexByBaseIdx = new HashMap< CFGenKbDefClassByBaseIdxKey,
				Map< CFGenKbDefClassPKey, ICFGenKbDefClassObj > >();
		}
		if( ( ! forceRead ) && indexByBaseIdx.containsKey( key ) ) {
			dict = indexByBaseIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbDefClassPKey, ICFGenKbDefClassObj>();
			ICFGenKbDefClassObj obj;
			CFGenKbDefClassBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().readDerivedByBaseIdx( schema.getAuthorization(),
				BaseId );
			CFGenKbDefClassBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getDefClassTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey() );
				obj.setBuff( buff );
				ICFGenKbDefClassObj realised = (ICFGenKbDefClassObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBaseIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbDefClassObj arr[] = new ICFGenKbDefClassObj[len];
		Iterator<ICFGenKbDefClassObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbDefClassObj> arrayList = new ArrayList<ICFGenKbDefClassObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbDefClassObj> cmp = new Comparator<ICFGenKbDefClassObj>() {
			public int compare( ICFGenKbDefClassObj lhs, ICFGenKbDefClassObj rhs ) {
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
					CFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					CFGenKbDefClassPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbDefClassObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbDefClassObj readCachedDefClassByIdIdx( short Id )
	{
		ICFGenKbDefClassObj obj = null;
		CFGenKbDefClassPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedDefClass( pkey );
		return( obj );
	}

	public ICFGenKbDefClassObj readCachedDefClassByNameIdx( String Name )
	{
		ICFGenKbDefClassObj obj = null;
		CFGenKbDefClassByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbDefClassObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbDefClassObj> valIter = members.values().iterator();
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

	public List<ICFGenKbDefClassObj> readCachedDefClassByBaseIdx( Short BaseId )
	{
		final String S_ProcName = "readCachedDefClassByBaseIdx";
		CFGenKbDefClassByBaseIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( BaseId );
		ArrayList<ICFGenKbDefClassObj> arrayList = new ArrayList<ICFGenKbDefClassObj>();
		if( indexByBaseIdx != null ) {
			Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj> dict;
			if( indexByBaseIdx.containsKey( key ) ) {
				dict = indexByBaseIdx.get( key );
				int len = dict.size();
				ICFGenKbDefClassObj arr[] = new ICFGenKbDefClassObj[len];
				Iterator<ICFGenKbDefClassObj> valIter = dict.values().iterator();
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
			ICFGenKbDefClassObj obj;
			Iterator<ICFGenKbDefClassObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbDefClassObj> cmp = new Comparator<ICFGenKbDefClassObj>() {
			public int compare( ICFGenKbDefClassObj lhs, ICFGenKbDefClassObj rhs ) {
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
					CFGenKbDefClassPKey lhsPKey = lhs.getPKey();
					CFGenKbDefClassPKey rhsPKey = rhs.getPKey();
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
		ICFGenKbDefClassObj obj = readCachedDefClassByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDefClassByNameIdx( String Name )
	{
		ICFGenKbDefClassObj obj = readCachedDefClassByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDefClassByBaseIdx( Short BaseId )
	{
		final String S_ProcName = "deepDisposeDefClassByBaseIdx";
		ICFGenKbDefClassObj obj;
		List<ICFGenKbDefClassObj> arrayList = readCachedDefClassByBaseIdx( BaseId );
		if( arrayList != null )  {
			Iterator<ICFGenKbDefClassObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbDefClassObj updateDefClass( ICFGenKbDefClassObj Obj ) {
		ICFGenKbDefClassObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().updateDefClass( schema.getAuthorization(),
			Obj.getDefClassBuff() );
		obj = (ICFGenKbDefClassObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteDefClass( ICFGenKbDefClassObj Obj ) {
		ICFGenKbDefClassObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClass( schema.getAuthorization(),
			obj.getDefClassBuff() );
		Obj.forget();
	}

	public void deleteDefClassByIdIdx( short Id )
	{
		CFGenKbDefClassPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newPKey();
		pkey.setRequiredId( Id );
		ICFGenKbDefClassObj obj = readDefClass( pkey );
		if( obj != null ) {
			ICFGenKbDefClassEditObj editObj = (ICFGenKbDefClassEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbDefClassEditObj)obj.beginEdit();
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
			indexByNameIdx = new HashMap< CFGenKbDefClassByNameIdxKey,
				ICFGenKbDefClassObj >();
		}
		CFGenKbDefClassByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( Name );
		ICFGenKbDefClassObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeDefClassByNameIdx( Name );
	}

	public void deleteDefClassByBaseIdx( Short BaseId )
	{
		CFGenKbDefClassByBaseIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( BaseId );
		if( indexByBaseIdx == null ) {
			indexByBaseIdx = new HashMap< CFGenKbDefClassByBaseIdxKey,
				Map< CFGenKbDefClassPKey, ICFGenKbDefClassObj > >();
		}
		if( indexByBaseIdx.containsKey( key ) ) {
			Map<CFGenKbDefClassPKey, ICFGenKbDefClassObj> dict = indexByBaseIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByBaseIdx( schema.getAuthorization(),
				BaseId );
			Iterator<ICFGenKbDefClassObj> iter = dict.values().iterator();
			ICFGenKbDefClassObj obj;
			List<ICFGenKbDefClassObj> toForget = new LinkedList<ICFGenKbDefClassObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableDefClass().deleteDefClassByBaseIdx( schema.getAuthorization(),
				BaseId );
		}
		deepDisposeDefClassByBaseIdx( BaseId );
	}
}
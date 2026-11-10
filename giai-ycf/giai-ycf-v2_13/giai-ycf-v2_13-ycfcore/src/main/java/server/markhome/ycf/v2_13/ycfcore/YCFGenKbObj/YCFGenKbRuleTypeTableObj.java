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

public class YCFGenKbRuleTypeTableObj
	implements IYCFGenKbRuleTypeTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbRuleTypePKey, IYCFGenKbRuleTypeObj> members;
	private Map<YCFGenKbRuleTypePKey, IYCFGenKbRuleTypeObj> allRuleType;
	private Map< YCFGenKbRuleTypeByNameIdxKey,
		IYCFGenKbRuleTypeObj > indexByNameIdx;
	public static String TABLE_NAME = "RuleType";
	public static String TABLE_DBNAME = "kbruletype";

	public YCFGenKbRuleTypeTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbRuleTypePKey, IYCFGenKbRuleTypeObj>();
		allRuleType = null;
		indexByNameIdx = null;
	}

	public YCFGenKbRuleTypeTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbRuleTypePKey, IYCFGenKbRuleTypeObj>();
		allRuleType = null;
		indexByNameIdx = null;
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
		allRuleType = null;
		indexByNameIdx = null;
		List<IYCFGenKbRuleTypeObj> toForget = new LinkedList<IYCFGenKbRuleTypeObj>();
		IYCFGenKbRuleTypeObj cur = null;
		Iterator<IYCFGenKbRuleTypeObj> iter = members.values().iterator();
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
	 *	YCFGenKbRuleTypeObj.
	 */
	public IYCFGenKbRuleTypeObj newInstance() {
		IYCFGenKbRuleTypeObj inst = new YCFGenKbRuleTypeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbRuleTypeObj.
	 */
	public IYCFGenKbRuleTypeEditObj newEditInstance( IYCFGenKbRuleTypeObj orig ) {
		IYCFGenKbRuleTypeEditObj edit = new YCFGenKbRuleTypeEditObj( orig );
		return( edit );
	}

	public IYCFGenKbRuleTypeObj realiseRuleType( IYCFGenKbRuleTypeObj Obj ) {
		IYCFGenKbRuleTypeObj obj = Obj;
		YCFGenKbRuleTypePKey pkey = obj.getPKey();
		IYCFGenKbRuleTypeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbRuleTypeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				YCFGenKbRuleTypeByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				YCFGenKbRuleTypeByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allRuleType != null ) {
				allRuleType.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allRuleType != null ) {
				allRuleType.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFGenKbRuleTypeByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbRuleTypeObj createRuleType( IYCFGenKbRuleTypeObj Obj ) {
		IYCFGenKbRuleTypeObj obj = Obj;
		YCFGenKbRuleTypeBuff buff = obj.getRuleTypeBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().createRuleType(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbRuleTypeObj readRuleType( YCFGenKbRuleTypePKey pkey ) {
		return( readRuleType( pkey, false ) );
	}

	public IYCFGenKbRuleTypeObj readRuleType( YCFGenKbRuleTypePKey pkey, boolean forceRead ) {
		IYCFGenKbRuleTypeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbRuleTypeBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getRuleTypeTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbRuleTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbRuleTypeObj readCachedRuleType( YCFGenKbRuleTypePKey pkey ) {
		IYCFGenKbRuleTypeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRuleType( IYCFGenKbRuleTypeObj obj )
	{
		final String S_ProcName = "YCFGenKbRuleTypeTableObj.reallyDeepDisposeRuleType() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbRuleTypePKey pkey = obj.getPKey();
		IYCFGenKbRuleTypeObj existing = readCachedRuleType( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbRuleTypeByNameIdxKey keyNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeRuleType( YCFGenKbRuleTypePKey pkey ) {
		IYCFGenKbRuleTypeObj obj = readCachedRuleType( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbRuleTypeObj lockRuleType( YCFGenKbRuleTypePKey pkey ) {
		IYCFGenKbRuleTypeObj locked = null;
		YCFGenKbRuleTypeBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getRuleTypeTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbRuleTypeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockRuleType", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbRuleTypeObj> readAllRuleType() {
		return( readAllRuleType( false ) );
	}

	public List<IYCFGenKbRuleTypeObj> readAllRuleType( boolean forceRead ) {
		final String S_ProcName = "readAllRuleType";
		if( ( allRuleType == null ) || forceRead ) {
			Map<YCFGenKbRuleTypePKey, IYCFGenKbRuleTypeObj> map = new HashMap<YCFGenKbRuleTypePKey,IYCFGenKbRuleTypeObj>();
			allRuleType = map;
			YCFGenKbRuleTypeBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().readAllDerived( schema.getAuthorization() );
			YCFGenKbRuleTypeBuff buff;
			IYCFGenKbRuleTypeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbRuleTypeObj realised = (IYCFGenKbRuleTypeObj)obj.realise();
			}
		}
		int len = allRuleType.size();
		IYCFGenKbRuleTypeObj arr[] = new IYCFGenKbRuleTypeObj[len];
		Iterator<IYCFGenKbRuleTypeObj> valIter = allRuleType.values().iterator();
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
		ArrayList<IYCFGenKbRuleTypeObj> arrayList = new ArrayList<IYCFGenKbRuleTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbRuleTypeObj> cmp = new Comparator<IYCFGenKbRuleTypeObj>() {
			public int compare( IYCFGenKbRuleTypeObj lhs, IYCFGenKbRuleTypeObj rhs ) {
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
					YCFGenKbRuleTypePKey lhsPKey = lhs.getPKey();
					YCFGenKbRuleTypePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbRuleTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbRuleTypeObj> readCachedAllRuleType() {
		final String S_ProcName = "readCachedAllRuleType";
		ArrayList<IYCFGenKbRuleTypeObj> arrayList = new ArrayList<IYCFGenKbRuleTypeObj>();
		if( allRuleType != null ) {
			int len = allRuleType.size();
			IYCFGenKbRuleTypeObj arr[] = new IYCFGenKbRuleTypeObj[len];
			Iterator<IYCFGenKbRuleTypeObj> valIter = allRuleType.values().iterator();
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
		Comparator<IYCFGenKbRuleTypeObj> cmp = new Comparator<IYCFGenKbRuleTypeObj>() {
			public int compare( IYCFGenKbRuleTypeObj lhs, IYCFGenKbRuleTypeObj rhs ) {
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
					YCFGenKbRuleTypePKey lhsPKey = lhs.getPKey();
					YCFGenKbRuleTypePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbRuleTypeObj readRuleTypeByIdIdx( short Id )
	{
		return( readRuleTypeByIdIdx( Id,
			false ) );
	}

	public IYCFGenKbRuleTypeObj readRuleTypeByIdIdx( short Id, boolean forceRead )
	{
		YCFGenKbRuleTypePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbRuleTypeObj obj = readRuleType( pkey, forceRead );
		return( obj );
	}

	public IYCFGenKbRuleTypeObj readRuleTypeByNameIdx( String Name )
	{
		return( readRuleTypeByNameIdx( Name,
			false ) );
	}

	public IYCFGenKbRuleTypeObj readRuleTypeByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbRuleTypeByNameIdxKey,
				IYCFGenKbRuleTypeObj >();
		}
		YCFGenKbRuleTypeByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbRuleTypeObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFGenKbRuleTypeBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getRuleTypeTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbRuleTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbRuleTypeObj readCachedRuleTypeByIdIdx( short Id )
	{
		IYCFGenKbRuleTypeObj obj = null;
		YCFGenKbRuleTypePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedRuleType( pkey );
		return( obj );
	}

	public IYCFGenKbRuleTypeObj readCachedRuleTypeByNameIdx( String Name )
	{
		IYCFGenKbRuleTypeObj obj = null;
		YCFGenKbRuleTypeByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbRuleTypeObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbRuleTypeObj> valIter = members.values().iterator();
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

	public void deepDisposeRuleTypeByIdIdx( short Id )
	{
		IYCFGenKbRuleTypeObj obj = readCachedRuleTypeByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRuleTypeByNameIdx( String Name )
	{
		IYCFGenKbRuleTypeObj obj = readCachedRuleTypeByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbRuleTypeObj updateRuleType( IYCFGenKbRuleTypeObj Obj ) {
		IYCFGenKbRuleTypeObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().updateRuleType( schema.getAuthorization(),
			Obj.getRuleTypeBuff() );
		obj = (IYCFGenKbRuleTypeObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteRuleType( IYCFGenKbRuleTypeObj Obj ) {
		IYCFGenKbRuleTypeObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().deleteRuleType( schema.getAuthorization(),
			obj.getRuleTypeBuff() );
		Obj.forget();
	}

	public void deleteRuleTypeByIdIdx( short Id )
	{
		YCFGenKbRuleTypePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey();
		pkey.setRequiredId( Id );
		IYCFGenKbRuleTypeObj obj = readRuleType( pkey );
		if( obj != null ) {
			IYCFGenKbRuleTypeEditObj editObj = (IYCFGenKbRuleTypeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbRuleTypeEditObj)obj.beginEdit();
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
		deepDisposeRuleTypeByIdIdx( Id );
	}

	public void deleteRuleTypeByNameIdx( String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbRuleTypeByNameIdxKey,
				IYCFGenKbRuleTypeObj >();
		}
		YCFGenKbRuleTypeByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFGenKbRuleTypeObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().deleteRuleTypeByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleType().deleteRuleTypeByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeRuleTypeByNameIdx( Name );
	}
}

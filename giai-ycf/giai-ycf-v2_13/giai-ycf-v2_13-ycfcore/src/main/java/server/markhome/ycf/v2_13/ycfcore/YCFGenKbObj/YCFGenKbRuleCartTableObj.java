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

public class YCFGenKbRuleCartTableObj
	implements IYCFGenKbRuleCartTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj> members;
	private Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj> allRuleCart;
	private Map< YCFGenKbRuleCartByTenantIdxKey,
		Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj > > indexByTenantIdx;
	private Map< YCFGenKbRuleCartByNameIdxKey,
		IYCFGenKbRuleCartObj > indexByNameIdx;
	public static String TABLE_NAME = "RuleCart";
	public static String TABLE_DBNAME = "kbrulecart";

	public YCFGenKbRuleCartTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj>();
		allRuleCart = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
	}

	public YCFGenKbRuleCartTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj>();
		allRuleCart = null;
		indexByTenantIdx = null;
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
		allRuleCart = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
		List<IYCFGenKbRuleCartObj> toForget = new LinkedList<IYCFGenKbRuleCartObj>();
		IYCFGenKbRuleCartObj cur = null;
		Iterator<IYCFGenKbRuleCartObj> iter = members.values().iterator();
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
	 *	YCFGenKbRuleCartObj.
	 */
	public IYCFGenKbRuleCartObj newInstance() {
		IYCFGenKbRuleCartObj inst = new YCFGenKbRuleCartObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbRuleCartObj.
	 */
	public IYCFGenKbRuleCartEditObj newEditInstance( IYCFGenKbRuleCartObj orig ) {
		IYCFGenKbRuleCartEditObj edit = new YCFGenKbRuleCartEditObj( orig );
		return( edit );
	}

	public IYCFGenKbRuleCartObj realiseRuleCart( IYCFGenKbRuleCartObj Obj ) {
		IYCFGenKbRuleCartObj obj = Obj;
		YCFGenKbRuleCartPKey pkey = obj.getPKey();
		IYCFGenKbRuleCartObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbRuleCartObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbRuleCartByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				YCFGenKbRuleCartByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbRuleCartByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFGenKbRuleCartByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allRuleCart != null ) {
				allRuleCart.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allRuleCart != null ) {
				allRuleCart.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbRuleCartByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFGenKbRuleCartByNameIdxKey keyNameIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbRuleCartObj createRuleCart( IYCFGenKbRuleCartObj Obj ) {
		IYCFGenKbRuleCartObj obj = Obj;
		YCFGenKbRuleCartBuff buff = obj.getRuleCartBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().createRuleCart(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbRuleCartObj readRuleCart( YCFGenKbRuleCartPKey pkey ) {
		return( readRuleCart( pkey, false ) );
	}

	public IYCFGenKbRuleCartObj readRuleCart( YCFGenKbRuleCartPKey pkey, boolean forceRead ) {
		IYCFGenKbRuleCartObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbRuleCartBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getRuleCartTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbRuleCartObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbRuleCartObj readCachedRuleCart( YCFGenKbRuleCartPKey pkey ) {
		IYCFGenKbRuleCartObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRuleCart( IYCFGenKbRuleCartObj obj )
	{
		final String S_ProcName = "YCFGenKbRuleCartTableObj.reallyDeepDisposeRuleCart() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbRuleCartPKey pkey = obj.getPKey();
		IYCFGenKbRuleCartObj existing = readCachedRuleCart( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbRuleCartByTenantIdxKey keyTenantIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbRuleCartByNameIdxKey keyNameIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getGenItemTableObj().deepDisposeGenItemByCartIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeRuleCart( YCFGenKbRuleCartPKey pkey ) {
		IYCFGenKbRuleCartObj obj = readCachedRuleCart( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbRuleCartObj lockRuleCart( YCFGenKbRuleCartPKey pkey ) {
		IYCFGenKbRuleCartObj locked = null;
		YCFGenKbRuleCartBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getRuleCartTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbRuleCartObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockRuleCart", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbRuleCartObj> readAllRuleCart() {
		return( readAllRuleCart( false ) );
	}

	public List<IYCFGenKbRuleCartObj> readAllRuleCart( boolean forceRead ) {
		final String S_ProcName = "readAllRuleCart";
		if( ( allRuleCart == null ) || forceRead ) {
			Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj> map = new HashMap<YCFGenKbRuleCartPKey,IYCFGenKbRuleCartObj>();
			allRuleCart = map;
			YCFGenKbRuleCartBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readAllDerived( schema.getAuthorization() );
			YCFGenKbRuleCartBuff buff;
			IYCFGenKbRuleCartObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbRuleCartObj realised = (IYCFGenKbRuleCartObj)obj.realise();
			}
		}
		int len = allRuleCart.size();
		IYCFGenKbRuleCartObj arr[] = new IYCFGenKbRuleCartObj[len];
		Iterator<IYCFGenKbRuleCartObj> valIter = allRuleCart.values().iterator();
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
		ArrayList<IYCFGenKbRuleCartObj> arrayList = new ArrayList<IYCFGenKbRuleCartObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbRuleCartObj> cmp = new Comparator<IYCFGenKbRuleCartObj>() {
			public int compare( IYCFGenKbRuleCartObj lhs, IYCFGenKbRuleCartObj rhs ) {
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
					YCFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					YCFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbRuleCartObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbRuleCartObj> readCachedAllRuleCart() {
		final String S_ProcName = "readCachedAllRuleCart";
		ArrayList<IYCFGenKbRuleCartObj> arrayList = new ArrayList<IYCFGenKbRuleCartObj>();
		if( allRuleCart != null ) {
			int len = allRuleCart.size();
			IYCFGenKbRuleCartObj arr[] = new IYCFGenKbRuleCartObj[len];
			Iterator<IYCFGenKbRuleCartObj> valIter = allRuleCart.values().iterator();
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
		Comparator<IYCFGenKbRuleCartObj> cmp = new Comparator<IYCFGenKbRuleCartObj>() {
			public int compare( IYCFGenKbRuleCartObj lhs, IYCFGenKbRuleCartObj rhs ) {
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
					YCFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					YCFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id )
	{
		return( readRuleCartByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFGenKbRuleCartPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFGenKbRuleCartObj obj = readRuleCart( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId )
	{
		return( readRuleCartByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRuleCartByTenantIdx";
		YCFGenKbRuleCartByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbRuleCartByTenantIdxKey,
				Map< YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj>();
			IYCFGenKbRuleCartObj obj;
			YCFGenKbRuleCartBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbRuleCartBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRuleCartTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbRuleCartObj realised = (IYCFGenKbRuleCartObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbRuleCartObj arr[] = new IYCFGenKbRuleCartObj[len];
		Iterator<IYCFGenKbRuleCartObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbRuleCartObj> arrayList = new ArrayList<IYCFGenKbRuleCartObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbRuleCartObj> cmp = new Comparator<IYCFGenKbRuleCartObj>() {
			public int compare( IYCFGenKbRuleCartObj lhs, IYCFGenKbRuleCartObj rhs ) {
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
					YCFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					YCFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbRuleCartObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbRuleCartObj readRuleCartByNameIdx( long TenantId,
		String Name )
	{
		return( readRuleCartByNameIdx( TenantId,
			Name,
			false ) );
	}

	public IYCFGenKbRuleCartObj readRuleCartByNameIdx( long TenantId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbRuleCartByNameIdxKey,
				IYCFGenKbRuleCartObj >();
		}
		YCFGenKbRuleCartByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFGenKbRuleCartObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFGenKbRuleCartBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			if( buff != null ) {
				obj = schema.getRuleCartTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbRuleCartObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbRuleCartObj readCachedRuleCartByIdIdx( long TenantId,
		long Id )
	{
		IYCFGenKbRuleCartObj obj = null;
		YCFGenKbRuleCartPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedRuleCart( pkey );
		return( obj );
	}

	public List<IYCFGenKbRuleCartObj> readCachedRuleCartByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRuleCartByTenantIdx";
		YCFGenKbRuleCartByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbRuleCartObj> arrayList = new ArrayList<IYCFGenKbRuleCartObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbRuleCartObj arr[] = new IYCFGenKbRuleCartObj[len];
				Iterator<IYCFGenKbRuleCartObj> valIter = dict.values().iterator();
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
			IYCFGenKbRuleCartObj obj;
			Iterator<IYCFGenKbRuleCartObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbRuleCartObj> cmp = new Comparator<IYCFGenKbRuleCartObj>() {
			public int compare( IYCFGenKbRuleCartObj lhs, IYCFGenKbRuleCartObj rhs ) {
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
					YCFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					YCFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbRuleCartObj readCachedRuleCartByNameIdx( long TenantId,
		String Name )
	{
		IYCFGenKbRuleCartObj obj = null;
		YCFGenKbRuleCartByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbRuleCartObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbRuleCartObj> valIter = members.values().iterator();
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

	public void deepDisposeRuleCartByIdIdx( long TenantId,
		long Id )
	{
		IYCFGenKbRuleCartObj obj = readCachedRuleCartByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRuleCartByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRuleCartByTenantIdx";
		IYCFGenKbRuleCartObj obj;
		List<IYCFGenKbRuleCartObj> arrayList = readCachedRuleCartByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbRuleCartObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRuleCartByNameIdx( long TenantId,
		String Name )
	{
		IYCFGenKbRuleCartObj obj = readCachedRuleCartByNameIdx( TenantId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbRuleCartObj updateRuleCart( IYCFGenKbRuleCartObj Obj ) {
		IYCFGenKbRuleCartObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().updateRuleCart( schema.getAuthorization(),
			Obj.getRuleCartBuff() );
		obj = (IYCFGenKbRuleCartObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteRuleCart( IYCFGenKbRuleCartObj Obj ) {
		IYCFGenKbRuleCartObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCart( schema.getAuthorization(),
			obj.getRuleCartBuff() );
		Obj.forget();
	}

	public void deleteRuleCartByIdIdx( long TenantId,
		long Id )
	{
		YCFGenKbRuleCartPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFGenKbRuleCartObj obj = readRuleCart( pkey );
		if( obj != null ) {
			IYCFGenKbRuleCartEditObj editObj = (IYCFGenKbRuleCartEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbRuleCartEditObj)obj.beginEdit();
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
		deepDisposeRuleCartByIdIdx( TenantId,
				Id );
	}

	public void deleteRuleCartByTenantIdx( long TenantId )
	{
		YCFGenKbRuleCartByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbRuleCartByTenantIdxKey,
				Map< YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbRuleCartPKey, IYCFGenKbRuleCartObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbRuleCartObj> iter = dict.values().iterator();
			IYCFGenKbRuleCartObj obj;
			List<IYCFGenKbRuleCartObj> toForget = new LinkedList<IYCFGenKbRuleCartObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRuleCartByTenantIdx( TenantId );
	}

	public void deleteRuleCartByNameIdx( long TenantId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFGenKbRuleCartByNameIdxKey,
				IYCFGenKbRuleCartObj >();
		}
		YCFGenKbRuleCartByNameIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		IYCFGenKbRuleCartObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
		}
		deepDisposeRuleCartByNameIdx( TenantId,
				Name );
	}
}

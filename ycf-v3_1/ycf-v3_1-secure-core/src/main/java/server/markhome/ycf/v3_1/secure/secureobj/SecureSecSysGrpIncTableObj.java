// Description: Java 25 Table Object implementation for SecSysGrpInc.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.secure.secureobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

public class SecureSecSysGrpIncTableObj
	implements ISecureSecSysGrpIncTableObj
{
	protected IBusModelSchemaObj schema;
	protected static int runtimeClassCode = ISecureSecSysGrpInc.CLASS_CODE;
	protected static final int backingClassCode = ISecureSecSysGrpInc.CLASS_CODE;
	private Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> members;
	private Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> allSecSysGrpInc;
	private Map< ISecureSecSysGrpIncBySysGrpIdxKey,
		Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > > indexBySysGrpIdx;
	private Map< ISecureSecSysGrpIncByNameIdxKey,
		Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > > indexByNameIdx;
	public static String TABLE_NAME = "SecSysGrpInc";
	public static String TABLE_DBNAME = "secsysgrpinc";

	public SecureSecSysGrpIncTableObj() {
		schema = null;
		members = new HashMap<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj>();
		allSecSysGrpInc = null;
		indexBySysGrpIdx = null;
		indexByNameIdx = null;
	}

	public SecureSecSysGrpIncTableObj( ISecureSchemaObj argSchema ) {
		schema = (IBusModelSchemaObj)argSchema;
		members = new HashMap<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj>();
		allSecSysGrpInc = null;
		indexBySysGrpIdx = null;
		indexByNameIdx = null;
	}
	
	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	@Override
	public int getClassCode() {
		return SecureSecSysGrpIncTableObj.getRuntimeClassCode();
	}	

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	public static int getBackingClassCode() {
		return( backingClassCode );
	}

	/**
	 *	Get the runtime class code for this table; this value is only stable after the application is fully initialized.
	 *
	 *	@return runtimeClassCode
	 */
	public static int getRuntimeClassCode() {
		return( runtimeClassCode );
	}

	/**
	 *	Set the runtime class code for this table; this is done only during application initialization by the SchemaObj's <tt>initClassCodes()</tt> static method,
	 *	which will only set the class codes once and never again.  Once set, the class codes are immutable within the application.
	 *	Application programmers should never invoke this method, so it has package access only.
	 *
	 *	@param	argNewClassCode	The runtime class code to be used by clients and integrated application logic to identify this table of this schema.
	 */
	static void setRuntimeClassCode(int argNewClassCode ) {
		if (argNewClassCode <= 0) {
			throw new CFArgumentUnderflowException(SecureSecSysGrpIncTableObj.class, "setRuntimeClassCode", 1, "argNewClassCode", argNewClassCode, 1);
		}
		runtimeClassCode = argNewClassCode;
	}

	@Override
	public ISecureSchemaObj getSchema() {
		return( schema );
	}

	@Override
	public void setSchema( ISecureSchemaObj value ) {
		schema = (IBusModelSchemaObj)value;
	}

	@Override
	public String getTableName() {
		return( TABLE_NAME );
	}

	@Override
	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	@Override
	public Class getObjQualifyingClass() {
		return( null );
	}


	@Override
	public void minimizeMemory() {
		allSecSysGrpInc = null;
		indexBySysGrpIdx = null;
		indexByNameIdx = null;
		List<ISecureSecSysGrpIncObj> toForget = new LinkedList<ISecureSecSysGrpIncObj>();
		ISecureSecSysGrpIncObj cur = null;
		Iterator<ISecureSecSysGrpIncObj> iter = members.values().iterator();
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
	 *	SecureSecSysGrpIncObj.
	 */
	@Override
	public ISecureSecSysGrpIncObj newInstance() {
		ISecureSecSysGrpIncObj inst = new SecureSecSysGrpIncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	SecureSecSysGrpIncObj.
	 */
	@Override
	public ISecureSecSysGrpIncEditObj newEditInstance( ISecureSecSysGrpIncObj orig ) {
		ISecureSecSysGrpIncEditObj edit = new SecureSecSysGrpIncEditObj( orig );
		return( edit );
	}

	@Override
	public ISecureSecSysGrpIncObj constructByClassCode( int backingClassCode ) {
		ISecureSecSysGrpIncObj obj = null;
		if( backingClassCode == ISecureSecSysGrpInc.CLASS_CODE) {
			obj = ((ISecureSchemaObj)schema).getSecSysGrpIncTableObj().newInstance();
		}
		return( obj );
	}

	@Override
	public ISecureSecSysGrpIncObj realiseSecSysGrpInc( ISecureSecSysGrpIncObj Obj ) {
		ISecureSecSysGrpIncObj obj = Obj;
		ISecureSecSysGrpIncPKey pkey = obj.getPKey();
		ISecureSecSysGrpIncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ISecureSecSysGrpIncObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexBySysGrpIdx != null ) {
				ISecureSecSysGrpIncBySysGrpIdxKey keySysGrpIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newBySysGrpIdxKey();
				keySysGrpIdx.setRequiredSecSysGrpId( keepObj.getRequiredSecSysGrpId() );
				Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > mapSysGrpIdx = indexBySysGrpIdx.get( keySysGrpIdx );
				if( mapSysGrpIdx != null ) {
					mapSysGrpIdx.remove( keepObj.getPKey() );
					if( mapSysGrpIdx.size() <= 0 ) {
						indexBySysGrpIdx.remove( keySysGrpIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				ISecureSecSysGrpIncByNameIdxKey keyNameIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newByNameIdxKey();
				keyNameIdx.setRequiredInclName( keepObj.getRequiredInclName() );
				Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > mapNameIdx = indexByNameIdx.get( keyNameIdx );
				if( mapNameIdx != null ) {
					mapNameIdx.remove( keepObj.getPKey() );
					if( mapNameIdx.size() <= 0 ) {
						indexByNameIdx.remove( keyNameIdx );
					}
				}
			}

			keepObj.setRec( Obj.getRec() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexBySysGrpIdx != null ) {
				ISecureSecSysGrpIncBySysGrpIdxKey keySysGrpIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newBySysGrpIdxKey();
				keySysGrpIdx.setRequiredSecSysGrpId( keepObj.getRequiredSecSysGrpId() );
				Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > mapSysGrpIdx = indexBySysGrpIdx.get( keySysGrpIdx );
				if( mapSysGrpIdx != null ) {
					mapSysGrpIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				ISecureSecSysGrpIncByNameIdxKey keyNameIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newByNameIdxKey();
				keyNameIdx.setRequiredInclName( keepObj.getRequiredInclName() );
				Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > mapNameIdx = indexByNameIdx.get( keyNameIdx );
				if( mapNameIdx != null ) {
					mapNameIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecSysGrpInc != null ) {
				allSecSysGrpInc.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecSysGrpInc != null ) {
				allSecSysGrpInc.put( keepObj.getPKey(), keepObj );
			}

			if( indexBySysGrpIdx != null ) {
				ISecureSecSysGrpIncBySysGrpIdxKey keySysGrpIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newBySysGrpIdxKey();
				keySysGrpIdx.setRequiredSecSysGrpId( keepObj.getRequiredSecSysGrpId() );
				Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > mapSysGrpIdx = indexBySysGrpIdx.get( keySysGrpIdx );
				if( mapSysGrpIdx != null ) {
					mapSysGrpIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				ISecureSecSysGrpIncByNameIdxKey keyNameIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newByNameIdxKey();
				keyNameIdx.setRequiredInclName( keepObj.getRequiredInclName() );
				Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > mapNameIdx = indexByNameIdx.get( keyNameIdx );
				if( mapNameIdx != null ) {
					mapNameIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	@Override
	public ISecureSecSysGrpIncObj createSecSysGrpInc( ISecureSecSysGrpIncObj Obj ) {
		ISecureSecSysGrpIncObj obj = Obj;
		ISecureSecSysGrpInc rec = obj.getSecSysGrpIncRec();
		schema.getSecureBackingStore().getTableSecSysGrpInc().createSecSysGrpInc(
			null,
			rec );
		obj.copyRecToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	@Override
	public ISecureSecSysGrpIncObj readSecSysGrpInc( ISecureSecSysGrpIncPKey pkey ) {
		return( readSecSysGrpInc( pkey, false ) );
	}

	@Override
	public ISecureSecSysGrpIncObj readSecSysGrpInc( ISecureSecSysGrpIncPKey pkey, boolean forceRead ) {
		ISecureSecSysGrpIncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			ISecureSecSysGrpInc readRec = schema.getSecureBackingStore().getTableSecSysGrpInc().readDerivedByIdIdx( null,
						pkey.getRequiredSecSysGrpId(),
						pkey.getRequiredInclName() );
			if( readRec != null ) {
				obj = schema.getSecSysGrpIncTableObj().newInstance();
				obj.setPKey( readRec.getPKey() );
				obj.setRec( readRec );
				obj = (ISecureSecSysGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	@Override
	public ISecureSecSysGrpIncObj readSecSysGrpInc( ICFKeyHash256 SecSysGrpId,
		String InclName ) {
		return( readSecSysGrpInc( SecSysGrpId,
			InclName, false ) );
	}

	@Override
	public ISecureSecSysGrpIncObj readSecSysGrpInc( ICFKeyHash256 SecSysGrpId,
		String InclName, boolean forceRead ) {
		ISecureSecSysGrpIncObj obj = null;
		ISecureSecSysGrpInc readRec = schema.getSecureBackingStore().getTableSecSysGrpInc().readDerivedByIdIdx( null,
			SecSysGrpId,
			InclName );
		if( readRec != null ) {
				obj = schema.getSecSysGrpIncTableObj().newInstance();
			obj.setPKey( readRec.getPKey() );
			obj.setRec( readRec );
			obj = (ISecureSecSysGrpIncObj)obj.realise();
		}
		return( obj );
	}

	@Override
	public ISecureSecSysGrpIncObj readCachedSecSysGrpInc( ISecureSecSysGrpIncPKey pkey ) {
		ISecureSecSysGrpIncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	@Override
	public void reallyDeepDisposeSecSysGrpInc( ISecureSecSysGrpIncObj obj )
	{
		final String S_ProcName = "SecureSecSysGrpIncTableObj.reallyDeepDisposeSecSysGrpInc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		ISecureSecSysGrpIncPKey pkey = obj.getPKey();
		ISecureSecSysGrpIncObj existing = readCachedSecSysGrpInc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		ISecureSecSysGrpIncBySysGrpIdxKey keySysGrpIdx = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newBySysGrpIdxKey();
		keySysGrpIdx.setRequiredSecSysGrpId( existing.getRequiredSecSysGrpId() );

		ISecureSecSysGrpIncByNameIdxKey keyNameIdx = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newByNameIdxKey();
		keyNameIdx.setRequiredInclName( existing.getRequiredInclName() );



		if( indexBySysGrpIdx != null ) {
			if( indexBySysGrpIdx.containsKey( keySysGrpIdx ) ) {
				indexBySysGrpIdx.get( keySysGrpIdx ).remove( pkey );
				if( indexBySysGrpIdx.get( keySysGrpIdx ).size() <= 0 ) {
					indexBySysGrpIdx.remove( keySysGrpIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( keyNameIdx ) ) {
				indexByNameIdx.get( keyNameIdx ).remove( pkey );
				if( indexByNameIdx.get( keyNameIdx ).size() <= 0 ) {
					indexByNameIdx.remove( keyNameIdx );
				}
			}
		}


	}
	@Override
	public void deepDisposeSecSysGrpInc( ISecureSecSysGrpIncPKey pkey ) {
		ISecureSecSysGrpIncObj obj = readCachedSecSysGrpInc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	@Override
	public ISecureSecSysGrpIncObj lockSecSysGrpInc( ISecureSecSysGrpIncPKey pkey ) {
		ISecureSecSysGrpIncObj locked = null;
		ISecureSecSysGrpInc lockRec = schema.getSecureBackingStore().getTableSecSysGrpInc().lockDerived( null, pkey );
		if( lockRec != null ) {
				locked = schema.getSecSysGrpIncTableObj().newInstance();
			locked.setRec( lockRec );
			locked.setPKey( lockRec.getPKey() );
			locked = (ISecureSecSysGrpIncObj)locked.realise();
		}
		else {
			throw new CFCollisionDetectedException( getClass(), "lockSecSysGrpInc", pkey );
		}
		return( locked );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readAllSecSysGrpInc() {
		return( readAllSecSysGrpInc( false ) );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readAllSecSysGrpInc( boolean forceRead ) {
		final String S_ProcName = "readAllSecSysGrpInc";
		if( ( allSecSysGrpInc == null ) || forceRead ) {
			Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> map = new HashMap<ISecureSecSysGrpIncPKey,ISecureSecSysGrpIncObj>();
			allSecSysGrpInc = map;
			ISecureSecSysGrpInc[] recList = schema.getSecureBackingStore().getTableSecSysGrpInc().readAllDerived( null );
			ISecureSecSysGrpInc rec;
			ISecureSecSysGrpIncObj obj;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureSecSysGrpIncObj realised = (ISecureSecSysGrpIncObj)obj.realise();
			}
		}
		int len = allSecSysGrpInc.size();
		ISecureSecSysGrpIncObj arr[] = new ISecureSecSysGrpIncObj[len];
		Iterator<ISecureSecSysGrpIncObj> valIter = allSecSysGrpInc.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ISecureSecSysGrpIncObj> arrayList = new ArrayList<ISecureSecSysGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureSecSysGrpIncObj> cmp = new Comparator<ISecureSecSysGrpIncObj>() {
			@Override
			public int compare( ISecureSecSysGrpIncObj lhs, ISecureSecSysGrpIncObj rhs ) {
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
					ISecureSecSysGrpIncPKey lhsPKey = lhs.getPKey();
					ISecureSecSysGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureSecSysGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readCachedAllSecSysGrpInc() {
		final String S_ProcName = "readCachedAllSecSysGrpInc";
		ArrayList<ISecureSecSysGrpIncObj> arrayList = new ArrayList<ISecureSecSysGrpIncObj>();
		if( allSecSysGrpInc != null ) {
			int len = allSecSysGrpInc.size();
			ISecureSecSysGrpIncObj arr[] = new ISecureSecSysGrpIncObj[len];
			Iterator<ISecureSecSysGrpIncObj> valIter = allSecSysGrpInc.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFArgumentOverflowException( getClass(),
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
		Comparator<ISecureSecSysGrpIncObj> cmp = new Comparator<ISecureSecSysGrpIncObj>() {
			public int compare( ISecureSecSysGrpIncObj lhs, ISecureSecSysGrpIncObj rhs ) {
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
					ISecureSecSysGrpIncPKey lhsPKey = lhs.getPKey();
					ISecureSecSysGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public ISecureSecSysGrpIncObj readSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName )
	{
		return( readSecSysGrpIncByIdIdx( SecSysGrpId,
			InclName,
			false ) );
	}

	@Override
	public ISecureSecSysGrpIncObj readSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName, boolean forceRead )
	{
		ISecureSecSysGrpIncPKey pkey = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newPKey();
		pkey.setRequiredSecSysGrpId( SecSysGrpId );
		pkey.setRequiredInclName( InclName );
		ISecureSecSysGrpIncObj obj = readSecSysGrpInc( pkey, forceRead );
		return( obj );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId )
	{
		return( readSecSysGrpIncBySysGrpIdx( SecSysGrpId,
			false ) );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSysGrpIncBySysGrpIdx";
		ISecureSecSysGrpIncBySysGrpIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newBySysGrpIdxKey();
		key.setRequiredSecSysGrpId( SecSysGrpId );
		Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> dict;
		if( indexBySysGrpIdx == null ) {
			indexBySysGrpIdx = new HashMap< ISecureSecSysGrpIncBySysGrpIdxKey,
				Map< ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexBySysGrpIdx.containsKey( key ) ) {
			dict = indexBySysGrpIdx.get( key );
		}
		else {
			dict = new HashMap<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj>();
			ISecureSecSysGrpIncObj obj;
			ISecureSecSysGrpInc[] recList = schema.getSecureBackingStore().getTableSecSysGrpInc().readDerivedBySysGrpIdx( null,
				SecSysGrpId );
			ISecureSecSysGrpInc rec;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = schema.getSecSysGrpIncTableObj().newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureSecSysGrpIncObj realised = (ISecureSecSysGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySysGrpIdx.put( key, dict );
		}
		int len = dict.size();
		ISecureSecSysGrpIncObj arr[] = new ISecureSecSysGrpIncObj[len];
		Iterator<ISecureSecSysGrpIncObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ISecureSecSysGrpIncObj> arrayList = new ArrayList<ISecureSecSysGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureSecSysGrpIncObj> cmp = new Comparator<ISecureSecSysGrpIncObj>() {
			@Override
			public int compare( ISecureSecSysGrpIncObj lhs, ISecureSecSysGrpIncObj rhs ) {
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
					ISecureSecSysGrpIncPKey lhsPKey = lhs.getPKey();
					ISecureSecSysGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureSecSysGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readSecSysGrpIncByNameIdx( String InclName )
	{
		return( readSecSysGrpIncByNameIdx( InclName,
			false ) );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readSecSysGrpIncByNameIdx( String InclName,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSysGrpIncByNameIdx";
		ISecureSecSysGrpIncByNameIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newByNameIdxKey();
		key.setRequiredInclName( InclName );
		Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> dict;
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< ISecureSecSysGrpIncByNameIdxKey,
				Map< ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			dict = indexByNameIdx.get( key );
		}
		else {
			dict = new HashMap<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj>();
			ISecureSecSysGrpIncObj obj;
			ISecureSecSysGrpInc[] recList = schema.getSecureBackingStore().getTableSecSysGrpInc().readDerivedByNameIdx( null,
				InclName );
			ISecureSecSysGrpInc rec;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = schema.getSecSysGrpIncTableObj().newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureSecSysGrpIncObj realised = (ISecureSecSysGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNameIdx.put( key, dict );
		}
		int len = dict.size();
		ISecureSecSysGrpIncObj arr[] = new ISecureSecSysGrpIncObj[len];
		Iterator<ISecureSecSysGrpIncObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ISecureSecSysGrpIncObj> arrayList = new ArrayList<ISecureSecSysGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureSecSysGrpIncObj> cmp = new Comparator<ISecureSecSysGrpIncObj>() {
			@Override
			public int compare( ISecureSecSysGrpIncObj lhs, ISecureSecSysGrpIncObj rhs ) {
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
					ISecureSecSysGrpIncPKey lhsPKey = lhs.getPKey();
					ISecureSecSysGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureSecSysGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public ISecureSecSysGrpIncObj readCachedSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName )
	{
		ISecureSecSysGrpIncObj obj = null;
		ISecureSecSysGrpIncPKey pkey = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newPKey();
		pkey.setRequiredSecSysGrpId( SecSysGrpId );
		pkey.setRequiredInclName( InclName );
		pkey.setRequiredSecSysGrpId( SecSysGrpId );
		pkey.setRequiredInclName( InclName );
		obj = readCachedSecSysGrpInc( pkey );
		return( obj );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readCachedSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId )
	{
		final String S_ProcName = "readCachedSecSysGrpIncBySysGrpIdx";
		ISecureSecSysGrpIncBySysGrpIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newBySysGrpIdxKey();
		key.setRequiredSecSysGrpId( SecSysGrpId );
		ArrayList<ISecureSecSysGrpIncObj> arrayList = new ArrayList<ISecureSecSysGrpIncObj>();
		if( indexBySysGrpIdx != null ) {
			Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> dict;
			if( indexBySysGrpIdx.containsKey( key ) ) {
				dict = indexBySysGrpIdx.get( key );
				int len = dict.size();
				ISecureSecSysGrpIncObj arr[] = new ISecureSecSysGrpIncObj[len];
				Iterator<ISecureSecSysGrpIncObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFArgumentOverflowException( getClass(),
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
			ISecureSecSysGrpIncObj obj;
			Iterator<ISecureSecSysGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getRec().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ISecureSecSysGrpIncObj> cmp = new Comparator<ISecureSecSysGrpIncObj>() {
			@Override
			public int compare( ISecureSecSysGrpIncObj lhs, ISecureSecSysGrpIncObj rhs ) {
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
					ISecureSecSysGrpIncPKey lhsPKey = lhs.getPKey();
					ISecureSecSysGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public List<ISecureSecSysGrpIncObj> readCachedSecSysGrpIncByNameIdx( String InclName )
	{
		final String S_ProcName = "readCachedSecSysGrpIncByNameIdx";
		ISecureSecSysGrpIncByNameIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newByNameIdxKey();
		key.setRequiredInclName( InclName );
		ArrayList<ISecureSecSysGrpIncObj> arrayList = new ArrayList<ISecureSecSysGrpIncObj>();
		if( indexByNameIdx != null ) {
			Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> dict;
			if( indexByNameIdx.containsKey( key ) ) {
				dict = indexByNameIdx.get( key );
				int len = dict.size();
				ISecureSecSysGrpIncObj arr[] = new ISecureSecSysGrpIncObj[len];
				Iterator<ISecureSecSysGrpIncObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFArgumentOverflowException( getClass(),
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
			ISecureSecSysGrpIncObj obj;
			Iterator<ISecureSecSysGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getRec().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ISecureSecSysGrpIncObj> cmp = new Comparator<ISecureSecSysGrpIncObj>() {
			@Override
			public int compare( ISecureSecSysGrpIncObj lhs, ISecureSecSysGrpIncObj rhs ) {
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
					ISecureSecSysGrpIncPKey lhsPKey = lhs.getPKey();
					ISecureSecSysGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public void deepDisposeSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName )
	{
		ISecureSecSysGrpIncObj obj = readCachedSecSysGrpIncByIdIdx( SecSysGrpId,
				InclName );
		if( obj != null ) {
			obj.forget();
		}
	}

	@Override
	public void deepDisposeSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId )
	{
		final String S_ProcName = "deepDisposeSecSysGrpIncBySysGrpIdx";
		ISecureSecSysGrpIncObj obj;
		List<ISecureSecSysGrpIncObj> arrayList = readCachedSecSysGrpIncBySysGrpIdx( SecSysGrpId );
		if( arrayList != null )  {
			Iterator<ISecureSecSysGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	@Override
	public void deepDisposeSecSysGrpIncByNameIdx( String InclName )
	{
		final String S_ProcName = "deepDisposeSecSysGrpIncByNameIdx";
		ISecureSecSysGrpIncObj obj;
		List<ISecureSecSysGrpIncObj> arrayList = readCachedSecSysGrpIncByNameIdx( InclName );
		if( arrayList != null )  {
			Iterator<ISecureSecSysGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	@Override
	public ISecureSecSysGrpIncObj updateSecSysGrpInc( ISecureSecSysGrpIncObj Obj ) {
		ISecureSecSysGrpIncObj obj = Obj;
		schema.getSecureBackingStore().getTableSecSysGrpInc().updateSecSysGrpInc( null,
			Obj.getSecSysGrpIncRec() );
		obj = (ISecureSecSysGrpIncObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	@Override
	public void deleteSecSysGrpInc( ISecureSecSysGrpIncObj Obj ) {
		ISecureSecSysGrpIncObj obj = Obj;
		schema.getSecureBackingStore().getTableSecSysGrpInc().deleteSecSysGrpInc( null,
			obj.getSecSysGrpIncRec() );
		Obj.forget();
	}

	@Override
	public void deleteSecSysGrpIncByIdIdx( ICFKeyHash256 SecSysGrpId,
		String InclName )
	{
		ISecureSecSysGrpIncObj obj = readSecSysGrpInc(SecSysGrpId,
				InclName);
		if( obj != null ) {
			ISecureSecSysGrpIncEditObj editObj = (ISecureSecSysGrpIncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ISecureSecSysGrpIncEditObj)obj.beginEdit();
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
		deepDisposeSecSysGrpIncByIdIdx( SecSysGrpId,
				InclName );
	}

	@Override
	public void deleteSecSysGrpIncBySysGrpIdx( ICFKeyHash256 SecSysGrpId )
	{
		ISecureSecSysGrpIncBySysGrpIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newBySysGrpIdxKey();
		key.setRequiredSecSysGrpId( SecSysGrpId );
		if( indexBySysGrpIdx == null ) {
			indexBySysGrpIdx = new HashMap< ISecureSecSysGrpIncBySysGrpIdxKey,
				Map< ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > >();
		}
		if( indexBySysGrpIdx.containsKey( key ) ) {
			Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> dict = indexBySysGrpIdx.get( key );
			schema.getSecureBackingStore().getTableSecSysGrpInc().deleteSecSysGrpIncBySysGrpIdx( null,
				SecSysGrpId );
			Iterator<ISecureSecSysGrpIncObj> iter = dict.values().iterator();
			ISecureSecSysGrpIncObj obj;
			List<ISecureSecSysGrpIncObj> toForget = new LinkedList<ISecureSecSysGrpIncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySysGrpIdx.remove( key );
		}
		else {
			schema.getSecureBackingStore().getTableSecSysGrpInc().deleteSecSysGrpIncBySysGrpIdx( null,
				SecSysGrpId );
		}
		deepDisposeSecSysGrpIncBySysGrpIdx( SecSysGrpId );
	}

	@Override
	public void deleteSecSysGrpIncByNameIdx( String InclName )
	{
		ISecureSecSysGrpIncByNameIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecSysGrpInc().newByNameIdxKey();
		key.setRequiredInclName( InclName );
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< ISecureSecSysGrpIncByNameIdxKey,
				Map< ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj > >();
		}
		if( indexByNameIdx.containsKey( key ) ) {
			Map<ISecureSecSysGrpIncPKey, ISecureSecSysGrpIncObj> dict = indexByNameIdx.get( key );
			schema.getSecureBackingStore().getTableSecSysGrpInc().deleteSecSysGrpIncByNameIdx( null,
				InclName );
			Iterator<ISecureSecSysGrpIncObj> iter = dict.values().iterator();
			ISecureSecSysGrpIncObj obj;
			List<ISecureSecSysGrpIncObj> toForget = new LinkedList<ISecureSecSysGrpIncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNameIdx.remove( key );
		}
		else {
			schema.getSecureBackingStore().getTableSecSysGrpInc().deleteSecSysGrpIncByNameIdx( null,
				InclName );
		}
		deepDisposeSecSysGrpIncByNameIdx( InclName );
	}
}
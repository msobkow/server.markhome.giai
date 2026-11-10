// Description: Java 11 Table Object implementation for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFSecSecGroupFormTableObj
	implements IYCFSecSecGroupFormTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> members;
	private Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> allSecGroupForm;
	private Map< YCFSecSecGroupFormByClusterIdxKey,
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > > indexByClusterIdx;
	private Map< YCFSecSecGroupFormByGroupIdxKey,
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > > indexByGroupIdx;
	private Map< YCFSecSecGroupFormByAppIdxKey,
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > > indexByAppIdx;
	private Map< YCFSecSecGroupFormByFormIdxKey,
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > > indexByFormIdx;
	private Map< YCFSecSecGroupFormByUFormIdxKey,
		IYCFSecSecGroupFormObj > indexByUFormIdx;
	public static String TABLE_NAME = "SecGroupForm";
	public static String TABLE_DBNAME = "secgrpfrm";

	public YCFSecSecGroupFormTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj>();
		allSecGroupForm = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByAppIdx = null;
		indexByFormIdx = null;
		indexByUFormIdx = null;
	}

	public YCFSecSecGroupFormTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj>();
		allSecGroupForm = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByAppIdx = null;
		indexByFormIdx = null;
		indexByUFormIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFSecSchemaObj)value;
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
		allSecGroupForm = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByAppIdx = null;
		indexByFormIdx = null;
		indexByUFormIdx = null;
		List<IYCFSecSecGroupFormObj> toForget = new LinkedList<IYCFSecSecGroupFormObj>();
		IYCFSecSecGroupFormObj cur = null;
		Iterator<IYCFSecSecGroupFormObj> iter = members.values().iterator();
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
	 *	YCFSecSecGroupFormObj.
	 */
	public IYCFSecSecGroupFormObj newInstance() {
		IYCFSecSecGroupFormObj inst = new YCFSecSecGroupFormObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecSecGroupFormObj.
	 */
	public IYCFSecSecGroupFormEditObj newEditInstance( IYCFSecSecGroupFormObj orig ) {
		IYCFSecSecGroupFormEditObj edit = new YCFSecSecGroupFormEditObj( orig );
		return( edit );
	}

	public IYCFSecSecGroupFormObj realiseSecGroupForm( IYCFSecSecGroupFormObj Obj ) {
		IYCFSecSecGroupFormObj obj = Obj;
		YCFSecSecGroupFormPKey pkey = obj.getPKey();
		IYCFSecSecGroupFormObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecGroupFormObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecSecGroupFormByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGroupFormByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByAppIdx != null ) {
				YCFSecSecGroupFormByAppIdxKey keyAppIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
				keyAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapAppIdx = indexByAppIdx.get( keyAppIdx );
				if( mapAppIdx != null ) {
					mapAppIdx.remove( keepObj.getPKey() );
					if( mapAppIdx.size() <= 0 ) {
						indexByAppIdx.remove( keyAppIdx );
					}
				}
			}

			if( indexByFormIdx != null ) {
				YCFSecSecGroupFormByFormIdxKey keyFormIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
				keyFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapFormIdx = indexByFormIdx.get( keyFormIdx );
				if( mapFormIdx != null ) {
					mapFormIdx.remove( keepObj.getPKey() );
					if( mapFormIdx.size() <= 0 ) {
						indexByFormIdx.remove( keyFormIdx );
					}
				}
			}

			if( indexByUFormIdx != null ) {
				YCFSecSecGroupFormByUFormIdxKey keyUFormIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
				keyUFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUFormIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				indexByUFormIdx.remove( keyUFormIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecSecGroupFormByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGroupFormByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAppIdx != null ) {
				YCFSecSecGroupFormByAppIdxKey keyAppIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
				keyAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapAppIdx = indexByAppIdx.get( keyAppIdx );
				if( mapAppIdx != null ) {
					mapAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFormIdx != null ) {
				YCFSecSecGroupFormByFormIdxKey keyFormIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
				keyFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapFormIdx = indexByFormIdx.get( keyFormIdx );
				if( mapFormIdx != null ) {
					mapFormIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUFormIdx != null ) {
				YCFSecSecGroupFormByUFormIdxKey keyUFormIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
				keyUFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUFormIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				indexByUFormIdx.put( keyUFormIdx, keepObj );
			}

			if( allSecGroupForm != null ) {
				allSecGroupForm.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecGroupForm != null ) {
				allSecGroupForm.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecSecGroupFormByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFSecSecGroupFormByGroupIdxKey keyGroupIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAppIdx != null ) {
				YCFSecSecGroupFormByAppIdxKey keyAppIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
				keyAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapAppIdx = indexByAppIdx.get( keyAppIdx );
				if( mapAppIdx != null ) {
					mapAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFormIdx != null ) {
				YCFSecSecGroupFormByFormIdxKey keyFormIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
				keyFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > mapFormIdx = indexByFormIdx.get( keyFormIdx );
				if( mapFormIdx != null ) {
					mapFormIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUFormIdx != null ) {
				YCFSecSecGroupFormByUFormIdxKey keyUFormIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
				keyUFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUFormIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				indexByUFormIdx.put( keyUFormIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecSecGroupFormObj createSecGroupForm( IYCFSecSecGroupFormObj Obj ) {
		IYCFSecSecGroupFormObj obj = Obj;
		YCFSecSecGroupFormBuff buff = obj.getSecGroupFormBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().createSecGroupForm(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecGroupFormObj readSecGroupForm( YCFSecSecGroupFormPKey pkey ) {
		return( readSecGroupForm( pkey, false ) );
	}

	public IYCFSecSecGroupFormObj readSecGroupForm( YCFSecSecGroupFormPKey pkey, boolean forceRead ) {
		IYCFSecSecGroupFormObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecGroupFormBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGroupFormId() );
			if( readBuff != null ) {
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecGroupFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGroupFormObj readCachedSecGroupForm( YCFSecSecGroupFormPKey pkey ) {
		IYCFSecSecGroupFormObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGroupForm( IYCFSecSecGroupFormObj obj )
	{
		final String S_ProcName = "YCFSecSecGroupFormTableObj.reallyDeepDisposeSecGroupForm() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecGroupFormPKey pkey = obj.getPKey();
		IYCFSecSecGroupFormObj existing = readCachedSecGroupForm( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecGroupFormByClusterIdxKey keyClusterIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGroupFormByGroupIdxKey keyGroupIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGroupFormByAppIdxKey keyAppIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		keyAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFSecSecGroupFormByFormIdxKey keyFormIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		keyFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFSecSecGroupFormByUFormIdxKey keyUFormIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
		keyUFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUFormIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );



		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByGroupIdx != null ) {
			if( indexByGroupIdx.containsKey( keyGroupIdx ) ) {
				indexByGroupIdx.get( keyGroupIdx ).remove( pkey );
				if( indexByGroupIdx.get( keyGroupIdx ).size() <= 0 ) {
					indexByGroupIdx.remove( keyGroupIdx );
				}
			}
		}

		if( indexByAppIdx != null ) {
			if( indexByAppIdx.containsKey( keyAppIdx ) ) {
				indexByAppIdx.get( keyAppIdx ).remove( pkey );
				if( indexByAppIdx.get( keyAppIdx ).size() <= 0 ) {
					indexByAppIdx.remove( keyAppIdx );
				}
			}
		}

		if( indexByFormIdx != null ) {
			if( indexByFormIdx.containsKey( keyFormIdx ) ) {
				indexByFormIdx.get( keyFormIdx ).remove( pkey );
				if( indexByFormIdx.get( keyFormIdx ).size() <= 0 ) {
					indexByFormIdx.remove( keyFormIdx );
				}
			}
		}

		if( indexByUFormIdx != null ) {
			indexByUFormIdx.remove( keyUFormIdx );
		}


	}
	public void deepDisposeSecGroupForm( YCFSecSecGroupFormPKey pkey ) {
		IYCFSecSecGroupFormObj obj = readCachedSecGroupForm( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecGroupFormObj lockSecGroupForm( YCFSecSecGroupFormPKey pkey ) {
		IYCFSecSecGroupFormObj locked = null;
		YCFSecSecGroupFormBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGroupFormTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecGroupFormObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGroupForm", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecGroupFormObj> readAllSecGroupForm() {
		return( readAllSecGroupForm( false ) );
	}

	public List<IYCFSecSecGroupFormObj> readAllSecGroupForm( boolean forceRead ) {
		final String S_ProcName = "readAllSecGroupForm";
		if( ( allSecGroupForm == null ) || forceRead ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> map = new HashMap<YCFSecSecGroupFormPKey,IYCFSecSecGroupFormObj>();
			allSecGroupForm = map;
			YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().readAllDerived( schema.getAuthorization() );
			YCFSecSecGroupFormBuff buff;
			IYCFSecSecGroupFormObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
			}
		}
		int len = allSecGroupForm.size();
		IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
		Iterator<IYCFSecSecGroupFormObj> valIter = allSecGroupForm.values().iterator();
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
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGroupFormObj> readCachedAllSecGroupForm() {
		final String S_ProcName = "readCachedAllSecGroupForm";
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>();
		if( allSecGroupForm != null ) {
			int len = allSecGroupForm.size();
			IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
			Iterator<IYCFSecSecGroupFormObj> valIter = allSecGroupForm.values().iterator();
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
		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecGroupForm-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecGroupFormObj> pageAllSecGroupForm(Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageAllSecGroupForm";
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> map = new HashMap<YCFSecSecGroupFormPKey,IYCFSecSecGroupFormObj>();
		YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecGroupFormId );
		YCFSecSecGroupFormBuff buff;
		IYCFSecSecGroupFormObj obj;
		IYCFSecSecGroupFormObj realised;
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecGroupFormObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId )
	{
		return( readSecGroupFormByIdIdx( ClusterId,
			SecGroupFormId,
			false ) );
	}

	public IYCFSecSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId, boolean forceRead )
	{
		YCFSecSecGroupFormPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupFormId( SecGroupFormId );
		IYCFSecSecGroupFormObj obj = readSecGroupForm( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId )
	{
		return( readSecGroupFormByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByClusterIdx";
		YCFSecSecGroupFormByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGroupFormByClusterIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj>();
			IYCFSecSecGroupFormObj obj;
			YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
		Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGroupFormByGroupIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByGroupIdx";
		YCFSecSecGroupFormByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecSecGroupFormByGroupIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj>();
			IYCFSecSecGroupFormObj obj;
			YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			YCFSecSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
		Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId )
	{
		return( readSecGroupFormByAppIdx( ClusterId,
			SecAppId,
			false ) );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByAppIdx";
		YCFSecSecGroupFormByAppIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
		if( indexByAppIdx == null ) {
			indexByAppIdx = new HashMap< YCFSecSecGroupFormByAppIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByAppIdx.containsKey( key ) ) {
			dict = indexByAppIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj>();
			IYCFSecSecGroupFormObj obj;
			YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			YCFSecSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByAppIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
		Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId )
	{
		return( readSecGroupFormByFormIdx( ClusterId,
			SecFormId,
			false ) );
	}

	public List<IYCFSecSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByFormIdx";
		YCFSecSecGroupFormByFormIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
		if( indexByFormIdx == null ) {
			indexByFormIdx = new HashMap< YCFSecSecGroupFormByFormIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByFormIdx.containsKey( key ) ) {
			dict = indexByFormIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj>();
			IYCFSecSecGroupFormObj obj;
			YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByFormIdx( schema.getAuthorization(),
				ClusterId,
				SecFormId );
			YCFSecSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFormIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
		Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecGroupFormObj readSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		return( readSecGroupFormByUFormIdx( ClusterId,
			SecGroupId,
			SecFormId,
			false ) );
	}

	public IYCFSecSecGroupFormObj readSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId, boolean forceRead )
	{
		if( indexByUFormIdx == null ) {
			indexByUFormIdx = new HashMap< YCFSecSecGroupFormByUFormIdxKey,
				IYCFSecSecGroupFormObj >();
		}
		YCFSecSecGroupFormByUFormIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );
		IYCFSecSecGroupFormObj obj = null;
		if( ( ! forceRead ) && indexByUFormIdx.containsKey( key ) ) {
			obj = indexByUFormIdx.get( key );
		}
		else {
			YCFSecSecGroupFormBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByUFormIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecFormId );
			if( buff != null ) {
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecGroupFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecGroupFormObj readCachedSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId )
	{
		IYCFSecSecGroupFormObj obj = null;
		YCFSecSecGroupFormPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupFormId( SecGroupFormId );
		obj = readCachedSecGroupForm( pkey );
		return( obj );
	}

	public List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGroupFormByClusterIdx";
		YCFSecSecGroupFormByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
				Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFSecSecGroupFormObj obj;
			Iterator<IYCFSecSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "readCachedSecGroupFormByGroupIdx";
		YCFSecSecGroupFormByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
				Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFSecSecGroupFormObj obj;
			Iterator<IYCFSecSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "readCachedSecGroupFormByAppIdx";
		YCFSecSecGroupFormByAppIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>();
		if( indexByAppIdx != null ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
			if( indexByAppIdx.containsKey( key ) ) {
				dict = indexByAppIdx.get( key );
				int len = dict.size();
				IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
				Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFSecSecGroupFormObj obj;
			Iterator<IYCFSecSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecSecGroupFormObj> readCachedSecGroupFormByFormIdx( long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "readCachedSecGroupFormByFormIdx";
		YCFSecSecGroupFormByFormIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		ArrayList<IYCFSecSecGroupFormObj> arrayList = new ArrayList<IYCFSecSecGroupFormObj>();
		if( indexByFormIdx != null ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict;
			if( indexByFormIdx.containsKey( key ) ) {
				dict = indexByFormIdx.get( key );
				int len = dict.size();
				IYCFSecSecGroupFormObj arr[] = new IYCFSecSecGroupFormObj[len];
				Iterator<IYCFSecSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFSecSecGroupFormObj obj;
			Iterator<IYCFSecSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecGroupFormObj> cmp = new Comparator<IYCFSecSecGroupFormObj>() {
			public int compare( IYCFSecSecGroupFormObj lhs, IYCFSecSecGroupFormObj rhs ) {
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
					YCFSecSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFSecSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecGroupFormObj readCachedSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		IYCFSecSecGroupFormObj obj = null;
		YCFSecSecGroupFormByUFormIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );
		if( indexByUFormIdx != null ) {
			if( indexByUFormIdx.containsKey( key ) ) {
				obj = indexByUFormIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecGroupFormObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecGroupFormObj> valIter = members.values().iterator();
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

	public void deepDisposeSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId )
	{
		IYCFSecSecGroupFormObj obj = readCachedSecGroupFormByIdIdx( ClusterId,
				SecGroupFormId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGroupFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGroupFormByClusterIdx";
		IYCFSecSecGroupFormObj obj;
		List<IYCFSecSecGroupFormObj> arrayList = readCachedSecGroupFormByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGroupFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "deepDisposeSecGroupFormByGroupIdx";
		IYCFSecSecGroupFormObj obj;
		List<IYCFSecSecGroupFormObj> arrayList = readCachedSecGroupFormByGroupIdx( ClusterId,
				SecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGroupFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupFormByAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "deepDisposeSecGroupFormByAppIdx";
		IYCFSecSecGroupFormObj obj;
		List<IYCFSecSecGroupFormObj> arrayList = readCachedSecGroupFormByAppIdx( ClusterId,
				SecAppId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGroupFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupFormByFormIdx( long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "deepDisposeSecGroupFormByFormIdx";
		IYCFSecSecGroupFormObj obj;
		List<IYCFSecSecGroupFormObj> arrayList = readCachedSecGroupFormByFormIdx( ClusterId,
				SecFormId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecGroupFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		IYCFSecSecGroupFormObj obj = readCachedSecGroupFormByUFormIdx( ClusterId,
				SecGroupId,
				SecFormId );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGroupFormObj> pageSecGroupFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByClusterIdx";
		YCFSecSecGroupFormByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecSecGroupFormObj> retList = new LinkedList<IYCFSecSecGroupFormObj>();
		IYCFSecSecGroupFormObj obj;
		YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecGroupFormId );
		YCFSecSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGroupFormObj> pageSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByGroupIdx";
		YCFSecSecGroupFormByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		List<IYCFSecSecGroupFormObj> retList = new LinkedList<IYCFSecSecGroupFormObj>();
		IYCFSecSecGroupFormObj obj;
		YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
			priorClusterId,
			priorSecGroupFormId );
		YCFSecSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate AppIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGroupFormObj> pageSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByAppIdx";
		YCFSecSecGroupFormByAppIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		List<IYCFSecSecGroupFormObj> retList = new LinkedList<IYCFSecSecGroupFormObj>();
		IYCFSecSecGroupFormObj obj;
		YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
			priorClusterId,
			priorSecGroupFormId );
		YCFSecSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecGroupForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate FormIdx key attributes.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecGroupForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecGroupFormObj> pageSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByFormIdx";
		YCFSecSecGroupFormByFormIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		List<IYCFSecSecGroupFormObj> retList = new LinkedList<IYCFSecSecGroupFormObj>();
		IYCFSecSecGroupFormObj obj;
		YCFSecSecGroupFormBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByFormIdx( schema.getAuthorization(),
				ClusterId,
				SecFormId,
			priorClusterId,
			priorSecGroupFormId );
		YCFSecSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecGroupFormObj realised = (IYCFSecSecGroupFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecGroupFormObj updateSecGroupForm( IYCFSecSecGroupFormObj Obj ) {
		IYCFSecSecGroupFormObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().updateSecGroupForm( schema.getAuthorization(),
			Obj.getSecGroupFormBuff() );
		obj = (IYCFSecSecGroupFormObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGroupForm( IYCFSecSecGroupFormObj Obj ) {
		IYCFSecSecGroupFormObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupForm( schema.getAuthorization(),
			obj.getSecGroupFormBuff() );
		Obj.forget();
	}

	public void deleteSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId )
	{
		YCFSecSecGroupFormPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupFormId( SecGroupFormId );
		IYCFSecSecGroupFormObj obj = readSecGroupForm( pkey );
		if( obj != null ) {
			IYCFSecSecGroupFormEditObj editObj = (IYCFSecSecGroupFormEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecGroupFormEditObj)obj.beginEdit();
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
		deepDisposeSecGroupFormByIdIdx( ClusterId,
				SecGroupFormId );
	}

	public void deleteSecGroupFormByClusterIdx( long ClusterId )
	{
		YCFSecSecGroupFormByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecGroupFormByClusterIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict = indexByClusterIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecSecGroupFormObj> iter = dict.values().iterator();
			IYCFSecSecGroupFormObj obj;
			List<IYCFSecSecGroupFormObj> toForget = new LinkedList<IYCFSecSecGroupFormObj>();
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
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGroupFormByClusterIdx( ClusterId );
	}

	public void deleteSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		YCFSecSecGroupFormByGroupIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFSecSecGroupFormByGroupIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict = indexByGroupIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			Iterator<IYCFSecSecGroupFormObj> iter = dict.values().iterator();
			IYCFSecSecGroupFormObj obj;
			List<IYCFSecSecGroupFormObj> toForget = new LinkedList<IYCFSecSecGroupFormObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGroupIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
		}
		deepDisposeSecGroupFormByGroupIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGroupFormByAppIdx( long ClusterId,
		int SecAppId )
	{
		YCFSecSecGroupFormByAppIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		if( indexByAppIdx == null ) {
			indexByAppIdx = new HashMap< YCFSecSecGroupFormByAppIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( indexByAppIdx.containsKey( key ) ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict = indexByAppIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			Iterator<IYCFSecSecGroupFormObj> iter = dict.values().iterator();
			IYCFSecSecGroupFormObj obj;
			List<IYCFSecSecGroupFormObj> toForget = new LinkedList<IYCFSecSecGroupFormObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByAppIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
		}
		deepDisposeSecGroupFormByAppIdx( ClusterId,
				SecAppId );
	}

	public void deleteSecGroupFormByFormIdx( long ClusterId,
		int SecFormId )
	{
		YCFSecSecGroupFormByFormIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		if( indexByFormIdx == null ) {
			indexByFormIdx = new HashMap< YCFSecSecGroupFormByFormIdxKey,
				Map< YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj > >();
		}
		if( indexByFormIdx.containsKey( key ) ) {
			Map<YCFSecSecGroupFormPKey, IYCFSecSecGroupFormObj> dict = indexByFormIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByFormIdx( schema.getAuthorization(),
				ClusterId,
				SecFormId );
			Iterator<IYCFSecSecGroupFormObj> iter = dict.values().iterator();
			IYCFSecSecGroupFormObj obj;
			List<IYCFSecSecGroupFormObj> toForget = new LinkedList<IYCFSecSecGroupFormObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFormIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByFormIdx( schema.getAuthorization(),
				ClusterId,
				SecFormId );
		}
		deepDisposeSecGroupFormByFormIdx( ClusterId,
				SecFormId );
	}

	public void deleteSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		if( indexByUFormIdx == null ) {
			indexByUFormIdx = new HashMap< YCFSecSecGroupFormByUFormIdxKey,
				IYCFSecSecGroupFormObj >();
		}
		YCFSecSecGroupFormByUFormIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );
		IYCFSecSecGroupFormObj obj = null;
		if( indexByUFormIdx.containsKey( key ) ) {
			obj = indexByUFormIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByUFormIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecFormId );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByUFormIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecFormId );
		}
		deepDisposeSecGroupFormByUFormIdx( ClusterId,
				SecGroupId,
				SecFormId );
	}
}

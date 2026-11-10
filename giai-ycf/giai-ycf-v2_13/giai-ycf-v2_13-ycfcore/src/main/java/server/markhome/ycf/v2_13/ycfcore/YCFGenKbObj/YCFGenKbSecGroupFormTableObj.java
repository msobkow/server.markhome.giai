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

public class YCFGenKbSecGroupFormTableObj
	implements IYCFGenKbSecGroupFormTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> members;
	private Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> allSecGroupForm;
	private Map< YCFGenKbSecGroupFormByClusterIdxKey,
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > > indexByClusterIdx;
	private Map< YCFGenKbSecGroupFormByGroupIdxKey,
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > > indexByGroupIdx;
	private Map< YCFGenKbSecGroupFormByAppIdxKey,
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > > indexByAppIdx;
	private Map< YCFGenKbSecGroupFormByFormIdxKey,
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > > indexByFormIdx;
	private Map< YCFGenKbSecGroupFormByUFormIdxKey,
		IYCFGenKbSecGroupFormObj > indexByUFormIdx;
	public static String TABLE_NAME = "SecGroupForm";
	public static String TABLE_DBNAME = "secgrpfrm";

	public YCFGenKbSecGroupFormTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj>();
		allSecGroupForm = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByAppIdx = null;
		indexByFormIdx = null;
		indexByUFormIdx = null;
	}

	public YCFGenKbSecGroupFormTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj>();
		allSecGroupForm = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByAppIdx = null;
		indexByFormIdx = null;
		indexByUFormIdx = null;
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
		allSecGroupForm = null;
		indexByClusterIdx = null;
		indexByGroupIdx = null;
		indexByAppIdx = null;
		indexByFormIdx = null;
		indexByUFormIdx = null;
		List<IYCFGenKbSecGroupFormObj> toForget = new LinkedList<IYCFGenKbSecGroupFormObj>();
		IYCFGenKbSecGroupFormObj cur = null;
		Iterator<IYCFGenKbSecGroupFormObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecGroupFormObj.
	 */
	public IYCFGenKbSecGroupFormObj newInstance() {
		IYCFGenKbSecGroupFormObj inst = new YCFGenKbSecGroupFormObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecGroupFormObj.
	 */
	public IYCFGenKbSecGroupFormEditObj newEditInstance( IYCFGenKbSecGroupFormObj orig ) {
		IYCFGenKbSecGroupFormEditObj edit = new YCFGenKbSecGroupFormEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecGroupFormObj realiseSecGroupForm( IYCFGenKbSecGroupFormObj Obj ) {
		IYCFGenKbSecGroupFormObj obj = Obj;
		YCFGenKbSecGroupFormPKey pkey = obj.getPKey();
		IYCFGenKbSecGroupFormObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecGroupFormObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGroupFormByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGroupFormByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByAppIdx != null ) {
				YCFGenKbSecGroupFormByAppIdxKey keyAppIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
				keyAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapAppIdx = indexByAppIdx.get( keyAppIdx );
				if( mapAppIdx != null ) {
					mapAppIdx.remove( keepObj.getPKey() );
					if( mapAppIdx.size() <= 0 ) {
						indexByAppIdx.remove( keyAppIdx );
					}
				}
			}

			if( indexByFormIdx != null ) {
				YCFGenKbSecGroupFormByFormIdxKey keyFormIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
				keyFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapFormIdx = indexByFormIdx.get( keyFormIdx );
				if( mapFormIdx != null ) {
					mapFormIdx.remove( keepObj.getPKey() );
					if( mapFormIdx.size() <= 0 ) {
						indexByFormIdx.remove( keyFormIdx );
					}
				}
			}

			if( indexByUFormIdx != null ) {
				YCFGenKbSecGroupFormByUFormIdxKey keyUFormIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
				keyUFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUFormIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				indexByUFormIdx.remove( keyUFormIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbSecGroupFormByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGroupFormByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAppIdx != null ) {
				YCFGenKbSecGroupFormByAppIdxKey keyAppIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
				keyAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapAppIdx = indexByAppIdx.get( keyAppIdx );
				if( mapAppIdx != null ) {
					mapAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFormIdx != null ) {
				YCFGenKbSecGroupFormByFormIdxKey keyFormIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
				keyFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapFormIdx = indexByFormIdx.get( keyFormIdx );
				if( mapFormIdx != null ) {
					mapFormIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUFormIdx != null ) {
				YCFGenKbSecGroupFormByUFormIdxKey keyUFormIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
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
				YCFGenKbSecGroupFormByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				YCFGenKbSecGroupFormByGroupIdxKey keyGroupIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
				keyGroupIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyGroupIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAppIdx != null ) {
				YCFGenKbSecGroupFormByAppIdxKey keyAppIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
				keyAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapAppIdx = indexByAppIdx.get( keyAppIdx );
				if( mapAppIdx != null ) {
					mapAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFormIdx != null ) {
				YCFGenKbSecGroupFormByFormIdxKey keyFormIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
				keyFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > mapFormIdx = indexByFormIdx.get( keyFormIdx );
				if( mapFormIdx != null ) {
					mapFormIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUFormIdx != null ) {
				YCFGenKbSecGroupFormByUFormIdxKey keyUFormIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
				keyUFormIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUFormIdx.setRequiredSecGroupId( keepObj.getRequiredSecGroupId() );
				keyUFormIdx.setRequiredSecFormId( keepObj.getRequiredSecFormId() );
				indexByUFormIdx.put( keyUFormIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecGroupFormObj createSecGroupForm( IYCFGenKbSecGroupFormObj Obj ) {
		IYCFGenKbSecGroupFormObj obj = Obj;
		YCFGenKbSecGroupFormBuff buff = obj.getSecGroupFormBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().createSecGroupForm(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecGroupFormObj readSecGroupForm( YCFGenKbSecGroupFormPKey pkey ) {
		return( readSecGroupForm( pkey, false ) );
	}

	public IYCFGenKbSecGroupFormObj readSecGroupForm( YCFGenKbSecGroupFormPKey pkey, boolean forceRead ) {
		IYCFGenKbSecGroupFormObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecGroupFormBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecGroupFormId() );
			if( readBuff != null ) {
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecGroupFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGroupFormObj readCachedSecGroupForm( YCFGenKbSecGroupFormPKey pkey ) {
		IYCFGenKbSecGroupFormObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecGroupForm( IYCFGenKbSecGroupFormObj obj )
	{
		final String S_ProcName = "YCFGenKbSecGroupFormTableObj.reallyDeepDisposeSecGroupForm() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecGroupFormPKey pkey = obj.getPKey();
		IYCFGenKbSecGroupFormObj existing = readCachedSecGroupForm( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecGroupFormByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGroupFormByGroupIdxKey keyGroupIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGroupFormByAppIdxKey keyAppIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		keyAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFGenKbSecGroupFormByFormIdxKey keyFormIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		keyFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFGenKbSecGroupFormByUFormIdxKey keyUFormIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
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
	public void deepDisposeSecGroupForm( YCFGenKbSecGroupFormPKey pkey ) {
		IYCFGenKbSecGroupFormObj obj = readCachedSecGroupForm( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecGroupFormObj lockSecGroupForm( YCFGenKbSecGroupFormPKey pkey ) {
		IYCFGenKbSecGroupFormObj locked = null;
		YCFGenKbSecGroupFormBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecGroupFormTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecGroupFormObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecGroupForm", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecGroupFormObj> readAllSecGroupForm() {
		return( readAllSecGroupForm( false ) );
	}

	public List<IYCFGenKbSecGroupFormObj> readAllSecGroupForm( boolean forceRead ) {
		final String S_ProcName = "readAllSecGroupForm";
		if( ( allSecGroupForm == null ) || forceRead ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> map = new HashMap<YCFGenKbSecGroupFormPKey,IYCFGenKbSecGroupFormObj>();
			allSecGroupForm = map;
			YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecGroupFormBuff buff;
			IYCFGenKbSecGroupFormObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
			}
		}
		int len = allSecGroupForm.size();
		IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
		Iterator<IYCFGenKbSecGroupFormObj> valIter = allSecGroupForm.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGroupFormObj> readCachedAllSecGroupForm() {
		final String S_ProcName = "readCachedAllSecGroupForm";
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>();
		if( allSecGroupForm != null ) {
			int len = allSecGroupForm.size();
			IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
			Iterator<IYCFGenKbSecGroupFormObj> valIter = allSecGroupForm.values().iterator();
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
		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbSecGroupFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecGroupFormObj> pageAllSecGroupForm(Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageAllSecGroupForm";
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> map = new HashMap<YCFGenKbSecGroupFormPKey,IYCFGenKbSecGroupFormObj>();
		YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecGroupFormId );
		YCFGenKbSecGroupFormBuff buff;
		IYCFGenKbSecGroupFormObj obj;
		IYCFGenKbSecGroupFormObj realised;
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecGroupFormObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId )
	{
		return( readSecGroupFormByIdIdx( ClusterId,
			SecGroupFormId,
			false ) );
	}

	public IYCFGenKbSecGroupFormObj readSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId, boolean forceRead )
	{
		YCFGenKbSecGroupFormPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupFormId( SecGroupFormId );
		IYCFGenKbSecGroupFormObj obj = readSecGroupForm( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId )
	{
		return( readSecGroupFormByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByClusterIdx";
		YCFGenKbSecGroupFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGroupFormByClusterIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj>();
			IYCFGenKbSecGroupFormObj obj;
			YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
		Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		return( readSecGroupFormByGroupIdx( ClusterId,
			SecGroupId,
			false ) );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByGroupIdx";
		YCFGenKbSecGroupFormByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbSecGroupFormByGroupIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj>();
			IYCFGenKbSecGroupFormObj obj;
			YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			YCFGenKbSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
		Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId )
	{
		return( readSecGroupFormByAppIdx( ClusterId,
			SecAppId,
			false ) );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByAppIdx";
		YCFGenKbSecGroupFormByAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
		if( indexByAppIdx == null ) {
			indexByAppIdx = new HashMap< YCFGenKbSecGroupFormByAppIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByAppIdx.containsKey( key ) ) {
			dict = indexByAppIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj>();
			IYCFGenKbSecGroupFormObj obj;
			YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			YCFGenKbSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByAppIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
		Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId )
	{
		return( readSecGroupFormByFormIdx( ClusterId,
			SecFormId,
			false ) );
	}

	public List<IYCFGenKbSecGroupFormObj> readSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecGroupFormByFormIdx";
		YCFGenKbSecGroupFormByFormIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
		if( indexByFormIdx == null ) {
			indexByFormIdx = new HashMap< YCFGenKbSecGroupFormByFormIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( ( ! forceRead ) && indexByFormIdx.containsKey( key ) ) {
			dict = indexByFormIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj>();
			IYCFGenKbSecGroupFormObj obj;
			YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByFormIdx( schema.getAuthorization(),
				ClusterId,
				SecFormId );
			YCFGenKbSecGroupFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFormIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
		Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecGroupFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecGroupFormObj readSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		return( readSecGroupFormByUFormIdx( ClusterId,
			SecGroupId,
			SecFormId,
			false ) );
	}

	public IYCFGenKbSecGroupFormObj readSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId, boolean forceRead )
	{
		if( indexByUFormIdx == null ) {
			indexByUFormIdx = new HashMap< YCFGenKbSecGroupFormByUFormIdxKey,
				IYCFGenKbSecGroupFormObj >();
		}
		YCFGenKbSecGroupFormByUFormIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );
		IYCFGenKbSecGroupFormObj obj = null;
		if( ( ! forceRead ) && indexByUFormIdx.containsKey( key ) ) {
			obj = indexByUFormIdx.get( key );
		}
		else {
			YCFGenKbSecGroupFormBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().readDerivedByUFormIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecFormId );
			if( buff != null ) {
				obj = schema.getSecGroupFormTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecGroupFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecGroupFormObj readCachedSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId )
	{
		IYCFGenKbSecGroupFormObj obj = null;
		YCFGenKbSecGroupFormPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupFormId( SecGroupFormId );
		obj = readCachedSecGroupForm( pkey );
		return( obj );
	}

	public List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecGroupFormByClusterIdx";
		YCFGenKbSecGroupFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
				Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGroupFormObj obj;
			Iterator<IYCFGenKbSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "readCachedSecGroupFormByGroupIdx";
		YCFGenKbSecGroupFormByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>();
		if( indexByGroupIdx != null ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
				Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGroupFormObj obj;
			Iterator<IYCFGenKbSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "readCachedSecGroupFormByAppIdx";
		YCFGenKbSecGroupFormByAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>();
		if( indexByAppIdx != null ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
			if( indexByAppIdx.containsKey( key ) ) {
				dict = indexByAppIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
				Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGroupFormObj obj;
			Iterator<IYCFGenKbSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFGenKbSecGroupFormObj> readCachedSecGroupFormByFormIdx( long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "readCachedSecGroupFormByFormIdx";
		YCFGenKbSecGroupFormByFormIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		ArrayList<IYCFGenKbSecGroupFormObj> arrayList = new ArrayList<IYCFGenKbSecGroupFormObj>();
		if( indexByFormIdx != null ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict;
			if( indexByFormIdx.containsKey( key ) ) {
				dict = indexByFormIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecGroupFormObj arr[] = new IYCFGenKbSecGroupFormObj[len];
				Iterator<IYCFGenKbSecGroupFormObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecGroupFormObj obj;
			Iterator<IYCFGenKbSecGroupFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecGroupFormObj> cmp = new Comparator<IYCFGenKbSecGroupFormObj>() {
			public int compare( IYCFGenKbSecGroupFormObj lhs, IYCFGenKbSecGroupFormObj rhs ) {
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
					YCFGenKbSecGroupFormPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecGroupFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecGroupFormObj readCachedSecGroupFormByUFormIdx( long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		IYCFGenKbSecGroupFormObj obj = null;
		YCFGenKbSecGroupFormByUFormIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );
		if( indexByUFormIdx != null ) {
			if( indexByUFormIdx.containsKey( key ) ) {
				obj = indexByUFormIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecGroupFormObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecGroupFormObj> valIter = members.values().iterator();
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
		IYCFGenKbSecGroupFormObj obj = readCachedSecGroupFormByIdIdx( ClusterId,
				SecGroupFormId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecGroupFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecGroupFormByClusterIdx";
		IYCFGenKbSecGroupFormObj obj;
		List<IYCFGenKbSecGroupFormObj> arrayList = readCachedSecGroupFormByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGroupFormObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGroupFormObj obj;
		List<IYCFGenKbSecGroupFormObj> arrayList = readCachedSecGroupFormByGroupIdx( ClusterId,
				SecGroupId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGroupFormObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGroupFormObj obj;
		List<IYCFGenKbSecGroupFormObj> arrayList = readCachedSecGroupFormByAppIdx( ClusterId,
				SecAppId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGroupFormObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGroupFormObj obj;
		List<IYCFGenKbSecGroupFormObj> arrayList = readCachedSecGroupFormByFormIdx( ClusterId,
				SecFormId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecGroupFormObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecGroupFormObj obj = readCachedSecGroupFormByUFormIdx( ClusterId,
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
	public List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByClusterIdx";
		YCFGenKbSecGroupFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFGenKbSecGroupFormObj> retList = new LinkedList<IYCFGenKbSecGroupFormObj>();
		IYCFGenKbSecGroupFormObj obj;
		YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecGroupFormId );
		YCFGenKbSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
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
	public List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByGroupIdx";
		YCFGenKbSecGroupFormByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		List<IYCFGenKbSecGroupFormObj> retList = new LinkedList<IYCFGenKbSecGroupFormObj>();
		IYCFGenKbSecGroupFormObj obj;
		YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
			priorClusterId,
			priorSecGroupFormId );
		YCFGenKbSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
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
	public List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByAppIdx";
		YCFGenKbSecGroupFormByAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		List<IYCFGenKbSecGroupFormObj> retList = new LinkedList<IYCFGenKbSecGroupFormObj>();
		IYCFGenKbSecGroupFormObj obj;
		YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
			priorClusterId,
			priorSecGroupFormId );
		YCFGenKbSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
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
	public List<IYCFGenKbSecGroupFormObj> pageSecGroupFormByFormIdx( long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageSecGroupFormByFormIdx";
		YCFGenKbSecGroupFormByFormIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		List<IYCFGenKbSecGroupFormObj> retList = new LinkedList<IYCFGenKbSecGroupFormObj>();
		IYCFGenKbSecGroupFormObj obj;
		YCFGenKbSecGroupFormBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().pageBuffByFormIdx( schema.getAuthorization(),
				ClusterId,
				SecFormId,
			priorClusterId,
			priorSecGroupFormId );
		YCFGenKbSecGroupFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecGroupFormTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecGroupFormObj realised = (IYCFGenKbSecGroupFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecGroupFormObj updateSecGroupForm( IYCFGenKbSecGroupFormObj Obj ) {
		IYCFGenKbSecGroupFormObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().updateSecGroupForm( schema.getAuthorization(),
			Obj.getSecGroupFormBuff() );
		obj = (IYCFGenKbSecGroupFormObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecGroupForm( IYCFGenKbSecGroupFormObj Obj ) {
		IYCFGenKbSecGroupFormObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupForm( schema.getAuthorization(),
			obj.getSecGroupFormBuff() );
		Obj.forget();
	}

	public void deleteSecGroupFormByIdIdx( long ClusterId,
		long SecGroupFormId )
	{
		YCFGenKbSecGroupFormPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecGroupFormId( SecGroupFormId );
		IYCFGenKbSecGroupFormObj obj = readSecGroupForm( pkey );
		if( obj != null ) {
			IYCFGenKbSecGroupFormEditObj editObj = (IYCFGenKbSecGroupFormEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecGroupFormEditObj)obj.beginEdit();
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
		YCFGenKbSecGroupFormByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecGroupFormByClusterIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbSecGroupFormObj> iter = dict.values().iterator();
			IYCFGenKbSecGroupFormObj obj;
			List<IYCFGenKbSecGroupFormObj> toForget = new LinkedList<IYCFGenKbSecGroupFormObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecGroupFormByClusterIdx( ClusterId );
	}

	public void deleteSecGroupFormByGroupIdx( long ClusterId,
		int SecGroupId )
	{
		YCFGenKbSecGroupFormByGroupIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< YCFGenKbSecGroupFormByGroupIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict = indexByGroupIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
			Iterator<IYCFGenKbSecGroupFormObj> iter = dict.values().iterator();
			IYCFGenKbSecGroupFormObj obj;
			List<IYCFGenKbSecGroupFormObj> toForget = new LinkedList<IYCFGenKbSecGroupFormObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByGroupIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId );
		}
		deepDisposeSecGroupFormByGroupIdx( ClusterId,
				SecGroupId );
	}

	public void deleteSecGroupFormByAppIdx( long ClusterId,
		int SecAppId )
	{
		YCFGenKbSecGroupFormByAppIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		if( indexByAppIdx == null ) {
			indexByAppIdx = new HashMap< YCFGenKbSecGroupFormByAppIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( indexByAppIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict = indexByAppIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			Iterator<IYCFGenKbSecGroupFormObj> iter = dict.values().iterator();
			IYCFGenKbSecGroupFormObj obj;
			List<IYCFGenKbSecGroupFormObj> toForget = new LinkedList<IYCFGenKbSecGroupFormObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
		}
		deepDisposeSecGroupFormByAppIdx( ClusterId,
				SecAppId );
	}

	public void deleteSecGroupFormByFormIdx( long ClusterId,
		int SecFormId )
	{
		YCFGenKbSecGroupFormByFormIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );
		if( indexByFormIdx == null ) {
			indexByFormIdx = new HashMap< YCFGenKbSecGroupFormByFormIdxKey,
				Map< YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj > >();
		}
		if( indexByFormIdx.containsKey( key ) ) {
			Map<YCFGenKbSecGroupFormPKey, IYCFGenKbSecGroupFormObj> dict = indexByFormIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByFormIdx( schema.getAuthorization(),
				ClusterId,
				SecFormId );
			Iterator<IYCFGenKbSecGroupFormObj> iter = dict.values().iterator();
			IYCFGenKbSecGroupFormObj obj;
			List<IYCFGenKbSecGroupFormObj> toForget = new LinkedList<IYCFGenKbSecGroupFormObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByFormIdx( schema.getAuthorization(),
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
			indexByUFormIdx = new HashMap< YCFGenKbSecGroupFormByUFormIdxKey,
				IYCFGenKbSecGroupFormObj >();
		}
		YCFGenKbSecGroupFormByUFormIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );
		IYCFGenKbSecGroupFormObj obj = null;
		if( indexByUFormIdx.containsKey( key ) ) {
			obj = indexByUFormIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByUFormIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecFormId );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecGroupForm().deleteSecGroupFormByUFormIdx( schema.getAuthorization(),
				ClusterId,
				SecGroupId,
				SecFormId );
		}
		deepDisposeSecGroupFormByUFormIdx( ClusterId,
				SecGroupId,
				SecFormId );
	}
}

// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
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

public class YCFBamIndexTweakTableObj
	implements IYCFBamIndexTweakTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> members;
	private Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> allIndexTweak;
	private Map< YCFBamTweakByUNameIdxKey,
		IYCFBamIndexTweakObj > indexByUNameIdx;
	private Map< YCFBamTweakByUDefIdxKey,
		IYCFBamIndexTweakObj > indexByUDefIdx;
	private Map< YCFBamTweakByValTentIdxKey,
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > > indexByValTentIdx;
	private Map< YCFBamTweakByScopeIdxKey,
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > > indexByScopeIdx;
	private Map< YCFBamTweakByDefSchemaIdxKey,
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > > indexByDefSchemaIdx;
	private Map< YCFBamIndexTweakByIndexIdxKey,
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > > indexByIndexIdx;
	public static String TABLE_NAME = "IndexTweak";
	public static String TABLE_DBNAME = "idxtwk";

	public YCFBamIndexTweakTableObj() {
		schema = null;
		members = new HashMap<YCFBamTweakPKey, IYCFBamIndexTweakObj>();
		allIndexTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByIndexIdx = null;
	}

	public YCFBamIndexTweakTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamTweakPKey, IYCFBamIndexTweakObj>();
		allIndexTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByIndexIdx = null;
	}

	public IYCFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFBamSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( IYCFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allIndexTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByIndexIdx = null;
		List<IYCFBamIndexTweakObj> toForget = new LinkedList<IYCFBamIndexTweakObj>();
		IYCFBamIndexTweakObj cur = null;
		Iterator<IYCFBamIndexTweakObj> iter = members.values().iterator();
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
	 *	YCFBamIndexTweakObj.
	 */
	public IYCFBamIndexTweakObj newInstance() {
		IYCFBamIndexTweakObj inst = new YCFBamIndexTweakObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamIndexTweakObj.
	 */
	public IYCFBamIndexTweakEditObj newEditInstance( IYCFBamIndexTweakObj orig ) {
		IYCFBamIndexTweakEditObj edit = new YCFBamIndexTweakEditObj( orig );
		return( edit );
	}

	public IYCFBamIndexTweakObj realiseIndexTweak( IYCFBamIndexTweakObj Obj ) {
		IYCFBamIndexTweakObj obj = Obj;
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamIndexTweakObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamIndexTweakObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFBamTweakByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByUDefIdx != null ) {
				YCFBamTweakByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.remove( keyUDefIdx );
			}

			if( indexByValTentIdx != null ) {
				YCFBamTweakByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByIndexIdx != null ) {
				YCFBamIndexTweakByIndexIdxKey keyIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.remove( keepObj.getPKey() );
					if( mapIndexIdx.size() <= 0 ) {
						indexByIndexIdx.remove( keyIndexIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().realiseTweak( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				YCFBamTweakByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				YCFBamTweakByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				YCFBamTweakByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				YCFBamIndexTweakByIndexIdxKey keyIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allIndexTweak != null ) {
				allIndexTweak.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().realiseTweak( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allIndexTweak != null ) {
				allIndexTweak.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				YCFBamTweakByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				YCFBamTweakByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				YCFBamTweakByValTentIdxKey keyValTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				YCFBamIndexTweakByIndexIdxKey keyIndexIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<YCFBamTweakPKey, IYCFBamIndexTweakObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamIndexTweakObj createIndexTweak( IYCFBamIndexTweakObj Obj ) {
		IYCFBamIndexTweakObj obj = Obj;
		YCFBamIndexTweakBuff buff = obj.getIndexTweakBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().createIndexTweak(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a80b" ) ) {
			obj = (IYCFBamIndexTweakObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamIndexTweakObj readIndexTweak( YCFBamTweakPKey pkey ) {
		return( readIndexTweak( pkey, false ) );
	}

	public IYCFBamIndexTweakObj readIndexTweak( YCFBamTweakPKey pkey, boolean forceRead ) {
		IYCFBamIndexTweakObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamIndexTweakBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamIndexTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamIndexTweakObj readCachedIndexTweak( YCFBamTweakPKey pkey ) {
		IYCFBamIndexTweakObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeIndexTweak( IYCFBamIndexTweakObj obj )
	{
		final String S_ProcName = "YCFBamIndexTweakTableObj.reallyDeepDisposeIndexTweak() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamIndexTweakObj existing = readCachedIndexTweak( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamIndexTweakByIndexIdxKey keyIndexIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
		keyIndexIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIndexIdx.setRequiredIndexId( existing.getRequiredIndexId() );



		if( indexByIndexIdx != null ) {
			if( indexByIndexIdx.containsKey( keyIndexIdx ) ) {
				indexByIndexIdx.get( keyIndexIdx ).remove( pkey );
				if( indexByIndexIdx.get( keyIndexIdx ).size() <= 0 ) {
					indexByIndexIdx.remove( keyIndexIdx );
				}
			}
		}


		schema.getTweakTableObj().reallyDeepDisposeTweak( obj );
	}
	public void deepDisposeIndexTweak( YCFBamTweakPKey pkey ) {
		IYCFBamIndexTweakObj obj = readCachedIndexTweak( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamIndexTweakObj lockIndexTweak( YCFBamTweakPKey pkey ) {
		IYCFBamIndexTweakObj locked = null;
		YCFBamIndexTweakBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamIndexTweakObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockIndexTweak", pkey );
		}
		return( locked );
	}

	public List<IYCFBamIndexTweakObj> readAllIndexTweak() {
		return( readAllIndexTweak( false ) );
	}

	public List<IYCFBamIndexTweakObj> readAllIndexTweak( boolean forceRead ) {
		final String S_ProcName = "readAllIndexTweak";
		if( ( allIndexTweak == null ) || forceRead ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> map = new HashMap<YCFBamTweakPKey,IYCFBamIndexTweakObj>();
			allIndexTweak = map;
			YCFBamIndexTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().readAllDerived( schema.getAuthorization() );
			YCFBamIndexTweakBuff buff;
			IYCFBamIndexTweakObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexTweakObj realised = (IYCFBamIndexTweakObj)obj.realise();
			}
		}
		int len = allIndexTweak.size();
		IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
		Iterator<IYCFBamIndexTweakObj> valIter = allIndexTweak.values().iterator();
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
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexTweakObj> readCachedAllIndexTweak() {
		final String S_ProcName = "readCachedAllIndexTweak";
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>();
		if( allIndexTweak != null ) {
			int len = allIndexTweak.size();
			IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
			Iterator<IYCFBamIndexTweakObj> valIter = allIndexTweak.values().iterator();
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
		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamIndexTweakObj readIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		return( readIndexTweakByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamIndexTweakObj readIndexTweakByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamIndexTweakObj obj = readIndexTweak( pkey, forceRead );
		return( obj );
	}

	public IYCFBamIndexTweakObj readIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readIndexTweakByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamIndexTweakObj readIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamIndexTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamIndexTweakObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamTweakBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamIndexTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamIndexTweakObj readIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		return( readIndexTweakByUDefIdx( TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name,
			false ) );
	}

	public IYCFBamIndexTweakObj readIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamIndexTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamIndexTweakObj obj = null;
		if( ( ! forceRead ) && indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
		}
		else {
			YCFBamTweakBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamIndexTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByValTentIdx( long TenantId )
	{
		return( readIndexTweakByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamIndexTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexTweakObj realised = (IYCFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
		Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readIndexTweakByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamIndexTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexTweakObj realised = (IYCFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
		Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readIndexTweakByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamIndexTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexTweakObj realised = (IYCFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
		Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByIndexIdx( long TenantId,
		long IndexId )
	{
		return( readIndexTweakByIndexIdx( TenantId,
			IndexId,
			false ) );
	}

	public List<IYCFBamIndexTweakObj> readIndexTweakByIndexIdx( long TenantId,
		long IndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByIndexIdx";
		YCFBamIndexTweakByIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< YCFBamIndexTweakByIndexIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByIndexIdx.containsKey( key ) ) {
			dict = indexByIndexIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamIndexTweakObj>();
			IYCFBamIndexTweakObj obj;
			YCFBamIndexTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().readDerivedByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			YCFBamIndexTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamIndexTweakObj realised = (IYCFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIndexIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
		Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamIndexTweakObj readCachedIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamIndexTweakObj obj = null;
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedIndexTweak( pkey );
		return( obj );
	}

	public IYCFBamIndexTweakObj readCachedIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamIndexTweakObj obj = null;
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
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

	public IYCFBamIndexTweakObj readCachedIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamIndexTweakObj obj = null;
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		if( indexByUDefIdx != null ) {
			if( indexByUDefIdx.containsKey( key ) ) {
				obj = indexByUDefIdx.get( key );
			}
			else {
				Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
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

	public List<IYCFBamIndexTweakObj> readCachedIndexTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
				Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
			IYCFBamIndexTweakObj obj;
			Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexTweakObj> readCachedIndexTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedIndexTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
				Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
			IYCFBamIndexTweakObj obj;
			Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexTweakObj> readCachedIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedIndexTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
				Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
			IYCFBamIndexTweakObj obj;
			Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamIndexTweakObj> readCachedIndexTweakByIndexIdx( long TenantId,
		long IndexId )
	{
		final String S_ProcName = "readCachedIndexTweakByIndexIdx";
		YCFBamIndexTweakByIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		ArrayList<IYCFBamIndexTweakObj> arrayList = new ArrayList<IYCFBamIndexTweakObj>();
		if( indexByIndexIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict;
			if( indexByIndexIdx.containsKey( key ) ) {
				dict = indexByIndexIdx.get( key );
				int len = dict.size();
				IYCFBamIndexTweakObj arr[] = new IYCFBamIndexTweakObj[len];
				Iterator<IYCFBamIndexTweakObj> valIter = dict.values().iterator();
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
			IYCFBamIndexTweakObj obj;
			Iterator<IYCFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamIndexTweakObj> cmp = new Comparator<IYCFBamIndexTweakObj>() {
			public int compare( IYCFBamIndexTweakObj lhs, IYCFBamIndexTweakObj rhs ) {
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
					YCFBamTweakPKey lhsPKey = lhs.getPKey();
					YCFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamIndexTweakObj obj = readCachedIndexTweakByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamIndexTweakObj obj = readCachedIndexTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamIndexTweakObj obj = readCachedIndexTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeIndexTweakByValTentIdx";
		IYCFBamIndexTweakObj obj;
		List<IYCFBamIndexTweakObj> arrayList = readCachedIndexTweakByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeIndexTweakByScopeIdx";
		IYCFBamIndexTweakObj obj;
		List<IYCFBamIndexTweakObj> arrayList = readCachedIndexTweakByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeIndexTweakByDefSchemaIdx";
		IYCFBamIndexTweakObj obj;
		List<IYCFBamIndexTweakObj> arrayList = readCachedIndexTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeIndexTweakByIndexIdx( long TenantId,
		long IndexId )
	{
		final String S_ProcName = "deepDisposeIndexTweakByIndexIdx";
		IYCFBamIndexTweakObj obj;
		List<IYCFBamIndexTweakObj> arrayList = readCachedIndexTweakByIndexIdx( TenantId,
				IndexId );
		if( arrayList != null )  {
			Iterator<IYCFBamIndexTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamIndexTweakObj updateIndexTweak( IYCFBamIndexTweakObj Obj ) {
		IYCFBamIndexTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().updateIndexTweak( schema.getAuthorization(),
			Obj.getIndexTweakBuff() );
		if( Obj.getClassCode().equals( "a80b" ) ) {
			obj = (IYCFBamIndexTweakObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteIndexTweak( IYCFBamIndexTweakObj Obj ) {
		IYCFBamIndexTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweak( schema.getAuthorization(),
			obj.getIndexTweakBuff() );
		Obj.forget();
	}

	public void deleteIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamIndexTweakObj obj = readIndexTweak( pkey );
		if( obj != null ) {
			IYCFBamIndexTweakEditObj editObj = (IYCFBamIndexTweakEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamIndexTweakEditObj)obj.beginEdit();
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
		deepDisposeIndexTweakByIdIdx( TenantId,
				Id );
	}

	public void deleteIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamIndexTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamIndexTweakObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeIndexTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamIndexTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamIndexTweakObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		}
		deepDisposeIndexTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
	}

	public void deleteIndexTweakByValTentIdx( long TenantId )
	{
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamIndexTweakObj> iter = dict.values().iterator();
			IYCFBamIndexTweakObj obj;
			List<IYCFBamIndexTweakObj> toForget = new LinkedList<IYCFBamIndexTweakObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByValTentIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexTweakByValTentIdx( TenantId );
	}

	public void deleteIndexTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamIndexTweakObj> iter = dict.values().iterator();
			IYCFBamIndexTweakObj obj;
			List<IYCFBamIndexTweakObj> toForget = new LinkedList<IYCFBamIndexTweakObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByScopeIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeIndexTweakByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamIndexTweakObj> iter = dict.values().iterator();
			IYCFBamIndexTweakObj obj;
			List<IYCFBamIndexTweakObj> toForget = new LinkedList<IYCFBamIndexTweakObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeIndexTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteIndexTweakByIndexIdx( long TenantId,
		long IndexId )
	{
		YCFBamIndexTweakByIndexIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< YCFBamIndexTweakByIndexIdxKey,
				Map< YCFBamTweakPKey, IYCFBamIndexTweakObj > >();
		}
		if( indexByIndexIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamIndexTweakObj> dict = indexByIndexIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			Iterator<IYCFBamIndexTweakObj> iter = dict.values().iterator();
			IYCFBamIndexTweakObj obj;
			List<IYCFBamIndexTweakObj> toForget = new LinkedList<IYCFBamIndexTweakObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIndexIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
		}
		deepDisposeIndexTweakByIndexIdx( TenantId,
				IndexId );
	}
}

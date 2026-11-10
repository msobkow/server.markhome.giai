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

public class YCFBamTableTweakTableObj
	implements IYCFBamTableTweakTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamTweakPKey, IYCFBamTableTweakObj> members;
	private Map<YCFBamTweakPKey, IYCFBamTableTweakObj> allTableTweak;
	private Map< YCFBamTweakByUNameIdxKey,
		IYCFBamTableTweakObj > indexByUNameIdx;
	private Map< YCFBamTweakByUDefIdxKey,
		IYCFBamTableTweakObj > indexByUDefIdx;
	private Map< YCFBamTweakByValTentIdxKey,
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj > > indexByValTentIdx;
	private Map< YCFBamTweakByScopeIdxKey,
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj > > indexByScopeIdx;
	private Map< YCFBamTweakByDefSchemaIdxKey,
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj > > indexByDefSchemaIdx;
	private Map< YCFBamTableTweakByTableIdxKey,
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj > > indexByTableIdx;
	public static String TABLE_NAME = "TableTweak";
	public static String TABLE_DBNAME = "tbltwk";

	public YCFBamTableTweakTableObj() {
		schema = null;
		members = new HashMap<YCFBamTweakPKey, IYCFBamTableTweakObj>();
		allTableTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByTableIdx = null;
	}

	public YCFBamTableTweakTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamTweakPKey, IYCFBamTableTweakObj>();
		allTableTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByTableIdx = null;
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
		allTableTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByTableIdx = null;
		List<IYCFBamTableTweakObj> toForget = new LinkedList<IYCFBamTableTweakObj>();
		IYCFBamTableTweakObj cur = null;
		Iterator<IYCFBamTableTweakObj> iter = members.values().iterator();
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
	 *	YCFBamTableTweakObj.
	 */
	public IYCFBamTableTweakObj newInstance() {
		IYCFBamTableTweakObj inst = new YCFBamTableTweakObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTableTweakObj.
	 */
	public IYCFBamTableTweakEditObj newEditInstance( IYCFBamTableTweakObj orig ) {
		IYCFBamTableTweakEditObj edit = new YCFBamTableTweakEditObj( orig );
		return( edit );
	}

	public IYCFBamTableTweakObj realiseTableTweak( IYCFBamTableTweakObj Obj ) {
		IYCFBamTableTweakObj obj = Obj;
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamTableTweakObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamTableTweakObj existingObj = members.get( pkey );
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
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByTableIdx != null ) {
				YCFBamTableTweakByTableIdxKey keyTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTableTweak().newTableIdxKey();
				keyTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapTableIdx = indexByTableIdx.get( keyTableIdx );
				if( mapTableIdx != null ) {
					mapTableIdx.remove( keepObj.getPKey() );
					if( mapTableIdx.size() <= 0 ) {
						indexByTableIdx.remove( keyTableIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamTableTweakObj)schema.getTweakTableObj().realiseTweak( Obj );

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
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableIdx != null ) {
				YCFBamTableTweakByTableIdxKey keyTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTableTweak().newTableIdxKey();
				keyTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapTableIdx = indexByTableIdx.get( keyTableIdx );
				if( mapTableIdx != null ) {
					mapTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allTableTweak != null ) {
				allTableTweak.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamTableTweakObj)schema.getTweakTableObj().realiseTweak( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTableTweak != null ) {
				allTableTweak.put( keepObj.getPKey(), keepObj );
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
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTableIdx != null ) {
				YCFBamTableTweakByTableIdxKey keyTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTableTweak().newTableIdxKey();
				keyTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamTweakPKey, IYCFBamTableTweakObj > mapTableIdx = indexByTableIdx.get( keyTableIdx );
				if( mapTableIdx != null ) {
					mapTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamTableTweakObj createTableTweak( IYCFBamTableTweakObj Obj ) {
		IYCFBamTableTweakObj obj = Obj;
		YCFBamTableTweakBuff buff = obj.getTableTweakBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().createTableTweak(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a809" ) ) {
			obj = (IYCFBamTableTweakObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamTableTweakObj readTableTweak( YCFBamTweakPKey pkey ) {
		return( readTableTweak( pkey, false ) );
	}

	public IYCFBamTableTweakObj readTableTweak( YCFBamTweakPKey pkey, boolean forceRead ) {
		IYCFBamTableTweakObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamTableTweakBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamTableTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamTableTweakObj readCachedTableTweak( YCFBamTweakPKey pkey ) {
		IYCFBamTableTweakObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTableTweak( IYCFBamTableTweakObj obj )
	{
		final String S_ProcName = "YCFBamTableTweakTableObj.reallyDeepDisposeTableTweak() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamTableTweakObj existing = readCachedTableTweak( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamTableTweakByTableIdxKey keyTableIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTableTweak().newTableIdxKey();
		keyTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTableIdx.setRequiredTableId( existing.getRequiredTableId() );



		if( indexByTableIdx != null ) {
			if( indexByTableIdx.containsKey( keyTableIdx ) ) {
				indexByTableIdx.get( keyTableIdx ).remove( pkey );
				if( indexByTableIdx.get( keyTableIdx ).size() <= 0 ) {
					indexByTableIdx.remove( keyTableIdx );
				}
			}
		}


		schema.getTweakTableObj().reallyDeepDisposeTweak( obj );
	}
	public void deepDisposeTableTweak( YCFBamTweakPKey pkey ) {
		IYCFBamTableTweakObj obj = readCachedTableTweak( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamTableTweakObj lockTableTweak( YCFBamTweakPKey pkey ) {
		IYCFBamTableTweakObj locked = null;
		YCFBamTableTweakBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamTableTweakObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTableTweak", pkey );
		}
		return( locked );
	}

	public List<IYCFBamTableTweakObj> readAllTableTweak() {
		return( readAllTableTweak( false ) );
	}

	public List<IYCFBamTableTweakObj> readAllTableTweak( boolean forceRead ) {
		final String S_ProcName = "readAllTableTweak";
		if( ( allTableTweak == null ) || forceRead ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> map = new HashMap<YCFBamTweakPKey,IYCFBamTableTweakObj>();
			allTableTweak = map;
			YCFBamTableTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().readAllDerived( schema.getAuthorization() );
			YCFBamTableTweakBuff buff;
			IYCFBamTableTweakObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableTweakObj realised = (IYCFBamTableTweakObj)obj.realise();
			}
		}
		int len = allTableTweak.size();
		IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
		Iterator<IYCFBamTableTweakObj> valIter = allTableTweak.values().iterator();
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
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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
		List<IYCFBamTableTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableTweakObj> readCachedAllTableTweak() {
		final String S_ProcName = "readCachedAllTableTweak";
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>();
		if( allTableTweak != null ) {
			int len = allTableTweak.size();
			IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
			Iterator<IYCFBamTableTweakObj> valIter = allTableTweak.values().iterator();
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
		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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

	public IYCFBamTableTweakObj readTableTweakByIdIdx( long TenantId,
		long Id )
	{
		return( readTableTweakByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamTableTweakObj readTableTweakByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTableTweakObj obj = readTableTweak( pkey, forceRead );
		return( obj );
	}

	public IYCFBamTableTweakObj readTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readTableTweakByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamTableTweakObj readTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamTableTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamTableTweakObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamTweakBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamTableTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamTableTweakObj readTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		return( readTableTweakByUDefIdx( TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name,
			false ) );
	}

	public IYCFBamTableTweakObj readTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamTableTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamTableTweakObj obj = null;
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
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamTableTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByValTentIdx( long TenantId )
	{
		return( readTableTweakByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamTableTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableTweakObj realised = (IYCFBamTableTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
		Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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
		List<IYCFBamTableTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readTableTweakByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamTableTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableTweakObj realised = (IYCFBamTableTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
		Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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
		List<IYCFBamTableTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readTableTweakByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamTableTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableTweakObj realised = (IYCFBamTableTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
		Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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
		List<IYCFBamTableTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByTableIdx( long TenantId,
		long TableId )
	{
		return( readTableTweakByTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamTableTweakObj> readTableTweakByTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readTableTweakByTableIdx";
		YCFBamTableTweakByTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTableTweak().newTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
		if( indexByTableIdx == null ) {
			indexByTableIdx = new HashMap< YCFBamTableTweakByTableIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( ( ! forceRead ) && indexByTableIdx.containsKey( key ) ) {
			dict = indexByTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamTableTweakObj>();
			IYCFBamTableTweakObj obj;
			YCFBamTableTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().readDerivedByTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamTableTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTableTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTableTweakObj realised = (IYCFBamTableTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
		Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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
		List<IYCFBamTableTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamTableTweakObj readCachedTableTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTableTweakObj obj = null;
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTableTweak( pkey );
		return( obj );
	}

	public IYCFBamTableTweakObj readCachedTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamTableTweakObj obj = null;
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
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

	public IYCFBamTableTweakObj readCachedTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamTableTweakObj obj = null;
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
				Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
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

	public List<IYCFBamTableTweakObj> readCachedTableTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTableTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
				Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
			IYCFBamTableTweakObj obj;
			Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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

	public List<IYCFBamTableTweakObj> readCachedTableTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedTableTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
				Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
			IYCFBamTableTweakObj obj;
			Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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

	public List<IYCFBamTableTweakObj> readCachedTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedTableTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
				Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
			IYCFBamTableTweakObj obj;
			Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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

	public List<IYCFBamTableTweakObj> readCachedTableTweakByTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedTableTweakByTableIdx";
		YCFBamTableTweakByTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTableTweak().newTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamTableTweakObj> arrayList = new ArrayList<IYCFBamTableTweakObj>();
		if( indexByTableIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict;
			if( indexByTableIdx.containsKey( key ) ) {
				dict = indexByTableIdx.get( key );
				int len = dict.size();
				IYCFBamTableTweakObj arr[] = new IYCFBamTableTweakObj[len];
				Iterator<IYCFBamTableTweakObj> valIter = dict.values().iterator();
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
			IYCFBamTableTweakObj obj;
			Iterator<IYCFBamTableTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTableTweakObj> cmp = new Comparator<IYCFBamTableTweakObj>() {
			public int compare( IYCFBamTableTweakObj lhs, IYCFBamTableTweakObj rhs ) {
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

	public void deepDisposeTableTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTableTweakObj obj = readCachedTableTweakByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamTableTweakObj obj = readCachedTableTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamTableTweakObj obj = readCachedTableTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTableTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTableTweakByValTentIdx";
		IYCFBamTableTweakObj obj;
		List<IYCFBamTableTweakObj> arrayList = readCachedTableTweakByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeTableTweakByScopeIdx";
		IYCFBamTableTweakObj obj;
		List<IYCFBamTableTweakObj> arrayList = readCachedTableTweakByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeTableTweakByDefSchemaIdx";
		IYCFBamTableTweakObj obj;
		List<IYCFBamTableTweakObj> arrayList = readCachedTableTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTableTweakByTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeTableTweakByTableIdx";
		IYCFBamTableTweakObj obj;
		List<IYCFBamTableTweakObj> arrayList = readCachedTableTweakByTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamTableTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamTableTweakObj updateTableTweak( IYCFBamTableTweakObj Obj ) {
		IYCFBamTableTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().updateTableTweak( schema.getAuthorization(),
			Obj.getTableTweakBuff() );
		if( Obj.getClassCode().equals( "a809" ) ) {
			obj = (IYCFBamTableTweakObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteTableTweak( IYCFBamTableTweakObj Obj ) {
		IYCFBamTableTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweak( schema.getAuthorization(),
			obj.getTableTweakBuff() );
		Obj.forget();
	}

	public void deleteTableTweakByIdIdx( long TenantId,
		long Id )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTableTweakObj obj = readTableTweak( pkey );
		if( obj != null ) {
			IYCFBamTableTweakEditObj editObj = (IYCFBamTableTweakEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamTableTweakEditObj)obj.beginEdit();
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
		deepDisposeTableTweakByIdIdx( TenantId,
				Id );
	}

	public void deleteTableTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamTableTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamTableTweakObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeTableTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteTableTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamTableTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamTableTweakObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		}
		deepDisposeTableTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
	}

	public void deleteTableTweakByValTentIdx( long TenantId )
	{
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamTableTweakObj> iter = dict.values().iterator();
			IYCFBamTableTweakObj obj;
			List<IYCFBamTableTweakObj> toForget = new LinkedList<IYCFBamTableTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTableTweakByValTentIdx( TenantId );
	}

	public void deleteTableTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamTableTweakObj> iter = dict.values().iterator();
			IYCFBamTableTweakObj obj;
			List<IYCFBamTableTweakObj> toForget = new LinkedList<IYCFBamTableTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeTableTweakByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteTableTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamTableTweakObj> iter = dict.values().iterator();
			IYCFBamTableTweakObj obj;
			List<IYCFBamTableTweakObj> toForget = new LinkedList<IYCFBamTableTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeTableTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteTableTweakByTableIdx( long TenantId,
		long TableId )
	{
		YCFBamTableTweakByTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTableTweak().newTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByTableIdx == null ) {
			indexByTableIdx = new HashMap< YCFBamTableTweakByTableIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTableTweakObj > >();
		}
		if( indexByTableIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamTableTweakObj> dict = indexByTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamTableTweakObj> iter = dict.values().iterator();
			IYCFBamTableTweakObj obj;
			List<IYCFBamTableTweakObj> toForget = new LinkedList<IYCFBamTableTweakObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTableIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTableTweak().deleteTableTweakByTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeTableTweakByTableIdx( TenantId,
				TableId );
	}
}

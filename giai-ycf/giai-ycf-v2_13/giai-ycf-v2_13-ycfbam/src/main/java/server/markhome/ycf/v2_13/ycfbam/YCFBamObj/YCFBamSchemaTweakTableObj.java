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

public class YCFBamSchemaTweakTableObj
	implements IYCFBamSchemaTweakTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> members;
	private Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> allSchemaTweak;
	private Map< YCFBamTweakByUNameIdxKey,
		IYCFBamSchemaTweakObj > indexByUNameIdx;
	private Map< YCFBamTweakByUDefIdxKey,
		IYCFBamSchemaTweakObj > indexByUDefIdx;
	private Map< YCFBamTweakByValTentIdxKey,
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > > indexByValTentIdx;
	private Map< YCFBamTweakByScopeIdxKey,
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > > indexByScopeIdx;
	private Map< YCFBamTweakByDefSchemaIdxKey,
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > > indexByDefSchemaIdx;
	private Map< YCFBamSchemaTweakBySchemaIdxKey,
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > > indexBySchemaIdx;
	public static String TABLE_NAME = "SchemaTweak";
	public static String TABLE_DBNAME = "schtwk";

	public YCFBamSchemaTweakTableObj() {
		schema = null;
		members = new HashMap<YCFBamTweakPKey, IYCFBamSchemaTweakObj>();
		allSchemaTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
	}

	public YCFBamSchemaTweakTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamTweakPKey, IYCFBamSchemaTweakObj>();
		allSchemaTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
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
		allSchemaTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
		List<IYCFBamSchemaTweakObj> toForget = new LinkedList<IYCFBamSchemaTweakObj>();
		IYCFBamSchemaTweakObj cur = null;
		Iterator<IYCFBamSchemaTweakObj> iter = members.values().iterator();
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
	 *	YCFBamSchemaTweakObj.
	 */
	public IYCFBamSchemaTweakObj newInstance() {
		IYCFBamSchemaTweakObj inst = new YCFBamSchemaTweakObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSchemaTweakObj.
	 */
	public IYCFBamSchemaTweakEditObj newEditInstance( IYCFBamSchemaTweakObj orig ) {
		IYCFBamSchemaTweakEditObj edit = new YCFBamSchemaTweakEditObj( orig );
		return( edit );
	}

	public IYCFBamSchemaTweakObj realiseSchemaTweak( IYCFBamSchemaTweakObj Obj ) {
		IYCFBamSchemaTweakObj obj = Obj;
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamSchemaTweakObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamSchemaTweakObj existingObj = members.get( pkey );
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
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaTweakBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.remove( keepObj.getPKey() );
					if( mapSchemaIdx.size() <= 0 ) {
						indexBySchemaIdx.remove( keySchemaIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().realiseTweak( Obj );

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
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaTweakBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSchemaTweak != null ) {
				allSchemaTweak.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().realiseTweak( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaTweak != null ) {
				allSchemaTweak.put( keepObj.getPKey(), keepObj );
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
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				YCFBamSchemaTweakBySchemaIdxKey keySchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamSchemaTweakObj createSchemaTweak( IYCFBamSchemaTweakObj Obj ) {
		IYCFBamSchemaTweakObj obj = Obj;
		YCFBamSchemaTweakBuff buff = obj.getSchemaTweakBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().createSchemaTweak(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a80a" ) ) {
			obj = (IYCFBamSchemaTweakObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamSchemaTweakObj readSchemaTweak( YCFBamTweakPKey pkey ) {
		return( readSchemaTweak( pkey, false ) );
	}

	public IYCFBamSchemaTweakObj readSchemaTweak( YCFBamTweakPKey pkey, boolean forceRead ) {
		IYCFBamSchemaTweakObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamSchemaTweakBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamSchemaTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamSchemaTweakObj readCachedSchemaTweak( YCFBamTweakPKey pkey ) {
		IYCFBamSchemaTweakObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaTweak( IYCFBamSchemaTweakObj obj )
	{
		final String S_ProcName = "YCFBamSchemaTweakTableObj.reallyDeepDisposeSchemaTweak() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamSchemaTweakObj existing = readCachedSchemaTweak( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamSchemaTweakBySchemaIdxKey keySchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );



		if( indexBySchemaIdx != null ) {
			if( indexBySchemaIdx.containsKey( keySchemaIdx ) ) {
				indexBySchemaIdx.get( keySchemaIdx ).remove( pkey );
				if( indexBySchemaIdx.get( keySchemaIdx ).size() <= 0 ) {
					indexBySchemaIdx.remove( keySchemaIdx );
				}
			}
		}


		schema.getTweakTableObj().reallyDeepDisposeTweak( obj );
	}
	public void deepDisposeSchemaTweak( YCFBamTweakPKey pkey ) {
		IYCFBamSchemaTweakObj obj = readCachedSchemaTweak( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamSchemaTweakObj lockSchemaTweak( YCFBamTweakPKey pkey ) {
		IYCFBamSchemaTweakObj locked = null;
		YCFBamSchemaTweakBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamSchemaTweakObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSchemaTweak", pkey );
		}
		return( locked );
	}

	public List<IYCFBamSchemaTweakObj> readAllSchemaTweak() {
		return( readAllSchemaTweak( false ) );
	}

	public List<IYCFBamSchemaTweakObj> readAllSchemaTweak( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaTweak";
		if( ( allSchemaTweak == null ) || forceRead ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> map = new HashMap<YCFBamTweakPKey,IYCFBamSchemaTweakObj>();
			allSchemaTweak = map;
			YCFBamSchemaTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().readAllDerived( schema.getAuthorization() );
			YCFBamSchemaTweakBuff buff;
			IYCFBamSchemaTweakObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaTweakObj realised = (IYCFBamSchemaTweakObj)obj.realise();
			}
		}
		int len = allSchemaTweak.size();
		IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
		Iterator<IYCFBamSchemaTweakObj> valIter = allSchemaTweak.values().iterator();
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
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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
		List<IYCFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaTweakObj> readCachedAllSchemaTweak() {
		final String S_ProcName = "readCachedAllSchemaTweak";
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>();
		if( allSchemaTweak != null ) {
			int len = allSchemaTweak.size();
			IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
			Iterator<IYCFBamSchemaTweakObj> valIter = allSchemaTweak.values().iterator();
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
		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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

	public IYCFBamSchemaTweakObj readSchemaTweakByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaTweakByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamSchemaTweakObj readSchemaTweakByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaTweakObj obj = readSchemaTweak( pkey, forceRead );
		return( obj );
	}

	public IYCFBamSchemaTweakObj readSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readSchemaTweakByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamSchemaTweakObj readSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamSchemaTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamSchemaTweakObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamTweakBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamSchemaTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamSchemaTweakObj readSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		return( readSchemaTweakByUDefIdx( TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name,
			false ) );
	}

	public IYCFBamSchemaTweakObj readSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamSchemaTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamSchemaTweakObj obj = null;
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
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamSchemaTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakByValTentIdx( long TenantId )
	{
		return( readSchemaTweakByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamSchemaTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaTweakObj realised = (IYCFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
		Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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
		List<IYCFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readSchemaTweakByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamSchemaTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaTweakObj realised = (IYCFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
		Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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
		List<IYCFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readSchemaTweakByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamSchemaTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaTweakObj realised = (IYCFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
		Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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
		List<IYCFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readSchemaTweakBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<IYCFBamSchemaTweakObj> readSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakBySchemaIdx";
		YCFBamSchemaTweakBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamSchemaTweakBySchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamSchemaTweakObj>();
			IYCFBamSchemaTweakObj obj;
			YCFBamSchemaTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			YCFBamSchemaTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamSchemaTweakObj realised = (IYCFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
		Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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
		List<IYCFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamSchemaTweakObj readCachedSchemaTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaTweakObj obj = null;
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaTweak( pkey );
		return( obj );
	}

	public IYCFBamSchemaTweakObj readCachedSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamSchemaTweakObj obj = null;
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
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

	public IYCFBamSchemaTweakObj readCachedSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamSchemaTweakObj obj = null;
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
				Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
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

	public List<IYCFBamSchemaTweakObj> readCachedSchemaTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
				Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaTweakObj obj;
			Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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

	public List<IYCFBamSchemaTweakObj> readCachedSchemaTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedSchemaTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
				Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaTweakObj obj;
			Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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

	public List<IYCFBamSchemaTweakObj> readCachedSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedSchemaTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
				Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaTweakObj obj;
			Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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

	public List<IYCFBamSchemaTweakObj> readCachedSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedSchemaTweakBySchemaIdx";
		YCFBamSchemaTweakBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<IYCFBamSchemaTweakObj> arrayList = new ArrayList<IYCFBamSchemaTweakObj>();
		if( indexBySchemaIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				IYCFBamSchemaTweakObj arr[] = new IYCFBamSchemaTweakObj[len];
				Iterator<IYCFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			IYCFBamSchemaTweakObj obj;
			Iterator<IYCFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamSchemaTweakObj> cmp = new Comparator<IYCFBamSchemaTweakObj>() {
			public int compare( IYCFBamSchemaTweakObj lhs, IYCFBamSchemaTweakObj rhs ) {
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

	public void deepDisposeSchemaTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamSchemaTweakObj obj = readCachedSchemaTweakByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamSchemaTweakObj obj = readCachedSchemaTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamSchemaTweakObj obj = readCachedSchemaTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeSchemaTweakByValTentIdx";
		IYCFBamSchemaTweakObj obj;
		List<IYCFBamSchemaTweakObj> arrayList = readCachedSchemaTweakByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeSchemaTweakByScopeIdx";
		IYCFBamSchemaTweakObj obj;
		List<IYCFBamSchemaTweakObj> arrayList = readCachedSchemaTweakByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeSchemaTweakByDefSchemaIdx";
		IYCFBamSchemaTweakObj obj;
		List<IYCFBamSchemaTweakObj> arrayList = readCachedSchemaTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "deepDisposeSchemaTweakBySchemaIdx";
		IYCFBamSchemaTweakObj obj;
		List<IYCFBamSchemaTweakObj> arrayList = readCachedSchemaTweakBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<IYCFBamSchemaTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamSchemaTweakObj updateSchemaTweak( IYCFBamSchemaTweakObj Obj ) {
		IYCFBamSchemaTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().updateSchemaTweak( schema.getAuthorization(),
			Obj.getSchemaTweakBuff() );
		if( Obj.getClassCode().equals( "a80a" ) ) {
			obj = (IYCFBamSchemaTweakObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaTweak( IYCFBamSchemaTweakObj Obj ) {
		IYCFBamSchemaTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweak( schema.getAuthorization(),
			obj.getSchemaTweakBuff() );
		Obj.forget();
	}

	public void deleteSchemaTweakByIdIdx( long TenantId,
		long Id )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamSchemaTweakObj obj = readSchemaTweak( pkey );
		if( obj != null ) {
			IYCFBamSchemaTweakEditObj editObj = (IYCFBamSchemaTweakEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamSchemaTweakEditObj)obj.beginEdit();
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
		deepDisposeSchemaTweakByIdIdx( TenantId,
				Id );
	}

	public void deleteSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamSchemaTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamSchemaTweakObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeSchemaTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamSchemaTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamSchemaTweakObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		}
		deepDisposeSchemaTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
	}

	public void deleteSchemaTweakByValTentIdx( long TenantId )
	{
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamSchemaTweakObj> iter = dict.values().iterator();
			IYCFBamSchemaTweakObj obj;
			List<IYCFBamSchemaTweakObj> toForget = new LinkedList<IYCFBamSchemaTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaTweakByValTentIdx( TenantId );
	}

	public void deleteSchemaTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamSchemaTweakObj> iter = dict.values().iterator();
			IYCFBamSchemaTweakObj obj;
			List<IYCFBamSchemaTweakObj> toForget = new LinkedList<IYCFBamSchemaTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeSchemaTweakByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamSchemaTweakObj> iter = dict.values().iterator();
			IYCFBamSchemaTweakObj obj;
			List<IYCFBamSchemaTweakObj> toForget = new LinkedList<IYCFBamSchemaTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeSchemaTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		YCFBamSchemaTweakBySchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< YCFBamSchemaTweakBySchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamSchemaTweakObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamSchemaTweakObj> dict = indexBySchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<IYCFBamSchemaTweakObj> iter = dict.values().iterator();
			IYCFBamSchemaTweakObj obj;
			List<IYCFBamSchemaTweakObj> toForget = new LinkedList<IYCFBamSchemaTweakObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySchemaIdx.remove( key );
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeSchemaTweakBySchemaIdx( TenantId,
				SchemaDefId );
	}
}

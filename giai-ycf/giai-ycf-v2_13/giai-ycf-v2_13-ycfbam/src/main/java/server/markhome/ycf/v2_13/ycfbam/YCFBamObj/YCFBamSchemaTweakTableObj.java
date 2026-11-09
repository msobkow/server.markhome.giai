// Description: Java 11 Table Object implementation for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
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
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public class CFBamSchemaTweakTableObj
	implements ICFBamSchemaTweakTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamTweakPKey, ICFBamSchemaTweakObj> members;
	private Map<CFBamTweakPKey, ICFBamSchemaTweakObj> allSchemaTweak;
	private Map< CFBamTweakByUNameIdxKey,
		ICFBamSchemaTweakObj > indexByUNameIdx;
	private Map< CFBamTweakByUDefIdxKey,
		ICFBamSchemaTweakObj > indexByUDefIdx;
	private Map< CFBamTweakByValTentIdxKey,
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj > > indexByValTentIdx;
	private Map< CFBamTweakByScopeIdxKey,
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj > > indexByScopeIdx;
	private Map< CFBamTweakByDefSchemaIdxKey,
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj > > indexByDefSchemaIdx;
	private Map< CFBamSchemaTweakBySchemaIdxKey,
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj > > indexBySchemaIdx;
	public static String TABLE_NAME = "SchemaTweak";
	public static String TABLE_DBNAME = "schtwk";

	public CFBamSchemaTweakTableObj() {
		schema = null;
		members = new HashMap<CFBamTweakPKey, ICFBamSchemaTweakObj>();
		allSchemaTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
	}

	public CFBamSchemaTweakTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamTweakPKey, ICFBamSchemaTweakObj>();
		allSchemaTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allSchemaTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexBySchemaIdx = null;
		List<ICFBamSchemaTweakObj> toForget = new LinkedList<ICFBamSchemaTweakObj>();
		ICFBamSchemaTweakObj cur = null;
		Iterator<ICFBamSchemaTweakObj> iter = members.values().iterator();
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
	 *	CFBamSchemaTweakObj.
	 */
	public ICFBamSchemaTweakObj newInstance() {
		ICFBamSchemaTweakObj inst = new CFBamSchemaTweakObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamSchemaTweakObj.
	 */
	public ICFBamSchemaTweakEditObj newEditInstance( ICFBamSchemaTweakObj orig ) {
		ICFBamSchemaTweakEditObj edit = new CFBamSchemaTweakEditObj( orig );
		return( edit );
	}

	public ICFBamSchemaTweakObj realiseSchemaTweak( ICFBamSchemaTweakObj Obj ) {
		ICFBamSchemaTweakObj obj = Obj;
		CFBamTweakPKey pkey = obj.getPKey();
		ICFBamSchemaTweakObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamSchemaTweakObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				CFBamTweakByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByUDefIdx != null ) {
				CFBamTweakByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.remove( keyUDefIdx );
			}

			if( indexByValTentIdx != null ) {
				CFBamTweakByValTentIdxKey keyValTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamTweakByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaTweakBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
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
			keepObj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().realiseTweak( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUNameIdx != null ) {
				CFBamTweakByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				CFBamTweakByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				CFBamTweakByValTentIdxKey keyValTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamTweakByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaTweakBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
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
			keepObj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().realiseTweak( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSchemaTweak != null ) {
				allSchemaTweak.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				CFBamTweakByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				CFBamTweakByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByValTentIdx != null ) {
				CFBamTweakByValTentIdxKey keyValTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
				keyValTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamTweakByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySchemaIdx != null ) {
				CFBamSchemaTweakBySchemaIdxKey keySchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
				keySchemaIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keySchemaIdx.setRequiredSchemaDefId( keepObj.getRequiredSchemaDefId() );
				Map<CFBamTweakPKey, ICFBamSchemaTweakObj > mapSchemaIdx = indexBySchemaIdx.get( keySchemaIdx );
				if( mapSchemaIdx != null ) {
					mapSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamSchemaTweakObj createSchemaTweak( ICFBamSchemaTweakObj Obj ) {
		ICFBamSchemaTweakObj obj = Obj;
		CFBamSchemaTweakBuff buff = obj.getSchemaTweakBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().createSchemaTweak(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a80a" ) ) {
			obj = (ICFBamSchemaTweakObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamSchemaTweakObj readSchemaTweak( CFBamTweakPKey pkey ) {
		return( readSchemaTweak( pkey, false ) );
	}

	public ICFBamSchemaTweakObj readSchemaTweak( CFBamTweakPKey pkey, boolean forceRead ) {
		ICFBamSchemaTweakObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamSchemaTweakBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamSchemaTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamSchemaTweakObj readCachedSchemaTweak( CFBamTweakPKey pkey ) {
		ICFBamSchemaTweakObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSchemaTweak( ICFBamSchemaTweakObj obj )
	{
		final String S_ProcName = "CFBamSchemaTweakTableObj.reallyDeepDisposeSchemaTweak() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamTweakPKey pkey = obj.getPKey();
		ICFBamSchemaTweakObj existing = readCachedSchemaTweak( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamSchemaTweakBySchemaIdxKey keySchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
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
	public void deepDisposeSchemaTweak( CFBamTweakPKey pkey ) {
		ICFBamSchemaTweakObj obj = readCachedSchemaTweak( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamSchemaTweakObj lockSchemaTweak( CFBamTweakPKey pkey ) {
		ICFBamSchemaTweakObj locked = null;
		CFBamSchemaTweakBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamSchemaTweakObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSchemaTweak", pkey );
		}
		return( locked );
	}

	public List<ICFBamSchemaTweakObj> readAllSchemaTweak() {
		return( readAllSchemaTweak( false ) );
	}

	public List<ICFBamSchemaTweakObj> readAllSchemaTweak( boolean forceRead ) {
		final String S_ProcName = "readAllSchemaTweak";
		if( ( allSchemaTweak == null ) || forceRead ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> map = new HashMap<CFBamTweakPKey,ICFBamSchemaTweakObj>();
			allSchemaTweak = map;
			CFBamSchemaTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().readAllDerived( schema.getAuthorization() );
			CFBamSchemaTweakBuff buff;
			ICFBamSchemaTweakObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaTweakObj realised = (ICFBamSchemaTweakObj)obj.realise();
			}
		}
		int len = allSchemaTweak.size();
		ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
		Iterator<ICFBamSchemaTweakObj> valIter = allSchemaTweak.values().iterator();
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
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaTweakObj> readCachedAllSchemaTweak() {
		final String S_ProcName = "readCachedAllSchemaTweak";
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>();
		if( allSchemaTweak != null ) {
			int len = allSchemaTweak.size();
			ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
			Iterator<ICFBamSchemaTweakObj> valIter = allSchemaTweak.values().iterator();
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
		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamSchemaTweakObj readSchemaTweakByIdIdx( long TenantId,
		long Id )
	{
		return( readSchemaTweakByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamSchemaTweakObj readSchemaTweakByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamTweakPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaTweakObj obj = readSchemaTweak( pkey, forceRead );
		return( obj );
	}

	public ICFBamSchemaTweakObj readSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readSchemaTweakByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public ICFBamSchemaTweakObj readSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamTweakByUNameIdxKey,
				ICFBamSchemaTweakObj >();
		}
		CFBamTweakByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamSchemaTweakObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamTweakBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamSchemaTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamSchemaTweakObj readSchemaTweakByUDefIdx( long TenantId,
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

	public ICFBamSchemaTweakObj readSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< CFBamTweakByUDefIdxKey,
				ICFBamSchemaTweakObj >();
		}
		CFBamTweakByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamSchemaTweakObj obj = null;
		if( ( ! forceRead ) && indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
		}
		else {
			CFBamTweakBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			if( buff != null ) {
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamSchemaTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakByValTentIdx( long TenantId )
	{
		return( readSchemaTweakByValTentIdx( TenantId,
			false ) );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakByValTentIdx";
		CFBamTweakByValTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< CFBamTweakByValTentIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamSchemaTweakObj>();
			ICFBamTweakObj obj;
			CFBamTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			CFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaTweakObj realised = (ICFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
		Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readSchemaTweakByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakByScopeIdx";
		CFBamTweakByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamTweakByScopeIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamSchemaTweakObj>();
			ICFBamTweakObj obj;
			CFBamTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			CFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaTweakObj realised = (ICFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
		Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readSchemaTweakByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakByDefSchemaIdx";
		CFBamTweakByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamTweakByDefSchemaIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamSchemaTweakObj>();
			ICFBamTweakObj obj;
			CFBamTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaTweakObj realised = (ICFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
		Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		return( readSchemaTweakBySchemaIdx( TenantId,
			SchemaDefId,
			false ) );
	}

	public List<ICFBamSchemaTweakObj> readSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead )
	{
		final String S_ProcName = "readSchemaTweakBySchemaIdx";
		CFBamSchemaTweakBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< CFBamSchemaTweakBySchemaIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( ( ! forceRead ) && indexBySchemaIdx.containsKey( key ) ) {
			dict = indexBySchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamSchemaTweakObj>();
			ICFBamSchemaTweakObj obj;
			CFBamSchemaTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().readDerivedBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			CFBamSchemaTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamSchemaTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamSchemaTweakObj realised = (ICFBamSchemaTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
		Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamSchemaTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamSchemaTweakObj readCachedSchemaTweakByIdIdx( long TenantId,
		long Id )
	{
		ICFBamSchemaTweakObj obj = null;
		CFBamTweakPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedSchemaTweak( pkey );
		return( obj );
	}

	public ICFBamSchemaTweakObj readCachedSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamSchemaTweakObj obj = null;
		CFBamTweakByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
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
			Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
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

	public ICFBamSchemaTweakObj readCachedSchemaTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		ICFBamSchemaTweakObj obj = null;
		CFBamTweakByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
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
				Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
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
			Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
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

	public List<ICFBamSchemaTweakObj> readCachedSchemaTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedSchemaTweakByValTentIdx";
		CFBamTweakByValTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>();
		if( indexByValTentIdx != null ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
				Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			ICFBamSchemaTweakObj obj;
			Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaTweakObj> readCachedSchemaTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedSchemaTweakByScopeIdx";
		CFBamTweakByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>();
		if( indexByScopeIdx != null ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
				Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			ICFBamSchemaTweakObj obj;
			Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaTweakObj> readCachedSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedSchemaTweakByDefSchemaIdx";
		CFBamTweakByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
				Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			ICFBamSchemaTweakObj obj;
			Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamSchemaTweakObj> readCachedSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "readCachedSchemaTweakBySchemaIdx";
		CFBamSchemaTweakBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		ArrayList<ICFBamSchemaTweakObj> arrayList = new ArrayList<ICFBamSchemaTweakObj>();
		if( indexBySchemaIdx != null ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict;
			if( indexBySchemaIdx.containsKey( key ) ) {
				dict = indexBySchemaIdx.get( key );
				int len = dict.size();
				ICFBamSchemaTweakObj arr[] = new ICFBamSchemaTweakObj[len];
				Iterator<ICFBamSchemaTweakObj> valIter = dict.values().iterator();
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
			ICFBamSchemaTweakObj obj;
			Iterator<ICFBamSchemaTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamSchemaTweakObj> cmp = new Comparator<ICFBamSchemaTweakObj>() {
			public int compare( ICFBamSchemaTweakObj lhs, ICFBamSchemaTweakObj rhs ) {
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
					CFBamTweakPKey lhsPKey = lhs.getPKey();
					CFBamTweakPKey rhsPKey = rhs.getPKey();
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
		ICFBamSchemaTweakObj obj = readCachedSchemaTweakByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSchemaTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamSchemaTweakObj obj = readCachedSchemaTweakByUNameIdx( TenantId,
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
		ICFBamSchemaTweakObj obj = readCachedSchemaTweakByUDefIdx( TenantId,
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
		ICFBamSchemaTweakObj obj;
		List<ICFBamSchemaTweakObj> arrayList = readCachedSchemaTweakByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaTweakObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaTweakObj obj;
		List<ICFBamSchemaTweakObj> arrayList = readCachedSchemaTweakByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaTweakObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaTweakObj obj;
		List<ICFBamSchemaTweakObj> arrayList = readCachedSchemaTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaTweakObj> arrayIter = arrayList.iterator();
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
		ICFBamSchemaTweakObj obj;
		List<ICFBamSchemaTweakObj> arrayList = readCachedSchemaTweakBySchemaIdx( TenantId,
				SchemaDefId );
		if( arrayList != null )  {
			Iterator<ICFBamSchemaTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamSchemaTweakObj updateSchemaTweak( ICFBamSchemaTweakObj Obj ) {
		ICFBamSchemaTweakObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().updateSchemaTweak( schema.getAuthorization(),
			Obj.getSchemaTweakBuff() );
		if( Obj.getClassCode().equals( "a80a" ) ) {
			obj = (ICFBamSchemaTweakObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteSchemaTweak( ICFBamSchemaTweakObj Obj ) {
		ICFBamSchemaTweakObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweak( schema.getAuthorization(),
			obj.getSchemaTweakBuff() );
		Obj.forget();
	}

	public void deleteSchemaTweakByIdIdx( long TenantId,
		long Id )
	{
		CFBamTweakPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamSchemaTweakObj obj = readSchemaTweak( pkey );
		if( obj != null ) {
			ICFBamSchemaTweakEditObj editObj = (ICFBamSchemaTweakEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamSchemaTweakEditObj)obj.beginEdit();
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
			indexByUNameIdx = new HashMap< CFBamTweakByUNameIdxKey,
				ICFBamSchemaTweakObj >();
		}
		CFBamTweakByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamSchemaTweakObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUNameIdx( schema.getAuthorization(),
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
			indexByUDefIdx = new HashMap< CFBamTweakByUDefIdxKey,
				ICFBamSchemaTweakObj >();
		}
		CFBamTweakByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamSchemaTweakObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByUDefIdx( schema.getAuthorization(),
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
		CFBamTweakByValTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< CFBamTweakByValTentIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict = indexByValTentIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamSchemaTweakObj> iter = dict.values().iterator();
			ICFBamSchemaTweakObj obj;
			List<ICFBamSchemaTweakObj> toForget = new LinkedList<ICFBamSchemaTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeSchemaTweakByValTentIdx( TenantId );
	}

	public void deleteSchemaTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		CFBamTweakByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamTweakByScopeIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict = indexByScopeIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<ICFBamSchemaTweakObj> iter = dict.values().iterator();
			ICFBamSchemaTweakObj obj;
			List<ICFBamSchemaTweakObj> toForget = new LinkedList<ICFBamSchemaTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeSchemaTweakByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteSchemaTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamTweakByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamTweakByDefSchemaIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamSchemaTweakObj> iter = dict.values().iterator();
			ICFBamSchemaTweakObj obj;
			List<ICFBamSchemaTweakObj> toForget = new LinkedList<ICFBamSchemaTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeSchemaTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteSchemaTweakBySchemaIdx( long TenantId,
		long SchemaDefId )
	{
		CFBamSchemaTweakBySchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		if( indexBySchemaIdx == null ) {
			indexBySchemaIdx = new HashMap< CFBamSchemaTweakBySchemaIdxKey,
				Map< CFBamTweakPKey, ICFBamSchemaTweakObj > >();
		}
		if( indexBySchemaIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamSchemaTweakObj> dict = indexBySchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
			Iterator<ICFBamSchemaTweakObj> iter = dict.values().iterator();
			ICFBamSchemaTweakObj obj;
			List<ICFBamSchemaTweakObj> toForget = new LinkedList<ICFBamSchemaTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableSchemaTweak().deleteSchemaTweakBySchemaIdx( schema.getAuthorization(),
				TenantId,
				SchemaDefId );
		}
		deepDisposeSchemaTweakBySchemaIdx( TenantId,
				SchemaDefId );
	}
}
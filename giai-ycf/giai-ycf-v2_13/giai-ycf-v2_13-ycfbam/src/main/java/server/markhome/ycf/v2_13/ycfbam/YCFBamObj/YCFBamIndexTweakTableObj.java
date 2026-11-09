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

public class CFBamIndexTweakTableObj
	implements ICFBamIndexTweakTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamTweakPKey, ICFBamIndexTweakObj> members;
	private Map<CFBamTweakPKey, ICFBamIndexTweakObj> allIndexTweak;
	private Map< CFBamTweakByUNameIdxKey,
		ICFBamIndexTweakObj > indexByUNameIdx;
	private Map< CFBamTweakByUDefIdxKey,
		ICFBamIndexTweakObj > indexByUDefIdx;
	private Map< CFBamTweakByValTentIdxKey,
		Map<CFBamTweakPKey, ICFBamIndexTweakObj > > indexByValTentIdx;
	private Map< CFBamTweakByScopeIdxKey,
		Map<CFBamTweakPKey, ICFBamIndexTweakObj > > indexByScopeIdx;
	private Map< CFBamTweakByDefSchemaIdxKey,
		Map<CFBamTweakPKey, ICFBamIndexTweakObj > > indexByDefSchemaIdx;
	private Map< CFBamIndexTweakByIndexIdxKey,
		Map<CFBamTweakPKey, ICFBamIndexTweakObj > > indexByIndexIdx;
	public static String TABLE_NAME = "IndexTweak";
	public static String TABLE_DBNAME = "idxtwk";

	public CFBamIndexTweakTableObj() {
		schema = null;
		members = new HashMap<CFBamTweakPKey, ICFBamIndexTweakObj>();
		allIndexTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByIndexIdx = null;
	}

	public CFBamIndexTweakTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamTweakPKey, ICFBamIndexTweakObj>();
		allIndexTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByIndexIdx = null;
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
		allIndexTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		indexByIndexIdx = null;
		List<ICFBamIndexTweakObj> toForget = new LinkedList<ICFBamIndexTweakObj>();
		ICFBamIndexTweakObj cur = null;
		Iterator<ICFBamIndexTweakObj> iter = members.values().iterator();
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
	 *	CFBamIndexTweakObj.
	 */
	public ICFBamIndexTweakObj newInstance() {
		ICFBamIndexTweakObj inst = new CFBamIndexTweakObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamIndexTweakObj.
	 */
	public ICFBamIndexTweakEditObj newEditInstance( ICFBamIndexTweakObj orig ) {
		ICFBamIndexTweakEditObj edit = new CFBamIndexTweakEditObj( orig );
		return( edit );
	}

	public ICFBamIndexTweakObj realiseIndexTweak( ICFBamIndexTweakObj Obj ) {
		ICFBamIndexTweakObj obj = Obj;
		CFBamTweakPKey pkey = obj.getPKey();
		ICFBamIndexTweakObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamIndexTweakObj existingObj = members.get( pkey );
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
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamTweakByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByIndexIdx != null ) {
				CFBamIndexTweakByIndexIdxKey keyIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
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
			keepObj = (ICFBamIndexTweakObj)schema.getTweakTableObj().realiseTweak( Obj );

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
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamTweakByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				CFBamIndexTweakByIndexIdxKey keyIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
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
			keepObj = (ICFBamIndexTweakObj)schema.getTweakTableObj().realiseTweak( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allIndexTweak != null ) {
				allIndexTweak.put( keepObj.getPKey(), keepObj );
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
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamTweakByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIndexIdx != null ) {
				CFBamIndexTweakByIndexIdxKey keyIndexIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
				keyIndexIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIndexIdx.setRequiredIndexId( keepObj.getRequiredIndexId() );
				Map<CFBamTweakPKey, ICFBamIndexTweakObj > mapIndexIdx = indexByIndexIdx.get( keyIndexIdx );
				if( mapIndexIdx != null ) {
					mapIndexIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamIndexTweakObj createIndexTweak( ICFBamIndexTweakObj Obj ) {
		ICFBamIndexTweakObj obj = Obj;
		CFBamIndexTweakBuff buff = obj.getIndexTweakBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().createIndexTweak(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a80b" ) ) {
			obj = (ICFBamIndexTweakObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamIndexTweakObj readIndexTweak( CFBamTweakPKey pkey ) {
		return( readIndexTweak( pkey, false ) );
	}

	public ICFBamIndexTweakObj readIndexTweak( CFBamTweakPKey pkey, boolean forceRead ) {
		ICFBamIndexTweakObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamIndexTweakBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamIndexTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamIndexTweakObj readCachedIndexTweak( CFBamTweakPKey pkey ) {
		ICFBamIndexTweakObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeIndexTweak( ICFBamIndexTweakObj obj )
	{
		final String S_ProcName = "CFBamIndexTweakTableObj.reallyDeepDisposeIndexTweak() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamTweakPKey pkey = obj.getPKey();
		ICFBamIndexTweakObj existing = readCachedIndexTweak( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamIndexTweakByIndexIdxKey keyIndexIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
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
	public void deepDisposeIndexTweak( CFBamTweakPKey pkey ) {
		ICFBamIndexTweakObj obj = readCachedIndexTweak( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamIndexTweakObj lockIndexTweak( CFBamTweakPKey pkey ) {
		ICFBamIndexTweakObj locked = null;
		CFBamIndexTweakBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamIndexTweakObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockIndexTweak", pkey );
		}
		return( locked );
	}

	public List<ICFBamIndexTweakObj> readAllIndexTweak() {
		return( readAllIndexTweak( false ) );
	}

	public List<ICFBamIndexTweakObj> readAllIndexTweak( boolean forceRead ) {
		final String S_ProcName = "readAllIndexTweak";
		if( ( allIndexTweak == null ) || forceRead ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> map = new HashMap<CFBamTweakPKey,ICFBamIndexTweakObj>();
			allIndexTweak = map;
			CFBamIndexTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().readAllDerived( schema.getAuthorization() );
			CFBamIndexTweakBuff buff;
			ICFBamIndexTweakObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexTweakObj realised = (ICFBamIndexTweakObj)obj.realise();
			}
		}
		int len = allIndexTweak.size();
		ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
		Iterator<ICFBamIndexTweakObj> valIter = allIndexTweak.values().iterator();
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
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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
		List<ICFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexTweakObj> readCachedAllIndexTweak() {
		final String S_ProcName = "readCachedAllIndexTweak";
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>();
		if( allIndexTweak != null ) {
			int len = allIndexTweak.size();
			ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
			Iterator<ICFBamIndexTweakObj> valIter = allIndexTweak.values().iterator();
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
		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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

	public ICFBamIndexTweakObj readIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		return( readIndexTweakByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamIndexTweakObj readIndexTweakByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamTweakPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamIndexTweakObj obj = readIndexTweak( pkey, forceRead );
		return( obj );
	}

	public ICFBamIndexTweakObj readIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readIndexTweakByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public ICFBamIndexTweakObj readIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamTweakByUNameIdxKey,
				ICFBamIndexTweakObj >();
		}
		CFBamTweakByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamIndexTweakObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamTweakBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamIndexTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamIndexTweakObj readIndexTweakByUDefIdx( long TenantId,
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

	public ICFBamIndexTweakObj readIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< CFBamTweakByUDefIdxKey,
				ICFBamIndexTweakObj >();
		}
		CFBamTweakByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamIndexTweakObj obj = null;
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
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamIndexTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByValTentIdx( long TenantId )
	{
		return( readIndexTweakByValTentIdx( TenantId,
			false ) );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByValTentIdx";
		CFBamTweakByValTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< CFBamTweakByValTentIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamIndexTweakObj>();
			ICFBamTweakObj obj;
			CFBamTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			CFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexTweakObj realised = (ICFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
		Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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
		List<ICFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readIndexTweakByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByScopeIdx";
		CFBamTweakByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamTweakByScopeIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamIndexTweakObj>();
			ICFBamTweakObj obj;
			CFBamTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			CFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexTweakObj realised = (ICFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
		Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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
		List<ICFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readIndexTweakByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByDefSchemaIdx";
		CFBamTweakByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamTweakByDefSchemaIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamIndexTweakObj>();
			ICFBamTweakObj obj;
			CFBamTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexTweakObj realised = (ICFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
		Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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
		List<ICFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByIndexIdx( long TenantId,
		long IndexId )
	{
		return( readIndexTweakByIndexIdx( TenantId,
			IndexId,
			false ) );
	}

	public List<ICFBamIndexTweakObj> readIndexTweakByIndexIdx( long TenantId,
		long IndexId,
		boolean forceRead )
	{
		final String S_ProcName = "readIndexTweakByIndexIdx";
		CFBamIndexTweakByIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< CFBamIndexTweakByIndexIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( ( ! forceRead ) && indexByIndexIdx.containsKey( key ) ) {
			dict = indexByIndexIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamTweakPKey, ICFBamIndexTweakObj>();
			ICFBamIndexTweakObj obj;
			CFBamIndexTweakBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().readDerivedByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			CFBamIndexTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamIndexTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				ICFBamIndexTweakObj realised = (ICFBamIndexTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIndexIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
		Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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
		List<ICFBamIndexTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamIndexTweakObj readCachedIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		ICFBamIndexTweakObj obj = null;
		CFBamTweakPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedIndexTweak( pkey );
		return( obj );
	}

	public ICFBamIndexTweakObj readCachedIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamIndexTweakObj obj = null;
		CFBamTweakByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
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
			Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
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

	public ICFBamIndexTweakObj readCachedIndexTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		ICFBamIndexTweakObj obj = null;
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
				Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
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
			Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
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

	public List<ICFBamIndexTweakObj> readCachedIndexTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedIndexTweakByValTentIdx";
		CFBamTweakByValTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>();
		if( indexByValTentIdx != null ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
				Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
			ICFBamIndexTweakObj obj;
			Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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

	public List<ICFBamIndexTweakObj> readCachedIndexTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedIndexTweakByScopeIdx";
		CFBamTweakByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>();
		if( indexByScopeIdx != null ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
				Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
			ICFBamIndexTweakObj obj;
			Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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

	public List<ICFBamIndexTweakObj> readCachedIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedIndexTweakByDefSchemaIdx";
		CFBamTweakByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
				Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
			ICFBamIndexTweakObj obj;
			Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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

	public List<ICFBamIndexTweakObj> readCachedIndexTweakByIndexIdx( long TenantId,
		long IndexId )
	{
		final String S_ProcName = "readCachedIndexTweakByIndexIdx";
		CFBamIndexTweakByIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		ArrayList<ICFBamIndexTweakObj> arrayList = new ArrayList<ICFBamIndexTweakObj>();
		if( indexByIndexIdx != null ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict;
			if( indexByIndexIdx.containsKey( key ) ) {
				dict = indexByIndexIdx.get( key );
				int len = dict.size();
				ICFBamIndexTweakObj arr[] = new ICFBamIndexTweakObj[len];
				Iterator<ICFBamIndexTweakObj> valIter = dict.values().iterator();
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
			ICFBamIndexTweakObj obj;
			Iterator<ICFBamIndexTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamIndexTweakObj> cmp = new Comparator<ICFBamIndexTweakObj>() {
			public int compare( ICFBamIndexTweakObj lhs, ICFBamIndexTweakObj rhs ) {
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

	public void deepDisposeIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		ICFBamIndexTweakObj obj = readCachedIndexTweakByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeIndexTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamIndexTweakObj obj = readCachedIndexTweakByUNameIdx( TenantId,
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
		ICFBamIndexTweakObj obj = readCachedIndexTweakByUDefIdx( TenantId,
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
		ICFBamIndexTweakObj obj;
		List<ICFBamIndexTweakObj> arrayList = readCachedIndexTweakByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexTweakObj> arrayIter = arrayList.iterator();
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
		ICFBamIndexTweakObj obj;
		List<ICFBamIndexTweakObj> arrayList = readCachedIndexTweakByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexTweakObj> arrayIter = arrayList.iterator();
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
		ICFBamIndexTweakObj obj;
		List<ICFBamIndexTweakObj> arrayList = readCachedIndexTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexTweakObj> arrayIter = arrayList.iterator();
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
		ICFBamIndexTweakObj obj;
		List<ICFBamIndexTweakObj> arrayList = readCachedIndexTweakByIndexIdx( TenantId,
				IndexId );
		if( arrayList != null )  {
			Iterator<ICFBamIndexTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamIndexTweakObj updateIndexTweak( ICFBamIndexTweakObj Obj ) {
		ICFBamIndexTweakObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().updateIndexTweak( schema.getAuthorization(),
			Obj.getIndexTweakBuff() );
		if( Obj.getClassCode().equals( "a80b" ) ) {
			obj = (ICFBamIndexTweakObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteIndexTweak( ICFBamIndexTweakObj Obj ) {
		ICFBamIndexTweakObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweak( schema.getAuthorization(),
			obj.getIndexTweakBuff() );
		Obj.forget();
	}

	public void deleteIndexTweakByIdIdx( long TenantId,
		long Id )
	{
		CFBamTweakPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamIndexTweakObj obj = readIndexTweak( pkey );
		if( obj != null ) {
			ICFBamIndexTweakEditObj editObj = (ICFBamIndexTweakEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamIndexTweakEditObj)obj.beginEdit();
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
			indexByUNameIdx = new HashMap< CFBamTweakByUNameIdxKey,
				ICFBamIndexTweakObj >();
		}
		CFBamTweakByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamIndexTweakObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUNameIdx( schema.getAuthorization(),
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
			indexByUDefIdx = new HashMap< CFBamTweakByUDefIdxKey,
				ICFBamIndexTweakObj >();
		}
		CFBamTweakByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamIndexTweakObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByUDefIdx( schema.getAuthorization(),
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
		CFBamTweakByValTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< CFBamTweakByValTentIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict = indexByValTentIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamIndexTweakObj> iter = dict.values().iterator();
			ICFBamIndexTweakObj obj;
			List<ICFBamIndexTweakObj> toForget = new LinkedList<ICFBamIndexTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeIndexTweakByValTentIdx( TenantId );
	}

	public void deleteIndexTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		CFBamTweakByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamTweakByScopeIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict = indexByScopeIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<ICFBamIndexTweakObj> iter = dict.values().iterator();
			ICFBamIndexTweakObj obj;
			List<ICFBamIndexTweakObj> toForget = new LinkedList<ICFBamIndexTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeIndexTweakByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteIndexTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamTweakByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamTweakByDefSchemaIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamIndexTweakObj> iter = dict.values().iterator();
			ICFBamIndexTweakObj obj;
			List<ICFBamIndexTweakObj> toForget = new LinkedList<ICFBamIndexTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeIndexTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteIndexTweakByIndexIdx( long TenantId,
		long IndexId )
	{
		CFBamIndexTweakByIndexIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		if( indexByIndexIdx == null ) {
			indexByIndexIdx = new HashMap< CFBamIndexTweakByIndexIdxKey,
				Map< CFBamTweakPKey, ICFBamIndexTweakObj > >();
		}
		if( indexByIndexIdx.containsKey( key ) ) {
			Map<CFBamTweakPKey, ICFBamIndexTweakObj> dict = indexByIndexIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
			Iterator<ICFBamIndexTweakObj> iter = dict.values().iterator();
			ICFBamIndexTweakObj obj;
			List<ICFBamIndexTweakObj> toForget = new LinkedList<ICFBamIndexTweakObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableIndexTweak().deleteIndexTweakByIndexIdx( schema.getAuthorization(),
				TenantId,
				IndexId );
		}
		deepDisposeIndexTweakByIndexIdx( TenantId,
				IndexId );
	}
}
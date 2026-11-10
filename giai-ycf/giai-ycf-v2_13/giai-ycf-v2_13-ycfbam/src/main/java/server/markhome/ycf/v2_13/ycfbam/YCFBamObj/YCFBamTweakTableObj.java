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

public class YCFBamTweakTableObj
	implements IYCFBamTweakTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamTweakPKey, IYCFBamTweakObj> members;
	private Map<YCFBamTweakPKey, IYCFBamTweakObj> allTweak;
	private Map< YCFBamTweakByUNameIdxKey,
		IYCFBamTweakObj > indexByUNameIdx;
	private Map< YCFBamTweakByUDefIdxKey,
		IYCFBamTweakObj > indexByUDefIdx;
	private Map< YCFBamTweakByValTentIdxKey,
		Map<YCFBamTweakPKey, IYCFBamTweakObj > > indexByValTentIdx;
	private Map< YCFBamTweakByScopeIdxKey,
		Map<YCFBamTweakPKey, IYCFBamTweakObj > > indexByScopeIdx;
	private Map< YCFBamTweakByDefSchemaIdxKey,
		Map<YCFBamTweakPKey, IYCFBamTweakObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "Tweak";
	public static String TABLE_DBNAME = "tweakdef";

	public YCFBamTweakTableObj() {
		schema = null;
		members = new HashMap<YCFBamTweakPKey, IYCFBamTweakObj>();
		allTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
	}

	public YCFBamTweakTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamTweakPKey, IYCFBamTweakObj>();
		allTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
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
		allTweak = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByValTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		List<IYCFBamTweakObj> toForget = new LinkedList<IYCFBamTweakObj>();
		IYCFBamTweakObj cur = null;
		Iterator<IYCFBamTweakObj> iter = members.values().iterator();
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
	 *	YCFBamTweakObj.
	 */
	public IYCFBamTweakObj newInstance() {
		IYCFBamTweakObj inst = new YCFBamTweakObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamTweakObj.
	 */
	public IYCFBamTweakEditObj newEditInstance( IYCFBamTweakObj orig ) {
		IYCFBamTweakEditObj edit = new YCFBamTweakEditObj( orig );
		return( edit );
	}

	public IYCFBamTweakObj constructByClassCode( String argClassCode ) {
		IYCFBamTweakObj obj = null;
		if( argClassCode.equals( "a808" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getTweakTableObj().newInstance();
		}
		else if( argClassCode.equals( "a809" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getTableTweakTableObj().newInstance();
		}
		else if( argClassCode.equals( "a80a" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getSchemaTweakTableObj().newInstance();
		}
		else if( argClassCode.equals( "a80b" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getIndexTweakTableObj().newInstance();
		}
		return( obj );
	}

	public IYCFBamTweakObj realiseTweak( IYCFBamTweakObj Obj ) {
		IYCFBamTweakObj obj = Obj;
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamTweakObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamTweakObj existingObj = members.get( pkey );
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
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.remove( keepObj.getPKey() );
					if( mapValTentIdx.size() <= 0 ) {
						indexByValTentIdx.remove( keyValTentIdx );
					}
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.remove( keepObj.getPKey() );
					if( mapScopeIdx.size() <= 0 ) {
						indexByScopeIdx.remove( keyScopeIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
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
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allTweak != null ) {
				allTweak.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTweak != null ) {
				allTweak.put( keepObj.getPKey(), keepObj );
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
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapValTentIdx = indexByValTentIdx.get( keyValTentIdx );
				if( mapValTentIdx != null ) {
					mapValTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamTweakByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamTweakPKey, IYCFBamTweakObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamTweakObj createTweak( IYCFBamTweakObj Obj ) {
		IYCFBamTweakObj obj = Obj;
		YCFBamTweakBuff buff = obj.getTweakBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableTweak().createTweak(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a808" ) ) {
			obj = (IYCFBamTweakObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamTweakObj readTweak( YCFBamTweakPKey pkey ) {
		return( readTweak( pkey, false ) );
	}

	public IYCFBamTweakObj readTweak( YCFBamTweakPKey pkey, boolean forceRead ) {
		IYCFBamTweakObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamTweakBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamTweakObj readCachedTweak( YCFBamTweakPKey pkey ) {
		IYCFBamTweakObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTweak( IYCFBamTweakObj obj )
	{
		final String S_ProcName = "YCFBamTweakTableObj.reallyDeepDisposeTweak() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamTweakPKey pkey = obj.getPKey();
		IYCFBamTweakObj existing = readCachedTweak( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamTweakByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTweakByUDefIdxKey keyUDefIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		keyUDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUDefIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUDefIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyUDefIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );
		keyUDefIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTweakByValTentIdxKey keyValTentIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamTweakByScopeIdxKey keyScopeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );



		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByUDefIdx != null ) {
			indexByUDefIdx.remove( keyUDefIdx );
		}

		if( indexByValTentIdx != null ) {
			if( indexByValTentIdx.containsKey( keyValTentIdx ) ) {
				indexByValTentIdx.get( keyValTentIdx ).remove( pkey );
				if( indexByValTentIdx.get( keyValTentIdx ).size() <= 0 ) {
					indexByValTentIdx.remove( keyValTentIdx );
				}
			}
		}

		if( indexByScopeIdx != null ) {
			if( indexByScopeIdx.containsKey( keyScopeIdx ) ) {
				indexByScopeIdx.get( keyScopeIdx ).remove( pkey );
				if( indexByScopeIdx.get( keyScopeIdx ).size() <= 0 ) {
					indexByScopeIdx.remove( keyScopeIdx );
				}
			}
		}

		if( indexByDefSchemaIdx != null ) {
			if( indexByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
				indexByDefSchemaIdx.get( keyDefSchemaIdx ).remove( pkey );
				if( indexByDefSchemaIdx.get( keyDefSchemaIdx ).size() <= 0 ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}
		}


	}
	public void deepDisposeTweak( YCFBamTweakPKey pkey ) {
		IYCFBamTweakObj obj = readCachedTweak( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamTweakObj lockTweak( YCFBamTweakPKey pkey ) {
		IYCFBamTweakObj locked = null;
		YCFBamTweakBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamTweakObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockTweak", pkey );
		}
		return( locked );
	}

	public List<IYCFBamTweakObj> readAllTweak() {
		return( readAllTweak( false ) );
	}

	public List<IYCFBamTweakObj> readAllTweak( boolean forceRead ) {
		final String S_ProcName = "readAllTweak";
		if( ( allTweak == null ) || forceRead ) {
			Map<YCFBamTweakPKey, IYCFBamTweakObj> map = new HashMap<YCFBamTweakPKey,IYCFBamTweakObj>();
			allTweak = map;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readAllDerived( schema.getAuthorization() );
			YCFBamTweakBuff buff;
			IYCFBamTweakObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTweakObj realised = (IYCFBamTweakObj)obj.realise();
			}
		}
		int len = allTweak.size();
		IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
		Iterator<IYCFBamTweakObj> valIter = allTweak.values().iterator();
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
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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
		List<IYCFBamTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTweakObj> readCachedAllTweak() {
		final String S_ProcName = "readCachedAllTweak";
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>();
		if( allTweak != null ) {
			int len = allTweak.size();
			IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
			Iterator<IYCFBamTweakObj> valIter = allTweak.values().iterator();
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
		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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

	public IYCFBamTweakObj readTweakByIdIdx( long TenantId,
		long Id )
	{
		return( readTweakByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamTweakObj readTweakByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTweakObj obj = readTweak( pkey, forceRead );
		return( obj );
	}

	public IYCFBamTweakObj readTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readTweakByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamTweakObj readTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamTweakObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamTweakBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamTweakObj readTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		return( readTweakByUDefIdx( TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name,
			false ) );
	}

	public IYCFBamTweakObj readTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamTweakObj obj = null;
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
				obj = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamTweakObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamTweakObj> readTweakByValTentIdx( long TenantId )
	{
		return( readTweakByValTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamTweakObj> readTweakByValTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamTweakPKey, IYCFBamTweakObj> dict;
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTweakObj > >();
		}
		if( ( ! forceRead ) && indexByValTentIdx.containsKey( key ) ) {
			dict = indexByValTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByValTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTweakObj realised = (IYCFBamTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByValTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
		Iterator<IYCFBamTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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
		List<IYCFBamTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTweakObj> readTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readTweakByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamTweakObj> readTweakByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamTweakPKey, IYCFBamTweakObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTweakObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTweakObj realised = (IYCFBamTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
		Iterator<IYCFBamTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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
		List<IYCFBamTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamTweakObj> readTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readTweakByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamTweakObj> readTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamTweakPKey, IYCFBamTweakObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTweakObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamTweakPKey, IYCFBamTweakObj>();
			IYCFBamTweakObj obj;
			YCFBamTweakBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableTweak().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamTweakBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamTweakObj)schema.getTweakTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey() );
				obj.setBuff( buff );
				IYCFBamTweakObj realised = (IYCFBamTweakObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
		Iterator<IYCFBamTweakObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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
		List<IYCFBamTweakObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamTweakObj readCachedTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTweakObj obj = null;
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedTweak( pkey );
		return( obj );
	}

	public IYCFBamTweakObj readCachedTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamTweakObj obj = null;
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamTweakObj> valIter = members.values().iterator();
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

	public IYCFBamTweakObj readCachedTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamTweakObj obj = null;
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
				Iterator<IYCFBamTweakObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamTweakObj> valIter = members.values().iterator();
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

	public List<IYCFBamTweakObj> readCachedTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTweakByValTentIdx";
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>();
		if( indexByValTentIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamTweakObj> dict;
			if( indexByValTentIdx.containsKey( key ) ) {
				dict = indexByValTentIdx.get( key );
				int len = dict.size();
				IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
				Iterator<IYCFBamTweakObj> valIter = dict.values().iterator();
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
			IYCFBamTweakObj obj;
			Iterator<IYCFBamTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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

	public List<IYCFBamTweakObj> readCachedTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedTweakByScopeIdx";
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamTweakObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
				Iterator<IYCFBamTweakObj> valIter = dict.values().iterator();
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
			IYCFBamTweakObj obj;
			Iterator<IYCFBamTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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

	public List<IYCFBamTweakObj> readCachedTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedTweakByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamTweakObj> arrayList = new ArrayList<IYCFBamTweakObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamTweakPKey, IYCFBamTweakObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamTweakObj arr[] = new IYCFBamTweakObj[len];
				Iterator<IYCFBamTweakObj> valIter = dict.values().iterator();
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
			IYCFBamTweakObj obj;
			Iterator<IYCFBamTweakObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamTweakObj> cmp = new Comparator<IYCFBamTweakObj>() {
			public int compare( IYCFBamTweakObj lhs, IYCFBamTweakObj rhs ) {
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

	public void deepDisposeTweakByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamTweakObj obj = readCachedTweakByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamTweakObj obj = readCachedTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamTweakObj obj = readCachedTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTweakByValTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTweakByValTentIdx";
		IYCFBamTweakObj obj;
		List<IYCFBamTweakObj> arrayList = readCachedTweakByValTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeTweakByScopeIdx";
		IYCFBamTweakObj obj;
		List<IYCFBamTweakObj> arrayList = readCachedTweakByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeTweakByDefSchemaIdx";
		IYCFBamTweakObj obj;
		List<IYCFBamTweakObj> arrayList = readCachedTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamTweakObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamTweakObj updateTweak( IYCFBamTweakObj Obj ) {
		IYCFBamTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTweak().updateTweak( schema.getAuthorization(),
			Obj.getTweakBuff() );
		if( Obj.getClassCode().equals( "a808" ) ) {
			obj = (IYCFBamTweakObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteTweak( IYCFBamTweakObj Obj ) {
		IYCFBamTweakObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweak( schema.getAuthorization(),
			obj.getTweakBuff() );
		Obj.forget();
	}

	public void deleteTweakByIdIdx( long TenantId,
		long Id )
	{
		YCFBamTweakPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamTweakObj obj = readTweak( pkey );
		if( obj != null ) {
			IYCFBamTweakEditObj editObj = (IYCFBamTweakEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamTweakEditObj)obj.beginEdit();
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
		deepDisposeTweakByIdIdx( TenantId,
				Id );
	}

	public void deleteTweakByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamTweakByUNameIdxKey,
				IYCFBamTweakObj >();
		}
		YCFBamTweakByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamTweakObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeTweakByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteTweakByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamTweakByUDefIdxKey,
				IYCFBamTweakObj >();
		}
		YCFBamTweakByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamTweakObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		}
		deepDisposeTweakByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
	}

	public void deleteTweakByValTentIdx( long TenantId )
	{
		YCFBamTweakByValTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByValTentIdx == null ) {
			indexByValTentIdx = new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTweakObj > >();
		}
		if( indexByValTentIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamTweakObj> dict = indexByValTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamTweakObj> iter = dict.values().iterator();
			IYCFBamTweakObj obj;
			List<IYCFBamTweakObj> toForget = new LinkedList<IYCFBamTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByValTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTweakByValTentIdx( TenantId );
	}

	public void deleteTweakByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamTweakByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTweakObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamTweakObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamTweakObj> iter = dict.values().iterator();
			IYCFBamTweakObj obj;
			List<IYCFBamTweakObj> toForget = new LinkedList<IYCFBamTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeTweakByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteTweakByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey, IYCFBamTweakObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamTweakPKey, IYCFBamTweakObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamTweakObj> iter = dict.values().iterator();
			IYCFBamTweakObj obj;
			List<IYCFBamTweakObj> toForget = new LinkedList<IYCFBamTweakObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableTweak().deleteTweakByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeTweakByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}

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

public class CFBamRoleDefTableObj
	implements ICFBamRoleDefTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamRoleDefPKey, ICFBamRoleDefObj> members;
	private Map<CFBamRoleDefPKey, ICFBamRoleDefObj> allRoleDef;
	private Map< CFBamRoleDefByUNameIdxKey,
		ICFBamRoleDefObj > indexByUNameIdx;
	private Map< CFBamRoleDefByUDefIdxKey,
		ICFBamRoleDefObj > indexByUDefIdx;
	private Map< CFBamRoleDefByRoleDefTentIdxKey,
		Map<CFBamRoleDefPKey, ICFBamRoleDefObj > > indexByRoleDefTentIdx;
	private Map< CFBamRoleDefByScopeIdxKey,
		Map<CFBamRoleDefPKey, ICFBamRoleDefObj > > indexByScopeIdx;
	private Map< CFBamRoleDefByDefSchemaIdxKey,
		Map<CFBamRoleDefPKey, ICFBamRoleDefObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "RoleDef";
	public static String TABLE_DBNAME = "roledef";

	public CFBamRoleDefTableObj() {
		schema = null;
		members = new HashMap<CFBamRoleDefPKey, ICFBamRoleDefObj>();
		allRoleDef = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
	}

	public CFBamRoleDefTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamRoleDefPKey, ICFBamRoleDefObj>();
		allRoleDef = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
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
		allRoleDef = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		List<ICFBamRoleDefObj> toForget = new LinkedList<ICFBamRoleDefObj>();
		ICFBamRoleDefObj cur = null;
		Iterator<ICFBamRoleDefObj> iter = members.values().iterator();
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
	 *	CFBamRoleDefObj.
	 */
	public ICFBamRoleDefObj newInstance() {
		ICFBamRoleDefObj inst = new CFBamRoleDefObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamRoleDefObj.
	 */
	public ICFBamRoleDefEditObj newEditInstance( ICFBamRoleDefObj orig ) {
		ICFBamRoleDefEditObj edit = new CFBamRoleDefEditObj( orig );
		return( edit );
	}

	public ICFBamRoleDefObj constructByClassCode( String argClassCode ) {
		ICFBamRoleDefObj obj = null;
		if( argClassCode.equals( "a88d" ) ) {
			obj = ((ICFBamSchemaObj)schema).getRoleDefTableObj().newInstance();
		}
		else if( argClassCode.equals( "a88e" ) ) {
			obj = ((ICFBamSchemaObj)schema).getSchemaRoleTableObj().newInstance();
		}
		return( obj );
	}

	public ICFBamRoleDefObj realiseRoleDef( ICFBamRoleDefObj Obj ) {
		ICFBamRoleDefObj obj = Obj;
		CFBamRoleDefPKey pkey = obj.getPKey();
		ICFBamRoleDefObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamRoleDefObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				CFBamRoleDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByUDefIdx != null ) {
				CFBamRoleDefByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.remove( keyUDefIdx );
			}

			if( indexByRoleDefTentIdx != null ) {
				CFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.remove( keepObj.getPKey() );
					if( mapRoleDefTentIdx.size() <= 0 ) {
						indexByRoleDefTentIdx.remove( keyRoleDefTentIdx );
					}
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamRoleDefByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.remove( keepObj.getPKey() );
					if( mapScopeIdx.size() <= 0 ) {
						indexByScopeIdx.remove( keyScopeIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
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
				CFBamRoleDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				CFBamRoleDefByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				CFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamRoleDefByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allRoleDef != null ) {
				allRoleDef.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allRoleDef != null ) {
				allRoleDef.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUNameIdx != null ) {
				CFBamRoleDefByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				CFBamRoleDefByUDefIdxKey keyUDefIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				CFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				CFBamRoleDefByScopeIdxKey keyScopeIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamRoleDefPKey, ICFBamRoleDefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamRoleDefObj createRoleDef( ICFBamRoleDefObj Obj ) {
		ICFBamRoleDefObj obj = Obj;
		CFBamRoleDefBuff buff = obj.getRoleDefBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().createRoleDef(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a88d" ) ) {
			obj = (ICFBamRoleDefObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamRoleDefObj readRoleDef( CFBamRoleDefPKey pkey ) {
		return( readRoleDef( pkey, false ) );
	}

	public ICFBamRoleDefObj readRoleDef( CFBamRoleDefPKey pkey, boolean forceRead ) {
		ICFBamRoleDefObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamRoleDefBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamRoleDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamRoleDefObj readCachedRoleDef( CFBamRoleDefPKey pkey ) {
		ICFBamRoleDefObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRoleDef( ICFBamRoleDefObj obj )
	{
		final String S_ProcName = "CFBamRoleDefTableObj.reallyDeepDisposeRoleDef() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamRoleDefPKey pkey = obj.getPKey();
		ICFBamRoleDefObj existing = readCachedRoleDef( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamRoleDefByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamRoleDefByUDefIdxKey keyUDefIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		keyUDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUDefIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUDefIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyUDefIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );
		keyUDefIdx.setRequiredName( existing.getRequiredName() );

		CFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		keyRoleDefTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFBamRoleDefByScopeIdxKey keyScopeIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		CFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );



		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByUDefIdx != null ) {
			indexByUDefIdx.remove( keyUDefIdx );
		}

		if( indexByRoleDefTentIdx != null ) {
			if( indexByRoleDefTentIdx.containsKey( keyRoleDefTentIdx ) ) {
				indexByRoleDefTentIdx.get( keyRoleDefTentIdx ).remove( pkey );
				if( indexByRoleDefTentIdx.get( keyRoleDefTentIdx ).size() <= 0 ) {
					indexByRoleDefTentIdx.remove( keyRoleDefTentIdx );
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
	public void deepDisposeRoleDef( CFBamRoleDefPKey pkey ) {
		ICFBamRoleDefObj obj = readCachedRoleDef( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamRoleDefObj lockRoleDef( CFBamRoleDefPKey pkey ) {
		ICFBamRoleDefObj locked = null;
		CFBamRoleDefBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamRoleDefObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockRoleDef", pkey );
		}
		return( locked );
	}

	public List<ICFBamRoleDefObj> readAllRoleDef() {
		return( readAllRoleDef( false ) );
	}

	public List<ICFBamRoleDefObj> readAllRoleDef( boolean forceRead ) {
		final String S_ProcName = "readAllRoleDef";
		if( ( allRoleDef == null ) || forceRead ) {
			Map<CFBamRoleDefPKey, ICFBamRoleDefObj> map = new HashMap<CFBamRoleDefPKey,ICFBamRoleDefObj>();
			allRoleDef = map;
			CFBamRoleDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readAllDerived( schema.getAuthorization() );
			CFBamRoleDefBuff buff;
			ICFBamRoleDefObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamRoleDefObj realised = (ICFBamRoleDefObj)obj.realise();
			}
		}
		int len = allRoleDef.size();
		ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
		Iterator<ICFBamRoleDefObj> valIter = allRoleDef.values().iterator();
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
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRoleDefObj> readCachedAllRoleDef() {
		final String S_ProcName = "readCachedAllRoleDef";
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>();
		if( allRoleDef != null ) {
			int len = allRoleDef.size();
			ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
			Iterator<ICFBamRoleDefObj> valIter = allRoleDef.values().iterator();
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
		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id )
	{
		return( readRoleDefByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamRoleDefPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamRoleDefObj obj = readRoleDef( pkey, forceRead );
		return( obj );
	}

	public ICFBamRoleDefObj readRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readRoleDefByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public ICFBamRoleDefObj readRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamRoleDefByUNameIdxKey,
				ICFBamRoleDefObj >();
		}
		CFBamRoleDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamRoleDefObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamRoleDefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamRoleDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamRoleDefObj readRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		return( readRoleDefByUDefIdx( TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name,
			false ) );
	}

	public ICFBamRoleDefObj readRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< CFBamRoleDefByUDefIdxKey,
				ICFBamRoleDefObj >();
		}
		CFBamRoleDefByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamRoleDefObj obj = null;
		if( ( ! forceRead ) && indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
		}
		else {
			CFBamRoleDefBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			if( buff != null ) {
				obj = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamRoleDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId )
	{
		return( readRoleDefByRoleDefTentIdx( TenantId,
			false ) );
	}

	public List<ICFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRoleDefByRoleDefTentIdx";
		CFBamRoleDefByRoleDefTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict;
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< CFBamRoleDefByRoleDefTentIdxKey,
				Map< CFBamRoleDefPKey, ICFBamRoleDefObj > >();
		}
		if( ( ! forceRead ) && indexByRoleDefTentIdx.containsKey( key ) ) {
			dict = indexByRoleDefTentIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamRoleDefObj>();
			ICFBamRoleDefObj obj;
			CFBamRoleDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			CFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamRoleDefObj realised = (ICFBamRoleDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRoleDefTentIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
		Iterator<ICFBamRoleDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readRoleDefByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<ICFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readRoleDefByScopeIdx";
		CFBamRoleDefByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamRoleDefByScopeIdxKey,
				Map< CFBamRoleDefPKey, ICFBamRoleDefObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamRoleDefObj>();
			ICFBamRoleDefObj obj;
			CFBamRoleDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			CFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamRoleDefObj realised = (ICFBamRoleDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
		Iterator<ICFBamRoleDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readRoleDefByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readRoleDefByDefSchemaIdx";
		CFBamRoleDefByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamRoleDefByDefSchemaIdxKey,
				Map< CFBamRoleDefPKey, ICFBamRoleDefObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamRoleDefPKey, ICFBamRoleDefObj>();
			ICFBamRoleDefObj obj;
			CFBamRoleDefBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				ICFBamRoleDefObj realised = (ICFBamRoleDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
		Iterator<ICFBamRoleDefObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamRoleDefObj readCachedRoleDefByIdIdx( long TenantId,
		long Id )
	{
		ICFBamRoleDefObj obj = null;
		CFBamRoleDefPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedRoleDef( pkey );
		return( obj );
	}

	public ICFBamRoleDefObj readCachedRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamRoleDefObj obj = null;
		CFBamRoleDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamRoleDefObj> valIter = members.values().iterator();
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
			Iterator<ICFBamRoleDefObj> valIter = members.values().iterator();
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

	public ICFBamRoleDefObj readCachedRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		ICFBamRoleDefObj obj = null;
		CFBamRoleDefByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
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
				Iterator<ICFBamRoleDefObj> valIter = members.values().iterator();
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
			Iterator<ICFBamRoleDefObj> valIter = members.values().iterator();
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

	public List<ICFBamRoleDefObj> readCachedRoleDefByRoleDefTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRoleDefByRoleDefTentIdx";
		CFBamRoleDefByRoleDefTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>();
		if( indexByRoleDefTentIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict;
			if( indexByRoleDefTentIdx.containsKey( key ) ) {
				dict = indexByRoleDefTentIdx.get( key );
				int len = dict.size();
				ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
				Iterator<ICFBamRoleDefObj> valIter = dict.values().iterator();
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
			ICFBamRoleDefObj obj;
			Iterator<ICFBamRoleDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRoleDefObj> readCachedRoleDefByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedRoleDefByScopeIdx";
		CFBamRoleDefByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>();
		if( indexByScopeIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
				Iterator<ICFBamRoleDefObj> valIter = dict.values().iterator();
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
			ICFBamRoleDefObj obj;
			Iterator<ICFBamRoleDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamRoleDefObj> readCachedRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedRoleDefByDefSchemaIdx";
		CFBamRoleDefByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamRoleDefObj> arrayList = new ArrayList<ICFBamRoleDefObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamRoleDefObj arr[] = new ICFBamRoleDefObj[len];
				Iterator<ICFBamRoleDefObj> valIter = dict.values().iterator();
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
			ICFBamRoleDefObj obj;
			Iterator<ICFBamRoleDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamRoleDefObj> cmp = new Comparator<ICFBamRoleDefObj>() {
			public int compare( ICFBamRoleDefObj lhs, ICFBamRoleDefObj rhs ) {
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
					CFBamRoleDefPKey lhsPKey = lhs.getPKey();
					CFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeRoleDefByIdIdx( long TenantId,
		long Id )
	{
		ICFBamRoleDefObj obj = readCachedRoleDefByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		ICFBamRoleDefObj obj = readCachedRoleDefByUNameIdx( TenantId,
				ScopeId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		ICFBamRoleDefObj obj = readCachedRoleDefByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRoleDefByRoleDefTentIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRoleDefByRoleDefTentIdx";
		ICFBamRoleDefObj obj;
		List<ICFBamRoleDefObj> arrayList = readCachedRoleDefByRoleDefTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamRoleDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRoleDefByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "deepDisposeRoleDefByScopeIdx";
		ICFBamRoleDefObj obj;
		List<ICFBamRoleDefObj> arrayList = readCachedRoleDefByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<ICFBamRoleDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeRoleDefByDefSchemaIdx";
		ICFBamRoleDefObj obj;
		List<ICFBamRoleDefObj> arrayList = readCachedRoleDefByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamRoleDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamRoleDefObj updateRoleDef( ICFBamRoleDefObj Obj ) {
		ICFBamRoleDefObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().updateRoleDef( schema.getAuthorization(),
			Obj.getRoleDefBuff() );
		if( Obj.getClassCode().equals( "a88d" ) ) {
			obj = (ICFBamRoleDefObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteRoleDef( ICFBamRoleDefObj Obj ) {
		ICFBamRoleDefObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDef( schema.getAuthorization(),
			obj.getRoleDefBuff() );
		Obj.forget();
	}

	public void deleteRoleDefByIdIdx( long TenantId,
		long Id )
	{
		CFBamRoleDefPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamRoleDefObj obj = readRoleDef( pkey );
		if( obj != null ) {
			ICFBamRoleDefEditObj editObj = (ICFBamRoleDefEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamRoleDefEditObj)obj.beginEdit();
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
		deepDisposeRoleDefByIdIdx( TenantId,
				Id );
	}

	public void deleteRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamRoleDefByUNameIdxKey,
				ICFBamRoleDefObj >();
		}
		CFBamRoleDefByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		ICFBamRoleDefObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
		}
		deepDisposeRoleDefByUNameIdx( TenantId,
				ScopeId,
				Name );
	}

	public void deleteRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< CFBamRoleDefByUDefIdxKey,
				ICFBamRoleDefObj >();
		}
		CFBamRoleDefByUDefIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		ICFBamRoleDefObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
		}
		deepDisposeRoleDefByUDefIdx( TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
	}

	public void deleteRoleDefByRoleDefTentIdx( long TenantId )
	{
		CFBamRoleDefByRoleDefTentIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< CFBamRoleDefByRoleDefTentIdxKey,
				Map< CFBamRoleDefPKey, ICFBamRoleDefObj > >();
		}
		if( indexByRoleDefTentIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict = indexByRoleDefTentIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamRoleDefObj> iter = dict.values().iterator();
			ICFBamRoleDefObj obj;
			List<ICFBamRoleDefObj> toForget = new LinkedList<ICFBamRoleDefObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRoleDefTentIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRoleDefByRoleDefTentIdx( TenantId );
	}

	public void deleteRoleDefByScopeIdx( long TenantId,
		long ScopeId )
	{
		CFBamRoleDefByScopeIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< CFBamRoleDefByScopeIdxKey,
				Map< CFBamRoleDefPKey, ICFBamRoleDefObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict = indexByScopeIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<ICFBamRoleDefObj> iter = dict.values().iterator();
			ICFBamRoleDefObj obj;
			List<ICFBamRoleDefObj> toForget = new LinkedList<ICFBamRoleDefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeRoleDefByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamRoleDefByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamRoleDefByDefSchemaIdxKey,
				Map< CFBamRoleDefPKey, ICFBamRoleDefObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamRoleDefPKey, ICFBamRoleDefObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamRoleDefObj> iter = dict.values().iterator();
			ICFBamRoleDefObj obj;
			List<ICFBamRoleDefObj> toForget = new LinkedList<ICFBamRoleDefObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeRoleDefByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}
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

public class YCFBamRoleDefTableObj
	implements IYCFBamRoleDefTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> members;
	private Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> allRoleDef;
	private Map< YCFBamRoleDefByUNameIdxKey,
		IYCFBamRoleDefObj > indexByUNameIdx;
	private Map< YCFBamRoleDefByUDefIdxKey,
		IYCFBamRoleDefObj > indexByUDefIdx;
	private Map< YCFBamRoleDefByRoleDefTentIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > > indexByRoleDefTentIdx;
	private Map< YCFBamRoleDefByScopeIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > > indexByScopeIdx;
	private Map< YCFBamRoleDefByDefSchemaIdxKey,
		Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "RoleDef";
	public static String TABLE_DBNAME = "roledef";

	public YCFBamRoleDefTableObj() {
		schema = null;
		members = new HashMap<YCFBamRoleDefPKey, IYCFBamRoleDefObj>();
		allRoleDef = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
	}

	public YCFBamRoleDefTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamRoleDefPKey, IYCFBamRoleDefObj>();
		allRoleDef = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
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
		allRoleDef = null;
		indexByUNameIdx = null;
		indexByUDefIdx = null;
		indexByRoleDefTentIdx = null;
		indexByScopeIdx = null;
		indexByDefSchemaIdx = null;
		List<IYCFBamRoleDefObj> toForget = new LinkedList<IYCFBamRoleDefObj>();
		IYCFBamRoleDefObj cur = null;
		Iterator<IYCFBamRoleDefObj> iter = members.values().iterator();
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
	 *	YCFBamRoleDefObj.
	 */
	public IYCFBamRoleDefObj newInstance() {
		IYCFBamRoleDefObj inst = new YCFBamRoleDefObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamRoleDefObj.
	 */
	public IYCFBamRoleDefEditObj newEditInstance( IYCFBamRoleDefObj orig ) {
		IYCFBamRoleDefEditObj edit = new YCFBamRoleDefEditObj( orig );
		return( edit );
	}

	public IYCFBamRoleDefObj constructByClassCode( String argClassCode ) {
		IYCFBamRoleDefObj obj = null;
		if( argClassCode.equals( "a88d" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getRoleDefTableObj().newInstance();
		}
		else if( argClassCode.equals( "a88e" ) ) {
			obj = ((IYCFBamSchemaObj)schema).getSchemaRoleTableObj().newInstance();
		}
		return( obj );
	}

	public IYCFBamRoleDefObj realiseRoleDef( IYCFBamRoleDefObj Obj ) {
		IYCFBamRoleDefObj obj = Obj;
		YCFBamRoleDefPKey pkey = obj.getPKey();
		IYCFBamRoleDefObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamRoleDefObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUNameIdx != null ) {
				YCFBamRoleDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByUDefIdx != null ) {
				YCFBamRoleDefByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.remove( keyUDefIdx );
			}

			if( indexByRoleDefTentIdx != null ) {
				YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.remove( keepObj.getPKey() );
					if( mapRoleDefTentIdx.size() <= 0 ) {
						indexByRoleDefTentIdx.remove( keyRoleDefTentIdx );
					}
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamRoleDefByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.remove( keepObj.getPKey() );
					if( mapScopeIdx.size() <= 0 ) {
						indexByScopeIdx.remove( keyScopeIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
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
				YCFBamRoleDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				YCFBamRoleDefByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamRoleDefByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
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
				YCFBamRoleDefByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByUDefIdx != null ) {
				YCFBamRoleDefByUDefIdxKey keyUDefIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
				keyUDefIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUDefIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				keyUDefIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyUDefIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				keyUDefIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUDefIdx.put( keyUDefIdx, keepObj );
			}

			if( indexByRoleDefTentIdx != null ) {
				YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
				keyRoleDefTentIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapRoleDefTentIdx = indexByRoleDefTentIdx.get( keyRoleDefTentIdx );
				if( mapRoleDefTentIdx != null ) {
					mapRoleDefTentIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByScopeIdx != null ) {
				YCFBamRoleDefByScopeIdxKey keyScopeIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
				keyScopeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyScopeIdx.setRequiredScopeId( keepObj.getRequiredScopeId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapScopeIdx = indexByScopeIdx.get( keyScopeIdx );
				if( mapScopeIdx != null ) {
					mapScopeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamRoleDefObj createRoleDef( IYCFBamRoleDefObj Obj ) {
		IYCFBamRoleDefObj obj = Obj;
		YCFBamRoleDefBuff buff = obj.getRoleDefBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().createRoleDef(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a88d" ) ) {
			obj = (IYCFBamRoleDefObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamRoleDefObj readRoleDef( YCFBamRoleDefPKey pkey ) {
		return( readRoleDef( pkey, false ) );
	}

	public IYCFBamRoleDefObj readRoleDef( YCFBamRoleDefPKey pkey, boolean forceRead ) {
		IYCFBamRoleDefObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamRoleDefBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamRoleDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamRoleDefObj readCachedRoleDef( YCFBamRoleDefPKey pkey ) {
		IYCFBamRoleDefObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRoleDef( IYCFBamRoleDefObj obj )
	{
		final String S_ProcName = "YCFBamRoleDefTableObj.reallyDeepDisposeRoleDef() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamRoleDefPKey pkey = obj.getPKey();
		IYCFBamRoleDefObj existing = readCachedRoleDef( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamRoleDefByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRoleDefByUDefIdxKey keyUDefIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		keyUDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUDefIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUDefIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyUDefIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );
		keyUDefIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		keyRoleDefTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRoleDefByScopeIdxKey keyScopeIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
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
	public void deepDisposeRoleDef( YCFBamRoleDefPKey pkey ) {
		IYCFBamRoleDefObj obj = readCachedRoleDef( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamRoleDefObj lockRoleDef( YCFBamRoleDefPKey pkey ) {
		IYCFBamRoleDefObj locked = null;
		YCFBamRoleDefBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamRoleDefObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockRoleDef", pkey );
		}
		return( locked );
	}

	public List<IYCFBamRoleDefObj> readAllRoleDef() {
		return( readAllRoleDef( false ) );
	}

	public List<IYCFBamRoleDefObj> readAllRoleDef( boolean forceRead ) {
		final String S_ProcName = "readAllRoleDef";
		if( ( allRoleDef == null ) || forceRead ) {
			Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> map = new HashMap<YCFBamRoleDefPKey,IYCFBamRoleDefObj>();
			allRoleDef = map;
			YCFBamRoleDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readAllDerived( schema.getAuthorization() );
			YCFBamRoleDefBuff buff;
			IYCFBamRoleDefObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamRoleDefObj realised = (IYCFBamRoleDefObj)obj.realise();
			}
		}
		int len = allRoleDef.size();
		IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
		Iterator<IYCFBamRoleDefObj> valIter = allRoleDef.values().iterator();
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
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRoleDefObj> readCachedAllRoleDef() {
		final String S_ProcName = "readCachedAllRoleDef";
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>();
		if( allRoleDef != null ) {
			int len = allRoleDef.size();
			IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
			Iterator<IYCFBamRoleDefObj> valIter = allRoleDef.values().iterator();
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
		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id )
	{
		return( readRoleDefByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamRoleDefObj readRoleDefByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamRoleDefPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamRoleDefObj obj = readRoleDef( pkey, forceRead );
		return( obj );
	}

	public IYCFBamRoleDefObj readRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		return( readRoleDefByUNameIdx( TenantId,
			ScopeId,
			Name,
			false ) );
	}

	public IYCFBamRoleDefObj readRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamRoleDefByUNameIdxKey,
				IYCFBamRoleDefObj >();
		}
		YCFBamRoleDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamRoleDefObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamRoleDefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamRoleDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamRoleDefObj readRoleDefByUDefIdx( long TenantId,
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

	public IYCFBamRoleDefObj readRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name, boolean forceRead )
	{
		if( indexByUDefIdx == null ) {
			indexByUDefIdx = new HashMap< YCFBamRoleDefByUDefIdxKey,
				IYCFBamRoleDefObj >();
		}
		YCFBamRoleDefByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamRoleDefObj obj = null;
		if( ( ! forceRead ) && indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
		}
		else {
			YCFBamRoleDefBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamRoleDefObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId )
	{
		return( readRoleDefByRoleDefTentIdx( TenantId,
			false ) );
	}

	public List<IYCFBamRoleDefObj> readRoleDefByRoleDefTentIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRoleDefByRoleDefTentIdx";
		YCFBamRoleDefByRoleDefTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict;
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< YCFBamRoleDefByRoleDefTentIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamRoleDefObj > >();
		}
		if( ( ! forceRead ) && indexByRoleDefTentIdx.containsKey( key ) ) {
			dict = indexByRoleDefTentIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamRoleDefObj>();
			IYCFBamRoleDefObj obj;
			YCFBamRoleDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			YCFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamRoleDefObj realised = (IYCFBamRoleDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRoleDefTentIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
		Iterator<IYCFBamRoleDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId )
	{
		return( readRoleDefByScopeIdx( TenantId,
			ScopeId,
			false ) );
	}

	public List<IYCFBamRoleDefObj> readRoleDefByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead )
	{
		final String S_ProcName = "readRoleDefByScopeIdx";
		YCFBamRoleDefByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict;
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamRoleDefByScopeIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamRoleDefObj > >();
		}
		if( ( ! forceRead ) && indexByScopeIdx.containsKey( key ) ) {
			dict = indexByScopeIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamRoleDefObj>();
			IYCFBamRoleDefObj obj;
			YCFBamRoleDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			YCFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamRoleDefObj realised = (IYCFBamRoleDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByScopeIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
		Iterator<IYCFBamRoleDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readRoleDefByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamRoleDefObj> readRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readRoleDefByDefSchemaIdx";
		YCFBamRoleDefByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRoleDefByDefSchemaIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamRoleDefObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamRoleDefPKey, IYCFBamRoleDefObj>();
			IYCFBamRoleDefObj obj;
			YCFBamRoleDefBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamRoleDefBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamRoleDefObj)schema.getRoleDefTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey() );
				obj.setBuff( buff );
				IYCFBamRoleDefObj realised = (IYCFBamRoleDefObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
		Iterator<IYCFBamRoleDefObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamRoleDefObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamRoleDefObj readCachedRoleDefByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamRoleDefObj obj = null;
		YCFBamRoleDefPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedRoleDef( pkey );
		return( obj );
	}

	public IYCFBamRoleDefObj readCachedRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamRoleDefObj obj = null;
		YCFBamRoleDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamRoleDefObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamRoleDefObj> valIter = members.values().iterator();
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

	public IYCFBamRoleDefObj readCachedRoleDefByUDefIdx( long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		IYCFBamRoleDefObj obj = null;
		YCFBamRoleDefByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
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
				Iterator<IYCFBamRoleDefObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamRoleDefObj> valIter = members.values().iterator();
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

	public List<IYCFBamRoleDefObj> readCachedRoleDefByRoleDefTentIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRoleDefByRoleDefTentIdx";
		YCFBamRoleDefByRoleDefTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>();
		if( indexByRoleDefTentIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict;
			if( indexByRoleDefTentIdx.containsKey( key ) ) {
				dict = indexByRoleDefTentIdx.get( key );
				int len = dict.size();
				IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
				Iterator<IYCFBamRoleDefObj> valIter = dict.values().iterator();
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
			IYCFBamRoleDefObj obj;
			Iterator<IYCFBamRoleDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRoleDefObj> readCachedRoleDefByScopeIdx( long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "readCachedRoleDefByScopeIdx";
		YCFBamRoleDefByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>();
		if( indexByScopeIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict;
			if( indexByScopeIdx.containsKey( key ) ) {
				dict = indexByScopeIdx.get( key );
				int len = dict.size();
				IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
				Iterator<IYCFBamRoleDefObj> valIter = dict.values().iterator();
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
			IYCFBamRoleDefObj obj;
			Iterator<IYCFBamRoleDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamRoleDefObj> readCachedRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedRoleDefByDefSchemaIdx";
		YCFBamRoleDefByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamRoleDefObj> arrayList = new ArrayList<IYCFBamRoleDefObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamRoleDefObj arr[] = new IYCFBamRoleDefObj[len];
				Iterator<IYCFBamRoleDefObj> valIter = dict.values().iterator();
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
			IYCFBamRoleDefObj obj;
			Iterator<IYCFBamRoleDefObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamRoleDefObj> cmp = new Comparator<IYCFBamRoleDefObj>() {
			public int compare( IYCFBamRoleDefObj lhs, IYCFBamRoleDefObj rhs ) {
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
					YCFBamRoleDefPKey lhsPKey = lhs.getPKey();
					YCFBamRoleDefPKey rhsPKey = rhs.getPKey();
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
		IYCFBamRoleDefObj obj = readCachedRoleDefByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRoleDefByUNameIdx( long TenantId,
		long ScopeId,
		String Name )
	{
		IYCFBamRoleDefObj obj = readCachedRoleDefByUNameIdx( TenantId,
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
		IYCFBamRoleDefObj obj = readCachedRoleDefByUDefIdx( TenantId,
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
		IYCFBamRoleDefObj obj;
		List<IYCFBamRoleDefObj> arrayList = readCachedRoleDefByRoleDefTentIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamRoleDefObj> arrayIter = arrayList.iterator();
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
		IYCFBamRoleDefObj obj;
		List<IYCFBamRoleDefObj> arrayList = readCachedRoleDefByScopeIdx( TenantId,
				ScopeId );
		if( arrayList != null )  {
			Iterator<IYCFBamRoleDefObj> arrayIter = arrayList.iterator();
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
		IYCFBamRoleDefObj obj;
		List<IYCFBamRoleDefObj> arrayList = readCachedRoleDefByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamRoleDefObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamRoleDefObj updateRoleDef( IYCFBamRoleDefObj Obj ) {
		IYCFBamRoleDefObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().updateRoleDef( schema.getAuthorization(),
			Obj.getRoleDefBuff() );
		if( Obj.getClassCode().equals( "a88d" ) ) {
			obj = (IYCFBamRoleDefObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteRoleDef( IYCFBamRoleDefObj Obj ) {
		IYCFBamRoleDefObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDef( schema.getAuthorization(),
			obj.getRoleDefBuff() );
		Obj.forget();
	}

	public void deleteRoleDefByIdIdx( long TenantId,
		long Id )
	{
		YCFBamRoleDefPKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamRoleDefObj obj = readRoleDef( pkey );
		if( obj != null ) {
			IYCFBamRoleDefEditObj editObj = (IYCFBamRoleDefEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamRoleDefEditObj)obj.beginEdit();
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
			indexByUNameIdx = new HashMap< YCFBamRoleDefByUNameIdxKey,
				IYCFBamRoleDefObj >();
		}
		YCFBamRoleDefByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );
		IYCFBamRoleDefObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUNameIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUNameIdx( schema.getAuthorization(),
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
			indexByUDefIdx = new HashMap< YCFBamRoleDefByUDefIdxKey,
				IYCFBamRoleDefObj >();
		}
		YCFBamRoleDefByUDefIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );
		IYCFBamRoleDefObj obj = null;
		if( indexByUDefIdx.containsKey( key ) ) {
			obj = indexByUDefIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUDefIdx( schema.getAuthorization(),
				TenantId,
				ScopeId,
				DefSchemaTenantId,
				DefSchemaId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByUDefIdx( schema.getAuthorization(),
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
		YCFBamRoleDefByRoleDefTentIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByRoleDefTentIdx == null ) {
			indexByRoleDefTentIdx = new HashMap< YCFBamRoleDefByRoleDefTentIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamRoleDefObj > >();
		}
		if( indexByRoleDefTentIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict = indexByRoleDefTentIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamRoleDefObj> iter = dict.values().iterator();
			IYCFBamRoleDefObj obj;
			List<IYCFBamRoleDefObj> toForget = new LinkedList<IYCFBamRoleDefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByRoleDefTentIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRoleDefByRoleDefTentIdx( TenantId );
	}

	public void deleteRoleDefByScopeIdx( long TenantId,
		long ScopeId )
	{
		YCFBamRoleDefByScopeIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		if( indexByScopeIdx == null ) {
			indexByScopeIdx = new HashMap< YCFBamRoleDefByScopeIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamRoleDefObj > >();
		}
		if( indexByScopeIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict = indexByScopeIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
			Iterator<IYCFBamRoleDefObj> iter = dict.values().iterator();
			IYCFBamRoleDefObj obj;
			List<IYCFBamRoleDefObj> toForget = new LinkedList<IYCFBamRoleDefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByScopeIdx( schema.getAuthorization(),
				TenantId,
				ScopeId );
		}
		deepDisposeRoleDefByScopeIdx( TenantId,
				ScopeId );
	}

	public void deleteRoleDefByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamRoleDefByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamRoleDefByDefSchemaIdxKey,
				Map< YCFBamRoleDefPKey, IYCFBamRoleDefObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamRoleDefPKey, IYCFBamRoleDefObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamRoleDefObj> iter = dict.values().iterator();
			IYCFBamRoleDefObj obj;
			List<IYCFBamRoleDefObj> toForget = new LinkedList<IYCFBamRoleDefObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableRoleDef().deleteRoleDefByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeRoleDefByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}

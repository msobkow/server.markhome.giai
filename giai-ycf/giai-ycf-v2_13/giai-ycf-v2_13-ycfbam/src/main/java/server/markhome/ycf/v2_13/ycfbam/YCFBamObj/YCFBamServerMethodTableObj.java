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

public class CFBamServerMethodTableObj
	implements ICFBamServerMethodTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamServerMethodObj> members;
	private Map<CFBamScopePKey, ICFBamServerMethodObj> allServerMethod;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamServerMethodObj > > indexByTenantIdx;
	private Map< CFBamServerMethodByUNameIdxKey,
		ICFBamServerMethodObj > indexByUNameIdx;
	private Map< CFBamServerMethodByMethTableIdxKey,
		Map<CFBamScopePKey, ICFBamServerMethodObj > > indexByMethTableIdx;
	private Map< CFBamServerMethodByMethTableVisIdxKey,
		Map<CFBamScopePKey, ICFBamServerMethodObj > > indexByMethTableVisIdx;
	private Map< CFBamServerMethodByMethCodeVisIdxKey,
		Map<CFBamScopePKey, ICFBamServerMethodObj > > indexByMethCodeVisIdx;
	private Map< CFBamServerMethodByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamServerMethodObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "ServerMethod";
	public static String TABLE_DBNAME = "srvmeth";

	public CFBamServerMethodTableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamServerMethodObj>();
		allServerMethod = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
	}

	public CFBamServerMethodTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamServerMethodObj>();
		allServerMethod = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
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
		allServerMethod = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		List<ICFBamServerMethodObj> toForget = new LinkedList<ICFBamServerMethodObj>();
		ICFBamServerMethodObj cur = null;
		Iterator<ICFBamServerMethodObj> iter = members.values().iterator();
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
	 *	CFBamServerMethodObj.
	 */
	public ICFBamServerMethodObj newInstance() {
		ICFBamServerMethodObj inst = new CFBamServerMethodObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamServerMethodObj.
	 */
	public ICFBamServerMethodEditObj newEditInstance( ICFBamServerMethodObj orig ) {
		ICFBamServerMethodEditObj edit = new CFBamServerMethodEditObj( orig );
		return( edit );
	}

	public ICFBamServerMethodObj realiseServerMethod( ICFBamServerMethodObj Obj ) {
		ICFBamServerMethodObj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamServerMethodObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamServerMethodObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamServerMethodByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByMethTableIdx != null ) {
				CFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.remove( keepObj.getPKey() );
					if( mapMethTableIdx.size() <= 0 ) {
						indexByMethTableIdx.remove( keyMethTableIdx );
					}
				}
			}

			if( indexByMethTableVisIdx != null ) {
				CFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.remove( keepObj.getPKey() );
					if( mapMethTableVisIdx.size() <= 0 ) {
						indexByMethTableVisIdx.remove( keyMethTableVisIdx );
					}
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.remove( keepObj.getPKey() );
					if( mapMethCodeVisIdx.size() <= 0 ) {
						indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamServerMethodObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamServerMethodByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				CFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				CFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allServerMethod != null ) {
				allServerMethod.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFBamServerMethodObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServerMethod != null ) {
				allServerMethod.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamServerMethodByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				CFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				CFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamServerMethodObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamServerMethodObj createServerMethod( ICFBamServerMethodObj Obj ) {
		ICFBamServerMethodObj obj = Obj;
		CFBamServerMethodBuff buff = obj.getServerMethodBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().createServerMethod(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a804" ) ) {
			obj = (ICFBamServerMethodObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamServerMethodObj readServerMethod( CFBamScopePKey pkey ) {
		return( readServerMethod( pkey, false ) );
	}

	public ICFBamServerMethodObj readServerMethod( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamServerMethodObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamServerMethodBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamServerMethodObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamServerMethodObj readCachedServerMethod( CFBamScopePKey pkey ) {
		ICFBamServerMethodObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServerMethod( ICFBamServerMethodObj obj )
	{
		final String S_ProcName = "CFBamServerMethodTableObj.reallyDeepDisposeServerMethod() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamServerMethodObj existing = readCachedServerMethod( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamServerMethodByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamServerMethodByMethTableIdxKey keyMethTableIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		keyMethTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMethTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		CFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		keyMethTableVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMethTableVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyMethTableVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		CFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		keyMethCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		CFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );


		schema.getParamTableObj().deepDisposeParamByServerMethodIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByMethTableIdx != null ) {
			if( indexByMethTableIdx.containsKey( keyMethTableIdx ) ) {
				indexByMethTableIdx.get( keyMethTableIdx ).remove( pkey );
				if( indexByMethTableIdx.get( keyMethTableIdx ).size() <= 0 ) {
					indexByMethTableIdx.remove( keyMethTableIdx );
				}
			}
		}

		if( indexByMethTableVisIdx != null ) {
			if( indexByMethTableVisIdx.containsKey( keyMethTableVisIdx ) ) {
				indexByMethTableVisIdx.get( keyMethTableVisIdx ).remove( pkey );
				if( indexByMethTableVisIdx.get( keyMethTableVisIdx ).size() <= 0 ) {
					indexByMethTableVisIdx.remove( keyMethTableVisIdx );
				}
			}
		}

		if( indexByMethCodeVisIdx != null ) {
			if( indexByMethCodeVisIdx.containsKey( keyMethCodeVisIdx ) ) {
				indexByMethCodeVisIdx.get( keyMethCodeVisIdx ).remove( pkey );
				if( indexByMethCodeVisIdx.get( keyMethCodeVisIdx ).size() <= 0 ) {
					indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
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


		schema.getScopeTableObj().reallyDeepDisposeScope( obj );
	}
	public void deepDisposeServerMethod( CFBamScopePKey pkey ) {
		ICFBamServerMethodObj obj = readCachedServerMethod( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamServerMethodObj lockServerMethod( CFBamScopePKey pkey ) {
		ICFBamServerMethodObj locked = null;
		CFBamServerMethodBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamServerMethodObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockServerMethod", pkey );
		}
		return( locked );
	}

	public List<ICFBamServerMethodObj> readAllServerMethod() {
		return( readAllServerMethod( false ) );
	}

	public List<ICFBamServerMethodObj> readAllServerMethod( boolean forceRead ) {
		final String S_ProcName = "readAllServerMethod";
		if( ( allServerMethod == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> map = new HashMap<CFBamScopePKey,ICFBamServerMethodObj>();
			allServerMethod = map;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readAllDerived( schema.getAuthorization() );
			CFBamServerMethodBuff buff;
			ICFBamServerMethodObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerMethodObj realised = (ICFBamServerMethodObj)obj.realise();
			}
		}
		int len = allServerMethod.size();
		ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
		Iterator<ICFBamServerMethodObj> valIter = allServerMethod.values().iterator();
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
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerMethodObj> readCachedAllServerMethod() {
		final String S_ProcName = "readCachedAllServerMethod";
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>();
		if( allServerMethod != null ) {
			int len = allServerMethod.size();
			ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
			Iterator<ICFBamServerMethodObj> valIter = allServerMethod.values().iterator();
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
		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id )
	{
		return( readServerMethodByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamServerMethodObj obj = readServerMethod( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId )
	{
		return( readServerMethodByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerMethodObj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerMethodObj realised = (ICFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
		Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamServerMethodObj readServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readServerMethodByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public ICFBamServerMethodObj readServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamServerMethodByUNameIdxKey,
				ICFBamServerMethodObj >();
		}
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamServerMethodObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamServerMethodBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamServerMethodObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId )
	{
		return( readServerMethodByMethTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<ICFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByMethTableIdx";
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< CFBamServerMethodByMethTableIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableIdx.containsKey( key ) ) {
			dict = indexByMethTableIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerMethodObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerMethodObj realised = (ICFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
		Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerMethodByMethTableVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<ICFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByMethTableVisIdx";
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< CFBamServerMethodByMethTableVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableVisIdx.containsKey( key ) ) {
			dict = indexByMethTableVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerMethodObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerMethodObj realised = (ICFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
		Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerMethodObj> readServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerMethodByMethCodeVisIdx( CodeVis,
			false ) );
	}

	public List<ICFBamServerMethodObj> readServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByMethCodeVisIdx";
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< CFBamServerMethodByMethCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByMethCodeVisIdx.containsKey( key ) ) {
			dict = indexByMethCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerMethodObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerMethodObj realised = (ICFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
		Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readServerMethodByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByDefSchemaIdx";
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamServerMethodByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamServerMethodObj>();
			ICFBamServerMethodObj obj;
			CFBamServerMethodBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamServerMethodObj realised = (ICFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
		Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamServerMethodObj readCachedServerMethodByIdIdx( long TenantId,
		long Id )
	{
		ICFBamServerMethodObj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedServerMethod( pkey );
		return( obj );
	}

	public List<ICFBamServerMethodObj> readCachedServerMethodByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedServerMethodByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
				Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
			ICFBamServerMethodObj obj;
			Iterator<ICFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamServerMethodObj readCachedServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamServerMethodObj obj = null;
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamServerMethodObj> valIter = members.values().iterator();
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
			Iterator<ICFBamServerMethodObj> valIter = members.values().iterator();
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

	public List<ICFBamServerMethodObj> readCachedServerMethodByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedServerMethodByMethTableIdx";
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>();
		if( indexByMethTableIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
			if( indexByMethTableIdx.containsKey( key ) ) {
				dict = indexByMethTableIdx.get( key );
				int len = dict.size();
				ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
				Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
			ICFBamServerMethodObj obj;
			Iterator<ICFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamServerMethodObj> readCachedServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerMethodByMethTableVisIdx";
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>();
		if( indexByMethTableVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
			if( indexByMethTableVisIdx.containsKey( key ) ) {
				dict = indexByMethTableVisIdx.get( key );
				int len = dict.size();
				ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
				Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
			ICFBamServerMethodObj obj;
			Iterator<ICFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamServerMethodObj> readCachedServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerMethodByMethCodeVisIdx";
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>();
		if( indexByMethCodeVisIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
			if( indexByMethCodeVisIdx.containsKey( key ) ) {
				dict = indexByMethCodeVisIdx.get( key );
				int len = dict.size();
				ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
				Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
			ICFBamServerMethodObj obj;
			Iterator<ICFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamServerMethodObj> readCachedServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedServerMethodByDefSchemaIdx";
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamServerMethodObj> arrayList = new ArrayList<ICFBamServerMethodObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamServerMethodObj arr[] = new ICFBamServerMethodObj[len];
				Iterator<ICFBamServerMethodObj> valIter = dict.values().iterator();
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
			ICFBamServerMethodObj obj;
			Iterator<ICFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamServerMethodObj> cmp = new Comparator<ICFBamServerMethodObj>() {
			public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeServerMethodByIdIdx( long TenantId,
		long Id )
	{
		ICFBamServerMethodObj obj = readCachedServerMethodByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerMethodByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeServerMethodByTenantIdx";
		ICFBamServerMethodObj obj;
		List<ICFBamServerMethodObj> arrayList = readCachedServerMethodByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamServerMethodObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamServerMethodObj obj = readCachedServerMethodByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerMethodByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeServerMethodByMethTableIdx";
		ICFBamServerMethodObj obj;
		List<ICFBamServerMethodObj> arrayList = readCachedServerMethodByMethTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<ICFBamServerMethodObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerMethodByMethTableVisIdx";
		ICFBamServerMethodObj obj;
		List<ICFBamServerMethodObj> arrayList = readCachedServerMethodByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamServerMethodObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerMethodByMethCodeVisIdx";
		ICFBamServerMethodObj obj;
		List<ICFBamServerMethodObj> arrayList = readCachedServerMethodByMethCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<ICFBamServerMethodObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeServerMethodByDefSchemaIdx";
		ICFBamServerMethodObj obj;
		List<ICFBamServerMethodObj> arrayList = readCachedServerMethodByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamServerMethodObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamServerMethodObj updateServerMethod( ICFBamServerMethodObj Obj ) {
		ICFBamServerMethodObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().updateServerMethod( schema.getAuthorization(),
			Obj.getServerMethodBuff() );
		if( Obj.getClassCode().equals( "a804" ) ) {
			obj = (ICFBamServerMethodObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteServerMethod( ICFBamServerMethodObj Obj ) {
		ICFBamServerMethodObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethod( schema.getAuthorization(),
			obj.getServerMethodBuff() );
		Obj.forget();
	}

	public void deleteServerMethodByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamServerMethodObj obj = readServerMethod( pkey );
		if( obj != null ) {
			ICFBamServerMethodEditObj editObj = (ICFBamServerMethodEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamServerMethodEditObj)obj.beginEdit();
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
		deepDisposeServerMethodByIdIdx( TenantId,
				Id );
	}

	public void deleteServerMethodByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamServerMethodObj> iter = dict.values().iterator();
			ICFBamServerMethodObj obj;
			List<ICFBamServerMethodObj> toForget = new LinkedList<ICFBamServerMethodObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeServerMethodByTenantIdx( TenantId );
	}

	public void deleteServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamServerMethodByUNameIdxKey,
				ICFBamServerMethodObj >();
		}
		CFBamServerMethodByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamServerMethodObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeServerMethodByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteServerMethodByMethTableIdx( long TenantId,
		long TableId )
	{
		CFBamServerMethodByMethTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< CFBamServerMethodByMethTableIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( indexByMethTableIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict = indexByMethTableIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<ICFBamServerMethodObj> iter = dict.values().iterator();
			ICFBamServerMethodObj obj;
			List<ICFBamServerMethodObj> toForget = new LinkedList<ICFBamServerMethodObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMethTableIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeServerMethodByMethTableIdx( TenantId,
				TableId );
	}

	public void deleteServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamServerMethodByMethTableVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< CFBamServerMethodByMethTableVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( indexByMethTableVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict = indexByMethTableVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<ICFBamServerMethodObj> iter = dict.values().iterator();
			ICFBamServerMethodObj obj;
			List<ICFBamServerMethodObj> toForget = new LinkedList<ICFBamServerMethodObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMethTableVisIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeServerMethodByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteServerMethodByMethCodeVisIdx( ICFBamSchema.CodeVisibilityEnum CodeVis )
	{
		CFBamServerMethodByMethCodeVisIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< CFBamServerMethodByMethCodeVisIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( indexByMethCodeVisIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict = indexByMethCodeVisIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<ICFBamServerMethodObj> iter = dict.values().iterator();
			ICFBamServerMethodObj obj;
			List<ICFBamServerMethodObj> toForget = new LinkedList<ICFBamServerMethodObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMethCodeVisIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeServerMethodByMethCodeVisIdx( CodeVis );
	}

	public void deleteServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamServerMethodByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamServerMethodByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamServerMethodObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamServerMethodObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamServerMethodObj> iter = dict.values().iterator();
			ICFBamServerMethodObj obj;
			List<ICFBamServerMethodObj> toForget = new LinkedList<ICFBamServerMethodObj>();
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
			((ICFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeServerMethodByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}
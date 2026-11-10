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

public class YCFBamServerMethodTableObj
	implements IYCFBamServerMethodTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFBamScopePKey, IYCFBamServerMethodObj> members;
	private Map<YCFBamScopePKey, IYCFBamServerMethodObj> allServerMethod;
	private Map< YCFBamScopeByTenantIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerMethodObj > > indexByTenantIdx;
	private Map< YCFBamServerMethodByUNameIdxKey,
		IYCFBamServerMethodObj > indexByUNameIdx;
	private Map< YCFBamServerMethodByMethTableIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerMethodObj > > indexByMethTableIdx;
	private Map< YCFBamServerMethodByMethTableVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerMethodObj > > indexByMethTableVisIdx;
	private Map< YCFBamServerMethodByMethCodeVisIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerMethodObj > > indexByMethCodeVisIdx;
	private Map< YCFBamServerMethodByDefSchemaIdxKey,
		Map<YCFBamScopePKey, IYCFBamServerMethodObj > > indexByDefSchemaIdx;
	public static String TABLE_NAME = "ServerMethod";
	public static String TABLE_DBNAME = "srvmeth";

	public YCFBamServerMethodTableObj() {
		schema = null;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerMethodObj>();
		allServerMethod = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
	}

	public YCFBamServerMethodTableObj( IYCFBamSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFBamScopePKey, IYCFBamServerMethodObj>();
		allServerMethod = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
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
		allServerMethod = null;
		indexByTenantIdx = null;
		indexByUNameIdx = null;
		indexByMethTableIdx = null;
		indexByMethTableVisIdx = null;
		indexByMethCodeVisIdx = null;
		indexByDefSchemaIdx = null;
		List<IYCFBamServerMethodObj> toForget = new LinkedList<IYCFBamServerMethodObj>();
		IYCFBamServerMethodObj cur = null;
		Iterator<IYCFBamServerMethodObj> iter = members.values().iterator();
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
	 *	YCFBamServerMethodObj.
	 */
	public IYCFBamServerMethodObj newInstance() {
		IYCFBamServerMethodObj inst = new YCFBamServerMethodObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamServerMethodObj.
	 */
	public IYCFBamServerMethodEditObj newEditInstance( IYCFBamServerMethodObj orig ) {
		IYCFBamServerMethodEditObj edit = new YCFBamServerMethodEditObj( orig );
		return( edit );
	}

	public IYCFBamServerMethodObj realiseServerMethod( IYCFBamServerMethodObj Obj ) {
		IYCFBamServerMethodObj obj = Obj;
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerMethodObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFBamServerMethodObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamServerMethodByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByMethTableIdx != null ) {
				YCFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.remove( keepObj.getPKey() );
					if( mapMethTableIdx.size() <= 0 ) {
						indexByMethTableIdx.remove( keyMethTableIdx );
					}
				}
			}

			if( indexByMethTableVisIdx != null ) {
				YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.remove( keepObj.getPKey() );
					if( mapMethTableVisIdx.size() <= 0 ) {
						indexByMethTableVisIdx.remove( keyMethTableVisIdx );
					}
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.remove( keepObj.getPKey() );
					if( mapMethCodeVisIdx.size() <= 0 ) {
						indexByMethCodeVisIdx.remove( keyMethCodeVisIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
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
			keepObj = (IYCFBamServerMethodObj)schema.getScopeTableObj().realiseScope( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamServerMethodByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				YCFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
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
			keepObj = (IYCFBamServerMethodObj)schema.getScopeTableObj().realiseScope( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServerMethod != null ) {
				allServerMethod.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFBamScopeByTenantIdxKey keyTenantIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				YCFBamServerMethodByUNameIdxKey keyUNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByMethTableIdx != null ) {
				YCFBamServerMethodByMethTableIdxKey keyMethTableIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
				keyMethTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethTableIdx = indexByMethTableIdx.get( keyMethTableIdx );
				if( mapMethTableIdx != null ) {
					mapMethTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethTableVisIdx != null ) {
				YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
				keyMethTableVisIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMethTableVisIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyMethTableVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethTableVisIdx = indexByMethTableVisIdx.get( keyMethTableVisIdx );
				if( mapMethTableVisIdx != null ) {
					mapMethTableVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMethCodeVisIdx != null ) {
				YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
				keyMethCodeVisIdx.setRequiredCodeVis( keepObj.getRequiredCodeVis() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapMethCodeVisIdx = indexByMethCodeVisIdx.get( keyMethCodeVisIdx );
				if( mapMethCodeVisIdx != null ) {
					mapMethCodeVisIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<YCFBamScopePKey, IYCFBamServerMethodObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFBamServerMethodObj createServerMethod( IYCFBamServerMethodObj Obj ) {
		IYCFBamServerMethodObj obj = Obj;
		YCFBamServerMethodBuff buff = obj.getServerMethodBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().createServerMethod(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a804" ) ) {
			obj = (IYCFBamServerMethodObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public IYCFBamServerMethodObj readServerMethod( YCFBamScopePKey pkey ) {
		return( readServerMethod( pkey, false ) );
	}

	public IYCFBamServerMethodObj readServerMethod( YCFBamScopePKey pkey, boolean forceRead ) {
		IYCFBamServerMethodObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFBamServerMethodBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFBamServerMethodObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFBamServerMethodObj readCachedServerMethod( YCFBamScopePKey pkey ) {
		IYCFBamServerMethodObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServerMethod( IYCFBamServerMethodObj obj )
	{
		final String S_ProcName = "YCFBamServerMethodTableObj.reallyDeepDisposeServerMethod() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFBamScopePKey pkey = obj.getPKey();
		IYCFBamServerMethodObj existing = readCachedServerMethod( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFBamServerMethodByUNameIdxKey keyUNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamServerMethodByMethTableIdxKey keyMethTableIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		keyMethTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMethTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		keyMethTableVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMethTableVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyMethTableVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		keyMethCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
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
	public void deepDisposeServerMethod( YCFBamScopePKey pkey ) {
		IYCFBamServerMethodObj obj = readCachedServerMethod( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFBamServerMethodObj lockServerMethod( YCFBamScopePKey pkey ) {
		IYCFBamServerMethodObj locked = null;
		YCFBamServerMethodBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFBamServerMethodObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockServerMethod", pkey );
		}
		return( locked );
	}

	public List<IYCFBamServerMethodObj> readAllServerMethod() {
		return( readAllServerMethod( false ) );
	}

	public List<IYCFBamServerMethodObj> readAllServerMethod( boolean forceRead ) {
		final String S_ProcName = "readAllServerMethod";
		if( ( allServerMethod == null ) || forceRead ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> map = new HashMap<YCFBamScopePKey,IYCFBamServerMethodObj>();
			allServerMethod = map;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readAllDerived( schema.getAuthorization() );
			YCFBamServerMethodBuff buff;
			IYCFBamServerMethodObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerMethodObj realised = (IYCFBamServerMethodObj)obj.realise();
			}
		}
		int len = allServerMethod.size();
		IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
		Iterator<IYCFBamServerMethodObj> valIter = allServerMethod.values().iterator();
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
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerMethodObj> readCachedAllServerMethod() {
		final String S_ProcName = "readCachedAllServerMethod";
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>();
		if( allServerMethod != null ) {
			int len = allServerMethod.size();
			IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
			Iterator<IYCFBamServerMethodObj> valIter = allServerMethod.values().iterator();
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
		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id )
	{
		return( readServerMethodByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFBamServerMethodObj readServerMethodByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerMethodObj obj = readServerMethod( pkey, forceRead );
		return( obj );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId )
	{
		return( readServerMethodByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerMethodObj>();
			IYCFBamScopeObj obj;
			YCFBamScopeBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerMethodObj realised = (IYCFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
		Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerMethodObj readServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readServerMethodByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public IYCFBamServerMethodObj readServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerMethodObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerMethodObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			YCFBamServerMethodBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFBamServerMethodObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId )
	{
		return( readServerMethodByMethTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByMethTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableIdx.containsKey( key ) ) {
			dict = indexByMethTableIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerMethodObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerMethodObj realised = (IYCFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
		Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerMethodByMethTableVisIdx( TenantId,
			TableId,
			CodeVis,
			false ) );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByMethTableVisIdx.containsKey( key ) ) {
			dict = indexByMethTableVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerMethodObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerMethodObj realised = (IYCFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethTableVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
		Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		return( readServerMethodByMethCodeVisIdx( CodeVis,
			false ) );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByMethCodeVisIdx.containsKey( key ) ) {
			dict = indexByMethCodeVisIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerMethodObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerMethodObj realised = (IYCFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMethCodeVisIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
		Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readServerMethodByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<IYCFBamServerMethodObj> readServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readServerMethodByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<YCFBamScopePKey, IYCFBamServerMethodObj>();
			IYCFBamServerMethodObj obj;
			YCFBamServerMethodBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			YCFBamServerMethodBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (IYCFBamServerMethodObj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				IYCFBamServerMethodObj realised = (IYCFBamServerMethodObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
		Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFBamServerMethodObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFBamServerMethodObj readCachedServerMethodByIdIdx( long TenantId,
		long Id )
	{
		IYCFBamServerMethodObj obj = null;
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedServerMethod( pkey );
		return( obj );
	}

	public List<IYCFBamServerMethodObj> readCachedServerMethodByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedServerMethodByTenantIdx";
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
				Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
			IYCFBamServerMethodObj obj;
			Iterator<IYCFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFBamServerMethodObj readCachedServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		IYCFBamServerMethodObj obj = null;
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<IYCFBamServerMethodObj> valIter = members.values().iterator();
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
			Iterator<IYCFBamServerMethodObj> valIter = members.values().iterator();
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

	public List<IYCFBamServerMethodObj> readCachedServerMethodByMethTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedServerMethodByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>();
		if( indexByMethTableIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
			if( indexByMethTableIdx.containsKey( key ) ) {
				dict = indexByMethTableIdx.get( key );
				int len = dict.size();
				IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
				Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
			IYCFBamServerMethodObj obj;
			Iterator<IYCFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamServerMethodObj> readCachedServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerMethodByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>();
		if( indexByMethTableVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
			if( indexByMethTableVisIdx.containsKey( key ) ) {
				dict = indexByMethTableVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
				Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
			IYCFBamServerMethodObj obj;
			Iterator<IYCFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamServerMethodObj> readCachedServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "readCachedServerMethodByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>();
		if( indexByMethCodeVisIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
			if( indexByMethCodeVisIdx.containsKey( key ) ) {
				dict = indexByMethCodeVisIdx.get( key );
				int len = dict.size();
				IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
				Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
			IYCFBamServerMethodObj obj;
			Iterator<IYCFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFBamServerMethodObj> readCachedServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedServerMethodByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<IYCFBamServerMethodObj> arrayList = new ArrayList<IYCFBamServerMethodObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				IYCFBamServerMethodObj arr[] = new IYCFBamServerMethodObj[len];
				Iterator<IYCFBamServerMethodObj> valIter = dict.values().iterator();
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
			IYCFBamServerMethodObj obj;
			Iterator<IYCFBamServerMethodObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFBamServerMethodObj> cmp = new Comparator<IYCFBamServerMethodObj>() {
			public int compare( IYCFBamServerMethodObj lhs, IYCFBamServerMethodObj rhs ) {
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
					YCFBamScopePKey lhsPKey = lhs.getPKey();
					YCFBamScopePKey rhsPKey = rhs.getPKey();
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
		IYCFBamServerMethodObj obj = readCachedServerMethodByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServerMethodByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeServerMethodByTenantIdx";
		IYCFBamServerMethodObj obj;
		List<IYCFBamServerMethodObj> arrayList = readCachedServerMethodByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerMethodObj> arrayIter = arrayList.iterator();
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
		IYCFBamServerMethodObj obj = readCachedServerMethodByUNameIdx( TenantId,
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
		IYCFBamServerMethodObj obj;
		List<IYCFBamServerMethodObj> arrayList = readCachedServerMethodByMethTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerMethodObj> arrayIter = arrayList.iterator();
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
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerMethodByMethTableVisIdx";
		IYCFBamServerMethodObj obj;
		List<IYCFBamServerMethodObj> arrayList = readCachedServerMethodByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerMethodObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "deepDisposeServerMethodByMethCodeVisIdx";
		IYCFBamServerMethodObj obj;
		List<IYCFBamServerMethodObj> arrayList = readCachedServerMethodByMethCodeVisIdx( CodeVis );
		if( arrayList != null )  {
			Iterator<IYCFBamServerMethodObj> arrayIter = arrayList.iterator();
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
		IYCFBamServerMethodObj obj;
		List<IYCFBamServerMethodObj> arrayList = readCachedServerMethodByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<IYCFBamServerMethodObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFBamServerMethodObj updateServerMethod( IYCFBamServerMethodObj Obj ) {
		IYCFBamServerMethodObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().updateServerMethod( schema.getAuthorization(),
			Obj.getServerMethodBuff() );
		if( Obj.getClassCode().equals( "a804" ) ) {
			obj = (IYCFBamServerMethodObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteServerMethod( IYCFBamServerMethodObj Obj ) {
		IYCFBamServerMethodObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethod( schema.getAuthorization(),
			obj.getServerMethodBuff() );
		Obj.forget();
	}

	public void deleteServerMethodByIdIdx( long TenantId,
		long Id )
	{
		YCFBamScopePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFBamServerMethodObj obj = readServerMethod( pkey );
		if( obj != null ) {
			IYCFBamServerMethodEditObj editObj = (IYCFBamServerMethodEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFBamServerMethodEditObj)obj.beginEdit();
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
		YCFBamScopeByTenantIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict = indexByTenantIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFBamServerMethodObj> iter = dict.values().iterator();
			IYCFBamServerMethodObj obj;
			List<IYCFBamServerMethodObj> toForget = new LinkedList<IYCFBamServerMethodObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeServerMethodByTenantIdx( TenantId );
	}

	public void deleteServerMethodByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< YCFBamServerMethodByUNameIdxKey,
				IYCFBamServerMethodObj >();
		}
		YCFBamServerMethodByUNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		IYCFBamServerMethodObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByUNameIdx( schema.getAuthorization(),
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
		YCFBamServerMethodByMethTableIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByMethTableIdx == null ) {
			indexByMethTableIdx = new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( indexByMethTableIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict = indexByMethTableIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<IYCFBamServerMethodObj> iter = dict.values().iterator();
			IYCFBamServerMethodObj obj;
			List<IYCFBamServerMethodObj> toForget = new LinkedList<IYCFBamServerMethodObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeServerMethodByMethTableIdx( TenantId,
				TableId );
	}

	public void deleteServerMethodByMethTableVisIdx( long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethTableVisIdx == null ) {
			indexByMethTableVisIdx = new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( indexByMethTableVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict = indexByMethTableVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
			Iterator<IYCFBamServerMethodObj> iter = dict.values().iterator();
			IYCFBamServerMethodObj obj;
			List<IYCFBamServerMethodObj> toForget = new LinkedList<IYCFBamServerMethodObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethTableVisIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				CodeVis );
		}
		deepDisposeServerMethodByMethTableVisIdx( TenantId,
				TableId,
				CodeVis );
	}

	public void deleteServerMethodByMethCodeVisIdx( IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );
		if( indexByMethCodeVisIdx == null ) {
			indexByMethCodeVisIdx = new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( indexByMethCodeVisIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict = indexByMethCodeVisIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
			Iterator<IYCFBamServerMethodObj> iter = dict.values().iterator();
			IYCFBamServerMethodObj obj;
			List<IYCFBamServerMethodObj> toForget = new LinkedList<IYCFBamServerMethodObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByMethCodeVisIdx( schema.getAuthorization(),
				CodeVis );
		}
		deepDisposeServerMethodByMethCodeVisIdx( CodeVis );
	}

	public void deleteServerMethodByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey, IYCFBamServerMethodObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<YCFBamScopePKey, IYCFBamServerMethodObj> dict = indexByDefSchemaIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<IYCFBamServerMethodObj> iter = dict.values().iterator();
			IYCFBamServerMethodObj obj;
			List<IYCFBamServerMethodObj> toForget = new LinkedList<IYCFBamServerMethodObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableServerMethod().deleteServerMethodByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeServerMethodByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}
}
